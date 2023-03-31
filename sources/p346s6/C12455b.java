package p346s6;

import android.content.Context;
import android.util.TypedValue;
import android.view.View;

/* renamed from: s6.b */
/* compiled from: MaterialAttributes */
public class C12455b {
    /* renamed from: a */
    public static TypedValue m59416a(Context context, int i) {
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(i, typedValue, true)) {
            return typedValue;
        }
        return null;
    }

    /* renamed from: b */
    public static boolean m59417b(Context context, int i, boolean z) {
        TypedValue a = m59416a(context, i);
        if (a == null || a.type != 18) {
            return z;
        }
        return a.data != 0;
    }

    /* renamed from: c */
    public static int m59418c(Context context, int i, String str) {
        TypedValue a = m59416a(context, i);
        if (a != null) {
            return a.data;
        }
        throw new IllegalArgumentException(String.format("%1$s requires a value for the %2$s attribute to be set in your app theme. You can either set the attribute in your theme or update your theme to inherit from Theme.MaterialComponents (or a descendant).", new Object[]{str, context.getResources().getResourceName(i)}));
    }

    /* renamed from: d */
    public static int m59419d(View view, int i) {
        return m59418c(view.getContext(), i, view.getClass().getCanonicalName());
    }
}
