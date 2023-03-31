package p008a8;

import android.app.Activity;
import android.app.Fragment;
import androidx.fragment.app.C1093e;
import com.google.firebase.firestore.C7904e0;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import p247h8.C10432b;

/* renamed from: a8.d */
/* compiled from: ActivityScope */
public class C6456d {

    /* renamed from: a8.d$b */
    /* compiled from: ActivityScope */
    private static class C6458b {

        /* renamed from: a */
        private final List<Runnable> f30728a;

        private C6458b() {
            this.f30728a = new ArrayList();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public synchronized void mo21904a(Runnable runnable) {
            this.f30728a.add(runnable);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo21905b() {
            for (Runnable next : this.f30728a) {
                if (next != null) {
                    next.run();
                }
            }
        }
    }

    /* renamed from: a8.d$c */
    /* compiled from: ActivityScope */
    public static class C6459c extends Fragment {

        /* renamed from: a */
        C6458b f30729a = new C6458b();

        public void onStop() {
            C6458b bVar;
            super.onStop();
            synchronized (this.f30729a) {
                bVar = this.f30729a;
                this.f30729a = new C6458b();
            }
            bVar.mo21905b();
        }
    }

    /* renamed from: a8.d$d */
    /* compiled from: ActivityScope */
    public static class C6460d extends androidx.fragment.app.Fragment {

        /* renamed from: q0 */
        C6458b f30730q0 = new C6458b();

        /* renamed from: K0 */
        public void mo3762K0() {
            C6458b bVar;
            super.mo3762K0();
            synchronized (this.f30730q0) {
                bVar = this.f30730q0;
                this.f30730q0 = new C6458b();
            }
            bVar.mo21905b();
        }
    }

    /* renamed from: c */
    public static C7904e0 m37658c(Activity activity, C7904e0 e0Var) {
        if (activity != null) {
            if (activity instanceof C1093e) {
                Objects.requireNonNull(e0Var);
                m37663h((C1093e) activity, new C0123c(e0Var));
            } else {
                Objects.requireNonNull(e0Var);
                m37662g(activity, new C0123c(e0Var));
            }
        }
        return e0Var;
    }

    /* renamed from: d */
    private static <T> T m37659d(Class<T> cls, Object obj, String str) {
        if (obj == null) {
            return null;
        }
        try {
            return cls.cast(obj);
        } catch (ClassCastException unused) {
            throw new IllegalStateException("Fragment with tag '" + str + "' is a " + obj.getClass().getName() + " but should be a " + cls.getName());
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public static /* synthetic */ void m37660e(Activity activity, Runnable runnable) {
        C6459c cVar = (C6459c) m37659d(C6459c.class, activity.getFragmentManager().findFragmentByTag("FirestoreOnStopObserverFragment"), "FirestoreOnStopObserverFragment");
        if (cVar == null || cVar.isRemoving()) {
            cVar = new C6459c();
            activity.getFragmentManager().beginTransaction().add(cVar, "FirestoreOnStopObserverFragment").commitAllowingStateLoss();
            activity.getFragmentManager().executePendingTransactions();
        }
        cVar.f30729a.mo21904a(runnable);
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public static /* synthetic */ void m37661f(C1093e eVar, Runnable runnable) {
        C6460d dVar = (C6460d) m37659d(C6460d.class, eVar.getSupportFragmentManager().mo4147i0("FirestoreOnStopObserverSupportFragment"), "FirestoreOnStopObserverSupportFragment");
        if (dVar == null || dVar.mo3793b0()) {
            dVar = new C6460d();
            eVar.getSupportFragmentManager().mo4154l().mo4290d(dVar, "FirestoreOnStopObserverSupportFragment").mo3884g();
            eVar.getSupportFragmentManager().mo4138e0();
        }
        dVar.f30730q0.mo21904a(runnable);
    }

    /* renamed from: g */
    private static void m37662g(Activity activity, Runnable runnable) {
        C10432b.m52648d(!(activity instanceof C1093e), "onActivityStopCallOnce must be called with a *non*-FragmentActivity Activity.", new Object[0]);
        activity.runOnUiThread(new C0119a(activity, runnable));
    }

    /* renamed from: h */
    private static void m37663h(C1093e eVar, Runnable runnable) {
        eVar.runOnUiThread(new C0121b(eVar, runnable));
    }
}
