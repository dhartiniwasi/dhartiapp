package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final /* synthetic */ class vi4 implements Comparator {

    /* renamed from: a */
    public static final /* synthetic */ vi4 f19114a = new vi4();

    private /* synthetic */ vi4() {
    }

    public final int compare(Object obj, Object obj2) {
        return ((cj4) Collections.max((List) obj)).compareTo((cj4) Collections.max((List) obj2));
    }
}
