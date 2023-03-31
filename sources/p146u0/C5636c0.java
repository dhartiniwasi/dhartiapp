package p146u0;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.os.Build;
import android.util.Property;
import android.view.View;
import androidx.core.view.C0835a0;

/* renamed from: u0.c0 */
/* compiled from: ViewUtils */
class C5636c0 {

    /* renamed from: a */
    private static final C5656i0 f28306a;

    /* renamed from: b */
    static final Property<View, Float> f28307b = new C5637a(Float.class, "translationAlpha");

    /* renamed from: c */
    static final Property<View, Rect> f28308c = new C5638b(Rect.class, "clipBounds");

    /* renamed from: u0.c0$a */
    /* compiled from: ViewUtils */
    static class C5637a extends Property<View, Float> {
        C5637a(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public Float get(View view) {
            return Float.valueOf(C5636c0.m33741c(view));
        }

        /* renamed from: b */
        public void set(View view, Float f) {
            C5636c0.m33745g(view, f.floatValue());
        }
    }

    /* renamed from: u0.c0$b */
    /* compiled from: ViewUtils */
    static class C5638b extends Property<View, Rect> {
        C5638b(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public Rect get(View view) {
            return C0835a0.m3752t(view);
        }

        /* renamed from: b */
        public void set(View view, Rect rect) {
            C0835a0.m3755u0(view, rect);
        }
    }

    static {
        int i = Build.VERSION.SDK_INT;
        if (i >= 29) {
            f28306a = new C5654h0();
        } else if (i >= 23) {
            f28306a = new C5652g0();
        } else if (i >= 22) {
            f28306a = new C5650f0();
        } else if (i >= 21) {
            f28306a = new C5648e0();
        } else if (i >= 19) {
            f28306a = new C5642d0();
        } else {
            f28306a = new C5656i0();
        }
    }

    /* renamed from: a */
    static void m33739a(View view) {
        f28306a.mo19971a(view);
    }

    /* renamed from: b */
    static C5623b0 m33740b(View view) {
        if (Build.VERSION.SDK_INT >= 18) {
            return new C5621a0(view);
        }
        return C5691z.m33959e(view);
    }

    /* renamed from: c */
    static float m33741c(View view) {
        return f28306a.mo19972c(view);
    }

    /* renamed from: d */
    static C5673m0 m33742d(View view) {
        if (Build.VERSION.SDK_INT >= 18) {
            return new C5665l0(view);
        }
        return new C5663k0(view.getWindowToken());
    }

    /* renamed from: e */
    static void m33743e(View view) {
        f28306a.mo19973d(view);
    }

    /* renamed from: f */
    static void m33744f(View view, int i, int i2, int i3, int i4) {
        f28306a.mo19978e(view, i, i2, i3, i4);
    }

    /* renamed from: g */
    static void m33745g(View view, float f) {
        f28306a.mo19974f(view, f);
    }

    /* renamed from: h */
    static void m33746h(View view, int i) {
        f28306a.mo19980g(view, i);
    }

    /* renamed from: i */
    static void m33747i(View view, Matrix matrix) {
        f28306a.mo19976h(view, matrix);
    }

    /* renamed from: j */
    static void m33748j(View view, Matrix matrix) {
        f28306a.mo19977i(view, matrix);
    }
}
