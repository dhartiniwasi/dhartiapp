package com.google.android.material.datepicker;

import android.content.Context;
import android.widget.BaseAdapter;

/* renamed from: com.google.android.material.datepicker.m */
/* compiled from: MonthAdapter */
class C7659m extends BaseAdapter {

    /* renamed from: e */
    static final int f33644e = C7667r.m42694k().getMaximum(4);

    /* renamed from: a */
    final C7657l f33645a;

    /* renamed from: b */
    final C7631d<?> f33646b;

    /* renamed from: c */
    C7630c f33647c;

    /* renamed from: d */
    final C7625a f33648d;

    C7659m(C7657l lVar, C7631d<?> dVar, C7625a aVar) {
        this.f33645a = lVar;
        this.f33646b = dVar;
        this.f33648d = aVar;
    }

    /* renamed from: e */
    private void m42659e(Context context) {
        if (this.f33647c == null) {
            this.f33647c = new C7630c(context);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public int mo25450a(int i) {
        return mo25451b() + (i - 1);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public int mo25451b() {
        return this.f33645a.mo25439j();
    }

    /* renamed from: c */
    public Long getItem(int i) {
        if (i < this.f33645a.mo25439j() || i > mo25460h()) {
            return null;
        }
        return Long.valueOf(this.f33645a.mo25440k(mo25462i(i)));
    }

    /* JADX WARNING: type inference failed for: r7v19, types: [android.view.View] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x006f A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0070  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.widget.TextView getView(int r6, android.view.View r7, android.view.ViewGroup r8) {
        /*
            r5 = this;
            android.content.Context r0 = r8.getContext()
            r5.m42659e(r0)
            r0 = r7
            android.widget.TextView r0 = (android.widget.TextView) r0
            r1 = 0
            if (r7 != 0) goto L_0x001e
            android.content.Context r7 = r8.getContext()
            android.view.LayoutInflater r7 = android.view.LayoutInflater.from(r7)
            int r0 = p227f6.C10132h.mtrl_calendar_day
            android.view.View r7 = r7.inflate(r0, r8, r1)
            r0 = r7
            android.widget.TextView r0 = (android.widget.TextView) r0
        L_0x001e:
            int r7 = r5.mo25451b()
            int r7 = r6 - r7
            r8 = 1
            if (r7 < 0) goto L_0x0061
            com.google.android.material.datepicker.l r2 = r5.f33645a
            int r3 = r2.f33642f
            if (r7 < r3) goto L_0x002e
            goto L_0x0061
        L_0x002e:
            int r7 = r7 + r8
            r0.setTag(r2)
            java.lang.String r2 = java.lang.String.valueOf(r7)
            r0.setText(r2)
            com.google.android.material.datepicker.l r2 = r5.f33645a
            long r2 = r2.mo25440k(r7)
            com.google.android.material.datepicker.l r7 = r5.f33645a
            int r7 = r7.f33640d
            com.google.android.material.datepicker.l r4 = com.google.android.material.datepicker.C7657l.m42649r()
            int r4 = r4.f33640d
            if (r7 != r4) goto L_0x0053
            java.lang.String r7 = com.google.android.material.datepicker.C7632e.m42573a(r2)
            r0.setContentDescription(r7)
            goto L_0x005a
        L_0x0053:
            java.lang.String r7 = com.google.android.material.datepicker.C7632e.m42575c(r2)
            r0.setContentDescription(r7)
        L_0x005a:
            r0.setVisibility(r1)
            r0.setEnabled(r8)
            goto L_0x0069
        L_0x0061:
            r7 = 8
            r0.setVisibility(r7)
            r0.setEnabled(r1)
        L_0x0069:
            java.lang.Long r6 = r5.getItem(r6)
            if (r6 != 0) goto L_0x0070
            return r0
        L_0x0070:
            com.google.android.material.datepicker.a r7 = r5.f33648d
            com.google.android.material.datepicker.a$c r7 = r7.mo25374e()
            long r2 = r6.longValue()
            boolean r7 = r7.mo25389Q0(r2)
            if (r7 == 0) goto L_0x00d5
            r0.setEnabled(r8)
            com.google.android.material.datepicker.d<?> r7 = r5.f33646b
            java.util.Collection r7 = r7.mo25397c1()
            java.util.Iterator r7 = r7.iterator()
        L_0x008d:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L_0x00b5
            java.lang.Object r8 = r7.next()
            java.lang.Long r8 = (java.lang.Long) r8
            long r1 = r8.longValue()
            long r3 = r6.longValue()
            long r3 = com.google.android.material.datepicker.C7667r.m42684a(r3)
            long r1 = com.google.android.material.datepicker.C7667r.m42684a(r1)
            int r8 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r8 != 0) goto L_0x008d
            com.google.android.material.datepicker.c r6 = r5.f33647c
            com.google.android.material.datepicker.b r6 = r6.f33564b
            r6.mo25392d(r0)
            return r0
        L_0x00b5:
            java.util.Calendar r7 = com.google.android.material.datepicker.C7667r.m42692i()
            long r7 = r7.getTimeInMillis()
            long r1 = r6.longValue()
            int r6 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r6 != 0) goto L_0x00cd
            com.google.android.material.datepicker.c r6 = r5.f33647c
            com.google.android.material.datepicker.b r6 = r6.f33565c
            r6.mo25392d(r0)
            return r0
        L_0x00cd:
            com.google.android.material.datepicker.c r6 = r5.f33647c
            com.google.android.material.datepicker.b r6 = r6.f33563a
            r6.mo25392d(r0)
            return r0
        L_0x00d5:
            r0.setEnabled(r1)
            com.google.android.material.datepicker.c r6 = r5.f33647c
            com.google.android.material.datepicker.b r6 = r6.f33569g
            r6.mo25392d(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.datepicker.C7659m.getView(int, android.view.View, android.view.ViewGroup):android.widget.TextView");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public boolean mo25454f(int i) {
        return i % this.f33645a.f33641e == 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public boolean mo25455g(int i) {
        return (i + 1) % this.f33645a.f33641e == 0;
    }

    public int getCount() {
        return this.f33645a.f33642f + mo25451b();
    }

    public long getItemId(int i) {
        return (long) (i / this.f33645a.f33641e);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public int mo25460h() {
        return (this.f33645a.mo25439j() + this.f33645a.f33642f) - 1;
    }

    public boolean hasStableIds() {
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public int mo25462i(int i) {
        return (i - this.f33645a.mo25439j()) + 1;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public boolean mo25463j(int i) {
        return i >= mo25451b() && i <= mo25460h();
    }
}
