package com.google.android.gms.internal.ads;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class sb3 extends wb3 {

    /* renamed from: a */
    final /* synthetic */ Comparator f17341a;

    sb3(Comparator comparator) {
        this.f17341a = comparator;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final Map mo13736a() {
        return new TreeMap(this.f17341a);
    }
}
