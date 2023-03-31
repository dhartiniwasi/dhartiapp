package com.startapp;

import com.startapp.sdk.common.advertisingid.AdvertisingIdResolver;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.startapp.y3 */
/* compiled from: Sta */
public class C9654y3 {

    /* renamed from: a */
    public final AdvertisingIdResolver f39433a;

    /* renamed from: b */
    public final C8908d3<String> f39434b;

    /* renamed from: c */
    public final C8911d6 f39435c;

    /* renamed from: d */
    public final C9000h7 f39436d;

    /* renamed from: e */
    public final C8908d3<C9675z3> f39437e;

    public C9654y3(AdvertisingIdResolver advertisingIdResolver, C8908d3<String> d3Var, C8911d6 d6Var, C9000h7 h7Var, C8908d3<C9675z3> d3Var2) {
        this.f39433a = advertisingIdResolver;
        this.f39434b = d3Var;
        this.f39435c = d6Var;
        this.f39436d = h7Var;
        this.f39437e = d3Var2;
    }

    /* renamed from: a */
    public final boolean mo31386a(int i) {
        return mo31387b().f39549c.mo30968a((long) i);
    }

    /* renamed from: b */
    public final C9675z3 mo31387b() {
        C9675z3 call = this.f39437e.call();
        return call != null ? call : C9675z3.f39546d;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0074, code lost:
        return null;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.startapp.C9219p7.C9220a mo31383a(java.lang.String r11, com.startapp.C9671z0 r12, com.startapp.C8842b3<java.lang.Throwable, java.lang.Void> r13) {
        /*
            r10 = this;
            java.lang.String r0 = "GET"
            r1 = 0
            if (r12 == 0) goto L_0x0026
            java.util.Map r2 = r10.mo31385a()
            com.startapp.d7 r3 = new com.startapp.d7     // Catch:{ SDKException -> 0x001a }
            r3.<init>()     // Catch:{ SDKException -> 0x001a }
            r12.mo29314a((com.startapp.C9152n8) r3)     // Catch:{ SDKException -> 0x001a }
            java.lang.String r12 = r3.toString()     // Catch:{ SDKException -> 0x001a }
            java.lang.String r11 = m50543a(r11, r12)     // Catch:{ SDKException -> 0x001a }
            goto L_0x0027
        L_0x001a:
            r11 = move-exception
            r12 = 2
            boolean r12 = r10.mo31386a(r12)
            if (r12 == 0) goto L_0x0025
            com.startapp.C9023i4.m48681a((java.lang.Throwable) r11)
        L_0x0025:
            return r1
        L_0x0026:
            r2 = r1
        L_0x0027:
            com.startapp.d3<java.lang.String> r12 = r10.f39434b
            java.lang.Object r12 = r12.call()
            java.lang.String r12 = (java.lang.String) r12
            com.startapp.z3 r3 = r10.mo31387b()
            boolean r3 = r3.f39547a
            long r4 = java.lang.System.currentTimeMillis()
            long r6 = com.startapp.C9605vb.m50443a()
            com.startapp.h7 r8 = r10.f39436d
            if (r8 == 0) goto L_0x0047
            com.startapp.o7 r9 = new com.startapp.o7
            r9.<init>(r8)
            goto L_0x0048
        L_0x0047:
            r9 = r1
        L_0x0048:
            com.startapp.p7$a r12 = com.startapp.C9219p7.m49149a(r11, r2, r12, r3)     // Catch:{ SDKException -> 0x005c }
            if (r9 == 0) goto L_0x0051
            r9.mo29793a(r0, r11, r1)     // Catch:{ SDKException -> 0x005c }
        L_0x0051:
            r12.f38069e = r4     // Catch:{ SDKException -> 0x005c }
            r12.f38070f = r6     // Catch:{ SDKException -> 0x005c }
            long r2 = com.startapp.C9605vb.m50443a()     // Catch:{ SDKException -> 0x005c }
            r12.f38071g = r2     // Catch:{ SDKException -> 0x005c }
            return r12
        L_0x005c:
            r12 = move-exception
            if (r9 == 0) goto L_0x0062
            r9.mo29793a(r0, r11, r12)
        L_0x0062:
            if (r13 == 0) goto L_0x0074
            r13.mo29129a(r12)     // Catch:{ all -> 0x0068 }
            goto L_0x0074
        L_0x0068:
            r11 = move-exception
            r12 = 32
            boolean r12 = r10.mo31386a(r12)
            if (r12 == 0) goto L_0x0074
            com.startapp.C9023i4.m48681a((java.lang.Throwable) r11)
        L_0x0074:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.startapp.C9654y3.mo31383a(java.lang.String, com.startapp.z0, com.startapp.b3):com.startapp.p7$a");
    }

    /* renamed from: a */
    public static String m50543a(String str, String str2) {
        if (!str.contains("?") || !str2.startsWith("?")) {
            return C9688ze.m50607a(str, str2);
        }
        return str + "&" + str2.substring(1);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:44:0x009b, code lost:
        return null;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String mo31384a(java.lang.String r7, com.startapp.C9671z0 r8, byte[] r9, boolean r10, com.startapp.C8842b3<java.lang.Throwable, java.lang.Void> r11) {
        /*
            r6 = this;
            java.lang.String r0 = "POST"
            r1 = 0
            if (r9 == 0) goto L_0x0007
            r8 = r1
            goto L_0x0061
        L_0x0007:
            if (r8 == 0) goto L_0x005f
            java.util.Map r9 = r6.mo31385a()
            com.startapp.p5 r2 = new com.startapp.p5     // Catch:{ SDKException -> 0x0052 }
            r2.<init>()     // Catch:{ SDKException -> 0x0052 }
            r8.mo29314a((com.startapp.C9152n8) r2)     // Catch:{ SDKException -> 0x0052 }
            org.json.JSONObject r8 = r2.f38053a
            java.lang.String r8 = r8.toString()
            byte[] r8 = r8.getBytes()
            com.startapp.z3 r2 = r6.mo31387b()
            boolean r2 = r2.f39547a
            if (r2 == 0) goto L_0x004e
            java.util.Map<android.app.Activity, java.lang.Integer> r2 = com.startapp.C9605vb.f39316a     // Catch:{ IOException -> 0x0042 }
            java.io.ByteArrayOutputStream r2 = new java.io.ByteArrayOutputStream     // Catch:{ IOException -> 0x0042 }
            r2.<init>()     // Catch:{ IOException -> 0x0042 }
            java.util.zip.GZIPOutputStream r3 = new java.util.zip.GZIPOutputStream     // Catch:{ IOException -> 0x0042 }
            r3.<init>(r2)     // Catch:{ IOException -> 0x0042 }
            r3.write(r8)     // Catch:{ IOException -> 0x0042 }
            r3.flush()     // Catch:{ IOException -> 0x0042 }
            r3.close()     // Catch:{ IOException -> 0x0042 }
            byte[] r8 = r2.toByteArray()     // Catch:{ IOException -> 0x0042 }
            r10 = 1
            goto L_0x004e
        L_0x0042:
            r2 = move-exception
            r3 = 16
            boolean r3 = r6.mo31386a(r3)
            if (r3 == 0) goto L_0x004e
            com.startapp.C9023i4.m48681a((java.lang.Throwable) r2)
        L_0x004e:
            r5 = r9
            r9 = r8
            r8 = r5
            goto L_0x0061
        L_0x0052:
            r7 = move-exception
            r8 = 8
            boolean r8 = r6.mo31386a(r8)
            if (r8 == 0) goto L_0x005e
            com.startapp.C9023i4.m48681a((java.lang.Throwable) r7)
        L_0x005e:
            return r1
        L_0x005f:
            r8 = r1
            r9 = r8
        L_0x0061:
            com.startapp.d3<java.lang.String> r2 = r6.f39434b
            java.lang.Object r2 = r2.call()
            java.lang.String r2 = (java.lang.String) r2
            com.startapp.h7 r3 = r6.f39436d
            if (r3 == 0) goto L_0x0073
            com.startapp.o7 r4 = new com.startapp.o7
            r4.<init>(r3)
            goto L_0x0074
        L_0x0073:
            r4 = r1
        L_0x0074:
            java.lang.String r8 = com.startapp.C9219p7.m49151a(r7, r9, r8, r2, r10)     // Catch:{ SDKException -> 0x0083 }
            if (r4 == 0) goto L_0x007d
            r4.mo29793a(r0, r7, r1)     // Catch:{ SDKException -> 0x0083 }
        L_0x007d:
            if (r8 == 0) goto L_0x0080
            goto L_0x0082
        L_0x0080:
            java.lang.String r8 = ""
        L_0x0082:
            return r8
        L_0x0083:
            r8 = move-exception
            if (r4 == 0) goto L_0x0089
            r4.mo29793a(r0, r7, r8)
        L_0x0089:
            if (r11 == 0) goto L_0x009b
            r11.mo29129a(r8)     // Catch:{ all -> 0x008f }
            goto L_0x009b
        L_0x008f:
            r7 = move-exception
            r8 = 32
            boolean r8 = r6.mo31386a(r8)
            if (r8 == 0) goto L_0x009b
            com.startapp.C9023i4.m48681a((java.lang.Throwable) r7)
        L_0x009b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.startapp.C9654y3.mo31384a(java.lang.String, com.startapp.z0, byte[], boolean, com.startapp.b3):java.lang.String");
    }

    /* renamed from: a */
    public final Map<String, String> mo31385a() {
        HashMap hashMap = new HashMap();
        if (!mo31387b().f39548b) {
            String str = null;
            try {
                str = URLEncoder.encode(this.f39433a.mo31157a().f39228a, "UTF-8");
            } catch (Throwable th) {
                if (mo31386a(64)) {
                    C9023i4.m48681a(th);
                }
            }
            hashMap.put("device-id", str);
        }
        hashMap.put("Accept-Language", ((C8879c6) this.f39435c.mo29469b()).f36586c);
        return hashMap;
    }
}
