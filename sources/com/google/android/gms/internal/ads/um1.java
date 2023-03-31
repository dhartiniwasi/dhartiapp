package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.BitmapFactory;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.text.TextUtils;
import android.util.Base64;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;
import p053g4.C4409t;
import p088l5.C4954a;
import p088l5.C4956b;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class um1 extends u20 implements ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, un1 {

    /* renamed from: v */
    public static final ua3 f18613v = ua3.m21511z("2011", "1009", "3010");

    /* renamed from: a */
    private final String f18614a;

    /* renamed from: b */
    private Map f18615b = new HashMap();

    /* renamed from: c */
    private FrameLayout f18616c;

    /* renamed from: d */
    private FrameLayout f18617d;

    /* renamed from: e */
    private final mf3 f18618e;

    /* renamed from: f */
    private View f18619f;

    /* renamed from: g */
    private final int f18620g;

    /* renamed from: h */
    private sl1 f18621h;

    /* renamed from: i */
    private C2931ur f18622i;

    /* renamed from: r */
    private C4954a f18623r = null;

    /* renamed from: s */
    private o20 f18624s;

    /* renamed from: t */
    private boolean f18625t;

    /* renamed from: u */
    private boolean f18626u = false;

    public um1(FrameLayout frameLayout, FrameLayout frameLayout2, int i) {
        this.f18616c = frameLayout;
        this.f18617d = frameLayout2;
        this.f18620g = 223104000;
        String canonicalName = frameLayout.getClass().getCanonicalName();
        String str = "3012";
        if ("com.google.android.gms.ads.formats.NativeContentAdView".equals(canonicalName)) {
            str = "1007";
        } else if ("com.google.android.gms.ads.formats.NativeAppInstallAdView".equals(canonicalName)) {
            str = "2009";
        } else {
            "com.google.android.gms.ads.formats.UnifiedNativeAdView".equals(canonicalName);
        }
        this.f18614a = str;
        C4409t.m29334z();
        qn0.m19299a(frameLayout, this);
        C4409t.m29334z();
        qn0.m19300b(frameLayout, this);
        this.f18618e = dn0.f8329e;
        this.f18622i = new C2931ur(this.f18616c.getContext(), this.f18616c);
        frameLayout.setOnTouchListener(this);
        frameLayout.setOnClickListener(this);
    }

    /* renamed from: J6 */
    private final synchronized void m21706J6(String str) {
        DisplayMetrics displayMetrics;
        FrameLayout frameLayout = new FrameLayout(this.f18617d.getContext());
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        Context context = this.f18617d.getContext();
        frameLayout.setClickable(false);
        frameLayout.setFocusable(false);
        if (!TextUtils.isEmpty(str)) {
            if (context.getApplicationContext() != null) {
                context = context.getApplicationContext();
            }
            Resources resources = context.getResources();
            if (!(resources == null || (displayMetrics = resources.getDisplayMetrics()) == null)) {
                try {
                    byte[] decode = Base64.decode(str, 0);
                    BitmapDrawable bitmapDrawable = new BitmapDrawable(BitmapFactory.decodeByteArray(decode, 0, decode.length));
                    bitmapDrawable.setTargetDensity(displayMetrics.densityDpi);
                    Shader.TileMode tileMode = Shader.TileMode.REPEAT;
                    bitmapDrawable.setTileModeXY(tileMode, tileMode);
                    frameLayout.setBackground(bitmapDrawable);
                } catch (IllegalArgumentException e) {
                    pm0.m18668h("Encountered invalid base64 watermark.", e);
                }
            }
        }
        this.f18617d.addView(frameLayout);
    }

    /* renamed from: g */
    private final synchronized void m21707g() {
        this.f18618e.execute(new tm1(this));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0040, code lost:
        return;
     */
    /* renamed from: B0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo14084B0(java.lang.String r2, android.view.View r3, boolean r4) {
        /*
            r1 = this;
            monitor-enter(r1)
            boolean r4 = r1.f18626u     // Catch:{ all -> 0x0041 }
            if (r4 == 0) goto L_0x0007
            monitor-exit(r1)
            return
        L_0x0007:
            if (r3 != 0) goto L_0x0010
            java.util.Map r3 = r1.f18615b     // Catch:{ all -> 0x0041 }
            r3.remove(r2)     // Catch:{ all -> 0x0041 }
            monitor-exit(r1)
            return
        L_0x0010:
            java.util.Map r4 = r1.f18615b     // Catch:{ all -> 0x0041 }
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference     // Catch:{ all -> 0x0041 }
            r0.<init>(r3)     // Catch:{ all -> 0x0041 }
            r4.put(r2, r0)     // Catch:{ all -> 0x0041 }
            java.lang.String r4 = "1098"
            boolean r4 = r4.equals(r2)     // Catch:{ all -> 0x0041 }
            if (r4 != 0) goto L_0x003f
            java.lang.String r4 = "3011"
            boolean r2 = r4.equals(r2)     // Catch:{ all -> 0x0041 }
            if (r2 == 0) goto L_0x002b
            goto L_0x003f
        L_0x002b:
            int r2 = r1.f18620g     // Catch:{ all -> 0x0041 }
            boolean r2 = p073j4.C4829z0.m30855i(r2)     // Catch:{ all -> 0x0041 }
            if (r2 == 0) goto L_0x0036
            r3.setOnTouchListener(r1)     // Catch:{ all -> 0x0041 }
        L_0x0036:
            r2 = 1
            r3.setClickable(r2)     // Catch:{ all -> 0x0041 }
            r3.setOnClickListener(r1)     // Catch:{ all -> 0x0041 }
            monitor-exit(r1)
            return
        L_0x003f:
            monitor-exit(r1)
            return
        L_0x0041:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.um1.mo14084B0(java.lang.String, android.view.View, boolean):void");
    }

    /* renamed from: D */
    public final void mo14188D(C4954a aVar) {
        onTouch(this.f18616c, (MotionEvent) C4956b.m31384P0(aVar));
    }

    /* renamed from: L3 */
    public final synchronized void mo14189L3(o20 o20) {
        if (!this.f18626u) {
            this.f18625t = true;
            this.f18624s = o20;
            sl1 sl1 = this.f18621h;
            if (sl1 != null) {
                sl1.mo14045C().mo14534b(o20);
            }
        }
    }

    /* renamed from: O */
    public final synchronized View mo14085O(String str) {
        if (this.f18626u) {
            return null;
        }
        WeakReference weakReference = (WeakReference) this.f18615b.get(str);
        if (weakReference == null) {
            return null;
        }
        return (View) weakReference.get();
    }

    /* renamed from: T */
    public final /* synthetic */ View mo14086T() {
        return this.f18616c;
    }

    /* renamed from: U */
    public final FrameLayout mo14087U() {
        return this.f18617d;
    }

    /* renamed from: V */
    public final C2931ur mo14088V() {
        return this.f18622i;
    }

    /* renamed from: W */
    public final C4954a mo14089W() {
        return this.f18623r;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x006e, code lost:
        return;
     */
    /* renamed from: W4 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo14190W4(p088l5.C4954a r2) {
        /*
            r1 = this;
            monitor-enter(r1)
            boolean r0 = r1.f18626u     // Catch:{ all -> 0x006f }
            if (r0 == 0) goto L_0x0007
            monitor-exit(r1)
            return
        L_0x0007:
            java.lang.Object r2 = p088l5.C4956b.m31384P0(r2)     // Catch:{ all -> 0x006f }
            boolean r0 = r2 instanceof com.google.android.gms.internal.ads.sl1     // Catch:{ all -> 0x006f }
            if (r0 != 0) goto L_0x0016
            java.lang.String r2 = "Not an instance of native engine. This is most likely a transient error"
            com.google.android.gms.internal.ads.pm0.m18667g(r2)     // Catch:{ all -> 0x006f }
            monitor-exit(r1)
            return
        L_0x0016:
            com.google.android.gms.internal.ads.sl1 r0 = r1.f18621h     // Catch:{ all -> 0x006f }
            if (r0 == 0) goto L_0x001d
            r0.mo14072s(r1)     // Catch:{ all -> 0x006f }
        L_0x001d:
            r1.m21707g()     // Catch:{ all -> 0x006f }
            com.google.android.gms.internal.ads.sl1 r2 = (com.google.android.gms.internal.ads.sl1) r2     // Catch:{ all -> 0x006f }
            r1.f18621h = r2     // Catch:{ all -> 0x006f }
            r2.mo14071r(r1)     // Catch:{ all -> 0x006f }
            com.google.android.gms.internal.ads.sl1 r2 = r1.f18621h     // Catch:{ all -> 0x006f }
            android.widget.FrameLayout r0 = r1.f18616c     // Catch:{ all -> 0x006f }
            r2.mo14063j(r0)     // Catch:{ all -> 0x006f }
            com.google.android.gms.internal.ads.sl1 r2 = r1.f18621h     // Catch:{ all -> 0x006f }
            android.widget.FrameLayout r0 = r1.f18617d     // Catch:{ all -> 0x006f }
            r2.mo14049J(r0)     // Catch:{ all -> 0x006f }
            boolean r2 = r1.f18625t     // Catch:{ all -> 0x006f }
            if (r2 == 0) goto L_0x0044
            com.google.android.gms.internal.ads.sl1 r2 = r1.f18621h     // Catch:{ all -> 0x006f }
            com.google.android.gms.internal.ads.ul1 r2 = r2.mo14045C()     // Catch:{ all -> 0x006f }
            com.google.android.gms.internal.ads.o20 r0 = r1.f18624s     // Catch:{ all -> 0x006f }
            r2.mo14534b(r0)     // Catch:{ all -> 0x006f }
        L_0x0044:
            com.google.android.gms.internal.ads.ez r2 = com.google.android.gms.internal.ads.C2679nz.f14521c3     // Catch:{ all -> 0x006f }
            com.google.android.gms.internal.ads.lz r0 = p060h4.C4596v.m30088c()     // Catch:{ all -> 0x006f }
            java.lang.Object r2 = r0.mo12227b(r2)     // Catch:{ all -> 0x006f }
            java.lang.Boolean r2 = (java.lang.Boolean) r2     // Catch:{ all -> 0x006f }
            boolean r2 = r2.booleanValue()     // Catch:{ all -> 0x006f }
            if (r2 == 0) goto L_0x006d
            com.google.android.gms.internal.ads.sl1 r2 = r1.f18621h     // Catch:{ all -> 0x006f }
            java.lang.String r2 = r2.mo14046E()     // Catch:{ all -> 0x006f }
            boolean r2 = android.text.TextUtils.isEmpty(r2)     // Catch:{ all -> 0x006f }
            if (r2 != 0) goto L_0x006d
            com.google.android.gms.internal.ads.sl1 r2 = r1.f18621h     // Catch:{ all -> 0x006f }
            java.lang.String r2 = r2.mo14046E()     // Catch:{ all -> 0x006f }
            r1.m21706J6(r2)     // Catch:{ all -> 0x006f }
            monitor-exit(r1)
            return
        L_0x006d:
            monitor-exit(r1)
            return
        L_0x006f:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.um1.mo14190W4(l5.a):void");
    }

    /* renamed from: X */
    public final synchronized String mo14090X() {
        return this.f18614a;
    }

    /* renamed from: Y */
    public final synchronized JSONObject mo14091Y() {
        sl1 sl1 = this.f18621h;
        if (sl1 == null) {
            return null;
        }
        return sl1.mo14047G(this.f18616c, mo14092Z(), mo14095c0());
    }

    /* renamed from: Z */
    public final synchronized Map mo14092Z() {
        return this.f18615b;
    }

    /* renamed from: a0 */
    public final synchronized Map mo14093a0() {
        return null;
    }

    /* renamed from: a6 */
    public final synchronized void mo14191a6(C4954a aVar, int i) {
    }

    /* renamed from: b0 */
    public final synchronized JSONObject mo14094b0() {
        sl1 sl1 = this.f18621h;
        if (sl1 == null) {
            return null;
        }
        return sl1.mo14048H(this.f18616c, mo14092Z(), mo14095c0());
    }

    /* renamed from: c0 */
    public final synchronized Map mo14095c0() {
        return this.f18615b;
    }

    /* renamed from: e */
    public final synchronized void mo14192e() {
        if (!this.f18626u) {
            sl1 sl1 = this.f18621h;
            if (sl1 != null) {
                sl1.mo14072s(this);
                this.f18621h = null;
            }
            this.f18615b.clear();
            this.f18616c.removeAllViews();
            this.f18617d.removeAllViews();
            this.f18615b = null;
            this.f18616c = null;
            this.f18617d = null;
            this.f18619f = null;
            this.f18622i = null;
            this.f18626u = true;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e0 */
    public final /* synthetic */ void mo14539e0() {
        if (this.f18619f == null) {
            View view = new View(this.f18616c.getContext());
            this.f18619f = view;
            view.setLayoutParams(new FrameLayout.LayoutParams(-1, 0));
        }
        if (this.f18616c != this.f18619f.getParent()) {
            this.f18616c.addView(this.f18619f);
        }
    }

    /* renamed from: g6 */
    public final synchronized void mo14193g6(C4954a aVar) {
        if (!this.f18626u) {
            this.f18623r = aVar;
        }
    }

    /* renamed from: i */
    public final synchronized C4954a mo14194i(String str) {
        return C4956b.m31385o3(mo14085O(str));
    }

    /* renamed from: i2 */
    public final synchronized void mo14195i2(C4954a aVar) {
        this.f18621h.mo14066m((View) C4956b.m31384P0(aVar));
    }

    public final synchronized void onClick(View view) {
        sl1 sl1 = this.f18621h;
        if (sl1 != null) {
            sl1.mo14050K();
            this.f18621h.mo14058S(view, this.f18616c, mo14092Z(), mo14095c0(), false);
        }
    }

    public final synchronized void onGlobalLayout() {
        sl1 sl1 = this.f18621h;
        if (sl1 != null) {
            FrameLayout frameLayout = this.f18616c;
            sl1.mo14056Q(frameLayout, mo14092Z(), mo14095c0(), sl1.m20448w(frameLayout));
        }
    }

    public final synchronized void onScrollChanged() {
        sl1 sl1 = this.f18621h;
        if (sl1 != null) {
            FrameLayout frameLayout = this.f18616c;
            sl1.mo14056Q(frameLayout, mo14092Z(), mo14095c0(), sl1.m20448w(frameLayout));
        }
    }

    public final synchronized boolean onTouch(View view, MotionEvent motionEvent) {
        sl1 sl1 = this.f18621h;
        if (sl1 != null) {
            sl1.mo14064k(view, motionEvent, this.f18616c);
        }
        return false;
    }

    /* renamed from: v4 */
    public final synchronized void mo14196v4(String str, C4954a aVar) {
        mo14084B0(str, (View) C4956b.m31384P0(aVar), true);
    }
}
