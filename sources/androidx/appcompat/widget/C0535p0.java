package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.transition.Transition;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.C0366f;
import androidx.appcompat.view.menu.C0367g;
import androidx.appcompat.view.menu.C0371i;
import androidx.appcompat.view.menu.ListMenuItemView;
import java.lang.reflect.Method;

/* renamed from: androidx.appcompat.widget.p0 */
/* compiled from: MenuPopupWindow */
public class C0535p0 extends C0522n0 implements C0533o0 {

    /* renamed from: S */
    private static Method f1770S;

    /* renamed from: R */
    private C0533o0 f1771R;

    /* renamed from: androidx.appcompat.widget.p0$a */
    /* compiled from: MenuPopupWindow */
    static class C0536a {
        /* renamed from: a */
        static void m2609a(PopupWindow popupWindow, Transition transition) {
            popupWindow.setEnterTransition(transition);
        }

        /* renamed from: b */
        static void m2610b(PopupWindow popupWindow, Transition transition) {
            popupWindow.setExitTransition(transition);
        }
    }

    /* renamed from: androidx.appcompat.widget.p0$b */
    /* compiled from: MenuPopupWindow */
    static class C0537b {
        /* renamed from: a */
        static void m2611a(PopupWindow popupWindow, boolean z) {
            popupWindow.setTouchModal(z);
        }
    }

    /* renamed from: androidx.appcompat.widget.p0$c */
    /* compiled from: MenuPopupWindow */
    public static class C0538c extends C0503j0 {

        /* renamed from: w */
        final int f1772w;

        /* renamed from: x */
        final int f1773x;

        /* renamed from: y */
        private C0533o0 f1774y;

        /* renamed from: z */
        private MenuItem f1775z;

        /* renamed from: androidx.appcompat.widget.p0$c$a */
        /* compiled from: MenuPopupWindow */
        static class C0539a {
            /* renamed from: a */
            static int m2614a(Configuration configuration) {
                return configuration.getLayoutDirection();
            }
        }

        public C0538c(Context context, boolean z) {
            super(context, z);
            Configuration configuration = context.getResources().getConfiguration();
            if (Build.VERSION.SDK_INT < 17 || 1 != C0539a.m2614a(configuration)) {
                this.f1772w = 22;
                this.f1773x = 21;
                return;
            }
            this.f1772w = 21;
            this.f1773x = 22;
        }

        /* renamed from: d */
        public /* bridge */ /* synthetic */ int mo2377d(int i, int i2, int i3, int i4, int i5) {
            return super.mo2377d(i, i2, i3, i4, i5);
        }

        /* renamed from: e */
        public /* bridge */ /* synthetic */ boolean mo2380e(MotionEvent motionEvent, int i) {
            return super.mo2380e(motionEvent, i);
        }

        public /* bridge */ /* synthetic */ boolean hasFocus() {
            return super.hasFocus();
        }

        public /* bridge */ /* synthetic */ boolean hasWindowFocus() {
            return super.hasWindowFocus();
        }

        public /* bridge */ /* synthetic */ boolean isFocused() {
            return super.isFocused();
        }

        public /* bridge */ /* synthetic */ boolean isInTouchMode() {
            return super.isInTouchMode();
        }

        public boolean onHoverEvent(MotionEvent motionEvent) {
            int i;
            C0366f fVar;
            int pointToPosition;
            int i2;
            if (this.f1774y != null) {
                ListAdapter adapter = getAdapter();
                if (adapter instanceof HeaderViewListAdapter) {
                    HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                    i = headerViewListAdapter.getHeadersCount();
                    fVar = (C0366f) headerViewListAdapter.getWrappedAdapter();
                } else {
                    i = 0;
                    fVar = (C0366f) adapter;
                }
                C0371i iVar = null;
                if (motionEvent.getAction() != 10 && (pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY())) != -1 && (i2 = pointToPosition - i) >= 0 && i2 < fVar.getCount()) {
                    iVar = fVar.getItem(i2);
                }
                MenuItem menuItem = this.f1775z;
                if (menuItem != iVar) {
                    C0367g b = fVar.mo1326b();
                    if (menuItem != null) {
                        this.f1774y.mo1312g(b, menuItem);
                    }
                    this.f1775z = iVar;
                    if (iVar != null) {
                        this.f1774y.mo1311d(b, iVar);
                    }
                }
            }
            return super.onHoverEvent(motionEvent);
        }

        public boolean onKeyDown(int i, KeyEvent keyEvent) {
            C0366f fVar;
            ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
            if (listMenuItemView != null && i == this.f1772w) {
                if (listMenuItemView.isEnabled() && listMenuItemView.getItemData().hasSubMenu()) {
                    performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
                }
                return true;
            } else if (listMenuItemView == null || i != this.f1773x) {
                return super.onKeyDown(i, keyEvent);
            } else {
                setSelection(-1);
                ListAdapter adapter = getAdapter();
                if (adapter instanceof HeaderViewListAdapter) {
                    fVar = (C0366f) ((HeaderViewListAdapter) adapter).getWrappedAdapter();
                } else {
                    fVar = (C0366f) adapter;
                }
                fVar.mo1326b().mo1376e(false);
                return true;
            }
        }

        public /* bridge */ /* synthetic */ boolean onTouchEvent(MotionEvent motionEvent) {
            return super.onTouchEvent(motionEvent);
        }

        public void setHoverListener(C0533o0 o0Var) {
            this.f1774y = o0Var;
        }

        public /* bridge */ /* synthetic */ void setSelector(Drawable drawable) {
            super.setSelector(drawable);
        }
    }

    static {
        try {
            if (Build.VERSION.SDK_INT <= 28) {
                f1770S = PopupWindow.class.getDeclaredMethod("setTouchModal", new Class[]{Boolean.TYPE});
            }
        } catch (NoSuchMethodException unused) {
            Log.i("MenuPopupWindow", "Could not find method setTouchModal() on PopupWindow. Oh well.");
        }
    }

    public C0535p0(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    /* renamed from: M */
    public void mo2532M(Object obj) {
        if (Build.VERSION.SDK_INT >= 23) {
            C0536a.m2609a(this.f1741N, (Transition) obj);
        }
    }

    /* renamed from: N */
    public void mo2533N(Object obj) {
        if (Build.VERSION.SDK_INT >= 23) {
            C0536a.m2610b(this.f1741N, (Transition) obj);
        }
    }

    /* renamed from: O */
    public void mo2534O(C0533o0 o0Var) {
        this.f1771R = o0Var;
    }

    /* renamed from: P */
    public void mo2535P(boolean z) {
        if (Build.VERSION.SDK_INT <= 28) {
            Method method = f1770S;
            if (method != null) {
                try {
                    method.invoke(this.f1741N, new Object[]{Boolean.valueOf(z)});
                } catch (Exception unused) {
                    Log.i("MenuPopupWindow", "Could not invoke setTouchModal() on PopupWindow. Oh well.");
                }
            }
        } else {
            C0537b.m2611a(this.f1741N, z);
        }
    }

    /* renamed from: d */
    public void mo1311d(C0367g gVar, MenuItem menuItem) {
        C0533o0 o0Var = this.f1771R;
        if (o0Var != null) {
            o0Var.mo1311d(gVar, menuItem);
        }
    }

    /* renamed from: g */
    public void mo1312g(C0367g gVar, MenuItem menuItem) {
        C0533o0 o0Var = this.f1771R;
        if (o0Var != null) {
            o0Var.mo1312g(gVar, menuItem);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public C0503j0 mo2502r(Context context, boolean z) {
        C0538c cVar = new C0538c(context, z);
        cVar.setHoverListener(this);
        return cVar;
    }
}
