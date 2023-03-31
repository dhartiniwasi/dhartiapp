package androidx.core.app;

import android.app.Activity;
import android.app.Application;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.util.Log;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;

/* renamed from: androidx.core.app.d */
/* compiled from: ActivityRecreator */
final class C0624d {

    /* renamed from: a */
    protected static final Class<?> f2022a;

    /* renamed from: b */
    protected static final Field f2023b = m2942b();

    /* renamed from: c */
    protected static final Field f2024c = m2946f();

    /* renamed from: d */
    protected static final Method f2025d;

    /* renamed from: e */
    protected static final Method f2026e;

    /* renamed from: f */
    protected static final Method f2027f;

    /* renamed from: g */
    private static final Handler f2028g = new Handler(Looper.getMainLooper());

    /* renamed from: androidx.core.app.d$a */
    /* compiled from: ActivityRecreator */
    class C0625a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C0628d f2029a;

        /* renamed from: b */
        final /* synthetic */ Object f2030b;

        C0625a(C0628d dVar, Object obj) {
            this.f2029a = dVar;
            this.f2030b = obj;
        }

        public void run() {
            this.f2029a.f2035a = this.f2030b;
        }
    }

    /* renamed from: androidx.core.app.d$b */
    /* compiled from: ActivityRecreator */
    class C0626b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ Application f2031a;

        /* renamed from: b */
        final /* synthetic */ C0628d f2032b;

        C0626b(Application application, C0628d dVar) {
            this.f2031a = application;
            this.f2032b = dVar;
        }

        public void run() {
            this.f2031a.unregisterActivityLifecycleCallbacks(this.f2032b);
        }
    }

    /* renamed from: androidx.core.app.d$c */
    /* compiled from: ActivityRecreator */
    class C0627c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ Object f2033a;

        /* renamed from: b */
        final /* synthetic */ Object f2034b;

        C0627c(Object obj, Object obj2) {
            this.f2033a = obj;
            this.f2034b = obj2;
        }

        public void run() {
            try {
                Method method = C0624d.f2025d;
                if (method != null) {
                    method.invoke(this.f2033a, new Object[]{this.f2034b, Boolean.FALSE, "AppCompat recreation"});
                    return;
                }
                C0624d.f2026e.invoke(this.f2033a, new Object[]{this.f2034b, Boolean.FALSE});
            } catch (RuntimeException e) {
                if (e.getClass() == RuntimeException.class && e.getMessage() != null && e.getMessage().startsWith("Unable to stop")) {
                    throw e;
                }
            } catch (Throwable th) {
                Log.e("ActivityRecreator", "Exception while invoking performStopActivity", th);
            }
        }
    }

    /* renamed from: androidx.core.app.d$d */
    /* compiled from: ActivityRecreator */
    private static final class C0628d implements Application.ActivityLifecycleCallbacks {

        /* renamed from: a */
        Object f2035a;

        /* renamed from: b */
        private Activity f2036b;

        /* renamed from: c */
        private final int f2037c;

        /* renamed from: d */
        private boolean f2038d = false;

        /* renamed from: e */
        private boolean f2039e = false;

        /* renamed from: f */
        private boolean f2040f = false;

        C0628d(Activity activity) {
            this.f2036b = activity;
            this.f2037c = activity.hashCode();
        }

        public void onActivityCreated(Activity activity, Bundle bundle) {
        }

        public void onActivityDestroyed(Activity activity) {
            if (this.f2036b == activity) {
                this.f2036b = null;
                this.f2039e = true;
            }
        }

        public void onActivityPaused(Activity activity) {
            if (this.f2039e && !this.f2040f && !this.f2038d && C0624d.m2948h(this.f2035a, this.f2037c, activity)) {
                this.f2040f = true;
                this.f2035a = null;
            }
        }

        public void onActivityResumed(Activity activity) {
        }

        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        public void onActivityStarted(Activity activity) {
            if (this.f2036b == activity) {
                this.f2038d = true;
            }
        }

        public void onActivityStopped(Activity activity) {
        }
    }

    static {
        Class<?> a = m2941a();
        f2022a = a;
        f2025d = m2944d(a);
        f2026e = m2943c(a);
        f2027f = m2945e(a);
    }

    /* renamed from: a */
    private static Class<?> m2941a() {
        try {
            return Class.forName("android.app.ActivityThread");
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: b */
    private static Field m2942b() {
        try {
            Field declaredField = Activity.class.getDeclaredField("mMainThread");
            declaredField.setAccessible(true);
            return declaredField;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: c */
    private static Method m2943c(Class<?> cls) {
        if (cls == null) {
            return null;
        }
        try {
            Method declaredMethod = cls.getDeclaredMethod("performStopActivity", new Class[]{IBinder.class, Boolean.TYPE});
            declaredMethod.setAccessible(true);
            return declaredMethod;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: d */
    private static Method m2944d(Class<?> cls) {
        if (cls == null) {
            return null;
        }
        try {
            Method declaredMethod = cls.getDeclaredMethod("performStopActivity", new Class[]{IBinder.class, Boolean.TYPE, String.class});
            declaredMethod.setAccessible(true);
            return declaredMethod;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: e */
    private static Method m2945e(Class<?> cls) {
        if (m2947g() && cls != null) {
            try {
                Class cls2 = Boolean.TYPE;
                Method declaredMethod = cls.getDeclaredMethod("requestRelaunchActivity", new Class[]{IBinder.class, List.class, List.class, Integer.TYPE, cls2, Configuration.class, Configuration.class, cls2, cls2});
                declaredMethod.setAccessible(true);
                return declaredMethod;
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    /* renamed from: f */
    private static Field m2946f() {
        try {
            Field declaredField = Activity.class.getDeclaredField("mToken");
            declaredField.setAccessible(true);
            return declaredField;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: g */
    private static boolean m2947g() {
        int i = Build.VERSION.SDK_INT;
        return i == 26 || i == 27;
    }

    /* renamed from: h */
    protected static boolean m2948h(Object obj, int i, Activity activity) {
        try {
            Object obj2 = f2024c.get(activity);
            if (obj2 == obj) {
                if (activity.hashCode() == i) {
                    f2028g.postAtFrontOfQueue(new C0627c(f2023b.get(activity), obj2));
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            Log.e("ActivityRecreator", "Exception while fetching field values", th);
            return false;
        }
    }

    /* renamed from: i */
    static boolean m2949i(Activity activity) {
        Object obj;
        Application application;
        C0628d dVar;
        if (Build.VERSION.SDK_INT >= 28) {
            activity.recreate();
            return true;
        } else if (m2947g() && f2027f == null) {
            return false;
        } else {
            if (f2026e == null && f2025d == null) {
                return false;
            }
            try {
                Object obj2 = f2024c.get(activity);
                if (obj2 == null || (obj = f2023b.get(activity)) == null) {
                    return false;
                }
                application = activity.getApplication();
                dVar = new C0628d(activity);
                application.registerActivityLifecycleCallbacks(dVar);
                Handler handler = f2028g;
                handler.post(new C0625a(dVar, obj2));
                if (m2947g()) {
                    Method method = f2027f;
                    Boolean bool = Boolean.FALSE;
                    method.invoke(obj, new Object[]{obj2, null, null, 0, bool, null, null, bool, bool});
                } else {
                    activity.recreate();
                }
                handler.post(new C0626b(application, dVar));
                return true;
            } catch (Throwable unused) {
                return false;
            }
        }
    }
}
