package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.p026firebaseauthapi.C3126a0;
import p033d5.C4141r;
import p040e5.C4243c;

/* renamed from: com.google.firebase.auth.e0 */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public class C7795e0 extends C7806h {
    public static final Parcelable.Creator<C7795e0> CREATOR = new C7787c1();

    /* renamed from: a */
    private final String f34125a;

    /* renamed from: b */
    private final String f34126b;

    C7795e0(String str, String str2) {
        if (str == null && str2 == null) {
            throw new IllegalArgumentException("Must specify an idToken or an accessToken.");
        } else if (str != null && str.length() == 0) {
            throw new IllegalArgumentException("idToken cannot be empty");
        } else if (str2 == null || str2.length() != 0) {
            this.f34125a = str;
            this.f34126b = str2;
        } else {
            throw new IllegalArgumentException("accessToken cannot be empty");
        }
    }

    /* renamed from: L1 */
    public static C3126a0 m43361L1(C7795e0 e0Var, String str) {
        C4141r.m28221k(e0Var);
        return new C3126a0(e0Var.f34125a, e0Var.f34126b, e0Var.mo26062I1(), (String) null, (String) null, (String) null, str, (String) null, (String) null);
    }

    /* renamed from: I1 */
    public String mo26062I1() {
        return "google.com";
    }

    /* renamed from: J1 */
    public String mo26063J1() {
        return "google.com";
    }

    /* renamed from: K1 */
    public final C7806h mo26064K1() {
        return new C7795e0(this.f34125a, this.f34126b);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C4243c.m28604a(parcel);
        C4243c.m28620q(parcel, 1, this.f34125a, false);
        C4243c.m28620q(parcel, 2, this.f34126b, false);
        C4243c.m28605b(parcel, a);
    }
}
