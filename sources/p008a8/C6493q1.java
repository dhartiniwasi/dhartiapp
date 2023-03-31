package p008a8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import p211d8.C9898r;
import p211d8.C9902t;
import p220e8.C10007d;
import p220e8.C10008e;
import p220e8.C10019p;

/* renamed from: a8.q1 */
/* compiled from: UserData */
public class C6493q1 {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C6503u1 f30855a;

    /* renamed from: b */
    private final Set<C9898r> f30856b = new HashSet();

    /* renamed from: c */
    private final ArrayList<C10008e> f30857c = new ArrayList<>();

    public C6493q1(C6503u1 u1Var) {
        this.f30855a = u1Var;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo22045b(C9898r rVar) {
        this.f30856b.add(rVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo22046c(C9898r rVar, C10019p pVar) {
        this.f30857c.add(new C10008e(rVar, pVar));
    }

    /* renamed from: d */
    public boolean mo22047d(C9898r rVar) {
        for (C9898r q : this.f30856b) {
            if (rVar.mo32357q(q)) {
                return true;
            }
        }
        Iterator<C10008e> it = this.f30857c.iterator();
        while (it.hasNext()) {
            if (rVar.mo32357q(it.next().mo32592a())) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: e */
    public List<C10008e> mo22048e() {
        return this.f30857c;
    }

    /* renamed from: f */
    public C6496r1 mo22049f() {
        return new C6496r1(this, C9898r.f39732c, false, (C6488p1) null);
    }

    /* renamed from: g */
    public C6498s1 mo22050g(C9902t tVar) {
        return new C6498s1(tVar, C10007d.m51096b(this.f30856b), Collections.unmodifiableList(this.f30857c));
    }

    /* renamed from: h */
    public C6498s1 mo22051h(C9902t tVar, C10007d dVar) {
        ArrayList arrayList = new ArrayList();
        Iterator<C10008e> it = this.f30857c.iterator();
        while (it.hasNext()) {
            C10008e next = it.next();
            if (dVar.mo32587a(next.mo32592a())) {
                arrayList.add(next);
            }
        }
        return new C6498s1(tVar, dVar, Collections.unmodifiableList(arrayList));
    }

    /* renamed from: i */
    public C6498s1 mo22052i(C9902t tVar) {
        return new C6498s1(tVar, (C10007d) null, Collections.unmodifiableList(this.f30857c));
    }

    /* renamed from: j */
    public C6500t1 mo22053j(C9902t tVar) {
        return new C6500t1(tVar, C10007d.m51096b(this.f30856b), Collections.unmodifiableList(this.f30857c));
    }
}
