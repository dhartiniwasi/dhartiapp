package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.measurement.ia */
/* compiled from: com.google.android.gms:play-services-measurement-base@@21.2.0 */
final class C7012ia {
    C7012ia() {
    }

    /* renamed from: a */
    public static final int m40210a(int i, Object obj, Object obj2) {
        C6996ha haVar = (C6996ha) obj;
        C6979ga gaVar = (C6979ga) obj2;
        if (haVar.isEmpty()) {
            return 0;
        }
        Iterator it = haVar.entrySet().iterator();
        if (!it.hasNext()) {
            return 0;
        }
        Map.Entry entry = (Map.Entry) it.next();
        entry.getKey();
        entry.getValue();
        throw null;
    }

    /* renamed from: b */
    public static final Object m40211b(Object obj, Object obj2) {
        C6996ha haVar = (C6996ha) obj;
        C6996ha haVar2 = (C6996ha) obj2;
        if (!haVar2.isEmpty()) {
            if (!haVar.mo23508f()) {
                haVar = haVar.mo23502c();
            }
            haVar.mo23505e(haVar2);
        }
        return haVar;
    }
}
