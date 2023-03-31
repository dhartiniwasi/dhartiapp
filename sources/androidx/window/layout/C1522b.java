package androidx.window.layout;

import android.content.Context;
import androidx.window.layout.WindowInfoTracker;

/* renamed from: androidx.window.layout.b */
/* compiled from: WindowInfoTracker.kt */
public final /* synthetic */ class C1522b {
    static {
        WindowInfoTracker.Companion companion = WindowInfoTracker.Companion;
    }

    /* renamed from: a */
    public static WindowInfoTracker m7072a(Context context) {
        return WindowInfoTracker.Companion.getOrCreate(context);
    }

    /* renamed from: b */
    public static void m7073b(WindowInfoTrackerDecorator windowInfoTrackerDecorator) {
        WindowInfoTracker.Companion.overrideDecorator(windowInfoTrackerDecorator);
    }

    /* renamed from: c */
    public static void m7074c() {
        WindowInfoTracker.Companion.reset();
    }
}
