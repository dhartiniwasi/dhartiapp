package com.google.android.gms.internal.ads;

import java.util.HashMap;

/* renamed from: com.google.android.gms.internal.ads.cf */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class C2250cf extends C2285dd {

    /* renamed from: b */
    public long f7704b = -1;

    /* renamed from: c */
    public long f7705c = -1;

    public C2250cf(String str) {
        HashMap a = C2285dd.m11462a(str);
        if (a != null) {
            this.f7704b = ((Long) a.get(0)).longValue();
            this.f7705c = ((Long) a.get(1)).longValue();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final HashMap mo8324b() {
        HashMap hashMap = new HashMap();
        hashMap.put(0, Long.valueOf(this.f7704b));
        hashMap.put(1, Long.valueOf(this.f7705c));
        return hashMap;
    }
}
