package androidx.core.view;

import android.graphics.Rect;
import android.os.Build;
import android.view.DisplayCutout;
import androidx.core.util.C0825c;
import java.util.List;

/* renamed from: androidx.core.view.d */
/* compiled from: DisplayCutoutCompat */
public final class C0897d {

    /* renamed from: a */
    private final DisplayCutout f2551a;

    /* renamed from: androidx.core.view.d$a */
    /* compiled from: DisplayCutoutCompat */
    static class C0898a {
        /* renamed from: a */
        static DisplayCutout m4073a(Rect rect, List<Rect> list) {
            return new DisplayCutout(rect, list);
        }

        /* renamed from: b */
        static List<Rect> m4074b(DisplayCutout displayCutout) {
            return displayCutout.getBoundingRects();
        }

        /* renamed from: c */
        static int m4075c(DisplayCutout displayCutout) {
            return displayCutout.getSafeInsetBottom();
        }

        /* renamed from: d */
        static int m4076d(DisplayCutout displayCutout) {
            return displayCutout.getSafeInsetLeft();
        }

        /* renamed from: e */
        static int m4077e(DisplayCutout displayCutout) {
            return displayCutout.getSafeInsetRight();
        }

        /* renamed from: f */
        static int m4078f(DisplayCutout displayCutout) {
            return displayCutout.getSafeInsetTop();
        }
    }

    private C0897d(DisplayCutout displayCutout) {
        this.f2551a = displayCutout;
    }

    /* renamed from: e */
    static C0897d m4068e(DisplayCutout displayCutout) {
        if (displayCutout == null) {
            return null;
        }
        return new C0897d(displayCutout);
    }

    /* renamed from: a */
    public int mo3377a() {
        if (Build.VERSION.SDK_INT >= 28) {
            return C0898a.m4075c(this.f2551a);
        }
        return 0;
    }

    /* renamed from: b */
    public int mo3378b() {
        if (Build.VERSION.SDK_INT >= 28) {
            return C0898a.m4076d(this.f2551a);
        }
        return 0;
    }

    /* renamed from: c */
    public int mo3379c() {
        if (Build.VERSION.SDK_INT >= 28) {
            return C0898a.m4077e(this.f2551a);
        }
        return 0;
    }

    /* renamed from: d */
    public int mo3380d() {
        if (Build.VERSION.SDK_INT >= 28) {
            return C0898a.m4078f(this.f2551a);
        }
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0897d.class != obj.getClass()) {
            return false;
        }
        return C0825c.m3642a(this.f2551a, ((C0897d) obj).f2551a);
    }

    public int hashCode() {
        DisplayCutout displayCutout = this.f2551a;
        if (displayCutout == null) {
            return 0;
        }
        return displayCutout.hashCode();
    }

    public String toString() {
        return "DisplayCutoutCompat{" + this.f2551a + "}";
    }
}
