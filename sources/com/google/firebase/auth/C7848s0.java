package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import com.google.android.gms.internal.p026firebaseauthapi.C3709rm;
import org.json.JSONException;
import org.json.JSONObject;
import p033d5.C4141r;
import p040e5.C4243c;

/* renamed from: com.google.firebase.auth.s0 */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public class C7848s0 extends C7811i0 {
    public static final Parcelable.Creator<C7848s0> CREATOR = new C7812i1();

    /* renamed from: a */
    private final String f34199a;

    /* renamed from: b */
    private final String f34200b;

    /* renamed from: c */
    private final long f34201c;

    /* renamed from: d */
    private final String f34202d;

    public C7848s0(String str, String str2, long j, String str3) {
        this.f34199a = C4141r.m28217g(str);
        this.f34200b = str2;
        this.f34201c = j;
        this.f34202d = C4141r.m28217g(str3);
    }

    /* renamed from: I1 */
    public long mo26108I1() {
        return this.f34201c;
    }

    /* renamed from: J1 */
    public String mo26109J1() {
        return "phone";
    }

    /* renamed from: K1 */
    public JSONObject mo26110K1() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt("factorIdKey", "phone");
            jSONObject.putOpt("uid", this.f34199a);
            jSONObject.putOpt("displayName", this.f34200b);
            jSONObject.putOpt("enrollmentTimestamp", Long.valueOf(this.f34201c));
            jSONObject.putOpt("phoneNumber", this.f34202d);
            return jSONObject;
        } catch (JSONException e) {
            Log.d("PhoneMultiFactorInfo", "Failed to jsonify this object");
            throw new C3709rm(e);
        }
    }

    /* renamed from: Y */
    public String mo26185Y() {
        return this.f34202d;
    }

    /* renamed from: b */
    public String mo26111b() {
        return this.f34199a;
    }

    /* renamed from: u0 */
    public String mo26112u0() {
        return this.f34200b;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C4243c.m28604a(parcel);
        C4243c.m28620q(parcel, 1, mo26111b(), false);
        C4243c.m28620q(parcel, 2, mo26112u0(), false);
        C4243c.m28617n(parcel, 3, mo26108I1());
        C4243c.m28620q(parcel, 4, mo26185Y(), false);
        C4243c.m28605b(parcel, a);
    }
}
