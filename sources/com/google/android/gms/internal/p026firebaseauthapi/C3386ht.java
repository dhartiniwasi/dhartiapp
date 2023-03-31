package com.google.android.gms.internal.p026firebaseauthapi;

import android.text.TextUtils;
import android.util.Log;
import com.facebook.ads.AdError;
import java.util.List;
import p033d5.C4127n;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.ht */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C3386ht {

    /* renamed from: a */
    private final int f22108a;

    public C3386ht(String str) {
        int i = -1;
        try {
            List d = C3262e4.m25465c("[.-]").mo15981d(str);
            if (d.size() == 1) {
                i = Integer.parseInt(str);
            } else if (d.size() >= 3) {
                i = (Integer.parseInt((String) d.get(0)) * 1000000) + (Integer.parseInt((String) d.get(1)) * AdError.NETWORK_ERROR_CODE) + Integer.parseInt((String) d.get(2));
            }
        } catch (IllegalArgumentException e) {
            if (Log.isLoggable("LibraryVersionContainer", 3)) {
                Log.d("LibraryVersionContainer", String.format("Version code parsing failed for: %s with exception %s.", new Object[]{str, e}));
            }
        }
        this.f22108a = i;
    }

    /* renamed from: a */
    public static C3386ht m25724a() {
        String b = C4127n.m28185a().mo17431b("firebase-auth");
        if (TextUtils.isEmpty(b) || b.equals("UNKNOWN")) {
            b = "-1";
        }
        return new C3386ht(b);
    }

    /* renamed from: b */
    public final String mo16109b() {
        return String.format("X%s", new Object[]{Integer.toString(this.f22108a)});
    }
}
