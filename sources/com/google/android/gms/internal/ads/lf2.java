package com.google.android.gms.internal.ads;

import android.os.Bundle;
import p053g4.C4409t;
import p060h4.C4596v;
import p073j4.C4800p1;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class lf2 implements tj2 {

    /* renamed from: h */
    private static final Object f12780h = new Object();

    /* renamed from: a */
    private final String f12781a;

    /* renamed from: b */
    private final String f12782b;

    /* renamed from: c */
    private final k71 f12783c;

    /* renamed from: d */
    private final ku2 f12784d;

    /* renamed from: e */
    private final et2 f12785e;

    /* renamed from: f */
    private final C4800p1 f12786f = C4409t.m29325q().mo15117h();

    /* renamed from: g */
    private final bv1 f12787g;

    public lf2(String str, String str2, k71 k71, ku2 ku2, et2 et2, bv1 bv1) {
        this.f12781a = str;
        this.f12782b = str2;
        this.f12783c = k71;
        this.f12784d = ku2;
        this.f12785e = et2;
        this.f12787g = bv1;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ void mo12011a(Bundle bundle, Bundle bundle2) {
        if (((Boolean) C4596v.m30088c().mo12227b(C2679nz.f14317H4)).booleanValue()) {
            bundle2.putBundle("quality_signals", bundle);
        } else {
            if (((Boolean) C4596v.m30088c().mo12227b(C2679nz.f14307G4)).booleanValue()) {
                synchronized (f12780h) {
                    this.f12783c.mo11613c(this.f12785e.f8933d);
                    bundle2.putBundle("quality_signals", this.f12784d.mo11799a());
                }
            } else {
                this.f12783c.mo11613c(this.f12785e.f8933d);
                bundle2.putBundle("quality_signals", this.f12784d.mo11799a());
            }
        }
        bundle2.putString("seq_num", this.f12781a);
        if (!this.f12786f.mo18501f0()) {
            bundle2.putString("session_id", this.f12782b);
        }
    }

    /* renamed from: d */
    public final lf3 mo8340d() {
        Bundle bundle = new Bundle();
        if (((Boolean) C4596v.m30088c().mo12227b(C2679nz.f14279D6)).booleanValue()) {
            this.f12787g.mo8951a().put("seq_num", this.f12781a);
        }
        if (((Boolean) C4596v.m30088c().mo12227b(C2679nz.f14317H4)).booleanValue()) {
            this.f12783c.mo11613c(this.f12785e.f8933d);
            bundle.putAll(this.f12784d.mo11799a());
        }
        return cf3.m10911i(new jf2(this, bundle));
    }

    public final int zza() {
        return 12;
    }
}
