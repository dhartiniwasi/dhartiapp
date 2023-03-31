package p325pc;

import android.content.Context;
import android.os.Build;
import java.io.File;

/* renamed from: pc.b */
/* compiled from: PathUtils */
public final class C12166b {
    /* renamed from: a */
    public static String m58437a(Context context) {
        File file;
        if (Build.VERSION.SDK_INT >= 21) {
            file = context.getCodeCacheDir();
            if (file == null) {
                file = context.getCacheDir();
            }
        } else {
            file = context.getCacheDir();
        }
        if (file == null) {
            file = new File(m58438b(context), "cache");
        }
        return file.getPath();
    }

    /* renamed from: b */
    private static String m58438b(Context context) {
        if (Build.VERSION.SDK_INT >= 24) {
            return context.getDataDir().getPath();
        }
        return context.getApplicationInfo().dataDir;
    }

    /* renamed from: c */
    public static String m58439c(Context context) {
        File dir = context.getDir("flutter", 0);
        if (dir == null) {
            dir = new File(m58438b(context), "app_flutter");
        }
        return dir.getPath();
    }

    /* renamed from: d */
    public static String m58440d(Context context) {
        File filesDir = context.getFilesDir();
        if (filesDir == null) {
            filesDir = new File(m58438b(context), "files");
        }
        return filesDir.getPath();
    }
}
