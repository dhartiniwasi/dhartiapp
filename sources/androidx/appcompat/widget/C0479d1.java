package androidx.appcompat.widget;

import android.os.Build;
import android.view.View;

/* renamed from: androidx.appcompat.widget.d1 */
/* compiled from: TooltipCompat */
public class C0479d1 {

    /* renamed from: androidx.appcompat.widget.d1$a */
    /* compiled from: TooltipCompat */
    static class C0480a {
        /* renamed from: a */
        static void m2359a(View view, CharSequence charSequence) {
            view.setTooltipText(charSequence);
        }
    }

    /* renamed from: a */
    public static void m2358a(View view, CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 26) {
            C0480a.m2359a(view, charSequence);
        } else {
            C0495g1.m2424h(view, charSequence);
        }
    }
}
