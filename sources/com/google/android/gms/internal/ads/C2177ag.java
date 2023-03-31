package com.google.android.gms.internal.ads;

import java.util.HashMap;

/* renamed from: com.google.android.gms.internal.ads.ag */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class C2177ag extends C2285dd {

    /* renamed from: b */
    public Long f6541b;

    /* renamed from: c */
    public Long f6542c;

    /* renamed from: d */
    public Long f6543d;

    /* renamed from: e */
    public Long f6544e;

    /* renamed from: f */
    public Long f6545f;

    public C2177ag(String str) {
        HashMap a = C2285dd.m11462a(str);
        if (a != null) {
            this.f6541b = (Long) a.get(0);
            this.f6542c = (Long) a.get(1);
            this.f6543d = (Long) a.get(2);
            this.f6544e = (Long) a.get(3);
            this.f6545f = (Long) a.get(4);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final HashMap mo8324b() {
        HashMap hashMap = new HashMap();
        hashMap.put(0, this.f6541b);
        hashMap.put(1, this.f6542c);
        hashMap.put(2, this.f6543d);
        hashMap.put(3, this.f6544e);
        hashMap.put(4, this.f6545f);
        return hashMap;
    }
}
