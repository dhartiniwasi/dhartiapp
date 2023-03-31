package androidx.fragment.app;

import android.graphics.Rect;
import android.transition.Transition;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.p010os.C0763e;
import java.util.ArrayList;
import java.util.List;

/* renamed from: androidx.fragment.app.y */
/* compiled from: FragmentTransitionCompat21 */
class C1157y extends C1163z {

    /* renamed from: androidx.fragment.app.y$a */
    /* compiled from: FragmentTransitionCompat21 */
    class C1158a extends Transition.EpicenterCallback {

        /* renamed from: a */
        final /* synthetic */ Rect f3220a;

        C1158a(Rect rect) {
            this.f3220a = rect;
        }

        public Rect onGetEpicenter(Transition transition) {
            return this.f3220a;
        }
    }

    /* renamed from: androidx.fragment.app.y$b */
    /* compiled from: FragmentTransitionCompat21 */
    class C1159b implements Transition.TransitionListener {

        /* renamed from: a */
        final /* synthetic */ View f3222a;

        /* renamed from: b */
        final /* synthetic */ ArrayList f3223b;

        C1159b(View view, ArrayList arrayList) {
            this.f3222a = view;
            this.f3223b = arrayList;
        }

        public void onTransitionCancel(Transition transition) {
        }

        public void onTransitionEnd(Transition transition) {
            transition.removeListener(this);
            this.f3222a.setVisibility(8);
            int size = this.f3223b.size();
            for (int i = 0; i < size; i++) {
                ((View) this.f3223b.get(i)).setVisibility(0);
            }
        }

        public void onTransitionPause(Transition transition) {
        }

        public void onTransitionResume(Transition transition) {
        }

        public void onTransitionStart(Transition transition) {
            transition.removeListener(this);
            transition.addListener(this);
        }
    }

    /* renamed from: androidx.fragment.app.y$c */
    /* compiled from: FragmentTransitionCompat21 */
    class C1160c implements Transition.TransitionListener {

        /* renamed from: a */
        final /* synthetic */ Object f3225a;

        /* renamed from: b */
        final /* synthetic */ ArrayList f3226b;

        /* renamed from: c */
        final /* synthetic */ Object f3227c;

        /* renamed from: d */
        final /* synthetic */ ArrayList f3228d;

        /* renamed from: e */
        final /* synthetic */ Object f3229e;

        /* renamed from: f */
        final /* synthetic */ ArrayList f3230f;

        C1160c(Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2, Object obj3, ArrayList arrayList3) {
            this.f3225a = obj;
            this.f3226b = arrayList;
            this.f3227c = obj2;
            this.f3228d = arrayList2;
            this.f3229e = obj3;
            this.f3230f = arrayList3;
        }

        public void onTransitionCancel(Transition transition) {
        }

        public void onTransitionEnd(Transition transition) {
            transition.removeListener(this);
        }

        public void onTransitionPause(Transition transition) {
        }

        public void onTransitionResume(Transition transition) {
        }

        public void onTransitionStart(Transition transition) {
            Object obj = this.f3225a;
            if (obj != null) {
                C1157y.this.mo4312q(obj, this.f3226b, (ArrayList<View>) null);
            }
            Object obj2 = this.f3227c;
            if (obj2 != null) {
                C1157y.this.mo4312q(obj2, this.f3228d, (ArrayList<View>) null);
            }
            Object obj3 = this.f3229e;
            if (obj3 != null) {
                C1157y.this.mo4312q(obj3, this.f3230f, (ArrayList<View>) null);
            }
        }
    }

    /* renamed from: androidx.fragment.app.y$d */
    /* compiled from: FragmentTransitionCompat21 */
    class C1161d implements Transition.TransitionListener {

        /* renamed from: a */
        final /* synthetic */ Runnable f3232a;

        C1161d(Runnable runnable) {
            this.f3232a = runnable;
        }

        public void onTransitionCancel(Transition transition) {
        }

        public void onTransitionEnd(Transition transition) {
            this.f3232a.run();
        }

        public void onTransitionPause(Transition transition) {
        }

        public void onTransitionResume(Transition transition) {
        }

        public void onTransitionStart(Transition transition) {
        }
    }

    /* renamed from: androidx.fragment.app.y$e */
    /* compiled from: FragmentTransitionCompat21 */
    class C1162e extends Transition.EpicenterCallback {

        /* renamed from: a */
        final /* synthetic */ Rect f3234a;

        C1162e(Rect rect) {
            this.f3234a = rect;
        }

        public Rect onGetEpicenter(Transition transition) {
            Rect rect = this.f3234a;
            if (rect == null || rect.isEmpty()) {
                return null;
            }
            return this.f3234a;
        }
    }

    C1157y() {
    }

    /* renamed from: C */
    private static boolean m5270C(Transition transition) {
        return !C1163z.m5291l(transition.getTargetIds()) || !C1163z.m5291l(transition.getTargetNames()) || !C1163z.m5291l(transition.getTargetTypes());
    }

    /* renamed from: A */
    public void mo4302A(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        TransitionSet transitionSet = (TransitionSet) obj;
        if (transitionSet != null) {
            transitionSet.getTargets().clear();
            transitionSet.getTargets().addAll(arrayList2);
            mo4312q(transitionSet, arrayList, arrayList2);
        }
    }

    /* renamed from: B */
    public Object mo4303B(Object obj) {
        if (obj == null) {
            return null;
        }
        TransitionSet transitionSet = new TransitionSet();
        transitionSet.addTransition((Transition) obj);
        return transitionSet;
    }

    /* renamed from: a */
    public void mo4304a(Object obj, View view) {
        if (obj != null) {
            ((Transition) obj).addTarget(view);
        }
    }

    /* renamed from: b */
    public void mo4305b(Object obj, ArrayList<View> arrayList) {
        Transition transition = (Transition) obj;
        if (transition != null) {
            int i = 0;
            if (transition instanceof TransitionSet) {
                TransitionSet transitionSet = (TransitionSet) transition;
                int transitionCount = transitionSet.getTransitionCount();
                while (i < transitionCount) {
                    mo4305b(transitionSet.getTransitionAt(i), arrayList);
                    i++;
                }
            } else if (!m5270C(transition) && C1163z.m5291l(transition.getTargets())) {
                int size = arrayList.size();
                while (i < size) {
                    transition.addTarget(arrayList.get(i));
                    i++;
                }
            }
        }
    }

    /* renamed from: c */
    public void mo4306c(ViewGroup viewGroup, Object obj) {
        TransitionManager.beginDelayedTransition(viewGroup, (Transition) obj);
    }

    /* renamed from: e */
    public boolean mo4307e(Object obj) {
        return obj instanceof Transition;
    }

    /* renamed from: g */
    public Object mo4308g(Object obj) {
        if (obj != null) {
            return ((Transition) obj).clone();
        }
        return null;
    }

    /* renamed from: m */
    public Object mo4309m(Object obj, Object obj2, Object obj3) {
        Transition transition = (Transition) obj;
        Transition transition2 = (Transition) obj2;
        Transition transition3 = (Transition) obj3;
        if (transition != null && transition2 != null) {
            transition = new TransitionSet().addTransition(transition).addTransition(transition2).setOrdering(1);
        } else if (transition == null) {
            transition = transition2 != null ? transition2 : null;
        }
        if (transition3 == null) {
            return transition;
        }
        TransitionSet transitionSet = new TransitionSet();
        if (transition != null) {
            transitionSet.addTransition(transition);
        }
        transitionSet.addTransition(transition3);
        return transitionSet;
    }

    /* renamed from: n */
    public Object mo4310n(Object obj, Object obj2, Object obj3) {
        TransitionSet transitionSet = new TransitionSet();
        if (obj != null) {
            transitionSet.addTransition((Transition) obj);
        }
        if (obj2 != null) {
            transitionSet.addTransition((Transition) obj2);
        }
        if (obj3 != null) {
            transitionSet.addTransition((Transition) obj3);
        }
        return transitionSet;
    }

    /* renamed from: p */
    public void mo4311p(Object obj, View view) {
        if (obj != null) {
            ((Transition) obj).removeTarget(view);
        }
    }

    /* renamed from: q */
    public void mo4312q(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        List<View> targets;
        int i;
        Transition transition = (Transition) obj;
        int i2 = 0;
        if (transition instanceof TransitionSet) {
            TransitionSet transitionSet = (TransitionSet) transition;
            int transitionCount = transitionSet.getTransitionCount();
            while (i2 < transitionCount) {
                mo4312q(transitionSet.getTransitionAt(i2), arrayList, arrayList2);
                i2++;
            }
        } else if (!m5270C(transition) && (targets = transition.getTargets()) != null && targets.size() == arrayList.size() && targets.containsAll(arrayList)) {
            if (arrayList2 == null) {
                i = 0;
            } else {
                i = arrayList2.size();
            }
            while (i2 < i) {
                transition.addTarget(arrayList2.get(i2));
                i2++;
            }
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                transition.removeTarget(arrayList.get(size));
            }
        }
    }

    /* renamed from: r */
    public void mo4313r(Object obj, View view, ArrayList<View> arrayList) {
        ((Transition) obj).addListener(new C1159b(view, arrayList));
    }

    /* renamed from: t */
    public void mo4314t(Object obj, Object obj2, ArrayList<View> arrayList, Object obj3, ArrayList<View> arrayList2, Object obj4, ArrayList<View> arrayList3) {
        ((Transition) obj).addListener(new C1160c(obj2, arrayList, obj3, arrayList2, obj4, arrayList3));
    }

    /* renamed from: u */
    public void mo4315u(Object obj, Rect rect) {
        if (obj != null) {
            ((Transition) obj).setEpicenterCallback(new C1162e(rect));
        }
    }

    /* renamed from: v */
    public void mo4316v(Object obj, View view) {
        if (view != null) {
            Rect rect = new Rect();
            mo4338k(view, rect);
            ((Transition) obj).setEpicenterCallback(new C1158a(rect));
        }
    }

    /* renamed from: w */
    public void mo4317w(Fragment fragment, Object obj, C0763e eVar, Runnable runnable) {
        ((Transition) obj).addListener(new C1161d(runnable));
    }

    /* renamed from: z */
    public void mo4318z(Object obj, View view, ArrayList<View> arrayList) {
        TransitionSet transitionSet = (TransitionSet) obj;
        List targets = transitionSet.getTargets();
        targets.clear();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C1163z.m5288d(targets, arrayList.get(i));
        }
        targets.add(view);
        arrayList.add(view);
        mo4305b(transitionSet, arrayList);
    }
}
