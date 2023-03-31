package com.google.android.gms.internal.p026firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.firebase.auth.C7840p1;
import p040e5.C4240a;
import p040e5.C4243c;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.fp */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C3316fp extends C4240a {
    public static final Parcelable.Creator<C3316fp> CREATOR = new C3349gp();

    /* renamed from: a */
    private final Status f22036a;

    /* renamed from: b */
    private final C7840p1 f22037b;

    /* renamed from: c */
    private final String f22038c;

    /* renamed from: d */
    private final String f22039d;

    public C3316fp(Status status, C7840p1 p1Var, String str, String str2) {
        this.f22036a = status;
        this.f22037b = p1Var;
        this.f22038c = str;
        this.f22039d = str2;
    }

    /* renamed from: I1 */
    public final Status mo16035I1() {
        return this.f22036a;
    }

    /* renamed from: J1 */
    public final C7840p1 mo16036J1() {
        return this.f22037b;
    }

    /* renamed from: K1 */
    public final String mo16037K1() {
        return this.f22038c;
    }

    /* renamed from: L1 */
    public final String mo16038L1() {
        return this.f22039d;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C4243c.m28604a(parcel);
        C4243c.m28619p(parcel, 1, this.f22036a, i, false);
        C4243c.m28619p(parcel, 2, this.f22037b, i, false);
        C4243c.m28620q(parcel, 3, this.f22038c, false);
        C4243c.m28620q(parcel, 4, this.f22039d, false);
        C4243c.m28605b(parcel, a);
    }
}
