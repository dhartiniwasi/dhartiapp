package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class x82 implements ie3 {

    /* renamed from: a */
    private final kx2 f20034a;

    /* renamed from: b */
    private final y91 f20035b;

    /* renamed from: c */
    private final nz2 f20036c;

    /* renamed from: d */
    private final rz2 f20037d;

    /* renamed from: e */
    private final Executor f20038e;

    /* renamed from: f */
    private final ScheduledExecutorService f20039f;

    /* renamed from: g */
    private final y51 f20040g;

    /* renamed from: h */
    private final s82 f20041h;

    /* renamed from: i */
    private final i52 f20042i;

    /* renamed from: j */
    private final Context f20043j;

    /* renamed from: k */
    private final yy2 f20044k;

    x82(Context context, kx2 kx2, s82 s82, y91 y91, nz2 nz2, rz2 rz2, y51 y51, Executor executor, ScheduledExecutorService scheduledExecutorService, i52 i52, yy2 yy2) {
        this.f20043j = context;
        this.f20034a = kx2;
        this.f20041h = s82;
        this.f20035b = y91;
        this.f20036c = nz2;
        this.f20037d = rz2;
        this.f20040g = y51;
        this.f20038e = executor;
        this.f20039f = scheduledExecutorService;
        this.f20042i = i52;
        this.f20044k = yy2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ lf3 mo15063a(is2 is2, us2 us2, d52 d52, Throwable th) throws Exception {
        ny2 a = my2.m16825a(this.f20043j, 12);
        a.mo11835x(is2.f10947F);
        a.mo11828T();
        s82 s82 = this.f20041h;
        lf3 o = cf3.m10917o(d52.mo9437b(us2, is2), (long) is2.f10960S, TimeUnit.MILLISECONDS, this.f20039f);
        s82.mo13960e(us2, is2, o, this.f20036c);
        xy2.m23609a(o, this.f20044k, a);
        return o;
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00a2  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00fd  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ com.google.android.gms.internal.ads.lf3 mo8156b(java.lang.Object r9) throws java.lang.Exception {
        /*
            r8 = this;
            com.google.android.gms.internal.ads.us2 r9 = (com.google.android.gms.internal.ads.us2) r9
            com.google.android.gms.internal.ads.ts2 r0 = r9.f18723b
            com.google.android.gms.internal.ads.ls2 r0 = r0.f18244b
            int r0 = r0.f12933e
            r1 = 200(0xc8, float:2.8E-43)
            r2 = 300(0x12c, float:4.2E-43)
            if (r0 == 0) goto L_0x0042
            if (r0 < r1) goto L_0x0027
            if (r0 >= r2) goto L_0x0027
            com.google.android.gms.internal.ads.ez r0 = com.google.android.gms.internal.ads.C2679nz.f14267C4
            com.google.android.gms.internal.ads.lz r3 = p060h4.C4596v.m30088c()
            java.lang.Object r0 = r3.mo12227b(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L_0x0042
            java.lang.String r0 = "No fill."
            goto L_0x0044
        L_0x0027:
            if (r0 < r2) goto L_0x0030
            r3 = 400(0x190, float:5.6E-43)
            if (r0 >= r3) goto L_0x0030
            java.lang.String r0 = "No location header to follow redirect or too many redirects."
            goto L_0x0044
        L_0x0030:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Received error HTTP response code: "
            r3.append(r4)
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            goto L_0x0044
        L_0x0042:
            java.lang.String r0 = "No ad config."
        L_0x0044:
            com.google.android.gms.internal.ads.ts2 r3 = r9.f18723b
            com.google.android.gms.internal.ads.ls2 r3 = r3.f18244b
            com.google.android.gms.internal.ads.ks2 r4 = r3.f12937i
            if (r4 == 0) goto L_0x0050
            java.lang.String r0 = r4.mo11796a()
        L_0x0050:
            com.google.android.gms.internal.ads.i52 r4 = r8.f20042i
            r4.mo11025g(r3)
            com.google.android.gms.internal.ads.ez r3 = com.google.android.gms.internal.ads.C2679nz.f14565g7
            com.google.android.gms.internal.ads.lz r4 = p060h4.C4596v.m30088c()
            java.lang.Object r3 = r4.mo12227b(r3)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            r4 = 3
            if (r3 == 0) goto L_0x007f
            com.google.android.gms.internal.ads.ts2 r3 = r9.f18723b
            com.google.android.gms.internal.ads.ls2 r3 = r3.f18244b
            int r3 = r3.f12933e
            if (r3 == 0) goto L_0x007f
            if (r3 < r1) goto L_0x0074
            if (r3 < r2) goto L_0x007f
        L_0x0074:
            com.google.android.gms.internal.ads.v82 r9 = new com.google.android.gms.internal.ads.v82
            r9.<init>(r4, r0)
            com.google.android.gms.internal.ads.lf3 r9 = com.google.android.gms.internal.ads.cf3.m10910h(r9)
            goto L_0x015d
        L_0x007f:
            com.google.android.gms.internal.ads.kx2 r1 = r8.f20034a
            com.google.android.gms.internal.ads.ex2 r2 = com.google.android.gms.internal.ads.ex2.RENDER_CONFIG_INIT
            com.google.android.gms.internal.ads.v82 r3 = new com.google.android.gms.internal.ads.v82
            r3.<init>(r4, r0)
            com.google.android.gms.internal.ads.lf3 r0 = com.google.android.gms.internal.ads.cf3.m10910h(r3)
            com.google.android.gms.internal.ads.ax2 r0 = com.google.android.gms.internal.ads.tw2.m21276c(r0, r2, r1)
            com.google.android.gms.internal.ads.ow2 r0 = r0.mo8577a()
            com.google.android.gms.internal.ads.ts2 r1 = r9.f18723b
            java.util.List r1 = r1.f18243a
            java.util.Iterator r1 = r1.iterator()
        L_0x009c:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x00de
            java.lang.Object r2 = r1.next()
            com.google.android.gms.internal.ads.is2 r2 = (com.google.android.gms.internal.ads.is2) r2
            com.google.android.gms.internal.ads.i52 r3 = r8.f20042i
            r3.mo11022d(r2)
            java.util.List r3 = r2.f10968a
            java.util.Iterator r3 = r3.iterator()
        L_0x00b3:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x00d0
            java.lang.Object r4 = r3.next()
            java.lang.String r4 = (java.lang.String) r4
            com.google.android.gms.internal.ads.y51 r5 = r8.f20040g
            int r6 = r2.f10970b
            com.google.android.gms.internal.ads.d52 r4 = r5.mo8849a(r6, r4)
            if (r4 == 0) goto L_0x00b3
            boolean r4 = r4.mo9436a(r9, r2)
            if (r4 == 0) goto L_0x00b3
            goto L_0x009c
        L_0x00d0:
            com.google.android.gms.internal.ads.i52 r3 = r8.f20042i
            r4 = 0
            r6 = 1
            r7 = 0
            h4.z2 r6 = com.google.android.gms.internal.ads.eu2.m12271d(r6, r7, r7)
            r3.mo11023e(r2, r4, r6)
            goto L_0x009c
        L_0x00de:
            com.google.android.gms.internal.ads.y91 r1 = r8.f20035b
            com.google.android.gms.internal.ads.d11 r2 = new com.google.android.gms.internal.ads.d11
            com.google.android.gms.internal.ads.rz2 r3 = r8.f20037d
            com.google.android.gms.internal.ads.nz2 r4 = r8.f20036c
            r2.<init>(r9, r3, r4)
            java.util.concurrent.Executor r3 = r8.f20038e
            r1.mo11669m0(r2, r3)
            com.google.android.gms.internal.ads.ts2 r1 = r9.f18723b
            java.util.List r1 = r1.f18243a
            java.util.Iterator r1 = r1.iterator()
            r2 = 0
        L_0x00f7:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x015c
            java.lang.Object r3 = r1.next()
            com.google.android.gms.internal.ads.is2 r3 = (com.google.android.gms.internal.ads.is2) r3
            java.util.List r4 = r3.f10968a
            java.util.Iterator r4 = r4.iterator()
        L_0x0109:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x0159
            java.lang.Object r5 = r4.next()
            java.lang.String r5 = (java.lang.String) r5
            com.google.android.gms.internal.ads.y51 r6 = r8.f20040g
            int r7 = r3.f10970b
            com.google.android.gms.internal.ads.d52 r6 = r6.mo8849a(r7, r5)
            if (r6 == 0) goto L_0x0109
            boolean r7 = r6.mo9436a(r9, r3)
            if (r7 == 0) goto L_0x0109
            com.google.android.gms.internal.ads.kx2 r4 = r8.f20034a
            com.google.android.gms.internal.ads.ex2 r7 = com.google.android.gms.internal.ads.ex2.RENDER_CONFIG_WATERFALL
            com.google.android.gms.internal.ads.ax2 r0 = r4.mo8966b(r7, r0)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r7 = "render-config-"
            r4.append(r7)
            r4.append(r2)
            java.lang.String r7 = "-"
            r4.append(r7)
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            com.google.android.gms.internal.ads.ax2 r0 = r0.mo8584h(r4)
            com.google.android.gms.internal.ads.w82 r4 = new com.google.android.gms.internal.ads.w82
            r4.<init>(r8, r3, r9, r6)
            java.lang.Class<java.lang.Throwable> r3 = java.lang.Throwable.class
            com.google.android.gms.internal.ads.ax2 r0 = r0.mo8579c(r3, r4)
            com.google.android.gms.internal.ads.ow2 r0 = r0.mo8577a()
        L_0x0159:
            int r2 = r2 + 1
            goto L_0x00f7
        L_0x015c:
            r9 = r0
        L_0x015d:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.x82.mo8156b(java.lang.Object):com.google.android.gms.internal.ads.lf3");
    }
}
