package com.google.android.gms.internal.p026firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.auth.C7830n0;
import p040e5.C4240a;
import p040e5.C4243c;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.jn */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C3446jn extends C4240a {
    public static final Parcelable.Creator<C3446jn> CREATOR = new C3479kn();

    /* renamed from: a */
    private final C7830n0 f22235a;

    /* renamed from: b */
    private final String f22236b;

    public C3446jn(C7830n0 n0Var, String str) {
        this.f22235a = n0Var;
        this.f22236b = str;
    }

    /* renamed from: I1 */
    public final C7830n0 mo16228I1() {
        return this.f22235a;
    }

    /* renamed from: J1 */
    public final String mo16229J1() {
        return this.f22236b;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C4243c.m28604a(parcel);
        C4243c.m28619p(parcel, 1, this.f22235a, i, false);
        C4243c.m28620q(parcel, 2, this.f22236b, false);
        C4243c.m28605b(parcel, a);
    }
}
