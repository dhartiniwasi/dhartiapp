package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.cj */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public abstract class C2254cj {

    /* renamed from: a */
    public static final C2254cj f7765a = new C3107zi();

    /* renamed from: a */
    public abstract int mo9181a(Object obj);

    /* renamed from: b */
    public abstract int mo9182b();

    /* renamed from: c */
    public abstract int mo9183c();

    /* renamed from: d */
    public abstract C2180aj mo9184d(int i, C2180aj ajVar, boolean z);

    /* renamed from: e */
    public abstract C2217bj mo9185e(int i, C2217bj bjVar, boolean z, long j);

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0017, code lost:
        if ((mo9183c() - 1) == 0) goto L_0x0020;
     */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo9186f(int r3, com.google.android.gms.internal.ads.C2180aj r4, com.google.android.gms.internal.ads.C2217bj r5, int r6) {
        /*
            r2 = this;
            r0 = 0
            r2.mo9184d(r3, r4, r0)
            r2.mo9187g(r0, r5, r0)
            r4 = 1
            if (r3 != 0) goto L_0x0031
            r3 = -1
            if (r6 == 0) goto L_0x0022
            if (r6 == r4) goto L_0x0020
            r1 = 2
            if (r6 != r1) goto L_0x001a
            int r6 = r2.mo9183c()
            int r6 = r6 + r3
            if (r6 != 0) goto L_0x002a
            goto L_0x0020
        L_0x001a:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            r3.<init>()
            throw r3
        L_0x0020:
            r4 = 0
            goto L_0x002a
        L_0x0022:
            int r6 = r2.mo9183c()
            int r6 = r6 + r3
            if (r6 != 0) goto L_0x002a
            r4 = -1
        L_0x002a:
            if (r4 != r3) goto L_0x002d
            return r3
        L_0x002d:
            r2.mo9187g(r4, r5, r0)
            return r0
        L_0x0031:
            int r3 = r3 + r4
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C2254cj.mo9186f(int, com.google.android.gms.internal.ads.aj, com.google.android.gms.internal.ads.bj, int):int");
    }

    /* renamed from: g */
    public final C2217bj mo9187g(int i, C2217bj bjVar, boolean z) {
        return mo9185e(i, bjVar, false, 0);
    }

    /* renamed from: h */
    public final boolean mo9188h() {
        return mo9183c() == 0;
    }
}
