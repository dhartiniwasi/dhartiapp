package androidx.core.view.accessibility;

import android.os.Build;
import android.view.accessibility.AccessibilityEvent;

/* renamed from: androidx.core.view.accessibility.b */
/* compiled from: AccessibilityEventCompat */
public final class C0860b {

    /* renamed from: androidx.core.view.accessibility.b$a */
    /* compiled from: AccessibilityEventCompat */
    static class C0861a {
        /* renamed from: a */
        static int m3919a(AccessibilityEvent accessibilityEvent) {
            return accessibilityEvent.getContentChangeTypes();
        }

        /* renamed from: b */
        static void m3920b(AccessibilityEvent accessibilityEvent, int i) {
            accessibilityEvent.setContentChangeTypes(i);
        }
    }

    /* renamed from: a */
    public static int m3917a(AccessibilityEvent accessibilityEvent) {
        if (Build.VERSION.SDK_INT >= 19) {
            return C0861a.m3919a(accessibilityEvent);
        }
        return 0;
    }

    /* renamed from: b */
    public static void m3918b(AccessibilityEvent accessibilityEvent, int i) {
        if (Build.VERSION.SDK_INT >= 19) {
            C0861a.m3920b(accessibilityEvent, i);
        }
    }
}
