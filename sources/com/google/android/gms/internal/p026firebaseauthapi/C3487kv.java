package com.google.android.gms.internal.p026firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.auth.C7840p1;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p040e5.C4240a;
import p040e5.C4243c;
import p067i5.C4703q;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.kv */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C3487kv extends C4240a implements C3353gt<C3487kv> {
    public static final Parcelable.Creator<C3487kv> CREATOR = new C3520lv();

    /* renamed from: b */
    private static final String f22310b = C3487kv.class.getSimpleName();

    /* renamed from: a */
    private C3619ov f22311a;

    public C3487kv() {
    }

    /* renamed from: I1 */
    public final List mo16271I1() {
        return this.f22311a.mo16521J1();
    }

    /* renamed from: f */
    public final /* bridge */ /* synthetic */ C3353gt mo15920f(String str) throws C3219cr {
        C3619ov ovVar;
        int i;
        C3553mv mvVar;
        String str2 = str;
        try {
            JSONObject jSONObject = new JSONObject(str2);
            if (!jSONObject.has("users")) {
                this.f22311a = new C3619ov();
            } else {
                JSONArray optJSONArray = jSONObject.optJSONArray("users");
                Parcelable.Creator<C3619ov> creator = C3619ov.CREATOR;
                if (optJSONArray != null) {
                    if (optJSONArray.length() != 0) {
                        ArrayList arrayList = new ArrayList(optJSONArray.length());
                        boolean z = false;
                        int i2 = 0;
                        while (i2 < optJSONArray.length()) {
                            JSONObject jSONObject2 = optJSONArray.getJSONObject(i2);
                            if (jSONObject2 == null) {
                                mvVar = new C3553mv();
                                i = i2;
                            } else {
                                String a = C4703q.m30425a(jSONObject2.optString("localId", (String) null));
                                String a2 = C4703q.m30425a(jSONObject2.optString("email", (String) null));
                                boolean optBoolean = jSONObject2.optBoolean("emailVerified", z);
                                String a3 = C4703q.m30425a(jSONObject2.optString("displayName", (String) null));
                                String a4 = C4703q.m30425a(jSONObject2.optString("photoUrl", (String) null));
                                C3389i I1 = C3389i.m25730I1(jSONObject2.optJSONArray("providerUserInfo"));
                                String a5 = C4703q.m30425a(jSONObject2.optString("rawPassword", (String) null));
                                String a6 = C4703q.m30425a(jSONObject2.optString("phoneNumber", (String) null));
                                i = i2;
                                long optLong = jSONObject2.optLong("createdAt", 0);
                                mvVar = new C3553mv(a, a2, optBoolean, a3, a4, I1, a5, a6, optLong, jSONObject2.optLong("lastLoginAt", 0), false, (C7840p1) null, C3257e.m25452N1(jSONObject2.optJSONArray("mfaInfo")));
                            }
                            arrayList.add(mvVar);
                            i2 = i + 1;
                            z = false;
                        }
                        ovVar = new C3619ov(arrayList);
                        this.f22311a = ovVar;
                    }
                }
                ovVar = new C3619ov(new ArrayList());
                this.f22311a = ovVar;
            }
            return this;
        } catch (NullPointerException | JSONException e) {
            throw C3555n0.m26257a(e, f22310b, str2);
        }
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C4243c.m28604a(parcel);
        C4243c.m28619p(parcel, 2, this.f22311a, i, false);
        C4243c.m28605b(parcel, a);
    }

    C3487kv(C3619ov ovVar) {
        C3619ov ovVar2;
        if (ovVar == null) {
            ovVar2 = new C3619ov();
        } else {
            ovVar2 = C3619ov.m26407I1(ovVar);
        }
        this.f22311a = ovVar2;
    }
}
