package com.google.android.gms.internal.ads;

import android.util.SparseBooleanArray;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class gm4 {

    /* renamed from: a */
    private final SparseBooleanArray f10004a = new SparseBooleanArray();

    /* renamed from: b */
    private boolean f10005b;

    /* renamed from: a */
    public final gm4 mo10579a(int i) {
        v91.m22052f(!this.f10005b);
        this.f10004a.append(i, true);
        return this;
    }

    /* renamed from: b */
    public final C2197b mo10580b() {
        v91.m22052f(!this.f10005b);
        this.f10005b = true;
        return new C2197b(this.f10004a, (hn4) null);
    }
}
