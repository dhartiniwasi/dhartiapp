package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.OutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public abstract class zw3 extends yv3 {

    /* renamed from: b */
    private static final Logger f21503b = Logger.getLogger(zw3.class.getName());
    /* access modifiers changed from: private */

    /* renamed from: c */
    public static final boolean f21504c = y04.m23651a();

    /* renamed from: a */
    ax3 f21505a;

    private zw3() {
    }

    /* synthetic */ zw3(yw3 yw3) {
    }

    /* renamed from: E */
    public static int m24861E(jw3 jw3) {
        int q = jw3.mo9361q();
        return m24869f(q) + q;
    }

    @Deprecated
    /* renamed from: F */
    static int m24862F(int i, cz3 cz3, wz3 wz3) {
        int f = m24869f(i << 3);
        int i2 = f + f;
        sv3 sv3 = (sv3) cz3;
        int g = sv3.mo14147g();
        if (g == -1) {
            g = wz3.mo10360b(sv3);
            sv3.mo14148i(g);
        }
        return i2 + g;
    }

    /* renamed from: G */
    public static int m24863G(int i) {
        if (i >= 0) {
            return m24869f(i);
        }
        return 10;
    }

    /* renamed from: H */
    public static int m24864H(hy3 hy3) {
        int a = hy3.mo10969a();
        return m24869f(a) + a;
    }

    /* renamed from: b */
    static int m24865b(cz3 cz3, wz3 wz3) {
        sv3 sv3 = (sv3) cz3;
        int g = sv3.mo14147g();
        if (g == -1) {
            g = wz3.mo10360b(sv3);
            sv3.mo14148i(g);
        }
        return m24869f(g) + g;
    }

    /* renamed from: c */
    static int m24866c(int i) {
        if (i > 4096) {
            return 4096;
        }
        return i;
    }

    /* renamed from: d */
    public static int m24867d(String str) {
        int i;
        try {
            i = d14.m11284e(str);
        } catch (c14 unused) {
            i = str.getBytes(cy3.f7982b).length;
        }
        return m24869f(i) + i;
    }

    /* renamed from: e */
    public static int m24868e(int i) {
        return m24869f(i << 3);
    }

    /* renamed from: f */
    public static int m24869f(int i) {
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
    public static int m24870g(long j) {
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
    public static zw3 m24871h(byte[] bArr) {
        return new vw3(bArr, 0, bArr.length);
    }

    /* renamed from: i */
    public static zw3 m24872i(OutputStream outputStream, int i) {
        return new xw3(outputStream, i);
    }

    /* renamed from: A */
    public abstract void mo14827A(int i, int i2) throws IOException;

    /* renamed from: B */
    public abstract void mo14828B(int i) throws IOException;

    /* renamed from: C */
    public abstract void mo14829C(int i, long j) throws IOException;

    /* renamed from: D */
    public abstract void mo14830D(long j) throws IOException;

    /* renamed from: a */
    public abstract void mo14833a(byte[] bArr, int i, int i2) throws IOException;

    /* renamed from: j */
    public final void mo15670j() {
        if (mo14637q() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public final void mo15671k(String str, c14 c14) throws IOException {
        f21503b.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", c14);
        byte[] bytes = str.getBytes(cy3.f7982b);
        try {
            int length = bytes.length;
            mo14828B(length);
            mo14833a(bytes, 0, length);
        } catch (IndexOutOfBoundsException e) {
            throw new ww3(e);
        }
    }

    /* renamed from: m */
    public abstract void mo14834m() throws IOException;

    /* renamed from: n */
    public abstract void mo14835n(byte b) throws IOException;

    /* renamed from: o */
    public abstract void mo14836o(int i, boolean z) throws IOException;

    /* renamed from: p */
    public abstract void mo14837p(int i, jw3 jw3) throws IOException;

    /* renamed from: q */
    public abstract int mo14637q();

    /* renamed from: r */
    public abstract void mo14838r(int i, int i2) throws IOException;

    /* renamed from: s */
    public abstract void mo14839s(int i) throws IOException;

    /* renamed from: t */
    public abstract void mo14840t(int i, long j) throws IOException;

    /* renamed from: u */
    public abstract void mo14841u(long j) throws IOException;

    /* renamed from: v */
    public abstract void mo14842v(int i, int i2) throws IOException;

    /* renamed from: w */
    public abstract void mo14843w(int i) throws IOException;

    /* access modifiers changed from: package-private */
    /* renamed from: x */
    public abstract void mo14844x(int i, cz3 cz3, wz3 wz3) throws IOException;

    /* renamed from: y */
    public abstract void mo14845y(int i, String str) throws IOException;

    /* renamed from: z */
    public abstract void mo14846z(int i, int i2) throws IOException;
}
