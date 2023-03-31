package p293m7;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.internal.p026firebaseauthapi.C3323g;
import com.google.android.gms.internal.p026firebaseauthapi.C3553mv;
import com.google.android.gms.internal.p026firebaseauthapi.C3709rm;
import com.google.firebase.auth.C7863x0;
import org.json.JSONException;
import org.json.JSONObject;
import p033d5.C4141r;
import p040e5.C4240a;
import p040e5.C4243c;

/* renamed from: m7.i1 */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C11829i1 extends C4240a implements C7863x0 {
    public static final Parcelable.Creator<C11829i1> CREATOR = new C11832j1();

    /* renamed from: a */
    private final String f44512a;

    /* renamed from: b */
    private final String f44513b;

    /* renamed from: c */
    private final String f44514c;

    /* renamed from: d */
    private String f44515d;

    /* renamed from: e */
    private Uri f44516e;

    /* renamed from: f */
    private final String f44517f;

    /* renamed from: g */
    private final String f44518g;

    /* renamed from: h */
    private final boolean f44519h;

    /* renamed from: i */
    private final String f44520i;

    public C11829i1(C3553mv mvVar, String str) {
        C4141r.m28221k(mvVar);
        C4141r.m28217g("firebase");
        this.f44512a = C4141r.m28217g(mvVar.mo16418V1());
        this.f44513b = "firebase";
        this.f44517f = mvVar.mo16417U1();
        this.f44514c = mvVar.mo16416T1();
        Uri J1 = mvVar.mo16406J1();
        if (J1 != null) {
            this.f44515d = J1.toString();
            this.f44516e = J1;
        }
        this.f44519h = mvVar.mo16422Z1();
        this.f44520i = null;
        this.f44518g = mvVar.mo16419W1();
    }

    /* renamed from: D */
    public final String mo26206D() {
        return this.f44513b;
    }

    /* renamed from: I1 */
    public final String mo36056I1() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt("userId", this.f44512a);
            jSONObject.putOpt("providerId", this.f44513b);
            jSONObject.putOpt("displayName", this.f44514c);
            jSONObject.putOpt("photoUrl", this.f44515d);
            jSONObject.putOpt("email", this.f44517f);
            jSONObject.putOpt("phoneNumber", this.f44518g);
            jSONObject.putOpt("isEmailVerified", Boolean.valueOf(this.f44519h));
            jSONObject.putOpt("rawUserInfo", this.f44520i);
            return jSONObject.toString();
        } catch (JSONException e) {
            Log.d("DefaultAuthUserInfo", "Failed to jsonify this object");
            throw new C3709rm(e);
        }
    }

    /* renamed from: K */
    public final boolean mo26207K() {
        return this.f44519h;
    }

    /* renamed from: Y */
    public final String mo26208Y() {
        return this.f44518g;
    }

    /* renamed from: b */
    public final String mo26209b() {
        return this.f44512a;
    }

    /* renamed from: j1 */
    public final String mo26210j1() {
        return this.f44517f;
    }

    /* renamed from: u0 */
    public final String mo26211u0() {
        return this.f44514c;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C4243c.m28604a(parcel);
        C4243c.m28620q(parcel, 1, this.f44512a, false);
        C4243c.m28620q(parcel, 2, this.f44513b, false);
        C4243c.m28620q(parcel, 3, this.f44514c, false);
        C4243c.m28620q(parcel, 4, this.f44515d, false);
        C4243c.m28620q(parcel, 5, this.f44517f, false);
        C4243c.m28620q(parcel, 6, this.f44518g, false);
        C4243c.m28606c(parcel, 7, this.f44519h);
        C4243c.m28620q(parcel, 8, this.f44520i, false);
        C4243c.m28605b(parcel, a);
    }

    /* renamed from: x */
    public final Uri mo26212x() {
        if (!TextUtils.isEmpty(this.f44515d) && this.f44516e == null) {
            this.f44516e = Uri.parse(this.f44515d);
        }
        return this.f44516e;
    }

    public final String zza() {
        return this.f44520i;
    }

    public C11829i1(C3323g gVar) {
        C4141r.m28221k(gVar);
        this.f44512a = gVar.mo16043L1();
        this.f44513b = C4141r.m28217g(gVar.mo16045N1());
        this.f44514c = gVar.mo16041J1();
        Uri I1 = gVar.mo16040I1();
        if (I1 != null) {
            this.f44515d = I1.toString();
            this.f44516e = I1;
        }
        this.f44517f = gVar.mo16042K1();
        this.f44518g = gVar.mo16044M1();
        this.f44519h = false;
        this.f44520i = gVar.mo16046O1();
    }

    public C11829i1(String str, String str2, String str3, String str4, String str5, String str6, boolean z, String str7) {
        this.f44512a = str;
        this.f44513b = str2;
        this.f44517f = str3;
        this.f44518g = str4;
        this.f44514c = str5;
        this.f44515d = str6;
        if (!TextUtils.isEmpty(str6)) {
            this.f44516e = Uri.parse(this.f44515d);
        }
        this.f44519h = z;
        this.f44520i = str7;
    }
}
