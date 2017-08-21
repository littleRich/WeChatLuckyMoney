## Xposed相关API  
这个不管是大佬还是新手，绝逼都需要的开发文档，想要提升的一定要好好研读啦。  
xposed javadoc：[http://api.xposed.info](http://api.xposed.info "Xposed API")  
xposed官网：http://repo.xposed.info/  
xda论坛的xposed版块：http://forum.xda-developers.com/xposed  
XposedBridgeApi地址：https://jcenter.bintray.com/de/robv/android/xposed/api/  

## Hook相关技巧
1、针对Hook multidex中的函数  
使用xposed hook其方法的时候，如果方法位于默认dex中是可以的正常hook，但是如果方法位于dex分包中xposed就会报错提示所要hook的方法所在类无法找到。这种需要先去hook Application的attach方法，然后再hook第二个dex的方法，其实更像是手动去找，为什么需要attach，因为attach方法的参数里带有上下文的context，如果用xposed去hook非默认dex文件的类就会发生ClassNotFoundError，要解决这个问题，我们需要拿到对应dex文件的上下文环境。  

要分析这个问题的原因以及解决办法，就要先了解multidex的载入过程以及xposed的hook时机。[[Android逆向随笔之遇见MultiDex](https://www.secpulse.com/archives/52719.html "解释Hook multidex的问题")]  
dex分包加载大致流程如下,可以得出分包是滞后主包不少时间加载的：
1.检测是否有分包需要安装,系统是否支持multidex
2.从apk中解压出分包
3.通过反射将分包注入到当前classloader  
而xposed为了能让module及时载入执行所以得尽快调用handleLoadPackage()，所以此时获取的context的classloader中只要默认dex主的包的类。  
下面我总结了个实现IXposedHookLoadPackage的一个模板代码：

```java  
 
	public class XposedHookImpl implements IXposedHookLoadPackage {
	
	    private static final String TAG = "xqf";
	
	    @Override
	    public void handleLoadPackage(XC_LoadPackage.LoadPackageParam loadPackageParam) throws Throwable {
	 
	        if (!loadPackageParam.packageName.equals("要HOOK的APK包名")){
	          //  Logger.v("过滤程序：" + loadPackageParam.packageName.toString());
	            return;
	        }
	
		/**
		 * 显示当前栈顶的Activity的类名，便于快速定位到需要Hook的位置
		 */
	        findAndHookMethod("android.app.Activity", loadPackageParam.classLoader, "onResume", new XC_MethodHook() {
	            @Override
	            protected void afterHookedMethod(MethodHookParam param) throws Throwable {
	                super.afterHookedMethod(param);
	                Logger.v("当前显示Activity：" + param.thisObject.getClass().getName());
	
	            }
	        });
	        findAndHookMethod("android.support.v4.app.Fragment", loadPackageParam.classLoader, "onResume", new XC_MethodHook() {
	            @Override
	            protected void afterHookedMethod(MethodHookParam param) throws Throwable {
	                super.afterHookedMethod(param);
	                Logger.v("当前显示Fragment：" + param.thisObject.getClass().getName());
	            }
	        });
			
		/**
		 * 先要获取到APP的Application上下文
		 */
	        findAndHookMethod("android.app.Application", loadPackageParam.classLoader, "attach", Context.class, new XC_MethodHook() {
	            @Override
	            protected void afterHookedMethod(MethodHookParam param) throws Throwable {
	                super.afterHookedMethod(param);
	                Context applicationContext = (Context)param.args[0];
	                //TODO 下面HookAPK中DEX分包的方法时就不会抛异常了
	
	            }
	        });
	    }
	
	}
```


2、使用GSON打印对象中内容  
很多时候在逆向过程中，我们需要查看Hook拦截到Object对象中的内容信息，一般我们是通过Java反射来获取对象中的内容，但是，这样一个一个写比较繁琐，遇到对象的属性比较多时，就更头疼了。有了Gson就再也不愁这些啦，Gson已帮我们封装了Java反射获取对象内容的方法了，可以直接往里面传对象即可打印出来。示例如下：  
```java
new GsonBuilder().create().toJson(object)
```

3、修改Hook到对象的值  
当我们Hook拦截获取到程序中的某个对象时，想要修改该对象中的某个字段的值，可以使用XposedHelpers.setXXXField(Object obj, String fieldName, XXX value)修改字段值。举个例子吧：  
```
//示例代码
```  


## Hook开发相关工具

1、当前Activity  
该款软件可显示最前台页面所在应用的包名及Activity，在逆向分析APP时可以快速定位Activity所属类名，对于混淆过的APK来说这一个是很实用的。  
![程序演示截图][app_screemshot01]   
附上作者地址:  
https://github.com/109021017/android-TopActivity  
http://pan.baidu.com/s/1skQY48l
    
2、ActivityLauncher  
该款软件显示每个应用的Activity，点击Activity可直达该界面，部分因权限问题导致打开失败。在sf上开源，基于ec开发，我给移植到了 Android Studio, 大家可直接编译运行。   
![程序演示截图][app_screemshot02]   
附上作者开源地址：  
https://github.com/jp1017/ActivityLauncher  
   
3、Native Libs Monitor
分析一款应用内所包含的所有so库及该手机所使用的so库，豌豆荚有下载。  
![程序演示截图][app_screemshot03]   







































[app_screemshot01]: https://github.com/littleRich/WeChatLuckyMoney/blob/master/screenshot/showcurrentactivity.jpg
[app_screemshot02]: https://github.com/littleRich/WeChatLuckyMoney/blob/master/screenshot/activitylauncher.jpg
[app_screemshot03]: https://github.com/littleRich/WeChatLuckyMoney/blob/master/screenshot/showsolib.jpg  