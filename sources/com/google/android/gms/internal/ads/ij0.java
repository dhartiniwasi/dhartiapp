package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Bitmap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p033d5.C4141r;
import p067i5.C4699m;
import p073j4.C4802q0;
import p081k5.C4888c;
import p180z4.C6370f;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class ij0 implements nj0 {
    /* access modifiers changed from: private */

    /* renamed from: m */
    public static final List f10801m = Collections.synchronizedList(new ArrayList());

    /* renamed from: n */
    public static final /* synthetic */ int f10802n = 0;

    /* renamed from: a */
    private final p14 f10803a;

    /* renamed from: b */
    private final LinkedHashMap f10804b;

    /* renamed from: c */
    private final List f10805c = new ArrayList();

    /* renamed from: d */
    private final List f10806d = new ArrayList();

    /* renamed from: e */
    private final Context f10807e;

    /* renamed from: f */
    boolean f10808f;

    /* renamed from: g */
    private final kj0 f10809g;

    /* renamed from: h */
    private final Object f10810h = new Object();

    /* renamed from: i */
    private HashSet f10811i = new HashSet();

    /* renamed from: j */
    private boolean f10812j = false;

    /* renamed from: k */
    private boolean f10813k = false;

    /* renamed from: l */
    private final jj0 f10814l;

    public ij0(Context context, vm0 vm0, kj0 kj0, String str, jj0 jj0, byte[] bArr) {
        C4141r.m28222l(kj0, "SafeBrowsing config is not present.");
        this.f10807e = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        this.f10804b = new LinkedHashMap();
        this.f10814l = jj0;
        this.f10809g = kj0;
        for (String lowerCase : kj0.f12124e) {
            this.f10811i.add(lowerCase.toLowerCase(Locale.ENGLISH));
        }
        this.f10811i.remove("cookie".toLowerCase(Locale.ENGLISH));
        p14 G = w24.m22540G();
        G.mo13110F(9);
        G.mo13106B(str);
        G.mo13118z(str);
        r14 G2 = s14.m20118G();
        String str2 = this.f10809g.f12120a;
        if (str2 != null) {
            G2.mo13655p(str2);
        }
        G.mo13117y((s14) G2.mo13423m());
        q24 G3 = s24.m20133G();
        G3.mo13464s(C4888c.m31075a(this.f10807e).mo18674g());
        String str3 = vm0.f19150a;
        if (str3 != null) {
            G3.mo13462p(str3);
        }
        long b = (long) C6370f.m37437h().mo21796b(this.f10807e);
        if (b > 0) {
            G3.mo13463r(b);
        }
        G.mo13116x((s24) G3.mo13423m());
        this.f10803a = G;
    }

    /* renamed from: M */
    public final void mo11125M(String str) {
        synchronized (this.f10810h) {
            if (str == null) {
                this.f10803a.mo13114u();
            } else {
                this.f10803a.mo13115v(str);
            }
        }
    }

    /* renamed from: V */
    public final boolean mo11126V() {
        return C4699m.m30413d() && this.f10809g.f12122c && !this.f10812j;
    }

    /* renamed from: a */
    public final void mo11127a() {
        synchronized (this.f10810h) {
            this.f10804b.keySet();
            lf3 i = cf3.m10911i(Collections.emptyMap());
            fj0 fj0 = new fj0(this);
            mf3 mf3 = dn0.f8330f;
            lf3 n = cf3.m10916n(i, fj0, mf3);
            lf3 o = cf3.m10917o(n, 10, TimeUnit.SECONDS, dn0.f8328d);
            cf3.m10920r(n, new hj0(this, o), mf3);
            f10801m.add(o);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0023, code lost:
        return;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo11128b(java.lang.String r7, java.util.Map r8, int r9) {
        /*
            r6 = this;
            java.lang.Object r0 = r6.f10810h
            monitor-enter(r0)
            r1 = 3
            if (r9 != r1) goto L_0x0009
            r2 = 1
            r6.f10813k = r2     // Catch:{ all -> 0x00b7 }
        L_0x0009:
            java.util.LinkedHashMap r2 = r6.f10804b     // Catch:{ all -> 0x00b7 }
            boolean r2 = r2.containsKey(r7)     // Catch:{ all -> 0x00b7 }
            if (r2 == 0) goto L_0x0024
            if (r9 != r1) goto L_0x0022
            java.util.LinkedHashMap r8 = r6.f10804b     // Catch:{ all -> 0x00b7 }
            java.lang.Object r7 = r8.get(r7)     // Catch:{ all -> 0x00b7 }
            com.google.android.gms.internal.ads.o24 r7 = (com.google.android.gms.internal.ads.o24) r7     // Catch:{ all -> 0x00b7 }
            int r8 = com.google.android.gms.internal.ads.n24.m16869a(r1)     // Catch:{ all -> 0x00b7 }
            r7.mo12805v(r8)     // Catch:{ all -> 0x00b7 }
        L_0x0022:
            monitor-exit(r0)     // Catch:{ all -> 0x00b7 }
            return
        L_0x0024:
            com.google.android.gms.internal.ads.o24 r1 = com.google.android.gms.internal.ads.p24.m18304H()     // Catch:{ all -> 0x00b7 }
            int r9 = com.google.android.gms.internal.ads.n24.m16869a(r9)     // Catch:{ all -> 0x00b7 }
            if (r9 == 0) goto L_0x0031
            r1.mo12805v(r9)     // Catch:{ all -> 0x00b7 }
        L_0x0031:
            java.util.LinkedHashMap r9 = r6.f10804b     // Catch:{ all -> 0x00b7 }
            int r9 = r9.size()     // Catch:{ all -> 0x00b7 }
            r1.mo12802r(r9)     // Catch:{ all -> 0x00b7 }
            r1.mo12804u(r7)     // Catch:{ all -> 0x00b7 }
            com.google.android.gms.internal.ads.z14 r9 = com.google.android.gms.internal.ads.c24.m10687G()     // Catch:{ all -> 0x00b7 }
            java.util.HashSet r2 = r6.f10811i     // Catch:{ all -> 0x00b7 }
            boolean r2 = r2.isEmpty()     // Catch:{ all -> 0x00b7 }
            if (r2 != 0) goto L_0x00a7
            if (r8 == 0) goto L_0x00a7
            java.util.Set r8 = r8.entrySet()     // Catch:{ all -> 0x00b7 }
            java.util.Iterator r8 = r8.iterator()     // Catch:{ all -> 0x00b7 }
        L_0x0053:
            boolean r2 = r8.hasNext()     // Catch:{ all -> 0x00b7 }
            if (r2 == 0) goto L_0x00a7
            java.lang.Object r2 = r8.next()     // Catch:{ all -> 0x00b7 }
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2     // Catch:{ all -> 0x00b7 }
            java.lang.Object r3 = r2.getKey()     // Catch:{ all -> 0x00b7 }
            if (r3 == 0) goto L_0x006c
            java.lang.Object r3 = r2.getKey()     // Catch:{ all -> 0x00b7 }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ all -> 0x00b7 }
            goto L_0x006e
        L_0x006c:
            java.lang.String r3 = ""
        L_0x006e:
            java.lang.Object r4 = r2.getValue()     // Catch:{ all -> 0x00b7 }
            if (r4 == 0) goto L_0x007b
            java.lang.Object r2 = r2.getValue()     // Catch:{ all -> 0x00b7 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ all -> 0x00b7 }
            goto L_0x007d
        L_0x007b:
            java.lang.String r2 = ""
        L_0x007d:
            java.util.Locale r4 = java.util.Locale.ENGLISH     // Catch:{ all -> 0x00b7 }
            java.lang.String r4 = r3.toLowerCase(r4)     // Catch:{ all -> 0x00b7 }
            java.util.HashSet r5 = r6.f10811i     // Catch:{ all -> 0x00b7 }
            boolean r4 = r5.contains(r4)     // Catch:{ all -> 0x00b7 }
            if (r4 == 0) goto L_0x0053
            com.google.android.gms.internal.ads.x14 r4 = com.google.android.gms.internal.ads.y14.m23680G()     // Catch:{ all -> 0x00b7 }
            com.google.android.gms.internal.ads.jw3 r3 = com.google.android.gms.internal.ads.jw3.m15088M(r3)     // Catch:{ all -> 0x00b7 }
            r4.mo15044p(r3)     // Catch:{ all -> 0x00b7 }
            com.google.android.gms.internal.ads.jw3 r2 = com.google.android.gms.internal.ads.jw3.m15088M(r2)     // Catch:{ all -> 0x00b7 }
            r4.mo15045r(r2)     // Catch:{ all -> 0x00b7 }
            com.google.android.gms.internal.ads.sx3 r2 = r4.mo13423m()     // Catch:{ all -> 0x00b7 }
            com.google.android.gms.internal.ads.y14 r2 = (com.google.android.gms.internal.ads.y14) r2     // Catch:{ all -> 0x00b7 }
            r9.mo15535p(r2)     // Catch:{ all -> 0x00b7 }
            goto L_0x0053
        L_0x00a7:
            com.google.android.gms.internal.ads.sx3 r8 = r9.mo13423m()     // Catch:{ all -> 0x00b7 }
            com.google.android.gms.internal.ads.c24 r8 = (com.google.android.gms.internal.ads.c24) r8     // Catch:{ all -> 0x00b7 }
            r1.mo12803s(r8)     // Catch:{ all -> 0x00b7 }
            java.util.LinkedHashMap r8 = r6.f10804b     // Catch:{ all -> 0x00b7 }
            r8.put(r7, r1)     // Catch:{ all -> 0x00b7 }
            monitor-exit(r0)     // Catch:{ all -> 0x00b7 }
            return
        L_0x00b7:
            r7 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x00b7 }
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ij0.mo11128b(java.lang.String, java.util.Map, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0036 A[SYNTHETIC, Splitter:B:20:0x0036] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0075  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo11129c(android.view.View r8) {
        /*
            r7 = this;
            com.google.android.gms.internal.ads.kj0 r0 = r7.f10809g
            boolean r0 = r0.f12122c
            if (r0 != 0) goto L_0x0007
            return
        L_0x0007:
            boolean r0 = r7.f10812j
            if (r0 == 0) goto L_0x000c
            return
        L_0x000c:
            p053g4.C4409t.m29326r()
            r0 = 1
            r1 = 0
            if (r8 != 0) goto L_0x0014
            goto L_0x006d
        L_0x0014:
            boolean r2 = r8.isDrawingCacheEnabled()     // Catch:{ RuntimeException -> 0x002d }
            r8.setDrawingCacheEnabled(r0)     // Catch:{ RuntimeException -> 0x002d }
            android.graphics.Bitmap r3 = r8.getDrawingCache()     // Catch:{ RuntimeException -> 0x002d }
            if (r3 == 0) goto L_0x0026
            android.graphics.Bitmap r3 = android.graphics.Bitmap.createBitmap(r3)     // Catch:{ RuntimeException -> 0x002d }
            goto L_0x0027
        L_0x0026:
            r3 = r1
        L_0x0027:
            r8.setDrawingCacheEnabled(r2)     // Catch:{ RuntimeException -> 0x002b }
            goto L_0x0034
        L_0x002b:
            r2 = move-exception
            goto L_0x002f
        L_0x002d:
            r2 = move-exception
            r3 = r1
        L_0x002f:
            java.lang.String r4 = "Fail to capture the web view"
            com.google.android.gms.internal.ads.pm0.m18665e(r4, r2)
        L_0x0034:
            if (r3 != 0) goto L_0x006c
            int r2 = r8.getWidth()     // Catch:{ RuntimeException -> 0x0065 }
            int r3 = r8.getHeight()     // Catch:{ RuntimeException -> 0x0065 }
            if (r2 == 0) goto L_0x005f
            if (r3 != 0) goto L_0x0043
            goto L_0x005f
        L_0x0043:
            int r4 = r8.getWidth()     // Catch:{ RuntimeException -> 0x0065 }
            int r5 = r8.getHeight()     // Catch:{ RuntimeException -> 0x0065 }
            android.graphics.Bitmap$Config r6 = android.graphics.Bitmap.Config.RGB_565     // Catch:{ RuntimeException -> 0x0065 }
            android.graphics.Bitmap r4 = android.graphics.Bitmap.createBitmap(r4, r5, r6)     // Catch:{ RuntimeException -> 0x0065 }
            android.graphics.Canvas r5 = new android.graphics.Canvas     // Catch:{ RuntimeException -> 0x0065 }
            r5.<init>(r4)     // Catch:{ RuntimeException -> 0x0065 }
            r6 = 0
            r8.layout(r6, r6, r2, r3)     // Catch:{ RuntimeException -> 0x0065 }
            r8.draw(r5)     // Catch:{ RuntimeException -> 0x0065 }
            r1 = r4
            goto L_0x006d
        L_0x005f:
            java.lang.String r8 = "Width or height of view is zero"
            com.google.android.gms.internal.ads.pm0.m18667g(r8)     // Catch:{ RuntimeException -> 0x0065 }
            goto L_0x006d
        L_0x0065:
            r8 = move-exception
            java.lang.String r2 = "Fail to capture the webview"
            com.google.android.gms.internal.ads.pm0.m18665e(r2, r8)
            goto L_0x006d
        L_0x006c:
            r1 = r3
        L_0x006d:
            if (r1 != 0) goto L_0x0075
            java.lang.String r8 = "Failed to capture the webview bitmap."
            com.google.android.gms.internal.ads.mj0.m16543a(r8)
            return
        L_0x0075:
            r7.f10812j = r0
            com.google.android.gms.internal.ads.gj0 r8 = new com.google.android.gms.internal.ads.gj0
            r8.<init>(r7, r1)
            p073j4.C4751b2.m30590C(r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ij0.mo11129c(android.view.View):void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final /* synthetic */ lf3 mo11130d(Map map) throws Exception {
        lf3 m;
        o24 o24;
        if (map != null) {
            try {
                for (String str : map.keySet()) {
                    JSONArray optJSONArray = new JSONObject((String) map.get(str)).optJSONArray("matches");
                    if (optJSONArray != null) {
                        synchronized (this.f10810h) {
                            int length = optJSONArray.length();
                            synchronized (this.f10810h) {
                                o24 = (o24) this.f10804b.get(str);
                            }
                            if (o24 == null) {
                                mj0.m16543a("Cannot find the corresponding resource object for " + str);
                            } else {
                                boolean z = false;
                                for (int i = 0; i < length; i++) {
                                    o24.mo12801p(optJSONArray.getJSONObject(i).getString("threat_type"));
                                }
                                boolean z2 = this.f10808f;
                                if (length > 0) {
                                    z = true;
                                }
                                this.f10808f = z | z2;
                            }
                        }
                    }
                }
            } catch (JSONException e) {
                if (((Boolean) l10.f12597b.mo13438e()).booleanValue()) {
                    pm0.m18663c("Failed to get SafeBrowsing metadata", e);
                }
                return cf3.m10910h(new Exception("Safebrowsing report transmission failed."));
            }
        }
        if (this.f10808f) {
            synchronized (this.f10810h) {
                this.f10803a.mo13110F(10);
            }
        }
        boolean z3 = this.f10808f;
        if ((!z3 || !this.f10809g.f12126g) && ((!this.f10813k || !this.f10809g.f12125f) && (z3 || !this.f10809g.f12123d))) {
            return cf3.m10911i((Object) null);
        }
        synchronized (this.f10810h) {
            for (o24 m2 : this.f10804b.values()) {
                this.f10803a.mo13113s((p24) m2.mo13423m());
            }
            this.f10803a.mo13111p(this.f10805c);
            this.f10803a.mo13112r(this.f10806d);
            if (mj0.m16544b()) {
                String D = this.f10803a.mo13108D();
                String C = this.f10803a.mo13107C();
                StringBuilder sb = new StringBuilder("Sending SB report\n  url: " + D + "\n  clickUrl: " + C + "\n  resources: \n");
                for (p24 p24 : this.f10803a.mo13109E()) {
                    sb.append("    [");
                    sb.append(p24.mo13121G());
                    sb.append("] ");
                    sb.append(p24.mo13122J());
                }
                mj0.m16543a(sb.toString());
            }
            byte[] b = ((w24) this.f10803a.mo13423m()).mo9400b();
            lf3 b2 = new C4802q0(this.f10807e).mo18525b(1, this.f10809g.f12121b, (Map) null, b);
            if (mj0.m16544b()) {
                b2.mo10135j(dj0.f8291a, dn0.f8325a);
            }
            m = cf3.m10915m(b2, ej0.f8813a, dn0.f8330f);
        }
        return m;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final /* synthetic */ void mo11131f(Bitmap bitmap) {
        gw3 G = jw3.m15084G();
        bitmap.compress(Bitmap.CompressFormat.PNG, 0, G);
        synchronized (this.f10810h) {
            p14 p14 = this.f10803a;
            h24 G2 = j24.m14653G();
            G2.mo10721p(G.mo10658b());
            G2.mo10722r("image/png");
            G2.mo10723s(2);
            p14.mo13105A((j24) G2.mo13423m());
        }
    }

    public final kj0 zza() {
        return this.f10809g;
    }
}
