package com.google.android.gms.internal.p026firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p033d5.C4141r;
import p040e5.C4240a;
import p040e5.C4243c;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.e */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C3257e extends C4240a {
    public static final Parcelable.Creator<C3257e> CREATOR = new C3290f();

    /* renamed from: a */
    private final String f21963a;

    /* renamed from: b */
    private final String f21964b;

    /* renamed from: c */
    private final String f21965c;

    /* renamed from: d */
    private final long f21966d;

    /* renamed from: e */
    private String f21967e;

    public C3257e(String str, String str2, String str3, long j) {
        this.f21963a = str;
        this.f21964b = C4141r.m28217g(str2);
        this.f21965c = str3;
        this.f21966d = j;
    }

    /* renamed from: J1 */
    public static C3257e m25451J1(JSONObject jSONObject) {
        C3257e eVar = new C3257e(jSONObject.optString("phoneInfo", (String) null), jSONObject.optString("mfaEnrollmentId", (String) null), jSONObject.optString("displayName", (String) null), m25453O1(jSONObject.optString("enrolledAt", "")));
        eVar.f21967e = jSONObject.optString("unobfuscatedPhoneInfo");
        return eVar;
    }

    /* renamed from: N1 */
    public static List m25452N1(JSONArray jSONArray) throws JSONException {
        if (jSONArray == null || jSONArray.length() == 0) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            arrayList.add(m25451J1(jSONArray.getJSONObject(i)));
        }
        return arrayList;
    }

    /* renamed from: O1 */
    private static long m25453O1(String str) {
        String replaceAll = str.replaceAll("\\.[0-9]{0,9}Z$|Z$", ".000Z");
        try {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.getDefault());
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
            return simpleDateFormat.parse(replaceAll).getTime();
        } catch (ParseException e) {
            Log.w("MfaInfo", "Could not parse timestamp as ISOString", e);
            return 0;
        }
    }

    /* renamed from: I1 */
    public final long mo15973I1() {
        return this.f21966d;
    }

    /* renamed from: K1 */
    public final String mo15974K1() {
        return this.f21965c;
    }

    /* renamed from: L1 */
    public final String mo15975L1() {
        return this.f21964b;
    }

    /* renamed from: M1 */
    public final String mo15976M1() {
        return this.f21963a;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C4243c.m28604a(parcel);
        C4243c.m28620q(parcel, 1, this.f21963a, false);
        C4243c.m28620q(parcel, 2, this.f21964b, false);
        C4243c.m28620q(parcel, 3, this.f21965c, false);
        C4243c.m28617n(parcel, 4, this.f21966d);
        C4243c.m28605b(parcel, a);
    }
}
