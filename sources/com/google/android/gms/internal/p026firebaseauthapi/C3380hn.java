package com.google.android.gms.internal.p026firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.auth.C7830n0;
import p040e5.C4240a;
import p040e5.C4243c;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.hn */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C3380hn extends C4240a {
    public static final Parcelable.Creator<C3380hn> CREATOR = new C3413in();

    /* renamed from: a */
    private final C7830n0 f22099a;

    /* renamed from: b */
    private final String f22100b;

    /* renamed from: c */
    private final String f22101c;

    public C3380hn(C7830n0 n0Var, String str, String str2) {
        this.f22099a = n0Var;
        this.f22100b = str;
        this.f22101c = str2;
    }

    /* renamed from: I1 */
    public final C7830n0 mo16099I1() {
        return this.f22099a;
    }

    /* renamed from: J1 */
    public final String mo16100J1() {
        return this.f22100b;
    }

    /* renamed from: K1 */
    public final String mo16101K1() {
        return this.f22101c;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C4243c.m28604a(parcel);
        C4243c.m28619p(parcel, 1, this.f22099a, i, false);
        C4243c.m28620q(parcel, 2, this.f22100b, false);
        C4243c.m28620q(parcel, 3, this.f22101c, false);
        C4243c.m28605b(parcel, a);
    }
}
