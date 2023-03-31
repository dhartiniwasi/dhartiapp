package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.C0275a;
import androidx.appcompat.view.C0338c;
import androidx.appcompat.view.C0344g;
import androidx.appcompat.view.menu.C0367g;
import androidx.appcompat.view.menu.C0371i;
import androidx.appcompat.view.menu.C0383m;
import androidx.appcompat.view.menu.C0392r;
import androidx.appcompat.widget.ActionMenuView;
import androidx.core.view.C0835a0;
import androidx.core.view.C0901e;
import androidx.core.view.C0913h;
import androidx.core.view.C0920k;
import androidx.recyclerview.widget.RecyclerView;
import com.pichillilorenzo.flutter_inappwebview.C8710R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p048g.C4288a;
import p048g.C4297j;
import p055h.C4411a;
import p169y.C6079a;

public class Toolbar extends ViewGroup {

    /* renamed from: A */
    private int f1402A;

    /* renamed from: B */
    private C0552s0 f1403B;

    /* renamed from: C */
    private int f1404C;

    /* renamed from: D */
    private int f1405D;

    /* renamed from: E */
    private int f1406E;

    /* renamed from: F */
    private CharSequence f1407F;

    /* renamed from: G */
    private CharSequence f1408G;

    /* renamed from: H */
    private ColorStateList f1409H;

    /* renamed from: I */
    private ColorStateList f1410I;

    /* renamed from: J */
    private boolean f1411J;

    /* renamed from: K */
    private boolean f1412K;

    /* renamed from: L */
    private final ArrayList<View> f1413L;

    /* renamed from: M */
    private final ArrayList<View> f1414M;

    /* renamed from: N */
    private final int[] f1415N;

    /* renamed from: O */
    final C0920k f1416O;

    /* renamed from: P */
    private ArrayList<MenuItem> f1417P;

    /* renamed from: Q */
    C0431f f1418Q;

    /* renamed from: R */
    private final ActionMenuView.C0405e f1419R;

    /* renamed from: S */
    private C0474c1 f1420S;

    /* renamed from: a */
    private ActionMenuView f1421a;

    /* renamed from: a0 */
    private C0458c f1422a0;

    /* renamed from: b */
    private TextView f1423b;

    /* renamed from: b0 */
    private C0429d f1424b0;

    /* renamed from: c */
    private TextView f1425c;

    /* renamed from: c0 */
    private C0383m.C0384a f1426c0;

    /* renamed from: d */
    private ImageButton f1427d;

    /* renamed from: d0 */
    private C0367g.C0368a f1428d0;

    /* renamed from: e */
    private ImageView f1429e;

    /* renamed from: e0 */
    private boolean f1430e0;

    /* renamed from: f */
    private Drawable f1431f;

    /* renamed from: f0 */
    private final Runnable f1432f0;

    /* renamed from: g */
    private CharSequence f1433g;

    /* renamed from: h */
    ImageButton f1434h;

    /* renamed from: i */
    View f1435i;

    /* renamed from: r */
    private Context f1436r;

    /* renamed from: s */
    private int f1437s;

    /* renamed from: t */
    private int f1438t;

    /* renamed from: u */
    private int f1439u;

    /* renamed from: v */
    int f1440v;

    /* renamed from: w */
    private int f1441w;

    /* renamed from: x */
    private int f1442x;

    /* renamed from: y */
    private int f1443y;

    /* renamed from: z */
    private int f1444z;

    /* renamed from: androidx.appcompat.widget.Toolbar$a */
    class C0426a implements ActionMenuView.C0405e {
        C0426a() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            if (Toolbar.this.f1416O.mo3403j(menuItem)) {
                return true;
            }
            C0431f fVar = Toolbar.this.f1418Q;
            if (fVar != null) {
                return fVar.onMenuItemClick(menuItem);
            }
            return false;
        }
    }

    /* renamed from: androidx.appcompat.widget.Toolbar$b */
    class C0427b implements Runnable {
        C0427b() {
        }

        public void run() {
            Toolbar.this.mo1859Q();
        }
    }

    /* renamed from: androidx.appcompat.widget.Toolbar$c */
    class C0428c implements View.OnClickListener {
        C0428c() {
        }

        public void onClick(View view) {
            Toolbar.this.mo1863e();
        }
    }

    /* renamed from: androidx.appcompat.widget.Toolbar$d */
    private class C0429d implements C0383m {

        /* renamed from: a */
        C0367g f1448a;

        /* renamed from: b */
        C0371i f1449b;

        C0429d() {
        }

        /* renamed from: a */
        public void mo1271a(C0367g gVar, boolean z) {
        }

        /* renamed from: c */
        public void mo1273c(boolean z) {
            if (this.f1449b != null) {
                C0367g gVar = this.f1448a;
                boolean z2 = false;
                if (gVar != null) {
                    int size = gVar.size();
                    int i = 0;
                    while (true) {
                        if (i >= size) {
                            break;
                        } else if (this.f1448a.getItem(i) == this.f1449b) {
                            z2 = true;
                            break;
                        } else {
                            i++;
                        }
                    }
                }
                if (!z2) {
                    mo1274e(this.f1448a, this.f1449b);
                }
            }
        }

        /* renamed from: d */
        public boolean mo1293d() {
            return false;
        }

        /* renamed from: e */
        public boolean mo1274e(C0367g gVar, C0371i iVar) {
            View view = Toolbar.this.f1435i;
            if (view instanceof C0338c) {
                ((C0338c) view).mo1113f();
            }
            Toolbar toolbar = Toolbar.this;
            toolbar.removeView(toolbar.f1435i);
            Toolbar toolbar2 = Toolbar.this;
            toolbar2.removeView(toolbar2.f1434h);
            Toolbar toolbar3 = Toolbar.this;
            toolbar3.f1435i = null;
            toolbar3.mo1860a();
            this.f1449b = null;
            Toolbar.this.requestLayout();
            iVar.mo1445r(false);
            return true;
        }

        /* renamed from: f */
        public boolean mo1275f(C0367g gVar, C0371i iVar) {
            Toolbar.this.mo1865g();
            ViewParent parent = Toolbar.this.f1434h.getParent();
            Toolbar toolbar = Toolbar.this;
            if (parent != toolbar) {
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(toolbar.f1434h);
                }
                Toolbar toolbar2 = Toolbar.this;
                toolbar2.addView(toolbar2.f1434h);
            }
            Toolbar.this.f1435i = iVar.getActionView();
            this.f1449b = iVar;
            ViewParent parent2 = Toolbar.this.f1435i.getParent();
            Toolbar toolbar3 = Toolbar.this;
            if (parent2 != toolbar3) {
                if (parent2 instanceof ViewGroup) {
                    ((ViewGroup) parent2).removeView(toolbar3.f1435i);
                }
                C0430e m = Toolbar.this.generateDefaultLayoutParams();
                Toolbar toolbar4 = Toolbar.this;
                m.f731a = 8388611 | (toolbar4.f1440v & C8710R.styleable.AppCompatTheme_toolbarNavigationButtonStyle);
                m.f1451b = 2;
                toolbar4.f1435i.setLayoutParams(m);
                Toolbar toolbar5 = Toolbar.this;
                toolbar5.addView(toolbar5.f1435i);
            }
            Toolbar.this.mo1853I();
            Toolbar.this.requestLayout();
            iVar.mo1445r(true);
            View view = Toolbar.this.f1435i;
            if (view instanceof C0338c) {
                ((C0338c) view).mo1112c();
            }
            return true;
        }

        /* renamed from: h */
        public void mo1277h(Context context, C0367g gVar) {
            C0371i iVar;
            C0367g gVar2 = this.f1448a;
            if (!(gVar2 == null || (iVar = this.f1449b) == null)) {
                gVar2.mo1377f(iVar);
            }
            this.f1448a = gVar;
        }

        /* renamed from: j */
        public boolean mo1279j(C0392r rVar) {
            return false;
        }
    }

    /* renamed from: androidx.appcompat.widget.Toolbar$f */
    public interface C0431f {
        boolean onMenuItemClick(MenuItem menuItem);
    }

    public Toolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C4288a.f23760M);
    }

    /* renamed from: C */
    private int m2097C(View view, int i, int[] iArr, int i2) {
        C0430e eVar = (C0430e) view.getLayoutParams();
        int i3 = eVar.leftMargin - iArr[0];
        int max = i + Math.max(0, i3);
        iArr[0] = Math.max(0, -i3);
        int q = m2113q(view, i2);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max, q, max + measuredWidth, view.getMeasuredHeight() + q);
        return max + measuredWidth + eVar.rightMargin;
    }

    /* renamed from: D */
    private int m2098D(View view, int i, int[] iArr, int i2) {
        C0430e eVar = (C0430e) view.getLayoutParams();
        int i3 = eVar.rightMargin - iArr[1];
        int max = i - Math.max(0, i3);
        iArr[1] = Math.max(0, -i3);
        int q = m2113q(view, i2);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max - measuredWidth, q, max, view.getMeasuredHeight() + q);
        return max - (measuredWidth + eVar.leftMargin);
    }

    /* renamed from: E */
    private int m2099E(View view, int i, int i2, int i3, int i4, int[] iArr) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i5 = marginLayoutParams.leftMargin - iArr[0];
        int i6 = marginLayoutParams.rightMargin - iArr[1];
        int max = Math.max(0, i5) + Math.max(0, i6);
        iArr[0] = Math.max(0, -i5);
        iArr[1] = Math.max(0, -i6);
        view.measure(ViewGroup.getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight() + max + i2, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i3, getPaddingTop() + getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i4, marginLayoutParams.height));
        return view.getMeasuredWidth() + max;
    }

    /* renamed from: F */
    private void m2100F(View view, int i, int i2, int i3, int i4, int i5) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, marginLayoutParams.width);
        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i3, getPaddingTop() + getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i4, marginLayoutParams.height);
        int mode = View.MeasureSpec.getMode(childMeasureSpec2);
        if (mode != 1073741824 && i5 >= 0) {
            if (mode != 0) {
                i5 = Math.min(View.MeasureSpec.getSize(childMeasureSpec2), i5);
            }
            childMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i5, 1073741824);
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }

    /* renamed from: G */
    private void m2101G() {
        Menu menu = getMenu();
        ArrayList<MenuItem> currentMenuItems = getCurrentMenuItems();
        this.f1416O.mo3401h(menu, getMenuInflater());
        ArrayList<MenuItem> currentMenuItems2 = getCurrentMenuItems();
        currentMenuItems2.removeAll(currentMenuItems);
        this.f1417P = currentMenuItems2;
        this.f1416O.mo3404k(menu);
    }

    /* renamed from: H */
    private void m2102H() {
        removeCallbacks(this.f1432f0);
        post(this.f1432f0);
    }

    /* renamed from: O */
    private boolean m2103O() {
        if (!this.f1430e0) {
            return false;
        }
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (m2104P(childAt) && childAt.getMeasuredWidth() > 0 && childAt.getMeasuredHeight() > 0) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: P */
    private boolean m2104P(View view) {
        return (view == null || view.getParent() != this || view.getVisibility() == 8) ? false : true;
    }

    /* renamed from: b */
    private void m2105b(List<View> list, int i) {
        boolean z = C0835a0.m3682B(this) == 1;
        int childCount = getChildCount();
        int b = C0901e.m4084b(i, C0835a0.m3682B(this));
        list.clear();
        if (z) {
            for (int i2 = childCount - 1; i2 >= 0; i2--) {
                View childAt = getChildAt(i2);
                C0430e eVar = (C0430e) childAt.getLayoutParams();
                if (eVar.f1451b == 0 && m2104P(childAt) && m2112p(eVar.f731a) == b) {
                    list.add(childAt);
                }
            }
            return;
        }
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt2 = getChildAt(i3);
            C0430e eVar2 = (C0430e) childAt2.getLayoutParams();
            if (eVar2.f1451b == 0 && m2104P(childAt2) && m2112p(eVar2.f731a) == b) {
                list.add(childAt2);
            }
        }
    }

    /* renamed from: c */
    private void m2106c(View view, boolean z) {
        C0430e eVar;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            eVar = generateDefaultLayoutParams();
        } else if (!checkLayoutParams(layoutParams)) {
            eVar = generateLayoutParams(layoutParams);
        } else {
            eVar = (C0430e) layoutParams;
        }
        eVar.f1451b = 1;
        if (!z || this.f1435i == null) {
            addView(view, eVar);
            return;
        }
        view.setLayoutParams(eVar);
        this.f1414M.add(view);
    }

    private ArrayList<MenuItem> getCurrentMenuItems() {
        ArrayList<MenuItem> arrayList = new ArrayList<>();
        Menu menu = getMenu();
        for (int i = 0; i < menu.size(); i++) {
            arrayList.add(menu.getItem(i));
        }
        return arrayList;
    }

    private MenuInflater getMenuInflater() {
        return new C0344g(getContext());
    }

    /* renamed from: h */
    private void m2107h() {
        if (this.f1403B == null) {
            this.f1403B = new C0552s0();
        }
    }

    /* renamed from: i */
    private void m2108i() {
        if (this.f1429e == null) {
            this.f1429e = new C0549r(getContext());
        }
    }

    /* renamed from: j */
    private void m2109j() {
        m2110k();
        if (this.f1421a.mo1716N() == null) {
            C0367g gVar = (C0367g) this.f1421a.getMenu();
            if (this.f1424b0 == null) {
                this.f1424b0 = new C0429d();
            }
            this.f1421a.setExpandedActionViewsExclusive(true);
            gVar.mo1369c(this.f1424b0, this.f1436r);
        }
    }

    /* renamed from: k */
    private void m2110k() {
        if (this.f1421a == null) {
            ActionMenuView actionMenuView = new ActionMenuView(getContext());
            this.f1421a = actionMenuView;
            actionMenuView.setPopupTheme(this.f1437s);
            this.f1421a.setOnMenuItemClickListener(this.f1419R);
            this.f1421a.mo1717O(this.f1426c0, this.f1428d0);
            C0430e m = generateDefaultLayoutParams();
            m.f731a = 8388613 | (this.f1440v & C8710R.styleable.AppCompatTheme_toolbarNavigationButtonStyle);
            this.f1421a.setLayoutParams(m);
            m2106c(this.f1421a, false);
        }
    }

    /* renamed from: l */
    private void m2111l() {
        if (this.f1427d == null) {
            this.f1427d = new C0534p(getContext(), (AttributeSet) null, C4288a.f23759L);
            C0430e m = generateDefaultLayoutParams();
            m.f731a = 8388611 | (this.f1440v & C8710R.styleable.AppCompatTheme_toolbarNavigationButtonStyle);
            this.f1427d.setLayoutParams(m);
        }
    }

    /* renamed from: p */
    private int m2112p(int i) {
        int B = C0835a0.m3682B(this);
        int b = C0901e.m4084b(i, B) & 7;
        if (b == 1 || b == 3 || b == 5) {
            return b;
        }
        return B == 1 ? 5 : 3;
    }

    /* renamed from: q */
    private int m2113q(View view, int i) {
        C0430e eVar = (C0430e) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        int i2 = i > 0 ? (measuredHeight - i) / 2 : 0;
        int r = m2114r(eVar.f731a);
        if (r == 48) {
            return getPaddingTop() - i2;
        }
        if (r == 80) {
            return (((getHeight() - getPaddingBottom()) - measuredHeight) - eVar.bottomMargin) - i2;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int height = getHeight();
        int i3 = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
        int i4 = eVar.topMargin;
        if (i3 < i4) {
            i3 = i4;
        } else {
            int i5 = (((height - paddingBottom) - measuredHeight) - i3) - paddingTop;
            int i6 = eVar.bottomMargin;
            if (i5 < i6) {
                i3 = Math.max(0, i3 - (i6 - i5));
            }
        }
        return paddingTop + i3;
    }

    /* renamed from: r */
    private int m2114r(int i) {
        int i2 = i & C8710R.styleable.AppCompatTheme_toolbarNavigationButtonStyle;
        return (i2 == 16 || i2 == 48 || i2 == 80) ? i2 : this.f1406E & C8710R.styleable.AppCompatTheme_toolbarNavigationButtonStyle;
    }

    /* renamed from: s */
    private int m2115s(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return C0913h.m4129b(marginLayoutParams) + C0913h.m4128a(marginLayoutParams);
    }

    /* renamed from: t */
    private int m2116t(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    /* renamed from: u */
    private int m2117u(List<View> list, int[] iArr) {
        int i = iArr[0];
        int i2 = iArr[1];
        int size = list.size();
        int i3 = 0;
        int i4 = 0;
        while (i3 < size) {
            View view = list.get(i3);
            C0430e eVar = (C0430e) view.getLayoutParams();
            int i5 = eVar.leftMargin - i;
            int i6 = eVar.rightMargin - i2;
            int max = Math.max(0, i5);
            int max2 = Math.max(0, i6);
            int max3 = Math.max(0, -i5);
            int max4 = Math.max(0, -i6);
            i4 += max + view.getMeasuredWidth() + max2;
            i3++;
            i2 = max4;
            i = max3;
        }
        return i4;
    }

    /* renamed from: z */
    private boolean m2118z(View view) {
        return view.getParent() == this || this.f1414M.contains(view);
    }

    /* renamed from: A */
    public boolean mo1851A() {
        ActionMenuView actionMenuView = this.f1421a;
        return actionMenuView != null && actionMenuView.mo1713I();
    }

    /* renamed from: B */
    public boolean mo1852B() {
        ActionMenuView actionMenuView = this.f1421a;
        return actionMenuView != null && actionMenuView.mo1714J();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: I */
    public void mo1853I() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            if (!(((C0430e) childAt.getLayoutParams()).f1451b == 2 || childAt == this.f1421a)) {
                removeViewAt(childCount);
                this.f1414M.add(childAt);
            }
        }
    }

    /* renamed from: J */
    public void mo1854J(int i, int i2) {
        m2107h();
        this.f1403B.mo2588g(i, i2);
    }

    /* renamed from: K */
    public void mo1855K(C0367g gVar, C0458c cVar) {
        if (gVar != null || this.f1421a != null) {
            m2110k();
            C0367g N = this.f1421a.mo1716N();
            if (N != gVar) {
                if (N != null) {
                    N.mo1346O(this.f1422a0);
                    N.mo1346O(this.f1424b0);
                }
                if (this.f1424b0 == null) {
                    this.f1424b0 = new C0429d();
                }
                cVar.mo2076G(true);
                if (gVar != null) {
                    gVar.mo1369c(cVar, this.f1436r);
                    gVar.mo1369c(this.f1424b0, this.f1436r);
                } else {
                    cVar.mo1277h(this.f1436r, (C0367g) null);
                    this.f1424b0.mo1277h(this.f1436r, (C0367g) null);
                    cVar.mo1273c(true);
                    this.f1424b0.mo1273c(true);
                }
                this.f1421a.setPopupTheme(this.f1437s);
                this.f1421a.setPresenter(cVar);
                this.f1422a0 = cVar;
            }
        }
    }

    /* renamed from: L */
    public void mo1856L(C0383m.C0384a aVar, C0367g.C0368a aVar2) {
        this.f1426c0 = aVar;
        this.f1428d0 = aVar2;
        ActionMenuView actionMenuView = this.f1421a;
        if (actionMenuView != null) {
            actionMenuView.mo1717O(aVar, aVar2);
        }
    }

    /* renamed from: M */
    public void mo1857M(Context context, int i) {
        this.f1439u = i;
        TextView textView = this.f1425c;
        if (textView != null) {
            textView.setTextAppearance(context, i);
        }
    }

    /* renamed from: N */
    public void mo1858N(Context context, int i) {
        this.f1438t = i;
        TextView textView = this.f1423b;
        if (textView != null) {
            textView.setTextAppearance(context, i);
        }
    }

    /* renamed from: Q */
    public boolean mo1859Q() {
        ActionMenuView actionMenuView = this.f1421a;
        return actionMenuView != null && actionMenuView.mo1718P();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo1860a() {
        for (int size = this.f1414M.size() - 1; size >= 0; size--) {
            addView(this.f1414M.get(size));
        }
        this.f1414M.clear();
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof C0430e);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r0 = r1.f1421a;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo1862d() {
        /*
            r1 = this;
            int r0 = r1.getVisibility()
            if (r0 != 0) goto L_0x0012
            androidx.appcompat.widget.ActionMenuView r0 = r1.f1421a
            if (r0 == 0) goto L_0x0012
            boolean r0 = r0.mo1715K()
            if (r0 == 0) goto L_0x0012
            r0 = 1
            goto L_0x0013
        L_0x0012:
            r0 = 0
        L_0x0013:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.Toolbar.mo1862d():boolean");
    }

    /* renamed from: e */
    public void mo1863e() {
        C0371i iVar;
        C0429d dVar = this.f1424b0;
        if (dVar == null) {
            iVar = null;
        } else {
            iVar = dVar.f1449b;
        }
        if (iVar != null) {
            iVar.collapseActionView();
        }
    }

    /* renamed from: f */
    public void mo1864f() {
        ActionMenuView actionMenuView = this.f1421a;
        if (actionMenuView != null) {
            actionMenuView.mo1706B();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public void mo1865g() {
        if (this.f1434h == null) {
            C0534p pVar = new C0534p(getContext(), (AttributeSet) null, C4288a.f23759L);
            this.f1434h = pVar;
            pVar.setImageDrawable(this.f1431f);
            this.f1434h.setContentDescription(this.f1433g);
            C0430e m = generateDefaultLayoutParams();
            m.f731a = 8388611 | (this.f1440v & C8710R.styleable.AppCompatTheme_toolbarNavigationButtonStyle);
            m.f1451b = 2;
            this.f1434h.setLayoutParams(m);
            this.f1434h.setOnClickListener(new C0428c());
        }
    }

    public CharSequence getCollapseContentDescription() {
        ImageButton imageButton = this.f1434h;
        if (imageButton != null) {
            return imageButton.getContentDescription();
        }
        return null;
    }

    public Drawable getCollapseIcon() {
        ImageButton imageButton = this.f1434h;
        if (imageButton != null) {
            return imageButton.getDrawable();
        }
        return null;
    }

    public int getContentInsetEnd() {
        C0552s0 s0Var = this.f1403B;
        if (s0Var != null) {
            return s0Var.mo2582a();
        }
        return 0;
    }

    public int getContentInsetEndWithActions() {
        int i = this.f1405D;
        return i != Integer.MIN_VALUE ? i : getContentInsetEnd();
    }

    public int getContentInsetLeft() {
        C0552s0 s0Var = this.f1403B;
        if (s0Var != null) {
            return s0Var.mo2583b();
        }
        return 0;
    }

    public int getContentInsetRight() {
        C0552s0 s0Var = this.f1403B;
        if (s0Var != null) {
            return s0Var.mo2584c();
        }
        return 0;
    }

    public int getContentInsetStart() {
        C0552s0 s0Var = this.f1403B;
        if (s0Var != null) {
            return s0Var.mo2585d();
        }
        return 0;
    }

    public int getContentInsetStartWithNavigation() {
        int i = this.f1404C;
        return i != Integer.MIN_VALUE ? i : getContentInsetStart();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0005, code lost:
        r0 = r0.mo1716N();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int getCurrentContentInsetEnd() {
        /*
            r3 = this;
            androidx.appcompat.widget.ActionMenuView r0 = r3.f1421a
            r1 = 0
            if (r0 == 0) goto L_0x0013
            androidx.appcompat.view.menu.g r0 = r0.mo1716N()
            if (r0 == 0) goto L_0x0013
            boolean r0 = r0.hasVisibleItems()
            if (r0 == 0) goto L_0x0013
            r0 = 1
            goto L_0x0014
        L_0x0013:
            r0 = 0
        L_0x0014:
            if (r0 == 0) goto L_0x0025
            int r0 = r3.getContentInsetEnd()
            int r2 = r3.f1405D
            int r1 = java.lang.Math.max(r2, r1)
            int r0 = java.lang.Math.max(r0, r1)
            goto L_0x0029
        L_0x0025:
            int r0 = r3.getContentInsetEnd()
        L_0x0029:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.Toolbar.getCurrentContentInsetEnd():int");
    }

    public int getCurrentContentInsetLeft() {
        if (C0835a0.m3682B(this) == 1) {
            return getCurrentContentInsetEnd();
        }
        return getCurrentContentInsetStart();
    }

    public int getCurrentContentInsetRight() {
        if (C0835a0.m3682B(this) == 1) {
            return getCurrentContentInsetStart();
        }
        return getCurrentContentInsetEnd();
    }

    public int getCurrentContentInsetStart() {
        if (getNavigationIcon() != null) {
            return Math.max(getContentInsetStart(), Math.max(this.f1404C, 0));
        }
        return getContentInsetStart();
    }

    public Drawable getLogo() {
        ImageView imageView = this.f1429e;
        if (imageView != null) {
            return imageView.getDrawable();
        }
        return null;
    }

    public CharSequence getLogoDescription() {
        ImageView imageView = this.f1429e;
        if (imageView != null) {
            return imageView.getContentDescription();
        }
        return null;
    }

    public Menu getMenu() {
        m2109j();
        return this.f1421a.getMenu();
    }

    /* access modifiers changed from: package-private */
    public View getNavButtonView() {
        return this.f1427d;
    }

    public CharSequence getNavigationContentDescription() {
        ImageButton imageButton = this.f1427d;
        if (imageButton != null) {
            return imageButton.getContentDescription();
        }
        return null;
    }

    public Drawable getNavigationIcon() {
        ImageButton imageButton = this.f1427d;
        if (imageButton != null) {
            return imageButton.getDrawable();
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public C0458c getOuterActionMenuPresenter() {
        return this.f1422a0;
    }

    public Drawable getOverflowIcon() {
        m2109j();
        return this.f1421a.getOverflowIcon();
    }

    /* access modifiers changed from: package-private */
    public Context getPopupContext() {
        return this.f1436r;
    }

    public int getPopupTheme() {
        return this.f1437s;
    }

    public CharSequence getSubtitle() {
        return this.f1408G;
    }

    /* access modifiers changed from: package-private */
    public final TextView getSubtitleTextView() {
        return this.f1425c;
    }

    public CharSequence getTitle() {
        return this.f1407F;
    }

    public int getTitleMarginBottom() {
        return this.f1402A;
    }

    public int getTitleMarginEnd() {
        return this.f1443y;
    }

    public int getTitleMarginStart() {
        return this.f1442x;
    }

    public int getTitleMarginTop() {
        return this.f1444z;
    }

    /* access modifiers changed from: package-private */
    public final TextView getTitleTextView() {
        return this.f1423b;
    }

    public C0497h0 getWrapper() {
        if (this.f1420S == null) {
            this.f1420S = new C0474c1(this, true);
        }
        return this.f1420S;
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public C0430e generateDefaultLayoutParams() {
        return new C0430e(-2, -2);
    }

    /* renamed from: n */
    public C0430e generateLayoutParams(AttributeSet attributeSet) {
        return new C0430e(getContext(), attributeSet);
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public C0430e generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof C0430e) {
            return new C0430e((C0430e) layoutParams);
        }
        if (layoutParams instanceof C0275a.C0276a) {
            return new C0430e((C0275a.C0276a) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new C0430e((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new C0430e(layoutParams);
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.f1432f0);
    }

    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f1412K = false;
        }
        if (!this.f1412K) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.f1412K = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.f1412K = false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x029f A[LOOP:0: B:101:0x029d->B:102:0x029f, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x02c1 A[LOOP:1: B:104:0x02bf->B:105:0x02c1, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x02eb  */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x02fa A[LOOP:2: B:112:0x02f8->B:113:0x02fa, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x005f  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0076  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00b3  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00ca  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00e7  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0100  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0105  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x011d  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x012d  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0130  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0134  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0137  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0168  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x01a6  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x01b7  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x0227  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onLayout(boolean r20, int r21, int r22, int r23, int r24) {
        /*
            r19 = this;
            r0 = r19
            int r1 = androidx.core.view.C0835a0.m3682B(r19)
            r2 = 1
            r3 = 0
            if (r1 != r2) goto L_0x000c
            r1 = 1
            goto L_0x000d
        L_0x000c:
            r1 = 0
        L_0x000d:
            int r4 = r19.getWidth()
            int r5 = r19.getHeight()
            int r6 = r19.getPaddingLeft()
            int r7 = r19.getPaddingRight()
            int r8 = r19.getPaddingTop()
            int r9 = r19.getPaddingBottom()
            int r10 = r4 - r7
            int[] r11 = r0.f1415N
            r11[r2] = r3
            r11[r3] = r3
            int r12 = androidx.core.view.C0835a0.m3684C(r19)
            if (r12 < 0) goto L_0x003a
            int r13 = r24 - r22
            int r12 = java.lang.Math.min(r12, r13)
            goto L_0x003b
        L_0x003a:
            r12 = 0
        L_0x003b:
            android.widget.ImageButton r13 = r0.f1427d
            boolean r13 = r0.m2104P(r13)
            if (r13 == 0) goto L_0x0055
            if (r1 == 0) goto L_0x004e
            android.widget.ImageButton r13 = r0.f1427d
            int r13 = r0.m2098D(r13, r10, r11, r12)
            r14 = r13
            r13 = r6
            goto L_0x0057
        L_0x004e:
            android.widget.ImageButton r13 = r0.f1427d
            int r13 = r0.m2097C(r13, r6, r11, r12)
            goto L_0x0056
        L_0x0055:
            r13 = r6
        L_0x0056:
            r14 = r10
        L_0x0057:
            android.widget.ImageButton r15 = r0.f1434h
            boolean r15 = r0.m2104P(r15)
            if (r15 == 0) goto L_0x006e
            if (r1 == 0) goto L_0x0068
            android.widget.ImageButton r15 = r0.f1434h
            int r14 = r0.m2098D(r15, r14, r11, r12)
            goto L_0x006e
        L_0x0068:
            android.widget.ImageButton r15 = r0.f1434h
            int r13 = r0.m2097C(r15, r13, r11, r12)
        L_0x006e:
            androidx.appcompat.widget.ActionMenuView r15 = r0.f1421a
            boolean r15 = r0.m2104P(r15)
            if (r15 == 0) goto L_0x0085
            if (r1 == 0) goto L_0x007f
            androidx.appcompat.widget.ActionMenuView r15 = r0.f1421a
            int r13 = r0.m2097C(r15, r13, r11, r12)
            goto L_0x0085
        L_0x007f:
            androidx.appcompat.widget.ActionMenuView r15 = r0.f1421a
            int r14 = r0.m2098D(r15, r14, r11, r12)
        L_0x0085:
            int r15 = r19.getCurrentContentInsetLeft()
            int r16 = r19.getCurrentContentInsetRight()
            int r2 = r15 - r13
            int r2 = java.lang.Math.max(r3, r2)
            r11[r3] = r2
            int r2 = r10 - r14
            int r2 = r16 - r2
            int r2 = java.lang.Math.max(r3, r2)
            r17 = 1
            r11[r17] = r2
            int r2 = java.lang.Math.max(r13, r15)
            int r10 = r10 - r16
            int r10 = java.lang.Math.min(r14, r10)
            android.view.View r13 = r0.f1435i
            boolean r13 = r0.m2104P(r13)
            if (r13 == 0) goto L_0x00c2
            if (r1 == 0) goto L_0x00bc
            android.view.View r13 = r0.f1435i
            int r10 = r0.m2098D(r13, r10, r11, r12)
            goto L_0x00c2
        L_0x00bc:
            android.view.View r13 = r0.f1435i
            int r2 = r0.m2097C(r13, r2, r11, r12)
        L_0x00c2:
            android.widget.ImageView r13 = r0.f1429e
            boolean r13 = r0.m2104P(r13)
            if (r13 == 0) goto L_0x00d9
            if (r1 == 0) goto L_0x00d3
            android.widget.ImageView r13 = r0.f1429e
            int r10 = r0.m2098D(r13, r10, r11, r12)
            goto L_0x00d9
        L_0x00d3:
            android.widget.ImageView r13 = r0.f1429e
            int r2 = r0.m2097C(r13, r2, r11, r12)
        L_0x00d9:
            android.widget.TextView r13 = r0.f1423b
            boolean r13 = r0.m2104P(r13)
            android.widget.TextView r14 = r0.f1425c
            boolean r14 = r0.m2104P(r14)
            if (r13 == 0) goto L_0x0100
            android.widget.TextView r15 = r0.f1423b
            android.view.ViewGroup$LayoutParams r15 = r15.getLayoutParams()
            androidx.appcompat.widget.Toolbar$e r15 = (androidx.appcompat.widget.Toolbar.C0430e) r15
            int r3 = r15.topMargin
            r23 = r7
            android.widget.TextView r7 = r0.f1423b
            int r7 = r7.getMeasuredHeight()
            int r3 = r3 + r7
            int r7 = r15.bottomMargin
            int r3 = r3 + r7
            r7 = 0
            int r3 = r3 + r7
            goto L_0x0103
        L_0x0100:
            r23 = r7
            r3 = 0
        L_0x0103:
            if (r14 == 0) goto L_0x011d
            android.widget.TextView r7 = r0.f1425c
            android.view.ViewGroup$LayoutParams r7 = r7.getLayoutParams()
            androidx.appcompat.widget.Toolbar$e r7 = (androidx.appcompat.widget.Toolbar.C0430e) r7
            int r15 = r7.topMargin
            r16 = r4
            android.widget.TextView r4 = r0.f1425c
            int r4 = r4.getMeasuredHeight()
            int r15 = r15 + r4
            int r4 = r7.bottomMargin
            int r15 = r15 + r4
            int r3 = r3 + r15
            goto L_0x011f
        L_0x011d:
            r16 = r4
        L_0x011f:
            if (r13 != 0) goto L_0x012b
            if (r14 == 0) goto L_0x0124
            goto L_0x012b
        L_0x0124:
            r18 = r6
            r22 = r12
        L_0x0128:
            r1 = 0
            goto L_0x0290
        L_0x012b:
            if (r13 == 0) goto L_0x0130
            android.widget.TextView r4 = r0.f1423b
            goto L_0x0132
        L_0x0130:
            android.widget.TextView r4 = r0.f1425c
        L_0x0132:
            if (r14 == 0) goto L_0x0137
            android.widget.TextView r7 = r0.f1425c
            goto L_0x0139
        L_0x0137:
            android.widget.TextView r7 = r0.f1423b
        L_0x0139:
            android.view.ViewGroup$LayoutParams r4 = r4.getLayoutParams()
            androidx.appcompat.widget.Toolbar$e r4 = (androidx.appcompat.widget.Toolbar.C0430e) r4
            android.view.ViewGroup$LayoutParams r7 = r7.getLayoutParams()
            androidx.appcompat.widget.Toolbar$e r7 = (androidx.appcompat.widget.Toolbar.C0430e) r7
            if (r13 == 0) goto L_0x014f
            android.widget.TextView r15 = r0.f1423b
            int r15 = r15.getMeasuredWidth()
            if (r15 > 0) goto L_0x0159
        L_0x014f:
            if (r14 == 0) goto L_0x015c
            android.widget.TextView r15 = r0.f1425c
            int r15 = r15.getMeasuredWidth()
            if (r15 <= 0) goto L_0x015c
        L_0x0159:
            r17 = 1
            goto L_0x015e
        L_0x015c:
            r17 = 0
        L_0x015e:
            int r15 = r0.f1406E
            r15 = r15 & 112(0x70, float:1.57E-43)
            r18 = r6
            r6 = 48
            if (r15 == r6) goto L_0x01a6
            r6 = 80
            if (r15 == r6) goto L_0x0198
            int r6 = r5 - r8
            int r6 = r6 - r9
            int r6 = r6 - r3
            int r6 = r6 / 2
            int r15 = r4.topMargin
            r22 = r12
            int r12 = r0.f1444z
            r24 = r2
            int r2 = r15 + r12
            if (r6 >= r2) goto L_0x0181
            int r6 = r15 + r12
            goto L_0x0196
        L_0x0181:
            int r5 = r5 - r9
            int r5 = r5 - r3
            int r5 = r5 - r6
            int r5 = r5 - r8
            int r2 = r4.bottomMargin
            int r3 = r0.f1402A
            int r2 = r2 + r3
            if (r5 >= r2) goto L_0x0196
            int r2 = r7.bottomMargin
            int r2 = r2 + r3
            int r2 = r2 - r5
            int r6 = r6 - r2
            r2 = 0
            int r6 = java.lang.Math.max(r2, r6)
        L_0x0196:
            int r8 = r8 + r6
            goto L_0x01b5
        L_0x0198:
            r24 = r2
            r22 = r12
            int r5 = r5 - r9
            int r2 = r7.bottomMargin
            int r5 = r5 - r2
            int r2 = r0.f1402A
            int r5 = r5 - r2
            int r8 = r5 - r3
            goto L_0x01b5
        L_0x01a6:
            r24 = r2
            r22 = r12
            int r2 = r19.getPaddingTop()
            int r3 = r4.topMargin
            int r2 = r2 + r3
            int r3 = r0.f1444z
            int r8 = r2 + r3
        L_0x01b5:
            if (r1 == 0) goto L_0x0227
            if (r17 == 0) goto L_0x01bc
            int r1 = r0.f1442x
            goto L_0x01bd
        L_0x01bc:
            r1 = 0
        L_0x01bd:
            r2 = 1
            r3 = r11[r2]
            int r1 = r1 - r3
            r3 = 0
            int r4 = java.lang.Math.max(r3, r1)
            int r10 = r10 - r4
            int r1 = -r1
            int r1 = java.lang.Math.max(r3, r1)
            r11[r2] = r1
            if (r13 == 0) goto L_0x01f4
            android.widget.TextView r1 = r0.f1423b
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            androidx.appcompat.widget.Toolbar$e r1 = (androidx.appcompat.widget.Toolbar.C0430e) r1
            android.widget.TextView r2 = r0.f1423b
            int r2 = r2.getMeasuredWidth()
            int r2 = r10 - r2
            android.widget.TextView r3 = r0.f1423b
            int r3 = r3.getMeasuredHeight()
            int r3 = r3 + r8
            android.widget.TextView r4 = r0.f1423b
            r4.layout(r2, r8, r10, r3)
            int r4 = r0.f1443y
            int r2 = r2 - r4
            int r1 = r1.bottomMargin
            int r8 = r3 + r1
            goto L_0x01f5
        L_0x01f4:
            r2 = r10
        L_0x01f5:
            if (r14 == 0) goto L_0x021b
            android.widget.TextView r1 = r0.f1425c
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            androidx.appcompat.widget.Toolbar$e r1 = (androidx.appcompat.widget.Toolbar.C0430e) r1
            int r1 = r1.topMargin
            int r8 = r8 + r1
            android.widget.TextView r1 = r0.f1425c
            int r1 = r1.getMeasuredWidth()
            int r1 = r10 - r1
            android.widget.TextView r3 = r0.f1425c
            int r3 = r3.getMeasuredHeight()
            int r3 = r3 + r8
            android.widget.TextView r4 = r0.f1425c
            r4.layout(r1, r8, r10, r3)
            int r1 = r0.f1443y
            int r1 = r10 - r1
            goto L_0x021c
        L_0x021b:
            r1 = r10
        L_0x021c:
            if (r17 == 0) goto L_0x0223
            int r1 = java.lang.Math.min(r2, r1)
            r10 = r1
        L_0x0223:
            r2 = r24
            goto L_0x0128
        L_0x0227:
            if (r17 == 0) goto L_0x022d
            int r7 = r0.f1442x
            r1 = 0
            goto L_0x022f
        L_0x022d:
            r1 = 0
            r7 = 0
        L_0x022f:
            r2 = r11[r1]
            int r7 = r7 - r2
            int r2 = java.lang.Math.max(r1, r7)
            int r2 = r24 + r2
            int r3 = -r7
            int r3 = java.lang.Math.max(r1, r3)
            r11[r1] = r3
            if (r13 == 0) goto L_0x0264
            android.widget.TextView r3 = r0.f1423b
            android.view.ViewGroup$LayoutParams r3 = r3.getLayoutParams()
            androidx.appcompat.widget.Toolbar$e r3 = (androidx.appcompat.widget.Toolbar.C0430e) r3
            android.widget.TextView r4 = r0.f1423b
            int r4 = r4.getMeasuredWidth()
            int r4 = r4 + r2
            android.widget.TextView r5 = r0.f1423b
            int r5 = r5.getMeasuredHeight()
            int r5 = r5 + r8
            android.widget.TextView r6 = r0.f1423b
            r6.layout(r2, r8, r4, r5)
            int r6 = r0.f1443y
            int r4 = r4 + r6
            int r3 = r3.bottomMargin
            int r8 = r5 + r3
            goto L_0x0265
        L_0x0264:
            r4 = r2
        L_0x0265:
            if (r14 == 0) goto L_0x0289
            android.widget.TextView r3 = r0.f1425c
            android.view.ViewGroup$LayoutParams r3 = r3.getLayoutParams()
            androidx.appcompat.widget.Toolbar$e r3 = (androidx.appcompat.widget.Toolbar.C0430e) r3
            int r3 = r3.topMargin
            int r8 = r8 + r3
            android.widget.TextView r3 = r0.f1425c
            int r3 = r3.getMeasuredWidth()
            int r3 = r3 + r2
            android.widget.TextView r5 = r0.f1425c
            int r5 = r5.getMeasuredHeight()
            int r5 = r5 + r8
            android.widget.TextView r6 = r0.f1425c
            r6.layout(r2, r8, r3, r5)
            int r5 = r0.f1443y
            int r3 = r3 + r5
            goto L_0x028a
        L_0x0289:
            r3 = r2
        L_0x028a:
            if (r17 == 0) goto L_0x0290
            int r2 = java.lang.Math.max(r4, r3)
        L_0x0290:
            java.util.ArrayList<android.view.View> r3 = r0.f1413L
            r4 = 3
            r0.m2105b(r3, r4)
            java.util.ArrayList<android.view.View> r3 = r0.f1413L
            int r3 = r3.size()
            r7 = 0
        L_0x029d:
            if (r7 >= r3) goto L_0x02b0
            java.util.ArrayList<android.view.View> r4 = r0.f1413L
            java.lang.Object r4 = r4.get(r7)
            android.view.View r4 = (android.view.View) r4
            r12 = r22
            int r2 = r0.m2097C(r4, r2, r11, r12)
            int r7 = r7 + 1
            goto L_0x029d
        L_0x02b0:
            r12 = r22
            java.util.ArrayList<android.view.View> r3 = r0.f1413L
            r4 = 5
            r0.m2105b(r3, r4)
            java.util.ArrayList<android.view.View> r3 = r0.f1413L
            int r3 = r3.size()
            r7 = 0
        L_0x02bf:
            if (r7 >= r3) goto L_0x02d0
            java.util.ArrayList<android.view.View> r4 = r0.f1413L
            java.lang.Object r4 = r4.get(r7)
            android.view.View r4 = (android.view.View) r4
            int r10 = r0.m2098D(r4, r10, r11, r12)
            int r7 = r7 + 1
            goto L_0x02bf
        L_0x02d0:
            java.util.ArrayList<android.view.View> r3 = r0.f1413L
            r4 = 1
            r0.m2105b(r3, r4)
            java.util.ArrayList<android.view.View> r3 = r0.f1413L
            int r3 = r0.m2117u(r3, r11)
            int r4 = r16 - r18
            int r4 = r4 - r23
            int r4 = r4 / 2
            int r6 = r18 + r4
            int r4 = r3 / 2
            int r6 = r6 - r4
            int r3 = r3 + r6
            if (r6 >= r2) goto L_0x02eb
            goto L_0x02f2
        L_0x02eb:
            if (r3 <= r10) goto L_0x02f1
            int r3 = r3 - r10
            int r2 = r6 - r3
            goto L_0x02f2
        L_0x02f1:
            r2 = r6
        L_0x02f2:
            java.util.ArrayList<android.view.View> r3 = r0.f1413L
            int r3 = r3.size()
        L_0x02f8:
            if (r1 >= r3) goto L_0x0309
            java.util.ArrayList<android.view.View> r4 = r0.f1413L
            java.lang.Object r4 = r4.get(r1)
            android.view.View r4 = (android.view.View) r4
            int r2 = r0.m2097C(r4, r2, r11, r12)
            int r1 = r1 + 1
            goto L_0x02f8
        L_0x0309:
            java.util.ArrayList<android.view.View> r1 = r0.f1413L
            r1.clear()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.Toolbar.onLayout(boolean, int, int, int, int):void");
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int[] iArr = this.f1415N;
        char b = C0508j1.m2496b(this);
        int i10 = 0;
        char c = b ^ 1;
        if (m2104P(this.f1427d)) {
            m2100F(this.f1427d, i, 0, i2, 0, this.f1441w);
            i5 = this.f1427d.getMeasuredWidth() + m2115s(this.f1427d);
            i4 = Math.max(0, this.f1427d.getMeasuredHeight() + m2116t(this.f1427d));
            i3 = View.combineMeasuredStates(0, this.f1427d.getMeasuredState());
        } else {
            i5 = 0;
            i4 = 0;
            i3 = 0;
        }
        if (m2104P(this.f1434h)) {
            m2100F(this.f1434h, i, 0, i2, 0, this.f1441w);
            i5 = this.f1434h.getMeasuredWidth() + m2115s(this.f1434h);
            i4 = Math.max(i4, this.f1434h.getMeasuredHeight() + m2116t(this.f1434h));
            i3 = View.combineMeasuredStates(i3, this.f1434h.getMeasuredState());
        }
        int currentContentInsetStart = getCurrentContentInsetStart();
        int max = 0 + Math.max(currentContentInsetStart, i5);
        iArr[b] = Math.max(0, currentContentInsetStart - i5);
        if (m2104P(this.f1421a)) {
            m2100F(this.f1421a, i, max, i2, 0, this.f1441w);
            i6 = this.f1421a.getMeasuredWidth() + m2115s(this.f1421a);
            i4 = Math.max(i4, this.f1421a.getMeasuredHeight() + m2116t(this.f1421a));
            i3 = View.combineMeasuredStates(i3, this.f1421a.getMeasuredState());
        } else {
            i6 = 0;
        }
        int currentContentInsetEnd = getCurrentContentInsetEnd();
        int max2 = max + Math.max(currentContentInsetEnd, i6);
        iArr[c] = Math.max(0, currentContentInsetEnd - i6);
        if (m2104P(this.f1435i)) {
            max2 += m2099E(this.f1435i, i, max2, i2, 0, iArr);
            i4 = Math.max(i4, this.f1435i.getMeasuredHeight() + m2116t(this.f1435i));
            i3 = View.combineMeasuredStates(i3, this.f1435i.getMeasuredState());
        }
        if (m2104P(this.f1429e)) {
            max2 += m2099E(this.f1429e, i, max2, i2, 0, iArr);
            i4 = Math.max(i4, this.f1429e.getMeasuredHeight() + m2116t(this.f1429e));
            i3 = View.combineMeasuredStates(i3, this.f1429e.getMeasuredState());
        }
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            if (((C0430e) childAt.getLayoutParams()).f1451b == 0 && m2104P(childAt)) {
                max2 += m2099E(childAt, i, max2, i2, 0, iArr);
                i4 = Math.max(i4, childAt.getMeasuredHeight() + m2116t(childAt));
                i3 = View.combineMeasuredStates(i3, childAt.getMeasuredState());
            }
        }
        int i12 = this.f1444z + this.f1402A;
        int i13 = this.f1442x + this.f1443y;
        if (m2104P(this.f1423b)) {
            m2099E(this.f1423b, i, max2 + i13, i2, i12, iArr);
            int measuredWidth = this.f1423b.getMeasuredWidth() + m2115s(this.f1423b);
            i7 = this.f1423b.getMeasuredHeight() + m2116t(this.f1423b);
            i9 = View.combineMeasuredStates(i3, this.f1423b.getMeasuredState());
            i8 = measuredWidth;
        } else {
            i9 = i3;
            i8 = 0;
            i7 = 0;
        }
        if (m2104P(this.f1425c)) {
            int i14 = i7 + i12;
            i8 = Math.max(i8, m2099E(this.f1425c, i, max2 + i13, i2, i14, iArr));
            i7 += this.f1425c.getMeasuredHeight() + m2116t(this.f1425c);
            i9 = View.combineMeasuredStates(i9, this.f1425c.getMeasuredState());
        } else {
            int i15 = i9;
        }
        int max3 = Math.max(i4, i7);
        int paddingLeft = max2 + i8 + getPaddingLeft() + getPaddingRight();
        int paddingTop = max3 + getPaddingTop() + getPaddingBottom();
        int resolveSizeAndState = View.resolveSizeAndState(Math.max(paddingLeft, getSuggestedMinimumWidth()), i, -16777216 & i9);
        int resolveSizeAndState2 = View.resolveSizeAndState(Math.max(paddingTop, getSuggestedMinimumHeight()), i2, i9 << 16);
        if (!m2103O()) {
            i10 = resolveSizeAndState2;
        }
        setMeasuredDimension(resolveSizeAndState, i10);
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        MenuItem findItem;
        if (!(parcelable instanceof C0432g)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C0432g gVar = (C0432g) parcelable;
        super.onRestoreInstanceState(gVar.mo20873a());
        ActionMenuView actionMenuView = this.f1421a;
        C0367g N = actionMenuView != null ? actionMenuView.mo1716N() : null;
        int i = gVar.f1452c;
        if (!(i == 0 || this.f1424b0 == null || N == null || (findItem = N.findItem(i)) == null)) {
            findItem.expandActionView();
        }
        if (gVar.f1453d) {
            m2102H();
        }
    }

    public void onRtlPropertiesChanged(int i) {
        if (Build.VERSION.SDK_INT >= 17) {
            super.onRtlPropertiesChanged(i);
        }
        m2107h();
        C0552s0 s0Var = this.f1403B;
        boolean z = true;
        if (i != 1) {
            z = false;
        }
        s0Var.mo2587f(z);
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        C0371i iVar;
        C0432g gVar = new C0432g(super.onSaveInstanceState());
        C0429d dVar = this.f1424b0;
        if (!(dVar == null || (iVar = dVar.f1449b) == null)) {
            gVar.f1452c = iVar.getItemId();
        }
        gVar.f1453d = mo1852B();
        return gVar;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f1411J = false;
        }
        if (!this.f1411J) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.f1411J = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.f1411J = false;
        }
        return true;
    }

    public void setCollapseContentDescription(int i) {
        setCollapseContentDescription(i != 0 ? getContext().getText(i) : null);
    }

    public void setCollapseIcon(int i) {
        setCollapseIcon(C4411a.m29346b(getContext(), i));
    }

    public void setCollapsible(boolean z) {
        this.f1430e0 = z;
        requestLayout();
    }

    public void setContentInsetEndWithActions(int i) {
        if (i < 0) {
            i = RecyclerView.UNDEFINED_DURATION;
        }
        if (i != this.f1405D) {
            this.f1405D = i;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetStartWithNavigation(int i) {
        if (i < 0) {
            i = RecyclerView.UNDEFINED_DURATION;
        }
        if (i != this.f1404C) {
            this.f1404C = i;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setLogo(int i) {
        setLogo(C4411a.m29346b(getContext(), i));
    }

    public void setLogoDescription(int i) {
        setLogoDescription(getContext().getText(i));
    }

    public void setNavigationContentDescription(int i) {
        setNavigationContentDescription(i != 0 ? getContext().getText(i) : null);
    }

    public void setNavigationIcon(int i) {
        setNavigationIcon(C4411a.m29346b(getContext(), i));
    }

    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        m2111l();
        this.f1427d.setOnClickListener(onClickListener);
    }

    public void setOnMenuItemClickListener(C0431f fVar) {
        this.f1418Q = fVar;
    }

    public void setOverflowIcon(Drawable drawable) {
        m2109j();
        this.f1421a.setOverflowIcon(drawable);
    }

    public void setPopupTheme(int i) {
        if (this.f1437s != i) {
            this.f1437s = i;
            if (i == 0) {
                this.f1436r = getContext();
            } else {
                this.f1436r = new ContextThemeWrapper(getContext(), i);
            }
        }
    }

    public void setSubtitle(int i) {
        setSubtitle(getContext().getText(i));
    }

    public void setSubtitleTextColor(int i) {
        setSubtitleTextColor(ColorStateList.valueOf(i));
    }

    public void setTitle(int i) {
        setTitle(getContext().getText(i));
    }

    public void setTitleMarginBottom(int i) {
        this.f1402A = i;
        requestLayout();
    }

    public void setTitleMarginEnd(int i) {
        this.f1443y = i;
        requestLayout();
    }

    public void setTitleMarginStart(int i) {
        this.f1442x = i;
        requestLayout();
    }

    public void setTitleMarginTop(int i) {
        this.f1444z = i;
        requestLayout();
    }

    public void setTitleTextColor(int i) {
        setTitleTextColor(ColorStateList.valueOf(i));
    }

    /* renamed from: v */
    public boolean mo1942v() {
        C0429d dVar = this.f1424b0;
        return (dVar == null || dVar.f1449b == null) ? false : true;
    }

    /* renamed from: w */
    public boolean mo1943w() {
        ActionMenuView actionMenuView = this.f1421a;
        return actionMenuView != null && actionMenuView.mo1712H();
    }

    /* renamed from: x */
    public void mo1944x(int i) {
        getMenuInflater().inflate(i, getMenu());
    }

    /* renamed from: y */
    public void mo1945y() {
        Iterator<MenuItem> it = this.f1417P.iterator();
        while (it.hasNext()) {
            getMenu().removeItem(it.next().getItemId());
        }
        m2101G();
    }

    /* renamed from: androidx.appcompat.widget.Toolbar$e */
    public static class C0430e extends C0275a.C0276a {

        /* renamed from: b */
        int f1451b = 0;

        public C0430e(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo1948a(ViewGroup.MarginLayoutParams marginLayoutParams) {
            this.leftMargin = marginLayoutParams.leftMargin;
            this.topMargin = marginLayoutParams.topMargin;
            this.rightMargin = marginLayoutParams.rightMargin;
            this.bottomMargin = marginLayoutParams.bottomMargin;
        }

        public C0430e(int i, int i2) {
            super(i, i2);
            this.f731a = 8388627;
        }

        public C0430e(C0430e eVar) {
            super((C0275a.C0276a) eVar);
            this.f1451b = eVar.f1451b;
        }

        public C0430e(C0275a.C0276a aVar) {
            super(aVar);
        }

        public C0430e(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super((ViewGroup.LayoutParams) marginLayoutParams);
            mo1948a(marginLayoutParams);
        }

        public C0430e(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    public Toolbar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1406E = 8388627;
        this.f1413L = new ArrayList<>();
        this.f1414M = new ArrayList<>();
        this.f1415N = new int[2];
        this.f1416O = new C0920k(new C0457b1(this));
        this.f1417P = new ArrayList<>();
        this.f1419R = new C0426a();
        this.f1432f0 = new C0427b();
        Context context2 = getContext();
        int[] iArr = C4297j.f24012R2;
        C0452a1 v = C0452a1.m2210v(context2, attributeSet, iArr, i, 0);
        C0835a0.m3737l0(this, context, iArr, attributeSet, v.mo2059r(), i, 0);
        this.f1438t = v.mo2055n(C4297j.f24144t3, 0);
        this.f1439u = v.mo2055n(C4297j.f24099k3, 0);
        this.f1406E = v.mo2053l(C4297j.f24016S2, this.f1406E);
        this.f1440v = v.mo2053l(C4297j.f24020T2, 48);
        int e = v.mo2046e(C4297j.f24114n3, 0);
        int i2 = C4297j.f24139s3;
        e = v.mo2060s(i2) ? v.mo2046e(i2, e) : e;
        this.f1402A = e;
        this.f1444z = e;
        this.f1443y = e;
        this.f1442x = e;
        int e2 = v.mo2046e(C4297j.f24129q3, -1);
        if (e2 >= 0) {
            this.f1442x = e2;
        }
        int e3 = v.mo2046e(C4297j.f24124p3, -1);
        if (e3 >= 0) {
            this.f1443y = e3;
        }
        int e4 = v.mo2046e(C4297j.f24134r3, -1);
        if (e4 >= 0) {
            this.f1444z = e4;
        }
        int e5 = v.mo2046e(C4297j.f24119o3, -1);
        if (e5 >= 0) {
            this.f1402A = e5;
        }
        this.f1441w = v.mo2047f(C4297j.f24069e3, -1);
        int e6 = v.mo2046e(C4297j.f24049a3, RecyclerView.UNDEFINED_DURATION);
        int e7 = v.mo2046e(C4297j.f24032W2, RecyclerView.UNDEFINED_DURATION);
        int f = v.mo2047f(C4297j.f24040Y2, 0);
        int f2 = v.mo2047f(C4297j.f24044Z2, 0);
        m2107h();
        this.f1403B.mo2586e(f, f2);
        if (!(e6 == Integer.MIN_VALUE && e7 == Integer.MIN_VALUE)) {
            this.f1403B.mo2588g(e6, e7);
        }
        this.f1404C = v.mo2046e(C4297j.f24054b3, RecyclerView.UNDEFINED_DURATION);
        this.f1405D = v.mo2046e(C4297j.f24036X2, RecyclerView.UNDEFINED_DURATION);
        this.f1431f = v.mo2048g(C4297j.f24028V2);
        this.f1433g = v.mo2057p(C4297j.f24024U2);
        CharSequence p = v.mo2057p(C4297j.f24109m3);
        if (!TextUtils.isEmpty(p)) {
            setTitle(p);
        }
        CharSequence p2 = v.mo2057p(C4297j.f24094j3);
        if (!TextUtils.isEmpty(p2)) {
            setSubtitle(p2);
        }
        this.f1436r = getContext();
        setPopupTheme(v.mo2055n(C4297j.f24089i3, 0));
        Drawable g = v.mo2048g(C4297j.f24084h3);
        if (g != null) {
            setNavigationIcon(g);
        }
        CharSequence p3 = v.mo2057p(C4297j.f24079g3);
        if (!TextUtils.isEmpty(p3)) {
            setNavigationContentDescription(p3);
        }
        Drawable g2 = v.mo2048g(C4297j.f24059c3);
        if (g2 != null) {
            setLogo(g2);
        }
        CharSequence p4 = v.mo2057p(C4297j.f24064d3);
        if (!TextUtils.isEmpty(p4)) {
            setLogoDescription(p4);
        }
        int i3 = C4297j.f24149u3;
        if (v.mo2060s(i3)) {
            setTitleTextColor(v.mo2044c(i3));
        }
        int i4 = C4297j.f24104l3;
        if (v.mo2060s(i4)) {
            setSubtitleTextColor(v.mo2044c(i4));
        }
        int i5 = C4297j.f24074f3;
        if (v.mo2060s(i5)) {
            mo1944x(v.mo2055n(i5, 0));
        }
        v.mo2061w();
    }

    public void setCollapseContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            mo1865g();
        }
        ImageButton imageButton = this.f1434h;
        if (imageButton != null) {
            imageButton.setContentDescription(charSequence);
        }
    }

    public void setCollapseIcon(Drawable drawable) {
        if (drawable != null) {
            mo1865g();
            this.f1434h.setImageDrawable(drawable);
            return;
        }
        ImageButton imageButton = this.f1434h;
        if (imageButton != null) {
            imageButton.setImageDrawable(this.f1431f);
        }
    }

    public void setLogo(Drawable drawable) {
        if (drawable != null) {
            m2108i();
            if (!m2118z(this.f1429e)) {
                m2106c(this.f1429e, true);
            }
        } else {
            ImageView imageView = this.f1429e;
            if (imageView != null && m2118z(imageView)) {
                removeView(this.f1429e);
                this.f1414M.remove(this.f1429e);
            }
        }
        ImageView imageView2 = this.f1429e;
        if (imageView2 != null) {
            imageView2.setImageDrawable(drawable);
        }
    }

    public void setLogoDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            m2108i();
        }
        ImageView imageView = this.f1429e;
        if (imageView != null) {
            imageView.setContentDescription(charSequence);
        }
    }

    public void setNavigationContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            m2111l();
        }
        ImageButton imageButton = this.f1427d;
        if (imageButton != null) {
            imageButton.setContentDescription(charSequence);
            C0479d1.m2358a(this.f1427d, charSequence);
        }
    }

    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null) {
            m2111l();
            if (!m2118z(this.f1427d)) {
                m2106c(this.f1427d, true);
            }
        } else {
            ImageButton imageButton = this.f1427d;
            if (imageButton != null && m2118z(imageButton)) {
                removeView(this.f1427d);
                this.f1414M.remove(this.f1427d);
            }
        }
        ImageButton imageButton2 = this.f1427d;
        if (imageButton2 != null) {
            imageButton2.setImageDrawable(drawable);
        }
    }

    public void setSubtitle(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            if (this.f1425c == null) {
                Context context = getContext();
                C0478d0 d0Var = new C0478d0(context);
                this.f1425c = d0Var;
                d0Var.setSingleLine();
                this.f1425c.setEllipsize(TextUtils.TruncateAt.END);
                int i = this.f1439u;
                if (i != 0) {
                    this.f1425c.setTextAppearance(context, i);
                }
                ColorStateList colorStateList = this.f1410I;
                if (colorStateList != null) {
                    this.f1425c.setTextColor(colorStateList);
                }
            }
            if (!m2118z(this.f1425c)) {
                m2106c(this.f1425c, true);
            }
        } else {
            TextView textView = this.f1425c;
            if (textView != null && m2118z(textView)) {
                removeView(this.f1425c);
                this.f1414M.remove(this.f1425c);
            }
        }
        TextView textView2 = this.f1425c;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.f1408G = charSequence;
    }

    public void setSubtitleTextColor(ColorStateList colorStateList) {
        this.f1410I = colorStateList;
        TextView textView = this.f1425c;
        if (textView != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            if (this.f1423b == null) {
                Context context = getContext();
                C0478d0 d0Var = new C0478d0(context);
                this.f1423b = d0Var;
                d0Var.setSingleLine();
                this.f1423b.setEllipsize(TextUtils.TruncateAt.END);
                int i = this.f1438t;
                if (i != 0) {
                    this.f1423b.setTextAppearance(context, i);
                }
                ColorStateList colorStateList = this.f1409H;
                if (colorStateList != null) {
                    this.f1423b.setTextColor(colorStateList);
                }
            }
            if (!m2118z(this.f1423b)) {
                m2106c(this.f1423b, true);
            }
        } else {
            TextView textView = this.f1423b;
            if (textView != null && m2118z(textView)) {
                removeView(this.f1423b);
                this.f1414M.remove(this.f1423b);
            }
        }
        TextView textView2 = this.f1423b;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.f1407F = charSequence;
    }

    public void setTitleTextColor(ColorStateList colorStateList) {
        this.f1409H = colorStateList;
        TextView textView = this.f1423b;
        if (textView != null) {
            textView.setTextColor(colorStateList);
        }
    }

    /* renamed from: androidx.appcompat.widget.Toolbar$g */
    public static class C0432g extends C6079a {
        public static final Parcelable.Creator<C0432g> CREATOR = new C0433a();

        /* renamed from: c */
        int f1452c;

        /* renamed from: d */
        boolean f1453d;

        /* renamed from: androidx.appcompat.widget.Toolbar$g$a */
        class C0433a implements Parcelable.ClassLoaderCreator<C0432g> {
            C0433a() {
            }

            /* renamed from: a */
            public C0432g createFromParcel(Parcel parcel) {
                return new C0432g(parcel, (ClassLoader) null);
            }

            /* renamed from: b */
            public C0432g createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new C0432g(parcel, classLoader);
            }

            /* renamed from: c */
            public C0432g[] newArray(int i) {
                return new C0432g[i];
            }
        }

        public C0432g(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f1452c = parcel.readInt();
            this.f1453d = parcel.readInt() != 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f1452c);
            parcel.writeInt(this.f1453d ? 1 : 0);
        }

        public C0432g(Parcelable parcelable) {
            super(parcelable);
        }
    }
}
