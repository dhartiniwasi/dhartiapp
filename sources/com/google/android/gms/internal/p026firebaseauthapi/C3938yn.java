package com.google.android.gms.internal.p026firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.auth.C7793e;
import p040e5.C4240a;
import p040e5.C4243c;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.yn */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C3938yn extends C4240a {
    public static final Parcelable.Creator<C3938yn> CREATOR = new C3970zn();

    /* renamed from: a */
    private final String f22956a;

    /* renamed from: b */
    private final C7793e f22957b;

    public C3938yn(String str, C7793e eVar) {
        this.f22956a = str;
        this.f22957b = eVar;
    }

    /* renamed from: I1 */
    public final C7793e mo17084I1() {
        return this.f22957b;
    }

    /* renamed from: J1 */
    public final String mo17085J1() {
        return this.f22956a;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C4243c.m28604a(parcel);
        C4243c.m28620q(parcel, 1, this.f22956a, false);
        C4243c.m28619p(parcel, 2, this.f22957b, i, false);
        C4243c.m28605b(parcel, a);
    }
}
