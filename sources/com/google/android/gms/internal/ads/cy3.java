package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class cy3 {

    /* renamed from: a */
    static final Charset f7981a = Charset.forName("US-ASCII");

    /* renamed from: b */
    static final Charset f7982b = Charset.forName("UTF-8");

    /* renamed from: c */
    static final Charset f7983c = Charset.forName("ISO-8859-1");

    /* renamed from: d */
    public static final byte[] f7984d;

    /* renamed from: e */
    public static final ByteBuffer f7985e;

    /* renamed from: f */
    public static final sw3 f7986f;

    static {
        byte[] bArr = new byte[0];
        f7984d = bArr;
        f7985e = ByteBuffer.wrap(bArr);
        int i = sw3.f17686e;
        f7986f = sw3.m20672h(bArr, 0, 0, false);
    }

    /* renamed from: a */
    public static int m11229a(boolean z) {
        return z ? 1231 : 1237;
    }

    /* renamed from: b */
    public static int m11230b(byte[] bArr) {
        int length = bArr.length;
        int d = m11232d(length, bArr, 0, length);
        if (d == 0) {
            return 1;
        }
        return d;
    }

    /* renamed from: c */
    public static int m11231c(long j) {
        return (int) (j ^ (j >>> 32));
    }

    /* renamed from: d */
    static int m11232d(int i, byte[] bArr, int i2, int i3) {
        for (int i4 = i2; i4 < i2 + i3; i4++) {
            i = (i * 31) + bArr[i4];
        }
        return i;
    }

    /* renamed from: e */
    static Object m11233e(Object obj) {
        Objects.requireNonNull(obj);
        return obj;
    }

    /* renamed from: f */
    static Object m11234f(Object obj, String str) {
        Objects.requireNonNull(obj, str);
        return obj;
    }

    /* renamed from: g */
    static Object m11235g(Object obj, Object obj2) {
        return ((cz3) obj).mo9399a().mo8996w((cz3) obj2).mo8995t0();
    }

    /* renamed from: h */
    public static String m11236h(byte[] bArr) {
        return new String(bArr, f7982b);
    }

    /* renamed from: i */
    public static boolean m11237i(byte[] bArr) {
        return d14.m11288i(bArr);
    }
}
