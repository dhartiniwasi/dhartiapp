package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: androidx.recyclerview.widget.l */
/* compiled from: ScrollbarHelper */
class C1415l {
    /* renamed from: a */
    static int m6650a(RecyclerView.C1330a0 a0Var, C1410j jVar, View view, View view2, RecyclerView.C1350o oVar, boolean z) {
        if (oVar.mo5133J() == 0 || a0Var.mo4982b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z) {
            return Math.abs(oVar.mo5173h0(view) - oVar.mo5173h0(view2)) + 1;
        }
        return Math.min(jVar.mo5498n(), jVar.mo5488d(view2) - jVar.mo5491g(view));
    }

    /* renamed from: b */
    static int m6651b(RecyclerView.C1330a0 a0Var, C1410j jVar, View view, View view2, RecyclerView.C1350o oVar, boolean z, boolean z2) {
        int i;
        if (oVar.mo5133J() == 0 || a0Var.mo4982b() == 0 || view == null || view2 == null) {
            return 0;
        }
        int min = Math.min(oVar.mo5173h0(view), oVar.mo5173h0(view2));
        int max = Math.max(oVar.mo5173h0(view), oVar.mo5173h0(view2));
        if (z2) {
            i = Math.max(0, (a0Var.mo4982b() - max) - 1);
        } else {
            i = Math.max(0, min);
        }
        if (!z) {
            return i;
        }
        return Math.round((((float) i) * (((float) Math.abs(jVar.mo5488d(view2) - jVar.mo5491g(view))) / ((float) (Math.abs(oVar.mo5173h0(view) - oVar.mo5173h0(view2)) + 1)))) + ((float) (jVar.mo5497m() - jVar.mo5491g(view))));
    }

    /* renamed from: c */
    static int m6652c(RecyclerView.C1330a0 a0Var, C1410j jVar, View view, View view2, RecyclerView.C1350o oVar, boolean z) {
        if (oVar.mo5133J() == 0 || a0Var.mo4982b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z) {
            return a0Var.mo4982b();
        }
        return (int) ((((float) (jVar.mo5488d(view2) - jVar.mo5491g(view))) / ((float) (Math.abs(oVar.mo5173h0(view) - oVar.mo5173h0(view2)) + 1))) * ((float) a0Var.mo4982b()));
    }
}
