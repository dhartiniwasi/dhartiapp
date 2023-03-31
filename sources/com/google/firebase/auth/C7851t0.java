package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.p026firebaseauthapi.C3126a0;
import p033d5.C4141r;
import p040e5.C4243c;

/* renamed from: com.google.firebase.auth.t0 */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public class C7851t0 extends C7806h {
    public static final Parcelable.Creator<C7851t0> CREATOR = new C7816j1();

    /* renamed from: a */
    private final String f34204a;

    C7851t0(String str) {
        this.f34204a = C4141r.m28217g(str);
    }

    /* renamed from: L1 */
    public static C3126a0 m43503L1(C7851t0 t0Var, String str) {
        C4141r.m28221k(t0Var);
        return new C3126a0((String) null, (String) null, t0Var.mo26062I1(), (String) null, (String) null, t0Var.f34204a, str, (String) null, (String) null);
    }

    /* renamed from: I1 */
    public String mo26062I1() {
        return "playgames.google.com";
    }

    /* renamed from: J1 */
    public String mo26063J1() {
        return "playgames.google.com";
    }

    /* renamed from: K1 */
    public final C7806h mo26064K1() {
        return new C7851t0(this.f34204a);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C4243c.m28604a(parcel);
        C4243c.m28620q(parcel, 1, this.f34204a, false);
        C4243c.m28605b(parcel, a);
    }
}
