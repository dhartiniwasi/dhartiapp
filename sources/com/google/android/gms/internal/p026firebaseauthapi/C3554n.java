package com.google.android.gms.internal.p026firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import org.json.JSONException;
import org.json.JSONObject;
import p033d5.C4141r;
import p040e5.C4240a;
import p040e5.C4243c;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.n */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C3554n extends C4240a implements C3320ft {
    public static final Parcelable.Creator<C3554n> CREATOR = new C3587o();

    /* renamed from: a */
    private final String f22399a;

    /* renamed from: b */
    private final long f22400b;

    /* renamed from: c */
    private final boolean f22401c;

    /* renamed from: d */
    private final String f22402d;

    /* renamed from: e */
    private final String f22403e;

    /* renamed from: f */
    private final String f22404f;

    /* renamed from: g */
    private final boolean f22405g;

    /* renamed from: h */
    private final String f22406h;

    /* renamed from: i */
    private C3849vu f22407i;

    public C3554n(String str, long j, boolean z, String str2, String str3, String str4, boolean z2, String str5) {
        this.f22399a = C4141r.m28217g(str);
        this.f22400b = j;
        this.f22401c = z;
        this.f22402d = str2;
        this.f22403e = str3;
        this.f22404f = str4;
        this.f22405g = z2;
        this.f22406h = str5;
    }

    /* renamed from: I1 */
    public final String mo16426I1() {
        return this.f22402d;
    }

    /* renamed from: J1 */
    public final String mo16427J1() {
        return this.f22399a;
    }

    /* renamed from: K1 */
    public final void mo16428K1(C3849vu vuVar) {
        this.f22407i = vuVar;
    }

    /* renamed from: L1 */
    public final boolean mo16429L1() {
        return this.f22401c;
    }

    /* renamed from: M1 */
    public final boolean mo16430M1() {
        return this.f22405g;
    }

    /* renamed from: d */
    public final long mo16431d() {
        return this.f22400b;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C4243c.m28604a(parcel);
        C4243c.m28620q(parcel, 1, this.f22399a, false);
        C4243c.m28617n(parcel, 2, this.f22400b);
        C4243c.m28606c(parcel, 3, this.f22401c);
        C4243c.m28620q(parcel, 4, this.f22402d, false);
        C4243c.m28620q(parcel, 5, this.f22403e, false);
        C4243c.m28620q(parcel, 6, this.f22404f, false);
        C4243c.m28606c(parcel, 7, this.f22405g);
        C4243c.m28620q(parcel, 8, this.f22406h, false);
        C4243c.m28605b(parcel, a);
    }

    public final String zza() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("phoneNumber", this.f22399a);
        String str = this.f22403e;
        if (str != null) {
            jSONObject.put("tenantId", str);
        }
        String str2 = this.f22404f;
        if (str2 != null) {
            jSONObject.put("recaptchaToken", str2);
        }
        C3849vu vuVar = this.f22407i;
        if (vuVar != null) {
            jSONObject.put("autoRetrievalInfo", vuVar.mo16971a());
        }
        String str3 = this.f22406h;
        if (str3 != null) {
            jSONObject.put("safetyNetToken", str3);
        }
        return jSONObject.toString();
    }
}
