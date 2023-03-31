package com.google.android.material.datepicker;

import android.os.Build;
import android.widget.BaseAdapter;
import java.util.Calendar;

/* renamed from: com.google.android.material.datepicker.g */
/* compiled from: DaysOfWeekAdapter */
class C7635g extends BaseAdapter {

    /* renamed from: d */
    private static final int f33572d = (Build.VERSION.SDK_INT >= 26 ? 4 : 1);

    /* renamed from: a */
    private final Calendar f33573a;

    /* renamed from: b */
    private final int f33574b;

    /* renamed from: c */
    private final int f33575c;

    public C7635g() {
        Calendar k = C7667r.m42694k();
        this.f33573a = k;
        this.f33574b = k.getMaximum(7);
        this.f33575c = k.getFirstDayOfWeek();
    }

    /* renamed from: b */
    private int m42581b(int i) {
        int i2 = i + this.f33575c;
        int i3 = this.f33574b;
        return i2 > i3 ? i2 - i3 : i2;
    }

    /* renamed from: a */
    public Integer getItem(int i) {
        if (i >= this.f33574b) {
            return null;
        }
        return Integer.valueOf(m42581b(i));
    }

    public int getCount() {
        return this.f33574b;
    }

    public long getItemId(int i) {
        return 0;
    }

    /* JADX WARNING: type inference failed for: r7v8, types: [android.view.View] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View getView(int r6, android.view.View r7, android.view.ViewGroup r8) {
        /*
            r5 = this;
            r0 = r7
            android.widget.TextView r0 = (android.widget.TextView) r0
            r1 = 0
            if (r7 != 0) goto L_0x0017
            android.content.Context r7 = r8.getContext()
            android.view.LayoutInflater r7 = android.view.LayoutInflater.from(r7)
            int r0 = p227f6.C10132h.mtrl_calendar_day_of_week
            android.view.View r7 = r7.inflate(r0, r8, r1)
            r0 = r7
            android.widget.TextView r0 = (android.widget.TextView) r0
        L_0x0017:
            java.util.Calendar r7 = r5.f33573a
            int r6 = r5.m42581b(r6)
            r2 = 7
            r7.set(r2, r6)
            java.util.Calendar r6 = r5.f33573a
            int r7 = f33572d
            java.util.Locale r3 = java.util.Locale.getDefault()
            java.lang.String r6 = r6.getDisplayName(r2, r7, r3)
            r0.setText(r6)
            android.content.Context r6 = r8.getContext()
            int r7 = p227f6.C10133i.mtrl_picker_day_of_week_column_header
            java.lang.String r6 = r6.getString(r7)
            r7 = 1
            java.lang.Object[] r7 = new java.lang.Object[r7]
            java.util.Calendar r8 = r5.f33573a
            r3 = 2
            java.util.Locale r4 = java.util.Locale.getDefault()
            java.lang.String r8 = r8.getDisplayName(r2, r3, r4)
            r7[r1] = r8
            java.lang.String r6 = java.lang.String.format(r6, r7)
            r0.setContentDescription(r6)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.datepicker.C7635g.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }
}
