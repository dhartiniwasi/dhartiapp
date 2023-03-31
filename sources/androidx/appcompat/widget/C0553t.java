package androidx.appcompat.widget;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.widget.PopupWindow;
import androidx.core.widget.C0983i;
import p048g.C4297j;

/* renamed from: androidx.appcompat.widget.t */
/* compiled from: AppCompatPopupWindow */
class C0553t extends PopupWindow {

    /* renamed from: b */
    private static final boolean f1807b = (Build.VERSION.SDK_INT < 21);

    /* renamed from: a */
    private boolean f1808a;

    public C0553t(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        m2673a(context, attributeSet, i, i2);
    }

    /* renamed from: a */
    private void m2673a(Context context, AttributeSet attributeSet, int i, int i2) {
        C0452a1 v = C0452a1.m2210v(context, attributeSet, C4297j.f24039Y1, i, i2);
        int i3 = C4297j.f24048a2;
        if (v.mo2060s(i3)) {
            m2674b(v.mo2042a(i3, false));
        }
        setBackgroundDrawable(v.mo2048g(C4297j.f24043Z1));
        v.mo2061w();
    }

    /* renamed from: b */
    private void m2674b(boolean z) {
        if (f1807b) {
            this.f1808a = z;
        } else {
            C0983i.m4444a(this, z);
        }
    }

    public void showAsDropDown(View view, int i, int i2) {
        if (f1807b && this.f1808a) {
            i2 -= view.getHeight();
        }
        super.showAsDropDown(view, i, i2);
    }

    public void update(View view, int i, int i2, int i3, int i4) {
        if (f1807b && this.f1808a) {
            i2 -= view.getHeight();
        }
        super.update(view, i, i2, i3, i4);
    }

    public void showAsDropDown(View view, int i, int i2, int i3) {
        if (f1807b && this.f1808a) {
            i2 -= view.getHeight();
        }
        super.showAsDropDown(view, i, i2, i3);
    }
}
