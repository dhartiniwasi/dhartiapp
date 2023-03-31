package com.google.android.gms.internal.p026firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
import p040e5.C4240a;
import p040e5.C4243c;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.yu */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C3945yu extends C4240a implements C3353gt<C3945yu> {
    public static final Parcelable.Creator<C3945yu> CREATOR = new C3977zu();

    /* renamed from: g */
    private static final String f22968g = C3945yu.class.getSimpleName();

    /* renamed from: a */
    private String f22969a;

    /* renamed from: b */
    private boolean f22970b;

    /* renamed from: c */
    private String f22971c;

    /* renamed from: d */
    private boolean f22972d;

    /* renamed from: e */
    private C3914y f22973e;

    /* renamed from: f */
    private List f22974f;

    public C3945yu() {
        this.f22973e = new C3914y((List) null);
    }

    /* renamed from: I1 */
    public final List mo17090I1() {
        return this.f22974f;
    }

    /* renamed from: f */
    public final /* bridge */ /* synthetic */ C3353gt mo15920f(String str) throws C3219cr {
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.f22969a = jSONObject.optString("authUri", (String) null);
            this.f22970b = jSONObject.optBoolean("registered", false);
            this.f22971c = jSONObject.optString("providerId", (String) null);
            this.f22972d = jSONObject.optBoolean("forExistingProvider", false);
            if (!jSONObject.has("allProviders")) {
                this.f22973e = new C3914y((List) null);
            } else {
                this.f22973e = new C3914y(1, C3555n0.m26258b(jSONObject.optJSONArray("allProviders")));
            }
            this.f22974f = C3555n0.m26258b(jSONObject.optJSONArray("signinMethods"));
            return this;
        } catch (NullPointerException | JSONException e) {
            throw C3555n0.m26257a(e, f22968g, str);
        }
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C4243c.m28604a(parcel);
        C4243c.m28620q(parcel, 2, this.f22969a, false);
        C4243c.m28606c(parcel, 3, this.f22970b);
        C4243c.m28620q(parcel, 4, this.f22971c, false);
        C4243c.m28606c(parcel, 5, this.f22972d);
        C4243c.m28619p(parcel, 6, this.f22973e, i, false);
        C4243c.m28622s(parcel, 7, this.f22974f, false);
        C4243c.m28605b(parcel, a);
    }

    public C3945yu(String str, boolean z, String str2, boolean z2, C3914y yVar, List list) {
        C3914y yVar2;
        this.f22969a = str;
        this.f22970b = z;
        this.f22971c = str2;
        this.f22972d = z2;
        if (yVar == null) {
            yVar2 = new C3914y((List) null);
        } else {
            yVar2 = C3914y.m27410I1(yVar);
        }
        this.f22973e = yVar2;
        this.f22974f = list;
    }
}
