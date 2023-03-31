package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class le2 implements tj2 {

    /* renamed from: a */
    private final Set f12755a;

    le2(Set set) {
        this.f12755a = set;
    }

    /* renamed from: d */
    public final lf3 mo8340d() {
        ArrayList arrayList = new ArrayList();
        for (String add : this.f12755a) {
            arrayList.add(add);
        }
        return cf3.m10911i(new ke2(arrayList));
    }

    public final int zza() {
        return 8;
    }
}
