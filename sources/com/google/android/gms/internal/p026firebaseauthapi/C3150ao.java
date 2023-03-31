package com.google.android.gms.internal.p026firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.auth.C7793e;
import p040e5.C4240a;
import p040e5.C4243c;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.ao */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C3150ao extends C4240a {
    public static final Parcelable.Creator<C3150ao> CREATOR = new C3183bo();

    /* renamed from: a */
    private final String f21756a;

    /* renamed from: b */
    private final C7793e f21757b;

    /* renamed from: c */
    private final String f21758c;

    public C3150ao(String str, C7793e eVar, String str2) {
        this.f21756a = str;
        this.f21757b = eVar;
        this.f21758c = str2;
    }

    /* renamed from: I1 */
    public final C7793e mo15748I1() {
        return this.f21757b;
    }

    /* renamed from: J1 */
    public final String mo15749J1() {
        return this.f21756a;
    }

    /* renamed from: K1 */
    public final String mo15750K1() {
        return this.f21758c;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C4243c.m28604a(parcel);
        C4243c.m28620q(parcel, 1, this.f21756a, false);
        C4243c.m28619p(parcel, 2, this.f21757b, i, false);
        C4243c.m28620q(parcel, 3, this.f21758c, false);
        C4243c.m28605b(parcel, a);
    }
}
