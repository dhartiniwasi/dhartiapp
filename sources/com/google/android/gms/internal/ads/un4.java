package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class un4 {
    /* renamed from: a */
    public static int m21755a(rn4 rn4, byte[] bArr, int i, int i2) throws IOException {
        int i3 = 0;
        while (i3 < i2) {
            int h = rn4.mo9985h(bArr, i + i3, i2 - i3);
            if (h == -1) {
                break;
            }
            i3 += h;
        }
        return i3;
    }

    /* renamed from: b */
    public static void m21756b(boolean z, String str) throws ea0 {
        if (!z) {
            throw ea0.m11990a(str, (Throwable) null);
        }
    }

    /* renamed from: c */
    public static boolean m21757c(rn4 rn4, byte[] bArr, int i, int i2, boolean z) throws IOException {
        try {
            return rn4.mo9986i(bArr, 0, i2, z);
        } catch (EOFException e) {
            if (z) {
                return false;
            }
            throw e;
        }
    }

    /* renamed from: d */
    public static boolean m21758d(rn4 rn4, byte[] bArr, int i, int i2) throws IOException {
        try {
            ((fn4) rn4).mo9984g(bArr, i, i2, false);
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }

    /* renamed from: e */
    public static boolean m21759e(rn4 rn4, int i) throws IOException {
        try {
            ((fn4) rn4).mo10218n(i, false);
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }
}
