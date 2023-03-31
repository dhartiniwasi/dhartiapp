package com.google.android.gms.internal.p026firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.auth.C7848s0;
import p040e5.C4240a;
import p040e5.C4243c;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.so */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C3744so extends C4240a {
    public static final Parcelable.Creator<C3744so> CREATOR = new C3777to();

    /* renamed from: a */
    private final C7848s0 f22697a;

    /* renamed from: b */
    private final String f22698b;

    /* renamed from: c */
    private final String f22699c;

    /* renamed from: d */
    private final long f22700d;

    /* renamed from: e */
    private final boolean f22701e;

    /* renamed from: f */
    private final boolean f22702f;

    /* renamed from: g */
    private final String f22703g;

    /* renamed from: h */
    private final String f22704h;

    /* renamed from: i */
    private final boolean f22705i;

    public C3744so(C7848s0 s0Var, String str, String str2, long j, boolean z, boolean z2, String str3, String str4, boolean z3) {
        this.f22697a = s0Var;
        this.f22698b = str;
        this.f22699c = str2;
        this.f22700d = j;
        this.f22701e = z;
        this.f22702f = z2;
        this.f22703g = str3;
        this.f22704h = str4;
        this.f22705i = z3;
    }

    /* renamed from: I1 */
    public final long mo16769I1() {
        return this.f22700d;
    }

    /* renamed from: J1 */
    public final C7848s0 mo16770J1() {
        return this.f22697a;
    }

    /* renamed from: K1 */
    public final String mo16771K1() {
        return this.f22699c;
    }

    /* renamed from: L1 */
    public final String mo16772L1() {
        return this.f22698b;
    }

    /* renamed from: M1 */
    public final String mo16773M1() {
        return this.f22704h;
    }

    /* renamed from: N1 */
    public final String mo16774N1() {
        return this.f22703g;
    }

    /* renamed from: O1 */
    public final boolean mo16775O1() {
        return this.f22701e;
    }

    /* renamed from: P1 */
    public final boolean mo16776P1() {
        return this.f22705i;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C4243c.m28604a(parcel);
        C4243c.m28619p(parcel, 1, this.f22697a, i, false);
        C4243c.m28620q(parcel, 2, this.f22698b, false);
        C4243c.m28620q(parcel, 3, this.f22699c, false);
        C4243c.m28617n(parcel, 4, this.f22700d);
        C4243c.m28606c(parcel, 5, this.f22701e);
        C4243c.m28606c(parcel, 6, this.f22702f);
        C4243c.m28620q(parcel, 7, this.f22703g, false);
        C4243c.m28620q(parcel, 8, this.f22704h, false);
        C4243c.m28606c(parcel, 9, this.f22705i);
        C4243c.m28605b(parcel, a);
    }
}
