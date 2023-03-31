package p146u0;

import android.animation.TimeInterpolator;
import android.util.AndroidRuntimeException;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;
import p146u0.C5666m;

/* renamed from: u0.q */
/* compiled from: TransitionSet */
public class C5679q extends C5666m {

    /* renamed from: S */
    private ArrayList<C5666m> f28416S = new ArrayList<>();

    /* renamed from: a0 */
    private boolean f28417a0 = true;

    /* renamed from: b0 */
    int f28418b0;

    /* renamed from: c0 */
    boolean f28419c0 = false;

    /* renamed from: d0 */
    private int f28420d0 = 0;

    /* renamed from: u0.q$a */
    /* compiled from: TransitionSet */
    class C5680a extends C5674n {

        /* renamed from: a */
        final /* synthetic */ C5666m f28421a;

        C5680a(C5666m mVar) {
            this.f28421a = mVar;
        }

        /* renamed from: d */
        public void mo19955d(C5666m mVar) {
            this.f28421a.mo20012W();
            mVar.mo20009S(this);
        }
    }

    /* renamed from: u0.q$b */
    /* compiled from: TransitionSet */
    static class C5681b extends C5674n {

        /* renamed from: a */
        C5679q f28423a;

        C5681b(C5679q qVar) {
            this.f28423a = qVar;
        }

        /* renamed from: b */
        public void mo19975b(C5666m mVar) {
            C5679q qVar = this.f28423a;
            if (!qVar.f28419c0) {
                qVar.mo20023e0();
                this.f28423a.f28419c0 = true;
            }
        }

        /* renamed from: d */
        public void mo19955d(C5666m mVar) {
            C5679q qVar = this.f28423a;
            int i = qVar.f28418b0 - 1;
            qVar.f28418b0 = i;
            if (i == 0) {
                qVar.f28419c0 = false;
                qVar.mo20031p();
            }
            mVar.mo20009S(this);
        }
    }

    /* renamed from: j0 */
    private void m33907j0(C5666m mVar) {
        this.f28416S.add(mVar);
        mVar.f28400z = this;
    }

    /* renamed from: s0 */
    private void m33908s0() {
        C5681b bVar = new C5681b(this);
        Iterator<C5666m> it = this.f28416S.iterator();
        while (it.hasNext()) {
            it.next().mo20015a(bVar);
        }
        this.f28418b0 = this.f28416S.size();
    }

    /* renamed from: Q */
    public void mo20007Q(View view) {
        super.mo20007Q(view);
        int size = this.f28416S.size();
        for (int i = 0; i < size; i++) {
            this.f28416S.get(i).mo20007Q(view);
        }
    }

    /* renamed from: U */
    public void mo20011U(View view) {
        super.mo20011U(view);
        int size = this.f28416S.size();
        for (int i = 0; i < size; i++) {
            this.f28416S.get(i).mo20011U(view);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: W */
    public void mo20012W() {
        if (this.f28416S.isEmpty()) {
            mo20023e0();
            mo20031p();
            return;
        }
        m33908s0();
        if (!this.f28417a0) {
            for (int i = 1; i < this.f28416S.size(); i++) {
                this.f28416S.get(i - 1).mo20015a(new C5680a(this.f28416S.get(i)));
            }
            C5666m mVar = this.f28416S.get(0);
            if (mVar != null) {
                mVar.mo20012W();
                return;
            }
            return;
        }
        Iterator<C5666m> it = this.f28416S.iterator();
        while (it.hasNext()) {
            it.next().mo20012W();
        }
    }

    /* renamed from: Z */
    public void mo20014Z(C5666m.C5671e eVar) {
        super.mo20014Z(eVar);
        this.f28420d0 |= 8;
        int size = this.f28416S.size();
        for (int i = 0; i < size; i++) {
            this.f28416S.get(i).mo20014Z(eVar);
        }
    }

    /* renamed from: b0 */
    public void mo20018b0(C5651g gVar) {
        super.mo20018b0(gVar);
        this.f28420d0 |= 4;
        if (this.f28416S != null) {
            for (int i = 0; i < this.f28416S.size(); i++) {
                this.f28416S.get(i).mo20018b0(gVar);
            }
        }
    }

    /* renamed from: c0 */
    public void mo20019c0(C5678p pVar) {
        super.mo20019c0(pVar);
        this.f28420d0 |= 2;
        int size = this.f28416S.size();
        for (int i = 0; i < size; i++) {
            this.f28416S.get(i).mo20019c0(pVar);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f0 */
    public String mo20025f0(String str) {
        String f0 = super.mo20025f0(str);
        for (int i = 0; i < this.f28416S.size(); i++) {
            StringBuilder sb = new StringBuilder();
            sb.append(f0);
            sb.append("\n");
            sb.append(this.f28416S.get(i).mo20025f0(str + "  "));
            f0 = sb.toString();
        }
        return f0;
    }

    /* renamed from: g */
    public void mo19923g(C5683s sVar) {
        if (mo20006J(sVar.f28428b)) {
            Iterator<C5666m> it = this.f28416S.iterator();
            while (it.hasNext()) {
                C5666m next = it.next();
                if (next.mo20006J(sVar.f28428b)) {
                    next.mo19923g(sVar);
                    sVar.f28429c.add(next);
                }
            }
        }
    }

    /* renamed from: g0 */
    public C5679q mo20015a(C5666m.C5672f fVar) {
        return (C5679q) super.mo20015a(fVar);
    }

    /* renamed from: h0 */
    public C5679q mo20017b(View view) {
        for (int i = 0; i < this.f28416S.size(); i++) {
            this.f28416S.get(i).mo20017b(view);
        }
        return (C5679q) super.mo20017b(view);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public void mo20026i(C5683s sVar) {
        super.mo20026i(sVar);
        int size = this.f28416S.size();
        for (int i = 0; i < size; i++) {
            this.f28416S.get(i).mo20026i(sVar);
        }
    }

    /* renamed from: i0 */
    public C5679q mo20048i0(C5666m mVar) {
        m33907j0(mVar);
        long j = this.f28385c;
        if (j >= 0) {
            mVar.mo20013Y(j);
        }
        if ((this.f28420d0 & 1) != 0) {
            mVar.mo20016a0(mo20035u());
        }
        if ((this.f28420d0 & 2) != 0) {
            mVar.mo20019c0(mo20039z());
        }
        if ((this.f28420d0 & 4) != 0) {
            mVar.mo20018b0(mo20038y());
        }
        if ((this.f28420d0 & 8) != 0) {
            mVar.mo20014Z(mo20033s());
        }
        return this;
    }

    /* renamed from: j */
    public void mo19924j(C5683s sVar) {
        if (mo20006J(sVar.f28428b)) {
            Iterator<C5666m> it = this.f28416S.iterator();
            while (it.hasNext()) {
                C5666m next = it.next();
                if (next.mo20006J(sVar.f28428b)) {
                    next.mo19924j(sVar);
                    sVar.f28429c.add(next);
                }
            }
        }
    }

    /* renamed from: k0 */
    public C5666m mo20049k0(int i) {
        if (i < 0 || i >= this.f28416S.size()) {
            return null;
        }
        return this.f28416S.get(i);
    }

    /* renamed from: l0 */
    public int mo20050l0() {
        return this.f28416S.size();
    }

    /* renamed from: m */
    public C5666m clone() {
        C5679q qVar = (C5679q) super.clone();
        qVar.f28416S = new ArrayList<>();
        int size = this.f28416S.size();
        for (int i = 0; i < size; i++) {
            qVar.m33907j0(this.f28416S.get(i).clone());
        }
        return qVar;
    }

    /* renamed from: m0 */
    public C5679q mo20009S(C5666m.C5672f fVar) {
        return (C5679q) super.mo20009S(fVar);
    }

    /* renamed from: n0 */
    public C5679q mo20010T(View view) {
        for (int i = 0; i < this.f28416S.size(); i++) {
            this.f28416S.get(i).mo20010T(view);
        }
        return (C5679q) super.mo20010T(view);
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public void mo20030o(ViewGroup viewGroup, C5684t tVar, C5684t tVar2, ArrayList<C5683s> arrayList, ArrayList<C5683s> arrayList2) {
        long B = mo20000B();
        int size = this.f28416S.size();
        for (int i = 0; i < size; i++) {
            C5666m mVar = this.f28416S.get(i);
            if (B > 0 && (this.f28417a0 || i == 0)) {
                long B2 = mVar.mo20000B();
                if (B2 > 0) {
                    mVar.mo20021d0(B2 + B);
                } else {
                    mVar.mo20021d0(B);
                }
            }
            mVar.mo20030o(viewGroup, tVar, tVar2, arrayList, arrayList2);
        }
    }

    /* renamed from: o0 */
    public C5679q mo20013Y(long j) {
        ArrayList<C5666m> arrayList;
        super.mo20013Y(j);
        if (this.f28385c >= 0 && (arrayList = this.f28416S) != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                this.f28416S.get(i).mo20013Y(j);
            }
        }
        return this;
    }

    /* renamed from: p0 */
    public C5679q mo20016a0(TimeInterpolator timeInterpolator) {
        this.f28420d0 |= 1;
        ArrayList<C5666m> arrayList = this.f28416S;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                this.f28416S.get(i).mo20016a0(timeInterpolator);
            }
        }
        return (C5679q) super.mo20016a0(timeInterpolator);
    }

    /* renamed from: q0 */
    public C5679q mo20055q0(int i) {
        if (i == 0) {
            this.f28417a0 = true;
        } else if (i == 1) {
            this.f28417a0 = false;
        } else {
            throw new AndroidRuntimeException("Invalid parameter for TransitionSet ordering: " + i);
        }
        return this;
    }

    /* renamed from: r0 */
    public C5679q mo20021d0(long j) {
        return (C5679q) super.mo20021d0(j);
    }
}
