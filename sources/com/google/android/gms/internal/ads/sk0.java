package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import java.lang.reflect.Method;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import p060h4.C4541l4;
import p060h4.C4584t;
import p060h4.C4596v;
import p060h4.C4618y3;
import p073j4.C4794n1;
import p180z4.C6378j;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class sk0 {

    /* renamed from: a */
    private final AtomicReference f17502a = new AtomicReference((Object) null);

    /* renamed from: b */
    private final Object f17503b = new Object();

    /* renamed from: c */
    private String f17504c = null;

    /* renamed from: d */
    private String f17505d = null;

    /* renamed from: e */
    final AtomicBoolean f17506e = new AtomicBoolean(false);

    /* renamed from: f */
    private final AtomicInteger f17507f = new AtomicInteger(-1);

    /* renamed from: g */
    private final AtomicReference f17508g = new AtomicReference((Object) null);

    /* renamed from: h */
    private final AtomicReference f17509h = new AtomicReference((Object) null);

    /* renamed from: i */
    private final ConcurrentMap f17510i = new ConcurrentHashMap(9);

    /* renamed from: j */
    private final AtomicReference f17511j = new AtomicReference((Object) null);

    /* renamed from: k */
    private final BlockingQueue f17512k = new ArrayBlockingQueue(20);

    /* renamed from: l */
    private final Object f17513l = new Object();

    /* renamed from: A */
    static final boolean m20409A(Context context) {
        if (!((Boolean) C4596v.m30088c().mo12227b(C2679nz.f14548f0)).booleanValue()) {
            return false;
        }
        if (DynamiteModule.m9484a(context, ModuleDescriptor.MODULE_ID) < ((Integer) C4596v.m30088c().mo12227b(C2679nz.f14558g0)).intValue()) {
            return false;
        }
        if (((Boolean) C4596v.m30088c().mo12227b(C2679nz.f14568h0)).booleanValue()) {
            try {
                context.getClassLoader().loadClass("com.google.firebase.analytics.FirebaseAnalytics");
                return false;
            } catch (ClassNotFoundException unused) {
            }
        }
        return true;
    }

    /* renamed from: B */
    private final Object m20410B(String str, Object obj, qk0 qk0) {
        synchronized (this.f17511j) {
            if (((ou0) this.f17511j.get()) != null) {
                try {
                    Object a = qk0.mo9614a((ou0) this.f17511j.get());
                    return a;
                } catch (Exception unused) {
                    m20416c(str, false);
                    return obj;
                }
            }
        }
    }

    /* renamed from: C */
    private final Object m20411C(String str, Context context) {
        if (!m20418e(context, "com.google.android.gms.measurement.AppMeasurement", this.f17508g, true)) {
            return null;
        }
        try {
            return m20412D(context, str).invoke(this.f17508g.get(), new Object[0]);
        } catch (Exception unused) {
            m20416c(str, true);
            return null;
        }
    }

    /* renamed from: D */
    private final Method m20412D(Context context, String str) {
        Method method = (Method) this.f17510i.get(str);
        if (method != null) {
            return method;
        }
        try {
            Method declaredMethod = context.getClassLoader().loadClass("com.google.android.gms.measurement.AppMeasurement").getDeclaredMethod(str, new Class[0]);
            this.f17510i.put(str, declaredMethod);
            return declaredMethod;
        } catch (Exception unused) {
            m20416c(str, false);
            return null;
        }
    }

    /* JADX WARNING: type inference failed for: r0v9, types: [java.util.concurrent.ExecutorService] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: E */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.util.concurrent.ExecutorService m20413E() {
        /*
            r9 = this;
            java.util.concurrent.atomic.AtomicReference r0 = r9.f17502a
            java.lang.Object r0 = r0.get()
            if (r0 != 0) goto L_0x0065
            boolean r0 = p067i5.C4690d.m30374a()
            if (r0 == 0) goto L_0x002d
            com.google.android.gms.internal.ads.x43 r0 = com.google.android.gms.internal.ads.a53.m9591a()
            com.google.android.gms.internal.ads.ez r1 = com.google.android.gms.internal.ads.C2679nz.f14538e0
            com.google.android.gms.internal.ads.lz r2 = p060h4.C4596v.m30088c()
            java.lang.Object r1 = r2.mo12227b(r1)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            com.google.android.gms.internal.ads.pk0 r2 = new com.google.android.gms.internal.ads.pk0
            r2.<init>(r9)
            r3 = 2
            java.util.concurrent.ExecutorService r0 = r0.mo15051a(r1, r2, r3)
            goto L_0x005f
        L_0x002d:
            java.util.concurrent.ThreadPoolExecutor r0 = new java.util.concurrent.ThreadPoolExecutor
            com.google.android.gms.internal.ads.ez r1 = com.google.android.gms.internal.ads.C2679nz.f14538e0
            com.google.android.gms.internal.ads.lz r2 = p060h4.C4596v.m30088c()
            java.lang.Object r2 = r2.mo12227b(r1)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            com.google.android.gms.internal.ads.lz r3 = p060h4.C4596v.m30088c()
            java.lang.Object r1 = r3.mo12227b(r1)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r3 = r1.intValue()
            java.util.concurrent.TimeUnit r6 = java.util.concurrent.TimeUnit.MINUTES
            java.util.concurrent.LinkedBlockingQueue r7 = new java.util.concurrent.LinkedBlockingQueue
            r7.<init>()
            com.google.android.gms.internal.ads.pk0 r8 = new com.google.android.gms.internal.ads.pk0
            r8.<init>(r9)
            r4 = 1
            r1 = r0
            r1.<init>(r2, r3, r4, r6, r7, r8)
        L_0x005f:
            java.util.concurrent.atomic.AtomicReference r1 = r9.f17502a
            r2 = 0
            com.google.android.gms.internal.ads.bk0.m10445a(r1, r2, r0)
        L_0x0065:
            java.util.concurrent.atomic.AtomicReference r0 = r9.f17502a
            java.lang.Object r0 = r0.get()
            java.util.concurrent.ExecutorService r0 = (java.util.concurrent.ExecutorService) r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.sk0.m20413E():java.util.concurrent.ExecutorService");
    }

    /* renamed from: a */
    private final void m20414a(Context context, String str, String str2) {
        if (m20418e(context, "com.google.android.gms.measurement.AppMeasurement", this.f17508g, true)) {
            Method method = (Method) this.f17510i.get(str2);
            if (method == null) {
                try {
                    method = context.getClassLoader().loadClass("com.google.android.gms.measurement.AppMeasurement").getDeclaredMethod(str2, new Class[]{String.class});
                    this.f17510i.put(str2, method);
                } catch (Exception unused) {
                    m20416c(str2, false);
                    method = null;
                }
            }
            try {
                method.invoke(this.f17508g.get(), new Object[]{str});
                C4794n1.m30693k("Invoke Firebase method " + str2 + ", Ad Unit Id: " + str);
            } catch (Exception unused2) {
                m20416c(str2, false);
            }
        }
    }

    /* renamed from: b */
    private final void m20415b(Context context, String str, String str2, Bundle bundle) {
        Class<String> cls = String.class;
        if (mo14043z(context)) {
            Bundle bundle2 = new Bundle();
            try {
                bundle2.putLong("_aeid", Long.parseLong(str2));
            } catch (NullPointerException | NumberFormatException e) {
                pm0.m18665e("Invalid event ID: ".concat(String.valueOf(str2)), e);
            }
            if ("_ac".equals(str)) {
                bundle2.putInt("_r", 1);
            }
            if (bundle != null) {
                bundle2.putAll(bundle);
            }
            if (m20409A(context)) {
                m20417d("logEventInternal", new ek0(str, bundle2));
            } else if (m20418e(context, "com.google.android.gms.measurement.AppMeasurement", this.f17508g, true)) {
                Method method = (Method) this.f17510i.get("logEventInternal");
                if (method == null) {
                    try {
                        method = context.getClassLoader().loadClass("com.google.android.gms.measurement.AppMeasurement").getDeclaredMethod("logEventInternal", new Class[]{cls, cls, Bundle.class});
                        this.f17510i.put("logEventInternal", method);
                    } catch (Exception unused) {
                        m20416c("logEventInternal", true);
                        method = null;
                    }
                }
                try {
                    method.invoke(this.f17508g.get(), new Object[]{"am", str, bundle2});
                } catch (Exception unused2) {
                    m20416c("logEventInternal", true);
                }
            }
        }
    }

    /* renamed from: c */
    private final void m20416c(String str, boolean z) {
        if (!this.f17506e.get()) {
            pm0.m18667g("Invoke Firebase method " + str + " error.");
            if (z) {
                pm0.m18667g("The Google Mobile Ads SDK will not integrate with Firebase. Admob/Firebase integration requires the latest Firebase SDK jar, but Firebase SDK is either missing or out of date");
                this.f17506e.set(true);
            }
        }
    }

    /* renamed from: d */
    private final void m20417d(String str, rk0 rk0) {
        synchronized (this.f17511j) {
            FutureTask futureTask = new FutureTask(new fk0(this, rk0, str), (Object) null);
            if (this.f17511j.get() != null) {
                futureTask.run();
            } else {
                this.f17512k.offer(futureTask);
            }
        }
    }

    /* renamed from: e */
    private final boolean m20418e(Context context, String str, AtomicReference atomicReference, boolean z) {
        if (atomicReference.get() == null) {
            try {
                bk0.m10445a(atomicReference, (Object) null, context.getClassLoader().loadClass(str).getDeclaredMethod("getInstance", new Class[]{Context.class}).invoke((Object) null, new Object[]{context}));
            } catch (Exception unused) {
                m20416c("getInstance", z);
                return false;
            }
        }
        return true;
    }

    /* renamed from: f */
    public final String mo14023f(Context context) {
        if (!mo14043z(context)) {
            return null;
        }
        if (m20409A(context)) {
            Long l = (Long) m20410B("getAdEventId", (Object) null, gk0.f9944a);
            if (l != null) {
                return Long.toString(l.longValue());
            }
            return null;
        }
        Object C = m20411C("generateEventId", context);
        if (C != null) {
            return C.toString();
        }
        return null;
    }

    /* renamed from: g */
    public final String mo14024g(Context context) {
        if (!mo14043z(context)) {
            return null;
        }
        synchronized (this.f17503b) {
            String str = this.f17505d;
            if (str != null) {
                return str;
            }
            if (m20409A(context)) {
                this.f17505d = (String) m20410B("getAppIdOrigin", this.f17505d, kk0.f12134a);
            } else {
                this.f17505d = "fa";
            }
            String str2 = this.f17505d;
            return str2;
        }
    }

    /* renamed from: h */
    public final String mo14025h(Context context) {
        if (!mo14043z(context)) {
            return null;
        }
        long longValue = ((Long) C4596v.m30088c().mo12227b(C2679nz.f14528d0)).longValue();
        if (m20409A(context)) {
            if (longValue >= 0) {
                return (String) m20413E().submit(new mk0(this)).get(longValue, TimeUnit.MILLISECONDS);
            }
            try {
                return (String) m20410B("getAppInstanceId", (Object) null, lk0.f12831a);
            } catch (TimeoutException unused) {
                return "TIME_OUT";
            } catch (Exception unused2) {
                return null;
            }
        } else if (longValue < 0) {
            return (String) m20411C("getAppInstanceId", context);
        } else {
            try {
                return (String) m20413E().submit(new nk0(this, context)).get(longValue, TimeUnit.MILLISECONDS);
            } catch (TimeoutException unused3) {
                return "TIME_OUT";
            } catch (Exception unused4) {
                return null;
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v8, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String mo14026i(android.content.Context r7) {
        /*
            r6 = this;
            java.lang.String r0 = "getCurrentScreenName"
            boolean r1 = r6.mo14043z(r7)
            java.lang.String r2 = ""
            if (r1 != 0) goto L_0x000b
            return r2
        L_0x000b:
            boolean r1 = m20409A(r7)
            if (r1 == 0) goto L_0x001c
            com.google.android.gms.internal.ads.hk0 r7 = com.google.android.gms.internal.ads.hk0.f10368a
            java.lang.String r0 = "getCurrentScreenNameOrScreenClass"
            java.lang.Object r7 = r6.m20410B(r0, r2, r7)
            java.lang.String r7 = (java.lang.String) r7
            return r7
        L_0x001c:
            java.util.concurrent.atomic.AtomicReference r1 = r6.f17508g
            r3 = 1
            java.lang.String r4 = "com.google.android.gms.measurement.AppMeasurement"
            boolean r1 = r6.m20418e(r7, r4, r1, r3)
            if (r1 != 0) goto L_0x0028
            return r2
        L_0x0028:
            r1 = 0
            java.lang.reflect.Method r3 = r6.m20412D(r7, r0)     // Catch:{ Exception -> 0x0056 }
            java.util.concurrent.atomic.AtomicReference r4 = r6.f17508g     // Catch:{ Exception -> 0x0056 }
            java.lang.Object r4 = r4.get()     // Catch:{ Exception -> 0x0056 }
            java.lang.Object[] r5 = new java.lang.Object[r1]     // Catch:{ Exception -> 0x0056 }
            java.lang.Object r3 = r3.invoke(r4, r5)     // Catch:{ Exception -> 0x0056 }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ Exception -> 0x0056 }
            if (r3 != 0) goto L_0x0052
            java.lang.String r3 = "getCurrentScreenClass"
            java.lang.reflect.Method r7 = r6.m20412D(r7, r3)     // Catch:{ Exception -> 0x0056 }
            java.util.concurrent.atomic.AtomicReference r3 = r6.f17508g     // Catch:{ Exception -> 0x0056 }
            java.lang.Object r3 = r3.get()     // Catch:{ Exception -> 0x0056 }
            java.lang.Object[] r4 = new java.lang.Object[r1]     // Catch:{ Exception -> 0x0056 }
            java.lang.Object r7 = r7.invoke(r3, r4)     // Catch:{ Exception -> 0x0056 }
            r3 = r7
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ Exception -> 0x0056 }
        L_0x0052:
            if (r3 == 0) goto L_0x0055
            return r3
        L_0x0055:
            return r2
        L_0x0056:
            r6.m20416c(r0, r1)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.sk0.mo14026i(android.content.Context):java.lang.String");
    }

    /* renamed from: j */
    public final String mo14027j(Context context) {
        if (!mo14043z(context)) {
            return null;
        }
        synchronized (this.f17503b) {
            String str = this.f17504c;
            if (str != null) {
                return str;
            }
            if (m20409A(context)) {
                this.f17504c = (String) m20410B("getGmpAppId", this.f17504c, dk0.f8297a);
            } else {
                this.f17504c = (String) m20411C("getGmpAppId", context);
            }
            String str2 = this.f17504c;
            return str2;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public final /* synthetic */ String mo14028k() throws Exception {
        return (String) m20410B("getAppInstanceId", (Object) null, lk0.f12831a);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public final /* synthetic */ String mo14029l(Context context) throws Exception {
        return (String) m20411C("getAppInstanceId", context);
    }

    /* renamed from: m */
    public final void mo14030m(Context context, String str) {
        if (mo14043z(context)) {
            if (m20409A(context)) {
                m20417d("beginAdUnitExposure", new ck0(str));
            } else {
                m20414a(context, str, "beginAdUnitExposure");
            }
        }
    }

    /* renamed from: n */
    public final void mo14031n(Context context, String str) {
        if (mo14043z(context)) {
            if (m20409A(context)) {
                m20417d("endAdUnitExposure", new jk0(str));
            } else {
                m20414a(context, str, "endAdUnitExposure");
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public final /* synthetic */ void mo14032o(rk0 rk0, String str) {
        if (((ou0) this.f17511j.get()) != null) {
            try {
                rk0.mo9202a((ou0) this.f17511j.get());
            } catch (Exception unused) {
                m20416c(str, false);
            }
        }
    }

    /* renamed from: p */
    public final void mo14033p(Context context, String str) {
        m20415b(context, "_aa", str, (Bundle) null);
    }

    /* renamed from: q */
    public final void mo14034q(Context context, String str) {
        m20415b(context, "_aq", str, (Bundle) null);
    }

    /* renamed from: r */
    public final void mo14035r(Context context, String str) {
        m20415b(context, "_ac", str, (Bundle) null);
    }

    /* renamed from: s */
    public final void mo14036s(Context context, String str) {
        m20415b(context, "_ai", str, (Bundle) null);
    }

    /* renamed from: t */
    public final void mo14037t(Context context, String str, String str2, String str3, int i) {
        if (mo14043z(context)) {
            Bundle bundle = new Bundle();
            bundle.putString("_ai", str2);
            bundle.putString("reward_type", str3);
            bundle.putInt("reward_value", i);
            m20415b(context, "_ar", str, bundle);
            C4794n1.m30693k("Log a Firebase reward video event, reward type: " + str3 + ", reward value: " + i);
        }
    }

    /* renamed from: u */
    public final void mo14038u(Context context, C4541l4 l4Var) {
        if (((Boolean) C4596v.m30088c().mo12227b(C2679nz.f14598k0)).booleanValue() && mo14043z(context) && m20409A(context)) {
            synchronized (this.f17513l) {
            }
        }
    }

    /* renamed from: v */
    public final void mo14039v(Context context, C4618y3 y3Var) {
        tk0.m21053d(context).mo14318b().mo14314d(y3Var);
        if (((Boolean) C4596v.m30088c().mo12227b(C2679nz.f14598k0)).booleanValue() && mo14043z(context) && m20409A(context)) {
            synchronized (this.f17513l) {
            }
        }
    }

    /* renamed from: w */
    public final void mo14040w(Bundle bundle) {
        m20417d("setConsent", new ok0(bundle));
    }

    @Deprecated
    /* renamed from: x */
    public final void mo14041x(Context context, String str) {
        Class<String> cls = String.class;
        if (!mo14043z(context) || !(context instanceof Activity)) {
            return;
        }
        if (m20409A(context)) {
            m20417d("setScreenName", new ik0(context, str));
        } else if (m20418e(context, "com.google.firebase.analytics.FirebaseAnalytics", this.f17509h, false)) {
            Method method = (Method) this.f17510i.get("setCurrentScreen");
            if (method == null) {
                try {
                    method = context.getClassLoader().loadClass("com.google.firebase.analytics.FirebaseAnalytics").getDeclaredMethod("setCurrentScreen", new Class[]{Activity.class, cls, cls});
                    this.f17510i.put("setCurrentScreen", method);
                } catch (Exception unused) {
                    m20416c("setCurrentScreen", false);
                    method = null;
                }
            }
            try {
                method.invoke(this.f17509h.get(), new Object[]{(Activity) context, str, context.getPackageName()});
            } catch (Exception unused2) {
                m20416c("setCurrentScreen", false);
            }
        }
    }

    /* renamed from: y */
    public final boolean mo14042y() {
        synchronized (this.f17513l) {
        }
        return false;
    }

    /* renamed from: z */
    public final boolean mo14043z(Context context) {
        if (((Boolean) C4596v.m30088c().mo12227b(C2679nz.f14479Y)).booleanValue() && !this.f17506e.get()) {
            if (((Boolean) C4596v.m30088c().mo12227b(C2679nz.f14578i0)).booleanValue()) {
                return true;
            }
            if (this.f17507f.get() == -1) {
                C4584t.m30036b();
                if (!im0.m14413t(context, C6378j.f30617a)) {
                    C4584t.m30036b();
                    if (im0.m14414u(context)) {
                        pm0.m18667g("Google Play Service is out of date, the Google Mobile Ads SDK will not integrate with Firebase. Admob/Firebase integration requires updated Google Play Service.");
                        this.f17507f.set(0);
                    }
                }
                this.f17507f.set(1);
            }
            if (this.f17507f.get() == 1) {
                return true;
            }
        }
        return false;
    }
}
