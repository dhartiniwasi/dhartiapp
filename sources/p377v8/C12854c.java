package p377v8;

import android.os.Build;
import android.os.Trace;

/* renamed from: v8.c */
/* compiled from: FirebaseTrace */
public final class C12854c {
    /* renamed from: a */
    public static void m60798a() {
        if (Build.VERSION.SDK_INT >= 18) {
            Trace.endSection();
        }
    }

    /* renamed from: b */
    public static void m60799b(String str) {
        if (Build.VERSION.SDK_INT >= 18) {
            Trace.beginSection(str);
        }
    }
}
