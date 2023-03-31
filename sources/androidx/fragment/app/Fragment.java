package androidx.fragment.app;

import android.animation.Animator;
import android.app.Activity;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.core.app.C0678s;
import androidx.core.view.C0908g;
import androidx.lifecycle.C1195h;
import androidx.lifecycle.C1196h0;
import androidx.lifecycle.C1206i;
import androidx.lifecycle.C1208j;
import androidx.lifecycle.C1215k0;
import androidx.lifecycle.C1216l;
import androidx.lifecycle.C1217l0;
import androidx.lifecycle.C1219m0;
import androidx.lifecycle.C1220n;
import androidx.lifecycle.C1221n0;
import androidx.lifecycle.C1222o;
import androidx.lifecycle.C1228t;
import androidx.lifecycle.LiveData;
import androidx.loader.app.C1242a;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;
import p049g0.C4298a;
import p104o0.C5140c;
import p104o0.C5144d;
import p104o0.C5146e;
import p104o0.C5147f;

public class Fragment implements ComponentCallbacks, View.OnCreateContextMenuListener, C1220n, C1217l0, C1206i, C5146e {

    /* renamed from: p0 */
    static final Object f2802p0 = new Object();

    /* renamed from: A */
    C1114n f2803A;

    /* renamed from: B */
    C1109k<?> f2804B;

    /* renamed from: C */
    C1114n f2805C = new C1133o();

    /* renamed from: D */
    Fragment f2806D;

    /* renamed from: E */
    int f2807E;

    /* renamed from: F */
    int f2808F;

    /* renamed from: G */
    String f2809G;

    /* renamed from: H */
    boolean f2810H;

    /* renamed from: I */
    boolean f2811I;

    /* renamed from: J */
    boolean f2812J;

    /* renamed from: K */
    boolean f2813K;

    /* renamed from: L */
    boolean f2814L;

    /* renamed from: M */
    boolean f2815M = true;

    /* renamed from: N */
    private boolean f2816N;

    /* renamed from: O */
    ViewGroup f2817O;

    /* renamed from: P */
    View f2818P;

    /* renamed from: Q */
    boolean f2819Q;

    /* renamed from: R */
    boolean f2820R = true;

    /* renamed from: S */
    C1053e f2821S;

    /* renamed from: a */
    int f2822a = -1;

    /* renamed from: a0 */
    Runnable f2823a0 = new C1049a();

    /* renamed from: b */
    Bundle f2824b;

    /* renamed from: b0 */
    boolean f2825b0;

    /* renamed from: c */
    SparseArray<Parcelable> f2826c;

    /* renamed from: c0 */
    boolean f2827c0;

    /* renamed from: d */
    Bundle f2828d;

    /* renamed from: d0 */
    float f2829d0;

    /* renamed from: e */
    Boolean f2830e;

    /* renamed from: e0 */
    LayoutInflater f2831e0;

    /* renamed from: f */
    String f2832f = UUID.randomUUID().toString();

    /* renamed from: f0 */
    boolean f2833f0;

    /* renamed from: g */
    Bundle f2834g;

    /* renamed from: g0 */
    C1208j.C1211c f2835g0 = C1208j.C1211c.RESUMED;

    /* renamed from: h */
    Fragment f2836h;

    /* renamed from: h0 */
    C1222o f2837h0;

    /* renamed from: i */
    String f2838i = null;

    /* renamed from: i0 */
    C1058a0 f2839i0;

    /* renamed from: j0 */
    C1228t<C1220n> f2840j0 = new C1228t<>();

    /* renamed from: k0 */
    C1196h0.C1200b f2841k0;

    /* renamed from: l0 */
    C5144d f2842l0;

    /* renamed from: m0 */
    private int f2843m0;

    /* renamed from: n0 */
    private final AtomicInteger f2844n0 = new AtomicInteger();

    /* renamed from: o0 */
    private final ArrayList<C1055g> f2845o0 = new ArrayList<>();

    /* renamed from: r */
    int f2846r;

    /* renamed from: s */
    private Boolean f2847s = null;

    /* renamed from: t */
    boolean f2848t;

    /* renamed from: u */
    boolean f2849u;

    /* renamed from: v */
    boolean f2850v;

    /* renamed from: w */
    boolean f2851w;

    /* renamed from: x */
    boolean f2852x;

    /* renamed from: y */
    boolean f2853y;

    /* renamed from: z */
    int f2854z;

    /* renamed from: androidx.fragment.app.Fragment$a */
    class C1049a implements Runnable {
        C1049a() {
        }

        public void run() {
            Fragment.this.mo3750E1();
        }
    }

    /* renamed from: androidx.fragment.app.Fragment$b */
    class C1050b implements Runnable {
        C1050b() {
        }

        public void run() {
            Fragment.this.mo3797d(false);
        }
    }

    /* renamed from: androidx.fragment.app.Fragment$c */
    class C1051c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C1077c0 f2858a;

        C1051c(C1077c0 c0Var) {
            this.f2858a = c0Var;
        }

        public void run() {
            this.f2858a.mo3945g();
        }
    }

    /* renamed from: androidx.fragment.app.Fragment$d */
    class C1052d extends C1105g {
        C1052d() {
        }

        /* renamed from: c */
        public View mo3873c(int i) {
            View view = Fragment.this.f2818P;
            if (view != null) {
                return view.findViewById(i);
            }
            throw new IllegalStateException("Fragment " + Fragment.this + " does not have a view");
        }

        /* renamed from: d */
        public boolean mo3874d() {
            return Fragment.this.f2818P != null;
        }
    }

    /* renamed from: androidx.fragment.app.Fragment$e */
    static class C1053e {

        /* renamed from: a */
        View f2861a;

        /* renamed from: b */
        Animator f2862b;

        /* renamed from: c */
        boolean f2863c;

        /* renamed from: d */
        int f2864d;

        /* renamed from: e */
        int f2865e;

        /* renamed from: f */
        int f2866f;

        /* renamed from: g */
        int f2867g;

        /* renamed from: h */
        int f2868h;

        /* renamed from: i */
        ArrayList<String> f2869i;

        /* renamed from: j */
        ArrayList<String> f2870j;

        /* renamed from: k */
        Object f2871k = null;

        /* renamed from: l */
        Object f2872l;

        /* renamed from: m */
        Object f2873m;

        /* renamed from: n */
        Object f2874n;

        /* renamed from: o */
        Object f2875o;

        /* renamed from: p */
        Object f2876p;

        /* renamed from: q */
        Boolean f2877q;

        /* renamed from: r */
        Boolean f2878r;

        /* renamed from: s */
        C0678s f2879s;

        /* renamed from: t */
        C0678s f2880t;

        /* renamed from: u */
        float f2881u;

        /* renamed from: v */
        View f2882v;

        /* renamed from: w */
        boolean f2883w;

        /* renamed from: x */
        C1056h f2884x;

        /* renamed from: y */
        boolean f2885y;

        C1053e() {
            Object obj = Fragment.f2802p0;
            this.f2872l = obj;
            this.f2873m = null;
            this.f2874n = obj;
            this.f2875o = null;
            this.f2876p = obj;
            this.f2881u = 1.0f;
            this.f2882v = null;
        }
    }

    /* renamed from: androidx.fragment.app.Fragment$f */
    public static class C1054f extends RuntimeException {
        public C1054f(String str, Exception exc) {
            super(str, exc);
        }
    }

    /* renamed from: androidx.fragment.app.Fragment$g */
    private static abstract class C1055g {
        private C1055g() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public abstract void mo3875a();
    }

    /* renamed from: androidx.fragment.app.Fragment$h */
    interface C1056h {
        /* renamed from: a */
        void mo3876a();

        /* renamed from: b */
        void mo3877b();
    }

    public Fragment() {
        m4667S();
    }

    /* renamed from: S */
    private void m4667S() {
        this.f2837h0 = new C1222o(this);
        this.f2842l0 = C5144d.m32043a(this);
        this.f2841k0 = null;
    }

    @Deprecated
    /* renamed from: U */
    public static Fragment m4668U(Context context, String str, Bundle bundle) {
        try {
            Fragment fragment = (Fragment) C1108j.m4970d(context.getClassLoader(), str).getConstructor(new Class[0]).newInstance(new Object[0]);
            if (bundle != null) {
                bundle.setClassLoader(fragment.getClass().getClassLoader());
                fragment.mo3855u1(bundle);
            }
            return fragment;
        } catch (InstantiationException e) {
            throw new C1054f("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an empty constructor that is public", e);
        } catch (IllegalAccessException e2) {
            throw new C1054f("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an empty constructor that is public", e2);
        } catch (NoSuchMethodException e3) {
            throw new C1054f("Unable to instantiate fragment " + str + ": could not find Fragment constructor", e3);
        } catch (InvocationTargetException e4) {
            throw new C1054f("Unable to instantiate fragment " + str + ": calling Fragment constructor caused an exception", e4);
        }
    }

    /* renamed from: g */
    private C1053e m4669g() {
        if (this.f2821S == null) {
            this.f2821S = new C1053e();
        }
        return this.f2821S;
    }

    /* renamed from: p1 */
    private void m4670p1() {
        if (C1114n.m4999F0(3)) {
            Log.d("FragmentManager", "moveto RESTORE_VIEW_STATE: " + this);
        }
        if (this.f2818P != null) {
            mo3841q1(this.f2824b);
        }
        this.f2824b = null;
    }

    /* renamed from: z */
    private int m4671z() {
        C1208j.C1211c cVar = this.f2835g0;
        if (cVar == C1208j.C1211c.INITIALIZED || this.f2806D == null) {
            return cVar.ordinal();
        }
        return Math.min(cVar.ordinal(), this.f2806D.m4671z());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: A */
    public int mo3736A() {
        C1053e eVar = this.f2821S;
        if (eVar == null) {
            return 0;
        }
        return eVar.f2868h;
    }

    /* renamed from: A0 */
    public boolean mo3737A0(MenuItem menuItem) {
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: A1 */
    public void mo3738A1(float f) {
        m4669g().f2881u = f;
    }

    /* renamed from: B */
    public final Fragment mo3739B() {
        return this.f2806D;
    }

    /* renamed from: B0 */
    public void mo3740B0(Menu menu) {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: B1 */
    public void mo3741B1(ArrayList<String> arrayList, ArrayList<String> arrayList2) {
        m4669g();
        C1053e eVar = this.f2821S;
        eVar.f2869i = arrayList;
        eVar.f2870j = arrayList2;
    }

    /* renamed from: C */
    public final C1114n mo3742C() {
        C1114n nVar = this.f2803A;
        if (nVar != null) {
            return nVar;
        }
        throw new IllegalStateException("Fragment " + this + " not associated with a fragment manager.");
    }

    /* renamed from: C0 */
    public void mo3743C0() {
        this.f2816N = true;
    }

    @Deprecated
    /* renamed from: C1 */
    public void mo3744C1(Intent intent, int i, Bundle bundle) {
        if (this.f2804B != null) {
            mo3742C().mo4110L0(this, intent, i, bundle);
            return;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to Activity");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: D */
    public boolean mo3745D() {
        C1053e eVar = this.f2821S;
        if (eVar == null) {
            return false;
        }
        return eVar.f2863c;
    }

    /* renamed from: D0 */
    public void mo3746D0(boolean z) {
    }

    @Deprecated
    /* renamed from: D1 */
    public void mo3747D1(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) throws IntentSender.SendIntentException {
        if (this.f2804B != null) {
            if (C1114n.m4999F0(2)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Fragment ");
                sb.append(this);
                sb.append(" received the following in startIntentSenderForResult() requestCode: ");
                int i5 = i;
                sb.append(i);
                sb.append(" IntentSender: ");
                IntentSender intentSender2 = intentSender;
                sb.append(intentSender);
                sb.append(" fillInIntent: ");
                Intent intent2 = intent;
                sb.append(intent);
                sb.append(" options: ");
                sb.append(bundle);
                Log.v("FragmentManager", sb.toString());
            } else {
                IntentSender intentSender3 = intentSender;
                int i6 = i;
                Intent intent3 = intent;
                Bundle bundle2 = bundle;
            }
            mo3742C().mo4112M0(this, intentSender, i, intent, i2, i3, i4, bundle);
            return;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to Activity");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: E */
    public int mo3748E() {
        C1053e eVar = this.f2821S;
        if (eVar == null) {
            return 0;
        }
        return eVar.f2866f;
    }

    /* renamed from: E0 */
    public void mo3749E0(Menu menu) {
    }

    /* renamed from: E1 */
    public void mo3750E1() {
        if (this.f2821S != null && m4669g().f2883w) {
            if (this.f2804B == null) {
                m4669g().f2883w = false;
            } else if (Looper.myLooper() != this.f2804B.mo4067g().getLooper()) {
                this.f2804B.mo4067g().postAtFrontOfQueue(new C1050b());
            } else {
                mo3797d(true);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: F */
    public int mo3751F() {
        C1053e eVar = this.f2821S;
        if (eVar == null) {
            return 0;
        }
        return eVar.f2867g;
    }

    /* renamed from: F0 */
    public void mo3752F0(boolean z) {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: G */
    public float mo3753G() {
        C1053e eVar = this.f2821S;
        if (eVar == null) {
            return 1.0f;
        }
        return eVar.f2881u;
    }

    @Deprecated
    /* renamed from: G0 */
    public void mo3754G0(int i, String[] strArr, int[] iArr) {
    }

    /* renamed from: H */
    public Object mo3755H() {
        C1053e eVar = this.f2821S;
        if (eVar == null) {
            return null;
        }
        Object obj = eVar.f2874n;
        return obj == f2802p0 ? mo3853u() : obj;
    }

    /* renamed from: H0 */
    public void mo3756H0() {
        this.f2816N = true;
    }

    /* renamed from: I */
    public final Resources mo3757I() {
        return mo3827m1().getResources();
    }

    /* renamed from: I0 */
    public void mo3758I0(Bundle bundle) {
    }

    /* renamed from: J */
    public Object mo3759J() {
        C1053e eVar = this.f2821S;
        if (eVar == null) {
            return null;
        }
        Object obj = eVar.f2872l;
        return obj == f2802p0 ? mo3842r() : obj;
    }

    /* renamed from: J0 */
    public void mo3760J0() {
        this.f2816N = true;
    }

    /* renamed from: K */
    public Object mo3761K() {
        C1053e eVar = this.f2821S;
        if (eVar == null) {
            return null;
        }
        return eVar.f2875o;
    }

    /* renamed from: K0 */
    public void mo3762K0() {
        this.f2816N = true;
    }

    /* renamed from: L */
    public Object mo3763L() {
        C1053e eVar = this.f2821S;
        if (eVar == null) {
            return null;
        }
        Object obj = eVar.f2876p;
        return obj == f2802p0 ? mo3761K() : obj;
    }

    /* renamed from: L0 */
    public void mo3764L0(View view, Bundle bundle) {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: M */
    public ArrayList<String> mo3765M() {
        ArrayList<String> arrayList;
        C1053e eVar = this.f2821S;
        if (eVar == null || (arrayList = eVar.f2869i) == null) {
            return new ArrayList<>();
        }
        return arrayList;
    }

    /* renamed from: M0 */
    public void mo3766M0(Bundle bundle) {
        this.f2816N = true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: N */
    public ArrayList<String> mo3767N() {
        ArrayList<String> arrayList;
        C1053e eVar = this.f2821S;
        if (eVar == null || (arrayList = eVar.f2870j) == null) {
            return new ArrayList<>();
        }
        return arrayList;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: N0 */
    public void mo3768N0(Bundle bundle) {
        this.f2805C.mo4122S0();
        this.f2822a = 3;
        this.f2816N = false;
        mo3807g0(bundle);
        if (this.f2816N) {
            m4670p1();
            this.f2805C.mo4174y();
            return;
        }
        throw new C1097e0("Fragment " + this + " did not call through to super.onActivityCreated()");
    }

    /* renamed from: O */
    public final String mo3769O(int i) {
        return mo3757I().getString(i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: O0 */
    public void mo3770O0() {
        Iterator<C1055g> it = this.f2845o0.iterator();
        while (it.hasNext()) {
            it.next().mo3875a();
        }
        this.f2845o0.clear();
        this.f2805C.mo4149j(this.f2804B, mo3800e(), this);
        this.f2822a = 0;
        this.f2816N = false;
        mo3817j0(this.f2804B.mo4066f());
        if (this.f2816N) {
            this.f2803A.mo4104I(this);
            this.f2805C.mo4176z();
            return;
        }
        throw new C1097e0("Fragment " + this + " did not call through to super.onAttach()");
    }

    @Deprecated
    /* renamed from: P */
    public final Fragment mo3771P() {
        String str;
        Fragment fragment = this.f2836h;
        if (fragment != null) {
            return fragment;
        }
        C1114n nVar = this.f2803A;
        if (nVar == null || (str = this.f2838i) == null) {
            return null;
        }
        return nVar.mo4142g0(str);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: P0 */
    public void mo3772P0(Configuration configuration) {
        onConfigurationChanged(configuration);
        this.f2805C.mo4090A(configuration);
    }

    /* renamed from: Q */
    public View mo3773Q() {
        return this.f2818P;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Q0 */
    public boolean mo3774Q0(MenuItem menuItem) {
        if (this.f2810H) {
            return false;
        }
        if (mo3823l0(menuItem)) {
            return true;
        }
        return this.f2805C.mo4092B(menuItem);
    }

    /* renamed from: R */
    public LiveData<C1220n> mo3775R() {
        return this.f2840j0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: R0 */
    public void mo3776R0(Bundle bundle) {
        this.f2805C.mo4122S0();
        this.f2822a = 1;
        this.f2816N = false;
        if (Build.VERSION.SDK_INT >= 19) {
            this.f2837h0.mo4399a(new C1216l() {
                /* renamed from: c */
                public void mo752c(C1220n nVar, C1208j.C1210b bVar) {
                    View view;
                    if (bVar == C1208j.C1210b.ON_STOP && (view = Fragment.this.f2818P) != null) {
                        view.cancelPendingInputEvents();
                    }
                }
            });
        }
        this.f2842l0.mo19115d(bundle);
        mo3826m0(bundle);
        this.f2833f0 = true;
        if (this.f2816N) {
            this.f2837h0.mo4408h(C1208j.C1210b.ON_CREATE);
            return;
        }
        throw new C1097e0("Fragment " + this + " did not call through to super.onCreate()");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: S0 */
    public boolean mo3777S0(Menu menu, MenuInflater menuInflater) {
        boolean z = false;
        if (this.f2810H) {
            return false;
        }
        if (this.f2814L && this.f2815M) {
            z = true;
            mo3838p0(menu, menuInflater);
        }
        return z | this.f2805C.mo4096D(menu, menuInflater);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: T */
    public void mo3778T() {
        m4667S();
        this.f2832f = UUID.randomUUID().toString();
        this.f2848t = false;
        this.f2849u = false;
        this.f2850v = false;
        this.f2851w = false;
        this.f2852x = false;
        this.f2854z = 0;
        this.f2803A = null;
        this.f2805C = new C1133o();
        this.f2804B = null;
        this.f2807E = 0;
        this.f2808F = 0;
        this.f2809G = null;
        this.f2810H = false;
        this.f2811I = false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: T0 */
    public void mo3779T0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f2805C.mo4122S0();
        this.f2853y = true;
        this.f2839i0 = new C1058a0(this, getViewModelStore());
        View q0 = mo3840q0(layoutInflater, viewGroup, bundle);
        this.f2818P = q0;
        if (q0 != null) {
            this.f2839i0.mo3901b();
            C1219m0.m5436a(this.f2818P, this.f2839i0);
            C1221n0.m5437a(this.f2818P, this.f2839i0);
            C5147f.m32049a(this.f2818P, this.f2839i0);
            this.f2840j0.mo4354j(this.f2839i0);
        } else if (!this.f2839i0.mo3902c()) {
            this.f2839i0 = null;
        } else {
            throw new IllegalStateException("Called getViewLifecycleOwner() but onCreateView() returned null");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: U0 */
    public void mo3780U0() {
        this.f2805C.mo4098E();
        this.f2837h0.mo4408h(C1208j.C1210b.ON_DESTROY);
        this.f2822a = 0;
        this.f2816N = false;
        this.f2833f0 = false;
        mo3843r0();
        if (!this.f2816N) {
            throw new C1097e0("Fragment " + this + " did not call through to super.onDestroy()");
        }
    }

    /* renamed from: V */
    public final boolean mo3781V() {
        return this.f2804B != null && this.f2848t;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: V0 */
    public void mo3782V0() {
        this.f2805C.mo4100F();
        if (this.f2818P != null && this.f2839i0.getLifecycle().mo4400b().mo4403a(C1208j.C1211c.CREATED)) {
            this.f2839i0.mo3900a(C1208j.C1210b.ON_DESTROY);
        }
        this.f2822a = 1;
        this.f2816N = false;
        mo3850t0();
        if (this.f2816N) {
            C1242a.m5493b(this).mo4457c();
            this.f2853y = false;
            return;
        }
        throw new C1097e0("Fragment " + this + " did not call through to super.onDestroyView()");
    }

    /* renamed from: W */
    public final boolean mo3783W() {
        return this.f2810H;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: W0 */
    public void mo3784W0() {
        this.f2822a = -1;
        this.f2816N = false;
        mo3854u0();
        this.f2831e0 = null;
        if (!this.f2816N) {
            throw new C1097e0("Fragment " + this + " did not call through to super.onDetach()");
        } else if (!this.f2805C.mo4099E0()) {
            this.f2805C.mo4098E();
            this.f2805C = new C1133o();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: X */
    public boolean mo3785X() {
        C1053e eVar = this.f2821S;
        if (eVar == null) {
            return false;
        }
        return eVar.f2885y;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: X0 */
    public LayoutInflater mo3786X0(Bundle bundle) {
        LayoutInflater v0 = mo3857v0(bundle);
        this.f2831e0 = v0;
        return v0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Y */
    public final boolean mo3787Y() {
        return this.f2854z > 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Y0 */
    public void mo3788Y0() {
        onLowMemory();
        this.f2805C.mo4101G();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r0 = r2.f2803A;
     */
    /* renamed from: Z */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo3789Z() {
        /*
            r2 = this;
            boolean r0 = r2.f2815M
            if (r0 == 0) goto L_0x0012
            androidx.fragment.app.n r0 = r2.f2803A
            if (r0 == 0) goto L_0x0010
            androidx.fragment.app.Fragment r1 = r2.f2806D
            boolean r0 = r0.mo4103H0(r1)
            if (r0 == 0) goto L_0x0012
        L_0x0010:
            r0 = 1
            goto L_0x0013
        L_0x0012:
            r0 = 0
        L_0x0013:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.Fragment.mo3789Z():boolean");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Z0 */
    public void mo3790Z0(boolean z) {
        mo3868z0(z);
        this.f2805C.mo4102H(z);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a0 */
    public boolean mo3791a0() {
        C1053e eVar = this.f2821S;
        if (eVar == null) {
            return false;
        }
        return eVar.f2883w;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a1 */
    public boolean mo3792a1(MenuItem menuItem) {
        if (this.f2810H) {
            return false;
        }
        if (!this.f2814L || !this.f2815M || !mo3737A0(menuItem)) {
            return this.f2805C.mo4106J(menuItem);
        }
        return true;
    }

    /* renamed from: b0 */
    public final boolean mo3793b0() {
        return this.f2849u;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b1 */
    public void mo3794b1(Menu menu) {
        if (!this.f2810H) {
            if (this.f2814L && this.f2815M) {
                mo3740B0(menu);
            }
            this.f2805C.mo4108K(menu);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c0 */
    public final boolean mo3795c0() {
        Fragment B = mo3739B();
        return B != null && (B.mo3793b0() || B.mo3795c0());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c1 */
    public void mo3796c1() {
        this.f2805C.mo4111M();
        if (this.f2818P != null) {
            this.f2839i0.mo3900a(C1208j.C1210b.ON_PAUSE);
        }
        this.f2837h0.mo4408h(C1208j.C1210b.ON_PAUSE);
        this.f2822a = 6;
        this.f2816N = false;
        mo3743C0();
        if (!this.f2816N) {
            throw new C1097e0("Fragment " + this + " did not call through to super.onPause()");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo3797d(boolean z) {
        ViewGroup viewGroup;
        C1114n nVar;
        C1053e eVar = this.f2821S;
        C1056h hVar = null;
        if (eVar != null) {
            eVar.f2883w = false;
            C1056h hVar2 = eVar.f2884x;
            eVar.f2884x = null;
            hVar = hVar2;
        }
        if (hVar != null) {
            hVar.mo3877b();
        } else if (C1114n.f3046P && this.f2818P != null && (viewGroup = this.f2817O) != null && (nVar = this.f2803A) != null) {
            C1077c0 n = C1077c0.m4861n(viewGroup, nVar);
            n.mo3950p();
            if (z) {
                this.f2804B.mo4067g().post(new C1051c(n));
            } else {
                n.mo3945g();
            }
        }
    }

    /* renamed from: d0 */
    public final boolean mo3798d0() {
        C1114n nVar = this.f2803A;
        if (nVar == null) {
            return false;
        }
        return nVar.mo4109K0();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d1 */
    public void mo3799d1(boolean z) {
        mo3746D0(z);
        this.f2805C.mo4113N(z);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public C1105g mo3800e() {
        return new C1052d();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000c, code lost:
        r0 = r1.f2818P;
     */
    /* renamed from: e0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo3801e0() {
        /*
            r1 = this;
            boolean r0 = r1.mo3781V()
            if (r0 == 0) goto L_0x0020
            boolean r0 = r1.mo3783W()
            if (r0 != 0) goto L_0x0020
            android.view.View r0 = r1.f2818P
            if (r0 == 0) goto L_0x0020
            android.os.IBinder r0 = r0.getWindowToken()
            if (r0 == 0) goto L_0x0020
            android.view.View r0 = r1.f2818P
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L_0x0020
            r0 = 1
            goto L_0x0021
        L_0x0020:
            r0 = 0
        L_0x0021:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.Fragment.mo3801e0():boolean");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e1 */
    public boolean mo3802e1(Menu menu) {
        boolean z = false;
        if (this.f2810H) {
            return false;
        }
        if (this.f2814L && this.f2815M) {
            z = true;
            mo3749E0(menu);
        }
        return z | this.f2805C.mo4114O(menu);
    }

    public final boolean equals(Object obj) {
        return super.equals(obj);
    }

    /* renamed from: f */
    public void mo3804f(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.print(str);
        printWriter.print("mFragmentId=#");
        printWriter.print(Integer.toHexString(this.f2807E));
        printWriter.print(" mContainerId=#");
        printWriter.print(Integer.toHexString(this.f2808F));
        printWriter.print(" mTag=");
        printWriter.println(this.f2809G);
        printWriter.print(str);
        printWriter.print("mState=");
        printWriter.print(this.f2822a);
        printWriter.print(" mWho=");
        printWriter.print(this.f2832f);
        printWriter.print(" mBackStackNesting=");
        printWriter.println(this.f2854z);
        printWriter.print(str);
        printWriter.print("mAdded=");
        printWriter.print(this.f2848t);
        printWriter.print(" mRemoving=");
        printWriter.print(this.f2849u);
        printWriter.print(" mFromLayout=");
        printWriter.print(this.f2850v);
        printWriter.print(" mInLayout=");
        printWriter.println(this.f2851w);
        printWriter.print(str);
        printWriter.print("mHidden=");
        printWriter.print(this.f2810H);
        printWriter.print(" mDetached=");
        printWriter.print(this.f2811I);
        printWriter.print(" mMenuVisible=");
        printWriter.print(this.f2815M);
        printWriter.print(" mHasMenu=");
        printWriter.println(this.f2814L);
        printWriter.print(str);
        printWriter.print("mRetainInstance=");
        printWriter.print(this.f2812J);
        printWriter.print(" mUserVisibleHint=");
        printWriter.println(this.f2820R);
        if (this.f2803A != null) {
            printWriter.print(str);
            printWriter.print("mFragmentManager=");
            printWriter.println(this.f2803A);
        }
        if (this.f2804B != null) {
            printWriter.print(str);
            printWriter.print("mHost=");
            printWriter.println(this.f2804B);
        }
        if (this.f2806D != null) {
            printWriter.print(str);
            printWriter.print("mParentFragment=");
            printWriter.println(this.f2806D);
        }
        if (this.f2834g != null) {
            printWriter.print(str);
            printWriter.print("mArguments=");
            printWriter.println(this.f2834g);
        }
        if (this.f2824b != null) {
            printWriter.print(str);
            printWriter.print("mSavedFragmentState=");
            printWriter.println(this.f2824b);
        }
        if (this.f2826c != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewState=");
            printWriter.println(this.f2826c);
        }
        if (this.f2828d != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewRegistryState=");
            printWriter.println(this.f2828d);
        }
        Fragment P = mo3771P();
        if (P != null) {
            printWriter.print(str);
            printWriter.print("mTarget=");
            printWriter.print(P);
            printWriter.print(" mTargetRequestCode=");
            printWriter.println(this.f2846r);
        }
        printWriter.print(str);
        printWriter.print("mPopDirection=");
        printWriter.println(mo3745D());
        if (mo3839q() != 0) {
            printWriter.print(str);
            printWriter.print("getEnterAnim=");
            printWriter.println(mo3839q());
        }
        if (mo3849t() != 0) {
            printWriter.print(str);
            printWriter.print("getExitAnim=");
            printWriter.println(mo3849t());
        }
        if (mo3748E() != 0) {
            printWriter.print(str);
            printWriter.print("getPopEnterAnim=");
            printWriter.println(mo3748E());
        }
        if (mo3751F() != 0) {
            printWriter.print(str);
            printWriter.print("getPopExitAnim=");
            printWriter.println(mo3751F());
        }
        if (this.f2817O != null) {
            printWriter.print(str);
            printWriter.print("mContainer=");
            printWriter.println(this.f2817O);
        }
        if (this.f2818P != null) {
            printWriter.print(str);
            printWriter.print("mView=");
            printWriter.println(this.f2818P);
        }
        if (mo3822l() != null) {
            printWriter.print(str);
            printWriter.print("mAnimatingAway=");
            printWriter.println(mo3822l());
        }
        if (mo3837p() != null) {
            C1242a.m5493b(this).mo4456a(str, fileDescriptor, printWriter, strArr);
        }
        printWriter.print(str);
        printWriter.println("Child " + this.f2805C + ":");
        C1114n nVar = this.f2805C;
        nVar.mo4128W(str + "  ", fileDescriptor, printWriter, strArr);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f0 */
    public void mo3805f0() {
        this.f2805C.mo4122S0();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f1 */
    public void mo3806f1() {
        boolean I0 = this.f2803A.mo4105I0(this);
        Boolean bool = this.f2847s;
        if (bool == null || bool.booleanValue() != I0) {
            this.f2847s = Boolean.valueOf(I0);
            mo3752F0(I0);
            this.f2805C.mo4116P();
        }
    }

    @Deprecated
    /* renamed from: g0 */
    public void mo3807g0(Bundle bundle) {
        this.f2816N = true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g1 */
    public void mo3808g1() {
        this.f2805C.mo4122S0();
        this.f2805C.mo4132a0(true);
        this.f2822a = 7;
        this.f2816N = false;
        mo3756H0();
        if (this.f2816N) {
            C1222o oVar = this.f2837h0;
            C1208j.C1210b bVar = C1208j.C1210b.ON_RESUME;
            oVar.mo4408h(bVar);
            if (this.f2818P != null) {
                this.f2839i0.mo3900a(bVar);
            }
            this.f2805C.mo4118Q();
            return;
        }
        throw new C1097e0("Fragment " + this + " did not call through to super.onResume()");
    }

    public /* synthetic */ C4298a getDefaultViewModelCreationExtras() {
        return C1195h.m5402a(this);
    }

    public C1208j getLifecycle() {
        return this.f2837h0;
    }

    public final C5140c getSavedStateRegistry() {
        return this.f2842l0.mo19113b();
    }

    public C1215k0 getViewModelStore() {
        if (this.f2803A == null) {
            throw new IllegalStateException("Can't access ViewModels from detached fragment");
        } else if (m4671z() != C1208j.C1211c.INITIALIZED.ordinal()) {
            return this.f2803A.mo4091A0(this);
        } else {
            throw new IllegalStateException("Calling getViewModelStore() before a Fragment reaches onCreate() when using setMaxLifecycle(INITIALIZED) is not supported");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public Fragment mo3809h(String str) {
        if (str.equals(this.f2832f)) {
            return this;
        }
        return this.f2805C.mo4150j0(str);
    }

    @Deprecated
    /* renamed from: h0 */
    public void mo3810h0(int i, int i2, Intent intent) {
        if (C1114n.m4999F0(2)) {
            Log.v("FragmentManager", "Fragment " + this + " received the following in onActivityResult(): requestCode: " + i + " resultCode: " + i2 + " data: " + intent);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h1 */
    public void mo3811h1(Bundle bundle) {
        mo3758I0(bundle);
        this.f2842l0.mo19116e(bundle);
        Parcelable h1 = this.f2805C.mo4145h1();
        if (h1 != null) {
            bundle.putParcelable("android:support:fragments", h1);
        }
    }

    public final int hashCode() {
        return super.hashCode();
    }

    /* renamed from: i */
    public final C1093e mo3813i() {
        C1109k<?> kVar = this.f2804B;
        if (kVar == null) {
            return null;
        }
        return (C1093e) kVar.mo4065e();
    }

    @Deprecated
    /* renamed from: i0 */
    public void mo3814i0(Activity activity) {
        this.f2816N = true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i1 */
    public void mo3815i1() {
        this.f2805C.mo4122S0();
        this.f2805C.mo4132a0(true);
        this.f2822a = 5;
        this.f2816N = false;
        mo3760J0();
        if (this.f2816N) {
            C1222o oVar = this.f2837h0;
            C1208j.C1210b bVar = C1208j.C1210b.ON_START;
            oVar.mo4408h(bVar);
            if (this.f2818P != null) {
                this.f2839i0.mo3900a(bVar);
            }
            this.f2805C.mo4120R();
            return;
        }
        throw new C1097e0("Fragment " + this + " did not call through to super.onStart()");
    }

    /* renamed from: j */
    public boolean mo3816j() {
        Boolean bool;
        C1053e eVar = this.f2821S;
        if (eVar == null || (bool = eVar.f2878r) == null) {
            return true;
        }
        return bool.booleanValue();
    }

    /* renamed from: j0 */
    public void mo3817j0(Context context) {
        this.f2816N = true;
        C1109k<?> kVar = this.f2804B;
        Activity e = kVar == null ? null : kVar.mo4065e();
        if (e != null) {
            this.f2816N = false;
            mo3814i0(e);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j1 */
    public void mo3818j1() {
        this.f2805C.mo4123T();
        if (this.f2818P != null) {
            this.f2839i0.mo3900a(C1208j.C1210b.ON_STOP);
        }
        this.f2837h0.mo4408h(C1208j.C1210b.ON_STOP);
        this.f2822a = 4;
        this.f2816N = false;
        mo3762K0();
        if (!this.f2816N) {
            throw new C1097e0("Fragment " + this + " did not call through to super.onStop()");
        }
    }

    /* renamed from: k */
    public boolean mo3819k() {
        Boolean bool;
        C1053e eVar = this.f2821S;
        if (eVar == null || (bool = eVar.f2877q) == null) {
            return true;
        }
        return bool.booleanValue();
    }

    @Deprecated
    /* renamed from: k0 */
    public void mo3820k0(Fragment fragment) {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k1 */
    public void mo3821k1() {
        mo3764L0(this.f2818P, this.f2824b);
        this.f2805C.mo4125U();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public View mo3822l() {
        C1053e eVar = this.f2821S;
        if (eVar == null) {
            return null;
        }
        return eVar.f2861a;
    }

    /* renamed from: l0 */
    public boolean mo3823l0(MenuItem menuItem) {
        return false;
    }

    /* renamed from: l1 */
    public final C1093e mo3824l1() {
        C1093e i = mo3813i();
        if (i != null) {
            return i;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to an activity.");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public Animator mo3825m() {
        C1053e eVar = this.f2821S;
        if (eVar == null) {
            return null;
        }
        return eVar.f2862b;
    }

    /* renamed from: m0 */
    public void mo3826m0(Bundle bundle) {
        this.f2816N = true;
        mo3833o1(bundle);
        if (!this.f2805C.mo4107J0(1)) {
            this.f2805C.mo4094C();
        }
    }

    /* renamed from: m1 */
    public final Context mo3827m1() {
        Context p = mo3837p();
        if (p != null) {
            return p;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to a context.");
    }

    /* renamed from: n */
    public final Bundle mo3828n() {
        return this.f2834g;
    }

    /* renamed from: n0 */
    public Animation mo3829n0(int i, boolean z, int i2) {
        return null;
    }

    /* renamed from: n1 */
    public final View mo3830n1() {
        View Q = mo3773Q();
        if (Q != null) {
            return Q;
        }
        throw new IllegalStateException("Fragment " + this + " did not return a View from onCreateView() or this was called before onCreateView().");
    }

    /* renamed from: o */
    public final C1114n mo3831o() {
        if (this.f2804B != null) {
            return this.f2805C;
        }
        throw new IllegalStateException("Fragment " + this + " has not been attached yet.");
    }

    /* renamed from: o0 */
    public Animator mo3832o0(int i, boolean z, int i2) {
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o1 */
    public void mo3833o1(Bundle bundle) {
        Parcelable parcelable;
        if (bundle != null && (parcelable = bundle.getParcelable("android:support:fragments")) != null) {
            this.f2805C.mo4140f1(parcelable);
            this.f2805C.mo4094C();
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        this.f2816N = true;
    }

    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        mo3824l1().onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    public void onLowMemory() {
        this.f2816N = true;
    }

    /* renamed from: p */
    public Context mo3837p() {
        C1109k<?> kVar = this.f2804B;
        if (kVar == null) {
            return null;
        }
        return kVar.mo4066f();
    }

    /* renamed from: p0 */
    public void mo3838p0(Menu menu, MenuInflater menuInflater) {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public int mo3839q() {
        C1053e eVar = this.f2821S;
        if (eVar == null) {
            return 0;
        }
        return eVar.f2864d;
    }

    /* renamed from: q0 */
    public View mo3840q0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i = this.f2843m0;
        if (i != 0) {
            return layoutInflater.inflate(i, viewGroup, false);
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q1 */
    public final void mo3841q1(Bundle bundle) {
        SparseArray<Parcelable> sparseArray = this.f2826c;
        if (sparseArray != null) {
            this.f2818P.restoreHierarchyState(sparseArray);
            this.f2826c = null;
        }
        if (this.f2818P != null) {
            this.f2839i0.mo3903d(this.f2828d);
            this.f2828d = null;
        }
        this.f2816N = false;
        mo3766M0(bundle);
        if (!this.f2816N) {
            throw new C1097e0("Fragment " + this + " did not call through to super.onViewStateRestored()");
        } else if (this.f2818P != null) {
            this.f2839i0.mo3900a(C1208j.C1210b.ON_CREATE);
        }
    }

    /* renamed from: r */
    public Object mo3842r() {
        C1053e eVar = this.f2821S;
        if (eVar == null) {
            return null;
        }
        return eVar.f2871k;
    }

    /* renamed from: r0 */
    public void mo3843r0() {
        this.f2816N = true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r1 */
    public void mo3844r1(View view) {
        m4669g().f2861a = view;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public C0678s mo3845s() {
        C1053e eVar = this.f2821S;
        if (eVar == null) {
            return null;
        }
        return eVar.f2879s;
    }

    /* renamed from: s0 */
    public void mo3846s0() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s1 */
    public void mo3847s1(int i, int i2, int i3, int i4) {
        if (this.f2821S != null || i != 0 || i2 != 0 || i3 != 0 || i4 != 0) {
            m4669g().f2864d = i;
            m4669g().f2865e = i2;
            m4669g().f2866f = i3;
            m4669g().f2867g = i4;
        }
    }

    @Deprecated
    public void startActivityForResult(Intent intent, int i) {
        mo3744C1(intent, i, (Bundle) null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public int mo3849t() {
        C1053e eVar = this.f2821S;
        if (eVar == null) {
            return 0;
        }
        return eVar.f2865e;
    }

    /* renamed from: t0 */
    public void mo3850t0() {
        this.f2816N = true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t1 */
    public void mo3851t1(Animator animator) {
        m4669g().f2862b = animator;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append(getClass().getSimpleName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("}");
        sb.append(" (");
        sb.append(this.f2832f);
        if (this.f2807E != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.f2807E));
        }
        if (this.f2809G != null) {
            sb.append(" tag=");
            sb.append(this.f2809G);
        }
        sb.append(")");
        return sb.toString();
    }

    /* renamed from: u */
    public Object mo3853u() {
        C1053e eVar = this.f2821S;
        if (eVar == null) {
            return null;
        }
        return eVar.f2873m;
    }

    /* renamed from: u0 */
    public void mo3854u0() {
        this.f2816N = true;
    }

    /* renamed from: u1 */
    public void mo3855u1(Bundle bundle) {
        if (this.f2803A == null || !mo3798d0()) {
            this.f2834g = bundle;
            return;
        }
        throw new IllegalStateException("Fragment already added and state has been saved");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: v */
    public C0678s mo3856v() {
        C1053e eVar = this.f2821S;
        if (eVar == null) {
            return null;
        }
        return eVar.f2880t;
    }

    /* renamed from: v0 */
    public LayoutInflater mo3857v0(Bundle bundle) {
        return mo3865y(bundle);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: v1 */
    public void mo3858v1(View view) {
        m4669g().f2882v = view;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: w */
    public View mo3859w() {
        C1053e eVar = this.f2821S;
        if (eVar == null) {
            return null;
        }
        return eVar.f2882v;
    }

    /* renamed from: w0 */
    public void mo3860w0(boolean z) {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: w1 */
    public void mo3861w1(boolean z) {
        m4669g().f2885y = z;
    }

    /* renamed from: x */
    public final Object mo3862x() {
        C1109k<?> kVar = this.f2804B;
        if (kVar == null) {
            return null;
        }
        return kVar.mo4009h();
    }

    @Deprecated
    /* renamed from: x0 */
    public void mo3863x0(Activity activity, AttributeSet attributeSet, Bundle bundle) {
        this.f2816N = true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: x1 */
    public void mo3864x1(int i) {
        if (this.f2821S != null || i != 0) {
            m4669g();
            this.f2821S.f2868h = i;
        }
    }

    @Deprecated
    /* renamed from: y */
    public LayoutInflater mo3865y(Bundle bundle) {
        C1109k<?> kVar = this.f2804B;
        if (kVar != null) {
            LayoutInflater i = kVar.mo4010i();
            C0908g.m4110b(i, this.f2805C.mo4168u0());
            return i;
        }
        throw new IllegalStateException("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
    }

    /* renamed from: y0 */
    public void mo3866y0(Context context, AttributeSet attributeSet, Bundle bundle) {
        this.f2816N = true;
        C1109k<?> kVar = this.f2804B;
        Activity e = kVar == null ? null : kVar.mo4065e();
        if (e != null) {
            this.f2816N = false;
            mo3863x0(e, attributeSet, bundle);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: y1 */
    public void mo3867y1(C1056h hVar) {
        m4669g();
        C1053e eVar = this.f2821S;
        C1056h hVar2 = eVar.f2884x;
        if (hVar != hVar2) {
            if (hVar == null || hVar2 == null) {
                if (eVar.f2883w) {
                    eVar.f2884x = hVar;
                }
                if (hVar != null) {
                    hVar.mo3876a();
                    return;
                }
                return;
            }
            throw new IllegalStateException("Trying to set a replacement startPostponedEnterTransition on " + this);
        }
    }

    /* renamed from: z0 */
    public void mo3868z0(boolean z) {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: z1 */
    public void mo3869z1(boolean z) {
        if (this.f2821S != null) {
            m4669g().f2863c = z;
        }
    }
}
