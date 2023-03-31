package com.google.android.gms.internal.p026firebaseauthapi;

import android.content.Context;
import android.content.pm.PackageManager;
import android.util.Log;
import p033d5.C4141r;
import p067i5.C4687a;
import p067i5.C4696j;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.eu */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C3288eu {

    /* renamed from: a */
    private final String f22006a;

    /* renamed from: b */
    private final String f22007b;

    public C3288eu(Context context, String str) {
        C4141r.m28221k(context);
        String g = C4141r.m28217g(str);
        this.f22006a = g;
        try {
            byte[] a = C4687a.m30364a(context, g);
            if (a == null) {
                Log.e("FBA-PackageInfo", "single cert required: ".concat(String.valueOf(str)));
                this.f22007b = null;
                return;
            }
            this.f22007b = C4696j.m30403c(a, false);
        } catch (PackageManager.NameNotFoundException unused) {
            Log.e("FBA-PackageInfo", "no pkg: ".concat(String.valueOf(str)));
            this.f22007b = null;
        }
    }

    /* renamed from: a */
    public final String mo16002a() {
        return this.f22007b;
    }

    /* renamed from: b */
    public final String mo16003b() {
        return this.f22006a;
    }
}
