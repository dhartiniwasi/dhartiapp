package com.google.android.gms.internal.p026firebaseauthapi;

import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.j3 */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
final class C3426j3 {
    C3426j3() {
    }

    /* renamed from: a */
    public static final int m25885a(int i, Object obj, Object obj2) {
        C3393i3 i3Var = (C3393i3) obj;
        C3360h3 h3Var = (C3360h3) obj2;
        if (i3Var.isEmpty()) {
            return 0;
        }
        Iterator it = i3Var.entrySet().iterator();
        if (!it.hasNext()) {
            return 0;
        }
        Map.Entry entry = (Map.Entry) it.next();
        entry.getKey();
        entry.getValue();
        throw null;
    }

    /* renamed from: b */
    public static final boolean m25886b(Object obj) {
        return !((C3393i3) obj).mo16147f();
    }

    /* renamed from: c */
    public static final Object m25887c(Object obj, Object obj2) {
        C3393i3 i3Var = (C3393i3) obj;
        C3393i3 i3Var2 = (C3393i3) obj2;
        if (!i3Var2.isEmpty()) {
            if (!i3Var.mo16147f()) {
                i3Var = i3Var.mo16141c();
            }
            i3Var.mo16144e(i3Var2);
        }
        return i3Var;
    }
}
