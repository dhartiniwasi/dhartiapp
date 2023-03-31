package com.startapp;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.pm.ComponentInfo;
import android.content.pm.PackageInfo;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import com.startapp.sdk.adsbase.remoteconfig.RcdMetadata;
import com.startapp.sdk.adsbase.remoteconfig.RcdTargets;
import com.unity3d.services.core.request.metrics.MetricCommonTags;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;

/* renamed from: com.startapp.c9 */
/* compiled from: Sta */
public class C8886c9 {

    /* renamed from: k */
    public static final String[] f36620k = {"getSupportFragmentManager", "getFragmentManager"};

    /* renamed from: a */
    public final Context f36621a;

    /* renamed from: b */
    public final Executor f36622b;

    /* renamed from: c */
    public final Executor f36623c;

    /* renamed from: d */
    public final C8908d3<RcdMetadata> f36624d;

    /* renamed from: e */
    public final Application.ActivityLifecycleCallbacks f36625e;

    /* renamed from: f */
    public final Map<String, Integer> f36626f = new HashMap();

    /* renamed from: g */
    public final Map<String, List<WeakReference<Activity>>> f36627g = new HashMap();

    /* renamed from: h */
    public Boolean f36628h;

    /* renamed from: i */
    public String f36629i;

    /* renamed from: j */
    public final Runnable f36630j = new C8887a();

    /* renamed from: com.startapp.c9$a */
    /* compiled from: Sta */
    public class C8887a implements Runnable {
        public C8887a() {
        }

        public void run() {
            try {
                C8886c9.this.mo29275d();
            } catch (Throwable th) {
                C9023i4.m48681a(th);
            }
        }
    }

    /* renamed from: com.startapp.c9$b */
    /* compiled from: Sta */
    public class C8888b extends C9109l2 {
        public C8888b() {
        }

        public void onActivityPostResumed(Activity activity) {
            try {
                C8886c9.this.mo29265a(activity);
            } catch (Throwable th) {
                C9023i4.m48681a(th);
            }
        }
    }

    /* renamed from: com.startapp.c9$c */
    /* compiled from: Sta */
    public class C8889c implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ Activity f36633a;

        public C8889c(Activity activity) {
            this.f36633a = activity;
        }

        public void run() {
            try {
                C8886c9.this.mo29272b(this.f36633a);
            } catch (Throwable th) {
                C9023i4.m48681a(th);
            }
        }
    }

    /* renamed from: com.startapp.c9$d */
    /* compiled from: Sta */
    public class C8890d implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ Activity f36635a;

        /* renamed from: b */
        public final /* synthetic */ View f36636b;

        public C8890d(Activity activity, View view) {
            this.f36635a = activity;
            this.f36636b = view;
        }

        public void run() {
            try {
                C8886c9 c9Var = C8886c9.this;
                Activity activity = this.f36635a;
                View view = this.f36636b;
                RcdTargets a = c9Var.mo29263a();
                if (a != null) {
                    if (c9Var.mo29271a(a, activity)) {
                        return;
                    }
                    try {
                        c9Var.mo29266a(a, view);
                    } catch (Throwable th) {
                        C9023i4.m48681a(th);
                    }
                    c9Var.f36623c.execute(c9Var.f36630j);
                }
            } catch (Throwable th2) {
                C9023i4.m48681a(th2);
            }
        }
    }

    /* renamed from: com.startapp.c9$e */
    /* compiled from: Sta */
    public class C8891e implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ StackTraceElement[] f36638a;

        /* renamed from: b */
        public final /* synthetic */ int f36639b;

        public C8891e(StackTraceElement[] stackTraceElementArr, int i) {
            this.f36638a = stackTraceElementArr;
            this.f36639b = i;
        }

        public void run() {
            try {
                C8886c9 c9Var = C8886c9.this;
                StackTraceElement[] stackTraceElementArr = this.f36638a;
                int i = this.f36639b;
                RcdTargets a = c9Var.mo29263a();
                if (a != null) {
                    for (StackTraceElement className : stackTraceElementArr) {
                        c9Var.mo29268a(a, className.getClassName(), i);
                    }
                    c9Var.f36623c.execute(c9Var.f36630j);
                }
            } catch (Throwable th) {
                C9023i4.m48681a(th);
            }
        }
    }

    public C8886c9(Context context, Executor executor, C8908d3<RcdMetadata> d3Var) {
        this.f36621a = context;
        this.f36622b = executor;
        this.f36623c = new C9262r9(executor);
        this.f36624d = d3Var;
        if (Build.VERSION.SDK_INT >= 14) {
            this.f36625e = new C8888b();
        } else {
            this.f36625e = null;
        }
    }

    /* renamed from: a */
    public final RcdTargets mo29263a() {
        RcdMetadata call = this.f36624d.call();
        if (call == null || !call.mo31089c()) {
            call = null;
        }
        if (call != null) {
            return call.mo31088b();
        }
        return null;
    }

    /* renamed from: b */
    public final boolean mo29273b() {
        Boolean bool = this.f36628h;
        if (bool == null) {
            RcdMetadata call = this.f36624d.call();
            if (call == null || !call.mo31089c()) {
                call = null;
            }
            bool = Boolean.valueOf(call == null || Math.random() >= call.mo31087a());
            this.f36628h = bool;
        }
        return bool.booleanValue();
    }

    /* renamed from: c */
    public void mo29274c() {
        RcdTargets a = mo29263a();
        if (a != null) {
            for (String next : a.mo31093a(1)) {
                try {
                    Class.forName(next, false, C8886c9.class.getClassLoader());
                    mo29270a(next, 1);
                } catch (ClassNotFoundException unused) {
                } catch (Throwable th) {
                    C9023i4.m48681a(th);
                }
            }
            try {
                String packageName = this.f36621a.getPackageName();
                PackageInfo packageInfo = this.f36621a.getPackageManager().getPackageInfo(packageName, 15);
                if (packageInfo != null) {
                    mo29269a(a, packageName, (T[]) packageInfo.activities);
                    mo29269a(a, packageName, (T[]) packageInfo.receivers);
                    mo29269a(a, packageName, (T[]) packageInfo.services);
                    mo29269a(a, packageName, (T[]) packageInfo.providers);
                }
            } catch (Throwable th2) {
                C9023i4.m48681a(th2);
            }
            this.f36623c.execute(this.f36630j);
        }
    }

    /* renamed from: d */
    public void mo29275d() {
        HashMap hashMap;
        RcdTargets a = mo29263a();
        if (a != null) {
            synchronized (this.f36626f) {
                hashMap = new HashMap(this.f36626f);
            }
            String a2 = a.mo31092a((Map<String, Integer>) hashMap);
            if (!a2.equals(this.f36629i)) {
                this.f36629i = a2;
                C9023i4 i4Var = new C9023i4(C9043j4.f36993d);
                i4Var.f36952d = "RCD.results";
                i4Var.f36953e = a2;
                i4Var.mo29471a();
            }
        }
    }

    /* renamed from: a */
    public void mo29265a(Activity activity) {
        Window window;
        View decorView;
        if (!mo29273b()) {
            String name = activity.getClass().getName();
            Map<Activity, Integer> map = C9605vb.f39316a;
            if (!name.startsWith("com.startapp.")) {
                List list = this.f36627g.get(name);
                if (list == null) {
                    list = new ArrayList(2);
                    this.f36627g.put(name, list);
                    this.f36622b.execute(new C8889c(activity));
                }
                boolean z = false;
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    WeakReference weakReference = (WeakReference) it.next();
                    if (weakReference.get() == null) {
                        it.remove();
                    } else if (weakReference.get() == activity) {
                        z = true;
                    }
                }
                if (!z && (window = activity.getWindow()) != null && (decorView = window.getDecorView()) != null) {
                    list.add(new WeakReference(activity));
                    this.f36622b.execute(new C8890d(activity, decorView));
                }
            }
        }
    }

    /* renamed from: b */
    public void mo29272b(Activity activity) {
        RcdTargets a = mo29263a();
        if (a != null) {
            try {
                if (mo29271a(a, activity)) {
                    return;
                }
            } catch (Throwable th) {
                C9023i4.m48681a(th);
            }
            try {
                mo29267a(a, activity, 16, 32);
            } catch (Throwable th2) {
                C9023i4.m48681a(th2);
            }
            for (String method : f36620k) {
                try {
                    Object invoke = activity.getClass().getMethod(method, new Class[0]).invoke(activity, new Object[0]);
                    if (invoke != null) {
                        Object invoke2 = invoke.getClass().getMethod("getFragments", new Class[0]).invoke(invoke, new Object[0]);
                        if (invoke2 instanceof Collection) {
                            for (Object next : (Collection) invoke2) {
                                if (next != null) {
                                    mo29267a(a, next, 64, 128);
                                }
                            }
                        }
                    }
                } catch (NoSuchMethodException unused) {
                } catch (Throwable th3) {
                    C9023i4.m48681a(th3);
                }
            }
            this.f36623c.execute(this.f36630j);
        }
    }

    /* renamed from: a */
    public final <T extends ComponentInfo> void mo29269a(RcdTargets rcdTargets, String str, T[] tArr) {
        if (tArr != null) {
            for (T t : tArr) {
                if (t != null) {
                    String str2 = t.name;
                    if (str2.startsWith(".")) {
                        mo29268a(rcdTargets, str + str2, 2);
                    } else {
                        mo29268a(rcdTargets, str2, 2);
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public void mo29264a(int i) {
        try {
            if (!mo29273b()) {
                this.f36622b.execute(new C8891e(Thread.currentThread().getStackTrace(), i));
            }
        } catch (Throwable th) {
            C9023i4.m48681a(th);
        }
    }

    /* renamed from: a */
    public final void mo29266a(RcdTargets rcdTargets, View view) {
        if (view != null) {
            mo29268a(rcdTargets, view.getClass().getName(), 4);
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    mo29266a(rcdTargets, viewGroup.getChildAt(i));
                }
            }
        }
    }

    /* renamed from: a */
    public final boolean mo29271a(RcdTargets rcdTargets, Activity activity) {
        Collection<String> a = rcdTargets.mo31093a(8);
        String name = activity.getClass().getName();
        if (!a.contains(name)) {
            return false;
        }
        mo29270a(name, 8);
        return true;
    }

    /* renamed from: a */
    public final void mo29267a(RcdTargets rcdTargets, Object obj, int i, int i2) {
        Class cls = obj.getClass();
        while (cls != null && !m48448a(cls.getName())) {
            for (Field field : cls.getDeclaredFields()) {
                if (i != 0) {
                    mo29268a(rcdTargets, field.getType().getName(), i);
                }
                try {
                    field.setAccessible(true);
                    if (!(field.get(obj) == null || i2 == 0)) {
                        mo29268a(rcdTargets, field.getType().getName(), i2);
                    }
                } catch (Throwable unused) {
                }
            }
            cls = cls.getSuperclass();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0065 A[SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo29268a(com.startapp.sdk.adsbase.remoteconfig.RcdTargets r5, java.lang.String r6, int r7) {
        /*
            r4 = this;
            boolean r0 = m48448a((java.lang.String) r6)
            if (r0 == 0) goto L_0x0007
            return
        L_0x0007:
            java.util.Map<android.app.Activity, java.lang.Integer> r0 = com.startapp.C9605vb.f39316a
            java.lang.String r0 = "com.startapp."
            boolean r0 = r6.startsWith(r0)
            if (r0 == 0) goto L_0x0012
            return
        L_0x0012:
            java.util.Collection r5 = r5.mo31093a((int) r7)
            java.util.Iterator r5 = r5.iterator()
        L_0x001a:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x0065
            java.lang.Object r0 = r5.next()
            java.lang.String r0 = (java.lang.String) r0
            int r1 = r0.length()
            r2 = 1
            if (r1 <= 0) goto L_0x0062
            boolean r1 = r6.startsWith(r0)
            if (r1 == 0) goto L_0x0062
            int r1 = r0.length()
            int r1 = r1 - r2
            char r1 = r0.charAt(r1)
            r3 = 46
            if (r1 != r3) goto L_0x0044
            r4.mo29270a((java.lang.String) r0, (int) r7)
            goto L_0x0062
        L_0x0044:
            int r1 = r6.length()
            int r3 = r0.length()
            if (r1 <= r3) goto L_0x005e
            int r1 = r0.length()
            char r1 = r6.charAt(r1)
            r2 = 36
            if (r1 != r2) goto L_0x0062
            r4.mo29270a((java.lang.String) r0, (int) r7)
            goto L_0x0062
        L_0x005e:
            r4.mo29270a((java.lang.String) r0, (int) r7)
            goto L_0x0063
        L_0x0062:
            r2 = 0
        L_0x0063:
            if (r2 == 0) goto L_0x001a
        L_0x0065:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.startapp.C8886c9.mo29268a(com.startapp.sdk.adsbase.remoteconfig.RcdTargets, java.lang.String, int):void");
    }

    /* renamed from: a */
    public final void mo29270a(String str, int i) {
        synchronized (this.f36626f) {
            Integer num = this.f36626f.get(str);
            if (num == null) {
                num = 0;
            }
            this.f36626f.put(str, Integer.valueOf(i | num.intValue()));
        }
    }

    /* renamed from: a */
    public static boolean m48448a(String str) {
        return str.startsWith(MetricCommonTags.METRIC_COMMON_TAG_PLATFORM_ANDROID) || str.startsWith("java.");
    }
}
