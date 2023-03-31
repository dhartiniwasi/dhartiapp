package com.google.android.gms.internal.ads;

import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.HashMap;
import p053g4.C4409t;
import p060h4.C4596v;
import p073j4.C4751b2;
import p073j4.C4794n1;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class oo0 extends FrameLayout implements fo0 {

    /* renamed from: A */
    private final Integer f15278A;

    /* renamed from: a */
    private final ap0 f15279a;

    /* renamed from: b */
    private final FrameLayout f15280b;

    /* renamed from: c */
    private final View f15281c;

    /* renamed from: d */
    private final c00 f15282d;

    /* renamed from: e */
    final dp0 f15283e;

    /* renamed from: f */
    private final long f15284f;

    /* renamed from: g */
    private final go0 f15285g;

    /* renamed from: h */
    private boolean f15286h;

    /* renamed from: i */
    private boolean f15287i;

    /* renamed from: r */
    private boolean f15288r;

    /* renamed from: s */
    private boolean f15289s;

    /* renamed from: t */
    private long f15290t;

    /* renamed from: u */
    private long f15291u;

    /* renamed from: v */
    private String f15292v;

    /* renamed from: w */
    private String[] f15293w;

    /* renamed from: x */
    private Bitmap f15294x;

    /* renamed from: y */
    private final ImageView f15295y;

    /* renamed from: z */
    private boolean f15296z;

    /* JADX WARNING: type inference failed for: r13v0, types: [com.google.android.gms.internal.ads.go0, android.view.View] */
    /* JADX WARNING: type inference failed for: r1v28, types: [com.google.android.gms.internal.ads.eo0] */
    /* JADX WARNING: type inference failed for: r1v29, types: [com.google.android.gms.internal.ads.tp0] */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public oo0(android.content.Context r16, com.google.android.gms.internal.ads.ap0 r17, int r18, boolean r19, com.google.android.gms.internal.ads.c00 r20, com.google.android.gms.internal.ads.zo0 r21, java.lang.Integer r22) {
        /*
            r15 = this;
            r0 = r15
            r9 = r16
            r10 = r20
            r15.<init>(r16)
            r7 = r17
            r0.f15279a = r7
            r0.f15282d = r10
            android.widget.FrameLayout r11 = new android.widget.FrameLayout
            r11.<init>(r9)
            r0.f15280b = r11
            android.widget.FrameLayout$LayoutParams r1 = new android.widget.FrameLayout$LayoutParams
            r12 = -1
            r1.<init>(r12, r12)
            r15.addView(r11, r1)
            g4.a r1 = r17.mo8466c0()
            p033d5.C4141r.m28221k(r1)
            g4.a r1 = r17.mo8466c0()
            com.google.android.gms.internal.ads.ho0 r1 = r1.f24489a
            com.google.android.gms.internal.ads.bp0 r8 = new com.google.android.gms.internal.ads.bp0
            com.google.android.gms.internal.ads.vm0 r3 = r17.mo8464b0()
            java.lang.String r4 = r17.mo8471j()
            com.google.android.gms.internal.ads.zz r6 = r17.mo8463a0()
            r1 = r8
            r2 = r16
            r5 = r20
            r1.<init>(r2, r3, r4, r5, r6)
            r1 = 2
            r2 = r18
            if (r2 != r1) goto L_0x005c
            com.google.android.gms.internal.ads.tp0 r13 = new com.google.android.gms.internal.ads.tp0
            boolean r6 = com.google.android.gms.internal.ads.ho0.m13933a(r17)
            r1 = r13
            r2 = r16
            r3 = r8
            r4 = r17
            r5 = r19
            r7 = r21
            r8 = r22
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            goto L_0x0086
        L_0x005c:
            com.google.android.gms.internal.ads.eo0 r13 = new com.google.android.gms.internal.ads.eo0
            boolean r8 = com.google.android.gms.internal.ads.ho0.m13933a(r17)
            com.google.android.gms.internal.ads.bp0 r14 = new com.google.android.gms.internal.ads.bp0
            com.google.android.gms.internal.ads.vm0 r3 = r17.mo8464b0()
            java.lang.String r4 = r17.mo8471j()
            com.google.android.gms.internal.ads.zz r6 = r17.mo8463a0()
            r1 = r14
            r2 = r16
            r5 = r20
            r1.<init>(r2, r3, r4, r5, r6)
            r1 = r13
            r3 = r17
            r4 = r19
            r5 = r8
            r6 = r21
            r7 = r14
            r8 = r22
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
        L_0x0086:
            r0.f15285g = r13
            r1 = r22
            r0.f15278A = r1
            android.view.View r1 = new android.view.View
            r1.<init>(r9)
            r0.f15281c = r1
            r2 = 0
            r1.setBackgroundColor(r2)
            android.widget.FrameLayout$LayoutParams r2 = new android.widget.FrameLayout$LayoutParams
            r3 = 17
            r2.<init>(r12, r12, r3)
            r11.addView(r13, r2)
            com.google.android.gms.internal.ads.ez r2 = com.google.android.gms.internal.ads.C2679nz.f14272D
            com.google.android.gms.internal.ads.lz r3 = p060h4.C4596v.m30088c()
            java.lang.Object r2 = r3.mo12227b(r2)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L_0x00be
            android.widget.FrameLayout$LayoutParams r2 = new android.widget.FrameLayout$LayoutParams
            r2.<init>(r12, r12)
            r11.addView(r1, r2)
            r11.bringChildToFront(r1)
        L_0x00be:
            com.google.android.gms.internal.ads.ez r1 = com.google.android.gms.internal.ads.C2679nz.f14242A
            com.google.android.gms.internal.ads.lz r2 = p060h4.C4596v.m30088c()
            java.lang.Object r1 = r2.mo12227b(r1)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L_0x00d3
            r15.mo13007s()
        L_0x00d3:
            android.widget.ImageView r1 = new android.widget.ImageView
            r1.<init>(r9)
            r0.f15295y = r1
            com.google.android.gms.internal.ads.ez r1 = com.google.android.gms.internal.ads.C2679nz.f14292F
            com.google.android.gms.internal.ads.lz r2 = p060h4.C4596v.m30088c()
            java.lang.Object r1 = r2.mo12227b(r1)
            java.lang.Long r1 = (java.lang.Long) r1
            long r1 = r1.longValue()
            r0.f15284f = r1
            com.google.android.gms.internal.ads.ez r1 = com.google.android.gms.internal.ads.C2679nz.f14262C
            com.google.android.gms.internal.ads.lz r2 = p060h4.C4596v.m30088c()
            java.lang.Object r1 = r2.mo12227b(r1)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            r0.f15289s = r1
            if (r10 == 0) goto L_0x010d
            r2 = 1
            if (r2 == r1) goto L_0x0106
            java.lang.String r1 = "0"
            goto L_0x0108
        L_0x0106:
            java.lang.String r1 = "1"
        L_0x0108:
            java.lang.String r2 = "spinner_used"
            r10.mo9000d(r2, r1)
        L_0x010d:
            com.google.android.gms.internal.ads.dp0 r1 = new com.google.android.gms.internal.ads.dp0
            r1.<init>(r15)
            r0.f15283e = r1
            r13.mo9972t(r15)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.oo0.<init>(android.content.Context, com.google.android.gms.internal.ads.ap0, int, boolean, com.google.android.gms.internal.ads.c00, com.google.android.gms.internal.ads.zo0, java.lang.Integer):void");
    }

    /* renamed from: n */
    private final void m17975n() {
        if (this.f15279a.mo8461X() != null && this.f15287i && !this.f15288r) {
            this.f15279a.mo8461X().getWindow().clearFlags(128);
            this.f15287i = false;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: o */
    public final void m17976o(String str, String... strArr) {
        HashMap hashMap = new HashMap();
        Integer q = mo13006q();
        if (q != null) {
            hashMap.put("playerId", q.toString());
        }
        hashMap.put("event", str);
        String str2 = null;
        for (String str3 : strArr) {
            if (str2 == null) {
                str2 = str3;
            } else {
                hashMap.put(str2, str3);
                str2 = null;
            }
        }
        this.f15279a.mo9081R("onVideoEvent", hashMap);
    }

    /* renamed from: p */
    private final boolean m17977p() {
        return this.f15295y.getParent() != null;
    }

    /* renamed from: A */
    public final void mo12990A() {
        go0 go0 = this.f15285g;
        if (go0 != null) {
            go0.mo9970r();
        }
    }

    /* renamed from: B */
    public final void mo12991B(int i) {
        go0 go0 = this.f15285g;
        if (go0 != null) {
            go0.mo9971s(i);
        }
    }

    /* renamed from: C */
    public final void mo12992C(MotionEvent motionEvent) {
        go0 go0 = this.f15285g;
        if (go0 != null) {
            go0.dispatchTouchEvent(motionEvent);
        }
    }

    /* renamed from: D */
    public final void mo12993D(int i) {
        go0 go0 = this.f15285g;
        if (go0 != null) {
            go0.mo10591x(i);
        }
    }

    /* renamed from: E */
    public final void mo12994E(int i) {
        go0 go0 = this.f15285g;
        if (go0 != null) {
            go0.mo10592y(i);
        }
    }

    /* renamed from: G0 */
    public final void mo10220G0(String str, String str2) {
        m17976o("exception", "what", "ExoPlayerAdapter exception", "extra", str2);
    }

    /* renamed from: H0 */
    public final void mo10221H0(int i, int i2) {
        if (this.f15289s) {
            C2344ez ezVar = C2679nz.f14282E;
            int max = Math.max(i / ((Integer) C4596v.m30088c().mo12227b(ezVar)).intValue(), 1);
            int max2 = Math.max(i2 / ((Integer) C4596v.m30088c().mo12227b(ezVar)).intValue(), 1);
            Bitmap bitmap = this.f15294x;
            if (bitmap == null || bitmap.getWidth() != max || this.f15294x.getHeight() != max2) {
                this.f15294x = Bitmap.createBitmap(max, max2, Bitmap.Config.ARGB_8888);
                this.f15296z = false;
            }
        }
    }

    /* renamed from: T */
    public final void mo10222T() {
        go0 go0 = this.f15285g;
        if (go0 != null && this.f15291u == 0) {
            m17976o("canplaythrough", "duration", String.valueOf(((float) go0.mo9950j()) / 1000.0f), "videoWidth", String.valueOf(this.f15285g.mo9952l()), "videoHeight", String.valueOf(this.f15285g.mo9951k()));
        }
    }

    /* renamed from: U */
    public final void mo10223U() {
        this.f15283e.mo9644b();
        C4751b2.f25403i.post(new lo0(this));
    }

    /* renamed from: V */
    public final void mo10224V() {
        if (this.f15296z && this.f15294x != null && !m17977p()) {
            this.f15295y.setImageBitmap(this.f15294x);
            this.f15295y.invalidate();
            this.f15280b.addView(this.f15295y, new FrameLayout.LayoutParams(-1, -1));
            this.f15280b.bringChildToFront(this.f15295y);
        }
        this.f15283e.mo9643a();
        this.f15291u = this.f15290t;
        C4751b2.f25403i.post(new mo0(this));
    }

    /* renamed from: X */
    public final void mo10225X() {
        if (this.f15286h && m17977p()) {
            this.f15280b.removeView(this.f15295y);
        }
        if (this.f15285g != null && this.f15294x != null) {
            long b = C4409t.m29310b().mo18371b();
            if (this.f15285g.getBitmap(this.f15294x) != null) {
                this.f15296z = true;
            }
            long b2 = C4409t.m29310b().mo18371b() - b;
            if (C4794n1.m30695m()) {
                C4794n1.m30693k("Spinner frame grab took " + b2 + "ms");
            }
            if (b2 > this.f15284f) {
                pm0.m18667g("Spinner frame grab crossed jank threshold! Suspending spinner.");
                this.f15289s = false;
                this.f15294x = null;
                c00 c00 = this.f15282d;
                if (c00 != null) {
                    c00.mo9000d("spinner_jank", Long.toString(b2));
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo10226a() {
        if (((Boolean) C4596v.m30088c().mo12227b(C2679nz.f14304G1)).booleanValue()) {
            this.f15283e.mo9644b();
        }
        if (this.f15279a.mo8461X() != null && !this.f15287i) {
            boolean z = (this.f15279a.mo8461X().getWindow().getAttributes().flags & 128) != 0;
            this.f15288r = z;
            if (!z) {
                this.f15279a.mo8461X().getWindow().addFlags(128);
                this.f15287i = true;
            }
        }
        this.f15286h = true;
    }

    /* renamed from: b */
    public final void mo10227b() {
        m17976o("pause", new String[0]);
        m17975n();
        this.f15286h = false;
    }

    /* renamed from: c */
    public final void mo10228c() {
        this.f15281c.setVisibility(4);
        C4751b2.f25403i.post(new ko0(this));
    }

    /* renamed from: d */
    public final void mo12995d(int i) {
        go0 go0 = this.f15285g;
        if (go0 != null) {
            go0.mo10593z(i);
        }
    }

    /* renamed from: e */
    public final void mo12996e(int i) {
        go0 go0 = this.f15285g;
        if (go0 != null) {
            go0.mo10588A(i);
        }
    }

    /* renamed from: f */
    public final void mo12997f(int i) {
        if (((Boolean) C4596v.m30088c().mo12227b(C2679nz.f14272D)).booleanValue()) {
            this.f15280b.setBackgroundColor(i);
            this.f15281c.setBackgroundColor(i);
        }
    }

    public final void finalize() throws Throwable {
        try {
            this.f15283e.mo9643a();
            go0 go0 = this.f15285g;
            if (go0 != null) {
                dn0.f8329e.execute(new io0(go0));
            }
        } finally {
            super.finalize();
        }
    }

    /* renamed from: g */
    public final void mo12999g(int i) {
        go0 go0 = this.f15285g;
        if (go0 != null) {
            go0.mo10589a(i);
        }
    }

    /* renamed from: h */
    public final void mo13000h(String str, String[] strArr) {
        this.f15292v = str;
        this.f15293w = strArr;
    }

    /* renamed from: i */
    public final void mo13001i(int i, int i2, int i3, int i4) {
        if (C4794n1.m30695m()) {
            C4794n1.m30693k("Set video bounds to x:" + i + ";y:" + i2 + ";w:" + i3 + ";h:" + i4);
        }
        if (i3 != 0 && i4 != 0) {
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i3, i4);
            layoutParams.setMargins(i, i2, 0, 0);
            this.f15280b.setLayoutParams(layoutParams);
            requestLayout();
        }
    }

    /* renamed from: j */
    public final void mo13002j(float f) {
        go0 go0 = this.f15285g;
        if (go0 != null) {
            go0.f10012b.mo10243e(f);
            go0.mo9946a0();
        }
    }

    /* renamed from: k */
    public final void mo10229k(String str, String str2) {
        m17976o("error", "what", str, "extra", str2);
    }

    /* renamed from: l */
    public final void mo13003l(float f, float f2) {
        go0 go0 = this.f15285g;
        if (go0 != null) {
            go0.mo9976w(f, f2);
        }
    }

    /* renamed from: m */
    public final void mo13004m() {
        go0 go0 = this.f15285g;
        if (go0 != null) {
            go0.f10012b.mo10242d(false);
            go0.mo9946a0();
        }
    }

    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (z) {
            this.f15283e.mo9644b();
        } else {
            this.f15283e.mo9643a();
            this.f15291u = this.f15290t;
        }
        C4751b2.f25403i.post(new jo0(this, z));
    }

    public final void onWindowVisibilityChanged(int i) {
        boolean z;
        super.onWindowVisibilityChanged(i);
        if (i == 0) {
            this.f15283e.mo9644b();
            z = true;
        } else {
            this.f15283e.mo9643a();
            this.f15291u = this.f15290t;
            z = false;
        }
        C4751b2.f25403i.post(new no0(this, z));
    }

    /* renamed from: q */
    public final Integer mo13006q() {
        go0 go0 = this.f15285g;
        return go0 != null ? go0.f10013c : this.f15278A;
    }

    /* renamed from: s */
    public final void mo13007s() {
        go0 go0 = this.f15285g;
        if (go0 != null) {
            TextView textView = new TextView(go0.getContext());
            textView.setText("AdMob - ".concat(this.f15285g.mo9968p()));
            textView.setTextColor(-65536);
            textView.setBackgroundColor(-256);
            this.f15280b.addView(textView, new FrameLayout.LayoutParams(-2, -2, 17));
            this.f15280b.bringChildToFront(textView);
        }
    }

    /* renamed from: t */
    public final void mo13008t() {
        this.f15283e.mo9643a();
        go0 go0 = this.f15285g;
        if (go0 != null) {
            go0.mo9975v();
        }
        m17975n();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u */
    public final /* synthetic */ void mo13009u() {
        m17976o("firstFrameRendered", new String[0]);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: v */
    public final /* synthetic */ void mo13010v(boolean z) {
        m17976o("windowFocusChanged", "hasWindowFocus", String.valueOf(z));
    }

    /* renamed from: w */
    public final void mo13011w() {
        if (this.f15285g != null) {
            if (!TextUtils.isEmpty(this.f15292v)) {
                this.f15285g.mo10590g(this.f15292v, this.f15293w);
            } else {
                m17976o("no_src", new String[0]);
            }
        }
    }

    /* renamed from: x */
    public final void mo13012x() {
        go0 go0 = this.f15285g;
        if (go0 != null) {
            go0.f10012b.mo10242d(true);
            go0.mo9946a0();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: y */
    public final void mo13013y() {
        go0 go0 = this.f15285g;
        if (go0 != null) {
            long h = (long) go0.mo9948h();
            if (this.f15290t != h && h > 0) {
                float f = ((float) h) / 1000.0f;
                if (((Boolean) C4596v.m30088c().mo12227b(C2679nz.f14274D1)).booleanValue()) {
                    m17976o("timeupdate", "time", String.valueOf(f), "totalBytes", String.valueOf(this.f15285g.mo9955o()), "qoeCachedBytes", String.valueOf(this.f15285g.mo9953m()), "qoeLoadedBytes", String.valueOf(this.f15285g.mo9954n()), "droppedFrames", String.valueOf(this.f15285g.mo9949i()), "reportTime", String.valueOf(C4409t.m29310b().mo18370a()));
                } else {
                    m17976o("timeupdate", "time", String.valueOf(f));
                }
                this.f15290t = h;
            }
        }
    }

    /* renamed from: z */
    public final void mo13014z() {
        go0 go0 = this.f15285g;
        if (go0 != null) {
            go0.mo9969q();
        }
    }

    public final void zza() {
        if (((Boolean) C4596v.m30088c().mo12227b(C2679nz.f14304G1)).booleanValue()) {
            this.f15283e.mo9643a();
        }
        m17976o("ended", new String[0]);
        m17975n();
    }
}
