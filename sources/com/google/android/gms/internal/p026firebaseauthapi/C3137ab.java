package com.google.android.gms.internal.p026firebaseauthapi;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import java.io.IOException;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.ab */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C3137ab implements C3594o6 {

    /* renamed from: a */
    private final SharedPreferences.Editor f21753a;

    /* renamed from: b */
    private final String f21754b = "GenericIdpKeyset";

    public C3137ab(Context context, String str, String str2) {
        Context applicationContext = context.getApplicationContext();
        if (str2 == null) {
            this.f21753a = PreferenceManager.getDefaultSharedPreferences(applicationContext).edit();
        } else {
            this.f21753a = applicationContext.getSharedPreferences(str2, 0).edit();
        }
    }

    /* renamed from: a */
    public final void mo15730a(C3276ei eiVar) throws IOException {
        if (!this.f21753a.putString(this.f21754b, C3247dm.m25434a(eiVar.mo16478h())).commit()) {
            throw new IOException("Failed to write to SharedPreferences");
        }
    }

    /* renamed from: b */
    public final void mo15731b(C3902xj xjVar) throws IOException {
        if (!this.f21753a.putString(this.f21754b, C3247dm.m25434a(xjVar.mo16478h())).commit()) {
            throw new IOException("Failed to write to SharedPreferences");
        }
    }
}
