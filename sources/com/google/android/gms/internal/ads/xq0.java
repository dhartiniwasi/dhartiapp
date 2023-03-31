package com.google.android.gms.internal.ads;

import p053g4.C4409t;
import p060h4.C4596v;
import p073j4.C4749b0;
import p073j4.C4751b2;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class xq0 extends C4749b0 {

    /* renamed from: c */
    final ap0 f20325c;

    /* renamed from: d */
    final gr0 f20326d;

    /* renamed from: e */
    private final String f20327e;

    /* renamed from: f */
    private final String[] f20328f;

    xq0(ap0 ap0, gr0 gr0, String str, String[] strArr) {
        this.f20325c = ap0;
        this.f20326d = gr0;
        this.f20327e = str;
        this.f20328f = strArr;
        C4409t.m29307A().mo15496c(this);
    }

    /* renamed from: a */
    public final void mo14322a() {
        try {
            this.f20326d.mo10632u(this.f20327e, this.f20328f);
        } finally {
            C4751b2.f25403i.post(new wq0(this));
        }
    }

    /* renamed from: b */
    public final lf3 mo15227b() {
        if (!((Boolean) C4596v.m30088c().mo12227b(C2679nz.f14344K1)).booleanValue() || !(this.f20326d instanceof pr0)) {
            return super.mo15227b();
        }
        return dn0.f8329e.mo12324a(new vq0(this));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final /* synthetic */ Boolean mo15228d() throws Exception {
        return Boolean.valueOf(this.f20326d.mo10633v(this.f20327e, this.f20328f, this));
    }

    /* renamed from: e */
    public final String mo15229e() {
        return this.f20327e;
    }
}
