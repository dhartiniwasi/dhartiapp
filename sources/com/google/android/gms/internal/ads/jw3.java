package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Locale;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public abstract class jw3 implements Iterable, Serializable {

    /* renamed from: b */
    public static final jw3 f11808b = new fw3(cy3.f7984d);

    /* renamed from: c */
    private static final Comparator f11809c = new aw3();

    /* renamed from: d */
    private static final iw3 f11810d = new iw3((hw3) null);

    /* renamed from: a */
    private int f11811a = 0;

    static {
        int i = uv3.f18751a;
    }

    jw3() {
    }

    /* renamed from: C */
    static int m15083C(int i, int i2, int i3) {
        int i4 = i2 - i;
        if ((i | i2 | i4 | (i3 - i2)) >= 0) {
            return i4;
        }
        if (i < 0) {
            throw new IndexOutOfBoundsException("Beginning index: " + i + " < 0");
        } else if (i2 < i) {
            throw new IndexOutOfBoundsException("Beginning index larger than ending index: " + i + ", " + i2);
        } else {
            throw new IndexOutOfBoundsException("End index: " + i2 + " >= " + i3);
        }
    }

    /* renamed from: G */
    public static gw3 m15084G() {
        return new gw3(128);
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [java.util.Collection, java.lang.Iterable] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: J */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.android.gms.internal.ads.jw3 m15085J(java.lang.Iterable r3) {
        /*
            boolean r0 = r3 instanceof java.util.Collection
            if (r0 != 0) goto L_0x0015
            java.util.Iterator r0 = r3.iterator()
            r1 = 0
        L_0x0009:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x0019
            r0.next()
            int r1 = r1 + 1
            goto L_0x0009
        L_0x0015:
            int r1 = r3.size()
        L_0x0019:
            if (r1 != 0) goto L_0x001e
            com.google.android.gms.internal.ads.jw3 r3 = f11808b
            return r3
        L_0x001e:
            java.util.Iterator r3 = r3.iterator()
            com.google.android.gms.internal.ads.jw3 r3 = m15092o(r3, r1)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.jw3.m15085J(java.lang.Iterable):com.google.android.gms.internal.ads.jw3");
    }

    /* renamed from: K */
    public static jw3 m15086K(byte[] bArr) {
        return m15087L(bArr, 0, bArr.length);
    }

    /* renamed from: L */
    public static jw3 m15087L(byte[] bArr, int i, int i2) {
        m15083C(i, i + i2, bArr.length);
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, i, bArr2, 0, i2);
        return new fw3(bArr2);
    }

    /* renamed from: M */
    public static jw3 m15088M(String str) {
        return new fw3(str.getBytes(cy3.f7982b));
    }

    /* renamed from: N */
    public static jw3 m15089N(InputStream inputStream) throws IOException {
        jw3 jw3;
        ArrayList arrayList = new ArrayList();
        int i = 256;
        while (true) {
            byte[] bArr = new byte[i];
            int i2 = 0;
            while (i2 < i) {
                int read = inputStream.read(bArr, i2, i - i2);
                if (read == -1) {
                    break;
                }
                i2 += read;
            }
            if (i2 == 0) {
                jw3 = null;
            } else {
                jw3 = m15087L(bArr, 0, i2);
            }
            if (jw3 == null) {
                return m15085J(arrayList);
            }
            arrayList.add(jw3);
            i = Math.min(i + i, 8192);
        }
    }

    /* renamed from: O */
    static jw3 m15090O(byte[] bArr) {
        return new fw3(bArr);
    }

    /* renamed from: c */
    static void m15091c(int i, int i2) {
        if (((i2 - (i + 1)) | i) >= 0) {
            return;
        }
        if (i < 0) {
            throw new ArrayIndexOutOfBoundsException("Index < 0: " + i);
        }
        throw new ArrayIndexOutOfBoundsException("Index > length: " + i + ", " + i2);
    }

    /* renamed from: o */
    private static jw3 m15092o(Iterator it, int i) {
        if (i <= 0) {
            throw new IllegalArgumentException(String.format("length (%s) must be >= 1", new Object[]{Integer.valueOf(i)}));
        } else if (i == 1) {
            return (jw3) it.next();
        } else {
            int i2 = i >>> 1;
            jw3 o = m15092o(it, i2);
            jw3 o2 = m15092o(it, i - i2);
            if (Integer.MAX_VALUE - o.mo9361q() >= o2.mo9361q()) {
                return vz3.m22498R(o, o2);
            }
            int q = o.mo9361q();
            int q2 = o2.mo9361q();
            throw new IllegalArgumentException("ByteString would be too long: " + q + "+" + q2);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: A */
    public abstract void mo10318A(yv3 yv3) throws IOException;

    /* renamed from: B */
    public abstract boolean mo10319B();

    /* access modifiers changed from: protected */
    /* renamed from: D */
    public final int mo11524D() {
        return this.f11811a;
    }

    /* renamed from: E */
    public dw3 iterator() {
        return new zv3(this);
    }

    /* renamed from: b */
    public final String mo11526b(Charset charset) {
        return mo9361q() == 0 ? "" : mo10325y(charset);
    }

    public abstract boolean equals(Object obj);

    @Deprecated
    /* renamed from: f */
    public final void mo11527f(byte[] bArr, int i, int i2, int i3) {
        m15083C(0, i3, mo9361q());
        m15083C(i2, i2 + i3, bArr.length);
        if (i3 > 0) {
            mo9362r(bArr, 0, i2, i3);
        }
    }

    public final int hashCode() {
        int i = this.f11811a;
        if (i == 0) {
            int q = mo9361q();
            i = mo10321u(q, 0, q);
            if (i == 0) {
                i = 1;
            }
            this.f11811a = i;
        }
        return i;
    }

    /* renamed from: i */
    public final boolean mo11529i() {
        return mo9361q() == 0;
    }

    /* renamed from: j */
    public final byte[] mo11531j() {
        int q = mo9361q();
        if (q == 0) {
            return cy3.f7984d;
        }
        byte[] bArr = new byte[q];
        mo9362r(bArr, 0, 0, q);
        return bArr;
    }

    /* renamed from: k */
    public abstract byte mo9359k(int i);

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public abstract byte mo9360l(int i);

    /* renamed from: q */
    public abstract int mo9361q();

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public abstract void mo9362r(byte[] bArr, int i, int i2, int i3);

    /* access modifiers changed from: protected */
    /* renamed from: s */
    public abstract int mo10024s();

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public abstract boolean mo10025t();

    public final String toString() {
        Locale locale = Locale.ROOT;
        Object[] objArr = new Object[3];
        objArr[0] = Integer.toHexString(System.identityHashCode(this));
        objArr[1] = Integer.valueOf(mo9361q());
        objArr[2] = mo9361q() <= 50 ? l04.m15765a(this) : l04.m15765a(mo10323w(0, 47)).concat("...");
        return String.format(locale, "<ByteString@%s size=%d contents=\"%s\">", objArr);
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public abstract int mo10321u(int i, int i2, int i3);

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public abstract int mo10322v(int i, int i2, int i3);

    /* renamed from: w */
    public abstract jw3 mo10323w(int i, int i2);

    /* renamed from: x */
    public abstract sw3 mo10324x();

    /* access modifiers changed from: protected */
    /* renamed from: y */
    public abstract String mo10325y(Charset charset);

    /* renamed from: z */
    public abstract ByteBuffer mo10326z();
}
