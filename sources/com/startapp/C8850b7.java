package com.startapp;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Handler;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.startapp.sdk.adsbase.C9396a;
import com.startapp.sdk.adsbase.C9441e;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Executor;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.startapp.b7 */
/* compiled from: Sta */
public class C8850b7 extends WebViewClient {

    /* renamed from: a */
    public final Context f36508a;

    /* renamed from: b */
    public final C9441e f36509b;

    /* renamed from: c */
    public final Executor f36510c;

    /* renamed from: d */
    public final Handler f36511d;

    /* renamed from: e */
    public String f36512e;

    /* renamed from: f */
    public String f36513f;

    /* renamed from: g */
    public boolean f36514g = false;

    /* renamed from: h */
    public boolean f36515h = false;

    /* renamed from: i */
    public long f36516i;

    /* renamed from: j */
    public final long f36517j;

    /* renamed from: k */
    public boolean f36518k;

    /* renamed from: l */
    public Boolean f36519l;

    /* renamed from: m */
    public String f36520m;

    /* renamed from: n */
    public Runnable f36521n;

    /* renamed from: o */
    public boolean f36522o = false;

    /* renamed from: p */
    public boolean f36523p = false;

    /* renamed from: q */
    public final LinkedHashMap<String, Float> f36524q = new LinkedHashMap<>();

    /* renamed from: r */
    public long f36525r;

    /* renamed from: s */
    public final Runnable f36526s = new C8851a();

    /* renamed from: t */
    public final Runnable f36527t = new C8852b();

    /* renamed from: u */
    public final Runnable f36528u = new C8853c();

    /* renamed from: v */
    public final Runnable f36529v = new C8854d();

    /* renamed from: com.startapp.b7$a */
    /* compiled from: Sta */
    public class C8851a implements Runnable {
        public C8851a() {
        }

        public void run() {
            C8850b7 b7Var = C8850b7.this;
            b7Var.f36510c.execute(b7Var.f36527t);
        }
    }

    /* renamed from: com.startapp.b7$b */
    /* compiled from: Sta */
    public class C8852b implements Runnable {
        public C8852b() {
        }

        public void run() {
            C8850b7 b7Var = C8850b7.this;
            if (!b7Var.f36514g) {
                try {
                    C9023i4 i4Var = new C9023i4(C9043j4.f36994e);
                    StringBuilder sb = new StringBuilder();
                    sb.append("Failed smart redirect hop info: ");
                    sb.append(b7Var.f36523p ? "Page Finished" : "Timeout");
                    i4Var.f36952d = sb.toString();
                    i4Var.f36954f = b7Var.mo29218b();
                    i4Var.f36955g = b7Var.f36513f;
                    i4Var.mo29471a();
                } catch (Throwable th) {
                    C9023i4.m48681a(th);
                }
                try {
                    b7Var.f36522o = true;
                    C9396a.m49793b(b7Var.f36508a);
                    b7Var.mo29216a();
                    if (!b7Var.f36518k || !MetaData.f38952k.mo31004T()) {
                        C9396a.m49794b(b7Var.f36508a, b7Var.f36512e, b7Var.f36513f);
                    } else {
                        C9396a.m49779a(b7Var.f36508a, b7Var.f36512e, b7Var.f36513f);
                    }
                    Runnable runnable = b7Var.f36521n;
                    if (runnable != null) {
                        runnable.run();
                    }
                } catch (Throwable th2) {
                    C9023i4.m48681a(th2);
                }
            }
        }
    }

    /* renamed from: com.startapp.b7$c */
    /* compiled from: Sta */
    public class C8853c implements Runnable {
        public C8853c() {
        }

        public void run() {
            C8850b7 b7Var = C8850b7.this;
            b7Var.f36510c.execute(b7Var.f36529v);
        }
    }

    /* renamed from: com.startapp.b7$d */
    /* compiled from: Sta */
    public class C8854d implements Runnable {
        public C8854d() {
        }

        public void run() {
            C8850b7 b7Var = C8850b7.this;
            if (!b7Var.f36522o && !b7Var.f36514g) {
                try {
                    b7Var.f36514g = true;
                    C9396a.m49793b(b7Var.f36508a);
                    if (!b7Var.f36518k || !MetaData.f38952k.mo31004T()) {
                        C9396a.m49794b(b7Var.f36508a, b7Var.f36512e, b7Var.f36513f);
                    } else {
                        C9396a.m49779a(b7Var.f36508a, b7Var.f36512e, b7Var.f36513f);
                    }
                    Runnable runnable = b7Var.f36521n;
                    if (runnable != null) {
                        runnable.run();
                    }
                } catch (Throwable th) {
                    C9023i4.m48681a(th);
                }
            }
        }
    }

    /* renamed from: com.startapp.b7$e */
    /* compiled from: Sta */
    public class C8855e implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ String f36534a;

        public C8855e(String str) {
            this.f36534a = str;
        }

        public void run() {
            C8850b7 b7Var = C8850b7.this;
            String str = this.f36534a;
            if (!b7Var.f36515h) {
                b7Var.f36525r = System.currentTimeMillis();
                b7Var.f36524q.put(str, Float.valueOf(-1.0f));
                b7Var.f36511d.postDelayed(b7Var.f36526s, b7Var.f36516i);
                b7Var.f36515h = true;
            }
            b7Var.f36523p = false;
            b7Var.mo29216a();
        }
    }

    /* renamed from: com.startapp.b7$f */
    /* compiled from: Sta */
    public class C8856f implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ String f36536a;

        public C8856f(String str) {
            this.f36536a = str;
        }

        public void run() {
            C8850b7 b7Var = C8850b7.this;
            String str = this.f36536a;
            b7Var.getClass();
            long currentTimeMillis = System.currentTimeMillis();
            b7Var.f36525r = currentTimeMillis;
            b7Var.f36524q.put(b7Var.f36512e, Float.valueOf(((float) (currentTimeMillis - b7Var.f36525r)) / 1000.0f));
            b7Var.f36524q.put(str, Float.valueOf(-1.0f));
            b7Var.f36512e = str;
        }
    }

    /* renamed from: com.startapp.b7$g */
    /* compiled from: Sta */
    public class C8857g implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ String f36538a;

        /* renamed from: b */
        public final /* synthetic */ boolean f36539b;

        /* renamed from: c */
        public final /* synthetic */ String f36540c;

        public C8857g(String str, boolean z, String str2) {
            this.f36538a = str;
            this.f36539b = z;
            this.f36540c = str2;
        }

        /* JADX WARNING: Removed duplicated region for block: B:24:0x008e A[Catch:{ all -> 0x00df }] */
        /* JADX WARNING: Removed duplicated region for block: B:25:0x0097 A[Catch:{ all -> 0x00df }] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r8 = this;
                com.startapp.b7 r0 = com.startapp.C8850b7.this
                java.lang.String r1 = r8.f36538a
                boolean r2 = r8.f36539b
                java.lang.String r3 = r8.f36540c
                r0.getClass()
                boolean r4 = r0.f36522o     // Catch:{ all -> 0x00df }
                if (r4 != 0) goto L_0x00e3
                r4 = 1
                r0.f36514g = r4     // Catch:{ all -> 0x00df }
                android.content.Context r5 = r0.f36508a     // Catch:{ all -> 0x00df }
                com.startapp.sdk.adsbase.C9396a.m49793b((android.content.Context) r5)     // Catch:{ all -> 0x00df }
                r0.mo29216a()     // Catch:{ all -> 0x00df }
                android.content.Context r5 = r0.f36508a     // Catch:{ all -> 0x00df }
                if (r2 == 0) goto L_0x001f
                r1 = r3
            L_0x001f:
                r2 = 0
                com.startapp.sdk.adsbase.C9396a.m49794b(r5, r1, r2)     // Catch:{ all -> 0x00df }
                java.lang.String r1 = r0.f36520m     // Catch:{ all -> 0x00df }
                if (r1 == 0) goto L_0x0073
                java.lang.String r2 = ""
                boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x00df }
                if (r1 != 0) goto L_0x0073
                java.lang.String r1 = r0.f36512e     // Catch:{ all -> 0x00df }
                java.lang.String r1 = r1.toLowerCase()     // Catch:{ all -> 0x00df }
                java.lang.String r2 = r0.f36520m     // Catch:{ all -> 0x00df }
                java.lang.String r2 = r2.toLowerCase()     // Catch:{ all -> 0x00df }
                boolean r1 = r1.contains(r2)     // Catch:{ all -> 0x00df }
                if (r1 != 0) goto L_0x0073
                com.startapp.i4 r1 = new com.startapp.i4     // Catch:{ all -> 0x00df }
                com.startapp.j4 r2 = com.startapp.C9043j4.f36994e     // Catch:{ all -> 0x00df }
                r1.<init>((com.startapp.C9043j4) r2)     // Catch:{ all -> 0x00df }
                java.lang.String r2 = "Wrong package reached"
                r1.f36952d = r2     // Catch:{ all -> 0x00df }
                java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x00df }
                r2.<init>()     // Catch:{ all -> 0x00df }
                java.lang.String r3 = "Expected: "
                r2.append(r3)     // Catch:{ all -> 0x00df }
                java.lang.String r3 = r0.f36520m     // Catch:{ all -> 0x00df }
                r2.append(r3)     // Catch:{ all -> 0x00df }
                java.lang.String r3 = ", Link: "
                r2.append(r3)     // Catch:{ all -> 0x00df }
                java.lang.String r3 = r0.f36512e     // Catch:{ all -> 0x00df }
                r2.append(r3)     // Catch:{ all -> 0x00df }
                java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x00df }
                r1.f36953e = r2     // Catch:{ all -> 0x00df }
                java.lang.String r2 = r0.f36513f     // Catch:{ all -> 0x00df }
                r1.f36955g = r2     // Catch:{ all -> 0x00df }
                r1.mo29471a()     // Catch:{ all -> 0x00df }
                goto L_0x00d7
            L_0x0073:
                com.startapp.sdk.adsbase.remoteconfig.MetaData r1 = com.startapp.sdk.adsbase.remoteconfig.MetaData.f38952k     // Catch:{ all -> 0x00df }
                com.startapp.sdk.adsbase.remoteconfig.AnalyticsConfig r1 = r1.analytics     // Catch:{ all -> 0x00df }
                boolean r1 = r1.mo30950j()     // Catch:{ all -> 0x00df }
                java.lang.String r2 = "firstSucceededSmartRedirect"
                r3 = 0
                if (r1 == 0) goto L_0x0089
                com.startapp.sdk.adsbase.e r1 = r0.f36509b     // Catch:{ all -> 0x00df }
                boolean r1 = r1.getBoolean(r2, r4)     // Catch:{ all -> 0x00df }
                if (r1 == 0) goto L_0x0089
                goto L_0x008a
            L_0x0089:
                r4 = 0
            L_0x008a:
                java.lang.Boolean r1 = r0.f36519l     // Catch:{ all -> 0x00df }
                if (r1 != 0) goto L_0x0097
                com.startapp.sdk.adsbase.remoteconfig.MetaData r1 = com.startapp.sdk.adsbase.remoteconfig.MetaData.f38952k     // Catch:{ all -> 0x00df }
                com.startapp.sdk.adsbase.remoteconfig.AnalyticsConfig r1 = r1.analytics     // Catch:{ all -> 0x00df }
                float r1 = r1.mo30949i()     // Catch:{ all -> 0x00df }
                goto L_0x00a1
            L_0x0097:
                boolean r1 = r1.booleanValue()     // Catch:{ all -> 0x00df }
                if (r1 == 0) goto L_0x00a0
                r1 = 1120403456(0x42c80000, float:100.0)
                goto L_0x00a1
            L_0x00a0:
                r1 = 0
            L_0x00a1:
                if (r4 != 0) goto L_0x00b0
                double r4 = java.lang.Math.random()     // Catch:{ all -> 0x00df }
                r6 = 4636737291354636288(0x4059000000000000, double:100.0)
                double r4 = r4 * r6
                double r6 = (double) r1     // Catch:{ all -> 0x00df }
                int r1 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
                if (r1 >= 0) goto L_0x00d7
            L_0x00b0:
                com.startapp.i4 r1 = new com.startapp.i4     // Catch:{ all -> 0x00df }
                com.startapp.j4 r4 = com.startapp.C9043j4.f37003n     // Catch:{ all -> 0x00df }
                r1.<init>((com.startapp.C9043j4) r4)     // Catch:{ all -> 0x00df }
                org.json.JSONArray r4 = r0.mo29218b()     // Catch:{ all -> 0x00df }
                r1.f36954f = r4     // Catch:{ all -> 0x00df }
                java.lang.String r4 = r0.f36513f     // Catch:{ all -> 0x00df }
                r1.f36955g = r4     // Catch:{ all -> 0x00df }
                r1.mo29471a()     // Catch:{ all -> 0x00df }
                com.startapp.sdk.adsbase.e r1 = r0.f36509b     // Catch:{ all -> 0x00df }
                com.startapp.sdk.adsbase.e$a r1 = r1.edit()     // Catch:{ all -> 0x00df }
                java.lang.Boolean r4 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x00df }
                r1.mo30812a((java.lang.String) r2, r4)     // Catch:{ all -> 0x00df }
                android.content.SharedPreferences$Editor r4 = r1.f38873a     // Catch:{ all -> 0x00df }
                r4.putBoolean(r2, r3)     // Catch:{ all -> 0x00df }
                r1.apply()     // Catch:{ all -> 0x00df }
            L_0x00d7:
                java.lang.Runnable r0 = r0.f36521n     // Catch:{ all -> 0x00df }
                if (r0 == 0) goto L_0x00e3
                r0.run()     // Catch:{ all -> 0x00df }
                goto L_0x00e3
            L_0x00df:
                r0 = move-exception
                com.startapp.C9023i4.m48681a((java.lang.Throwable) r0)
            L_0x00e3:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.startapp.C8850b7.C8857g.run():void");
        }
    }

    /* renamed from: com.startapp.b7$h */
    /* compiled from: Sta */
    public class C8858h implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ String f36542a;

        public C8858h(String str) {
            this.f36542a = str;
        }

        public void run() {
            C8850b7 b7Var = C8850b7.this;
            String str = this.f36542a;
            if (!b7Var.f36514g && !b7Var.f36522o && b7Var.f36512e.equals(str) && !C9396a.m49795b(str)) {
                if (str.startsWith("http://") || str.startsWith("https://")) {
                    b7Var.f36523p = true;
                    b7Var.mo29217a(str);
                    synchronized (b7Var.f36511d) {
                        b7Var.f36511d.removeCallbacks(b7Var.f36528u);
                        b7Var.f36511d.postDelayed(b7Var.f36528u, b7Var.f36517j);
                    }
                }
            }
        }
    }

    public C8850b7(Context context, C9441e eVar, Executor executor, Handler handler, long j, long j2, boolean z, Boolean bool, String str, String str2, String str3, Runnable runnable) {
        this.f36508a = context;
        this.f36509b = eVar;
        this.f36510c = new C9262r9(executor);
        this.f36511d = handler;
        this.f36516i = j;
        this.f36517j = j2;
        this.f36518k = z;
        this.f36519l = bool;
        this.f36512e = str;
        this.f36520m = str2;
        this.f36513f = str3;
        this.f36521n = runnable;
    }

    /* renamed from: a */
    public void mo29216a() {
        synchronized (this.f36511d) {
            this.f36511d.removeCallbacks(this.f36528u);
        }
    }

    /* renamed from: b */
    public JSONArray mo29218b() {
        JSONArray jSONArray = new JSONArray();
        for (Map.Entry next : this.f36524q.entrySet()) {
            String str = (String) next.getKey();
            Float f = (Float) next.getValue();
            JSONObject jSONObject = new JSONObject();
            try {
                mo29217a(str);
                jSONObject.put("time", String.valueOf(f));
                jSONObject.put("url", str);
                jSONArray.put(jSONObject);
            } catch (JSONException unused) {
            }
        }
        return jSONArray;
    }

    public void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        this.f36510c.execute(new C8858h(str));
    }

    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        super.onPageStarted(webView, str, bitmap);
        this.f36510c.execute(new C8855e(str));
    }

    public void onReceivedError(WebView webView, int i, String str, String str2) {
        mo29216a();
        if (str2 != null && !C9396a.m49795b(str2) && C9396a.m49797c(str2)) {
            C9023i4 i4Var = new C9023i4(C9043j4.f36994e);
            i4Var.f36952d = C9183o2.m49083a("Failed smart redirect: ", i);
            i4Var.f36953e = str2;
            i4Var.f36955g = this.f36513f;
            i4Var.mo29471a();
        }
        super.onReceivedError(webView, i, str, str2);
    }

    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        if (!(webView == null || str == null)) {
            this.f36510c.execute(new C8856f(str));
            if (C9605vb.m50472b(webView.getContext(), str)) {
                return true;
            }
            String lowerCase = str.toLowerCase(Locale.ENGLISH);
            boolean b = C9396a.m49795b(lowerCase);
            boolean startsWith = lowerCase.startsWith("intent://");
            if (!b && !startsWith) {
                return false;
            }
            this.f36510c.execute(new C8857g(str, startsWith, webView.getUrl()));
        }
        return true;
    }

    /* renamed from: a */
    public final void mo29217a(String str) {
        Float f = this.f36524q.get(str);
        if (f == null || f.floatValue() < 0.0f) {
            this.f36524q.put(str, Float.valueOf(((float) (System.currentTimeMillis() - this.f36525r)) / 1000.0f));
        }
    }
}
