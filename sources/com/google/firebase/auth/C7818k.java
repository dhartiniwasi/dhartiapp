package com.google.firebase.auth;

import p033d5.C4141r;

/* renamed from: com.google.firebase.auth.k */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public class C7818k {
    /* renamed from: a */
    public static C7806h m43424a(String str, String str2) {
        C4141r.m28217g(str);
        C4141r.m28217g(str2);
        return new C7814j(str, str2, (String) null, (String) null, false);
    }

    /* renamed from: b */
    public static C7806h m43425b(String str, String str2) {
        if (C7814j.m43409S1(str2)) {
            return new C7814j(str, (String) null, str2, (String) null, false);
        }
        throw new IllegalArgumentException("Given link is not a valid email link. Please use FirebaseAuth#isSignInWithEmailLink(String) to determine this before calling this function");
    }
}
