package com.google.android.gms.internal.ads;

import java.util.HashMap;

/* renamed from: com.google.android.gms.internal.ads.qf */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class C2771qf extends C2285dd {

    /* renamed from: b */
    public Long f16355b;

    /* renamed from: c */
    public Long f16356c;

    public C2771qf(String str) {
        HashMap a = C2285dd.m11462a(str);
        if (a != null) {
            this.f16355b = (Long) a.get(0);
            this.f16356c = (Long) a.get(1);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final HashMap mo8324b() {
        HashMap hashMap = new HashMap();
        hashMap.put(0, this.f16355b);
        hashMap.put(1, this.f16356c);
        return hashMap;
    }
}
