package me.veryyoung.wechat.luckymoney;


public class VersionParam {

    public static final String WECHAT_PACKAGE_NAME = "com.tencent.mm";

    public static String receiveUIFunctionName = "d";
    public static String receiveUIParamName = "com.tencent.mm.w.k";

    /**
     * Search MMCore has not been initialize ?
     */
    public static String networkRequest = "com.tencent.mm.s.ao";

    /**
     * Search MMCore has not been initialize ? next function of networkRequest
     */
    public static String getNetworkByModelMethod = "uH";

    /**
     * Search get value failed, %s", e.getMessage()
     */
    public static String getMessageClass = "com.tencent.mm.e.b.cd";

    public static String luckyMoneyReceiveUI = WECHAT_PACKAGE_NAME + ".plugin.luckymoney.ui.En_fba4b94f";
    public static boolean hasTimingIdentifier = false;


    public static void init(String version) {
        switch (version) {
            case "6.3.22":
                receiveUIFunctionName = "d";
                receiveUIParamName = "com.tencent.mm.t.j";
                networkRequest = "com.tencent.mm.model.ah";
                getNetworkByModelMethod = "tF";
                getMessageClass = "com.tencent.mm.e.b.bj";
                luckyMoneyReceiveUI = WECHAT_PACKAGE_NAME + ".plugin.luckymoney.ui.LuckyMoneyReceiveUI";
                break;
            case "6.3.23":
                receiveUIFunctionName = "d";
                receiveUIParamName = "com.tencent.mm.t.j";
                networkRequest = "com.tencent.mm.model.ah";
                getNetworkByModelMethod = "vE";
                getMessageClass = "com.tencent.mm.e.b.bl";
                luckyMoneyReceiveUI = WECHAT_PACKAGE_NAME + ".plugin.luckymoney.ui.LuckyMoneyReceiveUI";
                break;
            case "6.3.25":
                receiveUIFunctionName = "d";
                receiveUIParamName = "com.tencent.mm.t.j";
                networkRequest = "com.tencent.mm.model.ah";
                getNetworkByModelMethod = "vF";
                getMessageClass = "com.tencent.mm.e.b.bl";
                luckyMoneyReceiveUI = WECHAT_PACKAGE_NAME + ".plugin.luckymoney.ui.LuckyMoneyReceiveUI";
                break;
            case "6.3.27":
                receiveUIFunctionName = "e";
                receiveUIParamName = "com.tencent.mm.u.k";
                networkRequest = "com.tencent.mm.model.ah";
                getNetworkByModelMethod = "yj";
                getMessageClass = "com.tencent.mm.e.b.br";
                luckyMoneyReceiveUI = WECHAT_PACKAGE_NAME + ".plugin.luckymoney.ui.LuckyMoneyReceiveUI";
                break;
            case "6.3.28":
                receiveUIFunctionName = "c";
                receiveUIParamName = "com.tencent.mm.v.k";
                networkRequest = "com.tencent.mm.model.ah";
                getNetworkByModelMethod = "vP";
                getMessageClass = "com.tencent.mm.e.b.bu";
                luckyMoneyReceiveUI = WECHAT_PACKAGE_NAME + ".plugin.luckymoney.ui.LuckyMoneyReceiveUI";
                break;
            case "6.3.30":
            case "6.3.31":
                receiveUIFunctionName = "c";
                receiveUIParamName = "com.tencent.mm.v.k";
                networkRequest = "com.tencent.mm.model.ah";
                getNetworkByModelMethod = "vS";
                getMessageClass = "com.tencent.mm.e.b.bv";
                luckyMoneyReceiveUI = WECHAT_PACKAGE_NAME + ".plugin.luckymoney.ui.LuckyMoneyReceiveUI";
                break;
            case "6.3.32":
                receiveUIFunctionName = "d";
                receiveUIParamName = "com.tencent.mm.v.k";
                networkRequest = "com.tencent.mm.model.ak";
                getNetworkByModelMethod = "vw";
                getMessageClass = "com.tencent.mm.e.b.by";
                luckyMoneyReceiveUI = WECHAT_PACKAGE_NAME + ".plugin.luckymoney.ui.LuckyMoneyReceiveUI";
                break;
            case "6.5.3":
                receiveUIFunctionName = "d";
                receiveUIParamName = "com.tencent.mm.v.k";
                networkRequest = "com.tencent.mm.model.ak";
                getNetworkByModelMethod = "vy";
                getMessageClass = "com.tencent.mm.e.b.bx";
                luckyMoneyReceiveUI = WECHAT_PACKAGE_NAME + ".plugin.luckymoney.ui.LuckyMoneyReceiveUI";
                break;
            case "6.5.4":
                receiveUIFunctionName = "d";
                receiveUIParamName = "com.tencent.mm.u.k";
                networkRequest = "com.tencent.mm.model.ak";
                getNetworkByModelMethod = "vy";
                getMessageClass = "com.tencent.mm.e.b.by";
                luckyMoneyReceiveUI = WECHAT_PACKAGE_NAME + ".plugin.luckymoney.ui.LuckyMoneyReceiveUI";
                hasTimingIdentifier = true;
                break;
            case "6.5.6":
            case "6.5.7":
                receiveUIFunctionName = "d";
                receiveUIParamName = "com.tencent.mm.u.k";
                networkRequest = "com.tencent.mm.model.al";
                getNetworkByModelMethod = "vM";
                getMessageClass = "com.tencent.mm.e.b.by";
                luckyMoneyReceiveUI = WECHAT_PACKAGE_NAME + ".plugin.luckymoney.ui.En_fba4b94f";
                hasTimingIdentifier = true;
                break;
            case "6.5.8":
                receiveUIFunctionName = "d";
                receiveUIParamName = "com.tencent.mm.w.k";
                networkRequest = "com.tencent.mm.model.an";
                getNetworkByModelMethod = "uC";
                getMessageClass = "com.tencent.mm.e.b.ca";
                luckyMoneyReceiveUI = WECHAT_PACKAGE_NAME + ".plugin.luckymoney.ui.En_fba4b94f";
                hasTimingIdentifier = true;
                break;
            case "6.5.10":
                receiveUIFunctionName = "d";
                receiveUIParamName = "com.tencent.mm.w.k";
                networkRequest = "com.tencent.mm.s.ao";
                getNetworkByModelMethod = "uH";
                getMessageClass = "com.tencent.mm.e.b.cd";
                luckyMoneyReceiveUI = WECHAT_PACKAGE_NAME + ".plugin.luckymoney.ui.En_fba4b94f";
                hasTimingIdentifier = true;
                break;
            default:
                receiveUIFunctionName = "d";
                receiveUIParamName = "com.tencent.mm.w.k";
                networkRequest = "com.tencent.mm.s.ao";
                getNetworkByModelMethod = "uH";
                getMessageClass = "com.tencent.mm.e.b.cd";
                luckyMoneyReceiveUI = WECHAT_PACKAGE_NAME + ".plugin.luckymoney.ui.En_fba4b94f";
                hasTimingIdentifier = true;
        }
    }
}
