package com.google.android.material.datepicker;

import android.content.Context;
import android.util.DisplayMetrics;
import androidx.recyclerview.widget.C1406g;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: com.google.android.material.datepicker.q */
/* compiled from: SmoothCalendarLayoutManager */
class C7665q extends LinearLayoutManager {

    /* renamed from: com.google.android.material.datepicker.q$a */
    /* compiled from: SmoothCalendarLayoutManager */
    class C7666a extends C1406g {
        C7666a(Context context) {
            super(context);
        }

        /* access modifiers changed from: protected */
        /* renamed from: v */
        public float mo5478v(DisplayMetrics displayMetrics) {
            return 100.0f / ((float) displayMetrics.densityDpi);
        }
    }

    C7665q(Context context, int i, boolean z) {
        super(context, i, z);
    }

    /* renamed from: I1 */
    public void mo4741I1(RecyclerView recyclerView, RecyclerView.C1330a0 a0Var, int i) {
        C7666a aVar = new C7666a(recyclerView.getContext());
        aVar.mo5294p(i);
        mo5134J1(aVar);
    }
}
