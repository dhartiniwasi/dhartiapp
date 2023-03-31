package com.unity3d.services.ads.gmascar.utils;

import com.unity3d.scar.adapter.common.C9696c;
import com.unity3d.services.core.webview.WebViewApp;
import com.unity3d.services.core.webview.WebViewEventCategory;

public class GMAEventSender {
    public void send(C9696c cVar, Object... objArr) {
        WebViewApp.getCurrentApp().sendEvent(WebViewEventCategory.GMA, cVar, objArr);
    }
}
