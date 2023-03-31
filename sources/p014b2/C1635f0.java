package p014b2;

/* renamed from: b2.f0 */
/* compiled from: MpegAudioUtil */
public final class C1635f0 {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static final String[] f4686a = {"audio/mpeg-L1", "audio/mpeg-L2", "audio/mpeg"};
    /* access modifiers changed from: private */

    /* renamed from: b */
    public static final int[] f4687b = {44100, 48000, 32000};
    /* access modifiers changed from: private */

    /* renamed from: c */
    public static final int[] f4688c = {32000, 64000, 96000, 128000, 160000, 192000, 224000, 256000, 288000, 320000, 352000, 384000, 416000, 448000};
    /* access modifiers changed from: private */

    /* renamed from: d */
    public static final int[] f4689d = {32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000, 176000, 192000, 224000, 256000};
    /* access modifiers changed from: private */

    /* renamed from: e */
    public static final int[] f4690e = {32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000, 384000};
    /* access modifiers changed from: private */

    /* renamed from: f */
    public static final int[] f4691f = {32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000};
    /* access modifiers changed from: private */

    /* renamed from: g */
    public static final int[] f4692g = {8000, 16000, 24000, 32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000};

    /* renamed from: b2.f0$a */
    /* compiled from: MpegAudioUtil */
    public static final class C1636a {

        /* renamed from: a */
        public int f4693a;

        /* renamed from: b */
        public String f4694b;

        /* renamed from: c */
        public int f4695c;

        /* renamed from: d */
        public int f4696d;

        /* renamed from: e */
        public int f4697e;

        /* renamed from: f */
        public int f4698f;

        /* renamed from: g */
        public int f4699g;

        /* renamed from: a */
        public boolean mo6511a(int i) {
            int i2;
            int i3;
            int i4;
            int i5;
            if (!C1635f0.m7527l(i) || (i2 = (i >>> 19) & 3) == 1 || (i3 = (i >>> 17) & 3) == 0 || (i4 = (i >>> 12) & 15) == 0 || i4 == 15 || (i5 = (i >>> 10) & 3) == 3) {
                return false;
            }
            this.f4693a = i2;
            this.f4694b = C1635f0.f4686a[3 - i3];
            int i6 = C1635f0.f4687b[i5];
            this.f4696d = i6;
            int i7 = 2;
            if (i2 == 2) {
                this.f4696d = i6 / 2;
            } else if (i2 == 0) {
                this.f4696d = i6 / 4;
            }
            int i8 = (i >>> 9) & 1;
            this.f4699g = C1635f0.m7526k(i2, i3);
            if (i3 == 3) {
                int i9 = i2 == 3 ? C1635f0.f4688c[i4 - 1] : C1635f0.f4689d[i4 - 1];
                this.f4698f = i9;
                this.f4695c = (((i9 * 12) / this.f4696d) + i8) * 4;
            } else {
                int i10 = 144;
                if (i2 == 3) {
                    int i11 = i3 == 2 ? C1635f0.f4690e[i4 - 1] : C1635f0.f4691f[i4 - 1];
                    this.f4698f = i11;
                    this.f4695c = ((i11 * 144) / this.f4696d) + i8;
                } else {
                    int i12 = C1635f0.f4692g[i4 - 1];
                    this.f4698f = i12;
                    if (i3 == 1) {
                        i10 = 72;
                    }
                    this.f4695c = ((i10 * i12) / this.f4696d) + i8;
                }
            }
            if (((i >> 6) & 3) == 3) {
                i7 = 1;
            }
            this.f4697e = i7;
            return true;
        }
    }

    /* renamed from: j */
    public static int m7525j(int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        if (!m7527l(i) || (i2 = (i >>> 19) & 3) == 1 || (i3 = (i >>> 17) & 3) == 0 || (i4 = (i >>> 12) & 15) == 0 || i4 == 15 || (i5 = (i >>> 10) & 3) == 3) {
            return -1;
        }
        int i7 = f4687b[i5];
        if (i2 == 2) {
            i7 /= 2;
        } else if (i2 == 0) {
            i7 /= 4;
        }
        int i8 = (i >>> 9) & 1;
        if (i3 == 3) {
            return ((((i2 == 3 ? f4688c[i4 - 1] : f4689d[i4 - 1]) * 12) / i7) + i8) * 4;
        }
        if (i2 == 3) {
            i6 = i3 == 2 ? f4690e[i4 - 1] : f4691f[i4 - 1];
        } else {
            i6 = f4692g[i4 - 1];
        }
        int i9 = 144;
        if (i2 == 3) {
            return ((i6 * 144) / i7) + i8;
        }
        if (i3 == 1) {
            i9 = 72;
        }
        return ((i9 * i6) / i7) + i8;
    }

    /* access modifiers changed from: private */
    /* renamed from: k */
    public static int m7526k(int i, int i2) {
        if (i2 == 1) {
            return i == 3 ? 1152 : 576;
        }
        if (i2 == 2) {
            return 1152;
        }
        if (i2 == 3) {
            return 384;
        }
        throw new IllegalArgumentException();
    }

    /* access modifiers changed from: private */
    /* renamed from: l */
    public static boolean m7527l(int i) {
        return (i & -2097152) == -2097152;
    }

    /* renamed from: m */
    public static int m7528m(int i) {
        int i2;
        int i3;
        if (!m7527l(i) || (i2 = (i >>> 19) & 3) == 1 || (i3 = (i >>> 17) & 3) == 0) {
            return -1;
        }
        int i4 = (i >>> 12) & 15;
        int i5 = (i >>> 10) & 3;
        if (i4 == 0 || i4 == 15 || i5 == 3) {
            return -1;
        }
        return m7526k(i2, i3);
    }
}
