package com.google.android.gms.internal.measurement;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Objects;

/* renamed from: com.google.android.gms.internal.measurement.o9 */
/* compiled from: com.google.android.gms:play-services-measurement-base@@21.2.0 */
public final class C7107o9 {

    /* renamed from: a */
    static final Charset f31925a = Charset.forName("US-ASCII");

    /* renamed from: b */
    static final Charset f31926b = Charset.forName("UTF-8");

    /* renamed from: c */
    static final Charset f31927c = Charset.forName("ISO-8859-1");

    /* renamed from: d */
    public static final byte[] f31928d;

    /* renamed from: e */
    public static final ByteBuffer f31929e;

    /* renamed from: f */
    public static final C7042k8 f31930f;

    static {
        byte[] bArr = new byte[0];
        f31928d = bArr;
        f31929e = ByteBuffer.wrap(bArr);
        int i = C7042k8.f31792a;
        C7010i8 i8Var = new C7010i8(bArr, 0, 0, false, (C6994h8) null);
        try {
            i8Var.mo23525c(0);
            f31930f = i8Var;
        } catch (C7139q9 e) {
            throw new IllegalArgumentException(e);
        }
    }

    /* renamed from: a */
    public static int m40528a(boolean z) {
        return z ? 1231 : 1237;
    }

    /* renamed from: b */
    public static int m40529b(byte[] bArr) {
        int length = bArr.length;
        int d = m40531d(length, bArr, 0, length);
        if (d == 0) {
            return 1;
        }
        return d;
    }

    /* renamed from: c */
    public static int m40530c(long j) {
        return (int) (j ^ (j >>> 32));
    }

    /* renamed from: d */
    static int m40531d(int i, byte[] bArr, int i2, int i3) {
        for (int i4 = 0; i4 < i3; i4++) {
            i = (i * 31) + bArr[i4];
        }
        return i;
    }

    /* renamed from: e */
    static Object m40532e(Object obj) {
        Objects.requireNonNull(obj);
        return obj;
    }

    /* renamed from: f */
    static Object m40533f(Object obj, String str) {
        Objects.requireNonNull(obj, str);
        return obj;
    }

    /* renamed from: g */
    public static String m40534g(byte[] bArr) {
        return new String(bArr, f31926b);
    }

    /* renamed from: h */
    public static boolean m40535h(byte[] bArr) {
        return C6981gc.m40079e(bArr);
    }
}
