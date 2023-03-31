package p060h4;

import android.os.Parcel;
import android.os.Parcelable;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import org.json.JSONException;
import org.json.JSONObject;
import p040e5.C4240a;
import p040e5.C4243c;

/* renamed from: h4.s4 */
/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public final class C4583s4 extends C4240a {
    public static final Parcelable.Creator<C4583s4> CREATOR = new C4589t4();

    /* renamed from: a */
    public final int f25001a;

    /* renamed from: b */
    public final int f25002b;

    /* renamed from: c */
    public final String f25003c;

    /* renamed from: d */
    public final long f25004d;

    public C4583s4(int i, int i2, String str, long j) {
        this.f25001a = i;
        this.f25002b = i2;
        this.f25003c = str;
        this.f25004d = j;
    }

    /* renamed from: I1 */
    public static C4583s4 m30034I1(JSONObject jSONObject) throws JSONException {
        return new C4583s4(jSONObject.getInt("type_num"), jSONObject.getInt("precision_num"), jSONObject.getString(InAppPurchaseMetaData.KEY_CURRENCY), jSONObject.getLong("value"));
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C4243c.m28604a(parcel);
        C4243c.m28614k(parcel, 1, this.f25001a);
        C4243c.m28614k(parcel, 2, this.f25002b);
        C4243c.m28620q(parcel, 3, this.f25003c, false);
        C4243c.m28617n(parcel, 4, this.f25004d);
        C4243c.m28605b(parcel, a);
    }
}
