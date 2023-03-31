package com.google.android.gms.internal.p026firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.auth.C7840p1;
import java.util.List;
import p040e5.C4240a;
import p040e5.C4243c;
import p293m7.C11816e0;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.hp */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C3382hp extends C4240a {
    public static final Parcelable.Creator<C3382hp> CREATOR = new C3415ip();

    /* renamed from: a */
    final String f22102a;

    /* renamed from: b */
    final List f22103b;

    /* renamed from: c */
    final C7840p1 f22104c;

    public C3382hp(String str, List list, C7840p1 p1Var) {
        this.f22102a = str;
        this.f22103b = list;
        this.f22104c = p1Var;
    }

    /* renamed from: I1 */
    public final C7840p1 mo16105I1() {
        return this.f22104c;
    }

    /* renamed from: J1 */
    public final String mo16106J1() {
        return this.f22102a;
    }

    /* renamed from: K1 */
    public final List mo16107K1() {
        return C11816e0.m57209b(this.f22103b);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C4243c.m28604a(parcel);
        C4243c.m28620q(parcel, 1, this.f22102a, false);
        C4243c.m28624u(parcel, 2, this.f22103b, false);
        C4243c.m28619p(parcel, 3, this.f22104c, i, false);
        C4243c.m28605b(parcel, a);
    }
}
