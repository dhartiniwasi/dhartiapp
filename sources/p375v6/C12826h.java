package p375v6;

import android.graphics.drawable.Drawable;
import android.view.View;
import com.google.android.material.internal.C7710h;

/* renamed from: v6.h */
/* compiled from: MaterialShapeUtils */
public class C12826h {
    /* renamed from: a */
    static C12819d m60621a(int i) {
        if (i == 0) {
            return new C12828j();
        }
        if (i != 1) {
            return m60622b();
        }
        return new C12820e();
    }

    /* renamed from: b */
    static C12819d m60622b() {
        return new C12828j();
    }

    /* renamed from: c */
    static C12821f m60623c() {
        return new C12821f();
    }

    /* renamed from: d */
    public static void m60624d(View view, float f) {
        Drawable background = view.getBackground();
        if (background instanceof C12822g) {
            ((C12822g) background).mo37744S(f);
        }
    }

    /* renamed from: e */
    public static void m60625e(View view) {
        Drawable background = view.getBackground();
        if (background instanceof C12822g) {
            m60626f(view, (C12822g) background);
        }
    }

    /* renamed from: f */
    public static void m60626f(View view, C12822g gVar) {
        if (gVar.mo37742N()) {
            gVar.mo37748W(C7710h.m42965b(view));
        }
    }
}
