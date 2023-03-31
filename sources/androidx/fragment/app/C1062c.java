package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.graphics.Rect;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.core.p010os.C0763e;
import androidx.core.util.C0831h;
import androidx.core.view.C0835a0;
import androidx.core.view.C0899d0;
import androidx.core.view.C0956x;
import androidx.fragment.app.C1077c0;
import androidx.fragment.app.C1098f;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p124r.C5413a;

/* renamed from: androidx.fragment.app.c */
/* compiled from: DefaultSpecialEffectsController */
class C1062c extends C1077c0 {

    /* renamed from: androidx.fragment.app.c$a */
    /* compiled from: DefaultSpecialEffectsController */
    static /* synthetic */ class C1063a {

        /* renamed from: a */
        static final /* synthetic */ int[] f2913a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                androidx.fragment.app.c0$e$c[] r0 = androidx.fragment.app.C1077c0.C1082e.C1085c.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f2913a = r0
                androidx.fragment.app.c0$e$c r1 = androidx.fragment.app.C1077c0.C1082e.C1085c.GONE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f2913a     // Catch:{ NoSuchFieldError -> 0x001d }
                androidx.fragment.app.c0$e$c r1 = androidx.fragment.app.C1077c0.C1082e.C1085c.INVISIBLE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f2913a     // Catch:{ NoSuchFieldError -> 0x0028 }
                androidx.fragment.app.c0$e$c r1 = androidx.fragment.app.C1077c0.C1082e.C1085c.REMOVED     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f2913a     // Catch:{ NoSuchFieldError -> 0x0033 }
                androidx.fragment.app.c0$e$c r1 = androidx.fragment.app.C1077c0.C1082e.C1085c.VISIBLE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.C1062c.C1063a.<clinit>():void");
        }
    }

    /* renamed from: androidx.fragment.app.c$b */
    /* compiled from: DefaultSpecialEffectsController */
    class C1064b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ List f2914a;

        /* renamed from: b */
        final /* synthetic */ C1077c0.C1082e f2915b;

        C1064b(List list, C1077c0.C1082e eVar) {
            this.f2914a = list;
            this.f2915b = eVar;
        }

        public void run() {
            if (this.f2914a.contains(this.f2915b)) {
                this.f2914a.remove(this.f2915b);
                C1062c.this.mo3917s(this.f2915b);
            }
        }
    }

    /* renamed from: androidx.fragment.app.c$c */
    /* compiled from: DefaultSpecialEffectsController */
    class C1065c extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ ViewGroup f2917a;

        /* renamed from: b */
        final /* synthetic */ View f2918b;

        /* renamed from: c */
        final /* synthetic */ boolean f2919c;

        /* renamed from: d */
        final /* synthetic */ C1077c0.C1082e f2920d;

        /* renamed from: e */
        final /* synthetic */ C1074k f2921e;

        C1065c(ViewGroup viewGroup, View view, boolean z, C1077c0.C1082e eVar, C1074k kVar) {
            this.f2917a = viewGroup;
            this.f2918b = view;
            this.f2919c = z;
            this.f2920d = eVar;
            this.f2921e = kVar;
        }

        public void onAnimationEnd(Animator animator) {
            this.f2917a.endViewTransition(this.f2918b);
            if (this.f2919c) {
                this.f2920d.mo3959e().mo3967a(this.f2918b);
            }
            this.f2921e.mo3932a();
        }
    }

    /* renamed from: androidx.fragment.app.c$d */
    /* compiled from: DefaultSpecialEffectsController */
    class C1066d implements C0763e.C0765b {

        /* renamed from: a */
        final /* synthetic */ Animator f2923a;

        C1066d(Animator animator) {
            this.f2923a = animator;
        }

        /* renamed from: a */
        public void mo3142a() {
            this.f2923a.end();
        }
    }

    /* renamed from: androidx.fragment.app.c$e */
    /* compiled from: DefaultSpecialEffectsController */
    class C1067e implements Animation.AnimationListener {

        /* renamed from: a */
        final /* synthetic */ ViewGroup f2925a;

        /* renamed from: b */
        final /* synthetic */ View f2926b;

        /* renamed from: c */
        final /* synthetic */ C1074k f2927c;

        /* renamed from: androidx.fragment.app.c$e$a */
        /* compiled from: DefaultSpecialEffectsController */
        class C1068a implements Runnable {
            C1068a() {
            }

            public void run() {
                C1067e eVar = C1067e.this;
                eVar.f2925a.endViewTransition(eVar.f2926b);
                C1067e.this.f2927c.mo3932a();
            }
        }

        C1067e(ViewGroup viewGroup, View view, C1074k kVar) {
            this.f2925a = viewGroup;
            this.f2926b = view;
            this.f2927c = kVar;
        }

        public void onAnimationEnd(Animation animation) {
            this.f2925a.post(new C1068a());
        }

        public void onAnimationRepeat(Animation animation) {
        }

        public void onAnimationStart(Animation animation) {
        }
    }

    /* renamed from: androidx.fragment.app.c$f */
    /* compiled from: DefaultSpecialEffectsController */
    class C1069f implements C0763e.C0765b {

        /* renamed from: a */
        final /* synthetic */ View f2930a;

        /* renamed from: b */
        final /* synthetic */ ViewGroup f2931b;

        /* renamed from: c */
        final /* synthetic */ C1074k f2932c;

        C1069f(View view, ViewGroup viewGroup, C1074k kVar) {
            this.f2930a = view;
            this.f2931b = viewGroup;
            this.f2932c = kVar;
        }

        /* renamed from: a */
        public void mo3142a() {
            this.f2930a.clearAnimation();
            this.f2931b.endViewTransition(this.f2930a);
            this.f2932c.mo3932a();
        }
    }

    /* renamed from: androidx.fragment.app.c$g */
    /* compiled from: DefaultSpecialEffectsController */
    class C1070g implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C1077c0.C1082e f2934a;

        /* renamed from: b */
        final /* synthetic */ C1077c0.C1082e f2935b;

        /* renamed from: c */
        final /* synthetic */ boolean f2936c;

        /* renamed from: d */
        final /* synthetic */ C5413a f2937d;

        C1070g(C1077c0.C1082e eVar, C1077c0.C1082e eVar2, boolean z, C5413a aVar) {
            this.f2934a = eVar;
            this.f2935b = eVar2;
            this.f2936c = z;
            this.f2937d = aVar;
        }

        public void run() {
            C1148x.m5247f(this.f2934a.mo3960f(), this.f2935b.mo3960f(), this.f2936c, this.f2937d, false);
        }
    }

    /* renamed from: androidx.fragment.app.c$h */
    /* compiled from: DefaultSpecialEffectsController */
    class C1071h implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C1163z f2939a;

        /* renamed from: b */
        final /* synthetic */ View f2940b;

        /* renamed from: c */
        final /* synthetic */ Rect f2941c;

        C1071h(C1163z zVar, View view, Rect rect) {
            this.f2939a = zVar;
            this.f2940b = view;
            this.f2941c = rect;
        }

        public void run() {
            this.f2939a.mo4338k(this.f2940b, this.f2941c);
        }
    }

    /* renamed from: androidx.fragment.app.c$i */
    /* compiled from: DefaultSpecialEffectsController */
    class C1072i implements Runnable {

        /* renamed from: a */
        final /* synthetic */ ArrayList f2943a;

        C1072i(ArrayList arrayList) {
            this.f2943a = arrayList;
        }

        public void run() {
            C1148x.m5240A(this.f2943a, 4);
        }
    }

    /* renamed from: androidx.fragment.app.c$j */
    /* compiled from: DefaultSpecialEffectsController */
    class C1073j implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C1076m f2945a;

        C1073j(C1076m mVar) {
            this.f2945a = mVar;
        }

        public void run() {
            this.f2945a.mo3932a();
        }
    }

    /* renamed from: androidx.fragment.app.c$k */
    /* compiled from: DefaultSpecialEffectsController */
    private static class C1074k extends C1075l {

        /* renamed from: c */
        private boolean f2947c;

        /* renamed from: d */
        private boolean f2948d = false;

        /* renamed from: e */
        private C1098f.C1103d f2949e;

        C1074k(C1077c0.C1082e eVar, C0763e eVar2, boolean z) {
            super(eVar, eVar2);
            this.f2947c = z;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public C1098f.C1103d mo3931e(Context context) {
            if (this.f2948d) {
                return this.f2949e;
            }
            C1098f.C1103d c = C1098f.m4937c(context, mo3933b().mo3960f(), mo3933b().mo3959e() == C1077c0.C1082e.C1085c.VISIBLE, this.f2947c);
            this.f2949e = c;
            this.f2948d = true;
            return c;
        }
    }

    /* renamed from: androidx.fragment.app.c$l */
    /* compiled from: DefaultSpecialEffectsController */
    private static class C1075l {

        /* renamed from: a */
        private final C1077c0.C1082e f2950a;

        /* renamed from: b */
        private final C0763e f2951b;

        C1075l(C1077c0.C1082e eVar, C0763e eVar2) {
            this.f2950a = eVar;
            this.f2951b = eVar2;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo3932a() {
            this.f2950a.mo3958d(this.f2951b);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public C1077c0.C1082e mo3933b() {
            return this.f2950a;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public C0763e mo3934c() {
            return this.f2951b;
        }

        /* access modifiers changed from: package-private */
        /* JADX WARNING: Code restructure failed: missing block: B:2:0x0014, code lost:
            r2 = androidx.fragment.app.C1077c0.C1082e.C1085c.VISIBLE;
         */
        /* renamed from: d */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean mo3935d() {
            /*
                r3 = this;
                androidx.fragment.app.c0$e r0 = r3.f2950a
                androidx.fragment.app.Fragment r0 = r0.mo3960f()
                android.view.View r0 = r0.f2818P
                androidx.fragment.app.c0$e$c r0 = androidx.fragment.app.C1077c0.C1082e.C1085c.m4892c(r0)
                androidx.fragment.app.c0$e r1 = r3.f2950a
                androidx.fragment.app.c0$e$c r1 = r1.mo3959e()
                if (r0 == r1) goto L_0x001d
                androidx.fragment.app.c0$e$c r2 = androidx.fragment.app.C1077c0.C1082e.C1085c.VISIBLE
                if (r0 == r2) goto L_0x001b
                if (r1 == r2) goto L_0x001b
                goto L_0x001d
            L_0x001b:
                r0 = 0
                goto L_0x001e
            L_0x001d:
                r0 = 1
            L_0x001e:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.C1062c.C1075l.mo3935d():boolean");
        }
    }

    /* renamed from: androidx.fragment.app.c$m */
    /* compiled from: DefaultSpecialEffectsController */
    private static class C1076m extends C1075l {

        /* renamed from: c */
        private final Object f2952c;

        /* renamed from: d */
        private final boolean f2953d;

        /* renamed from: e */
        private final Object f2954e;

        C1076m(C1077c0.C1082e eVar, C0763e eVar2, boolean z, boolean z2) {
            super(eVar, eVar2);
            Object obj;
            Object obj2;
            boolean z3;
            if (eVar.mo3959e() == C1077c0.C1082e.C1085c.VISIBLE) {
                if (z) {
                    obj2 = eVar.mo3960f().mo3755H();
                } else {
                    obj2 = eVar.mo3960f().mo3842r();
                }
                this.f2952c = obj2;
                if (z) {
                    z3 = eVar.mo3960f().mo3819k();
                } else {
                    z3 = eVar.mo3960f().mo3816j();
                }
                this.f2953d = z3;
            } else {
                if (z) {
                    obj = eVar.mo3960f().mo3759J();
                } else {
                    obj = eVar.mo3960f().mo3853u();
                }
                this.f2952c = obj;
                this.f2953d = true;
            }
            if (!z2) {
                this.f2954e = null;
            } else if (z) {
                this.f2954e = eVar.mo3960f().mo3763L();
            } else {
                this.f2954e = eVar.mo3960f().mo3761K();
            }
        }

        /* renamed from: f */
        private C1163z m4852f(Object obj) {
            if (obj == null) {
                return null;
            }
            C1163z zVar = C1148x.f3178b;
            if (zVar != null && zVar.mo4307e(obj)) {
                return zVar;
            }
            C1163z zVar2 = C1148x.f3179c;
            if (zVar2 != null && zVar2.mo4307e(obj)) {
                return zVar2;
            }
            throw new IllegalArgumentException("Transition " + obj + " for fragment " + mo3933b().mo3960f() + " is not a valid framework Transition or AndroidX Transition");
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public C1163z mo3936e() {
            C1163z f = m4852f(this.f2952c);
            C1163z f2 = m4852f(this.f2954e);
            if (f == null || f2 == null || f == f2) {
                return f != null ? f : f2;
            }
            throw new IllegalArgumentException("Mixing framework transitions and AndroidX transitions is not allowed. Fragment " + mo3933b().mo3960f() + " returned Transition " + this.f2952c + " which uses a different Transition  type than its shared element transition " + this.f2954e);
        }

        /* renamed from: g */
        public Object mo3937g() {
            return this.f2954e;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: h */
        public Object mo3938h() {
            return this.f2952c;
        }

        /* renamed from: i */
        public boolean mo3939i() {
            return this.f2954e != null;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: j */
        public boolean mo3940j() {
            return this.f2953d;
        }
    }

    C1062c(ViewGroup viewGroup) {
        super(viewGroup);
    }

    /* renamed from: w */
    private void m4838w(List<C1074k> list, List<C1077c0.C1082e> list2, boolean z, Map<C1077c0.C1082e, Boolean> map) {
        ViewGroup m = mo3949m();
        Context context = m.getContext();
        ArrayList arrayList = new ArrayList();
        boolean z2 = false;
        for (C1074k next : list) {
            if (next.mo3935d()) {
                next.mo3932a();
            } else {
                C1098f.C1103d e = next.mo3931e(context);
                if (e == null) {
                    next.mo3932a();
                } else {
                    Animator animator = e.f3021b;
                    if (animator == null) {
                        arrayList.add(next);
                    } else {
                        C1077c0.C1082e b = next.mo3933b();
                        Fragment f = b.mo3960f();
                        if (Boolean.TRUE.equals(map.get(b))) {
                            if (C1114n.m4999F0(2)) {
                                Log.v("FragmentManager", "Ignoring Animator set on " + f + " as this Fragment was involved in a Transition.");
                            }
                            next.mo3932a();
                        } else {
                            boolean z3 = b.mo3959e() == C1077c0.C1082e.C1085c.GONE;
                            List<C1077c0.C1082e> list3 = list2;
                            if (z3) {
                                list3.remove(b);
                            }
                            View view = f.f2818P;
                            m.startViewTransition(view);
                            C1065c cVar = r0;
                            C1065c cVar2 = new C1065c(m, view, z3, b, next);
                            animator.addListener(cVar);
                            animator.setTarget(view);
                            animator.start();
                            next.mo3934c().mo3141c(new C1066d(animator));
                            z2 = true;
                        }
                    }
                }
            }
            Map<C1077c0.C1082e, Boolean> map2 = map;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C1074k kVar = (C1074k) it.next();
            C1077c0.C1082e b2 = kVar.mo3933b();
            Fragment f2 = b2.mo3960f();
            if (z) {
                if (C1114n.m4999F0(2)) {
                    Log.v("FragmentManager", "Ignoring Animation set on " + f2 + " as Animations cannot run alongside Transitions.");
                }
                kVar.mo3932a();
            } else if (z2) {
                if (C1114n.m4999F0(2)) {
                    Log.v("FragmentManager", "Ignoring Animation set on " + f2 + " as Animations cannot run alongside Animators.");
                }
                kVar.mo3932a();
            } else {
                View view2 = f2.f2818P;
                Animation animation = (Animation) C0831h.m3662f(((C1098f.C1103d) C0831h.m3662f(kVar.mo3931e(context))).f3020a);
                if (b2.mo3959e() != C1077c0.C1082e.C1085c.REMOVED) {
                    view2.startAnimation(animation);
                    kVar.mo3932a();
                } else {
                    m.startViewTransition(view2);
                    C1098f.C1104e eVar = new C1098f.C1104e(animation, m, view2);
                    eVar.setAnimationListener(new C1067e(m, view2, kVar));
                    view2.startAnimation(eVar);
                }
                kVar.mo3934c().mo3141c(new C1069f(view2, m, kVar));
            }
        }
    }

    /* renamed from: x */
    private Map<C1077c0.C1082e, Boolean> m4839x(List<C1076m> list, List<C1077c0.C1082e> list2, boolean z, C1077c0.C1082e eVar, C1077c0.C1082e eVar2) {
        ArrayList arrayList;
        ArrayList arrayList2;
        View view;
        View view2;
        Object obj;
        C1077c0.C1082e eVar3;
        C1077c0.C1082e eVar4;
        Object obj2;
        Object obj3;
        C5413a aVar;
        C1077c0.C1082e eVar5;
        C1163z zVar;
        View view3;
        Rect rect;
        ArrayList arrayList3;
        C1077c0.C1082e eVar6;
        ArrayList arrayList4;
        boolean z2 = z;
        C1077c0.C1082e eVar7 = eVar;
        C1077c0.C1082e eVar8 = eVar2;
        HashMap hashMap = new HashMap();
        C1163z zVar2 = null;
        for (C1076m next : list) {
            if (!next.mo3935d()) {
                C1163z e = next.mo3936e();
                if (zVar2 == null) {
                    zVar2 = e;
                } else if (!(e == null || zVar2 == e)) {
                    throw new IllegalArgumentException("Mixing framework transitions and AndroidX transitions is not allowed. Fragment " + next.mo3933b().mo3960f() + " returned Transition " + next.mo3938h() + " which uses a different Transition  type than other Fragments.");
                }
            }
        }
        if (zVar2 == null) {
            for (C1076m next2 : list) {
                hashMap.put(next2.mo3933b(), Boolean.FALSE);
                next2.mo3932a();
            }
            return hashMap;
        }
        View view4 = new View(mo3949m().getContext());
        Rect rect2 = new Rect();
        ArrayList arrayList5 = new ArrayList();
        ArrayList arrayList6 = new ArrayList();
        C5413a aVar2 = new C5413a();
        Object obj4 = null;
        View view5 = null;
        boolean z3 = false;
        for (C1076m next3 : list) {
            if (!next3.mo3939i() || eVar7 == null || eVar8 == null) {
                aVar = aVar2;
                arrayList4 = arrayList6;
                eVar6 = eVar7;
                arrayList3 = arrayList5;
                rect = rect2;
                view3 = view4;
                zVar = zVar2;
                eVar5 = eVar8;
                view5 = view5;
            } else {
                Object B = zVar2.mo4303B(zVar2.mo4308g(next3.mo3937g()));
                ArrayList<String> M = eVar2.mo3960f().mo3765M();
                ArrayList<String> M2 = eVar.mo3960f().mo3765M();
                ArrayList<String> N = eVar.mo3960f().mo3767N();
                Object obj5 = B;
                View view6 = view5;
                int i = 0;
                while (i < N.size()) {
                    int indexOf = M.indexOf(N.get(i));
                    ArrayList<String> arrayList7 = N;
                    if (indexOf != -1) {
                        M.set(indexOf, M2.get(i));
                    }
                    i++;
                    N = arrayList7;
                }
                ArrayList<String> N2 = eVar2.mo3960f().mo3767N();
                if (!z2) {
                    eVar.mo3960f().mo3856v();
                    eVar2.mo3960f().mo3845s();
                } else {
                    eVar.mo3960f().mo3845s();
                    eVar2.mo3960f().mo3856v();
                }
                int i2 = 0;
                for (int size = M.size(); i2 < size; size = size) {
                    aVar2.put(M.get(i2), N2.get(i2));
                    i2++;
                }
                C5413a aVar3 = new C5413a();
                mo3919u(aVar3, eVar.mo3960f().f2818P);
                aVar3.mo19538p(M);
                aVar2.mo19538p(aVar3.keySet());
                C5413a aVar4 = new C5413a();
                mo3919u(aVar4, eVar2.mo3960f().f2818P);
                aVar4.mo19538p(N2);
                aVar4.mo19538p(aVar2.values());
                C1148x.m5265x(aVar2, aVar4);
                mo3920v(aVar3, aVar2.keySet());
                mo3920v(aVar4, aVar2.values());
                if (aVar2.isEmpty()) {
                    arrayList5.clear();
                    arrayList6.clear();
                    aVar = aVar2;
                    arrayList4 = arrayList6;
                    eVar6 = eVar7;
                    arrayList3 = arrayList5;
                    rect = rect2;
                    view3 = view4;
                    zVar = zVar2;
                    view5 = view6;
                    obj4 = null;
                    eVar5 = eVar8;
                } else {
                    C1148x.m5247f(eVar2.mo3960f(), eVar.mo3960f(), z2, aVar3, true);
                    ArrayList<String> arrayList8 = M;
                    C1070g gVar = r0;
                    ViewGroup m = mo3949m();
                    Object obj6 = obj5;
                    C5413a aVar5 = aVar4;
                    View view7 = view6;
                    C5413a aVar6 = aVar3;
                    aVar = aVar2;
                    ArrayList arrayList9 = arrayList6;
                    C1070g gVar2 = new C1070g(eVar2, eVar, z, aVar5);
                    C0956x.m4317a(m, gVar2);
                    arrayList5.addAll(aVar6.values());
                    if (!arrayList8.isEmpty()) {
                        View view8 = (View) aVar6.get(arrayList8.get(0));
                        zVar2.mo4316v(obj6, view8);
                        view5 = view8;
                    } else {
                        view5 = view7;
                    }
                    arrayList4 = arrayList9;
                    arrayList4.addAll(aVar5.values());
                    if (!N2.isEmpty()) {
                        View view9 = (View) aVar5.get(N2.get(0));
                        if (view9 != null) {
                            C0956x.m4317a(mo3949m(), new C1071h(zVar2, view9, rect2));
                            z3 = true;
                        }
                    }
                    zVar2.mo4318z(obj6, view4, arrayList5);
                    arrayList3 = arrayList5;
                    rect = rect2;
                    view3 = view4;
                    zVar = zVar2;
                    zVar2.mo4314t(obj6, (Object) null, (ArrayList<View>) null, (Object) null, (ArrayList<View>) null, obj6, arrayList4);
                    Boolean bool = Boolean.TRUE;
                    eVar6 = eVar;
                    hashMap.put(eVar6, bool);
                    eVar5 = eVar2;
                    hashMap.put(eVar5, bool);
                    obj4 = obj6;
                }
            }
            eVar7 = eVar6;
            arrayList5 = arrayList3;
            rect2 = rect;
            view4 = view3;
            eVar8 = eVar5;
            aVar2 = aVar;
            z2 = z;
            arrayList6 = arrayList4;
            zVar2 = zVar;
        }
        View view10 = view5;
        C5413a aVar7 = aVar2;
        ArrayList arrayList10 = arrayList6;
        C1077c0.C1082e eVar9 = eVar7;
        ArrayList arrayList11 = arrayList5;
        Rect rect3 = rect2;
        View view11 = view4;
        C1163z zVar3 = zVar2;
        C1077c0.C1082e eVar10 = eVar8;
        ArrayList arrayList12 = new ArrayList();
        Object obj7 = null;
        Object obj8 = null;
        for (C1076m next4 : list) {
            if (next4.mo3935d()) {
                hashMap.put(next4.mo3933b(), Boolean.FALSE);
                next4.mo3932a();
            } else {
                Object g = zVar3.mo4308g(next4.mo3938h());
                C1077c0.C1082e b = next4.mo3933b();
                boolean z4 = obj4 != null && (b == eVar9 || b == eVar10);
                if (g == null) {
                    if (!z4) {
                        hashMap.put(b, Boolean.FALSE);
                        next4.mo3932a();
                    }
                    List<C1077c0.C1082e> list3 = list2;
                    arrayList = arrayList10;
                    arrayList2 = arrayList11;
                    view = view11;
                    obj = obj7;
                    eVar3 = eVar10;
                    view2 = view10;
                } else {
                    ArrayList arrayList13 = new ArrayList();
                    Object obj9 = obj7;
                    mo3918t(arrayList13, b.mo3960f().f2818P);
                    if (z4) {
                        if (b == eVar9) {
                            arrayList13.removeAll(arrayList11);
                        } else {
                            arrayList13.removeAll(arrayList10);
                        }
                    }
                    if (arrayList13.isEmpty()) {
                        zVar3.mo4304a(g, view11);
                        arrayList = arrayList10;
                        arrayList2 = arrayList11;
                        view = view11;
                        eVar4 = b;
                        obj3 = obj8;
                        eVar3 = eVar10;
                        List<C1077c0.C1082e> list4 = list2;
                        obj2 = obj9;
                    } else {
                        zVar3.mo4305b(g, arrayList13);
                        view = view11;
                        obj2 = obj9;
                        C1077c0.C1082e eVar11 = b;
                        arrayList2 = arrayList11;
                        obj3 = obj8;
                        arrayList = arrayList10;
                        eVar3 = eVar10;
                        zVar3.mo4314t(g, g, arrayList13, (Object) null, (ArrayList<View>) null, (Object) null, (ArrayList<View>) null);
                        if (eVar11.mo3959e() == C1077c0.C1082e.C1085c.GONE) {
                            eVar4 = eVar11;
                            list2.remove(eVar4);
                            ArrayList arrayList14 = new ArrayList(arrayList13);
                            arrayList14.remove(eVar4.mo3960f().f2818P);
                            zVar3.mo4313r(g, eVar4.mo3960f().f2818P, arrayList14);
                            C0956x.m4317a(mo3949m(), new C1072i(arrayList13));
                        } else {
                            List<C1077c0.C1082e> list5 = list2;
                            eVar4 = eVar11;
                        }
                    }
                    if (eVar4.mo3959e() == C1077c0.C1082e.C1085c.VISIBLE) {
                        arrayList12.addAll(arrayList13);
                        if (z3) {
                            zVar3.mo4315u(g, rect3);
                        }
                        view2 = view10;
                    } else {
                        view2 = view10;
                        zVar3.mo4316v(g, view2);
                    }
                    hashMap.put(eVar4, Boolean.TRUE);
                    if (next4.mo3940j()) {
                        obj8 = zVar3.mo4310n(obj3, g, (Object) null);
                        obj = obj2;
                    } else {
                        obj = zVar3.mo4310n(obj2, g, (Object) null);
                        obj8 = obj3;
                    }
                }
                eVar10 = eVar3;
                obj7 = obj;
                view10 = view2;
                view11 = view;
                arrayList11 = arrayList2;
                arrayList10 = arrayList;
            }
        }
        ArrayList arrayList15 = arrayList10;
        ArrayList arrayList16 = arrayList11;
        C1077c0.C1082e eVar12 = eVar10;
        Object m2 = zVar3.mo4309m(obj8, obj7, obj4);
        for (C1076m next5 : list) {
            if (!next5.mo3935d()) {
                Object h = next5.mo3938h();
                C1077c0.C1082e b2 = next5.mo3933b();
                boolean z5 = obj4 != null && (b2 == eVar9 || b2 == eVar12);
                if (h != null || z5) {
                    if (!C0835a0.m3705R(mo3949m())) {
                        if (C1114n.m4999F0(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Container " + mo3949m() + " has not been laid out. Completing operation " + b2);
                        }
                        next5.mo3932a();
                    } else {
                        zVar3.mo4317w(next5.mo3933b().mo3960f(), m2, next5.mo3934c(), new C1073j(next5));
                    }
                }
            }
        }
        if (!C0835a0.m3705R(mo3949m())) {
            return hashMap;
        }
        C1148x.m5240A(arrayList12, 4);
        ArrayList arrayList17 = arrayList15;
        ArrayList<String> o = zVar3.mo4339o(arrayList17);
        zVar3.mo4306c(mo3949m(), m2);
        zVar3.mo4342y(mo3949m(), arrayList16, arrayList17, o, aVar7);
        C1148x.m5240A(arrayList12, 0);
        zVar3.mo4302A(obj4, arrayList16, arrayList17);
        return hashMap;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo3916f(List<C1077c0.C1082e> list, boolean z) {
        C1077c0.C1082e eVar = null;
        C1077c0.C1082e eVar2 = null;
        for (C1077c0.C1082e next : list) {
            C1077c0.C1082e.C1085c c = C1077c0.C1082e.C1085c.m4892c(next.mo3960f().f2818P);
            int i = C1063a.f2913a[next.mo3959e().ordinal()];
            if (i == 1 || i == 2 || i == 3) {
                if (c == C1077c0.C1082e.C1085c.VISIBLE && eVar == null) {
                    eVar = next;
                }
            } else if (i == 4 && c != C1077c0.C1082e.C1085c.VISIBLE) {
                eVar2 = next;
            }
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList<C1077c0.C1082e> arrayList3 = new ArrayList<>(list);
        for (C1077c0.C1082e next2 : list) {
            C0763e eVar3 = new C0763e();
            next2.mo3964j(eVar3);
            arrayList.add(new C1074k(next2, eVar3, z));
            C0763e eVar4 = new C0763e();
            next2.mo3964j(eVar4);
            boolean z2 = false;
            if (z) {
                if (next2 != eVar) {
                    arrayList2.add(new C1076m(next2, eVar4, z, z2));
                    next2.mo3956a(new C1064b(arrayList3, next2));
                }
            } else if (next2 != eVar2) {
                arrayList2.add(new C1076m(next2, eVar4, z, z2));
                next2.mo3956a(new C1064b(arrayList3, next2));
            }
            z2 = true;
            arrayList2.add(new C1076m(next2, eVar4, z, z2));
            next2.mo3956a(new C1064b(arrayList3, next2));
        }
        Map<C1077c0.C1082e, Boolean> x = m4839x(arrayList2, arrayList3, z, eVar, eVar2);
        m4838w(arrayList, arrayList3, x.containsValue(Boolean.TRUE), x);
        for (C1077c0.C1082e s : arrayList3) {
            mo3917s(s);
        }
        arrayList3.clear();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public void mo3917s(C1077c0.C1082e eVar) {
        eVar.mo3959e().mo3967a(eVar.mo3960f().f2818P);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public void mo3918t(ArrayList<View> arrayList, View view) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (!C0899d0.m4079a(viewGroup)) {
                int childCount = viewGroup.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View childAt = viewGroup.getChildAt(i);
                    if (childAt.getVisibility() == 0) {
                        mo3918t(arrayList, childAt);
                    }
                }
            } else if (!arrayList.contains(view)) {
                arrayList.add(viewGroup);
            }
        } else if (!arrayList.contains(view)) {
            arrayList.add(view);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u */
    public void mo3919u(Map<String, View> map, View view) {
        String J = C0835a0.m3697J(view);
        if (J != null) {
            map.put(J, view);
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                if (childAt.getVisibility() == 0) {
                    mo3919u(map, childAt);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: v */
    public void mo3920v(C5413a<String, View> aVar, Collection<String> collection) {
        Iterator<Map.Entry<String, View>> it = aVar.entrySet().iterator();
        while (it.hasNext()) {
            if (!collection.contains(C0835a0.m3697J((View) it.next().getValue()))) {
                it.remove();
            }
        }
    }
}
