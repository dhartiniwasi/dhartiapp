package com.google.android.gms.internal.ads;

import android.graphics.Rect;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.EditText;
import android.widget.TextView;
import org.json.JSONException;
import org.json.JSONObject;
import p053g4.C4409t;
import p060h4.C4596v;
import p067i5.C4699m;

/* renamed from: com.google.android.gms.internal.ads.ts */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class C2895ts extends Thread {

    /* renamed from: a */
    private boolean f18226a = false;

    /* renamed from: b */
    private boolean f18227b = false;

    /* renamed from: c */
    private final Object f18228c;

    /* renamed from: d */
    private final C2561ks f18229d;

    /* renamed from: e */
    private final int f18230e;

    /* renamed from: f */
    private final int f18231f;

    /* renamed from: g */
    private final int f18232g;

    /* renamed from: h */
    private final int f18233h;

    /* renamed from: i */
    private final int f18234i;

    /* renamed from: r */
    private final int f18235r;

    /* renamed from: s */
    private final int f18236s;

    /* renamed from: t */
    private final int f18237t;

    /* renamed from: u */
    private final String f18238u;

    /* renamed from: v */
    private final boolean f18239v;

    /* renamed from: w */
    private final boolean f18240w;

    /* renamed from: x */
    private final boolean f18241x;

    public C2895ts() {
        C2561ks ksVar = new C2561ks();
        this.f18229d = ksVar;
        this.f18228c = new Object();
        this.f18231f = ((Long) w00.f19401d.mo13438e()).intValue();
        this.f18232g = ((Long) w00.f19398a.mo13438e()).intValue();
        this.f18233h = ((Long) w00.f19402e.mo13438e()).intValue();
        this.f18234i = ((Long) w00.f19400c.mo13438e()).intValue();
        this.f18235r = ((Integer) C4596v.m30088c().mo12227b(C2679nz.f14402Q)).intValue();
        this.f18236s = ((Integer) C4596v.m30088c().mo12227b(C2679nz.f14412R)).intValue();
        this.f18237t = ((Integer) C4596v.m30088c().mo12227b(C2679nz.f14422S)).intValue();
        this.f18230e = ((Long) w00.f19403f.mo13438e()).intValue();
        this.f18238u = (String) C4596v.m30088c().mo12227b(C2679nz.f14442U);
        this.f18239v = ((Boolean) C4596v.m30088c().mo12227b(C2679nz.f14452V)).booleanValue();
        this.f18240w = ((Boolean) C4596v.m30088c().mo12227b(C2679nz.f14461W)).booleanValue();
        this.f18241x = ((Boolean) C4596v.m30088c().mo12227b(C2679nz.f14470X)).booleanValue();
        setName("ContentFetchTask");
    }

    /* renamed from: a */
    public final C2524js mo14368a() {
        return this.f18229d.mo11785a(this.f18241x);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final C2858ss mo14369b(View view, C2524js jsVar) {
        if (view == null) {
            return new C2858ss(this, 0, 0);
        }
        boolean globalVisibleRect = view.getGlobalVisibleRect(new Rect());
        if ((view instanceof TextView) && !(view instanceof EditText)) {
            CharSequence text = ((TextView) view).getText();
            if (TextUtils.isEmpty(text)) {
                return new C2858ss(this, 0, 0);
            }
            jsVar.mo11500k(text.toString(), globalVisibleRect, view.getX(), view.getY(), (float) view.getWidth(), (float) view.getHeight());
            return new C2858ss(this, 1, 0);
        } else if ((view instanceof WebView) && !(view instanceof vs0)) {
            WebView webView = (WebView) view;
            if (!C4699m.m30413d()) {
                return new C2858ss(this, 0, 0);
            }
            jsVar.mo11496h();
            webView.post(new C2821rs(this, jsVar, webView, globalVisibleRect));
            return new C2858ss(this, 0, 1);
        } else if (!(view instanceof ViewGroup)) {
            return new C2858ss(this, 0, 0);
        } else {
            ViewGroup viewGroup = (ViewGroup) view;
            int i = 0;
            int i2 = 0;
            for (int i3 = 0; i3 < viewGroup.getChildCount(); i3++) {
                C2858ss b = mo14369b(viewGroup.getChildAt(i3), jsVar);
                i += b.f17636a;
                i2 += b.f17637b;
            }
            return new C2858ss(this, i, i2);
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0071, code lost:
        if (r11 == 0) goto L_0x0073;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo14370c(android.view.View r11) {
        /*
            r10 = this;
            com.google.android.gms.internal.ads.js r9 = new com.google.android.gms.internal.ads.js     // Catch:{ Exception -> 0x0083 }
            int r1 = r10.f18231f     // Catch:{ Exception -> 0x0083 }
            int r2 = r10.f18232g     // Catch:{ Exception -> 0x0083 }
            int r3 = r10.f18233h     // Catch:{ Exception -> 0x0083 }
            int r4 = r10.f18234i     // Catch:{ Exception -> 0x0083 }
            int r5 = r10.f18235r     // Catch:{ Exception -> 0x0083 }
            int r6 = r10.f18236s     // Catch:{ Exception -> 0x0083 }
            int r7 = r10.f18237t     // Catch:{ Exception -> 0x0083 }
            boolean r8 = r10.f18240w     // Catch:{ Exception -> 0x0083 }
            r0 = r9
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)     // Catch:{ Exception -> 0x0083 }
            com.google.android.gms.internal.ads.os r0 = p053g4.C4409t.m29312d()     // Catch:{ Exception -> 0x0083 }
            android.content.Context r0 = r0.mo13028b()     // Catch:{ Exception -> 0x0083 }
            if (r0 == 0) goto L_0x0054
            java.lang.String r1 = r10.f18238u     // Catch:{ Exception -> 0x0083 }
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch:{ Exception -> 0x0083 }
            if (r1 != 0) goto L_0x0054
            android.content.res.Resources r1 = r0.getResources()     // Catch:{ Exception -> 0x0083 }
            com.google.android.gms.internal.ads.ez r2 = com.google.android.gms.internal.ads.C2679nz.f14432T     // Catch:{ Exception -> 0x0083 }
            com.google.android.gms.internal.ads.lz r3 = p060h4.C4596v.m30088c()     // Catch:{ Exception -> 0x0083 }
            java.lang.Object r2 = r3.mo12227b(r2)     // Catch:{ Exception -> 0x0083 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ Exception -> 0x0083 }
            java.lang.String r3 = "id"
            java.lang.String r0 = r0.getPackageName()     // Catch:{ Exception -> 0x0083 }
            int r0 = r1.getIdentifier(r2, r3, r0)     // Catch:{ Exception -> 0x0083 }
            java.lang.Object r0 = r11.getTag(r0)     // Catch:{ Exception -> 0x0083 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ Exception -> 0x0083 }
            if (r0 == 0) goto L_0x0054
            java.lang.String r1 = r10.f18238u     // Catch:{ Exception -> 0x0083 }
            boolean r0 = r0.equals(r1)     // Catch:{ Exception -> 0x0083 }
            if (r0 != 0) goto L_0x0053
            goto L_0x0054
        L_0x0053:
            return
        L_0x0054:
            com.google.android.gms.internal.ads.ss r11 = r10.mo14369b(r11, r9)     // Catch:{ Exception -> 0x0083 }
            r9.mo11502m()     // Catch:{ Exception -> 0x0083 }
            int r0 = r11.f17636a     // Catch:{ Exception -> 0x0083 }
            if (r0 != 0) goto L_0x0065
            int r0 = r11.f17637b     // Catch:{ Exception -> 0x0083 }
            if (r0 == 0) goto L_0x0064
            goto L_0x0065
        L_0x0064:
            return
        L_0x0065:
            int r11 = r11.f17637b     // Catch:{ Exception -> 0x0083 }
            if (r11 != 0) goto L_0x0071
            int r11 = r9.mo11490c()     // Catch:{ Exception -> 0x0083 }
            if (r11 == 0) goto L_0x0070
            goto L_0x0073
        L_0x0070:
            return
        L_0x0071:
            if (r11 != 0) goto L_0x007d
        L_0x0073:
            com.google.android.gms.internal.ads.ks r11 = r10.f18229d     // Catch:{ Exception -> 0x0083 }
            boolean r11 = r11.mo11788d(r9)     // Catch:{ Exception -> 0x0083 }
            if (r11 != 0) goto L_0x007c
            goto L_0x007d
        L_0x007c:
            return
        L_0x007d:
            com.google.android.gms.internal.ads.ks r11 = r10.f18229d     // Catch:{ Exception -> 0x0083 }
            r11.mo11786b(r9)     // Catch:{ Exception -> 0x0083 }
            return
        L_0x0083:
            r11 = move-exception
            java.lang.String r0 = "Exception in fetchContentOnUIThread"
            com.google.android.gms.internal.ads.pm0.m18665e(r0, r11)
            com.google.android.gms.internal.ads.xl0 r0 = p053g4.C4409t.m29325q()
            java.lang.String r1 = "ContentFetchTask.fetchContent"
            r0.mo15126t(r11, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C2895ts.mo14370c(android.view.View):void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final void mo14371d(C2524js jsVar, WebView webView, String str, boolean z) {
        jsVar.mo11495g();
        try {
            if (!TextUtils.isEmpty(str)) {
                String optString = new JSONObject(str).optString("text");
                if (this.f18239v || TextUtils.isEmpty(webView.getTitle())) {
                    jsVar.mo11501l(optString, z, webView.getX(), webView.getY(), (float) webView.getWidth(), (float) webView.getHeight());
                } else {
                    String title = webView.getTitle();
                    jsVar.mo11501l(title + "\n" + optString, z, webView.getX(), webView.getY(), (float) webView.getWidth(), (float) webView.getHeight());
                }
            }
            if (jsVar.mo11504o()) {
                this.f18229d.mo11787c(jsVar);
            }
        } catch (JSONException unused) {
            pm0.m18662b("Json string may be malformed.");
        } catch (Throwable th) {
            pm0.m18663c("Failed to get webview content.", th);
            C4409t.m29325q().mo15126t(th, "ContentFetchTask.processWebViewContent");
        }
    }

    /* renamed from: e */
    public final void mo14372e() {
        synchronized (this.f18228c) {
            if (this.f18226a) {
                pm0.m18662b("Content hash thread already started, quiting...");
                return;
            }
            this.f18226a = true;
            start();
        }
    }

    /* renamed from: f */
    public final void mo14373f() {
        synchronized (this.f18228c) {
            this.f18227b = true;
            pm0.m18662b("ContentFetchThread: paused, mPause = " + true);
        }
    }

    /* renamed from: g */
    public final void mo14374g() {
        synchronized (this.f18228c) {
            this.f18227b = false;
            this.f18228c.notifyAll();
            pm0.m18662b("ContentFetchThread: wakeup");
        }
    }

    /* renamed from: h */
    public final boolean mo14375h() {
        return this.f18227b;
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0
        	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:248)
        	at java.base/java.util.Objects.checkIndex(Objects.java:372)
        	at java.base/java.util.ArrayList.get(ArrayList.java:458)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processHandlersOutBlocks(RegionMaker.java:1008)
        	at jadx.core.dex.visitors.regions.RegionMaker.processTryCatchBlocks(RegionMaker.java:978)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:52)
        */
    /* JADX WARNING: Missing exception handler attribute for start block: B:48:0x00dc */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00dc A[LOOP:2: B:48:0x00dc->B:62:0x00dc, LOOP_START, SYNTHETIC] */
    public final void run() {
        /*
            r6 = this;
        L_0x0000:
            com.google.android.gms.internal.ads.os r0 = p053g4.C4409t.m29312d()     // Catch:{ all -> 0x00a8 }
            android.content.Context r0 = r0.mo13028b()     // Catch:{ all -> 0x00a8 }
            if (r0 != 0) goto L_0x000c
            goto L_0x00b2
        L_0x000c:
            java.lang.String r1 = "activity"
            java.lang.Object r1 = r0.getSystemService(r1)     // Catch:{ all -> 0x00a8 }
            android.app.ActivityManager r1 = (android.app.ActivityManager) r1     // Catch:{ all -> 0x00a8 }
            java.lang.String r2 = "keyguard"
            java.lang.Object r2 = r0.getSystemService(r2)     // Catch:{ all -> 0x00a8 }
            android.app.KeyguardManager r2 = (android.app.KeyguardManager) r2     // Catch:{ all -> 0x00a8 }
            if (r1 == 0) goto L_0x00b2
            if (r2 == 0) goto L_0x00b2
            java.util.List r1 = r1.getRunningAppProcesses()     // Catch:{ all -> 0x00a8 }
            if (r1 == 0) goto L_0x00b2
            java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x00a8 }
        L_0x002a:
            boolean r3 = r1.hasNext()     // Catch:{ all -> 0x00a8 }
            if (r3 == 0) goto L_0x00b2
            java.lang.Object r3 = r1.next()     // Catch:{ all -> 0x00a8 }
            android.app.ActivityManager$RunningAppProcessInfo r3 = (android.app.ActivityManager.RunningAppProcessInfo) r3     // Catch:{ all -> 0x00a8 }
            int r4 = android.os.Process.myPid()     // Catch:{ all -> 0x00a8 }
            int r5 = r3.pid     // Catch:{ all -> 0x00a8 }
            if (r4 != r5) goto L_0x002a
            int r1 = r3.importance     // Catch:{ all -> 0x00a8 }
            r3 = 100
            if (r1 != r3) goto L_0x00b2
            boolean r1 = r2.inKeyguardRestrictedInputMode()     // Catch:{ all -> 0x00a8 }
            if (r1 != 0) goto L_0x00b2
            java.lang.String r1 = "power"
            java.lang.Object r0 = r0.getSystemService(r1)     // Catch:{ all -> 0x00a8 }
            android.os.PowerManager r0 = (android.os.PowerManager) r0     // Catch:{ all -> 0x00a8 }
            if (r0 == 0) goto L_0x00b2
            boolean r0 = r0.isScreenOn()     // Catch:{ all -> 0x00a8 }
            if (r0 == 0) goto L_0x00b2
            com.google.android.gms.internal.ads.os r0 = p053g4.C4409t.m29312d()     // Catch:{ InterruptedException -> 0x00d3, Exception -> 0x00c3 }
            android.app.Activity r0 = r0.mo13027a()     // Catch:{ InterruptedException -> 0x00d3, Exception -> 0x00c3 }
            if (r0 != 0) goto L_0x006d
            java.lang.String r0 = "ContentFetchThread: no activity. Sleeping."
            com.google.android.gms.internal.ads.pm0.m18662b(r0)     // Catch:{ InterruptedException -> 0x00d3, Exception -> 0x00c3 }
            r6.mo14373f()     // Catch:{ InterruptedException -> 0x00d3, Exception -> 0x00c3 }
            goto L_0x00ba
        L_0x006d:
            r1 = 0
            android.view.Window r2 = r0.getWindow()     // Catch:{ Exception -> 0x008e }
            if (r2 == 0) goto L_0x009d
            android.view.Window r2 = r0.getWindow()     // Catch:{ Exception -> 0x008e }
            android.view.View r2 = r2.getDecorView()     // Catch:{ Exception -> 0x008e }
            if (r2 == 0) goto L_0x009d
            android.view.Window r0 = r0.getWindow()     // Catch:{ Exception -> 0x008e }
            android.view.View r0 = r0.getDecorView()     // Catch:{ Exception -> 0x008e }
            r2 = 16908290(0x1020002, float:2.3877235E-38)
            android.view.View r1 = r0.findViewById(r2)     // Catch:{ Exception -> 0x008e }
            goto L_0x009d
        L_0x008e:
            r0 = move-exception
            com.google.android.gms.internal.ads.xl0 r2 = p053g4.C4409t.m29325q()     // Catch:{ InterruptedException -> 0x00d3, Exception -> 0x00c3 }
            java.lang.String r3 = "ContentFetchTask.extractContent"
            r2.mo15126t(r0, r3)     // Catch:{ InterruptedException -> 0x00d3, Exception -> 0x00c3 }
            java.lang.String r0 = "Failed getting root view of activity. Content not extracted."
            com.google.android.gms.internal.ads.pm0.m18662b(r0)     // Catch:{ InterruptedException -> 0x00d3, Exception -> 0x00c3 }
        L_0x009d:
            if (r1 == 0) goto L_0x00ba
            com.google.android.gms.internal.ads.ps r0 = new com.google.android.gms.internal.ads.ps     // Catch:{ InterruptedException -> 0x00d3, Exception -> 0x00c3 }
            r0.<init>(r6, r1)     // Catch:{ InterruptedException -> 0x00d3, Exception -> 0x00c3 }
            r1.post(r0)     // Catch:{ InterruptedException -> 0x00d3, Exception -> 0x00c3 }
            goto L_0x00ba
        L_0x00a8:
            r0 = move-exception
            com.google.android.gms.internal.ads.xl0 r1 = p053g4.C4409t.m29325q()     // Catch:{ InterruptedException -> 0x00d3, Exception -> 0x00c3 }
            java.lang.String r2 = "ContentFetchTask.isInForeground"
            r1.mo15126t(r0, r2)     // Catch:{ InterruptedException -> 0x00d3, Exception -> 0x00c3 }
        L_0x00b2:
            java.lang.String r0 = "ContentFetchTask: sleeping"
            com.google.android.gms.internal.ads.pm0.m18662b(r0)     // Catch:{ InterruptedException -> 0x00d3, Exception -> 0x00c3 }
            r6.mo14373f()     // Catch:{ InterruptedException -> 0x00d3, Exception -> 0x00c3 }
        L_0x00ba:
            int r0 = r6.f18230e     // Catch:{ InterruptedException -> 0x00d3, Exception -> 0x00c3 }
            int r0 = r0 * 1000
            long r0 = (long) r0     // Catch:{ InterruptedException -> 0x00d3, Exception -> 0x00c3 }
            java.lang.Thread.sleep(r0)     // Catch:{ InterruptedException -> 0x00d3, Exception -> 0x00c3 }
            goto L_0x00d9
        L_0x00c3:
            r0 = move-exception
            java.lang.String r1 = "Error in ContentFetchTask"
            com.google.android.gms.internal.ads.pm0.m18665e(r1, r0)
            com.google.android.gms.internal.ads.xl0 r1 = p053g4.C4409t.m29325q()
            java.lang.String r2 = "ContentFetchTask.run"
            r1.mo15126t(r0, r2)
            goto L_0x00d9
        L_0x00d3:
            r0 = move-exception
            java.lang.String r1 = "Error in ContentFetchTask"
            com.google.android.gms.internal.ads.pm0.m18665e(r1, r0)
        L_0x00d9:
            java.lang.Object r0 = r6.f18228c
            monitor-enter(r0)
        L_0x00dc:
            boolean r1 = r6.f18227b     // Catch:{ all -> 0x00ee }
            if (r1 == 0) goto L_0x00eb
            java.lang.String r1 = "ContentFetchTask: waiting"
            com.google.android.gms.internal.ads.pm0.m18662b(r1)     // Catch:{ InterruptedException -> 0x00dc }
            java.lang.Object r1 = r6.f18228c     // Catch:{ InterruptedException -> 0x00dc }
            r1.wait()     // Catch:{ InterruptedException -> 0x00dc }
            goto L_0x00dc
        L_0x00eb:
            monitor-exit(r0)     // Catch:{ all -> 0x00ee }
            goto L_0x0000
        L_0x00ee:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x00ee }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C2895ts.run():void");
    }
}
