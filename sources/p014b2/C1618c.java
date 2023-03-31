package p014b2;

import com.facebook.ads.AdError;
import java.nio.ByteBuffer;
import p030d2.C4035m;
import p161w3.C5918a0;
import p161w3.C5980z;
import p177z1.C6272r1;

/* renamed from: b2.c */
/* compiled from: Ac4Util */
public final class C1618c {

    /* renamed from: a */
    private static final int[] f4642a = {AdError.CACHE_ERROR_CODE, AdError.SERVER_ERROR_CODE, 1920, 1601, 1600, AdError.NO_FILL_ERROR_CODE, AdError.NETWORK_ERROR_CODE, 960, 800, 800, 480, 400, 400, 2048};

    /* renamed from: b2.c$b */
    /* compiled from: Ac4Util */
    public static final class C1620b {

        /* renamed from: a */
        public final int f4643a;

        /* renamed from: b */
        public final int f4644b;

        /* renamed from: c */
        public final int f4645c;

        /* renamed from: d */
        public final int f4646d;

        /* renamed from: e */
        public final int f4647e;

        private C1620b(int i, int i2, int i3, int i4, int i5) {
            this.f4643a = i;
            this.f4645c = i2;
            this.f4644b = i3;
            this.f4646d = i4;
            this.f4647e = i5;
        }
    }

    /* renamed from: a */
    public static void m7431a(int i, C5918a0 a0Var) {
        a0Var.mo20542K(7);
        byte[] d = a0Var.mo20551d();
        d[0] = -84;
        d[1] = 64;
        d[2] = -1;
        d[3] = -1;
        d[4] = (byte) ((i >> 16) & 255);
        d[5] = (byte) ((i >> 8) & 255);
        d[6] = (byte) (i & 255);
    }

    /* renamed from: b */
    public static C6272r1 m7432b(C5918a0 a0Var, String str, String str2, C4035m mVar) {
        a0Var.mo20547P(1);
        return new C6272r1.C6274b().mo21505S(str).mo21517e0("audio/ac4").mo21494H(2).mo21518f0(((a0Var.mo20534C() & 32) >> 5) == 1 ? 48000 : 44100).mo21499M(mVar).mo21508V(str2).mo21491E();
    }

    /* renamed from: c */
    public static int m7433c(ByteBuffer byteBuffer) {
        byte[] bArr = new byte[16];
        int position = byteBuffer.position();
        byteBuffer.get(bArr);
        byteBuffer.position(position);
        return m7434d(new C5980z(bArr)).f4647e;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0086, code lost:
        if (r10 != 11) goto L_0x0093;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x008b, code lost:
        if (r10 != 11) goto L_0x0093;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0090, code lost:
        if (r10 != 8) goto L_0x0093;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p014b2.C1618c.C1620b m7434d(p161w3.C5980z r10) {
        /*
            r0 = 16
            int r1 = r10.mo20676h(r0)
            int r0 = r10.mo20676h(r0)
            r2 = 4
            r3 = 65535(0xffff, float:9.1834E-41)
            if (r0 != r3) goto L_0x0018
            r0 = 24
            int r0 = r10.mo20676h(r0)
            r3 = 7
            goto L_0x0019
        L_0x0018:
            r3 = 4
        L_0x0019:
            int r0 = r0 + r3
            r3 = 44097(0xac41, float:6.1793E-41)
            if (r1 != r3) goto L_0x0021
            int r0 = r0 + 2
        L_0x0021:
            r7 = r0
            r0 = 2
            int r1 = r10.mo20676h(r0)
            r3 = 3
            if (r1 != r3) goto L_0x002f
            int r4 = m7436f(r10, r0)
            int r1 = r1 + r4
        L_0x002f:
            r4 = r1
            r1 = 10
            int r1 = r10.mo20676h(r1)
            boolean r5 = r10.mo20675g()
            if (r5 == 0) goto L_0x0045
            int r5 = r10.mo20676h(r3)
            if (r5 <= 0) goto L_0x0045
            r10.mo20686r(r0)
        L_0x0045:
            boolean r5 = r10.mo20675g()
            r6 = 48000(0xbb80, float:6.7262E-41)
            r8 = 44100(0xac44, float:6.1797E-41)
            if (r5 == 0) goto L_0x0055
            r9 = 48000(0xbb80, float:6.7262E-41)
            goto L_0x0058
        L_0x0055:
            r9 = 44100(0xac44, float:6.1797E-41)
        L_0x0058:
            int r10 = r10.mo20676h(r2)
            r5 = 0
            if (r9 != r8) goto L_0x0069
            r8 = 13
            if (r10 != r8) goto L_0x0069
            int[] r0 = f4642a
            r10 = r0[r10]
            r8 = r10
            goto L_0x0099
        L_0x0069:
            if (r9 != r6) goto L_0x0098
            int[] r6 = f4642a
            int r8 = r6.length
            if (r10 >= r8) goto L_0x0098
            r5 = r6[r10]
            int r1 = r1 % 5
            r6 = 8
            r8 = 1
            if (r1 == r8) goto L_0x008e
            r8 = 11
            if (r1 == r0) goto L_0x0089
            if (r1 == r3) goto L_0x008e
            if (r1 == r2) goto L_0x0082
            goto L_0x0093
        L_0x0082:
            if (r10 == r3) goto L_0x0095
            if (r10 == r6) goto L_0x0095
            if (r10 != r8) goto L_0x0093
            goto L_0x0095
        L_0x0089:
            if (r10 == r6) goto L_0x0095
            if (r10 != r8) goto L_0x0093
            goto L_0x0095
        L_0x008e:
            if (r10 == r3) goto L_0x0095
            if (r10 != r6) goto L_0x0093
            goto L_0x0095
        L_0x0093:
            r8 = r5
            goto L_0x0099
        L_0x0095:
            int r5 = r5 + 1
            goto L_0x0093
        L_0x0098:
            r8 = 0
        L_0x0099:
            b2.c$b r10 = new b2.c$b
            r5 = 2
            r0 = 0
            r3 = r10
            r6 = r9
            r9 = r0
            r3.<init>(r4, r5, r6, r7, r8)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: p014b2.C1618c.m7434d(w3.z):b2.c$b");
    }

    /* renamed from: e */
    public static int m7435e(byte[] bArr, int i) {
        int i2 = 7;
        if (bArr.length < 7) {
            return -1;
        }
        byte b = ((bArr[2] & 255) << 8) | (bArr[3] & 255);
        if (b == 65535) {
            b = ((bArr[4] & 255) << 16) | ((bArr[5] & 255) << 8) | (bArr[6] & 255);
        } else {
            i2 = 4;
        }
        if (i == 44097) {
            i2 += 2;
        }
        return b + i2;
    }

    /* renamed from: f */
    private static int m7436f(C5980z zVar, int i) {
        int i2 = 0;
        while (true) {
            int h = i2 + zVar.mo20676h(i);
            if (!zVar.mo20675g()) {
                return h;
            }
            i2 = (h + 1) << i;
        }
    }
}
