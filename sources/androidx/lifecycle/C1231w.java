package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import androidx.lifecycle.C1208j;
import androidx.lifecycle.C1236x;

/* renamed from: androidx.lifecycle.w */
/* compiled from: ProcessLifecycleOwner */
public class C1231w implements C1220n {

    /* renamed from: i */
    private static final C1231w f3353i = new C1231w();

    /* renamed from: a */
    private int f3354a = 0;

    /* renamed from: b */
    private int f3355b = 0;

    /* renamed from: c */
    private boolean f3356c = true;

    /* renamed from: d */
    private boolean f3357d = true;

    /* renamed from: e */
    private Handler f3358e;

    /* renamed from: f */
    private final C1222o f3359f = new C1222o(this);

    /* renamed from: g */
    private Runnable f3360g = new C1232a();

    /* renamed from: h */
    C1236x.C1237a f3361h = new C1233b();

    /* renamed from: androidx.lifecycle.w$a */
    /* compiled from: ProcessLifecycleOwner */
    class C1232a implements Runnable {
        C1232a() {
        }

        public void run() {
            C1231w.this.mo4423f();
            C1231w.this.mo4424g();
        }
    }

    /* renamed from: androidx.lifecycle.w$b */
    /* compiled from: ProcessLifecycleOwner */
    class C1233b implements C1236x.C1237a {
        C1233b() {
        }

        /* renamed from: a */
        public void mo4426a() {
        }

        public void onResume() {
            C1231w.this.mo4419b();
        }

        public void onStart() {
            C1231w.this.mo4420c();
        }
    }

    /* renamed from: androidx.lifecycle.w$c */
    /* compiled from: ProcessLifecycleOwner */
    class C1234c extends C1188e {

        /* renamed from: androidx.lifecycle.w$c$a */
        /* compiled from: ProcessLifecycleOwner */
        class C1235a extends C1188e {
            C1235a() {
            }

            public void onActivityPostResumed(Activity activity) {
                C1231w.this.mo4419b();
            }

            public void onActivityPostStarted(Activity activity) {
                C1231w.this.mo4420c();
            }
        }

        C1234c() {
        }

        public void onActivityCreated(Activity activity, Bundle bundle) {
            if (Build.VERSION.SDK_INT < 29) {
                C1236x.m5480f(activity).mo4432h(C1231w.this.f3361h);
            }
        }

        public void onActivityPaused(Activity activity) {
            C1231w.this.mo4418a();
        }

        public void onActivityPreCreated(Activity activity, Bundle bundle) {
            activity.registerActivityLifecycleCallbacks(new C1235a());
        }

        public void onActivityStopped(Activity activity) {
            C1231w.this.mo4421d();
        }
    }

    private C1231w() {
    }

    /* renamed from: h */
    public static C1220n m5465h() {
        return f3353i;
    }

    /* renamed from: i */
    static void m5466i(Context context) {
        f3353i.mo4422e(context);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo4418a() {
        int i = this.f3355b - 1;
        this.f3355b = i;
        if (i == 0) {
            this.f3358e.postDelayed(this.f3360g, 700);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo4419b() {
        int i = this.f3355b + 1;
        this.f3355b = i;
        if (i != 1) {
            return;
        }
        if (this.f3356c) {
            this.f3359f.mo4408h(C1208j.C1210b.ON_RESUME);
            this.f3356c = false;
            return;
        }
        this.f3358e.removeCallbacks(this.f3360g);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo4420c() {
        int i = this.f3354a + 1;
        this.f3354a = i;
        if (i == 1 && this.f3357d) {
            this.f3359f.mo4408h(C1208j.C1210b.ON_START);
            this.f3357d = false;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo4421d() {
        this.f3354a--;
        mo4424g();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo4422e(Context context) {
        this.f3358e = new Handler();
        this.f3359f.mo4408h(C1208j.C1210b.ON_CREATE);
        ((Application) context.getApplicationContext()).registerActivityLifecycleCallbacks(new C1234c());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo4423f() {
        if (this.f3355b == 0) {
            this.f3356c = true;
            this.f3359f.mo4408h(C1208j.C1210b.ON_PAUSE);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public void mo4424g() {
        if (this.f3354a == 0 && this.f3356c) {
            this.f3359f.mo4408h(C1208j.C1210b.ON_STOP);
            this.f3357d = true;
        }
    }

    public C1208j getLifecycle() {
        return this.f3359f;
    }
}
