package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
import p040e5.C4240a;
import p040e5.C4243c;
import p073j4.C4820w0;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class kj0 extends C4240a {
    public static final Parcelable.Creator<kj0> CREATOR = new lj0();

    /* renamed from: a */
    public final String f12120a;

    /* renamed from: b */
    public final String f12121b;

    /* renamed from: c */
    public final boolean f12122c;

    /* renamed from: d */
    public final boolean f12123d;

    /* renamed from: e */
    public final List f12124e;

    /* renamed from: f */
    public final boolean f12125f;

    /* renamed from: g */
    public final boolean f12126g;

    /* renamed from: h */
    public final List f12127h;

    public kj0(String str, String str2, boolean z, boolean z2, List list, boolean z3, boolean z4, List list2) {
        this.f12120a = str;
        this.f12121b = str2;
        this.f12122c = z;
        this.f12123d = z2;
        this.f12124e = list;
        this.f12125f = z3;
        this.f12126g = z4;
        this.f12127h = list2 == null ? new ArrayList() : list2;
    }

    /* renamed from: I1 */
    public static kj0 m15441I1(JSONObject jSONObject) throws JSONException {
        return new kj0(jSONObject.optString("click_string", ""), jSONObject.optString("report_url", ""), jSONObject.optBoolean("rendered_ad_enabled", false), jSONObject.optBoolean("non_malicious_reporting_enabled", false), C4820w0.m30813c(jSONObject.optJSONArray("allowed_headers"), (List) null), jSONObject.optBoolean("protection_enabled", false), jSONObject.optBoolean("malicious_reporting_enabled", false), C4820w0.m30813c(jSONObject.optJSONArray("webview_permissions"), (List) null));
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C4243c.m28604a(parcel);
        C4243c.m28620q(parcel, 2, this.f12120a, false);
        C4243c.m28620q(parcel, 3, this.f12121b, false);
        C4243c.m28606c(parcel, 4, this.f12122c);
        C4243c.m28606c(parcel, 5, this.f12123d);
        C4243c.m28622s(parcel, 6, this.f12124e, false);
        C4243c.m28606c(parcel, 7, this.f12125f);
        C4243c.m28606c(parcel, 8, this.f12126g);
        C4243c.m28622s(parcel, 9, this.f12127h, false);
        C4243c.m28605b(parcel, a);
    }
}
