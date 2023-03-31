package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.Rect;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;

/* renamed from: androidx.appcompat.view.menu.k */
/* compiled from: MenuPopup */
abstract class C0379k implements C0388p, C0383m, AdapterView.OnItemClickListener {

    /* renamed from: a */
    private Rect f1193a;

    C0379k() {
    }

    /* renamed from: n */
    protected static int m1898n(ListAdapter listAdapter, ViewGroup viewGroup, Context context, int i) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        int count = listAdapter.getCount();
        View view = null;
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < count; i4++) {
            int itemViewType = listAdapter.getItemViewType(i4);
            if (itemViewType != i3) {
                view = null;
                i3 = itemViewType;
            }
            if (viewGroup == null) {
                viewGroup = new FrameLayout(context);
            }
            view = listAdapter.getView(i4, view, viewGroup);
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            int measuredWidth = view.getMeasuredWidth();
            if (measuredWidth >= i) {
                return i;
            }
            if (measuredWidth > i2) {
                i2 = measuredWidth;
            }
        }
        return i2;
    }

    /* renamed from: w */
    protected static boolean m1899w(C0367g gVar) {
        int size = gVar.size();
        for (int i = 0; i < size; i++) {
            MenuItem item = gVar.getItem(i);
            if (item.isVisible() && item.getIcon() != null) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: x */
    protected static C0366f m1900x(ListAdapter listAdapter) {
        if (listAdapter instanceof HeaderViewListAdapter) {
            return (C0366f) ((HeaderViewListAdapter) listAdapter).getWrappedAdapter();
        }
        return (C0366f) listAdapter;
    }

    /* renamed from: e */
    public boolean mo1274e(C0367g gVar, C0371i iVar) {
        return false;
    }

    /* renamed from: f */
    public boolean mo1275f(C0367g gVar, C0371i iVar) {
        return false;
    }

    /* renamed from: h */
    public void mo1277h(Context context, C0367g gVar) {
    }

    /* renamed from: k */
    public abstract void mo1296k(C0367g gVar);

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public boolean mo1297l() {
        return true;
    }

    /* renamed from: m */
    public Rect mo1540m() {
        return this.f1193a;
    }

    /* renamed from: o */
    public abstract void mo1298o(View view);

    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        ListAdapter listAdapter = (ListAdapter) adapterView.getAdapter();
        m1900x(listAdapter).f1113a.mo1345M((MenuItem) listAdapter.getItem(i), this, mo1297l() ? 0 : 4);
    }

    /* renamed from: p */
    public void mo1542p(Rect rect) {
        this.f1193a = rect;
    }

    /* renamed from: q */
    public abstract void mo1301q(boolean z);

    /* renamed from: r */
    public abstract void mo1302r(int i);

    /* renamed from: s */
    public abstract void mo1303s(int i);

    /* renamed from: t */
    public abstract void mo1305t(PopupWindow.OnDismissListener onDismissListener);

    /* renamed from: u */
    public abstract void mo1306u(boolean z);

    /* renamed from: v */
    public abstract void mo1307v(int i);
}
