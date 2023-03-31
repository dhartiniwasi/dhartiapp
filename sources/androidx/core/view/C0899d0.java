package androidx.core.view;

import android.os.Build;
import android.view.ViewGroup;
import p138t.C5493d;

/* renamed from: androidx.core.view.d0 */
/* compiled from: ViewGroupCompat */
public final class C0899d0 {

    /* renamed from: androidx.core.view.d0$a */
    /* compiled from: ViewGroupCompat */
    static class C0900a {
        /* renamed from: a */
        static int m4080a(ViewGroup viewGroup) {
            return viewGroup.getNestedScrollAxes();
        }

        /* renamed from: b */
        static boolean m4081b(ViewGroup viewGroup) {
            return viewGroup.isTransitionGroup();
        }

        /* renamed from: c */
        static void m4082c(ViewGroup viewGroup, boolean z) {
            viewGroup.setTransitionGroup(z);
        }
    }

    /* renamed from: a */
    public static boolean m4079a(ViewGroup viewGroup) {
        if (Build.VERSION.SDK_INT >= 21) {
            return C0900a.m4081b(viewGroup);
        }
        Boolean bool = (Boolean) viewGroup.getTag(C5493d.f27879Y);
        return ((bool == null || !bool.booleanValue()) && viewGroup.getBackground() == null && C0835a0.m3697J(viewGroup) == null) ? false : true;
    }
}
