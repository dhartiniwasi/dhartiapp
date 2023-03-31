package p120q2;

import android.media.MediaCodec;
import p021c2.C1847f;

/* renamed from: q2.m */
/* compiled from: MediaCodecDecoderException */
public class C5380m extends C1847f {

    /* renamed from: a */
    public final C5381n f27513a;

    /* renamed from: b */
    public final String f27514b;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C5380m(java.lang.Throwable r4, p120q2.C5381n r5) {
        /*
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Decoder failed: "
            r0.append(r1)
            r1 = 0
            if (r5 != 0) goto L_0x000f
            r2 = r1
            goto L_0x0011
        L_0x000f:
            java.lang.String r2 = r5.f27515a
        L_0x0011:
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            r3.<init>(r0, r4)
            r3.f27513a = r5
            int r5 = p161w3.C5953m0.f29110a
            r0 = 21
            if (r5 < r0) goto L_0x0027
            java.lang.String r1 = m32930a(r4)
        L_0x0027:
            r3.f27514b = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p120q2.C5380m.<init>(java.lang.Throwable, q2.n):void");
    }

    /* renamed from: a */
    private static String m32930a(Throwable th) {
        if (th instanceof MediaCodec.CodecException) {
            return ((MediaCodec.CodecException) th).getDiagnosticInfo();
        }
        return null;
    }
}
