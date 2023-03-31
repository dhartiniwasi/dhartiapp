package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewDebug;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.view.menu.C0367g;
import androidx.appcompat.view.menu.C0371i;
import androidx.appcompat.view.menu.C0383m;
import androidx.appcompat.view.menu.C0385n;
import androidx.appcompat.widget.C0519m0;
import androidx.recyclerview.widget.RecyclerView;

public class ActionMenuView extends C0519m0 implements C0367g.C0369b, C0385n {

    /* renamed from: A */
    private boolean f1293A;

    /* renamed from: B */
    private C0458c f1294B;

    /* renamed from: C */
    private C0383m.C0384a f1295C;

    /* renamed from: D */
    C0367g.C0368a f1296D;

    /* renamed from: E */
    private boolean f1297E;

    /* renamed from: F */
    private int f1298F;

    /* renamed from: G */
    private int f1299G;

    /* renamed from: H */
    private int f1300H;

    /* renamed from: I */
    C0405e f1301I;

    /* renamed from: x */
    private C0367g f1302x;

    /* renamed from: y */
    private Context f1303y;

    /* renamed from: z */
    private int f1304z;

    /* renamed from: androidx.appcompat.widget.ActionMenuView$a */
    public interface C0401a {
        /* renamed from: a */
        boolean mo1174a();

        /* renamed from: b */
        boolean mo1175b();
    }

    /* renamed from: androidx.appcompat.widget.ActionMenuView$b */
    private static class C0402b implements C0383m.C0384a {
        C0402b() {
        }

        /* renamed from: a */
        public void mo996a(C0367g gVar, boolean z) {
        }

        /* renamed from: b */
        public boolean mo997b(C0367g gVar) {
            return false;
        }
    }

    /* renamed from: androidx.appcompat.widget.ActionMenuView$c */
    public static class C0403c extends C0519m0.C0520a {
        @ViewDebug.ExportedProperty

        /* renamed from: a */
        public boolean f1305a;
        @ViewDebug.ExportedProperty

        /* renamed from: b */
        public int f1306b;
        @ViewDebug.ExportedProperty

        /* renamed from: c */
        public int f1307c;
        @ViewDebug.ExportedProperty

        /* renamed from: d */
        public boolean f1308d;
        @ViewDebug.ExportedProperty

        /* renamed from: e */
        public boolean f1309e;

        /* renamed from: f */
        boolean f1310f;

        public C0403c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public C0403c(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public C0403c(C0403c cVar) {
            super(cVar);
            this.f1305a = cVar.f1305a;
        }

        public C0403c(int i, int i2) {
            super(i, i2);
            this.f1305a = false;
        }
    }

    /* renamed from: androidx.appcompat.widget.ActionMenuView$d */
    private class C0404d implements C0367g.C0368a {
        C0404d() {
        }

        /* renamed from: a */
        public boolean mo967a(C0367g gVar, MenuItem menuItem) {
            C0405e eVar = ActionMenuView.this.f1301I;
            return eVar != null && eVar.onMenuItemClick(menuItem);
        }

        /* renamed from: b */
        public void mo968b(C0367g gVar) {
            C0367g.C0368a aVar = ActionMenuView.this.f1296D;
            if (aVar != null) {
                aVar.mo968b(gVar);
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.ActionMenuView$e */
    public interface C0405e {
        boolean onMenuItemClick(MenuItem menuItem);
    }

    public ActionMenuView(Context context) {
        this(context, (AttributeSet) null);
    }

    /* renamed from: L */
    static int m2008L(View view, int i, int i2, int i3, int i4) {
        C0403c cVar = (C0403c) view.getLayoutParams();
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i3) - i4, View.MeasureSpec.getMode(i3));
        ActionMenuItemView actionMenuItemView = view instanceof ActionMenuItemView ? (ActionMenuItemView) view : null;
        boolean z = true;
        boolean z2 = actionMenuItemView != null && actionMenuItemView.mo1178f();
        int i5 = 2;
        if (i2 <= 0 || (z2 && i2 < 2)) {
            i5 = 0;
        } else {
            view.measure(View.MeasureSpec.makeMeasureSpec(i2 * i, RecyclerView.UNDEFINED_DURATION), makeMeasureSpec);
            int measuredWidth = view.getMeasuredWidth();
            int i6 = measuredWidth / i;
            if (measuredWidth % i != 0) {
                i6++;
            }
            if (!z2 || i6 >= 2) {
                i5 = i6;
            }
        }
        if (cVar.f1305a || !z2) {
            z = false;
        }
        cVar.f1308d = z;
        cVar.f1306b = i5;
        view.measure(View.MeasureSpec.makeMeasureSpec(i * i5, 1073741824), makeMeasureSpec);
        return i5;
    }

    /* renamed from: M */
    private void m2009M(int i, int i2) {
        int i3;
        boolean z;
        int i4;
        int i5;
        boolean z2;
        boolean z3;
        int i6;
        boolean z4;
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i2, paddingTop, -2);
        int i7 = size - paddingLeft;
        int i8 = this.f1299G;
        int i9 = i7 / i8;
        int i10 = i7 % i8;
        if (i9 == 0) {
            setMeasuredDimension(i7, 0);
            return;
        }
        int i11 = i8 + (i10 / i9);
        int childCount = getChildCount();
        int i12 = 0;
        int i13 = 0;
        boolean z5 = false;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        long j = 0;
        while (i13 < childCount) {
            View childAt = getChildAt(i13);
            int i17 = size2;
            if (childAt.getVisibility() != 8) {
                boolean z6 = childAt instanceof ActionMenuItemView;
                int i18 = i14 + 1;
                if (z6) {
                    int i19 = this.f1300H;
                    i6 = i18;
                    z4 = false;
                    childAt.setPadding(i19, 0, i19, 0);
                } else {
                    i6 = i18;
                    z4 = false;
                }
                C0403c cVar = (C0403c) childAt.getLayoutParams();
                cVar.f1310f = z4;
                cVar.f1307c = z4 ? 1 : 0;
                cVar.f1306b = z4;
                cVar.f1308d = z4;
                cVar.leftMargin = z4;
                cVar.rightMargin = z4;
                cVar.f1309e = z6 && ((ActionMenuItemView) childAt).mo1178f();
                int L = m2008L(childAt, i11, cVar.f1305a ? 1 : i9, childMeasureSpec, paddingTop);
                i15 = Math.max(i15, L);
                if (cVar.f1308d) {
                    i16++;
                }
                if (cVar.f1305a) {
                    z5 = true;
                }
                i9 -= L;
                i12 = Math.max(i12, childAt.getMeasuredHeight());
                if (L == 1) {
                    j |= (long) (1 << i13);
                    i12 = i12;
                } else {
                    int i20 = i12;
                }
                i14 = i6;
            }
            i13++;
            size2 = i17;
        }
        int i21 = size2;
        boolean z7 = z5 && i14 == 2;
        boolean z8 = false;
        while (true) {
            if (i16 <= 0 || i9 <= 0) {
                i5 = mode;
                i3 = i7;
                z = z8;
                i4 = i12;
            } else {
                int i22 = 0;
                int i23 = 0;
                int i24 = Integer.MAX_VALUE;
                long j2 = 0;
                while (i23 < childCount) {
                    boolean z9 = z8;
                    C0403c cVar2 = (C0403c) getChildAt(i23).getLayoutParams();
                    int i25 = i12;
                    if (cVar2.f1308d) {
                        int i26 = cVar2.f1306b;
                        if (i26 < i24) {
                            j2 = 1 << i23;
                            i24 = i26;
                            i22 = 1;
                        } else if (i26 == i24) {
                            i22++;
                            j2 |= 1 << i23;
                        }
                    }
                    i23++;
                    i12 = i25;
                    z8 = z9;
                }
                z = z8;
                i4 = i12;
                j |= j2;
                if (i22 > i9) {
                    i5 = mode;
                    i3 = i7;
                    break;
                }
                int i27 = i24 + 1;
                int i28 = 0;
                while (i28 < childCount) {
                    View childAt2 = getChildAt(i28);
                    C0403c cVar3 = (C0403c) childAt2.getLayoutParams();
                    int i29 = i7;
                    int i30 = mode;
                    long j3 = (long) (1 << i28);
                    if ((j2 & j3) == 0) {
                        if (cVar3.f1306b == i27) {
                            j |= j3;
                        }
                        z3 = z7;
                    } else {
                        if (!z7 || !cVar3.f1309e || i9 != 1) {
                            z3 = z7;
                        } else {
                            int i31 = this.f1300H;
                            z3 = z7;
                            childAt2.setPadding(i31 + i11, 0, i31, 0);
                        }
                        cVar3.f1306b++;
                        cVar3.f1310f = true;
                        i9--;
                    }
                    i28++;
                    mode = i30;
                    i7 = i29;
                    z7 = z3;
                }
                i12 = i4;
                z8 = true;
            }
        }
        boolean z10 = !z5 && i14 == 1;
        if (i9 <= 0 || j == 0 || (i9 >= i14 - 1 && !z10 && i15 <= 1)) {
            z2 = z;
        } else {
            float bitCount = (float) Long.bitCount(j);
            if (!z10) {
                if ((j & 1) != 0 && !((C0403c) getChildAt(0).getLayoutParams()).f1309e) {
                    bitCount -= 0.5f;
                }
                int i32 = childCount - 1;
                if ((j & ((long) (1 << i32))) != 0 && !((C0403c) getChildAt(i32).getLayoutParams()).f1309e) {
                    bitCount -= 0.5f;
                }
            }
            int i33 = bitCount > 0.0f ? (int) (((float) (i9 * i11)) / bitCount) : 0;
            z2 = z;
            for (int i34 = 0; i34 < childCount; i34++) {
                if ((j & ((long) (1 << i34))) != 0) {
                    View childAt3 = getChildAt(i34);
                    C0403c cVar4 = (C0403c) childAt3.getLayoutParams();
                    if (childAt3 instanceof ActionMenuItemView) {
                        cVar4.f1307c = i33;
                        cVar4.f1310f = true;
                        if (i34 == 0 && !cVar4.f1309e) {
                            cVar4.leftMargin = (-i33) / 2;
                        }
                    } else if (cVar4.f1305a) {
                        cVar4.f1307c = i33;
                        cVar4.f1310f = true;
                        cVar4.rightMargin = (-i33) / 2;
                    } else {
                        if (i34 != 0) {
                            cVar4.leftMargin = i33 / 2;
                        }
                        if (i34 != childCount - 1) {
                            cVar4.rightMargin = i33 / 2;
                        }
                    }
                    z2 = true;
                }
            }
        }
        if (z2) {
            for (int i35 = 0; i35 < childCount; i35++) {
                View childAt4 = getChildAt(i35);
                C0403c cVar5 = (C0403c) childAt4.getLayoutParams();
                if (cVar5.f1310f) {
                    childAt4.measure(View.MeasureSpec.makeMeasureSpec((cVar5.f1306b * i11) + cVar5.f1307c, 1073741824), childMeasureSpec);
                }
            }
        }
        setMeasuredDimension(i3, i5 != 1073741824 ? i4 : i21);
    }

    /* renamed from: B */
    public void mo1706B() {
        C0458c cVar = this.f1294B;
        if (cVar != null) {
            cVar.mo2081y();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: C */
    public C0403c mo1728m() {
        C0403c cVar = new C0403c(-2, -2);
        cVar.gravity = 16;
        return cVar;
    }

    /* renamed from: D */
    public C0403c mo1729n(AttributeSet attributeSet) {
        return new C0403c(getContext(), attributeSet);
    }

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public C0403c mo1730o(ViewGroup.LayoutParams layoutParams) {
        C0403c cVar;
        if (layoutParams == null) {
            return mo1728m();
        }
        if (layoutParams instanceof C0403c) {
            cVar = new C0403c((C0403c) layoutParams);
        } else {
            cVar = new C0403c(layoutParams);
        }
        if (cVar.gravity <= 0) {
            cVar.gravity = 16;
        }
        return cVar;
    }

    /* renamed from: F */
    public C0403c mo1710F() {
        C0403c C = mo1728m();
        C.f1305a = true;
        return C;
    }

    /* access modifiers changed from: protected */
    /* renamed from: G */
    public boolean mo1711G(int i) {
        boolean z = false;
        if (i == 0) {
            return false;
        }
        View childAt = getChildAt(i - 1);
        View childAt2 = getChildAt(i);
        if (i < getChildCount() && (childAt instanceof C0401a)) {
            z = false | ((C0401a) childAt).mo1174a();
        }
        return (i <= 0 || !(childAt2 instanceof C0401a)) ? z : z | ((C0401a) childAt2).mo1175b();
    }

    /* renamed from: H */
    public boolean mo1712H() {
        C0458c cVar = this.f1294B;
        return cVar != null && cVar.mo2071B();
    }

    /* renamed from: I */
    public boolean mo1713I() {
        C0458c cVar = this.f1294B;
        return cVar != null && cVar.mo2073D();
    }

    /* renamed from: J */
    public boolean mo1714J() {
        C0458c cVar = this.f1294B;
        return cVar != null && cVar.mo2074E();
    }

    /* renamed from: K */
    public boolean mo1715K() {
        return this.f1293A;
    }

    /* renamed from: N */
    public C0367g mo1716N() {
        return this.f1302x;
    }

    /* renamed from: O */
    public void mo1717O(C0383m.C0384a aVar, C0367g.C0368a aVar2) {
        this.f1295C = aVar;
        this.f1296D = aVar2;
    }

    /* renamed from: P */
    public boolean mo1718P() {
        C0458c cVar = this.f1294B;
        return cVar != null && cVar.mo2080K();
    }

    /* renamed from: a */
    public boolean mo1197a(C0371i iVar) {
        return this.f1302x.mo1344L(iVar, 0);
    }

    /* renamed from: b */
    public void mo1198b(C0367g gVar) {
        this.f1302x = gVar;
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C0403c;
    }

    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    public Menu getMenu() {
        if (this.f1302x == null) {
            Context context = getContext();
            C0367g gVar = new C0367g(context);
            this.f1302x = gVar;
            gVar.mo1349R(new C0404d());
            C0458c cVar = new C0458c(context);
            this.f1294B = cVar;
            cVar.mo2079J(true);
            C0458c cVar2 = this.f1294B;
            C0383m.C0384a aVar = this.f1295C;
            if (aVar == null) {
                aVar = new C0402b();
            }
            cVar2.mo1276g(aVar);
            this.f1302x.mo1369c(this.f1294B, this.f1303y);
            this.f1294B.mo2077H(this);
        }
        return this.f1302x;
    }

    public Drawable getOverflowIcon() {
        getMenu();
        return this.f1294B.mo2070A();
    }

    public int getPopupTheme() {
        return this.f1304z;
    }

    public int getWindowAnimations() {
        return 0;
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        C0458c cVar = this.f1294B;
        if (cVar != null) {
            cVar.mo1273c(false);
            if (this.f1294B.mo2074E()) {
                this.f1294B.mo2071B();
                this.f1294B.mo2080K();
            }
        }
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        mo1706B();
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        if (!this.f1297E) {
            super.onLayout(z, i, i2, i3, i4);
            return;
        }
        int childCount = getChildCount();
        int i7 = (i4 - i2) / 2;
        int dividerWidth = getDividerWidth();
        int i8 = i3 - i;
        int paddingRight = (i8 - getPaddingRight()) - getPaddingLeft();
        boolean b = C0508j1.m2496b(this);
        int i9 = 0;
        int i10 = 0;
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            if (childAt.getVisibility() != 8) {
                C0403c cVar = (C0403c) childAt.getLayoutParams();
                if (cVar.f1305a) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    if (mo1711G(i11)) {
                        measuredWidth += dividerWidth;
                    }
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (b) {
                        i5 = getPaddingLeft() + cVar.leftMargin;
                        i6 = i5 + measuredWidth;
                    } else {
                        i6 = (getWidth() - getPaddingRight()) - cVar.rightMargin;
                        i5 = i6 - measuredWidth;
                    }
                    int i12 = i7 - (measuredHeight / 2);
                    childAt.layout(i5, i12, i6, measuredHeight + i12);
                    paddingRight -= measuredWidth;
                    i9 = 1;
                } else {
                    paddingRight -= (childAt.getMeasuredWidth() + cVar.leftMargin) + cVar.rightMargin;
                    mo1711G(i11);
                    i10++;
                }
            }
        }
        if (childCount == 1 && i9 == 0) {
            View childAt2 = getChildAt(0);
            int measuredWidth2 = childAt2.getMeasuredWidth();
            int measuredHeight2 = childAt2.getMeasuredHeight();
            int i13 = (i8 / 2) - (measuredWidth2 / 2);
            int i14 = i7 - (measuredHeight2 / 2);
            childAt2.layout(i13, i14, measuredWidth2 + i13, measuredHeight2 + i14);
            return;
        }
        int i15 = i10 - (i9 ^ 1);
        int max = Math.max(0, i15 > 0 ? paddingRight / i15 : 0);
        if (b) {
            int width = getWidth() - getPaddingRight();
            for (int i16 = 0; i16 < childCount; i16++) {
                View childAt3 = getChildAt(i16);
                C0403c cVar2 = (C0403c) childAt3.getLayoutParams();
                if (childAt3.getVisibility() != 8 && !cVar2.f1305a) {
                    int i17 = width - cVar2.rightMargin;
                    int measuredWidth3 = childAt3.getMeasuredWidth();
                    int measuredHeight3 = childAt3.getMeasuredHeight();
                    int i18 = i7 - (measuredHeight3 / 2);
                    childAt3.layout(i17 - measuredWidth3, i18, i17, measuredHeight3 + i18);
                    width = i17 - ((measuredWidth3 + cVar2.leftMargin) + max);
                }
            }
            return;
        }
        int paddingLeft = getPaddingLeft();
        for (int i19 = 0; i19 < childCount; i19++) {
            View childAt4 = getChildAt(i19);
            C0403c cVar3 = (C0403c) childAt4.getLayoutParams();
            if (childAt4.getVisibility() != 8 && !cVar3.f1305a) {
                int i20 = paddingLeft + cVar3.leftMargin;
                int measuredWidth4 = childAt4.getMeasuredWidth();
                int measuredHeight4 = childAt4.getMeasuredHeight();
                int i21 = i7 - (measuredHeight4 / 2);
                childAt4.layout(i20, i21, i20 + measuredWidth4, measuredHeight4 + i21);
                paddingLeft = i20 + measuredWidth4 + cVar3.rightMargin + max;
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        C0367g gVar;
        boolean z = this.f1297E;
        boolean z2 = View.MeasureSpec.getMode(i) == 1073741824;
        this.f1297E = z2;
        if (z != z2) {
            this.f1298F = 0;
        }
        int size = View.MeasureSpec.getSize(i);
        if (!(!this.f1297E || (gVar = this.f1302x) == null || size == this.f1298F)) {
            this.f1298F = size;
            gVar.mo1343K(true);
        }
        int childCount = getChildCount();
        if (!this.f1297E || childCount <= 0) {
            for (int i3 = 0; i3 < childCount; i3++) {
                C0403c cVar = (C0403c) getChildAt(i3).getLayoutParams();
                cVar.rightMargin = 0;
                cVar.leftMargin = 0;
            }
            super.onMeasure(i, i2);
            return;
        }
        m2009M(i, i2);
    }

    public void setExpandedActionViewsExclusive(boolean z) {
        this.f1294B.mo2076G(z);
    }

    public void setOnMenuItemClickListener(C0405e eVar) {
        this.f1301I = eVar;
    }

    public void setOverflowIcon(Drawable drawable) {
        getMenu();
        this.f1294B.mo2078I(drawable);
    }

    public void setOverflowReserved(boolean z) {
        this.f1293A = z;
    }

    public void setPopupTheme(int i) {
        if (this.f1304z != i) {
            this.f1304z = i;
            if (i == 0) {
                this.f1303y = getContext();
            } else {
                this.f1303y = new ContextThemeWrapper(getContext(), i);
            }
        }
    }

    public void setPresenter(C0458c cVar) {
        this.f1294B = cVar;
        cVar.mo2077H(this);
    }

    public ActionMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBaselineAligned(false);
        float f = context.getResources().getDisplayMetrics().density;
        this.f1299G = (int) (56.0f * f);
        this.f1300H = (int) (f * 4.0f);
        this.f1303y = context;
        this.f1304z = 0;
    }
}
