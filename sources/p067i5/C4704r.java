package p067i5;

import android.content.Context;
import android.content.pm.PackageManager;
import android.util.Log;
import p081k5.C4888c;
import p180z4.C6380k;

/* renamed from: i5.r */
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public final class C4704r {
    /* renamed from: a */
    public static boolean m30427a(Context context, int i) {
        if (!m30428b(context, i, "com.google.android.gms")) {
            return false;
        }
        try {
            return C6380k.m37466a(context).mo21808b(context.getPackageManager().getPackageInfo("com.google.android.gms", 64));
        } catch (PackageManager.NameNotFoundException unused) {
            if (Log.isLoggable("UidVerifier", 3)) {
                Log.d("UidVerifier", "Package manager can't find google play services package, defaulting to false");
            }
            return false;
        }
    }

    /* renamed from: b */
    public static boolean m30428b(Context context, int i, String str) {
        return C4888c.m31075a(context).mo18675h(i, str);
    }
}
