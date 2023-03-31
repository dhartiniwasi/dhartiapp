package com.google.android.gms.internal.ads;

import android.net.Uri;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class fs0 {

    /* renamed from: o */
    public static final Object f9422o = new Object();

    /* renamed from: p */
    private static final Object f9423p = new Object();

    /* renamed from: q */
    private static final C2453hw f9424q;

    /* renamed from: r */
    public static final za4 f9425r = er0.f8901a;

    /* renamed from: a */
    public Object f9426a = f9422o;

    /* renamed from: b */
    public C2453hw f9427b = f9424q;

    /* renamed from: c */
    public long f9428c;

    /* renamed from: d */
    public long f9429d;

    /* renamed from: e */
    public long f9430e;

    /* renamed from: f */
    public boolean f9431f;

    /* renamed from: g */
    public boolean f9432g;
    @Deprecated

    /* renamed from: h */
    public boolean f9433h;

    /* renamed from: i */
    public C3036xl f9434i;

    /* renamed from: j */
    public boolean f9435j;

    /* renamed from: k */
    public long f9436k;

    /* renamed from: l */
    public long f9437l;

    /* renamed from: m */
    public int f9438m;

    /* renamed from: n */
    public int f9439n;

    static {
        C2541k8 k8Var = new C2541k8();
        k8Var.mo11617a("androidx.media3.common.Timeline");
        k8Var.mo11618b(Uri.EMPTY);
        f9424q = k8Var.mo11619c();
    }

    /* renamed from: a */
    public final fs0 mo10267a(Object obj, C2453hw hwVar, Object obj2, long j, long j2, long j3, boolean z, boolean z2, C3036xl xlVar, long j4, long j5, int i, int i2, long j6) {
        C3036xl xlVar2 = xlVar;
        this.f9426a = obj;
        this.f9427b = hwVar != null ? hwVar : f9424q;
        this.f9428c = -9223372036854775807L;
        this.f9429d = -9223372036854775807L;
        this.f9430e = -9223372036854775807L;
        this.f9431f = z;
        this.f9432g = z2;
        this.f9433h = xlVar2 != null;
        this.f9434i = xlVar2;
        this.f9436k = 0;
        this.f9437l = j5;
        this.f9438m = 0;
        this.f9439n = 0;
        this.f9435j = false;
        return this;
    }

    /* renamed from: b */
    public final boolean mo10268b() {
        v91.m22052f(this.f9433h == (this.f9434i != null));
        return this.f9434i != null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && fs0.class.equals(obj.getClass())) {
            fs0 fs0 = (fs0) obj;
            return gb2.m13186t(this.f9426a, fs0.f9426a) && gb2.m13186t(this.f9427b, fs0.f9427b) && gb2.m13186t((Object) null, (Object) null) && gb2.m13186t(this.f9434i, fs0.f9434i) && this.f9428c == fs0.f9428c && this.f9429d == fs0.f9429d && this.f9430e == fs0.f9430e && this.f9431f == fs0.f9431f && this.f9432g == fs0.f9432g && this.f9435j == fs0.f9435j && this.f9437l == fs0.f9437l && this.f9438m == fs0.f9438m && this.f9439n == fs0.f9439n;
        }
    }

    public final int hashCode() {
        int i;
        int hashCode = (((this.f9426a.hashCode() + 217) * 31) + this.f9427b.hashCode()) * 961;
        C3036xl xlVar = this.f9434i;
        if (xlVar == null) {
            i = 0;
        } else {
            i = xlVar.hashCode();
        }
        long j = this.f9428c;
        long j2 = this.f9429d;
        long j3 = this.f9430e;
        boolean z = this.f9431f;
        boolean z2 = this.f9432g;
        boolean z3 = this.f9435j;
        long j4 = this.f9437l;
        return (((((((((((((((((((hashCode + i) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + ((int) ((j2 >>> 32) ^ j2))) * 31) + ((int) ((j3 >>> 32) ^ j3))) * 31) + (z ? 1 : 0)) * 31) + (z2 ? 1 : 0)) * 31) + (z3 ? 1 : 0)) * 961) + ((int) ((j4 >>> 32) ^ j4))) * 31) + this.f9438m) * 31) + this.f9439n) * 31;
    }
}
