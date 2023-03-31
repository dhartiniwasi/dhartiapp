package com.onesignal;

import java.io.IOException;
import java.lang.Thread;
import java.net.HttpURLConnection;
import java.net.URL;
import org.json.JSONObject;

/* renamed from: com.onesignal.o3 */
/* compiled from: OneSignalRestClient */
class C8524o3 {

    /* renamed from: com.onesignal.o3$a */
    /* compiled from: OneSignalRestClient */
    class C8525a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ String f35797a;

        /* renamed from: b */
        final /* synthetic */ JSONObject f35798b;

        /* renamed from: c */
        final /* synthetic */ C8531g f35799c;

        C8525a(String str, JSONObject jSONObject, C8531g gVar) {
            this.f35797a = str;
            this.f35798b = jSONObject;
            this.f35799c = gVar;
        }

        public void run() {
            C8524o3.m47236h(this.f35797a, "PUT", this.f35798b, this.f35799c, 120000, (String) null);
        }
    }

    /* renamed from: com.onesignal.o3$b */
    /* compiled from: OneSignalRestClient */
    class C8526b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ String f35800a;

        /* renamed from: b */
        final /* synthetic */ JSONObject f35801b;

        /* renamed from: c */
        final /* synthetic */ C8531g f35802c;

        C8526b(String str, JSONObject jSONObject, C8531g gVar) {
            this.f35800a = str;
            this.f35801b = jSONObject;
            this.f35802c = gVar;
        }

        public void run() {
            C8524o3.m47236h(this.f35800a, "POST", this.f35801b, this.f35802c, 120000, (String) null);
        }
    }

    /* renamed from: com.onesignal.o3$c */
    /* compiled from: OneSignalRestClient */
    class C8527c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ String f35803a;

        /* renamed from: b */
        final /* synthetic */ C8531g f35804b;

        /* renamed from: c */
        final /* synthetic */ String f35805c;

        C8527c(String str, C8531g gVar, String str2) {
            this.f35803a = str;
            this.f35804b = gVar;
            this.f35805c = str2;
        }

        public void run() {
            C8524o3.m47236h(this.f35803a, (String) null, (JSONObject) null, this.f35804b, 60000, this.f35805c);
        }
    }

    /* renamed from: com.onesignal.o3$d */
    /* compiled from: OneSignalRestClient */
    class C8528d implements Runnable {

        /* renamed from: a */
        final /* synthetic */ Thread[] f35806a;

        /* renamed from: b */
        final /* synthetic */ String f35807b;

        /* renamed from: c */
        final /* synthetic */ String f35808c;

        /* renamed from: d */
        final /* synthetic */ JSONObject f35809d;

        /* renamed from: e */
        final /* synthetic */ C8531g f35810e;

        /* renamed from: f */
        final /* synthetic */ int f35811f;

        /* renamed from: g */
        final /* synthetic */ String f35812g;

        C8528d(Thread[] threadArr, String str, String str2, JSONObject jSONObject, C8531g gVar, int i, String str3) {
            this.f35806a = threadArr;
            this.f35807b = str;
            this.f35808c = str2;
            this.f35809d = jSONObject;
            this.f35810e = gVar;
            this.f35811f = i;
            this.f35812g = str3;
        }

        public void run() {
            this.f35806a[0] = C8524o3.m47242n(this.f35807b, this.f35808c, this.f35809d, this.f35810e, this.f35811f, this.f35812g);
        }
    }

    /* renamed from: com.onesignal.o3$e */
    /* compiled from: OneSignalRestClient */
    class C8529e implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C8531g f35813a;

        /* renamed from: b */
        final /* synthetic */ String f35814b;

        C8529e(C8531g gVar, String str) {
            this.f35813a = gVar;
            this.f35814b = str;
        }

        public void run() {
            this.f35813a.mo27539b(this.f35814b);
        }
    }

    /* renamed from: com.onesignal.o3$f */
    /* compiled from: OneSignalRestClient */
    class C8530f implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C8531g f35815a;

        /* renamed from: b */
        final /* synthetic */ int f35816b;

        /* renamed from: c */
        final /* synthetic */ String f35817c;

        /* renamed from: d */
        final /* synthetic */ Throwable f35818d;

        C8530f(C8531g gVar, int i, String str, Throwable th) {
            this.f35815a = gVar;
            this.f35816b = i;
            this.f35817c = str;
            this.f35818d = th;
        }

        public void run() {
            this.f35815a.mo27538a(this.f35816b, this.f35817c, this.f35818d);
        }
    }

    /* renamed from: com.onesignal.o3$g */
    /* compiled from: OneSignalRestClient */
    static abstract class C8531g {
        C8531g() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo27538a(int i, String str, Throwable th) {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo27539b(String str) {
        }
    }

    /* renamed from: c */
    private static Thread m47231c(C8531g gVar, int i, String str, Throwable th) {
        if (gVar == null) {
            return null;
        }
        Thread thread = new Thread(new C8530f(gVar, i, str, th), "OS_REST_FAILURE_CALLBACK");
        thread.start();
        return thread;
    }

    /* renamed from: d */
    private static Thread m47232d(C8531g gVar, String str) {
        if (gVar == null) {
            return null;
        }
        Thread thread = new Thread(new C8529e(gVar, str), "OS_REST_SUCCESS_CALLBACK");
        thread.start();
        return thread;
    }

    /* renamed from: e */
    public static void m47233e(String str, C8531g gVar, String str2) {
        new Thread(new C8527c(str, gVar, str2), "OS_REST_ASYNC_GET").start();
    }

    /* renamed from: f */
    public static void m47234f(String str, C8531g gVar, String str2) {
        m47236h(str, (String) null, (JSONObject) null, gVar, 60000, str2);
    }

    /* renamed from: g */
    private static int m47235g(int i) {
        return i + 5000;
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public static void m47236h(String str, String str2, JSONObject jSONObject, C8531g gVar, int i, String str3) {
        String str4 = str2;
        if (OSUtils.m46175H()) {
            throw new C8633v2("Method: " + str2 + " was called from the Main Thread!");
        } else if (str4 == null || !C8338d3.m46426G2((String) null)) {
            Thread[] threadArr = new Thread[1];
            Thread thread = new Thread(new C8528d(threadArr, str, str2, jSONObject, gVar, i, str3), "OS_HTTPConnection");
            thread.start();
            try {
                thread.join((long) m47235g(i));
                if (thread.getState() != Thread.State.TERMINATED) {
                    thread.interrupt();
                }
                if (threadArr[0] != null) {
                    threadArr[0].join();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: i */
    private static HttpURLConnection m47237i(String str) throws IOException {
        return (HttpURLConnection) new URL("https://api.onesignal.com/" + str).openConnection();
    }

    /* renamed from: j */
    public static void m47238j(String str, JSONObject jSONObject, C8531g gVar) {
        new Thread(new C8526b(str, jSONObject, gVar), "OS_REST_ASYNC_POST").start();
    }

    /* renamed from: k */
    public static void m47239k(String str, JSONObject jSONObject, C8531g gVar) {
        m47236h(str, "POST", jSONObject, gVar, 120000, (String) null);
    }

    /* renamed from: l */
    public static void m47240l(String str, JSONObject jSONObject, C8531g gVar) {
        new Thread(new C8525a(str, jSONObject, gVar), "OS_REST_ASYNC_PUT").start();
    }

    /* renamed from: m */
    public static void m47241m(String str, JSONObject jSONObject, C8531g gVar) {
        m47236h(str, "PUT", jSONObject, gVar, 120000, (String) null);
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x02c3, code lost:
        if (r10 == null) goto L_0x02c6;
     */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x0281 A[Catch:{ all -> 0x02c7 }] */
    /* renamed from: n */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.Thread m47242n(java.lang.String r16, java.lang.String r17, org.json.JSONObject r18, com.onesignal.C8524o3.C8531g r19, int r20, java.lang.String r21) {
        /*
            r0 = r16
            r1 = r17
            r2 = r19
            r3 = r20
            r4 = r21
            java.lang.String r5 = "OneSignalRestClient: "
            int r6 = android.os.Build.VERSION.SDK_INT
            r7 = 26
            if (r6 < r7) goto L_0x0017
            r7 = 10000(0x2710, float:1.4013E-41)
            android.net.TrafficStats.setThreadStatsTag(r7)
        L_0x0017:
            r7 = 0
            r8 = -1
            com.onesignal.d3$r0 r9 = com.onesignal.C8338d3.C8384r0.DEBUG     // Catch:{ all -> 0x027b }
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ all -> 0x027b }
            r10.<init>()     // Catch:{ all -> 0x027b }
            java.lang.String r11 = "OneSignalRestClient: Making request to: https://api.onesignal.com/"
            r10.append(r11)     // Catch:{ all -> 0x027b }
            r10.append(r0)     // Catch:{ all -> 0x027b }
            java.lang.String r10 = r10.toString()     // Catch:{ all -> 0x027b }
            com.onesignal.C8338d3.m46492a(r9, r10)     // Catch:{ all -> 0x027b }
            java.net.HttpURLConnection r10 = m47237i(r16)     // Catch:{ all -> 0x027b }
            r11 = 22
            if (r6 >= r11) goto L_0x004a
            boolean r6 = r10 instanceof javax.net.ssl.HttpsURLConnection     // Catch:{ all -> 0x0279 }
            if (r6 == 0) goto L_0x004a
            r6 = r10
            javax.net.ssl.HttpsURLConnection r6 = (javax.net.ssl.HttpsURLConnection) r6     // Catch:{ all -> 0x0279 }
            com.onesignal.c4 r11 = new com.onesignal.c4     // Catch:{ all -> 0x0279 }
            javax.net.ssl.SSLSocketFactory r12 = r6.getSSLSocketFactory()     // Catch:{ all -> 0x0279 }
            r11.<init>(r12)     // Catch:{ all -> 0x0279 }
            r6.setSSLSocketFactory(r11)     // Catch:{ all -> 0x0279 }
        L_0x004a:
            r6 = 0
            r10.setUseCaches(r6)     // Catch:{ all -> 0x0279 }
            r10.setConnectTimeout(r3)     // Catch:{ all -> 0x0279 }
            r10.setReadTimeout(r3)     // Catch:{ all -> 0x0279 }
            java.lang.String r3 = "SDK-Version"
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x0279 }
            r6.<init>()     // Catch:{ all -> 0x0279 }
            java.lang.String r11 = "onesignal/android/"
            r6.append(r11)     // Catch:{ all -> 0x0279 }
            java.lang.String r11 = com.onesignal.C8338d3.m46428H0()     // Catch:{ all -> 0x0279 }
            r6.append(r11)     // Catch:{ all -> 0x0279 }
            java.lang.String r6 = r6.toString()     // Catch:{ all -> 0x0279 }
            r10.setRequestProperty(r3, r6)     // Catch:{ all -> 0x0279 }
            java.lang.String r3 = "Accept"
            java.lang.String r6 = "application/vnd.onesignal.v1+json"
            r10.setRequestProperty(r3, r6)     // Catch:{ all -> 0x0279 }
            r3 = 1
            if (r18 == 0) goto L_0x007b
            r10.setDoInput(r3)     // Catch:{ all -> 0x0279 }
        L_0x007b:
            if (r1 == 0) goto L_0x008a
            java.lang.String r6 = "Content-Type"
            java.lang.String r11 = "application/json; charset=UTF-8"
            r10.setRequestProperty(r6, r11)     // Catch:{ all -> 0x0279 }
            r10.setRequestMethod(r1)     // Catch:{ all -> 0x0279 }
            r10.setDoOutput(r3)     // Catch:{ all -> 0x0279 }
        L_0x008a:
            java.lang.String r3 = "UTF-8"
            if (r18 == 0) goto L_0x00bb
            java.lang.String r6 = com.onesignal.C8293a0.m46261g(r18)     // Catch:{ all -> 0x0279 }
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ all -> 0x0279 }
            r11.<init>()     // Catch:{ all -> 0x0279 }
            r11.append(r5)     // Catch:{ all -> 0x0279 }
            r11.append(r1)     // Catch:{ all -> 0x0279 }
            java.lang.String r12 = " SEND JSON: "
            r11.append(r12)     // Catch:{ all -> 0x0279 }
            r11.append(r6)     // Catch:{ all -> 0x0279 }
            java.lang.String r11 = r11.toString()     // Catch:{ all -> 0x0279 }
            com.onesignal.C8338d3.m46492a(r9, r11)     // Catch:{ all -> 0x0279 }
            byte[] r6 = r6.getBytes(r3)     // Catch:{ all -> 0x0279 }
            int r11 = r6.length     // Catch:{ all -> 0x0279 }
            r10.setFixedLengthStreamingMode(r11)     // Catch:{ all -> 0x0279 }
            java.io.OutputStream r11 = r10.getOutputStream()     // Catch:{ all -> 0x0279 }
            r11.write(r6)     // Catch:{ all -> 0x0279 }
        L_0x00bb:
            java.lang.String r6 = "PREFS_OS_ETAG_PREFIX_"
            if (r4 == 0) goto L_0x00ef
            java.lang.String r11 = com.onesignal.C8500m3.f35731a     // Catch:{ all -> 0x0279 }
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ all -> 0x0279 }
            r12.<init>()     // Catch:{ all -> 0x0279 }
            r12.append(r6)     // Catch:{ all -> 0x0279 }
            r12.append(r4)     // Catch:{ all -> 0x0279 }
            java.lang.String r12 = r12.toString()     // Catch:{ all -> 0x0279 }
            java.lang.String r11 = com.onesignal.C8500m3.m47107f(r11, r12, r7)     // Catch:{ all -> 0x0279 }
            if (r11 == 0) goto L_0x00ef
            java.lang.String r12 = "if-none-match"
            r10.setRequestProperty(r12, r11)     // Catch:{ all -> 0x0279 }
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ all -> 0x0279 }
            r12.<init>()     // Catch:{ all -> 0x0279 }
            java.lang.String r13 = "OneSignalRestClient: Adding header if-none-match: "
            r12.append(r13)     // Catch:{ all -> 0x0279 }
            r12.append(r11)     // Catch:{ all -> 0x0279 }
            java.lang.String r11 = r12.toString()     // Catch:{ all -> 0x0279 }
            com.onesignal.C8338d3.m46492a(r9, r11)     // Catch:{ all -> 0x0279 }
        L_0x00ef:
            int r8 = r10.getResponseCode()     // Catch:{ all -> 0x0279 }
            com.onesignal.d3$r0 r11 = com.onesignal.C8338d3.C8384r0.VERBOSE     // Catch:{ all -> 0x0275 }
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ all -> 0x0275 }
            r12.<init>()     // Catch:{ all -> 0x0275 }
            java.lang.String r13 = "OneSignalRestClient: After con.getResponseCode to: https://api.onesignal.com/"
            r12.append(r13)     // Catch:{ all -> 0x0275 }
            r12.append(r0)     // Catch:{ all -> 0x0275 }
            java.lang.String r12 = r12.toString()     // Catch:{ all -> 0x0275 }
            com.onesignal.C8338d3.m46492a(r11, r12)     // Catch:{ all -> 0x0275 }
            r11 = 200(0xc8, float:2.8E-43)
            java.lang.String r12 = " RECEIVED JSON: "
            java.lang.String r13 = ""
            java.lang.String r14 = "GET"
            java.lang.String r15 = "\\A"
            java.lang.String r7 = "PREFS_OS_HTTP_CACHE_PREFIX_"
            if (r8 == r11) goto L_0x01d4
            r11 = 202(0xca, float:2.83E-43)
            if (r8 == r11) goto L_0x01d4
            r6 = 304(0x130, float:4.26E-43)
            if (r8 == r6) goto L_0x019a
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0279 }
            r4.<init>()     // Catch:{ all -> 0x0279 }
            java.lang.String r6 = "OneSignalRestClient: Failed request to: https://api.onesignal.com/"
            r4.append(r6)     // Catch:{ all -> 0x0279 }
            r4.append(r0)     // Catch:{ all -> 0x0279 }
            java.lang.String r0 = r4.toString()     // Catch:{ all -> 0x0279 }
            com.onesignal.C8338d3.m46492a(r9, r0)     // Catch:{ all -> 0x0279 }
            java.io.InputStream r0 = r10.getErrorStream()     // Catch:{ all -> 0x0279 }
            if (r0 != 0) goto L_0x013d
            java.io.InputStream r0 = r10.getInputStream()     // Catch:{ all -> 0x0279 }
        L_0x013d:
            if (r0 == 0) goto L_0x0171
            java.util.Scanner r4 = new java.util.Scanner     // Catch:{ all -> 0x0279 }
            r4.<init>(r0, r3)     // Catch:{ all -> 0x0279 }
            java.util.Scanner r0 = r4.useDelimiter(r15)     // Catch:{ all -> 0x0279 }
            boolean r0 = r0.hasNext()     // Catch:{ all -> 0x0279 }
            if (r0 == 0) goto L_0x0152
            java.lang.String r13 = r4.next()     // Catch:{ all -> 0x0279 }
        L_0x0152:
            r4.close()     // Catch:{ all -> 0x0279 }
            com.onesignal.d3$r0 r0 = com.onesignal.C8338d3.C8384r0.WARN     // Catch:{ all -> 0x0279 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0279 }
            r3.<init>()     // Catch:{ all -> 0x0279 }
            r3.append(r5)     // Catch:{ all -> 0x0279 }
            r3.append(r1)     // Catch:{ all -> 0x0279 }
            r3.append(r12)     // Catch:{ all -> 0x0279 }
            r3.append(r13)     // Catch:{ all -> 0x0279 }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x0279 }
            com.onesignal.C8338d3.m46492a(r0, r3)     // Catch:{ all -> 0x0279 }
            r3 = 0
            goto L_0x0194
        L_0x0171:
            com.onesignal.d3$r0 r0 = com.onesignal.C8338d3.C8384r0.WARN     // Catch:{ all -> 0x0279 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0279 }
            r3.<init>()     // Catch:{ all -> 0x0279 }
            r3.append(r5)     // Catch:{ all -> 0x0279 }
            r3.append(r1)     // Catch:{ all -> 0x0279 }
            java.lang.String r4 = " HTTP Code: "
            r3.append(r4)     // Catch:{ all -> 0x0279 }
            r3.append(r8)     // Catch:{ all -> 0x0279 }
            java.lang.String r4 = " No response body!"
            r3.append(r4)     // Catch:{ all -> 0x0279 }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x0279 }
            com.onesignal.C8338d3.m46492a(r0, r3)     // Catch:{ all -> 0x0279 }
            r3 = 0
            r13 = 0
        L_0x0194:
            java.lang.Thread r0 = m47231c(r2, r8, r13, r3)     // Catch:{ all -> 0x0279 }
            goto L_0x026d
        L_0x019a:
            java.lang.String r0 = com.onesignal.C8500m3.f35731a     // Catch:{ all -> 0x0279 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0279 }
            r3.<init>()     // Catch:{ all -> 0x0279 }
            r3.append(r7)     // Catch:{ all -> 0x0279 }
            r3.append(r4)     // Catch:{ all -> 0x0279 }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x0279 }
            r4 = 0
            java.lang.String r0 = com.onesignal.C8500m3.m47107f(r0, r3, r4)     // Catch:{ all -> 0x0279 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0279 }
            r3.<init>()     // Catch:{ all -> 0x0279 }
            r3.append(r5)     // Catch:{ all -> 0x0279 }
            if (r1 != 0) goto L_0x01bb
            goto L_0x01bc
        L_0x01bb:
            r14 = r1
        L_0x01bc:
            r3.append(r14)     // Catch:{ all -> 0x0279 }
            java.lang.String r4 = " - Using Cached response due to 304: "
            r3.append(r4)     // Catch:{ all -> 0x0279 }
            r3.append(r0)     // Catch:{ all -> 0x0279 }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x0279 }
            com.onesignal.C8338d3.m46492a(r9, r3)     // Catch:{ all -> 0x0279 }
            java.lang.Thread r0 = m47232d(r2, r0)     // Catch:{ all -> 0x0279 }
            goto L_0x026d
        L_0x01d4:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ all -> 0x0275 }
            r11.<init>()     // Catch:{ all -> 0x0275 }
            r18 = r8
            java.lang.String r8 = "OneSignalRestClient: Successfully finished request to: https://api.onesignal.com/"
            r11.append(r8)     // Catch:{ all -> 0x0271 }
            r11.append(r0)     // Catch:{ all -> 0x0271 }
            java.lang.String r0 = r11.toString()     // Catch:{ all -> 0x0271 }
            com.onesignal.C8338d3.m46492a(r9, r0)     // Catch:{ all -> 0x0271 }
            java.io.InputStream r0 = r10.getInputStream()     // Catch:{ all -> 0x0271 }
            java.util.Scanner r8 = new java.util.Scanner     // Catch:{ all -> 0x0271 }
            r8.<init>(r0, r3)     // Catch:{ all -> 0x0271 }
            java.util.Scanner r0 = r8.useDelimiter(r15)     // Catch:{ all -> 0x0271 }
            boolean r0 = r0.hasNext()     // Catch:{ all -> 0x0271 }
            if (r0 == 0) goto L_0x0201
            java.lang.String r13 = r8.next()     // Catch:{ all -> 0x0271 }
        L_0x0201:
            r8.close()     // Catch:{ all -> 0x0271 }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x0271 }
            r0.<init>()     // Catch:{ all -> 0x0271 }
            r0.append(r5)     // Catch:{ all -> 0x0271 }
            if (r1 != 0) goto L_0x020f
            goto L_0x0210
        L_0x020f:
            r14 = r1
        L_0x0210:
            r0.append(r14)     // Catch:{ all -> 0x0271 }
            r0.append(r12)     // Catch:{ all -> 0x0271 }
            r0.append(r13)     // Catch:{ all -> 0x0271 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0271 }
            com.onesignal.C8338d3.m46492a(r9, r0)     // Catch:{ all -> 0x0271 }
            if (r4 == 0) goto L_0x0269
            java.lang.String r0 = "etag"
            java.lang.String r0 = r10.getHeaderField(r0)     // Catch:{ all -> 0x0271 }
            if (r0 == 0) goto L_0x0269
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0271 }
            r3.<init>()     // Catch:{ all -> 0x0271 }
            java.lang.String r8 = "OneSignalRestClient: Response has etag of "
            r3.append(r8)     // Catch:{ all -> 0x0271 }
            r3.append(r0)     // Catch:{ all -> 0x0271 }
            java.lang.String r8 = " so caching the response."
            r3.append(r8)     // Catch:{ all -> 0x0271 }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x0271 }
            com.onesignal.C8338d3.m46492a(r9, r3)     // Catch:{ all -> 0x0271 }
            java.lang.String r3 = com.onesignal.C8500m3.f35731a     // Catch:{ all -> 0x0271 }
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ all -> 0x0271 }
            r8.<init>()     // Catch:{ all -> 0x0271 }
            r8.append(r6)     // Catch:{ all -> 0x0271 }
            r8.append(r4)     // Catch:{ all -> 0x0271 }
            java.lang.String r6 = r8.toString()     // Catch:{ all -> 0x0271 }
            com.onesignal.C8500m3.m47114m(r3, r6, r0)     // Catch:{ all -> 0x0271 }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x0271 }
            r0.<init>()     // Catch:{ all -> 0x0271 }
            r0.append(r7)     // Catch:{ all -> 0x0271 }
            r0.append(r4)     // Catch:{ all -> 0x0271 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0271 }
            com.onesignal.C8500m3.m47114m(r3, r0, r13)     // Catch:{ all -> 0x0271 }
        L_0x0269:
            java.lang.Thread r0 = m47232d(r2, r13)     // Catch:{ all -> 0x0271 }
        L_0x026d:
            r10.disconnect()
            goto L_0x02c6
        L_0x0271:
            r0 = move-exception
            r8 = r18
            goto L_0x027d
        L_0x0275:
            r0 = move-exception
            r18 = r8
            goto L_0x027d
        L_0x0279:
            r0 = move-exception
            goto L_0x027d
        L_0x027b:
            r0 = move-exception
            r10 = 0
        L_0x027d:
            boolean r3 = r0 instanceof java.net.ConnectException     // Catch:{ all -> 0x02c7 }
            if (r3 != 0) goto L_0x02a0
            boolean r3 = r0 instanceof java.net.UnknownHostException     // Catch:{ all -> 0x02c7 }
            if (r3 == 0) goto L_0x0286
            goto L_0x02a0
        L_0x0286:
            com.onesignal.d3$r0 r3 = com.onesignal.C8338d3.C8384r0.WARN     // Catch:{ all -> 0x02c7 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x02c7 }
            r4.<init>()     // Catch:{ all -> 0x02c7 }
            r4.append(r5)     // Catch:{ all -> 0x02c7 }
            r4.append(r1)     // Catch:{ all -> 0x02c7 }
            java.lang.String r1 = " Error thrown from network stack. "
            r4.append(r1)     // Catch:{ all -> 0x02c7 }
            java.lang.String r1 = r4.toString()     // Catch:{ all -> 0x02c7 }
            com.onesignal.C8338d3.m46496b(r3, r1, r0)     // Catch:{ all -> 0x02c7 }
            goto L_0x02be
        L_0x02a0:
            com.onesignal.d3$r0 r1 = com.onesignal.C8338d3.C8384r0.INFO     // Catch:{ all -> 0x02c7 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x02c7 }
            r3.<init>()     // Catch:{ all -> 0x02c7 }
            java.lang.String r4 = "OneSignalRestClient: Could not send last request, device is offline. Throwable: "
            r3.append(r4)     // Catch:{ all -> 0x02c7 }
            java.lang.Class r4 = r0.getClass()     // Catch:{ all -> 0x02c7 }
            java.lang.String r4 = r4.getName()     // Catch:{ all -> 0x02c7 }
            r3.append(r4)     // Catch:{ all -> 0x02c7 }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x02c7 }
            com.onesignal.C8338d3.m46492a(r1, r3)     // Catch:{ all -> 0x02c7 }
        L_0x02be:
            r1 = 0
            java.lang.Thread r0 = m47231c(r2, r8, r1, r0)     // Catch:{ all -> 0x02c7 }
            if (r10 == 0) goto L_0x02c6
            goto L_0x026d
        L_0x02c6:
            return r0
        L_0x02c7:
            r0 = move-exception
            if (r10 == 0) goto L_0x02cd
            r10.disconnect()
        L_0x02cd:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onesignal.C8524o3.m47242n(java.lang.String, java.lang.String, org.json.JSONObject, com.onesignal.o3$g, int, java.lang.String):java.lang.Thread");
    }
}
