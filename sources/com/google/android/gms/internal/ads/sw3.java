package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.InputStream;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public abstract class sw3 {

    /* renamed from: d */
    private static volatile int f17685d = 100;

    /* renamed from: e */
    public static final /* synthetic */ int f17686e = 0;

    /* renamed from: a */
    int f17687a;

    /* renamed from: b */
    final int f17688b = f17685d;

    /* renamed from: c */
    tw3 f17689c;

    /* synthetic */ sw3(rw3 rw3) {
    }

    /* renamed from: e */
    public static int m20669e(int i) {
        return (-(i & 1)) ^ (i >>> 1);
    }

    /* renamed from: f */
    public static long m20670f(long j) {
        return (-(j & 1)) ^ (j >>> 1);
    }

    /* renamed from: g */
    public static sw3 m20671g(InputStream inputStream, int i) {
        return new qw3(inputStream, 4096, (pw3) null);
    }

    /* renamed from: h */
    static sw3 m20672h(byte[] bArr, int i, int i2, boolean z) {
        lw3 lw3 = new lw3(bArr, i, i2, z, (kw3) null);
        try {
            lw3.mo12192l(i2);
            return lw3;
        } catch (ey3 e) {
            throw new IllegalArgumentException(e);
        }
    }

    /* renamed from: A */
    public abstract String mo12176A() throws IOException;

    /* renamed from: B */
    public abstract void mo12177B(int i) throws ey3;

    /* renamed from: a */
    public abstract void mo12185a(int i);

    /* renamed from: b */
    public abstract boolean mo12186b() throws IOException;

    /* renamed from: c */
    public abstract boolean mo12187c() throws IOException;

    /* renamed from: d */
    public abstract boolean mo12188d(int i) throws IOException;

    /* renamed from: i */
    public abstract double mo12189i() throws IOException;

    /* renamed from: j */
    public abstract float mo12190j() throws IOException;

    /* renamed from: k */
    public abstract int mo12191k();

    /* renamed from: l */
    public abstract int mo12192l(int i) throws ey3;

    /* renamed from: m */
    public abstract int mo12193m() throws IOException;

    /* renamed from: n */
    public abstract int mo12194n() throws IOException;

    /* renamed from: o */
    public abstract int mo12195o() throws IOException;

    /* renamed from: p */
    public abstract int mo12196p() throws IOException;

    /* renamed from: q */
    public abstract int mo12197q() throws IOException;

    /* renamed from: r */
    public abstract int mo12198r() throws IOException;

    /* renamed from: s */
    public abstract int mo12199s() throws IOException;

    /* renamed from: t */
    public abstract long mo12200t() throws IOException;

    /* renamed from: u */
    public abstract long mo12201u() throws IOException;

    /* renamed from: v */
    public abstract long mo12202v() throws IOException;

    /* renamed from: w */
    public abstract long mo12203w() throws IOException;

    /* renamed from: x */
    public abstract long mo12204x() throws IOException;

    /* renamed from: y */
    public abstract jw3 mo12205y() throws IOException;

    /* renamed from: z */
    public abstract String mo12206z() throws IOException;
}
