package com.google.android.gms.internal.p026firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.auth.C7793e;
import p040e5.C4240a;
import p040e5.C4243c;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.dp */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C3250dp extends C4240a {
    public static final Parcelable.Creator<C3250dp> CREATOR = new C3283ep();

    /* renamed from: a */
    private final String f21951a;

    /* renamed from: b */
    private final String f21952b;

    /* renamed from: c */
    private final C7793e f21953c;

    public C3250dp(String str, String str2, C7793e eVar) {
        this.f21951a = str;
        this.f21952b = str2;
        this.f21953c = eVar;
    }

    /* renamed from: I1 */
    public final C7793e mo15968I1() {
        return this.f21953c;
    }

    /* renamed from: J1 */
    public final String mo15969J1() {
        return this.f21951a;
    }

    /* renamed from: K1 */
    public final String mo15970K1() {
        return this.f21952b;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C4243c.m28604a(parcel);
        C4243c.m28620q(parcel, 1, this.f21951a, false);
        C4243c.m28620q(parcel, 2, this.f21952b, false);
        C4243c.m28619p(parcel, 3, this.f21953c, i, false);
        C4243c.m28605b(parcel, a);
    }
}
