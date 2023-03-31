package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.view.menu.C0383m;
import androidx.appcompat.widget.C0533o0;
import androidx.appcompat.widget.C0535p0;
import androidx.core.view.C0835a0;
import androidx.core.view.C0901e;
import java.util.ArrayList;
import java.util.List;
import p048g.C4291d;
import p048g.C4294g;

/* renamed from: androidx.appcompat.view.menu.d */
/* compiled from: CascadingMenuPopup */
final class C0358d extends C0379k implements View.OnKeyListener, PopupWindow.OnDismissListener {

    /* renamed from: J */
    private static final int f1065J = C4294g.f23902e;

    /* renamed from: A */
    private boolean f1066A;

    /* renamed from: B */
    private int f1067B;

    /* renamed from: C */
    private int f1068C;

    /* renamed from: D */
    private boolean f1069D;

    /* renamed from: E */
    private boolean f1070E;

    /* renamed from: F */
    private C0383m.C0384a f1071F;

    /* renamed from: G */
    ViewTreeObserver f1072G;

    /* renamed from: H */
    private PopupWindow.OnDismissListener f1073H;

    /* renamed from: I */
    boolean f1074I;

    /* renamed from: b */
    private final Context f1075b;

    /* renamed from: c */
    private final int f1076c;

    /* renamed from: d */
    private final int f1077d;

    /* renamed from: e */
    private final int f1078e;

    /* renamed from: f */
    private final boolean f1079f;

    /* renamed from: g */
    final Handler f1080g;

    /* renamed from: h */
    private final List<C0367g> f1081h = new ArrayList();

    /* renamed from: i */
    final List<C0363d> f1082i = new ArrayList();

    /* renamed from: r */
    final ViewTreeObserver.OnGlobalLayoutListener f1083r = new C0359a();

    /* renamed from: s */
    private final View.OnAttachStateChangeListener f1084s = new C0360b();

    /* renamed from: t */
    private final C0533o0 f1085t = new C0361c();

    /* renamed from: u */
    private int f1086u = 0;

    /* renamed from: v */
    private int f1087v = 0;

    /* renamed from: w */
    private View f1088w;

    /* renamed from: x */
    View f1089x;

    /* renamed from: y */
    private int f1090y;

    /* renamed from: z */
    private boolean f1091z;

    /* renamed from: androidx.appcompat.view.menu.d$a */
    /* compiled from: CascadingMenuPopup */
    class C0359a implements ViewTreeObserver.OnGlobalLayoutListener {
        C0359a() {
        }

        public void onGlobalLayout() {
            if (C0358d.this.mo1292b() && C0358d.this.f1082i.size() > 0 && !C0358d.this.f1082i.get(0).f1099a.mo2506w()) {
                View view = C0358d.this.f1089x;
                if (view == null || !view.isShown()) {
                    C0358d.this.dismiss();
                    return;
                }
                for (C0363d dVar : C0358d.this.f1082i) {
                    dVar.f1099a.show();
                }
            }
        }
    }

    /* renamed from: androidx.appcompat.view.menu.d$b */
    /* compiled from: CascadingMenuPopup */
    class C0360b implements View.OnAttachStateChangeListener {
        C0360b() {
        }

        public void onViewAttachedToWindow(View view) {
        }

        public void onViewDetachedFromWindow(View view) {
            ViewTreeObserver viewTreeObserver = C0358d.this.f1072G;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    C0358d.this.f1072G = view.getViewTreeObserver();
                }
                C0358d dVar = C0358d.this;
                dVar.f1072G.removeGlobalOnLayoutListener(dVar.f1083r);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    }

    /* renamed from: androidx.appcompat.view.menu.d$c */
    /* compiled from: CascadingMenuPopup */
    class C0361c implements C0533o0 {

        /* renamed from: androidx.appcompat.view.menu.d$c$a */
        /* compiled from: CascadingMenuPopup */
        class C0362a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C0363d f1095a;

            /* renamed from: b */
            final /* synthetic */ MenuItem f1096b;

            /* renamed from: c */
            final /* synthetic */ C0367g f1097c;

            C0362a(C0363d dVar, MenuItem menuItem, C0367g gVar) {
                this.f1095a = dVar;
                this.f1096b = menuItem;
                this.f1097c = gVar;
            }

            public void run() {
                C0363d dVar = this.f1095a;
                if (dVar != null) {
                    C0358d.this.f1074I = true;
                    dVar.f1100b.mo1376e(false);
                    C0358d.this.f1074I = false;
                }
                if (this.f1096b.isEnabled() && this.f1096b.hasSubMenu()) {
                    this.f1097c.mo1344L(this.f1096b, 4);
                }
            }
        }

        C0361c() {
        }

        /* renamed from: d */
        public void mo1311d(C0367g gVar, MenuItem menuItem) {
            C0363d dVar = null;
            C0358d.this.f1080g.removeCallbacksAndMessages((Object) null);
            int size = C0358d.this.f1082i.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    i = -1;
                    break;
                } else if (gVar == C0358d.this.f1082i.get(i).f1100b) {
                    break;
                } else {
                    i++;
                }
            }
            if (i != -1) {
                int i2 = i + 1;
                if (i2 < C0358d.this.f1082i.size()) {
                    dVar = C0358d.this.f1082i.get(i2);
                }
                C0358d.this.f1080g.postAtTime(new C0362a(dVar, menuItem, gVar), gVar, SystemClock.uptimeMillis() + 200);
            }
        }

        /* renamed from: g */
        public void mo1312g(C0367g gVar, MenuItem menuItem) {
            C0358d.this.f1080g.removeCallbacksAndMessages(gVar);
        }
    }

    /* renamed from: androidx.appcompat.view.menu.d$d */
    /* compiled from: CascadingMenuPopup */
    private static class C0363d {

        /* renamed from: a */
        public final C0535p0 f1099a;

        /* renamed from: b */
        public final C0367g f1100b;

        /* renamed from: c */
        public final int f1101c;

        public C0363d(C0535p0 p0Var, C0367g gVar, int i) {
            this.f1099a = p0Var;
            this.f1100b = gVar;
            this.f1101c = i;
        }

        /* renamed from: a */
        public ListView mo1314a() {
            return this.f1099a.mo1295i();
        }
    }

    public C0358d(Context context, View view, int i, int i2, boolean z) {
        this.f1075b = context;
        this.f1088w = view;
        this.f1077d = i;
        this.f1078e = i2;
        this.f1079f = z;
        this.f1069D = false;
        this.f1090y = m1755C();
        Resources resources = context.getResources();
        this.f1076c = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(C4291d.f23799d));
        this.f1080g = new Handler();
    }

    /* renamed from: A */
    private MenuItem m1753A(C0367g gVar, C0367g gVar2) {
        int size = gVar.size();
        for (int i = 0; i < size; i++) {
            MenuItem item = gVar.getItem(i);
            if (item.hasSubMenu() && gVar2 == item.getSubMenu()) {
                return item;
            }
        }
        return null;
    }

    /* renamed from: B */
    private View m1754B(C0363d dVar, C0367g gVar) {
        int i;
        C0366f fVar;
        int firstVisiblePosition;
        MenuItem A = m1753A(dVar.f1100b, gVar);
        if (A == null) {
            return null;
        }
        ListView a = dVar.mo1314a();
        ListAdapter adapter = a.getAdapter();
        int i2 = 0;
        if (adapter instanceof HeaderViewListAdapter) {
            HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
            i = headerViewListAdapter.getHeadersCount();
            fVar = (C0366f) headerViewListAdapter.getWrappedAdapter();
        } else {
            fVar = (C0366f) adapter;
            i = 0;
        }
        int count = fVar.getCount();
        while (true) {
            if (i2 >= count) {
                i2 = -1;
                break;
            } else if (A == fVar.getItem(i2)) {
                break;
            } else {
                i2++;
            }
        }
        if (i2 != -1 && (firstVisiblePosition = (i2 + i) - a.getFirstVisiblePosition()) >= 0 && firstVisiblePosition < a.getChildCount()) {
            return a.getChildAt(firstVisiblePosition);
        }
        return null;
    }

    /* renamed from: C */
    private int m1755C() {
        return C0835a0.m3682B(this.f1088w) == 1 ? 0 : 1;
    }

    /* renamed from: D */
    private int m1756D(int i) {
        List<C0363d> list = this.f1082i;
        ListView a = list.get(list.size() - 1).mo1314a();
        int[] iArr = new int[2];
        a.getLocationOnScreen(iArr);
        Rect rect = new Rect();
        this.f1089x.getWindowVisibleDisplayFrame(rect);
        if (this.f1090y == 1) {
            if (iArr[0] + a.getWidth() + i > rect.right) {
                return 0;
            }
            return 1;
        } else if (iArr[0] - i < 0) {
            return 1;
        } else {
            return 0;
        }
    }

    /* renamed from: E */
    private void m1757E(C0367g gVar) {
        View view;
        C0363d dVar;
        int i;
        int i2;
        int i3;
        LayoutInflater from = LayoutInflater.from(this.f1075b);
        C0366f fVar = new C0366f(gVar, from, this.f1079f, f1065J);
        if (!mo1292b() && this.f1069D) {
            fVar.mo1328d(true);
        } else if (mo1292b()) {
            fVar.mo1328d(C0379k.m1899w(gVar));
        }
        int n = C0379k.m1898n(fVar, (ViewGroup) null, this.f1075b, this.f1076c);
        C0535p0 y = m1758y();
        y.mo2016o(fVar);
        y.mo2484A(n);
        y.mo2485B(this.f1087v);
        if (this.f1082i.size() > 0) {
            List<C0363d> list = this.f1082i;
            dVar = list.get(list.size() - 1);
            view = m1754B(dVar, gVar);
        } else {
            dVar = null;
            view = null;
        }
        if (view != null) {
            y.mo2535P(false);
            y.mo2532M((Object) null);
            int D = m1756D(n);
            boolean z = D == 1;
            this.f1090y = D;
            if (Build.VERSION.SDK_INT >= 26) {
                y.mo2507y(view);
                i2 = 0;
                i = 0;
            } else {
                int[] iArr = new int[2];
                this.f1088w.getLocationOnScreen(iArr);
                int[] iArr2 = new int[2];
                view.getLocationOnScreen(iArr2);
                if ((this.f1087v & 7) == 5) {
                    iArr[0] = iArr[0] + this.f1088w.getWidth();
                    iArr2[0] = iArr2[0] + view.getWidth();
                }
                i = iArr2[0] - iArr[0];
                i2 = iArr2[1] - iArr[1];
            }
            if ((this.f1087v & 5) != 5) {
                if (z) {
                    n = view.getWidth();
                }
                i3 = i - n;
                y.mo2497e(i3);
                y.mo2491H(true);
                y.mo2499k(i2);
            } else if (!z) {
                n = view.getWidth();
                i3 = i - n;
                y.mo2497e(i3);
                y.mo2491H(true);
                y.mo2499k(i2);
            }
            i3 = i + n;
            y.mo2497e(i3);
            y.mo2491H(true);
            y.mo2499k(i2);
        } else {
            if (this.f1091z) {
                y.mo2497e(this.f1067B);
            }
            if (this.f1066A) {
                y.mo2499k(this.f1068C);
            }
            y.mo2486C(mo1540m());
        }
        this.f1082i.add(new C0363d(y, gVar, this.f1090y));
        y.show();
        ListView i4 = y.mo1295i();
        i4.setOnKeyListener(this);
        if (dVar == null && this.f1070E && gVar.mo1405x() != null) {
            FrameLayout frameLayout = (FrameLayout) from.inflate(C4294g.f23909l, i4, false);
            frameLayout.setEnabled(false);
            ((TextView) frameLayout.findViewById(16908310)).setText(gVar.mo1405x());
            i4.addHeaderView(frameLayout, (Object) null, false);
            y.show();
        }
    }

    /* renamed from: y */
    private C0535p0 m1758y() {
        C0535p0 p0Var = new C0535p0(this.f1075b, (AttributeSet) null, this.f1077d, this.f1078e);
        p0Var.mo2534O(this.f1085t);
        p0Var.mo2490G(this);
        p0Var.mo2489F(this);
        p0Var.mo2507y(this.f1088w);
        p0Var.mo2485B(this.f1087v);
        p0Var.mo2488E(true);
        p0Var.mo2487D(2);
        return p0Var;
    }

    /* renamed from: z */
    private int m1759z(C0367g gVar) {
        int size = this.f1082i.size();
        for (int i = 0; i < size; i++) {
            if (gVar == this.f1082i.get(i).f1100b) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: a */
    public void mo1271a(C0367g gVar, boolean z) {
        int z2 = m1759z(gVar);
        if (z2 >= 0) {
            int i = z2 + 1;
            if (i < this.f1082i.size()) {
                this.f1082i.get(i).f1100b.mo1376e(false);
            }
            C0363d remove = this.f1082i.remove(z2);
            remove.f1100b.mo1346O(this);
            if (this.f1074I) {
                remove.f1099a.mo2533N((Object) null);
                remove.f1099a.mo2508z(0);
            }
            remove.f1099a.dismiss();
            int size = this.f1082i.size();
            if (size > 0) {
                this.f1090y = this.f1082i.get(size - 1).f1101c;
            } else {
                this.f1090y = m1755C();
            }
            if (size == 0) {
                dismiss();
                C0383m.C0384a aVar = this.f1071F;
                if (aVar != null) {
                    aVar.mo996a(gVar, true);
                }
                ViewTreeObserver viewTreeObserver = this.f1072G;
                if (viewTreeObserver != null) {
                    if (viewTreeObserver.isAlive()) {
                        this.f1072G.removeGlobalOnLayoutListener(this.f1083r);
                    }
                    this.f1072G = null;
                }
                this.f1089x.removeOnAttachStateChangeListener(this.f1084s);
                this.f1073H.onDismiss();
            } else if (z) {
                this.f1082i.get(0).f1100b.mo1376e(false);
            }
        }
    }

    /* renamed from: b */
    public boolean mo1292b() {
        return this.f1082i.size() > 0 && this.f1082i.get(0).f1099a.mo1292b();
    }

    /* renamed from: c */
    public void mo1273c(boolean z) {
        for (C0363d a : this.f1082i) {
            C0379k.m1900x(a.mo1314a().getAdapter()).notifyDataSetChanged();
        }
    }

    /* renamed from: d */
    public boolean mo1293d() {
        return false;
    }

    public void dismiss() {
        int size = this.f1082i.size();
        if (size > 0) {
            C0363d[] dVarArr = (C0363d[]) this.f1082i.toArray(new C0363d[size]);
            for (int i = size - 1; i >= 0; i--) {
                C0363d dVar = dVarArr[i];
                if (dVar.f1099a.mo1292b()) {
                    dVar.f1099a.dismiss();
                }
            }
        }
    }

    /* renamed from: g */
    public void mo1276g(C0383m.C0384a aVar) {
        this.f1071F = aVar;
    }

    /* renamed from: i */
    public ListView mo1295i() {
        if (this.f1082i.isEmpty()) {
            return null;
        }
        List<C0363d> list = this.f1082i;
        return list.get(list.size() - 1).mo1314a();
    }

    /* renamed from: j */
    public boolean mo1279j(C0392r rVar) {
        for (C0363d next : this.f1082i) {
            if (rVar == next.f1100b) {
                next.mo1314a().requestFocus();
                return true;
            }
        }
        if (!rVar.hasVisibleItems()) {
            return false;
        }
        mo1296k(rVar);
        C0383m.C0384a aVar = this.f1071F;
        if (aVar != null) {
            aVar.mo997b(rVar);
        }
        return true;
    }

    /* renamed from: k */
    public void mo1296k(C0367g gVar) {
        gVar.mo1369c(this, this.f1075b);
        if (mo1292b()) {
            m1757E(gVar);
        } else {
            this.f1081h.add(gVar);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public boolean mo1297l() {
        return false;
    }

    /* renamed from: o */
    public void mo1298o(View view) {
        if (this.f1088w != view) {
            this.f1088w = view;
            this.f1087v = C0901e.m4084b(this.f1086u, C0835a0.m3682B(view));
        }
    }

    public void onDismiss() {
        C0363d dVar;
        int size = this.f1082i.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                dVar = null;
                break;
            }
            dVar = this.f1082i.get(i);
            if (!dVar.f1099a.mo1292b()) {
                break;
            }
            i++;
        }
        if (dVar != null) {
            dVar.f1100b.mo1376e(false);
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
        this.f1069D = z;
    }

    /* renamed from: r */
    public void mo1302r(int i) {
        if (this.f1086u != i) {
            this.f1086u = i;
            this.f1087v = C0901e.m4084b(i, C0835a0.m3682B(this.f1088w));
        }
    }

    /* renamed from: s */
    public void mo1303s(int i) {
        this.f1091z = true;
        this.f1067B = i;
    }

    public void show() {
        if (!mo1292b()) {
            for (C0367g E : this.f1081h) {
                m1757E(E);
            }
            this.f1081h.clear();
            View view = this.f1088w;
            this.f1089x = view;
            if (view != null) {
                boolean z = this.f1072G == null;
                ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
                this.f1072G = viewTreeObserver;
                if (z) {
                    viewTreeObserver.addOnGlobalLayoutListener(this.f1083r);
                }
                this.f1089x.addOnAttachStateChangeListener(this.f1084s);
            }
        }
    }

    /* renamed from: t */
    public void mo1305t(PopupWindow.OnDismissListener onDismissListener) {
        this.f1073H = onDismissListener;
    }

    /* renamed from: u */
    public void mo1306u(boolean z) {
        this.f1070E = z;
    }

    /* renamed from: v */
    public void mo1307v(int i) {
        this.f1066A = true;
        this.f1068C = i;
    }
}
