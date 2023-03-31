package com.onesignal;

import android.app.Activity;
import android.content.res.Configuration;
import android.os.Build;
import android.view.ViewTreeObserver;
import com.onesignal.C8338d3;
import com.onesignal.C8601s2;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.onesignal.a */
/* compiled from: ActivityLifecycleHandler */
class C8289a implements C8601s2.C8603b {

    /* renamed from: d */
    private static final Map<String, C8291b> f35305d = new ConcurrentHashMap();

    /* renamed from: e */
    private static final Map<String, C8601s2.C8604c> f35306e = new ConcurrentHashMap();

    /* renamed from: f */
    private static final Map<String, C8292c> f35307f = new ConcurrentHashMap();

    /* renamed from: a */
    private final OSFocusHandler f35308a;

    /* renamed from: b */
    private Activity f35309b = null;

    /* renamed from: c */
    private boolean f35310c = false;

    /* renamed from: com.onesignal.a$b */
    /* compiled from: ActivityLifecycleHandler */
    static abstract class C8291b {
        C8291b() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo27565a(Activity activity) {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo27587b(Activity activity) {
        }
    }

    /* renamed from: com.onesignal.a$c */
    /* compiled from: ActivityLifecycleHandler */
    static class C8292c implements ViewTreeObserver.OnGlobalLayoutListener {

        /* renamed from: a */
        private final C8601s2.C8604c f35311a;

        /* renamed from: b */
        private final C8601s2.C8603b f35312b;

        /* renamed from: c */
        private final String f35313c;

        public void onGlobalLayout() {
            if (!C8313b3.m46330l(new WeakReference(C8338d3.m46486Y()))) {
                this.f35312b.mo27573a(this.f35313c, this);
                this.f35311a.mo28202c();
            }
        }

        private C8292c(C8601s2.C8603b bVar, C8601s2.C8604c cVar, String str) {
            this.f35312b = bVar;
            this.f35311a = cVar;
            this.f35313c = str;
        }
    }

    public C8289a(OSFocusHandler oSFocusHandler) {
        this.f35308a = oSFocusHandler;
    }

    /* renamed from: e */
    private void m46234e() {
        C8338d3.C8384r0 r0Var = C8338d3.C8384r0.DEBUG;
        C8338d3.m46594z1(r0Var, "ActivityLifecycleHandler handleFocus, nextResumeIsFirstActivity: " + this.f35310c);
        if (this.f35308a.mo27526f() || this.f35310c) {
            C8338d3.m46594z1(r0Var, "ActivityLifecycleHandler reset background state, call app focus");
            this.f35310c = false;
            this.f35308a.mo27528j();
            return;
        }
        C8338d3.m46594z1(r0Var, "ActivityLifecycleHandler cancel background lost focus worker");
        this.f35308a.mo27525e("FOCUS_LOST_WORKER_TAG", C8338d3.f35438f);
    }

    /* renamed from: f */
    private void m46235f() {
        C8338d3.m46594z1(C8338d3.C8384r0.DEBUG, "ActivityLifecycleHandler Handling lost focus");
        OSFocusHandler oSFocusHandler = this.f35308a;
        if (oSFocusHandler == null) {
            return;
        }
        if (!oSFocusHandler.mo27526f() || this.f35308a.mo27527g()) {
            C8338d3.m46537l0().mo28051c();
            this.f35308a.mo27529k("FOCUS_LOST_WORKER_TAG", 2000, C8338d3.f35438f);
        }
    }

    /* renamed from: g */
    private void m46236g() {
        String str;
        C8338d3.C8384r0 r0Var = C8338d3.C8384r0.DEBUG;
        StringBuilder sb = new StringBuilder();
        sb.append("curActivity is NOW: ");
        if (this.f35309b != null) {
            str = "" + this.f35309b.getClass().getName() + ":" + this.f35309b;
        } else {
            str = "null";
        }
        sb.append(str);
        C8338d3.m46492a(r0Var, sb.toString());
    }

    /* renamed from: h */
    private void m46237h(int i, Activity activity) {
        if (i == 2) {
            C8338d3.C8384r0 r0Var = C8338d3.C8384r0.DEBUG;
            C8338d3.m46594z1(r0Var, "Configuration Orientation Change: LANDSCAPE (" + i + ") on activity: " + activity);
        } else if (i == 1) {
            C8338d3.C8384r0 r0Var2 = C8338d3.C8384r0.DEBUG;
            C8338d3.m46594z1(r0Var2, "Configuration Orientation Change: PORTRAIT (" + i + ") on activity: " + activity);
        }
    }

    /* renamed from: p */
    private void m46238p(Activity activity) {
        m46235f();
        for (Map.Entry<String, C8291b> value : f35305d.entrySet()) {
            ((C8291b) value.getValue()).mo27587b(activity);
        }
        for (Map.Entry<String, C8291b> value2 : f35305d.entrySet()) {
            ((C8291b) value2.getValue()).mo27565a(this.f35309b);
        }
        ViewTreeObserver viewTreeObserver = this.f35309b.getWindow().getDecorView().getViewTreeObserver();
        for (Map.Entry next : f35306e.entrySet()) {
            C8292c cVar = new C8292c(this, (C8601s2.C8604c) next.getValue(), (String) next.getKey());
            viewTreeObserver.addOnGlobalLayoutListener(cVar);
            f35307f.put((String) next.getKey(), cVar);
        }
        m46234e();
    }

    /* renamed from: a */
    public void mo27573a(String str, C8292c cVar) {
        Activity activity = this.f35309b;
        if (activity != null) {
            ViewTreeObserver viewTreeObserver = activity.getWindow().getDecorView().getViewTreeObserver();
            if (Build.VERSION.SDK_INT < 16) {
                viewTreeObserver.removeGlobalOnLayoutListener(cVar);
            } else {
                viewTreeObserver.removeOnGlobalLayoutListener(cVar);
            }
        }
        f35307f.remove(str);
        f35306e.remove(str);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo27574b(String str, C8291b bVar) {
        f35305d.put(str, bVar);
        Activity activity = this.f35309b;
        if (activity != null) {
            bVar.mo27565a(activity);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo27575c(String str, C8601s2.C8604c cVar) {
        Activity activity = this.f35309b;
        if (activity != null) {
            ViewTreeObserver viewTreeObserver = activity.getWindow().getDecorView().getViewTreeObserver();
            C8292c cVar2 = new C8292c(this, cVar, str);
            viewTreeObserver.addOnGlobalLayoutListener(cVar2);
            f35307f.put(str, cVar2);
        }
        f35306e.put(str, cVar);
    }

    /* renamed from: d */
    public Activity mo27576d() {
        return this.f35309b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public void mo27577i(Activity activity) {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public void mo27578j(Activity activity) {
        C8338d3.C8384r0 r0Var = C8338d3.C8384r0.DEBUG;
        C8338d3.m46492a(r0Var, "onActivityDestroyed: " + activity);
        f35307f.clear();
        if (activity == this.f35309b) {
            this.f35309b = null;
            m46235f();
        }
        m46236g();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public void mo27579k(Activity activity) {
        C8338d3.C8384r0 r0Var = C8338d3.C8384r0.DEBUG;
        C8338d3.m46492a(r0Var, "onActivityPaused: " + activity);
        if (activity == this.f35309b) {
            this.f35309b = null;
            m46235f();
        }
        m46236g();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public void mo27580l(Activity activity) {
        C8338d3.C8384r0 r0Var = C8338d3.C8384r0.DEBUG;
        C8338d3.m46492a(r0Var, "onActivityResumed: " + activity);
        mo27585r(activity);
        m46236g();
        m46234e();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public void mo27581m(Activity activity) {
        this.f35308a.mo27530l();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public void mo27582n(Activity activity) {
        C8338d3.C8384r0 r0Var = C8338d3.C8384r0.DEBUG;
        C8338d3.m46492a(r0Var, "onActivityStopped: " + activity);
        if (activity == this.f35309b) {
            this.f35309b = null;
            m46235f();
        }
        for (Map.Entry<String, C8291b> value : f35305d.entrySet()) {
            ((C8291b) value.getValue()).mo27587b(activity);
        }
        m46236g();
        if (this.f35309b == null) {
            this.f35308a.mo27531m();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public void mo27583o(Configuration configuration, Activity activity) {
        Activity activity2 = this.f35309b;
        if (activity2 != null && OSUtils.m46206q(activity2, 128)) {
            m46237h(configuration.orientation, activity);
            m46238p(activity);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public void mo27584q(String str) {
        f35305d.remove(str);
    }

    /* renamed from: r */
    public void mo27585r(Activity activity) {
        this.f35309b = activity;
        for (Map.Entry<String, C8291b> value : f35305d.entrySet()) {
            ((C8291b) value.getValue()).mo27565a(this.f35309b);
        }
        try {
            ViewTreeObserver viewTreeObserver = this.f35309b.getWindow().getDecorView().getViewTreeObserver();
            for (Map.Entry next : f35306e.entrySet()) {
                C8292c cVar = new C8292c(this, (C8601s2.C8604c) next.getValue(), (String) next.getKey());
                viewTreeObserver.addOnGlobalLayoutListener(cVar);
                f35307f.put((String) next.getKey(), cVar);
            }
        } catch (RuntimeException e) {
            e.printStackTrace();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public void mo27586s(boolean z) {
        this.f35310c = z;
    }
}
