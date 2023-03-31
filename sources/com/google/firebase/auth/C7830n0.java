package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import p033d5.C4141r;
import p040e5.C4243c;

/* renamed from: com.google.firebase.auth.n0 */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public class C7830n0 extends C7806h implements Cloneable {
    public static final Parcelable.Creator<C7830n0> CREATOR = new C7804g1();

    /* renamed from: a */
    private String f34162a;

    /* renamed from: b */
    private String f34163b;

    /* renamed from: c */
    private boolean f34164c;

    /* renamed from: d */
    private String f34165d;

    /* renamed from: e */
    private boolean f34166e;

    /* renamed from: f */
    private String f34167f;

    /* renamed from: g */
    private String f34168g;

    C7830n0(String str, String str2, boolean z, String str3, boolean z2, String str4, String str5) {
        boolean z3 = false;
        if ((z && !TextUtils.isEmpty(str3) && TextUtils.isEmpty(str5)) || ((z && TextUtils.isEmpty(str3) && !TextUtils.isEmpty(str5)) || ((!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) || (!TextUtils.isEmpty(str3) && !TextUtils.isEmpty(str4))))) {
            z3 = true;
        }
        C4141r.m28212b(z3, "Cannot create PhoneAuthCredential without either verificationProof, sessionInfo, temporary proof, or enrollment ID.");
        this.f34162a = str;
        this.f34163b = str2;
        this.f34164c = z;
        this.f34165d = str3;
        this.f34166e = z2;
        this.f34167f = str4;
        this.f34168g = str5;
    }

    /* renamed from: N1 */
    public static C7830n0 m43448N1(String str, String str2) {
        return new C7830n0(str, str2, false, (String) null, true, (String) null, (String) null);
    }

    /* renamed from: O1 */
    public static C7830n0 m43449O1(String str, String str2) {
        return new C7830n0((String) null, (String) null, false, str, true, str2, (String) null);
    }

    /* renamed from: I1 */
    public String mo26062I1() {
        return "phone";
    }

    /* renamed from: J1 */
    public String mo26063J1() {
        return "phone";
    }

    /* renamed from: K1 */
    public final C7806h mo26064K1() {
        return clone();
    }

    /* renamed from: L1 */
    public String mo26145L1() {
        return this.f34163b;
    }

    /* renamed from: M1 */
    public final C7830n0 clone() {
        return new C7830n0(this.f34162a, mo26145L1(), this.f34164c, this.f34165d, this.f34166e, this.f34167f, this.f34168g);
    }

    /* renamed from: P1 */
    public final C7830n0 mo26147P1(boolean z) {
        this.f34166e = false;
        return this;
    }

    /* renamed from: Q1 */
    public final String mo26148Q1() {
        return this.f34165d;
    }

    /* renamed from: R1 */
    public final String mo26149R1() {
        return this.f34162a;
    }

    /* renamed from: S1 */
    public final String mo26150S1() {
        return this.f34167f;
    }

    /* renamed from: T1 */
    public final boolean mo26151T1() {
        return this.f34166e;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C4243c.m28604a(parcel);
        C4243c.m28620q(parcel, 1, this.f34162a, false);
        C4243c.m28620q(parcel, 2, mo26145L1(), false);
        C4243c.m28606c(parcel, 3, this.f34164c);
        C4243c.m28620q(parcel, 4, this.f34165d, false);
        C4243c.m28606c(parcel, 5, this.f34166e);
        C4243c.m28620q(parcel, 6, this.f34167f, false);
        C4243c.m28620q(parcel, 7, this.f34168g, false);
        C4243c.m28605b(parcel, a);
    }
}
