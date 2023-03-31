package p176z0;

import android.content.Context;
import android.os.Build;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import p170y0.C6094j;

/* renamed from: z0.h */
/* compiled from: WorkDatabasePathHelper */
public class C6190h {

    /* renamed from: a */
    private static final String f29702a = C6094j.m35719f("WrkDbPathHelper");

    /* renamed from: b */
    private static final String[] f29703b = {"-journal", "-shm", "-wal"};

    /* renamed from: a */
    public static File m36015a(Context context) {
        if (Build.VERSION.SDK_INT < 23) {
            return m36016b(context);
        }
        return m36017c(context, "androidx.work.workdb");
    }

    /* renamed from: b */
    public static File m36016b(Context context) {
        return context.getDatabasePath("androidx.work.workdb");
    }

    /* renamed from: c */
    private static File m36017c(Context context, String str) {
        return new File(context.getNoBackupFilesDir(), str);
    }

    /* renamed from: d */
    public static String m36018d() {
        return "androidx.work.workdb";
    }

    /* renamed from: e */
    public static void m36019e(Context context) {
        String str;
        File b = m36016b(context);
        if (Build.VERSION.SDK_INT >= 23 && b.exists()) {
            C6094j.m35717c().mo20921a(f29702a, "Migrating WorkDatabase to the no-backup directory", new Throwable[0]);
            Map<File, File> f = m36020f(context);
            for (File next : f.keySet()) {
                File file = f.get(next);
                if (next.exists() && file != null) {
                    if (file.exists()) {
                        C6094j.m35717c().mo20925h(f29702a, String.format("Over-writing contents of %s", new Object[]{file}), new Throwable[0]);
                    }
                    if (next.renameTo(file)) {
                        str = String.format("Migrated %s to %s", new Object[]{next, file});
                    } else {
                        str = String.format("Renaming %s to %s failed", new Object[]{next, file});
                    }
                    C6094j.m35717c().mo20921a(f29702a, str, new Throwable[0]);
                }
            }
        }
    }

    /* renamed from: f */
    public static Map<File, File> m36020f(Context context) {
        HashMap hashMap = new HashMap();
        if (Build.VERSION.SDK_INT >= 23) {
            File b = m36016b(context);
            File a = m36015a(context);
            hashMap.put(b, a);
            for (String str : f29703b) {
                hashMap.put(new File(b.getPath() + str), new File(a.getPath() + str));
            }
        }
        return hashMap;
    }
}
