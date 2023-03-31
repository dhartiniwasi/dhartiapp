package p146u0;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.C1163z;
import java.util.ArrayList;
import java.util.List;
import p146u0.C5666m;

/* renamed from: u0.e */
/* compiled from: FragmentTransitionSupport */
public class C5643e extends C1163z {

    /* renamed from: u0.e$a */
    /* compiled from: FragmentTransitionSupport */
    class C5644a extends C5666m.C5671e {

        /* renamed from: a */
        final /* synthetic */ Rect f28314a;

        C5644a(Rect rect) {
            this.f28314a = rect;
        }
    }

    /* renamed from: u0.e$b */
    /* compiled from: FragmentTransitionSupport */
    class C5645b implements C5666m.C5672f {

        /* renamed from: a */
        final /* synthetic */ View f28316a;

        /* renamed from: b */
        final /* synthetic */ ArrayList f28317b;

        C5645b(View view, ArrayList arrayList) {
            this.f28316a = view;
            this.f28317b = arrayList;
        }

        /* renamed from: a */
        public void mo19953a(C5666m mVar) {
        }

        /* renamed from: b */
        public void mo19975b(C5666m mVar) {
        }

        /* renamed from: c */
        public void mo19954c(C5666m mVar) {
        }

        /* renamed from: d */
        public void mo19955d(C5666m mVar) {
            mVar.mo20009S(this);
            this.f28316a.setVisibility(8);
            int size = this.f28317b.size();
            for (int i = 0; i < size; i++) {
                ((View) this.f28317b.get(i)).setVisibility(0);
            }
        }

        /* renamed from: e */
        public void mo19956e(C5666m mVar) {
        }
    }

    /* renamed from: u0.e$c */
    /* compiled from: FragmentTransitionSupport */
    class C5646c extends C5674n {

        /* renamed from: a */
        final /* synthetic */ Object f28319a;

        /* renamed from: b */
        final /* synthetic */ ArrayList f28320b;

        /* renamed from: c */
        final /* synthetic */ Object f28321c;

        /* renamed from: d */
        final /* synthetic */ ArrayList f28322d;

        /* renamed from: e */
        final /* synthetic */ Object f28323e;

        /* renamed from: f */
        final /* synthetic */ ArrayList f28324f;

        C5646c(Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2, Object obj3, ArrayList arrayList3) {
            this.f28319a = obj;
            this.f28320b = arrayList;
            this.f28321c = obj2;
            this.f28322d = arrayList2;
            this.f28323e = obj3;
            this.f28324f = arrayList3;
        }

        /* renamed from: b */
        public void mo19975b(C5666m mVar) {
            Object obj = this.f28319a;
            if (obj != null) {
                C5643e.this.mo4312q(obj, this.f28320b, (ArrayList<View>) null);
            }
            Object obj2 = this.f28321c;
            if (obj2 != null) {
                C5643e.this.mo4312q(obj2, this.f28322d, (ArrayList<View>) null);
            }
            Object obj3 = this.f28323e;
            if (obj3 != null) {
                C5643e.this.mo4312q(obj3, this.f28324f, (ArrayList<View>) null);
            }
        }

        /* renamed from: d */
        public void mo19955d(C5666m mVar) {
            mVar.mo20009S(this);
        }
    }

    /* renamed from: u0.e$d */
    /* compiled from: FragmentTransitionSupport */
    class C5647d extends C5666m.C5671e {

        /* renamed from: a */
        final /* synthetic */ Rect f28326a;

        C5647d(Rect rect) {
            this.f28326a = rect;
        }
    }

    /* renamed from: C */
    private static boolean m33763C(C5666m mVar) {
        return !C1163z.m5291l(mVar.mo20001C()) || !C1163z.m5291l(mVar.mo20002D()) || !C1163z.m5291l(mVar.mo20003E());
    }

    /* renamed from: A */
    public void mo4302A(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        C5679q qVar = (C5679q) obj;
        if (qVar != null) {
            qVar.mo20004F().clear();
            qVar.mo20004F().addAll(arrayList2);
            mo4312q(qVar, arrayList, arrayList2);
        }
    }

    /* renamed from: B */
    public Object mo4303B(Object obj) {
        if (obj == null) {
            return null;
        }
        C5679q qVar = new C5679q();
        qVar.mo20048i0((C5666m) obj);
        return qVar;
    }

    /* renamed from: a */
    public void mo4304a(Object obj, View view) {
        if (obj != null) {
            ((C5666m) obj).mo20017b(view);
        }
    }

    /* renamed from: b */
    public void mo4305b(Object obj, ArrayList<View> arrayList) {
        C5666m mVar = (C5666m) obj;
        if (mVar != null) {
            int i = 0;
            if (mVar instanceof C5679q) {
                C5679q qVar = (C5679q) mVar;
                int l0 = qVar.mo20050l0();
                while (i < l0) {
                    mo4305b(qVar.mo20049k0(i), arrayList);
                    i++;
                }
            } else if (!m33763C(mVar) && C1163z.m5291l(mVar.mo20004F())) {
                int size = arrayList.size();
                while (i < size) {
                    mVar.mo20017b(arrayList.get(i));
                    i++;
                }
            }
        }
    }

    /* renamed from: c */
    public void mo4306c(ViewGroup viewGroup, Object obj) {
        C5675o.m33901a(viewGroup, (C5666m) obj);
    }

    /* renamed from: e */
    public boolean mo4307e(Object obj) {
        return obj instanceof C5666m;
    }

    /* renamed from: g */
    public Object mo4308g(Object obj) {
        if (obj != null) {
            return ((C5666m) obj).clone();
        }
        return null;
    }

    /* renamed from: m */
    public Object mo4309m(Object obj, Object obj2, Object obj3) {
        C5666m mVar = (C5666m) obj;
        C5666m mVar2 = (C5666m) obj2;
        C5666m mVar3 = (C5666m) obj3;
        if (mVar != null && mVar2 != null) {
            mVar = new C5679q().mo20048i0(mVar).mo20048i0(mVar2).mo20055q0(1);
        } else if (mVar == null) {
            mVar = mVar2 != null ? mVar2 : null;
        }
        if (mVar3 == null) {
            return mVar;
        }
        C5679q qVar = new C5679q();
        if (mVar != null) {
            qVar.mo20048i0(mVar);
        }
        qVar.mo20048i0(mVar3);
        return qVar;
    }

    /* renamed from: n */
    public Object mo4310n(Object obj, Object obj2, Object obj3) {
        C5679q qVar = new C5679q();
        if (obj != null) {
            qVar.mo20048i0((C5666m) obj);
        }
        if (obj2 != null) {
            qVar.mo20048i0((C5666m) obj2);
        }
        if (obj3 != null) {
            qVar.mo20048i0((C5666m) obj3);
        }
        return qVar;
    }

    /* renamed from: p */
    public void mo4311p(Object obj, View view) {
        if (obj != null) {
            ((C5666m) obj).mo20010T(view);
        }
    }

    /* renamed from: q */
    public void mo4312q(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        int i;
        C5666m mVar = (C5666m) obj;
        int i2 = 0;
        if (mVar instanceof C5679q) {
            C5679q qVar = (C5679q) mVar;
            int l0 = qVar.mo20050l0();
            while (i2 < l0) {
                mo4312q(qVar.mo20049k0(i2), arrayList, arrayList2);
                i2++;
            }
        } else if (!m33763C(mVar)) {
            List<View> F = mVar.mo20004F();
            if (F.size() == arrayList.size() && F.containsAll(arrayList)) {
                if (arrayList2 == null) {
                    i = 0;
                } else {
                    i = arrayList2.size();
                }
                while (i2 < i) {
                    mVar.mo20017b(arrayList2.get(i2));
                    i2++;
                }
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    mVar.mo20010T(arrayList.get(size));
                }
            }
        }
    }

    /* renamed from: r */
    public void mo4313r(Object obj, View view, ArrayList<View> arrayList) {
        ((C5666m) obj).mo20015a(new C5645b(view, arrayList));
    }

    /* renamed from: t */
    public void mo4314t(Object obj, Object obj2, ArrayList<View> arrayList, Object obj3, ArrayList<View> arrayList2, Object obj4, ArrayList<View> arrayList3) {
        ((C5666m) obj).mo20015a(new C5646c(obj2, arrayList, obj3, arrayList2, obj4, arrayList3));
    }

    /* renamed from: u */
    public void mo4315u(Object obj, Rect rect) {
        if (obj != null) {
            ((C5666m) obj).mo20014Z(new C5647d(rect));
        }
    }

    /* renamed from: v */
    public void mo4316v(Object obj, View view) {
        if (view != null) {
            Rect rect = new Rect();
            mo4338k(view, rect);
            ((C5666m) obj).mo20014Z(new C5644a(rect));
        }
    }

    /* renamed from: z */
    public void mo4318z(Object obj, View view, ArrayList<View> arrayList) {
        C5679q qVar = (C5679q) obj;
        List<View> F = qVar.mo20004F();
        F.clear();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C1163z.m5288d(F, arrayList.get(i));
        }
        F.add(view);
        arrayList.add(view);
        mo4305b(qVar, arrayList);
    }
}
