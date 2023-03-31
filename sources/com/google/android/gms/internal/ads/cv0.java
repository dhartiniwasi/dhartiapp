package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;
import p060h4.C4596v;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class cv0 implements b44 {

    /* renamed from: a */
    private final o44 f7958a;

    /* renamed from: b */
    private final o44 f7959b;

    public cv0(o44 o44, o44 o442) {
        this.f7958a = o44;
        this.f7959b = o442;
    }

    /* renamed from: d */
    public final /* bridge */ /* synthetic */ Object mo8155d() {
        Set set;
        u22 u22 = (u22) this.f7958a.mo8155d();
        mf3 mf3 = dn0.f8325a;
        j44.m14699b(mf3);
        if (((Boolean) C4596v.m30088c().mo12227b(C2679nz.f14374N1)).booleanValue()) {
            if (((Boolean) C4596v.m30088c().mo12227b(C2679nz.f14685s7)).booleanValue()) {
                set = Collections.singleton(new jh1(u22, mf3));
                j44.m14699b(set);
                return set;
            }
        }
        set = Collections.emptySet();
        j44.m14699b(set);
        return set;
    }
}
