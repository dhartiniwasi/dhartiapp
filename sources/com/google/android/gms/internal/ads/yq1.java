package com.google.android.gms.internal.ads;

import java.lang.ref.WeakReference;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class yq1 implements e60 {

    /* renamed from: a */
    private final WeakReference f20784a;

    /* renamed from: b */
    private final String f20785b;

    /* renamed from: c */
    private final e60 f20786c;

    /* renamed from: d */
    final /* synthetic */ zq1 f20787d;

    /* synthetic */ yq1(zq1 zq1, WeakReference weakReference, String str, e60 e60, xq1 xq1) {
        this.f20787d = zq1;
        this.f20784a = weakReference;
        this.f20785b = str;
        this.f20786c = e60;
    }

    /* renamed from: a */
    public final void mo8220a(Object obj, Map map) {
        Object obj2 = this.f20784a.get();
        if (obj2 == null) {
            this.f20787d.mo15649k(this.f20785b, this);
        } else {
            this.f20786c.mo8220a(obj2, map);
        }
    }
}
