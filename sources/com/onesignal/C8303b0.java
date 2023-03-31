package com.onesignal;

import android.content.Context;
import android.content.pm.PackageManager;
import android.location.Location;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import com.onesignal.C8338d3;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.onesignal.b0 */
/* compiled from: LocationController */
class C8303b0 {

    /* renamed from: a */
    private static final List<C8308e> f35330a = new ArrayList();

    /* renamed from: b */
    private static ConcurrentHashMap<C8309f, C8305b> f35331b = new ConcurrentHashMap<>();

    /* renamed from: c */
    private static boolean f35332c;

    /* renamed from: d */
    static final Object f35333d = new C8304a();

    /* renamed from: e */
    private static C8306c f35334e;

    /* renamed from: f */
    static Thread f35335f;

    /* renamed from: g */
    static Context f35336g;

    /* renamed from: h */
    static Location f35337h;

    /* renamed from: i */
    static String f35338i;

    /* renamed from: com.onesignal.b0$a */
    /* compiled from: LocationController */
    class C8304a {
        C8304a() {
        }
    }

    /* renamed from: com.onesignal.b0$b */
    /* compiled from: LocationController */
    interface C8305b {
        /* renamed from: a */
        void mo27610a(C8307d dVar);

        C8309f getType();
    }

    /* renamed from: com.onesignal.b0$c */
    /* compiled from: LocationController */
    protected static class C8306c extends HandlerThread {

        /* renamed from: a */
        Handler f35339a = new Handler(getLooper());

        C8306c() {
            super("OSH_LocationHandlerThread");
            start();
        }
    }

    /* renamed from: com.onesignal.b0$d */
    /* compiled from: LocationController */
    static class C8307d {

        /* renamed from: a */
        Double f35340a;

        /* renamed from: b */
        Double f35341b;

        /* renamed from: c */
        Float f35342c;

        /* renamed from: d */
        Integer f35343d;

        /* renamed from: e */
        Boolean f35344e;

        /* renamed from: f */
        Long f35345f;

        C8307d() {
        }

        public String toString() {
            return "LocationPoint{lat=" + this.f35340a + ", log=" + this.f35341b + ", accuracy=" + this.f35342c + ", type=" + this.f35343d + ", bg=" + this.f35344e + ", timeStamp=" + this.f35345f + '}';
        }
    }

    /* renamed from: com.onesignal.b0$e */
    /* compiled from: LocationController */
    static abstract class C8308e implements C8305b {
        C8308e() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo27613b(C8338d3.C8359g1 g1Var) {
        }
    }

    /* renamed from: com.onesignal.b0$f */
    /* compiled from: LocationController */
    enum C8309f {
        STARTUP,
        PROMPT_LOCATION,
        SYNC_SERVICE
    }

    C8303b0() {
    }

    /* renamed from: a */
    private static void m46283a(C8305b bVar) {
        if (bVar instanceof C8308e) {
            List<C8308e> list = f35330a;
            synchronized (list) {
                list.add((C8308e) bVar);
            }
        }
    }

    /* renamed from: b */
    private static void m46284b(Context context, boolean z, boolean z2) {
        try {
            if (Arrays.asList(context.getPackageManager().getPackageInfo(context.getPackageName(), 4096).requestedPermissions).contains("android.permission.ACCESS_BACKGROUND_LOCATION")) {
                f35338i = "android.permission.ACCESS_BACKGROUND_LOCATION";
            }
            if (f35338i == null || !z) {
                m46296n(z, C8338d3.C8359g1.PERMISSION_GRANTED);
                m46298p();
                return;
            }
            C8321c0.f35365a.mo27639d(z2, f35338i);
        } catch (PackageManager.NameNotFoundException e) {
            m46296n(z, C8338d3.C8359g1.ERROR);
            e.printStackTrace();
        }
    }

    /* renamed from: c */
    private static void m46285c(C8307d dVar) {
        Thread thread;
        Class<C8303b0> cls = C8303b0.class;
        HashMap hashMap = new HashMap();
        synchronized (cls) {
            hashMap.putAll(f35331b);
            f35331b.clear();
            thread = f35335f;
        }
        for (C8309f fVar : hashMap.keySet()) {
            ((C8305b) hashMap.get(fVar)).mo27610a(dVar);
        }
        if (thread != null && !Thread.currentThread().equals(thread)) {
            thread.interrupt();
        }
        if (thread == f35335f) {
            synchronized (cls) {
                if (thread == f35335f) {
                    f35335f = null;
                }
            }
        }
        m46297o(C8338d3.m46448M0().mo28281b());
    }

    /* renamed from: d */
    protected static void m46286d(Location location) {
        C8338d3.C8384r0 r0Var = C8338d3.C8384r0.DEBUG;
        C8338d3.m46492a(r0Var, "LocationController fireCompleteForLocation with location: " + location);
        C8307d dVar = new C8307d();
        dVar.f35342c = Float.valueOf(location.getAccuracy());
        dVar.f35344e = Boolean.valueOf(C8338d3.m46518g1() ^ true);
        dVar.f35343d = Integer.valueOf(f35332c ^ true ? 1 : 0);
        dVar.f35345f = Long.valueOf(location.getTime());
        if (f35332c) {
            dVar.f35340a = Double.valueOf(new BigDecimal(location.getLatitude()).setScale(7, RoundingMode.HALF_UP).doubleValue());
            dVar.f35341b = Double.valueOf(new BigDecimal(location.getLongitude()).setScale(7, RoundingMode.HALF_UP).doubleValue());
        } else {
            dVar.f35340a = Double.valueOf(location.getLatitude());
            dVar.f35341b = Double.valueOf(location.getLongitude());
        }
        m46285c(dVar);
        m46295m(f35336g);
    }

    /* renamed from: e */
    static void m46287e() {
        synchronized (f35333d) {
            if (m46292j()) {
                C8566q.m47424e();
            } else if (m46293k()) {
                C8636w.m47800e();
            }
        }
        m46285c((C8307d) null);
    }

    /* renamed from: f */
    private static long m46288f() {
        return C8500m3.m47105d(C8500m3.f35731a, "OS_LAST_LOCATION_TIME", -600000);
    }

    /* renamed from: g */
    static void m46289g(Context context, boolean z, boolean z2, C8305b bVar) {
        int i;
        m46283a(bVar);
        f35336g = context;
        f35331b.put(bVar.getType(), bVar);
        if (!C8338d3.m46526i1()) {
            m46296n(z, C8338d3.C8359g1.ERROR);
            m46287e();
            return;
        }
        int a = C8410f.m46658a(context, "android.permission.ACCESS_FINE_LOCATION");
        int i2 = -1;
        if (a == -1) {
            i = C8410f.m46658a(context, "android.permission.ACCESS_COARSE_LOCATION");
            f35332c = true;
        } else {
            i = -1;
        }
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 29) {
            i2 = C8410f.m46658a(context, "android.permission.ACCESS_BACKGROUND_LOCATION");
        }
        if (i3 < 23) {
            if (a == 0 || i == 0) {
                m46296n(z, C8338d3.C8359g1.PERMISSION_GRANTED);
                m46298p();
                return;
            }
            m46296n(z, C8338d3.C8359g1.LOCATION_PERMISSIONS_MISSING_MANIFEST);
            bVar.mo27610a((C8307d) null);
        } else if (a != 0) {
            try {
                List asList = Arrays.asList(context.getPackageManager().getPackageInfo(context.getPackageName(), 4096).requestedPermissions);
                C8338d3.C8359g1 g1Var = C8338d3.C8359g1.PERMISSION_DENIED;
                if (asList.contains("android.permission.ACCESS_FINE_LOCATION")) {
                    f35338i = "android.permission.ACCESS_FINE_LOCATION";
                } else if (!asList.contains("android.permission.ACCESS_COARSE_LOCATION")) {
                    C8338d3.m46594z1(C8338d3.C8384r0.INFO, "Location permissions not added on AndroidManifest file");
                    g1Var = C8338d3.C8359g1.LOCATION_PERMISSIONS_MISSING_MANIFEST;
                } else if (i != 0) {
                    f35338i = "android.permission.ACCESS_COARSE_LOCATION";
                } else if (i3 >= 29 && asList.contains("android.permission.ACCESS_BACKGROUND_LOCATION")) {
                    f35338i = "android.permission.ACCESS_BACKGROUND_LOCATION";
                }
                if (f35338i != null && z) {
                    C8321c0.f35365a.mo27639d(z2, f35338i);
                } else if (i == 0) {
                    m46296n(z, C8338d3.C8359g1.PERMISSION_GRANTED);
                    m46298p();
                } else {
                    m46296n(z, g1Var);
                    m46287e();
                }
            } catch (PackageManager.NameNotFoundException e) {
                m46296n(z, C8338d3.C8359g1.ERROR);
                e.printStackTrace();
            }
        } else if (i3 < 29 || i2 == 0) {
            m46296n(z, C8338d3.C8359g1.PERMISSION_GRANTED);
            m46298p();
        } else {
            m46284b(context, z, z2);
        }
    }

    /* renamed from: h */
    static C8306c m46290h() {
        if (f35334e == null) {
            synchronized (f35333d) {
                if (f35334e == null) {
                    f35334e = new C8306c();
                }
            }
        }
        return f35334e;
    }

    /* renamed from: i */
    private static boolean m46291i(Context context) {
        return C8410f.m46658a(context, "android.permission.ACCESS_FINE_LOCATION") == 0 || C8410f.m46658a(context, "android.permission.ACCESS_COARSE_LOCATION") == 0;
    }

    /* renamed from: j */
    static boolean m46292j() {
        return OSUtils.m46169B() && OSUtils.m46208s();
    }

    /* renamed from: k */
    static boolean m46293k() {
        return OSUtils.m46174G() && OSUtils.m46211v();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0018, code lost:
        return;
     */
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static void m46294l() {
        /*
            java.lang.Object r0 = f35333d
            monitor-enter(r0)
            boolean r1 = m46292j()     // Catch:{ all -> 0x0019 }
            if (r1 == 0) goto L_0x000e
            com.onesignal.C8566q.m47425l()     // Catch:{ all -> 0x0019 }
            monitor-exit(r0)     // Catch:{ all -> 0x0019 }
            return
        L_0x000e:
            boolean r1 = m46293k()     // Catch:{ all -> 0x0019 }
            if (r1 == 0) goto L_0x0017
            com.onesignal.C8636w.m47801l()     // Catch:{ all -> 0x0019 }
        L_0x0017:
            monitor-exit(r0)     // Catch:{ all -> 0x0019 }
            return
        L_0x0019:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0019 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onesignal.C8303b0.m46294l():void");
    }

    /* renamed from: m */
    static boolean m46295m(Context context) {
        if (!m46291i(context)) {
            C8338d3.m46594z1(C8338d3.C8384r0.DEBUG, "LocationController scheduleUpdate not possible, location permission not enabled");
            return false;
        } else if (!C8338d3.m46526i1()) {
            C8338d3.m46594z1(C8338d3.C8384r0.DEBUG, "LocationController scheduleUpdate not possible, location shared not enabled");
            return false;
        } else {
            long b = C8338d3.m46448M0().mo28281b() - m46288f();
            long j = (C8338d3.m46518g1() ? 300 : 600) * 1000;
            C8338d3.C8384r0 r0Var = C8338d3.C8384r0.DEBUG;
            C8338d3.m46594z1(r0Var, "LocationController scheduleUpdate lastTime: " + b + " minTime: " + j);
            C8587r2.m47596q().mo28187r(context, j - b);
            return true;
        }
    }

    /* renamed from: n */
    static void m46296n(boolean z, C8338d3.C8359g1 g1Var) {
        if (!z) {
            C8338d3.m46594z1(C8338d3.C8384r0.DEBUG, "LocationController sendAndClearPromptHandlers from non prompt flow");
            return;
        }
        List<C8308e> list = f35330a;
        synchronized (list) {
            C8338d3.m46594z1(C8338d3.C8384r0.DEBUG, "LocationController calling prompt handlers");
            for (C8308e b : list) {
                b.mo27613b(g1Var);
            }
            f35330a.clear();
        }
    }

    /* renamed from: o */
    private static void m46297o(long j) {
        C8500m3.m47113l(C8500m3.f35731a, "OS_LAST_LOCATION_TIME", j);
    }

    /* renamed from: p */
    static void m46298p() {
        C8338d3.C8384r0 r0Var = C8338d3.C8384r0.DEBUG;
        C8338d3.m46492a(r0Var, "LocationController startGetLocation with lastLocation: " + f35337h);
        try {
            if (m46292j()) {
                C8566q.m47426p();
            } else if (m46293k()) {
                C8636w.m47802p();
            } else {
                C8338d3.m46492a(C8338d3.C8384r0.WARN, "LocationController startGetLocation not possible, no location dependency found");
                m46287e();
            }
        } catch (Throwable th) {
            C8338d3.m46496b(C8338d3.C8384r0.WARN, "Location permission exists but there was an error initializing: ", th);
            m46287e();
        }
    }
}
