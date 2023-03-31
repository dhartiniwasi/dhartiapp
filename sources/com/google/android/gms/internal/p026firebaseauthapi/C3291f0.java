package com.google.android.gms.internal.p026firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import org.json.JSONException;
import org.json.JSONObject;
import p040e5.C4240a;
import p040e5.C4243c;
import p067i5.C4703q;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.f0 */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C3291f0 extends C4240a implements C3353gt<C3291f0> {
    public static final Parcelable.Creator<C3291f0> CREATOR = new C3324g0();

    /* renamed from: e */
    private static final String f22011e = C3291f0.class.getSimpleName();

    /* renamed from: a */
    private String f22012a;

    /* renamed from: b */
    private String f22013b;

    /* renamed from: c */
    private long f22014c;

    /* renamed from: d */
    private boolean f22015d;

    public C3291f0() {
    }

    /* renamed from: I1 */
    public final String mo16008I1() {
        return this.f22012a;
    }

    /* renamed from: J1 */
    public final String mo16009J1() {
        return this.f22013b;
    }

    /* renamed from: K1 */
    public final boolean mo16010K1() {
        return this.f22015d;
    }

    /* renamed from: d */
    public final long mo16011d() {
        return this.f22014c;
    }

    /* renamed from: f */
    public final /* bridge */ /* synthetic */ C3353gt mo15920f(String str) throws C3219cr {
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.f22012a = C4703q.m30425a(jSONObject.optString("idToken", (String) null));
            this.f22013b = C4703q.m30425a(jSONObject.optString("refreshToken", (String) null));
            this.f22014c = jSONObject.optLong("expiresIn", 0);
            this.f22015d = jSONObject.optBoolean("isNewUser", false);
            return this;
        } catch (NullPointerException | JSONException e) {
            throw C3555n0.m26257a(e, f22011e, str);
        }
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C4243c.m28604a(parcel);
        C4243c.m28620q(parcel, 2, this.f22012a, false);
        C4243c.m28620q(parcel, 3, this.f22013b, false);
        C4243c.m28617n(parcel, 4, this.f22014c);
        C4243c.m28606c(parcel, 5, this.f22015d);
        C4243c.m28605b(parcel, a);
    }

    C3291f0(String str, String str2, long j, boolean z) {
        this.f22012a = str;
        this.f22013b = str2;
        this.f22014c = j;
        this.f22015d = z;
    }
}
