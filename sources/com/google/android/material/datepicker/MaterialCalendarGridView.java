package com.google.android.material.datepicker;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.GridView;
import android.widget.ListAdapter;
import androidx.core.util.C0827d;
import androidx.core.view.C0832a;
import androidx.core.view.C0835a0;
import androidx.core.view.accessibility.C0862c;
import java.util.Calendar;
import p227f6.C10130f;

final class MaterialCalendarGridView extends GridView {

    /* renamed from: a */
    private final Calendar f33543a;

    /* renamed from: com.google.android.material.datepicker.MaterialCalendarGridView$a */
    class C7624a extends C0832a {
        C7624a() {
        }

        /* renamed from: g */
        public void mo3231g(View view, C0862c cVar) {
            super.mo3231g(view, cVar);
            cVar.mo3295Z((Object) null);
        }
    }

    public MaterialCalendarGridView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    private void m42541a(int i, Rect rect) {
        if (i == 33) {
            setSelection(getAdapter().mo25460h());
        } else if (i == 130) {
            setSelection(getAdapter().mo25451b());
        } else {
            super.onFocusChanged(true, i, rect);
        }
    }

    /* renamed from: c */
    private static int m42542c(View view) {
        return view.getLeft() + (view.getWidth() / 2);
    }

    /* renamed from: d */
    private static boolean m42543d(Long l, Long l2, Long l3, Long l4) {
        return l == null || l2 == null || l3 == null || l4 == null || l3.longValue() > l2.longValue() || l4.longValue() < l.longValue();
    }

    /* renamed from: b */
    public C7659m getAdapter() {
        return (C7659m) super.getAdapter();
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        getAdapter().notifyDataSetChanged();
    }

    /* access modifiers changed from: protected */
    public final void onDraw(Canvas canvas) {
        int i;
        int i2;
        int i3;
        int i4;
        MaterialCalendarGridView materialCalendarGridView = this;
        super.onDraw(canvas);
        C7659m b = getAdapter();
        C7631d<?> dVar = b.f33646b;
        C7630c cVar = b.f33647c;
        Long c = b.getItem(b.mo25451b());
        Long c2 = b.getItem(b.mo25460h());
        for (C0827d next : dVar.mo25394L()) {
            F f = next.f2438a;
            if (f != null) {
                if (next.f2439b == null) {
                    continue;
                } else {
                    long longValue = ((Long) f).longValue();
                    long longValue2 = ((Long) next.f2439b).longValue();
                    if (!m42543d(c, c2, Long.valueOf(longValue), Long.valueOf(longValue2))) {
                        if (longValue < c.longValue()) {
                            i2 = b.mo25451b();
                            if (b.mo25454f(i2)) {
                                i = 0;
                            } else {
                                i = materialCalendarGridView.getChildAt(i2 - 1).getRight();
                            }
                        } else {
                            materialCalendarGridView.f33543a.setTimeInMillis(longValue);
                            i2 = b.mo25450a(materialCalendarGridView.f33543a.get(5));
                            i = m42542c(materialCalendarGridView.getChildAt(i2));
                        }
                        if (longValue2 > c2.longValue()) {
                            i4 = b.mo25460h();
                            if (b.mo25455g(i4)) {
                                i3 = getWidth();
                            } else {
                                i3 = materialCalendarGridView.getChildAt(i4).getRight();
                            }
                        } else {
                            materialCalendarGridView.f33543a.setTimeInMillis(longValue2);
                            i4 = b.mo25450a(materialCalendarGridView.f33543a.get(5));
                            i3 = m42542c(materialCalendarGridView.getChildAt(i4));
                        }
                        int itemId = (int) b.getItemId(i2);
                        int itemId2 = (int) b.getItemId(i4);
                        while (itemId <= itemId2) {
                            int numColumns = getNumColumns() * itemId;
                            int numColumns2 = (getNumColumns() + numColumns) - 1;
                            View childAt = materialCalendarGridView.getChildAt(numColumns);
                            canvas.drawRect((float) (numColumns > i2 ? 0 : i), (float) (childAt.getTop() + cVar.f33563a.mo25391c()), (float) (i4 > numColumns2 ? getWidth() : i3), (float) (childAt.getBottom() - cVar.f33563a.mo25390b()), cVar.f33570h);
                            itemId++;
                            materialCalendarGridView = this;
                        }
                    } else {
                        return;
                    }
                }
            }
            materialCalendarGridView = this;
        }
    }

    /* access modifiers changed from: protected */
    public void onFocusChanged(boolean z, int i, Rect rect) {
        if (z) {
            m42541a(i, rect);
        } else {
            super.onFocusChanged(false, i, rect);
        }
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (!super.onKeyDown(i, keyEvent)) {
            return false;
        }
        if (getSelectedItemPosition() == -1 || getSelectedItemPosition() >= getAdapter().mo25451b()) {
            return true;
        }
        if (19 != i) {
            return false;
        }
        setSelection(getAdapter().mo25451b());
        return true;
    }

    public void setSelection(int i) {
        if (i < getAdapter().mo25451b()) {
            super.setSelection(getAdapter().mo25451b());
        } else {
            super.setSelection(i);
        }
    }

    public MaterialCalendarGridView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f33543a = C7667r.m42694k();
        if (C7649i.m42627j2(getContext())) {
            setNextFocusLeftId(C10130f.cancel_button);
            setNextFocusRightId(C10130f.confirm_button);
        }
        C0835a0.m3741n0(this, new C7624a());
    }

    public final void setAdapter(ListAdapter listAdapter) {
        if (listAdapter instanceof C7659m) {
            super.setAdapter(listAdapter);
        } else {
            throw new IllegalArgumentException(String.format("%1$s must have its Adapter set to a %2$s", new Object[]{MaterialCalendarGridView.class.getCanonicalName(), C7659m.class.getCanonicalName()}));
        }
    }
}
