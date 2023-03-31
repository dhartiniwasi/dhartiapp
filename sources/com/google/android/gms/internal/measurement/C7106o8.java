package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: com.google.android.gms.internal.measurement.o8 */
/* compiled from: com.google.android.gms:play-services-measurement-base@@21.2.0 */
public abstract class C7106o8 extends C7217v7 {

    /* renamed from: b */
    private static final Logger f31922b = Logger.getLogger(C7106o8.class.getName());
    /* access modifiers changed from: private */

    /* renamed from: c */
    public static final boolean f31923c = C6879ac.m39532C();

    /* renamed from: a */
    C7122p8 f31924a;

    private C7106o8() {
    }

    /* synthetic */ C7106o8(C7090n8 n8Var) {
    }

    /* renamed from: A */
    public static int m40498A(C7171s9 s9Var) {
        int a = s9Var.mo23875a();
        return m40502a(a) + a;
    }

    /* renamed from: B */
    static int m40499B(C7092na naVar, C7268ya yaVar) {
        int f = ((C7121p7) naVar).mo23491f(yaVar);
        return m40502a(f) + f;
    }

    /* renamed from: C */
    public static int m40500C(String str) {
        int i;
        try {
            i = C6981gc.m40077c(str);
        } catch (C6964fc unused) {
            i = str.getBytes(C7107o9.f31926b).length;
        }
        return m40502a(i) + i;
    }

    /* renamed from: D */
    public static int m40501D(int i) {
        return m40502a(i << 3);
    }

    /* renamed from: a */
    public static int m40502a(int i) {
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

    /* renamed from: b */
    public static int m40503b(long j) {
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

    /* renamed from: c */
    public static C7106o8 m40504c(byte[] bArr) {
        return new C7058l8(bArr, 0, bArr.length);
    }

    /* renamed from: x */
    public static int m40506x(C6977g8 g8Var) {
        int f = g8Var.mo23326f();
        return m40502a(f) + f;
    }

    @Deprecated
    /* renamed from: y */
    static int m40507y(int i, C7092na naVar, C7268ya yaVar) {
        int a = m40502a(i << 3);
        return a + a + ((C7121p7) naVar).mo23491f(yaVar);
    }

    /* renamed from: z */
    public static int m40508z(int i) {
        if (i >= 0) {
            return m40502a(i);
        }
        return 10;
    }

    /* renamed from: d */
    public final void mo23725d() {
        if (mo23636g() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final void mo23726e(String str, C6964fc fcVar) throws IOException {
        f31922b.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", fcVar);
        byte[] bytes = str.getBytes(C7107o9.f31926b);
        try {
            int length = bytes.length;
            mo23650u(length);
            mo23646q(bytes, 0, length);
        } catch (IndexOutOfBoundsException e) {
            throw new C7074m8(e);
        }
    }

    /* renamed from: g */
    public abstract int mo23636g();

    /* renamed from: h */
    public abstract void mo23637h(byte b) throws IOException;

    /* renamed from: i */
    public abstract void mo23638i(int i, boolean z) throws IOException;

    /* renamed from: j */
    public abstract void mo23639j(int i, C6977g8 g8Var) throws IOException;

    /* renamed from: k */
    public abstract void mo23640k(int i, int i2) throws IOException;

    /* renamed from: l */
    public abstract void mo23641l(int i) throws IOException;

    /* renamed from: m */
    public abstract void mo23642m(int i, long j) throws IOException;

    /* renamed from: n */
    public abstract void mo23643n(long j) throws IOException;

    /* renamed from: o */
    public abstract void mo23644o(int i, int i2) throws IOException;

    /* renamed from: p */
    public abstract void mo23645p(int i) throws IOException;

    /* renamed from: q */
    public abstract void mo23646q(byte[] bArr, int i, int i2) throws IOException;

    /* renamed from: r */
    public abstract void mo23647r(int i, String str) throws IOException;

    /* renamed from: s */
    public abstract void mo23648s(int i, int i2) throws IOException;

    /* renamed from: t */
    public abstract void mo23649t(int i, int i2) throws IOException;

    /* renamed from: u */
    public abstract void mo23650u(int i) throws IOException;

    /* renamed from: v */
    public abstract void mo23651v(int i, long j) throws IOException;

    /* renamed from: w */
    public abstract void mo23652w(long j) throws IOException;
}
