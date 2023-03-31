package p236g6;

import android.animation.TimeInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import p028d0.C3986a;
import p028d0.C3987b;
import p028d0.C3988c;

/* renamed from: g6.a */
/* compiled from: AnimationUtils */
public class C10208a {

    /* renamed from: a */
    public static final TimeInterpolator f40650a = new LinearInterpolator();

    /* renamed from: b */
    public static final TimeInterpolator f40651b = new C3987b();

    /* renamed from: c */
    public static final TimeInterpolator f40652c = new C3986a();

    /* renamed from: d */
    public static final TimeInterpolator f40653d = new C3988c();

    /* renamed from: e */
    public static final TimeInterpolator f40654e = new DecelerateInterpolator();

    /* renamed from: a */
    public static float m51712a(float f, float f2, float f3) {
        return f + (f3 * (f2 - f));
    }
}
