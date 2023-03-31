package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final /* synthetic */ class xi4 implements Comparator {

    /* renamed from: a */
    public static final /* synthetic */ xi4 f20114a = new xi4();

    private /* synthetic */ xi4() {
    }

    public final int compare(Object obj, Object obj2) {
        List list = (List) obj;
        List list2 = (List) obj2;
        ja3 i = ja3.m14783i();
        sj4 sj4 = sj4.f17501a;
        ja3 b = i.mo10777c((uj4) Collections.max(list, sj4), (uj4) Collections.max(list2, sj4), sj4).mo10776b(list.size(), list2.size());
        tj4 tj4 = tj4.f18021a;
        return b.mo10777c((uj4) Collections.max(list, tj4), (uj4) Collections.max(list2, tj4), tj4).mo10775a();
    }
}
