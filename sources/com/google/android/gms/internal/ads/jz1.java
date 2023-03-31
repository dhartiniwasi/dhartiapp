package com.google.android.gms.internal.ads;

import android.webkit.CookieManager;
import java.util.concurrent.Callable;
import p060h4.C4596v;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final /* synthetic */ class jz1 implements Callable {

    /* renamed from: a */
    public final /* synthetic */ CookieManager f11851a;

    public /* synthetic */ jz1(CookieManager cookieManager) {
        this.f11851a = cookieManager;
    }

    public final Object call() {
        CookieManager cookieManager = this.f11851a;
        if (cookieManager == null) {
            return "";
        }
        return cookieManager.getCookie((String) C4596v.m30088c().mo12227b(C2679nz.f14313H0));
    }
}
