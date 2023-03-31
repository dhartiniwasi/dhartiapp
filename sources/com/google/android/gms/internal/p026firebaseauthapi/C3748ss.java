package com.google.android.gms.internal.p026firebaseauthapi;

import java.util.logging.Logger;
import java.util.regex.Pattern;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.ss */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
final class C3748ss {

    /* renamed from: a */
    private static final Logger f22709a = Logger.getLogger(C3748ss.class.getName());

    /* renamed from: b */
    private static final C3780tr f22710b = new C3780tr((C3845vq) null);

    private C3748ss() {
    }

    /* renamed from: a */
    static C3774tl m26943a(String str) {
        return new C3810uo(Pattern.compile("[.-]"));
    }

    /* renamed from: b */
    static String m26944b(String str) {
        return str == null ? "" : str;
    }

    /* renamed from: c */
    static boolean m26945c(String str) {
        return str == null || str.isEmpty();
    }
}
