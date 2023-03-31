package com.google.android.gms.internal.p026firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import p040e5.C4240a;
import p040e5.C4243c;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.pn */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C3644pn extends C4240a {
    public static final Parcelable.Creator<C3644pn> CREATOR = new C3677qn();

    /* renamed from: a */
    private final String f22511a;

    /* renamed from: b */
    private final String f22512b;

    /* renamed from: c */
    private final String f22513c;

    public C3644pn(String str, String str2, String str3) {
        this.f22511a = str;
        this.f22512b = str2;
        this.f22513c = str3;
    }

    /* renamed from: I1 */
    public final String mo16559I1() {
        return this.f22511a;
    }

    /* renamed from: J1 */
    public final String mo16560J1() {
        return this.f22512b;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C4243c.m28604a(parcel);
        C4243c.m28620q(parcel, 1, this.f22511a, false);
        C4243c.m28620q(parcel, 2, this.f22512b, false);
        C4243c.m28620q(parcel, 3, this.f22513c, false);
        C4243c.m28605b(parcel, a);
    }

    public final String zza() {
        return this.f22513c;
    }
}
