package com.google.android.gms.internal.ads;

import android.content.Context;
import android.webkit.CookieManager;
import java.util.concurrent.TimeUnit;
import p053g4.C4409t;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class mz1 implements b44 {

    /* renamed from: a */
    private final o44 f13731a;

    /* renamed from: b */
    private final o44 f13732b;

    public mz1(o44 o44, o44 o442) {
        this.f13731a = o44;
        this.f13732b = o442;
    }

    /* renamed from: d */
    public final /* bridge */ /* synthetic */ Object mo8155d() {
        CookieManager b = C4409t.m29327s().mo18420b((Context) this.f13732b.mo8155d());
        ex2 ex2 = ex2.WEBVIEW_COOKIE;
        return tw2.m21274a(new jz1(b), ex2, (kx2) this.f13731a.mo8155d()).mo8585i(1, TimeUnit.SECONDS).mo8579c(Exception.class, new ww2(kz1.f12531a)).mo8577a();
    }
}
