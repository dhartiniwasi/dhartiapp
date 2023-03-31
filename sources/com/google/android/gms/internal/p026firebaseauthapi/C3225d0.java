package com.google.android.gms.internal.p026firebaseauthapi;

import android.text.TextUtils;
import com.google.firebase.auth.C7840p1;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
import p067i5.C4703q;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.d0 */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C3225d0 implements C3353gt {

    /* renamed from: B */
    private static final String f21908B = "d0";

    /* renamed from: A */
    private String f21909A;

    /* renamed from: a */
    private boolean f21910a;

    /* renamed from: b */
    private String f21911b;

    /* renamed from: c */
    private String f21912c;

    /* renamed from: d */
    private long f21913d;

    /* renamed from: e */
    private String f21914e;

    /* renamed from: f */
    private String f21915f;

    /* renamed from: g */
    private String f21916g;

    /* renamed from: h */
    private String f21917h;

    /* renamed from: i */
    private String f21918i;

    /* renamed from: r */
    private String f21919r;

    /* renamed from: s */
    private boolean f21920s;

    /* renamed from: t */
    private String f21921t;

    /* renamed from: u */
    private String f21922u;

    /* renamed from: v */
    private String f21923v;

    /* renamed from: w */
    private String f21924w;

    /* renamed from: x */
    private String f21925x;

    /* renamed from: y */
    private String f21926y;

    /* renamed from: z */
    private List f21927z;

    /* renamed from: a */
    public final long mo15925a() {
        return this.f21913d;
    }

    /* renamed from: b */
    public final C7840p1 mo15926b() {
        if (!TextUtils.isEmpty(this.f21921t) || !TextUtils.isEmpty(this.f21922u)) {
            return C7840p1.m43487N1(this.f21918i, this.f21922u, this.f21921t, this.f21925x, this.f21923v);
        }
        return null;
    }

    /* renamed from: c */
    public final String mo15927c() {
        return this.f21915f;
    }

    /* renamed from: d */
    public final String mo15928d() {
        return this.f21924w;
    }

    /* renamed from: e */
    public final String mo15929e() {
        return this.f21911b;
    }

    /* renamed from: f */
    public final /* bridge */ /* synthetic */ C3353gt mo15920f(String str) throws C3219cr {
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.f21910a = jSONObject.optBoolean("needConfirmation", false);
            jSONObject.optBoolean("needEmail", false);
            this.f21911b = C4703q.m30425a(jSONObject.optString("idToken", (String) null));
            this.f21912c = C4703q.m30425a(jSONObject.optString("refreshToken", (String) null));
            this.f21913d = jSONObject.optLong("expiresIn", 0);
            this.f21914e = C4703q.m30425a(jSONObject.optString("localId", (String) null));
            this.f21915f = C4703q.m30425a(jSONObject.optString("email", (String) null));
            this.f21916g = C4703q.m30425a(jSONObject.optString("displayName", (String) null));
            this.f21917h = C4703q.m30425a(jSONObject.optString("photoUrl", (String) null));
            this.f21918i = C4703q.m30425a(jSONObject.optString("providerId", (String) null));
            this.f21919r = C4703q.m30425a(jSONObject.optString("rawUserInfo", (String) null));
            this.f21920s = jSONObject.optBoolean("isNewUser", false);
            this.f21921t = jSONObject.optString("oauthAccessToken", (String) null);
            this.f21922u = jSONObject.optString("oauthIdToken", (String) null);
            this.f21924w = C4703q.m30425a(jSONObject.optString("errorMessage", (String) null));
            this.f21925x = C4703q.m30425a(jSONObject.optString("pendingToken", (String) null));
            this.f21926y = C4703q.m30425a(jSONObject.optString("tenantId", (String) null));
            this.f21927z = C3257e.m25452N1(jSONObject.optJSONArray("mfaInfo"));
            this.f21909A = C4703q.m30425a(jSONObject.optString("mfaPendingCredential", (String) null));
            this.f21923v = C4703q.m30425a(jSONObject.optString("oauthTokenSecret", (String) null));
            return this;
        } catch (NullPointerException | JSONException e) {
            throw C3555n0.m26257a(e, f21908B, str);
        }
    }

    /* renamed from: g */
    public final String mo15930g() {
        return this.f21909A;
    }

    /* renamed from: h */
    public final String mo15931h() {
        return this.f21918i;
    }

    /* renamed from: i */
    public final String mo15932i() {
        return this.f21919r;
    }

    /* renamed from: j */
    public final String mo15933j() {
        return this.f21912c;
    }

    /* renamed from: k */
    public final String mo15934k() {
        return this.f21926y;
    }

    /* renamed from: l */
    public final List mo15935l() {
        return this.f21927z;
    }

    /* renamed from: m */
    public final boolean mo15936m() {
        return !TextUtils.isEmpty(this.f21909A);
    }

    /* renamed from: n */
    public final boolean mo15937n() {
        return this.f21910a;
    }

    /* renamed from: o */
    public final boolean mo15938o() {
        return this.f21920s;
    }

    /* renamed from: p */
    public final boolean mo15939p() {
        return this.f21910a || !TextUtils.isEmpty(this.f21924w);
    }
}
