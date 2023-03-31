package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Build;
import android.os.Bundle;
import androidx.lifecycle.C1208j;

/* renamed from: androidx.lifecycle.x */
/* compiled from: ReportFragment */
public class C1236x extends Fragment {

    /* renamed from: a */
    private C1237a f3364a;

    /* renamed from: androidx.lifecycle.x$a */
    /* compiled from: ReportFragment */
    interface C1237a {
        /* renamed from: a */
        void mo4426a();

        void onResume();

        void onStart();
    }

    /* renamed from: androidx.lifecycle.x$b */
    /* compiled from: ReportFragment */
    static class C1238b implements Application.ActivityLifecycleCallbacks {
        C1238b() {
        }

        static void registerIn(Activity activity) {
            activity.registerActivityLifecycleCallbacks(new C1238b());
        }

        public void onActivityCreated(Activity activity, Bundle bundle) {
        }

        public void onActivityDestroyed(Activity activity) {
        }

        public void onActivityPaused(Activity activity) {
        }

        public void onActivityPostCreated(Activity activity, Bundle bundle) {
            C1236x.m5475a(activity, C1208j.C1210b.ON_CREATE);
        }

        public void onActivityPostResumed(Activity activity) {
            C1236x.m5475a(activity, C1208j.C1210b.ON_RESUME);
        }

        public void onActivityPostStarted(Activity activity) {
            C1236x.m5475a(activity, C1208j.C1210b.ON_START);
        }

        public void onActivityPreDestroyed(Activity activity) {
            C1236x.m5475a(activity, C1208j.C1210b.ON_DESTROY);
        }

        public void onActivityPrePaused(Activity activity) {
            C1236x.m5475a(activity, C1208j.C1210b.ON_PAUSE);
        }

        public void onActivityPreStopped(Activity activity) {
            C1236x.m5475a(activity, C1208j.C1210b.ON_STOP);
        }

        public void onActivityResumed(Activity activity) {
        }

        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        public void onActivityStarted(Activity activity) {
        }

        public void onActivityStopped(Activity activity) {
        }
    }

    /* renamed from: a */
    static void m5475a(Activity activity, C1208j.C1210b bVar) {
        if (activity instanceof C1224p) {
            ((C1224p) activity).getLifecycle().mo4408h(bVar);
        } else if (activity instanceof C1220n) {
            C1208j lifecycle = ((C1220n) activity).getLifecycle();
            if (lifecycle instanceof C1222o) {
                ((C1222o) lifecycle).mo4408h(bVar);
            }
        }
    }

    /* renamed from: b */
    private void m5476b(C1208j.C1210b bVar) {
        if (Build.VERSION.SDK_INT < 29) {
            m5475a(getActivity(), bVar);
        }
    }

    /* renamed from: c */
    private void m5477c(C1237a aVar) {
        if (aVar != null) {
            aVar.mo4426a();
        }
    }

    /* renamed from: d */
    private void m5478d(C1237a aVar) {
        if (aVar != null) {
            aVar.onResume();
        }
    }

    /* renamed from: e */
    private void m5479e(C1237a aVar) {
        if (aVar != null) {
            aVar.onStart();
        }
    }

    /* renamed from: f */
    static C1236x m5480f(Activity activity) {
        return (C1236x) activity.getFragmentManager().findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag");
    }

    /* renamed from: g */
    public static void m5481g(Activity activity) {
        if (Build.VERSION.SDK_INT >= 29) {
            C1238b.registerIn(activity);
        }
        FragmentManager fragmentManager = activity.getFragmentManager();
        if (fragmentManager.findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag") == null) {
            fragmentManager.beginTransaction().add(new C1236x(), "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag").commit();
            fragmentManager.executePendingTransactions();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public void mo4432h(C1237a aVar) {
        this.f3364a = aVar;
    }

    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        m5477c(this.f3364a);
        m5476b(C1208j.C1210b.ON_CREATE);
    }

    public void onDestroy() {
        super.onDestroy();
        m5476b(C1208j.C1210b.ON_DESTROY);
        this.f3364a = null;
    }

    public void onPause() {
        super.onPause();
        m5476b(C1208j.C1210b.ON_PAUSE);
    }

    public void onResume() {
        super.onResume();
        m5478d(this.f3364a);
        m5476b(C1208j.C1210b.ON_RESUME);
    }

    public void onStart() {
        super.onStart();
        m5479e(this.f3364a);
        m5476b(C1208j.C1210b.ON_START);
    }

    public void onStop() {
        super.onStop();
        m5476b(C1208j.C1210b.ON_STOP);
    }
}
