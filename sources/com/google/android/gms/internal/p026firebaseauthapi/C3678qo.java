package com.google.android.gms.internal.p026firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import p040e5.C4240a;
import p040e5.C4243c;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.qo */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C3678qo extends C4240a {
    public static final Parcelable.Creator<C3678qo> CREATOR = new C3711ro();

    /* renamed from: a */
    private final String f22567a;

    /* renamed from: b */
    private final String f22568b;

    /* renamed from: c */
    private final String f22569c;

    /* renamed from: d */
    private final long f22570d;

    /* renamed from: e */
    private final boolean f22571e;

    /* renamed from: f */
    private final boolean f22572f;

    /* renamed from: g */
    private final String f22573g;

    /* renamed from: h */
    private final String f22574h;

    /* renamed from: i */
    private final boolean f22575i;

    public C3678qo(String str, String str2, String str3, long j, boolean z, boolean z2, String str4, String str5, boolean z3) {
        this.f22567a = str;
        this.f22568b = str2;
        this.f22569c = str3;
        this.f22570d = j;
        this.f22571e = z;
        this.f22572f = z2;
        this.f22573g = str4;
        this.f22574h = str5;
        this.f22575i = z3;
    }

    /* renamed from: I1 */
    public final long mo16608I1() {
        return this.f22570d;
    }

    /* renamed from: J1 */
    public final String mo16609J1() {
        return this.f22567a;
    }

    /* renamed from: K1 */
    public final String mo16610K1() {
        return this.f22569c;
    }

    /* renamed from: L1 */
    public final String mo16611L1() {
        return this.f22568b;
    }

    /* renamed from: M1 */
    public final String mo16612M1() {
        return this.f22574h;
    }

    /* renamed from: N1 */
    public final String mo16613N1() {
        return this.f22573g;
    }

    /* renamed from: O1 */
    public final boolean mo16614O1() {
        return this.f22571e;
    }

    /* renamed from: P1 */
    public final boolean mo16615P1() {
        return this.f22575i;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C4243c.m28604a(parcel);
        C4243c.m28620q(parcel, 1, this.f22567a, false);
        C4243c.m28620q(parcel, 2, this.f22568b, false);
        C4243c.m28620q(parcel, 3, this.f22569c, false);
        C4243c.m28617n(parcel, 4, this.f22570d);
        C4243c.m28606c(parcel, 5, this.f22571e);
        C4243c.m28606c(parcel, 6, this.f22572f);
        C4243c.m28620q(parcel, 7, this.f22573g, false);
        C4243c.m28620q(parcel, 8, this.f22574h, false);
        C4243c.m28606c(parcel, 9, this.f22575i);
        C4243c.m28605b(parcel, a);
    }
}
