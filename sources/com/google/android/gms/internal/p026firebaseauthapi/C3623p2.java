package com.google.android.gms.internal.p026firebaseauthapi;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Objects;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.p2 */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C3623p2 {

    /* renamed from: a */
    static final Charset f22495a = Charset.forName("US-ASCII");

    /* renamed from: b */
    static final Charset f22496b = Charset.forName("UTF-8");

    /* renamed from: c */
    static final Charset f22497c = Charset.forName("ISO-8859-1");

    /* renamed from: d */
    public static final byte[] f22498d;

    /* renamed from: e */
    public static final ByteBuffer f22499e;

    /* renamed from: f */
    public static final C3457k1 f22500f;

    static {
        byte[] bArr = new byte[0];
        f22498d = bArr;
        f22499e = ByteBuffer.wrap(bArr);
        int i = C3457k1.f22263e;
        f22500f = C3457k1.m25963n(bArr, 0, 0, false);
    }

    /* renamed from: a */
    public static int m26437a(boolean z) {
        return z ? 1231 : 1237;
    }

    /* renamed from: b */
    public static int m26438b(byte[] bArr) {
        int length = bArr.length;
        int d = m26440d(length, bArr, 0, length);
        if (d == 0) {
            return 1;
        }
        return d;
    }

    /* renamed from: c */
    public static int m26439c(long j) {
        return (int) (j ^ (j >>> 32));
    }

    /* renamed from: d */
    static int m26440d(int i, byte[] bArr, int i2, int i3) {
        for (int i4 = 0; i4 < i3; i4++) {
            i = (i * 31) + bArr[i4];
        }
        return i;
    }

    /* renamed from: e */
    static Object m26441e(Object obj) {
        Objects.requireNonNull(obj);
        return obj;
    }

    /* renamed from: f */
    static Object m26442f(Object obj, String str) {
        Objects.requireNonNull(obj, str);
        return obj;
    }

    /* renamed from: g */
    public static String m26443g(byte[] bArr) {
        return new String(bArr, f22496b);
    }

    /* renamed from: h */
    public static boolean m26444h(byte[] bArr) {
        return C3395i5.m25772e(bArr);
    }
}
