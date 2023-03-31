package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class kk1 implements b44 {

    /* renamed from: a */
    private final o44 f12135a;

    public kk1(o44 o44) {
        this.f12135a = o44;
    }

    /* renamed from: d */
    public final /* bridge */ /* synthetic */ Object mo8155d() {
        Set set;
        if (((hk1) this.f12135a).mo10831a().mo11443e() != null) {
            set = Collections.singleton("banner");
        } else {
            set = Collections.emptySet();
        }
        j44.m14699b(set);
        return set;
    }
}
