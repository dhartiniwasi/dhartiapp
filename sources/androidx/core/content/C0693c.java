package androidx.core.content;

import android.content.Context;
import android.os.Process;
import androidx.core.app.C0629e;
import androidx.core.util.C0825c;

/* renamed from: androidx.core.content.c */
/* compiled from: PermissionChecker */
public final class C0693c {
    /* renamed from: a */
    public static int m3182a(Context context, String str, int i, int i2, String str2) {
        int i3;
        if (context.checkPermission(str, i, i2) == -1) {
            return -1;
        }
        String c = C0629e.m2952c(str);
        if (c == null) {
            return 0;
        }
        if (str2 == null) {
            String[] packagesForUid = context.getPackageManager().getPackagesForUid(i2);
            if (packagesForUid == null || packagesForUid.length <= 0) {
                return -1;
            }
            str2 = packagesForUid[0];
        }
        if (Process.myUid() == i2 && C0825c.m3642a(context.getPackageName(), str2)) {
            i3 = C0629e.m2950a(context, i2, c, str2);
        } else {
            i3 = C0629e.m2951b(context, c, str2);
        }
        if (i3 == 0) {
            return 0;
        }
        return -2;
    }

    /* renamed from: b */
    public static int m3183b(Context context, String str) {
        return m3182a(context, str, Process.myPid(), Process.myUid(), context.getPackageName());
    }
}
