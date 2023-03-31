package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class xy3 {
    xy3() {
    }

    /* renamed from: a */
    public static final int m23616a(int i, Object obj, Object obj2) {
        wy3 wy3 = (wy3) obj;
        vy3 vy3 = (vy3) obj2;
        if (wy3.isEmpty()) {
            return 0;
        }
        Iterator it = wy3.entrySet().iterator();
        if (!it.hasNext()) {
            return 0;
        }
        Map.Entry entry = (Map.Entry) it.next();
        entry.getKey();
        entry.getValue();
        throw null;
    }

    /* renamed from: b */
    public static final boolean m23617b(Object obj) {
        return !((wy3) obj).mo15008f();
    }

    /* renamed from: c */
    public static final Object m23618c(Object obj, Object obj2) {
        wy3 wy3 = (wy3) obj;
        wy3 wy32 = (wy3) obj2;
        if (!wy32.isEmpty()) {
            if (!wy3.mo15008f()) {
                wy3 = wy3.mo15002c();
            }
            wy3.mo15005e(wy32);
        }
        return wy3;
    }
}
