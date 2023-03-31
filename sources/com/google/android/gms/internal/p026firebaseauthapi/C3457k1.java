package com.google.android.gms.internal.p026firebaseauthapi;

import java.io.IOException;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.k1 */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public abstract class C3457k1 {

    /* renamed from: d */
    private static volatile int f22262d = 100;

    /* renamed from: e */
    public static final /* synthetic */ int f22263e = 0;

    /* renamed from: a */
    int f22264a;

    /* renamed from: b */
    final int f22265b = f22262d;

    /* renamed from: c */
    C3490l1 f22266c;

    /* synthetic */ C3457k1(C3424j1 j1Var) {
    }

    /* renamed from: l */
    public static int m25961l(int i) {
        return (-(i & 1)) ^ (i >>> 1);
    }

    /* renamed from: m */
    public static long m25962m(long j) {
        return (-(j & 1)) ^ (j >>> 1);
    }

    /* renamed from: n */
    static C3457k1 m25963n(byte[] bArr, int i, int i2, boolean z) {
        C3391i1 i1Var = new C3391i1(bArr, 0, i2, z, (C3358h1) null);
        try {
            i1Var.mo16124b(i2);
            return i1Var;
        } catch (C3689r2 e) {
            throw new IllegalArgumentException(e);
        }
    }

    /* renamed from: a */
    public abstract int mo16123a();

    /* renamed from: b */
    public abstract int mo16124b(int i) throws C3689r2;

    /* renamed from: c */
    public abstract int mo16125c() throws IOException;

    /* renamed from: d */
    public abstract C3325g1 mo16126d() throws IOException;

    /* renamed from: e */
    public abstract String mo16127e() throws IOException;

    /* renamed from: f */
    public abstract String mo16128f() throws IOException;

    /* renamed from: g */
    public abstract void mo16129g(int i) throws C3689r2;

    /* renamed from: h */
    public abstract void mo16130h(int i);

    /* renamed from: i */
    public abstract boolean mo16131i() throws IOException;

    /* renamed from: j */
    public abstract boolean mo16132j() throws IOException;

    /* renamed from: k */
    public abstract boolean mo16133k(int i) throws IOException;
}
