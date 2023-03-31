package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.pichillilorenzo.flutter_inappwebview.credential_database.URLCredentialContract;
import p033d5.C4141r;
import p040e5.C4243c;

/* renamed from: com.google.firebase.auth.j */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public class C7814j extends C7806h {
    public static final Parcelable.Creator<C7814j> CREATOR = new C7846r1();

    /* renamed from: a */
    private String f34146a;

    /* renamed from: b */
    private String f34147b;

    /* renamed from: c */
    private final String f34148c;

    /* renamed from: d */
    private String f34149d;

    /* renamed from: e */
    private boolean f34150e;

    C7814j(String str, String str2, String str3, String str4, boolean z) {
        this.f34146a = C4141r.m28217g(str);
        if (!TextUtils.isEmpty(str2) || !TextUtils.isEmpty(str3)) {
            this.f34147b = str2;
            this.f34148c = str3;
            this.f34149d = str4;
            this.f34150e = z;
            return;
        }
        throw new IllegalArgumentException("Cannot create an EmailAuthCredential without a password or emailLink.");
    }

    /* renamed from: S1 */
    public static boolean m43409S1(String str) {
        C7798f c;
        if (!TextUtils.isEmpty(str) && (c = C7798f.m43367c(str)) != null && c.mo26093b() == 4) {
            return true;
        }
        return false;
    }

    /* renamed from: I1 */
    public String mo26062I1() {
        return URLCredentialContract.FeedEntry.COLUMN_NAME_PASSWORD;
    }

    /* renamed from: J1 */
    public String mo26063J1() {
        return !TextUtils.isEmpty(this.f34147b) ? URLCredentialContract.FeedEntry.COLUMN_NAME_PASSWORD : "emailLink";
    }

    /* renamed from: K1 */
    public final C7806h mo26064K1() {
        return new C7814j(this.f34146a, this.f34147b, this.f34148c, this.f34149d, this.f34150e);
    }

    /* renamed from: L1 */
    public final C7814j mo26116L1(C7869z zVar) {
        this.f34149d = zVar.mo26249i2();
        this.f34150e = true;
        return this;
    }

    /* renamed from: M1 */
    public final String mo26117M1() {
        return this.f34149d;
    }

    /* renamed from: N1 */
    public final String mo26118N1() {
        return this.f34146a;
    }

    /* renamed from: O1 */
    public final String mo26119O1() {
        return this.f34147b;
    }

    /* renamed from: P1 */
    public final String mo26120P1() {
        return this.f34148c;
    }

    /* renamed from: Q1 */
    public final boolean mo26121Q1() {
        return !TextUtils.isEmpty(this.f34148c);
    }

    /* renamed from: R1 */
    public final boolean mo26122R1() {
        return this.f34150e;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C4243c.m28604a(parcel);
        C4243c.m28620q(parcel, 1, this.f34146a, false);
        C4243c.m28620q(parcel, 2, this.f34147b, false);
        C4243c.m28620q(parcel, 3, this.f34148c, false);
        C4243c.m28620q(parcel, 4, this.f34149d, false);
        C4243c.m28606c(parcel, 5, this.f34150e);
        C4243c.m28605b(parcel, a);
    }
}
