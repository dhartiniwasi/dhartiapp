package com.google.android.gms.internal.ads;

import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class l44 {

    /* renamed from: a */
    private final List f12653a;

    /* renamed from: b */
    private final List f12654b;

    /* synthetic */ l44(int i, int i2, k44 k44) {
        this.f12653a = y34.m23755c(i);
        this.f12654b = y34.m23755c(i2);
    }

    /* renamed from: a */
    public final l44 mo11896a(o44 o44) {
        this.f12654b.add(o44);
        return this;
    }

    /* renamed from: b */
    public final l44 mo11897b(o44 o44) {
        this.f12653a.add(o44);
        return this;
    }

    /* renamed from: c */
    public final m44 mo11898c() {
        return new m44(this.f12653a, this.f12654b, (k44) null);
    }
}
