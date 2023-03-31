package com.google.android.gms.internal.p026firebaseauthapi;

import com.google.firebase.auth.C7793e;
import p033d5.C4141r;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.qv */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C3685qv implements C3320ft {

    /* renamed from: a */
    private final String f22582a;

    /* renamed from: b */
    private String f22583b;

    /* renamed from: c */
    private String f22584c;

    /* renamed from: d */
    private String f22585d;

    /* renamed from: e */
    private C7793e f22586e;

    /* renamed from: f */
    private String f22587f;

    public C3685qv(int i) {
        this.f22582a = i != 1 ? i != 4 ? i != 6 ? i != 7 ? "REQUEST_TYPE_UNSET_ENUM_VALUE" : "VERIFY_AND_CHANGE_EMAIL" : "EMAIL_SIGNIN" : "VERIFY_EMAIL" : "PASSWORD_RESET";
    }

    private C3685qv(int i, C7793e eVar, String str, String str2, String str3, String str4) {
        this.f22582a = "VERIFY_AND_CHANGE_EMAIL";
        this.f22586e = (C7793e) C4141r.m28221k(eVar);
        this.f22583b = null;
        this.f22584c = str2;
        this.f22585d = str3;
        this.f22587f = null;
    }

    /* renamed from: b */
    public static C3685qv m26649b(C7793e eVar, String str, String str2) {
        C4141r.m28217g(str);
        C4141r.m28217g(str2);
        C4141r.m28221k(eVar);
        return new C3685qv(7, eVar, (String) null, str2, str, (String) null);
    }

    /* renamed from: a */
    public final C7793e mo16653a() {
        return this.f22586e;
    }

    /* renamed from: c */
    public final C3685qv mo16654c(C7793e eVar) {
        this.f22586e = (C7793e) C4141r.m28221k(eVar);
        return this;
    }

    /* renamed from: d */
    public final C3685qv mo16655d(String str) {
        this.f22583b = C4141r.m28217g(str);
        return this;
    }

    /* renamed from: e */
    public final C3685qv mo16656e(String str) {
        this.f22587f = str;
        return this;
    }

    /* renamed from: f */
    public final C3685qv mo16657f(String str) {
        this.f22585d = C4141r.m28217g(str);
        return this;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String zza() throws org.json.JSONException {
        /*
            r7 = this;
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            java.lang.String r1 = r7.f22582a
            int r2 = r1.hashCode()
            r3 = 0
            r4 = 3
            r5 = 2
            r6 = 1
            switch(r2) {
                case -1452371317: goto L_0x0031;
                case -1341836234: goto L_0x0027;
                case -1099157829: goto L_0x001d;
                case 870738373: goto L_0x0013;
                default: goto L_0x0012;
            }
        L_0x0012:
            goto L_0x003b
        L_0x0013:
            java.lang.String r2 = "EMAIL_SIGNIN"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x003b
            r1 = 2
            goto L_0x003c
        L_0x001d:
            java.lang.String r2 = "VERIFY_AND_CHANGE_EMAIL"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x003b
            r1 = 3
            goto L_0x003c
        L_0x0027:
            java.lang.String r2 = "VERIFY_EMAIL"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x003b
            r1 = 1
            goto L_0x003c
        L_0x0031:
            java.lang.String r2 = "PASSWORD_RESET"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x003b
            r1 = 0
            goto L_0x003c
        L_0x003b:
            r1 = -1
        L_0x003c:
            if (r1 == 0) goto L_0x004b
            if (r1 == r6) goto L_0x0049
            if (r1 == r5) goto L_0x0047
            if (r1 == r4) goto L_0x0045
            goto L_0x004c
        L_0x0045:
            r3 = 7
            goto L_0x004c
        L_0x0047:
            r3 = 6
            goto L_0x004c
        L_0x0049:
            r3 = 4
            goto L_0x004c
        L_0x004b:
            r3 = 1
        L_0x004c:
            java.lang.String r1 = "requestType"
            r0.put(r1, r3)
            java.lang.String r1 = r7.f22583b
            if (r1 == 0) goto L_0x005a
            java.lang.String r2 = "email"
            r0.put(r2, r1)
        L_0x005a:
            java.lang.String r1 = r7.f22584c
            if (r1 == 0) goto L_0x0063
            java.lang.String r2 = "newEmail"
            r0.put(r2, r1)
        L_0x0063:
            java.lang.String r1 = r7.f22585d
            if (r1 == 0) goto L_0x006c
            java.lang.String r2 = "idToken"
            r0.put(r2, r1)
        L_0x006c:
            com.google.firebase.auth.e r1 = r7.f22586e
            if (r1 == 0) goto L_0x00f6
            boolean r1 = r1.mo26072J1()
            java.lang.String r2 = "androidInstallApp"
            r0.put(r2, r1)
            com.google.firebase.auth.e r1 = r7.f22586e
            boolean r1 = r1.mo26071I1()
            java.lang.String r2 = "canHandleCodeInApp"
            r0.put(r2, r1)
            com.google.firebase.auth.e r1 = r7.f22586e
            java.lang.String r1 = r1.mo26076N1()
            if (r1 == 0) goto L_0x0097
            com.google.firebase.auth.e r1 = r7.f22586e
            java.lang.String r1 = r1.mo26076N1()
            java.lang.String r2 = "continueUrl"
            r0.put(r2, r1)
        L_0x0097:
            com.google.firebase.auth.e r1 = r7.f22586e
            java.lang.String r1 = r1.mo26075M1()
            if (r1 == 0) goto L_0x00aa
            com.google.firebase.auth.e r1 = r7.f22586e
            java.lang.String r1 = r1.mo26075M1()
            java.lang.String r2 = "iosBundleId"
            r0.put(r2, r1)
        L_0x00aa:
            com.google.firebase.auth.e r1 = r7.f22586e
            java.lang.String r1 = r1.mo26079S1()
            if (r1 == 0) goto L_0x00bd
            com.google.firebase.auth.e r1 = r7.f22586e
            java.lang.String r1 = r1.mo26079S1()
            java.lang.String r2 = "iosAppStoreId"
            r0.put(r2, r1)
        L_0x00bd:
            com.google.firebase.auth.e r1 = r7.f22586e
            java.lang.String r1 = r1.mo26074L1()
            if (r1 == 0) goto L_0x00d0
            com.google.firebase.auth.e r1 = r7.f22586e
            java.lang.String r1 = r1.mo26074L1()
            java.lang.String r2 = "androidPackageName"
            r0.put(r2, r1)
        L_0x00d0:
            com.google.firebase.auth.e r1 = r7.f22586e
            java.lang.String r1 = r1.mo26073K1()
            if (r1 == 0) goto L_0x00e3
            com.google.firebase.auth.e r1 = r7.f22586e
            java.lang.String r1 = r1.mo26073K1()
            java.lang.String r2 = "androidMinimumVersion"
            r0.put(r2, r1)
        L_0x00e3:
            com.google.firebase.auth.e r1 = r7.f22586e
            java.lang.String r1 = r1.mo26078R1()
            if (r1 == 0) goto L_0x00f6
            com.google.firebase.auth.e r1 = r7.f22586e
            java.lang.String r1 = r1.mo26078R1()
            java.lang.String r2 = "dynamicLinkDomain"
            r0.put(r2, r1)
        L_0x00f6:
            java.lang.String r1 = r7.f22587f
            if (r1 == 0) goto L_0x00ff
            java.lang.String r2 = "tenantId"
            r0.put(r2, r1)
        L_0x00ff:
            java.lang.String r0 = r0.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p026firebaseauthapi.C3685qv.zza():java.lang.String");
    }
}
