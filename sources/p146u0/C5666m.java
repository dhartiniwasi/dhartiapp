package p146u0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.graphics.Path;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import androidx.core.view.C0835a0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p124r.C5413a;
import p124r.C5418d;
import p124r.C5426g;

/* renamed from: u0.m */
/* compiled from: Transition */
public abstract class C5666m implements Cloneable {

    /* renamed from: P */
    private static final int[] f28365P = {2, 1, 3, 4};

    /* renamed from: Q */
    private static final C5651g f28366Q = new C5667a();

    /* renamed from: R */
    private static ThreadLocal<C5413a<Animator, C5670d>> f28367R = new ThreadLocal<>();

    /* renamed from: A */
    private int[] f28368A = f28365P;

    /* renamed from: B */
    private ArrayList<C5683s> f28369B;

    /* renamed from: C */
    private ArrayList<C5683s> f28370C;

    /* renamed from: D */
    private ViewGroup f28371D = null;

    /* renamed from: E */
    boolean f28372E = false;

    /* renamed from: F */
    ArrayList<Animator> f28373F = new ArrayList<>();

    /* renamed from: G */
    private int f28374G = 0;

    /* renamed from: H */
    private boolean f28375H = false;

    /* renamed from: I */
    private boolean f28376I = false;

    /* renamed from: J */
    private ArrayList<C5672f> f28377J = null;

    /* renamed from: K */
    private ArrayList<Animator> f28378K = new ArrayList<>();

    /* renamed from: L */
    C5678p f28379L;

    /* renamed from: M */
    private C5671e f28380M;

    /* renamed from: N */
    private C5413a<String, String> f28381N;

    /* renamed from: O */
    private C5651g f28382O = f28366Q;

    /* renamed from: a */
    private String f28383a = getClass().getName();

    /* renamed from: b */
    private long f28384b = -1;

    /* renamed from: c */
    long f28385c = -1;

    /* renamed from: d */
    private TimeInterpolator f28386d = null;

    /* renamed from: e */
    ArrayList<Integer> f28387e = new ArrayList<>();

    /* renamed from: f */
    ArrayList<View> f28388f = new ArrayList<>();

    /* renamed from: g */
    private ArrayList<String> f28389g = null;

    /* renamed from: h */
    private ArrayList<Class<?>> f28390h = null;

    /* renamed from: i */
    private ArrayList<Integer> f28391i = null;

    /* renamed from: r */
    private ArrayList<View> f28392r = null;

    /* renamed from: s */
    private ArrayList<Class<?>> f28393s = null;

    /* renamed from: t */
    private ArrayList<String> f28394t = null;

    /* renamed from: u */
    private ArrayList<Integer> f28395u = null;

    /* renamed from: v */
    private ArrayList<View> f28396v = null;

    /* renamed from: w */
    private ArrayList<Class<?>> f28397w = null;

    /* renamed from: x */
    private C5684t f28398x = new C5684t();

    /* renamed from: y */
    private C5684t f28399y = new C5684t();

    /* renamed from: z */
    C5679q f28400z = null;

    /* renamed from: u0.m$a */
    /* compiled from: Transition */
    static class C5667a extends C5651g {
        C5667a() {
        }

        /* renamed from: a */
        public Path mo19979a(float f, float f2, float f3, float f4) {
            Path path = new Path();
            path.moveTo(f, f2);
            path.lineTo(f3, f4);
            return path;
        }
    }

    /* renamed from: u0.m$b */
    /* compiled from: Transition */
    class C5668b extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ C5413a f28401a;

        C5668b(C5413a aVar) {
            this.f28401a = aVar;
        }

        public void onAnimationEnd(Animator animator) {
            this.f28401a.remove(animator);
            C5666m.this.f28373F.remove(animator);
        }

        public void onAnimationStart(Animator animator) {
            C5666m.this.f28373F.add(animator);
        }
    }

    /* renamed from: u0.m$c */
    /* compiled from: Transition */
    class C5669c extends AnimatorListenerAdapter {
        C5669c() {
        }

        public void onAnimationEnd(Animator animator) {
            C5666m.this.mo20031p();
            animator.removeListener(this);
        }
    }

    /* renamed from: u0.m$d */
    /* compiled from: Transition */
    private static class C5670d {

        /* renamed from: a */
        View f28404a;

        /* renamed from: b */
        String f28405b;

        /* renamed from: c */
        C5683s f28406c;

        /* renamed from: d */
        C5673m0 f28407d;

        /* renamed from: e */
        C5666m f28408e;

        C5670d(View view, String str, C5666m mVar, C5673m0 m0Var, C5683s sVar) {
            this.f28404a = view;
            this.f28405b = str;
            this.f28406c = sVar;
            this.f28407d = m0Var;
            this.f28408e = mVar;
        }
    }

    /* renamed from: u0.m$e */
    /* compiled from: Transition */
    public static abstract class C5671e {
    }

    /* renamed from: u0.m$f */
    /* compiled from: Transition */
    public interface C5672f {
        /* renamed from: a */
        void mo19953a(C5666m mVar);

        /* renamed from: b */
        void mo19975b(C5666m mVar);

        /* renamed from: c */
        void mo19954c(C5666m mVar);

        /* renamed from: d */
        void mo19955d(C5666m mVar);

        /* renamed from: e */
        void mo19956e(C5666m mVar);
    }

    /* renamed from: A */
    private static C5413a<Animator, C5670d> m33837A() {
        C5413a<Animator, C5670d> aVar = f28367R.get();
        if (aVar != null) {
            return aVar;
        }
        C5413a<Animator, C5670d> aVar2 = new C5413a<>();
        f28367R.set(aVar2);
        return aVar2;
    }

    /* renamed from: K */
    private static boolean m33838K(C5683s sVar, C5683s sVar2, String str) {
        Object obj = sVar.f28427a.get(str);
        Object obj2 = sVar2.f28427a.get(str);
        if (obj == null && obj2 == null) {
            return false;
        }
        if (obj == null || obj2 == null) {
            return true;
        }
        return true ^ obj.equals(obj2);
    }

    /* renamed from: L */
    private void m33839L(C5413a<View, C5683s> aVar, C5413a<View, C5683s> aVar2, SparseArray<View> sparseArray, SparseArray<View> sparseArray2) {
        View view;
        int size = sparseArray.size();
        for (int i = 0; i < size; i++) {
            View valueAt = sparseArray.valueAt(i);
            if (valueAt != null && mo20006J(valueAt) && (view = sparseArray2.get(sparseArray.keyAt(i))) != null && mo20006J(view)) {
                C5683s sVar = aVar.get(valueAt);
                C5683s sVar2 = aVar2.get(view);
                if (!(sVar == null || sVar2 == null)) {
                    this.f28369B.add(sVar);
                    this.f28370C.add(sVar2);
                    aVar.remove(valueAt);
                    aVar2.remove(view);
                }
            }
        }
    }

    /* renamed from: M */
    private void m33840M(C5413a<View, C5683s> aVar, C5413a<View, C5683s> aVar2) {
        C5683s remove;
        for (int size = aVar.size() - 1; size >= 0; size--) {
            View j = aVar.mo19668j(size);
            if (j != null && mo20006J(j) && (remove = aVar2.remove(j)) != null && mo20006J(remove.f28428b)) {
                this.f28369B.add(aVar.mo19670l(size));
                this.f28370C.add(remove);
            }
        }
    }

    /* renamed from: N */
    private void m33841N(C5413a<View, C5683s> aVar, C5413a<View, C5683s> aVar2, C5418d<View> dVar, C5418d<View> dVar2) {
        View e;
        int l = dVar.mo19581l();
        for (int i = 0; i < l; i++) {
            View m = dVar.mo19582m(i);
            if (m != null && mo20006J(m) && (e = dVar2.mo19574e(dVar.mo19577h(i))) != null && mo20006J(e)) {
                C5683s sVar = aVar.get(m);
                C5683s sVar2 = aVar2.get(e);
                if (!(sVar == null || sVar2 == null)) {
                    this.f28369B.add(sVar);
                    this.f28370C.add(sVar2);
                    aVar.remove(m);
                    aVar2.remove(e);
                }
            }
        }
    }

    /* renamed from: O */
    private void m33842O(C5413a<View, C5683s> aVar, C5413a<View, C5683s> aVar2, C5413a<String, View> aVar3, C5413a<String, View> aVar4) {
        View view;
        int size = aVar3.size();
        for (int i = 0; i < size; i++) {
            View n = aVar3.mo19672n(i);
            if (n != null && mo20006J(n) && (view = aVar4.get(aVar3.mo19668j(i))) != null && mo20006J(view)) {
                C5683s sVar = aVar.get(n);
                C5683s sVar2 = aVar2.get(view);
                if (!(sVar == null || sVar2 == null)) {
                    this.f28369B.add(sVar);
                    this.f28370C.add(sVar2);
                    aVar.remove(n);
                    aVar2.remove(view);
                }
            }
        }
    }

    /* renamed from: P */
    private void m33843P(C5684t tVar, C5684t tVar2) {
        C5413a aVar = new C5413a((C5426g) tVar.f28430a);
        C5413a aVar2 = new C5413a((C5426g) tVar2.f28430a);
        int i = 0;
        while (true) {
            int[] iArr = this.f28368A;
            if (i < iArr.length) {
                int i2 = iArr[i];
                if (i2 == 1) {
                    m33840M(aVar, aVar2);
                } else if (i2 == 2) {
                    m33842O(aVar, aVar2, tVar.f28433d, tVar2.f28433d);
                } else if (i2 == 3) {
                    m33839L(aVar, aVar2, tVar.f28431b, tVar2.f28431b);
                } else if (i2 == 4) {
                    m33841N(aVar, aVar2, tVar.f28432c, tVar2.f28432c);
                }
                i++;
            } else {
                m33845c(aVar, aVar2);
                return;
            }
        }
    }

    /* renamed from: V */
    private void m33844V(Animator animator, C5413a<Animator, C5670d> aVar) {
        if (animator != null) {
            animator.addListener(new C5668b(aVar));
            mo20022e(animator);
        }
    }

    /* renamed from: c */
    private void m33845c(C5413a<View, C5683s> aVar, C5413a<View, C5683s> aVar2) {
        for (int i = 0; i < aVar.size(); i++) {
            C5683s n = aVar.mo19672n(i);
            if (mo20006J(n.f28428b)) {
                this.f28369B.add(n);
                this.f28370C.add((Object) null);
            }
        }
        for (int i2 = 0; i2 < aVar2.size(); i2++) {
            C5683s n2 = aVar2.mo19672n(i2);
            if (mo20006J(n2.f28428b)) {
                this.f28370C.add(n2);
                this.f28369B.add((Object) null);
            }
        }
    }

    /* renamed from: d */
    private static void m33846d(C5684t tVar, View view, C5683s sVar) {
        tVar.f28430a.put(view, sVar);
        int id = view.getId();
        if (id >= 0) {
            if (tVar.f28431b.indexOfKey(id) >= 0) {
                tVar.f28431b.put(id, (Object) null);
            } else {
                tVar.f28431b.put(id, view);
            }
        }
        String J = C0835a0.m3697J(view);
        if (J != null) {
            if (tVar.f28433d.containsKey(J)) {
                tVar.f28433d.put(J, null);
            } else {
                tVar.f28433d.put(J, view);
            }
        }
        if (view.getParent() instanceof ListView) {
            ListView listView = (ListView) view.getParent();
            if (listView.getAdapter().hasStableIds()) {
                long itemIdAtPosition = listView.getItemIdAtPosition(listView.getPositionForView(view));
                if (tVar.f28432c.mo19576g(itemIdAtPosition) >= 0) {
                    View e = tVar.f28432c.mo19574e(itemIdAtPosition);
                    if (e != null) {
                        C0835a0.m3759w0(e, false);
                        tVar.f28432c.mo19578i(itemIdAtPosition, null);
                        return;
                    }
                    return;
                }
                C0835a0.m3759w0(view, true);
                tVar.f28432c.mo19578i(itemIdAtPosition, view);
            }
        }
    }

    /* renamed from: h */
    private void m33847h(View view, boolean z) {
        if (view != null) {
            int id = view.getId();
            ArrayList<Integer> arrayList = this.f28391i;
            if (arrayList == null || !arrayList.contains(Integer.valueOf(id))) {
                ArrayList<View> arrayList2 = this.f28392r;
                if (arrayList2 == null || !arrayList2.contains(view)) {
                    ArrayList<Class<?>> arrayList3 = this.f28393s;
                    if (arrayList3 != null) {
                        int size = arrayList3.size();
                        int i = 0;
                        while (i < size) {
                            if (!this.f28393s.get(i).isInstance(view)) {
                                i++;
                            } else {
                                return;
                            }
                        }
                    }
                    if (view.getParent() instanceof ViewGroup) {
                        C5683s sVar = new C5683s(view);
                        if (z) {
                            mo19924j(sVar);
                        } else {
                            mo19923g(sVar);
                        }
                        sVar.f28429c.add(this);
                        mo20026i(sVar);
                        if (z) {
                            m33846d(this.f28398x, view, sVar);
                        } else {
                            m33846d(this.f28399y, view, sVar);
                        }
                    }
                    if (view instanceof ViewGroup) {
                        ArrayList<Integer> arrayList4 = this.f28395u;
                        if (arrayList4 == null || !arrayList4.contains(Integer.valueOf(id))) {
                            ArrayList<View> arrayList5 = this.f28396v;
                            if (arrayList5 == null || !arrayList5.contains(view)) {
                                ArrayList<Class<?>> arrayList6 = this.f28397w;
                                if (arrayList6 != null) {
                                    int size2 = arrayList6.size();
                                    int i2 = 0;
                                    while (i2 < size2) {
                                        if (!this.f28397w.get(i2).isInstance(view)) {
                                            i2++;
                                        } else {
                                            return;
                                        }
                                    }
                                }
                                ViewGroup viewGroup = (ViewGroup) view;
                                for (int i3 = 0; i3 < viewGroup.getChildCount(); i3++) {
                                    m33847h(viewGroup.getChildAt(i3), z);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    /* renamed from: B */
    public long mo20000B() {
        return this.f28384b;
    }

    /* renamed from: C */
    public List<Integer> mo20001C() {
        return this.f28387e;
    }

    /* renamed from: D */
    public List<String> mo20002D() {
        return this.f28389g;
    }

    /* renamed from: E */
    public List<Class<?>> mo20003E() {
        return this.f28390h;
    }

    /* renamed from: F */
    public List<View> mo20004F() {
        return this.f28388f;
    }

    /* renamed from: G */
    public String[] mo19922G() {
        return null;
    }

    /* renamed from: H */
    public C5683s mo20005H(View view, boolean z) {
        C5679q qVar = this.f28400z;
        if (qVar != null) {
            return qVar.mo20005H(view, z);
        }
        return (z ? this.f28398x : this.f28399y).f28430a.get(view);
    }

    /* renamed from: I */
    public boolean mo19985I(C5683s sVar, C5683s sVar2) {
        if (sVar == null || sVar2 == null) {
            return false;
        }
        String[] G = mo19922G();
        if (G != null) {
            int length = G.length;
            int i = 0;
            while (i < length) {
                if (!m33838K(sVar, sVar2, G[i])) {
                    i++;
                }
            }
            return false;
        }
        for (String K : sVar.f28427a.keySet()) {
            if (m33838K(sVar, sVar2, K)) {
            }
        }
        return false;
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: J */
    public boolean mo20006J(View view) {
        ArrayList<Class<?>> arrayList;
        ArrayList<String> arrayList2;
        int id = view.getId();
        ArrayList<Integer> arrayList3 = this.f28391i;
        if (arrayList3 != null && arrayList3.contains(Integer.valueOf(id))) {
            return false;
        }
        ArrayList<View> arrayList4 = this.f28392r;
        if (arrayList4 != null && arrayList4.contains(view)) {
            return false;
        }
        ArrayList<Class<?>> arrayList5 = this.f28393s;
        if (arrayList5 != null) {
            int size = arrayList5.size();
            for (int i = 0; i < size; i++) {
                if (this.f28393s.get(i).isInstance(view)) {
                    return false;
                }
            }
        }
        if (this.f28394t != null && C0835a0.m3697J(view) != null && this.f28394t.contains(C0835a0.m3697J(view))) {
            return false;
        }
        if ((this.f28387e.size() == 0 && this.f28388f.size() == 0 && (((arrayList = this.f28390h) == null || arrayList.isEmpty()) && ((arrayList2 = this.f28389g) == null || arrayList2.isEmpty()))) || this.f28387e.contains(Integer.valueOf(id)) || this.f28388f.contains(view)) {
            return true;
        }
        ArrayList<String> arrayList6 = this.f28389g;
        if (arrayList6 != null && arrayList6.contains(C0835a0.m3697J(view))) {
            return true;
        }
        if (this.f28390h != null) {
            for (int i2 = 0; i2 < this.f28390h.size(); i2++) {
                if (this.f28390h.get(i2).isInstance(view)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: Q */
    public void mo20007Q(View view) {
        if (!this.f28376I) {
            C5413a<Animator, C5670d> A = m33837A();
            int size = A.size();
            C5673m0 d = C5636c0.m33742d(view);
            for (int i = size - 1; i >= 0; i--) {
                C5670d n = A.mo19672n(i);
                if (n.f28404a != null && d.equals(n.f28407d)) {
                    C5619a.m33707b(A.mo19668j(i));
                }
            }
            ArrayList<C5672f> arrayList = this.f28377J;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.f28377J.clone();
                int size2 = arrayList2.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    ((C5672f) arrayList2.get(i2)).mo19954c(this);
                }
            }
            this.f28375H = true;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: R */
    public void mo20008R(ViewGroup viewGroup) {
        C5670d dVar;
        this.f28369B = new ArrayList<>();
        this.f28370C = new ArrayList<>();
        m33843P(this.f28398x, this.f28399y);
        C5413a<Animator, C5670d> A = m33837A();
        int size = A.size();
        C5673m0 d = C5636c0.m33742d(viewGroup);
        for (int i = size - 1; i >= 0; i--) {
            Animator j = A.mo19668j(i);
            if (!(j == null || (dVar = A.get(j)) == null || dVar.f28404a == null || !d.equals(dVar.f28407d))) {
                C5683s sVar = dVar.f28406c;
                View view = dVar.f28404a;
                C5683s H = mo20005H(view, true);
                C5683s v = mo20036v(view, true);
                if (H == null && v == null) {
                    v = this.f28399y.f28430a.get(view);
                }
                if (!(H == null && v == null) && dVar.f28408e.mo19985I(sVar, v)) {
                    if (j.isRunning() || j.isStarted()) {
                        j.cancel();
                    } else {
                        A.remove(j);
                    }
                }
            }
        }
        mo20030o(viewGroup, this.f28398x, this.f28399y, this.f28369B, this.f28370C);
        mo20012W();
    }

    /* renamed from: S */
    public C5666m mo20009S(C5672f fVar) {
        ArrayList<C5672f> arrayList = this.f28377J;
        if (arrayList == null) {
            return this;
        }
        arrayList.remove(fVar);
        if (this.f28377J.size() == 0) {
            this.f28377J = null;
        }
        return this;
    }

    /* renamed from: T */
    public C5666m mo20010T(View view) {
        this.f28388f.remove(view);
        return this;
    }

    /* renamed from: U */
    public void mo20011U(View view) {
        if (this.f28375H) {
            if (!this.f28376I) {
                C5413a<Animator, C5670d> A = m33837A();
                int size = A.size();
                C5673m0 d = C5636c0.m33742d(view);
                for (int i = size - 1; i >= 0; i--) {
                    C5670d n = A.mo19672n(i);
                    if (n.f28404a != null && d.equals(n.f28407d)) {
                        C5619a.m33708c(A.mo19668j(i));
                    }
                }
                ArrayList<C5672f> arrayList = this.f28377J;
                if (arrayList != null && arrayList.size() > 0) {
                    ArrayList arrayList2 = (ArrayList) this.f28377J.clone();
                    int size2 = arrayList2.size();
                    for (int i2 = 0; i2 < size2; i2++) {
                        ((C5672f) arrayList2.get(i2)).mo19953a(this);
                    }
                }
            }
            this.f28375H = false;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: W */
    public void mo20012W() {
        mo20023e0();
        C5413a<Animator, C5670d> A = m33837A();
        Iterator<Animator> it = this.f28378K.iterator();
        while (it.hasNext()) {
            Animator next = it.next();
            if (A.containsKey(next)) {
                mo20023e0();
                m33844V(next, A);
            }
        }
        this.f28378K.clear();
        mo20031p();
    }

    /* renamed from: Y */
    public C5666m mo20013Y(long j) {
        this.f28385c = j;
        return this;
    }

    /* renamed from: Z */
    public void mo20014Z(C5671e eVar) {
        this.f28380M = eVar;
    }

    /* renamed from: a */
    public C5666m mo20015a(C5672f fVar) {
        if (this.f28377J == null) {
            this.f28377J = new ArrayList<>();
        }
        this.f28377J.add(fVar);
        return this;
    }

    /* renamed from: a0 */
    public C5666m mo20016a0(TimeInterpolator timeInterpolator) {
        this.f28386d = timeInterpolator;
        return this;
    }

    /* renamed from: b */
    public C5666m mo20017b(View view) {
        this.f28388f.add(view);
        return this;
    }

    /* renamed from: b0 */
    public void mo20018b0(C5651g gVar) {
        if (gVar == null) {
            this.f28382O = f28366Q;
        } else {
            this.f28382O = gVar;
        }
    }

    /* renamed from: c0 */
    public void mo20019c0(C5678p pVar) {
    }

    /* renamed from: d0 */
    public C5666m mo20021d0(long j) {
        this.f28384b = j;
        return this;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo20022e(Animator animator) {
        if (animator == null) {
            mo20031p();
            return;
        }
        if (mo20032r() >= 0) {
            animator.setDuration(mo20032r());
        }
        if (mo20000B() >= 0) {
            animator.setStartDelay(mo20000B() + animator.getStartDelay());
        }
        if (mo20035u() != null) {
            animator.setInterpolator(mo20035u());
        }
        animator.addListener(new C5669c());
        animator.start();
    }

    /* access modifiers changed from: protected */
    /* renamed from: e0 */
    public void mo20023e0() {
        if (this.f28374G == 0) {
            ArrayList<C5672f> arrayList = this.f28377J;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.f28377J.clone();
                int size = arrayList2.size();
                for (int i = 0; i < size; i++) {
                    ((C5672f) arrayList2.get(i)).mo19975b(this);
                }
            }
            this.f28376I = false;
        }
        this.f28374G++;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public void mo20024f() {
        for (int size = this.f28373F.size() - 1; size >= 0; size--) {
            this.f28373F.get(size).cancel();
        }
        ArrayList<C5672f> arrayList = this.f28377J;
        if (arrayList != null && arrayList.size() > 0) {
            ArrayList arrayList2 = (ArrayList) this.f28377J.clone();
            int size2 = arrayList2.size();
            for (int i = 0; i < size2; i++) {
                ((C5672f) arrayList2.get(i)).mo19956e(this);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f0 */
    public String mo20025f0(String str) {
        String str2 = str + getClass().getSimpleName() + "@" + Integer.toHexString(hashCode()) + ": ";
        if (this.f28385c != -1) {
            str2 = str2 + "dur(" + this.f28385c + ") ";
        }
        if (this.f28384b != -1) {
            str2 = str2 + "dly(" + this.f28384b + ") ";
        }
        if (this.f28386d != null) {
            str2 = str2 + "interp(" + this.f28386d + ") ";
        }
        if (this.f28387e.size() <= 0 && this.f28388f.size() <= 0) {
            return str2;
        }
        String str3 = str2 + "tgts(";
        if (this.f28387e.size() > 0) {
            for (int i = 0; i < this.f28387e.size(); i++) {
                if (i > 0) {
                    str3 = str3 + ", ";
                }
                str3 = str3 + this.f28387e.get(i);
            }
        }
        if (this.f28388f.size() > 0) {
            for (int i2 = 0; i2 < this.f28388f.size(); i2++) {
                if (i2 > 0) {
                    str3 = str3 + ", ";
                }
                str3 = str3 + this.f28388f.get(i2);
            }
        }
        return str3 + ")";
    }

    /* renamed from: g */
    public abstract void mo19923g(C5683s sVar);

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public void mo20026i(C5683s sVar) {
    }

    /* renamed from: j */
    public abstract void mo19924j(C5683s sVar);

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public void mo20027k(ViewGroup viewGroup, boolean z) {
        C5413a<String, String> aVar;
        ArrayList<String> arrayList;
        ArrayList<Class<?>> arrayList2;
        mo20028l(z);
        if ((this.f28387e.size() > 0 || this.f28388f.size() > 0) && (((arrayList = this.f28389g) == null || arrayList.isEmpty()) && ((arrayList2 = this.f28390h) == null || arrayList2.isEmpty()))) {
            for (int i = 0; i < this.f28387e.size(); i++) {
                View findViewById = viewGroup.findViewById(this.f28387e.get(i).intValue());
                if (findViewById != null) {
                    C5683s sVar = new C5683s(findViewById);
                    if (z) {
                        mo19924j(sVar);
                    } else {
                        mo19923g(sVar);
                    }
                    sVar.f28429c.add(this);
                    mo20026i(sVar);
                    if (z) {
                        m33846d(this.f28398x, findViewById, sVar);
                    } else {
                        m33846d(this.f28399y, findViewById, sVar);
                    }
                }
            }
            for (int i2 = 0; i2 < this.f28388f.size(); i2++) {
                View view = this.f28388f.get(i2);
                C5683s sVar2 = new C5683s(view);
                if (z) {
                    mo19924j(sVar2);
                } else {
                    mo19923g(sVar2);
                }
                sVar2.f28429c.add(this);
                mo20026i(sVar2);
                if (z) {
                    m33846d(this.f28398x, view, sVar2);
                } else {
                    m33846d(this.f28399y, view, sVar2);
                }
            }
        } else {
            m33847h(viewGroup, z);
        }
        if (!z && (aVar = this.f28381N) != null) {
            int size = aVar.size();
            ArrayList arrayList3 = new ArrayList(size);
            for (int i3 = 0; i3 < size; i3++) {
                arrayList3.add(this.f28398x.f28433d.remove(this.f28381N.mo19668j(i3)));
            }
            for (int i4 = 0; i4 < size; i4++) {
                View view2 = (View) arrayList3.get(i4);
                if (view2 != null) {
                    this.f28398x.f28433d.put(this.f28381N.mo19672n(i4), view2);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public void mo20028l(boolean z) {
        if (z) {
            this.f28398x.f28430a.clear();
            this.f28398x.f28431b.clear();
            this.f28398x.f28432c.mo19571b();
            return;
        }
        this.f28399y.f28430a.clear();
        this.f28399y.f28431b.clear();
        this.f28399y.f28432c.mo19571b();
    }

    /* renamed from: m */
    public C5666m clone() {
        try {
            C5666m mVar = (C5666m) super.clone();
            mVar.f28378K = new ArrayList<>();
            mVar.f28398x = new C5684t();
            mVar.f28399y = new C5684t();
            mVar.f28369B = null;
            mVar.f28370C = null;
            return mVar;
        } catch (CloneNotSupportedException unused) {
            return null;
        }
    }

    /* renamed from: n */
    public Animator mo19925n(ViewGroup viewGroup, C5683s sVar, C5683s sVar2) {
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public void mo20030o(ViewGroup viewGroup, C5684t tVar, C5684t tVar2, ArrayList<C5683s> arrayList, ArrayList<C5683s> arrayList2) {
        int i;
        Animator animator;
        C5683s sVar;
        View view;
        C5683s sVar2;
        Animator animator2;
        C5413a<Animator, C5670d> A = m33837A();
        SparseIntArray sparseIntArray = new SparseIntArray();
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            C5683s sVar3 = arrayList.get(i2);
            C5683s sVar4 = arrayList2.get(i2);
            if (sVar3 != null && !sVar3.f28429c.contains(this)) {
                sVar3 = null;
            }
            if (sVar4 != null && !sVar4.f28429c.contains(this)) {
                sVar4 = null;
            }
            if (!(sVar3 == null && sVar4 == null)) {
                if (sVar3 == null || sVar4 == null || mo19985I(sVar3, sVar4)) {
                    Animator n = mo19925n(viewGroup, sVar3, sVar4);
                    if (n != null) {
                        if (sVar4 != null) {
                            View view2 = sVar4.f28428b;
                            String[] G = mo19922G();
                            if (G != null && G.length > 0) {
                                sVar2 = new C5683s(view2);
                                C5683s sVar5 = tVar2.f28430a.get(view2);
                                if (sVar5 != null) {
                                    int i3 = 0;
                                    while (i3 < G.length) {
                                        sVar2.f28427a.put(G[i3], sVar5.f28427a.get(G[i3]));
                                        i3++;
                                        n = n;
                                        size = size;
                                        sVar5 = sVar5;
                                    }
                                }
                                Animator animator3 = n;
                                i = size;
                                int size2 = A.size();
                                int i4 = 0;
                                while (true) {
                                    if (i4 >= size2) {
                                        animator2 = animator3;
                                        break;
                                    }
                                    C5670d dVar = A.get(A.mo19668j(i4));
                                    if (dVar.f28406c != null && dVar.f28404a == view2 && dVar.f28405b.equals(mo20037x()) && dVar.f28406c.equals(sVar2)) {
                                        animator2 = null;
                                        break;
                                    }
                                    i4++;
                                }
                            } else {
                                C5684t tVar3 = tVar2;
                                i = size;
                                animator2 = n;
                                sVar2 = null;
                            }
                            view = view2;
                            animator = animator2;
                            sVar = sVar2;
                        } else {
                            C5684t tVar4 = tVar2;
                            i = size;
                            view = sVar3.f28428b;
                            animator = n;
                            sVar = null;
                        }
                        if (animator != null) {
                            A.put(animator, new C5670d(view, mo20037x(), this, C5636c0.m33742d(viewGroup), sVar));
                            this.f28378K.add(animator);
                        }
                        i2++;
                        size = i;
                    }
                    C5684t tVar5 = tVar2;
                    i = size;
                    i2++;
                    size = i;
                }
            }
            ViewGroup viewGroup2 = viewGroup;
            C5684t tVar52 = tVar2;
            i = size;
            i2++;
            size = i;
        }
        if (sparseIntArray.size() != 0) {
            for (int i5 = 0; i5 < sparseIntArray.size(); i5++) {
                Animator animator4 = this.f28378K.get(sparseIntArray.keyAt(i5));
                animator4.setStartDelay((((long) sparseIntArray.valueAt(i5)) - Long.MAX_VALUE) + animator4.getStartDelay());
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public void mo20031p() {
        int i = this.f28374G - 1;
        this.f28374G = i;
        if (i == 0) {
            ArrayList<C5672f> arrayList = this.f28377J;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.f28377J.clone();
                int size = arrayList2.size();
                for (int i2 = 0; i2 < size; i2++) {
                    ((C5672f) arrayList2.get(i2)).mo19955d(this);
                }
            }
            for (int i3 = 0; i3 < this.f28398x.f28432c.mo19581l(); i3++) {
                View m = this.f28398x.f28432c.mo19582m(i3);
                if (m != null) {
                    C0835a0.m3759w0(m, false);
                }
            }
            for (int i4 = 0; i4 < this.f28399y.f28432c.mo19581l(); i4++) {
                View m2 = this.f28399y.f28432c.mo19582m(i4);
                if (m2 != null) {
                    C0835a0.m3759w0(m2, false);
                }
            }
            this.f28376I = true;
        }
    }

    /* renamed from: r */
    public long mo20032r() {
        return this.f28385c;
    }

    /* renamed from: s */
    public C5671e mo20033s() {
        return this.f28380M;
    }

    public String toString() {
        return mo20025f0("");
    }

    /* renamed from: u */
    public TimeInterpolator mo20035u() {
        return this.f28386d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: v */
    public C5683s mo20036v(View view, boolean z) {
        C5679q qVar = this.f28400z;
        if (qVar != null) {
            return qVar.mo20036v(view, z);
        }
        ArrayList<C5683s> arrayList = z ? this.f28369B : this.f28370C;
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        int i = -1;
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                break;
            }
            C5683s sVar = arrayList.get(i2);
            if (sVar == null) {
                return null;
            }
            if (sVar.f28428b == view) {
                i = i2;
                break;
            }
            i2++;
        }
        if (i < 0) {
            return null;
        }
        return (z ? this.f28370C : this.f28369B).get(i);
    }

    /* renamed from: x */
    public String mo20037x() {
        return this.f28383a;
    }

    /* renamed from: y */
    public C5651g mo20038y() {
        return this.f28382O;
    }

    /* renamed from: z */
    public C5678p mo20039z() {
        return this.f28379L;
    }
}
