package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class yk0 {

    /* renamed from: j */
    public static final za4 f20652j = xj0.f20115a;

    /* renamed from: a */
    public final Object f20653a;

    /* renamed from: b */
    public final int f20654b;

    /* renamed from: c */
    public final C2453hw f20655c;

    /* renamed from: d */
    public final Object f20656d;

    /* renamed from: e */
    public final int f20657e;

    /* renamed from: f */
    public final long f20658f;

    /* renamed from: g */
    public final long f20659g;

    /* renamed from: h */
    public final int f20660h;

    /* renamed from: i */
    public final int f20661i;

    public yk0(Object obj, int i, C2453hw hwVar, Object obj2, int i2, long j, long j2, int i3, int i4) {
        this.f20653a = obj;
        this.f20654b = i;
        this.f20655c = hwVar;
        this.f20656d = obj2;
        this.f20657e = i2;
        this.f20658f = j;
        this.f20659g = j2;
        this.f20660h = i3;
        this.f20661i = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && yk0.class == obj.getClass()) {
            yk0 yk0 = (yk0) obj;
            return this.f20654b == yk0.f20654b && this.f20657e == yk0.f20657e && this.f20658f == yk0.f20658f && this.f20659g == yk0.f20659g && this.f20660h == yk0.f20660h && this.f20661i == yk0.f20661i && w73.m22614a(this.f20653a, yk0.f20653a) && w73.m22614a(this.f20656d, yk0.f20656d) && w73.m22614a(this.f20655c, yk0.f20655c);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f20653a, Integer.valueOf(this.f20654b), this.f20655c, this.f20656d, Integer.valueOf(this.f20657e), Long.valueOf(this.f20658f), Long.valueOf(this.f20659g), Integer.valueOf(this.f20660h), Integer.valueOf(this.f20661i)});
    }
}
