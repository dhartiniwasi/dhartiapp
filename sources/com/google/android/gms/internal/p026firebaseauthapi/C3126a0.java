package com.google.android.gms.internal.p026firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;
import p033d5.C4141r;
import p040e5.C4240a;
import p040e5.C4243c;
import p293m7.C11865x0;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.a0 */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C3126a0 extends C4240a implements C3320ft {
    public static final Parcelable.Creator<C3126a0> CREATOR = new C3159b0();

    /* renamed from: a */
    private String f21735a;

    /* renamed from: b */
    private String f21736b;

    /* renamed from: c */
    private String f21737c;

    /* renamed from: d */
    private String f21738d;

    /* renamed from: e */
    private String f21739e;

    /* renamed from: f */
    private String f21740f;

    /* renamed from: g */
    private String f21741g;

    /* renamed from: h */
    private String f21742h;

    /* renamed from: i */
    private boolean f21743i;

    /* renamed from: r */
    private boolean f21744r;

    /* renamed from: s */
    private String f21745s;

    /* renamed from: t */
    private String f21746t;

    /* renamed from: u */
    private String f21747u;

    /* renamed from: v */
    private String f21748v;

    /* renamed from: w */
    private boolean f21749w;

    /* renamed from: x */
    private String f21750x;

    public C3126a0() {
        this.f21743i = true;
        this.f21744r = true;
    }

    /* renamed from: I1 */
    public final C3126a0 mo15688I1(boolean z) {
        this.f21744r = false;
        return this;
    }

    /* renamed from: J1 */
    public final C3126a0 mo15689J1(String str) {
        this.f21736b = C4141r.m28217g(str);
        return this;
    }

    /* renamed from: K1 */
    public final C3126a0 mo15690K1(boolean z) {
        this.f21749w = true;
        return this;
    }

    /* renamed from: L1 */
    public final C3126a0 mo15691L1(boolean z) {
        this.f21743i = true;
        return this;
    }

    /* renamed from: M1 */
    public final C3126a0 mo15692M1(String str) {
        this.f21748v = str;
        return this;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C4243c.m28604a(parcel);
        C4243c.m28620q(parcel, 2, this.f21735a, false);
        C4243c.m28620q(parcel, 3, this.f21736b, false);
        C4243c.m28620q(parcel, 4, this.f21737c, false);
        C4243c.m28620q(parcel, 5, this.f21738d, false);
        C4243c.m28620q(parcel, 6, this.f21739e, false);
        C4243c.m28620q(parcel, 7, this.f21740f, false);
        C4243c.m28620q(parcel, 8, this.f21741g, false);
        C4243c.m28620q(parcel, 9, this.f21742h, false);
        C4243c.m28606c(parcel, 10, this.f21743i);
        C4243c.m28606c(parcel, 11, this.f21744r);
        C4243c.m28620q(parcel, 12, this.f21745s, false);
        C4243c.m28620q(parcel, 13, this.f21746t, false);
        C4243c.m28620q(parcel, 14, this.f21747u, false);
        C4243c.m28620q(parcel, 15, this.f21748v, false);
        C4243c.m28606c(parcel, 16, this.f21749w);
        C4243c.m28620q(parcel, 17, this.f21750x, false);
        C4243c.m28605b(parcel, a);
    }

    public final String zza() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("autoCreate", this.f21744r);
        jSONObject.put("returnSecureToken", this.f21743i);
        String str = this.f21736b;
        if (str != null) {
            jSONObject.put("idToken", str);
        }
        String str2 = this.f21741g;
        if (str2 != null) {
            jSONObject.put("postBody", str2);
        }
        String str3 = this.f21748v;
        if (str3 != null) {
            jSONObject.put("tenantId", str3);
        }
        String str4 = this.f21750x;
        if (str4 != null) {
            jSONObject.put("pendingToken", str4);
        }
        if (!TextUtils.isEmpty(this.f21746t)) {
            jSONObject.put("sessionId", this.f21746t);
        }
        if (!TextUtils.isEmpty(this.f21747u)) {
            jSONObject.put("requestUri", this.f21747u);
        } else {
            String str5 = this.f21735a;
            if (str5 != null) {
                jSONObject.put("requestUri", str5);
            }
        }
        jSONObject.put("returnIdpCredential", this.f21749w);
        return jSONObject.toString();
    }

    public C3126a0(C11865x0 x0Var, String str) {
        C4141r.m28221k(x0Var);
        this.f21746t = C4141r.m28217g(x0Var.mo36114d());
        this.f21747u = C4141r.m28217g(str);
        String g = C4141r.m28217g(x0Var.mo36113c());
        this.f21739e = g;
        this.f21743i = true;
        this.f21741g = "providerId=".concat(String.valueOf(g));
    }

    public C3126a0(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
        this.f21735a = "http://localhost";
        this.f21737c = str;
        this.f21738d = str2;
        this.f21742h = str5;
        this.f21745s = str6;
        this.f21748v = str7;
        this.f21750x = str8;
        this.f21743i = true;
        if (!TextUtils.isEmpty(str) || !TextUtils.isEmpty(this.f21738d) || !TextUtils.isEmpty(this.f21745s)) {
            this.f21739e = C4141r.m28217g(str3);
            this.f21740f = null;
            StringBuilder sb = new StringBuilder();
            if (!TextUtils.isEmpty(this.f21737c)) {
                sb.append("id_token=");
                sb.append(this.f21737c);
                sb.append("&");
            }
            if (!TextUtils.isEmpty(this.f21738d)) {
                sb.append("access_token=");
                sb.append(this.f21738d);
                sb.append("&");
            }
            if (!TextUtils.isEmpty(this.f21740f)) {
                sb.append("identifier=");
                sb.append(this.f21740f);
                sb.append("&");
            }
            if (!TextUtils.isEmpty(this.f21742h)) {
                sb.append("oauth_token_secret=");
                sb.append(this.f21742h);
                sb.append("&");
            }
            if (!TextUtils.isEmpty(this.f21745s)) {
                sb.append("code=");
                sb.append(this.f21745s);
                sb.append("&");
            }
            if (!TextUtils.isEmpty(str9)) {
                sb.append("nonce=");
                sb.append(str9);
                sb.append("&");
            }
            sb.append("providerId=");
            sb.append(this.f21739e);
            this.f21741g = sb.toString();
            this.f21744r = true;
            return;
        }
        throw new IllegalArgumentException("idToken, accessToken and authCode cannot all be null");
    }

    C3126a0(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, boolean z, boolean z2, String str9, String str10, String str11, String str12, boolean z3, String str13) {
        this.f21735a = str;
        this.f21736b = str2;
        this.f21737c = str3;
        this.f21738d = str4;
        this.f21739e = str5;
        this.f21740f = str6;
        this.f21741g = str7;
        this.f21742h = str8;
        this.f21743i = z;
        this.f21744r = z2;
        this.f21745s = str9;
        this.f21746t = str10;
        this.f21747u = str11;
        this.f21748v = str12;
        this.f21749w = z3;
        this.f21750x = str13;
    }
}
