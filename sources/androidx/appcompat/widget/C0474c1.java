package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.appcompat.view.menu.C0355a;
import androidx.appcompat.view.menu.C0367g;
import androidx.appcompat.view.menu.C0383m;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.C0835a0;
import androidx.core.view.C0909g0;
import androidx.core.view.C0917i0;
import p048g.C4288a;
import p048g.C4292e;
import p048g.C4293f;
import p048g.C4295h;
import p048g.C4297j;
import p055h.C4411a;

/* renamed from: androidx.appcompat.widget.c1 */
/* compiled from: ToolbarWidgetWrapper */
public class C0474c1 implements C0497h0 {

    /* renamed from: a */
    Toolbar f1556a;

    /* renamed from: b */
    private int f1557b;

    /* renamed from: c */
    private View f1558c;

    /* renamed from: d */
    private View f1559d;

    /* renamed from: e */
    private Drawable f1560e;

    /* renamed from: f */
    private Drawable f1561f;

    /* renamed from: g */
    private Drawable f1562g;

    /* renamed from: h */
    private boolean f1563h;

    /* renamed from: i */
    CharSequence f1564i;

    /* renamed from: j */
    private CharSequence f1565j;

    /* renamed from: k */
    private CharSequence f1566k;

    /* renamed from: l */
    Window.Callback f1567l;

    /* renamed from: m */
    boolean f1568m;

    /* renamed from: n */
    private C0458c f1569n;

    /* renamed from: o */
    private int f1570o;

    /* renamed from: p */
    private int f1571p;

    /* renamed from: q */
    private Drawable f1572q;

    /* renamed from: androidx.appcompat.widget.c1$a */
    /* compiled from: ToolbarWidgetWrapper */
    class C0475a implements View.OnClickListener {

        /* renamed from: a */
        final C0355a f1573a;

        C0475a() {
            this.f1573a = new C0355a(C0474c1.this.f1556a.getContext(), 0, 16908332, 0, 0, C0474c1.this.f1564i);
        }

        public void onClick(View view) {
            C0474c1 c1Var = C0474c1.this;
            Window.Callback callback = c1Var.f1567l;
            if (callback != null && c1Var.f1568m) {
                callback.onMenuItemSelected(0, this.f1573a);
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.c1$b */
    /* compiled from: ToolbarWidgetWrapper */
    class C0476b extends C0917i0 {

        /* renamed from: a */
        private boolean f1575a = false;

        /* renamed from: b */
        final /* synthetic */ int f1576b;

        C0476b(int i) {
            this.f1576b = i;
        }

        /* renamed from: a */
        public void mo1971a(View view) {
            this.f1575a = true;
        }

        /* renamed from: b */
        public void mo992b(View view) {
            if (!this.f1575a) {
                C0474c1.this.f1556a.setVisibility(this.f1576b);
            }
        }

        /* renamed from: c */
        public void mo993c(View view) {
            C0474c1.this.f1556a.setVisibility(0);
        }
    }

    public C0474c1(Toolbar toolbar, boolean z) {
        this(toolbar, z, C4295h.f23918a, C4292e.f23843n);
    }

    /* renamed from: G */
    private void m2317G(CharSequence charSequence) {
        this.f1564i = charSequence;
        if ((this.f1557b & 8) != 0) {
            this.f1556a.setTitle(charSequence);
            if (this.f1563h) {
                C0835a0.m3747q0(this.f1556a.getRootView(), charSequence);
            }
        }
    }

    /* renamed from: H */
    private void m2318H() {
        if ((this.f1557b & 4) == 0) {
            return;
        }
        if (TextUtils.isEmpty(this.f1566k)) {
            this.f1556a.setNavigationContentDescription(this.f1571p);
        } else {
            this.f1556a.setNavigationContentDescription(this.f1566k);
        }
    }

    /* renamed from: I */
    private void m2319I() {
        if ((this.f1557b & 4) != 0) {
            Toolbar toolbar = this.f1556a;
            Drawable drawable = this.f1562g;
            if (drawable == null) {
                drawable = this.f1572q;
            }
            toolbar.setNavigationIcon(drawable);
            return;
        }
        this.f1556a.setNavigationIcon((Drawable) null);
    }

    /* renamed from: J */
    private void m2320J() {
        Drawable drawable;
        int i = this.f1557b;
        if ((i & 2) == 0) {
            drawable = null;
        } else if ((i & 1) != 0) {
            drawable = this.f1561f;
            if (drawable == null) {
                drawable = this.f1560e;
            }
        } else {
            drawable = this.f1560e;
        }
        this.f1556a.setLogo(drawable);
    }

    /* renamed from: y */
    private int m2321y() {
        if (this.f1556a.getNavigationIcon() == null) {
            return 11;
        }
        this.f1572q = this.f1556a.getNavigationIcon();
        return 15;
    }

    /* renamed from: A */
    public void mo2112A(int i) {
        if (i != this.f1571p) {
            this.f1571p = i;
            if (TextUtils.isEmpty(this.f1556a.getNavigationContentDescription())) {
                mo2114C(this.f1571p);
            }
        }
    }

    /* renamed from: B */
    public void mo2113B(Drawable drawable) {
        this.f1561f = drawable;
        m2320J();
    }

    /* renamed from: C */
    public void mo2114C(int i) {
        mo2115D(i == 0 ? null : getContext().getString(i));
    }

    /* renamed from: D */
    public void mo2115D(CharSequence charSequence) {
        this.f1566k = charSequence;
        m2318H();
    }

    /* renamed from: E */
    public void mo2116E(Drawable drawable) {
        this.f1562g = drawable;
        m2319I();
    }

    /* renamed from: F */
    public void mo2117F(CharSequence charSequence) {
        this.f1565j = charSequence;
        if ((this.f1557b & 8) != 0) {
            this.f1556a.setSubtitle(charSequence);
        }
    }

    /* renamed from: a */
    public void mo2118a(Drawable drawable) {
        C0835a0.m3749r0(this.f1556a, drawable);
    }

    /* renamed from: b */
    public void mo2119b(Menu menu, C0383m.C0384a aVar) {
        if (this.f1569n == null) {
            C0458c cVar = new C0458c(this.f1556a.getContext());
            this.f1569n = cVar;
            cVar.mo1285p(C4293f.f23878g);
        }
        this.f1569n.mo1276g(aVar);
        this.f1556a.mo1855K((C0367g) menu, this.f1569n);
    }

    /* renamed from: c */
    public boolean mo2120c() {
        return this.f1556a.mo1852B();
    }

    public void collapseActionView() {
        this.f1556a.mo1863e();
    }

    /* renamed from: d */
    public void mo2122d() {
        this.f1568m = true;
    }

    /* renamed from: e */
    public boolean mo2123e() {
        return this.f1556a.mo1862d();
    }

    /* renamed from: f */
    public boolean mo2124f() {
        return this.f1556a.mo1851A();
    }

    /* renamed from: g */
    public boolean mo2125g() {
        return this.f1556a.mo1943w();
    }

    public Context getContext() {
        return this.f1556a.getContext();
    }

    public CharSequence getTitle() {
        return this.f1556a.getTitle();
    }

    public int getVisibility() {
        return this.f1556a.getVisibility();
    }

    /* renamed from: h */
    public boolean mo2129h() {
        return this.f1556a.mo1859Q();
    }

    /* renamed from: i */
    public void mo2130i() {
        this.f1556a.mo1864f();
    }

    /* renamed from: j */
    public void mo2131j(C0554t0 t0Var) {
        Toolbar toolbar;
        View view = this.f1558c;
        if (view != null && view.getParent() == (toolbar = this.f1556a)) {
            toolbar.removeView(this.f1558c);
        }
        this.f1558c = t0Var;
        if (t0Var != null && this.f1570o == 2) {
            this.f1556a.addView(t0Var, 0);
            Toolbar.C0430e eVar = (Toolbar.C0430e) this.f1558c.getLayoutParams();
            eVar.width = -2;
            eVar.height = -2;
            eVar.f731a = 8388691;
            t0Var.setAllowCollapse(true);
        }
    }

    /* renamed from: k */
    public boolean mo2132k() {
        return this.f1556a.mo1942v();
    }

    /* renamed from: l */
    public void mo2133l(int i) {
        View view;
        int i2 = this.f1557b ^ i;
        this.f1557b = i;
        if (i2 != 0) {
            if ((i2 & 4) != 0) {
                if ((i & 4) != 0) {
                    m2318H();
                }
                m2319I();
            }
            if ((i2 & 3) != 0) {
                m2320J();
            }
            if ((i2 & 8) != 0) {
                if ((i & 8) != 0) {
                    this.f1556a.setTitle(this.f1564i);
                    this.f1556a.setSubtitle(this.f1565j);
                } else {
                    this.f1556a.setTitle((CharSequence) null);
                    this.f1556a.setSubtitle((CharSequence) null);
                }
            }
            if ((i2 & 16) != 0 && (view = this.f1559d) != null) {
                if ((i & 16) != 0) {
                    this.f1556a.addView(view);
                } else {
                    this.f1556a.removeView(view);
                }
            }
        }
    }

    /* renamed from: m */
    public Menu mo2134m() {
        return this.f1556a.getMenu();
    }

    /* renamed from: n */
    public void mo2135n(int i) {
        mo2113B(i != 0 ? C4411a.m29346b(getContext(), i) : null);
    }

    /* renamed from: o */
    public int mo2136o() {
        return this.f1570o;
    }

    /* renamed from: p */
    public C0909g0 mo2137p(int i, long j) {
        return C0835a0.m3720d(this.f1556a).mo3385b(i == 0 ? 1.0f : 0.0f).mo3388f(j).mo3390h(new C0476b(i));
    }

    /* renamed from: q */
    public void mo2138q(C0383m.C0384a aVar, C0367g.C0368a aVar2) {
        this.f1556a.mo1856L(aVar, aVar2);
    }

    /* renamed from: r */
    public void mo2139r(int i) {
        this.f1556a.setVisibility(i);
    }

    /* renamed from: s */
    public ViewGroup mo2140s() {
        return this.f1556a;
    }

    public void setIcon(int i) {
        setIcon(i != 0 ? C4411a.m29346b(getContext(), i) : null);
    }

    public void setTitle(CharSequence charSequence) {
        this.f1563h = true;
        m2317G(charSequence);
    }

    public void setWindowCallback(Window.Callback callback) {
        this.f1567l = callback;
    }

    public void setWindowTitle(CharSequence charSequence) {
        if (!this.f1563h) {
            m2317G(charSequence);
        }
    }

    /* renamed from: t */
    public void mo2146t(boolean z) {
    }

    /* renamed from: u */
    public int mo2147u() {
        return this.f1557b;
    }

    /* renamed from: v */
    public void mo2148v() {
        Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
    }

    /* renamed from: w */
    public void mo2149w() {
        Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
    }

    /* renamed from: x */
    public void mo2150x(boolean z) {
        this.f1556a.setCollapsible(z);
    }

    /* renamed from: z */
    public void mo2151z(View view) {
        View view2 = this.f1559d;
        if (!(view2 == null || (this.f1557b & 16) == 0)) {
            this.f1556a.removeView(view2);
        }
        this.f1559d = view;
        if (view != null && (this.f1557b & 16) != 0) {
            this.f1556a.addView(view);
        }
    }

    public C0474c1(Toolbar toolbar, boolean z, int i, int i2) {
        Drawable drawable;
        this.f1570o = 0;
        this.f1571p = 0;
        this.f1556a = toolbar;
        this.f1564i = toolbar.getTitle();
        this.f1565j = toolbar.getSubtitle();
        this.f1563h = this.f1564i != null;
        this.f1562g = toolbar.getNavigationIcon();
        C0452a1 v = C0452a1.m2210v(toolbar.getContext(), (AttributeSet) null, C4297j.f24045a, C4288a.f23763c, 0);
        this.f1572q = v.mo2048g(C4297j.f24100l);
        if (z) {
            CharSequence p = v.mo2057p(C4297j.f24130r);
            if (!TextUtils.isEmpty(p)) {
                setTitle(p);
            }
            CharSequence p2 = v.mo2057p(C4297j.f24120p);
            if (!TextUtils.isEmpty(p2)) {
                mo2117F(p2);
            }
            Drawable g = v.mo2048g(C4297j.f24110n);
            if (g != null) {
                mo2113B(g);
            }
            Drawable g2 = v.mo2048g(C4297j.f24105m);
            if (g2 != null) {
                setIcon(g2);
            }
            if (this.f1562g == null && (drawable = this.f1572q) != null) {
                mo2116E(drawable);
            }
            mo2133l(v.mo2052k(C4297j.f24080h, 0));
            int n = v.mo2055n(C4297j.f24075g, 0);
            if (n != 0) {
                mo2151z(LayoutInflater.from(this.f1556a.getContext()).inflate(n, this.f1556a, false));
                mo2133l(this.f1557b | 16);
            }
            int m = v.mo2054m(C4297j.f24090j, 0);
            if (m > 0) {
                ViewGroup.LayoutParams layoutParams = this.f1556a.getLayoutParams();
                layoutParams.height = m;
                this.f1556a.setLayoutParams(layoutParams);
            }
            int e = v.mo2046e(C4297j.f24070f, -1);
            int e2 = v.mo2046e(C4297j.f24065e, -1);
            if (e >= 0 || e2 >= 0) {
                this.f1556a.mo1854J(Math.max(e, 0), Math.max(e2, 0));
            }
            int n2 = v.mo2055n(C4297j.f24135s, 0);
            if (n2 != 0) {
                Toolbar toolbar2 = this.f1556a;
                toolbar2.mo1858N(toolbar2.getContext(), n2);
            }
            int n3 = v.mo2055n(C4297j.f24125q, 0);
            if (n3 != 0) {
                Toolbar toolbar3 = this.f1556a;
                toolbar3.mo1857M(toolbar3.getContext(), n3);
            }
            int n4 = v.mo2055n(C4297j.f24115o, 0);
            if (n4 != 0) {
                this.f1556a.setPopupTheme(n4);
            }
        } else {
            this.f1557b = m2321y();
        }
        v.mo2061w();
        mo2112A(i);
        this.f1566k = this.f1556a.getNavigationContentDescription();
        this.f1556a.setNavigationOnClickListener(new C0475a());
    }

    public void setIcon(Drawable drawable) {
        this.f1560e = drawable;
        m2320J();
    }
}
