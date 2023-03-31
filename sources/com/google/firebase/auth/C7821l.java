package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.p026firebaseauthapi.C3126a0;
import p033d5.C4141r;
import p040e5.C4243c;

/* renamed from: com.google.firebase.auth.l */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public class C7821l extends C7806h {
    public static final Parcelable.Creator<C7821l> CREATOR = new C7849s1();

    /* renamed from: a */
    private final String f34153a;

    C7821l(String str) {
        this.f34153a = C4141r.m28217g(str);
    }

    /* renamed from: L1 */
    public static C3126a0 m43426L1(C7821l lVar, String str) {
        C4141r.m28221k(lVar);
        return new C3126a0((String) null, lVar.f34153a, lVar.mo26062I1(), (String) null, (String) null, (String) null, str, (String) null, (String) null);
    }

    /* renamed from: I1 */
    public String mo26062I1() {
        return "facebook.com";
    }

    /* renamed from: J1 */
    public String mo26063J1() {
        return "facebook.com";
    }

    /* renamed from: K1 */
    public final C7806h mo26064K1() {
        return new C7821l(this.f34153a);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C4243c.m28604a(parcel);
        C4243c.m28620q(parcel, 1, this.f34153a, false);
        C4243c.m28605b(parcel, a);
    }
}
