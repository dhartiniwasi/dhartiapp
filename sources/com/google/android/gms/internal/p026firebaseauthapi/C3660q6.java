package com.google.android.gms.internal.p026firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.q6 */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C3660q6 {

    /* renamed from: a */
    private static final CopyOnWriteArrayList f22543a = new CopyOnWriteArrayList();

    /* renamed from: a */
    public static C3627p6 m26547a(String str) throws GeneralSecurityException {
        Iterator it = f22543a.iterator();
        while (it.hasNext()) {
            C3627p6 p6Var = (C3627p6) it.next();
            if (p6Var.mo16541i(str)) {
                return p6Var;
            }
        }
        throw new GeneralSecurityException("No KMS client does support: ".concat(String.valueOf(str)));
    }
}
