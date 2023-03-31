package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.SystemClock;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class jm4 {

    /* renamed from: a */
    private final Handler f11715a;

    /* renamed from: b */
    private final km4 f11716b;

    public jm4(Handler handler, km4 km4) {
        this.f11715a = km4 == null ? null : handler;
        this.f11716b = km4;
    }

    /* renamed from: a */
    public final void mo11449a(String str, long j, long j2) {
        Handler handler = this.f11715a;
        if (handler != null) {
            handler.post(new em4(this, str, j, j2));
        }
    }

    /* renamed from: b */
    public final void mo11450b(String str) {
        Handler handler = this.f11715a;
        if (handler != null) {
            handler.post(new im4(this, str));
        }
    }

    /* renamed from: c */
    public final void mo11451c(ny3 ny3) {
        ny3.mo12729a();
        Handler handler = this.f11715a;
        if (handler != null) {
            handler.post(new dm4(this, ny3));
        }
    }

    /* renamed from: d */
    public final void mo11452d(int i, long j) {
        Handler handler = this.f11715a;
        if (handler != null) {
            handler.post(new yl4(this, i, j));
        }
    }

    /* renamed from: e */
    public final void mo11453e(ny3 ny3) {
        Handler handler = this.f11715a;
        if (handler != null) {
            handler.post(new cm4(this, ny3));
        }
    }

    /* renamed from: f */
    public final void mo11454f(C2388g4 g4Var, oz3 oz3) {
        Handler handler = this.f11715a;
        if (handler != null) {
            handler.post(new fm4(this, g4Var, oz3));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final /* synthetic */ void mo11455g(String str, long j, long j2) {
        km4 km4 = this.f11716b;
        int i = gb2.f9812a;
        km4.mo11604p(str, j, j2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public final /* synthetic */ void mo11456h(String str) {
        km4 km4 = this.f11716b;
        int i = gb2.f9812a;
        km4.mo11583A(str);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public final /* synthetic */ void mo11457i(ny3 ny3) {
        ny3.mo12729a();
        km4 km4 = this.f11716b;
        int i = gb2.f9812a;
        km4.mo11596l(ny3);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public final /* synthetic */ void mo11458j(int i, long j) {
        km4 km4 = this.f11716b;
        int i2 = gb2.f9812a;
        km4.mo11588d(i, j);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public final /* synthetic */ void mo11459k(ny3 ny3) {
        km4 km4 = this.f11716b;
        int i = gb2.f9812a;
        km4.mo11598n(ny3);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public final /* synthetic */ void mo11460l(C2388g4 g4Var, oz3 oz3) {
        int i = gb2.f9812a;
        this.f11716b.mo11587c(g4Var, oz3);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public final /* synthetic */ void mo11461m(Object obj, long j) {
        km4 km4 = this.f11716b;
        int i = gb2.f9812a;
        km4.mo11606r(obj, j);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public final /* synthetic */ void mo11462n(long j, int i) {
        km4 km4 = this.f11716b;
        int i2 = gb2.f9812a;
        km4.mo11589e(j, i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public final /* synthetic */ void mo11463o(Exception exc) {
        km4 km4 = this.f11716b;
        int i = gb2.f9812a;
        km4.mo11599o(exc);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public final /* synthetic */ void mo11464p(s61 s61) {
        km4 km4 = this.f11716b;
        int i = gb2.f9812a;
        km4.mo11584I(s61);
    }

    /* renamed from: q */
    public final void mo11465q(Object obj) {
        if (this.f11715a != null) {
            this.f11715a.post(new zl4(this, obj, SystemClock.elapsedRealtime()));
        }
    }

    /* renamed from: r */
    public final void mo11466r(long j, int i) {
        Handler handler = this.f11715a;
        if (handler != null) {
            handler.post(new bm4(this, j, i));
        }
    }

    /* renamed from: s */
    public final void mo11467s(Exception exc) {
        Handler handler = this.f11715a;
        if (handler != null) {
            handler.post(new am4(this, exc));
        }
    }

    /* renamed from: t */
    public final void mo11468t(s61 s61) {
        Handler handler = this.f11715a;
        if (handler != null) {
            handler.post(new hm4(this, s61));
        }
    }
}
