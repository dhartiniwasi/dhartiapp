package com.onesignal;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.webkit.WebView;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import com.facebook.ads.AdError;
import com.onesignal.C8338d3;
import com.onesignal.C8517o;
import com.onesignal.C8551p4;
import p117q.C5331a;

/* renamed from: com.onesignal.y */
/* compiled from: InAppMessageView */
class C8651y {

    /* renamed from: v */
    private static final int f36123v = Color.parseColor("#00000000");

    /* renamed from: w */
    private static final int f36124w = Color.parseColor("#BB000000");

    /* renamed from: x */
    private static final int f36125x = C8313b3.m46320b(4);

    /* renamed from: a */
    private PopupWindow f36126a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public Activity f36127b;

    /* renamed from: c */
    private final Handler f36128c = new Handler();

    /* renamed from: d */
    private int f36129d;

    /* renamed from: e */
    private int f36130e;

    /* renamed from: f */
    private int f36131f = C8313b3.m46320b(24);

    /* renamed from: g */
    private int f36132g = C8313b3.m46320b(24);

    /* renamed from: h */
    private int f36133h = C8313b3.m46320b(24);

    /* renamed from: i */
    private int f36134i = C8313b3.m46320b(24);

    /* renamed from: j */
    private double f36135j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public boolean f36136k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public boolean f36137l = false;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public boolean f36138m = false;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public boolean f36139n = false;

    /* renamed from: o */
    private C8662y0 f36140o;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public C8551p4.C8565m f36141p;
    /* access modifiers changed from: private */

    /* renamed from: q */
    public WebView f36142q;
    /* access modifiers changed from: private */

    /* renamed from: r */
    public RelativeLayout f36143r;
    /* access modifiers changed from: private */

    /* renamed from: s */
    public C8517o f36144s;
    /* access modifiers changed from: private */

    /* renamed from: t */
    public C8661j f36145t;
    /* access modifiers changed from: private */

    /* renamed from: u */
    public Runnable f36146u;

    /* renamed from: com.onesignal.y$a */
    /* compiled from: InAppMessageView */
    class C8652a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ int f36147a;

        C8652a(int i) {
            this.f36147a = i;
        }

        public void run() {
            if (C8651y.this.f36142q == null) {
                C8338d3.m46594z1(C8338d3.C8384r0.WARN, "WebView height update skipped, new height will be used once it is displayed.");
                return;
            }
            ViewGroup.LayoutParams layoutParams = C8651y.this.f36142q.getLayoutParams();
            if (layoutParams == null) {
                C8338d3.m46594z1(C8338d3.C8384r0.WARN, "WebView height update skipped because of null layoutParams, new height will be used once it is displayed.");
                return;
            }
            layoutParams.height = this.f36147a;
            C8651y.this.f36142q.setLayoutParams(layoutParams);
            if (C8651y.this.f36144s != null) {
                C8517o b = C8651y.this.f36144s;
                C8651y yVar = C8651y.this;
                b.mo28000i(yVar.m47843F(this.f36147a, yVar.f36141p, C8651y.this.f36139n));
            }
        }
    }

    /* renamed from: com.onesignal.y$b */
    /* compiled from: InAppMessageView */
    class C8653b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ RelativeLayout.LayoutParams f36149a;

        /* renamed from: b */
        final /* synthetic */ RelativeLayout.LayoutParams f36150b;

        /* renamed from: c */
        final /* synthetic */ C8517o.C8520c f36151c;

        /* renamed from: d */
        final /* synthetic */ C8551p4.C8565m f36152d;

        C8653b(RelativeLayout.LayoutParams layoutParams, RelativeLayout.LayoutParams layoutParams2, C8517o.C8520c cVar, C8551p4.C8565m mVar) {
            this.f36149a = layoutParams;
            this.f36150b = layoutParams2;
            this.f36151c = cVar;
            this.f36152d = mVar;
        }

        public void run() {
            if (C8651y.this.f36142q != null) {
                C8651y.this.f36142q.setLayoutParams(this.f36149a);
                Context applicationContext = C8651y.this.f36127b.getApplicationContext();
                C8651y.this.m47851S(applicationContext, this.f36150b, this.f36151c);
                C8651y.this.m47852T(applicationContext);
                C8651y yVar = C8651y.this;
                yVar.m47845H(yVar.f36143r);
                if (C8651y.this.f36145t != null) {
                    C8651y yVar2 = C8651y.this;
                    yVar2.m47880z(this.f36152d, yVar2.f36144s, C8651y.this.f36143r);
                }
                C8651y.this.m47854Y();
            }
        }
    }

    /* renamed from: com.onesignal.y$c */
    /* compiled from: InAppMessageView */
    class C8654c implements C8517o.C8519b {
        C8654c() {
        }

        /* renamed from: a */
        public void mo28002a() {
            boolean unused = C8651y.this.f36138m = true;
        }

        /* renamed from: b */
        public void mo28003b() {
            boolean unused = C8651y.this.f36138m = false;
        }

        public void onDismiss() {
            if (C8651y.this.f36145t != null) {
                C8651y.this.f36145t.mo28082c();
            }
            C8651y.this.m47848L((C8551p4.C8564l) null);
        }
    }

    /* renamed from: com.onesignal.y$d */
    /* compiled from: InAppMessageView */
    class C8655d implements Runnable {
        C8655d() {
        }

        public void run() {
            if (C8651y.this.f36145t != null) {
                C8651y.this.f36145t.mo28082c();
            }
            if (C8651y.this.f36127b != null) {
                C8651y.this.mo28305K((C8551p4.C8564l) null);
                Runnable unused = C8651y.this.f36146u = null;
                return;
            }
            boolean unused2 = C8651y.this.f36137l = true;
        }
    }

    /* renamed from: com.onesignal.y$e */
    /* compiled from: InAppMessageView */
    class C8656e implements Runnable {

        /* renamed from: a */
        final /* synthetic */ Activity f36156a;

        C8656e(Activity activity) {
            this.f36156a = activity;
        }

        public void run() {
            C8651y.this.m47846I(this.f36156a);
        }
    }

    /* renamed from: com.onesignal.y$f */
    /* compiled from: InAppMessageView */
    class C8657f implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C8551p4.C8564l f36158a;

        C8657f(C8551p4.C8564l lVar) {
            this.f36158a = lVar;
        }

        public void run() {
            if (!C8651y.this.f36136k || C8651y.this.f36143r == null) {
                C8651y.this.m47840C();
                C8551p4.C8564l lVar = this.f36158a;
                if (lVar != null) {
                    lVar.mo28072a();
                    return;
                }
                return;
            }
            C8651y yVar = C8651y.this;
            yVar.m47876v(yVar.f36143r, this.f36158a);
        }
    }

    /* renamed from: com.onesignal.y$g */
    /* compiled from: InAppMessageView */
    class C8658g implements Animation.AnimationListener {

        /* renamed from: a */
        final /* synthetic */ C5331a f36160a;

        C8658g(C5331a aVar) {
            this.f36160a = aVar;
        }

        public void onAnimationEnd(Animation animation) {
            if (Build.VERSION.SDK_INT == 23) {
                this.f36160a.setCardElevation((float) C8313b3.m46320b(5));
            }
            if (C8651y.this.f36145t != null) {
                C8651y.this.f36145t.mo28081b();
            }
        }

        public void onAnimationRepeat(Animation animation) {
        }

        public void onAnimationStart(Animation animation) {
        }
    }

    /* renamed from: com.onesignal.y$h */
    /* compiled from: InAppMessageView */
    class C8659h extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ C8551p4.C8564l f36162a;

        C8659h(C8551p4.C8564l lVar) {
            this.f36162a = lVar;
        }

        public void onAnimationEnd(Animator animator) {
            C8651y.this.m47840C();
            C8551p4.C8564l lVar = this.f36162a;
            if (lVar != null) {
                lVar.mo28072a();
            }
        }
    }

    /* renamed from: com.onesignal.y$i */
    /* compiled from: InAppMessageView */
    static /* synthetic */ class C8660i {

        /* renamed from: a */
        static final /* synthetic */ int[] f36164a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                com.onesignal.p4$m[] r0 = com.onesignal.C8551p4.C8565m.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f36164a = r0
                com.onesignal.p4$m r1 = com.onesignal.C8551p4.C8565m.TOP_BANNER     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f36164a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.onesignal.p4$m r1 = com.onesignal.C8551p4.C8565m.BOTTOM_BANNER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f36164a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.onesignal.p4$m r1 = com.onesignal.C8551p4.C8565m.CENTER_MODAL     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f36164a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.onesignal.p4$m r1 = com.onesignal.C8551p4.C8565m.FULL_SCREEN     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.onesignal.C8651y.C8660i.<clinit>():void");
        }
    }

    /* renamed from: com.onesignal.y$j */
    /* compiled from: InAppMessageView */
    interface C8661j {
        /* renamed from: a */
        void mo28080a();

        /* renamed from: b */
        void mo28081b();

        /* renamed from: c */
        void mo28082c();
    }

    C8651y(WebView webView, C8662y0 y0Var, boolean z) {
        this.f36142q = webView;
        this.f36141p = y0Var.mo28326c();
        this.f36130e = y0Var.mo28327d();
        this.f36129d = -1;
        this.f36135j = y0Var.mo28325b() == null ? 0.0d : y0Var.mo28325b().doubleValue();
        this.f36136k = !this.f36141p.mo28084a();
        this.f36139n = z;
        this.f36140o = y0Var;
        m47850Q(y0Var);
    }

    /* renamed from: A */
    private void m47839A(View view, int i, Animation.AnimationListener animationListener) {
        C8420f3.m46699a(view, (float) ((-i) - this.f36133h), 0.0f, AdError.NETWORK_ERROR_CODE, new C8456h3(0.1d, 8.0d), animationListener).start();
    }

    /* access modifiers changed from: private */
    /* renamed from: C */
    public void m47840C() {
        mo28308P();
        C8661j jVar = this.f36145t;
        if (jVar != null) {
            jVar.mo28080a();
        }
    }

    /* renamed from: D */
    private Animation.AnimationListener m47841D(C5331a aVar) {
        return new C8658g(aVar);
    }

    /* renamed from: E */
    private C5331a m47842E(Context context) {
        C5331a aVar = new C5331a(context);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, this.f36141p == C8551p4.C8565m.FULL_SCREEN ? -1 : -2);
        layoutParams.addRule(13);
        aVar.setLayoutParams(layoutParams);
        if (Build.VERSION.SDK_INT == 23) {
            aVar.setCardElevation(0.0f);
        } else {
            aVar.setCardElevation((float) C8313b3.m46320b(5));
        }
        aVar.setRadius((float) C8313b3.m46320b(8));
        aVar.setClipChildren(false);
        aVar.setClipToPadding(false);
        aVar.setPreventCornerOverlap(false);
        aVar.setCardBackgroundColor(0);
        return aVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: F */
    public C8517o.C8520c m47843F(int i, C8551p4.C8565m mVar, boolean z) {
        C8517o.C8520c cVar = new C8517o.C8520c();
        cVar.f35786d = this.f36132g;
        cVar.f35784b = this.f36133h;
        cVar.f35790h = z;
        cVar.f35788f = i;
        cVar.f35787e = m47849N();
        int i2 = C8660i.f36164a[mVar.ordinal()];
        int i3 = 1;
        if (i2 == 1) {
            cVar.f35785c = this.f36133h - f36125x;
        } else if (i2 != 2) {
            if (i2 != 3) {
                if (i2 == 4) {
                    i = m47849N() - (this.f36134i + this.f36133h);
                    cVar.f35788f = i;
                }
            }
            int N = (m47849N() / 2) - (i / 2);
            cVar.f35785c = f36125x + N;
            cVar.f35784b = N;
            cVar.f35783a = N;
        } else {
            cVar.f35783a = m47849N() - i;
            cVar.f35785c = this.f36134i + f36125x;
        }
        if (mVar == C8551p4.C8565m.TOP_BANNER) {
            i3 = 0;
        }
        cVar.f35789g = i3;
        return cVar;
    }

    /* renamed from: G */
    private RelativeLayout.LayoutParams m47844G() {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(this.f36129d, -1);
        int i = C8660i.f36164a[this.f36141p.ordinal()];
        if (i == 1) {
            layoutParams.addRule(10);
            layoutParams.addRule(14);
        } else if (i == 2) {
            layoutParams.addRule(12);
            layoutParams.addRule(14);
        } else if (i == 3 || i == 4) {
            layoutParams.addRule(13);
        }
        return layoutParams;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x003f, code lost:
        if (r5 != 4) goto L_0x0048;
     */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0051  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0054  */
    /* renamed from: H */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void m47845H(android.widget.RelativeLayout r5) {
        /*
            r4 = this;
            android.widget.PopupWindow r0 = new android.widget.PopupWindow
            boolean r1 = r4.f36136k
            r2 = -1
            if (r1 == 0) goto L_0x0009
            r3 = -1
            goto L_0x000b
        L_0x0009:
            int r3 = r4.f36129d
        L_0x000b:
            if (r1 == 0) goto L_0x000e
            goto L_0x000f
        L_0x000e:
            r2 = -2
        L_0x000f:
            r1 = 1
            r0.<init>(r5, r3, r2, r1)
            r4.f36126a = r0
            android.graphics.drawable.ColorDrawable r5 = new android.graphics.drawable.ColorDrawable
            r2 = 0
            r5.<init>(r2)
            r0.setBackgroundDrawable(r5)
            android.widget.PopupWindow r5 = r4.f36126a
            r5.setTouchable(r1)
            android.widget.PopupWindow r5 = r4.f36126a
            r5.setClippingEnabled(r2)
            boolean r5 = r4.f36136k
            if (r5 != 0) goto L_0x0048
            int[] r5 = com.onesignal.C8651y.C8660i.f36164a
            com.onesignal.p4$m r0 = r4.f36141p
            int r0 = r0.ordinal()
            r5 = r5[r0]
            if (r5 == r1) goto L_0x0045
            r0 = 2
            if (r5 == r0) goto L_0x0042
            r0 = 3
            if (r5 == r0) goto L_0x0049
            r0 = 4
            if (r5 == r0) goto L_0x0049
            goto L_0x0048
        L_0x0042:
            r1 = 81
            goto L_0x0049
        L_0x0045:
            r1 = 49
            goto L_0x0049
        L_0x0048:
            r1 = 0
        L_0x0049:
            com.onesignal.y0 r5 = r4.f36140o
            boolean r5 = r5.mo28330g()
            if (r5 == 0) goto L_0x0054
            r5 = 1000(0x3e8, float:1.401E-42)
            goto L_0x0056
        L_0x0054:
            r5 = 1003(0x3eb, float:1.406E-42)
        L_0x0056:
            android.widget.PopupWindow r0 = r4.f36126a
            androidx.core.widget.C0983i.m4445b(r0, r5)
            android.widget.PopupWindow r5 = r4.f36126a
            android.app.Activity r0 = r4.f36127b
            android.view.Window r0 = r0.getWindow()
            android.view.View r0 = r0.getDecorView()
            android.view.View r0 = r0.getRootView()
            r5.showAtLocation(r0, r1, r2, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onesignal.C8651y.m47845H(android.widget.RelativeLayout):void");
    }

    /* access modifiers changed from: private */
    /* renamed from: I */
    public void m47846I(Activity activity) {
        if (!C8313b3.m46329k(activity) || this.f36143r != null) {
            new Handler().postDelayed(new C8656e(activity), 200);
        } else {
            mo28311W(activity);
        }
    }

    /* renamed from: J */
    private void m47847J() {
        this.f36143r = null;
        this.f36144s = null;
        this.f36142q = null;
    }

    /* access modifiers changed from: private */
    /* renamed from: L */
    public void m47848L(C8551p4.C8564l lVar) {
        OSUtils.m46186S(new C8657f(lVar), 600);
    }

    /* renamed from: N */
    private int m47849N() {
        return C8313b3.m46324f(this.f36127b);
    }

    /* renamed from: Q */
    private void m47850Q(C8662y0 y0Var) {
        int i = 0;
        this.f36133h = y0Var.mo28328e() ? C8313b3.m46320b(24) : 0;
        this.f36134i = y0Var.mo28328e() ? C8313b3.m46320b(24) : 0;
        this.f36131f = y0Var.mo28329f() ? C8313b3.m46320b(24) : 0;
        if (y0Var.mo28329f()) {
            i = C8313b3.m46320b(24);
        }
        this.f36132g = i;
    }

    /* access modifiers changed from: private */
    /* renamed from: S */
    public void m47851S(Context context, RelativeLayout.LayoutParams layoutParams, C8517o.C8520c cVar) {
        C8517o oVar = new C8517o(context);
        this.f36144s = oVar;
        if (layoutParams != null) {
            oVar.setLayoutParams(layoutParams);
        }
        this.f36144s.mo28000i(cVar);
        this.f36144s.mo27999h(new C8654c());
        if (this.f36142q.getParent() != null) {
            ((ViewGroup) this.f36142q.getParent()).removeAllViews();
        }
        C5331a E = m47842E(context);
        E.setTag("IN_APP_MESSAGE_CARD_VIEW_TAG");
        E.addView(this.f36142q);
        this.f36144s.setPadding(this.f36131f, this.f36133h, this.f36132g, this.f36134i);
        this.f36144s.setClipChildren(false);
        this.f36144s.setClipToPadding(false);
        this.f36144s.addView(E);
    }

    /* access modifiers changed from: private */
    /* renamed from: T */
    public void m47852T(Context context) {
        RelativeLayout relativeLayout = new RelativeLayout(context);
        this.f36143r = relativeLayout;
        relativeLayout.setBackgroundDrawable(new ColorDrawable(0));
        this.f36143r.setClipChildren(false);
        this.f36143r.setClipToPadding(false);
        this.f36143r.addView(this.f36144s);
    }

    /* renamed from: V */
    private void m47853V(C8551p4.C8565m mVar, RelativeLayout.LayoutParams layoutParams, RelativeLayout.LayoutParams layoutParams2, C8517o.C8520c cVar) {
        OSUtils.m46187T(new C8653b(layoutParams, layoutParams2, cVar, mVar));
    }

    /* access modifiers changed from: private */
    /* renamed from: Y */
    public void m47854Y() {
        if (this.f36135j > 0.0d && this.f36146u == null) {
            C8655d dVar = new C8655d();
            this.f36146u = dVar;
            this.f36128c.postDelayed(dVar, ((long) this.f36135j) * 1000);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: v */
    public void m47876v(View view, C8551p4.C8564l lVar) {
        View view2 = view;
        m47877w(view2, 400, f36124w, f36123v, new C8659h(lVar)).start();
    }

    /* renamed from: w */
    private ValueAnimator m47877w(View view, int i, int i2, int i3, Animator.AnimatorListener animatorListener) {
        return C8420f3.m46700b(view, i, i2, i3, animatorListener);
    }

    /* renamed from: x */
    private void m47878x(View view, int i, Animation.AnimationListener animationListener) {
        C8420f3.m46699a(view, (float) (i + this.f36134i), 0.0f, AdError.NETWORK_ERROR_CODE, new C8456h3(0.1d, 8.0d), animationListener).start();
    }

    /* renamed from: y */
    private void m47879y(View view, View view2, Animation.AnimationListener animationListener, Animator.AnimatorListener animatorListener) {
        Animation c = C8420f3.m46701c(view, AdError.NETWORK_ERROR_CODE, new C8456h3(0.1d, 8.0d), animationListener);
        ValueAnimator w = m47877w(view2, 400, f36123v, f36124w, animatorListener);
        c.start();
        w.start();
    }

    /* access modifiers changed from: private */
    /* renamed from: z */
    public void m47880z(C8551p4.C8565m mVar, View view, View view2) {
        C5331a aVar = (C5331a) view.findViewWithTag("IN_APP_MESSAGE_CARD_VIEW_TAG");
        Animation.AnimationListener D = m47841D(aVar);
        int i = C8660i.f36164a[mVar.ordinal()];
        if (i == 1) {
            m47839A(aVar, this.f36142q.getHeight(), D);
        } else if (i == 2) {
            m47878x(aVar, this.f36142q.getHeight(), D);
        } else if (i == 3 || i == 4) {
            m47879y(view, view2, D, (Animator.AnimatorListener) null);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: B */
    public void mo28304B() {
        if (this.f36137l) {
            this.f36137l = false;
            m47848L((C8551p4.C8564l) null);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: K */
    public void mo28305K(C8551p4.C8564l lVar) {
        C8517o oVar = this.f36144s;
        if (oVar == null) {
            C8338d3.m46496b(C8338d3.C8384r0.ERROR, "No host presenter to trigger dismiss animation, counting as dismissed already", new Throwable());
            m47847J();
            if (lVar != null) {
                lVar.mo28072a();
                return;
            }
            return;
        }
        oVar.mo27998g();
        m47848L(lVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: M */
    public C8551p4.C8565m mo28306M() {
        return this.f36141p;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: O */
    public boolean mo28307O() {
        return this.f36138m;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: P */
    public void mo28308P() {
        C8338d3.m46594z1(C8338d3.C8384r0.DEBUG, "InAppMessageView removing views");
        Runnable runnable = this.f36146u;
        if (runnable != null) {
            this.f36128c.removeCallbacks(runnable);
            this.f36146u = null;
        }
        C8517o oVar = this.f36144s;
        if (oVar != null) {
            oVar.removeAllViews();
        }
        PopupWindow popupWindow = this.f36126a;
        if (popupWindow != null) {
            popupWindow.dismiss();
        }
        m47847J();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: R */
    public void mo28309R(C8661j jVar) {
        this.f36145t = jVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: U */
    public void mo28310U(WebView webView) {
        this.f36142q = webView;
        webView.setBackgroundColor(0);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: W */
    public void mo28311W(Activity activity) {
        this.f36127b = activity;
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, this.f36130e);
        layoutParams.addRule(13);
        RelativeLayout.LayoutParams G = this.f36136k ? m47844G() : null;
        C8551p4.C8565m mVar = this.f36141p;
        m47853V(mVar, layoutParams, G, m47843F(this.f36130e, mVar, this.f36139n));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: X */
    public void mo28312X(Activity activity) {
        m47846I(activity);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Z */
    public void mo28313Z(int i) {
        this.f36130e = i;
        OSUtils.m46187T(new C8652a(i));
    }

    public String toString() {
        return "InAppMessageView{currentActivity=" + this.f36127b + ", pageWidth=" + this.f36129d + ", pageHeight=" + this.f36130e + ", displayDuration=" + this.f36135j + ", hasBackground=" + this.f36136k + ", shouldDismissWhenActive=" + this.f36137l + ", isDragging=" + this.f36138m + ", disableDragDismiss=" + this.f36139n + ", displayLocation=" + this.f36141p + ", webView=" + this.f36142q + '}';
    }
}
