package p283l6;

import android.content.Context;
import android.graphics.Color;
import android.util.TypedValue;
import android.view.View;
import androidx.core.graphics.C0723b;
import p346s6.C12455b;

/* renamed from: l6.a */
/* compiled from: MaterialColors */
public class C11758a {
    /* renamed from: a */
    public static int m57060a(Context context, int i, int i2) {
        TypedValue a = C12455b.m59416a(context, i);
        return a != null ? a.data : i2;
    }

    /* renamed from: b */
    public static int m57061b(Context context, int i, String str) {
        return C12455b.m59418c(context, i, str);
    }

    /* renamed from: c */
    public static int m57062c(View view, int i) {
        return C12455b.m59419d(view, i);
    }

    /* renamed from: d */
    public static int m57063d(View view, int i, int i2) {
        return m57060a(view.getContext(), i, i2);
    }

    /* renamed from: e */
    public static int m57064e(int i, int i2) {
        return C0723b.m3312c(i2, i);
    }

    /* renamed from: f */
    public static int m57065f(int i, int i2, float f) {
        return m57064e(i, C0723b.m3315f(i2, Math.round(((float) Color.alpha(i2)) * f)));
    }
}
