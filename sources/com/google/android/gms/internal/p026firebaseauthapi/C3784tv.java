package com.google.android.gms.internal.p026firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import org.json.JSONException;
import org.json.JSONObject;
import p033d5.C4141r;
import p040e5.C4240a;
import p040e5.C4243c;
import p067i5.C4694h;
import p067i5.C4703q;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.tv */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C3784tv extends C4240a implements C3353gt<C3784tv> {
    public static final Parcelable.Creator<C3784tv> CREATOR = new C3817uv();

    /* renamed from: f */
    private static final String f22745f = C3784tv.class.getSimpleName();

    /* renamed from: a */
    private String f22746a;

    /* renamed from: b */
    private String f22747b;

    /* renamed from: c */
    private Long f22748c;

    /* renamed from: d */
    private String f22749d;

    /* renamed from: e */
    private Long f22750e;

    public C3784tv() {
        this.f22750e = Long.valueOf(System.currentTimeMillis());
    }

    /* renamed from: I1 */
    public static C3784tv m27059I1(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            C3784tv tvVar = new C3784tv();
            tvVar.f22746a = jSONObject.optString("refresh_token", (String) null);
            tvVar.f22747b = jSONObject.optString("access_token", (String) null);
            tvVar.f22748c = Long.valueOf(jSONObject.optLong("expires_in"));
            tvVar.f22749d = jSONObject.optString("token_type", (String) null);
            tvVar.f22750e = Long.valueOf(jSONObject.optLong("issued_at"));
            return tvVar;
        } catch (JSONException e) {
            Log.d(f22745f, "Failed to read GetTokenResponse from JSONObject");
            throw new C3709rm(e);
        }
    }

    /* renamed from: J1 */
    public final String mo16834J1() {
        return this.f22747b;
    }

    /* renamed from: K1 */
    public final String mo16835K1() {
        return this.f22746a;
    }

    /* renamed from: L1 */
    public final String mo16836L1() {
        return this.f22749d;
    }

    /* renamed from: M1 */
    public final String mo16837M1() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("refresh_token", this.f22746a);
            jSONObject.put("access_token", this.f22747b);
            jSONObject.put("expires_in", this.f22748c);
            jSONObject.put("token_type", this.f22749d);
            jSONObject.put("issued_at", this.f22750e);
            return jSONObject.toString();
        } catch (JSONException e) {
            Log.d(f22745f, "Failed to convert GetTokenResponse to JSON");
            throw new C3709rm(e);
        }
    }

    /* renamed from: N1 */
    public final void mo16838N1(String str) {
        this.f22746a = C4141r.m28217g(str);
    }

    /* renamed from: O1 */
    public final boolean mo16839O1() {
        return C4694h.m30388d().mo18370a() + 300000 < this.f22750e.longValue() + (this.f22748c.longValue() * 1000);
    }

    /* renamed from: d */
    public final long mo16840d() {
        Long l = this.f22748c;
        if (l == null) {
            return 0;
        }
        return l.longValue();
    }

    /* renamed from: e */
    public final long mo16841e() {
        return this.f22750e.longValue();
    }

    /* renamed from: f */
    public final /* bridge */ /* synthetic */ C3353gt mo15920f(String str) throws C3219cr {
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.f22746a = C4703q.m30425a(jSONObject.optString("refresh_token"));
            this.f22747b = C4703q.m30425a(jSONObject.optString("access_token"));
            this.f22748c = Long.valueOf(jSONObject.optLong("expires_in", 0));
            this.f22749d = C4703q.m30425a(jSONObject.optString("token_type"));
            this.f22750e = Long.valueOf(System.currentTimeMillis());
            return this;
        } catch (NullPointerException | JSONException e) {
            throw C3555n0.m26257a(e, f22745f, str);
        }
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C4243c.m28604a(parcel);
        C4243c.m28620q(parcel, 2, this.f22746a, false);
        C4243c.m28620q(parcel, 3, this.f22747b, false);
        C4243c.m28618o(parcel, 4, Long.valueOf(mo16840d()), false);
        C4243c.m28620q(parcel, 5, this.f22749d, false);
        C4243c.m28618o(parcel, 6, Long.valueOf(this.f22750e.longValue()), false);
        C4243c.m28605b(parcel, a);
    }

    public C3784tv(String str, String str2, Long l, String str3) {
        this(str, str2, l, str3, Long.valueOf(System.currentTimeMillis()));
    }

    C3784tv(String str, String str2, Long l, String str3, Long l2) {
        this.f22746a = str;
        this.f22747b = str2;
        this.f22748c = l;
        this.f22749d = str3;
        this.f22750e = l2;
    }
}
