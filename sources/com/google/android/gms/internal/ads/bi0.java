package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import org.json.JSONArray;
import org.json.JSONException;
import p033d5.C4133p;
import p040e5.C4240a;
import p040e5.C4243c;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public final class bi0 extends C4240a {
    public static final Parcelable.Creator<bi0> CREATOR = new ci0();

    /* renamed from: a */
    public final String f7277a;

    /* renamed from: b */
    public final int f7278b;

    public bi0(String str, int i) {
        this.f7277a = str;
        this.f7278b = i;
    }

    /* renamed from: I1 */
    public static bi0 m10388I1(JSONArray jSONArray) throws JSONException {
        if (jSONArray == null || jSONArray.length() == 0) {
            return null;
        }
        return new bi0(jSONArray.getJSONObject(0).optString("rb_type"), jSONArray.getJSONObject(0).optInt("rb_amount"));
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof bi0)) {
            bi0 bi0 = (bi0) obj;
            if (!C4133p.m28193a(this.f7277a, bi0.f7277a) || !C4133p.m28193a(Integer.valueOf(this.f7278b), Integer.valueOf(bi0.f7278b))) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return C4133p.m28194b(this.f7277a, Integer.valueOf(this.f7278b));
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C4243c.m28604a(parcel);
        C4243c.m28620q(parcel, 2, this.f7277a, false);
        C4243c.m28614k(parcel, 3, this.f7278b);
        C4243c.m28605b(parcel, a);
    }
}
