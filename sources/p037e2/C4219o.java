package p037e2;

import java.io.EOFException;
import java.io.IOException;
import p177z1.C6249m2;

/* renamed from: e2.o */
/* compiled from: ExtractorUtil */
public final class C4219o {
    /* renamed from: a */
    public static void m28480a(boolean z, String str) throws C6249m2 {
        if (!z) {
            throw C6249m2.m36661a(str, (Throwable) null);
        }
    }

    /* renamed from: b */
    public static boolean m28481b(C4216m mVar, byte[] bArr, int i, int i2, boolean z) throws IOException {
        try {
            return mVar.mo17556e(bArr, i, i2, z);
        } catch (EOFException e) {
            if (z) {
                return false;
            }
            throw e;
        }
    }

    /* renamed from: c */
    public static int m28482c(C4216m mVar, byte[] bArr, int i, int i2) throws IOException {
        int i3 = 0;
        while (i3 < i2) {
            int h = mVar.mo17559h(bArr, i + i3, i2 - i3);
            if (h == -1) {
                break;
            }
            i3 += h;
        }
        return i3;
    }

    /* renamed from: d */
    public static boolean m28483d(C4216m mVar, byte[] bArr, int i, int i2) throws IOException {
        try {
            mVar.readFully(bArr, i, i2);
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }

    /* renamed from: e */
    public static boolean m28484e(C4216m mVar, int i) throws IOException {
        try {
            mVar.mo17561k(i);
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }
}
