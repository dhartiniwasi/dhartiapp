package com.pichillilorenzo.flutter_inappwebview;

import android.os.Build;
import android.os.Handler;
import android.util.Log;
import android.webkit.JavascriptInterface;
import android.webkit.ValueCallback;
import com.pichillilorenzo.flutter_inappwebview.in_app_webview.InAppWebView;
import com.pichillilorenzo.flutter_inappwebview.plugin_scripts_js.JavaScriptBridgeJS;
import java.util.HashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p186ac.C6556k;

public class JavaScriptBridgeInterface {
    private static final String LOG_TAG = "JSBridgeInterface";
    /* access modifiers changed from: private */
    public final C6556k channel;
    /* access modifiers changed from: private */
    public InAppWebView inAppWebView;

    public JavaScriptBridgeInterface(InAppWebView inAppWebView2) {
        this.inAppWebView = inAppWebView2;
        this.channel = inAppWebView2.channel;
    }

    @JavascriptInterface
    public void _callHandler(String str, String str2, String str3) {
        if (this.inAppWebView != null) {
            final HashMap hashMap = new HashMap();
            hashMap.put("handlerName", str);
            hashMap.put("args", str3);
            final String str4 = str;
            final String str5 = str3;
            final String str6 = str2;
            new Handler(this.inAppWebView.getWebViewLooper()).post(new Runnable() {
                public void run() {
                    if (JavaScriptBridgeInterface.this.inAppWebView != null) {
                        if (str4.equals("onPrint") && Build.VERSION.SDK_INT >= 21) {
                            JavaScriptBridgeInterface.this.inAppWebView.printCurrentPage();
                        } else if (str4.equals("callAsyncJavaScript")) {
                            try {
                                JSONObject jSONObject = new JSONArray(str5).getJSONObject(0);
                                String string = jSONObject.getString("resultUuid");
                                ValueCallback valueCallback = JavaScriptBridgeInterface.this.inAppWebView.callAsyncJavaScriptCallbacks.get(string);
                                if (valueCallback != null) {
                                    valueCallback.onReceiveValue(jSONObject.toString());
                                    JavaScriptBridgeInterface.this.inAppWebView.callAsyncJavaScriptCallbacks.remove(string);
                                    return;
                                }
                                return;
                            } catch (JSONException e) {
                                e.printStackTrace();
                                return;
                            }
                        } else if (str4.equals("evaluateJavaScriptWithContentWorld")) {
                            try {
                                JSONObject jSONObject2 = new JSONArray(str5).getJSONObject(0);
                                String string2 = jSONObject2.getString("resultUuid");
                                ValueCallback valueCallback2 = JavaScriptBridgeInterface.this.inAppWebView.evaluateJavaScriptContentWorldCallbacks.get(string2);
                                if (valueCallback2 != null) {
                                    valueCallback2.onReceiveValue(jSONObject2.has("value") ? jSONObject2.get("value").toString() : "null");
                                    JavaScriptBridgeInterface.this.inAppWebView.evaluateJavaScriptContentWorldCallbacks.remove(string2);
                                    return;
                                }
                                return;
                            } catch (JSONException e2) {
                                e2.printStackTrace();
                                return;
                            }
                        }
                        JavaScriptBridgeInterface.this.channel.mo22160d("onCallJsHandler", hashMap, new C6556k.C6561d() {
                            public void error(String str, String str2, Object obj) {
                                Log.d(JavaScriptBridgeInterface.LOG_TAG, "ERROR: " + str + " " + str2);
                            }

                            public void notImplemented() {
                            }

                            public void success(Object obj) {
                                if (JavaScriptBridgeInterface.this.inAppWebView != null) {
                                    if (Build.VERSION.SDK_INT >= 19) {
                                        InAppWebView access$000 = JavaScriptBridgeInterface.this.inAppWebView;
                                        access$000.evaluateJavascript("if(window.flutter_inappwebview[" + str6 + "] != null) {window." + JavaScriptBridgeJS.JAVASCRIPT_BRIDGE_NAME + "[" + str6 + "](" + obj + "); delete window." + JavaScriptBridgeJS.JAVASCRIPT_BRIDGE_NAME + "[" + str6 + "];}", (ValueCallback) null);
                                        return;
                                    }
                                    InAppWebView access$0002 = JavaScriptBridgeInterface.this.inAppWebView;
                                    access$0002.loadUrl("javascript:if(window.flutter_inappwebview[" + str6 + "] != null) {window." + JavaScriptBridgeJS.JAVASCRIPT_BRIDGE_NAME + "[" + str6 + "](" + obj + "); delete window." + JavaScriptBridgeJS.JAVASCRIPT_BRIDGE_NAME + "[" + str6 + "];}");
                                }
                            }
                        });
                    }
                }
            });
        }
    }

    @JavascriptInterface
    public void _hideContextMenu() {
        if (this.inAppWebView != null) {
            new Handler(this.inAppWebView.getWebViewLooper()).post(new Runnable() {
                public void run() {
                    if (JavaScriptBridgeInterface.this.inAppWebView != null && JavaScriptBridgeInterface.this.inAppWebView.floatingContextMenu != null) {
                        JavaScriptBridgeInterface.this.inAppWebView.hideContextMenu();
                    }
                }
            });
        }
    }

    public void dispose() {
        this.inAppWebView = null;
    }
}
