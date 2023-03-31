package androidx.appcompat.widget;

import android.text.TextUtils;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityManager;
import androidx.core.view.C0835a0;
import androidx.core.view.C0894c0;

/* renamed from: androidx.appcompat.widget.g1 */
/* compiled from: TooltipCompatHandler */
class C0495g1 implements View.OnLongClickListener, View.OnHoverListener, View.OnAttachStateChangeListener {

    /* renamed from: s */
    private static C0495g1 f1620s;

    /* renamed from: t */
    private static C0495g1 f1621t;

    /* renamed from: a */
    private final View f1622a;

    /* renamed from: b */
    private final CharSequence f1623b;

    /* renamed from: c */
    private final int f1624c;

    /* renamed from: d */
    private final Runnable f1625d = new C0492f1(this);

    /* renamed from: e */
    private final Runnable f1626e = new C0489e1(this);

    /* renamed from: f */
    private int f1627f;

    /* renamed from: g */
    private int f1628g;

    /* renamed from: h */
    private C0498h1 f1629h;

    /* renamed from: i */
    private boolean f1630i;

    /* renamed from: r */
    private boolean f1631r;

    private C0495g1(View view, CharSequence charSequence) {
        this.f1622a = view;
        this.f1623b = charSequence;
        this.f1624c = C0894c0.m4061c(ViewConfiguration.get(view.getContext()));
        m2420c();
        view.setOnLongClickListener(this);
        view.setOnHoverListener(this);
    }

    /* renamed from: b */
    private void m2419b() {
        this.f1622a.removeCallbacks(this.f1625d);
    }

    /* renamed from: c */
    private void m2420c() {
        this.f1631r = true;
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public /* synthetic */ void m2421e() {
        mo2291i(false);
    }

    /* renamed from: f */
    private void m2422f() {
        this.f1622a.postDelayed(this.f1625d, (long) ViewConfiguration.getLongPressTimeout());
    }

    /* renamed from: g */
    private static void m2423g(C0495g1 g1Var) {
        C0495g1 g1Var2 = f1620s;
        if (g1Var2 != null) {
            g1Var2.m2419b();
        }
        f1620s = g1Var;
        if (g1Var != null) {
            g1Var.m2422f();
        }
    }

    /* renamed from: h */
    public static void m2424h(View view, CharSequence charSequence) {
        C0495g1 g1Var = f1620s;
        if (g1Var != null && g1Var.f1622a == view) {
            m2423g((C0495g1) null);
        }
        if (TextUtils.isEmpty(charSequence)) {
            C0495g1 g1Var2 = f1621t;
            if (g1Var2 != null && g1Var2.f1622a == view) {
                g1Var2.mo2290d();
            }
            view.setOnLongClickListener((View.OnLongClickListener) null);
            view.setLongClickable(false);
            view.setOnHoverListener((View.OnHoverListener) null);
            return;
        }
        new C0495g1(view, charSequence);
    }

    /* renamed from: j */
    private boolean m2425j(MotionEvent motionEvent) {
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        if (!this.f1631r && Math.abs(x - this.f1627f) <= this.f1624c && Math.abs(y - this.f1628g) <= this.f1624c) {
            return false;
        }
        this.f1627f = x;
        this.f1628g = y;
        this.f1631r = false;
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo2290d() {
        if (f1621t == this) {
            f1621t = null;
            C0498h1 h1Var = this.f1629h;
            if (h1Var != null) {
                h1Var.mo2315c();
                this.f1629h = null;
                m2420c();
                this.f1622a.removeOnAttachStateChangeListener(this);
            } else {
                Log.e("TooltipCompatHandler", "sActiveHandler.mPopup == null");
            }
        }
        if (f1620s == this) {
            m2423g((C0495g1) null);
        }
        this.f1622a.removeCallbacks(this.f1626e);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public void mo2291i(boolean z) {
        long j;
        int i;
        long j2;
        if (C0835a0.m3704Q(this.f1622a)) {
            m2423g((C0495g1) null);
            C0495g1 g1Var = f1621t;
            if (g1Var != null) {
                g1Var.mo2290d();
            }
            f1621t = this;
            this.f1630i = z;
            C0498h1 h1Var = new C0498h1(this.f1622a.getContext());
            this.f1629h = h1Var;
            h1Var.mo2317e(this.f1622a, this.f1627f, this.f1628g, this.f1630i, this.f1623b);
            this.f1622a.addOnAttachStateChangeListener(this);
            if (this.f1630i) {
                j = 2500;
            } else {
                if ((C0835a0.m3698K(this.f1622a) & 1) == 1) {
                    j2 = 3000;
                    i = ViewConfiguration.getLongPressTimeout();
                } else {
                    j2 = 15000;
                    i = ViewConfiguration.getLongPressTimeout();
                }
                j = j2 - ((long) i);
            }
            this.f1622a.removeCallbacks(this.f1626e);
            this.f1622a.postDelayed(this.f1626e, j);
        }
    }

    public boolean onHover(View view, MotionEvent motionEvent) {
        if (this.f1629h != null && this.f1630i) {
            return false;
        }
        AccessibilityManager accessibilityManager = (AccessibilityManager) this.f1622a.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action != 7) {
            if (action == 10) {
                m2420c();
                mo2290d();
            }
        } else if (this.f1622a.isEnabled() && this.f1629h == null && m2425j(motionEvent)) {
            m2423g(this);
        }
        return false;
    }

    public boolean onLongClick(View view) {
        this.f1627f = view.getWidth() / 2;
        this.f1628g = view.getHeight() / 2;
        mo2291i(true);
        return true;
    }

    public void onViewAttachedToWindow(View view) {
    }

    public void onViewDetachedFromWindow(View view) {
        mo2290d();
    }
}
