package androidx.core.p010os;

import android.content.Context;
import android.os.Build;
import android.os.UserManager;

/* renamed from: androidx.core.os.n */
/* compiled from: UserManagerCompat */
public class C0779n {

    /* renamed from: androidx.core.os.n$a */
    /* compiled from: UserManagerCompat */
    static class C0780a {
        /* renamed from: a */
        static boolean m3540a(Context context) {
            return ((UserManager) context.getSystemService(UserManager.class)).isUserUnlocked();
        }
    }

    /* renamed from: a */
    public static boolean m3539a(Context context) {
        if (Build.VERSION.SDK_INT >= 24) {
            return C0780a.m3540a(context);
        }
        return true;
    }
}
