package com.google.android.gms.auth.api.signin;

import android.accounts.Account;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p033d5.C4141r;
import p040e5.C4240a;
import p040e5.C4243c;
import p067i5.C4691e;
import p067i5.C4694h;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public class GoogleSignInAccount extends C4240a implements ReflectedParcelable {
    public static final Parcelable.Creator<GoogleSignInAccount> CREATOR = new C2047a();

    /* renamed from: v */
    public static C4691e f5996v = C4694h.m30388d();

    /* renamed from: a */
    final int f5997a;

    /* renamed from: b */
    private String f5998b;

    /* renamed from: c */
    private String f5999c;

    /* renamed from: d */
    private String f6000d;

    /* renamed from: e */
    private String f6001e;

    /* renamed from: f */
    private Uri f6002f;

    /* renamed from: g */
    private String f6003g;

    /* renamed from: h */
    private long f6004h;

    /* renamed from: i */
    private String f6005i;

    /* renamed from: r */
    List<Scope> f6006r;

    /* renamed from: s */
    private String f6007s;

    /* renamed from: t */
    private String f6008t;

    /* renamed from: u */
    private Set<Scope> f6009u = new HashSet();

    GoogleSignInAccount(int i, String str, String str2, String str3, String str4, Uri uri, String str5, long j, String str6, List<Scope> list, String str7, String str8) {
        this.f5997a = i;
        this.f5998b = str;
        this.f5999c = str2;
        this.f6000d = str3;
        this.f6001e = str4;
        this.f6002f = uri;
        this.f6003g = str5;
        this.f6004h = j;
        this.f6005i = str6;
        this.f6006r = list;
        this.f6007s = str7;
        this.f6008t = str8;
    }

    /* renamed from: P1 */
    public static GoogleSignInAccount m9035P1(String str, String str2, String str3, String str4, String str5, String str6, Uri uri, Long l, String str7, Set<Scope> set) {
        return new GoogleSignInAccount(3, str, str2, str3, str4, uri, (String) null, l.longValue(), C4141r.m28217g(str7), new ArrayList((Collection) C4141r.m28221k(set)), str5, str6);
    }

    /* renamed from: Q1 */
    public static GoogleSignInAccount m9036Q1(String str) throws JSONException {
        String str2 = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(str);
        String optString = jSONObject.optString("photoUrl");
        Uri parse = !TextUtils.isEmpty(optString) ? Uri.parse(optString) : null;
        long parseLong = Long.parseLong(jSONObject.getString("expirationTime"));
        HashSet hashSet = new HashSet();
        JSONArray jSONArray = jSONObject.getJSONArray("grantedScopes");
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            hashSet.add(new Scope(jSONArray.getString(i)));
        }
        GoogleSignInAccount P1 = m9035P1(jSONObject.optString("id"), jSONObject.has("tokenId") ? jSONObject.optString("tokenId") : null, jSONObject.has("email") ? jSONObject.optString("email") : null, jSONObject.has("displayName") ? jSONObject.optString("displayName") : null, jSONObject.has("givenName") ? jSONObject.optString("givenName") : null, jSONObject.has("familyName") ? jSONObject.optString("familyName") : null, parse, Long.valueOf(parseLong), jSONObject.getString("obfuscatedIdentifier"), hashSet);
        if (jSONObject.has("serverAuthCode")) {
            str2 = jSONObject.optString("serverAuthCode");
        }
        P1.f6003g = str2;
        return P1;
    }

    /* renamed from: I1 */
    public Account mo7919I1() {
        String str = this.f6000d;
        if (str == null) {
            return null;
        }
        return new Account(str, "com.google");
    }

    /* renamed from: J1 */
    public String mo7920J1() {
        return this.f6008t;
    }

    /* renamed from: K1 */
    public String mo7921K1() {
        return this.f6007s;
    }

    /* renamed from: L1 */
    public String mo7922L1() {
        return this.f5998b;
    }

    /* renamed from: M1 */
    public String mo7923M1() {
        return this.f5999c;
    }

    /* renamed from: N1 */
    public Set<Scope> mo7924N1() {
        HashSet hashSet = new HashSet(this.f6006r);
        hashSet.addAll(this.f6009u);
        return hashSet;
    }

    /* renamed from: O1 */
    public String mo7925O1() {
        return this.f6003g;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GoogleSignInAccount)) {
            return false;
        }
        GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) obj;
        return googleSignInAccount.f6005i.equals(this.f6005i) && googleSignInAccount.mo7924N1().equals(mo7924N1());
    }

    public int hashCode() {
        return ((this.f6005i.hashCode() + 527) * 31) + mo7924N1().hashCode();
    }

    /* renamed from: j1 */
    public String mo7928j1() {
        return this.f6000d;
    }

    /* renamed from: u0 */
    public String mo7929u0() {
        return this.f6001e;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C4243c.m28604a(parcel);
        C4243c.m28614k(parcel, 1, this.f5997a);
        C4243c.m28620q(parcel, 2, mo7922L1(), false);
        C4243c.m28620q(parcel, 3, mo7923M1(), false);
        C4243c.m28620q(parcel, 4, mo7928j1(), false);
        C4243c.m28620q(parcel, 5, mo7929u0(), false);
        C4243c.m28619p(parcel, 6, mo7931x(), i, false);
        C4243c.m28620q(parcel, 7, mo7925O1(), false);
        C4243c.m28617n(parcel, 8, this.f6004h);
        C4243c.m28620q(parcel, 9, this.f6005i, false);
        C4243c.m28624u(parcel, 10, this.f6006r, false);
        C4243c.m28620q(parcel, 11, mo7921K1(), false);
        C4243c.m28620q(parcel, 12, mo7920J1(), false);
        C4243c.m28605b(parcel, a);
    }

    /* renamed from: x */
    public Uri mo7931x() {
        return this.f6002f;
    }
}
