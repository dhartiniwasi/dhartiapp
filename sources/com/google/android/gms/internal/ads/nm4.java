package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class nm4 {

    /* renamed from: a */
    private static final int[] f14118a = {96000, 88200, 64000, 48000, 44100, 32000, 24000, 22050, 16000, 12000, 11025, 8000, 7350};

    /* renamed from: b */
    private static final int[] f14119b = {0, 1, 2, 3, 4, 5, 6, 8, -1, -1, -1, 7, 8, -1, 8, -1};

    /* renamed from: c */
    public static final /* synthetic */ int f14120c = 0;

    /* renamed from: a */
    public static mm4 m17191a(byte[] bArr) throws ea0 {
        return m17192b(new x12(bArr, bArr.length), false);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00bb, code lost:
        if (r11 != 3) goto L_0x00db;
     */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0096  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00b5  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.android.gms.internal.ads.mm4 m17192b(com.google.android.gms.internal.ads.x12 r11, boolean r12) throws com.google.android.gms.internal.ads.ea0 {
        /*
            int r0 = m17193c(r11)
            int r1 = m17194d(r11)
            r2 = 4
            int r3 = r11.mo15034c(r2)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "mp4a.40."
            r4.append(r5)
            r4.append(r0)
            java.lang.String r4 = r4.toString()
            r5 = 22
            r6 = 5
            if (r0 == r6) goto L_0x0027
            r6 = 29
            if (r0 != r6) goto L_0x0035
        L_0x0027:
            int r1 = m17194d(r11)
            int r0 = m17193c(r11)
            if (r0 != r5) goto L_0x0035
            int r3 = r11.mo15034c(r2)
        L_0x0035:
            if (r12 == 0) goto L_0x00db
            r12 = 17
            r6 = 6
            r7 = 1
            r8 = 2
            r9 = 3
            if (r0 == r7) goto L_0x0065
            if (r0 == r8) goto L_0x0065
            if (r0 == r9) goto L_0x0065
            if (r0 == r2) goto L_0x0065
            if (r0 == r6) goto L_0x0065
            r2 = 7
            if (r0 == r2) goto L_0x0065
            if (r0 == r12) goto L_0x0065
            switch(r0) {
                case 19: goto L_0x0065;
                case 20: goto L_0x0065;
                case 21: goto L_0x0065;
                case 22: goto L_0x0065;
                case 23: goto L_0x0065;
                default: goto L_0x004f;
            }
        L_0x004f:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r12 = "Unsupported audio object type: "
            r11.append(r12)
            r11.append(r0)
            java.lang.String r11 = r11.toString()
            com.google.android.gms.internal.ads.ea0 r11 = com.google.android.gms.internal.ads.ea0.m11992c(r11)
            throw r11
        L_0x0065:
            boolean r2 = r11.mo15043l()
            if (r2 == 0) goto L_0x0072
            java.lang.String r2 = "AacUtil"
            java.lang.String r10 = "Unexpected frameLengthFlag = 1"
            com.google.android.gms.internal.ads.ot1.m18060e(r2, r10)
        L_0x0072:
            boolean r2 = r11.mo15043l()
            if (r2 == 0) goto L_0x007d
            r2 = 14
            r11.mo15041j(r2)
        L_0x007d:
            boolean r2 = r11.mo15043l()
            if (r3 == 0) goto L_0x00d5
            r10 = 20
            if (r0 == r6) goto L_0x0090
            if (r0 != r10) goto L_0x008e
            r0 = 20
            r6 = 20
            goto L_0x0091
        L_0x008e:
            r6 = r0
            goto L_0x0094
        L_0x0090:
            r6 = r0
        L_0x0091:
            r11.mo15041j(r9)
        L_0x0094:
            if (r2 == 0) goto L_0x00b1
            if (r0 != r5) goto L_0x009e
            r0 = 16
            r11.mo15041j(r0)
            goto L_0x009f
        L_0x009e:
            r5 = r0
        L_0x009f:
            if (r5 == r12) goto L_0x00ab
            r12 = 19
            if (r5 == r12) goto L_0x00ab
            if (r5 == r10) goto L_0x00ab
            r12 = 23
            if (r5 != r12) goto L_0x00ae
        L_0x00ab:
            r11.mo15041j(r9)
        L_0x00ae:
            r11.mo15041j(r7)
        L_0x00b1:
            switch(r6) {
                case 17: goto L_0x00b5;
                case 18: goto L_0x00b4;
                case 19: goto L_0x00b5;
                case 20: goto L_0x00b5;
                case 21: goto L_0x00b5;
                case 22: goto L_0x00b5;
                case 23: goto L_0x00b5;
                default: goto L_0x00b4;
            }
        L_0x00b4:
            goto L_0x00db
        L_0x00b5:
            int r11 = r11.mo15034c(r8)
            if (r11 == r8) goto L_0x00be
            if (r11 == r9) goto L_0x00bf
            goto L_0x00db
        L_0x00be:
            r9 = r11
        L_0x00bf:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r12 = "Unsupported epConfig: "
            r11.append(r12)
            r11.append(r9)
            java.lang.String r11 = r11.toString()
            com.google.android.gms.internal.ads.ea0 r11 = com.google.android.gms.internal.ads.ea0.m11992c(r11)
            throw r11
        L_0x00d5:
            java.lang.UnsupportedOperationException r11 = new java.lang.UnsupportedOperationException
            r11.<init>()
            throw r11
        L_0x00db:
            int[] r11 = f14119b
            r11 = r11[r3]
            r12 = -1
            r0 = 0
            if (r11 == r12) goto L_0x00e9
            com.google.android.gms.internal.ads.mm4 r12 = new com.google.android.gms.internal.ads.mm4
            r12.<init>(r1, r11, r4, r0)
            return r12
        L_0x00e9:
            com.google.android.gms.internal.ads.ea0 r11 = com.google.android.gms.internal.ads.ea0.m11990a(r0, r0)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.nm4.m17192b(com.google.android.gms.internal.ads.x12, boolean):com.google.android.gms.internal.ads.mm4");
    }

    /* renamed from: c */
    private static int m17193c(x12 x12) {
        int c = x12.mo15034c(5);
        return c == 31 ? x12.mo15034c(6) + 32 : c;
    }

    /* renamed from: d */
    private static int m17194d(x12 x12) throws ea0 {
        int c = x12.mo15034c(4);
        if (c == 15) {
            return x12.mo15034c(24);
        }
        if (c < 13) {
            return f14118a[c];
        }
        throw ea0.m11990a((String) null, (Throwable) null);
    }
}
