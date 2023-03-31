package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.internal.p026firebaseauthapi.C3126a0;
import com.google.android.gms.internal.p026firebaseauthapi.C3296f5;
import p033d5.C4141r;
import p040e5.C4243c;

/* renamed from: com.google.firebase.auth.p1 */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C7840p1 extends C7822l0 {
    public static final Parcelable.Creator<C7840p1> CREATOR = new C7843q1();

    /* renamed from: a */
    private final String f34190a;

    /* renamed from: b */
    private final String f34191b;

    /* renamed from: c */
    private final String f34192c;

    /* renamed from: d */
    private final C3126a0 f34193d;

    /* renamed from: e */
    private final String f34194e;

    /* renamed from: f */
    private final String f34195f;

    /* renamed from: g */
    private final String f34196g;

    C7840p1(String str, String str2, String str3, C3126a0 a0Var, String str4, String str5, String str6) {
        this.f34190a = C3296f5.m25551c(str);
        this.f34191b = str2;
        this.f34192c = str3;
        this.f34193d = a0Var;
        this.f34194e = str4;
        this.f34195f = str5;
        this.f34196g = str6;
    }

    /* renamed from: M1 */
    public static C7840p1 m43486M1(C3126a0 a0Var) {
        C4141r.m28222l(a0Var, "Must specify a non-null webSignInCredential");
        return new C7840p1((String) null, (String) null, (String) null, a0Var, (String) null, (String) null, (String) null);
    }

    /* renamed from: N1 */
    public static C7840p1 m43487N1(String str, String str2, String str3, String str4, String str5) {
        C4141r.m28218h(str, "Must specify a non-empty providerId");
        if (!TextUtils.isEmpty(str2) || !TextUtils.isEmpty(str3)) {
            return new C7840p1(str, str2, str3, (C3126a0) null, str4, str5, (String) null);
        }
        throw new IllegalArgumentException("Must specify an idToken or an accessToken.");
    }

    /* renamed from: O1 */
    public static C3126a0 m43488O1(C7840p1 p1Var, String str) {
        C4141r.m28221k(p1Var);
        C3126a0 a0Var = p1Var.f34193d;
        if (a0Var != null) {
            return a0Var;
        }
        return new C3126a0(p1Var.f34191b, p1Var.f34192c, p1Var.f34190a, (String) null, p1Var.f34195f, (String) null, str, p1Var.f34194e, p1Var.f34196g);
    }

    /* renamed from: I1 */
    public final String mo26062I1() {
        return this.f34190a;
    }

    /* renamed from: J1 */
    public final String mo26063J1() {
        return this.f34190a;
    }

    /* renamed from: K1 */
    public final C7806h mo26064K1() {
        return new C7840p1(this.f34190a, this.f34191b, this.f34192c, this.f34193d, this.f34194e, this.f34195f, this.f34196g);
    }

    /* renamed from: L1 */
    public final String mo26132L1() {
        return this.f34192c;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C4243c.m28604a(parcel);
        C4243c.m28620q(parcel, 1, this.f34190a, false);
        C4243c.m28620q(parcel, 2, this.f34191b, false);
        C4243c.m28620q(parcel, 3, this.f34192c, false);
        C4243c.m28619p(parcel, 4, this.f34193d, i, false);
        C4243c.m28620q(parcel, 5, this.f34194e, false);
        C4243c.m28620q(parcel, 6, this.f34195f, false);
        C4243c.m28620q(parcel, 7, this.f34196g, false);
        C4243c.m28605b(parcel, a);
    }
}
