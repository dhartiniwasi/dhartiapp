package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class yp0 {

    /* renamed from: a */
    private final C2781qp f20768a = new C2781qp(true, 65536);

    /* renamed from: b */
    private long f20769b = 15000000;

    /* renamed from: c */
    private long f20770c = 30000000;

    /* renamed from: d */
    private long f20771d = 2500000;

    /* renamed from: e */
    private long f20772e = 5000000;

    /* renamed from: f */
    private int f20773f;

    /* renamed from: g */
    private boolean f20774g;

    yp0() {
    }

    /* renamed from: a */
    public final void mo15480a() {
        mo15484e(false);
    }

    /* renamed from: b */
    public final void mo15481b() {
        mo15484e(true);
    }

    /* renamed from: c */
    public final void mo15482c() {
        mo15484e(true);
    }

    /* renamed from: d */
    public final void mo15483d(C2996wi[] wiVarArr, C2891to toVar, C2409gp gpVar) {
        this.f20773f = 0;
        for (int i = 0; i < 2; i++) {
            if (gpVar.mo10596a(i) != null) {
                this.f20773f += C2893tq.m21175f(wiVarArr[i].mo8370e());
            }
        }
        this.f20768a.mo13581f(this.f20773f);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final void mo15484e(boolean z) {
        this.f20773f = 0;
        this.f20774g = false;
        if (z) {
            this.f20768a.mo13580e();
        }
    }

    /* renamed from: f */
    public final synchronized void mo15485f(int i) {
        this.f20771d = ((long) i) * 1000;
    }

    /* renamed from: g */
    public final synchronized void mo15486g(int i) {
        this.f20772e = ((long) i) * 1000;
    }

    /* renamed from: h */
    public final synchronized void mo15487h(int i) {
        this.f20770c = ((long) i) * 1000;
    }

    /* renamed from: i */
    public final synchronized void mo15488i(int i) {
        this.f20769b = ((long) i) * 1000;
    }

    /* renamed from: j */
    public final synchronized boolean mo15489j(long j) {
        boolean z;
        z = true;
        char c = j > this.f20770c ? 0 : j < this.f20769b ? (char) 2 : 1;
        int a = this.f20768a.mo13576a();
        int i = this.f20773f;
        if (c != 2) {
            if (c != 1 || !this.f20774g || a >= i) {
                z = false;
            }
        }
        this.f20774g = z;
        return z;
    }

    /* renamed from: k */
    public final synchronized boolean mo15490k(long j, boolean z) {
        long j2;
        j2 = z ? this.f20772e : this.f20771d;
        return j2 <= 0 || j >= j2;
    }

    /* renamed from: l */
    public final C2781qp mo15491l() {
        return this.f20768a;
    }
}
