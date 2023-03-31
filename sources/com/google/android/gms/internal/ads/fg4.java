package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class fg4 extends zf4 {

    /* renamed from: f */
    public static final Object f9275f = new Object();

    /* renamed from: d */
    private final Object f9276d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final Object f9277e;

    private fg4(gt0 gt0, Object obj, Object obj2) {
        super(gt0);
        this.f9276d = obj;
        this.f9277e = obj2;
    }

    /* renamed from: q */
    public static fg4 m12605q(C2453hw hwVar) {
        return new fg4(new gg4(hwVar), fs0.f9422o, f9275f);
    }

    /* renamed from: r */
    public static fg4 m12606r(gt0 gt0, Object obj, Object obj2) {
        return new fg4(gt0, obj, obj2);
    }

    /* renamed from: a */
    public final int mo8899a(Object obj) {
        Object obj2;
        gt0 gt0 = this.f21080c;
        if (f9275f.equals(obj) && (obj2 = this.f9277e) != null) {
            obj = obj2;
        }
        return gt0.mo8899a(obj);
    }

    /* renamed from: d */
    public final dq0 mo8902d(int i, dq0 dq0, boolean z) {
        this.f21080c.mo8902d(i, dq0, z);
        if (gb2.m13186t(dq0.f8360b, this.f9277e) && z) {
            dq0.f8360b = f9275f;
        }
        return dq0;
    }

    /* renamed from: e */
    public final fs0 mo8903e(int i, fs0 fs0, long j) {
        this.f21080c.mo8903e(i, fs0, j);
        if (gb2.m13186t(fs0.f9426a, this.f9276d)) {
            fs0.f9426a = fs0.f9422o;
        }
        return fs0;
    }

    /* renamed from: f */
    public final Object mo8904f(int i) {
        Object f = this.f21080c.mo8904f(i);
        return gb2.m13186t(f, this.f9277e) ? f9275f : f;
    }

    /* renamed from: p */
    public final fg4 mo10162p(gt0 gt0) {
        return new fg4(gt0, this.f9276d, this.f9277e);
    }
}
