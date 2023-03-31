package androidx.appcompat.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.OverScroller;
import androidx.appcompat.view.menu.C0383m;
import androidx.core.graphics.C0724c;
import androidx.core.view.C0835a0;
import androidx.core.view.C0922k0;
import androidx.core.view.C0949q;
import androidx.core.view.C0950r;
import androidx.core.view.C0951s;
import androidx.core.view.C0952t;
import androidx.recyclerview.widget.RecyclerView;
import p048g.C4288a;
import p048g.C4293f;

public class ActionBarOverlayLayout extends ViewGroup implements C0494g0, C0951s, C0949q, C0950r {

    /* renamed from: N */
    static final int[] f1258N = {C4288a.f23762b, 16842841};

    /* renamed from: A */
    private final Rect f1259A = new Rect();

    /* renamed from: B */
    private final Rect f1260B = new Rect();

    /* renamed from: C */
    private C0922k0 f1261C;

    /* renamed from: D */
    private C0922k0 f1262D;

    /* renamed from: E */
    private C0922k0 f1263E;

    /* renamed from: F */
    private C0922k0 f1264F;

    /* renamed from: G */
    private C0399d f1265G;

    /* renamed from: H */
    private OverScroller f1266H;

    /* renamed from: I */
    ViewPropertyAnimator f1267I;

    /* renamed from: J */
    final AnimatorListenerAdapter f1268J;

    /* renamed from: K */
    private final Runnable f1269K;

    /* renamed from: L */
    private final Runnable f1270L;

    /* renamed from: M */
    private final C0952t f1271M;

    /* renamed from: a */
    private int f1272a;

    /* renamed from: b */
    private int f1273b = 0;

    /* renamed from: c */
    private ContentFrameLayout f1274c;

    /* renamed from: d */
    ActionBarContainer f1275d;

    /* renamed from: e */
    private C0497h0 f1276e;

    /* renamed from: f */
    private Drawable f1277f;

    /* renamed from: g */
    private boolean f1278g;

    /* renamed from: h */
    private boolean f1279h;

    /* renamed from: i */
    private boolean f1280i;

    /* renamed from: r */
    private boolean f1281r;

    /* renamed from: s */
    boolean f1282s;

    /* renamed from: t */
    private int f1283t;

    /* renamed from: u */
    private int f1284u;

    /* renamed from: v */
    private final Rect f1285v = new Rect();

    /* renamed from: w */
    private final Rect f1286w = new Rect();

    /* renamed from: x */
    private final Rect f1287x = new Rect();

    /* renamed from: y */
    private final Rect f1288y = new Rect();

    /* renamed from: z */
    private final Rect f1289z = new Rect();

    /* renamed from: androidx.appcompat.widget.ActionBarOverlayLayout$a */
    class C0396a extends AnimatorListenerAdapter {
        C0396a() {
        }

        public void onAnimationCancel(Animator animator) {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.f1267I = null;
            actionBarOverlayLayout.f1282s = false;
        }

        public void onAnimationEnd(Animator animator) {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.f1267I = null;
            actionBarOverlayLayout.f1282s = false;
        }
    }

    /* renamed from: androidx.appcompat.widget.ActionBarOverlayLayout$b */
    class C0397b implements Runnable {
        C0397b() {
        }

        public void run() {
            ActionBarOverlayLayout.this.mo1666o();
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.f1267I = actionBarOverlayLayout.f1275d.animate().translationY(0.0f).setListener(ActionBarOverlayLayout.this.f1268J);
        }
    }

    /* renamed from: androidx.appcompat.widget.ActionBarOverlayLayout$c */
    class C0398c implements Runnable {
        C0398c() {
        }

        public void run() {
            ActionBarOverlayLayout.this.mo1666o();
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.f1267I = actionBarOverlayLayout.f1275d.animate().translationY((float) (-ActionBarOverlayLayout.this.f1275d.getHeight())).setListener(ActionBarOverlayLayout.this.f1268J);
        }
    }

    /* renamed from: androidx.appcompat.widget.ActionBarOverlayLayout$d */
    public interface C0399d {
        /* renamed from: a */
        void mo1080a();

        /* renamed from: b */
        void mo1081b();

        /* renamed from: c */
        void mo1082c(boolean z);

        /* renamed from: d */
        void mo1083d();

        /* renamed from: e */
        void mo1084e();

        void onWindowVisibilityChanged(int i);
    }

    /* renamed from: androidx.appcompat.widget.ActionBarOverlayLayout$e */
    public static class C0400e extends ViewGroup.MarginLayoutParams {
        public C0400e(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public C0400e(int i, int i2) {
            super(i, i2);
        }

        public C0400e(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    public ActionBarOverlayLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C0922k0 k0Var = C0922k0.f2579b;
        this.f1261C = k0Var;
        this.f1262D = k0Var;
        this.f1263E = k0Var;
        this.f1264F = k0Var;
        this.f1268J = new C0396a();
        this.f1269K = new C0397b();
        this.f1270L = new C0398c();
        m1984p(context);
        this.f1271M = new C0952t(this);
    }

    /* renamed from: a */
    private void m1981a() {
        mo1666o();
        this.f1270L.run();
    }

    /* renamed from: k */
    private boolean m1982k(View view, Rect rect, boolean z, boolean z2, boolean z3, boolean z4) {
        boolean z5;
        int i;
        int i2;
        int i3;
        int i4;
        C0400e eVar = (C0400e) view.getLayoutParams();
        if (!z || eVar.leftMargin == (i4 = rect.left)) {
            z5 = false;
        } else {
            eVar.leftMargin = i4;
            z5 = true;
        }
        if (z2 && eVar.topMargin != (i3 = rect.top)) {
            eVar.topMargin = i3;
            z5 = true;
        }
        if (z4 && eVar.rightMargin != (i2 = rect.right)) {
            eVar.rightMargin = i2;
            z5 = true;
        }
        if (!z3 || eVar.bottomMargin == (i = rect.bottom)) {
            return z5;
        }
        eVar.bottomMargin = i;
        return true;
    }

    /* renamed from: n */
    private C0497h0 m1983n(View view) {
        if (view instanceof C0497h0) {
            return (C0497h0) view;
        }
        if (view instanceof Toolbar) {
            return ((Toolbar) view).getWrapper();
        }
        throw new IllegalStateException("Can't make a decor toolbar out of " + view.getClass().getSimpleName());
    }

    /* renamed from: p */
    private void m1984p(Context context) {
        TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(f1258N);
        boolean z = false;
        this.f1272a = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        Drawable drawable = obtainStyledAttributes.getDrawable(1);
        this.f1277f = drawable;
        setWillNotDraw(drawable == null);
        obtainStyledAttributes.recycle();
        if (context.getApplicationInfo().targetSdkVersion < 19) {
            z = true;
        }
        this.f1278g = z;
        this.f1266H = new OverScroller(context);
    }

    /* renamed from: r */
    private void m1985r() {
        mo1666o();
        postDelayed(this.f1270L, 600);
    }

    /* renamed from: s */
    private void m1986s() {
        mo1666o();
        postDelayed(this.f1269K, 600);
    }

    /* renamed from: u */
    private void m1987u() {
        mo1666o();
        this.f1269K.run();
    }

    /* renamed from: v */
    private boolean m1988v(float f) {
        this.f1266H.fling(0, 0, 0, (int) f, 0, 0, RecyclerView.UNDEFINED_DURATION, Integer.MAX_VALUE);
        return this.f1266H.getFinalY() > this.f1275d.getHeight();
    }

    /* renamed from: b */
    public void mo1646b(Menu menu, C0383m.C0384a aVar) {
        mo1701t();
        this.f1276e.mo2119b(menu, aVar);
    }

    /* renamed from: c */
    public boolean mo1647c() {
        mo1701t();
        return this.f1276e.mo2120c();
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C0400e;
    }

    /* renamed from: d */
    public void mo1649d() {
        mo1701t();
        this.f1276e.mo2122d();
    }

    public void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.f1277f != null && !this.f1278g) {
            int bottom = this.f1275d.getVisibility() == 0 ? (int) (((float) this.f1275d.getBottom()) + this.f1275d.getTranslationY() + 0.5f) : 0;
            this.f1277f.setBounds(0, bottom, getWidth(), this.f1277f.getIntrinsicHeight() + bottom);
            this.f1277f.draw(canvas);
        }
    }

    /* renamed from: e */
    public boolean mo1651e() {
        mo1701t();
        return this.f1276e.mo2123e();
    }

    /* renamed from: f */
    public boolean mo1652f() {
        mo1701t();
        return this.f1276e.mo2124f();
    }

    /* access modifiers changed from: protected */
    public boolean fitSystemWindows(Rect rect) {
        if (Build.VERSION.SDK_INT >= 21) {
            return super.fitSystemWindows(rect);
        }
        mo1701t();
        boolean k = m1982k(this.f1275d, rect, true, true, false, true);
        this.f1288y.set(rect);
        C0508j1.m2495a(this, this.f1288y, this.f1285v);
        if (!this.f1289z.equals(this.f1288y)) {
            this.f1289z.set(this.f1288y);
            k = true;
        }
        if (!this.f1286w.equals(this.f1285v)) {
            this.f1286w.set(this.f1285v);
            k = true;
        }
        if (k) {
            requestLayout();
        }
        return true;
    }

    /* renamed from: g */
    public boolean mo1654g() {
        mo1701t();
        return this.f1276e.mo2125g();
    }

    public int getActionBarHideOffset() {
        ActionBarContainer actionBarContainer = this.f1275d;
        if (actionBarContainer != null) {
            return -((int) actionBarContainer.getTranslationY());
        }
        return 0;
    }

    public int getNestedScrollAxes() {
        return this.f1271M.mo3491a();
    }

    public CharSequence getTitle() {
        mo1701t();
        return this.f1276e.getTitle();
    }

    /* renamed from: h */
    public boolean mo1661h() {
        mo1701t();
        return this.f1276e.mo2129h();
    }

    /* renamed from: i */
    public void mo1662i(int i) {
        mo1701t();
        if (i == 2) {
            this.f1276e.mo2148v();
        } else if (i == 5) {
            this.f1276e.mo2149w();
        } else if (i == 109) {
            setOverlayMode(true);
        }
    }

    /* renamed from: j */
    public void mo1663j() {
        mo1701t();
        this.f1276e.mo2130i();
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public C0400e generateDefaultLayoutParams() {
        return new C0400e(-1, -1);
    }

    /* renamed from: m */
    public C0400e generateLayoutParams(AttributeSet attributeSet) {
        return new C0400e(getContext(), attributeSet);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public void mo1666o() {
        removeCallbacks(this.f1269K);
        removeCallbacks(this.f1270L);
        ViewPropertyAnimator viewPropertyAnimator = this.f1267I;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    public WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        mo1701t();
        C0922k0 v = C0922k0.m4161v(windowInsets, this);
        boolean k = m1982k(this.f1275d, new Rect(v.mo3417i(), v.mo3419k(), v.mo3418j(), v.mo3415h()), true, true, false, true);
        C0835a0.m3726g(this, v, this.f1285v);
        Rect rect = this.f1285v;
        C0922k0 l = v.mo3420l(rect.left, rect.top, rect.right, rect.bottom);
        this.f1261C = l;
        boolean z = true;
        if (!this.f1262D.equals(l)) {
            this.f1262D = this.f1261C;
            k = true;
        }
        if (!this.f1286w.equals(this.f1285v)) {
            this.f1286w.set(this.f1285v);
        } else {
            z = k;
        }
        if (z) {
            requestLayout();
        }
        return v.mo3407a().mo3409c().mo3408b().mo3427t();
    }

    /* access modifiers changed from: protected */
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        m1984p(getContext());
        C0835a0.m3735k0(this);
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        mo1666o();
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8) {
                C0400e eVar = (C0400e) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i6 = eVar.leftMargin + paddingLeft;
                int i7 = eVar.topMargin + paddingTop;
                childAt.layout(i6, i7, measuredWidth + i6, measuredHeight + i7);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int i3;
        mo1701t();
        measureChildWithMargins(this.f1275d, i, 0, i2, 0);
        C0400e eVar = (C0400e) this.f1275d.getLayoutParams();
        int max = Math.max(0, this.f1275d.getMeasuredWidth() + eVar.leftMargin + eVar.rightMargin);
        int max2 = Math.max(0, this.f1275d.getMeasuredHeight() + eVar.topMargin + eVar.bottomMargin);
        int combineMeasuredStates = View.combineMeasuredStates(0, this.f1275d.getMeasuredState());
        boolean z = (C0835a0.m3698K(this) & 256) != 0;
        if (z) {
            i3 = this.f1272a;
            if (this.f1280i && this.f1275d.getTabContainer() != null) {
                i3 += this.f1272a;
            }
        } else {
            i3 = this.f1275d.getVisibility() != 8 ? this.f1275d.getMeasuredHeight() : 0;
        }
        this.f1287x.set(this.f1285v);
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 21) {
            this.f1263E = this.f1261C;
        } else {
            this.f1259A.set(this.f1288y);
        }
        if (!this.f1279h && !z) {
            Rect rect = this.f1287x;
            rect.top += i3;
            rect.bottom += 0;
            if (i4 >= 21) {
                this.f1263E = this.f1263E.mo3420l(0, i3, 0, 0);
            }
        } else if (i4 >= 21) {
            this.f1263E = new C0922k0.C0924b(this.f1263E).mo3430c(C0724c.m3317b(this.f1263E.mo3417i(), this.f1263E.mo3419k() + i3, this.f1263E.mo3418j(), this.f1263E.mo3415h() + 0)).mo3428a();
        } else {
            Rect rect2 = this.f1259A;
            rect2.top += i3;
            rect2.bottom += 0;
        }
        m1982k(this.f1274c, this.f1287x, true, true, true, true);
        if (i4 >= 21 && !this.f1264F.equals(this.f1263E)) {
            C0922k0 k0Var = this.f1263E;
            this.f1264F = k0Var;
            C0835a0.m3728h(this.f1274c, k0Var);
        } else if (i4 < 21 && !this.f1260B.equals(this.f1259A)) {
            this.f1260B.set(this.f1259A);
            this.f1274c.mo1744a(this.f1259A);
        }
        measureChildWithMargins(this.f1274c, i, 0, i2, 0);
        C0400e eVar2 = (C0400e) this.f1274c.getLayoutParams();
        int max3 = Math.max(max, this.f1274c.getMeasuredWidth() + eVar2.leftMargin + eVar2.rightMargin);
        int max4 = Math.max(max2, this.f1274c.getMeasuredHeight() + eVar2.topMargin + eVar2.bottomMargin);
        int combineMeasuredStates2 = View.combineMeasuredStates(combineMeasuredStates, this.f1274c.getMeasuredState());
        setMeasuredDimension(View.resolveSizeAndState(Math.max(max3 + getPaddingLeft() + getPaddingRight(), getSuggestedMinimumWidth()), i, combineMeasuredStates2), View.resolveSizeAndState(Math.max(max4 + getPaddingTop() + getPaddingBottom(), getSuggestedMinimumHeight()), i2, combineMeasuredStates2 << 16));
    }

    public boolean onNestedFling(View view, float f, float f2, boolean z) {
        if (!this.f1281r || !z) {
            return false;
        }
        if (m1988v(f2)) {
            m1981a();
        } else {
            m1987u();
        }
        this.f1282s = true;
        return true;
    }

    public boolean onNestedPreFling(View view, float f, float f2) {
        return false;
    }

    public void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
    }

    public void onNestedPreScroll(View view, int i, int i2, int[] iArr, int i3) {
        if (i3 == 0) {
            onNestedPreScroll(view, i, i2, iArr);
        }
    }

    public void onNestedScroll(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        onNestedScroll(view, i, i2, i3, i4, i5);
    }

    public void onNestedScrollAccepted(View view, View view2, int i, int i2) {
        if (i2 == 0) {
            onNestedScrollAccepted(view, view2, i);
        }
    }

    public boolean onStartNestedScroll(View view, View view2, int i, int i2) {
        return i2 == 0 && onStartNestedScroll(view, view2, i);
    }

    public void onStopNestedScroll(View view, int i) {
        if (i == 0) {
            onStopNestedScroll(view);
        }
    }

    @Deprecated
    public void onWindowSystemUiVisibilityChanged(int i) {
        if (Build.VERSION.SDK_INT >= 16) {
            super.onWindowSystemUiVisibilityChanged(i);
        }
        mo1701t();
        int i2 = this.f1284u ^ i;
        this.f1284u = i;
        boolean z = false;
        boolean z2 = (i & 4) == 0;
        if ((i & 256) != 0) {
            z = true;
        }
        C0399d dVar = this.f1265G;
        if (dVar != null) {
            dVar.mo1082c(!z);
            if (z2 || !z) {
                this.f1265G.mo1080a();
            } else {
                this.f1265G.mo1083d();
            }
        }
        if ((i2 & 256) != 0 && this.f1265G != null) {
            C0835a0.m3735k0(this);
        }
    }

    /* access modifiers changed from: protected */
    public void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        this.f1273b = i;
        C0399d dVar = this.f1265G;
        if (dVar != null) {
            dVar.onWindowVisibilityChanged(i);
        }
    }

    /* renamed from: q */
    public boolean mo1687q() {
        return this.f1279h;
    }

    public void setActionBarHideOffset(int i) {
        mo1666o();
        this.f1275d.setTranslationY((float) (-Math.max(0, Math.min(i, this.f1275d.getHeight()))));
    }

    public void setActionBarVisibilityCallback(C0399d dVar) {
        this.f1265G = dVar;
        if (getWindowToken() != null) {
            this.f1265G.onWindowVisibilityChanged(this.f1273b);
            int i = this.f1284u;
            if (i != 0) {
                onWindowSystemUiVisibilityChanged(i);
                C0835a0.m3735k0(this);
            }
        }
    }

    public void setHasNonEmbeddedTabs(boolean z) {
        this.f1280i = z;
    }

    public void setHideOnContentScrollEnabled(boolean z) {
        if (z != this.f1281r) {
            this.f1281r = z;
            if (!z) {
                mo1666o();
                setActionBarHideOffset(0);
            }
        }
    }

    public void setIcon(int i) {
        mo1701t();
        this.f1276e.setIcon(i);
    }

    public void setLogo(int i) {
        mo1701t();
        this.f1276e.mo2135n(i);
    }

    public void setOverlayMode(boolean z) {
        this.f1279h = z;
        this.f1278g = z && getContext().getApplicationInfo().targetSdkVersion < 19;
    }

    public void setShowingForActionMode(boolean z) {
    }

    public void setUiOptions(int i) {
    }

    public void setWindowCallback(Window.Callback callback) {
        mo1701t();
        this.f1276e.setWindowCallback(callback);
    }

    public void setWindowTitle(CharSequence charSequence) {
        mo1701t();
        this.f1276e.setWindowTitle(charSequence);
    }

    public boolean shouldDelayChildPressedState() {
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public void mo1701t() {
        if (this.f1274c == null) {
            this.f1274c = (ContentFrameLayout) findViewById(C4293f.f23873b);
            this.f1275d = (ActionBarContainer) findViewById(C4293f.f23874c);
            this.f1276e = m1983n(findViewById(C4293f.f23872a));
        }
    }

    /* access modifiers changed from: protected */
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new C0400e(layoutParams);
    }

    public void onNestedScroll(View view, int i, int i2, int i3, int i4, int i5) {
        if (i5 == 0) {
            onNestedScroll(view, i, i2, i3, i4);
        }
    }

    public void onNestedScrollAccepted(View view, View view2, int i) {
        this.f1271M.mo3492b(view, view2, i);
        this.f1283t = getActionBarHideOffset();
        mo1666o();
        C0399d dVar = this.f1265G;
        if (dVar != null) {
            dVar.mo1084e();
        }
    }

    public boolean onStartNestedScroll(View view, View view2, int i) {
        if ((i & 2) == 0 || this.f1275d.getVisibility() != 0) {
            return false;
        }
        return this.f1281r;
    }

    public void onStopNestedScroll(View view) {
        if (this.f1281r && !this.f1282s) {
            if (this.f1283t <= this.f1275d.getHeight()) {
                m1986s();
            } else {
                m1985r();
            }
        }
        C0399d dVar = this.f1265G;
        if (dVar != null) {
            dVar.mo1081b();
        }
    }

    public void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        int i5 = this.f1283t + i2;
        this.f1283t = i5;
        setActionBarHideOffset(i5);
    }

    public void setIcon(Drawable drawable) {
        mo1701t();
        this.f1276e.setIcon(drawable);
    }
}
