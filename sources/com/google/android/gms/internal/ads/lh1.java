package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import p060h4.C4596v;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class lh1 extends kf1 implements C2894tr {

    /* renamed from: b */
    private final Map f12803b = new WeakHashMap(1);

    /* renamed from: c */
    private final Context f12804c;

    /* renamed from: d */
    private final is2 f12805d;

    public lh1(Context context, Set set, is2 is2) {
        super(set);
        this.f12804c = context;
        this.f12805d = is2;
    }

    /* renamed from: N */
    public final synchronized void mo8416N(C2857sr srVar) {
        mo11671o0(new kh1(srVar));
    }

    /* renamed from: p0 */
    public final synchronized void mo12019p0(View view) {
        C2931ur urVar = (C2931ur) this.f12803b.get(view);
        if (urVar == null) {
            urVar = new C2931ur(this.f12804c, view);
            urVar.mo14576c(this);
            this.f12803b.put(view, urVar);
        }
        if (this.f12805d.f10966Y) {
            if (((Boolean) C4596v.m30088c().mo12227b(C2679nz.f14569h1)).booleanValue()) {
                urVar.mo14580g(((Long) C4596v.m30088c().mo12227b(C2679nz.f14559g1)).longValue());
                return;
            }
        }
        urVar.mo14579f();
    }

    /* renamed from: q0 */
    public final synchronized void mo12020q0(View view) {
        if (this.f12803b.containsKey(view)) {
            ((C2931ur) this.f12803b.get(view)).mo14578e(this);
            this.f12803b.remove(view);
        }
    }
}
