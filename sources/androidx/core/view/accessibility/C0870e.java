package androidx.core.view.accessibility;

import android.os.Build;
import android.view.View;
import android.view.accessibility.AccessibilityRecord;

/* renamed from: androidx.core.view.accessibility.e */
/* compiled from: AccessibilityRecordCompat */
public class C0870e {

    /* renamed from: androidx.core.view.accessibility.e$a */
    /* compiled from: AccessibilityRecordCompat */
    static class C0871a {
        /* renamed from: a */
        static int m4010a(AccessibilityRecord accessibilityRecord) {
            return accessibilityRecord.getMaxScrollX();
        }

        /* renamed from: b */
        static int m4011b(AccessibilityRecord accessibilityRecord) {
            return accessibilityRecord.getMaxScrollY();
        }

        /* renamed from: c */
        static void m4012c(AccessibilityRecord accessibilityRecord, int i) {
            accessibilityRecord.setMaxScrollX(i);
        }

        /* renamed from: d */
        static void m4013d(AccessibilityRecord accessibilityRecord, int i) {
            accessibilityRecord.setMaxScrollY(i);
        }
    }

    /* renamed from: androidx.core.view.accessibility.e$b */
    /* compiled from: AccessibilityRecordCompat */
    static class C0872b {
        /* renamed from: a */
        static void m4014a(AccessibilityRecord accessibilityRecord, View view, int i) {
            accessibilityRecord.setSource(view, i);
        }
    }

    /* renamed from: a */
    public static void m4007a(AccessibilityRecord accessibilityRecord, int i) {
        if (Build.VERSION.SDK_INT >= 15) {
            C0871a.m4012c(accessibilityRecord, i);
        }
    }

    /* renamed from: b */
    public static void m4008b(AccessibilityRecord accessibilityRecord, int i) {
        if (Build.VERSION.SDK_INT >= 15) {
            C0871a.m4013d(accessibilityRecord, i);
        }
    }

    /* renamed from: c */
    public static void m4009c(AccessibilityRecord accessibilityRecord, View view, int i) {
        if (Build.VERSION.SDK_INT >= 16) {
            C0872b.m4014a(accessibilityRecord, view, i);
        }
    }
}
