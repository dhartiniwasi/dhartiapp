package p293m7;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.auth.C7778a0;
import org.json.JSONException;
import org.json.JSONObject;
import p040e5.C4243c;

/* renamed from: m7.o1 */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C11847o1 implements C7778a0 {
    public static final Parcelable.Creator<C11847o1> CREATOR = new C11812d();

    /* renamed from: a */
    private final long f44555a;

    /* renamed from: b */
    private final long f44556b;

    public C11847o1(long j, long j2) {
        this.f44555a = j;
        this.f44556b = j2;
    }

    /* renamed from: a */
    public final JSONObject mo36094a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("lastSignInTimestamp", this.f44555a);
            jSONObject.put("creationTimestamp", this.f44556b);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    /* renamed from: d0 */
    public final long mo26051d0() {
        return this.f44556b;
    }

    public final int describeContents() {
        return 0;
    }

    /* renamed from: v0 */
    public final long mo26052v0() {
        return this.f44555a;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C4243c.m28604a(parcel);
        C4243c.m28617n(parcel, 1, this.f44555a);
        C4243c.m28617n(parcel, 2, this.f44556b);
        C4243c.m28605b(parcel, a);
    }
}
