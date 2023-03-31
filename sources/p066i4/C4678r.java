package p066i4;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.webkit.WebChromeClient;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.internal.ads.C2679nz;
import com.google.android.gms.internal.ads.C2955ve;
import com.google.android.gms.internal.ads.C2971vu;
import com.google.android.gms.internal.ads.a50;
import com.google.android.gms.internal.ads.af0;
import com.google.android.gms.internal.ads.b53;
import com.google.android.gms.internal.ads.c00;
import com.google.android.gms.internal.ads.f60;
import com.google.android.gms.internal.ads.gv1;
import com.google.android.gms.internal.ads.h60;
import com.google.android.gms.internal.ads.is2;
import com.google.android.gms.internal.ads.it0;
import com.google.android.gms.internal.ads.ku0;
import com.google.android.gms.internal.ads.ls2;
import com.google.android.gms.internal.ads.me0;
import com.google.android.gms.internal.ads.mu0;
import com.google.android.gms.internal.ads.n00;
import com.google.android.gms.internal.ads.nj0;
import com.google.android.gms.internal.ads.o42;
import com.google.android.gms.internal.ads.pm0;
import com.google.android.gms.internal.ads.qh1;
import com.google.android.gms.internal.ads.r60;
import com.google.android.gms.internal.ads.rz2;
import com.google.android.gms.internal.ads.ux2;
import com.google.android.gms.internal.ads.vm0;
import com.google.android.gms.internal.ads.vs0;
import com.google.android.gms.internal.ads.w42;
import com.google.android.gms.internal.ads.x60;
import com.google.android.gms.internal.ads.y40;
import java.util.Collections;
import p053g4.C4391b;
import p053g4.C4401l;
import p053g4.C4409t;
import p060h4.C4470a;
import p060h4.C4596v;
import p073j4.C4751b2;
import p088l5.C4954a;
import p088l5.C4956b;

/* renamed from: i4.r */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public class C4678r extends af0 implements C4664e {

    /* renamed from: C */
    static final int f25220C = Color.argb(0, 0, 0, 0);

    /* renamed from: A */
    private boolean f25221A = true;

    /* renamed from: B */
    int f25222B = 1;

    /* renamed from: a */
    protected final Activity f25223a;

    /* renamed from: b */
    AdOverlayInfoParcel f25224b;

    /* renamed from: c */
    vs0 f25225c;

    /* renamed from: d */
    C4674n f25226d;

    /* renamed from: e */
    C4683w f25227e;

    /* renamed from: f */
    boolean f25228f = false;

    /* renamed from: g */
    FrameLayout f25229g;

    /* renamed from: h */
    WebChromeClient.CustomViewCallback f25230h;

    /* renamed from: i */
    boolean f25231i = false;

    /* renamed from: r */
    boolean f25232r = false;

    /* renamed from: s */
    C4673m f25233s;

    /* renamed from: t */
    boolean f25234t = false;

    /* renamed from: u */
    private final Object f25235u = new Object();

    /* renamed from: v */
    private Runnable f25236v;

    /* renamed from: w */
    private boolean f25237w;

    /* renamed from: x */
    private boolean f25238x;

    /* renamed from: y */
    private boolean f25239y = false;

    /* renamed from: z */
    private boolean f25240z = false;

    public C4678r(Activity activity) {
        this.f25223a = activity;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r0 = r0.f5972w;
     */
    /* renamed from: L6 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m30320L6(android.content.res.Configuration r6) {
        /*
            r5 = this;
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r0 = r5.f25224b
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x0010
            g4.j r0 = r0.f5972w
            if (r0 == 0) goto L_0x0010
            boolean r0 = r0.f24518b
            if (r0 == 0) goto L_0x0010
            r0 = 1
            goto L_0x0011
        L_0x0010:
            r0 = 0
        L_0x0011:
            j4.b r3 = p053g4.C4409t.m29327s()
            android.app.Activity r4 = r5.f25223a
            boolean r6 = r3.mo18423e(r4, r6)
            boolean r3 = r5.f25232r
            if (r3 == 0) goto L_0x0021
            if (r0 == 0) goto L_0x0031
        L_0x0021:
            if (r6 != 0) goto L_0x0031
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r6 = r5.f25224b
            if (r6 == 0) goto L_0x0032
            g4.j r6 = r6.f5972w
            if (r6 == 0) goto L_0x0032
            boolean r6 = r6.f24523g
            if (r6 == 0) goto L_0x0032
            r2 = 1
            goto L_0x0032
        L_0x0031:
            r1 = 0
        L_0x0032:
            android.app.Activity r6 = r5.f25223a
            android.view.Window r6 = r6.getWindow()
            com.google.android.gms.internal.ads.ez r0 = com.google.android.gms.internal.ads.C2679nz.f14480Y0
            com.google.android.gms.internal.ads.lz r3 = p060h4.C4596v.m30088c()
            java.lang.Object r0 = r3.mo12227b(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x005e
            android.view.View r6 = r6.getDecorView()
            if (r1 == 0) goto L_0x0058
            if (r2 == 0) goto L_0x0055
            r0 = 5894(0x1706, float:8.259E-42)
            goto L_0x005a
        L_0x0055:
            r0 = 5380(0x1504, float:7.539E-42)
            goto L_0x005a
        L_0x0058:
            r0 = 256(0x100, float:3.59E-43)
        L_0x005a:
            r6.setSystemUiVisibility(r0)
            return
        L_0x005e:
            r0 = 1024(0x400, float:1.435E-42)
            r3 = 2048(0x800, float:2.87E-42)
            if (r1 == 0) goto L_0x0076
            r6.addFlags(r0)
            r6.clearFlags(r3)
            if (r2 == 0) goto L_0x0075
            android.view.View r6 = r6.getDecorView()
            r0 = 4098(0x1002, float:5.743E-42)
            r6.setSystemUiVisibility(r0)
        L_0x0075:
            return
        L_0x0076:
            r6.addFlags(r3)
            r6.clearFlags(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p066i4.C4678r.m30320L6(android.content.res.Configuration):void");
    }

    /* renamed from: M6 */
    private static final void m30321M6(C4954a aVar, View view) {
        if (aVar != null && view != null) {
            C4409t.m29309a().mo15328b(aVar, view);
        }
    }

    /* renamed from: B */
    public final void mo8763B(C4954a aVar) {
        m30320L6((Configuration) C4956b.m31384P0(aVar));
    }

    /* renamed from: C */
    public final void mo18349C() {
        synchronized (this.f25235u) {
            this.f25237w = true;
            Runnable runnable = this.f25236v;
            if (runnable != null) {
                b53 b53 = C4751b2.f25403i;
                b53.removeCallbacks(runnable);
                b53.post(this.f25236v);
            }
        }
    }

    /* renamed from: J6 */
    public final void mo18350J6(View view, WebChromeClient.CustomViewCallback customViewCallback) {
        FrameLayout frameLayout = new FrameLayout(this.f25223a);
        this.f25229g = frameLayout;
        frameLayout.setBackgroundColor(-16777216);
        this.f25229g.addView(view, -1, -1);
        this.f25223a.setContentView(this.f25229g);
        this.f25238x = true;
        this.f25230h = customViewCallback;
        this.f25228f = true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: K */
    public final void mo18351K() {
        AdOverlayInfoParcel adOverlayInfoParcel;
        C4680t tVar;
        if (this.f25223a.isFinishing() && !this.f25239y) {
            this.f25239y = true;
            vs0 vs0 = this.f25225c;
            if (vs0 != null) {
                vs0.mo12133r1(this.f25222B - 1);
                synchronized (this.f25235u) {
                    if (!this.f25237w && this.f25225c.mo12134s()) {
                        if (((Boolean) C4596v.m30088c().mo12227b(C2679nz.f14456V3)).booleanValue() && !this.f25240z && (adOverlayInfoParcel = this.f25224b) != null && (tVar = adOverlayInfoParcel.f5960c) != null) {
                            tVar.mo8936r6();
                        }
                        C4671k kVar = new C4671k(this);
                        this.f25236v = kVar;
                        C4751b2.f25403i.postDelayed(kVar, ((Long) C4596v.m30088c().mo12227b(C2679nz.f14413R0)).longValue());
                        return;
                    }
                }
            }
            mo18362e();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: K6 */
    public final void mo18352K6(boolean z) throws C4672l {
        if (!this.f25238x) {
            this.f25223a.requestWindowFeature(1);
        }
        Window window = this.f25223a.getWindow();
        if (window != null) {
            vs0 vs0 = this.f25224b.f5961d;
            C4391b bVar = null;
            ku0 f0 = vs0 != null ? vs0.mo12108f0() : null;
            boolean z2 = false;
            boolean z3 = f0 != null && f0.mo9320u();
            this.f25234t = false;
            if (z3) {
                int i = this.f25224b.f5967r;
                if (i == 6) {
                    if (this.f25223a.getResources().getConfiguration().orientation == 1) {
                        z2 = true;
                    }
                    this.f25234t = z2;
                } else if (i == 7) {
                    if (this.f25223a.getResources().getConfiguration().orientation == 2) {
                        z2 = true;
                    }
                    this.f25234t = z2;
                }
            }
            pm0.m18662b("Delay onShow to next orientation change: " + z2);
            mo18355P6(this.f25224b.f5967r);
            window.setFlags(16777216, 16777216);
            pm0.m18662b("Hardware acceleration on the AdActivity window enabled.");
            if (!this.f25232r) {
                this.f25233s.setBackgroundColor(-16777216);
            } else {
                this.f25233s.setBackgroundColor(f25220C);
            }
            this.f25223a.setContentView(this.f25233s);
            this.f25238x = true;
            if (z) {
                try {
                    C4409t.m29308B();
                    Activity activity = this.f25223a;
                    vs0 vs02 = this.f25224b.f5961d;
                    mu0 n = vs02 != null ? vs02.mo9698n() : null;
                    vs0 vs03 = this.f25224b.f5961d;
                    String a1 = vs03 != null ? vs03.mo12101a1() : null;
                    AdOverlayInfoParcel adOverlayInfoParcel = this.f25224b;
                    vm0 vm0 = adOverlayInfoParcel.f5970u;
                    vs0 vs04 = adOverlayInfoParcel.f5961d;
                    vs0 a = it0.m14546a(activity, n, a1, true, z3, (C2955ve) null, (n00) null, vm0, (c00) null, (C4401l) null, vs04 != null ? vs04.mo8466c0() : null, C2971vu.m22435a(), (is2) null, (ls2) null);
                    this.f25225c = a;
                    ku0 f02 = a.mo12108f0();
                    AdOverlayInfoParcel adOverlayInfoParcel2 = this.f25224b;
                    y40 y40 = adOverlayInfoParcel2.f5973x;
                    a50 a50 = adOverlayInfoParcel2.f5962e;
                    C4665e0 e0Var = adOverlayInfoParcel2.f5966i;
                    vs0 vs05 = adOverlayInfoParcel2.f5961d;
                    if (vs05 != null) {
                        bVar = vs05.mo12108f0().mo9301b();
                    }
                    f02.mo9308g0((C4470a) null, y40, (C4680t) null, a50, e0Var, true, (h60) null, bVar, (me0) null, (nj0) null, (o42) null, (rz2) null, (gv1) null, (ux2) null, (f60) null, (qh1) null, (x60) null, (r60) null);
                    this.f25225c.mo12108f0().mo9283G(new C4670j(this));
                    AdOverlayInfoParcel adOverlayInfoParcel3 = this.f25224b;
                    String str = adOverlayInfoParcel3.f5969t;
                    if (str != null) {
                        this.f25225c.loadUrl(str);
                    } else {
                        String str2 = adOverlayInfoParcel3.f5965h;
                        if (str2 != null) {
                            this.f25225c.loadDataWithBaseURL(adOverlayInfoParcel3.f5963f, str2, "text/html", "UTF-8", (String) null);
                        } else {
                            throw new C4672l("No URL or HTML to display in ad overlay.");
                        }
                    }
                    vs0 vs06 = this.f25224b.f5961d;
                    if (vs06 != null) {
                        vs06.mo12110g1(this);
                    }
                } catch (Exception e) {
                    pm0.m18665e("Error obtaining webview.", e);
                    throw new C4672l("Could not obtain webview for the overlay.", e);
                }
            } else {
                vs0 vs07 = this.f25224b.f5961d;
                this.f25225c = vs07;
                vs07.mo12140t1(this.f25223a);
            }
            this.f25225c.mo12142u1(this);
            vs0 vs08 = this.f25224b.f5961d;
            if (vs08 != null) {
                m30321M6(vs08.mo12124m1(), this.f25233s);
            }
            if (this.f25224b.f5968s != 5) {
                ViewParent parent = this.f25225c.getParent();
                if (parent != null && (parent instanceof ViewGroup)) {
                    ((ViewGroup) parent).removeView(this.f25225c.mo10647w());
                }
                if (this.f25232r) {
                    this.f25225c.mo12112h1();
                }
                this.f25233s.addView(this.f25225c.mo10647w(), -1, -1);
            }
            if (!z && !this.f25234t) {
                mo18358a();
            }
            AdOverlayInfoParcel adOverlayInfoParcel4 = this.f25224b;
            if (adOverlayInfoParcel4.f5968s != 5) {
                mo18353N6(z3);
                if (this.f25225c.mo12118l()) {
                    mo18354O6(z3, true);
                    return;
                }
                return;
            }
            w42.m22577L6(this.f25223a, this, adOverlayInfoParcel4.f5953C, adOverlayInfoParcel4.f5975z, adOverlayInfoParcel4.f5951A, adOverlayInfoParcel4.f5952B, adOverlayInfoParcel4.f5974y, adOverlayInfoParcel4.f5954D);
            return;
        }
        throw new C4672l("Invalid activity, no window available.");
    }

    /* renamed from: N6 */
    public final void mo18353N6(boolean z) {
        int intValue = ((Integer) C4596v.m30088c().mo12227b(C2679nz.f14492Z3)).intValue();
        int i = 0;
        boolean z2 = ((Boolean) C4596v.m30088c().mo12227b(C2679nz.f14443U0)).booleanValue() || z;
        C4682v vVar = new C4682v();
        vVar.f25245d = 50;
        vVar.f25242a = true != z2 ? 0 : intValue;
        if (true != z2) {
            i = intValue;
        }
        vVar.f25243b = i;
        vVar.f25244c = intValue;
        this.f25227e = new C4683w(this.f25223a, vVar, this);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(10);
        layoutParams.addRule(true != z2 ? 9 : 11);
        mo18354O6(z, this.f25224b.f5964g);
        this.f25233s.addView(this.f25227e, layoutParams);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0018, code lost:
        r0 = (r0 = r6.f25224b).f5972w;
     */
    /* renamed from: O6 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo18354O6(boolean r7, boolean r8) {
        /*
            r6 = this;
            com.google.android.gms.internal.ads.ez r0 = com.google.android.gms.internal.ads.C2679nz.f14423S0
            com.google.android.gms.internal.ads.lz r1 = p060h4.C4596v.m30088c()
            java.lang.Object r0 = r1.mo12227b(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x0022
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r0 = r6.f25224b
            if (r0 == 0) goto L_0x0022
            g4.j r0 = r0.f5972w
            if (r0 == 0) goto L_0x0022
            boolean r0 = r0.f24524h
            if (r0 == 0) goto L_0x0022
            r0 = 1
            goto L_0x0023
        L_0x0022:
            r0 = 0
        L_0x0023:
            com.google.android.gms.internal.ads.ez r3 = com.google.android.gms.internal.ads.C2679nz.f14433T0
            com.google.android.gms.internal.ads.lz r4 = p060h4.C4596v.m30088c()
            java.lang.Object r3 = r4.mo12227b(r3)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            if (r3 == 0) goto L_0x0043
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r3 = r6.f25224b
            if (r3 == 0) goto L_0x0043
            g4.j r3 = r3.f5972w
            if (r3 == 0) goto L_0x0043
            boolean r3 = r3.f24525i
            if (r3 == 0) goto L_0x0043
            r3 = 1
            goto L_0x0044
        L_0x0043:
            r3 = 0
        L_0x0044:
            if (r7 == 0) goto L_0x005a
            if (r8 == 0) goto L_0x005a
            if (r0 == 0) goto L_0x005a
            if (r3 != 0) goto L_0x005a
            com.google.android.gms.internal.ads.le0 r7 = new com.google.android.gms.internal.ads.le0
            com.google.android.gms.internal.ads.vs0 r4 = r6.f25225c
            java.lang.String r5 = "useCustomClose"
            r7.<init>(r4, r5)
            java.lang.String r4 = "Custom close has been disabled for interstitial ads in this ad slot."
            r7.mo11984c(r4)
        L_0x005a:
            i4.w r7 = r6.f25227e
            if (r7 == 0) goto L_0x0069
            if (r3 != 0) goto L_0x0066
            if (r8 == 0) goto L_0x0065
            if (r0 != 0) goto L_0x0065
            goto L_0x0066
        L_0x0065:
            r1 = 0
        L_0x0066:
            r7.mo18367b(r1)
        L_0x0069:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p066i4.C4678r.mo18354O6(boolean, boolean):void");
    }

    /* renamed from: P6 */
    public final void mo18355P6(int i) {
        if (this.f25223a.getApplicationInfo().targetSdkVersion >= ((Integer) C4596v.m30088c().mo12227b(C2679nz.f14513b5)).intValue()) {
            if (this.f25223a.getApplicationInfo().targetSdkVersion <= ((Integer) C4596v.m30088c().mo12227b(C2679nz.f14523c5)).intValue()) {
                int i2 = Build.VERSION.SDK_INT;
                if (i2 >= ((Integer) C4596v.m30088c().mo12227b(C2679nz.f14533d5)).intValue()) {
                    if (i2 <= ((Integer) C4596v.m30088c().mo12227b(C2679nz.f14543e5)).intValue()) {
                        return;
                    }
                }
            }
        }
        try {
            this.f25223a.setRequestedOrientation(i);
        } catch (Throwable th) {
            C4409t.m29325q().mo15125s(th, "AdOverlay.setRequestedOrientation");
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x0071 A[Catch:{ l -> 0x00f5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00c4 A[Catch:{ l -> 0x00f5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x00e9 A[Catch:{ l -> 0x00f5 }] */
    /* renamed from: Q4 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo8764Q4(android.os.Bundle r9) {
        /*
            r8 = this;
            android.app.Activity r0 = r8.f25223a
            r1 = 1
            r0.requestWindowFeature(r1)
            r0 = 0
            if (r9 == 0) goto L_0x0013
            java.lang.String r2 = "com.google.android.gms.ads.internal.overlay.hasResumed"
            boolean r2 = r9.getBoolean(r2, r0)
            if (r2 == 0) goto L_0x0013
            r2 = 1
            goto L_0x0014
        L_0x0013:
            r2 = 0
        L_0x0014:
            r8.f25231i = r2
            r2 = 4
            android.app.Activity r3 = r8.f25223a     // Catch:{ l -> 0x00f5 }
            android.content.Intent r3 = r3.getIntent()     // Catch:{ l -> 0x00f5 }
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r3 = com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel.m9009I1(r3)     // Catch:{ l -> 0x00f5 }
            r8.f25224b = r3     // Catch:{ l -> 0x00f5 }
            if (r3 == 0) goto L_0x00ed
            com.google.android.gms.internal.ads.vm0 r3 = r3.f5970u     // Catch:{ l -> 0x00f5 }
            int r3 = r3.f19152c     // Catch:{ l -> 0x00f5 }
            r4 = 7500000(0x7270e0, float:1.0509738E-38)
            if (r3 <= r4) goto L_0x0030
            r8.f25222B = r2     // Catch:{ l -> 0x00f5 }
        L_0x0030:
            android.app.Activity r3 = r8.f25223a     // Catch:{ l -> 0x00f5 }
            android.content.Intent r3 = r3.getIntent()     // Catch:{ l -> 0x00f5 }
            if (r3 == 0) goto L_0x0046
            android.app.Activity r3 = r8.f25223a     // Catch:{ l -> 0x00f5 }
            android.content.Intent r3 = r3.getIntent()     // Catch:{ l -> 0x00f5 }
            java.lang.String r4 = "shouldCallOnOverlayOpened"
            boolean r3 = r3.getBooleanExtra(r4, r1)     // Catch:{ l -> 0x00f5 }
            r8.f25221A = r3     // Catch:{ l -> 0x00f5 }
        L_0x0046:
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r3 = r8.f25224b     // Catch:{ l -> 0x00f5 }
            g4.j r4 = r3.f5972w     // Catch:{ l -> 0x00f5 }
            r5 = 5
            if (r4 == 0) goto L_0x0054
            boolean r6 = r4.f24517a     // Catch:{ l -> 0x00f5 }
            r8.f25232r = r6     // Catch:{ l -> 0x00f5 }
            if (r6 == 0) goto L_0x006f
            goto L_0x005a
        L_0x0054:
            int r6 = r3.f5968s     // Catch:{ l -> 0x00f5 }
            if (r6 != r5) goto L_0x006d
            r8.f25232r = r1     // Catch:{ l -> 0x00f5 }
        L_0x005a:
            int r3 = r3.f5968s     // Catch:{ l -> 0x00f5 }
            if (r3 == r5) goto L_0x006f
            int r3 = r4.f24522f     // Catch:{ l -> 0x00f5 }
            r4 = -1
            if (r3 == r4) goto L_0x006f
            i4.q r3 = new i4.q     // Catch:{ l -> 0x00f5 }
            r4 = 0
            r3.<init>(r8, r4)     // Catch:{ l -> 0x00f5 }
            r3.mo15227b()     // Catch:{ l -> 0x00f5 }
            goto L_0x006f
        L_0x006d:
            r8.f25232r = r0     // Catch:{ l -> 0x00f5 }
        L_0x006f:
            if (r9 != 0) goto L_0x009d
            boolean r9 = r8.f25221A     // Catch:{ l -> 0x00f5 }
            if (r9 == 0) goto L_0x0087
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r9 = r8.f25224b     // Catch:{ l -> 0x00f5 }
            com.google.android.gms.internal.ads.ja1 r9 = r9.f5956F     // Catch:{ l -> 0x00f5 }
            if (r9 == 0) goto L_0x007e
            r9.mo11350a()     // Catch:{ l -> 0x00f5 }
        L_0x007e:
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r9 = r8.f25224b     // Catch:{ l -> 0x00f5 }
            i4.t r9 = r9.f5960c     // Catch:{ l -> 0x00f5 }
            if (r9 == 0) goto L_0x0087
            r9.mo8932d()     // Catch:{ l -> 0x00f5 }
        L_0x0087:
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r9 = r8.f25224b     // Catch:{ l -> 0x00f5 }
            int r3 = r9.f5968s     // Catch:{ l -> 0x00f5 }
            if (r3 == r1) goto L_0x009d
            h4.a r9 = r9.f5959b     // Catch:{ l -> 0x00f5 }
            if (r9 == 0) goto L_0x0094
            r9.onAdClicked()     // Catch:{ l -> 0x00f5 }
        L_0x0094:
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r9 = r8.f25224b     // Catch:{ l -> 0x00f5 }
            com.google.android.gms.internal.ads.qh1 r9 = r9.f5957G     // Catch:{ l -> 0x00f5 }
            if (r9 == 0) goto L_0x009d
            r9.mo9272h()     // Catch:{ l -> 0x00f5 }
        L_0x009d:
            i4.m r9 = new i4.m     // Catch:{ l -> 0x00f5 }
            android.app.Activity r3 = r8.f25223a     // Catch:{ l -> 0x00f5 }
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r4 = r8.f25224b     // Catch:{ l -> 0x00f5 }
            java.lang.String r6 = r4.f5971v     // Catch:{ l -> 0x00f5 }
            com.google.android.gms.internal.ads.vm0 r7 = r4.f5970u     // Catch:{ l -> 0x00f5 }
            java.lang.String r7 = r7.f19150a     // Catch:{ l -> 0x00f5 }
            java.lang.String r4 = r4.f5955E     // Catch:{ l -> 0x00f5 }
            r9.<init>(r3, r6, r7, r4)     // Catch:{ l -> 0x00f5 }
            r8.f25233s = r9     // Catch:{ l -> 0x00f5 }
            r3 = 1000(0x3e8, float:1.401E-42)
            r9.setId(r3)     // Catch:{ l -> 0x00f5 }
            j4.b r9 = p053g4.C4409t.m29327s()     // Catch:{ l -> 0x00f5 }
            android.app.Activity r3 = r8.f25223a     // Catch:{ l -> 0x00f5 }
            r9.mo18427i(r3)     // Catch:{ l -> 0x00f5 }
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r9 = r8.f25224b     // Catch:{ l -> 0x00f5 }
            int r3 = r9.f5968s     // Catch:{ l -> 0x00f5 }
            if (r3 == r1) goto L_0x00e9
            r4 = 2
            if (r3 == r4) goto L_0x00dc
            r9 = 3
            if (r3 == r9) goto L_0x00d8
            if (r3 != r5) goto L_0x00d0
            r8.mo18352K6(r0)     // Catch:{ l -> 0x00f5 }
            return
        L_0x00d0:
            i4.l r9 = new i4.l     // Catch:{ l -> 0x00f5 }
            java.lang.String r0 = "Could not determine ad overlay type."
            r9.<init>(r0)     // Catch:{ l -> 0x00f5 }
            throw r9     // Catch:{ l -> 0x00f5 }
        L_0x00d8:
            r8.mo18352K6(r1)     // Catch:{ l -> 0x00f5 }
            return
        L_0x00dc:
            i4.n r1 = new i4.n     // Catch:{ l -> 0x00f5 }
            com.google.android.gms.internal.ads.vs0 r9 = r9.f5961d     // Catch:{ l -> 0x00f5 }
            r1.<init>(r9)     // Catch:{ l -> 0x00f5 }
            r8.f25226d = r1     // Catch:{ l -> 0x00f5 }
            r8.mo18352K6(r0)     // Catch:{ l -> 0x00f5 }
            return
        L_0x00e9:
            r8.mo18352K6(r0)     // Catch:{ l -> 0x00f5 }
            return
        L_0x00ed:
            i4.l r9 = new i4.l     // Catch:{ l -> 0x00f5 }
            java.lang.String r0 = "Could not get info for ad overlay."
            r9.<init>(r0)     // Catch:{ l -> 0x00f5 }
            throw r9     // Catch:{ l -> 0x00f5 }
        L_0x00f5:
            r9 = move-exception
            java.lang.String r9 = r9.getMessage()
            com.google.android.gms.internal.ads.pm0.m18667g(r9)
            r8.f25222B = r2
            android.app.Activity r9 = r8.f25223a
            r9.finish()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p066i4.C4678r.mo8764Q4(android.os.Bundle):void");
    }

    /* renamed from: Q6 */
    public final void mo18356Q6(boolean z) {
        if (z) {
            this.f25233s.setBackgroundColor(0);
        } else {
            this.f25233s.setBackgroundColor(-16777216);
        }
    }

    /* renamed from: T */
    public final void mo18357T() {
        AdOverlayInfoParcel adOverlayInfoParcel = this.f25224b;
        if (adOverlayInfoParcel != null && this.f25228f) {
            mo18355P6(adOverlayInfoParcel.f5967r);
        }
        if (this.f25229g != null) {
            this.f25223a.setContentView(this.f25233s);
            this.f25238x = true;
            this.f25229g.removeAllViews();
            this.f25229g = null;
        }
        WebChromeClient.CustomViewCallback customViewCallback = this.f25230h;
        if (customViewCallback != null) {
            customViewCallback.onCustomViewHidden();
            this.f25230h = null;
        }
        this.f25228f = false;
    }

    /* renamed from: T5 */
    public final void mo15462T5() {
        this.f25222B = 2;
        this.f25223a.finish();
    }

    /* renamed from: U */
    public final void mo8765U() {
        this.f25222B = 1;
    }

    /* renamed from: Y */
    public final void mo8766Y() {
    }

    /* renamed from: Z */
    public final void mo8767Z() {
        vs0 vs0 = this.f25225c;
        if (vs0 != null) {
            try {
                this.f25233s.removeView(vs0.mo10647w());
            } catch (NullPointerException unused) {
            }
        }
        mo18351K();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo18358a() {
        this.f25225c.mo12088O0();
    }

    /* renamed from: a0 */
    public final void mo8768a0() {
        C4680t tVar;
        mo18357T();
        AdOverlayInfoParcel adOverlayInfoParcel = this.f25224b;
        if (!(adOverlayInfoParcel == null || (tVar = adOverlayInfoParcel.f5960c) == null)) {
            tVar.mo8934o3();
        }
        if (!((Boolean) C4596v.m30088c().mo12227b(C2679nz.f14474X3)).booleanValue() && this.f25225c != null && (!this.f25223a.isFinishing() || this.f25226d == null)) {
            this.f25225c.onPause();
        }
        mo18351K();
    }

    /* renamed from: b */
    public final void mo18359b() {
        this.f25233s.f25212b = true;
    }

    /* renamed from: b0 */
    public final void mo8769b0() {
        C4680t tVar;
        AdOverlayInfoParcel adOverlayInfoParcel = this.f25224b;
        if (!(adOverlayInfoParcel == null || (tVar = adOverlayInfoParcel.f5960c) == null)) {
            tVar.mo8933i5();
        }
        m30320L6(this.f25223a.getResources().getConfiguration());
        if (!((Boolean) C4596v.m30088c().mo12227b(C2679nz.f14474X3)).booleanValue()) {
            vs0 vs0 = this.f25225c;
            if (vs0 == null || vs0.mo12132q1()) {
                pm0.m18667g("The webview does not exist. Ignoring action.");
            } else {
                this.f25225c.onResume();
            }
        }
    }

    /* renamed from: c0 */
    public final void mo18360c0() {
        if (this.f25234t) {
            this.f25234t = false;
            mo18358a();
        }
    }

    /* renamed from: d */
    public final void mo18361d() {
        this.f25222B = 3;
        this.f25223a.finish();
        AdOverlayInfoParcel adOverlayInfoParcel = this.f25224b;
        if (adOverlayInfoParcel != null && adOverlayInfoParcel.f5968s == 5) {
            this.f25223a.overridePendingTransition(0, 0);
        }
    }

    /* renamed from: d0 */
    public final void mo8770d0() {
        if (((Boolean) C4596v.m30088c().mo12227b(C2679nz.f14474X3)).booleanValue() && this.f25225c != null && (!this.f25223a.isFinishing() || this.f25226d == null)) {
            this.f25225c.onPause();
        }
        mo18351K();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final void mo18362e() {
        vs0 vs0;
        C4680t tVar;
        if (!this.f25240z) {
            this.f25240z = true;
            vs0 vs02 = this.f25225c;
            if (vs02 != null) {
                this.f25233s.removeView(vs02.mo10647w());
                C4674n nVar = this.f25226d;
                if (nVar != null) {
                    this.f25225c.mo12140t1(nVar.f25216d);
                    this.f25225c.mo12119l1(false);
                    ViewGroup viewGroup = this.f25226d.f25215c;
                    View w = this.f25225c.mo10647w();
                    C4674n nVar2 = this.f25226d;
                    viewGroup.addView(w, nVar2.f25213a, nVar2.f25214b);
                    this.f25226d = null;
                } else if (this.f25223a.getApplicationContext() != null) {
                    this.f25225c.mo12140t1(this.f25223a.getApplicationContext());
                }
                this.f25225c = null;
            }
            AdOverlayInfoParcel adOverlayInfoParcel = this.f25224b;
            if (!(adOverlayInfoParcel == null || (tVar = adOverlayInfoParcel.f5960c) == null)) {
                tVar.mo8935p(this.f25222B);
            }
            AdOverlayInfoParcel adOverlayInfoParcel2 = this.f25224b;
            if (adOverlayInfoParcel2 != null && (vs0 = adOverlayInfoParcel2.f5961d) != null) {
                m30321M6(vs0.mo12124m1(), this.f25224b.f5961d.mo10647w());
            }
        }
    }

    /* renamed from: e0 */
    public final void mo8771e0() {
        if (((Boolean) C4596v.m30088c().mo12227b(C2679nz.f14474X3)).booleanValue()) {
            vs0 vs0 = this.f25225c;
            if (vs0 == null || vs0.mo12132q1()) {
                pm0.m18667g("The webview does not exist. Ignoring action.");
            } else {
                this.f25225c.onResume();
            }
        }
    }

    /* renamed from: g */
    public final void mo8772g() {
        C4680t tVar;
        AdOverlayInfoParcel adOverlayInfoParcel = this.f25224b;
        if (adOverlayInfoParcel != null && (tVar = adOverlayInfoParcel.f5960c) != null) {
            tVar.mo8931a();
        }
    }

    /* renamed from: g0 */
    public final void mo8773g0() {
        this.f25238x = true;
    }

    /* renamed from: g3 */
    public final void mo8774g3(int i, int i2, Intent intent) {
    }

    /* renamed from: k0 */
    public final boolean mo8775k0() {
        this.f25222B = 1;
        if (this.f25225c == null) {
            return true;
        }
        if (!((Boolean) C4596v.m30088c().mo12227b(C2679nz.f14290E7)).booleanValue() || !this.f25225c.canGoBack()) {
            boolean q = this.f25225c.mo12131q();
            if (!q) {
                this.f25225c.mo9081R("onbackblocked", Collections.emptyMap());
            }
            return q;
        }
        this.f25225c.goBack();
        return false;
    }

    /* renamed from: n0 */
    public final void mo8776n0(Bundle bundle) {
        bundle.putBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", this.f25231i);
    }

    /* renamed from: q */
    public final void mo18363q() {
        this.f25233s.removeView(this.f25227e);
        mo18353N6(true);
    }
}
