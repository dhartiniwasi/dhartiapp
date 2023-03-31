package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.view.menu.C0383m;
import androidx.appcompat.widget.C0535p0;
import androidx.core.view.C0835a0;
import p048g.C4291d;
import p048g.C4294g;

/* renamed from: androidx.appcompat.view.menu.q */
/* compiled from: StandardMenuPopup */
final class C0389q extends C0379k implements PopupWindow.OnDismissListener, View.OnKeyListener {

    /* renamed from: D */
    private static final int f1208D = C4294g.f23910m;

    /* renamed from: A */
    private int f1209A;

    /* renamed from: B */
    private int f1210B = 0;

    /* renamed from: C */
    private boolean f1211C;

    /* renamed from: b */
    private final Context f1212b;

    /* renamed from: c */
    private final C0367g f1213c;

    /* renamed from: d */
    private final C0366f f1214d;

    /* renamed from: e */
    private final boolean f1215e;

    /* renamed from: f */
    private final int f1216f;

    /* renamed from: g */
    private final int f1217g;

    /* renamed from: h */
    private final int f1218h;

    /* renamed from: i */
    final C0535p0 f1219i;

    /* renamed from: r */
    final ViewTreeObserver.OnGlobalLayoutListener f1220r = new C0390a();

    /* renamed from: s */
    private final View.OnAttachStateChangeListener f1221s = new C0391b();

    /* renamed from: t */
    private PopupWindow.OnDismissListener f1222t;

    /* renamed from: u */
    private View f1223u;

    /* renamed from: v */
    View f1224v;

    /* renamed from: w */
    private C0383m.C0384a f1225w;

    /* renamed from: x */
    ViewTreeObserver f1226x;

    /* renamed from: y */
    private boolean f1227y;

    /* renamed from: z */
    private boolean f1228z;

    /* renamed from: androidx.appcompat.view.menu.q$a */
    /* compiled from: StandardMenuPopup */
    class C0390a implements ViewTreeObserver.OnGlobalLayoutListener {
        C0390a() {
        }

        public void onGlobalLayout() {
            if (C0389q.this.mo1292b() && !C0389q.this.f1219i.mo2506w()) {
                View view = C0389q.this.f1224v;
                if (view == null || !view.isShown()) {
                    C0389q.this.dismiss();
                } else {
                    C0389q.this.f1219i.show();
                }
            }
        }
    }

    /* renamed from: androidx.appcompat.view.menu.q$b */
    /* compiled from: StandardMenuPopup */
    class C0391b implements View.OnAttachStateChangeListener {
        C0391b() {
        }

        public void onViewAttachedToWindow(View view) {
        }

        public void onViewDetachedFromWindow(View view) {
            ViewTreeObserver viewTreeObserver = C0389q.this.f1226x;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    C0389q.this.f1226x = view.getViewTreeObserver();
                }
                C0389q qVar = C0389q.this;
                qVar.f1226x.removeGlobalOnLayoutListener(qVar.f1220r);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    }

    public C0389q(Context context, C0367g gVar, View view, int i, int i2, boolean z) {
        this.f1212b = context;
        this.f1213c = gVar;
        this.f1215e = z;
        this.f1214d = new C0366f(gVar, LayoutInflater.from(context), z, f1208D);
        this.f1217g = i;
        this.f1218h = i2;
        Resources resources = context.getResources();
        this.f1216f = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(C4291d.f23799d));
        this.f1223u = view;
        this.f1219i = new C0535p0(context, (AttributeSet) null, i, i2);
        gVar.mo1369c(this, context);
    }

    /* renamed from: y */
    private boolean m1945y() {
        View view;
        if (mo1292b()) {
            return true;
        }
        if (this.f1227y || (view = this.f1223u) == null) {
            return false;
        }
        this.f1224v = view;
        this.f1219i.mo2489F(this);
        this.f1219i.mo2490G(this);
        this.f1219i.mo2488E(true);
        View view2 = this.f1224v;
        boolean z = this.f1226x == null;
        ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
        this.f1226x = viewTreeObserver;
        if (z) {
            viewTreeObserver.addOnGlobalLayoutListener(this.f1220r);
        }
        view2.addOnAttachStateChangeListener(this.f1221s);
        this.f1219i.mo2507y(view2);
        this.f1219i.mo2485B(this.f1210B);
        if (!this.f1228z) {
            this.f1209A = C0379k.m1898n(this.f1214d, (ViewGroup) null, this.f1212b, this.f1216f);
            this.f1228z = true;
        }
        this.f1219i.mo2484A(this.f1209A);
        this.f1219i.mo2487D(2);
        this.f1219i.mo2486C(mo1540m());
        this.f1219i.show();
        ListView i = this.f1219i.mo1295i();
        i.setOnKeyListener(this);
        if (this.f1211C && this.f1213c.mo1405x() != null) {
            FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(this.f1212b).inflate(C4294g.f23909l, i, false);
            TextView textView = (TextView) frameLayout.findViewById(16908310);
            if (textView != null) {
                textView.setText(this.f1213c.mo1405x());
            }
            frameLayout.setEnabled(false);
            i.addHeaderView(frameLayout, (Object) null, false);
        }
        this.f1219i.mo2016o(this.f1214d);
        this.f1219i.show();
        return true;
    }

    /* renamed from: a */
    public void mo1271a(C0367g gVar, boolean z) {
        if (gVar == this.f1213c) {
            dismiss();
            C0383m.C0384a aVar = this.f1225w;
            if (aVar != null) {
                aVar.mo996a(gVar, z);
            }
        }
    }

    /* renamed from: b */
    public boolean mo1292b() {
        return !this.f1227y && this.f1219i.mo1292b();
    }

    /* renamed from: c */
    public void mo1273c(boolean z) {
        this.f1228z = false;
        C0366f fVar = this.f1214d;
        if (fVar != null) {
            fVar.notifyDataSetChanged();
        }
    }

    /* renamed from: d */
    public boolean mo1293d() {
        return false;
    }

    public void dismiss() {
        if (mo1292b()) {
            this.f1219i.dismiss();
        }
    }

    /* renamed from: g */
    public void mo1276g(C0383m.C0384a aVar) {
        this.f1225w = aVar;
    }

    /* renamed from: i */
    public ListView mo1295i() {
        return this.f1219i.mo1295i();
    }

    /* renamed from: j */
    public boolean mo1279j(C0392r rVar) {
        if (rVar.hasVisibleItems()) {
            C0380l lVar = new C0380l(this.f1212b, rVar, this.f1224v, this.f1215e, this.f1217g, this.f1218h);
            lVar.mo1551j(this.f1225w);
            lVar.mo1548g(C0379k.m1899w(rVar));
            lVar.mo1550i(this.f1222t);
            this.f1222t = null;
            this.f1213c.mo1376e(false);
            int c = this.f1219i.mo2496c();
            int n = this.f1219i.mo2500n();
            if ((Gravity.getAbsoluteGravity(this.f1210B, C0835a0.m3682B(this.f1223u)) & 7) == 5) {
                c += this.f1223u.getWidth();
            }
            if (lVar.mo1554n(c, n)) {
                C0383m.C0384a aVar = this.f1225w;
                if (aVar == null) {
                    return true;
                }
                aVar.mo997b(rVar);
                return true;
            }
        }
        return false;
    }

    /* renamed from: k */
    public void mo1296k(C0367g gVar) {
    }

    /* renamed from: o */
    public void mo1298o(View view) {
        this.f1223u = view;
    }

    public void onDismiss() {
        this.f1227y = true;
        this.f1213c.close();
        ViewTreeObserver viewTreeObserver = this.f1226x;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.f1226x = this.f1224v.getViewTreeObserver();
            }
            this.f1226x.removeGlobalOnLayoutListener(this.f1220r);
            this.f1226x = null;
        }
        this.f1224v.removeOnAttachStateChangeListener(this.f1221s);
        PopupWindow.OnDismissListener onDismissListener = this.f1222t;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    public boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    /* renamed from: q */
    public void mo1301q(boolean z) {
        this.f1214d.mo1328d(z);
    }

    /* renamed from: r */
    public void mo1302r(int i) {
        this.f1210B = i;
    }

    /* renamed from: s */
    public void mo1303s(int i) {
        this.f1219i.mo2497e(i);
    }

    public void show() {
        if (!m1945y()) {
            throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
        }
    }

    /* renamed from: t */
    public void mo1305t(PopupWindow.OnDismissListener onDismissListener) {
        this.f1222t = onDismissListener;
    }

    /* renamed from: u */
    public void mo1306u(boolean z) {
        this.f1211C = z;
    }

    /* renamed from: v */
    public void mo1307v(int i) {
        this.f1219i.mo2499k(i);
    }
}
