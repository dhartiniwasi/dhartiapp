package com.google.android.gms.internal.ads;

import android.media.MediaCodec;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public class oe4 extends dm3 {

    /* renamed from: a */
    public final pe4 f15061a;

    /* renamed from: b */
    public final String f15062b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public oe4(Throwable th, pe4 pe4) {
        super("Decoder failed: ".concat(String.valueOf(pe4 == null ? null : pe4.f15824a)), th);
        String str = null;
        this.f15061a = pe4;
        if (gb2.f9812a >= 21 && (th instanceof MediaCodec.CodecException)) {
            str = ((MediaCodec.CodecException) th).getDiagnosticInfo();
        }
        this.f15062b = str;
    }
}
