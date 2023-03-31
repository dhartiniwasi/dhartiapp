package com.google.android.gms.internal.ads;

import java.util.HashMap;

/* renamed from: com.google.android.gms.internal.ads.nf */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class C2659nf extends C2285dd {

    /* renamed from: b */
    public Long f13987b;

    /* renamed from: c */
    public Boolean f13988c;

    /* renamed from: d */
    public Boolean f13989d;

    public C2659nf(String str) {
        HashMap a = C2285dd.m11462a(str);
        if (a != null) {
            this.f13987b = (Long) a.get(0);
            this.f13988c = (Boolean) a.get(1);
            this.f13989d = (Boolean) a.get(2);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final HashMap mo8324b() {
        HashMap hashMap = new HashMap();
        hashMap.put(0, this.f13987b);
        hashMap.put(1, this.f13988c);
        hashMap.put(2, this.f13989d);
        return hashMap;
    }
}
