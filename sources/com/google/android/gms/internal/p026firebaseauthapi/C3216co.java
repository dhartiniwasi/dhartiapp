package com.google.android.gms.internal.p026firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import p040e5.C4240a;
import p040e5.C4243c;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.co */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C3216co extends C4240a {
    public static final Parcelable.Creator<C3216co> CREATOR = new C3249do();

    /* renamed from: a */
    private final C3554n f21889a;

    public C3216co(C3554n nVar) {
        this.f21889a = nVar;
    }

    /* renamed from: I1 */
    public final C3554n mo15911I1() {
        return this.f21889a;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C4243c.m28604a(parcel);
        C4243c.m28619p(parcel, 1, this.f21889a, i, false);
        C4243c.m28605b(parcel, a);
    }
}
