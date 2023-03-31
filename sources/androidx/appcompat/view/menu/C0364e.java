package androidx.appcompat.view.menu;

import android.content.Context;
import android.os.IBinder;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import androidx.appcompat.view.menu.C0383m;
import androidx.appcompat.view.menu.C0385n;
import java.util.ArrayList;
import p048g.C4294g;

/* renamed from: androidx.appcompat.view.menu.e */
/* compiled from: ListMenuPresenter */
public class C0364e implements C0383m, AdapterView.OnItemClickListener {

    /* renamed from: a */
    Context f1102a;

    /* renamed from: b */
    LayoutInflater f1103b;

    /* renamed from: c */
    C0367g f1104c;

    /* renamed from: d */
    ExpandedMenuView f1105d;

    /* renamed from: e */
    int f1106e;

    /* renamed from: f */
    int f1107f;

    /* renamed from: g */
    int f1108g;

    /* renamed from: h */
    private C0383m.C0384a f1109h;

    /* renamed from: i */
    C0365a f1110i;

    /* renamed from: androidx.appcompat.view.menu.e$a */
    /* compiled from: ListMenuPresenter */
    private class C0365a extends BaseAdapter {

        /* renamed from: a */
        private int f1111a = -1;

        public C0365a() {
            mo1318a();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo1318a() {
            C0371i v = C0364e.this.f1104c.mo1403v();
            if (v != null) {
                ArrayList<C0371i> z = C0364e.this.f1104c.mo1407z();
                int size = z.size();
                for (int i = 0; i < size; i++) {
                    if (z.get(i) == v) {
                        this.f1111a = i;
                        return;
                    }
                }
            }
            this.f1111a = -1;
        }

        /* renamed from: b */
        public C0371i getItem(int i) {
            ArrayList<C0371i> z = C0364e.this.f1104c.mo1407z();
            int i2 = i + C0364e.this.f1106e;
            int i3 = this.f1111a;
            if (i3 >= 0 && i2 >= i3) {
                i2++;
            }
            return z.get(i2);
        }

        public int getCount() {
            int size = C0364e.this.f1104c.mo1407z().size() - C0364e.this.f1106e;
            return this.f1111a < 0 ? size : size - 1;
        }

        public long getItemId(int i) {
            return (long) i;
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            if (view == null) {
                C0364e eVar = C0364e.this;
                view = eVar.f1103b.inflate(eVar.f1108g, viewGroup, false);
            }
            ((C0385n.C0386a) view).mo1177e(getItem(i), 0);
            return view;
        }

        public void notifyDataSetChanged() {
            mo1318a();
            super.notifyDataSetChanged();
        }
    }

    public C0364e(Context context, int i) {
        this(i, 0);
        this.f1102a = context;
        this.f1103b = LayoutInflater.from(context);
    }

    /* renamed from: a */
    public void mo1271a(C0367g gVar, boolean z) {
        C0383m.C0384a aVar = this.f1109h;
        if (aVar != null) {
            aVar.mo996a(gVar, z);
        }
    }

    /* renamed from: b */
    public ListAdapter mo1315b() {
        if (this.f1110i == null) {
            this.f1110i = new C0365a();
        }
        return this.f1110i;
    }

    /* renamed from: c */
    public void mo1273c(boolean z) {
        C0365a aVar = this.f1110i;
        if (aVar != null) {
            aVar.notifyDataSetChanged();
        }
    }

    /* renamed from: d */
    public boolean mo1293d() {
        return false;
    }

    /* renamed from: e */
    public boolean mo1274e(C0367g gVar, C0371i iVar) {
        return false;
    }

    /* renamed from: f */
    public boolean mo1275f(C0367g gVar, C0371i iVar) {
        return false;
    }

    /* renamed from: g */
    public void mo1276g(C0383m.C0384a aVar) {
        this.f1109h = aVar;
    }

    /* renamed from: h */
    public void mo1277h(Context context, C0367g gVar) {
        if (this.f1107f != 0) {
            ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, this.f1107f);
            this.f1102a = contextThemeWrapper;
            this.f1103b = LayoutInflater.from(contextThemeWrapper);
        } else if (this.f1102a != null) {
            this.f1102a = context;
            if (this.f1103b == null) {
                this.f1103b = LayoutInflater.from(context);
            }
        }
        this.f1104c = gVar;
        C0365a aVar = this.f1110i;
        if (aVar != null) {
            aVar.notifyDataSetChanged();
        }
    }

    /* renamed from: i */
    public C0385n mo1316i(ViewGroup viewGroup) {
        if (this.f1105d == null) {
            this.f1105d = (ExpandedMenuView) this.f1103b.inflate(C4294g.f23904g, viewGroup, false);
            if (this.f1110i == null) {
                this.f1110i = new C0365a();
            }
            this.f1105d.setAdapter(this.f1110i);
            this.f1105d.setOnItemClickListener(this);
        }
        return this.f1105d;
    }

    /* renamed from: j */
    public boolean mo1279j(C0392r rVar) {
        if (!rVar.hasVisibleItems()) {
            return false;
        }
        new C0370h(rVar).mo1409d((IBinder) null);
        C0383m.C0384a aVar = this.f1109h;
        if (aVar == null) {
            return true;
        }
        aVar.mo997b(rVar);
        return true;
    }

    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        this.f1104c.mo1345M(this.f1110i.getItem(i), this, 0);
    }

    public C0364e(int i, int i2) {
        this.f1108g = i;
        this.f1107f = i2;
    }
}
