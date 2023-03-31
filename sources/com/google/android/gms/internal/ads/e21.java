package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class e21 implements b44 {

    /* renamed from: a */
    private final o44 f8614a;

    /* renamed from: b */
    private final o44 f8615b;

    /* renamed from: c */
    private final o44 f8616c;

    public e21(o44 o44, o44 o442, o44 o443) {
        this.f8614a = o44;
        this.f8615b = o442;
        this.f8616c = o443;
    }

    /* renamed from: d */
    public final /* bridge */ /* synthetic */ Object mo8155d() {
        Set set;
        x11 x11 = (x11) this.f8614a.mo8155d();
        mf3 mf3 = dn0.f8325a;
        j44.m14699b(mf3);
        if (((JSONObject) this.f8616c.mo8155d()) == null) {
            set = Collections.emptySet();
        } else {
            set = Collections.singleton(new jh1(x11, mf3));
        }
        j44.m14699b(set);
        return set;
    }
}
