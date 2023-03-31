package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.p026firebaseauthapi.C3126a0;
import p033d5.C4141r;
import p040e5.C4243c;

/* renamed from: com.google.firebase.auth.c0 */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public class C7786c0 extends C7806h {
    public static final Parcelable.Creator<C7786c0> CREATOR = new C7783b1();

    /* renamed from: a */
    private String f34106a;

    C7786c0(String str) {
        this.f34106a = C4141r.m28217g(str);
    }

    /* renamed from: L1 */
    public static C3126a0 m43325L1(C7786c0 c0Var, String str) {
        C4141r.m28221k(c0Var);
        return new C3126a0((String) null, c0Var.f34106a, c0Var.mo26062I1(), (String) null, (String) null, (String) null, str, (String) null, (String) null);
    }

    /* renamed from: I1 */
    public String mo26062I1() {
        return "github.com";
    }

    /* renamed from: J1 */
    public String mo26063J1() {
        return "github.com";
    }

    /* renamed from: K1 */
    public final C7806h mo26064K1() {
        return new C7786c0(this.f34106a);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C4243c.m28604a(parcel);
        C4243c.m28620q(parcel, 1, this.f34106a, false);
        C4243c.m28605b(parcel, a);
    }
}
