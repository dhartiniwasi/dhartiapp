package p014b2;

import com.facebook.ads.AdError;
import com.pichillilorenzo.flutter_inappwebview.C8710R;
import java.nio.ByteBuffer;
import java.util.Arrays;
import p030d2.C4035m;
import p161w3.C5980z;
import p177z1.C6272r1;

/* renamed from: b2.c0 */
/* compiled from: DtsUtil */
public final class C1621c0 {

    /* renamed from: a */
    private static final int[] f4648a = {1, 2, 2, 2, 2, 3, 3, 4, 4, 5, 6, 6, 6, 7, 8, 8};

    /* renamed from: b */
    private static final int[] f4649b = {-1, 8000, 16000, 32000, -1, -1, 11025, 22050, 44100, -1, -1, 12000, 24000, 48000, -1, -1};

    /* renamed from: c */
    private static final int[] f4650c = {64, C8710R.styleable.AppCompatTheme_toolbarNavigationButtonStyle, 128, 192, 224, 256, 384, 448, 512, 640, 768, 896, 1024, 1152, 1280, 1536, 1920, 2048, 2304, 2560, 2688, 2816, 2823, 2944, 3072, 3840, 4096, 6144, 7680};

    /* JADX WARNING: Removed duplicated region for block: B:13:0x005f  */
    /* JADX WARNING: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int m7437a(byte[] r7) {
        /*
            r0 = 0
            byte r1 = r7[r0]
            r2 = -2
            r3 = 6
            r4 = 7
            r5 = 1
            r6 = 4
            if (r1 == r2) goto L_0x004a
            r2 = -1
            if (r1 == r2) goto L_0x0032
            r2 = 31
            if (r1 == r2) goto L_0x0021
            r1 = 5
            byte r1 = r7[r1]
            r1 = r1 & 3
            int r1 = r1 << 12
            byte r2 = r7[r3]
            r2 = r2 & 255(0xff, float:3.57E-43)
            int r2 = r2 << r6
            r1 = r1 | r2
            byte r7 = r7[r4]
            goto L_0x0058
        L_0x0021:
            byte r0 = r7[r3]
            r0 = r0 & 3
            int r0 = r0 << 12
            byte r1 = r7[r4]
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r1 = r1 << r6
            r0 = r0 | r1
            r1 = 8
            byte r7 = r7[r1]
            goto L_0x0042
        L_0x0032:
            byte r0 = r7[r4]
            r0 = r0 & 3
            int r0 = r0 << 12
            byte r1 = r7[r3]
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r1 = r1 << r6
            r0 = r0 | r1
            r1 = 9
            byte r7 = r7[r1]
        L_0x0042:
            r7 = r7 & 60
            int r7 = r7 >> 2
            r7 = r7 | r0
            int r7 = r7 + r5
            r0 = 1
            goto L_0x005d
        L_0x004a:
            byte r1 = r7[r6]
            r1 = r1 & 3
            int r1 = r1 << 12
            byte r2 = r7[r4]
            r2 = r2 & 255(0xff, float:3.57E-43)
            int r2 = r2 << r6
            r1 = r1 | r2
            byte r7 = r7[r3]
        L_0x0058:
            r7 = r7 & 240(0xf0, float:3.36E-43)
            int r7 = r7 >> r6
            r7 = r7 | r1
            int r7 = r7 + r5
        L_0x005d:
            if (r0 == 0) goto L_0x0063
            int r7 = r7 * 16
            int r7 = r7 / 14
        L_0x0063:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p014b2.C1621c0.m7437a(byte[]):int");
    }

    /* renamed from: b */
    private static C5980z m7438b(byte[] bArr) {
        if (bArr[0] == Byte.MAX_VALUE) {
            return new C5980z(bArr);
        }
        byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
        if (m7439c(copyOf)) {
            for (int i = 0; i < copyOf.length - 1; i += 2) {
                byte b = copyOf[i];
                int i2 = i + 1;
                copyOf[i] = copyOf[i2];
                copyOf[i2] = b;
            }
        }
        C5980z zVar = new C5980z(copyOf);
        if (copyOf[0] == 31) {
            C5980z zVar2 = new C5980z(copyOf);
            while (zVar2.mo20670b() >= 16) {
                zVar2.mo20686r(2);
                zVar.mo20674f(zVar2.mo20676h(14), 14);
            }
        }
        zVar.mo20682n(copyOf);
        return zVar;
    }

    /* renamed from: c */
    private static boolean m7439c(byte[] bArr) {
        return bArr[0] == -2 || bArr[0] == -1;
    }

    /* renamed from: d */
    public static boolean m7440d(int i) {
        return i == 2147385345 || i == -25230976 || i == 536864768 || i == -14745368;
    }

    /* renamed from: e */
    public static int m7441e(ByteBuffer byteBuffer) {
        byte b;
        int i;
        byte b2;
        int i2;
        byte b3;
        int position = byteBuffer.position();
        byte b4 = byteBuffer.get(position);
        if (b4 != -2) {
            if (b4 == -1) {
                i = (byteBuffer.get(position + 4) & 7) << 4;
                b3 = byteBuffer.get(position + 7);
            } else if (b4 != 31) {
                i2 = (byteBuffer.get(position + 4) & 1) << 6;
                b2 = byteBuffer.get(position + 5);
            } else {
                i = (byteBuffer.get(position + 5) & 7) << 4;
                b3 = byteBuffer.get(position + 6);
            }
            b = b3 & 60;
            return (((b >> 2) | i) + 1) * 32;
        }
        i2 = (byteBuffer.get(position + 5) & 1) << 6;
        b2 = byteBuffer.get(position + 4);
        b = b2 & 252;
        return (((b >> 2) | i) + 1) * 32;
    }

    /* renamed from: f */
    public static int m7442f(byte[] bArr) {
        byte b;
        int i;
        byte b2;
        int i2;
        byte b3;
        byte b4 = bArr[0];
        if (b4 != -2) {
            if (b4 == -1) {
                i = (bArr[4] & 7) << 4;
                b3 = bArr[7];
            } else if (b4 != 31) {
                i2 = (bArr[4] & 1) << 6;
                b2 = bArr[5];
            } else {
                i = (bArr[5] & 7) << 4;
                b3 = bArr[6];
            }
            b = b3 & 60;
            return (((b >> 2) | i) + 1) * 32;
        }
        i2 = (bArr[5] & 1) << 6;
        b2 = bArr[4];
        b = b2 & 252;
        return (((b >> 2) | i) + 1) * 32;
    }

    /* renamed from: g */
    public static C6272r1 m7443g(byte[] bArr, String str, String str2, C4035m mVar) {
        int i;
        C5980z b = m7438b(bArr);
        b.mo20686r(60);
        int i2 = f4648a[b.mo20676h(6)];
        int i3 = f4649b[b.mo20676h(4)];
        int h = b.mo20676h(5);
        int[] iArr = f4650c;
        if (h >= iArr.length) {
            i = -1;
        } else {
            i = (iArr[h] * AdError.NETWORK_ERROR_CODE) / 2;
        }
        b.mo20686r(10);
        return new C6272r1.C6274b().mo21505S(str).mo21517e0("audio/vnd.dts").mo21493G(i).mo21494H(i2 + (b.mo20676h(2) > 0 ? 1 : 0)).mo21518f0(i3).mo21499M(mVar).mo21508V(str2).mo21491E();
    }
}
