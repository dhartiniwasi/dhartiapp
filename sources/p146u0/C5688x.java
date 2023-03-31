package p146u0;

import android.os.Build;
import android.view.ViewGroup;

/* renamed from: u0.x */
/* compiled from: ViewGroupUtils */
class C5688x {

    /* renamed from: a */
    private static boolean f28435a = true;

    /* renamed from: a */
    static C5687w m33954a(ViewGroup viewGroup) {
        if (Build.VERSION.SDK_INT >= 18) {
            return new C5686v(viewGroup);
        }
        return C5685u.m33945g(viewGroup);
    }

    /* renamed from: b */
    private static void m33955b(ViewGroup viewGroup, boolean z) {
        if (f28435a) {
            try {
                viewGroup.suppressLayout(z);
            } catch (NoSuchMethodError unused) {
                f28435a = false;
            }
        }
    }

    /* renamed from: c */
    static void m33956c(ViewGroup viewGroup, boolean z) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 29) {
            viewGroup.suppressLayout(z);
        } else if (i >= 18) {
            m33955b(viewGroup, z);
        } else {
            C5689y.m33958b(viewGroup, z);
        }
    }
}
