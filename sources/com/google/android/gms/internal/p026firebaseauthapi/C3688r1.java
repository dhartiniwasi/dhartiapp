package com.google.android.gms.internal.p026firebaseauthapi;

import java.io.IOException;
import java.io.OutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.r1 */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public abstract class C3688r1 extends C3819v0 {

    /* renamed from: b */
    private static final Logger f22599b = Logger.getLogger(C3688r1.class.getName());
    /* access modifiers changed from: private */

    /* renamed from: c */
    public static final boolean f22600c = C3197c5.m25290C();

    /* renamed from: a */
    C3721s1 f22601a;

    private C3688r1() {
    }

    /* synthetic */ C3688r1(C3655q1 q1Var) {
    }

    /* renamed from: E */
    public static int m26662E(C3325g1 g1Var) {
        int f = g1Var.mo15875f();
        return m26670f(f) + f;
    }

    @Deprecated
    /* renamed from: F */
    static int m26663F(int i, C3591o3 o3Var, C3130a4 a4Var) {
        int f = m26670f(i << 3);
        return f + f + ((C3621p0) o3Var).mo16200b(a4Var);
    }

    /* renamed from: G */
    public static int m26664G(int i) {
        if (i >= 0) {
            return m26670f(i);
        }
        return 10;
    }

    /* renamed from: H */
    public static int m26665H(C3755t2 t2Var) {
        int a = t2Var.mo16791a();
        return m26670f(a) + a;
    }

    /* renamed from: b */
    static int m26666b(C3591o3 o3Var, C3130a4 a4Var) {
        int b = ((C3621p0) o3Var).mo16200b(a4Var);
        return m26670f(b) + b;
    }

    /* renamed from: c */
    static int m26667c(int i) {
        if (i > 4096) {
            return 4096;
        }
        return i;
    }

    /* renamed from: d */
    public static int m26668d(String str) {
        int i;
        try {
            i = C3395i5.m25770c(str);
        } catch (C3362h5 unused) {
            i = str.getBytes(C3623p2.f22496b).length;
        }
        return m26670f(i) + i;
    }

    /* renamed from: e */
    public static int m26669e(int i) {
        return m26670f(i << 3);
    }

    /* renamed from: f */
    public static int m26670f(int i) {
        if ((i & -128) == 0) {
            return 1;
        }
        if ((i & -16384) == 0) {
            return 2;
        }
        if ((-2097152 & i) == 0) {
            return 3;
        }
        return (i & -268435456) == 0 ? 4 : 5;
    }

    /* renamed from: g */
    public static int m26671g(long j) {
        int i;
        if ((-128 & j) == 0) {
            return 1;
        }
        if (j < 0) {
            return 10;
        }
        if ((-34359738368L & j) != 0) {
            j >>>= 28;
            i = 6;
        } else {
            i = 2;
        }
        if ((-2097152 & j) != 0) {
            i += 2;
            j >>>= 14;
        }
        return (j & -16384) != 0 ? i + 1 : i;
    }

    /* renamed from: h */
    public static C3688r1 m26672h(byte[] bArr) {
        return new C3556n1(bArr, 0, bArr.length);
    }

    /* renamed from: i */
    public static C3688r1 m26673i(OutputStream outputStream, int i) {
        return new C3622p1(outputStream, i);
    }

    /* renamed from: A */
    public abstract void mo16433A(int i, int i2) throws IOException;

    /* renamed from: B */
    public abstract void mo16434B(int i) throws IOException;

    /* renamed from: C */
    public abstract void mo16435C(int i, long j) throws IOException;

    /* renamed from: D */
    public abstract void mo16436D(long j) throws IOException;

    /* renamed from: a */
    public abstract void mo16439a(byte[] bArr, int i, int i2) throws IOException;

    /* renamed from: j */
    public final void mo16663j() {
        if (mo16358q() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public final void mo16664k(String str, C3362h5 h5Var) throws IOException {
        f22599b.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", h5Var);
        byte[] bytes = str.getBytes(C3623p2.f22496b);
        try {
            int length = bytes.length;
            mo16434B(length);
            mo16439a(bytes, 0, length);
        } catch (IndexOutOfBoundsException e) {
            throw new C3589o1(e);
        }
    }

    /* renamed from: m */
    public abstract void mo16440m() throws IOException;

    /* renamed from: n */
    public abstract void mo16441n(byte b) throws IOException;

    /* renamed from: o */
    public abstract void mo16442o(int i, boolean z) throws IOException;

    /* renamed from: p */
    public abstract void mo16443p(int i, C3325g1 g1Var) throws IOException;

    /* renamed from: q */
    public abstract int mo16358q();

    /* renamed from: r */
    public abstract void mo16444r(int i, int i2) throws IOException;

    /* renamed from: s */
    public abstract void mo16445s(int i) throws IOException;

    /* renamed from: t */
    public abstract void mo16446t(int i, long j) throws IOException;

    /* renamed from: u */
    public abstract void mo16447u(long j) throws IOException;

    /* renamed from: v */
    public abstract void mo16448v(int i, int i2) throws IOException;

    /* renamed from: w */
    public abstract void mo16449w(int i) throws IOException;

    /* access modifiers changed from: package-private */
    /* renamed from: x */
    public abstract void mo16450x(int i, C3591o3 o3Var, C3130a4 a4Var) throws IOException;

    /* renamed from: y */
    public abstract void mo16451y(int i, String str) throws IOException;

    /* renamed from: z */
    public abstract void mo16452z(int i, int i2) throws IOException;
}
