package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicLong;
import p053g4.C4409t;
import p060h4.C4596v;
import p067i5.C4697k;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class ur0 extends kf2 {

    /* renamed from: e */
    private final Context f18688e;

    /* renamed from: f */
    private final ql2 f18689f;

    /* renamed from: g */
    private final String f18690g;

    /* renamed from: h */
    private final int f18691h;

    /* renamed from: i */
    private final boolean f18692i = ((Boolean) C4596v.m30088c().mo12227b(C2679nz.f14274D1)).booleanValue();

    /* renamed from: j */
    private InputStream f18693j;

    /* renamed from: k */
    private boolean f18694k;

    /* renamed from: l */
    private Uri f18695l;

    /* renamed from: m */
    private volatile C2451hu f18696m;

    /* renamed from: n */
    private boolean f18697n = false;

    /* renamed from: o */
    private boolean f18698o = false;

    /* renamed from: p */
    private boolean f18699p = false;

    /* renamed from: q */
    private boolean f18700q = false;

    /* renamed from: r */
    private long f18701r = 0;

    /* renamed from: s */
    private lf3 f18702s = null;

    /* renamed from: t */
    private final AtomicLong f18703t = new AtomicLong(-1);

    /* renamed from: u */
    private final xr0 f18704u;

    public ur0(Context context, ql2 ql2, String str, int i, ve3 ve3, xr0 xr0, byte[] bArr) {
        super(false);
        this.f18688e = context;
        this.f18689f = ql2;
        this.f18704u = xr0;
        this.f18690g = str;
        this.f18691h = i;
        mo8795k(ve3);
    }

    /* renamed from: w */
    private final boolean m21802w() {
        if (!this.f18692i) {
            return false;
        }
        if (((Boolean) C4596v.m30088c().mo12227b(C2679nz.f14731x3)).booleanValue() && !this.f18699p) {
            return true;
        }
        if (!((Boolean) C4596v.m30088c().mo12227b(C2679nz.f14741y3)).booleanValue() || this.f18700q) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public final void mo8791b() throws IOException {
        if (this.f18694k) {
            boolean z = false;
            this.f18694k = false;
            this.f18695l = null;
            if (!this.f18692i || this.f18693j != null) {
                z = true;
            }
            InputStream inputStream = this.f18693j;
            if (inputStream != null) {
                C4697k.m30405a(inputStream);
                this.f18693j = null;
            } else {
                this.f18689f.mo8791b();
            }
            if (z) {
                mo11673m();
                return;
            }
            return;
        }
        throw new IOException("Attempt to close an already closed GcacheDataSource.");
    }

    /* renamed from: c */
    public final int mo8792c(byte[] bArr, int i, int i2) throws IOException {
        int i3;
        if (this.f18694k) {
            InputStream inputStream = this.f18693j;
            if (inputStream != null) {
                i3 = inputStream.read(bArr, i, i2);
            } else {
                i3 = this.f18689f.mo8792c(bArr, i, i2);
            }
            if (!this.f18692i || this.f18693j != null) {
                mo11672f0(i3);
            }
            return i3;
        }
        throw new IOException("Attempt to read closed GcacheDataSource.");
    }

    /* renamed from: e */
    public final Uri mo8793e() {
        return this.f18695l;
    }

    /* JADX WARNING: Removed duplicated region for block: B:63:0x01e8  */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:39:0x0130=Splitter:B:39:0x0130, B:34:0x010d=Splitter:B:34:0x010d} */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long mo8794f(com.google.android.gms.internal.ads.wq2 r14) throws java.io.IOException {
        /*
            r13 = this;
            java.lang.String r0 = "ms"
            java.lang.String r1 = "Cache connection took "
            boolean r2 = r13.f18694k
            if (r2 != 0) goto L_0x0208
            r2 = 1
            r13.f18694k = r2
            android.net.Uri r3 = r14.f19753a
            r13.f18695l = r3
            boolean r3 = r13.f18692i
            if (r3 != 0) goto L_0x0016
            r13.mo11675o(r14)
        L_0x0016:
            android.net.Uri r3 = r14.f19753a
            com.google.android.gms.internal.ads.hu r3 = com.google.android.gms.internal.ads.C2451hu.m14045I1(r3)
            r13.f18696m = r3
            com.google.android.gms.internal.ads.ez r3 = com.google.android.gms.internal.ads.C2679nz.f14701u3
            com.google.android.gms.internal.ads.lz r4 = p060h4.C4596v.m30088c()
            java.lang.Object r3 = r4.mo12227b(r3)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            r4 = -1
            r6 = 0
            if (r3 == 0) goto L_0x0186
            com.google.android.gms.internal.ads.hu r3 = r13.f18696m
            if (r3 == 0) goto L_0x01e2
            com.google.android.gms.internal.ads.hu r3 = r13.f18696m
            long r7 = r14.f19758f
            r3.f10492h = r7
            com.google.android.gms.internal.ads.hu r3 = r13.f18696m
            java.lang.String r7 = r13.f18690g
            java.lang.String r7 = com.google.android.gms.internal.ads.r83.m19614c(r7)
            r3.f10493i = r7
            com.google.android.gms.internal.ads.hu r3 = r13.f18696m
            int r7 = r13.f18691h
            r3.f10494r = r7
            com.google.android.gms.internal.ads.hu r3 = r13.f18696m
            boolean r3 = r3.f10491g
            if (r3 == 0) goto L_0x0060
            com.google.android.gms.internal.ads.ez r3 = com.google.android.gms.internal.ads.C2679nz.f14721w3
            com.google.android.gms.internal.ads.lz r7 = p060h4.C4596v.m30088c()
            java.lang.Object r3 = r7.mo12227b(r3)
            java.lang.Long r3 = (java.lang.Long) r3
            goto L_0x006c
        L_0x0060:
            com.google.android.gms.internal.ads.ez r3 = com.google.android.gms.internal.ads.C2679nz.f14711v3
            com.google.android.gms.internal.ads.lz r7 = p060h4.C4596v.m30088c()
            java.lang.Object r3 = r7.mo12227b(r3)
            java.lang.Long r3 = (java.lang.Long) r3
        L_0x006c:
            long r7 = r3.longValue()
            i5.e r3 = p053g4.C4409t.m29310b()
            long r9 = r3.mo18371b()
            p053g4.C4409t.m29314f()
            android.content.Context r3 = r13.f18688e
            com.google.android.gms.internal.ads.hu r11 = r13.f18696m
            java.util.concurrent.Future r3 = com.google.android.gms.internal.ads.C2860su.m20614a(r3, r11)
            java.util.concurrent.TimeUnit r11 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ ExecutionException | TimeoutException -> 0x012f, InterruptedException -> 0x010c, all -> 0x0109 }
            java.lang.Object r7 = r3.get(r7, r11)     // Catch:{ ExecutionException | TimeoutException -> 0x012f, InterruptedException -> 0x010c, all -> 0x0109 }
            com.google.android.gms.internal.ads.tu r7 = (com.google.android.gms.internal.ads.C2897tu) r7     // Catch:{ ExecutionException | TimeoutException -> 0x012f, InterruptedException -> 0x010c, all -> 0x0109 }
            boolean r8 = r7.mo14387d()     // Catch:{ ExecutionException | TimeoutException -> 0x0107, InterruptedException -> 0x0105, all -> 0x0103 }
            r13.f18697n = r8     // Catch:{ ExecutionException | TimeoutException -> 0x0107, InterruptedException -> 0x0105, all -> 0x0103 }
            boolean r8 = r7.mo14389f()     // Catch:{ ExecutionException | TimeoutException -> 0x0107, InterruptedException -> 0x0105, all -> 0x0103 }
            r13.f18699p = r8     // Catch:{ ExecutionException | TimeoutException -> 0x0107, InterruptedException -> 0x0105, all -> 0x0103 }
            boolean r8 = r7.mo14388e()     // Catch:{ ExecutionException | TimeoutException -> 0x0107, InterruptedException -> 0x0105, all -> 0x0103 }
            r13.f18700q = r8     // Catch:{ ExecutionException | TimeoutException -> 0x0107, InterruptedException -> 0x0105, all -> 0x0103 }
            long r11 = r7.mo14385a()     // Catch:{ ExecutionException | TimeoutException -> 0x0107, InterruptedException -> 0x0105, all -> 0x0103 }
            r13.f18701r = r11     // Catch:{ ExecutionException | TimeoutException -> 0x0107, InterruptedException -> 0x0105, all -> 0x0103 }
            boolean r8 = r13.m21802w()     // Catch:{ ExecutionException | TimeoutException -> 0x0107, InterruptedException -> 0x0105, all -> 0x0103 }
            if (r8 != 0) goto L_0x00de
            java.io.InputStream r7 = r7.mo14386c()     // Catch:{ ExecutionException | TimeoutException -> 0x0107, InterruptedException -> 0x0105, all -> 0x0103 }
            r13.f18693j = r7     // Catch:{ ExecutionException | TimeoutException -> 0x0107, InterruptedException -> 0x0105, all -> 0x0103 }
            boolean r7 = r13.f18692i     // Catch:{ ExecutionException | TimeoutException -> 0x0107, InterruptedException -> 0x0105, all -> 0x0103 }
            if (r7 == 0) goto L_0x00b6
            r13.mo11675o(r14)     // Catch:{ ExecutionException | TimeoutException -> 0x0107, InterruptedException -> 0x0105, all -> 0x0103 }
        L_0x00b6:
            i5.e r14 = p053g4.C4409t.m29310b()
            long r6 = r14.mo18371b()
            long r6 = r6 - r9
            com.google.android.gms.internal.ads.xr0 r14 = r13.f18704u
            com.google.android.gms.internal.ads.is0 r14 = r14.f20330a
            r14.mo11231m0(r2, r6)
            r13.f18698o = r2
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            r14.append(r1)
            r14.append(r6)
            r14.append(r0)
            java.lang.String r14 = r14.toString()
            p073j4.C4794n1.m30693k(r14)
            return r4
        L_0x00de:
            i5.e r3 = p053g4.C4409t.m29310b()
            long r3 = r3.mo18371b()
            long r3 = r3 - r9
            com.google.android.gms.internal.ads.xr0 r5 = r13.f18704u
            com.google.android.gms.internal.ads.is0 r5 = r5.f20330a
            r5.mo11231m0(r2, r3)
            r13.f18698o = r2
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r1)
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            goto L_0x0157
        L_0x0103:
            r14 = move-exception
            goto L_0x015e
        L_0x0105:
            r4 = 1
            goto L_0x010d
        L_0x0107:
            r4 = 1
            goto L_0x0130
        L_0x0109:
            r14 = move-exception
            r2 = 0
            goto L_0x015e
        L_0x010c:
            r4 = 0
        L_0x010d:
            r3.cancel(r2)     // Catch:{ all -> 0x015c }
            java.lang.Thread r2 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x015c }
            r2.interrupt()     // Catch:{ all -> 0x015c }
            i5.e r2 = p053g4.C4409t.m29310b()
            long r2 = r2.mo18371b()
            long r2 = r2 - r9
            com.google.android.gms.internal.ads.xr0 r5 = r13.f18704u
            com.google.android.gms.internal.ads.is0 r5 = r5.f20330a
            r5.mo11231m0(r4, r2)
            r13.f18698o = r4
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            goto L_0x014a
        L_0x012f:
            r4 = 0
        L_0x0130:
            r3.cancel(r2)     // Catch:{ all -> 0x015c }
            i5.e r2 = p053g4.C4409t.m29310b()
            long r2 = r2.mo18371b()
            long r2 = r2 - r9
            com.google.android.gms.internal.ads.xr0 r5 = r13.f18704u
            com.google.android.gms.internal.ads.is0 r5 = r5.f20330a
            r5.mo11231m0(r4, r2)
            r13.f18698o = r4
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
        L_0x014a:
            r4.append(r1)
            r4.append(r2)
            r4.append(r0)
            java.lang.String r0 = r4.toString()
        L_0x0157:
            p073j4.C4794n1.m30693k(r0)
            goto L_0x01e2
        L_0x015c:
            r14 = move-exception
            r2 = r4
        L_0x015e:
            i5.e r3 = p053g4.C4409t.m29310b()
            long r3 = r3.mo18371b()
            long r3 = r3 - r9
            com.google.android.gms.internal.ads.xr0 r5 = r13.f18704u
            com.google.android.gms.internal.ads.is0 r5 = r5.f20330a
            r5.mo11231m0(r2, r3)
            r13.f18698o = r2
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r1)
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            p073j4.C4794n1.m30693k(r0)
            throw r14
        L_0x0186:
            com.google.android.gms.internal.ads.hu r0 = r13.f18696m
            if (r0 == 0) goto L_0x01ab
            com.google.android.gms.internal.ads.hu r0 = r13.f18696m
            long r7 = r14.f19758f
            r0.f10492h = r7
            com.google.android.gms.internal.ads.hu r0 = r13.f18696m
            java.lang.String r1 = r13.f18690g
            java.lang.String r1 = com.google.android.gms.internal.ads.r83.m19614c(r1)
            r0.f10493i = r1
            com.google.android.gms.internal.ads.hu r0 = r13.f18696m
            int r1 = r13.f18691h
            r0.f10494r = r1
            com.google.android.gms.internal.ads.cu r0 = p053g4.C4409t.m29313e()
            com.google.android.gms.internal.ads.hu r1 = r13.f18696m
            com.google.android.gms.internal.ads.du r0 = r0.mo9351b(r1)
            goto L_0x01ac
        L_0x01ab:
            r0 = 0
        L_0x01ac:
            if (r0 == 0) goto L_0x01e2
            boolean r1 = r0.mo9694M1()
            if (r1 == 0) goto L_0x01e2
            boolean r1 = r0.mo9693L1()
            r13.f18697n = r1
            boolean r1 = r0.mo9696O1()
            r13.f18699p = r1
            boolean r1 = r0.mo9695N1()
            r13.f18700q = r1
            long r7 = r0.mo9690I1()
            r13.f18701r = r7
            r13.f18698o = r2
            boolean r1 = r13.m21802w()
            if (r1 != 0) goto L_0x01e2
            java.io.InputStream r0 = r0.mo9692K1()
            r13.f18693j = r0
            boolean r0 = r13.f18692i
            if (r0 == 0) goto L_0x01e1
            r13.mo11675o(r14)
        L_0x01e1:
            return r4
        L_0x01e2:
            r13.f18698o = r6
            com.google.android.gms.internal.ads.hu r0 = r13.f18696m
            if (r0 == 0) goto L_0x0201
            com.google.android.gms.internal.ads.wq2 r0 = new com.google.android.gms.internal.ads.wq2
            com.google.android.gms.internal.ads.hu r1 = r13.f18696m
            java.lang.String r1 = r1.f10485a
            android.net.Uri r2 = android.net.Uri.parse(r1)
            long r4 = r14.f19757e
            long r6 = r14.f19758f
            long r8 = r14.f19759g
            r3 = 0
            r10 = 0
            int r11 = r14.f19761i
            r1 = r0
            r1.<init>(r2, r3, r4, r6, r8, r10, r11)
            r14 = r0
        L_0x0201:
            com.google.android.gms.internal.ads.ql2 r0 = r13.f18689f
            long r0 = r0.mo8794f(r14)
            return r0
        L_0x0208:
            java.io.IOException r14 = new java.io.IOException
            java.lang.String r0 = "Attempt to open an already open GcacheDataSource."
            r14.<init>(r0)
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ur0.mo8794f(com.google.android.gms.internal.ads.wq2):long");
    }

    /* renamed from: p */
    public final long mo14592p() {
        return this.f18701r;
    }

    /* renamed from: q */
    public final long mo14593q() {
        if (this.f18696m == null) {
            return -1;
        }
        if (this.f18703t.get() != -1) {
            return this.f18703t.get();
        }
        synchronized (this) {
            if (this.f18702s == null) {
                this.f18702s = dn0.f8325a.mo12324a(new tr0(this));
            }
        }
        if (!this.f18702s.isDone()) {
            return -1;
        }
        try {
            this.f18703t.compareAndSet(-1, ((Long) this.f18702s.get()).longValue());
            return this.f18703t.get();
        } catch (InterruptedException | ExecutionException unused) {
            return -1;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public final /* synthetic */ Long mo14594r() throws Exception {
        return Long.valueOf(C4409t.m29313e().mo9350a(this.f18696m));
    }

    /* renamed from: s */
    public final boolean mo14595s() {
        return this.f18697n;
    }

    /* renamed from: t */
    public final boolean mo14596t() {
        return this.f18700q;
    }

    /* renamed from: u */
    public final boolean mo14597u() {
        return this.f18699p;
    }

    /* renamed from: v */
    public final boolean mo14598v() {
        return this.f18698o;
    }
}
