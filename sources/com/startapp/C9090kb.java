package com.startapp;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.JsonReader;
import android.util.MalformedJsonException;
import com.startapp.sdk.adsbase.C9441e;
import com.startapp.sdk.common.advertisingid.AdvertisingIdResolver;
import com.startapp.sdk.jobs.C9529b;
import com.startapp.sdk.jobs.C9532d;
import com.startapp.sdk.jobs.JobRequest;
import com.startapp.sdk.triggeredlinks.AppEventsMetadata;
import com.startapp.sdk.triggeredlinks.PeriodicAppEventMetadata;
import com.startapp.sdk.triggeredlinks.TriggeredLinksMetadata;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;

/* renamed from: com.startapp.kb */
/* compiled from: Sta */
public class C9090kb {

    /* renamed from: a */
    public final String f37193a;

    /* renamed from: b */
    public final C9441e f37194b;

    /* renamed from: c */
    public final Executor f37195c;

    /* renamed from: d */
    public final C9130m5 f37196d;

    /* renamed from: e */
    public final Handler f37197e;

    /* renamed from: f */
    public final Map<String, Long> f37198f;

    /* renamed from: g */
    public final AdvertisingIdResolver f37199g;

    /* renamed from: h */
    public final C8908d3<String> f37200h;

    /* renamed from: i */
    public final C8908d3<TriggeredLinksMetadata> f37201i;

    /* renamed from: j */
    public final Runnable f37202j = new C9091a();

    /* renamed from: com.startapp.kb$a */
    /* compiled from: Sta */
    public class C9091a implements Runnable {
        public C9091a() {
        }

        public void run() {
            C9090kb.this.mo29619b();
        }
    }

    /* renamed from: com.startapp.kb$b */
    /* compiled from: Sta */
    public class C9092b implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ TriggeredLinksMetadata f37204a;

        /* renamed from: b */
        public final /* synthetic */ Map f37205b;

        /* renamed from: c */
        public final /* synthetic */ String f37206c;

        public C9092b(TriggeredLinksMetadata triggeredLinksMetadata, Map map, String str) {
            this.f37204a = triggeredLinksMetadata;
            this.f37205b = map;
            this.f37206c = str;
        }

        public void run() {
            try {
                C9090kb.this.mo29620b(this.f37204a, this.f37205b, this.f37206c);
            } catch (Throwable th) {
                if (C9090kb.this.mo29618a(2)) {
                    C9023i4.m48681a(th);
                }
            }
        }
    }

    public C9090kb(String str, C9441e eVar, Executor executor, C9130m5 m5Var, AdvertisingIdResolver advertisingIdResolver, C8908d3<String> d3Var, C8908d3<TriggeredLinksMetadata> d3Var2) {
        this.f37193a = str;
        this.f37194b = eVar;
        this.f37195c = new C9262r9(executor);
        this.f37196d = m5Var;
        this.f37197e = new Handler(Looper.getMainLooper());
        this.f37198f = new HashMap();
        this.f37199g = advertisingIdResolver;
        this.f37200h = d3Var;
        this.f37201i = d3Var2;
    }

    /* renamed from: a */
    public final TriggeredLinksMetadata mo29612a() {
        TriggeredLinksMetadata call = this.f37201i.call();
        if (call == null || !call.mo31250e()) {
            return null;
        }
        return call;
    }

    /* renamed from: b */
    public void mo29619b() {
        String b;
        this.f37197e.removeCallbacks(this.f37202j);
        int i = 1;
        this.f37196d.mo29687a(JobRequest.m50297a((Class<? extends C9529b>[]) new Class[]{C9051jb.class}));
        TriggeredLinksMetadata a = mo29612a();
        Map<String, PeriodicAppEventMetadata> map = null;
        AppEventsMetadata a2 = a != null ? a.mo31246a() : null;
        if (a2 != null) {
            map = a2.mo31238d();
        }
        if (map != null && map.size() >= 1) {
            C9441e.C9442a a3 = this.f37194b.edit();
            long currentTimeMillis = System.currentTimeMillis();
            long j = Long.MAX_VALUE;
            for (Map.Entry next : map.entrySet()) {
                String str = (String) next.getKey();
                PeriodicAppEventMetadata periodicAppEventMetadata = (PeriodicAppEventMetadata) next.getValue();
                if (!(str == null || str.length() < i || periodicAppEventMetadata == null || (b = periodicAppEventMetadata.mo31242b()) == null || b.length() < i)) {
                    int a4 = periodicAppEventMetadata.mo31241a();
                    int i2 = a4 < 5 ? 5 : a4;
                    long j2 = this.f37194b.getLong(str, 0);
                    if (j2 > currentTimeMillis) {
                        a3.mo30812a(str, Long.valueOf(j2));
                        a3.f38873a.putLong(str, j2);
                        if (j > j2) {
                            j = j2;
                        }
                    } else {
                        long j3 = (((long) i2) * 1000) + currentTimeMillis;
                        a3.mo30812a(str, Long.valueOf(j3));
                        a3.f38873a.putLong(str, j3);
                        C9137mb mbVar = r0;
                        Executor executor = this.f37195c;
                        C9137mb mbVar2 = new C9137mb(this, a, str, b, i2);
                        executor.execute(mbVar);
                    }
                }
                i = 1;
            }
            a3.apply();
            if (j != Long.MAX_VALUE) {
                long j4 = j - currentTimeMillis;
                if (j4 < 5000) {
                    mo29613a(j4);
                    return;
                }
                C9532d.C9533a aVar = new C9532d.C9533a(C9051jb.class);
                aVar.f39146d = Long.valueOf(j4);
                aVar.f39135b = JobRequest.Network.ANY;
                this.f37196d.mo29688a(new C9532d((C9532d.C9533a) aVar.mo31229a()));
            }
        }
    }

    /* renamed from: a */
    public boolean mo29618a(int i) {
        TriggeredLinksMetadata a = mo29612a();
        return a != null && (a.mo31247b() & i) == i;
    }

    /* renamed from: a */
    public void mo29613a(long j) {
        if (j > 0) {
            this.f37197e.postDelayed(this.f37202j, j);
        } else {
            this.f37197e.post(this.f37202j);
        }
    }

    /* renamed from: a */
    public void mo29616a(String str, int i) {
        C9441e.C9442a a = this.f37194b.edit();
        long currentTimeMillis = (((long) i) * 1000) + System.currentTimeMillis();
        a.mo30812a(str, Long.valueOf(currentTimeMillis));
        a.f38873a.putLong(str, currentTimeMillis);
        a.apply();
    }

    /* renamed from: a */
    public void mo29615a(TriggeredLinksMetadata triggeredLinksMetadata, Map<String, String> map, String str) {
        this.f37195c.execute(new C9092b(triggeredLinksMetadata, map, str));
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [java.net.URLConnection] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x012c A[Catch:{ all -> 0x0131 }] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo29614a(com.startapp.sdk.triggeredlinks.TriggeredLinksMetadata r12, java.lang.String r13, java.lang.String r14, java.lang.String r15) throws java.io.IOException, org.json.JSONException {
        /*
            r11 = this;
            android.net.Uri r15 = android.net.Uri.parse(r15)
            android.net.Uri$Builder r0 = r15.buildUpon()
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 2
            r3 = 1
            r4 = 11
            r5 = 0
            r6 = 0
            if (r1 < r4) goto L_0x008f
            r0.query(r6)
            java.util.Set r1 = r15.getQueryParameterNames()
            java.util.Iterator r1 = r1.iterator()
        L_0x001d:
            boolean r7 = r1.hasNext()
            if (r7 == 0) goto L_0x008f
            java.lang.Object r7 = r1.next()
            java.lang.String r7 = (java.lang.String) r7
            if (r7 != 0) goto L_0x002c
            goto L_0x001d
        L_0x002c:
            java.lang.String r8 = r15.getQueryParameter(r7)
            if (r8 != 0) goto L_0x0033
            goto L_0x001d
        L_0x0033:
            r9 = -1
            int r10 = r8.hashCode()
            switch(r10) {
                case -1089147532: goto L_0x0052;
                case 613582261: goto L_0x0047;
                case 1311708630: goto L_0x003c;
                default: goto L_0x003b;
            }
        L_0x003b:
            goto L_0x005c
        L_0x003c:
            java.lang.String r10 = "startapp_advertising_id"
            boolean r10 = r8.equals(r10)
            if (r10 != 0) goto L_0x0045
            goto L_0x005c
        L_0x0045:
            r9 = 2
            goto L_0x005c
        L_0x0047:
            java.lang.String r10 = "startapp_no_tracking"
            boolean r10 = r8.equals(r10)
            if (r10 != 0) goto L_0x0050
            goto L_0x005c
        L_0x0050:
            r9 = 1
            goto L_0x005c
        L_0x0052:
            java.lang.String r10 = "startapp_package_id"
            boolean r10 = r8.equals(r10)
            if (r10 != 0) goto L_0x005b
            goto L_0x005c
        L_0x005b:
            r9 = 0
        L_0x005c:
            java.lang.String r10 = "0"
            switch(r9) {
                case 0: goto L_0x0089;
                case 1: goto L_0x0079;
                case 2: goto L_0x0065;
                default: goto L_0x0061;
            }
        L_0x0061:
            r0.appendQueryParameter(r7, r8)
            goto L_0x001d
        L_0x0065:
            com.startapp.sdk.common.advertisingid.AdvertisingIdResolver r8 = r11.f37199g
            com.startapp.u r8 = r8.mo31157a()
            java.lang.String r8 = r8.f39228a
            boolean r9 = r8.equals(r10)
            if (r9 == 0) goto L_0x0075
            java.lang.String r8 = "00000000-0000-0000-0000-000000000000"
        L_0x0075:
            r0.appendQueryParameter(r7, r8)
            goto L_0x001d
        L_0x0079:
            com.startapp.sdk.common.advertisingid.AdvertisingIdResolver r8 = r11.f37199g
            com.startapp.u r8 = r8.mo31157a()
            boolean r8 = r8.f39230c
            if (r8 == 0) goto L_0x0085
            java.lang.String r10 = "1"
        L_0x0085:
            r0.appendQueryParameter(r7, r10)
            goto L_0x001d
        L_0x0089:
            java.lang.String r8 = r11.f37193a
            r0.appendQueryParameter(r7, r8)
            goto L_0x001d
        L_0x008f:
            android.net.Uri r15 = r0.build()
            java.lang.String r15 = r15.toString()
            java.net.URL r0 = new java.net.URL     // Catch:{ all -> 0x0123 }
            r0.<init>(r15)     // Catch:{ all -> 0x0123 }
            java.net.URLConnection r0 = r0.openConnection()     // Catch:{ all -> 0x0123 }
            boolean r1 = r0 instanceof java.net.HttpURLConnection     // Catch:{ all -> 0x011f }
            if (r1 == 0) goto L_0x00e3
            r1 = r0
            java.net.HttpURLConnection r1 = (java.net.HttpURLConnection) r1     // Catch:{ all -> 0x011f }
            r1.setInstanceFollowRedirects(r3)     // Catch:{ all -> 0x011f }
            int r3 = r12.mo31248c()     // Catch:{ all -> 0x011f }
            int r3 = r3 * 1000
            r1.setReadTimeout(r3)     // Catch:{ all -> 0x011f }
            int r3 = r12.mo31248c()     // Catch:{ all -> 0x011f }
            int r3 = r3 * 1000
            r1.setConnectTimeout(r3)     // Catch:{ all -> 0x011f }
            com.startapp.d3<java.lang.String> r3 = r11.f37200h     // Catch:{ all -> 0x011f }
            java.lang.Object r3 = r3.call()     // Catch:{ all -> 0x011f }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ all -> 0x011f }
            if (r3 == 0) goto L_0x00d1
            int r5 = r3.length()     // Catch:{ all -> 0x011f }
            if (r5 <= 0) goto L_0x00d1
            java.lang.String r5 = "User-Agent"
            r1.setRequestProperty(r5, r3)     // Catch:{ all -> 0x011f }
        L_0x00d1:
            r1.connect()     // Catch:{ all -> 0x011f }
            int r5 = r1.getResponseCode()     // Catch:{ all -> 0x011f }
            java.io.InputStream r6 = r1.getInputStream()     // Catch:{ all -> 0x011f }
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x011f }
            if (r1 < r4) goto L_0x00e3
            r11.mo29617a((java.lang.String) r13, (java.lang.String) r14, (java.io.InputStream) r6)     // Catch:{ all -> 0x011f }
        L_0x00e3:
            com.startapp.C9605vb.m50459a((java.io.Closeable) r6)
            boolean r1 = r0 instanceof java.net.HttpURLConnection     // Catch:{ all -> 0x00f0 }
            if (r1 == 0) goto L_0x00f1
            java.net.HttpURLConnection r0 = (java.net.HttpURLConnection) r0     // Catch:{ all -> 0x00f0 }
            r0.disconnect()     // Catch:{ all -> 0x00f0 }
            goto L_0x00f1
        L_0x00f0:
        L_0x00f1:
            boolean r12 = r12.mo31252f()
            if (r12 == 0) goto L_0x011e
            int r5 = r5 / 100
            if (r5 != r2) goto L_0x011e
            com.startapp.i4 r12 = new com.startapp.i4
            com.startapp.j4 r0 = com.startapp.C9043j4.f37004o
            r12.<init>((com.startapp.C9043j4) r0)
            r12.f36952d = r14
            org.json.JSONObject r14 = new org.json.JSONObject
            r14.<init>()
            java.lang.String r0 = "eventType"
            org.json.JSONObject r13 = r14.put(r0, r13)
            java.lang.String r14 = "url"
            org.json.JSONObject r13 = r13.put(r14, r15)
            java.lang.String r13 = r13.toString()
            r12.f36953e = r13
            r12.mo29471a()
        L_0x011e:
            return
        L_0x011f:
            r12 = move-exception
            r13 = r6
            r6 = r0
            goto L_0x0125
        L_0x0123:
            r12 = move-exception
            r13 = r6
        L_0x0125:
            com.startapp.C9605vb.m50459a((java.io.Closeable) r13)
            boolean r13 = r6 instanceof java.net.HttpURLConnection     // Catch:{ all -> 0x0131 }
            if (r13 == 0) goto L_0x0131
            java.net.HttpURLConnection r6 = (java.net.HttpURLConnection) r6     // Catch:{ all -> 0x0131 }
            r6.disconnect()     // Catch:{ all -> 0x0131 }
        L_0x0131:
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.startapp.C9090kb.mo29614a(com.startapp.sdk.triggeredlinks.TriggeredLinksMetadata, java.lang.String, java.lang.String, java.lang.String):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x007c, code lost:
        if (r2.longValue() > android.os.SystemClock.elapsedRealtime()) goto L_0x0080;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo29620b(com.startapp.sdk.triggeredlinks.TriggeredLinksMetadata r9, java.util.Map<java.lang.String, java.lang.String> r10, java.lang.String r11) {
        /*
            r8 = this;
            java.util.Set r10 = r10.entrySet()
            java.util.Iterator r10 = r10.iterator()
        L_0x0008:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x0094
            java.lang.Object r0 = r10.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r1 = r0.getKey()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r0 = r0.getValue()
            java.lang.String r0 = (java.lang.String) r0
            if (r1 == 0) goto L_0x0094
            int r2 = r1.length()
            r3 = 1
            if (r2 >= r3) goto L_0x002a
            goto L_0x0094
        L_0x002a:
            if (r0 == 0) goto L_0x0094
            int r2 = r0.length()
            if (r2 >= r3) goto L_0x0033
            goto L_0x0094
        L_0x0033:
            java.util.List r2 = r9.mo31249d()
            if (r2 != 0) goto L_0x003a
            goto L_0x007f
        L_0x003a:
            java.util.Iterator r2 = r2.iterator()
        L_0x003e:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L_0x007f
            java.lang.Object r4 = r2.next()
            java.lang.Integer r4 = (java.lang.Integer) r4
            java.lang.String r4 = java.lang.String.valueOf(r4)
            boolean r4 = r1.equals(r4)
            if (r4 == 0) goto L_0x003e
            java.util.Map<java.lang.String, java.lang.Long> r2 = r8.f37198f
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r1)
            java.lang.String r5 = "-"
            r4.append(r5)
            r4.append(r11)
            java.lang.String r4 = r4.toString()
            java.lang.Object r2 = r2.get(r4)
            java.lang.Long r2 = (java.lang.Long) r2
            if (r2 == 0) goto L_0x007f
            long r4 = r2.longValue()
            long r6 = android.os.SystemClock.elapsedRealtime()
            int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r2 <= 0) goto L_0x007f
            goto L_0x0080
        L_0x007f:
            r3 = 0
        L_0x0080:
            if (r3 == 0) goto L_0x0083
            return
        L_0x0083:
            r8.mo29614a(r9, r11, r1, r0)     // Catch:{ all -> 0x0087 }
            goto L_0x0008
        L_0x0087:
            r0 = move-exception
            r1 = 4
            boolean r1 = r8.mo29618a((int) r1)
            if (r1 == 0) goto L_0x0008
            com.startapp.C9023i4.m48681a((java.lang.Throwable) r0)
            goto L_0x0008
        L_0x0094:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.startapp.C9090kb.mo29620b(com.startapp.sdk.triggeredlinks.TriggeredLinksMetadata, java.util.Map, java.lang.String):void");
    }

    /* renamed from: a */
    public final void mo29617a(String str, String str2, InputStream inputStream) throws IOException {
        try {
            Object b = C9240q5.m49180b(new JsonReader(new InputStreamReader(inputStream)));
            if (b instanceof Map) {
                Object obj = ((Map) b).get("throttleSec");
                if (obj instanceof Number) {
                    int intValue = ((Number) obj).intValue();
                    Map<String, Long> map = this.f37198f;
                    map.put(str2 + "-" + str, Long.valueOf((((long) intValue) * 1000) + SystemClock.elapsedRealtime()));
                }
            }
        } catch (IOException e) {
            if (!(e instanceof MalformedJsonException)) {
                throw e;
            }
        }
    }
}
