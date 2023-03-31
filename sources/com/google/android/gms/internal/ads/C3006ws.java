package com.google.android.gms.internal.ads;

import java.util.Comparator;

/* renamed from: com.google.android.gms.internal.ads.ws */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class C3006ws implements Comparator {
    C3006ws(C3080ys ysVar) {
    }

    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        C2264ct ctVar = (C2264ct) obj;
        C2264ct ctVar2 = (C2264ct) obj2;
        int i = ctVar.f7894c - ctVar2.f7894c;
        if (i != 0) {
            return i;
        }
        return (ctVar.f7892a > ctVar2.f7892a ? 1 : (ctVar.f7892a == ctVar2.f7892a ? 0 : -1));
    }
}
