package p015b3;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import p004a2.C0079u1;
import p015b3.C1700e0;
import p015b3.C1772x;
import p030d2.C4048w;
import p155v3.C5840p0;
import p161w3.C5917a;
import p177z1.C6266q3;

/* renamed from: b3.a */
/* compiled from: BaseMediaSource */
public abstract class C1687a implements C1772x {

    /* renamed from: a */
    private final ArrayList<C1772x.C1775c> f4941a = new ArrayList<>(1);

    /* renamed from: b */
    private final HashSet<C1772x.C1775c> f4942b = new HashSet<>(1);

    /* renamed from: c */
    private final C1700e0.C1701a f4943c = new C1700e0.C1701a();

    /* renamed from: d */
    private final C4048w.C4049a f4944d = new C4048w.C4049a();

    /* renamed from: e */
    private Looper f4945e;

    /* renamed from: f */
    private C6266q3 f4946f;

    /* renamed from: g */
    private C0079u1 f4947g;

    /* access modifiers changed from: protected */
    /* renamed from: A */
    public final C0079u1 mo6649A() {
        return (C0079u1) C5917a.m34875h(this.f4947g);
    }

    /* access modifiers changed from: protected */
    /* renamed from: B */
    public final boolean mo6650B() {
        return !this.f4942b.isEmpty();
    }

    /* access modifiers changed from: protected */
    /* renamed from: C */
    public abstract void mo6651C(C5840p0 p0Var);

    /* access modifiers changed from: protected */
    /* renamed from: D */
    public final void mo6652D(C6266q3 q3Var) {
        this.f4946f = q3Var;
        Iterator<C1772x.C1775c> it = this.f4941a.iterator();
        while (it.hasNext()) {
            it.next().mo6732a(this, q3Var);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public abstract void mo6653E();

    /* renamed from: a */
    public final void mo6654a(C1700e0 e0Var) {
        this.f4943c.mo6715C(e0Var);
    }

    /* renamed from: b */
    public final void mo6655b(C1772x.C1775c cVar) {
        boolean z = !this.f4942b.isEmpty();
        this.f4942b.remove(cVar);
        if (z && this.f4942b.isEmpty()) {
            mo6669y();
        }
    }

    /* renamed from: c */
    public final void mo6656c(C1772x.C1775c cVar) {
        this.f4941a.remove(cVar);
        if (this.f4941a.isEmpty()) {
            this.f4945e = null;
            this.f4946f = null;
            this.f4947g = null;
            this.f4942b.clear();
            mo6653E();
            return;
        }
        mo6655b(cVar);
    }

    /* renamed from: f */
    public final void mo6657f(C4048w wVar) {
        this.f4944d.mo17259t(wVar);
    }

    /* renamed from: h */
    public final void mo6658h(Handler handler, C4048w wVar) {
        C5917a.m34872e(handler);
        C5917a.m34872e(wVar);
        this.f4944d.mo17252g(handler, wVar);
    }

    /* renamed from: m */
    public /* synthetic */ boolean mo6659m() {
        return C1770w.m8378b(this);
    }

    /* renamed from: n */
    public /* synthetic */ C6266q3 mo6660n() {
        return C1770w.m8377a(this);
    }

    /* renamed from: p */
    public final void mo6661p(Handler handler, C1700e0 e0Var) {
        C5917a.m34872e(handler);
        C5917a.m34872e(e0Var);
        this.f4943c.mo6719g(handler, e0Var);
    }

    /* renamed from: r */
    public final void mo6662r(C1772x.C1775c cVar, C5840p0 p0Var, C0079u1 u1Var) {
        Looper myLooper = Looper.myLooper();
        Looper looper = this.f4945e;
        C5917a.m34868a(looper == null || looper == myLooper);
        this.f4947g = u1Var;
        C6266q3 q3Var = this.f4946f;
        this.f4941a.add(cVar);
        if (this.f4945e == null) {
            this.f4945e = myLooper;
            this.f4942b.add(cVar);
            mo6651C(p0Var);
        } else if (q3Var != null) {
            mo6663s(cVar);
            cVar.mo6732a(this, q3Var);
        }
    }

    /* renamed from: s */
    public final void mo6663s(C1772x.C1775c cVar) {
        C5917a.m34872e(this.f4945e);
        boolean isEmpty = this.f4942b.isEmpty();
        this.f4942b.add(cVar);
        if (isEmpty) {
            mo6670z();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public final C4048w.C4049a mo6664t(int i, C1772x.C1774b bVar) {
        return this.f4944d.mo17260u(i, bVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public final C4048w.C4049a mo6665u(C1772x.C1774b bVar) {
        return this.f4944d.mo17260u(0, bVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public final C1700e0.C1701a mo6666v(int i, C1772x.C1774b bVar, long j) {
        return this.f4943c.mo6718F(i, bVar, j);
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public final C1700e0.C1701a mo6667w(C1772x.C1774b bVar) {
        return this.f4943c.mo6718F(0, bVar, 0);
    }

    /* access modifiers changed from: protected */
    /* renamed from: x */
    public final C1700e0.C1701a mo6668x(C1772x.C1774b bVar, long j) {
        C5917a.m34872e(bVar);
        return this.f4943c.mo6718F(0, bVar, j);
    }

    /* access modifiers changed from: protected */
    /* renamed from: y */
    public void mo6669y() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: z */
    public void mo6670z() {
    }
}
