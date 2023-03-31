package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Locale;

/* renamed from: com.google.android.gms.internal.measurement.g8 */
/* compiled from: com.google.android.gms:play-services-measurement-base@@21.2.0 */
public abstract class C6977g8 implements Iterable, Serializable {

    /* renamed from: b */
    public static final C6977g8 f31702b = new C6926d8(C7107o9.f31928d);

    /* renamed from: c */
    private static final Comparator f31703c = new C7249x7();

    /* renamed from: d */
    private static final C6960f8 f31704d = new C6960f8((C6943e8) null);

    /* renamed from: a */
    private int f31705a = 0;

    static {
        int i = C7153r7.f32009a;
    }

    C6977g8() {
    }

    /* renamed from: q */
    static int m40060q(int i, int i2, int i3) {
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

    /* renamed from: s */
    public static C6977g8 m40061s(byte[] bArr, int i, int i2) {
        m40060q(i, i + i2, bArr.length);
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, i, bArr2, 0, i2);
        return new C6926d8(bArr2);
    }

    /* renamed from: t */
    public static C6977g8 m40062t(String str) {
        return new C6926d8(str.getBytes(C7107o9.f31926b));
    }

    /* renamed from: b */
    public abstract byte mo23323b(int i);

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public abstract byte mo23324c(int i);

    public abstract boolean equals(Object obj);

    /* renamed from: f */
    public abstract int mo23326f();

    public final int hashCode() {
        int i = this.f31705a;
        if (i == 0) {
            int f = mo23326f();
            i = mo23327i(f, 0, f);
            if (i == 0) {
                i = 1;
            }
            this.f31705a = i;
        }
        return i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public abstract int mo23327i(int i, int i2, int i3);

    public final /* synthetic */ Iterator iterator() {
        return new C7233w7(this);
    }

    /* renamed from: j */
    public abstract C6977g8 mo23328j(int i, int i2);

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public abstract String mo23329k(Charset charset);

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public abstract void mo23330l(C7217v7 v7Var) throws IOException;

    /* renamed from: o */
    public abstract boolean mo23331o();

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public final int mo23441r() {
        return this.f31705a;
    }

    public final String toString() {
        Locale locale = Locale.ROOT;
        Object[] objArr = new Object[3];
        objArr[0] = Integer.toHexString(System.identityHashCode(this));
        objArr[1] = Integer.valueOf(mo23326f());
        objArr[2] = mo23326f() <= 50 ? C7109ob.m40537a(this) : C7109ob.m40537a(mo23328j(0, 47)).concat("...");
        return String.format(locale, "<ByteString@%s size=%d contents=\"%s\">", objArr);
    }

    /* renamed from: u */
    public final String mo23443u(Charset charset) {
        return mo23326f() == 0 ? "" : mo23329k(charset);
    }
}
