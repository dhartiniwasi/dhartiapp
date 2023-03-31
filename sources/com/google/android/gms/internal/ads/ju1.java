package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import p060h4.C4596v;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class ju1 implements b44 {

    /* renamed from: a */
    private final o44 f11793a;

    /* renamed from: b */
    private final o44 f11794b;

    /* renamed from: c */
    private final o44 f11795c;

    /* renamed from: d */
    private final o44 f11796d;

    public ju1(o44 o44, o44 o442, o44 o443, o44 o444) {
        this.f11793a = o44;
        this.f11794b = o442;
        this.f11795c = o443;
        this.f11796d = o444;
    }

    /* renamed from: d */
    public final /* bridge */ /* synthetic */ Object mo8155d() {
        Set set;
        String a = ((em2) this.f11793a).mo9940a();
        Context a2 = ((yu0) this.f11794b).mo15509a();
        mf3 mf3 = dn0.f8325a;
        j44.m14699b(mf3);
        Map c = ((f44) this.f11796d).mo8155d();
        if (((Boolean) C4596v.m30088c().mo12227b(C2679nz.f14502a4)).booleanValue()) {
            C2971vu vuVar = new C2971vu(new C2229bv(a2));
            vuVar.mo14819b(new ku1(a));
            set = Collections.singleton(new jh1(new mu1(vuVar, c), mf3));
        } else {
            set = Collections.emptySet();
        }
        j44.m14699b(set);
        return set;
    }
}
