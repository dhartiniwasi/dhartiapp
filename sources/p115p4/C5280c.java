package p115p4;

import android.app.Activity;
import android.content.Context;
import android.graphics.Point;
import android.net.Uri;
import android.os.Build;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.WebView;
import com.google.android.gms.internal.ads.C2679nz;
import com.google.android.gms.internal.ads.C2955ve;
import com.google.android.gms.internal.ads.C2992we;
import com.google.android.gms.internal.ads.az2;
import com.google.android.gms.internal.ads.bu2;
import com.google.android.gms.internal.ads.bv1;
import com.google.android.gms.internal.ads.cf3;
import com.google.android.gms.internal.ads.cl0;
import com.google.android.gms.internal.ads.dn0;
import com.google.android.gms.internal.ads.el0;
import com.google.android.gms.internal.ads.jl0;
import com.google.android.gms.internal.ads.lf3;
import com.google.android.gms.internal.ads.lv1;
import com.google.android.gms.internal.ads.mf3;
import com.google.android.gms.internal.ads.my2;
import com.google.android.gms.internal.ads.ny2;
import com.google.android.gms.internal.ads.pm0;
import com.google.android.gms.internal.ads.qf0;
import com.google.android.gms.internal.ads.r83;
import com.google.android.gms.internal.ads.rz2;
import com.google.android.gms.internal.ads.se3;
import com.google.android.gms.internal.ads.su0;
import com.google.android.gms.internal.ads.vf0;
import com.google.android.gms.internal.ads.vm0;
import com.google.android.gms.internal.ads.x00;
import com.google.android.gms.internal.ads.yy2;
import com.google.android.gms.internal.ads.zq1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONObject;
import p053g4.C4409t;
import p060h4.C4541l4;
import p060h4.C4571q4;
import p060h4.C4596v;
import p073j4.C4829z0;
import p088l5.C4954a;
import p088l5.C4956b;
import p179z3.C6323b;

/* renamed from: p4.c */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class C5280c extends el0 {

    /* renamed from: K */
    protected static final List f27229K = new ArrayList(Arrays.asList(new String[]{"/aclk", "/pcs/click", "/dbm/clk"}));

    /* renamed from: L */
    protected static final List f27230L = new ArrayList(Arrays.asList(new String[]{".doubleclick.net", ".googleadservices.com"}));

    /* renamed from: M */
    protected static final List f27231M = new ArrayList(Arrays.asList(new String[]{"/pagead/adview", "/pcs/view", "/pagead/conversion", "/dbm/ad"}));

    /* renamed from: N */
    protected static final List f27232N = new ArrayList(Arrays.asList(new String[]{".doubleclick.net", ".googleadservices.com", ".googlesyndication.com"}));

    /* renamed from: O */
    public static final /* synthetic */ int f27233O = 0;
    /* access modifiers changed from: private */

    /* renamed from: A */
    public final String f27234A;
    /* access modifiers changed from: private */

    /* renamed from: B */
    public final String f27235B;
    /* access modifiers changed from: private */

    /* renamed from: C */
    public final AtomicInteger f27236C = new AtomicInteger(0);
    /* access modifiers changed from: private */

    /* renamed from: D */
    public final vm0 f27237D;
    /* access modifiers changed from: private */

    /* renamed from: E */
    public String f27238E;
    /* access modifiers changed from: private */

    /* renamed from: F */
    public final String f27239F;

    /* renamed from: G */
    private final List f27240G;

    /* renamed from: H */
    private final List f27241H;

    /* renamed from: I */
    private final List f27242I;

    /* renamed from: J */
    private final List f27243J;

    /* renamed from: a */
    private final su0 f27244a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public Context f27245b;

    /* renamed from: c */
    private final C2955ve f27246c;

    /* renamed from: d */
    private final bu2 f27247d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public bv1 f27248e = null;

    /* renamed from: f */
    private final mf3 f27249f;

    /* renamed from: g */
    private final ScheduledExecutorService f27250g;

    /* renamed from: h */
    private vf0 f27251h;

    /* renamed from: i */
    private Point f27252i = new Point();

    /* renamed from: r */
    private Point f27253r = new Point();

    /* renamed from: s */
    private final Set f27254s = Collections.newSetFromMap(new WeakHashMap());

    /* renamed from: t */
    private final C5312t f27255t;
    /* access modifiers changed from: private */

    /* renamed from: u */
    public final lv1 f27256u;
    /* access modifiers changed from: private */

    /* renamed from: v */
    public final rz2 f27257v;
    /* access modifiers changed from: private */

    /* renamed from: w */
    public final boolean f27258w;
    /* access modifiers changed from: private */

    /* renamed from: x */
    public final boolean f27259x;
    /* access modifiers changed from: private */

    /* renamed from: y */
    public final boolean f27260y;
    /* access modifiers changed from: private */

    /* renamed from: z */
    public final boolean f27261z;

    public C5280c(su0 su0, Context context, C2955ve veVar, bu2 bu2, mf3 mf3, ScheduledExecutorService scheduledExecutorService, lv1 lv1, rz2 rz2, vm0 vm0) {
        List list;
        this.f27244a = su0;
        this.f27245b = context;
        this.f27246c = veVar;
        this.f27247d = bu2;
        this.f27249f = mf3;
        this.f27250g = scheduledExecutorService;
        this.f27255t = su0.mo9724q();
        this.f27256u = lv1;
        this.f27257v = rz2;
        this.f27237D = vm0;
        this.f27258w = ((Boolean) C4596v.m30088c().mo12227b(C2679nz.f14664q6)).booleanValue();
        this.f27259x = ((Boolean) C4596v.m30088c().mo12227b(C2679nz.f14654p6)).booleanValue();
        this.f27260y = ((Boolean) C4596v.m30088c().mo12227b(C2679nz.f14674r6)).booleanValue();
        this.f27261z = ((Boolean) C4596v.m30088c().mo12227b(C2679nz.f14694t6)).booleanValue();
        this.f27234A = (String) C4596v.m30088c().mo12227b(C2679nz.f14684s6);
        this.f27235B = (String) C4596v.m30088c().mo12227b(C2679nz.f14704u6);
        this.f27239F = (String) C4596v.m30088c().mo12227b(C2679nz.f14714v6);
        if (((Boolean) C4596v.m30088c().mo12227b(C2679nz.f14724w6)).booleanValue()) {
            this.f27240G = m32568g7((String) C4596v.m30088c().mo12227b(C2679nz.f14734x6));
            this.f27241H = m32568g7((String) C4596v.m30088c().mo12227b(C2679nz.f14744y6));
            this.f27242I = m32568g7((String) C4596v.m30088c().mo12227b(C2679nz.f14754z6));
            list = m32568g7((String) C4596v.m30088c().mo12227b(C2679nz.f14249A6));
        } else {
            this.f27240G = f27229K;
            this.f27241H = f27230L;
            this.f27242I = f27231M;
            list = f27232N;
        }
        this.f27243J = list;
    }

    /* renamed from: O6 */
    static /* bridge */ /* synthetic */ void m32554O6(C5280c cVar, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (cVar.mo19263W6((Uri) it.next())) {
                cVar.f27236C.getAndIncrement();
                return;
            }
        }
    }

    /* renamed from: P6 */
    static /* bridge */ /* synthetic */ void m32555P6(C5280c cVar, String str, String str2, bv1 bv1) {
        if (((Boolean) C4596v.m30088c().mo12227b(C2679nz.f14504a6)).booleanValue()) {
            if (((Boolean) C4596v.m30088c().mo12227b(C2679nz.f14564g6)).booleanValue()) {
                dn0.f8325a.execute(new C5318z(cVar, str, str2, bv1));
            } else {
                cVar.f27255t.mo19286d(str, str2, bv1);
            }
        }
    }

    /* renamed from: Y6 */
    static final /* synthetic */ Uri m32560Y6(Uri uri, String str) {
        return !TextUtils.isEmpty(str) ? m32567f7(uri, "nas", str) : uri;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: Z6 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final p115p4.C5317y m32561Z6(android.content.Context r9, java.lang.String r10, java.lang.String r11, p060h4.C4571q4 r12, p060h4.C4541l4 r13) {
        /*
            r8 = this;
            com.google.android.gms.internal.ads.ct2 r0 = new com.google.android.gms.internal.ads.ct2
            r0.<init>()
            com.google.android.gms.internal.ads.ez r1 = com.google.android.gms.internal.ads.C2679nz.f14269C6
            com.google.android.gms.internal.ads.lz r2 = p060h4.C4596v.m30088c()
            java.lang.Object r2 = r2.mo12227b(r1)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            java.lang.String r3 = "REWARDED_INTERSTITIAL"
            java.lang.String r4 = "REWARDED"
            r5 = 3
            r6 = 2
            if (r2 == 0) goto L_0x0038
            boolean r2 = r4.equals(r11)
            if (r2 == 0) goto L_0x002b
            com.google.android.gms.internal.ads.os2 r2 = r0.mo9324F()
            r2.mo13033a(r6)
            goto L_0x0038
        L_0x002b:
            boolean r2 = r3.equals(r11)
            if (r2 == 0) goto L_0x0038
            com.google.android.gms.internal.ads.os2 r2 = r0.mo9324F()
            r2.mo13033a(r5)
        L_0x0038:
            com.google.android.gms.internal.ads.su0 r2 = r8.f27244a
            p4.x r2 = r2.mo9725r()
            com.google.android.gms.internal.ads.f91 r7 = new com.google.android.gms.internal.ads.f91
            r7.<init>()
            r7.mo10111c(r9)
            if (r10 != 0) goto L_0x004a
            java.lang.String r10 = "adUnitId"
        L_0x004a:
            r0.mo9328J(r10)
            if (r13 != 0) goto L_0x0058
            h4.m4 r10 = new h4.m4
            r10.<init>()
            h4.l4 r13 = r10.mo18073a()
        L_0x0058:
            r0.mo9340e(r13)
            r10 = 1
            if (r12 != 0) goto L_0x00c0
            com.google.android.gms.internal.ads.lz r12 = p060h4.C4596v.m30088c()
            java.lang.Object r12 = r12.mo12227b(r1)
            java.lang.Boolean r12 = (java.lang.Boolean) r12
            boolean r12 = r12.booleanValue()
            if (r12 != 0) goto L_0x0074
            h4.q4 r12 = new h4.q4
            r12.<init>()
            goto L_0x00c0
        L_0x0074:
            int r12 = r11.hashCode()
            switch(r12) {
                case -1999289321: goto L_0x0096;
                case 543046670: goto L_0x008e;
                case 1854800829: goto L_0x0086;
                case 1951953708: goto L_0x007c;
                default: goto L_0x007b;
            }
        L_0x007b:
            goto L_0x00a0
        L_0x007c:
            java.lang.String r12 = "BANNER"
            boolean r12 = r11.equals(r12)
            if (r12 == 0) goto L_0x00a0
            r12 = 0
            goto L_0x00a1
        L_0x0086:
            boolean r12 = r11.equals(r3)
            if (r12 == 0) goto L_0x00a0
            r12 = 2
            goto L_0x00a1
        L_0x008e:
            boolean r12 = r11.equals(r4)
            if (r12 == 0) goto L_0x00a0
            r12 = 1
            goto L_0x00a1
        L_0x0096:
            java.lang.String r12 = "NATIVE"
            boolean r12 = r11.equals(r12)
            if (r12 == 0) goto L_0x00a0
            r12 = 3
            goto L_0x00a1
        L_0x00a0:
            r12 = -1
        L_0x00a1:
            if (r12 == 0) goto L_0x00b9
            if (r12 == r10) goto L_0x00b4
            if (r12 == r6) goto L_0x00b4
            if (r12 == r5) goto L_0x00af
            h4.q4 r12 = new h4.q4
            r12.<init>()
            goto L_0x00c0
        L_0x00af:
            h4.q4 r12 = p060h4.C4571q4.m29983K1()
            goto L_0x00c0
        L_0x00b4:
            h4.q4 r12 = p060h4.C4571q4.m29984L1()
            goto L_0x00c0
        L_0x00b9:
            h4.q4 r12 = new h4.q4
            z3.h r13 = p179z3.C6337h.f30518i
            r12.<init>((android.content.Context) r9, (p179z3.C6337h) r13)
        L_0x00c0:
            r0.mo9327I(r12)
            r0.mo9333O(r10)
            com.google.android.gms.internal.ads.et2 r9 = r0.mo9342g()
            r7.mo10114f(r9)
            com.google.android.gms.internal.ads.h91 r9 = r7.mo10115g()
            r2.mo13624a(r9)
            p4.e r9 = new p4.e
            r9.<init>()
            r9.mo19271a(r11)
            p4.g r10 = new p4.g
            r11 = 0
            r10.<init>(r9, r11)
            r2.mo13625b(r10)
            com.google.android.gms.internal.ads.lf1 r9 = new com.google.android.gms.internal.ads.lf1
            r9.<init>()
            p4.y r9 = r2.mo13626e()
            com.google.android.gms.internal.ads.bv1 r10 = r9.mo14165a()
            r8.f27248e = r10
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: p115p4.C5280c.m32561Z6(android.content.Context, java.lang.String, java.lang.String, h4.q4, h4.l4):p4.y");
    }

    /* renamed from: a7 */
    private final lf3 m32562a7(String str) {
        zq1[] zq1Arr = new zq1[1];
        lf3 n = cf3.m10916n(this.f27247d.mo8946a(), new C5279b0(this, zq1Arr, str), this.f27249f);
        n.mo10135j(new C5281c0(this, zq1Arr), this.f27249f);
        return cf3.m10908f(cf3.m10915m((se3) cf3.m10917o(se3.m20287D(n), (long) ((Integer) C4596v.m30088c().mo12227b(C2679nz.f14309G6)).intValue(), TimeUnit.MILLISECONDS, this.f27250g), C5301m0.f27300a, this.f27249f), Exception.class, C5277a0.f27221a, this.f27249f);
    }

    /* renamed from: b7 */
    private final void m32563b7(List list, C4954a aVar, qf0 qf0, boolean z) {
        lf3 lf3;
        if (!((Boolean) C4596v.m30088c().mo12227b(C2679nz.f14299F6)).booleanValue()) {
            pm0.m18667g("The updating URL feature is not enabled.");
            try {
                qf0.mo12907k("The updating URL feature is not enabled.");
            } catch (RemoteException e) {
                pm0.m18665e("", e);
            }
        } else {
            Iterator it = list.iterator();
            int i = 0;
            while (it.hasNext()) {
                if (mo19263W6((Uri) it.next())) {
                    i++;
                }
            }
            if (i > 1) {
                pm0.m18667g("Multiple google urls found: ".concat(String.valueOf(list)));
            }
            ArrayList arrayList = new ArrayList();
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                Uri uri = (Uri) it2.next();
                if (!mo19263W6(uri)) {
                    pm0.m18667g("Not a Google URL: ".concat(String.valueOf(uri)));
                    lf3 = cf3.m10911i(uri);
                } else {
                    lf3 = this.f27249f.mo12324a(new C5291h0(this, uri, aVar));
                    if (m32566e7()) {
                        lf3 = cf3.m10916n(lf3, new C5293i0(this), this.f27249f);
                    } else {
                        pm0.m18666f("Asset view map is empty.");
                    }
                }
                arrayList.add(lf3);
            }
            cf3.m10920r(cf3.m10907e(arrayList), new C5307p0(this, qf0, z), this.f27244a.mo9711b());
        }
    }

    /* renamed from: c7 */
    private final void m32564c7(List list, C4954a aVar, qf0 qf0, boolean z) {
        if (!((Boolean) C4596v.m30088c().mo12227b(C2679nz.f14299F6)).booleanValue()) {
            try {
                qf0.mo12907k("The updating URL feature is not enabled.");
            } catch (RemoteException e) {
                pm0.m18665e("", e);
            }
        } else {
            lf3 a = this.f27249f.mo12324a(new C5295j0(this, list, aVar));
            if (m32566e7()) {
                a = cf3.m10916n(a, new C5297k0(this), this.f27249f);
            } else {
                pm0.m18666f("Asset view map is empty.");
            }
            cf3.m10920r(a, new C5305o0(this, qf0, z), this.f27244a.mo9711b());
        }
    }

    /* renamed from: d7 */
    private static boolean m32565d7(Uri uri, List list, List list2) {
        String host = uri.getHost();
        String path = uri.getPath();
        if (!(host == null || path == null)) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (path.contains((String) it.next())) {
                    Iterator it2 = list2.iterator();
                    while (it2.hasNext()) {
                        if (host.endsWith((String) it2.next())) {
                            return true;
                        }
                    }
                    continue;
                }
            }
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r0 = r0.f19083b;
     */
    /* renamed from: e7 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean m32566e7() {
        /*
            r1 = this;
            com.google.android.gms.internal.ads.vf0 r0 = r1.f27251h
            if (r0 == 0) goto L_0x0010
            java.util.Map r0 = r0.f19083b
            if (r0 == 0) goto L_0x0010
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0010
            r0 = 1
            return r0
        L_0x0010:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p115p4.C5280c.m32566e7():boolean");
    }

    /* access modifiers changed from: private */
    /* renamed from: f7 */
    public static final Uri m32567f7(Uri uri, String str, String str2) {
        String uri2 = uri.toString();
        int indexOf = uri2.indexOf("&adurl=");
        if (indexOf == -1) {
            indexOf = uri2.indexOf("?adurl=");
        }
        if (indexOf == -1) {
            return uri.buildUpon().appendQueryParameter(str, str2).build();
        }
        int i = indexOf + 1;
        return Uri.parse(uri2.substring(0, i) + str + "=" + str2 + "&" + uri2.substring(i));
    }

    /* renamed from: g7 */
    private static final List m32568g7(String str) {
        String[] split = TextUtils.split(str, ",");
        ArrayList arrayList = new ArrayList();
        for (String str2 : split) {
            if (!r83.m19615d(str2)) {
                arrayList.add(str2);
            }
        }
        return arrayList;
    }

    /* renamed from: o7 */
    static /* bridge */ /* synthetic */ yy2 m32574o7(lf3 lf3, jl0 jl0) {
        String str;
        if (!az2.m10140a() || !((Boolean) x00.f19925e.mo13438e()).booleanValue()) {
            return null;
        }
        try {
            yy2 b = ((C5317y) cf3.m10918p(lf3)).mo14166b();
            b.mo15518d(new ArrayList(Collections.singletonList(jl0.f11685b)));
            C4541l4 l4Var = jl0.f11687d;
            if (l4Var == null) {
                str = "";
            } else {
                str = l4Var.f24904x;
            }
            b.mo15516b(str);
            return b;
        } catch (ExecutionException e) {
            C4409t.m29325q().mo15126t(e, "SignalGeneratorImpl.getConfiguredCriticalUserJourney");
            return null;
        }
    }

    /* renamed from: B */
    public final void mo10175B(C4954a aVar) {
        View view;
        if (((Boolean) C4596v.m30088c().mo12227b(C2679nz.f14299F6)).booleanValue()) {
            MotionEvent motionEvent = (MotionEvent) C4956b.m31384P0(aVar);
            vf0 vf0 = this.f27251h;
            if (vf0 == null) {
                view = null;
            } else {
                view = vf0.f19082a;
            }
            this.f27252i = C4829z0.m30847a(motionEvent, view);
            if (motionEvent.getAction() == 0) {
                this.f27253r = this.f27252i;
            }
            MotionEvent obtain = MotionEvent.obtain(motionEvent);
            Point point = this.f27252i;
            obtain.setLocation((float) point.x, (float) point.y);
            this.f27246c.mo14738d(obtain);
            obtain.recycle();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: K6 */
    public final /* synthetic */ ArrayList mo19259K6(List list, String str) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Uri uri = (Uri) it.next();
            if (!mo19264X6(uri) || TextUtils.isEmpty(str)) {
                arrayList.add(uri);
            } else {
                arrayList.add(m32567f7(uri, "nas", str));
            }
        }
        return arrayList;
    }

    /* renamed from: L */
    public final void mo10176L(C4954a aVar) {
        lf3 lf3;
        if (((Boolean) C4596v.m30088c().mo12227b(C2679nz.f14516b8)).booleanValue()) {
            if (Build.VERSION.SDK_INT < 21) {
                pm0.m18667g("Not registering the webview because the Android API level is lower than Lollopop which has security risks on webviews.");
                return;
            }
            if (((Boolean) C4596v.m30088c().mo12227b(C2679nz.f14526c8)).booleanValue()) {
                if (((Boolean) C4596v.m30088c().mo12227b(C2679nz.f14321H8)).booleanValue()) {
                    lf3 = cf3.m10914l(new C5299l0(this), dn0.f8325a);
                } else {
                    lf3 = m32561Z6(this.f27245b, (String) null, C6323b.BANNER.name(), (C4571q4) null, (C4541l4) null).mo14167c();
                }
                cf3.m10920r(lf3, new C5309q0(this), this.f27244a.mo9711b());
            }
            WebView webView = (WebView) C4956b.m31384P0(aVar);
            if (webView == null) {
                pm0.m18664d("The webView cannot be null.");
            } else if (this.f27254s.contains(webView)) {
                pm0.m18666f("This webview has already been registered.");
            } else {
                this.f27254s.add(webView);
                webView.addJavascriptInterface(new C5276a(webView, this.f27246c, this.f27256u), "gmaSdk");
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: L6 */
    public final /* synthetic */ ArrayList mo19260L6(List list, C4954a aVar) throws Exception {
        String f = this.f27246c.mo14737c() != null ? this.f27246c.mo14737c().mo12595f(this.f27245b, (View) C4956b.m31384P0(aVar), (Activity) null) : "";
        if (!TextUtils.isEmpty(f)) {
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                Uri uri = (Uri) it.next();
                if (!mo19264X6(uri)) {
                    pm0.m18667g("Not a Google URL: ".concat(String.valueOf(uri)));
                    arrayList.add(uri);
                } else {
                    arrayList.add(m32567f7(uri, "ms", f));
                }
            }
            if (!arrayList.isEmpty()) {
                return arrayList;
            }
            throw new Exception("Empty impression URLs result.");
        }
        throw new Exception("Failed to get view signals.");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Q6 */
    public final /* synthetic */ void mo19261Q6(zq1[] zq1Arr) {
        zq1 zq1 = zq1Arr[0];
        if (zq1 != null) {
            this.f27247d.mo8947b(cf3.m10911i(zq1));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: R6 */
    public final /* synthetic */ void mo19262R6(String str, String str2, bv1 bv1) {
        this.f27255t.mo19286d(str, str2, bv1);
    }

    /* renamed from: W5 */
    public final void mo10177W5(List list, C4954a aVar, qf0 qf0) {
        m32564c7(list, aVar, qf0, false);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: W6 */
    public final boolean mo19263W6(Uri uri) {
        return m32565d7(uri, this.f27240G, this.f27241H);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: X6 */
    public final boolean mo19264X6(Uri uri) {
        return m32565d7(uri, this.f27242I, this.f27243J);
    }

    /* renamed from: f3 */
    public final void mo10178f3(vf0 vf0) {
        this.f27251h = vf0;
        this.f27247d.mo8948c(1);
    }

    /* renamed from: i1 */
    public final void mo10179i1(List list, C4954a aVar, qf0 qf0) {
        m32563b7(list, aVar, qf0, false);
    }

    /* renamed from: j3 */
    public final void mo10180j3(List list, C4954a aVar, qf0 qf0) {
        m32564c7(list, aVar, qf0, true);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j7 */
    public final /* synthetic */ Uri mo19265j7(Uri uri, C4954a aVar) throws Exception {
        try {
            uri = this.f27246c.mo14735a(uri, this.f27245b, (View) C4956b.m31384P0(aVar), (Activity) null);
        } catch (C2992we e) {
            pm0.m18668h("", e);
        }
        if (uri.getQueryParameter("ms") != null) {
            return uri;
        }
        throw new Exception("Failed to append spam signals to click url.");
    }

    /* renamed from: l4 */
    public final void mo10181l4(List list, C4954a aVar, qf0 qf0) {
        m32563b7(list, aVar, qf0, true);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n7 */
    public final /* synthetic */ C5317y mo19266n7(jl0 jl0) throws Exception {
        return m32561Z6(this.f27245b, jl0.f11684a, jl0.f11685b, jl0.f11686c, jl0.f11687d);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r7 */
    public final /* synthetic */ lf3 mo19267r7() throws Exception {
        return m32561Z6(this.f27245b, (String) null, C6323b.BANNER.name(), (C4571q4) null, (C4541l4) null).mo14167c();
    }

    /* renamed from: s5 */
    public final void mo9624s5(C4954a aVar, jl0 jl0, cl0 cl0) {
        lf3 lf3;
        lf3 lf32;
        jl0 jl02 = jl0;
        Context context = (Context) C4956b.m31384P0(aVar);
        this.f27245b = context;
        ny2 a = my2.m16825a(context, 22);
        a.mo11828T();
        if (((Boolean) C4596v.m30088c().mo12227b(C2679nz.f14321H8)).booleanValue()) {
            mf3 mf3 = dn0.f8325a;
            lf3 = mf3.mo12324a(new C5287f0(this, jl0));
            lf32 = cf3.m10916n(lf3, C5289g0.f27281a, mf3);
        } else {
            C5317y Z6 = m32561Z6(this.f27245b, jl02.f11684a, jl02.f11685b, jl02.f11686c, jl02.f11687d);
            lf3 = cf3.m10911i(Z6);
            lf32 = Z6.mo14167c();
        }
        cf3.m10920r(lf32, new C5303n0(this, lf3, jl0, cl0, a, C4409t.m29310b().mo18370a()), this.f27244a.mo9711b());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s7 */
    public final /* synthetic */ lf3 mo19268s7(zq1[] zq1Arr, String str, zq1 zq1) throws Exception {
        zq1Arr[0] = zq1;
        Context context = this.f27245b;
        vf0 vf0 = this.f27251h;
        Map map = vf0.f19083b;
        JSONObject d = C4829z0.m30850d(context, map, map, vf0.f19082a);
        JSONObject g = C4829z0.m30853g(this.f27245b, this.f27251h.f19082a);
        JSONObject f = C4829z0.m30852f(this.f27251h.f19082a);
        JSONObject e = C4829z0.m30851e(this.f27245b, this.f27251h.f19082a);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("asset_view_signal", d);
        jSONObject.put("ad_view_signal", g);
        jSONObject.put("scroll_view_signal", f);
        jSONObject.put("lock_screen_signal", e);
        if ("google.afma.nativeAds.getPublisherCustomRenderedClickSignals".equals(str)) {
            jSONObject.put("click_signal", C4829z0.m30849c((String) null, this.f27245b, this.f27253r, this.f27252i));
        }
        return zq1.mo15642d(str, jSONObject);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t7 */
    public final /* synthetic */ lf3 mo19269t7(ArrayList arrayList) throws Exception {
        return cf3.m10915m(m32562a7("google.afma.nativeAds.getPublisherCustomRenderedImpressionSignals"), new C5285e0(this, arrayList), this.f27249f);
    }
}
