package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.ro */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class C2817ro extends C2254cj {

    /* renamed from: d */
    private static final Object f17029d = new Object();

    /* renamed from: b */
    private final long f17030b;

    /* renamed from: c */
    private final long f17031c;

    public C2817ro(long j, boolean z) {
        this.f17030b = j;
        this.f17031c = j;
    }

    /* renamed from: a */
    public final int mo9181a(Object obj) {
        return f17029d.equals(obj) ? 0 : -1;
    }

    /* renamed from: b */
    public final int mo9182b() {
        return 1;
    }

    /* renamed from: c */
    public final int mo9183c() {
        return 1;
    }

    /* renamed from: d */
    public final C2180aj mo9184d(int i, C2180aj ajVar, boolean z) {
        C2335eq.m12241a(i, 0, 1);
        Object obj = z ? f17029d : null;
        long j = this.f17030b;
        ajVar.f6591a = obj;
        ajVar.f6592b = obj;
        ajVar.f6593c = j;
        return ajVar;
    }

    /* renamed from: e */
    public final C2217bj mo9185e(int i, C2217bj bjVar, boolean z, long j) {
        C2335eq.m12241a(i, 0, 1);
        bjVar.f7309a = this.f17031c;
        return bjVar;
    }
}
