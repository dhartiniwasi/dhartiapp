package com.google.android.gms.internal.p026firebaseauthapi;

import java.io.UnsupportedEncodingException;
import java.util.List;
import p033d5.C4141r;
import p067i5.C4689c;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.c */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C3191c {
    /* renamed from: a */
    public static long m25215a(String str) {
        C4141r.m28217g(str);
        List d = C3262e4.m25464b('.').mo15981d(str);
        if (d.size() >= 2) {
            try {
                C3224d a = C3224d.m25369a(new String(C4689c.m30370b((String) d.get(1)), "UTF-8"));
                return a.mo15923b().longValue() - a.mo15924c().longValue();
            } catch (UnsupportedEncodingException e) {
                throw new RuntimeException("Unable to decode token", e);
            }
        } else {
            throw new RuntimeException("Invalid idToken ".concat(String.valueOf(str)));
        }
    }
}
