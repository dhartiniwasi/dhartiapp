package p057h1;

import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import android.text.TextUtils;
import androidx.work.C1532a;
import java.lang.reflect.Method;
import java.util.List;
import p170y0.C6094j;

/* renamed from: h1.f */
/* compiled from: ProcessUtils */
public class C4421f {

    /* renamed from: a */
    private static final String f24593a = C6094j.m35719f("ProcessUtils");

    private C4421f() {
    }

    /* renamed from: a */
    public static String m29375a(Context context) {
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        Object obj;
        int i = Build.VERSION.SDK_INT;
        if (i >= 28) {
            return Application.getProcessName();
        }
        try {
            Class<?> cls = Class.forName("android.app.ActivityThread", false, C4421f.class.getClassLoader());
            if (i >= 18) {
                Method declaredMethod = cls.getDeclaredMethod("currentProcessName", new Class[0]);
                declaredMethod.setAccessible(true);
                obj = declaredMethod.invoke((Object) null, new Object[0]);
            } else {
                Method declaredMethod2 = cls.getDeclaredMethod("currentActivityThread", new Class[0]);
                declaredMethod2.setAccessible(true);
                Method declaredMethod3 = cls.getDeclaredMethod("getProcessName", new Class[0]);
                declaredMethod3.setAccessible(true);
                obj = declaredMethod3.invoke(declaredMethod2.invoke((Object) null, new Object[0]), new Object[0]);
            }
            if (obj instanceof String) {
                return (String) obj;
            }
        } catch (Throwable th) {
            C6094j.m35717c().mo20921a(f24593a, "Unable to check ActivityThread for processName", th);
        }
        int myPid = Process.myPid();
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        if (!(activityManager == null || (runningAppProcesses = activityManager.getRunningAppProcesses()) == null || runningAppProcesses.isEmpty())) {
            for (ActivityManager.RunningAppProcessInfo next : runningAppProcesses) {
                if (next.pid == myPid) {
                    return next.processName;
                }
            }
        }
        return null;
    }

    /* renamed from: b */
    public static boolean m29376b(Context context, C1532a aVar) {
        String a = m29375a(context);
        if (!TextUtils.isEmpty(aVar.mo6285c())) {
            return TextUtils.equals(a, aVar.mo6285c());
        }
        return TextUtils.equals(a, context.getApplicationInfo().processName);
    }
}
