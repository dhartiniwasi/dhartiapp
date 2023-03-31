package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.p026firebaseauthapi.C3126a0;
import p033d5.C4141r;
import p040e5.C4243c;

/* renamed from: com.google.firebase.auth.v0 */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public class C7857v0 extends C7806h {
    public static final Parcelable.Creator<C7857v0> CREATOR = new C7820k1();

    /* renamed from: a */
    private String f34209a;

    /* renamed from: b */
    private String f34210b;

    C7857v0(String str, String str2) {
        this.f34209a = C4141r.m28217g(str);
        this.f34210b = C4141r.m28217g(str2);
    }

    /* renamed from: L1 */
    public static C3126a0 m43512L1(C7857v0 v0Var, String str) {
        C4141r.m28221k(v0Var);
        return new C3126a0((String) null, v0Var.f34209a, v0Var.mo26062I1(), (String) null, v0Var.f34210b, (String) null, str, (String) null, (String) null);
    }

    /* renamed from: I1 */
    public String mo26062I1() {
        return "twitter.com";
    }

    /* renamed from: J1 */
    public String mo26063J1() {
        return "twitter.com";
    }

    /* renamed from: K1 */
    public final C7806h mo26064K1() {
        return new C7857v0(this.f34209a, this.f34210b);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C4243c.m28604a(parcel);
        C4243c.m28620q(parcel, 1, this.f34209a, false);
        C4243c.m28620q(parcel, 2, this.f34210b, false);
        C4243c.m28605b(parcel, a);
    }
}
