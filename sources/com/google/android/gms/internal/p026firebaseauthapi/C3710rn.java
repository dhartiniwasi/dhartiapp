package com.google.android.gms.internal.p026firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import p040e5.C4240a;
import p040e5.C4243c;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.rn */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C3710rn extends C4240a {
    public static final Parcelable.Creator<C3710rn> CREATOR = new C3743sn();

    /* renamed from: a */
    private final String f22634a;

    /* renamed from: b */
    private final C3126a0 f22635b;

    public C3710rn(String str, C3126a0 a0Var) {
        this.f22634a = str;
        this.f22635b = a0Var;
    }

    /* renamed from: I1 */
    public final C3126a0 mo16673I1() {
        return this.f22635b;
    }

    /* renamed from: J1 */
    public final String mo16674J1() {
        return this.f22634a;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C4243c.m28604a(parcel);
        C4243c.m28620q(parcel, 1, this.f22634a, false);
        C4243c.m28619p(parcel, 2, this.f22635b, i, false);
        C4243c.m28605b(parcel, a);
    }
}
