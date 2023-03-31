package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.core.view.C0835a0;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: androidx.recyclerview.widget.c */
/* compiled from: DefaultItemAnimator */
public class C1385c extends C1416m {

    /* renamed from: s */
    private static TimeInterpolator f3912s;

    /* renamed from: h */
    private ArrayList<RecyclerView.C1336d0> f3913h = new ArrayList<>();

    /* renamed from: i */
    private ArrayList<RecyclerView.C1336d0> f3914i = new ArrayList<>();

    /* renamed from: j */
    private ArrayList<C1395j> f3915j = new ArrayList<>();

    /* renamed from: k */
    private ArrayList<C1394i> f3916k = new ArrayList<>();

    /* renamed from: l */
    ArrayList<ArrayList<RecyclerView.C1336d0>> f3917l = new ArrayList<>();

    /* renamed from: m */
    ArrayList<ArrayList<C1395j>> f3918m = new ArrayList<>();

    /* renamed from: n */
    ArrayList<ArrayList<C1394i>> f3919n = new ArrayList<>();

    /* renamed from: o */
    ArrayList<RecyclerView.C1336d0> f3920o = new ArrayList<>();

    /* renamed from: p */
    ArrayList<RecyclerView.C1336d0> f3921p = new ArrayList<>();

    /* renamed from: q */
    ArrayList<RecyclerView.C1336d0> f3922q = new ArrayList<>();

    /* renamed from: r */
    ArrayList<RecyclerView.C1336d0> f3923r = new ArrayList<>();

    /* renamed from: androidx.recyclerview.widget.c$a */
    /* compiled from: DefaultItemAnimator */
    class C1386a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ ArrayList f3924a;

        C1386a(ArrayList arrayList) {
            this.f3924a = arrayList;
        }

        public void run() {
            Iterator it = this.f3924a.iterator();
            while (it.hasNext()) {
                C1395j jVar = (C1395j) it.next();
                C1385c.this.mo5423S(jVar.f3958a, jVar.f3959b, jVar.f3960c, jVar.f3961d, jVar.f3962e);
            }
            this.f3924a.clear();
            C1385c.this.f3918m.remove(this.f3924a);
        }
    }

    /* renamed from: androidx.recyclerview.widget.c$b */
    /* compiled from: DefaultItemAnimator */
    class C1387b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ ArrayList f3926a;

        C1387b(ArrayList arrayList) {
            this.f3926a = arrayList;
        }

        public void run() {
            Iterator it = this.f3926a.iterator();
            while (it.hasNext()) {
                C1385c.this.mo5422R((C1394i) it.next());
            }
            this.f3926a.clear();
            C1385c.this.f3919n.remove(this.f3926a);
        }
    }

    /* renamed from: androidx.recyclerview.widget.c$c */
    /* compiled from: DefaultItemAnimator */
    class C1388c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ ArrayList f3928a;

        C1388c(ArrayList arrayList) {
            this.f3928a = arrayList;
        }

        public void run() {
            Iterator it = this.f3928a.iterator();
            while (it.hasNext()) {
                C1385c.this.mo5421Q((RecyclerView.C1336d0) it.next());
            }
            this.f3928a.clear();
            C1385c.this.f3917l.remove(this.f3928a);
        }
    }

    /* renamed from: androidx.recyclerview.widget.c$d */
    /* compiled from: DefaultItemAnimator */
    class C1389d extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ RecyclerView.C1336d0 f3930a;

        /* renamed from: b */
        final /* synthetic */ ViewPropertyAnimator f3931b;

        /* renamed from: c */
        final /* synthetic */ View f3932c;

        C1389d(RecyclerView.C1336d0 d0Var, ViewPropertyAnimator viewPropertyAnimator, View view) {
            this.f3930a = d0Var;
            this.f3931b = viewPropertyAnimator;
            this.f3932c = view;
        }

        public void onAnimationEnd(Animator animator) {
            this.f3931b.setListener((Animator.AnimatorListener) null);
            this.f3932c.setAlpha(1.0f);
            C1385c.this.mo5514G(this.f3930a);
            C1385c.this.f3922q.remove(this.f3930a);
            C1385c.this.mo5425V();
        }

        public void onAnimationStart(Animator animator) {
            C1385c.this.mo5515H(this.f3930a);
        }
    }

    /* renamed from: androidx.recyclerview.widget.c$e */
    /* compiled from: DefaultItemAnimator */
    class C1390e extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ RecyclerView.C1336d0 f3934a;

        /* renamed from: b */
        final /* synthetic */ View f3935b;

        /* renamed from: c */
        final /* synthetic */ ViewPropertyAnimator f3936c;

        C1390e(RecyclerView.C1336d0 d0Var, View view, ViewPropertyAnimator viewPropertyAnimator) {
            this.f3934a = d0Var;
            this.f3935b = view;
            this.f3936c = viewPropertyAnimator;
        }

        public void onAnimationCancel(Animator animator) {
            this.f3935b.setAlpha(1.0f);
        }

        public void onAnimationEnd(Animator animator) {
            this.f3936c.setListener((Animator.AnimatorListener) null);
            C1385c.this.mo5508A(this.f3934a);
            C1385c.this.f3920o.remove(this.f3934a);
            C1385c.this.mo5425V();
        }

        public void onAnimationStart(Animator animator) {
            C1385c.this.mo5509B(this.f3934a);
        }
    }

    /* renamed from: androidx.recyclerview.widget.c$f */
    /* compiled from: DefaultItemAnimator */
    class C1391f extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ RecyclerView.C1336d0 f3938a;

        /* renamed from: b */
        final /* synthetic */ int f3939b;

        /* renamed from: c */
        final /* synthetic */ View f3940c;

        /* renamed from: d */
        final /* synthetic */ int f3941d;

        /* renamed from: e */
        final /* synthetic */ ViewPropertyAnimator f3942e;

        C1391f(RecyclerView.C1336d0 d0Var, int i, View view, int i2, ViewPropertyAnimator viewPropertyAnimator) {
            this.f3938a = d0Var;
            this.f3939b = i;
            this.f3940c = view;
            this.f3941d = i2;
            this.f3942e = viewPropertyAnimator;
        }

        public void onAnimationCancel(Animator animator) {
            if (this.f3939b != 0) {
                this.f3940c.setTranslationX(0.0f);
            }
            if (this.f3941d != 0) {
                this.f3940c.setTranslationY(0.0f);
            }
        }

        public void onAnimationEnd(Animator animator) {
            this.f3942e.setListener((Animator.AnimatorListener) null);
            C1385c.this.mo5512E(this.f3938a);
            C1385c.this.f3921p.remove(this.f3938a);
            C1385c.this.mo5425V();
        }

        public void onAnimationStart(Animator animator) {
            C1385c.this.mo5513F(this.f3938a);
        }
    }

    /* renamed from: androidx.recyclerview.widget.c$g */
    /* compiled from: DefaultItemAnimator */
    class C1392g extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ C1394i f3944a;

        /* renamed from: b */
        final /* synthetic */ ViewPropertyAnimator f3945b;

        /* renamed from: c */
        final /* synthetic */ View f3946c;

        C1392g(C1394i iVar, ViewPropertyAnimator viewPropertyAnimator, View view) {
            this.f3944a = iVar;
            this.f3945b = viewPropertyAnimator;
            this.f3946c = view;
        }

        public void onAnimationEnd(Animator animator) {
            this.f3945b.setListener((Animator.AnimatorListener) null);
            this.f3946c.setAlpha(1.0f);
            this.f3946c.setTranslationX(0.0f);
            this.f3946c.setTranslationY(0.0f);
            C1385c.this.mo5510C(this.f3944a.f3952a, true);
            C1385c.this.f3923r.remove(this.f3944a.f3952a);
            C1385c.this.mo5425V();
        }

        public void onAnimationStart(Animator animator) {
            C1385c.this.mo5511D(this.f3944a.f3952a, true);
        }
    }

    /* renamed from: androidx.recyclerview.widget.c$h */
    /* compiled from: DefaultItemAnimator */
    class C1393h extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ C1394i f3948a;

        /* renamed from: b */
        final /* synthetic */ ViewPropertyAnimator f3949b;

        /* renamed from: c */
        final /* synthetic */ View f3950c;

        C1393h(C1394i iVar, ViewPropertyAnimator viewPropertyAnimator, View view) {
            this.f3948a = iVar;
            this.f3949b = viewPropertyAnimator;
            this.f3950c = view;
        }

        public void onAnimationEnd(Animator animator) {
            this.f3949b.setListener((Animator.AnimatorListener) null);
            this.f3950c.setAlpha(1.0f);
            this.f3950c.setTranslationX(0.0f);
            this.f3950c.setTranslationY(0.0f);
            C1385c.this.mo5510C(this.f3948a.f3953b, false);
            C1385c.this.f3923r.remove(this.f3948a.f3953b);
            C1385c.this.mo5425V();
        }

        public void onAnimationStart(Animator animator) {
            C1385c.this.mo5511D(this.f3948a.f3953b, false);
        }
    }

    /* renamed from: androidx.recyclerview.widget.c$j */
    /* compiled from: DefaultItemAnimator */
    private static class C1395j {

        /* renamed from: a */
        public RecyclerView.C1336d0 f3958a;

        /* renamed from: b */
        public int f3959b;

        /* renamed from: c */
        public int f3960c;

        /* renamed from: d */
        public int f3961d;

        /* renamed from: e */
        public int f3962e;

        C1395j(RecyclerView.C1336d0 d0Var, int i, int i2, int i3, int i4) {
            this.f3958a = d0Var;
            this.f3959b = i;
            this.f3960c = i2;
            this.f3961d = i3;
            this.f3962e = i4;
        }
    }

    /* renamed from: T */
    private void m6492T(RecyclerView.C1336d0 d0Var) {
        View view = d0Var.f3747a;
        ViewPropertyAnimator animate = view.animate();
        this.f3922q.add(d0Var);
        animate.setDuration(mo5096o()).alpha(0.0f).setListener(new C1389d(d0Var, animate, view)).start();
    }

    /* renamed from: W */
    private void m6493W(List<C1394i> list, RecyclerView.C1336d0 d0Var) {
        for (int size = list.size() - 1; size >= 0; size--) {
            C1394i iVar = list.get(size);
            if (m6495Y(iVar, d0Var) && iVar.f3952a == null && iVar.f3953b == null) {
                list.remove(iVar);
            }
        }
    }

    /* renamed from: X */
    private void m6494X(C1394i iVar) {
        RecyclerView.C1336d0 d0Var = iVar.f3952a;
        if (d0Var != null) {
            m6495Y(iVar, d0Var);
        }
        RecyclerView.C1336d0 d0Var2 = iVar.f3953b;
        if (d0Var2 != null) {
            m6495Y(iVar, d0Var2);
        }
    }

    /* renamed from: Y */
    private boolean m6495Y(C1394i iVar, RecyclerView.C1336d0 d0Var) {
        boolean z = false;
        if (iVar.f3953b == d0Var) {
            iVar.f3953b = null;
        } else if (iVar.f3952a != d0Var) {
            return false;
        } else {
            iVar.f3952a = null;
            z = true;
        }
        d0Var.f3747a.setAlpha(1.0f);
        d0Var.f3747a.setTranslationX(0.0f);
        d0Var.f3747a.setTranslationY(0.0f);
        mo5510C(d0Var, z);
        return true;
    }

    /* renamed from: Z */
    private void m6496Z(RecyclerView.C1336d0 d0Var) {
        if (f3912s == null) {
            f3912s = new ValueAnimator().getInterpolator();
        }
        d0Var.f3747a.animate().setInterpolator(f3912s);
        mo5091j(d0Var);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Q */
    public void mo5421Q(RecyclerView.C1336d0 d0Var) {
        View view = d0Var.f3747a;
        ViewPropertyAnimator animate = view.animate();
        this.f3920o.add(d0Var);
        animate.alpha(1.0f).setDuration(mo5093l()).setListener(new C1390e(d0Var, view, animate)).start();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: R */
    public void mo5422R(C1394i iVar) {
        View view;
        RecyclerView.C1336d0 d0Var = iVar.f3952a;
        View view2 = null;
        if (d0Var == null) {
            view = null;
        } else {
            view = d0Var.f3747a;
        }
        RecyclerView.C1336d0 d0Var2 = iVar.f3953b;
        if (d0Var2 != null) {
            view2 = d0Var2.f3747a;
        }
        if (view != null) {
            ViewPropertyAnimator duration = view.animate().setDuration(mo5094m());
            this.f3923r.add(iVar.f3952a);
            duration.translationX((float) (iVar.f3956e - iVar.f3954c));
            duration.translationY((float) (iVar.f3957f - iVar.f3955d));
            duration.alpha(0.0f).setListener(new C1392g(iVar, duration, view)).start();
        }
        if (view2 != null) {
            ViewPropertyAnimator animate = view2.animate();
            this.f3923r.add(iVar.f3953b);
            animate.translationX(0.0f).translationY(0.0f).setDuration(mo5094m()).alpha(1.0f).setListener(new C1393h(iVar, animate, view2)).start();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: S */
    public void mo5423S(RecyclerView.C1336d0 d0Var, int i, int i2, int i3, int i4) {
        View view = d0Var.f3747a;
        int i5 = i3 - i;
        int i6 = i4 - i2;
        if (i5 != 0) {
            view.animate().translationX(0.0f);
        }
        if (i6 != 0) {
            view.animate().translationY(0.0f);
        }
        ViewPropertyAnimator animate = view.animate();
        this.f3921p.add(d0Var);
        animate.setDuration(mo5095n()).setListener(new C1391f(d0Var, i5, view, i6, animate)).start();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: U */
    public void mo5424U(List<RecyclerView.C1336d0> list) {
        for (int size = list.size() - 1; size >= 0; size--) {
            list.get(size).f3747a.animate().cancel();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: V */
    public void mo5425V() {
        if (!mo5097p()) {
            mo5090i();
        }
    }

    /* renamed from: g */
    public boolean mo5088g(RecyclerView.C1336d0 d0Var, List<Object> list) {
        return !list.isEmpty() || super.mo5088g(d0Var, list);
    }

    /* renamed from: j */
    public void mo5091j(RecyclerView.C1336d0 d0Var) {
        View view = d0Var.f3747a;
        view.animate().cancel();
        int size = this.f3915j.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            } else if (this.f3915j.get(size).f3958a == d0Var) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                mo5512E(d0Var);
                this.f3915j.remove(size);
            }
        }
        m6493W(this.f3916k, d0Var);
        if (this.f3913h.remove(d0Var)) {
            view.setAlpha(1.0f);
            mo5514G(d0Var);
        }
        if (this.f3914i.remove(d0Var)) {
            view.setAlpha(1.0f);
            mo5508A(d0Var);
        }
        for (int size2 = this.f3919n.size() - 1; size2 >= 0; size2--) {
            ArrayList arrayList = this.f3919n.get(size2);
            m6493W(arrayList, d0Var);
            if (arrayList.isEmpty()) {
                this.f3919n.remove(size2);
            }
        }
        for (int size3 = this.f3918m.size() - 1; size3 >= 0; size3--) {
            ArrayList arrayList2 = this.f3918m.get(size3);
            int size4 = arrayList2.size() - 1;
            while (true) {
                if (size4 < 0) {
                    break;
                } else if (((C1395j) arrayList2.get(size4)).f3958a == d0Var) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    mo5512E(d0Var);
                    arrayList2.remove(size4);
                    if (arrayList2.isEmpty()) {
                        this.f3918m.remove(size3);
                    }
                } else {
                    size4--;
                }
            }
        }
        for (int size5 = this.f3917l.size() - 1; size5 >= 0; size5--) {
            ArrayList arrayList3 = this.f3917l.get(size5);
            if (arrayList3.remove(d0Var)) {
                view.setAlpha(1.0f);
                mo5508A(d0Var);
                if (arrayList3.isEmpty()) {
                    this.f3917l.remove(size5);
                }
            }
        }
        this.f3922q.remove(d0Var);
        this.f3920o.remove(d0Var);
        this.f3923r.remove(d0Var);
        this.f3921p.remove(d0Var);
        mo5425V();
    }

    /* renamed from: k */
    public void mo5092k() {
        int size = this.f3915j.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            C1395j jVar = this.f3915j.get(size);
            View view = jVar.f3958a.f3747a;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            mo5512E(jVar.f3958a);
            this.f3915j.remove(size);
        }
        for (int size2 = this.f3913h.size() - 1; size2 >= 0; size2--) {
            mo5514G(this.f3913h.get(size2));
            this.f3913h.remove(size2);
        }
        int size3 = this.f3914i.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            RecyclerView.C1336d0 d0Var = this.f3914i.get(size3);
            d0Var.f3747a.setAlpha(1.0f);
            mo5508A(d0Var);
            this.f3914i.remove(size3);
        }
        for (int size4 = this.f3916k.size() - 1; size4 >= 0; size4--) {
            m6494X(this.f3916k.get(size4));
        }
        this.f3916k.clear();
        if (mo5097p()) {
            for (int size5 = this.f3918m.size() - 1; size5 >= 0; size5--) {
                ArrayList arrayList = this.f3918m.get(size5);
                for (int size6 = arrayList.size() - 1; size6 >= 0; size6--) {
                    C1395j jVar2 = (C1395j) arrayList.get(size6);
                    View view2 = jVar2.f3958a.f3747a;
                    view2.setTranslationY(0.0f);
                    view2.setTranslationX(0.0f);
                    mo5512E(jVar2.f3958a);
                    arrayList.remove(size6);
                    if (arrayList.isEmpty()) {
                        this.f3918m.remove(arrayList);
                    }
                }
            }
            for (int size7 = this.f3917l.size() - 1; size7 >= 0; size7--) {
                ArrayList arrayList2 = this.f3917l.get(size7);
                for (int size8 = arrayList2.size() - 1; size8 >= 0; size8--) {
                    RecyclerView.C1336d0 d0Var2 = (RecyclerView.C1336d0) arrayList2.get(size8);
                    d0Var2.f3747a.setAlpha(1.0f);
                    mo5508A(d0Var2);
                    arrayList2.remove(size8);
                    if (arrayList2.isEmpty()) {
                        this.f3917l.remove(arrayList2);
                    }
                }
            }
            for (int size9 = this.f3919n.size() - 1; size9 >= 0; size9--) {
                ArrayList arrayList3 = this.f3919n.get(size9);
                for (int size10 = arrayList3.size() - 1; size10 >= 0; size10--) {
                    m6494X((C1394i) arrayList3.get(size10));
                    if (arrayList3.isEmpty()) {
                        this.f3919n.remove(arrayList3);
                    }
                }
            }
            mo5424U(this.f3922q);
            mo5424U(this.f3921p);
            mo5424U(this.f3920o);
            mo5424U(this.f3923r);
            mo5090i();
        }
    }

    /* renamed from: p */
    public boolean mo5097p() {
        return !this.f3914i.isEmpty() || !this.f3916k.isEmpty() || !this.f3915j.isEmpty() || !this.f3913h.isEmpty() || !this.f3921p.isEmpty() || !this.f3922q.isEmpty() || !this.f3920o.isEmpty() || !this.f3923r.isEmpty() || !this.f3918m.isEmpty() || !this.f3917l.isEmpty() || !this.f3919n.isEmpty();
    }

    /* renamed from: u */
    public void mo5102u() {
        boolean z = !this.f3913h.isEmpty();
        boolean z2 = !this.f3915j.isEmpty();
        boolean z3 = !this.f3916k.isEmpty();
        boolean z4 = !this.f3914i.isEmpty();
        if (z || z2 || z4 || z3) {
            Iterator<RecyclerView.C1336d0> it = this.f3913h.iterator();
            while (it.hasNext()) {
                m6492T(it.next());
            }
            this.f3913h.clear();
            if (z2) {
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(this.f3915j);
                this.f3918m.add(arrayList);
                this.f3915j.clear();
                C1386a aVar = new C1386a(arrayList);
                if (z) {
                    C0835a0.m3727g0(((C1395j) arrayList.get(0)).f3958a.f3747a, aVar, mo5096o());
                } else {
                    aVar.run();
                }
            }
            if (z3) {
                ArrayList arrayList2 = new ArrayList();
                arrayList2.addAll(this.f3916k);
                this.f3919n.add(arrayList2);
                this.f3916k.clear();
                C1387b bVar = new C1387b(arrayList2);
                if (z) {
                    C0835a0.m3727g0(((C1394i) arrayList2.get(0)).f3952a.f3747a, bVar, mo5096o());
                } else {
                    bVar.run();
                }
            }
            if (z4) {
                ArrayList arrayList3 = new ArrayList();
                arrayList3.addAll(this.f3914i);
                this.f3917l.add(arrayList3);
                this.f3914i.clear();
                C1388c cVar = new C1388c(arrayList3);
                if (z || z2 || z3) {
                    long j = 0;
                    long o = z ? mo5096o() : 0;
                    long n = z2 ? mo5095n() : 0;
                    if (z3) {
                        j = mo5094m();
                    }
                    C0835a0.m3727g0(((RecyclerView.C1336d0) arrayList3.get(0)).f3747a, cVar, o + Math.max(n, j));
                    return;
                }
                cVar.run();
            }
        }
    }

    /* renamed from: w */
    public boolean mo5426w(RecyclerView.C1336d0 d0Var) {
        m6496Z(d0Var);
        d0Var.f3747a.setAlpha(0.0f);
        this.f3914i.add(d0Var);
        return true;
    }

    /* renamed from: x */
    public boolean mo5427x(RecyclerView.C1336d0 d0Var, RecyclerView.C1336d0 d0Var2, int i, int i2, int i3, int i4) {
        if (d0Var == d0Var2) {
            return mo5428y(d0Var, i, i2, i3, i4);
        }
        float translationX = d0Var.f3747a.getTranslationX();
        float translationY = d0Var.f3747a.getTranslationY();
        float alpha = d0Var.f3747a.getAlpha();
        m6496Z(d0Var);
        int i5 = (int) (((float) (i3 - i)) - translationX);
        int i6 = (int) (((float) (i4 - i2)) - translationY);
        d0Var.f3747a.setTranslationX(translationX);
        d0Var.f3747a.setTranslationY(translationY);
        d0Var.f3747a.setAlpha(alpha);
        if (d0Var2 != null) {
            m6496Z(d0Var2);
            d0Var2.f3747a.setTranslationX((float) (-i5));
            d0Var2.f3747a.setTranslationY((float) (-i6));
            d0Var2.f3747a.setAlpha(0.0f);
        }
        this.f3916k.add(new C1394i(d0Var, d0Var2, i, i2, i3, i4));
        return true;
    }

    /* renamed from: y */
    public boolean mo5428y(RecyclerView.C1336d0 d0Var, int i, int i2, int i3, int i4) {
        View view = d0Var.f3747a;
        int translationX = i + ((int) view.getTranslationX());
        int translationY = i2 + ((int) d0Var.f3747a.getTranslationY());
        m6496Z(d0Var);
        int i5 = i3 - translationX;
        int i6 = i4 - translationY;
        if (i5 == 0 && i6 == 0) {
            mo5512E(d0Var);
            return false;
        }
        if (i5 != 0) {
            view.setTranslationX((float) (-i5));
        }
        if (i6 != 0) {
            view.setTranslationY((float) (-i6));
        }
        this.f3915j.add(new C1395j(d0Var, translationX, translationY, i3, i4));
        return true;
    }

    /* renamed from: z */
    public boolean mo5429z(RecyclerView.C1336d0 d0Var) {
        m6496Z(d0Var);
        this.f3913h.add(d0Var);
        return true;
    }

    /* renamed from: androidx.recyclerview.widget.c$i */
    /* compiled from: DefaultItemAnimator */
    private static class C1394i {

        /* renamed from: a */
        public RecyclerView.C1336d0 f3952a;

        /* renamed from: b */
        public RecyclerView.C1336d0 f3953b;

        /* renamed from: c */
        public int f3954c;

        /* renamed from: d */
        public int f3955d;

        /* renamed from: e */
        public int f3956e;

        /* renamed from: f */
        public int f3957f;

        private C1394i(RecyclerView.C1336d0 d0Var, RecyclerView.C1336d0 d0Var2) {
            this.f3952a = d0Var;
            this.f3953b = d0Var2;
        }

        public String toString() {
            return "ChangeInfo{oldHolder=" + this.f3952a + ", newHolder=" + this.f3953b + ", fromX=" + this.f3954c + ", fromY=" + this.f3955d + ", toX=" + this.f3956e + ", toY=" + this.f3957f + '}';
        }

        C1394i(RecyclerView.C1336d0 d0Var, RecyclerView.C1336d0 d0Var2, int i, int i2, int i3, int i4) {
            this(d0Var, d0Var2);
            this.f3954c = i;
            this.f3955d = i2;
            this.f3956e = i3;
            this.f3957f = i4;
        }
    }
}
