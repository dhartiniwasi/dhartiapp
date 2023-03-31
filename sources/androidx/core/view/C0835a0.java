package androidx.core.view;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.ContentInfo;
import android.view.Display;
import android.view.KeyEvent;
import android.view.OnReceiveContentListener;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeProvider;
import androidx.core.view.C0832a;
import androidx.core.view.C0922k0;
import androidx.core.view.accessibility.C0862c;
import androidx.core.view.accessibility.C0873f;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import p124r.C5426g;
import p138t.C5493d;

/* renamed from: androidx.core.view.a0 */
/* compiled from: ViewCompat */
public class C0835a0 {

    /* renamed from: a */
    private static final AtomicInteger f2447a = new AtomicInteger(1);

    /* renamed from: b */
    private static Field f2448b;

    /* renamed from: c */
    private static boolean f2449c;

    /* renamed from: d */
    private static Field f2450d;

    /* renamed from: e */
    private static boolean f2451e;

    /* renamed from: f */
    private static WeakHashMap<View, String> f2452f;

    /* renamed from: g */
    private static WeakHashMap<View, C0909g0> f2453g = null;

    /* renamed from: h */
    private static Field f2454h;

    /* renamed from: i */
    private static boolean f2455i = false;

    /* renamed from: j */
    private static ThreadLocal<Rect> f2456j;

    /* renamed from: k */
    private static final int[] f2457k = {C5493d.f27883b, C5493d.f27885c, C5493d.f27900n, C5493d.f27911y, C5493d.f27856B, C5493d.f27857C, C5493d.f27858D, C5493d.f27859E, C5493d.f27860F, C5493d.f27861G, C5493d.f27887d, C5493d.f27889e, C5493d.f27891f, C5493d.f27893g, C5493d.f27894h, C5493d.f27895i, C5493d.f27896j, C5493d.f27897k, C5493d.f27898l, C5493d.f27899m, C5493d.f27901o, C5493d.f27902p, C5493d.f27903q, C5493d.f27904r, C5493d.f27905s, C5493d.f27906t, C5493d.f27907u, C5493d.f27908v, C5493d.f27909w, C5493d.f27910x, C5493d.f27912z, C5493d.f27855A};

    /* renamed from: l */
    private static final C0955w f2458l = C0958z.f2629a;

    /* renamed from: m */
    private static final C0840e f2459m = new C0840e();

    /* renamed from: androidx.core.view.a0$a */
    /* compiled from: ViewCompat */
    class C0836a extends C0841f<Boolean> {
        C0836a(int i, Class cls, int i2) {
            super(i, cls, i2);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: i */
        public Boolean mo3246d(View view) {
            return Boolean.valueOf(C0852p.m3895d(view));
        }

        /* access modifiers changed from: package-private */
        /* renamed from: j */
        public void mo3247e(View view, Boolean bool) {
            C0852p.m3900i(view, bool.booleanValue());
        }

        /* access modifiers changed from: package-private */
        /* renamed from: k */
        public boolean mo3248h(Boolean bool, Boolean bool2) {
            return !mo3266a(bool, bool2);
        }
    }

    /* renamed from: androidx.core.view.a0$b */
    /* compiled from: ViewCompat */
    class C0837b extends C0841f<CharSequence> {
        C0837b(int i, Class cls, int i2, int i3) {
            super(i, cls, i2, i3);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: i */
        public CharSequence mo3246d(View view) {
            return C0852p.m3893b(view);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: j */
        public void mo3247e(View view, CharSequence charSequence) {
            C0852p.m3899h(view, charSequence);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: k */
        public boolean mo3248h(CharSequence charSequence, CharSequence charSequence2) {
            return !TextUtils.equals(charSequence, charSequence2);
        }
    }

    /* renamed from: androidx.core.view.a0$c */
    /* compiled from: ViewCompat */
    class C0838c extends C0841f<CharSequence> {
        C0838c(int i, Class cls, int i2, int i3) {
            super(i, cls, i2, i3);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: i */
        public CharSequence mo3246d(View view) {
            return C0854r.m3905a(view);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: j */
        public void mo3247e(View view, CharSequence charSequence) {
            C0854r.m3906b(view, charSequence);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: k */
        public boolean mo3248h(CharSequence charSequence, CharSequence charSequence2) {
            return !TextUtils.equals(charSequence, charSequence2);
        }
    }

    /* renamed from: androidx.core.view.a0$d */
    /* compiled from: ViewCompat */
    class C0839d extends C0841f<Boolean> {
        C0839d(int i, Class cls, int i2) {
            super(i, cls, i2);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: i */
        public Boolean mo3246d(View view) {
            return Boolean.valueOf(C0852p.m3894c(view));
        }

        /* access modifiers changed from: package-private */
        /* renamed from: j */
        public void mo3247e(View view, Boolean bool) {
            C0852p.m3898g(view, bool.booleanValue());
        }

        /* access modifiers changed from: package-private */
        /* renamed from: k */
        public boolean mo3248h(Boolean bool, Boolean bool2) {
            return !mo3266a(bool, bool2);
        }
    }

    /* renamed from: androidx.core.view.a0$e */
    /* compiled from: ViewCompat */
    static class C0840e implements ViewTreeObserver.OnGlobalLayoutListener, View.OnAttachStateChangeListener {

        /* renamed from: a */
        private final WeakHashMap<View, Boolean> f2460a = new WeakHashMap<>();

        C0840e() {
        }

        /* renamed from: b */
        private void m3790b(View view, boolean z) {
            boolean z2 = view.isShown() && view.getWindowVisibility() == 0;
            if (z != z2) {
                C0835a0.m3710W(view, z2 ? 16 : 32);
                this.f2460a.put(view, Boolean.valueOf(z2));
            }
        }

        /* renamed from: c */
        private void m3791c(View view) {
            view.getViewTreeObserver().addOnGlobalLayoutListener(this);
        }

        /* renamed from: e */
        private void m3792e(View view) {
            C0843h.m3818o(view.getViewTreeObserver(), this);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo3261a(View view) {
            this.f2460a.put(view, Boolean.valueOf(view.isShown() && view.getWindowVisibility() == 0));
            view.addOnAttachStateChangeListener(this);
            if (C0846k.m3838b(view)) {
                m3791c(view);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public void mo3262d(View view) {
            this.f2460a.remove(view);
            view.removeOnAttachStateChangeListener(this);
            m3792e(view);
        }

        public void onGlobalLayout() {
            if (Build.VERSION.SDK_INT < 28) {
                for (Map.Entry next : this.f2460a.entrySet()) {
                    m3790b((View) next.getKey(), ((Boolean) next.getValue()).booleanValue());
                }
            }
        }

        public void onViewAttachedToWindow(View view) {
            m3791c(view);
        }

        public void onViewDetachedFromWindow(View view) {
        }
    }

    /* renamed from: androidx.core.view.a0$f */
    /* compiled from: ViewCompat */
    static abstract class C0841f<T> {

        /* renamed from: a */
        private final int f2461a;

        /* renamed from: b */
        private final Class<T> f2462b;

        /* renamed from: c */
        private final int f2463c;

        /* renamed from: d */
        private final int f2464d;

        C0841f(int i, Class<T> cls, int i2) {
            this(i, cls, 0, i2);
        }

        /* renamed from: b */
        private boolean m3795b() {
            return Build.VERSION.SDK_INT >= 19;
        }

        /* renamed from: c */
        private boolean m3796c() {
            return Build.VERSION.SDK_INT >= this.f2463c;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo3266a(Boolean bool, Boolean bool2) {
            if ((bool != null && bool.booleanValue()) == (bool2 != null && bool2.booleanValue())) {
                return true;
            }
            return false;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public abstract T mo3246d(View view);

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public abstract void mo3247e(View view, T t);

        /* access modifiers changed from: package-private */
        /* renamed from: f */
        public T mo3267f(View view) {
            if (m3796c()) {
                return mo3246d(view);
            }
            if (!m3795b()) {
                return null;
            }
            T tag = view.getTag(this.f2461a);
            if (this.f2462b.isInstance(tag)) {
                return tag;
            }
            return null;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: g */
        public void mo3268g(View view, T t) {
            if (m3796c()) {
                mo3247e(view, t);
            } else if (m3795b() && mo3248h(mo3267f(view), t)) {
                C0835a0.m3734k(view);
                view.setTag(this.f2461a, t);
                C0835a0.m3710W(view, this.f2464d);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: h */
        public abstract boolean mo3248h(T t, T t2);

        C0841f(int i, Class<T> cls, int i2, int i3) {
            this.f2461a = i;
            this.f2462b = cls;
            this.f2464d = i2;
            this.f2463c = i3;
        }
    }

    /* renamed from: androidx.core.view.a0$g */
    /* compiled from: ViewCompat */
    static class C0842g {
        /* renamed from: a */
        static boolean m3803a(View view) {
            return view.hasOnClickListeners();
        }
    }

    /* renamed from: androidx.core.view.a0$h */
    /* compiled from: ViewCompat */
    static class C0843h {
        /* renamed from: a */
        static AccessibilityNodeProvider m3804a(View view) {
            return view.getAccessibilityNodeProvider();
        }

        /* renamed from: b */
        static boolean m3805b(View view) {
            return view.getFitsSystemWindows();
        }

        /* renamed from: c */
        static int m3806c(View view) {
            return view.getImportantForAccessibility();
        }

        /* renamed from: d */
        static int m3807d(View view) {
            return view.getMinimumHeight();
        }

        /* renamed from: e */
        static int m3808e(View view) {
            return view.getMinimumWidth();
        }

        /* renamed from: f */
        static ViewParent m3809f(View view) {
            return view.getParentForAccessibility();
        }

        /* renamed from: g */
        static int m3810g(View view) {
            return view.getWindowSystemUiVisibility();
        }

        /* renamed from: h */
        static boolean m3811h(View view) {
            return view.hasOverlappingRendering();
        }

        /* renamed from: i */
        static boolean m3812i(View view) {
            return view.hasTransientState();
        }

        /* renamed from: j */
        static boolean m3813j(View view, int i, Bundle bundle) {
            return view.performAccessibilityAction(i, bundle);
        }

        /* renamed from: k */
        static void m3814k(View view) {
            view.postInvalidateOnAnimation();
        }

        /* renamed from: l */
        static void m3815l(View view, int i, int i2, int i3, int i4) {
            view.postInvalidateOnAnimation(i, i2, i3, i4);
        }

        /* renamed from: m */
        static void m3816m(View view, Runnable runnable) {
            view.postOnAnimation(runnable);
        }

        /* renamed from: n */
        static void m3817n(View view, Runnable runnable, long j) {
            view.postOnAnimationDelayed(runnable, j);
        }

        /* renamed from: o */
        static void m3818o(ViewTreeObserver viewTreeObserver, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
            viewTreeObserver.removeOnGlobalLayoutListener(onGlobalLayoutListener);
        }

        /* renamed from: p */
        static void m3819p(View view) {
            view.requestFitSystemWindows();
        }

        /* renamed from: q */
        static void m3820q(View view, Drawable drawable) {
            view.setBackground(drawable);
        }

        /* renamed from: r */
        static void m3821r(View view, boolean z) {
            view.setHasTransientState(z);
        }

        /* renamed from: s */
        static void m3822s(View view, int i) {
            view.setImportantForAccessibility(i);
        }
    }

    /* renamed from: androidx.core.view.a0$i */
    /* compiled from: ViewCompat */
    static class C0844i {
        /* renamed from: a */
        static int m3823a() {
            return View.generateViewId();
        }

        /* renamed from: b */
        static Display m3824b(View view) {
            return view.getDisplay();
        }

        /* renamed from: c */
        static int m3825c(View view) {
            return view.getLabelFor();
        }

        /* renamed from: d */
        static int m3826d(View view) {
            return view.getLayoutDirection();
        }

        /* renamed from: e */
        static int m3827e(View view) {
            return view.getPaddingEnd();
        }

        /* renamed from: f */
        static int m3828f(View view) {
            return view.getPaddingStart();
        }

        /* renamed from: g */
        static boolean m3829g(View view) {
            return view.isPaddingRelative();
        }

        /* renamed from: h */
        static void m3830h(View view, int i) {
            view.setLabelFor(i);
        }

        /* renamed from: i */
        static void m3831i(View view, Paint paint) {
            view.setLayerPaint(paint);
        }

        /* renamed from: j */
        static void m3832j(View view, int i) {
            view.setLayoutDirection(i);
        }

        /* renamed from: k */
        static void m3833k(View view, int i, int i2, int i3, int i4) {
            view.setPaddingRelative(i, i2, i3, i4);
        }
    }

    /* renamed from: androidx.core.view.a0$j */
    /* compiled from: ViewCompat */
    static class C0845j {
        /* renamed from: a */
        static Rect m3834a(View view) {
            return view.getClipBounds();
        }

        /* renamed from: b */
        static boolean m3835b(View view) {
            return view.isInLayout();
        }

        /* renamed from: c */
        static void m3836c(View view, Rect rect) {
            view.setClipBounds(rect);
        }
    }

    /* renamed from: androidx.core.view.a0$k */
    /* compiled from: ViewCompat */
    static class C0846k {
        /* renamed from: a */
        static int m3837a(View view) {
            return view.getAccessibilityLiveRegion();
        }

        /* renamed from: b */
        static boolean m3838b(View view) {
            return view.isAttachedToWindow();
        }

        /* renamed from: c */
        static boolean m3839c(View view) {
            return view.isLaidOut();
        }

        /* renamed from: d */
        static boolean m3840d(View view) {
            return view.isLayoutDirectionResolved();
        }

        /* renamed from: e */
        static void m3841e(ViewParent viewParent, View view, View view2, int i) {
            viewParent.notifySubtreeAccessibilityStateChanged(view, view2, i);
        }

        /* renamed from: f */
        static void m3842f(View view, int i) {
            view.setAccessibilityLiveRegion(i);
        }

        /* renamed from: g */
        static void m3843g(AccessibilityEvent accessibilityEvent, int i) {
            accessibilityEvent.setContentChangeTypes(i);
        }
    }

    /* renamed from: androidx.core.view.a0$l */
    /* compiled from: ViewCompat */
    static class C0847l {
        /* renamed from: a */
        static WindowInsets m3844a(View view, WindowInsets windowInsets) {
            return view.dispatchApplyWindowInsets(windowInsets);
        }

        /* renamed from: b */
        static WindowInsets m3845b(View view, WindowInsets windowInsets) {
            return view.onApplyWindowInsets(windowInsets);
        }

        /* renamed from: c */
        static void m3846c(View view) {
            view.requestApplyInsets();
        }
    }

    /* renamed from: androidx.core.view.a0$m */
    /* compiled from: ViewCompat */
    private static class C0848m {

        /* renamed from: androidx.core.view.a0$m$a */
        /* compiled from: ViewCompat */
        class C0849a implements View.OnApplyWindowInsetsListener {

            /* renamed from: a */
            C0922k0 f2465a = null;

            /* renamed from: b */
            final /* synthetic */ View f2466b;

            /* renamed from: c */
            final /* synthetic */ C0953u f2467c;

            C0849a(View view, C0953u uVar) {
                this.f2466b = view;
                this.f2467c = uVar;
            }

            public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                C0922k0 v = C0922k0.m4161v(windowInsets, view);
                int i = Build.VERSION.SDK_INT;
                if (i < 30) {
                    C0848m.m3847a(windowInsets, this.f2466b);
                    if (v.equals(this.f2465a)) {
                        return this.f2467c.mo987a(view, v).mo3427t();
                    }
                }
                this.f2465a = v;
                C0922k0 a = this.f2467c.mo987a(view, v);
                if (i >= 30) {
                    return a.mo3427t();
                }
                C0835a0.m3735k0(view);
                return a.mo3427t();
            }
        }

        /* renamed from: a */
        static void m3847a(WindowInsets windowInsets, View view) {
            View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = (View.OnApplyWindowInsetsListener) view.getTag(C5493d.f27884b0);
            if (onApplyWindowInsetsListener != null) {
                onApplyWindowInsetsListener.onApplyWindowInsets(view, windowInsets);
            }
        }

        /* renamed from: b */
        static C0922k0 m3848b(View view, C0922k0 k0Var, Rect rect) {
            WindowInsets t = k0Var.mo3427t();
            if (t != null) {
                return C0922k0.m4161v(view.computeSystemWindowInsets(t, rect), view);
            }
            rect.setEmpty();
            return k0Var;
        }

        /* renamed from: c */
        static boolean m3849c(View view, float f, float f2, boolean z) {
            return view.dispatchNestedFling(f, f2, z);
        }

        /* renamed from: d */
        static boolean m3850d(View view, float f, float f2) {
            return view.dispatchNestedPreFling(f, f2);
        }

        /* renamed from: e */
        static boolean m3851e(View view, int i, int i2, int[] iArr, int[] iArr2) {
            return view.dispatchNestedPreScroll(i, i2, iArr, iArr2);
        }

        /* renamed from: f */
        static boolean m3852f(View view, int i, int i2, int i3, int i4, int[] iArr) {
            return view.dispatchNestedScroll(i, i2, i3, i4, iArr);
        }

        /* renamed from: g */
        static ColorStateList m3853g(View view) {
            return view.getBackgroundTintList();
        }

        /* renamed from: h */
        static PorterDuff.Mode m3854h(View view) {
            return view.getBackgroundTintMode();
        }

        /* renamed from: i */
        static float m3855i(View view) {
            return view.getElevation();
        }

        /* renamed from: j */
        public static C0922k0 m3856j(View view) {
            return C0922k0.C0923a.m4181a(view);
        }

        /* renamed from: k */
        static String m3857k(View view) {
            return view.getTransitionName();
        }

        /* renamed from: l */
        static float m3858l(View view) {
            return view.getTranslationZ();
        }

        /* renamed from: m */
        static float m3859m(View view) {
            return view.getZ();
        }

        /* renamed from: n */
        static boolean m3860n(View view) {
            return view.hasNestedScrollingParent();
        }

        /* renamed from: o */
        static boolean m3861o(View view) {
            return view.isImportantForAccessibility();
        }

        /* renamed from: p */
        static boolean m3862p(View view) {
            return view.isNestedScrollingEnabled();
        }

        /* renamed from: q */
        static void m3863q(View view, ColorStateList colorStateList) {
            view.setBackgroundTintList(colorStateList);
        }

        /* renamed from: r */
        static void m3864r(View view, PorterDuff.Mode mode) {
            view.setBackgroundTintMode(mode);
        }

        /* renamed from: s */
        static void m3865s(View view, float f) {
            view.setElevation(f);
        }

        /* renamed from: t */
        static void m3866t(View view, boolean z) {
            view.setNestedScrollingEnabled(z);
        }

        /* renamed from: u */
        static void m3867u(View view, C0953u uVar) {
            if (Build.VERSION.SDK_INT < 30) {
                view.setTag(C5493d.f27874T, uVar);
            }
            if (uVar == null) {
                view.setOnApplyWindowInsetsListener((View.OnApplyWindowInsetsListener) view.getTag(C5493d.f27884b0));
            } else {
                view.setOnApplyWindowInsetsListener(new C0849a(view, uVar));
            }
        }

        /* renamed from: v */
        static void m3868v(View view, String str) {
            view.setTransitionName(str);
        }

        /* renamed from: w */
        static void m3869w(View view, float f) {
            view.setTranslationZ(f);
        }

        /* renamed from: x */
        static void m3870x(View view, float f) {
            view.setZ(f);
        }

        /* renamed from: y */
        static boolean m3871y(View view, int i) {
            return view.startNestedScroll(i);
        }

        /* renamed from: z */
        static void m3872z(View view) {
            view.stopNestedScroll();
        }
    }

    /* renamed from: androidx.core.view.a0$n */
    /* compiled from: ViewCompat */
    private static class C0850n {
        /* renamed from: a */
        public static C0922k0 m3873a(View view) {
            WindowInsets rootWindowInsets = view.getRootWindowInsets();
            if (rootWindowInsets == null) {
                return null;
            }
            C0922k0 u = C0922k0.m4160u(rootWindowInsets);
            u.mo3425r(u);
            u.mo3410d(view.getRootView());
            return u;
        }

        /* renamed from: b */
        static int m3874b(View view) {
            return view.getScrollIndicators();
        }

        /* renamed from: c */
        static void m3875c(View view, int i) {
            view.setScrollIndicators(i);
        }

        /* renamed from: d */
        static void m3876d(View view, int i, int i2) {
            view.setScrollIndicators(i, i2);
        }
    }

    /* renamed from: androidx.core.view.a0$o */
    /* compiled from: ViewCompat */
    static class C0851o {
        /* renamed from: a */
        static void m3877a(View view, Collection<View> collection, int i) {
            view.addKeyboardNavigationClusters(collection, i);
        }

        /* renamed from: b */
        static int m3878b(View view) {
            return view.getImportantForAutofill();
        }

        /* renamed from: c */
        static int m3879c(View view) {
            return view.getNextClusterForwardId();
        }

        /* renamed from: d */
        static boolean m3880d(View view) {
            return view.hasExplicitFocusable();
        }

        /* renamed from: e */
        static boolean m3881e(View view) {
            return view.isFocusedByDefault();
        }

        /* renamed from: f */
        static boolean m3882f(View view) {
            return view.isImportantForAutofill();
        }

        /* renamed from: g */
        static boolean m3883g(View view) {
            return view.isKeyboardNavigationCluster();
        }

        /* renamed from: h */
        static View m3884h(View view, View view2, int i) {
            return view.keyboardNavigationClusterSearch(view2, i);
        }

        /* renamed from: i */
        static boolean m3885i(View view) {
            return view.restoreDefaultFocus();
        }

        /* renamed from: j */
        static void m3886j(View view, String... strArr) {
            view.setAutofillHints(strArr);
        }

        /* renamed from: k */
        static void m3887k(View view, boolean z) {
            view.setFocusedByDefault(z);
        }

        /* renamed from: l */
        static void m3888l(View view, int i) {
            view.setImportantForAutofill(i);
        }

        /* renamed from: m */
        static void m3889m(View view, boolean z) {
            view.setKeyboardNavigationCluster(z);
        }

        /* renamed from: n */
        static void m3890n(View view, int i) {
            view.setNextClusterForwardId(i);
        }

        /* renamed from: o */
        static void m3891o(View view, CharSequence charSequence) {
            view.setTooltipText(charSequence);
        }
    }

    /* renamed from: androidx.core.view.a0$p */
    /* compiled from: ViewCompat */
    static class C0852p {
        /* renamed from: a */
        static void m3892a(View view, C0857u uVar) {
            int i = C5493d.f27882a0;
            C5426g gVar = (C5426g) view.getTag(i);
            if (gVar == null) {
                gVar = new C5426g();
                view.setTag(i, gVar);
            }
            Objects.requireNonNull(uVar);
            C0885b0 b0Var = new C0885b0(uVar);
            gVar.put(uVar, b0Var);
            view.addOnUnhandledKeyEventListener(b0Var);
        }

        /* renamed from: b */
        static CharSequence m3893b(View view) {
            return view.getAccessibilityPaneTitle();
        }

        /* renamed from: c */
        static boolean m3894c(View view) {
            return view.isAccessibilityHeading();
        }

        /* renamed from: d */
        static boolean m3895d(View view) {
            return view.isScreenReaderFocusable();
        }

        /* renamed from: e */
        static void m3896e(View view, C0857u uVar) {
            View.OnUnhandledKeyEventListener onUnhandledKeyEventListener;
            C5426g gVar = (C5426g) view.getTag(C5493d.f27882a0);
            if (gVar != null && (onUnhandledKeyEventListener = (View.OnUnhandledKeyEventListener) gVar.get(uVar)) != null) {
                view.removeOnUnhandledKeyEventListener(onUnhandledKeyEventListener);
            }
        }

        /* renamed from: f */
        static <T> T m3897f(View view, int i) {
            return view.requireViewById(i);
        }

        /* renamed from: g */
        static void m3898g(View view, boolean z) {
            view.setAccessibilityHeading(z);
        }

        /* renamed from: h */
        static void m3899h(View view, CharSequence charSequence) {
            view.setAccessibilityPaneTitle(charSequence);
        }

        /* renamed from: i */
        static void m3900i(View view, boolean z) {
            view.setScreenReaderFocusable(z);
        }
    }

    /* renamed from: androidx.core.view.a0$q */
    /* compiled from: ViewCompat */
    private static class C0853q {
        /* renamed from: a */
        static View.AccessibilityDelegate m3901a(View view) {
            return view.getAccessibilityDelegate();
        }

        /* renamed from: b */
        static List<Rect> m3902b(View view) {
            return view.getSystemGestureExclusionRects();
        }

        /* renamed from: c */
        static void m3903c(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i, int i2) {
            view.saveAttributeDataForStyleable(context, iArr, attributeSet, typedArray, i, i2);
        }

        /* renamed from: d */
        static void m3904d(View view, List<Rect> list) {
            view.setSystemGestureExclusionRects(list);
        }
    }

    /* renamed from: androidx.core.view.a0$r */
    /* compiled from: ViewCompat */
    private static class C0854r {
        /* renamed from: a */
        static CharSequence m3905a(View view) {
            return view.getStateDescription();
        }

        /* renamed from: b */
        static void m3906b(View view, CharSequence charSequence) {
            view.setStateDescription(charSequence);
        }
    }

    /* renamed from: androidx.core.view.a0$s */
    /* compiled from: ViewCompat */
    private static final class C0855s {
        /* renamed from: a */
        public static String[] m3907a(View view) {
            return view.getReceiveContentMimeTypes();
        }

        /* renamed from: b */
        public static C0886c m3908b(View view, C0886c cVar) {
            ContentInfo f = cVar.mo3361f();
            ContentInfo performReceiveContent = view.performReceiveContent(f);
            if (performReceiveContent == null) {
                return null;
            }
            if (performReceiveContent == f) {
                return cVar;
            }
            return C0886c.m4029g(performReceiveContent);
        }

        /* renamed from: c */
        public static void m3909c(View view, String[] strArr, C0954v vVar) {
            if (vVar == null) {
                view.setOnReceiveContentListener(strArr, (OnReceiveContentListener) null);
            } else {
                view.setOnReceiveContentListener(strArr, new C0856t(vVar));
            }
        }
    }

    /* renamed from: androidx.core.view.a0$t */
    /* compiled from: ViewCompat */
    private static final class C0856t implements OnReceiveContentListener {

        /* renamed from: a */
        private final C0954v f2468a;

        C0856t(C0954v vVar) {
            this.f2468a = vVar;
        }

        public ContentInfo onReceiveContent(View view, ContentInfo contentInfo) {
            C0886c g = C0886c.m4029g(contentInfo);
            C0886c a = this.f2468a.mo3496a(view, g);
            if (a == null) {
                return null;
            }
            if (a == g) {
                return contentInfo;
            }
            return a.mo3361f();
        }
    }

    /* renamed from: androidx.core.view.a0$u */
    /* compiled from: ViewCompat */
    public interface C0857u {
        boolean onUnhandledKeyEvent(View view, KeyEvent keyEvent);
    }

    /* renamed from: androidx.core.view.a0$v */
    /* compiled from: ViewCompat */
    static class C0858v {

        /* renamed from: d */
        private static final ArrayList<WeakReference<View>> f2469d = new ArrayList<>();

        /* renamed from: a */
        private WeakHashMap<View, Boolean> f2470a = null;

        /* renamed from: b */
        private SparseArray<WeakReference<View>> f2471b = null;

        /* renamed from: c */
        private WeakReference<KeyEvent> f2472c = null;

        C0858v() {
        }

        /* renamed from: a */
        static C0858v m3910a(View view) {
            int i = C5493d.f27880Z;
            C0858v vVar = (C0858v) view.getTag(i);
            if (vVar != null) {
                return vVar;
            }
            C0858v vVar2 = new C0858v();
            view.setTag(i, vVar2);
            return vVar2;
        }

        /* renamed from: c */
        private View m3911c(View view, KeyEvent keyEvent) {
            WeakHashMap<View, Boolean> weakHashMap = this.f2470a;
            if (weakHashMap != null && weakHashMap.containsKey(view)) {
                if (view instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) view;
                    for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                        View c = m3911c(viewGroup.getChildAt(childCount), keyEvent);
                        if (c != null) {
                            return c;
                        }
                    }
                }
                if (m3913e(view, keyEvent)) {
                    return view;
                }
            }
            return null;
        }

        /* renamed from: d */
        private SparseArray<WeakReference<View>> m3912d() {
            if (this.f2471b == null) {
                this.f2471b = new SparseArray<>();
            }
            return this.f2471b;
        }

        /* renamed from: e */
        private boolean m3913e(View view, KeyEvent keyEvent) {
            ArrayList arrayList = (ArrayList) view.getTag(C5493d.f27882a0);
            if (arrayList == null) {
                return false;
            }
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                if (((C0857u) arrayList.get(size)).onUnhandledKeyEvent(view, keyEvent)) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: g */
        private void m3914g() {
            WeakHashMap<View, Boolean> weakHashMap = this.f2470a;
            if (weakHashMap != null) {
                weakHashMap.clear();
            }
            ArrayList<WeakReference<View>> arrayList = f2469d;
            if (!arrayList.isEmpty()) {
                synchronized (arrayList) {
                    if (this.f2470a == null) {
                        this.f2470a = new WeakHashMap<>();
                    }
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        ArrayList<WeakReference<View>> arrayList2 = f2469d;
                        View view = (View) arrayList2.get(size).get();
                        if (view == null) {
                            arrayList2.remove(size);
                        } else {
                            this.f2470a.put(view, Boolean.TRUE);
                            for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
                                this.f2470a.put((View) parent, Boolean.TRUE);
                            }
                        }
                    }
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public boolean mo3272b(View view, KeyEvent keyEvent) {
            if (keyEvent.getAction() == 0) {
                m3914g();
            }
            View c = m3911c(view, keyEvent);
            if (keyEvent.getAction() == 0) {
                int keyCode = keyEvent.getKeyCode();
                if (c != null && !KeyEvent.isModifierKey(keyCode)) {
                    m3912d().put(keyCode, new WeakReference(c));
                }
            }
            return c != null;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: f */
        public boolean mo3273f(KeyEvent keyEvent) {
            int indexOfKey;
            WeakReference<KeyEvent> weakReference = this.f2472c;
            if (weakReference != null && weakReference.get() == keyEvent) {
                return false;
            }
            this.f2472c = new WeakReference<>(keyEvent);
            WeakReference weakReference2 = null;
            SparseArray<WeakReference<View>> d = m3912d();
            if (keyEvent.getAction() == 1 && (indexOfKey = d.indexOfKey(keyEvent.getKeyCode())) >= 0) {
                weakReference2 = d.valueAt(indexOfKey);
                d.removeAt(indexOfKey);
            }
            if (weakReference2 == null) {
                weakReference2 = d.get(keyEvent.getKeyCode());
            }
            if (weakReference2 == null) {
                return false;
            }
            View view = (View) weakReference2.get();
            if (view != null && C0835a0.m3704Q(view)) {
                m3913e(view, keyEvent);
            }
            return true;
        }
    }

    /* renamed from: A */
    public static int m3680A(View view) {
        if (Build.VERSION.SDK_INT >= 26) {
            return C0851o.m3878b(view);
        }
        return 0;
    }

    /* renamed from: A0 */
    public static void m3681A0(View view, int i, int i2, int i3, int i4) {
        if (Build.VERSION.SDK_INT >= 17) {
            C0844i.m3833k(view, i, i2, i3, i4);
        } else {
            view.setPadding(i, i2, i3, i4);
        }
    }

    /* renamed from: B */
    public static int m3682B(View view) {
        if (Build.VERSION.SDK_INT >= 17) {
            return C0844i.m3826d(view);
        }
        return 0;
    }

    /* renamed from: B0 */
    public static void m3683B0(View view, boolean z) {
        m3739m0().mo3268g(view, Boolean.valueOf(z));
    }

    /* renamed from: C */
    public static int m3684C(View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            return C0843h.m3807d(view);
        }
        if (!f2451e) {
            try {
                Field declaredField = View.class.getDeclaredField("mMinHeight");
                f2450d = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
            }
            f2451e = true;
        }
        Field field = f2450d;
        if (field == null) {
            return 0;
        }
        try {
            return ((Integer) field.get(view)).intValue();
        } catch (Exception unused2) {
            return 0;
        }
    }

    /* renamed from: C0 */
    public static void m3685C0(View view, int i, int i2) {
        if (Build.VERSION.SDK_INT >= 23) {
            C0850n.m3876d(view, i, i2);
        }
    }

    /* renamed from: D */
    public static int m3686D(View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            return C0843h.m3808e(view);
        }
        if (!f2449c) {
            try {
                Field declaredField = View.class.getDeclaredField("mMinWidth");
                f2448b = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
            }
            f2449c = true;
        }
        Field field = f2448b;
        if (field == null) {
            return 0;
        }
        try {
            return ((Integer) field.get(view)).intValue();
        } catch (Exception unused2) {
            return 0;
        }
    }

    /* renamed from: D0 */
    public static void m3687D0(View view, String str) {
        if (Build.VERSION.SDK_INT >= 21) {
            C0848m.m3868v(view, str);
            return;
        }
        if (f2452f == null) {
            f2452f = new WeakHashMap<>();
        }
        f2452f.put(view, str);
    }

    /* renamed from: E */
    public static String[] m3688E(View view) {
        if (Build.VERSION.SDK_INT >= 31) {
            return C0855s.m3907a(view);
        }
        return (String[]) view.getTag(C5493d.f27876V);
    }

    /* renamed from: E0 */
    private static void m3689E0(View view) {
        if (m3764z(view) == 0) {
            m3761x0(view, 1);
        }
        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
            if (m3764z((View) parent) == 4) {
                m3761x0(view, 2);
                return;
            }
        }
    }

    /* renamed from: F */
    public static int m3690F(View view) {
        if (Build.VERSION.SDK_INT >= 17) {
            return C0844i.m3827e(view);
        }
        return view.getPaddingRight();
    }

    /* renamed from: F0 */
    private static C0841f<CharSequence> m3691F0() {
        return new C0838c(C5493d.f27878X, CharSequence.class, 64, 30);
    }

    /* renamed from: G */
    public static int m3692G(View view) {
        if (Build.VERSION.SDK_INT >= 17) {
            return C0844i.m3828f(view);
        }
        return view.getPaddingLeft();
    }

    /* renamed from: G0 */
    public static void m3693G0(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            C0848m.m3872z(view);
        } else if (view instanceof C0947o) {
            ((C0947o) view).stopNestedScroll();
        }
    }

    /* renamed from: H */
    public static C0922k0 m3694H(View view) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 23) {
            return C0850n.m3873a(view);
        }
        if (i >= 21) {
            return C0848m.m3856j(view);
        }
        return null;
    }

    /* renamed from: H0 */
    private static void m3695H0(View view) {
        float translationY = view.getTranslationY();
        view.setTranslationY(1.0f + translationY);
        view.setTranslationY(translationY);
    }

    /* renamed from: I */
    public static CharSequence m3696I(View view) {
        return m3691F0().mo3267f(view);
    }

    /* renamed from: J */
    public static String m3697J(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            return C0848m.m3857k(view);
        }
        WeakHashMap<View, String> weakHashMap = f2452f;
        if (weakHashMap == null) {
            return null;
        }
        return weakHashMap.get(view);
    }

    @Deprecated
    /* renamed from: K */
    public static int m3698K(View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            return C0843h.m3810g(view);
        }
        return 0;
    }

    /* renamed from: L */
    public static float m3699L(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            return C0848m.m3859m(view);
        }
        return 0.0f;
    }

    /* renamed from: M */
    public static boolean m3700M(View view) {
        if (Build.VERSION.SDK_INT >= 15) {
            return C0842g.m3803a(view);
        }
        return false;
    }

    /* renamed from: N */
    public static boolean m3701N(View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            return C0843h.m3811h(view);
        }
        return true;
    }

    /* renamed from: O */
    public static boolean m3702O(View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            return C0843h.m3812i(view);
        }
        return false;
    }

    /* renamed from: P */
    public static boolean m3703P(View view) {
        Boolean f = m3716b().mo3267f(view);
        return f != null && f.booleanValue();
    }

    /* renamed from: Q */
    public static boolean m3704Q(View view) {
        if (Build.VERSION.SDK_INT >= 19) {
            return C0846k.m3838b(view);
        }
        return view.getWindowToken() != null;
    }

    /* renamed from: R */
    public static boolean m3705R(View view) {
        if (Build.VERSION.SDK_INT >= 19) {
            return C0846k.m3839c(view);
        }
        return view.getWidth() > 0 && view.getHeight() > 0;
    }

    /* renamed from: S */
    public static boolean m3706S(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            return C0848m.m3862p(view);
        }
        if (view instanceof C0947o) {
            return ((C0947o) view).isNestedScrollingEnabled();
        }
        return false;
    }

    /* renamed from: T */
    public static boolean m3707T(View view) {
        if (Build.VERSION.SDK_INT >= 17) {
            return C0844i.m3829g(view);
        }
        return false;
    }

    /* renamed from: U */
    public static boolean m3708U(View view) {
        Boolean f = m3739m0().mo3267f(view);
        return f != null && f.booleanValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: V */
    public static /* synthetic */ C0886c m3709V(C0886c cVar) {
        return cVar;
    }

    /* renamed from: W */
    static void m3710W(View view, int i) {
        AccessibilityManager accessibilityManager = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled()) {
            boolean z = m3744p(view) != null && view.isShown() && view.getWindowVisibility() == 0;
            int i2 = 32;
            if (m3742o(view) != 0 || z) {
                AccessibilityEvent obtain = AccessibilityEvent.obtain();
                if (!z) {
                    i2 = 2048;
                }
                obtain.setEventType(i2);
                C0846k.m3843g(obtain, i);
                if (z) {
                    obtain.getText().add(m3744p(view));
                    m3689E0(view);
                }
                view.sendAccessibilityEventUnchecked(obtain);
            } else if (i == 32) {
                AccessibilityEvent obtain2 = AccessibilityEvent.obtain();
                view.onInitializeAccessibilityEvent(obtain2);
                obtain2.setEventType(32);
                C0846k.m3843g(obtain2, i);
                obtain2.setSource(view);
                view.onPopulateAccessibilityEvent(obtain2);
                obtain2.getText().add(m3744p(view));
                accessibilityManager.sendAccessibilityEvent(obtain2);
            } else if (view.getParent() != null) {
                try {
                    C0846k.m3841e(view.getParent(), view, view, i);
                } catch (AbstractMethodError e) {
                    Log.e("ViewCompat", view.getParent().getClass().getSimpleName() + " does not fully implement ViewParent", e);
                }
            }
        }
    }

    /* renamed from: X */
    public static void m3711X(View view, int i) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 23) {
            view.offsetLeftAndRight(i);
        } else if (i2 >= 21) {
            Rect w = m3758w();
            boolean z = false;
            ViewParent parent = view.getParent();
            if (parent instanceof View) {
                View view2 = (View) parent;
                w.set(view2.getLeft(), view2.getTop(), view2.getRight(), view2.getBottom());
                z = !w.intersects(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
            }
            m3722e(view, i);
            if (z && w.intersect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom())) {
                ((View) parent).invalidate(w);
            }
        } else {
            m3722e(view, i);
        }
    }

    /* renamed from: Y */
    public static void m3712Y(View view, int i) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 23) {
            view.offsetTopAndBottom(i);
        } else if (i2 >= 21) {
            Rect w = m3758w();
            boolean z = false;
            ViewParent parent = view.getParent();
            if (parent instanceof View) {
                View view2 = (View) parent;
                w.set(view2.getLeft(), view2.getTop(), view2.getRight(), view2.getBottom());
                z = !w.intersects(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
            }
            m3724f(view, i);
            if (z && w.intersect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom())) {
                ((View) parent).invalidate(w);
            }
        } else {
            m3724f(view, i);
        }
    }

    /* renamed from: Z */
    public static C0922k0 m3713Z(View view, C0922k0 k0Var) {
        WindowInsets t;
        if (Build.VERSION.SDK_INT >= 21 && (t = k0Var.mo3427t()) != null) {
            WindowInsets b = C0847l.m3845b(view, t);
            if (!b.equals(t)) {
                return C0922k0.m4161v(b, view);
            }
        }
        return k0Var;
    }

    /* renamed from: a0 */
    public static void m3715a0(View view, C0862c cVar) {
        view.onInitializeAccessibilityNodeInfo(cVar.mo3332u0());
    }

    /* renamed from: b */
    private static C0841f<Boolean> m3716b() {
        return new C0839d(C5493d.f27872R, Boolean.class, 28);
    }

    /* renamed from: b0 */
    private static C0841f<CharSequence> m3717b0() {
        return new C0837b(C5493d.f27873S, CharSequence.class, 8, 28);
    }

    /* renamed from: c */
    private static void m3718c(View view, C0862c.C0863a aVar) {
        if (Build.VERSION.SDK_INT >= 21) {
            m3734k(view);
            m3731i0(aVar.mo3337b(), view);
            m3746q(view).add(aVar);
            m3710W(view, 0);
        }
    }

    /* renamed from: c0 */
    public static boolean m3719c0(View view, int i, Bundle bundle) {
        if (Build.VERSION.SDK_INT >= 16) {
            return C0843h.m3813j(view, i, bundle);
        }
        return false;
    }

    /* renamed from: d */
    public static C0909g0 m3720d(View view) {
        if (f2453g == null) {
            f2453g = new WeakHashMap<>();
        }
        C0909g0 g0Var = f2453g.get(view);
        if (g0Var != null) {
            return g0Var;
        }
        C0909g0 g0Var2 = new C0909g0(view);
        f2453g.put(view, g0Var2);
        return g0Var2;
    }

    /* renamed from: d0 */
    public static C0886c m3721d0(View view, C0886c cVar) {
        if (Log.isLoggable("ViewCompat", 3)) {
            Log.d("ViewCompat", "performReceiveContent: " + cVar + ", view=" + view.getClass().getSimpleName() + "[" + view.getId() + "]");
        }
        if (Build.VERSION.SDK_INT >= 31) {
            return C0855s.m3908b(view, cVar);
        }
        C0954v vVar = (C0954v) view.getTag(C5493d.f27875U);
        if (vVar == null) {
            return m3760x(view).mo2409a(cVar);
        }
        C0886c a = vVar.mo3496a(view, cVar);
        if (a == null) {
            return null;
        }
        return m3760x(view).mo2409a(a);
    }

    /* renamed from: e */
    private static void m3722e(View view, int i) {
        view.offsetLeftAndRight(i);
        if (view.getVisibility() == 0) {
            m3695H0(view);
            ViewParent parent = view.getParent();
            if (parent instanceof View) {
                m3695H0((View) parent);
            }
        }
    }

    /* renamed from: e0 */
    public static void m3723e0(View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            C0843h.m3814k(view);
        } else {
            view.postInvalidate();
        }
    }

    /* renamed from: f */
    private static void m3724f(View view, int i) {
        view.offsetTopAndBottom(i);
        if (view.getVisibility() == 0) {
            m3695H0(view);
            ViewParent parent = view.getParent();
            if (parent instanceof View) {
                m3695H0((View) parent);
            }
        }
    }

    /* renamed from: f0 */
    public static void m3725f0(View view, Runnable runnable) {
        if (Build.VERSION.SDK_INT >= 16) {
            C0843h.m3816m(view, runnable);
        } else {
            view.postDelayed(runnable, ValueAnimator.getFrameDelay());
        }
    }

    /* renamed from: g */
    public static C0922k0 m3726g(View view, C0922k0 k0Var, Rect rect) {
        return Build.VERSION.SDK_INT >= 21 ? C0848m.m3848b(view, k0Var, rect) : k0Var;
    }

    /* renamed from: g0 */
    public static void m3727g0(View view, Runnable runnable, long j) {
        if (Build.VERSION.SDK_INT >= 16) {
            C0843h.m3817n(view, runnable, j);
        } else {
            view.postDelayed(runnable, ValueAnimator.getFrameDelay() + j);
        }
    }

    /* renamed from: h */
    public static C0922k0 m3728h(View view, C0922k0 k0Var) {
        WindowInsets t;
        if (Build.VERSION.SDK_INT >= 21 && (t = k0Var.mo3427t()) != null) {
            WindowInsets a = C0847l.m3844a(view, t);
            if (!a.equals(t)) {
                return C0922k0.m4161v(a, view);
            }
        }
        return k0Var;
    }

    /* renamed from: h0 */
    public static void m3729h0(View view, int i) {
        if (Build.VERSION.SDK_INT >= 21) {
            m3731i0(i, view);
            m3710W(view, 0);
        }
    }

    /* renamed from: i */
    static boolean m3730i(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        return C0858v.m3910a(view).mo3272b(view, keyEvent);
    }

    /* renamed from: i0 */
    private static void m3731i0(int i, View view) {
        List<C0862c.C0863a> q = m3746q(view);
        for (int i2 = 0; i2 < q.size(); i2++) {
            if (q.get(i2).mo3337b() == i) {
                q.remove(i2);
                return;
            }
        }
    }

    /* renamed from: j */
    static boolean m3732j(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        return C0858v.m3910a(view).mo3273f(keyEvent);
    }

    /* renamed from: j0 */
    public static void m3733j0(View view, C0862c.C0863a aVar, CharSequence charSequence, C0873f fVar) {
        if (fVar == null && charSequence == null) {
            m3729h0(view, aVar.mo3337b());
        } else {
            m3718c(view, aVar.mo3336a(charSequence, fVar));
        }
    }

    /* renamed from: k */
    static void m3734k(View view) {
        C0832a l = m3736l(view);
        if (l == null) {
            l = new C0832a();
        }
        m3741n0(view, l);
    }

    /* renamed from: k0 */
    public static void m3735k0(View view) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 20) {
            C0847l.m3846c(view);
        } else if (i >= 16) {
            C0843h.m3819p(view);
        }
    }

    /* renamed from: l */
    public static C0832a m3736l(View view) {
        View.AccessibilityDelegate m = m3738m(view);
        if (m == null) {
            return null;
        }
        if (m instanceof C0832a.C0833a) {
            return ((C0832a.C0833a) m).f2446a;
        }
        return new C0832a(m);
    }

    /* renamed from: l0 */
    public static void m3737l0(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i, int i2) {
        if (Build.VERSION.SDK_INT >= 29) {
            C0853q.m3903c(view, context, iArr, attributeSet, typedArray, i, i2);
        }
    }

    /* renamed from: m */
    private static View.AccessibilityDelegate m3738m(View view) {
        if (Build.VERSION.SDK_INT >= 29) {
            return C0853q.m3901a(view);
        }
        return m3740n(view);
    }

    /* renamed from: m0 */
    private static C0841f<Boolean> m3739m0() {
        return new C0836a(C5493d.f27877W, Boolean.class, 28);
    }

    /* renamed from: n */
    private static View.AccessibilityDelegate m3740n(View view) {
        if (f2455i) {
            return null;
        }
        if (f2454h == null) {
            try {
                Field declaredField = View.class.getDeclaredField("mAccessibilityDelegate");
                f2454h = declaredField;
                declaredField.setAccessible(true);
            } catch (Throwable unused) {
                f2455i = true;
                return null;
            }
        }
        try {
            Object obj = f2454h.get(view);
            if (obj instanceof View.AccessibilityDelegate) {
                return (View.AccessibilityDelegate) obj;
            }
            return null;
        } catch (Throwable unused2) {
            f2455i = true;
            return null;
        }
    }

    /* renamed from: n0 */
    public static void m3741n0(View view, C0832a aVar) {
        View.AccessibilityDelegate accessibilityDelegate;
        if (aVar == null && (m3738m(view) instanceof C0832a.C0833a)) {
            aVar = new C0832a();
        }
        if (aVar == null) {
            accessibilityDelegate = null;
        } else {
            accessibilityDelegate = aVar.mo3229d();
        }
        view.setAccessibilityDelegate(accessibilityDelegate);
    }

    /* renamed from: o */
    public static int m3742o(View view) {
        if (Build.VERSION.SDK_INT >= 19) {
            return C0846k.m3837a(view);
        }
        return 0;
    }

    /* renamed from: o0 */
    public static void m3743o0(View view, boolean z) {
        m3716b().mo3268g(view, Boolean.valueOf(z));
    }

    /* renamed from: p */
    public static CharSequence m3744p(View view) {
        return m3717b0().mo3267f(view);
    }

    /* renamed from: p0 */
    public static void m3745p0(View view, int i) {
        if (Build.VERSION.SDK_INT >= 19) {
            C0846k.m3842f(view, i);
        }
    }

    /* renamed from: q */
    private static List<C0862c.C0863a> m3746q(View view) {
        int i = C5493d.f27870P;
        ArrayList arrayList = (ArrayList) view.getTag(i);
        if (arrayList != null) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        view.setTag(i, arrayList2);
        return arrayList2;
    }

    /* renamed from: q0 */
    public static void m3747q0(View view, CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 19) {
            m3717b0().mo3268g(view, charSequence);
            if (charSequence != null) {
                f2459m.mo3261a(view);
            } else {
                f2459m.mo3262d(view);
            }
        }
    }

    /* renamed from: r */
    public static ColorStateList m3748r(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            return C0848m.m3853g(view);
        }
        if (view instanceof C0957y) {
            return ((C0957y) view).getSupportBackgroundTintList();
        }
        return null;
    }

    /* renamed from: r0 */
    public static void m3749r0(View view, Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 16) {
            C0843h.m3820q(view, drawable);
        } else {
            view.setBackgroundDrawable(drawable);
        }
    }

    /* renamed from: s */
    public static PorterDuff.Mode m3750s(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            return C0848m.m3854h(view);
        }
        if (view instanceof C0957y) {
            return ((C0957y) view).getSupportBackgroundTintMode();
        }
        return null;
    }

    /* renamed from: s0 */
    public static void m3751s0(View view, ColorStateList colorStateList) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 21) {
            C0848m.m3863q(view, colorStateList);
            if (i == 21) {
                Drawable background = view.getBackground();
                boolean z = (C0848m.m3853g(view) == null && C0848m.m3854h(view) == null) ? false : true;
                if (background != null && z) {
                    if (background.isStateful()) {
                        background.setState(view.getDrawableState());
                    }
                    C0843h.m3820q(view, background);
                }
            }
        } else if (view instanceof C0957y) {
            ((C0957y) view).setSupportBackgroundTintList(colorStateList);
        }
    }

    /* renamed from: t */
    public static Rect m3752t(View view) {
        if (Build.VERSION.SDK_INT >= 18) {
            return C0845j.m3834a(view);
        }
        return null;
    }

    /* renamed from: t0 */
    public static void m3753t0(View view, PorterDuff.Mode mode) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 21) {
            C0848m.m3864r(view, mode);
            if (i == 21) {
                Drawable background = view.getBackground();
                boolean z = (C0848m.m3853g(view) == null && C0848m.m3854h(view) == null) ? false : true;
                if (background != null && z) {
                    if (background.isStateful()) {
                        background.setState(view.getDrawableState());
                    }
                    C0843h.m3820q(view, background);
                }
            }
        } else if (view instanceof C0957y) {
            ((C0957y) view).setSupportBackgroundTintMode(mode);
        }
    }

    /* renamed from: u */
    public static Display m3754u(View view) {
        if (Build.VERSION.SDK_INT >= 17) {
            return C0844i.m3824b(view);
        }
        if (m3704Q(view)) {
            return ((WindowManager) view.getContext().getSystemService("window")).getDefaultDisplay();
        }
        return null;
    }

    /* renamed from: u0 */
    public static void m3755u0(View view, Rect rect) {
        if (Build.VERSION.SDK_INT >= 18) {
            C0845j.m3836c(view, rect);
        }
    }

    /* renamed from: v */
    public static float m3756v(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            return C0848m.m3855i(view);
        }
        return 0.0f;
    }

    /* renamed from: v0 */
    public static void m3757v0(View view, float f) {
        if (Build.VERSION.SDK_INT >= 21) {
            C0848m.m3865s(view, f);
        }
    }

    /* renamed from: w */
    private static Rect m3758w() {
        if (f2456j == null) {
            f2456j = new ThreadLocal<>();
        }
        Rect rect = f2456j.get();
        if (rect == null) {
            rect = new Rect();
            f2456j.set(rect);
        }
        rect.setEmpty();
        return rect;
    }

    /* renamed from: w0 */
    public static void m3759w0(View view, boolean z) {
        if (Build.VERSION.SDK_INT >= 16) {
            C0843h.m3821r(view, z);
        }
    }

    /* renamed from: x */
    private static C0955w m3760x(View view) {
        if (view instanceof C0955w) {
            return (C0955w) view;
        }
        return f2458l;
    }

    /* renamed from: x0 */
    public static void m3761x0(View view, int i) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 19) {
            C0843h.m3822s(view, i);
        } else if (i2 >= 16) {
            if (i == 4) {
                i = 2;
            }
            C0843h.m3822s(view, i);
        }
    }

    /* renamed from: y */
    public static boolean m3762y(View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            return C0843h.m3805b(view);
        }
        return false;
    }

    /* renamed from: y0 */
    public static void m3763y0(View view, int i) {
        if (Build.VERSION.SDK_INT >= 26) {
            C0851o.m3888l(view, i);
        }
    }

    /* renamed from: z */
    public static int m3764z(View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            return C0843h.m3806c(view);
        }
        return 0;
    }

    /* renamed from: z0 */
    public static void m3765z0(View view, C0953u uVar) {
        if (Build.VERSION.SDK_INT >= 21) {
            C0848m.m3867u(view, uVar);
        }
    }
}
