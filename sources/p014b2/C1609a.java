package p014b2;

import p161w3.C5961r;
import p161w3.C5980z;
import p177z1.C6249m2;

/* renamed from: b2.a */
/* compiled from: AacUtil */
public final class C1609a {

    /* renamed from: a */
    private static final int[] f4612a = {96000, 88200, 64000, 48000, 44100, 32000, 24000, 22050, 16000, 12000, 11025, 8000, 7350};

    /* renamed from: b */
    private static final int[] f4613b = {0, 1, 2, 3, 4, 5, 6, 8, -1, -1, -1, 7, 8, -1, 8, -1};

    /* renamed from: b2.a$b */
    /* compiled from: AacUtil */
    public static final class C1611b {

        /* renamed from: a */
        public final int f4614a;

        /* renamed from: b */
        public final int f4615b;

        /* renamed from: c */
        public final String f4616c;

        private C1611b(int i, int i2, String str) {
            this.f4614a = i;
            this.f4615b = i2;
            this.f4616c = str;
        }
    }

    /* renamed from: a */
    public static byte[] m7401a(int i, int i2) {
        int i3 = 0;
        int i4 = 0;
        int i5 = -1;
        while (true) {
            int[] iArr = f4612a;
            if (i4 >= iArr.length) {
                break;
            }
            if (i == iArr[i4]) {
                i5 = i4;
            }
            i4++;
        }
        int i6 = -1;
        while (true) {
            int[] iArr2 = f4613b;
            if (i3 >= iArr2.length) {
                break;
            }
            if (i2 == iArr2[i3]) {
                i6 = i3;
            }
            i3++;
        }
        if (i != -1 && i6 != -1) {
            return m7402b(2, i5, i6);
        }
        throw new IllegalArgumentException("Invalid sample rate or number of channels: " + i + ", " + i2);
    }

    /* renamed from: b */
    public static byte[] m7402b(int i, int i2, int i3) {
        return new byte[]{(byte) (((i << 3) & 248) | ((i2 >> 1) & 7)), (byte) (((i2 << 7) & 128) | ((i3 << 3) & 120))};
    }

    /* renamed from: c */
    private static int m7403c(C5980z zVar) {
        int h = zVar.mo20676h(5);
        return h == 31 ? zVar.mo20676h(6) + 32 : h;
    }

    /* renamed from: d */
    private static int m7404d(C5980z zVar) throws C6249m2 {
        int h = zVar.mo20676h(4);
        if (h == 15) {
            return zVar.mo20676h(24);
        }
        if (h < 13) {
            return f4612a[h];
        }
        throw C6249m2.m36661a((String) null, (Throwable) null);
    }

    /* renamed from: e */
    public static C1611b m7405e(C5980z zVar, boolean z) throws C6249m2 {
        int c = m7403c(zVar);
        int d = m7404d(zVar);
        int h = zVar.mo20676h(4);
        String str = "mp4a.40." + c;
        if (c == 5 || c == 29) {
            d = m7404d(zVar);
            c = m7403c(zVar);
            if (c == 22) {
                h = zVar.mo20676h(4);
            }
        }
        if (z) {
            if (!(c == 1 || c == 2 || c == 3 || c == 4 || c == 6 || c == 7 || c == 17)) {
                switch (c) {
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                        break;
                    default:
                        throw C6249m2.m36664d("Unsupported audio object type: " + c);
                }
            }
            m7407g(zVar, c, h);
            switch (c) {
                case 17:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                    int h2 = zVar.mo20676h(2);
                    if (h2 == 2 || h2 == 3) {
                        throw C6249m2.m36664d("Unsupported epConfig: " + h2);
                    }
            }
        }
        int i = f4613b[h];
        if (i != -1) {
            return new C1611b(d, i, str);
        }
        throw C6249m2.m36661a((String) null, (Throwable) null);
    }

    /* renamed from: f */
    public static C1611b m7406f(byte[] bArr) throws C6249m2 {
        return m7405e(new C5980z(bArr), false);
    }

    /* renamed from: g */
    private static void m7407g(C5980z zVar, int i, int i2) {
        if (zVar.mo20675g()) {
            C5961r.m35215i("AacUtil", "Unexpected frameLengthFlag = 1");
        }
        if (zVar.mo20675g()) {
            zVar.mo20686r(14);
        }
        boolean g = zVar.mo20675g();
        if (i2 != 0) {
            if (i == 6 || i == 20) {
                zVar.mo20686r(3);
            }
            if (g) {
                if (i == 22) {
                    zVar.mo20686r(16);
                }
                if (i == 17 || i == 19 || i == 20 || i == 23) {
                    zVar.mo20686r(3);
                }
                zVar.mo20686r(1);
                return;
            }
            return;
        }
        throw new UnsupportedOperationException();
    }
}
