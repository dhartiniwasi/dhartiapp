package com.google.android.gms.internal.ads;

import android.os.HandlerThread;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class xd4 implements me4 {

    /* renamed from: b */
    private final s83 f20073b;

    /* renamed from: c */
    private final s83 f20074c;

    public xd4(int i, boolean z) {
        vd4 vd4 = new vd4(i);
        wd4 wd4 = new wd4(i);
        this.f20073b = vd4;
        this.f20074c = wd4;
    }

    /* renamed from: a */
    static /* synthetic */ HandlerThread m23185a(int i) {
        return new HandlerThread(zd4.m24531l(i, "ExoPlayer:MediaCodecAsyncAdapter:"));
    }

    /* renamed from: b */
    static /* synthetic */ HandlerThread m23186b(int i) {
        return new HandlerThread(zd4.m24531l(i, "ExoPlayer:MediaCodecQueueingThread:"));
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0051  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0057  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.ads.zd4 mo15088c(com.google.android.gms.internal.ads.le4 r11) throws java.io.IOException {
        /*
            r10 = this;
            com.google.android.gms.internal.ads.pe4 r0 = r11.f12757a
            java.lang.String r0 = r0.f15824a
            r1 = 0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x004d }
            r2.<init>()     // Catch:{ Exception -> 0x004d }
            java.lang.String r3 = "createCodec:"
            r2.append(r3)     // Catch:{ Exception -> 0x004d }
            r2.append(r0)     // Catch:{ Exception -> 0x004d }
            java.lang.String r2 = r2.toString()     // Catch:{ Exception -> 0x004d }
            int r3 = com.google.android.gms.internal.ads.gb2.f9812a     // Catch:{ Exception -> 0x004d }
            android.os.Trace.beginSection(r2)     // Catch:{ Exception -> 0x004d }
            android.media.MediaCodec r0 = android.media.MediaCodec.createByCodecName(r0)     // Catch:{ Exception -> 0x004d }
            com.google.android.gms.internal.ads.zd4 r2 = new com.google.android.gms.internal.ads.zd4     // Catch:{ Exception -> 0x004b }
            com.google.android.gms.internal.ads.s83 r3 = r10.f20073b     // Catch:{ Exception -> 0x004b }
            com.google.android.gms.internal.ads.vd4 r3 = (com.google.android.gms.internal.ads.vd4) r3     // Catch:{ Exception -> 0x004b }
            int r3 = r3.f19073a     // Catch:{ Exception -> 0x004b }
            android.os.HandlerThread r6 = m23185a(r3)     // Catch:{ Exception -> 0x004b }
            com.google.android.gms.internal.ads.s83 r3 = r10.f20074c     // Catch:{ Exception -> 0x004b }
            com.google.android.gms.internal.ads.wd4 r3 = (com.google.android.gms.internal.ads.wd4) r3     // Catch:{ Exception -> 0x004b }
            int r3 = r3.f19590a     // Catch:{ Exception -> 0x004b }
            android.os.HandlerThread r7 = m23186b(r3)     // Catch:{ Exception -> 0x004b }
            r8 = 0
            r9 = 0
            r4 = r2
            r5 = r0
            r4.<init>(r5, r6, r7, r8, r9)     // Catch:{ Exception -> 0x004b }
            android.os.Trace.endSection()     // Catch:{ Exception -> 0x0048 }
            android.media.MediaFormat r3 = r11.f12758b     // Catch:{ Exception -> 0x0048 }
            android.view.Surface r11 = r11.f12760d     // Catch:{ Exception -> 0x0048 }
            r4 = 0
            com.google.android.gms.internal.ads.zd4.m24530k(r2, r3, r11, r1, r4)     // Catch:{ Exception -> 0x0048 }
            return r2
        L_0x0048:
            r11 = move-exception
            r1 = r2
            goto L_0x004f
        L_0x004b:
            r11 = move-exception
            goto L_0x004f
        L_0x004d:
            r11 = move-exception
            r0 = r1
        L_0x004f:
            if (r1 != 0) goto L_0x0057
            if (r0 == 0) goto L_0x005a
            r0.release()
            goto L_0x005a
        L_0x0057:
            r1.mo11681Z()
        L_0x005a:
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.xd4.mo15088c(com.google.android.gms.internal.ads.le4):com.google.android.gms.internal.ads.zd4");
    }
}
