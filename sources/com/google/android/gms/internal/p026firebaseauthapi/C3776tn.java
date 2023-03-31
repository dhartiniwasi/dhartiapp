package com.google.android.gms.internal.p026firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.auth.C7830n0;
import p040e5.C4240a;
import p040e5.C4243c;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.tn */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C3776tn extends C4240a {
    public static final Parcelable.Creator<C3776tn> CREATOR = new C3809un();

    /* renamed from: a */
    private final String f22736a;

    /* renamed from: b */
    private final C7830n0 f22737b;

    public C3776tn(String str, C7830n0 n0Var) {
        this.f22736a = str;
        this.f22737b = n0Var;
    }

    /* renamed from: I1 */
    public final C7830n0 mo16817I1() {
        return this.f22737b;
    }

    /* renamed from: J1 */
    public final String mo16818J1() {
        return this.f22736a;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C4243c.m28604a(parcel);
        C4243c.m28620q(parcel, 1, this.f22736a, false);
        C4243c.m28619p(parcel, 2, this.f22737b, i, false);
        C4243c.m28605b(parcel, a);
    }
}
