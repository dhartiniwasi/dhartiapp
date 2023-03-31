package com.google.android.gms.internal.p026firebaseauthapi;

import android.content.Context;
import p180z4.C6370f;
import p180z4.C6378j;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.at */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C3155at {

    /* renamed from: a */
    private static Boolean f21764a;

    /* renamed from: a */
    public static boolean m25054a(Context context) {
        if (f21764a == null) {
            int j = C6370f.m37437h().mo21777j(context, C6378j.f30617a);
            boolean z = true;
            if (!(j == 0 || j == 2)) {
                z = false;
            }
            f21764a = Boolean.valueOf(z);
        }
        return f21764a.booleanValue();
    }
}
