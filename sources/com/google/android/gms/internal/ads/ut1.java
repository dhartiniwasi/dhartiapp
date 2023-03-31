package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;
import p060h4.C4596v;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class ut1 implements b44 {

    /* renamed from: a */
    private final o44 f18726a;

    /* renamed from: b */
    private final o44 f18727b;

    public ut1(o44 o44, o44 o442) {
        this.f18726a = o44;
        this.f18727b = o442;
    }

    /* renamed from: d */
    public final /* bridge */ /* synthetic */ Object mo8155d() {
        Set set;
        mf3 mf3 = dn0.f8325a;
        j44.m14699b(mf3);
        mu1 a = ((nu1) this.f18727b).mo8155d();
        if (((Boolean) C4596v.m30088c().mo12227b(C2679nz.f14502a4)).booleanValue()) {
            set = Collections.singleton(new jh1(a, mf3));
        } else {
            set = Collections.emptySet();
        }
        j44.m14699b(set);
        return set;
    }
}
