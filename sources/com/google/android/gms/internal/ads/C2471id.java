package com.google.android.gms.internal.ads;

import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Vector;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import p060h4.C4596v;

/* renamed from: com.google.android.gms.internal.ads.id */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class C2471id {

    /* renamed from: a */
    static boolean f10742a = false;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public static MessageDigest f10743b;

    /* renamed from: c */
    private static final Object f10744c = new Object();

    /* renamed from: d */
    private static final Object f10745d = new Object();

    /* renamed from: e */
    static final CountDownLatch f10746e = new CountDownLatch(1);

    /* renamed from: a */
    static String m14268a(C2730pc pcVar, String str) throws GeneralSecurityException, UnsupportedEncodingException {
        byte[] bArr;
        byte[] b = pcVar.mo9400b();
        if (((Boolean) C4596v.m30088c().mo12227b(C2679nz.f14720w2)).booleanValue()) {
            Vector b2 = m14269b(b, 255);
            if (b2 == null || b2.size() == 0) {
                bArr = m14274g(m14273f(4096).mo9400b(), str, true);
            } else {
                C2211bd G = C2248cd.m10847G();
                int size = b2.size();
                for (int i = 0; i < size; i++) {
                    G.mo8746p(jw3.m15086K(m14274g((byte[]) b2.get(i), str, false)));
                }
                G.mo8747r(jw3.m15086K(m14272e(b)));
                bArr = ((C2248cd) G.mo13423m()).mo9400b();
            }
        } else if (C3030xf.f20082a != null) {
            byte[] a = C3030xf.f20082a.mo12040a(b, str != null ? str.getBytes() : new byte[0]);
            C2211bd G2 = C2248cd.m10847G();
            G2.mo8746p(jw3.m15086K(a));
            G2.mo8748s(3);
            bArr = ((C2248cd) G2.mo13423m()).mo9400b();
        } else {
            throw new GeneralSecurityException();
        }
        return C2322ed.m12035a(bArr, true);
    }

    /* renamed from: b */
    static Vector m14269b(byte[] bArr, int i) {
        int length;
        if (bArr == null || (length = bArr.length) <= 0) {
            return null;
        }
        int i2 = (length + 254) / 255;
        Vector vector = new Vector();
        int i3 = 0;
        while (i3 < i2) {
            int i4 = i3 * 255;
            try {
                int length2 = bArr.length;
                if (length2 - i4 > 255) {
                    length2 = i4 + 255;
                }
                vector.add(Arrays.copyOfRange(bArr, i4, length2));
                i3++;
            } catch (IndexOutOfBoundsException unused) {
                return null;
            }
        }
        return vector;
    }

    /* renamed from: d */
    static void m14271d() {
        synchronized (f10745d) {
            if (!f10742a) {
                f10742a = true;
                new Thread(new C2434hd((C2397gd) null)).start();
            }
        }
    }

    /* renamed from: e */
    public static byte[] m14272e(byte[] bArr) throws NoSuchAlgorithmException {
        byte[] digest;
        synchronized (f10744c) {
            m14271d();
            MessageDigest messageDigest = null;
            try {
                if (f10746e.await(2, TimeUnit.SECONDS)) {
                    MessageDigest messageDigest2 = f10743b;
                    if (messageDigest2 != null) {
                        messageDigest = messageDigest2;
                    }
                }
            } catch (InterruptedException unused) {
            }
            if (messageDigest != null) {
                messageDigest.reset();
                messageDigest.update(bArr);
                digest = f10743b.digest();
            } else {
                throw new NoSuchAlgorithmException("Cannot compute hash");
            }
        }
        return digest;
    }

    /* renamed from: f */
    static C2730pc m14273f(int i) {
        C3063yb g0 = C2730pc.m18499g0();
        g0.mo15406u(4096);
        return (C2730pc) g0.mo13423m();
    }

    /* renamed from: g */
    private static byte[] m14274g(byte[] bArr, String str, boolean z) throws NoSuchAlgorithmException, UnsupportedEncodingException {
        byte[] bArr2;
        int i = true != z ? 255 : 239;
        if (bArr.length > i) {
            bArr = m14273f(4096).mo9400b();
        }
        int length = bArr.length;
        if (length < i) {
            byte[] bArr3 = new byte[(i - length)];
            new SecureRandom().nextBytes(bArr3);
            bArr2 = ByteBuffer.allocate(i + 1).put((byte) length).put(bArr).put(bArr3).array();
        } else {
            bArr2 = ByteBuffer.allocate(i + 1).put((byte) length).put(bArr).array();
        }
        if (z) {
            bArr2 = ByteBuffer.allocate(256).put(m14272e(bArr2)).put(bArr2).array();
        }
        byte[] bArr4 = new byte[256];
        C2509jd[] jdVarArr = new C2510je().f11358G2;
        int length2 = jdVarArr.length;
        for (int i2 = 0; i2 < 12; i2++) {
            jdVarArr[i2].mo8317a(bArr2, bArr4);
        }
        if (str != null && str.length() > 0) {
            if (str.length() > 32) {
                str = str.substring(0, 32);
            }
            new qv3(str.getBytes("UTF-8")).mo13607a(bArr4);
        }
        return bArr4;
    }
}
