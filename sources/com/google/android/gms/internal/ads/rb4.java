package com.google.android.gms.internal.ads;

import android.os.Handler;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class rb4 {

    /* renamed from: a */
    private final Handler f16907a;

    /* renamed from: b */
    private final sb4 f16908b;

    public rb4(Handler handler, sb4 sb4) {
        this.f16907a = sb4 == null ? null : handler;
        this.f16908b = sb4;
    }

    /* renamed from: a */
    public final void mo13737a(Exception exc) {
        Handler handler = this.f16907a;
        if (handler != null) {
            handler.post(new hb4(this, exc));
        }
    }

    /* renamed from: b */
    public final void mo13738b(Exception exc) {
        Handler handler = this.f16907a;
        if (handler != null) {
            handler.post(new nb4(this, exc));
        }
    }

    /* renamed from: c */
    public final void mo13739c(String str, long j, long j2) {
        Handler handler = this.f16907a;
        if (handler != null) {
            handler.post(new mb4(this, str, j, j2));
        }
    }

    /* renamed from: d */
    public final void mo13740d(String str) {
        Handler handler = this.f16907a;
        if (handler != null) {
            handler.post(new ob4(this, str));
        }
    }

    /* renamed from: e */
    public final void mo13741e(ny3 ny3) {
        ny3.mo12729a();
        Handler handler = this.f16907a;
        if (handler != null) {
            handler.post(new ib4(this, ny3));
        }
    }

    /* renamed from: f */
    public final void mo13742f(ny3 ny3) {
        Handler handler = this.f16907a;
        if (handler != null) {
            handler.post(new jb4(this, ny3));
        }
    }

    /* renamed from: g */
    public final void mo13743g(C2388g4 g4Var, oz3 oz3) {
        Handler handler = this.f16907a;
        if (handler != null) {
            handler.post(new pb4(this, g4Var, oz3));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public final /* synthetic */ void mo13744h(Exception exc) {
        sb4 sb4 = this.f16908b;
        int i = gb2.f9812a;
        sb4.mo11590f(exc);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public final /* synthetic */ void mo13745i(Exception exc) {
        sb4 sb4 = this.f16908b;
        int i = gb2.f9812a;
        sb4.mo11594j(exc);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public final /* synthetic */ void mo13746j(String str, long j, long j2) {
        sb4 sb4 = this.f16908b;
        int i = gb2.f9812a;
        sb4.mo11592h(str, j, j2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public final /* synthetic */ void mo13747k(String str) {
        sb4 sb4 = this.f16908b;
        int i = gb2.f9812a;
        sb4.mo11610z(str);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public final /* synthetic */ void mo13748l(ny3 ny3) {
        ny3.mo12729a();
        sb4 sb4 = this.f16908b;
        int i = gb2.f9812a;
        sb4.mo11591g(ny3);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public final /* synthetic */ void mo13749m(ny3 ny3) {
        sb4 sb4 = this.f16908b;
        int i = gb2.f9812a;
        sb4.mo11593i(ny3);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public final /* synthetic */ void mo13750n(C2388g4 g4Var, oz3 oz3) {
        int i = gb2.f9812a;
        this.f16908b.mo11595k(g4Var, oz3);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public final /* synthetic */ void mo13751o(long j) {
        sb4 sb4 = this.f16908b;
        int i = gb2.f9812a;
        sb4.mo11605q(j);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public final /* synthetic */ void mo13752p(boolean z) {
        sb4 sb4 = this.f16908b;
        int i = gb2.f9812a;
        sb4.mo11585a(z);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public final /* synthetic */ void mo13753q(int i, long j, long j2) {
        sb4 sb4 = this.f16908b;
        int i2 = gb2.f9812a;
        sb4.mo11597m(i, j, j2);
    }

    /* renamed from: r */
    public final void mo13754r(long j) {
        Handler handler = this.f16907a;
        if (handler != null) {
            handler.post(new kb4(this, j));
        }
    }

    /* renamed from: s */
    public final void mo13755s(boolean z) {
        Handler handler = this.f16907a;
        if (handler != null) {
            handler.post(new lb4(this, z));
        }
    }

    /* renamed from: t */
    public final void mo13756t(int i, long j, long j2) {
        Handler handler = this.f16907a;
        if (handler != null) {
            handler.post(new qb4(this, i, j, j2));
        }
    }
}
