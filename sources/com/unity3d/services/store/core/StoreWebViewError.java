package com.unity3d.services.store.core;

import com.unity3d.scar.adapter.common.C9706l;
import com.unity3d.services.core.webview.WebViewEventCategory;

public class StoreWebViewError extends C9706l {
    public StoreWebViewError(Enum<?> enumR, String str, Object... objArr) {
        super(enumR, str, objArr);
    }

    public String getDomain() {
        return WebViewEventCategory.STORE.name();
    }
}
