package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class je3 extends le3 {
    je3(pa3 pa3, boolean z) {
        super(pa3, true);
        mo8754R();
    }

    /* renamed from: V */
    public final /* bridge */ /* synthetic */ Object mo11396V(List list) {
        ArrayList a = jb3.m14812a(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ke3 ke3 = (ke3) it.next();
            a.add(ke3 != null ? ke3.f12060a : null);
        }
        return Collections.unmodifiableList(a);
    }
}
