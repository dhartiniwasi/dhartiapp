package androidx.appcompat.app;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import androidx.appcompat.app.C0275a;
import androidx.appcompat.app.C0287g;
import androidx.appcompat.view.menu.C0367g;
import androidx.appcompat.view.menu.C0383m;
import androidx.appcompat.widget.C0474c1;
import androidx.appcompat.widget.C0497h0;
import androidx.appcompat.widget.Toolbar;
import androidx.core.util.C0831h;
import androidx.core.view.C0835a0;
import com.pichillilorenzo.flutter_inappwebview.C8710R;
import java.util.ArrayList;

/* renamed from: androidx.appcompat.app.m */
/* compiled from: ToolbarActionBar */
class C0321m extends C0275a {

    /* renamed from: a */
    final C0497h0 f858a;

    /* renamed from: b */
    final Window.Callback f859b;

    /* renamed from: c */
    final C0287g.C0297i f860c;

    /* renamed from: d */
    boolean f861d;

    /* renamed from: e */
    private boolean f862e;

    /* renamed from: f */
    private boolean f863f;

    /* renamed from: g */
    private ArrayList<C0275a.C0277b> f864g = new ArrayList<>();

    /* renamed from: h */
    private final Runnable f865h = new C0322a();

    /* renamed from: i */
    private final Toolbar.C0431f f866i;

    /* renamed from: androidx.appcompat.app.m$a */
    /* compiled from: ToolbarActionBar */
    class C0322a implements Runnable {
        C0322a() {
        }

        public void run() {
            C0321m.this.mo1062B();
        }
    }

    /* renamed from: androidx.appcompat.app.m$b */
    /* compiled from: ToolbarActionBar */
    class C0323b implements Toolbar.C0431f {
        C0323b() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            return C0321m.this.f859b.onMenuItemSelected(0, menuItem);
        }
    }

    /* renamed from: androidx.appcompat.app.m$c */
    /* compiled from: ToolbarActionBar */
    private final class C0324c implements C0383m.C0384a {

        /* renamed from: a */
        private boolean f869a;

        C0324c() {
        }

        /* renamed from: a */
        public void mo996a(C0367g gVar, boolean z) {
            if (!this.f869a) {
                this.f869a = true;
                C0321m.this.f858a.mo2130i();
                C0321m.this.f859b.onPanelClosed(C8710R.styleable.AppCompatTheme_textAppearanceSearchResultTitle, gVar);
                this.f869a = false;
            }
        }

        /* renamed from: b */
        public boolean mo997b(C0367g gVar) {
            C0321m.this.f859b.onMenuOpened(C8710R.styleable.AppCompatTheme_textAppearanceSearchResultTitle, gVar);
            return true;
        }
    }

    /* renamed from: androidx.appcompat.app.m$d */
    /* compiled from: ToolbarActionBar */
    private final class C0325d implements C0367g.C0368a {
        C0325d() {
        }

        /* renamed from: a */
        public boolean mo967a(C0367g gVar, MenuItem menuItem) {
            return false;
        }

        /* renamed from: b */
        public void mo968b(C0367g gVar) {
            if (C0321m.this.f858a.mo2120c()) {
                C0321m.this.f859b.onPanelClosed(C8710R.styleable.AppCompatTheme_textAppearanceSearchResultTitle, gVar);
            } else if (C0321m.this.f859b.onPreparePanel(0, (View) null, gVar)) {
                C0321m.this.f859b.onMenuOpened(C8710R.styleable.AppCompatTheme_textAppearanceSearchResultTitle, gVar);
            }
        }
    }

    /* renamed from: androidx.appcompat.app.m$e */
    /* compiled from: ToolbarActionBar */
    private class C0326e implements C0287g.C0297i {
        C0326e() {
        }

        /* renamed from: a */
        public boolean mo994a(int i) {
            if (i != 0) {
                return false;
            }
            C0321m mVar = C0321m.this;
            if (mVar.f861d) {
                return false;
            }
            mVar.f858a.mo2122d();
            C0321m.this.f861d = true;
            return false;
        }

        public View onCreatePanelView(int i) {
            if (i == 0) {
                return new View(C0321m.this.f858a.getContext());
            }
            return null;
        }
    }

    C0321m(Toolbar toolbar, CharSequence charSequence, Window.Callback callback) {
        C0323b bVar = new C0323b();
        this.f866i = bVar;
        C0831h.m3662f(toolbar);
        C0474c1 c1Var = new C0474c1(toolbar, false);
        this.f858a = c1Var;
        this.f859b = (Window.Callback) C0831h.m3662f(callback);
        c1Var.setWindowCallback(callback);
        toolbar.setOnMenuItemClickListener(bVar);
        c1Var.setWindowTitle(charSequence);
        this.f860c = new C0326e();
    }

    /* renamed from: A */
    private Menu m1521A() {
        if (!this.f862e) {
            this.f858a.mo2138q(new C0324c(), new C0325d());
            this.f862e = true;
        }
        return this.f858a.mo2134m();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: B */
    public void mo1062B() {
        Menu A = m1521A();
        C0367g gVar = A instanceof C0367g ? (C0367g) A : null;
        if (gVar != null) {
            gVar.mo1375d0();
        }
        try {
            A.clear();
            if (!this.f859b.onCreatePanelMenu(0, A) || !this.f859b.onPreparePanel(0, (View) null, A)) {
                A.clear();
            }
        } finally {
            if (gVar != null) {
                gVar.mo1370c0();
            }
        }
    }

    /* renamed from: C */
    public void mo1063C(int i, int i2) {
        this.f858a.mo2133l((i & i2) | ((~i2) & this.f858a.mo2147u()));
    }

    /* renamed from: f */
    public boolean mo841f() {
        return this.f858a.mo2125g();
    }

    /* renamed from: g */
    public boolean mo842g() {
        if (!this.f858a.mo2132k()) {
            return false;
        }
        this.f858a.collapseActionView();
        return true;
    }

    /* renamed from: h */
    public void mo843h(boolean z) {
        if (z != this.f863f) {
            this.f863f = z;
            int size = this.f864g.size();
            for (int i = 0; i < size; i++) {
                this.f864g.get(i).mo862a(z);
            }
        }
    }

    /* renamed from: i */
    public int mo844i() {
        return this.f858a.mo2147u();
    }

    /* renamed from: j */
    public Context mo845j() {
        return this.f858a.getContext();
    }

    /* renamed from: k */
    public void mo846k() {
        this.f858a.mo2139r(8);
    }

    /* renamed from: l */
    public boolean mo847l() {
        this.f858a.mo2140s().removeCallbacks(this.f865h);
        C0835a0.m3725f0(this.f858a.mo2140s(), this.f865h);
        return true;
    }

    /* renamed from: m */
    public boolean mo848m() {
        return this.f858a.getVisibility() == 0;
    }

    /* renamed from: n */
    public void mo849n(Configuration configuration) {
        super.mo849n(configuration);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public void mo850o() {
        this.f858a.mo2140s().removeCallbacks(this.f865h);
    }

    /* renamed from: p */
    public boolean mo851p(int i, KeyEvent keyEvent) {
        Menu A = m1521A();
        if (A == null) {
            return false;
        }
        boolean z = true;
        if (KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() == 1) {
            z = false;
        }
        A.setQwertyMode(z);
        return A.performShortcut(i, keyEvent, 0);
    }

    /* renamed from: q */
    public boolean mo852q(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 1) {
            mo853r();
        }
        return true;
    }

    /* renamed from: r */
    public boolean mo853r() {
        return this.f858a.mo2129h();
    }

    /* renamed from: s */
    public void mo854s(Drawable drawable) {
        this.f858a.mo2118a(drawable);
    }

    /* renamed from: t */
    public void mo855t(boolean z) {
    }

    /* renamed from: u */
    public void mo856u(boolean z) {
        mo1063C(z ? 8 : 0, 8);
    }

    /* renamed from: v */
    public void mo857v(boolean z) {
    }

    /* renamed from: w */
    public void mo858w(CharSequence charSequence) {
        this.f858a.setTitle(charSequence);
    }

    /* renamed from: x */
    public void mo859x(CharSequence charSequence) {
        this.f858a.setWindowTitle(charSequence);
    }

    /* renamed from: y */
    public void mo860y() {
        this.f858a.mo2139r(0);
    }
}
