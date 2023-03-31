package androidx.coordinatorlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import androidx.core.content.C0681a;
import androidx.core.graphics.drawable.C0732a;
import androidx.core.util.C0825c;
import androidx.core.util.C0828e;
import androidx.core.util.C0830g;
import androidx.core.view.C0835a0;
import androidx.core.view.C0901e;
import androidx.core.view.C0922k0;
import androidx.core.view.C0949q;
import androidx.core.view.C0950r;
import androidx.core.view.C0952t;
import androidx.core.view.C0953u;
import com.pichillilorenzo.flutter_inappwebview.C8710R;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p131s.C5469a;
import p131s.C5470b;
import p131s.C5471c;
import p169y.C6079a;

public class CoordinatorLayout extends ViewGroup implements C0949q, C0950r {

    /* renamed from: C */
    static final String f1958C;

    /* renamed from: D */
    static final Class<?>[] f1959D = {Context.class, AttributeSet.class};

    /* renamed from: E */
    static final ThreadLocal<Map<String, Constructor<C0603c>>> f1960E = new ThreadLocal<>();

    /* renamed from: F */
    static final Comparator<View> f1961F;

    /* renamed from: G */
    private static final C0828e<Rect> f1962G = new C0830g(12);

    /* renamed from: A */
    private C0953u f1963A;

    /* renamed from: B */
    private final C0952t f1964B;

    /* renamed from: a */
    private final List<View> f1965a;

    /* renamed from: b */
    private final C0611a<View> f1966b;

    /* renamed from: c */
    private final List<View> f1967c;

    /* renamed from: d */
    private final List<View> f1968d;

    /* renamed from: e */
    private Paint f1969e;

    /* renamed from: f */
    private final int[] f1970f;

    /* renamed from: g */
    private final int[] f1971g;

    /* renamed from: h */
    private boolean f1972h;

    /* renamed from: i */
    private boolean f1973i;

    /* renamed from: r */
    private int[] f1974r;

    /* renamed from: s */
    private View f1975s;

    /* renamed from: t */
    private View f1976t;

    /* renamed from: u */
    private C0607g f1977u;

    /* renamed from: v */
    private boolean f1978v;

    /* renamed from: w */
    private C0922k0 f1979w;

    /* renamed from: x */
    private boolean f1980x;

    /* renamed from: y */
    private Drawable f1981y;

    /* renamed from: z */
    ViewGroup.OnHierarchyChangeListener f1982z;

    /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$a */
    class C0601a implements C0953u {
        C0601a() {
        }

        /* renamed from: a */
        public C0922k0 mo987a(View view, C0922k0 k0Var) {
            return CoordinatorLayout.this.mo2732Q(k0Var);
        }
    }

    /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$b */
    public interface C0602b {
        C0603c getBehavior();
    }

    /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$c */
    public static abstract class C0603c<V extends View> {
        public C0603c() {
        }

        /* renamed from: A */
        public boolean mo2778A(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i, int i2) {
            if (i2 == 0) {
                return mo2807z(coordinatorLayout, v, view, view2, i);
            }
            return false;
        }

        @Deprecated
        /* renamed from: B */
        public void mo2779B(CoordinatorLayout coordinatorLayout, V v, View view) {
        }

        /* renamed from: C */
        public void mo2780C(CoordinatorLayout coordinatorLayout, V v, View view, int i) {
            if (i == 0) {
                mo2779B(coordinatorLayout, v, view);
            }
        }

        /* renamed from: D */
        public boolean mo2781D(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
            return false;
        }

        /* renamed from: a */
        public boolean mo2782a(CoordinatorLayout coordinatorLayout, V v) {
            return mo2785d(coordinatorLayout, v) > 0.0f;
        }

        /* renamed from: b */
        public boolean mo2783b(CoordinatorLayout coordinatorLayout, V v, Rect rect) {
            return false;
        }

        /* renamed from: c */
        public int mo2784c(CoordinatorLayout coordinatorLayout, V v) {
            return -16777216;
        }

        /* renamed from: d */
        public float mo2785d(CoordinatorLayout coordinatorLayout, V v) {
            return 0.0f;
        }

        /* renamed from: e */
        public boolean mo2786e(CoordinatorLayout coordinatorLayout, V v, View view) {
            return false;
        }

        /* renamed from: f */
        public C0922k0 mo2787f(CoordinatorLayout coordinatorLayout, V v, C0922k0 k0Var) {
            return k0Var;
        }

        /* renamed from: g */
        public void mo2788g(C0606f fVar) {
        }

        /* renamed from: h */
        public boolean mo2789h(CoordinatorLayout coordinatorLayout, V v, View view) {
            return false;
        }

        /* renamed from: i */
        public void mo2790i(CoordinatorLayout coordinatorLayout, V v, View view) {
        }

        /* renamed from: j */
        public void mo2791j() {
        }

        /* renamed from: k */
        public boolean mo2792k(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
            return false;
        }

        /* renamed from: l */
        public boolean mo2793l(CoordinatorLayout coordinatorLayout, V v, int i) {
            return false;
        }

        /* renamed from: m */
        public boolean mo2794m(CoordinatorLayout coordinatorLayout, V v, int i, int i2, int i3, int i4) {
            return false;
        }

        /* renamed from: n */
        public boolean mo2795n(CoordinatorLayout coordinatorLayout, V v, View view, float f, float f2, boolean z) {
            return false;
        }

        /* renamed from: o */
        public boolean mo2796o(CoordinatorLayout coordinatorLayout, V v, View view, float f, float f2) {
            return false;
        }

        @Deprecated
        /* renamed from: p */
        public void mo2797p(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int[] iArr) {
        }

        /* renamed from: q */
        public void mo2798q(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int[] iArr, int i3) {
            if (i3 == 0) {
                mo2797p(coordinatorLayout, v, view, i, i2, iArr);
            }
        }

        @Deprecated
        /* renamed from: r */
        public void mo2799r(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int i3, int i4) {
        }

        @Deprecated
        /* renamed from: s */
        public void mo2800s(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int i3, int i4, int i5) {
            if (i5 == 0) {
                mo2799r(coordinatorLayout, v, view, i, i2, i3, i4);
            }
        }

        /* renamed from: t */
        public void mo2801t(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
            iArr[0] = iArr[0] + i3;
            iArr[1] = iArr[1] + i4;
            mo2800s(coordinatorLayout, v, view, i, i2, i3, i4, i5);
        }

        @Deprecated
        /* renamed from: u */
        public void mo2802u(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i) {
        }

        /* renamed from: v */
        public void mo2803v(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i, int i2) {
            if (i2 == 0) {
                mo2802u(coordinatorLayout, v, view, view2, i);
            }
        }

        /* renamed from: w */
        public boolean mo2804w(CoordinatorLayout coordinatorLayout, V v, Rect rect, boolean z) {
            return false;
        }

        /* renamed from: x */
        public void mo2805x(CoordinatorLayout coordinatorLayout, V v, Parcelable parcelable) {
        }

        /* renamed from: y */
        public Parcelable mo2806y(CoordinatorLayout coordinatorLayout, V v) {
            return View.BaseSavedState.EMPTY_STATE;
        }

        @Deprecated
        /* renamed from: z */
        public boolean mo2807z(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i) {
            return false;
        }

        public C0603c(Context context, AttributeSet attributeSet) {
        }
    }

    @Deprecated
    @Retention(RetentionPolicy.RUNTIME)
    /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$d */
    public @interface C0604d {
        Class<? extends C0603c> value();
    }

    /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$e */
    private class C0605e implements ViewGroup.OnHierarchyChangeListener {
        C0605e() {
        }

        public void onChildViewAdded(View view, View view2) {
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = CoordinatorLayout.this.f1982z;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewAdded(view, view2);
            }
        }

        public void onChildViewRemoved(View view, View view2) {
            CoordinatorLayout.this.mo2727B(2);
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = CoordinatorLayout.this.f1982z;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewRemoved(view, view2);
            }
        }
    }

    /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$g */
    class C0607g implements ViewTreeObserver.OnPreDrawListener {
        C0607g() {
        }

        public boolean onPreDraw() {
            CoordinatorLayout.this.mo2727B(0);
            return true;
        }
    }

    /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$i */
    static class C0610i implements Comparator<View> {
        C0610i() {
        }

        /* renamed from: a */
        public int compare(View view, View view2) {
            float L = C0835a0.m3699L(view);
            float L2 = C0835a0.m3699L(view2);
            if (L > L2) {
                return -1;
            }
            return L < L2 ? 1 : 0;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: java.lang.Class<?>[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    static {
        /*
            java.lang.Class<androidx.coordinatorlayout.widget.CoordinatorLayout> r0 = androidx.coordinatorlayout.widget.CoordinatorLayout.class
            java.lang.Package r0 = r0.getPackage()
            r1 = 0
            if (r0 == 0) goto L_0x000e
            java.lang.String r0 = r0.getName()
            goto L_0x000f
        L_0x000e:
            r0 = r1
        L_0x000f:
            f1958C = r0
            int r0 = android.os.Build.VERSION.SDK_INT
            r2 = 21
            if (r0 < r2) goto L_0x001f
            androidx.coordinatorlayout.widget.CoordinatorLayout$i r0 = new androidx.coordinatorlayout.widget.CoordinatorLayout$i
            r0.<init>()
            f1961F = r0
            goto L_0x0021
        L_0x001f:
            f1961F = r1
        L_0x0021:
            r0 = 2
            java.lang.Class[] r0 = new java.lang.Class[r0]
            r1 = 0
            java.lang.Class<android.content.Context> r2 = android.content.Context.class
            r0[r1] = r2
            r1 = 1
            java.lang.Class<android.util.AttributeSet> r2 = android.util.AttributeSet.class
            r0[r1] = r2
            f1959D = r0
            java.lang.ThreadLocal r0 = new java.lang.ThreadLocal
            r0.<init>()
            f1960E = r0
            androidx.core.util.g r0 = new androidx.core.util.g
            r1 = 12
            r0.<init>(r1)
            f1962G = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.<clinit>():void");
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C5469a.f27791a);
    }

    /* renamed from: E */
    static C0603c m2801E(Context context, AttributeSet attributeSet, String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (str.startsWith(".")) {
            str = context.getPackageName() + str;
        } else if (str.indexOf(46) < 0) {
            String str2 = f1958C;
            if (!TextUtils.isEmpty(str2)) {
                str = str2 + '.' + str;
            }
        }
        try {
            ThreadLocal<Map<String, Constructor<C0603c>>> threadLocal = f1960E;
            Map map = threadLocal.get();
            if (map == null) {
                map = new HashMap();
                threadLocal.set(map);
            }
            Constructor<?> constructor = (Constructor) map.get(str);
            if (constructor == null) {
                constructor = Class.forName(str, false, context.getClassLoader()).getConstructor(f1959D);
                constructor.setAccessible(true);
                map.put(str, constructor);
            }
            return (C0603c) constructor.newInstance(new Object[]{context, attributeSet});
        } catch (Exception e) {
            throw new RuntimeException("Could not inflate Behavior subclass " + str, e);
        }
    }

    /* renamed from: F */
    private boolean m2802F(MotionEvent motionEvent, int i) {
        MotionEvent motionEvent2 = motionEvent;
        int i2 = i;
        int actionMasked = motionEvent.getActionMasked();
        List<View> list = this.f1967c;
        m2818t(list);
        int size = list.size();
        MotionEvent motionEvent3 = null;
        boolean z = false;
        boolean z2 = false;
        for (int i3 = 0; i3 < size; i3++) {
            View view = list.get(i3);
            C0606f fVar = (C0606f) view.getLayoutParams();
            C0603c f = fVar.mo2816f();
            if ((!z && !z2) || actionMasked == 0) {
                if (!z && f != null) {
                    if (i2 == 0) {
                        z = f.mo2792k(this, view, motionEvent2);
                    } else if (i2 == 1) {
                        z = f.mo2781D(this, view, motionEvent2);
                    }
                    if (z) {
                        this.f1975s = view;
                    }
                }
                boolean c = fVar.mo2813c();
                boolean i4 = fVar.mo2819i(this, view);
                z2 = i4 && !c;
                if (i4 && !z2) {
                    break;
                }
            } else if (f != null) {
                if (motionEvent3 == null) {
                    long uptimeMillis = SystemClock.uptimeMillis();
                    motionEvent3 = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                }
                if (i2 == 0) {
                    f.mo2792k(this, view, motionEvent3);
                } else if (i2 == 1) {
                    f.mo2781D(this, view, motionEvent3);
                }
            }
        }
        list.clear();
        return z;
    }

    /* renamed from: G */
    private void m2803G() {
        this.f1965a.clear();
        this.f1966b.mo2839c();
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            C0606f s = mo2768s(childAt);
            s.mo2814d(this, childAt);
            this.f1966b.mo2838b(childAt);
            for (int i2 = 0; i2 < childCount; i2++) {
                if (i2 != i) {
                    View childAt2 = getChildAt(i2);
                    if (s.mo2812b(this, childAt, childAt2)) {
                        if (!this.f1966b.mo2840d(childAt2)) {
                            this.f1966b.mo2838b(childAt2);
                        }
                        this.f1966b.mo2837a(childAt2, childAt);
                    }
                }
            }
        }
        this.f1965a.addAll(this.f1966b.mo2843i());
        Collections.reverse(this.f1965a);
    }

    /* renamed from: I */
    private static void m2804I(Rect rect) {
        rect.setEmpty();
        f1962G.mo3225a(rect);
    }

    /* renamed from: K */
    private void m2805K(boolean z) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            C0603c f = ((C0606f) childAt.getLayoutParams()).mo2816f();
            if (f != null) {
                long uptimeMillis = SystemClock.uptimeMillis();
                MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                if (z) {
                    f.mo2792k(this, childAt, obtain);
                } else {
                    f.mo2781D(this, childAt, obtain);
                }
                obtain.recycle();
            }
        }
        for (int i2 = 0; i2 < childCount; i2++) {
            ((C0606f) getChildAt(i2).getLayoutParams()).mo2823m();
        }
        this.f1975s = null;
        this.f1972h = false;
    }

    /* renamed from: L */
    private static int m2806L(int i) {
        if (i == 0) {
            return 17;
        }
        return i;
    }

    /* renamed from: M */
    private static int m2807M(int i) {
        if ((i & 7) == 0) {
            i |= 8388611;
        }
        return (i & C8710R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 0 ? i | 48 : i;
    }

    /* renamed from: N */
    private static int m2808N(int i) {
        if (i == 0) {
            return 8388661;
        }
        return i;
    }

    /* renamed from: O */
    private void m2809O(View view, int i) {
        C0606f fVar = (C0606f) view.getLayoutParams();
        int i2 = fVar.f1993i;
        if (i2 != i) {
            C0835a0.m3711X(view, i - i2);
            fVar.f1993i = i;
        }
    }

    /* renamed from: P */
    private void m2810P(View view, int i) {
        C0606f fVar = (C0606f) view.getLayoutParams();
        int i2 = fVar.f1994j;
        if (i2 != i) {
            C0835a0.m3712Y(view, i - i2);
            fVar.f1994j = i;
        }
    }

    /* renamed from: R */
    private void m2811R() {
        if (Build.VERSION.SDK_INT >= 21) {
            if (C0835a0.m3762y(this)) {
                if (this.f1963A == null) {
                    this.f1963A = new C0601a();
                }
                C0835a0.m3765z0(this, this.f1963A);
                setSystemUiVisibility(1280);
                return;
            }
            C0835a0.m3765z0(this, (C0953u) null);
        }
    }

    /* renamed from: a */
    private static Rect m2812a() {
        Rect b = f1962G.mo3226b();
        return b == null ? new Rect() : b;
    }

    /* renamed from: c */
    private static int m2813c(int i, int i2, int i3) {
        return i < i2 ? i2 : i > i3 ? i3 : i;
    }

    /* renamed from: d */
    private void m2814d(C0606f fVar, Rect rect, int i, int i2) {
        int width = getWidth();
        int height = getHeight();
        int max = Math.max(getPaddingLeft() + fVar.leftMargin, Math.min(rect.left, ((width - getPaddingRight()) - i) - fVar.rightMargin));
        int max2 = Math.max(getPaddingTop() + fVar.topMargin, Math.min(rect.top, ((height - getPaddingBottom()) - i2) - fVar.bottomMargin));
        rect.set(max, max2, i + max, i2 + max2);
    }

    /* renamed from: e */
    private C0922k0 m2815e(C0922k0 k0Var) {
        C0603c f;
        if (k0Var.mo3421n()) {
            return k0Var;
        }
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (C0835a0.m3762y(childAt) && (f = ((C0606f) childAt.getLayoutParams()).mo2816f()) != null) {
                k0Var = f.mo2787f(this, childAt, k0Var);
                if (k0Var.mo3421n()) {
                    break;
                }
            }
        }
        return k0Var;
    }

    /* renamed from: p */
    private void m2816p(View view, int i, Rect rect, Rect rect2, C0606f fVar, int i2, int i3) {
        int i4;
        int i5;
        int b = C0901e.m4084b(m2806L(fVar.f1987c), i);
        int b2 = C0901e.m4084b(m2807M(fVar.f1988d), i);
        int i6 = b & 7;
        int i7 = b & C8710R.styleable.AppCompatTheme_toolbarNavigationButtonStyle;
        int i8 = b2 & 7;
        int i9 = b2 & C8710R.styleable.AppCompatTheme_toolbarNavigationButtonStyle;
        if (i8 == 1) {
            i4 = rect.left + (rect.width() / 2);
        } else if (i8 != 5) {
            i4 = rect.left;
        } else {
            i4 = rect.right;
        }
        if (i9 == 16) {
            i5 = rect.top + (rect.height() / 2);
        } else if (i9 != 80) {
            i5 = rect.top;
        } else {
            i5 = rect.bottom;
        }
        if (i6 == 1) {
            i4 -= i2 / 2;
        } else if (i6 != 5) {
            i4 -= i2;
        }
        if (i7 == 16) {
            i5 -= i3 / 2;
        } else if (i7 != 80) {
            i5 -= i3;
        }
        rect2.set(i4, i5, i2 + i4, i3 + i5);
    }

    /* renamed from: q */
    private int m2817q(int i) {
        int[] iArr = this.f1974r;
        if (iArr == null) {
            Log.e("CoordinatorLayout", "No keylines defined for " + this + " - attempted index lookup " + i);
            return 0;
        } else if (i >= 0 && i < iArr.length) {
            return iArr[i];
        } else {
            Log.e("CoordinatorLayout", "Keyline index " + i + " out of range for " + this);
            return 0;
        }
    }

    /* renamed from: t */
    private void m2818t(List<View> list) {
        list.clear();
        boolean isChildrenDrawingOrderEnabled = isChildrenDrawingOrderEnabled();
        int childCount = getChildCount();
        for (int i = childCount - 1; i >= 0; i--) {
            list.add(getChildAt(isChildrenDrawingOrderEnabled ? getChildDrawingOrder(childCount, i) : i));
        }
        Comparator<View> comparator = f1961F;
        if (comparator != null) {
            Collections.sort(list, comparator);
        }
    }

    /* renamed from: u */
    private boolean m2819u(View view) {
        return this.f1966b.mo2844j(view);
    }

    /* renamed from: w */
    private void m2820w(View view, int i) {
        C0606f fVar = (C0606f) view.getLayoutParams();
        Rect a = m2812a();
        a.set(getPaddingLeft() + fVar.leftMargin, getPaddingTop() + fVar.topMargin, (getWidth() - getPaddingRight()) - fVar.rightMargin, (getHeight() - getPaddingBottom()) - fVar.bottomMargin);
        if (this.f1979w != null && C0835a0.m3762y(this) && !C0835a0.m3762y(view)) {
            a.left += this.f1979w.mo3417i();
            a.top += this.f1979w.mo3419k();
            a.right -= this.f1979w.mo3418j();
            a.bottom -= this.f1979w.mo3415h();
        }
        Rect a2 = m2812a();
        C0901e.m4083a(m2807M(fVar.f1987c), view.getMeasuredWidth(), view.getMeasuredHeight(), a, a2, i);
        view.layout(a2.left, a2.top, a2.right, a2.bottom);
        m2804I(a);
        m2804I(a2);
    }

    /* renamed from: x */
    private void m2821x(View view, View view2, int i) {
        Rect a = m2812a();
        Rect a2 = m2812a();
        try {
            mo2754n(view2, a);
            mo2755o(view, i, a, a2);
            view.layout(a2.left, a2.top, a2.right, a2.bottom);
        } finally {
            m2804I(a);
            m2804I(a2);
        }
    }

    /* renamed from: y */
    private void m2822y(View view, int i, int i2) {
        C0606f fVar = (C0606f) view.getLayoutParams();
        int b = C0901e.m4084b(m2808N(fVar.f1987c), i2);
        int i3 = b & 7;
        int i4 = b & C8710R.styleable.AppCompatTheme_toolbarNavigationButtonStyle;
        int width = getWidth();
        int height = getHeight();
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        if (i2 == 1) {
            i = width - i;
        }
        int q = m2817q(i) - measuredWidth;
        int i5 = 0;
        if (i3 == 1) {
            q += measuredWidth / 2;
        } else if (i3 == 5) {
            q += measuredWidth;
        }
        if (i4 == 16) {
            i5 = 0 + (measuredHeight / 2);
        } else if (i4 == 80) {
            i5 = measuredHeight + 0;
        }
        int max = Math.max(getPaddingLeft() + fVar.leftMargin, Math.min(q, ((width - getPaddingRight()) - measuredWidth) - fVar.rightMargin));
        int max2 = Math.max(getPaddingTop() + fVar.topMargin, Math.min(i5, ((height - getPaddingBottom()) - measuredHeight) - fVar.bottomMargin));
        view.layout(max, max2, measuredWidth + max, measuredHeight + max2);
    }

    /* renamed from: z */
    private void m2823z(View view, Rect rect, int i) {
        boolean z;
        boolean z2;
        int width;
        int i2;
        int i3;
        int i4;
        int height;
        int i5;
        int i6;
        int i7;
        if (C0835a0.m3705R(view) && view.getWidth() > 0 && view.getHeight() > 0) {
            C0606f fVar = (C0606f) view.getLayoutParams();
            C0603c f = fVar.mo2816f();
            Rect a = m2812a();
            Rect a2 = m2812a();
            a2.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
            if (f == null || !f.mo2783b(this, view, a)) {
                a.set(a2);
            } else if (!a2.contains(a)) {
                throw new IllegalArgumentException("Rect should be within the child's bounds. Rect:" + a.toShortString() + " | Bounds:" + a2.toShortString());
            }
            m2804I(a2);
            if (a.isEmpty()) {
                m2804I(a);
                return;
            }
            int b = C0901e.m4084b(fVar.f1992h, i);
            boolean z3 = true;
            if ((b & 48) != 48 || (i6 = (a.top - fVar.topMargin) - fVar.f1994j) >= (i7 = rect.top)) {
                z = false;
            } else {
                m2810P(view, i7 - i6);
                z = true;
            }
            if ((b & 80) == 80 && (height = ((getHeight() - a.bottom) - fVar.bottomMargin) + fVar.f1994j) < (i5 = rect.bottom)) {
                m2810P(view, height - i5);
                z = true;
            }
            if (!z) {
                m2810P(view, 0);
            }
            if ((b & 3) != 3 || (i3 = (a.left - fVar.leftMargin) - fVar.f1993i) >= (i4 = rect.left)) {
                z2 = false;
            } else {
                m2809O(view, i4 - i3);
                z2 = true;
            }
            if ((b & 5) != 5 || (width = ((getWidth() - a.right) - fVar.rightMargin) + fVar.f1993i) >= (i2 = rect.right)) {
                z3 = z2;
            } else {
                m2809O(view, width - i2);
            }
            if (!z3) {
                m2809O(view, 0);
            }
            m2804I(a);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: A */
    public void mo2726A(View view, int i) {
        C0603c f;
        View view2 = view;
        C0606f fVar = (C0606f) view.getLayoutParams();
        if (fVar.f1995k != null) {
            Rect a = m2812a();
            Rect a2 = m2812a();
            Rect a3 = m2812a();
            mo2754n(fVar.f1995k, a);
            boolean z = false;
            mo2751k(view2, false, a2);
            int measuredWidth = view.getMeasuredWidth();
            int measuredHeight = view.getMeasuredHeight();
            int i2 = measuredHeight;
            m2816p(view, i, a, a3, fVar, measuredWidth, measuredHeight);
            if (!(a3.left == a2.left && a3.top == a2.top)) {
                z = true;
            }
            m2814d(fVar, a3, measuredWidth, i2);
            int i3 = a3.left - a2.left;
            int i4 = a3.top - a2.top;
            if (i3 != 0) {
                C0835a0.m3711X(view2, i3);
            }
            if (i4 != 0) {
                C0835a0.m3712Y(view2, i4);
            }
            if (z && (f = fVar.mo2816f()) != null) {
                f.mo2789h(this, view2, fVar.f1995k);
            }
            m2804I(a);
            m2804I(a2);
            m2804I(a3);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: B */
    public final void mo2727B(int i) {
        boolean z;
        int i2 = i;
        int B = C0835a0.m3682B(this);
        int size = this.f1965a.size();
        Rect a = m2812a();
        Rect a2 = m2812a();
        Rect a3 = m2812a();
        for (int i3 = 0; i3 < size; i3++) {
            View view = this.f1965a.get(i3);
            C0606f fVar = (C0606f) view.getLayoutParams();
            if (i2 != 0 || view.getVisibility() != 8) {
                for (int i4 = 0; i4 < i3; i4++) {
                    if (fVar.f1996l == this.f1965a.get(i4)) {
                        mo2726A(view, B);
                    }
                }
                mo2751k(view, true, a2);
                if (fVar.f1991g != 0 && !a2.isEmpty()) {
                    int b = C0901e.m4084b(fVar.f1991g, B);
                    int i5 = b & C8710R.styleable.AppCompatTheme_toolbarNavigationButtonStyle;
                    if (i5 == 48) {
                        a.top = Math.max(a.top, a2.bottom);
                    } else if (i5 == 80) {
                        a.bottom = Math.max(a.bottom, getHeight() - a2.top);
                    }
                    int i6 = b & 7;
                    if (i6 == 3) {
                        a.left = Math.max(a.left, a2.right);
                    } else if (i6 == 5) {
                        a.right = Math.max(a.right, getWidth() - a2.left);
                    }
                }
                if (fVar.f1992h != 0 && view.getVisibility() == 0) {
                    m2823z(view, a, B);
                }
                if (i2 != 2) {
                    mo2765r(view, a3);
                    if (!a3.equals(a2)) {
                        mo2730H(view, a2);
                    }
                }
                for (int i7 = i3 + 1; i7 < size; i7++) {
                    View view2 = this.f1965a.get(i7);
                    C0606f fVar2 = (C0606f) view2.getLayoutParams();
                    C0603c f = fVar2.mo2816f();
                    if (f != null && f.mo2786e(this, view2, view)) {
                        if (i2 != 0 || !fVar2.mo2817g()) {
                            if (i2 != 2) {
                                z = f.mo2789h(this, view2, view);
                            } else {
                                f.mo2790i(this, view2, view);
                                z = true;
                            }
                            if (i2 == 1) {
                                fVar2.mo2825p(z);
                            }
                        } else {
                            fVar2.mo2821k();
                        }
                    }
                }
            }
        }
        m2804I(a);
        m2804I(a2);
        m2804I(a3);
    }

    /* renamed from: C */
    public void mo2728C(View view, int i) {
        C0606f fVar = (C0606f) view.getLayoutParams();
        if (!fVar.mo2811a()) {
            View view2 = fVar.f1995k;
            if (view2 != null) {
                m2821x(view, view2, i);
                return;
            }
            int i2 = fVar.f1989e;
            if (i2 >= 0) {
                m2822y(view, i2, i);
            } else {
                m2820w(view, i);
            }
        } else {
            throw new IllegalStateException("An anchor may not be changed after CoordinatorLayout measurement begins before layout is complete.");
        }
    }

    /* renamed from: D */
    public void mo2729D(View view, int i, int i2, int i3, int i4) {
        measureChildWithMargins(view, i, i2, i3, i4);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: H */
    public void mo2730H(View view, Rect rect) {
        ((C0606f) view.getLayoutParams()).mo2826q(rect);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: J */
    public void mo2731J() {
        if (this.f1973i && this.f1977u != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.f1977u);
        }
        this.f1978v = false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Q */
    public final C0922k0 mo2732Q(C0922k0 k0Var) {
        if (C0825c.m3642a(this.f1979w, k0Var)) {
            return k0Var;
        }
        this.f1979w = k0Var;
        boolean z = true;
        boolean z2 = k0Var != null && k0Var.mo3419k() > 0;
        this.f1980x = z2;
        if (z2 || getBackground() != null) {
            z = false;
        }
        setWillNotDraw(z);
        C0922k0 e = m2815e(k0Var);
        requestLayout();
        return e;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo2733b() {
        if (this.f1973i) {
            if (this.f1977u == null) {
                this.f1977u = new C0607g();
            }
            getViewTreeObserver().addOnPreDrawListener(this.f1977u);
        }
        this.f1978v = true;
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof C0606f) && super.checkLayoutParams(layoutParams);
    }

    /* access modifiers changed from: protected */
    public boolean drawChild(Canvas canvas, View view, long j) {
        C0606f fVar = (C0606f) view.getLayoutParams();
        C0603c cVar = fVar.f1985a;
        if (cVar != null) {
            float d = cVar.mo2785d(this, view);
            if (d > 0.0f) {
                if (this.f1969e == null) {
                    this.f1969e = new Paint();
                }
                this.f1969e.setColor(fVar.f1985a.mo2784c(this, view));
                this.f1969e.setAlpha(m2813c(Math.round(d * 255.0f), 0, 255));
                int save = canvas.save();
                if (view.isOpaque()) {
                    canvas.clipRect((float) view.getLeft(), (float) view.getTop(), (float) view.getRight(), (float) view.getBottom(), Region.Op.DIFFERENCE);
                }
                canvas.drawRect((float) getPaddingLeft(), (float) getPaddingTop(), (float) (getWidth() - getPaddingRight()), (float) (getHeight() - getPaddingBottom()), this.f1969e);
                canvas.restoreToCount(save);
            }
        }
        return super.drawChild(canvas, view, j);
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f1981y;
        boolean z = false;
        if (drawable != null && drawable.isStateful()) {
            z = false | drawable.setState(drawableState);
        }
        if (z) {
            invalidate();
        }
    }

    /* renamed from: f */
    public void mo2737f(View view) {
        List g = this.f1966b.mo2841g(view);
        if (g != null && !g.isEmpty()) {
            for (int i = 0; i < g.size(); i++) {
                View view2 = (View) g.get(i);
                C0603c f = ((C0606f) view2.getLayoutParams()).mo2816f();
                if (f != null) {
                    f.mo2789h(this, view2, view);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public void mo2738g() {
        int childCount = getChildCount();
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= childCount) {
                break;
            } else if (m2819u(getChildAt(i))) {
                z = true;
                break;
            } else {
                i++;
            }
        }
        if (z == this.f1978v) {
            return;
        }
        if (z) {
            mo2733b();
        } else {
            mo2731J();
        }
    }

    /* access modifiers changed from: package-private */
    public final List<View> getDependencySortedChildren() {
        m2803G();
        return Collections.unmodifiableList(this.f1965a);
    }

    public final C0922k0 getLastWindowInsets() {
        return this.f1979w;
    }

    public int getNestedScrollAxes() {
        return this.f1964B.mo3491a();
    }

    public Drawable getStatusBarBackground() {
        return this.f1981y;
    }

    /* access modifiers changed from: protected */
    public int getSuggestedMinimumHeight() {
        return Math.max(super.getSuggestedMinimumHeight(), getPaddingTop() + getPaddingBottom());
    }

    /* access modifiers changed from: protected */
    public int getSuggestedMinimumWidth() {
        return Math.max(super.getSuggestedMinimumWidth(), getPaddingLeft() + getPaddingRight());
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public C0606f generateDefaultLayoutParams() {
        return new C0606f(-2, -2);
    }

    /* renamed from: i */
    public C0606f generateLayoutParams(AttributeSet attributeSet) {
        return new C0606f(getContext(), attributeSet);
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public C0606f generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof C0606f) {
            return new C0606f((C0606f) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new C0606f((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new C0606f(layoutParams);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public void mo2751k(View view, boolean z, Rect rect) {
        if (view.isLayoutRequested() || view.getVisibility() == 8) {
            rect.setEmpty();
        } else if (z) {
            mo2754n(view, rect);
        } else {
            rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
    }

    /* renamed from: l */
    public List<View> mo2752l(View view) {
        List<View> h = this.f1966b.mo2842h(view);
        this.f1968d.clear();
        if (h != null) {
            this.f1968d.addAll(h);
        }
        return this.f1968d;
    }

    /* renamed from: m */
    public List<View> mo2753m(View view) {
        List g = this.f1966b.mo2841g(view);
        this.f1968d.clear();
        if (g != null) {
            this.f1968d.addAll(g);
        }
        return this.f1968d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public void mo2754n(View view, Rect rect) {
        C0612b.m2911a(this, view, rect);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public void mo2755o(View view, int i, Rect rect, Rect rect2) {
        C0606f fVar = (C0606f) view.getLayoutParams();
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        m2816p(view, i, rect, rect2, fVar, measuredWidth, measuredHeight);
        m2814d(fVar, rect2, measuredWidth, measuredHeight);
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        m2805K(false);
        if (this.f1978v) {
            if (this.f1977u == null) {
                this.f1977u = new C0607g();
            }
            getViewTreeObserver().addOnPreDrawListener(this.f1977u);
        }
        if (this.f1979w == null && C0835a0.m3762y(this)) {
            C0835a0.m3735k0(this);
        }
        this.f1973i = true;
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m2805K(false);
        if (this.f1978v && this.f1977u != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.f1977u);
        }
        View view = this.f1976t;
        if (view != null) {
            onStopNestedScroll(view);
        }
        this.f1973i = false;
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f1980x && this.f1981y != null) {
            C0922k0 k0Var = this.f1979w;
            int k = k0Var != null ? k0Var.mo3419k() : 0;
            if (k > 0) {
                this.f1981y.setBounds(0, 0, getWidth(), k);
                this.f1981y.draw(canvas);
            }
        }
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            m2805K(true);
        }
        boolean F = m2802F(motionEvent, 0);
        if (actionMasked == 1 || actionMasked == 3) {
            m2805K(true);
        }
        return F;
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        C0603c f;
        int B = C0835a0.m3682B(this);
        int size = this.f1965a.size();
        for (int i5 = 0; i5 < size; i5++) {
            View view = this.f1965a.get(i5);
            if (view.getVisibility() != 8 && ((f = ((C0606f) view.getLayoutParams()).mo2816f()) == null || !f.mo2793l(this, view, B))) {
                mo2728C(view, B);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x011a, code lost:
        if (r0.mo2794m(r30, r20, r11, r21, r23, 0) == false) goto L_0x012a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00c7  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00f1  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00fb  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x011d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r31, int r32) {
        /*
            r30 = this;
            r7 = r30
            r30.m2803G()
            r30.mo2738g()
            int r8 = r30.getPaddingLeft()
            int r0 = r30.getPaddingTop()
            int r9 = r30.getPaddingRight()
            int r1 = r30.getPaddingBottom()
            int r10 = androidx.core.view.C0835a0.m3682B(r30)
            r2 = 1
            if (r10 != r2) goto L_0x0021
            r12 = 1
            goto L_0x0022
        L_0x0021:
            r12 = 0
        L_0x0022:
            int r13 = android.view.View.MeasureSpec.getMode(r31)
            int r14 = android.view.View.MeasureSpec.getSize(r31)
            int r15 = android.view.View.MeasureSpec.getMode(r32)
            int r16 = android.view.View.MeasureSpec.getSize(r32)
            int r17 = r8 + r9
            int r18 = r0 + r1
            int r0 = r30.getSuggestedMinimumWidth()
            int r1 = r30.getSuggestedMinimumHeight()
            androidx.core.view.k0 r3 = r7.f1979w
            if (r3 == 0) goto L_0x004b
            boolean r3 = androidx.core.view.C0835a0.m3762y(r30)
            if (r3 == 0) goto L_0x004b
            r19 = 1
            goto L_0x004d
        L_0x004b:
            r19 = 0
        L_0x004d:
            java.util.List<android.view.View> r2 = r7.f1965a
            int r6 = r2.size()
            r5 = r0
            r4 = r1
            r2 = 0
            r3 = 0
        L_0x0057:
            if (r3 >= r6) goto L_0x016f
            java.util.List<android.view.View> r0 = r7.f1965a
            java.lang.Object r0 = r0.get(r3)
            r20 = r0
            android.view.View r20 = (android.view.View) r20
            int r0 = r20.getVisibility()
            r1 = 8
            if (r0 != r1) goto L_0x0073
            r22 = r3
            r29 = r6
            r28 = r8
            goto L_0x0167
        L_0x0073:
            android.view.ViewGroup$LayoutParams r0 = r20.getLayoutParams()
            r1 = r0
            androidx.coordinatorlayout.widget.CoordinatorLayout$f r1 = (androidx.coordinatorlayout.widget.CoordinatorLayout.C0606f) r1
            int r0 = r1.f1989e
            if (r0 < 0) goto L_0x00ba
            if (r13 == 0) goto L_0x00ba
            int r0 = r7.m2817q(r0)
            int r11 = r1.f1987c
            int r11 = m2808N(r11)
            int r11 = androidx.core.view.C0901e.m4084b(r11, r10)
            r11 = r11 & 7
            r22 = r2
            r2 = 3
            if (r11 != r2) goto L_0x0097
            if (r12 == 0) goto L_0x009c
        L_0x0097:
            r2 = 5
            if (r11 != r2) goto L_0x00a8
            if (r12 == 0) goto L_0x00a8
        L_0x009c:
            int r2 = r14 - r9
            int r2 = r2 - r0
            r0 = 0
            int r2 = java.lang.Math.max(r0, r2)
            r21 = r2
            r11 = 0
            goto L_0x00bf
        L_0x00a8:
            if (r11 != r2) goto L_0x00ac
            if (r12 == 0) goto L_0x00b1
        L_0x00ac:
            r2 = 3
            if (r11 != r2) goto L_0x00bc
            if (r12 == 0) goto L_0x00bc
        L_0x00b1:
            int r0 = r0 - r8
            r11 = 0
            int r0 = java.lang.Math.max(r11, r0)
            r21 = r0
            goto L_0x00bf
        L_0x00ba:
            r22 = r2
        L_0x00bc:
            r11 = 0
            r21 = 0
        L_0x00bf:
            if (r19 == 0) goto L_0x00f1
            boolean r0 = androidx.core.view.C0835a0.m3762y(r20)
            if (r0 != 0) goto L_0x00f1
            androidx.core.view.k0 r0 = r7.f1979w
            int r0 = r0.mo3417i()
            androidx.core.view.k0 r2 = r7.f1979w
            int r2 = r2.mo3418j()
            int r0 = r0 + r2
            androidx.core.view.k0 r2 = r7.f1979w
            int r2 = r2.mo3419k()
            androidx.core.view.k0 r11 = r7.f1979w
            int r11 = r11.mo3415h()
            int r2 = r2 + r11
            int r0 = r14 - r0
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r13)
            int r2 = r16 - r2
            int r2 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r15)
            r11 = r0
            r23 = r2
            goto L_0x00f5
        L_0x00f1:
            r11 = r31
            r23 = r32
        L_0x00f5:
            androidx.coordinatorlayout.widget.CoordinatorLayout$c r0 = r1.mo2816f()
            if (r0 == 0) goto L_0x011d
            r24 = 0
            r2 = r1
            r1 = r30
            r26 = r2
            r25 = r22
            r2 = r20
            r22 = r3
            r3 = r11
            r27 = r4
            r4 = r21
            r28 = r8
            r8 = r5
            r5 = r23
            r29 = r6
            r6 = r24
            boolean r0 = r0.mo2794m(r1, r2, r3, r4, r5, r6)
            if (r0 != 0) goto L_0x0137
            goto L_0x012a
        L_0x011d:
            r26 = r1
            r27 = r4
            r29 = r6
            r28 = r8
            r25 = r22
            r22 = r3
            r8 = r5
        L_0x012a:
            r5 = 0
            r0 = r30
            r1 = r20
            r2 = r11
            r3 = r21
            r4 = r23
            r0.mo2729D(r1, r2, r3, r4, r5)
        L_0x0137:
            int r0 = r20.getMeasuredWidth()
            int r0 = r17 + r0
            r1 = r26
            int r2 = r1.leftMargin
            int r0 = r0 + r2
            int r2 = r1.rightMargin
            int r0 = r0 + r2
            int r0 = java.lang.Math.max(r8, r0)
            int r2 = r20.getMeasuredHeight()
            int r2 = r18 + r2
            int r3 = r1.topMargin
            int r2 = r2 + r3
            int r1 = r1.bottomMargin
            int r2 = r2 + r1
            r1 = r27
            int r1 = java.lang.Math.max(r1, r2)
            int r2 = r20.getMeasuredState()
            r11 = r25
            int r2 = android.view.View.combineMeasuredStates(r11, r2)
            r5 = r0
            r4 = r1
        L_0x0167:
            int r3 = r22 + 1
            r8 = r28
            r6 = r29
            goto L_0x0057
        L_0x016f:
            r11 = r2
            r1 = r4
            r8 = r5
            r0 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r0 = r0 & r11
            r2 = r31
            int r0 = android.view.View.resolveSizeAndState(r8, r2, r0)
            int r2 = r11 << 16
            r3 = r32
            int r1 = android.view.View.resolveSizeAndState(r1, r3, r2)
            r7.setMeasuredDimension(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.onMeasure(int, int):void");
    }

    public boolean onNestedFling(View view, float f, float f2, boolean z) {
        C0603c f3;
        int childCount = getChildCount();
        boolean z2 = false;
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() != 8) {
                C0606f fVar = (C0606f) childAt.getLayoutParams();
                if (fVar.mo2820j(0) && (f3 = fVar.mo2816f()) != null) {
                    z2 |= f3.mo2795n(this, childAt, view, f, f2, z);
                }
            }
        }
        if (z2) {
            mo2727B(1);
        }
        return z2;
    }

    public boolean onNestedPreFling(View view, float f, float f2) {
        C0603c f3;
        int childCount = getChildCount();
        boolean z = false;
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() != 8) {
                C0606f fVar = (C0606f) childAt.getLayoutParams();
                if (fVar.mo2820j(0) && (f3 = fVar.mo2816f()) != null) {
                    z |= f3.mo2796o(this, childAt, view, f, f2);
                }
            }
        }
        return z;
    }

    public void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        onNestedPreScroll(view, i, i2, iArr, 0);
    }

    public void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        onNestedScroll(view, i, i2, i3, i4, 0);
    }

    public void onNestedScrollAccepted(View view, View view2, int i) {
        onNestedScrollAccepted(view, view2, i, 0);
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof C0608h)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C0608h hVar = (C0608h) parcelable;
        super.onRestoreInstanceState(hVar.mo20873a());
        SparseArray<Parcelable> sparseArray = hVar.f2004c;
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            int id = childAt.getId();
            C0603c f = mo2768s(childAt).mo2816f();
            if (!(id == -1 || f == null || (parcelable2 = sparseArray.get(id)) == null)) {
                f.mo2805x(this, childAt, parcelable2);
            }
        }
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        Parcelable y;
        C0608h hVar = new C0608h(super.onSaveInstanceState());
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            int id = childAt.getId();
            C0603c f = ((C0606f) childAt.getLayoutParams()).mo2816f();
            if (!(id == -1 || f == null || (y = f.mo2806y(this, childAt)) == null)) {
                sparseArray.append(id, y);
            }
        }
        hVar.f2004c = sparseArray;
        return hVar;
    }

    public boolean onStartNestedScroll(View view, View view2, int i) {
        return onStartNestedScroll(view, view2, i, 0);
    }

    public void onStopNestedScroll(View view) {
        onStopNestedScroll(view, 0);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0012, code lost:
        if (r3 != false) goto L_0x0016;
     */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x004c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            int r2 = r18.getActionMasked()
            android.view.View r3 = r0.f1975s
            r4 = 1
            r5 = 0
            if (r3 != 0) goto L_0x0015
            boolean r3 = r0.m2802F(r1, r4)
            if (r3 == 0) goto L_0x002b
            goto L_0x0016
        L_0x0015:
            r3 = 0
        L_0x0016:
            android.view.View r6 = r0.f1975s
            android.view.ViewGroup$LayoutParams r6 = r6.getLayoutParams()
            androidx.coordinatorlayout.widget.CoordinatorLayout$f r6 = (androidx.coordinatorlayout.widget.CoordinatorLayout.C0606f) r6
            androidx.coordinatorlayout.widget.CoordinatorLayout$c r6 = r6.mo2816f()
            if (r6 == 0) goto L_0x002b
            android.view.View r7 = r0.f1975s
            boolean r6 = r6.mo2781D(r0, r7, r1)
            goto L_0x002c
        L_0x002b:
            r6 = 0
        L_0x002c:
            android.view.View r7 = r0.f1975s
            r8 = 0
            if (r7 != 0) goto L_0x0037
            boolean r1 = super.onTouchEvent(r18)
            r6 = r6 | r1
            goto L_0x004a
        L_0x0037:
            if (r3 == 0) goto L_0x004a
            long r11 = android.os.SystemClock.uptimeMillis()
            r13 = 3
            r14 = 0
            r15 = 0
            r16 = 0
            r9 = r11
            android.view.MotionEvent r8 = android.view.MotionEvent.obtain(r9, r11, r13, r14, r15, r16)
            super.onTouchEvent(r8)
        L_0x004a:
            if (r8 == 0) goto L_0x004f
            r8.recycle()
        L_0x004f:
            if (r2 == r4) goto L_0x0054
            r1 = 3
            if (r2 != r1) goto L_0x0057
        L_0x0054:
            r0.m2805K(r5)
        L_0x0057:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.onTouchEvent(android.view.MotionEvent):boolean");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public void mo2765r(View view, Rect rect) {
        rect.set(((C0606f) view.getLayoutParams()).mo2818h());
    }

    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        C0603c f = ((C0606f) view.getLayoutParams()).mo2816f();
        if (f == null || !f.mo2804w(this, view, rect, z)) {
            return super.requestChildRectangleOnScreen(view, rect, z);
        }
        return true;
    }

    public void requestDisallowInterceptTouchEvent(boolean z) {
        super.requestDisallowInterceptTouchEvent(z);
        if (z && !this.f1972h) {
            m2805K(false);
            this.f1972h = true;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public C0606f mo2768s(View view) {
        C0606f fVar = (C0606f) view.getLayoutParams();
        if (!fVar.f1986b) {
            if (view instanceof C0602b) {
                C0603c behavior = ((C0602b) view).getBehavior();
                if (behavior == null) {
                    Log.e("CoordinatorLayout", "Attached behavior class is null");
                }
                fVar.mo2824o(behavior);
                fVar.f1986b = true;
            } else {
                C0604d dVar = null;
                for (Class cls = view.getClass(); cls != null; cls = cls.getSuperclass()) {
                    dVar = (C0604d) cls.getAnnotation(C0604d.class);
                    if (dVar != null) {
                        break;
                    }
                }
                if (dVar != null) {
                    try {
                        fVar.mo2824o((C0603c) dVar.value().getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
                    } catch (Exception e) {
                        Log.e("CoordinatorLayout", "Default behavior class " + dVar.value().getName() + " could not be instantiated. Did you forget a default constructor?", e);
                    }
                }
                fVar.f1986b = true;
            }
        }
        return fVar;
    }

    public void setFitsSystemWindows(boolean z) {
        super.setFitsSystemWindows(z);
        m2811R();
    }

    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.f1982z = onHierarchyChangeListener;
    }

    public void setStatusBarBackground(Drawable drawable) {
        Drawable drawable2 = this.f1981y;
        if (drawable2 != drawable) {
            Drawable drawable3 = null;
            if (drawable2 != null) {
                drawable2.setCallback((Drawable.Callback) null);
            }
            if (drawable != null) {
                drawable3 = drawable.mutate();
            }
            this.f1981y = drawable3;
            if (drawable3 != null) {
                if (drawable3.isStateful()) {
                    this.f1981y.setState(getDrawableState());
                }
                C0732a.m3375m(this.f1981y, C0835a0.m3682B(this));
                this.f1981y.setVisible(getVisibility() == 0, false);
                this.f1981y.setCallback(this);
            }
            C0835a0.m3723e0(this);
        }
    }

    public void setStatusBarBackgroundColor(int i) {
        setStatusBarBackground(new ColorDrawable(i));
    }

    public void setStatusBarBackgroundResource(int i) {
        setStatusBarBackground(i != 0 ? C0681a.m3150f(getContext(), i) : null);
    }

    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean z = i == 0;
        Drawable drawable = this.f1981y;
        if (drawable != null && drawable.isVisible() != z) {
            this.f1981y.setVisible(z, false);
        }
    }

    /* renamed from: v */
    public boolean mo2775v(View view, int i, int i2) {
        Rect a = m2812a();
        mo2754n(view, a);
        try {
            return a.contains(i, i2);
        } finally {
            m2804I(a);
        }
    }

    /* access modifiers changed from: protected */
    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f1981y;
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedArray typedArray;
        this.f1965a = new ArrayList();
        this.f1966b = new C0611a<>();
        this.f1967c = new ArrayList();
        this.f1968d = new ArrayList();
        this.f1970f = new int[2];
        this.f1971g = new int[2];
        this.f1964B = new C0952t(this);
        if (i == 0) {
            typedArray = context.obtainStyledAttributes(attributeSet, C5471c.f27794b, 0, C5470b.f27792a);
        } else {
            typedArray = context.obtainStyledAttributes(attributeSet, C5471c.f27794b, i, 0);
        }
        if (Build.VERSION.SDK_INT >= 29) {
            if (i == 0) {
                saveAttributeDataForStyleable(context, C5471c.f27794b, attributeSet, typedArray, 0, C5470b.f27792a);
            } else {
                saveAttributeDataForStyleable(context, C5471c.f27794b, attributeSet, typedArray, i, 0);
            }
        }
        int resourceId = typedArray.getResourceId(C5471c.f27795c, 0);
        if (resourceId != 0) {
            Resources resources = context.getResources();
            this.f1974r = resources.getIntArray(resourceId);
            float f = resources.getDisplayMetrics().density;
            int length = this.f1974r.length;
            for (int i2 = 0; i2 < length; i2++) {
                int[] iArr = this.f1974r;
                iArr[i2] = (int) (((float) iArr[i2]) * f);
            }
        }
        this.f1981y = typedArray.getDrawable(C5471c.f27796d);
        typedArray.recycle();
        m2811R();
        super.setOnHierarchyChangeListener(new C0605e());
        if (C0835a0.m3764z(this) == 0) {
            C0835a0.m3761x0(this, 1);
        }
    }

    public void onNestedPreScroll(View view, int i, int i2, int[] iArr, int i3) {
        C0603c f;
        int i4;
        int i5;
        int childCount = getChildCount();
        boolean z = false;
        int i6 = 0;
        int i7 = 0;
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = getChildAt(i8);
            if (childAt.getVisibility() == 8) {
                int i9 = i3;
            } else {
                C0606f fVar = (C0606f) childAt.getLayoutParams();
                if (fVar.mo2820j(i3) && (f = fVar.mo2816f()) != null) {
                    int[] iArr2 = this.f1970f;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    f.mo2798q(this, childAt, view, i, i2, iArr2, i3);
                    int[] iArr3 = this.f1970f;
                    if (i > 0) {
                        i4 = Math.max(i6, iArr3[0]);
                    } else {
                        i4 = Math.min(i6, iArr3[0]);
                    }
                    i6 = i4;
                    int[] iArr4 = this.f1970f;
                    if (i2 > 0) {
                        i5 = Math.max(i7, iArr4[1]);
                    } else {
                        i5 = Math.min(i7, iArr4[1]);
                    }
                    i7 = i5;
                    z = true;
                }
            }
        }
        iArr[0] = i6;
        iArr[1] = i7;
        if (z) {
            mo2727B(1);
        }
    }

    public void onNestedScroll(View view, int i, int i2, int i3, int i4, int i5) {
        onNestedScroll(view, i, i2, i3, i4, 0, this.f1971g);
    }

    public void onNestedScrollAccepted(View view, View view2, int i, int i2) {
        C0603c f;
        this.f1964B.mo3493c(view, view2, i, i2);
        this.f1976t = view2;
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            C0606f fVar = (C0606f) childAt.getLayoutParams();
            if (fVar.mo2820j(i2) && (f = fVar.mo2816f()) != null) {
                f.mo2803v(this, childAt, view, view2, i, i2);
            }
        }
    }

    public boolean onStartNestedScroll(View view, View view2, int i, int i2) {
        int i3 = i2;
        int childCount = getChildCount();
        boolean z = false;
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            if (childAt.getVisibility() != 8) {
                C0606f fVar = (C0606f) childAt.getLayoutParams();
                C0603c f = fVar.mo2816f();
                if (f != null) {
                    boolean A = f.mo2778A(this, childAt, view, view2, i, i2);
                    z |= A;
                    fVar.mo2827r(i3, A);
                } else {
                    fVar.mo2827r(i3, false);
                }
            }
        }
        return z;
    }

    public void onStopNestedScroll(View view, int i) {
        this.f1964B.mo3495e(view, i);
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            C0606f fVar = (C0606f) childAt.getLayoutParams();
            if (fVar.mo2820j(i)) {
                C0603c f = fVar.mo2816f();
                if (f != null) {
                    f.mo2780C(this, childAt, view, i);
                }
                fVar.mo2822l(i);
                fVar.mo2821k();
            }
        }
        this.f1976t = null;
    }

    public void onNestedScroll(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        C0603c f;
        int i6;
        int i7;
        int childCount = getChildCount();
        boolean z = false;
        int i8 = 0;
        int i9 = 0;
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() != 8) {
                C0606f fVar = (C0606f) childAt.getLayoutParams();
                if (fVar.mo2820j(i5) && (f = fVar.mo2816f()) != null) {
                    int[] iArr2 = this.f1970f;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    f.mo2801t(this, childAt, view, i, i2, i3, i4, i5, iArr2);
                    int[] iArr3 = this.f1970f;
                    if (i3 > 0) {
                        i6 = Math.max(i8, iArr3[0]);
                    } else {
                        i6 = Math.min(i8, iArr3[0]);
                    }
                    i8 = i6;
                    if (i4 > 0) {
                        i7 = Math.max(i9, this.f1970f[1]);
                    } else {
                        i7 = Math.min(i9, this.f1970f[1]);
                    }
                    i9 = i7;
                    z = true;
                }
            }
        }
        iArr[0] = iArr[0] + i8;
        iArr[1] = iArr[1] + i9;
        if (z) {
            mo2727B(1);
        }
    }

    /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$h */
    protected static class C0608h extends C6079a {
        public static final Parcelable.Creator<C0608h> CREATOR = new C0609a();

        /* renamed from: c */
        SparseArray<Parcelable> f2004c;

        /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$h$a */
        static class C0609a implements Parcelable.ClassLoaderCreator<C0608h> {
            C0609a() {
            }

            /* renamed from: a */
            public C0608h createFromParcel(Parcel parcel) {
                return new C0608h(parcel, (ClassLoader) null);
            }

            /* renamed from: b */
            public C0608h createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new C0608h(parcel, classLoader);
            }

            /* renamed from: c */
            public C0608h[] newArray(int i) {
                return new C0608h[i];
            }
        }

        public C0608h(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            int readInt = parcel.readInt();
            int[] iArr = new int[readInt];
            parcel.readIntArray(iArr);
            Parcelable[] readParcelableArray = parcel.readParcelableArray(classLoader);
            this.f2004c = new SparseArray<>(readInt);
            for (int i = 0; i < readInt; i++) {
                this.f2004c.append(iArr[i], readParcelableArray[i]);
            }
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            SparseArray<Parcelable> sparseArray = this.f2004c;
            int size = sparseArray != null ? sparseArray.size() : 0;
            parcel.writeInt(size);
            int[] iArr = new int[size];
            Parcelable[] parcelableArr = new Parcelable[size];
            for (int i2 = 0; i2 < size; i2++) {
                iArr[i2] = this.f2004c.keyAt(i2);
                parcelableArr[i2] = this.f2004c.valueAt(i2);
            }
            parcel.writeIntArray(iArr);
            parcel.writeParcelableArray(parcelableArr, i);
        }

        public C0608h(Parcelable parcelable) {
            super(parcelable);
        }
    }

    /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$f */
    public static class C0606f extends ViewGroup.MarginLayoutParams {

        /* renamed from: a */
        C0603c f1985a;

        /* renamed from: b */
        boolean f1986b = false;

        /* renamed from: c */
        public int f1987c = 0;

        /* renamed from: d */
        public int f1988d = 0;

        /* renamed from: e */
        public int f1989e = -1;

        /* renamed from: f */
        int f1990f = -1;

        /* renamed from: g */
        public int f1991g = 0;

        /* renamed from: h */
        public int f1992h = 0;

        /* renamed from: i */
        int f1993i;

        /* renamed from: j */
        int f1994j;

        /* renamed from: k */
        View f1995k;

        /* renamed from: l */
        View f1996l;

        /* renamed from: m */
        private boolean f1997m;

        /* renamed from: n */
        private boolean f1998n;

        /* renamed from: o */
        private boolean f1999o;

        /* renamed from: p */
        private boolean f2000p;

        /* renamed from: q */
        final Rect f2001q = new Rect();

        /* renamed from: r */
        Object f2002r;

        public C0606f(int i, int i2) {
            super(i, i2);
        }

        /* renamed from: n */
        private void m2876n(View view, CoordinatorLayout coordinatorLayout) {
            View findViewById = coordinatorLayout.findViewById(this.f1990f);
            this.f1995k = findViewById;
            if (findViewById != null) {
                if (findViewById != coordinatorLayout) {
                    ViewParent parent = findViewById.getParent();
                    while (parent != coordinatorLayout && parent != null) {
                        if (parent != view) {
                            if (parent instanceof View) {
                                findViewById = (View) parent;
                            }
                            parent = parent.getParent();
                        } else if (coordinatorLayout.isInEditMode()) {
                            this.f1996l = null;
                            this.f1995k = null;
                            return;
                        } else {
                            throw new IllegalStateException("Anchor must not be a descendant of the anchored view");
                        }
                    }
                    this.f1996l = findViewById;
                } else if (coordinatorLayout.isInEditMode()) {
                    this.f1996l = null;
                    this.f1995k = null;
                } else {
                    throw new IllegalStateException("View can not be anchored to the the parent CoordinatorLayout");
                }
            } else if (coordinatorLayout.isInEditMode()) {
                this.f1996l = null;
                this.f1995k = null;
            } else {
                throw new IllegalStateException("Could not find CoordinatorLayout descendant view with id " + coordinatorLayout.getResources().getResourceName(this.f1990f) + " to anchor view " + view);
            }
        }

        /* renamed from: s */
        private boolean m2877s(View view, int i) {
            int b = C0901e.m4084b(((C0606f) view.getLayoutParams()).f1991g, i);
            return b != 0 && (C0901e.m4084b(this.f1992h, i) & b) == b;
        }

        /* renamed from: t */
        private boolean m2878t(View view, CoordinatorLayout coordinatorLayout) {
            if (this.f1995k.getId() != this.f1990f) {
                return false;
            }
            View view2 = this.f1995k;
            for (ViewParent parent = view2.getParent(); parent != coordinatorLayout; parent = parent.getParent()) {
                if (parent == null || parent == view) {
                    this.f1996l = null;
                    this.f1995k = null;
                    return false;
                }
                if (parent instanceof View) {
                    view2 = (View) parent;
                }
            }
            this.f1996l = view2;
            return true;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo2811a() {
            return this.f1995k == null && this.f1990f != -1;
        }

        /* access modifiers changed from: package-private */
        /* JADX WARNING: Code restructure failed: missing block: B:4:0x000e, code lost:
            r0 = r1.f1985a;
         */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean mo2812b(androidx.coordinatorlayout.widget.CoordinatorLayout r2, android.view.View r3, android.view.View r4) {
            /*
                r1 = this;
                android.view.View r0 = r1.f1996l
                if (r4 == r0) goto L_0x001b
                int r0 = androidx.core.view.C0835a0.m3682B(r2)
                boolean r0 = r1.m2877s(r4, r0)
                if (r0 != 0) goto L_0x001b
                androidx.coordinatorlayout.widget.CoordinatorLayout$c r0 = r1.f1985a
                if (r0 == 0) goto L_0x0019
                boolean r2 = r0.mo2786e(r2, r3, r4)
                if (r2 == 0) goto L_0x0019
                goto L_0x001b
            L_0x0019:
                r2 = 0
                goto L_0x001c
            L_0x001b:
                r2 = 1
            L_0x001c:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.C0606f.mo2812b(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.View):boolean");
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public boolean mo2813c() {
            if (this.f1985a == null) {
                this.f1997m = false;
            }
            return this.f1997m;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public View mo2814d(CoordinatorLayout coordinatorLayout, View view) {
            if (this.f1990f == -1) {
                this.f1996l = null;
                this.f1995k = null;
                return null;
            }
            if (this.f1995k == null || !m2878t(view, coordinatorLayout)) {
                m2876n(view, coordinatorLayout);
            }
            return this.f1995k;
        }

        /* renamed from: e */
        public int mo2815e() {
            return this.f1990f;
        }

        /* renamed from: f */
        public C0603c mo2816f() {
            return this.f1985a;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: g */
        public boolean mo2817g() {
            return this.f2000p;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: h */
        public Rect mo2818h() {
            return this.f2001q;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: i */
        public boolean mo2819i(CoordinatorLayout coordinatorLayout, View view) {
            boolean z = this.f1997m;
            if (z) {
                return true;
            }
            C0603c cVar = this.f1985a;
            boolean a = (cVar != null ? cVar.mo2782a(coordinatorLayout, view) : false) | z;
            this.f1997m = a;
            return a;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: j */
        public boolean mo2820j(int i) {
            if (i == 0) {
                return this.f1998n;
            }
            if (i != 1) {
                return false;
            }
            return this.f1999o;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: k */
        public void mo2821k() {
            this.f2000p = false;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: l */
        public void mo2822l(int i) {
            mo2827r(i, false);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: m */
        public void mo2823m() {
            this.f1997m = false;
        }

        /* renamed from: o */
        public void mo2824o(C0603c cVar) {
            C0603c cVar2 = this.f1985a;
            if (cVar2 != cVar) {
                if (cVar2 != null) {
                    cVar2.mo2791j();
                }
                this.f1985a = cVar;
                this.f2002r = null;
                this.f1986b = true;
                if (cVar != null) {
                    cVar.mo2788g(this);
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: p */
        public void mo2825p(boolean z) {
            this.f2000p = z;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: q */
        public void mo2826q(Rect rect) {
            this.f2001q.set(rect);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: r */
        public void mo2827r(int i, boolean z) {
            if (i == 0) {
                this.f1998n = z;
            } else if (i == 1) {
                this.f1999o = z;
            }
        }

        C0606f(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C5471c.f27797e);
            this.f1987c = obtainStyledAttributes.getInteger(C5471c.f27798f, 0);
            this.f1990f = obtainStyledAttributes.getResourceId(C5471c.f27799g, -1);
            this.f1988d = obtainStyledAttributes.getInteger(C5471c.f27800h, 0);
            this.f1989e = obtainStyledAttributes.getInteger(C5471c.f27804l, -1);
            this.f1991g = obtainStyledAttributes.getInt(C5471c.f27803k, 0);
            this.f1992h = obtainStyledAttributes.getInt(C5471c.f27802j, 0);
            int i = C5471c.f27801i;
            boolean hasValue = obtainStyledAttributes.hasValue(i);
            this.f1986b = hasValue;
            if (hasValue) {
                this.f1985a = CoordinatorLayout.m2801E(context, attributeSet, obtainStyledAttributes.getString(i));
            }
            obtainStyledAttributes.recycle();
            C0603c cVar = this.f1985a;
            if (cVar != null) {
                cVar.mo2788g(this);
            }
        }

        public C0606f(C0606f fVar) {
            super(fVar);
        }

        public C0606f(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public C0606f(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }
}
