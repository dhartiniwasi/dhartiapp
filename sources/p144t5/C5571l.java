package p144t5;

import android.app.Application;
import java.util.concurrent.Executor;

/* renamed from: t5.l */
/* compiled from: com.google.android.ump:user-messaging-platform@@2.0.0 */
public final class C5571l implements C5591r1 {

    /* renamed from: a */
    private final Application f28154a;

    /* renamed from: b */
    private final C5577n f28155b;

    /* renamed from: c */
    private final Executor f28156c;

    public C5571l(Application application, C5577n nVar, Executor executor) {
        this.f28154a = application;
        this.f28155b = nVar;
        this.f28156c = executor;
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x002a  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0092  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo19875a(java.lang.String r10, org.json.JSONObject r11) {
        /*
            r9 = this;
            int r0 = r10.hashCode()
            r1 = 94746189(0x5a5b64d, float:1.5583492E-35)
            r2 = 0
            r3 = 1
            if (r0 == r1) goto L_0x001b
            r1 = 113399775(0x6c257df, float:7.3103804E-35)
            if (r0 == r1) goto L_0x0011
            goto L_0x0025
        L_0x0011:
            java.lang.String r0 = "write"
            boolean r10 = r10.equals(r0)
            if (r10 == 0) goto L_0x0025
            r10 = 0
            goto L_0x0026
        L_0x001b:
            java.lang.String r0 = "clear"
            boolean r10 = r10.equals(r0)
            if (r10 == 0) goto L_0x0025
            r10 = 1
            goto L_0x0026
        L_0x0025:
            r10 = -1
        L_0x0026:
            java.lang.String r0 = "UserMessagingPlatform"
            if (r10 == 0) goto L_0x0092
            if (r10 == r3) goto L_0x002d
            return r2
        L_0x002d:
            java.lang.String r10 = "keys"
            org.json.JSONArray r10 = r11.optJSONArray(r10)
            if (r10 == 0) goto L_0x0074
            int r1 = r10.length()
            if (r1 != 0) goto L_0x003c
            goto L_0x0074
        L_0x003c:
            java.util.HashSet r11 = new java.util.HashSet
            r11.<init>()
            int r1 = r10.length()
        L_0x0045:
            if (r2 >= r1) goto L_0x006e
            java.lang.String r4 = r10.optString(r2)
            boolean r5 = android.text.TextUtils.isEmpty(r4)
            if (r5 == 0) goto L_0x0068
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r5 = 46
            r4.<init>(r5)
            java.lang.String r5 = "Action[clear]: empty key at index: "
            r4.append(r5)
            r4.append(r2)
            java.lang.String r4 = r4.toString()
            android.util.Log.d(r0, r4)
            goto L_0x006b
        L_0x0068:
            r11.add(r4)
        L_0x006b:
            int r2 = r2 + 1
            goto L_0x0045
        L_0x006e:
            android.app.Application r10 = r9.f28154a
            p144t5.C5541d1.m33600b(r10, r11)
            goto L_0x0091
        L_0x0074:
            java.lang.String r10 = r11.toString()
            java.lang.String r10 = java.lang.String.valueOf(r10)
            java.lang.String r11 = "Action[clear]: wrong args."
            int r1 = r10.length()
            if (r1 == 0) goto L_0x0089
            java.lang.String r10 = r11.concat(r10)
            goto L_0x008e
        L_0x0089:
            java.lang.String r10 = new java.lang.String
            r10.<init>(r11)
        L_0x008e:
            android.util.Log.d(r0, r10)
        L_0x0091:
            return r3
        L_0x0092:
            t5.b1 r10 = new t5.b1
            android.app.Application r1 = r9.f28154a
            r10.<init>(r1)
            java.util.Iterator r1 = r11.keys()
        L_0x009d:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x0106
            java.lang.Object r2 = r1.next()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r4 = r11.opt(r2)
            java.lang.String r5 = java.lang.String.valueOf(r4)
            java.lang.String r6 = java.lang.String.valueOf(r2)
            int r6 = r6.length()
            int r7 = r5.length()
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            int r6 = r6 + 23
            int r6 = r6 + r7
            r8.<init>(r6)
            java.lang.String r6 = "Writing to storage: ["
            r8.append(r6)
            r8.append(r2)
            java.lang.String r6 = "] "
            r8.append(r6)
            r8.append(r5)
            java.lang.String r5 = r8.toString()
            android.util.Log.d(r0, r5)
            boolean r4 = r10.mo19836c(r2, r4)
            if (r4 == 0) goto L_0x00ec
            t5.n r4 = r9.f28155b
            java.util.Set r4 = r4.mo19881c()
            r4.add(r2)
            goto L_0x009d
        L_0x00ec:
            java.lang.String r2 = java.lang.String.valueOf(r2)
            java.lang.String r4 = "Failed writing key: "
            int r5 = r2.length()
            if (r5 == 0) goto L_0x00fd
            java.lang.String r2 = r4.concat(r2)
            goto L_0x0102
        L_0x00fd:
            java.lang.String r2 = new java.lang.String
            r2.<init>(r4)
        L_0x0102:
            android.util.Log.d(r0, r2)
            goto L_0x009d
        L_0x0106:
            t5.n r11 = r9.f28155b
            r11.mo19883e()
            r10.mo19835b()
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p144t5.C5571l.mo19875a(java.lang.String, org.json.JSONObject):boolean");
    }

    public final Executor zza() {
        return this.f28156c;
    }
}
