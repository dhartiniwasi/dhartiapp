package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class re4 extends Exception {

    /* renamed from: a */
    public final String f16928a;

    /* renamed from: b */
    public final boolean f16929b;

    /* renamed from: c */
    public final pe4 f16930c;

    /* renamed from: d */
    public final String f16931d;

    /* renamed from: e */
    public final re4 f16932e;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public re4(com.google.android.gms.internal.ads.C2388g4 r11, java.lang.Throwable r12, boolean r13, int r14) {
        /*
            r10 = this;
            java.lang.String r13 = java.lang.String.valueOf(r11)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Decoder init failed: ["
            r0.append(r1)
            r0.append(r14)
            java.lang.String r1 = "], "
            r0.append(r1)
            r0.append(r13)
            java.lang.String r5 = r11.f9673l
            int r11 = java.lang.Math.abs(r14)
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.String r14 = "com.google.android.exoplayer2.mediacodec.MediaCodecRenderer_neg_"
            r13.append(r14)
            r13.append(r11)
            java.lang.String r3 = r0.toString()
            java.lang.String r8 = r13.toString()
            r6 = 0
            r7 = 0
            r9 = 0
            r2 = r10
            r4 = r12
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.re4.<init>(com.google.android.gms.internal.ads.g4, java.lang.Throwable, boolean, int):void");
    }

    /* renamed from: a */
    static /* bridge */ /* synthetic */ re4 m19812a(re4 re4, re4 re42) {
        return new re4(re4.getMessage(), re4.getCause(), re4.f16928a, false, re4.f16930c, re4.f16931d, re42);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public re4(com.google.android.gms.internal.ads.C2388g4 r11, java.lang.Throwable r12, boolean r13, com.google.android.gms.internal.ads.pe4 r14) {
        /*
            r10 = this;
            java.lang.String r13 = r14.f15824a
            java.lang.String r0 = java.lang.String.valueOf(r11)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Decoder init failed: "
            r1.append(r2)
            r1.append(r13)
            java.lang.String r13 = ", "
            r1.append(r13)
            r1.append(r0)
            java.lang.String r3 = r1.toString()
            java.lang.String r5 = r11.f9673l
            int r11 = com.google.android.gms.internal.ads.gb2.f9812a
            r13 = 0
            r0 = 21
            if (r11 < r0) goto L_0x0035
            boolean r11 = r12 instanceof android.media.MediaCodec.CodecException
            if (r11 == 0) goto L_0x0035
            r11 = r12
            android.media.MediaCodec$CodecException r11 = (android.media.MediaCodec.CodecException) r11
            java.lang.String r11 = r11.getDiagnosticInfo()
            r8 = r11
            goto L_0x0036
        L_0x0035:
            r8 = r13
        L_0x0036:
            r6 = 0
            r9 = 0
            r2 = r10
            r4 = r12
            r7 = r14
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.re4.<init>(com.google.android.gms.internal.ads.g4, java.lang.Throwable, boolean, com.google.android.gms.internal.ads.pe4):void");
    }

    private re4(String str, Throwable th, String str2, boolean z, pe4 pe4, String str3, re4 re4) {
        super(str, th);
        this.f16928a = str2;
        this.f16929b = false;
        this.f16930c = pe4;
        this.f16931d = str3;
        this.f16932e = re4;
    }
}
