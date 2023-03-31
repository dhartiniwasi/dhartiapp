package p293m7;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.google.android.gms.internal.p026firebaseauthapi.C3709rm;
import com.google.android.gms.internal.p026firebaseauthapi.C3784tv;
import com.google.firebase.auth.C7811i0;
import com.google.firebase.auth.C7869z;
import com.unity3d.ads.metadata.MediationMetaData;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
import p033d5.C4141r;
import p054g5.C4410a;

/* renamed from: m7.k0 */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C11834k0 {

    /* renamed from: a */
    private final Context f44525a;

    /* renamed from: b */
    private final String f44526b;

    /* renamed from: c */
    private final SharedPreferences f44527c;

    /* renamed from: d */
    private final C4410a f44528d = new C4410a("StorageHelpers", new String[0]);

    public C11834k0(Context context, String str) {
        C4141r.m28221k(context);
        String g = C4141r.m28217g(str);
        this.f44526b = g;
        Context applicationContext = context.getApplicationContext();
        this.f44525a = applicationContext;
        this.f44527c = applicationContext.getSharedPreferences(String.format("com.google.firebase.auth.api.Store.%s", new Object[]{g}), 0);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0135, code lost:
        r0 = e;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00ce A[SYNTHETIC, Splitter:B:33:0x00ce] */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0135 A[ExcHandler: rm | ArrayIndexOutOfBoundsException | IllegalArgumentException (e java.lang.Throwable), Splitter:B:1:0x000a] */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final p293m7.C11841m1 m57249f(org.json.JSONObject r27) {
        /*
            r26 = this;
            r0 = r27
            java.lang.String r1 = "enrollmentTimestamp"
            java.lang.String r2 = "userMultiFactorInfo"
            java.lang.String r3 = "userMetadata"
            java.lang.String r5 = "cachedTokenState"
            java.lang.String r5 = r0.getString(r5)     // Catch:{ JSONException -> 0x013b, ArrayIndexOutOfBoundsException -> 0x0139, IllegalArgumentException -> 0x0137, rm -> 0x0135 }
            java.lang.String r6 = "applicationName"
            java.lang.String r6 = r0.getString(r6)     // Catch:{ JSONException -> 0x013b, ArrayIndexOutOfBoundsException -> 0x0139, IllegalArgumentException -> 0x0137, rm -> 0x0135 }
            java.lang.String r7 = "anonymous"
            boolean r7 = r0.getBoolean(r7)     // Catch:{ JSONException -> 0x013b, ArrayIndexOutOfBoundsException -> 0x0139, IllegalArgumentException -> 0x0137, rm -> 0x0135 }
            java.lang.String r8 = "2"
            java.lang.String r9 = "version"
            java.lang.String r9 = r0.getString(r9)     // Catch:{ JSONException -> 0x013b, ArrayIndexOutOfBoundsException -> 0x0139, IllegalArgumentException -> 0x0137, rm -> 0x0135 }
            if (r9 == 0) goto L_0x0025
            r8 = r9
        L_0x0025:
            java.lang.String r9 = "userInfos"
            org.json.JSONArray r9 = r0.getJSONArray(r9)     // Catch:{ JSONException -> 0x013b, ArrayIndexOutOfBoundsException -> 0x0139, IllegalArgumentException -> 0x0137, rm -> 0x0135 }
            int r10 = r9.length()     // Catch:{ JSONException -> 0x013b, ArrayIndexOutOfBoundsException -> 0x0139, IllegalArgumentException -> 0x0137, rm -> 0x0135 }
            java.util.ArrayList r11 = new java.util.ArrayList     // Catch:{ JSONException -> 0x013b, ArrayIndexOutOfBoundsException -> 0x0139, IllegalArgumentException -> 0x0137, rm -> 0x0135 }
            r11.<init>(r10)     // Catch:{ JSONException -> 0x013b, ArrayIndexOutOfBoundsException -> 0x0139, IllegalArgumentException -> 0x0137, rm -> 0x0135 }
            r13 = 0
        L_0x0035:
            java.lang.String r14 = "displayName"
            java.lang.String r15 = "phoneNumber"
            if (r13 >= r10) goto L_0x008d
            java.lang.String r12 = r9.getString(r13)     // Catch:{ JSONException -> 0x013b, ArrayIndexOutOfBoundsException -> 0x0139, IllegalArgumentException -> 0x0137, rm -> 0x0135 }
            android.os.Parcelable$Creator<m7.i1> r16 = p293m7.C11829i1.CREATOR     // Catch:{ JSONException -> 0x013b, ArrayIndexOutOfBoundsException -> 0x0139, IllegalArgumentException -> 0x0137, rm -> 0x0135 }
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch:{ JSONException -> 0x007f, ArrayIndexOutOfBoundsException -> 0x0139, IllegalArgumentException -> 0x0137, rm -> 0x0135 }
            r4.<init>(r12)     // Catch:{ JSONException -> 0x007f, ArrayIndexOutOfBoundsException -> 0x0139, IllegalArgumentException -> 0x0137, rm -> 0x0135 }
            java.lang.String r12 = "userId"
            java.lang.String r18 = r4.optString(r12)     // Catch:{ JSONException -> 0x007f, ArrayIndexOutOfBoundsException -> 0x0139, IllegalArgumentException -> 0x0137, rm -> 0x0135 }
            java.lang.String r12 = "providerId"
            java.lang.String r19 = r4.optString(r12)     // Catch:{ JSONException -> 0x007f, ArrayIndexOutOfBoundsException -> 0x0139, IllegalArgumentException -> 0x0137, rm -> 0x0135 }
            java.lang.String r12 = "email"
            java.lang.String r20 = r4.optString(r12)     // Catch:{ JSONException -> 0x007f, ArrayIndexOutOfBoundsException -> 0x0139, IllegalArgumentException -> 0x0137, rm -> 0x0135 }
            java.lang.String r21 = r4.optString(r15)     // Catch:{ JSONException -> 0x007f, ArrayIndexOutOfBoundsException -> 0x0139, IllegalArgumentException -> 0x0137, rm -> 0x0135 }
            java.lang.String r22 = r4.optString(r14)     // Catch:{ JSONException -> 0x007f, ArrayIndexOutOfBoundsException -> 0x0139, IllegalArgumentException -> 0x0137, rm -> 0x0135 }
            java.lang.String r12 = "photoUrl"
            java.lang.String r23 = r4.optString(r12)     // Catch:{ JSONException -> 0x007f, ArrayIndexOutOfBoundsException -> 0x0139, IllegalArgumentException -> 0x0137, rm -> 0x0135 }
            java.lang.String r12 = "isEmailVerified"
            boolean r24 = r4.optBoolean(r12)     // Catch:{ JSONException -> 0x007f, ArrayIndexOutOfBoundsException -> 0x0139, IllegalArgumentException -> 0x0137, rm -> 0x0135 }
            java.lang.String r12 = "rawUserInfo"
            java.lang.String r25 = r4.optString(r12)     // Catch:{ JSONException -> 0x007f, ArrayIndexOutOfBoundsException -> 0x0139, IllegalArgumentException -> 0x0137, rm -> 0x0135 }
            m7.i1 r4 = new m7.i1     // Catch:{ JSONException -> 0x007f, ArrayIndexOutOfBoundsException -> 0x0139, IllegalArgumentException -> 0x0137, rm -> 0x0135 }
            r17 = r4
            r17.<init>(r18, r19, r20, r21, r22, r23, r24, r25)     // Catch:{ JSONException -> 0x007f, ArrayIndexOutOfBoundsException -> 0x0139, IllegalArgumentException -> 0x0137, rm -> 0x0135 }
            r11.add(r4)     // Catch:{ JSONException -> 0x013b, ArrayIndexOutOfBoundsException -> 0x0139, IllegalArgumentException -> 0x0137, rm -> 0x0135 }
            int r13 = r13 + 1
            goto L_0x0035
        L_0x007f:
            r0 = move-exception
            java.lang.String r1 = "DefaultAuthUserInfo"
            java.lang.String r2 = "Failed to unpack UserInfo from JSON"
            android.util.Log.d(r1, r2)     // Catch:{ JSONException -> 0x013b, ArrayIndexOutOfBoundsException -> 0x0139, IllegalArgumentException -> 0x0137, rm -> 0x0135 }
            com.google.android.gms.internal.firebase-auth-api.rm r1 = new com.google.android.gms.internal.firebase-auth-api.rm     // Catch:{ JSONException -> 0x013b, ArrayIndexOutOfBoundsException -> 0x0139, IllegalArgumentException -> 0x0137, rm -> 0x0135 }
            r1.<init>(r0)     // Catch:{ JSONException -> 0x013b, ArrayIndexOutOfBoundsException -> 0x0139, IllegalArgumentException -> 0x0137, rm -> 0x0135 }
            throw r1     // Catch:{ JSONException -> 0x013b, ArrayIndexOutOfBoundsException -> 0x0139, IllegalArgumentException -> 0x0137, rm -> 0x0135 }
        L_0x008d:
            h7.f r4 = p246h7.C10412f.m52583p(r6)     // Catch:{ JSONException -> 0x013b, ArrayIndexOutOfBoundsException -> 0x0139, IllegalArgumentException -> 0x0137, rm -> 0x0135 }
            m7.m1 r6 = new m7.m1     // Catch:{ JSONException -> 0x013b, ArrayIndexOutOfBoundsException -> 0x0139, IllegalArgumentException -> 0x0137, rm -> 0x0135 }
            r6.<init>(r4, r11)     // Catch:{ JSONException -> 0x013b, ArrayIndexOutOfBoundsException -> 0x0139, IllegalArgumentException -> 0x0137, rm -> 0x0135 }
            boolean r4 = android.text.TextUtils.isEmpty(r5)     // Catch:{ JSONException -> 0x013b, ArrayIndexOutOfBoundsException -> 0x0139, IllegalArgumentException -> 0x0137, rm -> 0x0135 }
            if (r4 != 0) goto L_0x00a3
            com.google.android.gms.internal.firebase-auth-api.tv r4 = com.google.android.gms.internal.p026firebaseauthapi.C3784tv.m27059I1(r5)     // Catch:{ JSONException -> 0x013b, ArrayIndexOutOfBoundsException -> 0x0139, IllegalArgumentException -> 0x0137, rm -> 0x0135 }
            r6.mo26251k2(r4)     // Catch:{ JSONException -> 0x013b, ArrayIndexOutOfBoundsException -> 0x0139, IllegalArgumentException -> 0x0137, rm -> 0x0135 }
        L_0x00a3:
            if (r7 != 0) goto L_0x00a8
            r6.mo36082o2()     // Catch:{ JSONException -> 0x013b, ArrayIndexOutOfBoundsException -> 0x0139, IllegalArgumentException -> 0x0137, rm -> 0x0135 }
        L_0x00a8:
            r6.mo36081n2(r8)     // Catch:{ JSONException -> 0x013b, ArrayIndexOutOfBoundsException -> 0x0139, IllegalArgumentException -> 0x0137, rm -> 0x0135 }
            boolean r4 = r0.has(r3)     // Catch:{ JSONException -> 0x013b, ArrayIndexOutOfBoundsException -> 0x0139, IllegalArgumentException -> 0x0137, rm -> 0x0135 }
            if (r4 == 0) goto L_0x00d1
            org.json.JSONObject r3 = r0.getJSONObject(r3)     // Catch:{ JSONException -> 0x013b, ArrayIndexOutOfBoundsException -> 0x0139, IllegalArgumentException -> 0x0137, rm -> 0x0135 }
            android.os.Parcelable$Creator<m7.o1> r4 = p293m7.C11847o1.CREATOR     // Catch:{ JSONException -> 0x013b, ArrayIndexOutOfBoundsException -> 0x0139, IllegalArgumentException -> 0x0137, rm -> 0x0135 }
            if (r3 != 0) goto L_0x00bb
        L_0x00b9:
            r3 = 0
            goto L_0x00cc
        L_0x00bb:
            java.lang.String r4 = "lastSignInTimestamp"
            long r4 = r3.getLong(r4)     // Catch:{ JSONException -> 0x00b9, ArrayIndexOutOfBoundsException -> 0x0139, IllegalArgumentException -> 0x0137, rm -> 0x0135 }
            java.lang.String r7 = "creationTimestamp"
            long r7 = r3.getLong(r7)     // Catch:{ JSONException -> 0x00b9, ArrayIndexOutOfBoundsException -> 0x0139, IllegalArgumentException -> 0x0137, rm -> 0x0135 }
            m7.o1 r3 = new m7.o1     // Catch:{ JSONException -> 0x00b9, ArrayIndexOutOfBoundsException -> 0x0139, IllegalArgumentException -> 0x0137, rm -> 0x0135 }
            r3.<init>(r4, r7)     // Catch:{ JSONException -> 0x00b9, ArrayIndexOutOfBoundsException -> 0x0139, IllegalArgumentException -> 0x0137, rm -> 0x0135 }
        L_0x00cc:
            if (r3 == 0) goto L_0x00d1
            r6.mo36087t2(r3)     // Catch:{ JSONException -> 0x013b, ArrayIndexOutOfBoundsException -> 0x0139, IllegalArgumentException -> 0x0137, rm -> 0x0135 }
        L_0x00d1:
            boolean r3 = r0.has(r2)     // Catch:{ JSONException -> 0x013b, ArrayIndexOutOfBoundsException -> 0x0139, IllegalArgumentException -> 0x0137, rm -> 0x0135 }
            if (r3 == 0) goto L_0x0134
            org.json.JSONArray r0 = r0.getJSONArray(r2)     // Catch:{ JSONException -> 0x013b, ArrayIndexOutOfBoundsException -> 0x0139, IllegalArgumentException -> 0x0137, rm -> 0x0135 }
            if (r0 == 0) goto L_0x0134
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch:{ JSONException -> 0x013b, ArrayIndexOutOfBoundsException -> 0x0139, IllegalArgumentException -> 0x0137, rm -> 0x0135 }
            r2.<init>()     // Catch:{ JSONException -> 0x013b, ArrayIndexOutOfBoundsException -> 0x0139, IllegalArgumentException -> 0x0137, rm -> 0x0135 }
            r12 = 0
        L_0x00e3:
            int r3 = r0.length()     // Catch:{ JSONException -> 0x013b, ArrayIndexOutOfBoundsException -> 0x0139, IllegalArgumentException -> 0x0137, rm -> 0x0135 }
            if (r12 >= r3) goto L_0x0131
            java.lang.String r3 = r0.getString(r12)     // Catch:{ JSONException -> 0x013b, ArrayIndexOutOfBoundsException -> 0x0139, IllegalArgumentException -> 0x0137, rm -> 0x0135 }
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch:{ JSONException -> 0x013b, ArrayIndexOutOfBoundsException -> 0x0139, IllegalArgumentException -> 0x0137, rm -> 0x0135 }
            r4.<init>(r3)     // Catch:{ JSONException -> 0x013b, ArrayIndexOutOfBoundsException -> 0x0139, IllegalArgumentException -> 0x0137, rm -> 0x0135 }
            java.lang.String r3 = "phone"
            java.lang.String r5 = "factorIdKey"
            java.lang.String r5 = r4.optString(r5)     // Catch:{ JSONException -> 0x013b, ArrayIndexOutOfBoundsException -> 0x0139, IllegalArgumentException -> 0x0137, rm -> 0x0135 }
            boolean r3 = r3.equals(r5)     // Catch:{ JSONException -> 0x013b, ArrayIndexOutOfBoundsException -> 0x0139, IllegalArgumentException -> 0x0137, rm -> 0x0135 }
            if (r3 == 0) goto L_0x012a
            android.os.Parcelable$Creator<com.google.firebase.auth.s0> r3 = com.google.firebase.auth.C7848s0.CREATOR     // Catch:{ JSONException -> 0x013b, ArrayIndexOutOfBoundsException -> 0x0139, IllegalArgumentException -> 0x0137, rm -> 0x0135 }
            boolean r3 = r4.has(r1)     // Catch:{ JSONException -> 0x013b, ArrayIndexOutOfBoundsException -> 0x0139, IllegalArgumentException -> 0x0137, rm -> 0x0135 }
            if (r3 == 0) goto L_0x0122
            java.lang.String r3 = "uid"
            java.lang.String r18 = r4.optString(r3)     // Catch:{ JSONException -> 0x013b, ArrayIndexOutOfBoundsException -> 0x0139, IllegalArgumentException -> 0x0137, rm -> 0x0135 }
            java.lang.String r19 = r4.optString(r14)     // Catch:{ JSONException -> 0x013b, ArrayIndexOutOfBoundsException -> 0x0139, IllegalArgumentException -> 0x0137, rm -> 0x0135 }
            long r20 = r4.optLong(r1)     // Catch:{ JSONException -> 0x013b, ArrayIndexOutOfBoundsException -> 0x0139, IllegalArgumentException -> 0x0137, rm -> 0x0135 }
            java.lang.String r22 = r4.optString(r15)     // Catch:{ JSONException -> 0x013b, ArrayIndexOutOfBoundsException -> 0x0139, IllegalArgumentException -> 0x0137, rm -> 0x0135 }
            com.google.firebase.auth.s0 r3 = new com.google.firebase.auth.s0     // Catch:{ JSONException -> 0x013b, ArrayIndexOutOfBoundsException -> 0x0139, IllegalArgumentException -> 0x0137, rm -> 0x0135 }
            r17 = r3
            r17.<init>(r18, r19, r20, r22)     // Catch:{ JSONException -> 0x013b, ArrayIndexOutOfBoundsException -> 0x0139, IllegalArgumentException -> 0x0137, rm -> 0x0135 }
            goto L_0x012b
        L_0x0122:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ JSONException -> 0x013b, ArrayIndexOutOfBoundsException -> 0x0139, IllegalArgumentException -> 0x0137, rm -> 0x0135 }
            java.lang.String r1 = "An enrollment timestamp in seconds of UTC time since Unix epoch is required to build a PhoneMultiFactorInfo instance."
            r0.<init>(r1)     // Catch:{ JSONException -> 0x013b, ArrayIndexOutOfBoundsException -> 0x0139, IllegalArgumentException -> 0x0137, rm -> 0x0135 }
            throw r0     // Catch:{ JSONException -> 0x013b, ArrayIndexOutOfBoundsException -> 0x0139, IllegalArgumentException -> 0x0137, rm -> 0x0135 }
        L_0x012a:
            r3 = 0
        L_0x012b:
            r2.add(r3)     // Catch:{ JSONException -> 0x013b, ArrayIndexOutOfBoundsException -> 0x0139, IllegalArgumentException -> 0x0137, rm -> 0x0135 }
            int r12 = r12 + 1
            goto L_0x00e3
        L_0x0131:
            r6.mo26252l2(r2)     // Catch:{ JSONException -> 0x013b, ArrayIndexOutOfBoundsException -> 0x0139, IllegalArgumentException -> 0x0137, rm -> 0x0135 }
        L_0x0134:
            return r6
        L_0x0135:
            r0 = move-exception
            goto L_0x013c
        L_0x0137:
            r0 = move-exception
            goto L_0x013c
        L_0x0139:
            r0 = move-exception
            goto L_0x013c
        L_0x013b:
            r0 = move-exception
        L_0x013c:
            r1 = r26
            g5.a r2 = r1.f44528d
            r2.mo17937j(r0)
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p293m7.C11834k0.m57249f(org.json.JSONObject):m7.m1");
    }

    /* renamed from: a */
    public final C7869z mo36067a() {
        String string = this.f44527c.getString("com.google.firebase.auth.FIREBASE_USER", (String) null);
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(string);
            if (jSONObject.has("type") && "com.google.firebase.auth.internal.DefaultFirebaseUser".equalsIgnoreCase(jSONObject.optString("type"))) {
                return m57249f(jSONObject);
            }
        } catch (Exception unused) {
        }
        return null;
    }

    /* renamed from: b */
    public final C3784tv mo36068b(C7869z zVar) {
        C4141r.m28221k(zVar);
        String string = this.f44527c.getString(String.format("com.google.firebase.auth.GET_TOKEN_RESPONSE.%s", new Object[]{zVar.mo26209b()}), (String) null);
        if (string != null) {
            return C3784tv.m27059I1(string);
        }
        return null;
    }

    /* renamed from: c */
    public final void mo36069c(String str) {
        this.f44527c.edit().remove(str).apply();
    }

    /* renamed from: d */
    public final void mo36070d(C7869z zVar) {
        String str;
        C4141r.m28221k(zVar);
        JSONObject jSONObject = new JSONObject();
        if (C11841m1.class.isAssignableFrom(zVar.getClass())) {
            C11841m1 m1Var = (C11841m1) zVar;
            try {
                jSONObject.put("cachedTokenState", m1Var.mo26249i2());
                jSONObject.put("applicationName", m1Var.mo26244d2().mo33470q());
                jSONObject.put("type", "com.google.firebase.auth.internal.DefaultFirebaseUser");
                if (m1Var.mo36084q2() != null) {
                    JSONArray jSONArray = new JSONArray();
                    List q2 = m1Var.mo36084q2();
                    int size = q2.size();
                    if (q2.size() > 30) {
                        this.f44528d.mo17935h("Provider user info list size larger than max size, truncating list to %d. Actual list size: %d", 30, Integer.valueOf(q2.size()));
                        size = 30;
                    }
                    for (int i = 0; i < size; i++) {
                        jSONArray.put(((C11829i1) q2.get(i)).mo36056I1());
                    }
                    jSONObject.put("userInfos", jSONArray);
                }
                jSONObject.put("anonymous", m1Var.mo26229O1());
                jSONObject.put(MediationMetaData.KEY_VERSION, "2");
                if (m1Var.mo26225K1() != null) {
                    jSONObject.put("userMetadata", ((C11847o1) m1Var.mo26225K1()).mo36094a());
                }
                List<C7811i0> b = new C11818f(m1Var).mo26100b();
                if (!b.isEmpty()) {
                    JSONArray jSONArray2 = new JSONArray();
                    for (int i2 = 0; i2 < b.size(); i2++) {
                        jSONArray2.put(b.get(i2).mo26110K1());
                    }
                    jSONObject.put("userMultiFactorInfo", jSONArray2);
                }
                str = jSONObject.toString();
            } catch (Exception e) {
                this.f44528d.mo17936i("Failed to turn object into JSON", e, new Object[0]);
                throw new C3709rm(e);
            }
        } else {
            str = null;
        }
        if (!TextUtils.isEmpty(str)) {
            this.f44527c.edit().putString("com.google.firebase.auth.FIREBASE_USER", str).apply();
        }
    }

    /* renamed from: e */
    public final void mo36071e(C7869z zVar, C3784tv tvVar) {
        C4141r.m28221k(zVar);
        C4141r.m28221k(tvVar);
        this.f44527c.edit().putString(String.format("com.google.firebase.auth.GET_TOKEN_RESPONSE.%s", new Object[]{zVar.mo26209b()}), tvVar.mo16837M1()).apply();
    }
}
