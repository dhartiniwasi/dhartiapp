package com.google.android.gms.internal.ads;

import java.util.HashMap;

/* renamed from: com.google.android.gms.internal.ads.xe */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class C3029xe extends C2285dd {

    /* renamed from: b */
    public Long f20075b;

    /* renamed from: c */
    public Long f20076c;

    /* renamed from: d */
    public Long f20077d;

    public C3029xe(String str) {
        HashMap a = C2285dd.m11462a(str);
        if (a != null) {
            this.f20075b = (Long) a.get(0);
            this.f20076c = (Long) a.get(1);
            this.f20077d = (Long) a.get(2);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final HashMap mo8324b() {
        HashMap hashMap = new HashMap();
        hashMap.put(0, this.f20075b);
        hashMap.put(1, this.f20076c);
        hashMap.put(2, this.f20077d);
        return hashMap;
    }
}
