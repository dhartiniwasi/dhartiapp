package androidx.appcompat.view.menu;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.appcompat.view.menu.C0385n;
import java.util.ArrayList;

/* renamed from: androidx.appcompat.view.menu.f */
/* compiled from: MenuAdapter */
public class C0366f extends BaseAdapter {

    /* renamed from: a */
    C0367g f1113a;

    /* renamed from: b */
    private int f1114b = -1;

    /* renamed from: c */
    private boolean f1115c;

    /* renamed from: d */
    private final boolean f1116d;

    /* renamed from: e */
    private final LayoutInflater f1117e;

    /* renamed from: f */
    private final int f1118f;

    public C0366f(C0367g gVar, LayoutInflater layoutInflater, boolean z, int i) {
        this.f1116d = z;
        this.f1117e = layoutInflater;
        this.f1113a = gVar;
        this.f1118f = i;
        mo1325a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo1325a() {
        C0371i v = this.f1113a.mo1403v();
        if (v != null) {
            ArrayList<C0371i> z = this.f1113a.mo1407z();
            int size = z.size();
            for (int i = 0; i < size; i++) {
                if (z.get(i) == v) {
                    this.f1114b = i;
                    return;
                }
            }
        }
        this.f1114b = -1;
    }

    /* renamed from: b */
    public C0367g mo1326b() {
        return this.f1113a;
    }

    /* renamed from: c */
    public C0371i getItem(int i) {
        ArrayList<C0371i> z = this.f1116d ? this.f1113a.mo1407z() : this.f1113a.mo1337E();
        int i2 = this.f1114b;
        if (i2 >= 0 && i >= i2) {
            i++;
        }
        return z.get(i);
    }

    /* renamed from: d */
    public void mo1328d(boolean z) {
        this.f1115c = z;
    }

    public int getCount() {
        ArrayList<C0371i> z = this.f1116d ? this.f1113a.mo1407z() : this.f1113a.mo1337E();
        if (this.f1114b < 0) {
            return z.size();
        }
        return z.size() - 1;
    }

    public long getItemId(int i) {
        return (long) i;
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.f1117e.inflate(this.f1118f, viewGroup, false);
        }
        int groupId = getItem(i).getGroupId();
        int i2 = i - 1;
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        listMenuItemView.setGroupDividerEnabled(this.f1113a.mo1338F() && groupId != (i2 >= 0 ? getItem(i2).getGroupId() : groupId));
        C0385n.C0386a aVar = (C0385n.C0386a) view;
        if (this.f1115c) {
            listMenuItemView.setForceShowIcon(true);
        }
        aVar.mo1177e(getItem(i), 0);
        return view;
    }

    public void notifyDataSetChanged() {
        mo1325a();
        super.notifyDataSetChanged();
    }
}
