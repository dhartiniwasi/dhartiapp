package com.onesignal;

import android.content.Context;
import androidx.work.ListenableWorker;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import com.onesignal.C8338d3;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.C11665g;
import kotlin.jvm.internal.C11669k;
import p170y0.C6083b;
import p170y0.C6087d;
import p170y0.C6096k;
import p170y0.C6097l;
import p170y0.C6111t;
import p170y0.C6112u;
import p243gd.C10349s;

/* compiled from: OSFocusHandler.kt */
public final class OSFocusHandler {
    /* access modifiers changed from: private */

    /* renamed from: b */
    public static boolean f35263b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public static boolean f35264c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public static boolean f35265d;

    /* renamed from: e */
    public static final C8281a f35266e = new C8281a((C11665g) null);

    /* renamed from: a */
    private Runnable f35267a;

    /* compiled from: OSFocusHandler.kt */
    public static final class OnLostFocusWorker extends Worker {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public OnLostFocusWorker(Context context, WorkerParameters workerParameters) {
            super(context, workerParameters);
            C11669k.m56787e(context, "context");
            C11669k.m56787e(workerParameters, "workerParams");
        }

        public ListenableWorker.C1526a doWork() {
            OSFocusHandler.f35266e.mo27532a();
            ListenableWorker.C1526a c = ListenableWorker.C1526a.m7085c();
            C11669k.m56786d(c, "Result.success()");
            return c;
        }
    }

    /* renamed from: com.onesignal.OSFocusHandler$a */
    /* compiled from: OSFocusHandler.kt */
    public static final class C8281a {
        private C8281a() {
        }

        /* renamed from: a */
        public final void mo27532a() {
            C8289a b = C8301b.m46281b();
            if (b == null || b.mo27576d() == null) {
                C8338d3.m46563r2(false);
            }
            C8338d3.m46594z1(C8338d3.C8384r0.DEBUG, "OSFocusHandler running onAppLostFocus");
            OSFocusHandler.f35264c = true;
            C8338d3.m46582w1();
            OSFocusHandler.f35265d = true;
        }

        public /* synthetic */ C8281a(C11665g gVar) {
            this();
        }
    }

    /* renamed from: com.onesignal.OSFocusHandler$b */
    /* compiled from: OSFocusHandler.kt */
    static final class C8282b implements Runnable {

        /* renamed from: a */
        public static final C8282b f35268a = new C8282b();

        C8282b() {
        }

        public final void run() {
            OSFocusHandler.f35263b = true;
            C8338d3.m46594z1(C8338d3.C8384r0.DEBUG, "OSFocusHandler setting stop state: true");
        }
    }

    /* renamed from: d */
    private final C6083b m46126d() {
        C6083b a = new C6083b.C6084a().mo20901b(C6096k.CONNECTED).mo20900a();
        C11669k.m56786d(a, "Constraints.Builder()\n  …TED)\n            .build()");
        return a;
    }

    /* renamed from: h */
    private final void m46127h() {
        m46128i();
        f35264c = false;
    }

    /* renamed from: i */
    private final void m46128i() {
        f35263b = false;
        Runnable runnable = this.f35267a;
        if (runnable != null) {
            C8664y2.m47908b().mo28336a(runnable);
        }
    }

    /* renamed from: e */
    public final void mo27525e(String str, Context context) {
        C11669k.m56787e(str, "tag");
        C11669k.m56787e(context, "context");
        C6111t.m35740g(context).mo20937a(str);
    }

    /* renamed from: f */
    public final boolean mo27526f() {
        return f35264c;
    }

    /* renamed from: g */
    public final boolean mo27527g() {
        return f35265d;
    }

    /* renamed from: j */
    public final void mo27528j() {
        m46127h();
        C8338d3.m46594z1(C8338d3.C8384r0.DEBUG, "OSFocusHandler running onAppFocus");
        C8338d3.m46574u1();
    }

    /* renamed from: k */
    public final void mo27529k(String str, long j, Context context) {
        C11669k.m56787e(str, "tag");
        C11669k.m56787e(context, "context");
        C6112u b = ((C6097l.C6098a) ((C6097l.C6098a) ((C6097l.C6098a) new C6097l.C6098a(OnLostFocusWorker.class).mo20950f(m46126d())).mo20951g(j, TimeUnit.MILLISECONDS)).mo20947a(str)).mo20948b();
        C11669k.m56786d(b, "OneTimeWorkRequest.Build…tag)\n            .build()");
        C6111t.m35740g(context).mo20942f(str, C6087d.KEEP, (C6097l) b);
    }

    /* renamed from: l */
    public final void mo27530l() {
        if (f35263b) {
            f35263b = false;
            this.f35267a = null;
            C8338d3.m46594z1(C8338d3.C8384r0.DEBUG, "OSFocusHandler running onAppStartFocusLogic");
            C8338d3.m46586x1();
            return;
        }
        m46128i();
    }

    /* renamed from: m */
    public final void mo27531m() {
        C8282b bVar = C8282b.f35268a;
        C8664y2.m47908b().mo28337c(1500, bVar);
        C10349s sVar = C10349s.f40964a;
        this.f35267a = bVar;
    }
}
