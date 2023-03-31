package com.google.android.gms.internal.p026firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.auth.C7866y0;
import p040e5.C4240a;
import p040e5.C4243c;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.bp */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C3184bp extends C4240a {
    public static final Parcelable.Creator<C3184bp> CREATOR = new C3217cp();

    /* renamed from: a */
    private final C7866y0 f21784a;

    /* renamed from: b */
    private final String f21785b;

    public C3184bp(C7866y0 y0Var, String str) {
        this.f21784a = y0Var;
        this.f21785b = str;
    }

    /* renamed from: I1 */
    public final C7866y0 mo15815I1() {
        return this.f21784a;
    }

    /* renamed from: J1 */
    public final String mo15816J1() {
        return this.f21785b;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C4243c.m28604a(parcel);
        C4243c.m28619p(parcel, 1, this.f21784a, i, false);
        C4243c.m28620q(parcel, 2, this.f21785b, false);
        C4243c.m28605b(parcel, a);
    }
}
