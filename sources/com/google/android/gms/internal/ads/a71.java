package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import p053g4.C4409t;
import p060h4.C4541l4;
import p060h4.C4596v;
import p060h4.C4623z2;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class a71 {

    /* renamed from: a */
    private final l02 f6443a;

    /* renamed from: b */
    private final et2 f6444b;

    /* renamed from: c */
    private final kx2 f6445c;

    /* renamed from: d */
    private final f01 f6446d;

    /* renamed from: e */
    private final x82 f6447e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final ff1 f6448f;

    /* renamed from: g */
    private us2 f6449g;

    /* renamed from: h */
    private final q12 f6450h;

    /* renamed from: i */
    private final b91 f6451i;

    /* renamed from: j */
    private final Executor f6452j;

    /* renamed from: k */
    private final d12 f6453k;

    /* renamed from: l */
    private final i52 f6454l;

    a71(l02 l02, et2 et2, kx2 kx2, f01 f01, x82 x82, ff1 ff1, us2 us2, q12 q12, b91 b91, Executor executor, d12 d12, i52 i52) {
        this.f6443a = l02;
        this.f6444b = et2;
        this.f6445c = kx2;
        this.f6446d = f01;
        this.f6447e = x82;
        this.f6448f = ff1;
        this.f6449g = us2;
        this.f6450h = q12;
        this.f6451i = b91;
        this.f6452j = executor;
        this.f6453k = d12;
        this.f6454l = i52;
    }

    /* renamed from: a */
    public final C4623z2 mo8231a(Throwable th) {
        return eu2.m12269b(th, this.f6454l);
    }

    /* renamed from: c */
    public final ff1 mo8232c() {
        return this.f6448f;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final /* synthetic */ us2 mo8233d(us2 us2) throws Exception {
        this.f6446d.mo10054a(us2);
        return us2;
    }

    /* renamed from: e */
    public final lf3 mo8234e(xu2 xu2) {
        ow2 a = this.f6445c.mo8966b(ex2.GET_CACHE_KEY, this.f6451i.mo8699c()).mo8582f(new x61(this, xu2)).mo8577a();
        cf3.m10920r(a, new y61(this), this.f6452j);
        return a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final /* synthetic */ lf3 mo8235f(xu2 xu2, yg0 yg0) throws Exception {
        yg0.f20602i = xu2;
        return this.f6450h.mo13447a(yg0);
    }

    /* renamed from: g */
    public final lf3 mo8236g(yg0 yg0) {
        ow2 a = this.f6445c.mo8966b(ex2.NOTIFY_CACHE_HIT, this.f6450h.mo13452f(yg0)).mo8577a();
        cf3.m10920r(a, new z61(this), this.f6452j);
        return a;
    }

    /* renamed from: h */
    public final lf3 mo8237h(lf3 lf3) {
        ax2 f = this.f6445c.mo8966b(ex2.RENDERER, lf3).mo8581e(new w61(this)).mo8582f(this.f6447e);
        if (!((Boolean) C4596v.m30088c().mo12227b(C2679nz.f14277D4)).booleanValue()) {
            f = f.mo8585i((long) ((Integer) C4596v.m30088c().mo12227b(C2679nz.f14287E4)).intValue(), TimeUnit.SECONDS);
        }
        return f.mo8577a();
    }

    /* renamed from: i */
    public final lf3 mo8238i() {
        C4541l4 l4Var = this.f6444b.f8933d;
        if (l4Var.f24888F == null && l4Var.f24883A == null) {
            return mo8239j(this.f6451i.mo8699c());
        }
        kx2 kx2 = this.f6445c;
        return tw2.m21276c(this.f6443a.mo11863a(), ex2.PRELOADED_LOADER, kx2).mo8577a();
    }

    /* renamed from: j */
    public final lf3 mo8239j(lf3 lf3) {
        us2 us2 = this.f6449g;
        if (us2 != null) {
            kx2 kx2 = this.f6445c;
            return tw2.m21276c(cf3.m10911i(us2), ex2.SERVER_TRANSACTION, kx2).mo8577a();
        }
        C4409t.m29313e().mo9354j();
        return this.f6445c.mo8966b(ex2.SERVER_TRANSACTION, lf3).mo8582f(new v61(this.f6453k)).mo8577a();
    }

    /* renamed from: k */
    public final void mo8240k(us2 us2) {
        this.f6449g = us2;
    }
}
