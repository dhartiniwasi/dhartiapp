package p175z;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import androidx.core.view.C0832a;
import androidx.core.view.C0835a0;
import androidx.core.view.C0903e0;
import androidx.core.view.accessibility.C0862c;
import androidx.core.view.accessibility.C0866d;
import androidx.core.view.accessibility.C0870e;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
import p124r.C5427h;
import p175z.C6174b;

/* renamed from: z.a */
/* compiled from: ExploreByTouchHelper */
public abstract class C6170a extends C0832a {

    /* renamed from: n */
    private static final Rect f29631n = new Rect(Integer.MAX_VALUE, Integer.MAX_VALUE, RecyclerView.UNDEFINED_DURATION, RecyclerView.UNDEFINED_DURATION);

    /* renamed from: o */
    private static final C6174b.C6175a<C0862c> f29632o = new C6171a();

    /* renamed from: p */
    private static final C6174b.C6176b<C5427h<C0862c>, C0862c> f29633p = new C6172b();

    /* renamed from: d */
    private final Rect f29634d = new Rect();

    /* renamed from: e */
    private final Rect f29635e = new Rect();

    /* renamed from: f */
    private final Rect f29636f = new Rect();

    /* renamed from: g */
    private final int[] f29637g = new int[2];

    /* renamed from: h */
    private final AccessibilityManager f29638h;

    /* renamed from: i */
    private final View f29639i;

    /* renamed from: j */
    private C6173c f29640j;

    /* renamed from: k */
    int f29641k = RecyclerView.UNDEFINED_DURATION;

    /* renamed from: l */
    int f29642l = RecyclerView.UNDEFINED_DURATION;

    /* renamed from: m */
    private int f29643m = RecyclerView.UNDEFINED_DURATION;

    /* renamed from: z.a$a */
    /* compiled from: ExploreByTouchHelper */
    static class C6171a implements C6174b.C6175a<C0862c> {
        C6171a() {
        }

        /* renamed from: b */
        public void mo21066a(C0862c cVar, Rect rect) {
            cVar.mo3315l(rect);
        }
    }

    /* renamed from: z.a$b */
    /* compiled from: ExploreByTouchHelper */
    static class C6172b implements C6174b.C6176b<C5427h<C0862c>, C0862c> {
        C6172b() {
        }

        /* renamed from: c */
        public C0862c mo21068a(C5427h<C0862c> hVar, int i) {
            return hVar.mo19691k(i);
        }

        /* renamed from: d */
        public int mo21069b(C5427h<C0862c> hVar) {
            return hVar.mo19690j();
        }
    }

    /* renamed from: z.a$c */
    /* compiled from: ExploreByTouchHelper */
    private class C6173c extends C0866d {
        C6173c() {
        }

        /* renamed from: b */
        public C0862c mo3343b(int i) {
            return C0862c.m3923N(C6170a.this.mo21051H(i));
        }

        /* renamed from: d */
        public C0862c mo3345d(int i) {
            int i2 = i == 2 ? C6170a.this.f29641k : C6170a.this.f29642l;
            if (i2 == Integer.MIN_VALUE) {
                return null;
            }
            return mo3343b(i2);
        }

        /* renamed from: f */
        public boolean mo3347f(int i, int i2, Bundle bundle) {
            return C6170a.this.mo21059P(i, i2, bundle);
        }
    }

    public C6170a(View view) {
        if (view != null) {
            this.f29639i = view;
            this.f29638h = (AccessibilityManager) view.getContext().getSystemService("accessibility");
            view.setFocusable(true);
            if (C0835a0.m3764z(view) == 0) {
                C0835a0.m3761x0(view, 1);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("View may not be null");
    }

    /* renamed from: D */
    private static Rect m35865D(View view, int i, Rect rect) {
        int width = view.getWidth();
        int height = view.getHeight();
        if (i == 17) {
            rect.set(width, 0, width, height);
        } else if (i == 33) {
            rect.set(0, height, width, height);
        } else if (i == 66) {
            rect.set(-1, 0, -1, height);
        } else if (i == 130) {
            rect.set(0, -1, width, -1);
        } else {
            throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
        return rect;
    }

    /* renamed from: E */
    private boolean m35866E(Rect rect) {
        if (rect == null || rect.isEmpty() || this.f29639i.getWindowVisibility() != 0) {
            return false;
        }
        ViewParent parent = this.f29639i.getParent();
        while (parent instanceof View) {
            View view = (View) parent;
            if (view.getAlpha() <= 0.0f || view.getVisibility() != 0) {
                return false;
            }
            parent = view.getParent();
        }
        if (parent != null) {
            return true;
        }
        return false;
    }

    /* renamed from: F */
    private static int m35867F(int i) {
        if (i == 19) {
            return 33;
        }
        if (i != 21) {
            return i != 22 ? 130 : 66;
        }
        return 17;
    }

    /* renamed from: G */
    private boolean m35868G(int i, Rect rect) {
        C0862c cVar;
        C0862c cVar2;
        C5427h<C0862c> y = m35880y();
        int i2 = this.f29642l;
        int i3 = RecyclerView.UNDEFINED_DURATION;
        if (i2 == Integer.MIN_VALUE) {
            cVar = null;
        } else {
            cVar = y.mo19685e(i2);
        }
        C0862c cVar3 = cVar;
        if (i == 1 || i == 2) {
            cVar2 = (C0862c) C6174b.m35915d(y, f29633p, f29632o, cVar3, i, C0835a0.m3682B(this.f29639i) == 1, false);
        } else if (i == 17 || i == 33 || i == 66 || i == 130) {
            Rect rect2 = new Rect();
            int i4 = this.f29642l;
            if (i4 != Integer.MIN_VALUE) {
                m35881z(i4, rect2);
            } else if (rect != null) {
                rect2.set(rect);
            } else {
                m35865D(this.f29639i, i, rect2);
            }
            cVar2 = (C0862c) C6174b.m35914c(y, f29633p, f29632o, cVar3, rect2, i);
        } else {
            throw new IllegalArgumentException("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD, FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
        if (cVar2 != null) {
            i3 = y.mo19688h(y.mo19687g(cVar2));
        }
        return mo21060T(i3);
    }

    /* renamed from: Q */
    private boolean m35869Q(int i, int i2, Bundle bundle) {
        if (i2 == 1) {
            return mo21060T(i);
        }
        if (i2 == 2) {
            return mo21062o(i);
        }
        if (i2 == 64) {
            return m35871S(i);
        }
        if (i2 != 128) {
            return mo21053J(i, i2, bundle);
        }
        return m35873n(i);
    }

    /* renamed from: R */
    private boolean m35870R(int i, Bundle bundle) {
        return C0835a0.m3719c0(this.f29639i, i, bundle);
    }

    /* renamed from: S */
    private boolean m35871S(int i) {
        int i2;
        if (!this.f29638h.isEnabled() || !this.f29638h.isTouchExplorationEnabled() || (i2 = this.f29641k) == i) {
            return false;
        }
        if (i2 != Integer.MIN_VALUE) {
            m35873n(i2);
        }
        this.f29641k = i;
        this.f29639i.invalidate();
        mo21061U(i, 32768);
        return true;
    }

    /* renamed from: V */
    private void m35872V(int i) {
        int i2 = this.f29643m;
        if (i2 != i) {
            this.f29643m = i;
            mo21061U(i, 128);
            mo21061U(i2, 256);
        }
    }

    /* renamed from: n */
    private boolean m35873n(int i) {
        if (this.f29641k != i) {
            return false;
        }
        this.f29641k = RecyclerView.UNDEFINED_DURATION;
        this.f29639i.invalidate();
        mo21061U(i, 65536);
        return true;
    }

    /* renamed from: p */
    private boolean m35874p() {
        int i = this.f29642l;
        return i != Integer.MIN_VALUE && mo21053J(i, 16, (Bundle) null);
    }

    /* renamed from: q */
    private AccessibilityEvent m35875q(int i, int i2) {
        if (i != -1) {
            return m35876r(i, i2);
        }
        return m35877s(i2);
    }

    /* renamed from: r */
    private AccessibilityEvent m35876r(int i, int i2) {
        AccessibilityEvent obtain = AccessibilityEvent.obtain(i2);
        C0862c H = mo21051H(i);
        obtain.getText().add(H.mo3333v());
        obtain.setContentDescription(H.mo3324q());
        obtain.setScrollable(H.mo3283I());
        obtain.setPassword(H.mo3282H());
        obtain.setEnabled(H.mo3278D());
        obtain.setChecked(H.mo3276B());
        mo21055L(i, obtain);
        if (!obtain.getText().isEmpty() || obtain.getContentDescription() != null) {
            obtain.setClassName(H.mo3321o());
            C0870e.m4009c(obtain, this.f29639i, i);
            obtain.setPackageName(this.f29639i.getContext().getPackageName());
            return obtain;
        }
        throw new RuntimeException("Callbacks must add text or a content description in populateEventForVirtualViewId()");
    }

    /* renamed from: s */
    private AccessibilityEvent m35877s(int i) {
        AccessibilityEvent obtain = AccessibilityEvent.obtain(i);
        this.f29639i.onInitializeAccessibilityEvent(obtain);
        return obtain;
    }

    /* renamed from: t */
    private C0862c m35878t(int i) {
        C0862c L = C0862c.m3921L();
        L.mo3302d0(true);
        L.mo3306f0(true);
        L.mo3293X("android.view.View");
        Rect rect = f29631n;
        L.mo3289T(rect);
        L.mo3290U(rect);
        L.mo3316l0(this.f29639i);
        mo21057N(i, L);
        if (L.mo3333v() == null && L.mo3324q() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateNodeForVirtualViewId()");
        }
        L.mo3315l(this.f29635e);
        if (!this.f29635e.equals(rect)) {
            int j = L.mo3312j();
            if ((j & 64) != 0) {
                throw new RuntimeException("Callbacks must not add ACTION_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
            } else if ((j & 128) == 0) {
                L.mo3313j0(this.f29639i.getContext().getPackageName());
                L.mo3325q0(this.f29639i, i);
                if (this.f29641k == i) {
                    L.mo3288R(true);
                    L.mo3296a(128);
                } else {
                    L.mo3288R(false);
                    L.mo3296a(64);
                }
                boolean z = this.f29642l == i;
                if (z) {
                    L.mo3296a(2);
                } else if (L.mo3279E()) {
                    L.mo3296a(1);
                }
                L.mo3307g0(z);
                this.f29639i.getLocationOnScreen(this.f29637g);
                L.mo3317m(this.f29634d);
                if (this.f29634d.equals(rect)) {
                    L.mo3315l(this.f29634d);
                    if (L.f2478b != -1) {
                        C0862c L2 = C0862c.m3921L();
                        for (int i2 = L.f2478b; i2 != -1; i2 = L2.f2478b) {
                            L2.mo3318m0(this.f29639i, -1);
                            L2.mo3289T(f29631n);
                            mo21057N(i2, L2);
                            L2.mo3315l(this.f29635e);
                            Rect rect2 = this.f29634d;
                            Rect rect3 = this.f29635e;
                            rect2.offset(rect3.left, rect3.top);
                        }
                        L2.mo3287P();
                    }
                    this.f29634d.offset(this.f29637g[0] - this.f29639i.getScrollX(), this.f29637g[1] - this.f29639i.getScrollY());
                }
                if (this.f29639i.getLocalVisibleRect(this.f29636f)) {
                    this.f29636f.offset(this.f29637g[0] - this.f29639i.getScrollX(), this.f29637g[1] - this.f29639i.getScrollY());
                    if (this.f29634d.intersect(this.f29636f)) {
                        L.mo3290U(this.f29634d);
                        if (m35866E(this.f29634d)) {
                            L.mo3330t0(true);
                        }
                    }
                }
                return L;
            } else {
                throw new RuntimeException("Callbacks must not add ACTION_CLEAR_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
            }
        } else {
            throw new RuntimeException("Callbacks must set parent bounds in populateNodeForVirtualViewId()");
        }
    }

    /* renamed from: u */
    private C0862c m35879u() {
        C0862c M = C0862c.m3922M(this.f29639i);
        C0835a0.m3715a0(this.f29639i, M);
        ArrayList arrayList = new ArrayList();
        mo21050C(arrayList);
        if (M.mo3319n() <= 0 || arrayList.size() <= 0) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                M.mo3300c(this.f29639i, ((Integer) arrayList.get(i)).intValue());
            }
            return M;
        }
        throw new RuntimeException("Views cannot have both real and virtual children");
    }

    /* renamed from: y */
    private C5427h<C0862c> m35880y() {
        ArrayList arrayList = new ArrayList();
        mo21050C(arrayList);
        C5427h<C0862c> hVar = new C5427h<>();
        for (int i = 0; i < arrayList.size(); i++) {
            hVar.mo19689i(i, m35878t(i));
        }
        return hVar;
    }

    /* renamed from: z */
    private void m35881z(int i, Rect rect) {
        mo21051H(i).mo3315l(rect);
    }

    /* renamed from: A */
    public final int mo21048A() {
        return this.f29642l;
    }

    /* access modifiers changed from: protected */
    /* renamed from: B */
    public abstract int mo21049B(float f, float f2);

    /* access modifiers changed from: protected */
    /* renamed from: C */
    public abstract void mo21050C(List<Integer> list);

    /* access modifiers changed from: package-private */
    /* renamed from: H */
    public C0862c mo21051H(int i) {
        if (i == -1) {
            return m35879u();
        }
        return m35878t(i);
    }

    /* renamed from: I */
    public final void mo21052I(boolean z, int i, Rect rect) {
        int i2 = this.f29642l;
        if (i2 != Integer.MIN_VALUE) {
            mo21062o(i2);
        }
        if (z) {
            m35868G(i, rect);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: J */
    public abstract boolean mo21053J(int i, int i2, Bundle bundle);

    /* access modifiers changed from: protected */
    /* renamed from: K */
    public void mo21054K(AccessibilityEvent accessibilityEvent) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: L */
    public void mo21055L(int i, AccessibilityEvent accessibilityEvent) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: M */
    public void mo21056M(C0862c cVar) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: N */
    public abstract void mo21057N(int i, C0862c cVar);

    /* access modifiers changed from: protected */
    /* renamed from: O */
    public void mo21058O(int i, boolean z) {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: P */
    public boolean mo21059P(int i, int i2, Bundle bundle) {
        if (i != -1) {
            return m35869Q(i, i2, bundle);
        }
        return m35870R(i2, bundle);
    }

    /* renamed from: T */
    public final boolean mo21060T(int i) {
        int i2;
        if ((!this.f29639i.isFocused() && !this.f29639i.requestFocus()) || (i2 = this.f29642l) == i) {
            return false;
        }
        if (i2 != Integer.MIN_VALUE) {
            mo21062o(i2);
        }
        this.f29642l = i;
        mo21058O(i, true);
        mo21061U(i, 8);
        return true;
    }

    /* renamed from: U */
    public final boolean mo21061U(int i, int i2) {
        ViewParent parent;
        if (i == Integer.MIN_VALUE || !this.f29638h.isEnabled() || (parent = this.f29639i.getParent()) == null) {
            return false;
        }
        return C0903e0.m4095h(parent, this.f29639i, m35875q(i, i2));
    }

    /* renamed from: b */
    public C0866d mo3228b(View view) {
        if (this.f29640j == null) {
            this.f29640j = new C6173c();
        }
        return this.f29640j;
    }

    /* renamed from: f */
    public void mo3230f(View view, AccessibilityEvent accessibilityEvent) {
        super.mo3230f(view, accessibilityEvent);
        mo21054K(accessibilityEvent);
    }

    /* renamed from: g */
    public void mo3231g(View view, C0862c cVar) {
        super.mo3231g(view, cVar);
        mo21056M(cVar);
    }

    /* renamed from: o */
    public final boolean mo21062o(int i) {
        if (this.f29642l != i) {
            return false;
        }
        this.f29642l = RecyclerView.UNDEFINED_DURATION;
        mo21058O(i, false);
        mo21061U(i, 8);
        return true;
    }

    /* renamed from: v */
    public final boolean mo21063v(MotionEvent motionEvent) {
        if (!this.f29638h.isEnabled() || !this.f29638h.isTouchExplorationEnabled()) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action == 7 || action == 9) {
            int B = mo21049B(motionEvent.getX(), motionEvent.getY());
            m35872V(B);
            if (B != Integer.MIN_VALUE) {
                return true;
            }
            return false;
        } else if (action != 10 || this.f29643m == Integer.MIN_VALUE) {
            return false;
        } else {
            m35872V(RecyclerView.UNDEFINED_DURATION);
            return true;
        }
    }

    /* renamed from: w */
    public final boolean mo21064w(KeyEvent keyEvent) {
        int i = 0;
        if (keyEvent.getAction() == 1) {
            return false;
        }
        int keyCode = keyEvent.getKeyCode();
        if (keyCode != 61) {
            if (keyCode != 66) {
                switch (keyCode) {
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                        if (!keyEvent.hasNoModifiers()) {
                            return false;
                        }
                        int F = m35867F(keyCode);
                        int repeatCount = keyEvent.getRepeatCount() + 1;
                        boolean z = false;
                        while (i < repeatCount && m35868G(F, (Rect) null)) {
                            i++;
                            z = true;
                        }
                        return z;
                    case 23:
                        break;
                    default:
                        return false;
                }
            }
            if (!keyEvent.hasNoModifiers() || keyEvent.getRepeatCount() != 0) {
                return false;
            }
            m35874p();
            return true;
        } else if (keyEvent.hasNoModifiers()) {
            return m35868G(2, (Rect) null);
        } else {
            if (keyEvent.hasModifiers(1)) {
                return m35868G(1, (Rect) null);
            }
            return false;
        }
    }

    /* renamed from: x */
    public final int mo21065x() {
        return this.f29641k;
    }
}
