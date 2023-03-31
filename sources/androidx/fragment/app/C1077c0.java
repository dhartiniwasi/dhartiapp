package androidx.fragment.app;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.p010os.C0763e;
import androidx.core.view.C0835a0;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import p019c0.C1834b;

/* renamed from: androidx.fragment.app.c0 */
/* compiled from: SpecialEffectsController */
abstract class C1077c0 {

    /* renamed from: a */
    private final ViewGroup f2955a;

    /* renamed from: b */
    final ArrayList<C1082e> f2956b = new ArrayList<>();

    /* renamed from: c */
    final ArrayList<C1082e> f2957c = new ArrayList<>();

    /* renamed from: d */
    boolean f2958d = false;

    /* renamed from: e */
    boolean f2959e = false;

    /* renamed from: androidx.fragment.app.c0$a */
    /* compiled from: SpecialEffectsController */
    class C1078a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C1081d f2960a;

        C1078a(C1081d dVar) {
            this.f2960a = dVar;
        }

        public void run() {
            if (C1077c0.this.f2956b.contains(this.f2960a)) {
                this.f2960a.mo3959e().mo3967a(this.f2960a.mo3960f().f2818P);
            }
        }
    }

    /* renamed from: androidx.fragment.app.c0$b */
    /* compiled from: SpecialEffectsController */
    class C1079b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C1081d f2962a;

        C1079b(C1081d dVar) {
            this.f2962a = dVar;
        }

        public void run() {
            C1077c0.this.f2956b.remove(this.f2962a);
            C1077c0.this.f2957c.remove(this.f2962a);
        }
    }

    /* renamed from: androidx.fragment.app.c0$c */
    /* compiled from: SpecialEffectsController */
    static /* synthetic */ class C1080c {

        /* renamed from: a */
        static final /* synthetic */ int[] f2964a;

        /* renamed from: b */
        static final /* synthetic */ int[] f2965b;

        /* JADX WARNING: Can't wrap try/catch for region: R(17:0|(2:1|2)|3|(2:5|6)|7|9|10|11|13|14|15|16|17|18|19|20|22) */
        /* JADX WARNING: Can't wrap try/catch for region: R(19:0|1|2|3|5|6|7|9|10|11|13|14|15|16|17|18|19|20|22) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0039 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0043 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x004d */
        static {
            /*
                androidx.fragment.app.c0$e$b[] r0 = androidx.fragment.app.C1077c0.C1082e.C1084b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f2965b = r0
                r1 = 1
                androidx.fragment.app.c0$e$b r2 = androidx.fragment.app.C1077c0.C1082e.C1084b.ADDING     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = f2965b     // Catch:{ NoSuchFieldError -> 0x001d }
                androidx.fragment.app.c0$e$b r3 = androidx.fragment.app.C1077c0.C1082e.C1084b.REMOVING     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                r2 = 3
                int[] r3 = f2965b     // Catch:{ NoSuchFieldError -> 0x0028 }
                androidx.fragment.app.c0$e$b r4 = androidx.fragment.app.C1077c0.C1082e.C1084b.NONE     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                androidx.fragment.app.c0$e$c[] r3 = androidx.fragment.app.C1077c0.C1082e.C1085c.values()
                int r3 = r3.length
                int[] r3 = new int[r3]
                f2964a = r3
                androidx.fragment.app.c0$e$c r4 = androidx.fragment.app.C1077c0.C1082e.C1085c.REMOVED     // Catch:{ NoSuchFieldError -> 0x0039 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0039 }
                r3[r4] = r1     // Catch:{ NoSuchFieldError -> 0x0039 }
            L_0x0039:
                int[] r1 = f2964a     // Catch:{ NoSuchFieldError -> 0x0043 }
                androidx.fragment.app.c0$e$c r3 = androidx.fragment.app.C1077c0.C1082e.C1085c.VISIBLE     // Catch:{ NoSuchFieldError -> 0x0043 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0043 }
                r1[r3] = r0     // Catch:{ NoSuchFieldError -> 0x0043 }
            L_0x0043:
                int[] r0 = f2964a     // Catch:{ NoSuchFieldError -> 0x004d }
                androidx.fragment.app.c0$e$c r1 = androidx.fragment.app.C1077c0.C1082e.C1085c.GONE     // Catch:{ NoSuchFieldError -> 0x004d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x004d }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x004d }
            L_0x004d:
                int[] r0 = f2964a     // Catch:{ NoSuchFieldError -> 0x0058 }
                androidx.fragment.app.c0$e$c r1 = androidx.fragment.app.C1077c0.C1082e.C1085c.INVISIBLE     // Catch:{ NoSuchFieldError -> 0x0058 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0058 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0058 }
            L_0x0058:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.C1077c0.C1080c.<clinit>():void");
        }
    }

    /* renamed from: androidx.fragment.app.c0$d */
    /* compiled from: SpecialEffectsController */
    private static class C1081d extends C1082e {

        /* renamed from: h */
        private final C1142u f2966h;

        C1081d(C1082e.C1085c cVar, C1082e.C1084b bVar, C1142u uVar, C0763e eVar) {
            super(cVar, bVar, uVar.mo4252k(), eVar);
            this.f2966h = uVar;
        }

        /* renamed from: c */
        public void mo3954c() {
            super.mo3954c();
            this.f2966h.mo4253m();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: l */
        public void mo3955l() {
            if (mo3961g() == C1082e.C1084b.ADDING) {
                Fragment k = this.f2966h.mo4252k();
                View findFocus = k.f2818P.findFocus();
                if (findFocus != null) {
                    k.mo3858v1(findFocus);
                    if (C1114n.m4999F0(2)) {
                        Log.v("FragmentManager", "requestFocus: Saved focused view " + findFocus + " for Fragment " + k);
                    }
                }
                View n1 = mo3960f().mo3830n1();
                if (n1.getParent() == null) {
                    this.f2966h.mo4243b();
                    n1.setAlpha(0.0f);
                }
                if (n1.getAlpha() == 0.0f && n1.getVisibility() == 0) {
                    n1.setVisibility(4);
                }
                n1.setAlpha(k.mo3753G());
            }
        }
    }

    /* renamed from: androidx.fragment.app.c0$e */
    /* compiled from: SpecialEffectsController */
    static class C1082e {

        /* renamed from: a */
        private C1085c f2967a;

        /* renamed from: b */
        private C1084b f2968b;

        /* renamed from: c */
        private final Fragment f2969c;

        /* renamed from: d */
        private final List<Runnable> f2970d = new ArrayList();

        /* renamed from: e */
        private final HashSet<C0763e> f2971e = new HashSet<>();

        /* renamed from: f */
        private boolean f2972f = false;

        /* renamed from: g */
        private boolean f2973g = false;

        /* renamed from: androidx.fragment.app.c0$e$a */
        /* compiled from: SpecialEffectsController */
        class C1083a implements C0763e.C0765b {
            C1083a() {
            }

            /* renamed from: a */
            public void mo3142a() {
                C1082e.this.mo3957b();
            }
        }

        /* renamed from: androidx.fragment.app.c0$e$b */
        /* compiled from: SpecialEffectsController */
        enum C1084b {
            NONE,
            ADDING,
            REMOVING
        }

        /* renamed from: androidx.fragment.app.c0$e$c */
        /* compiled from: SpecialEffectsController */
        enum C1085c {
            REMOVED,
            VISIBLE,
            GONE,
            INVISIBLE;

            /* renamed from: b */
            static C1085c m4891b(int i) {
                if (i == 0) {
                    return VISIBLE;
                }
                if (i == 4) {
                    return INVISIBLE;
                }
                if (i == 8) {
                    return GONE;
                }
                throw new IllegalArgumentException("Unknown visibility " + i);
            }

            /* renamed from: c */
            static C1085c m4892c(View view) {
                if (view.getAlpha() == 0.0f && view.getVisibility() == 0) {
                    return INVISIBLE;
                }
                return m4891b(view.getVisibility());
            }

            /* access modifiers changed from: package-private */
            /* renamed from: a */
            public void mo3967a(View view) {
                int i = C1080c.f2964a[ordinal()];
                if (i == 1) {
                    ViewGroup viewGroup = (ViewGroup) view.getParent();
                    if (viewGroup != null) {
                        if (C1114n.m4999F0(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Removing view " + view + " from container " + viewGroup);
                        }
                        viewGroup.removeView(view);
                    }
                } else if (i == 2) {
                    if (C1114n.m4999F0(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to VISIBLE");
                    }
                    view.setVisibility(0);
                } else if (i == 3) {
                    if (C1114n.m4999F0(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to GONE");
                    }
                    view.setVisibility(8);
                } else if (i == 4) {
                    if (C1114n.m4999F0(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to INVISIBLE");
                    }
                    view.setVisibility(4);
                }
            }
        }

        C1082e(C1085c cVar, C1084b bVar, Fragment fragment, C0763e eVar) {
            this.f2967a = cVar;
            this.f2968b = bVar;
            this.f2969c = fragment;
            eVar.mo3141c(new C1083a());
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final void mo3956a(Runnable runnable) {
            this.f2970d.add(runnable);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public final void mo3957b() {
            if (!mo3962h()) {
                this.f2972f = true;
                if (this.f2971e.isEmpty()) {
                    mo3954c();
                    return;
                }
                Iterator it = new ArrayList(this.f2971e).iterator();
                while (it.hasNext()) {
                    ((C0763e) it.next()).mo3139a();
                }
            }
        }

        /* renamed from: c */
        public void mo3954c() {
            if (!this.f2973g) {
                if (C1114n.m4999F0(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: " + this + " has called complete.");
                }
                this.f2973g = true;
                for (Runnable run : this.f2970d) {
                    run.run();
                }
            }
        }

        /* renamed from: d */
        public final void mo3958d(C0763e eVar) {
            if (this.f2971e.remove(eVar) && this.f2971e.isEmpty()) {
                mo3954c();
            }
        }

        /* renamed from: e */
        public C1085c mo3959e() {
            return this.f2967a;
        }

        /* renamed from: f */
        public final Fragment mo3960f() {
            return this.f2969c;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: g */
        public C1084b mo3961g() {
            return this.f2968b;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: h */
        public final boolean mo3962h() {
            return this.f2972f;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: i */
        public final boolean mo3963i() {
            return this.f2973g;
        }

        /* renamed from: j */
        public final void mo3964j(C0763e eVar) {
            mo3955l();
            this.f2971e.add(eVar);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: k */
        public final void mo3965k(C1085c cVar, C1084b bVar) {
            int i = C1080c.f2965b[bVar.ordinal()];
            if (i != 1) {
                if (i == 2) {
                    if (C1114n.m4999F0(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: For fragment " + this.f2969c + " mFinalState = " + this.f2967a + " -> REMOVED. mLifecycleImpact  = " + this.f2968b + " to REMOVING.");
                    }
                    this.f2967a = C1085c.REMOVED;
                    this.f2968b = C1084b.REMOVING;
                } else if (i == 3 && this.f2967a != C1085c.REMOVED) {
                    if (C1114n.m4999F0(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: For fragment " + this.f2969c + " mFinalState = " + this.f2967a + " -> " + cVar + ". ");
                    }
                    this.f2967a = cVar;
                }
            } else if (this.f2967a == C1085c.REMOVED) {
                if (C1114n.m4999F0(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: For fragment " + this.f2969c + " mFinalState = REMOVED -> VISIBLE. mLifecycleImpact = " + this.f2968b + " to ADDING.");
                }
                this.f2967a = C1085c.VISIBLE;
                this.f2968b = C1084b.ADDING;
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: l */
        public void mo3955l() {
        }

        public String toString() {
            return "Operation " + "{" + Integer.toHexString(System.identityHashCode(this)) + "} " + "{" + "mFinalState = " + this.f2967a + "} " + "{" + "mLifecycleImpact = " + this.f2968b + "} " + "{" + "mFragment = " + this.f2969c + "}";
        }
    }

    C1077c0(ViewGroup viewGroup) {
        this.f2955a = viewGroup;
    }

    /* renamed from: a */
    private void m4858a(C1082e.C1085c cVar, C1082e.C1084b bVar, C1142u uVar) {
        synchronized (this.f2956b) {
            C0763e eVar = new C0763e();
            C1082e h = m4859h(uVar.mo4252k());
            if (h != null) {
                h.mo3965k(cVar, bVar);
                return;
            }
            C1081d dVar = new C1081d(cVar, bVar, uVar, eVar);
            this.f2956b.add(dVar);
            dVar.mo3956a(new C1078a(dVar));
            dVar.mo3956a(new C1079b(dVar));
        }
    }

    /* renamed from: h */
    private C1082e m4859h(Fragment fragment) {
        Iterator<C1082e> it = this.f2956b.iterator();
        while (it.hasNext()) {
            C1082e next = it.next();
            if (next.mo3960f().equals(fragment) && !next.mo3962h()) {
                return next;
            }
        }
        return null;
    }

    /* renamed from: i */
    private C1082e m4860i(Fragment fragment) {
        Iterator<C1082e> it = this.f2957c.iterator();
        while (it.hasNext()) {
            C1082e next = it.next();
            if (next.mo3960f().equals(fragment) && !next.mo3962h()) {
                return next;
            }
        }
        return null;
    }

    /* renamed from: n */
    static C1077c0 m4861n(ViewGroup viewGroup, C1114n nVar) {
        return m4862o(viewGroup, nVar.mo4175y0());
    }

    /* renamed from: o */
    static C1077c0 m4862o(ViewGroup viewGroup, C1092d0 d0Var) {
        int i = C1834b.f5382b;
        Object tag = viewGroup.getTag(i);
        if (tag instanceof C1077c0) {
            return (C1077c0) tag;
        }
        C1077c0 a = d0Var.mo3985a(viewGroup);
        viewGroup.setTag(i, a);
        return a;
    }

    /* renamed from: q */
    private void m4863q() {
        Iterator<C1082e> it = this.f2956b.iterator();
        while (it.hasNext()) {
            C1082e next = it.next();
            if (next.mo3961g() == C1082e.C1084b.ADDING) {
                next.mo3965k(C1082e.C1085c.m4891b(next.mo3960f().mo3830n1().getVisibility()), C1082e.C1084b.NONE);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo3941b(C1082e.C1085c cVar, C1142u uVar) {
        if (C1114n.m4999F0(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Enqueuing add operation for fragment " + uVar.mo4252k());
        }
        m4858a(cVar, C1082e.C1084b.ADDING, uVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo3942c(C1142u uVar) {
        if (C1114n.m4999F0(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Enqueuing hide operation for fragment " + uVar.mo4252k());
        }
        m4858a(C1082e.C1085c.GONE, C1082e.C1084b.NONE, uVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo3943d(C1142u uVar) {
        if (C1114n.m4999F0(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Enqueuing remove operation for fragment " + uVar.mo4252k());
        }
        m4858a(C1082e.C1085c.REMOVED, C1082e.C1084b.REMOVING, uVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo3944e(C1142u uVar) {
        if (C1114n.m4999F0(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Enqueuing show operation for fragment " + uVar.mo4252k());
        }
        m4858a(C1082e.C1085c.VISIBLE, C1082e.C1084b.NONE, uVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public abstract void mo3916f(List<C1082e> list, boolean z);

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public void mo3945g() {
        if (!this.f2959e) {
            if (!C0835a0.m3704Q(this.f2955a)) {
                mo3946j();
                this.f2958d = false;
                return;
            }
            synchronized (this.f2956b) {
                if (!this.f2956b.isEmpty()) {
                    ArrayList arrayList = new ArrayList(this.f2957c);
                    this.f2957c.clear();
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        C1082e eVar = (C1082e) it.next();
                        if (C1114n.m4999F0(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Cancelling operation " + eVar);
                        }
                        eVar.mo3957b();
                        if (!eVar.mo3963i()) {
                            this.f2957c.add(eVar);
                        }
                    }
                    m4863q();
                    ArrayList arrayList2 = new ArrayList(this.f2956b);
                    this.f2956b.clear();
                    this.f2957c.addAll(arrayList2);
                    Iterator it2 = arrayList2.iterator();
                    while (it2.hasNext()) {
                        ((C1082e) it2.next()).mo3955l();
                    }
                    mo3916f(arrayList2, this.f2958d);
                    this.f2958d = false;
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public void mo3946j() {
        String str;
        String str2;
        boolean Q = C0835a0.m3704Q(this.f2955a);
        synchronized (this.f2956b) {
            m4863q();
            Iterator<C1082e> it = this.f2956b.iterator();
            while (it.hasNext()) {
                it.next().mo3955l();
            }
            Iterator it2 = new ArrayList(this.f2957c).iterator();
            while (it2.hasNext()) {
                C1082e eVar = (C1082e) it2.next();
                if (C1114n.m4999F0(2)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("SpecialEffectsController: ");
                    if (Q) {
                        str2 = "";
                    } else {
                        str2 = "Container " + this.f2955a + " is not attached to window. ";
                    }
                    sb.append(str2);
                    sb.append("Cancelling running operation ");
                    sb.append(eVar);
                    Log.v("FragmentManager", sb.toString());
                }
                eVar.mo3957b();
            }
            Iterator it3 = new ArrayList(this.f2956b).iterator();
            while (it3.hasNext()) {
                C1082e eVar2 = (C1082e) it3.next();
                if (C1114n.m4999F0(2)) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("SpecialEffectsController: ");
                    if (Q) {
                        str = "";
                    } else {
                        str = "Container " + this.f2955a + " is not attached to window. ";
                    }
                    sb2.append(str);
                    sb2.append("Cancelling pending operation ");
                    sb2.append(eVar2);
                    Log.v("FragmentManager", sb2.toString());
                }
                eVar2.mo3957b();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public void mo3947k() {
        if (this.f2959e) {
            this.f2959e = false;
            mo3945g();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public C1082e.C1084b mo3948l(C1142u uVar) {
        C1082e h = m4859h(uVar.mo4252k());
        C1082e.C1084b g = h != null ? h.mo3961g() : null;
        C1082e i = m4860i(uVar.mo4252k());
        return (i == null || !(g == null || g == C1082e.C1084b.NONE)) ? g : i.mo3961g();
    }

    /* renamed from: m */
    public ViewGroup mo3949m() {
        return this.f2955a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public void mo3950p() {
        synchronized (this.f2956b) {
            m4863q();
            this.f2959e = false;
            int size = this.f2956b.size() - 1;
            while (true) {
                if (size < 0) {
                    break;
                }
                C1082e eVar = this.f2956b.get(size);
                C1082e.C1085c c = C1082e.C1085c.m4892c(eVar.mo3960f().f2818P);
                C1082e.C1085c e = eVar.mo3959e();
                C1082e.C1085c cVar = C1082e.C1085c.VISIBLE;
                if (e == cVar && c != cVar) {
                    this.f2959e = eVar.mo3960f().mo3791a0();
                    break;
                }
                size--;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public void mo3951r(boolean z) {
        this.f2958d = z;
    }
}
