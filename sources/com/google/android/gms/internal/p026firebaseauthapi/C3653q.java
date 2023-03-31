package com.google.android.gms.internal.p026firebaseauthapi;

import java.util.List;
import p033d5.C4141r;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.q */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C3653q implements C3320ft {

    /* renamed from: a */
    private String f22530a;

    /* renamed from: b */
    private String f22531b;

    /* renamed from: c */
    private String f22532c;

    /* renamed from: d */
    private String f22533d;

    /* renamed from: e */
    private String f22534e;

    /* renamed from: f */
    private String f22535f;

    /* renamed from: g */
    private final C3914y f22536g = new C3914y((List) null);

    /* renamed from: h */
    private final C3914y f22537h = new C3914y((List) null);

    /* renamed from: i */
    private String f22538i;

    /* renamed from: a */
    public final C3653q mo16573a(String str) {
        C4141r.m28217g(str);
        this.f22537h.mo17064J1().add(str);
        return this;
    }

    /* renamed from: b */
    public final C3653q mo16574b(String str) {
        if (str == null) {
            this.f22536g.mo17064J1().add("DISPLAY_NAME");
        } else {
            this.f22531b = str;
        }
        return this;
    }

    /* renamed from: c */
    public final C3653q mo16575c(String str) {
        if (str == null) {
            this.f22536g.mo17064J1().add("EMAIL");
        } else {
            this.f22532c = str;
        }
        return this;
    }

    /* renamed from: d */
    public final C3653q mo16576d(String str) {
        this.f22530a = C4141r.m28217g(str);
        return this;
    }

    /* renamed from: e */
    public final C3653q mo16577e(String str) {
        this.f22534e = C4141r.m28217g(str);
        return this;
    }

    /* renamed from: f */
    public final C3653q mo16578f(String str) {
        if (str == null) {
            this.f22536g.mo17064J1().add("PASSWORD");
        } else {
            this.f22533d = str;
        }
        return this;
    }

    /* renamed from: g */
    public final C3653q mo16579g(String str) {
        if (str == null) {
            this.f22536g.mo17064J1().add("PHOTO_URL");
        } else {
            this.f22535f = str;
        }
        return this;
    }

    /* renamed from: h */
    public final C3653q mo16580h(String str) {
        this.f22538i = str;
        return this;
    }

    /* renamed from: i */
    public final String mo16581i() {
        return this.f22531b;
    }

    /* renamed from: j */
    public final String mo16582j() {
        return this.f22532c;
    }

    /* renamed from: k */
    public final String mo16583k() {
        return this.f22533d;
    }

    /* renamed from: l */
    public final String mo16584l() {
        return this.f22535f;
    }

    /* renamed from: m */
    public final boolean mo16585m(String str) {
        C4141r.m28217g(str);
        return this.f22536g.mo17064J1().contains(str);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String zza() throws org.json.JSONException {
        /*
            r11 = this;
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            java.lang.String r1 = "returnSecureToken"
            r2 = 1
            r0.put(r1, r2)
            com.google.android.gms.internal.firebase-auth-api.y r1 = r11.f22537h
            java.util.List r1 = r1.mo17064J1()
            boolean r1 = r1.isEmpty()
            r3 = 0
            if (r1 != 0) goto L_0x0039
            com.google.android.gms.internal.firebase-auth-api.y r1 = r11.f22537h
            java.util.List r1 = r1.mo17064J1()
            org.json.JSONArray r4 = new org.json.JSONArray
            r4.<init>()
            r5 = 0
        L_0x0024:
            int r6 = r1.size()
            if (r5 >= r6) goto L_0x0034
            java.lang.Object r6 = r1.get(r5)
            r4.put(r6)
            int r5 = r5 + 1
            goto L_0x0024
        L_0x0034:
            java.lang.String r1 = "deleteProvider"
            r0.put(r1, r4)
        L_0x0039:
            com.google.android.gms.internal.firebase-auth-api.y r1 = r11.f22536g
            java.util.List r1 = r1.mo17064J1()
            int r4 = r1.size()
            int[] r5 = new int[r4]
            r6 = 0
        L_0x0046:
            int r7 = r1.size()
            if (r6 >= r7) goto L_0x0099
            java.lang.Object r7 = r1.get(r6)
            java.lang.String r7 = (java.lang.String) r7
            int r8 = r7.hashCode()
            r9 = 3
            r10 = 2
            switch(r8) {
                case -333046776: goto L_0x007a;
                case 66081660: goto L_0x0070;
                case 1939891618: goto L_0x0066;
                case 1999612571: goto L_0x005c;
                default: goto L_0x005b;
            }
        L_0x005b:
            goto L_0x0084
        L_0x005c:
            java.lang.String r8 = "PASSWORD"
            boolean r7 = r7.equals(r8)
            if (r7 == 0) goto L_0x0084
            r7 = 2
            goto L_0x0085
        L_0x0066:
            java.lang.String r8 = "PHOTO_URL"
            boolean r7 = r7.equals(r8)
            if (r7 == 0) goto L_0x0084
            r7 = 3
            goto L_0x0085
        L_0x0070:
            java.lang.String r8 = "EMAIL"
            boolean r7 = r7.equals(r8)
            if (r7 == 0) goto L_0x0084
            r7 = 0
            goto L_0x0085
        L_0x007a:
            java.lang.String r8 = "DISPLAY_NAME"
            boolean r7 = r7.equals(r8)
            if (r7 == 0) goto L_0x0084
            r7 = 1
            goto L_0x0085
        L_0x0084:
            r7 = -1
        L_0x0085:
            if (r7 == 0) goto L_0x0093
            if (r7 == r2) goto L_0x0094
            if (r7 == r10) goto L_0x0091
            if (r7 == r9) goto L_0x008f
            r10 = 0
            goto L_0x0094
        L_0x008f:
            r10 = 4
            goto L_0x0094
        L_0x0091:
            r10 = 5
            goto L_0x0094
        L_0x0093:
            r10 = 1
        L_0x0094:
            r5[r6] = r10
            int r6 = r6 + 1
            goto L_0x0046
        L_0x0099:
            if (r4 <= 0) goto L_0x00af
            org.json.JSONArray r1 = new org.json.JSONArray
            r1.<init>()
        L_0x00a0:
            if (r3 >= r4) goto L_0x00aa
            r2 = r5[r3]
            r1.put(r2)
            int r3 = r3 + 1
            goto L_0x00a0
        L_0x00aa:
            java.lang.String r2 = "deleteAttribute"
            r0.put(r2, r1)
        L_0x00af:
            java.lang.String r1 = r11.f22530a
            if (r1 == 0) goto L_0x00b8
            java.lang.String r2 = "idToken"
            r0.put(r2, r1)
        L_0x00b8:
            java.lang.String r1 = r11.f22532c
            if (r1 == 0) goto L_0x00c1
            java.lang.String r2 = "email"
            r0.put(r2, r1)
        L_0x00c1:
            java.lang.String r1 = r11.f22533d
            if (r1 == 0) goto L_0x00ca
            java.lang.String r2 = "password"
            r0.put(r2, r1)
        L_0x00ca:
            java.lang.String r1 = r11.f22531b
            if (r1 == 0) goto L_0x00d3
            java.lang.String r2 = "displayName"
            r0.put(r2, r1)
        L_0x00d3:
            java.lang.String r1 = r11.f22535f
            if (r1 == 0) goto L_0x00dc
            java.lang.String r2 = "photoUrl"
            r0.put(r2, r1)
        L_0x00dc:
            java.lang.String r1 = r11.f22534e
            if (r1 == 0) goto L_0x00e5
            java.lang.String r2 = "oobCode"
            r0.put(r2, r1)
        L_0x00e5:
            java.lang.String r1 = r11.f22538i
            if (r1 == 0) goto L_0x00ee
            java.lang.String r2 = "tenantId"
            r0.put(r2, r1)
        L_0x00ee:
            java.lang.String r0 = r0.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p026firebaseauthapi.C3653q.zza():java.lang.String");
    }
}
