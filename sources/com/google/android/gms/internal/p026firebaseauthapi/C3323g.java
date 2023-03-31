package com.google.android.gms.internal.p026firebaseauthapi;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import p040e5.C4240a;
import p040e5.C4243c;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.g */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C3323g extends C4240a {
    public static final Parcelable.Creator<C3323g> CREATOR = new C3356h();

    /* renamed from: a */
    private String f22049a;

    /* renamed from: b */
    private String f22050b;

    /* renamed from: c */
    private String f22051c;

    /* renamed from: d */
    private String f22052d;

    /* renamed from: e */
    private String f22053e;

    /* renamed from: f */
    private String f22054f;

    /* renamed from: g */
    private String f22055g;

    public C3323g() {
    }

    /* renamed from: I1 */
    public final Uri mo16040I1() {
        if (!TextUtils.isEmpty(this.f22051c)) {
            return Uri.parse(this.f22051c);
        }
        return null;
    }

    /* renamed from: J1 */
    public final String mo16041J1() {
        return this.f22050b;
    }

    /* renamed from: K1 */
    public final String mo16042K1() {
        return this.f22055g;
    }

    /* renamed from: L1 */
    public final String mo16043L1() {
        return this.f22049a;
    }

    /* renamed from: M1 */
    public final String mo16044M1() {
        return this.f22054f;
    }

    /* renamed from: N1 */
    public final String mo16045N1() {
        return this.f22052d;
    }

    /* renamed from: O1 */
    public final String mo16046O1() {
        return this.f22053e;
    }

    /* renamed from: P1 */
    public final void mo16047P1(String str) {
        this.f22053e = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C4243c.m28604a(parcel);
        C4243c.m28620q(parcel, 2, this.f22049a, false);
        C4243c.m28620q(parcel, 3, this.f22050b, false);
        C4243c.m28620q(parcel, 4, this.f22051c, false);
        C4243c.m28620q(parcel, 5, this.f22052d, false);
        C4243c.m28620q(parcel, 6, this.f22053e, false);
        C4243c.m28620q(parcel, 7, this.f22054f, false);
        C4243c.m28620q(parcel, 8, this.f22055g, false);
        C4243c.m28605b(parcel, a);
    }

    C3323g(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.f22049a = str;
        this.f22050b = str2;
        this.f22051c = str3;
        this.f22052d = str4;
        this.f22053e = str5;
        this.f22054f = str6;
        this.f22055g = str7;
    }
}
