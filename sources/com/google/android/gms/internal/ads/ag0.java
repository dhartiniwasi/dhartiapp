package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Looper;
import android.text.TextUtils;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import p060h4.C4596v;
import p081k5.C4888c;
import p180z4.C6370f;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public final class ag0 implements cg0 {

    /* renamed from: f */
    private static final Object f6546f = new Object();

    /* renamed from: g */
    static cg0 f6547g;

    /* renamed from: h */
    static cg0 f6548h;

    /* renamed from: a */
    private final Object f6549a = new Object();

    /* renamed from: b */
    private final Context f6550b;

    /* renamed from: c */
    private final WeakHashMap f6551c = new WeakHashMap();

    /* renamed from: d */
    private final ExecutorService f6552d;

    /* renamed from: e */
    private final vm0 f6553e;

    protected ag0(Context context, vm0 vm0) {
        a53.m9591a();
        this.f6552d = Executors.unconfigurableExecutorService(Executors.newCachedThreadPool());
        this.f6550b = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        this.f6553e = vm0;
    }

    /* renamed from: c */
    public static cg0 m9704c(Context context) {
        synchronized (f6546f) {
            if (f6547g == null) {
                if (((Boolean) n10.f13754e.mo13438e()).booleanValue()) {
                    if (!((Boolean) C4596v.m30088c().mo12227b(C2679nz.f14319H6)).booleanValue()) {
                        f6547g = new ag0(context, vm0.m22307I1());
                    }
                }
                f6547g = new bg0();
            }
        }
        return f6547g;
    }

    /* renamed from: d */
    public static cg0 m9705d(Context context, vm0 vm0) {
        synchronized (f6546f) {
            if (f6548h == null) {
                if (((Boolean) n10.f13754e.mo13438e()).booleanValue()) {
                    if (!((Boolean) C4596v.m30088c().mo12227b(C2679nz.f14319H6)).booleanValue()) {
                        ag0 ag0 = new ag0(context, vm0);
                        Thread thread = Looper.getMainLooper().getThread();
                        if (thread != null) {
                            synchronized (ag0.f6549a) {
                                ag0.f6551c.put(thread, Boolean.TRUE);
                            }
                            thread.setUncaughtExceptionHandler(new zf0(ag0, thread.getUncaughtExceptionHandler()));
                        }
                        Thread.setDefaultUncaughtExceptionHandler(new yf0(ag0, Thread.getDefaultUncaughtExceptionHandler()));
                        f6548h = ag0;
                    }
                }
                f6548h = new bg0();
            }
        }
        return f6548h;
    }

    /* renamed from: a */
    public final void mo8325a(Throwable th, String str, float f) {
        boolean z;
        String str2;
        if (im0.m14408h(th) != null) {
            String name = th.getClass().getName();
            StringWriter stringWriter = new StringWriter();
            th.printStackTrace(new PrintWriter(stringWriter));
            String stringWriter2 = stringWriter.toString();
            double d = (double) f;
            double random = Math.random();
            int i = f > 0.0f ? (int) (1.0f / f) : 1;
            if (random < d) {
                ArrayList<String> arrayList = new ArrayList<>();
                try {
                    z = C4888c.m31075a(this.f6550b).mo18674g();
                } catch (Throwable th2) {
                    pm0.m18665e("Error fetching instant app info", th2);
                    z = false;
                }
                try {
                    str2 = this.f6550b.getPackageName();
                } catch (Throwable unused) {
                    pm0.m18667g("Cannot obtain package name, proceeding.");
                    str2 = "unknown";
                }
                Uri.Builder appendQueryParameter = new Uri.Builder().scheme("https").path("//pagead2.googlesyndication.com/pagead/gen_204").appendQueryParameter("is_aia", Boolean.toString(z)).appendQueryParameter("id", "gmob-apps-report-exception").appendQueryParameter("os", Build.VERSION.RELEASE).appendQueryParameter("api", String.valueOf(Build.VERSION.SDK_INT));
                String str3 = Build.MANUFACTURER;
                String str4 = Build.MODEL;
                if (!str4.startsWith(str3)) {
                    str4 = str3 + " " + str4;
                }
                arrayList.add(appendQueryParameter.appendQueryParameter("device", str4).appendQueryParameter("js", this.f6553e.f19150a).appendQueryParameter("appid", str2).appendQueryParameter("exceptiontype", name).appendQueryParameter("stacktrace", stringWriter2).appendQueryParameter("eids", TextUtils.join(",", C2679nz.m17341a())).appendQueryParameter("exceptionkey", str).appendQueryParameter("cl", "474357726").appendQueryParameter("rc", "dev").appendQueryParameter("sampling_rate", Integer.toString(i)).appendQueryParameter("pb_tm", String.valueOf(n10.f13752c.mo13438e())).appendQueryParameter("gmscv", String.valueOf(C6370f.m37437h().mo21796b(this.f6550b))).appendQueryParameter("lite", true != this.f6553e.f19154e ? "0" : "1").toString());
                for (String xf0 : arrayList) {
                    this.f6552d.execute(new xf0(new um0((String) null), xf0));
                }
            }
        }
    }

    /* renamed from: b */
    public final void mo8326b(Throwable th, String str) {
        mo8325a(th, str, 1.0f);
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final void mo8327e(Thread thread, Throwable th) {
        if (th != null) {
            boolean z = false;
            boolean z2 = false;
            for (Throwable th2 = th; th2 != null; th2 = th2.getCause()) {
                for (StackTraceElement stackTraceElement : th2.getStackTrace()) {
                    z |= im0.m14409p(stackTraceElement.getClassName());
                    z2 |= ag0.class.getName().equals(stackTraceElement.getClassName());
                }
            }
            if (z && !z2) {
                mo8325a(th, "", 1.0f);
            }
        }
    }
}
