package com.unity3d.services.ads.gmascar.handlers;

import com.unity3d.scar.adapter.common.C9697d;
import com.unity3d.scar.adapter.common.C9706l;
import com.unity3d.services.core.webview.WebViewApp;
import com.unity3d.services.core.webview.WebViewEventCategory;

public class WebViewErrorHandler implements C9697d<C9706l> {
    public void handleError(C9706l lVar) {
        WebViewApp.getCurrentApp().sendEvent(WebViewEventCategory.valueOf(lVar.getDomain()), lVar.getErrorCategory(), lVar.getErrorArguments());
    }
}
