package com.google.android.material.datepicker;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.core.view.C0835a0;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.datepicker.C7636h;
import p227f6.C10130f;
import p227f6.C10132h;

/* renamed from: com.google.android.material.datepicker.n */
/* compiled from: MonthsPagerAdapter */
class C7660n extends RecyclerView.C1339g<C7662b> {

    /* renamed from: c */
    private final C7625a f33649c;

    /* renamed from: d */
    private final C7631d<?> f33650d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final C7636h.C7648l f33651e;

    /* renamed from: f */
    private final int f33652f;

    /* renamed from: com.google.android.material.datepicker.n$a */
    /* compiled from: MonthsPagerAdapter */
    class C7661a implements AdapterView.OnItemClickListener {

        /* renamed from: a */
        final /* synthetic */ MaterialCalendarGridView f33653a;

        C7661a(MaterialCalendarGridView materialCalendarGridView) {
            this.f33653a = materialCalendarGridView;
        }

        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            if (this.f33653a.getAdapter().mo25463j(i)) {
                C7660n.this.f33651e.mo25423a(this.f33653a.getAdapter().getItem(i).longValue());
            }
        }
    }

    /* renamed from: com.google.android.material.datepicker.n$b */
    /* compiled from: MonthsPagerAdapter */
    public static class C7662b extends RecyclerView.C1336d0 {

        /* renamed from: t */
        final TextView f33655t;

        /* renamed from: u */
        final MaterialCalendarGridView f33656u;

        C7662b(LinearLayout linearLayout, boolean z) {
            super(linearLayout);
            TextView textView = (TextView) linearLayout.findViewById(C10130f.month_title);
            this.f33655t = textView;
            C0835a0.m3743o0(textView, true);
            this.f33656u = (MaterialCalendarGridView) linearLayout.findViewById(C10130f.month_grid);
            if (!z) {
                textView.setVisibility(8);
            }
        }
    }

    C7660n(Context context, C7631d<?> dVar, C7625a aVar, C7636h.C7648l lVar) {
        C7657l i = aVar.mo25380i();
        C7657l f = aVar.mo25376f();
        C7657l h = aVar.mo25378h();
        if (i.compareTo(h) > 0) {
            throw new IllegalArgumentException("firstPage cannot be after currentPage");
        } else if (h.compareTo(f) <= 0) {
            this.f33652f = (C7659m.f33644e * C7636h.m42592U1(context)) + (C7649i.m42627j2(context) ? C7636h.m42592U1(context) : 0);
            this.f33649c = aVar;
            this.f33650d = dVar;
            this.f33651e = lVar;
            mo5076s(true);
        } else {
            throw new IllegalArgumentException("currentPage cannot be after lastPage");
        }
    }

    /* renamed from: c */
    public int mo5060c() {
        return this.f33649c.mo25377g();
    }

    /* renamed from: d */
    public long mo5061d(int i) {
        return this.f33649c.mo25380i().mo25443p(i).mo25442o();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: v */
    public C7657l mo25464v(int i) {
        return this.f33649c.mo25380i().mo25443p(i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: w */
    public CharSequence mo25465w(int i) {
        return mo25464v(i).mo25441n();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: x */
    public int mo25466x(C7657l lVar) {
        return this.f33649c.mo25380i().mo25444q(lVar);
    }

    /* renamed from: y */
    public void mo5067j(C7662b bVar, int i) {
        C7657l p = this.f33649c.mo25380i().mo25443p(i);
        bVar.f33655t.setText(p.mo25441n());
        MaterialCalendarGridView materialCalendarGridView = (MaterialCalendarGridView) bVar.f33656u.findViewById(C10130f.month_grid);
        if (materialCalendarGridView.getAdapter() == null || !p.equals(materialCalendarGridView.getAdapter().f33645a)) {
            C7659m mVar = new C7659m(p, this.f33650d, this.f33649c);
            materialCalendarGridView.setNumColumns(p.f33641e);
            materialCalendarGridView.setAdapter((ListAdapter) mVar);
        } else {
            materialCalendarGridView.getAdapter().notifyDataSetChanged();
        }
        materialCalendarGridView.setOnItemClickListener(new C7661a(materialCalendarGridView));
    }

    /* renamed from: z */
    public C7662b mo5069l(ViewGroup viewGroup, int i) {
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(viewGroup.getContext()).inflate(C10132h.mtrl_calendar_month_labeled, viewGroup, false);
        if (!C7649i.m42627j2(viewGroup.getContext())) {
            return new C7662b(linearLayout, false);
        }
        linearLayout.setLayoutParams(new RecyclerView.C1355p(-1, this.f33652f));
        return new C7662b(linearLayout, true);
    }
}
