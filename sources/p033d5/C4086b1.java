package p033d5;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import p081k5.C4888c;

/* renamed from: d5.b1 */
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public final class C4086b1 {

    /* renamed from: a */
    private static final Object f23233a = new Object();

    /* renamed from: b */
    private static boolean f23234b;

    /* renamed from: c */
    private static String f23235c;

    /* renamed from: d */
    private static int f23236d;

    /* renamed from: a */
    public static int m28029a(Context context) {
        m28030b(context);
        return f23236d;
    }

    /* renamed from: b */
    private static void m28030b(Context context) {
        synchronized (f23233a) {
            if (!f23234b) {
                f23234b = true;
                try {
                    Bundle bundle = C4888c.m31075a(context).mo18670c(context.getPackageName(), 128).metaData;
                    if (bundle != null) {
                        f23235c = bundle.getString("com.google.app.id");
                        f23236d = bundle.getInt("com.google.android.gms.version");
                    }
                } catch (PackageManager.NameNotFoundException e) {
                    Log.wtf("MetadataValueReader", "This should never happen.", e);
                }
            }
        }
    }
}
