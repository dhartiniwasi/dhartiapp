package p021c2;

import android.media.MediaCodec;
import p161w3.C5917a;
import p161w3.C5953m0;

/* renamed from: c2.c */
/* compiled from: CryptoInfo */
public final class C1842c {

    /* renamed from: a */
    public byte[] f5405a;

    /* renamed from: b */
    public byte[] f5406b;

    /* renamed from: c */
    public int f5407c;

    /* renamed from: d */
    public int[] f5408d;

    /* renamed from: e */
    public int[] f5409e;

    /* renamed from: f */
    public int f5410f;

    /* renamed from: g */
    public int f5411g;

    /* renamed from: h */
    public int f5412h;

    /* renamed from: i */
    private final MediaCodec.CryptoInfo f5413i;

    /* renamed from: j */
    private final C1844b f5414j;

    /* renamed from: c2.c$b */
    /* compiled from: CryptoInfo */
    private static final class C1844b {

        /* renamed from: a */
        private final MediaCodec.CryptoInfo f5415a;

        /* renamed from: b */
        private final MediaCodec.CryptoInfo.Pattern f5416b;

        /* access modifiers changed from: private */
        /* renamed from: b */
        public void m8564b(int i, int i2) {
            this.f5416b.set(i, i2);
            this.f5415a.setPattern(this.f5416b);
        }

        private C1844b(MediaCodec.CryptoInfo cryptoInfo) {
            this.f5415a = cryptoInfo;
            this.f5416b = new MediaCodec.CryptoInfo.Pattern(0, 0);
        }
    }

    public C1842c() {
        MediaCodec.CryptoInfo cryptoInfo = new MediaCodec.CryptoInfo();
        this.f5413i = cryptoInfo;
        this.f5414j = C5953m0.f29110a >= 24 ? new C1844b(cryptoInfo) : null;
    }

    /* renamed from: a */
    public MediaCodec.CryptoInfo mo7038a() {
        return this.f5413i;
    }

    /* renamed from: b */
    public void mo7039b(int i) {
        if (i != 0) {
            if (this.f5408d == null) {
                int[] iArr = new int[1];
                this.f5408d = iArr;
                this.f5413i.numBytesOfClearData = iArr;
            }
            int[] iArr2 = this.f5408d;
            iArr2[0] = iArr2[0] + i;
        }
    }

    /* renamed from: c */
    public void mo7040c(int i, int[] iArr, int[] iArr2, byte[] bArr, byte[] bArr2, int i2, int i3, int i4) {
        this.f5410f = i;
        this.f5408d = iArr;
        this.f5409e = iArr2;
        this.f5406b = bArr;
        this.f5405a = bArr2;
        this.f5407c = i2;
        this.f5411g = i3;
        this.f5412h = i4;
        MediaCodec.CryptoInfo cryptoInfo = this.f5413i;
        cryptoInfo.numSubSamples = i;
        cryptoInfo.numBytesOfClearData = iArr;
        cryptoInfo.numBytesOfEncryptedData = iArr2;
        cryptoInfo.key = bArr;
        cryptoInfo.iv = bArr2;
        cryptoInfo.mode = i2;
        if (C5953m0.f29110a >= 24) {
            ((C1844b) C5917a.m34872e(this.f5414j)).m8564b(i3, i4);
        }
    }
}
