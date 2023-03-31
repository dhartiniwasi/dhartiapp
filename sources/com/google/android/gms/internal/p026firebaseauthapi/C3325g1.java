package com.google.android.gms.internal.p026firebaseauthapi;

import java.io.IOException;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Locale;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.g1 */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public abstract class C3325g1 implements Iterable, Serializable {

    /* renamed from: b */
    public static final C3325g1 f22056b = new C3193c1(C3623p2.f22498d);

    /* renamed from: c */
    private static final Comparator f22057c = new C3883x0();

    /* renamed from: d */
    private static final C3292f1 f22058d = new C3292f1((C3259e1) null);

    /* renamed from: a */
    private int f22059a = 0;

    static {
        int i = C3687r0.f22598a;
    }

    C3325g1() {
    }

    /* renamed from: s */
    static int m25612s(int i, int i2, int i3) {
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

    /* renamed from: u */
    public static C3325g1 m25613u(byte[] bArr) {
        return m25614v(bArr, 0, bArr.length);
    }

    /* renamed from: v */
    public static C3325g1 m25614v(byte[] bArr, int i, int i2) {
        m25612s(i, i + i2, bArr.length);
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, i, bArr2, 0, i2);
        return new C3193c1(bArr2);
    }

    /* renamed from: w */
    public static C3325g1 m25615w(String str) {
        return new C3193c1(str.getBytes(C3623p2.f22496b));
    }

    /* renamed from: x */
    static C3325g1 m25616x(byte[] bArr) {
        return new C3193c1(bArr);
    }

    /* renamed from: A */
    public final byte[] mo16051A() {
        int f = mo15875f();
        if (f == 0) {
            return C3623p2.f22498d;
        }
        byte[] bArr = new byte[f];
        mo15876i(bArr, 0, 0, f);
        return bArr;
    }

    /* renamed from: b */
    public abstract byte mo15872b(int i);

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public abstract byte mo15873c(int i);

    public abstract boolean equals(Object obj);

    /* renamed from: f */
    public abstract int mo15875f();

    public final int hashCode() {
        int i = this.f22059a;
        if (i == 0) {
            int f = mo15875f();
            i = mo15877j(f, 0, f);
            if (i == 0) {
                i = 1;
            }
            this.f22059a = i;
        }
        return i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public abstract void mo15876i(byte[] bArr, int i, int i2, int i3);

    public final /* synthetic */ Iterator iterator() {
        return new C3851w0(this);
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public abstract int mo15877j(int i, int i2, int i3);

    /* renamed from: k */
    public abstract C3325g1 mo15878k(int i, int i2);

    /* renamed from: l */
    public abstract C3457k1 mo15879l();

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public abstract String mo15880o(Charset charset);

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public abstract void mo15881q(C3819v0 v0Var) throws IOException;

    /* renamed from: r */
    public abstract boolean mo15882r();

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public final int mo16054t() {
        return this.f22059a;
    }

    public final String toString() {
        Locale locale = Locale.ROOT;
        Object[] objArr = new Object[3];
        objArr[0] = Integer.toHexString(System.identityHashCode(this));
        objArr[1] = Integer.valueOf(mo15875f());
        objArr[2] = mo15875f() <= 50 ? C3658q4.m26542a(this) : C3658q4.m26542a(mo15878k(0, 47)).concat("...");
        return String.format(locale, "<ByteString@%s size=%d contents=\"%s\">", objArr);
    }

    /* renamed from: y */
    public final String mo16056y(Charset charset) {
        return mo15875f() == 0 ? "" : mo15880o(charset);
    }

    /* renamed from: z */
    public final boolean mo16057z() {
        return mo15875f() == 0;
    }
}
