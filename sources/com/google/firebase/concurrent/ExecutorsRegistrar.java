package com.google.firebase.concurrent;

import android.os.Build;
import android.os.StrictMode;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import p266j7.C11495a;
import p266j7.C11496b;
import p266j7.C11497c;
import p266j7.C11498d;
import p302n7.C11934c;
import p302n7.C11943f0;
import p302n7.C11972x;
import p311o7.C12016a;
import p311o7.C12017b;
import p311o7.C12018c;
import p311o7.C12019d;
import p311o7.C12020e;
import p311o7.C12021f;
import p311o7.C12022g;
import p311o7.C12023h;

public class ExecutorsRegistrar implements ComponentRegistrar {

    /* renamed from: a */
    static final C11972x<ScheduledExecutorService> f34238a = new C11972x<>(C12019d.f44987a);

    /* renamed from: b */
    static final C11972x<ScheduledExecutorService> f34239b = new C11972x<>(C12018c.f44986a);

    /* renamed from: c */
    static final C11972x<ScheduledExecutorService> f34240c = new C11972x<>(C12017b.f44985a);

    /* renamed from: d */
    private static final C11972x<ScheduledExecutorService> f34241d = new C11972x<>(C12016a.f44984a);

    /* renamed from: i */
    private static StrictMode.ThreadPolicy m43583i() {
        StrictMode.ThreadPolicy.Builder detectNetwork = new StrictMode.ThreadPolicy.Builder().detectNetwork();
        int i = Build.VERSION.SDK_INT;
        if (i >= 23) {
            detectNetwork.detectResourceMismatches();
            if (i >= 26) {
                detectNetwork.detectUnbufferedIo();
            }
        }
        return detectNetwork.penaltyLog().build();
    }

    /* renamed from: j */
    private static ThreadFactory m43584j(String str, int i) {
        return new C7873b(str, i, (StrictMode.ThreadPolicy) null);
    }

    /* renamed from: k */
    private static ThreadFactory m43585k(String str, int i, StrictMode.ThreadPolicy threadPolicy) {
        return new C7873b(str, i, threadPolicy);
    }

    /* renamed from: t */
    private static StrictMode.ThreadPolicy m43594t() {
        return new StrictMode.ThreadPolicy.Builder().detectAll().penaltyLog().build();
    }

    /* access modifiers changed from: private */
    /* renamed from: u */
    public static ScheduledExecutorService m43595u(ExecutorService executorService) {
        return new C7886o(executorService, f34241d.get());
    }

    public List<C11934c<?>> getComponents() {
        return Arrays.asList(new C11934c[]{C11934c.m57620f(C11943f0.m57674a(C11495a.class, ScheduledExecutorService.class), C11943f0.m57674a(C11495a.class, ExecutorService.class), C11943f0.m57674a(C11495a.class, Executor.class)).mo36260f(C12023h.f44991a).mo36258d(), C11934c.m57620f(C11943f0.m57674a(C11496b.class, ScheduledExecutorService.class), C11943f0.m57674a(C11496b.class, ExecutorService.class), C11943f0.m57674a(C11496b.class, Executor.class)).mo36260f(C12020e.f44988a).mo36258d(), C11934c.m57620f(C11943f0.m57674a(C11497c.class, ScheduledExecutorService.class), C11943f0.m57674a(C11497c.class, ExecutorService.class), C11943f0.m57674a(C11497c.class, Executor.class)).mo36260f(C12022g.f44990a).mo36258d(), C11934c.m57619e(C11943f0.m57674a(C11498d.class, Executor.class)).mo36260f(C12021f.f44989a).mo36258d()});
    }
}
