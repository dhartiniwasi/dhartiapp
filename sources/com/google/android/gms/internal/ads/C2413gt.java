package com.google.android.gms.internal.ads;

import java.util.Comparator;

/* renamed from: com.google.android.gms.internal.ads.gt */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class C2413gt implements Comparator {
    public C2413gt(C2450ht htVar) {
    }

    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        C2932us usVar = (C2932us) obj;
        C2932us usVar2 = (C2932us) obj2;
        if (usVar.mo14605d() >= usVar2.mo14605d()) {
            if (usVar.mo14605d() > usVar2.mo14605d()) {
                return 1;
            }
            if (usVar.mo14603b() >= usVar2.mo14603b()) {
                if (usVar.mo14603b() > usVar2.mo14603b()) {
                    return 1;
                }
                float a = (usVar.mo14602a() - usVar.mo14605d()) * (usVar.mo14604c() - usVar.mo14603b());
                float a2 = (usVar2.mo14602a() - usVar2.mo14605d()) * (usVar2.mo14604c() - usVar2.mo14603b());
                if (a <= a2) {
                    if (a < a2) {
                        return 1;
                    }
                    return 0;
                }
            }
        }
        return -1;
    }
}
