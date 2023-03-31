package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.app.KeyguardManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.PowerManager;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.WindowManager;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import p053g4.C4409t;
import p060h4.C4596v;
import p073j4.C4750b1;
import p073j4.C4751b2;

/* renamed from: com.google.android.gms.internal.ads.ur */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class C2931ur implements View.OnAttachStateChangeListener, ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, Application.ActivityLifecycleCallbacks {

    /* renamed from: x */
    private static final long f18672x = ((Long) C4596v.m30088c().mo12227b(C2679nz.f14549f1)).longValue();

    /* renamed from: a */
    private final Context f18673a;

    /* renamed from: b */
    private Application f18674b;

    /* renamed from: c */
    private final WindowManager f18675c;

    /* renamed from: d */
    private final PowerManager f18676d;

    /* renamed from: e */
    private final KeyguardManager f18677e;

    /* renamed from: f */
    BroadcastReceiver f18678f;

    /* renamed from: g */
    private WeakReference f18679g;

    /* renamed from: h */
    final WeakReference f18680h;

    /* renamed from: i */
    private C2449hs f18681i;

    /* renamed from: r */
    private final C4750b1 f18682r = new C4750b1(f18672x);

    /* renamed from: s */
    private boolean f18683s = false;

    /* renamed from: t */
    private int f18684t = -1;

    /* renamed from: u */
    private final HashSet f18685u = new HashSet();

    /* renamed from: v */
    private final DisplayMetrics f18686v;

    /* renamed from: w */
    private final Rect f18687w;

    public C2931ur(Context context, View view) {
        Context applicationContext = context.getApplicationContext();
        this.f18673a = applicationContext;
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        this.f18675c = windowManager;
        this.f18676d = (PowerManager) applicationContext.getSystemService("power");
        this.f18677e = (KeyguardManager) context.getSystemService("keyguard");
        if (applicationContext instanceof Application) {
            Application application = (Application) applicationContext;
            this.f18674b = application;
            this.f18681i = new C2449hs(application, this);
        }
        this.f18686v = context.getResources().getDisplayMetrics();
        Rect rect = new Rect();
        this.f18687w = rect;
        rect.right = windowManager.getDefaultDisplay().getWidth();
        rect.bottom = windowManager.getDefaultDisplay().getHeight();
        WeakReference weakReference = this.f18680h;
        View view2 = weakReference != null ? (View) weakReference.get() : null;
        if (view2 != null) {
            view2.removeOnAttachStateChangeListener(this);
            m21795m(view2);
        }
        this.f18680h = new WeakReference(view);
        if (view != null) {
            if (view.isAttachedToWindow()) {
                m21794l(view);
            }
            view.addOnAttachStateChangeListener(this);
        }
    }

    /* renamed from: h */
    private final int m21790h(int i) {
        return (int) (((float) i) / this.f18686v.density);
    }

    /* renamed from: i */
    private final void m21791i(Activity activity, int i) {
        Window window;
        if (this.f18680h != null && (window = activity.getWindow()) != null) {
            View peekDecorView = window.peekDecorView();
            View view = (View) this.f18680h.get();
            if (view != null && peekDecorView != null && view.getRootView() == peekDecorView.getRootView()) {
                this.f18684t = i;
            }
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0115, code lost:
        if (r11 == 0) goto L_0x012d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x012b, code lost:
        if (r11 == 0) goto L_0x012d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0143  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x0199 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x019a  */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void m21792j(int r33) {
        /*
            r32 = this;
            r1 = r32
            r2 = r33
            java.util.HashSet r0 = r1.f18685u
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x000d
            return
        L_0x000d:
            java.lang.ref.WeakReference r0 = r1.f18680h
            if (r0 != 0) goto L_0x0012
            return
        L_0x0012:
            java.lang.Object r0 = r0.get()
            r3 = r0
            android.view.View r3 = (android.view.View) r3
            android.graphics.Rect r4 = new android.graphics.Rect
            r4.<init>()
            android.graphics.Rect r5 = new android.graphics.Rect
            r5.<init>()
            android.graphics.Rect r6 = new android.graphics.Rect
            r6.<init>()
            android.graphics.Rect r7 = new android.graphics.Rect
            r7.<init>()
            r0 = 2
            int[] r8 = new int[r0]
            int[] r0 = new int[r0]
            r9 = 0
            r10 = 1
            r11 = 0
            if (r3 == 0) goto L_0x0069
            boolean r12 = r3.getGlobalVisibleRect(r5)
            boolean r13 = r3.getLocalVisibleRect(r6)
            r3.getHitRect(r7)
            r3.getLocationOnScreen(r8)     // Catch:{ Exception -> 0x0049 }
            r3.getLocationInWindow(r0)     // Catch:{ Exception -> 0x0049 }
            goto L_0x004f
        L_0x0049:
            r0 = move-exception
            java.lang.String r14 = "Failure getting view location."
            com.google.android.gms.internal.ads.pm0.m18665e(r14, r0)
        L_0x004f:
            r0 = r8[r11]
            r4.left = r0
            r8 = r8[r10]
            r4.top = r8
            int r8 = r3.getWidth()
            int r0 = r0 + r8
            r4.right = r0
            int r0 = r4.top
            int r8 = r3.getHeight()
            int r0 = r0 + r8
            r4.bottom = r0
            r8 = r3
            goto L_0x006c
        L_0x0069:
            r8 = r9
            r12 = 0
            r13 = 0
        L_0x006c:
            com.google.android.gms.internal.ads.ez r0 = com.google.android.gms.internal.ads.C2679nz.f14579i1
            com.google.android.gms.internal.ads.lz r14 = p060h4.C4596v.m30088c()
            java.lang.Object r0 = r14.mo12227b(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x00bd
            if (r8 == 0) goto L_0x00bd
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ Exception -> 0x00ae }
            r0.<init>()     // Catch:{ Exception -> 0x00ae }
            android.view.ViewParent r14 = r8.getParent()     // Catch:{ Exception -> 0x00ae }
        L_0x0089:
            boolean r15 = r14 instanceof android.view.View     // Catch:{ Exception -> 0x00ae }
            if (r15 == 0) goto L_0x00c1
            r15 = r14
            android.view.View r15 = (android.view.View) r15     // Catch:{ Exception -> 0x00ae }
            android.graphics.Rect r11 = new android.graphics.Rect     // Catch:{ Exception -> 0x00ae }
            r11.<init>()     // Catch:{ Exception -> 0x00ae }
            boolean r17 = r15.isScrollContainer()     // Catch:{ Exception -> 0x00ae }
            if (r17 == 0) goto L_0x00a8
            boolean r15 = r15.getGlobalVisibleRect(r11)     // Catch:{ Exception -> 0x00ae }
            if (r15 == 0) goto L_0x00a8
            android.graphics.Rect r11 = r1.mo14575a(r11)     // Catch:{ Exception -> 0x00ae }
            r0.add(r11)     // Catch:{ Exception -> 0x00ae }
        L_0x00a8:
            android.view.ViewParent r14 = r14.getParent()     // Catch:{ Exception -> 0x00ae }
            r11 = 0
            goto L_0x0089
        L_0x00ae:
            r0 = move-exception
            com.google.android.gms.internal.ads.xl0 r11 = p053g4.C4409t.m29325q()
            java.lang.String r14 = "PositionWatcher.getParentScrollViewRects"
            r11.mo15126t(r0, r14)
            java.util.List r0 = java.util.Collections.emptyList()
            goto L_0x00c1
        L_0x00bd:
            java.util.List r0 = java.util.Collections.emptyList()
        L_0x00c1:
            r31 = r0
            r0 = 8
            if (r8 == 0) goto L_0x00cc
            int r11 = r8.getWindowVisibility()
            goto L_0x00ce
        L_0x00cc:
            r11 = 8
        L_0x00ce:
            int r14 = r1.f18684t
            r15 = -1
            if (r14 == r15) goto L_0x00d4
            r11 = r14
        L_0x00d4:
            p053g4.C4409t.m29326r()
            long r26 = p073j4.C4751b2.m30599Q(r8)
            com.google.android.gms.internal.ads.ez r14 = com.google.android.gms.internal.ads.C2679nz.f14626m8
            com.google.android.gms.internal.ads.lz r15 = p060h4.C4596v.m30088c()
            java.lang.Object r14 = r15.mo12227b(r14)
            java.lang.Boolean r14 = (java.lang.Boolean) r14
            boolean r14 = r14.booleanValue()
            if (r14 == 0) goto L_0x0118
            if (r3 == 0) goto L_0x0130
            p053g4.C4409t.m29326r()
            android.os.PowerManager r3 = r1.f18676d
            android.app.KeyguardManager r14 = r1.f18677e
            boolean r3 = p073j4.C4751b2.m30621p(r8, r3, r14)
            if (r3 == 0) goto L_0x0130
            if (r12 == 0) goto L_0x0130
            if (r13 == 0) goto L_0x0130
            com.google.android.gms.internal.ads.ez r3 = com.google.android.gms.internal.ads.C2679nz.f14656p8
            com.google.android.gms.internal.ads.lz r14 = p060h4.C4596v.m30088c()
            java.lang.Object r3 = r14.mo12227b(r3)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            long r14 = (long) r3
            int r3 = (r26 > r14 ? 1 : (r26 == r14 ? 0 : -1))
            if (r3 < 0) goto L_0x0130
            if (r11 != 0) goto L_0x0130
            goto L_0x012d
        L_0x0118:
            if (r3 == 0) goto L_0x0130
            p053g4.C4409t.m29326r()
            android.os.PowerManager r3 = r1.f18676d
            android.app.KeyguardManager r14 = r1.f18677e
            boolean r3 = p073j4.C4751b2.m30621p(r8, r3, r14)
            if (r3 == 0) goto L_0x0130
            if (r12 == 0) goto L_0x0130
            if (r13 == 0) goto L_0x0130
            if (r11 != 0) goto L_0x0130
        L_0x012d:
            r3 = 1
            r11 = 0
            goto L_0x0131
        L_0x0130:
            r3 = 0
        L_0x0131:
            com.google.android.gms.internal.ads.ez r14 = com.google.android.gms.internal.ads.C2679nz.f14676r8
            com.google.android.gms.internal.ads.lz r15 = p060h4.C4596v.m30088c()
            java.lang.Object r14 = r15.mo12227b(r14)
            java.lang.Boolean r14 = (java.lang.Boolean) r14
            boolean r14 = r14.booleanValue()
            if (r14 == 0) goto L_0x018a
            p053g4.C4409t.m29326r()
            android.os.PowerManager r14 = r1.f18676d
            android.app.KeyguardManager r15 = r1.f18677e
            boolean r14 = p073j4.C4751b2.m30621p(r8, r14, r15)
            if (r10 == r14) goto L_0x0152
            r14 = 0
            goto L_0x0154
        L_0x0152:
            r14 = 64
        L_0x0154:
            if (r10 == r12) goto L_0x0158
            r15 = 0
            goto L_0x015a
        L_0x0158:
            r15 = 8
        L_0x015a:
            r14 = r14 | r15
            if (r10 == r13) goto L_0x015f
            r15 = 0
            goto L_0x0161
        L_0x015f:
            r15 = 16
        L_0x0161:
            r14 = r14 | r15
            if (r11 != 0) goto L_0x0167
            r11 = 128(0x80, float:1.794E-43)
            goto L_0x0168
        L_0x0167:
            r11 = 0
        L_0x0168:
            r11 = r11 | r14
            com.google.android.gms.internal.ads.ez r14 = com.google.android.gms.internal.ads.C2679nz.f14656p8
            com.google.android.gms.internal.ads.lz r15 = p060h4.C4596v.m30088c()
            java.lang.Object r14 = r15.mo12227b(r14)
            java.lang.Integer r14 = (java.lang.Integer) r14
            int r14 = r14.intValue()
            long r14 = (long) r14
            int r17 = (r26 > r14 ? 1 : (r26 == r14 ? 0 : -1))
            if (r17 < 0) goto L_0x0181
            r14 = 32
            goto L_0x0182
        L_0x0181:
            r14 = 0
        L_0x0182:
            p053g4.C4409t.m29326r()
            r11 = r11 | r14
            r11 = r11 | r3
            p073j4.C4751b2.m30611f(r8, r11, r9)
        L_0x018a:
            if (r2 != r10) goto L_0x019a
            j4.b1 r9 = r1.f18682r
            boolean r9 = r9.mo18430b()
            if (r9 != 0) goto L_0x019a
            boolean r9 = r1.f18683s
            if (r3 == r9) goto L_0x0199
            goto L_0x019a
        L_0x0199:
            return
        L_0x019a:
            if (r3 != 0) goto L_0x01a4
            boolean r9 = r1.f18683s
            if (r9 != 0) goto L_0x01a4
            if (r2 == r10) goto L_0x01a3
            goto L_0x01a4
        L_0x01a3:
            return
        L_0x01a4:
            com.google.android.gms.internal.ads.sr r2 = new com.google.android.gms.internal.ads.sr
            i5.e r9 = p053g4.C4409t.m29310b()
            long r17 = r9.mo18371b()
            android.os.PowerManager r9 = r1.f18676d
            boolean r9 = r9.isScreenOn()
            if (r8 == 0) goto L_0x01bd
            boolean r11 = r8.isAttachedToWindow()
            if (r11 == 0) goto L_0x01bd
            goto L_0x01be
        L_0x01bd:
            r10 = 0
        L_0x01be:
            if (r8 == 0) goto L_0x01c7
            int r0 = r8.getWindowVisibility()
            r19 = r0
            goto L_0x01c9
        L_0x01c7:
            r19 = 8
        L_0x01c9:
            android.graphics.Rect r0 = r1.f18687w
            android.graphics.Rect r20 = r1.mo14575a(r0)
            android.graphics.Rect r21 = r1.mo14575a(r4)
            android.graphics.Rect r22 = r1.mo14575a(r5)
            android.graphics.Rect r24 = r1.mo14575a(r6)
            android.graphics.Rect r28 = r1.mo14575a(r7)
            android.util.DisplayMetrics r0 = r1.f18686v
            float r0 = r0.density
            r29 = r0
            r14 = r2
            r15 = r17
            r17 = r9
            r18 = r10
            r23 = r12
            r25 = r13
            r30 = r3
            r14.<init>(r15, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r28, r29, r30, r31)
            java.util.HashSet r0 = r1.f18685u
            java.util.Iterator r0 = r0.iterator()
        L_0x01fb:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L_0x020b
            java.lang.Object r4 = r0.next()
            com.google.android.gms.internal.ads.tr r4 = (com.google.android.gms.internal.ads.C2894tr) r4
            r4.mo8416N(r2)
            goto L_0x01fb
        L_0x020b:
            r1.f18683s = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C2931ur.m21792j(int):void");
    }

    /* renamed from: k */
    private final void m21793k() {
        C4751b2.f25403i.post(new C2783qr(this));
    }

    /* renamed from: l */
    private final void m21794l(View view) {
        ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            this.f18679g = new WeakReference(viewTreeObserver);
            viewTreeObserver.addOnScrollChangedListener(this);
            viewTreeObserver.addOnGlobalLayoutListener(this);
        }
        if (this.f18678f == null) {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.SCREEN_ON");
            intentFilter.addAction("android.intent.action.SCREEN_OFF");
            intentFilter.addAction("android.intent.action.USER_PRESENT");
            this.f18678f = new C2820rr(this);
            C4409t.m29332x().mo18467c(this.f18673a, this.f18678f, intentFilter);
        }
        Application application = this.f18674b;
        if (application != null) {
            try {
                application.registerActivityLifecycleCallbacks(this.f18681i);
            } catch (Exception e) {
                pm0.m18665e("Error registering activity lifecycle callbacks.", e);
            }
        }
    }

    /* renamed from: m */
    private final void m21795m(View view) {
        try {
            WeakReference weakReference = this.f18679g;
            if (weakReference != null) {
                ViewTreeObserver viewTreeObserver = (ViewTreeObserver) weakReference.get();
                if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
                    viewTreeObserver.removeOnScrollChangedListener(this);
                    viewTreeObserver.removeGlobalOnLayoutListener(this);
                }
                this.f18679g = null;
            }
        } catch (Exception e) {
            pm0.m18665e("Error while unregistering listeners from the last ViewTreeObserver.", e);
        }
        try {
            ViewTreeObserver viewTreeObserver2 = view.getViewTreeObserver();
            if (viewTreeObserver2.isAlive()) {
                viewTreeObserver2.removeOnScrollChangedListener(this);
                viewTreeObserver2.removeGlobalOnLayoutListener(this);
            }
        } catch (Exception e2) {
            pm0.m18665e("Error while unregistering listeners from the ViewTreeObserver.", e2);
        }
        if (this.f18678f != null) {
            try {
                C4409t.m29332x().mo18468d(this.f18673a, this.f18678f);
            } catch (IllegalStateException e3) {
                pm0.m18665e("Failed trying to unregister the receiver", e3);
            } catch (Exception e4) {
                C4409t.m29325q().mo15126t(e4, "ActiveViewUnit.stopScreenStatusMonitoring");
            }
            this.f18678f = null;
        }
        Application application = this.f18674b;
        if (application != null) {
            try {
                application.unregisterActivityLifecycleCallbacks(this.f18681i);
            } catch (Exception e5) {
                pm0.m18665e("Error registering activity lifecycle callbacks.", e5);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final Rect mo14575a(Rect rect) {
        return new Rect(m21790h(rect.left), m21790h(rect.top), m21790h(rect.right), m21790h(rect.bottom));
    }

    /* renamed from: c */
    public final void mo14576c(C2894tr trVar) {
        this.f18685u.add(trVar);
        m21792j(3);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final /* synthetic */ void mo14577d() {
        m21792j(3);
    }

    /* renamed from: e */
    public final void mo14578e(C2894tr trVar) {
        this.f18685u.remove(trVar);
    }

    /* renamed from: f */
    public final void mo14579f() {
        this.f18682r.mo18429a(f18672x);
    }

    /* renamed from: g */
    public final void mo14580g(long j) {
        this.f18682r.mo18429a(j);
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
        m21791i(activity, 0);
        m21792j(3);
        m21793k();
    }

    public final void onActivityDestroyed(Activity activity) {
        m21792j(3);
        m21793k();
    }

    public final void onActivityPaused(Activity activity) {
        m21791i(activity, 4);
        m21792j(3);
        m21793k();
    }

    public final void onActivityResumed(Activity activity) {
        m21791i(activity, 0);
        m21792j(3);
        m21793k();
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        m21792j(3);
        m21793k();
    }

    public final void onActivityStarted(Activity activity) {
        m21791i(activity, 0);
        m21792j(3);
        m21793k();
    }

    public final void onActivityStopped(Activity activity) {
        m21792j(3);
        m21793k();
    }

    public final void onGlobalLayout() {
        m21792j(2);
        m21793k();
    }

    public final void onScrollChanged() {
        m21792j(1);
    }

    public final void onViewAttachedToWindow(View view) {
        this.f18684t = -1;
        m21794l(view);
        m21792j(3);
    }

    public final void onViewDetachedFromWindow(View view) {
        this.f18684t = -1;
        m21792j(3);
        m21793k();
        m21795m(view);
    }
}
