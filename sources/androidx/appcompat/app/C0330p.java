package androidx.appcompat.app;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import androidx.appcompat.app.C0275a;
import androidx.appcompat.view.C0335a;
import androidx.appcompat.view.C0336b;
import androidx.appcompat.view.C0344g;
import androidx.appcompat.view.C0347h;
import androidx.appcompat.view.menu.C0367g;
import androidx.appcompat.widget.ActionBarContainer;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.C0497h0;
import androidx.appcompat.widget.C0554t0;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.C0835a0;
import androidx.core.view.C0909g0;
import androidx.core.view.C0915h0;
import androidx.core.view.C0917i0;
import androidx.core.view.C0919j0;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import p048g.C4288a;
import p048g.C4293f;
import p048g.C4297j;

/* renamed from: androidx.appcompat.app.p */
/* compiled from: WindowDecorActionBar */
public class C0330p extends C0275a implements ActionBarOverlayLayout.C0399d {

    /* renamed from: E */
    private static final Interpolator f887E = new AccelerateInterpolator();

    /* renamed from: F */
    private static final Interpolator f888F = new DecelerateInterpolator();

    /* renamed from: A */
    boolean f889A;

    /* renamed from: B */
    final C0915h0 f890B = new C0331a();

    /* renamed from: C */
    final C0915h0 f891C = new C0332b();

    /* renamed from: D */
    final C0919j0 f892D = new C0333c();

    /* renamed from: a */
    Context f893a;

    /* renamed from: b */
    private Context f894b;

    /* renamed from: c */
    private Activity f895c;

    /* renamed from: d */
    ActionBarOverlayLayout f896d;

    /* renamed from: e */
    ActionBarContainer f897e;

    /* renamed from: f */
    C0497h0 f898f;

    /* renamed from: g */
    ActionBarContextView f899g;

    /* renamed from: h */
    View f900h;

    /* renamed from: i */
    C0554t0 f901i;

    /* renamed from: j */
    private ArrayList<Object> f902j = new ArrayList<>();

    /* renamed from: k */
    private int f903k = -1;

    /* renamed from: l */
    private boolean f904l;

    /* renamed from: m */
    C0334d f905m;

    /* renamed from: n */
    C0336b f906n;

    /* renamed from: o */
    C0336b.C0337a f907o;

    /* renamed from: p */
    private boolean f908p;

    /* renamed from: q */
    private ArrayList<C0275a.C0277b> f909q = new ArrayList<>();

    /* renamed from: r */
    private boolean f910r;

    /* renamed from: s */
    private int f911s = 0;

    /* renamed from: t */
    boolean f912t = true;

    /* renamed from: u */
    boolean f913u;

    /* renamed from: v */
    boolean f914v;

    /* renamed from: w */
    private boolean f915w;

    /* renamed from: x */
    private boolean f916x = true;

    /* renamed from: y */
    C0347h f917y;

    /* renamed from: z */
    private boolean f918z;

    /* renamed from: androidx.appcompat.app.p$a */
    /* compiled from: WindowDecorActionBar */
    class C0331a extends C0917i0 {
        C0331a() {
        }

        /* renamed from: b */
        public void mo992b(View view) {
            View view2;
            C0330p pVar = C0330p.this;
            if (pVar.f912t && (view2 = pVar.f900h) != null) {
                view2.setTranslationY(0.0f);
                C0330p.this.f897e.setTranslationY(0.0f);
            }
            C0330p.this.f897e.setVisibility(8);
            C0330p.this.f897e.setTransitioning(false);
            C0330p pVar2 = C0330p.this;
            pVar2.f917y = null;
            pVar2.mo1069C();
            ActionBarOverlayLayout actionBarOverlayLayout = C0330p.this.f896d;
            if (actionBarOverlayLayout != null) {
                C0835a0.m3735k0(actionBarOverlayLayout);
            }
        }
    }

    /* renamed from: androidx.appcompat.app.p$b */
    /* compiled from: WindowDecorActionBar */
    class C0332b extends C0917i0 {
        C0332b() {
        }

        /* renamed from: b */
        public void mo992b(View view) {
            C0330p pVar = C0330p.this;
            pVar.f917y = null;
            pVar.f897e.requestLayout();
        }
    }

    /* renamed from: androidx.appcompat.app.p$c */
    /* compiled from: WindowDecorActionBar */
    class C0333c implements C0919j0 {
        C0333c() {
        }

        /* renamed from: a */
        public void mo1086a(View view) {
            ((View) C0330p.this.f897e.getParent()).invalidate();
        }
    }

    /* renamed from: androidx.appcompat.app.p$d */
    /* compiled from: WindowDecorActionBar */
    public class C0334d extends C0336b implements C0367g.C0368a {

        /* renamed from: c */
        private final Context f922c;

        /* renamed from: d */
        private final C0367g f923d;

        /* renamed from: e */
        private C0336b.C0337a f924e;

        /* renamed from: f */
        private WeakReference<View> f925f;

        public C0334d(Context context, C0336b.C0337a aVar) {
            this.f922c = context;
            this.f924e = aVar;
            C0367g S = new C0367g(context).mo1350S(1);
            this.f923d = S;
            S.mo1349R(this);
        }

        /* renamed from: a */
        public boolean mo967a(C0367g gVar, MenuItem menuItem) {
            C0336b.C0337a aVar = this.f924e;
            if (aVar != null) {
                return aVar.mo1001d(this, menuItem);
            }
            return false;
        }

        /* renamed from: b */
        public void mo968b(C0367g gVar) {
            if (this.f924e != null) {
                mo1093k();
                C0330p.this.f899g.mo1632l();
            }
        }

        /* renamed from: c */
        public void mo1087c() {
            C0330p pVar = C0330p.this;
            if (pVar.f905m == this) {
                if (!C0330p.m1557B(pVar.f913u, pVar.f914v, false)) {
                    C0330p pVar2 = C0330p.this;
                    pVar2.f906n = this;
                    pVar2.f907o = this.f924e;
                } else {
                    this.f924e.mo998a(this);
                }
                this.f924e = null;
                C0330p.this.mo1068A(false);
                C0330p.this.f899g.mo1622g();
                C0330p pVar3 = C0330p.this;
                pVar3.f896d.setHideOnContentScrollEnabled(pVar3.f889A);
                C0330p.this.f905m = null;
            }
        }

        /* renamed from: d */
        public View mo1088d() {
            WeakReference<View> weakReference = this.f925f;
            if (weakReference != null) {
                return (View) weakReference.get();
            }
            return null;
        }

        /* renamed from: e */
        public Menu mo1089e() {
            return this.f923d;
        }

        /* renamed from: f */
        public MenuInflater mo1090f() {
            return new C0344g(this.f922c);
        }

        /* renamed from: g */
        public CharSequence mo1091g() {
            return C0330p.this.f899g.getSubtitle();
        }

        /* renamed from: i */
        public CharSequence mo1092i() {
            return C0330p.this.f899g.getTitle();
        }

        /* renamed from: k */
        public void mo1093k() {
            if (C0330p.this.f905m == this) {
                this.f923d.mo1375d0();
                try {
                    this.f924e.mo1000c(this, this.f923d);
                } finally {
                    this.f923d.mo1370c0();
                }
            }
        }

        /* renamed from: l */
        public boolean mo1094l() {
            return C0330p.this.f899g.mo1630j();
        }

        /* renamed from: m */
        public void mo1095m(View view) {
            C0330p.this.f899g.setCustomView(view);
            this.f925f = new WeakReference<>(view);
        }

        /* renamed from: n */
        public void mo1096n(int i) {
            mo1097o(C0330p.this.f893a.getResources().getString(i));
        }

        /* renamed from: o */
        public void mo1097o(CharSequence charSequence) {
            C0330p.this.f899g.setSubtitle(charSequence);
        }

        /* renamed from: q */
        public void mo1098q(int i) {
            mo1099r(C0330p.this.f893a.getResources().getString(i));
        }

        /* renamed from: r */
        public void mo1099r(CharSequence charSequence) {
            C0330p.this.f899g.setTitle(charSequence);
        }

        /* renamed from: s */
        public void mo1100s(boolean z) {
            super.mo1100s(z);
            C0330p.this.f899g.setTitleOptional(z);
        }

        /* renamed from: t */
        public boolean mo1101t() {
            this.f923d.mo1375d0();
            try {
                return this.f924e.mo999b(this, this.f923d);
            } finally {
                this.f923d.mo1370c0();
            }
        }
    }

    public C0330p(Activity activity, boolean z) {
        this.f895c = activity;
        View decorView = activity.getWindow().getDecorView();
        m1560K(decorView);
        if (!z) {
            this.f900h = decorView.findViewById(16908290);
        }
    }

    /* renamed from: B */
    static boolean m1557B(boolean z, boolean z2, boolean z3) {
        if (z3) {
            return true;
        }
        return !z && !z2;
    }

    /* renamed from: F */
    private C0497h0 m1558F(View view) {
        if (view instanceof C0497h0) {
            return (C0497h0) view;
        }
        if (view instanceof Toolbar) {
            return ((Toolbar) view).getWrapper();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Can't make a decor toolbar out of ");
        sb.append(view != null ? view.getClass().getSimpleName() : "null");
        throw new IllegalStateException(sb.toString());
    }

    /* renamed from: J */
    private void m1559J() {
        if (this.f915w) {
            this.f915w = false;
            ActionBarOverlayLayout actionBarOverlayLayout = this.f896d;
            if (actionBarOverlayLayout != null) {
                actionBarOverlayLayout.setShowingForActionMode(false);
            }
            m1564T(false);
        }
    }

    /* renamed from: K */
    private void m1560K(View view) {
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) view.findViewById(C4293f.f23887p);
        this.f896d = actionBarOverlayLayout;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setActionBarVisibilityCallback(this);
        }
        this.f898f = m1558F(view.findViewById(C4293f.f23872a));
        this.f899g = (ActionBarContextView) view.findViewById(C4293f.f23877f);
        ActionBarContainer actionBarContainer = (ActionBarContainer) view.findViewById(C4293f.f23874c);
        this.f897e = actionBarContainer;
        C0497h0 h0Var = this.f898f;
        if (h0Var == null || this.f899g == null || actionBarContainer == null) {
            throw new IllegalStateException(getClass().getSimpleName() + " can only be used with a compatible window decor layout");
        }
        this.f893a = h0Var.getContext();
        boolean z = (this.f898f.mo2147u() & 4) != 0;
        if (z) {
            this.f904l = true;
        }
        C0335a b = C0335a.m1618b(this.f893a);
        mo1079Q(b.mo1102a() || z);
        m1561O(b.mo1107g());
        TypedArray obtainStyledAttributes = this.f893a.obtainStyledAttributes((AttributeSet) null, C4297j.f24045a, C4288a.f23763c, 0);
        if (obtainStyledAttributes.getBoolean(C4297j.f24095k, false)) {
            mo1078P(true);
        }
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(C4297j.f24085i, 0);
        if (dimensionPixelSize != 0) {
            mo1077N((float) dimensionPixelSize);
        }
        obtainStyledAttributes.recycle();
    }

    /* renamed from: O */
    private void m1561O(boolean z) {
        this.f910r = z;
        if (!z) {
            this.f898f.mo2131j((C0554t0) null);
            this.f897e.setTabContainer(this.f901i);
        } else {
            this.f897e.setTabContainer((C0554t0) null);
            this.f898f.mo2131j(this.f901i);
        }
        boolean z2 = true;
        boolean z3 = mo1074I() == 2;
        C0554t0 t0Var = this.f901i;
        if (t0Var != null) {
            if (z3) {
                t0Var.setVisibility(0);
                ActionBarOverlayLayout actionBarOverlayLayout = this.f896d;
                if (actionBarOverlayLayout != null) {
                    C0835a0.m3735k0(actionBarOverlayLayout);
                }
            } else {
                t0Var.setVisibility(8);
            }
        }
        this.f898f.mo2150x(!this.f910r && z3);
        ActionBarOverlayLayout actionBarOverlayLayout2 = this.f896d;
        if (this.f910r || !z3) {
            z2 = false;
        }
        actionBarOverlayLayout2.setHasNonEmbeddedTabs(z2);
    }

    /* renamed from: R */
    private boolean m1562R() {
        return C0835a0.m3705R(this.f897e);
    }

    /* renamed from: S */
    private void m1563S() {
        if (!this.f915w) {
            this.f915w = true;
            ActionBarOverlayLayout actionBarOverlayLayout = this.f896d;
            if (actionBarOverlayLayout != null) {
                actionBarOverlayLayout.setShowingForActionMode(true);
            }
            m1564T(false);
        }
    }

    /* renamed from: T */
    private void m1564T(boolean z) {
        if (m1557B(this.f913u, this.f914v, this.f915w)) {
            if (!this.f916x) {
                this.f916x = true;
                mo1071E(z);
            }
        } else if (this.f916x) {
            this.f916x = false;
            mo1070D(z);
        }
    }

    /* renamed from: A */
    public void mo1068A(boolean z) {
        C0909g0 g0Var;
        C0909g0 g0Var2;
        if (z) {
            m1563S();
        } else {
            m1559J();
        }
        if (m1562R()) {
            if (z) {
                g0Var = this.f898f.mo2137p(4, 100);
                g0Var2 = this.f899g.mo1621f(0, 200);
            } else {
                g0Var2 = this.f898f.mo2137p(0, 200);
                g0Var = this.f899g.mo1621f(8, 100);
            }
            C0347h hVar = new C0347h();
            hVar.mo1153d(g0Var, g0Var2);
            hVar.mo1157h();
        } else if (z) {
            this.f898f.mo2139r(4);
            this.f899g.setVisibility(0);
        } else {
            this.f898f.mo2139r(0);
            this.f899g.setVisibility(8);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: C */
    public void mo1069C() {
        C0336b.C0337a aVar = this.f907o;
        if (aVar != null) {
            aVar.mo998a(this.f906n);
            this.f906n = null;
            this.f907o = null;
        }
    }

    /* renamed from: D */
    public void mo1070D(boolean z) {
        View view;
        C0347h hVar = this.f917y;
        if (hVar != null) {
            hVar.mo1150a();
        }
        if (this.f911s != 0 || (!this.f918z && !z)) {
            this.f890B.mo992b((View) null);
            return;
        }
        this.f897e.setAlpha(1.0f);
        this.f897e.setTransitioning(true);
        C0347h hVar2 = new C0347h();
        float f = (float) (-this.f897e.getHeight());
        if (z) {
            int[] iArr = {0, 0};
            this.f897e.getLocationInWindow(iArr);
            f -= (float) iArr[1];
        }
        C0909g0 m = C0835a0.m3720d(this.f897e).mo3394m(f);
        m.mo3392k(this.f892D);
        hVar2.mo1152c(m);
        if (this.f912t && (view = this.f900h) != null) {
            hVar2.mo1152c(C0835a0.m3720d(view).mo3394m(f));
        }
        hVar2.mo1155f(f887E);
        hVar2.mo1154e(250);
        hVar2.mo1156g(this.f890B);
        this.f917y = hVar2;
        hVar2.mo1157h();
    }

    /* renamed from: E */
    public void mo1071E(boolean z) {
        View view;
        View view2;
        C0347h hVar = this.f917y;
        if (hVar != null) {
            hVar.mo1150a();
        }
        this.f897e.setVisibility(0);
        if (this.f911s != 0 || (!this.f918z && !z)) {
            this.f897e.setAlpha(1.0f);
            this.f897e.setTranslationY(0.0f);
            if (this.f912t && (view = this.f900h) != null) {
                view.setTranslationY(0.0f);
            }
            this.f891C.mo992b((View) null);
        } else {
            this.f897e.setTranslationY(0.0f);
            float f = (float) (-this.f897e.getHeight());
            if (z) {
                int[] iArr = {0, 0};
                this.f897e.getLocationInWindow(iArr);
                f -= (float) iArr[1];
            }
            this.f897e.setTranslationY(f);
            C0347h hVar2 = new C0347h();
            C0909g0 m = C0835a0.m3720d(this.f897e).mo3394m(0.0f);
            m.mo3392k(this.f892D);
            hVar2.mo1152c(m);
            if (this.f912t && (view2 = this.f900h) != null) {
                view2.setTranslationY(f);
                hVar2.mo1152c(C0835a0.m3720d(this.f900h).mo3394m(0.0f));
            }
            hVar2.mo1155f(f888F);
            hVar2.mo1154e(250);
            hVar2.mo1156g(this.f891C);
            this.f917y = hVar2;
            hVar2.mo1157h();
        }
        ActionBarOverlayLayout actionBarOverlayLayout = this.f896d;
        if (actionBarOverlayLayout != null) {
            C0835a0.m3735k0(actionBarOverlayLayout);
        }
    }

    /* renamed from: G */
    public int mo1072G() {
        return this.f897e.getHeight();
    }

    /* renamed from: H */
    public int mo1073H() {
        return this.f896d.getActionBarHideOffset();
    }

    /* renamed from: I */
    public int mo1074I() {
        return this.f898f.mo2136o();
    }

    /* renamed from: L */
    public void mo1075L(boolean z) {
        mo1076M(z ? 4 : 0, 4);
    }

    /* renamed from: M */
    public void mo1076M(int i, int i2) {
        int u = this.f898f.mo2147u();
        if ((i2 & 4) != 0) {
            this.f904l = true;
        }
        this.f898f.mo2133l((i & i2) | ((~i2) & u));
    }

    /* renamed from: N */
    public void mo1077N(float f) {
        C0835a0.m3757v0(this.f897e, f);
    }

    /* renamed from: P */
    public void mo1078P(boolean z) {
        if (!z || this.f896d.mo1687q()) {
            this.f889A = z;
            this.f896d.setHideOnContentScrollEnabled(z);
            return;
        }
        throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
    }

    /* renamed from: Q */
    public void mo1079Q(boolean z) {
        this.f898f.mo2146t(z);
    }

    /* renamed from: a */
    public void mo1080a() {
        if (this.f914v) {
            this.f914v = false;
            m1564T(true);
        }
    }

    /* renamed from: b */
    public void mo1081b() {
    }

    /* renamed from: c */
    public void mo1082c(boolean z) {
        this.f912t = z;
    }

    /* renamed from: d */
    public void mo1083d() {
        if (!this.f914v) {
            this.f914v = true;
            m1564T(true);
        }
    }

    /* renamed from: e */
    public void mo1084e() {
        C0347h hVar = this.f917y;
        if (hVar != null) {
            hVar.mo1150a();
            this.f917y = null;
        }
    }

    /* renamed from: g */
    public boolean mo842g() {
        C0497h0 h0Var = this.f898f;
        if (h0Var == null || !h0Var.mo2132k()) {
            return false;
        }
        this.f898f.collapseActionView();
        return true;
    }

    /* renamed from: h */
    public void mo843h(boolean z) {
        if (z != this.f908p) {
            this.f908p = z;
            int size = this.f909q.size();
            for (int i = 0; i < size; i++) {
                this.f909q.get(i).mo862a(z);
            }
        }
    }

    /* renamed from: i */
    public int mo844i() {
        return this.f898f.mo2147u();
    }

    /* renamed from: j */
    public Context mo845j() {
        if (this.f894b == null) {
            TypedValue typedValue = new TypedValue();
            this.f893a.getTheme().resolveAttribute(C4288a.f23767g, typedValue, true);
            int i = typedValue.resourceId;
            if (i != 0) {
                this.f894b = new ContextThemeWrapper(this.f893a, i);
            } else {
                this.f894b = this.f893a;
            }
        }
        return this.f894b;
    }

    /* renamed from: k */
    public void mo846k() {
        if (!this.f913u) {
            this.f913u = true;
            m1564T(false);
        }
    }

    /* renamed from: m */
    public boolean mo848m() {
        int G = mo1072G();
        return this.f916x && (G == 0 || mo1073H() < G);
    }

    /* renamed from: n */
    public void mo849n(Configuration configuration) {
        m1561O(C0335a.m1618b(this.f893a).mo1107g());
    }

    public void onWindowVisibilityChanged(int i) {
        this.f911s = i;
    }

    /* renamed from: p */
    public boolean mo851p(int i, KeyEvent keyEvent) {
        Menu e;
        C0334d dVar = this.f905m;
        if (dVar == null || (e = dVar.mo1089e()) == null) {
            return false;
        }
        boolean z = true;
        if (KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() == 1) {
            z = false;
        }
        e.setQwertyMode(z);
        return e.performShortcut(i, keyEvent, 0);
    }

    /* renamed from: s */
    public void mo854s(Drawable drawable) {
        this.f897e.setPrimaryBackground(drawable);
    }

    /* renamed from: t */
    public void mo855t(boolean z) {
        if (!this.f904l) {
            mo1075L(z);
        }
    }

    /* renamed from: u */
    public void mo856u(boolean z) {
        mo1076M(z ? 8 : 0, 8);
    }

    /* renamed from: v */
    public void mo857v(boolean z) {
        C0347h hVar;
        this.f918z = z;
        if (!z && (hVar = this.f917y) != null) {
            hVar.mo1150a();
        }
    }

    /* renamed from: w */
    public void mo858w(CharSequence charSequence) {
        this.f898f.setTitle(charSequence);
    }

    /* renamed from: x */
    public void mo859x(CharSequence charSequence) {
        this.f898f.setWindowTitle(charSequence);
    }

    /* renamed from: y */
    public void mo860y() {
        if (this.f913u) {
            this.f913u = false;
            m1564T(false);
        }
    }

    /* renamed from: z */
    public C0336b mo861z(C0336b.C0337a aVar) {
        C0334d dVar = this.f905m;
        if (dVar != null) {
            dVar.mo1087c();
        }
        this.f896d.setHideOnContentScrollEnabled(false);
        this.f899g.mo1631k();
        C0334d dVar2 = new C0334d(this.f899g.getContext(), aVar);
        if (!dVar2.mo1101t()) {
            return null;
        }
        this.f905m = dVar2;
        dVar2.mo1093k();
        this.f899g.mo1629h(dVar2);
        mo1068A(true);
        return dVar2;
    }

    public C0330p(Dialog dialog) {
        m1560K(dialog.getWindow().getDecorView());
    }
}
