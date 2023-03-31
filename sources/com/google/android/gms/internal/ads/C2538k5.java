package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.k5 */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class C2538k5 implements C2761q5 {

    /* renamed from: a */
    private final do4 f11904a;

    /* renamed from: b */
    private final co4 f11905b;

    /* renamed from: c */
    private long f11906c = -1;

    /* renamed from: d */
    private long f11907d = -1;

    public C2538k5(do4 do4, co4 co4) {
        this.f11904a = do4;
        this.f11905b = co4;
    }

    /* renamed from: V */
    public final void mo11320V(long j) {
        long[] jArr = this.f11905b.f7855a;
        this.f11907d = jArr[gb2.m13144N(jArr, j, true, true)];
    }

    /* renamed from: a */
    public final C2643n mo11321a() {
        v91.m22052f(this.f11906c != -1);
        return new bo4(this.f11904a, this.f11906c);
    }

    /* renamed from: b */
    public final long mo11322b(rn4 rn4) {
        long j = this.f11907d;
        if (j < 0) {
            return -1;
        }
        this.f11907d = -1;
        return -(j + 2);
    }

    /* renamed from: c */
    public final void mo11567c(long j) {
        this.f11906c = j;
    }
}
