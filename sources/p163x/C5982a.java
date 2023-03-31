package p163x;

import android.content.Context;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import p163x.C5985b;

/* renamed from: x.a */
/* compiled from: CursorAdapter */
public abstract class C5982a extends BaseAdapter implements Filterable, C5985b.C5986a {

    /* renamed from: a */
    protected boolean f29196a;

    /* renamed from: b */
    protected boolean f29197b;

    /* renamed from: c */
    protected Cursor f29198c;

    /* renamed from: d */
    protected Context f29199d;

    /* renamed from: e */
    protected int f29200e;

    /* renamed from: f */
    protected C5983a f29201f;

    /* renamed from: g */
    protected DataSetObserver f29202g;

    /* renamed from: h */
    protected C5985b f29203h;

    /* renamed from: x.a$a */
    /* compiled from: CursorAdapter */
    private class C5983a extends ContentObserver {
        C5983a() {
            super(new Handler());
        }

        public boolean deliverSelfNotifications() {
            return true;
        }

        public void onChange(boolean z) {
            C5982a.this.mo20697i();
        }
    }

    /* renamed from: x.a$b */
    /* compiled from: CursorAdapter */
    private class C5984b extends DataSetObserver {
        C5984b() {
        }

        public void onChanged() {
            C5982a aVar = C5982a.this;
            aVar.f29196a = true;
            aVar.notifyDataSetChanged();
        }

        public void onInvalidated() {
            C5982a aVar = C5982a.this;
            aVar.f29196a = false;
            aVar.notifyDataSetInvalidated();
        }
    }

    public C5982a(Context context, Cursor cursor, boolean z) {
        mo20691f(context, cursor, z ? 1 : 2);
    }

    /* renamed from: a */
    public void mo2619a(Cursor cursor) {
        Cursor j = mo20698j(cursor);
        if (j != null) {
            j.close();
        }
    }

    /* renamed from: b */
    public Cursor mo20690b() {
        return this.f29198c;
    }

    /* renamed from: c */
    public abstract CharSequence mo2620c(Cursor cursor);

    /* renamed from: e */
    public abstract void mo2622e(View view, Context context, Cursor cursor);

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo20691f(Context context, Cursor cursor, int i) {
        boolean z = false;
        if ((i & 1) == 1) {
            i |= 2;
            this.f29197b = true;
        } else {
            this.f29197b = false;
        }
        if (cursor != null) {
            z = true;
        }
        this.f29198c = cursor;
        this.f29196a = z;
        this.f29199d = context;
        this.f29200e = z ? cursor.getColumnIndexOrThrow("_id") : -1;
        if ((i & 2) == 2) {
            this.f29201f = new C5983a();
            this.f29202g = new C5984b();
        } else {
            this.f29201f = null;
            this.f29202g = null;
        }
        if (z) {
            C5983a aVar = this.f29201f;
            if (aVar != null) {
                cursor.registerContentObserver(aVar);
            }
            DataSetObserver dataSetObserver = this.f29202g;
            if (dataSetObserver != null) {
                cursor.registerDataSetObserver(dataSetObserver);
            }
        }
    }

    /* renamed from: g */
    public abstract View mo20692g(Context context, Cursor cursor, ViewGroup viewGroup);

    public int getCount() {
        Cursor cursor;
        if (!this.f29196a || (cursor = this.f29198c) == null) {
            return 0;
        }
        return cursor.getCount();
    }

    public View getDropDownView(int i, View view, ViewGroup viewGroup) {
        if (!this.f29196a) {
            return null;
        }
        this.f29198c.moveToPosition(i);
        if (view == null) {
            view = mo20692g(this.f29199d, this.f29198c, viewGroup);
        }
        mo2622e(view, this.f29199d, this.f29198c);
        return view;
    }

    public Filter getFilter() {
        if (this.f29203h == null) {
            this.f29203h = new C5985b(this);
        }
        return this.f29203h;
    }

    public Object getItem(int i) {
        Cursor cursor;
        if (!this.f29196a || (cursor = this.f29198c) == null) {
            return null;
        }
        cursor.moveToPosition(i);
        return this.f29198c;
    }

    public long getItemId(int i) {
        Cursor cursor;
        if (!this.f29196a || (cursor = this.f29198c) == null || !cursor.moveToPosition(i)) {
            return 0;
        }
        return this.f29198c.getLong(this.f29200e);
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        if (!this.f29196a) {
            throw new IllegalStateException("this should only be called when the cursor is valid");
        } else if (this.f29198c.moveToPosition(i)) {
            if (view == null) {
                view = mo2625h(this.f29199d, this.f29198c, viewGroup);
            }
            mo2622e(view, this.f29199d, this.f29198c);
            return view;
        } else {
            throw new IllegalStateException("couldn't move cursor to position " + i);
        }
    }

    /* renamed from: h */
    public abstract View mo2625h(Context context, Cursor cursor, ViewGroup viewGroup);

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public void mo20697i() {
        Cursor cursor;
        if (this.f29197b && (cursor = this.f29198c) != null && !cursor.isClosed()) {
            this.f29196a = this.f29198c.requery();
        }
    }

    /* renamed from: j */
    public Cursor mo20698j(Cursor cursor) {
        Cursor cursor2 = this.f29198c;
        if (cursor == cursor2) {
            return null;
        }
        if (cursor2 != null) {
            C5983a aVar = this.f29201f;
            if (aVar != null) {
                cursor2.unregisterContentObserver(aVar);
            }
            DataSetObserver dataSetObserver = this.f29202g;
            if (dataSetObserver != null) {
                cursor2.unregisterDataSetObserver(dataSetObserver);
            }
        }
        this.f29198c = cursor;
        if (cursor != null) {
            C5983a aVar2 = this.f29201f;
            if (aVar2 != null) {
                cursor.registerContentObserver(aVar2);
            }
            DataSetObserver dataSetObserver2 = this.f29202g;
            if (dataSetObserver2 != null) {
                cursor.registerDataSetObserver(dataSetObserver2);
            }
            this.f29200e = cursor.getColumnIndexOrThrow("_id");
            this.f29196a = true;
            notifyDataSetChanged();
        } else {
            this.f29200e = -1;
            this.f29196a = false;
            notifyDataSetInvalidated();
        }
        return cursor2;
    }
}
