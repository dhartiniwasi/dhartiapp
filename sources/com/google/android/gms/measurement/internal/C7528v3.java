package com.google.android.gms.measurement.internal;

import p081k5.C4887b;
import p081k5.C4888c;

/* renamed from: com.google.android.gms.measurement.internal.v3 */
/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
public final class C7528v3 {

    /* renamed from: a */
    final C7397j4 f33107a;

    C7528v3(C7303a9 a9Var) {
        this.f33107a = a9Var.mo24120c0();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean mo24691a() {
        try {
            C4887b a = C4888c.m31075a(this.f33107a.mo24121d());
            if (a == null) {
                this.f33107a.mo24135l().mo24260v().mo24208a("Failed to get PackageManager for Install Referrer Play Store compatibility check");
                return false;
            } else if (a.mo18673f("com.android.vending", 128).versionCode >= 80837300) {
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
            this.f33107a.mo24135l().mo24260v().mo24209b("Failed to retrieve Play Store version for Install Referrer", e);
            return false;
        }
    }
}
