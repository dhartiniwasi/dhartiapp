package com.google.android.gms.internal.ads;

import android.net.Uri;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class hi4 extends gt0 {

    /* renamed from: h */
    private static final Object f10334h = new Object();

    /* renamed from: i */
    private static final C2453hw f10335i;

    /* renamed from: c */
    private final long f10336c;

    /* renamed from: d */
    private final long f10337d;

    /* renamed from: e */
    private final boolean f10338e;

    /* renamed from: f */
    private final C2453hw f10339f;

    /* renamed from: g */
    private final C3036xl f10340g;

    static {
        C2541k8 k8Var = new C2541k8();
        k8Var.mo11617a("SinglePeriodTimeline");
        k8Var.mo11618b(Uri.EMPTY);
        f10335i = k8Var.mo11619c();
    }

    public hi4(long j, long j2, long j3, long j4, long j5, long j6, long j7, boolean z, boolean z2, boolean z3, Object obj, C2453hw hwVar, C3036xl xlVar) {
        this.f10336c = j4;
        this.f10337d = j5;
        this.f10338e = z;
        this.f10339f = hwVar;
        this.f10340g = xlVar;
    }

    /* renamed from: a */
    public final int mo8899a(Object obj) {
        return f10334h.equals(obj) ? 0 : -1;
    }

    /* renamed from: b */
    public final int mo8900b() {
        return 1;
    }

    /* renamed from: c */
    public final int mo8901c() {
        return 1;
    }

    /* renamed from: d */
    public final dq0 mo8902d(int i, dq0 dq0, boolean z) {
        v91.m22047a(i, 0, 1);
        dq0.mo9662k((Object) null, z ? f10334h : null, 0, this.f10336c, 0, r61.f16847d, false);
        return dq0;
    }

    /* renamed from: e */
    public final fs0 mo8903e(int i, fs0 fs0, long j) {
        v91.m22047a(i, 0, 1);
        fs0.mo10267a(fs0.f9422o, this.f10339f, (Object) null, -9223372036854775807L, -9223372036854775807L, -9223372036854775807L, this.f10338e, false, this.f10340g, 0, this.f10337d, 0, 0, 0);
        return fs0;
    }

    /* renamed from: f */
    public final Object mo8904f(int i) {
        v91.m22047a(i, 0, 1);
        return f10334h;
    }
}
