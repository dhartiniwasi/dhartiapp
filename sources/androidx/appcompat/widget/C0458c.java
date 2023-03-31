package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.SparseBooleanArray;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.C0335a;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.view.menu.C0356b;
import androidx.appcompat.view.menu.C0367g;
import androidx.appcompat.view.menu.C0371i;
import androidx.appcompat.view.menu.C0380l;
import androidx.appcompat.view.menu.C0383m;
import androidx.appcompat.view.menu.C0385n;
import androidx.appcompat.view.menu.C0388p;
import androidx.appcompat.view.menu.C0392r;
import androidx.appcompat.widget.ActionMenuView;
import androidx.core.graphics.drawable.C0732a;
import androidx.core.view.C0882b;
import java.util.ArrayList;
import p048g.C4288a;
import p048g.C4294g;

/* renamed from: androidx.appcompat.widget.c */
/* compiled from: ActionMenuPresenter */
class C0458c extends C0356b implements C0882b.C0883a {

    /* renamed from: A */
    private boolean f1506A;

    /* renamed from: B */
    private boolean f1507B;

    /* renamed from: C */
    private boolean f1508C;

    /* renamed from: D */
    private boolean f1509D;

    /* renamed from: E */
    private int f1510E;

    /* renamed from: F */
    private final SparseBooleanArray f1511F = new SparseBooleanArray();

    /* renamed from: G */
    C0464e f1512G;

    /* renamed from: H */
    C0459a f1513H;

    /* renamed from: I */
    C0461c f1514I;

    /* renamed from: J */
    private C0460b f1515J;

    /* renamed from: K */
    final C0465f f1516K = new C0465f();

    /* renamed from: L */
    int f1517L;

    /* renamed from: s */
    C0462d f1518s;

    /* renamed from: t */
    private Drawable f1519t;

    /* renamed from: u */
    private boolean f1520u;

    /* renamed from: v */
    private boolean f1521v;

    /* renamed from: w */
    private boolean f1522w;

    /* renamed from: x */
    private int f1523x;

    /* renamed from: y */
    private int f1524y;

    /* renamed from: z */
    private int f1525z;

    /* renamed from: androidx.appcompat.widget.c$a */
    /* compiled from: ActionMenuPresenter */
    private class C0459a extends C0380l {
        public C0459a(Context context, C0392r rVar, View view) {
            super(context, rVar, view, false, C4288a.f23772l);
            if (!((C0371i) rVar.getItem()).mo1439l()) {
                View view2 = C0458c.this.f1518s;
                mo1547f(view2 == null ? (View) C0458c.this.f1060i : view2);
            }
            mo1551j(C0458c.this.f1516K);
        }

        /* access modifiers changed from: protected */
        /* renamed from: e */
        public void mo1546e() {
            C0458c cVar = C0458c.this;
            cVar.f1513H = null;
            cVar.f1517L = 0;
            super.mo1546e();
        }
    }

    /* renamed from: androidx.appcompat.widget.c$b */
    /* compiled from: ActionMenuPresenter */
    private class C0460b extends ActionMenuItemView.C0354b {
        C0460b() {
        }

        /* renamed from: a */
        public C0388p mo1196a() {
            C0459a aVar = C0458c.this.f1513H;
            if (aVar != null) {
                return aVar.mo1544c();
            }
            return null;
        }
    }

    /* renamed from: androidx.appcompat.widget.c$c */
    /* compiled from: ActionMenuPresenter */
    private class C0461c implements Runnable {

        /* renamed from: a */
        private C0464e f1528a;

        public C0461c(C0464e eVar) {
            this.f1528a = eVar;
        }

        public void run() {
            if (C0458c.this.f1054c != null) {
                C0458c.this.f1054c.mo1374d();
            }
            View view = (View) C0458c.this.f1060i;
            if (!(view == null || view.getWindowToken() == null || !this.f1528a.mo1553m())) {
                C0458c.this.f1512G = this.f1528a;
            }
            C0458c.this.f1514I = null;
        }
    }

    /* renamed from: androidx.appcompat.widget.c$d */
    /* compiled from: ActionMenuPresenter */
    private class C0462d extends C0549r implements ActionMenuView.C0401a {

        /* renamed from: androidx.appcompat.widget.c$d$a */
        /* compiled from: ActionMenuPresenter */
        class C0463a extends C0515l0 {

            /* renamed from: r */
            final /* synthetic */ C0458c f1531r;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C0463a(View view, C0458c cVar) {
                super(view);
                this.f1531r = cVar;
            }

            /* renamed from: b */
            public C0388p mo1194b() {
                C0464e eVar = C0458c.this.f1512G;
                if (eVar == null) {
                    return null;
                }
                return eVar.mo1544c();
            }

            /* renamed from: c */
            public boolean mo1195c() {
                C0458c.this.mo2080K();
                return true;
            }

            /* renamed from: d */
            public boolean mo2085d() {
                C0458c cVar = C0458c.this;
                if (cVar.f1514I != null) {
                    return false;
                }
                cVar.mo2071B();
                return true;
            }
        }

        public C0462d(Context context) {
            super(context, (AttributeSet) null, C4288a.f23771k);
            setClickable(true);
            setFocusable(true);
            setVisibility(0);
            setEnabled(true);
            C0479d1.m2358a(this, getContentDescription());
            setOnTouchListener(new C0463a(this, C0458c.this));
        }

        /* renamed from: a */
        public boolean mo1174a() {
            return false;
        }

        /* renamed from: b */
        public boolean mo1175b() {
            return false;
        }

        public boolean performClick() {
            if (super.performClick()) {
                return true;
            }
            playSoundEffect(0);
            C0458c.this.mo2080K();
            return true;
        }

        /* access modifiers changed from: protected */
        public boolean setFrame(int i, int i2, int i3, int i4) {
            boolean frame = super.setFrame(i, i2, i3, i4);
            Drawable drawable = getDrawable();
            Drawable background = getBackground();
            if (!(drawable == null || background == null)) {
                int width = getWidth();
                int height = getHeight();
                int max = Math.max(width, height) / 2;
                int paddingLeft = (width + (getPaddingLeft() - getPaddingRight())) / 2;
                int paddingTop = (height + (getPaddingTop() - getPaddingBottom())) / 2;
                C0732a.m3374l(background, paddingLeft - max, paddingTop - max, paddingLeft + max, paddingTop + max);
            }
            return frame;
        }
    }

    /* renamed from: androidx.appcompat.widget.c$e */
    /* compiled from: ActionMenuPresenter */
    private class C0464e extends C0380l {
        public C0464e(Context context, C0367g gVar, View view, boolean z) {
            super(context, gVar, view, z, C4288a.f23772l);
            mo1549h(8388613);
            mo1551j(C0458c.this.f1516K);
        }

        /* access modifiers changed from: protected */
        /* renamed from: e */
        public void mo1546e() {
            if (C0458c.this.f1054c != null) {
                C0458c.this.f1054c.close();
            }
            C0458c.this.f1512G = null;
            super.mo1546e();
        }
    }

    /* renamed from: androidx.appcompat.widget.c$f */
    /* compiled from: ActionMenuPresenter */
    private class C0465f implements C0383m.C0384a {
        C0465f() {
        }

        /* renamed from: a */
        public void mo996a(C0367g gVar, boolean z) {
            if (gVar instanceof C0392r) {
                gVar.mo1336D().mo1376e(false);
            }
            C0383m.C0384a m = C0458c.this.mo1282m();
            if (m != null) {
                m.mo996a(gVar, z);
            }
        }

        /* renamed from: b */
        public boolean mo997b(C0367g gVar) {
            if (gVar == C0458c.this.f1054c) {
                return false;
            }
            C0458c.this.f1517L = ((C0392r) gVar).getItem().getItemId();
            C0383m.C0384a m = C0458c.this.mo1282m();
            if (m != null) {
                return m.mo997b(gVar);
            }
            return false;
        }
    }

    public C0458c(Context context) {
        super(context, C4294g.f23900c, C4294g.f23899b);
    }

    /* renamed from: z */
    private View m2242z(MenuItem menuItem) {
        ViewGroup viewGroup = (ViewGroup) this.f1060i;
        if (viewGroup == null) {
            return null;
        }
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if ((childAt instanceof C0385n.C0386a) && ((C0385n.C0386a) childAt).getItemData() == menuItem) {
                return childAt;
            }
        }
        return null;
    }

    /* renamed from: A */
    public Drawable mo2070A() {
        C0462d dVar = this.f1518s;
        if (dVar != null) {
            return dVar.getDrawable();
        }
        if (this.f1520u) {
            return this.f1519t;
        }
        return null;
    }

    /* renamed from: B */
    public boolean mo2071B() {
        C0385n nVar;
        C0461c cVar = this.f1514I;
        if (cVar == null || (nVar = this.f1060i) == null) {
            C0464e eVar = this.f1512G;
            if (eVar == null) {
                return false;
            }
            eVar.mo1543b();
            return true;
        }
        ((View) nVar).removeCallbacks(cVar);
        this.f1514I = null;
        return true;
    }

    /* renamed from: C */
    public boolean mo2072C() {
        C0459a aVar = this.f1513H;
        if (aVar == null) {
            return false;
        }
        aVar.mo1543b();
        return true;
    }

    /* renamed from: D */
    public boolean mo2073D() {
        return this.f1514I != null || mo2074E();
    }

    /* renamed from: E */
    public boolean mo2074E() {
        C0464e eVar = this.f1512G;
        return eVar != null && eVar.mo1545d();
    }

    /* renamed from: F */
    public void mo2075F(Configuration configuration) {
        if (!this.f1506A) {
            this.f1525z = C0335a.m1618b(this.f1053b).mo1104d();
        }
        C0367g gVar = this.f1054c;
        if (gVar != null) {
            gVar.mo1343K(true);
        }
    }

    /* renamed from: G */
    public void mo2076G(boolean z) {
        this.f1509D = z;
    }

    /* renamed from: H */
    public void mo2077H(ActionMenuView actionMenuView) {
        this.f1060i = actionMenuView;
        actionMenuView.mo1198b(this.f1054c);
    }

    /* renamed from: I */
    public void mo2078I(Drawable drawable) {
        C0462d dVar = this.f1518s;
        if (dVar != null) {
            dVar.setImageDrawable(drawable);
            return;
        }
        this.f1520u = true;
        this.f1519t = drawable;
    }

    /* renamed from: J */
    public void mo2079J(boolean z) {
        this.f1521v = z;
        this.f1522w = true;
    }

    /* renamed from: K */
    public boolean mo2080K() {
        C0367g gVar;
        if (!this.f1521v || mo2074E() || (gVar = this.f1054c) == null || this.f1060i == null || this.f1514I != null || gVar.mo1407z().isEmpty()) {
            return false;
        }
        C0461c cVar = new C0461c(new C0464e(this.f1053b, this.f1054c, this.f1518s, true));
        this.f1514I = cVar;
        ((View) this.f1060i).post(cVar);
        return true;
    }

    /* renamed from: a */
    public void mo1271a(C0367g gVar, boolean z) {
        mo2081y();
        super.mo1271a(gVar, z);
    }

    /* renamed from: c */
    public void mo1273c(boolean z) {
        C0385n nVar;
        super.mo1273c(z);
        ((View) this.f1060i).requestLayout();
        C0367g gVar = this.f1054c;
        boolean z2 = false;
        if (gVar != null) {
            ArrayList<C0371i> s = gVar.mo1394s();
            int size = s.size();
            for (int i = 0; i < size; i++) {
                C0882b b = s.get(i).mo1213b();
                if (b != null) {
                    b.mo3356i(this);
                }
            }
        }
        C0367g gVar2 = this.f1054c;
        ArrayList<C0371i> z3 = gVar2 != null ? gVar2.mo1407z() : null;
        if (this.f1521v && z3 != null) {
            int size2 = z3.size();
            if (size2 == 1) {
                z2 = !z3.get(0).isActionViewExpanded();
            } else if (size2 > 0) {
                z2 = true;
            }
        }
        if (z2) {
            if (this.f1518s == null) {
                this.f1518s = new C0462d(this.f1052a);
            }
            ViewGroup viewGroup = (ViewGroup) this.f1518s.getParent();
            if (viewGroup != this.f1060i) {
                if (viewGroup != null) {
                    viewGroup.removeView(this.f1518s);
                }
                ActionMenuView actionMenuView = (ActionMenuView) this.f1060i;
                actionMenuView.addView(this.f1518s, actionMenuView.mo1710F());
            }
        } else {
            C0462d dVar = this.f1518s;
            if (dVar != null && dVar.getParent() == (nVar = this.f1060i)) {
                ((ViewGroup) nVar).removeView(this.f1518s);
            }
        }
        ((ActionMenuView) this.f1060i).setOverflowReserved(this.f1521v);
    }

    /* renamed from: d */
    public boolean mo1293d() {
        int i;
        ArrayList<C0371i> arrayList;
        int i2;
        int i3;
        int i4;
        C0458c cVar = this;
        C0367g gVar = cVar.f1054c;
        View view = null;
        int i5 = 0;
        if (gVar != null) {
            arrayList = gVar.mo1337E();
            i = arrayList.size();
        } else {
            arrayList = null;
            i = 0;
        }
        int i6 = cVar.f1525z;
        int i7 = cVar.f1524y;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = (ViewGroup) cVar.f1060i;
        boolean z = false;
        int i8 = 0;
        int i9 = 0;
        for (int i10 = 0; i10 < i; i10++) {
            C0371i iVar = arrayList.get(i10);
            if (iVar.mo1442o()) {
                i8++;
            } else if (iVar.mo1441n()) {
                i9++;
            } else {
                z = true;
            }
            if (cVar.f1509D && iVar.isActionViewExpanded()) {
                i6 = 0;
            }
        }
        if (cVar.f1521v && (z || i9 + i8 > i6)) {
            i6--;
        }
        int i11 = i6 - i8;
        SparseBooleanArray sparseBooleanArray = cVar.f1511F;
        sparseBooleanArray.clear();
        if (cVar.f1507B) {
            int i12 = cVar.f1510E;
            i2 = i7 / i12;
            i3 = i12 + ((i7 % i12) / i2);
        } else {
            i3 = 0;
            i2 = 0;
        }
        int i13 = 0;
        int i14 = 0;
        while (i13 < i) {
            C0371i iVar2 = arrayList.get(i13);
            if (iVar2.mo1442o()) {
                View n = cVar.mo1283n(iVar2, view, viewGroup);
                if (cVar.f1507B) {
                    i2 -= ActionMenuView.m2008L(n, i3, i2, makeMeasureSpec, i5);
                } else {
                    n.measure(makeMeasureSpec, makeMeasureSpec);
                }
                int measuredWidth = n.getMeasuredWidth();
                i7 -= measuredWidth;
                if (i14 == 0) {
                    i14 = measuredWidth;
                }
                int groupId = iVar2.getGroupId();
                if (groupId != 0) {
                    sparseBooleanArray.put(groupId, true);
                }
                iVar2.mo1465u(true);
                i4 = i;
            } else if (iVar2.mo1441n()) {
                int groupId2 = iVar2.getGroupId();
                boolean z2 = sparseBooleanArray.get(groupId2);
                boolean z3 = (i11 > 0 || z2) && i7 > 0 && (!cVar.f1507B || i2 > 0);
                boolean z4 = z3;
                i4 = i;
                if (z3) {
                    View n2 = cVar.mo1283n(iVar2, (View) null, viewGroup);
                    if (cVar.f1507B) {
                        int L = ActionMenuView.m2008L(n2, i3, i2, makeMeasureSpec, 0);
                        i2 -= L;
                        if (L == 0) {
                            z4 = false;
                        }
                    } else {
                        n2.measure(makeMeasureSpec, makeMeasureSpec);
                    }
                    boolean z5 = z4;
                    int measuredWidth2 = n2.getMeasuredWidth();
                    i7 -= measuredWidth2;
                    if (i14 == 0) {
                        i14 = measuredWidth2;
                    }
                    z3 = z5 & (!cVar.f1507B ? i7 + i14 > 0 : i7 >= 0);
                }
                if (z3 && groupId2 != 0) {
                    sparseBooleanArray.put(groupId2, true);
                } else if (z2) {
                    sparseBooleanArray.put(groupId2, false);
                    int i15 = 0;
                    while (i15 < i13) {
                        C0371i iVar3 = arrayList.get(i15);
                        if (iVar3.getGroupId() == groupId2) {
                            if (iVar3.mo1439l()) {
                                i11++;
                            }
                            iVar3.mo1465u(false);
                        }
                        i15++;
                    }
                }
                if (z3) {
                    i11--;
                }
                iVar2.mo1465u(z3);
            } else {
                i4 = i;
                iVar2.mo1465u(false);
                i13++;
                view = null;
                cVar = this;
                i = i4;
                i5 = 0;
            }
            i13++;
            view = null;
            cVar = this;
            i = i4;
            i5 = 0;
        }
        return true;
    }

    /* renamed from: h */
    public void mo1277h(Context context, C0367g gVar) {
        super.mo1277h(context, gVar);
        Resources resources = context.getResources();
        C0335a b = C0335a.m1618b(context);
        if (!this.f1522w) {
            this.f1521v = b.mo1108h();
        }
        if (!this.f1508C) {
            this.f1523x = b.mo1103c();
        }
        if (!this.f1506A) {
            this.f1525z = b.mo1104d();
        }
        int i = this.f1523x;
        if (this.f1521v) {
            if (this.f1518s == null) {
                C0462d dVar = new C0462d(this.f1052a);
                this.f1518s = dVar;
                if (this.f1520u) {
                    dVar.setImageDrawable(this.f1519t);
                    this.f1519t = null;
                    this.f1520u = false;
                }
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.f1518s.measure(makeMeasureSpec, makeMeasureSpec);
            }
            i -= this.f1518s.getMeasuredWidth();
        } else {
            this.f1518s = null;
        }
        this.f1524y = i;
        this.f1510E = (int) (resources.getDisplayMetrics().density * 56.0f);
    }

    /* renamed from: i */
    public void mo1278i(C0371i iVar, C0385n.C0386a aVar) {
        aVar.mo1177e(iVar, 0);
        ActionMenuItemView actionMenuItemView = (ActionMenuItemView) aVar;
        actionMenuItemView.setItemInvoker((ActionMenuView) this.f1060i);
        if (this.f1515J == null) {
            this.f1515J = new C0460b();
        }
        actionMenuItemView.setPopupCallback(this.f1515J);
    }

    /* renamed from: j */
    public boolean mo1279j(C0392r rVar) {
        boolean z = false;
        if (!rVar.hasVisibleItems()) {
            return false;
        }
        C0392r rVar2 = rVar;
        while (rVar2.mo1585e0() != this.f1054c) {
            rVar2 = (C0392r) rVar2.mo1585e0();
        }
        View z2 = m2242z(rVar2.getItem());
        if (z2 == null) {
            return false;
        }
        this.f1517L = rVar.getItem().getItemId();
        int size = rVar.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                break;
            }
            MenuItem item = rVar.getItem(i);
            if (item.isVisible() && item.getIcon() != null) {
                z = true;
                break;
            }
            i++;
        }
        C0459a aVar = new C0459a(this.f1053b, rVar, z2);
        this.f1513H = aVar;
        aVar.mo1548g(z);
        this.f1513H.mo1552k();
        super.mo1279j(rVar);
        return true;
    }

    /* renamed from: l */
    public boolean mo1281l(ViewGroup viewGroup, int i) {
        if (viewGroup.getChildAt(i) == this.f1518s) {
            return false;
        }
        return super.mo1281l(viewGroup, i);
    }

    /* renamed from: n */
    public View mo1283n(C0371i iVar, View view, ViewGroup viewGroup) {
        View actionView = iVar.getActionView();
        if (actionView == null || iVar.mo1437j()) {
            actionView = super.mo1283n(iVar, view, viewGroup);
        }
        actionView.setVisibility(iVar.isActionViewExpanded() ? 8 : 0);
        ActionMenuView actionMenuView = (ActionMenuView) viewGroup;
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        if (!actionMenuView.checkLayoutParams(layoutParams)) {
            actionView.setLayoutParams(actionMenuView.mo1730o(layoutParams));
        }
        return actionView;
    }

    /* renamed from: o */
    public C0385n mo1284o(ViewGroup viewGroup) {
        C0385n nVar = this.f1060i;
        C0385n o = super.mo1284o(viewGroup);
        if (nVar != o) {
            ((ActionMenuView) o).setPresenter(this);
        }
        return o;
    }

    /* renamed from: q */
    public boolean mo1286q(int i, C0371i iVar) {
        return iVar.mo1439l();
    }

    /* renamed from: y */
    public boolean mo2081y() {
        return mo2071B() | mo2072C();
    }
}
