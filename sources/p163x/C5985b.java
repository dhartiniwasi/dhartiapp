package p163x;

import android.database.Cursor;
import android.widget.Filter;

/* renamed from: x.b */
/* compiled from: CursorFilter */
class C5985b extends Filter {

    /* renamed from: a */
    C5986a f29206a;

    /* renamed from: x.b$a */
    /* compiled from: CursorFilter */
    interface C5986a {
        /* renamed from: a */
        void mo2619a(Cursor cursor);

        /* renamed from: b */
        Cursor mo20690b();

        /* renamed from: c */
        CharSequence mo2620c(Cursor cursor);

        /* renamed from: d */
        Cursor mo2621d(CharSequence charSequence);
    }

    C5985b(C5986a aVar) {
        this.f29206a = aVar;
    }

    public CharSequence convertResultToString(Object obj) {
        return this.f29206a.mo2620c((Cursor) obj);
    }

    /* access modifiers changed from: protected */
    public Filter.FilterResults performFiltering(CharSequence charSequence) {
        Cursor d = this.f29206a.mo2621d(charSequence);
        Filter.FilterResults filterResults = new Filter.FilterResults();
        if (d != null) {
            filterResults.count = d.getCount();
            filterResults.values = d;
        } else {
            filterResults.count = 0;
            filterResults.values = null;
        }
        return filterResults;
    }

    /* access modifiers changed from: protected */
    public void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
        Cursor b = this.f29206a.mo20690b();
        Object obj = filterResults.values;
        if (obj != null && obj != b) {
            this.f29206a.mo2619a((Cursor) obj);
        }
    }
}
