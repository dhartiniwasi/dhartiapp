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
public final class xp0 implements C2669np {

    /* renamed from: a */
    private final C2298dq f20301a;

    /* renamed from: b */
    private final Context f20302b;

    /* renamed from: c */
    private final C2669np f20303c;

    /* renamed from: d */
    private final String f20304d;

    /* renamed from: e */
    private final int f20305e;

    /* renamed from: f */
    private final boolean f20306f = ((Boolean) C4596v.m30088c().mo12227b(C2679nz.f14274D1)).booleanValue();

    /* renamed from: g */
    private InputStream f20307g;

    /* renamed from: h */
    private boolean f20308h;

    /* renamed from: i */
    private Uri f20309i;

    /* renamed from: j */
    private volatile C2451hu f20310j;

    /* renamed from: k */
    private boolean f20311k = false;

    /* renamed from: l */
    private boolean f20312l = false;

    /* renamed from: m */
    private boolean f20313m = false;

    /* renamed from: n */
    private boolean f20314n = false;

    /* renamed from: o */
    private long f20315o = 0;

    /* renamed from: p */
    private lf3 f20316p = null;

    /* renamed from: q */
    private final AtomicLong f20317q = new AtomicLong(-1);

    /* renamed from: r */
    private final gq0 f20318r;

    public xp0(Context context, C2669np npVar, String str, int i, C2298dq dqVar, gq0 gq0, byte[] bArr) {
        this.f20302b = context;
        this.f20303c = npVar;
        this.f20301a = dqVar;
        this.f20318r = gq0;
        this.f20304d = str;
        this.f20305e = i;
    }

    /* renamed from: m */
    private final void m23475m(C2744pp ppVar) {
        C2298dq dqVar = this.f20301a;
        if (dqVar != null) {
            ((kq0) dqVar).mo9649k(this, ppVar);
        }
    }

    /* renamed from: n */
    private final boolean m23476n() {
        if (!this.f20306f) {
            return false;
        }
        if (((Boolean) C4596v.m30088c().mo12227b(C2679nz.f14731x3)).booleanValue() && !this.f20313m) {
            return true;
        }
        if (!((Boolean) C4596v.m30088c().mo12227b(C2679nz.f14741y3)).booleanValue() || this.f20314n) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public final void mo12051b() throws IOException {
        if (this.f20308h) {
            this.f20308h = false;
            this.f20309i = null;
            InputStream inputStream = this.f20307g;
            if (inputStream != null) {
                C4697k.m30405a(inputStream);
                this.f20307g = null;
                return;
            }
            this.f20303c.mo12051b();
            return;
        }
        throw new IOException("Attempt to close an already closed CacheDataSource.");
    }

    /* renamed from: c */
    public final int mo12052c(byte[] bArr, int i, int i2) throws IOException {
        int i3;
        C2298dq dqVar;
        if (this.f20308h) {
            InputStream inputStream = this.f20307g;
            if (inputStream != null) {
                i3 = inputStream.read(bArr, i, i2);
            } else {
                i3 = this.f20303c.mo12052c(bArr, i, i2);
            }
            if ((!this.f20306f || this.f20307g != null) && (dqVar = this.f20301a) != null) {
                ((kq0) dqVar).mo11769l0(this, i3);
            }
            return i3;
        }
        throw new IOException("Attempt to read closed CacheDataSource.");
    }

    /* JADX WARNING: Removed duplicated region for block: B:63:0x01e8  */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:39:0x0130=Splitter:B:39:0x0130, B:34:0x010d=Splitter:B:34:0x010d} */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long mo12053d(com.google.android.gms.internal.ads.C2744pp r14) throws java.io.IOException {
        /*
            r13 = this;
            java.lang.String r0 = "ms"
            java.lang.String r1 = "Cache connection took "
            boolean r2 = r13.f20308h
            if (r2 != 0) goto L_0x0207
            r2 = 1
            r13.f20308h = r2
            android.net.Uri r3 = r14.f15941a
            r13.f20309i = r3
            boolean r3 = r13.f20306f
            if (r3 != 0) goto L_0x0016
            r13.m23475m(r14)
        L_0x0016:
            android.net.Uri r3 = r14.f15941a
            com.google.android.gms.internal.ads.hu r3 = com.google.android.gms.internal.ads.C2451hu.m14045I1(r3)
            r13.f20310j = r3
            com.google.android.gms.internal.ads.ez r3 = com.google.android.gms.internal.ads.C2679nz.f14701u3
            com.google.android.gms.internal.ads.lz r4 = p060h4.C4596v.m30088c()
            java.lang.Object r3 = r4.mo12227b(r3)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            r4 = -1
            r6 = 0
            if (r3 == 0) goto L_0x0186
            com.google.android.gms.internal.ads.hu r3 = r13.f20310j
            if (r3 == 0) goto L_0x01e2
            com.google.android.gms.internal.ads.hu r3 = r13.f20310j
            long r7 = r14.f15943c
            r3.f10492h = r7
            com.google.android.gms.internal.ads.hu r3 = r13.f20310j
            java.lang.String r7 = r13.f20304d
            java.lang.String r7 = com.google.android.gms.internal.ads.r83.m19614c(r7)
            r3.f10493i = r7
            com.google.android.gms.internal.ads.hu r3 = r13.f20310j
            int r7 = r13.f20305e
            r3.f10494r = r7
            com.google.android.gms.internal.ads.hu r3 = r13.f20310j
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
            android.content.Context r3 = r13.f20302b
            com.google.android.gms.internal.ads.hu r11 = r13.f20310j
            java.util.concurrent.Future r3 = com.google.android.gms.internal.ads.C2860su.m20614a(r3, r11)
            java.util.concurrent.TimeUnit r11 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ ExecutionException | TimeoutException -> 0x012f, InterruptedException -> 0x010c, all -> 0x0109 }
            java.lang.Object r7 = r3.get(r7, r11)     // Catch:{ ExecutionException | TimeoutException -> 0x012f, InterruptedException -> 0x010c, all -> 0x0109 }
            com.google.android.gms.internal.ads.tu r7 = (com.google.android.gms.internal.ads.C2897tu) r7     // Catch:{ ExecutionException | TimeoutException -> 0x012f, InterruptedException -> 0x010c, all -> 0x0109 }
            boolean r8 = r7.mo14387d()     // Catch:{ ExecutionException | TimeoutException -> 0x0107, InterruptedException -> 0x0105, all -> 0x0103 }
            r13.f20311k = r8     // Catch:{ ExecutionException | TimeoutException -> 0x0107, InterruptedException -> 0x0105, all -> 0x0103 }
            boolean r8 = r7.mo14389f()     // Catch:{ ExecutionException | TimeoutException -> 0x0107, InterruptedException -> 0x0105, all -> 0x0103 }
            r13.f20313m = r8     // Catch:{ ExecutionException | TimeoutException -> 0x0107, InterruptedException -> 0x0105, all -> 0x0103 }
            boolean r8 = r7.mo14388e()     // Catch:{ ExecutionException | TimeoutException -> 0x0107, InterruptedException -> 0x0105, all -> 0x0103 }
            r13.f20314n = r8     // Catch:{ ExecutionException | TimeoutException -> 0x0107, InterruptedException -> 0x0105, all -> 0x0103 }
            long r11 = r7.mo14385a()     // Catch:{ ExecutionException | TimeoutException -> 0x0107, InterruptedException -> 0x0105, all -> 0x0103 }
            r13.f20315o = r11     // Catch:{ ExecutionException | TimeoutException -> 0x0107, InterruptedException -> 0x0105, all -> 0x0103 }
            boolean r8 = r13.m23476n()     // Catch:{ ExecutionException | TimeoutException -> 0x0107, InterruptedException -> 0x0105, all -> 0x0103 }
            if (r8 != 0) goto L_0x00de
            java.io.InputStream r7 = r7.mo14386c()     // Catch:{ ExecutionException | TimeoutException -> 0x0107, InterruptedException -> 0x0105, all -> 0x0103 }
            r13.f20307g = r7     // Catch:{ ExecutionException | TimeoutException -> 0x0107, InterruptedException -> 0x0105, all -> 0x0103 }
            boolean r7 = r13.f20306f     // Catch:{ ExecutionException | TimeoutException -> 0x0107, InterruptedException -> 0x0105, all -> 0x0103 }
            if (r7 == 0) goto L_0x00b6
            r13.m23475m(r14)     // Catch:{ ExecutionException | TimeoutException -> 0x0107, InterruptedException -> 0x0105, all -> 0x0103 }
        L_0x00b6:
            i5.e r14 = p053g4.C4409t.m29310b()
            long r6 = r14.mo18371b()
            long r6 = r6 - r9
            com.google.android.gms.internal.ads.gq0 r14 = r13.f20318r
            com.google.android.gms.internal.ads.kq0 r14 = r14.f10035a
            r14.mo11768k0(r2, r6)
            r13.f20312l = r2
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
            com.google.android.gms.internal.ads.gq0 r5 = r13.f20318r
            com.google.android.gms.internal.ads.kq0 r5 = r5.f10035a
            r5.mo11768k0(r2, r3)
            r13.f20312l = r2
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
            com.google.android.gms.internal.ads.gq0 r5 = r13.f20318r
            com.google.android.gms.internal.ads.kq0 r5 = r5.f10035a
            r5.mo11768k0(r4, r2)
            r13.f20312l = r4
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
            com.google.android.gms.internal.ads.gq0 r5 = r13.f20318r
            com.google.android.gms.internal.ads.kq0 r5 = r5.f10035a
            r5.mo11768k0(r4, r2)
            r13.f20312l = r4
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
            com.google.android.gms.internal.ads.gq0 r5 = r13.f20318r
            com.google.android.gms.internal.ads.kq0 r5 = r5.f10035a
            r5.mo11768k0(r2, r3)
            r13.f20312l = r2
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r1)
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            p073j4.C4794n1.m30693k(r0)
            throw r14
        L_0x0186:
            com.google.android.gms.internal.ads.hu r0 = r13.f20310j
            if (r0 == 0) goto L_0x01ab
            com.google.android.gms.internal.ads.hu r0 = r13.f20310j
            long r7 = r14.f15943c
            r0.f10492h = r7
            com.google.android.gms.internal.ads.hu r0 = r13.f20310j
            java.lang.String r1 = r13.f20304d
            java.lang.String r1 = com.google.android.gms.internal.ads.r83.m19614c(r1)
            r0.f10493i = r1
            com.google.android.gms.internal.ads.hu r0 = r13.f20310j
            int r1 = r13.f20305e
            r0.f10494r = r1
            com.google.android.gms.internal.ads.cu r0 = p053g4.C4409t.m29313e()
            com.google.android.gms.internal.ads.hu r1 = r13.f20310j
            com.google.android.gms.internal.ads.du r0 = r0.mo9351b(r1)
            goto L_0x01ac
        L_0x01ab:
            r0 = 0
        L_0x01ac:
            if (r0 == 0) goto L_0x01e2
            boolean r1 = r0.mo9694M1()
            if (r1 == 0) goto L_0x01e2
            boolean r1 = r0.mo9693L1()
            r13.f20311k = r1
            boolean r1 = r0.mo9696O1()
            r13.f20313m = r1
            boolean r1 = r0.mo9695N1()
            r13.f20314n = r1
            long r7 = r0.mo9690I1()
            r13.f20315o = r7
            r13.f20312l = r2
            boolean r1 = r13.m23476n()
            if (r1 != 0) goto L_0x01e2
            java.io.InputStream r0 = r0.mo9692K1()
            r13.f20307g = r0
            boolean r0 = r13.f20306f
            if (r0 == 0) goto L_0x01e1
            r13.m23475m(r14)
        L_0x01e1:
            return r4
        L_0x01e2:
            r13.f20312l = r6
            com.google.android.gms.internal.ads.hu r0 = r13.f20310j
            if (r0 == 0) goto L_0x0200
            com.google.android.gms.internal.ads.pp r0 = new com.google.android.gms.internal.ads.pp
            com.google.android.gms.internal.ads.hu r1 = r13.f20310j
            java.lang.String r1 = r1.f10485a
            android.net.Uri r2 = android.net.Uri.parse(r1)
            r3 = 0
            long r4 = r14.f15942b
            long r6 = r14.f15943c
            long r8 = r14.f15944d
            r10 = 0
            r11 = 0
            r1 = r0
            r1.<init>(r2, r3, r4, r6, r8, r10, r11)
            r14 = r0
        L_0x0200:
            com.google.android.gms.internal.ads.np r0 = r13.f20303c
            long r0 = r0.mo12053d(r14)
            return r0
        L_0x0207:
            java.io.IOException r14 = new java.io.IOException
            java.lang.String r0 = "Attempt to open an already open CacheDataSource."
            r14.<init>(r0)
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.xp0.mo12053d(com.google.android.gms.internal.ads.pp):long");
    }

    /* renamed from: e */
    public final Uri mo12054e() {
        return this.f20309i;
    }

    /* renamed from: f */
    public final long mo15214f() {
        return this.f20315o;
    }

    /* renamed from: g */
    public final long mo15215g() {
        if (this.f20310j == null) {
            return -1;
        }
        if (this.f20317q.get() != -1) {
            return this.f20317q.get();
        }
        synchronized (this) {
            if (this.f20316p == null) {
                this.f20316p = dn0.f8325a.mo12324a(new wp0(this));
            }
        }
        if (!this.f20316p.isDone()) {
            return -1;
        }
        try {
            this.f20317q.compareAndSet(-1, ((Long) this.f20316p.get()).longValue());
            return this.f20317q.get();
        } catch (InterruptedException | ExecutionException unused) {
            return -1;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public final /* synthetic */ Long mo15216h() throws Exception {
        return Long.valueOf(C4409t.m29313e().mo9350a(this.f20310j));
    }

    /* renamed from: i */
    public final boolean mo15217i() {
        return this.f20311k;
    }

    /* renamed from: j */
    public final boolean mo15218j() {
        return this.f20314n;
    }

    /* renamed from: k */
    public final boolean mo15219k() {
        return this.f20313m;
    }

    /* renamed from: l */
    public final boolean mo15220l() {
        return this.f20312l;
    }
}
