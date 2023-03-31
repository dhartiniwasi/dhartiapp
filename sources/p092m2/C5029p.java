package p092m2;

import p037e2.C4200e0;
import p161w3.C5917a;
import p161w3.C5961r;

/* renamed from: m2.p */
/* compiled from: TrackEncryptionBox */
public final class C5029p {

    /* renamed from: a */
    public final boolean f26350a;

    /* renamed from: b */
    public final String f26351b;

    /* renamed from: c */
    public final C4200e0.C4201a f26352c;

    /* renamed from: d */
    public final int f26353d;

    /* renamed from: e */
    public final byte[] f26354e;

    public C5029p(boolean z, String str, int i, byte[] bArr, int i2, int i3, byte[] bArr2) {
        boolean z2 = true;
        C5917a.m34868a((bArr2 != null ? false : z2) ^ (i == 0));
        this.f26350a = z;
        this.f26351b = str;
        this.f26353d = i;
        this.f26354e = bArr2;
        this.f26352c = new C4200e0.C4201a(m31730a(str), bArr, i2, i3);
    }

    /* renamed from: a */
    private static int m31730a(String str) {
        if (str == null) {
            return 1;
        }
        char c = 65535;
        switch (str.hashCode()) {
            case 3046605:
                if (str.equals("cbc1")) {
                    c = 0;
                    break;
                }
                break;
            case 3046671:
                if (str.equals("cbcs")) {
                    c = 1;
                    break;
                }
                break;
            case 3049879:
                if (str.equals("cenc")) {
                    c = 2;
                    break;
                }
                break;
            case 3049895:
                if (str.equals("cens")) {
                    c = 3;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
            case 1:
                return 2;
            case 2:
            case 3:
                break;
            default:
                C5961r.m35215i("TrackEncryptionBox", "Unsupported protection scheme type '" + str + "'. Assuming AES-CTR crypto mode.");
                break;
        }
        return 1;
    }
}
