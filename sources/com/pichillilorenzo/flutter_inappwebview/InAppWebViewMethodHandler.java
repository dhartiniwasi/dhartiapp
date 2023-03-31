package com.pichillilorenzo.flutter_inappwebview;

import android.net.Uri;
import android.os.Build;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import com.pichillilorenzo.flutter_inappwebview.in_app_browser.InAppBrowserActivity;
import com.pichillilorenzo.flutter_inappwebview.in_app_browser.InAppBrowserOptions;
import com.pichillilorenzo.flutter_inappwebview.in_app_webview.InAppWebView;
import com.pichillilorenzo.flutter_inappwebview.in_app_webview.InAppWebViewOptions;
import com.pichillilorenzo.flutter_inappwebview.types.ContentWorld;
import com.pichillilorenzo.flutter_inappwebview.types.HitTestResult;
import com.pichillilorenzo.flutter_inappwebview.types.InAppWebViewInterface;
import com.pichillilorenzo.flutter_inappwebview.types.SslCertificateExt;
import com.pichillilorenzo.flutter_inappwebview.types.URLRequest;
import com.pichillilorenzo.flutter_inappwebview.types.UserScript;
import com.pichillilorenzo.flutter_inappwebview.types.WebMessageChannel;
import com.pichillilorenzo.flutter_inappwebview.types.WebMessageListener;
import com.unity3d.services.core.device.reader.JsonStorageKeyNames;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p158w0.C5878g;
import p158w0.C5879h;
import p158w0.C5882j;
import p158w0.C5885k;
import p186ac.C6555j;
import p186ac.C6556k;

public class InAppWebViewMethodHandler implements C6556k.C6560c {
    static final String LOG_TAG = "IAWMethodHandler";
    public InAppWebViewInterface webView;

    public InAppWebViewMethodHandler(InAppWebViewInterface inAppWebViewInterface) {
        this.webView = inAppWebViewInterface;
    }

    public void dispose() {
        this.webView = null;
    }

    public void onMethodCall(C6555j jVar, C6556k.C6561d dVar) {
        C6555j jVar2 = jVar;
        final C6556k.C6561d dVar2 = dVar;
        String str = jVar2.f30999a;
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case -2022488786:
                if (str.equals("isSecureContext")) {
                    c = 0;
                    break;
                }
                break;
            case -1787354268:
                if (str.equals("pauseTimers")) {
                    c = 1;
                    break;
                }
                break;
            case -1773179062:
                if (str.equals("getContentHeight")) {
                    c = 2;
                    break;
                }
                break;
            case -1683397606:
                if (str.equals("removeUserScript")) {
                    c = 3;
                    break;
                }
                break;
            case -1624396757:
                if (str.equals("saveWebArchive")) {
                    c = 4;
                    break;
                }
                break;
            case -1331417355:
                if (str.equals("getScrollX")) {
                    c = 5;
                    break;
                }
                break;
            case -1331417354:
                if (str.equals("getScrollY")) {
                    c = 6;
                    break;
                }
                break;
            case -1309347773:
                if (str.equals("canGoBackOrForward")) {
                    c = 7;
                    break;
                }
                break;
            case -1249348039:
                if (str.equals("getUrl")) {
                    c = 8;
                    break;
                }
                break;
            case -1241591313:
                if (str.equals("goBack")) {
                    c = 9;
                    break;
                }
                break;
            case -1067273523:
                if (str.equals("canGoForward")) {
                    c = 10;
                    break;
                }
                break;
            case -995752566:
                if (str.equals("pageUp")) {
                    c = 11;
                    break;
                }
                break;
            case -957712370:
                if (str.equals("canScrollHorizontally")) {
                    c = 12;
                    break;
                }
                break;
            case -948122918:
                if (str.equals("stopLoading")) {
                    c = 13;
                    break;
                }
                break;
            case -934641255:
                if (str.equals("reload")) {
                    c = 14;
                    break;
                }
                break;
            case -934426579:
                if (str.equals("resume")) {
                    c = 15;
                    break;
                }
                break;
            case -759238347:
                if (str.equals("clearCache")) {
                    c = 16;
                    break;
                }
                break;
            case -756050293:
                if (str.equals("clearFocus")) {
                    c = 17;
                    break;
                }
                break;
            case -696286326:
                if (str.equals("zoomBy")) {
                    c = 18;
                    break;
                }
                break;
            case -696286120:
                if (str.equals("zoomIn")) {
                    c = 19;
                    break;
                }
                break;
            case -694273432:
                if (str.equals("addWebMessageListener")) {
                    c = 20;
                    break;
                }
                break;
            case -679382964:
                if (str.equals("findNext")) {
                    c = 21;
                    break;
                }
                break;
            case -678975813:
                if (str.equals("printCurrentPage")) {
                    c = 22;
                    break;
                }
                break;
            case -543453324:
                if (str.equals("isHidden")) {
                    c = 23;
                    break;
                }
                break;
            case -402165756:
                if (str.equals("scrollBy")) {
                    c = 24;
                    break;
                }
                break;
            case -402165208:
                if (str.equals("scrollTo")) {
                    c = 25;
                    break;
                }
                break;
            case -391221073:
                if (str.equals("postUrl")) {
                    c = 26;
                    break;
                }
                break;
            case -318289731:
                if (str.equals("goForward")) {
                    c = 27;
                    break;
                }
                break;
            case -317054497:
                if (str.equals("canGoBack")) {
                    c = 28;
                    break;
                }
                break;
            case -243128142:
                if (str.equals("isLoading")) {
                    c = 29;
                    break;
                }
                break;
            case -212614552:
                if (str.equals("getOptions")) {
                    c = 30;
                    break;
                }
                break;
            case -127960866:
                if (str.equals("getSelectedText")) {
                    c = 31;
                    break;
                }
                break;
            case -110027141:
                if (str.equals("zoomOut")) {
                    c = ' ';
                    break;
                }
                break;
            case -53272641:
                if (str.equals("injectCSSCode")) {
                    c = '!';
                    break;
                }
                break;
            case -32598479:
                if (str.equals("getCopyBackForwardList")) {
                    c = '\"';
                    break;
                }
                break;
            case -17750794:
                if (str.equals("startSafeBrowsing")) {
                    c = '#';
                    break;
                }
                break;
            case 3202370:
                if (str.equals("hide")) {
                    c = '$';
                    break;
                }
                break;
            case 3529469:
                if (str.equals("show")) {
                    c = '%';
                    break;
                }
                break;
            case 94756344:
                if (str.equals("close")) {
                    c = '&';
                    break;
                }
                break;
            case 97958356:
                if (str.equals("createWebMessageChannel")) {
                    c = '\'';
                    break;
                }
                break;
            case 106440182:
                if (str.equals("pause")) {
                    c = '(';
                    break;
                }
                break;
            case 194959693:
                if (str.equals("takeScreenshot")) {
                    c = ')';
                    break;
                }
                break;
            case 210916051:
                if (str.equals("postWebMessage")) {
                    c = '*';
                    break;
                }
                break;
            case 336631465:
                if (str.equals("loadUrl")) {
                    c = '+';
                    break;
                }
                break;
            case 492688268:
                if (str.equals("getHitTestResult")) {
                    c = ',';
                    break;
                }
                break;
            case 559938080:
                if (str.equals("canScrollVertically")) {
                    c = '-';
                    break;
                }
                break;
            case 740366903:
                if (str.equals("injectCSSFileFromUrl")) {
                    c = '.';
                    break;
                }
                break;
            case 817048102:
                if (str.equals("clearMatches")) {
                    c = '/';
                    break;
                }
                break;
            case 858987473:
                if (str.equals("pageDown")) {
                    c = '0';
                    break;
                }
                break;
            case 903120263:
                if (str.equals("clearHistory")) {
                    c = '1';
                    break;
                }
                break;
            case 998674874:
                if (str.equals("removeUserScriptsByGroupName")) {
                    c = '2';
                    break;
                }
                break;
            case 1042858233:
                if (str.equals("clearSslPreferences")) {
                    c = '3';
                    break;
                }
                break;
            case 1076821923:
                if (str.equals("getProgress")) {
                    c = '4';
                    break;
                }
                break;
            case 1091267752:
                if (str.equals("getOriginalUrl")) {
                    c = '5';
                    break;
                }
                break;
            case 1246613238:
                if (str.equals("requestFocusNodeHref")) {
                    c = '6';
                    break;
                }
                break;
            case 1312131169:
                if (str.equals("getCertificate")) {
                    c = '7';
                    break;
                }
                break;
            case 1520566363:
                if (str.equals("resumeTimers")) {
                    c = '8';
                    break;
                }
                break;
            case 1587824640:
                if (str.equals("removeAllUserScripts")) {
                    c = '9';
                    break;
                }
                break;
            case 1596466167:
                if (str.equals("addUserScript")) {
                    c = ':';
                    break;
                }
                break;
            case 1631638145:
                if (str.equals("getZoomScale")) {
                    c = ';';
                    break;
                }
                break;
            case 1724190684:
                if (str.equals("setOptions")) {
                    c = '<';
                    break;
                }
                break;
            case 1726230251:
                if (str.equals("callAsyncJavaScript")) {
                    c = '=';
                    break;
                }
                break;
            case 1729408231:
                if (str.equals("requestImageRef")) {
                    c = '>';
                    break;
                }
                break;
            case 1779894764:
                if (str.equals("setContextMenu")) {
                    c = '?';
                    break;
                }
                break;
            case 1810715187:
                if (str.equals("goBackOrForward")) {
                    c = '@';
                    break;
                }
                break;
            case 1845118384:
                if (str.equals("loadData")) {
                    c = 'A';
                    break;
                }
                break;
            case 1845185410:
                if (str.equals("loadFile")) {
                    c = 'B';
                    break;
                }
                break;
            case 1916929588:
                if (str.equals("findAllAsync")) {
                    c = 'C';
                    break;
                }
                break;
            case 1925083019:
                if (str.equals("injectJavascriptFileFromUrl")) {
                    c = 'D';
                    break;
                }
                break;
            case 1937913574:
                if (str.equals("evaluateJavascript")) {
                    c = 'E';
                    break;
                }
                break;
            case 1966196898:
                if (str.equals("getTitle")) {
                    c = 'F';
                    break;
                }
                break;
        }
        Object obj = null;
        switch (c) {
            case 0:
                InAppWebViewInterface inAppWebViewInterface = this.webView;
                if (inAppWebViewInterface == null || Build.VERSION.SDK_INT < 21) {
                    dVar2.success(Boolean.FALSE);
                    return;
                } else {
                    inAppWebViewInterface.isSecureContext(new ValueCallback<Boolean>() {
                        public void onReceiveValue(Boolean bool) {
                            dVar2.success(bool);
                        }
                    });
                    return;
                }
            case 1:
                InAppWebViewInterface inAppWebViewInterface2 = this.webView;
                if (inAppWebViewInterface2 != null) {
                    inAppWebViewInterface2.pauseTimers();
                }
                dVar2.success(Boolean.TRUE);
                return;
            case 2:
                InAppWebViewInterface inAppWebViewInterface3 = this.webView;
                if (inAppWebViewInterface3 instanceof InAppWebView) {
                    dVar2.success(Integer.valueOf(inAppWebViewInterface3.getContentHeight()));
                    return;
                } else {
                    dVar2.success((Object) null);
                    return;
                }
            case 3:
                InAppWebViewInterface inAppWebViewInterface4 = this.webView;
                if (inAppWebViewInterface4 == null || inAppWebViewInterface4.getUserContentController() == null) {
                    dVar2.success(Boolean.FALSE);
                    return;
                } else {
                    dVar2.success(Boolean.valueOf(this.webView.getUserContentController().removeUserOnlyScriptAt(((Integer) jVar2.mo22156a("index")).intValue(), UserScript.fromMap((Map) jVar2.mo22156a("userScript")).getInjectionTime())));
                    return;
                }
            case 4:
                if (this.webView != null) {
                    this.webView.saveWebArchive((String) jVar2.mo22156a("filePath"), ((Boolean) jVar2.mo22156a("autoname")).booleanValue(), new ValueCallback<String>() {
                        public void onReceiveValue(String str) {
                            dVar2.success(str);
                        }
                    });
                    return;
                } else {
                    dVar2.success((Object) null);
                    return;
                }
            case 5:
                InAppWebViewInterface inAppWebViewInterface5 = this.webView;
                if (inAppWebViewInterface5 != null) {
                    dVar2.success(Integer.valueOf(inAppWebViewInterface5.getScrollX()));
                    return;
                } else {
                    dVar2.success((Object) null);
                    return;
                }
            case 6:
                InAppWebViewInterface inAppWebViewInterface6 = this.webView;
                if (inAppWebViewInterface6 != null) {
                    dVar2.success(Integer.valueOf(inAppWebViewInterface6.getScrollY()));
                    return;
                } else {
                    dVar2.success((Object) null);
                    return;
                }
            case 7:
                InAppWebViewInterface inAppWebViewInterface7 = this.webView;
                dVar2.success(Boolean.valueOf(inAppWebViewInterface7 != null && inAppWebViewInterface7.canGoBackOrForward(((Integer) jVar2.mo22156a("steps")).intValue())));
                return;
            case 8:
                InAppWebViewInterface inAppWebViewInterface8 = this.webView;
                if (inAppWebViewInterface8 != null) {
                    obj = inAppWebViewInterface8.getUrl();
                }
                dVar2.success(obj);
                return;
            case 9:
                InAppWebViewInterface inAppWebViewInterface9 = this.webView;
                if (inAppWebViewInterface9 != null) {
                    inAppWebViewInterface9.goBack();
                }
                dVar2.success(Boolean.TRUE);
                return;
            case 10:
                InAppWebViewInterface inAppWebViewInterface10 = this.webView;
                dVar2.success(Boolean.valueOf(inAppWebViewInterface10 != null && inAppWebViewInterface10.canGoForward()));
                return;
            case 11:
                if (this.webView != null) {
                    dVar2.success(Boolean.valueOf(this.webView.pageUp(((Boolean) jVar2.mo22156a("top")).booleanValue())));
                    return;
                } else {
                    dVar2.success(Boolean.FALSE);
                    return;
                }
            case 12:
                InAppWebViewInterface inAppWebViewInterface11 = this.webView;
                if (inAppWebViewInterface11 != null) {
                    dVar2.success(Boolean.valueOf(inAppWebViewInterface11.canScrollHorizontally()));
                    return;
                } else {
                    dVar2.success(Boolean.FALSE);
                    return;
                }
            case 13:
                InAppWebViewInterface inAppWebViewInterface12 = this.webView;
                if (inAppWebViewInterface12 != null) {
                    inAppWebViewInterface12.stopLoading();
                }
                dVar2.success(Boolean.TRUE);
                return;
            case 14:
                InAppWebViewInterface inAppWebViewInterface13 = this.webView;
                if (inAppWebViewInterface13 != null) {
                    inAppWebViewInterface13.reload();
                }
                dVar2.success(Boolean.TRUE);
                return;
            case 15:
                InAppWebViewInterface inAppWebViewInterface14 = this.webView;
                if (inAppWebViewInterface14 != null) {
                    inAppWebViewInterface14.onResume();
                }
                dVar2.success(Boolean.TRUE);
                return;
            case 16:
                InAppWebViewInterface inAppWebViewInterface15 = this.webView;
                if (inAppWebViewInterface15 != null) {
                    inAppWebViewInterface15.clearAllCache();
                }
                dVar2.success(Boolean.TRUE);
                return;
            case 17:
                InAppWebViewInterface inAppWebViewInterface16 = this.webView;
                if (inAppWebViewInterface16 != null) {
                    inAppWebViewInterface16.clearFocus();
                }
                dVar2.success(Boolean.TRUE);
                return;
            case 18:
                if (this.webView != null && Build.VERSION.SDK_INT >= 21) {
                    this.webView.zoomBy((float) ((Double) jVar2.mo22156a("zoomFactor")).doubleValue());
                }
                dVar2.success(Boolean.TRUE);
                return;
            case 19:
                InAppWebViewInterface inAppWebViewInterface17 = this.webView;
                if (inAppWebViewInterface17 != null) {
                    dVar2.success(Boolean.valueOf(inAppWebViewInterface17.zoomIn()));
                    return;
                } else {
                    dVar2.success(Boolean.FALSE);
                    return;
                }
            case 20:
                if (this.webView != null) {
                    InAppWebViewInterface inAppWebViewInterface18 = this.webView;
                    WebMessageListener fromMap = WebMessageListener.fromMap(inAppWebViewInterface18, inAppWebViewInterface18.getPlugin().messenger, (Map) jVar2.mo22156a("webMessageListener"));
                    if (!(this.webView instanceof InAppWebView) || !C5885k.m34805a("WEB_MESSAGE_LISTENER")) {
                        dVar2.success(Boolean.TRUE);
                        return;
                    }
                    try {
                        this.webView.addWebMessageListener(fromMap);
                        dVar2.success(Boolean.TRUE);
                        return;
                    } catch (Exception e) {
                        dVar2.error(LOG_TAG, e.getMessage(), (Object) null);
                        return;
                    }
                } else {
                    dVar2.success(Boolean.TRUE);
                    return;
                }
            case 21:
                if (this.webView != null) {
                    this.webView.findNext(((Boolean) jVar2.mo22156a("forward")).booleanValue());
                }
                dVar2.success(Boolean.TRUE);
                return;
            case 22:
                InAppWebViewInterface inAppWebViewInterface19 = this.webView;
                if (inAppWebViewInterface19 != null && Build.VERSION.SDK_INT >= 21) {
                    inAppWebViewInterface19.printCurrentPage();
                }
                dVar2.success(Boolean.TRUE);
                return;
            case 23:
                InAppWebViewInterface inAppWebViewInterface20 = this.webView;
                if (inAppWebViewInterface20 == null || inAppWebViewInterface20.getInAppBrowserDelegate() == null || !(this.webView.getInAppBrowserDelegate() instanceof InAppBrowserActivity)) {
                    dVar.notImplemented();
                    return;
                } else {
                    dVar2.success(Boolean.valueOf(((InAppBrowserActivity) this.webView.getInAppBrowserDelegate()).isHidden));
                    return;
                }
            case 24:
                if (this.webView != null) {
                    this.webView.scrollBy((Integer) jVar2.mo22156a("x"), (Integer) jVar2.mo22156a("y"), (Boolean) jVar2.mo22156a("animated"));
                }
                dVar2.success(Boolean.TRUE);
                return;
            case 25:
                if (this.webView != null) {
                    this.webView.scrollTo((Integer) jVar2.mo22156a("x"), (Integer) jVar2.mo22156a("y"), (Boolean) jVar2.mo22156a("animated"));
                }
                dVar2.success(Boolean.TRUE);
                return;
            case 26:
                if (this.webView != null) {
                    this.webView.postUrl((String) jVar2.mo22156a("url"), (byte[]) jVar2.mo22156a("postData"));
                }
                dVar2.success(Boolean.TRUE);
                return;
            case 27:
                InAppWebViewInterface inAppWebViewInterface21 = this.webView;
                if (inAppWebViewInterface21 != null) {
                    inAppWebViewInterface21.goForward();
                }
                dVar2.success(Boolean.TRUE);
                return;
            case 28:
                InAppWebViewInterface inAppWebViewInterface22 = this.webView;
                dVar2.success(Boolean.valueOf(inAppWebViewInterface22 != null && inAppWebViewInterface22.canGoBack()));
                return;
            case 29:
                InAppWebViewInterface inAppWebViewInterface23 = this.webView;
                dVar2.success(Boolean.valueOf(inAppWebViewInterface23 != null && inAppWebViewInterface23.isLoading()));
                return;
            case 30:
                InAppWebViewInterface inAppWebViewInterface24 = this.webView;
                if (inAppWebViewInterface24 == null || inAppWebViewInterface24.getInAppBrowserDelegate() == null || !(this.webView.getInAppBrowserDelegate() instanceof InAppBrowserActivity)) {
                    InAppWebViewInterface inAppWebViewInterface25 = this.webView;
                    if (inAppWebViewInterface25 != null) {
                        obj = inAppWebViewInterface25.getOptions();
                    }
                    dVar2.success(obj);
                    return;
                }
                dVar2.success(((InAppBrowserActivity) this.webView.getInAppBrowserDelegate()).getOptions());
                return;
            case 31:
                InAppWebViewInterface inAppWebViewInterface26 = this.webView;
                if (!(inAppWebViewInterface26 instanceof InAppWebView) || Build.VERSION.SDK_INT < 19) {
                    dVar2.success((Object) null);
                    return;
                } else {
                    inAppWebViewInterface26.getSelectedText(new ValueCallback<String>() {
                        public void onReceiveValue(String str) {
                            dVar2.success(str);
                        }
                    });
                    return;
                }
            case ' ':
                InAppWebViewInterface inAppWebViewInterface27 = this.webView;
                if (inAppWebViewInterface27 != null) {
                    dVar2.success(Boolean.valueOf(inAppWebViewInterface27.zoomOut()));
                    return;
                } else {
                    dVar2.success(Boolean.FALSE);
                    return;
                }
            case '!':
                if (this.webView != null) {
                    this.webView.injectCSSCode((String) jVar2.mo22156a("source"));
                }
                dVar2.success(Boolean.TRUE);
                return;
            case '\"':
                InAppWebViewInterface inAppWebViewInterface28 = this.webView;
                if (inAppWebViewInterface28 != null) {
                    obj = inAppWebViewInterface28.getCopyBackForwardList();
                }
                dVar2.success(obj);
                return;
            case '#':
                if (this.webView == null || !C5885k.m34805a("START_SAFE_BROWSING")) {
                    dVar2.success(Boolean.FALSE);
                    return;
                } else {
                    C5882j.m34804n(this.webView.getContext(), new ValueCallback<Boolean>() {
                        public void onReceiveValue(Boolean bool) {
                            dVar2.success(bool);
                        }
                    });
                    return;
                }
            case '$':
                InAppWebViewInterface inAppWebViewInterface29 = this.webView;
                if (inAppWebViewInterface29 == null || inAppWebViewInterface29.getInAppBrowserDelegate() == null || !(this.webView.getInAppBrowserDelegate() instanceof InAppBrowserActivity)) {
                    dVar.notImplemented();
                    return;
                }
                ((InAppBrowserActivity) this.webView.getInAppBrowserDelegate()).hide();
                dVar2.success(Boolean.TRUE);
                return;
            case '%':
                InAppWebViewInterface inAppWebViewInterface30 = this.webView;
                if (inAppWebViewInterface30 == null || inAppWebViewInterface30.getInAppBrowserDelegate() == null || !(this.webView.getInAppBrowserDelegate() instanceof InAppBrowserActivity)) {
                    dVar.notImplemented();
                    return;
                }
                ((InAppBrowserActivity) this.webView.getInAppBrowserDelegate()).show();
                dVar2.success(Boolean.TRUE);
                return;
            case '&':
                InAppWebViewInterface inAppWebViewInterface31 = this.webView;
                if (inAppWebViewInterface31 == null || inAppWebViewInterface31.getInAppBrowserDelegate() == null || !(this.webView.getInAppBrowserDelegate() instanceof InAppBrowserActivity)) {
                    dVar.notImplemented();
                    return;
                } else {
                    ((InAppBrowserActivity) this.webView.getInAppBrowserDelegate()).close(dVar2);
                    return;
                }
            case '\'':
                InAppWebViewInterface inAppWebViewInterface32 = this.webView;
                if (inAppWebViewInterface32 == null) {
                    dVar2.success((Object) null);
                    return;
                } else if (!(inAppWebViewInterface32 instanceof InAppWebView) || !C5885k.m34805a("CREATE_WEB_MESSAGE_CHANNEL")) {
                    dVar2.success((Object) null);
                    return;
                } else {
                    dVar2.success(this.webView.createCompatWebMessageChannel().toMap());
                    return;
                }
            case '(':
                InAppWebViewInterface inAppWebViewInterface33 = this.webView;
                if (inAppWebViewInterface33 != null) {
                    inAppWebViewInterface33.onPause();
                }
                dVar2.success(Boolean.TRUE);
                return;
            case ')':
                if (this.webView != null) {
                    this.webView.takeScreenshot((Map) jVar2.mo22156a("screenshotConfiguration"), dVar2);
                    return;
                } else {
                    dVar2.success((Object) null);
                    return;
                }
            case '*':
                if (this.webView == null || !C5885k.m34805a("POST_WEB_MESSAGE")) {
                    dVar2.success(Boolean.TRUE);
                    return;
                }
                Map map = (Map) jVar2.mo22156a("message");
                String str2 = (String) jVar2.mo22156a("targetOrigin");
                ArrayList arrayList = new ArrayList();
                new ArrayList();
                List<Map> list = (List) map.get("ports");
                if (list != null) {
                    for (Map map2 : list) {
                        Integer num = (Integer) map2.get("index");
                        WebMessageChannel webMessageChannel = this.webView.getWebMessageChannels().get((String) map2.get("webMessageChannelId"));
                        if (webMessageChannel != null && (this.webView instanceof InAppWebView)) {
                            arrayList.add(webMessageChannel.compatPorts.get(num.intValue()));
                        }
                    }
                }
                if (this.webView instanceof InAppWebView) {
                    try {
                        C5882j.m34800j((WebView) this.webView, new C5878g((String) map.get(JsonStorageKeyNames.DATA_KEY), (C5879h[]) arrayList.toArray(new C5879h[0])), Uri.parse(str2));
                        dVar2.success(Boolean.TRUE);
                        return;
                    } catch (Exception e2) {
                        dVar2.error(LOG_TAG, e2.getMessage(), (Object) null);
                        return;
                    }
                } else {
                    return;
                }
            case C8710R.styleable.AppCompatTheme_buttonBarNeutralButtonStyle:
                if (this.webView != null) {
                    this.webView.loadUrl(URLRequest.fromMap((Map) jVar2.mo22156a("urlRequest")));
                }
                dVar2.success(Boolean.TRUE);
                return;
            case C8710R.styleable.AppCompatTheme_buttonBarPositiveButtonStyle:
                InAppWebViewInterface inAppWebViewInterface34 = this.webView;
                if (inAppWebViewInterface34 instanceof InAppWebView) {
                    dVar2.success(HitTestResult.fromWebViewHitTestResult(inAppWebViewInterface34.getHitTestResult()).toMap());
                    return;
                } else {
                    dVar2.success((Object) null);
                    return;
                }
            case '-':
                InAppWebViewInterface inAppWebViewInterface35 = this.webView;
                if (inAppWebViewInterface35 != null) {
                    dVar2.success(Boolean.valueOf(inAppWebViewInterface35.canScrollVertically()));
                    return;
                } else {
                    dVar2.success(Boolean.FALSE);
                    return;
                }
            case '.':
                if (this.webView != null) {
                    this.webView.injectCSSFileFromUrl((String) jVar2.mo22156a("urlFile"), (Map) jVar2.mo22156a("cssLinkHtmlTagAttributes"));
                }
                dVar2.success(Boolean.TRUE);
                return;
            case '/':
                InAppWebViewInterface inAppWebViewInterface36 = this.webView;
                if (inAppWebViewInterface36 != null) {
                    inAppWebViewInterface36.clearMatches();
                }
                dVar2.success(Boolean.TRUE);
                return;
            case '0':
                if (this.webView != null) {
                    dVar2.success(Boolean.valueOf(this.webView.pageDown(((Boolean) jVar2.mo22156a("bottom")).booleanValue())));
                    return;
                } else {
                    dVar2.success(Boolean.FALSE);
                    return;
                }
            case '1':
                InAppWebViewInterface inAppWebViewInterface37 = this.webView;
                if (inAppWebViewInterface37 != null) {
                    inAppWebViewInterface37.clearHistory();
                }
                dVar2.success(Boolean.TRUE);
                return;
            case C8710R.styleable.AppCompatTheme_colorAccent:
                InAppWebViewInterface inAppWebViewInterface38 = this.webView;
                if (!(inAppWebViewInterface38 == null || inAppWebViewInterface38.getUserContentController() == null)) {
                    this.webView.getUserContentController().removeUserOnlyScriptsByGroupName((String) jVar2.mo22156a("groupName"));
                }
                dVar2.success(Boolean.TRUE);
                return;
            case C8710R.styleable.AppCompatTheme_colorBackgroundFloating:
                InAppWebViewInterface inAppWebViewInterface39 = this.webView;
                if (inAppWebViewInterface39 != null) {
                    inAppWebViewInterface39.clearSslPreferences();
                }
                dVar2.success(Boolean.TRUE);
                return;
            case C8710R.styleable.AppCompatTheme_colorButtonNormal:
                InAppWebViewInterface inAppWebViewInterface40 = this.webView;
                if (inAppWebViewInterface40 != null) {
                    obj = Integer.valueOf(inAppWebViewInterface40.getProgress());
                }
                dVar2.success(obj);
                return;
            case C8710R.styleable.AppCompatTheme_colorControlActivated:
                InAppWebViewInterface inAppWebViewInterface41 = this.webView;
                if (inAppWebViewInterface41 != null) {
                    obj = inAppWebViewInterface41.getOriginalUrl();
                }
                dVar2.success(obj);
                return;
            case C8710R.styleable.AppCompatTheme_colorControlHighlight:
                InAppWebViewInterface inAppWebViewInterface42 = this.webView;
                if (inAppWebViewInterface42 != null) {
                    dVar2.success(inAppWebViewInterface42.requestFocusNodeHref());
                    return;
                } else {
                    dVar2.success((Object) null);
                    return;
                }
            case C8710R.styleable.AppCompatTheme_colorControlNormal:
                InAppWebViewInterface inAppWebViewInterface43 = this.webView;
                if (inAppWebViewInterface43 != null) {
                    dVar2.success(SslCertificateExt.toMap(inAppWebViewInterface43.getCertificate()));
                    return;
                } else {
                    dVar2.success((Object) null);
                    return;
                }
            case C8710R.styleable.AppCompatTheme_colorError:
                InAppWebViewInterface inAppWebViewInterface44 = this.webView;
                if (inAppWebViewInterface44 != null) {
                    inAppWebViewInterface44.resumeTimers();
                }
                dVar2.success(Boolean.TRUE);
                return;
            case C8710R.styleable.AppCompatTheme_colorPrimary:
                InAppWebViewInterface inAppWebViewInterface45 = this.webView;
                if (!(inAppWebViewInterface45 == null || inAppWebViewInterface45.getUserContentController() == null)) {
                    this.webView.getUserContentController().removeAllUserOnlyScripts();
                }
                dVar2.success(Boolean.TRUE);
                return;
            case C8710R.styleable.AppCompatTheme_colorPrimaryDark:
                InAppWebViewInterface inAppWebViewInterface46 = this.webView;
                if (inAppWebViewInterface46 == null || inAppWebViewInterface46.getUserContentController() == null) {
                    dVar2.success(Boolean.FALSE);
                    return;
                } else {
                    dVar2.success(Boolean.valueOf(this.webView.getUserContentController().addUserOnlyScript(UserScript.fromMap((Map) jVar2.mo22156a("userScript")))));
                    return;
                }
            case C8710R.styleable.AppCompatTheme_colorSwitchThumbNormal:
                InAppWebViewInterface inAppWebViewInterface47 = this.webView;
                if (inAppWebViewInterface47 instanceof InAppWebView) {
                    dVar2.success(Float.valueOf(inAppWebViewInterface47.getZoomScale()));
                    return;
                } else {
                    dVar2.success((Object) null);
                    return;
                }
            case C8710R.styleable.AppCompatTheme_controlBackground:
                InAppWebViewInterface inAppWebViewInterface48 = this.webView;
                if (inAppWebViewInterface48 != null && inAppWebViewInterface48.getInAppBrowserDelegate() != null && (this.webView.getInAppBrowserDelegate() instanceof InAppBrowserActivity)) {
                    InAppBrowserOptions inAppBrowserOptions = new InAppBrowserOptions();
                    HashMap hashMap = (HashMap) jVar2.mo22156a("options");
                    inAppBrowserOptions.parse((Map) hashMap);
                    ((InAppBrowserActivity) this.webView.getInAppBrowserDelegate()).setOptions(inAppBrowserOptions, hashMap);
                } else if (this.webView != null) {
                    InAppWebViewOptions inAppWebViewOptions = new InAppWebViewOptions();
                    HashMap hashMap2 = (HashMap) jVar2.mo22156a("options");
                    inAppWebViewOptions.parse((Map) hashMap2);
                    this.webView.setOptions(inAppWebViewOptions, hashMap2);
                }
                dVar2.success(Boolean.TRUE);
                return;
            case C8710R.styleable.AppCompatTheme_dialogCornerRadius:
                if (this.webView == null || Build.VERSION.SDK_INT < 21) {
                    dVar2.success((Object) null);
                    return;
                } else {
                    this.webView.callAsyncJavaScript((String) jVar2.mo22156a("functionBody"), (Map) jVar2.mo22156a("arguments"), ContentWorld.fromMap((Map) jVar2.mo22156a("contentWorld")), new ValueCallback<String>() {
                        public void onReceiveValue(String str) {
                            dVar2.success(str);
                        }
                    });
                    return;
                }
            case C8710R.styleable.AppCompatTheme_dialogPreferredPadding:
                InAppWebViewInterface inAppWebViewInterface49 = this.webView;
                if (inAppWebViewInterface49 != null) {
                    dVar2.success(inAppWebViewInterface49.requestImageRef());
                    return;
                } else {
                    dVar2.success((Object) null);
                    return;
                }
            case C8710R.styleable.AppCompatTheme_dialogTheme:
                if (this.webView != null) {
                    this.webView.setContextMenu((Map) jVar2.mo22156a("contextMenu"));
                }
                dVar2.success(Boolean.TRUE);
                return;
            case C8710R.styleable.AppCompatTheme_dividerHorizontal:
                InAppWebViewInterface inAppWebViewInterface50 = this.webView;
                if (inAppWebViewInterface50 != null) {
                    inAppWebViewInterface50.goBackOrForward(((Integer) jVar2.mo22156a("steps")).intValue());
                }
                dVar2.success(Boolean.TRUE);
                return;
            case C8710R.styleable.AppCompatTheme_dividerVertical:
                if (this.webView != null) {
                    this.webView.loadDataWithBaseURL((String) jVar2.mo22156a("baseUrl"), (String) jVar2.mo22156a(JsonStorageKeyNames.DATA_KEY), (String) jVar2.mo22156a("mimeType"), (String) jVar2.mo22156a("encoding"), (String) jVar2.mo22156a("historyUrl"));
                }
                dVar2.success(Boolean.TRUE);
                return;
            case C8710R.styleable.AppCompatTheme_dropDownListViewStyle:
                if (this.webView != null) {
                    try {
                        this.webView.loadFile((String) jVar2.mo22156a("assetFilePath"));
                    } catch (IOException e3) {
                        e3.printStackTrace();
                        dVar2.error(LOG_TAG, e3.getMessage(), (Object) null);
                        return;
                    }
                }
                dVar2.success(Boolean.TRUE);
                return;
            case C8710R.styleable.AppCompatTheme_dropdownListPreferredItemHeight:
                if (this.webView != null) {
                    this.webView.findAllAsync((String) jVar2.mo22156a("find"));
                }
                dVar2.success(Boolean.TRUE);
                return;
            case C8710R.styleable.AppCompatTheme_editTextBackground:
                if (this.webView != null) {
                    this.webView.injectJavascriptFileFromUrl((String) jVar2.mo22156a("urlFile"), (Map) jVar2.mo22156a("scriptHtmlTagAttributes"));
                }
                dVar2.success(Boolean.TRUE);
                return;
            case C8710R.styleable.AppCompatTheme_editTextColor:
                if (this.webView != null) {
                    this.webView.evaluateJavascript((String) jVar2.mo22156a("source"), ContentWorld.fromMap((Map) jVar2.mo22156a("contentWorld")), new ValueCallback<String>() {
                        public void onReceiveValue(String str) {
                            dVar2.success(str);
                        }
                    });
                    return;
                } else {
                    dVar2.success((Object) null);
                    return;
                }
            case C8710R.styleable.AppCompatTheme_editTextStyle:
                InAppWebViewInterface inAppWebViewInterface51 = this.webView;
                if (inAppWebViewInterface51 != null) {
                    obj = inAppWebViewInterface51.getTitle();
                }
                dVar2.success(obj);
                return;
            default:
                dVar.notImplemented();
                return;
        }
    }
}
