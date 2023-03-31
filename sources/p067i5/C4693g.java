package p067i5;

import android.content.Context;
import android.util.Log;
import p033d5.C4141r;

/* renamed from: i5.g */
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public final class C4693g {

    /* renamed from: a */
    private static final String[] f25251a = {"android.", "com.android.", "dalvik.", "java.", "javax."};

    /* renamed from: a */
    public static boolean m30387a(Context context, Throwable th) {
        try {
            C4141r.m28221k(context);
            C4141r.m28221k(th);
            return false;
        } catch (Exception e) {
            Log.e("CrashUtils", "Error adding exception to DropBox!", e);
            return false;
        }
    }
}
