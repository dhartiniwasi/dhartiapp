package com.google.android.gms.internal.p026firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import p040e5.C4240a;
import p040e5.C4243c;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.l */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C3488l extends C4240a implements C3353gt<C3488l> {
    public static final Parcelable.Creator<C3488l> CREATOR = new C3521m();

    /* renamed from: e */
    private static final String f22312e = C3488l.class.getSimpleName();

    /* renamed from: a */
    private String f22313a;

    /* renamed from: b */
    private String f22314b;

    /* renamed from: c */
    private String f22315c;

    /* renamed from: d */
    private C3257e f22316d;

    public C3488l() {
    }

    /* renamed from: I1 */
    public final C3257e mo16273I1() {
        return this.f22316d;
    }

    /* renamed from: J1 */
    public final String mo16274J1() {
        return this.f22313a;
    }

    /* renamed from: K1 */
    public final String mo16275K1() {
        return this.f22314b;
    }

    /* renamed from: L1 */
    public final String mo16276L1() {
        return this.f22315c;
    }

    /* renamed from: M1 */
    public final boolean mo16277M1() {
        return this.f22313a != null;
    }

    /* renamed from: N1 */
    public final boolean mo16278N1() {
        return this.f22316d != null;
    }

    /* renamed from: O1 */
    public final boolean mo16279O1() {
        return this.f22314b != null;
    }

    /* renamed from: P1 */
    public final boolean mo16280P1() {
        return this.f22315c != null;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ com.google.android.gms.internal.p026firebaseauthapi.C3353gt mo15920f(java.lang.String r17) throws com.google.android.gms.internal.p026firebaseauthapi.C3219cr {
        /*
            r16 = this;
            r1 = r16
            r2 = r17
            java.lang.String r0 = "mfaInfo"
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch:{ JSONException -> 0x00b7, NullPointerException -> 0x00b5 }
            r3.<init>(r2)     // Catch:{ JSONException -> 0x00b7, NullPointerException -> 0x00b5 }
            java.lang.String r4 = "email"
            java.lang.String r4 = r3.optString(r4)     // Catch:{ JSONException -> 0x00b7, NullPointerException -> 0x00b5 }
            java.lang.String r4 = p067i5.C4703q.m30425a(r4)     // Catch:{ JSONException -> 0x00b7, NullPointerException -> 0x00b5 }
            r1.f22313a = r4     // Catch:{ JSONException -> 0x00b7, NullPointerException -> 0x00b5 }
            java.lang.String r4 = "newEmail"
            java.lang.String r4 = r3.optString(r4)     // Catch:{ JSONException -> 0x00b7, NullPointerException -> 0x00b5 }
            java.lang.String r4 = p067i5.C4703q.m30425a(r4)     // Catch:{ JSONException -> 0x00b7, NullPointerException -> 0x00b5 }
            r1.f22314b = r4     // Catch:{ JSONException -> 0x00b7, NullPointerException -> 0x00b5 }
            java.lang.String r4 = "reqType"
            int r4 = r3.optInt(r4)     // Catch:{ JSONException -> 0x00b7, NullPointerException -> 0x00b5 }
            java.lang.String r6 = "REVERT_SECOND_FACTOR_ADDITION"
            java.lang.String r7 = "VERIFY_AND_CHANGE_EMAIL"
            java.lang.String r8 = "EMAIL_SIGNIN"
            java.lang.String r9 = "RECOVER_EMAIL"
            java.lang.String r10 = "VERIFY_EMAIL"
            java.lang.String r11 = "PASSWORD_RESET"
            r12 = 1
            if (r4 == r12) goto L_0x0047
            switch(r4) {
                case 4: goto L_0x0045;
                case 5: goto L_0x0043;
                case 6: goto L_0x0041;
                case 7: goto L_0x003f;
                case 8: goto L_0x003d;
                default: goto L_0x003b;
            }
        L_0x003b:
            r4 = 0
            goto L_0x0048
        L_0x003d:
            r4 = r6
            goto L_0x0048
        L_0x003f:
            r4 = r7
            goto L_0x0048
        L_0x0041:
            r4 = r8
            goto L_0x0048
        L_0x0043:
            r4 = r9
            goto L_0x0048
        L_0x0045:
            r4 = r10
            goto L_0x0048
        L_0x0047:
            r4 = r11
        L_0x0048:
            r1.f22315c = r4     // Catch:{ JSONException -> 0x00b7, NullPointerException -> 0x00b5 }
            boolean r4 = android.text.TextUtils.isEmpty(r4)     // Catch:{ JSONException -> 0x00b7, NullPointerException -> 0x00b5 }
            if (r4 == 0) goto L_0x00a4
            java.lang.String r4 = "requestType"
            java.lang.String r4 = r3.optString(r4)     // Catch:{ JSONException -> 0x00b7, NullPointerException -> 0x00b5 }
            int r13 = r4.hashCode()     // Catch:{ JSONException -> 0x00b7, NullPointerException -> 0x00b5 }
            r15 = 4
            r5 = 3
            r14 = 2
            switch(r13) {
                case -1874510116: goto L_0x0089;
                case -1452371317: goto L_0x0081;
                case -1341836234: goto L_0x0079;
                case -1099157829: goto L_0x0071;
                case 870738373: goto L_0x0069;
                case 970484929: goto L_0x0061;
                default: goto L_0x0060;
            }
        L_0x0060:
            goto L_0x0091
        L_0x0061:
            boolean r6 = r4.equals(r9)
            if (r6 == 0) goto L_0x0091
            r6 = 4
            goto L_0x0092
        L_0x0069:
            boolean r6 = r4.equals(r8)
            if (r6 == 0) goto L_0x0091
            r6 = 2
            goto L_0x0092
        L_0x0071:
            boolean r6 = r4.equals(r7)
            if (r6 == 0) goto L_0x0091
            r6 = 3
            goto L_0x0092
        L_0x0079:
            boolean r6 = r4.equals(r10)
            if (r6 == 0) goto L_0x0091
            r6 = 0
            goto L_0x0092
        L_0x0081:
            boolean r6 = r4.equals(r11)
            if (r6 == 0) goto L_0x0091
            r6 = 1
            goto L_0x0092
        L_0x0089:
            boolean r6 = r4.equals(r6)
            if (r6 == 0) goto L_0x0091
            r6 = 5
            goto L_0x0092
        L_0x0091:
            r6 = -1
        L_0x0092:
            if (r6 == 0) goto L_0x00a1
            if (r6 == r12) goto L_0x00a1
            if (r6 == r14) goto L_0x00a1
            if (r6 == r5) goto L_0x00a1
            if (r6 == r15) goto L_0x00a1
            r5 = 5
            if (r6 == r5) goto L_0x00a1
            r5 = 0
            goto L_0x00a2
        L_0x00a1:
            r5 = r4
        L_0x00a2:
            r1.f22315c = r5     // Catch:{ JSONException -> 0x00b7, NullPointerException -> 0x00b5 }
        L_0x00a4:
            boolean r4 = r3.has(r0)     // Catch:{ JSONException -> 0x00b7, NullPointerException -> 0x00b5 }
            if (r4 == 0) goto L_0x00b4
            org.json.JSONObject r0 = r3.optJSONObject(r0)     // Catch:{ JSONException -> 0x00b7, NullPointerException -> 0x00b5 }
            com.google.android.gms.internal.firebase-auth-api.e r0 = com.google.android.gms.internal.p026firebaseauthapi.C3257e.m25451J1(r0)     // Catch:{ JSONException -> 0x00b7, NullPointerException -> 0x00b5 }
            r1.f22316d = r0     // Catch:{ JSONException -> 0x00b7, NullPointerException -> 0x00b5 }
        L_0x00b4:
            return r1
        L_0x00b5:
            r0 = move-exception
            goto L_0x00b8
        L_0x00b7:
            r0 = move-exception
        L_0x00b8:
            java.lang.String r3 = f22312e
            com.google.android.gms.internal.firebase-auth-api.cr r0 = com.google.android.gms.internal.p026firebaseauthapi.C3555n0.m26257a(r0, r3, r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p026firebaseauthapi.C3488l.mo15920f(java.lang.String):com.google.android.gms.internal.firebase-auth-api.gt");
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C4243c.m28604a(parcel);
        C4243c.m28620q(parcel, 2, this.f22313a, false);
        C4243c.m28620q(parcel, 3, this.f22314b, false);
        C4243c.m28620q(parcel, 4, this.f22315c, false);
        C4243c.m28619p(parcel, 5, this.f22316d, i, false);
        C4243c.m28605b(parcel, a);
    }

    C3488l(String str, String str2, String str3, C3257e eVar) {
        this.f22313a = str;
        this.f22314b = str2;
        this.f22315c = str3;
        this.f22316d = eVar;
    }
}
