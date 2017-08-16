## Hook相关技巧
1、使用GSON打印对象中内容  
很多时候在逆向过程中，我们需要查看Hook拦截到Object对象中的内容信息，一般我们是通过Java反射来获取对象中的内容，但是，这样一个一个写比较繁琐，遇到对象的属性比较多时，就更头疼了。有了Gson就再也不愁这些啦，Gson已帮我们封装了Java反射获取对象内容的方法了，可以直接往里面传对象即可打印出来。示例如下：  
```java
new GsonBuilder().create().toJson(object)
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