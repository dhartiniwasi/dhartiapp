package com.unity3d.services.ads.gmascar.handlers;

import com.unity3d.scar.adapter.common.C9696c;
import com.unity3d.services.core.webview.WebViewApp;
import com.unity3d.services.core.webview.WebViewEventCategory;
import p398xa.C12987a;

public class SignalsHandler implements C12987a {
    public void onSignalsCollected(String str) {
        WebViewApp.getCurrentApp().sendEvent(WebViewEventCategory.GMA, C9696c.SIGNALS, str);
    }

    public void onSignalsCollectionFailed(String str) {
        WebViewApp.getCurrentApp().sendEvent(WebViewEventCategory.GMA, C9696c.SIGNALS_ERROR, str);
    }
}
