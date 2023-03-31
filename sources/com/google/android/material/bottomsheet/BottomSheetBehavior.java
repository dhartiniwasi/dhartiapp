package com.google.android.material.bottomsheet;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.C0835a0;
import androidx.core.view.accessibility.C0862c;
import androidx.core.view.accessibility.C0873f;
import com.facebook.ads.AdError;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import p151v.C5753a;
import p169y.C6079a;
import p175z.C6178c;
import p227f6.C10126b;
import p227f6.C10128d;
import p227f6.C10134j;
import p227f6.C10135k;
import p346s6.C12456c;
import p375v6.C12822g;
import p375v6.C12829k;

public class BottomSheetBehavior<V extends View> extends CoordinatorLayout.C0603c<V> {

    /* renamed from: K */
    private static final int f33352K = C10134j.Widget_Design_BottomSheet_Modal;

    /* renamed from: A */
    int f33353A;

    /* renamed from: B */
    WeakReference<V> f33354B;

    /* renamed from: C */
    WeakReference<View> f33355C;

    /* renamed from: D */
    private final ArrayList<C7605e> f33356D = new ArrayList<>();

    /* renamed from: E */
    private VelocityTracker f33357E;

    /* renamed from: F */
    int f33358F;

    /* renamed from: G */
    private int f33359G;

    /* renamed from: H */
    boolean f33360H;

    /* renamed from: I */
    private Map<View, Integer> f33361I;

    /* renamed from: J */
    private final C6178c.C6181c f33362J = new C7603c();

    /* renamed from: a */
    private int f33363a = 0;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public boolean f33364b = true;

    /* renamed from: c */
    private float f33365c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public int f33366d;

    /* renamed from: e */
    private boolean f33367e;

    /* renamed from: f */
    private int f33368f;

    /* renamed from: g */
    private boolean f33369g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public C12822g f33370h;

    /* renamed from: i */
    private C12829k f33371i;

    /* renamed from: j */
    private boolean f33372j;

    /* renamed from: k */
    private BottomSheetBehavior<V>.g f33373k = null;

    /* renamed from: l */
    private ValueAnimator f33374l;

    /* renamed from: m */
    int f33375m;

    /* renamed from: n */
    int f33376n;

    /* renamed from: o */
    int f33377o;

    /* renamed from: p */
    float f33378p = 0.5f;

    /* renamed from: q */
    int f33379q;

    /* renamed from: r */
    float f33380r = -1.0f;

    /* renamed from: s */
    boolean f33381s;
    /* access modifiers changed from: private */

    /* renamed from: t */
    public boolean f33382t;

    /* renamed from: u */
    int f33383u = 4;

    /* renamed from: v */
    C6178c f33384v;

    /* renamed from: w */
    private boolean f33385w;

    /* renamed from: x */
    private int f33386x;

    /* renamed from: y */
    private boolean f33387y;

    /* renamed from: z */
    int f33388z;

    /* renamed from: com.google.android.material.bottomsheet.BottomSheetBehavior$a */
    class C7601a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ View f33389a;

        /* renamed from: b */
        final /* synthetic */ int f33390b;

        C7601a(View view, int i) {
            this.f33389a = view;
            this.f33390b = i;
        }

        public void run() {
            BottomSheetBehavior.this.mo24951f0(this.f33389a, this.f33390b);
        }
    }

    /* renamed from: com.google.android.material.bottomsheet.BottomSheetBehavior$b */
    class C7602b implements ValueAnimator.AnimatorUpdateListener {
        C7602b() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            if (BottomSheetBehavior.this.f33370h != null) {
                BottomSheetBehavior.this.f33370h.mo37746U(floatValue);
            }
        }
    }

    /* renamed from: com.google.android.material.bottomsheet.BottomSheetBehavior$c */
    class C7603c extends C6178c.C6181c {
        C7603c() {
        }

        /* renamed from: a */
        public int mo21089a(View view, int i, int i2) {
            return view.getLeft();
        }

        /* renamed from: b */
        public int mo21090b(View view, int i, int i2) {
            int G = BottomSheetBehavior.this.m42266R();
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            return C5753a.m34335b(i, G, bottomSheetBehavior.f33381s ? bottomSheetBehavior.f33353A : bottomSheetBehavior.f33379q);
        }

        /* renamed from: e */
        public int mo21093e(View view) {
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            if (bottomSheetBehavior.f33381s) {
                return bottomSheetBehavior.f33353A;
            }
            return bottomSheetBehavior.f33379q;
        }

        /* renamed from: j */
        public void mo21098j(int i) {
            if (i == 1) {
                BottomSheetBehavior.this.mo24950e0(1);
            }
        }

        /* renamed from: k */
        public void mo21099k(View view, int i, int i2, int i3, int i4) {
            BottomSheetBehavior.this.mo24939P(i2);
        }

        /* renamed from: l */
        public void mo21100l(View view, float f, float f2) {
            int i;
            int i2;
            int i3 = 4;
            if (f2 >= 0.0f) {
                BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
                if (bottomSheetBehavior.f33381s && bottomSheetBehavior.mo24952h0(view, f2) && (view.getTop() > BottomSheetBehavior.this.f33379q || Math.abs(f) < Math.abs(f2))) {
                    i = BottomSheetBehavior.this.f33353A;
                    i3 = 5;
                    BottomSheetBehavior.this.mo24953i0(view, i3, i, true);
                } else if (f2 == 0.0f || Math.abs(f) > Math.abs(f2)) {
                    int top = view.getTop();
                    if (!BottomSheetBehavior.this.f33364b) {
                        BottomSheetBehavior bottomSheetBehavior2 = BottomSheetBehavior.this;
                        int i4 = bottomSheetBehavior2.f33377o;
                        if (top < i4) {
                            if (top < Math.abs(top - bottomSheetBehavior2.f33379q)) {
                                i = BottomSheetBehavior.this.f33375m;
                            } else {
                                i2 = BottomSheetBehavior.this.f33377o;
                            }
                        } else if (Math.abs(top - i4) < Math.abs(top - BottomSheetBehavior.this.f33379q)) {
                            i2 = BottomSheetBehavior.this.f33377o;
                        } else {
                            i = BottomSheetBehavior.this.f33379q;
                            BottomSheetBehavior.this.mo24953i0(view, i3, i, true);
                        }
                        i3 = 6;
                        BottomSheetBehavior.this.mo24953i0(view, i3, i, true);
                    } else if (Math.abs(top - BottomSheetBehavior.this.f33376n) < Math.abs(top - BottomSheetBehavior.this.f33379q)) {
                        i = BottomSheetBehavior.this.f33376n;
                    } else {
                        i = BottomSheetBehavior.this.f33379q;
                        BottomSheetBehavior.this.mo24953i0(view, i3, i, true);
                    }
                } else {
                    if (BottomSheetBehavior.this.f33364b) {
                        i = BottomSheetBehavior.this.f33379q;
                    } else {
                        int top2 = view.getTop();
                        if (Math.abs(top2 - BottomSheetBehavior.this.f33377o) < Math.abs(top2 - BottomSheetBehavior.this.f33379q)) {
                            i2 = BottomSheetBehavior.this.f33377o;
                            i3 = 6;
                        } else {
                            i = BottomSheetBehavior.this.f33379q;
                        }
                    }
                    BottomSheetBehavior.this.mo24953i0(view, i3, i, true);
                }
            } else if (BottomSheetBehavior.this.f33364b) {
                i = BottomSheetBehavior.this.f33376n;
            } else {
                int top3 = view.getTop();
                BottomSheetBehavior bottomSheetBehavior3 = BottomSheetBehavior.this;
                int i5 = bottomSheetBehavior3.f33377o;
                if (top3 > i5) {
                    i2 = i5;
                    i3 = 6;
                    BottomSheetBehavior.this.mo24953i0(view, i3, i, true);
                }
                i = bottomSheetBehavior3.f33375m;
            }
            i3 = 3;
            BottomSheetBehavior.this.mo24953i0(view, i3, i, true);
        }

        /* renamed from: m */
        public boolean mo21101m(View view, int i) {
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            int i2 = bottomSheetBehavior.f33383u;
            if (i2 == 1 || bottomSheetBehavior.f33360H) {
                return false;
            }
            if (i2 == 3 && bottomSheetBehavior.f33358F == i) {
                WeakReference<View> weakReference = bottomSheetBehavior.f33355C;
                View view2 = weakReference != null ? (View) weakReference.get() : null;
                if (view2 != null && view2.canScrollVertically(-1)) {
                    return false;
                }
            }
            WeakReference<V> weakReference2 = BottomSheetBehavior.this.f33354B;
            if (weakReference2 == null || weakReference2.get() != view) {
                return false;
            }
            return true;
        }
    }

    /* renamed from: com.google.android.material.bottomsheet.BottomSheetBehavior$d */
    class C7604d implements C0873f {

        /* renamed from: a */
        final /* synthetic */ int f33394a;

        C7604d(int i) {
            this.f33394a = i;
        }

        /* renamed from: a */
        public boolean mo3353a(View view, C0873f.C0874a aVar) {
            BottomSheetBehavior.this.mo24949d0(this.f33394a);
            return true;
        }
    }

    /* renamed from: com.google.android.material.bottomsheet.BottomSheetBehavior$e */
    public static abstract class C7605e {
        /* renamed from: a */
        public abstract void mo24956a(View view, float f);

        /* renamed from: b */
        public abstract void mo24957b(View view, int i);
    }

    /* renamed from: com.google.android.material.bottomsheet.BottomSheetBehavior$g */
    private class C7608g implements Runnable {

        /* renamed from: a */
        private final View f33401a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public boolean f33402b;

        /* renamed from: c */
        int f33403c;

        C7608g(View view, int i) {
            this.f33401a = view;
            this.f33403c = i;
        }

        public void run() {
            C6178c cVar = BottomSheetBehavior.this.f33384v;
            if (cVar == null || !cVar.mo21080k(true)) {
                BottomSheetBehavior.this.mo24950e0(this.f33403c);
            } else {
                C0835a0.m3725f0(this.f33401a, this);
            }
            this.f33402b = false;
        }
    }

    public BottomSheetBehavior() {
    }

    /* renamed from: J */
    private void m42260J(V v, C0862c.C0863a aVar, int i) {
        C0835a0.m3733j0(v, aVar, (CharSequence) null, new C7604d(i));
    }

    /* renamed from: K */
    private void m42261K() {
        int i;
        if (this.f33367e) {
            i = Math.max(this.f33368f, this.f33353A - ((this.f33388z * 9) / 16));
        } else {
            i = this.f33366d;
        }
        if (this.f33364b) {
            this.f33379q = Math.max(this.f33353A - i, this.f33376n);
        } else {
            this.f33379q = this.f33353A - i;
        }
    }

    /* renamed from: L */
    private void m42262L() {
        this.f33377o = (int) (((float) this.f33353A) * (1.0f - this.f33378p));
    }

    /* renamed from: M */
    private void m42263M(Context context, AttributeSet attributeSet, boolean z) {
        m42264N(context, attributeSet, z, (ColorStateList) null);
    }

    /* renamed from: N */
    private void m42264N(Context context, AttributeSet attributeSet, boolean z, ColorStateList colorStateList) {
        if (this.f33369g) {
            this.f33371i = C12829k.m60633e(context, attributeSet, C10126b.bottomSheetStyle, f33352K).mo37798m();
            C12822g gVar = new C12822g(this.f33371i);
            this.f33370h = gVar;
            gVar.mo37741L(context);
            if (!z || colorStateList == null) {
                TypedValue typedValue = new TypedValue();
                context.getTheme().resolveAttribute(16842801, typedValue, true);
                this.f33370h.setTint(typedValue.data);
                return;
            }
            this.f33370h.mo37745T(colorStateList);
        }
    }

    /* renamed from: O */
    private void m42265O() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        this.f33374l = ofFloat;
        ofFloat.setDuration(500);
        this.f33374l.addUpdateListener(new C7602b());
    }

    /* access modifiers changed from: private */
    /* renamed from: R */
    public int m42266R() {
        return this.f33364b ? this.f33376n : this.f33375m;
    }

    /* renamed from: S */
    private float m42267S() {
        VelocityTracker velocityTracker = this.f33357E;
        if (velocityTracker == null) {
            return 0.0f;
        }
        velocityTracker.computeCurrentVelocity(AdError.NETWORK_ERROR_CODE, this.f33365c);
        return this.f33357E.getYVelocity(this.f33358F);
    }

    /* renamed from: T */
    private void m42268T() {
        this.f33358F = -1;
        VelocityTracker velocityTracker = this.f33357E;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f33357E = null;
        }
    }

    /* renamed from: U */
    private void m42269U(C7606f fVar) {
        int i = this.f33363a;
        if (i != 0) {
            if (i == -1 || (i & 1) == 1) {
                this.f33366d = fVar.f33397d;
            }
            if (i == -1 || (i & 2) == 2) {
                this.f33364b = fVar.f33398e;
            }
            if (i == -1 || (i & 4) == 4) {
                this.f33381s = fVar.f33399f;
            }
            if (i == -1 || (i & 8) == 8) {
                this.f33382t = fVar.f33400g;
            }
        }
    }

    /* renamed from: g0 */
    private void m42270g0(int i) {
        View view = (View) this.f33354B.get();
        if (view != null) {
            ViewParent parent = view.getParent();
            if (parent == null || !parent.isLayoutRequested() || !C0835a0.m3704Q(view)) {
                mo24951f0(view, i);
            } else {
                view.post(new C7601a(view, i));
            }
        }
    }

    /* renamed from: j0 */
    private void m42271j0() {
        View view;
        WeakReference<V> weakReference = this.f33354B;
        if (weakReference != null && (view = (View) weakReference.get()) != null) {
            C0835a0.m3729h0(view, 524288);
            C0835a0.m3729h0(view, 262144);
            C0835a0.m3729h0(view, 1048576);
            if (this.f33381s && this.f33383u != 5) {
                m42260J(view, C0862c.C0863a.f2521y, 5);
            }
            int i = this.f33383u;
            int i2 = 6;
            if (i == 3) {
                if (this.f33364b) {
                    i2 = 4;
                }
                m42260J(view, C0862c.C0863a.f2520x, i2);
            } else if (i == 4) {
                if (this.f33364b) {
                    i2 = 3;
                }
                m42260J(view, C0862c.C0863a.f2519w, i2);
            } else if (i == 6) {
                m42260J(view, C0862c.C0863a.f2520x, 4);
                m42260J(view, C0862c.C0863a.f2519w, 3);
            }
        }
    }

    /* renamed from: k0 */
    private void m42272k0(int i) {
        ValueAnimator valueAnimator;
        if (i != 2) {
            boolean z = i == 3;
            if (this.f33372j != z) {
                this.f33372j = z;
                if (this.f33370h != null && (valueAnimator = this.f33374l) != null) {
                    if (valueAnimator.isRunning()) {
                        this.f33374l.reverse();
                        return;
                    }
                    float f = z ? 0.0f : 1.0f;
                    this.f33374l.setFloatValues(new float[]{1.0f - f, f});
                    this.f33374l.start();
                }
            }
        }
    }

    /* renamed from: l0 */
    private void m42273l0(boolean z) {
        WeakReference<V> weakReference = this.f33354B;
        if (weakReference != null) {
            ViewParent parent = ((View) weakReference.get()).getParent();
            if (parent instanceof CoordinatorLayout) {
                CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
                int childCount = coordinatorLayout.getChildCount();
                if (Build.VERSION.SDK_INT >= 16 && z) {
                    if (this.f33361I == null) {
                        this.f33361I = new HashMap(childCount);
                    } else {
                        return;
                    }
                }
                for (int i = 0; i < childCount; i++) {
                    View childAt = coordinatorLayout.getChildAt(i);
                    if (childAt != this.f33354B.get()) {
                        if (!z) {
                            Map<View, Integer> map = this.f33361I;
                            if (map != null && map.containsKey(childAt)) {
                                C0835a0.m3761x0(childAt, this.f33361I.get(childAt).intValue());
                            }
                        } else {
                            if (Build.VERSION.SDK_INT >= 16) {
                                this.f33361I.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                            }
                            C0835a0.m3761x0(childAt, 4);
                        }
                    }
                }
                if (!z) {
                    this.f33361I = null;
                }
            }
        }
    }

    /* renamed from: A */
    public boolean mo2778A(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i, int i2) {
        this.f33386x = 0;
        this.f33387y = false;
        if ((i & 2) != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: C */
    public void mo2780C(CoordinatorLayout coordinatorLayout, V v, View view, int i) {
        int i2;
        int i3;
        int i4 = 3;
        if (v.getTop() == m42266R()) {
            mo24950e0(3);
            return;
        }
        WeakReference<View> weakReference = this.f33355C;
        if (weakReference != null && view == weakReference.get() && this.f33387y) {
            if (this.f33386x > 0) {
                i2 = m42266R();
            } else if (!this.f33381s || !mo24952h0(v, m42267S())) {
                if (this.f33386x == 0) {
                    int top = v.getTop();
                    if (!this.f33364b) {
                        int i5 = this.f33377o;
                        if (top < i5) {
                            if (top < Math.abs(top - this.f33379q)) {
                                i2 = this.f33375m;
                            } else {
                                i2 = this.f33377o;
                            }
                        } else if (Math.abs(top - i5) < Math.abs(top - this.f33379q)) {
                            i2 = this.f33377o;
                        } else {
                            i3 = this.f33379q;
                        }
                        i4 = 6;
                    } else if (Math.abs(top - this.f33376n) < Math.abs(top - this.f33379q)) {
                        i2 = this.f33376n;
                    } else {
                        i3 = this.f33379q;
                    }
                } else if (this.f33364b) {
                    i3 = this.f33379q;
                } else {
                    int top2 = v.getTop();
                    if (Math.abs(top2 - this.f33377o) < Math.abs(top2 - this.f33379q)) {
                        i2 = this.f33377o;
                        i4 = 6;
                    } else {
                        i3 = this.f33379q;
                    }
                }
                i4 = 4;
            } else {
                i2 = this.f33353A;
                i4 = 5;
            }
            mo24953i0(v, i4, i2, false);
            this.f33387y = false;
        }
    }

    /* renamed from: D */
    public boolean mo2781D(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        if (!v.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.f33383u == 1 && actionMasked == 0) {
            return true;
        }
        C6178c cVar = this.f33384v;
        if (cVar != null) {
            cVar.mo21086z(motionEvent);
        }
        if (actionMasked == 0) {
            m42268T();
        }
        if (this.f33357E == null) {
            this.f33357E = VelocityTracker.obtain();
        }
        this.f33357E.addMovement(motionEvent);
        if (actionMasked == 2 && !this.f33385w && Math.abs(((float) this.f33359G) - motionEvent.getY()) > ((float) this.f33384v.mo21082u())) {
            this.f33384v.mo21079b(v, motionEvent.getPointerId(motionEvent.getActionIndex()));
        }
        return !this.f33385w;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: P */
    public void mo24939P(int i) {
        float f;
        float f2;
        View view = (View) this.f33354B.get();
        if (view != null && !this.f33356D.isEmpty()) {
            int i2 = this.f33379q;
            if (i > i2) {
                f = (float) (i2 - i);
                f2 = (float) (this.f33353A - i2);
            } else {
                f = (float) (i2 - i);
                f2 = (float) (i2 - m42266R());
            }
            float f3 = f / f2;
            for (int i3 = 0; i3 < this.f33356D.size(); i3++) {
                this.f33356D.get(i3).mo24956a(view, f3);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Q */
    public View mo24940Q(View view) {
        if (C0835a0.m3706S(view)) {
            return view;
        }
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View Q = mo24940Q(viewGroup.getChildAt(i));
            if (Q != null) {
                return Q;
            }
        }
        return null;
    }

    /* renamed from: V */
    public void mo24941V(int i) {
        if (i >= 0) {
            this.f33375m = i;
            return;
        }
        throw new IllegalArgumentException("offset must be greater than or equal to 0");
    }

    /* renamed from: W */
    public void mo24942W(boolean z) {
        if (this.f33364b != z) {
            this.f33364b = z;
            if (this.f33354B != null) {
                m42261K();
            }
            mo24950e0((!this.f33364b || this.f33383u != 6) ? this.f33383u : 3);
            m42271j0();
        }
    }

    /* renamed from: X */
    public void mo24943X(float f) {
        if (f <= 0.0f || f >= 1.0f) {
            throw new IllegalArgumentException("ratio must be a float value between 0 and 1");
        }
        this.f33378p = f;
    }

    /* renamed from: Y */
    public void mo24944Y(boolean z) {
        if (this.f33381s != z) {
            this.f33381s = z;
            if (!z && this.f33383u == 5) {
                mo24949d0(4);
            }
            m42271j0();
        }
    }

    /* renamed from: Z */
    public void mo24945Z(int i) {
        mo24946a0(i, false);
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0025  */
    /* JADX WARNING: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    /* renamed from: a0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo24946a0(int r4, boolean r5) {
        /*
            r3 = this;
            r0 = 1
            r1 = 0
            r2 = -1
            if (r4 != r2) goto L_0x000c
            boolean r4 = r3.f33367e
            if (r4 != 0) goto L_0x0015
            r3.f33367e = r0
            goto L_0x001f
        L_0x000c:
            boolean r2 = r3.f33367e
            if (r2 != 0) goto L_0x0017
            int r2 = r3.f33366d
            if (r2 == r4) goto L_0x0015
            goto L_0x0017
        L_0x0015:
            r0 = 0
            goto L_0x001f
        L_0x0017:
            r3.f33367e = r1
            int r4 = java.lang.Math.max(r1, r4)
            r3.f33366d = r4
        L_0x001f:
            if (r0 == 0) goto L_0x0042
            java.lang.ref.WeakReference<V> r4 = r3.f33354B
            if (r4 == 0) goto L_0x0042
            r3.m42261K()
            int r4 = r3.f33383u
            r0 = 4
            if (r4 != r0) goto L_0x0042
            java.lang.ref.WeakReference<V> r4 = r3.f33354B
            java.lang.Object r4 = r4.get()
            android.view.View r4 = (android.view.View) r4
            if (r4 == 0) goto L_0x0042
            if (r5 == 0) goto L_0x003f
            int r4 = r3.f33383u
            r3.m42270g0(r4)
            goto L_0x0042
        L_0x003f:
            r4.requestLayout()
        L_0x0042:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.mo24946a0(int, boolean):void");
    }

    /* renamed from: b0 */
    public void mo24947b0(int i) {
        this.f33363a = i;
    }

    /* renamed from: c0 */
    public void mo24948c0(boolean z) {
        this.f33382t = z;
    }

    /* renamed from: d0 */
    public void mo24949d0(int i) {
        if (i != this.f33383u) {
            if (this.f33354B != null) {
                m42270g0(i);
            } else if (i == 4 || i == 3 || i == 6 || (this.f33381s && i == 5)) {
                this.f33383u = i;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e0 */
    public void mo24950e0(int i) {
        View view;
        if (this.f33383u != i) {
            this.f33383u = i;
            WeakReference<V> weakReference = this.f33354B;
            if (weakReference != null && (view = (View) weakReference.get()) != null) {
                if (i == 6 || i == 3) {
                    m42273l0(true);
                } else if (i == 5 || i == 4) {
                    m42273l0(false);
                }
                m42272k0(i);
                for (int i2 = 0; i2 < this.f33356D.size(); i2++) {
                    this.f33356D.get(i2).mo24957b(view, i);
                }
                m42271j0();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f0 */
    public void mo24951f0(View view, int i) {
        int i2;
        int i3;
        if (i == 4) {
            i2 = this.f33379q;
        } else if (i == 6) {
            int i4 = this.f33377o;
            if (!this.f33364b || i4 > (i3 = this.f33376n)) {
                i2 = i4;
            } else {
                i2 = i3;
                i = 3;
            }
        } else if (i == 3) {
            i2 = m42266R();
        } else if (!this.f33381s || i != 5) {
            throw new IllegalArgumentException("Illegal state argument: " + i);
        } else {
            i2 = this.f33353A;
        }
        mo24953i0(view, i, i2, false);
    }

    /* renamed from: g */
    public void mo2788g(CoordinatorLayout.C0606f fVar) {
        super.mo2788g(fVar);
        this.f33354B = null;
        this.f33384v = null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h0 */
    public boolean mo24952h0(View view, float f) {
        if (this.f33382t) {
            return true;
        }
        if (view.getTop() >= this.f33379q && Math.abs((((float) view.getTop()) + (f * 0.1f)) - ((float) this.f33379q)) / ((float) this.f33366d) > 0.5f) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i0 */
    public void mo24953i0(View view, int i, int i2, boolean z) {
        boolean z2;
        if (z) {
            z2 = this.f33384v.mo21074F(view.getLeft(), i2);
        } else {
            z2 = this.f33384v.mo21076H(view, view.getLeft(), i2);
        }
        if (z2) {
            mo24950e0(2);
            m42272k0(i);
            if (this.f33373k == null) {
                this.f33373k = new C7608g(view, i);
            }
            if (!this.f33373k.f33402b) {
                BottomSheetBehavior<V>.g gVar = this.f33373k;
                gVar.f33403c = i;
                C0835a0.m3725f0(view, gVar);
                boolean unused = this.f33373k.f33402b = true;
                return;
            }
            this.f33373k.f33403c = i;
            return;
        }
        mo24950e0(i);
    }

    /* renamed from: j */
    public void mo2791j() {
        super.mo2791j();
        this.f33354B = null;
        this.f33384v = null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v11, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v4, resolved type: android.view.View} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo2792k(androidx.coordinatorlayout.widget.CoordinatorLayout r10, V r11, android.view.MotionEvent r12) {
        /*
            r9 = this;
            boolean r0 = r11.isShown()
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L_0x000b
            r9.f33385w = r2
            return r1
        L_0x000b:
            int r0 = r12.getActionMasked()
            if (r0 != 0) goto L_0x0014
            r9.m42268T()
        L_0x0014:
            android.view.VelocityTracker r3 = r9.f33357E
            if (r3 != 0) goto L_0x001e
            android.view.VelocityTracker r3 = android.view.VelocityTracker.obtain()
            r9.f33357E = r3
        L_0x001e:
            android.view.VelocityTracker r3 = r9.f33357E
            r3.addMovement(r12)
            r3 = 0
            r4 = -1
            r5 = 2
            if (r0 == 0) goto L_0x0039
            if (r0 == r2) goto L_0x002e
            r11 = 3
            if (r0 == r11) goto L_0x002e
            goto L_0x007c
        L_0x002e:
            r9.f33360H = r1
            r9.f33358F = r4
            boolean r11 = r9.f33385w
            if (r11 == 0) goto L_0x007c
            r9.f33385w = r1
            return r1
        L_0x0039:
            float r6 = r12.getX()
            int r6 = (int) r6
            float r7 = r12.getY()
            int r7 = (int) r7
            r9.f33359G = r7
            int r7 = r9.f33383u
            if (r7 == r5) goto L_0x006b
            java.lang.ref.WeakReference<android.view.View> r7 = r9.f33355C
            if (r7 == 0) goto L_0x0054
            java.lang.Object r7 = r7.get()
            android.view.View r7 = (android.view.View) r7
            goto L_0x0055
        L_0x0054:
            r7 = r3
        L_0x0055:
            if (r7 == 0) goto L_0x006b
            int r8 = r9.f33359G
            boolean r7 = r10.mo2775v(r7, r6, r8)
            if (r7 == 0) goto L_0x006b
            int r7 = r12.getActionIndex()
            int r7 = r12.getPointerId(r7)
            r9.f33358F = r7
            r9.f33360H = r2
        L_0x006b:
            int r7 = r9.f33358F
            if (r7 != r4) goto L_0x0079
            int r4 = r9.f33359G
            boolean r11 = r10.mo2775v(r11, r6, r4)
            if (r11 != 0) goto L_0x0079
            r11 = 1
            goto L_0x007a
        L_0x0079:
            r11 = 0
        L_0x007a:
            r9.f33385w = r11
        L_0x007c:
            boolean r11 = r9.f33385w
            if (r11 != 0) goto L_0x008b
            z.c r11 = r9.f33384v
            if (r11 == 0) goto L_0x008b
            boolean r11 = r11.mo21075G(r12)
            if (r11 == 0) goto L_0x008b
            return r2
        L_0x008b:
            java.lang.ref.WeakReference<android.view.View> r11 = r9.f33355C
            if (r11 == 0) goto L_0x0096
            java.lang.Object r11 = r11.get()
            r3 = r11
            android.view.View r3 = (android.view.View) r3
        L_0x0096:
            if (r0 != r5) goto L_0x00ce
            if (r3 == 0) goto L_0x00ce
            boolean r11 = r9.f33385w
            if (r11 != 0) goto L_0x00ce
            int r11 = r9.f33383u
            if (r11 == r2) goto L_0x00ce
            float r11 = r12.getX()
            int r11 = (int) r11
            float r0 = r12.getY()
            int r0 = (int) r0
            boolean r10 = r10.mo2775v(r3, r11, r0)
            if (r10 != 0) goto L_0x00ce
            z.c r10 = r9.f33384v
            if (r10 == 0) goto L_0x00ce
            int r10 = r9.f33359G
            float r10 = (float) r10
            float r11 = r12.getY()
            float r10 = r10 - r11
            float r10 = java.lang.Math.abs(r10)
            z.c r11 = r9.f33384v
            int r11 = r11.mo21082u()
            float r11 = (float) r11
            int r10 = (r10 > r11 ? 1 : (r10 == r11 ? 0 : -1))
            if (r10 <= 0) goto L_0x00ce
            r1 = 1
        L_0x00ce:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.mo2792k(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.MotionEvent):boolean");
    }

    /* renamed from: l */
    public boolean mo2793l(CoordinatorLayout coordinatorLayout, V v, int i) {
        C12822g gVar;
        if (C0835a0.m3762y(coordinatorLayout) && !C0835a0.m3762y(v)) {
            v.setFitsSystemWindows(true);
        }
        if (this.f33354B == null) {
            this.f33368f = coordinatorLayout.getResources().getDimensionPixelSize(C10128d.design_bottom_sheet_peek_height_min);
            this.f33354B = new WeakReference<>(v);
            if (this.f33369g && (gVar = this.f33370h) != null) {
                C0835a0.m3749r0(v, gVar);
            }
            C12822g gVar2 = this.f33370h;
            if (gVar2 != null) {
                float f = this.f33380r;
                if (f == -1.0f) {
                    f = C0835a0.m3756v(v);
                }
                gVar2.mo37744S(f);
                boolean z = this.f33383u == 3;
                this.f33372j = z;
                this.f33370h.mo37746U(z ? 0.0f : 1.0f);
            }
            m42271j0();
            if (C0835a0.m3764z(v) == 0) {
                C0835a0.m3761x0(v, 1);
            }
        }
        if (this.f33384v == null) {
            this.f33384v = C6178c.m35943m(coordinatorLayout, this.f33362J);
        }
        int top = v.getTop();
        coordinatorLayout.mo2728C(v, i);
        this.f33388z = coordinatorLayout.getWidth();
        int height = coordinatorLayout.getHeight();
        this.f33353A = height;
        this.f33376n = Math.max(0, height - v.getHeight());
        m42262L();
        m42261K();
        int i2 = this.f33383u;
        if (i2 == 3) {
            C0835a0.m3712Y(v, m42266R());
        } else if (i2 == 6) {
            C0835a0.m3712Y(v, this.f33377o);
        } else if (this.f33381s && i2 == 5) {
            C0835a0.m3712Y(v, this.f33353A);
        } else if (i2 == 4) {
            C0835a0.m3712Y(v, this.f33379q);
        } else if (i2 == 1 || i2 == 2) {
            C0835a0.m3712Y(v, top - v.getTop());
        }
        this.f33355C = new WeakReference<>(mo24940Q(v));
        return true;
    }

    /* renamed from: o */
    public boolean mo2796o(CoordinatorLayout coordinatorLayout, V v, View view, float f, float f2) {
        WeakReference<View> weakReference = this.f33355C;
        if (weakReference == null || view != weakReference.get()) {
            return false;
        }
        if (this.f33383u != 3 || super.mo2796o(coordinatorLayout, v, view, f, f2)) {
            return true;
        }
        return false;
    }

    /* renamed from: q */
    public void mo2798q(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int[] iArr, int i3) {
        if (i3 != 1) {
            WeakReference<View> weakReference = this.f33355C;
            if (view == (weakReference != null ? (View) weakReference.get() : null)) {
                int top = v.getTop();
                int i4 = top - i2;
                if (i2 > 0) {
                    if (i4 < m42266R()) {
                        iArr[1] = top - m42266R();
                        C0835a0.m3712Y(v, -iArr[1]);
                        mo24950e0(3);
                    } else {
                        iArr[1] = i2;
                        C0835a0.m3712Y(v, -i2);
                        mo24950e0(1);
                    }
                } else if (i2 < 0 && !view.canScrollVertically(-1)) {
                    int i5 = this.f33379q;
                    if (i4 <= i5 || this.f33381s) {
                        iArr[1] = i2;
                        C0835a0.m3712Y(v, -i2);
                        mo24950e0(1);
                    } else {
                        iArr[1] = top - i5;
                        C0835a0.m3712Y(v, -iArr[1]);
                        mo24950e0(4);
                    }
                }
                mo24939P(v.getTop());
                this.f33386x = i2;
                this.f33387y = true;
            }
        }
    }

    /* renamed from: t */
    public void mo2801t(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
    }

    /* renamed from: x */
    public void mo2805x(CoordinatorLayout coordinatorLayout, V v, Parcelable parcelable) {
        C7606f fVar = (C7606f) parcelable;
        super.mo2805x(coordinatorLayout, v, fVar.mo20873a());
        m42269U(fVar);
        int i = fVar.f33396c;
        if (i == 1 || i == 2) {
            this.f33383u = 4;
        } else {
            this.f33383u = i;
        }
    }

    /* renamed from: y */
    public Parcelable mo2806y(CoordinatorLayout coordinatorLayout, V v) {
        return new C7606f(super.mo2806y(coordinatorLayout, v), (BottomSheetBehavior<?>) this);
    }

    /* renamed from: com.google.android.material.bottomsheet.BottomSheetBehavior$f */
    protected static class C7606f extends C6079a {
        public static final Parcelable.Creator<C7606f> CREATOR = new C7607a();

        /* renamed from: c */
        final int f33396c;

        /* renamed from: d */
        int f33397d;

        /* renamed from: e */
        boolean f33398e;

        /* renamed from: f */
        boolean f33399f;

        /* renamed from: g */
        boolean f33400g;

        /* renamed from: com.google.android.material.bottomsheet.BottomSheetBehavior$f$a */
        static class C7607a implements Parcelable.ClassLoaderCreator<C7606f> {
            C7607a() {
            }

            /* renamed from: a */
            public C7606f createFromParcel(Parcel parcel) {
                return new C7606f(parcel, (ClassLoader) null);
            }

            /* renamed from: b */
            public C7606f createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new C7606f(parcel, classLoader);
            }

            /* renamed from: c */
            public C7606f[] newArray(int i) {
                return new C7606f[i];
            }
        }

        public C7606f(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f33396c = parcel.readInt();
            this.f33397d = parcel.readInt();
            boolean z = false;
            this.f33398e = parcel.readInt() == 1;
            this.f33399f = parcel.readInt() == 1;
            this.f33400g = parcel.readInt() == 1 ? true : z;
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f33396c);
            parcel.writeInt(this.f33397d);
            parcel.writeInt(this.f33398e ? 1 : 0);
            parcel.writeInt(this.f33399f ? 1 : 0);
            parcel.writeInt(this.f33400g ? 1 : 0);
        }

        public C7606f(Parcelable parcelable, BottomSheetBehavior<?> bottomSheetBehavior) {
            super(parcelable);
            this.f33396c = bottomSheetBehavior.f33383u;
            this.f33397d = bottomSheetBehavior.f33366d;
            this.f33398e = bottomSheetBehavior.f33364b;
            this.f33399f = bottomSheetBehavior.f33381s;
            this.f33400g = bottomSheetBehavior.f33382t;
        }
    }

    public BottomSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        int i;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C10135k.f40502x);
        this.f33369g = obtainStyledAttributes.hasValue(C10135k.f40273H);
        int i2 = C10135k.f40512z;
        boolean hasValue = obtainStyledAttributes.hasValue(i2);
        if (hasValue) {
            m42264N(context, attributeSet, hasValue, C12456c.m59420a(context, obtainStyledAttributes, i2));
        } else {
            m42263M(context, attributeSet, hasValue);
        }
        m42265O();
        if (Build.VERSION.SDK_INT >= 21) {
            this.f33380r = obtainStyledAttributes.getDimension(C10135k.f40507y, -1.0f);
        }
        int i3 = C10135k.f40258E;
        TypedValue peekValue = obtainStyledAttributes.peekValue(i3);
        if (peekValue == null || (i = peekValue.data) != -1) {
            mo24945Z(obtainStyledAttributes.getDimensionPixelSize(i3, -1));
        } else {
            mo24945Z(i);
        }
        mo24944Y(obtainStyledAttributes.getBoolean(C10135k.f40253D, false));
        mo24942W(obtainStyledAttributes.getBoolean(C10135k.f40243B, true));
        mo24948c0(obtainStyledAttributes.getBoolean(C10135k.f40268G, false));
        mo24947b0(obtainStyledAttributes.getInt(C10135k.f40263F, 0));
        mo24943X(obtainStyledAttributes.getFloat(C10135k.f40248C, 0.5f));
        mo24941V(obtainStyledAttributes.getInt(C10135k.f40238A, 0));
        obtainStyledAttributes.recycle();
        this.f33365c = (float) ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }
}
