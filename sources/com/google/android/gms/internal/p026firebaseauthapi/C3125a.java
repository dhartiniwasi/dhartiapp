package com.google.android.gms.internal.p026firebaseauthapi;

import android.os.Build;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.a */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
final class C3125a {
    /* renamed from: a */
    static boolean m24975a() {
        return Build.VERSION.SDK_INT >= 33 || Build.VERSION.CODENAME.charAt(0) == 'T';
    }
}
