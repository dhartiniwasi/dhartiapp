package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: androidx.recyclerview.widget.f */
/* compiled from: LayoutState */
class C1405f {

    /* renamed from: a */
    boolean f4014a = true;

    /* renamed from: b */
    int f4015b;

    /* renamed from: c */
    int f4016c;

    /* renamed from: d */
    int f4017d;

    /* renamed from: e */
    int f4018e;

    /* renamed from: f */
    int f4019f = 0;

    /* renamed from: g */
    int f4020g = 0;

    /* renamed from: h */
    boolean f4021h;

    /* renamed from: i */
    boolean f4022i;

    C1405f() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo5470a(RecyclerView.C1330a0 a0Var) {
        int i = this.f4016c;
        return i >= 0 && i < a0Var.mo4982b();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public View mo5471b(RecyclerView.C1362v vVar) {
        View o = vVar.mo5261o(this.f4016c);
        this.f4016c += this.f4017d;
        return o;
    }

    public String toString() {
        return "LayoutState{mAvailable=" + this.f4015b + ", mCurrentPosition=" + this.f4016c + ", mItemDirection=" + this.f4017d + ", mLayoutDirection=" + this.f4018e + ", mStartLine=" + this.f4019f + ", mEndLine=" + this.f4020g + '}';
    }
}
