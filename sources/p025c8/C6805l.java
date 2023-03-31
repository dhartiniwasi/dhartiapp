package p025c8;

import java.util.Collection;
import java.util.List;
import p008a8.C6469g1;
import p211d8.C9885i;
import p211d8.C9888l;
import p211d8.C9893q;
import p211d8.C9903u;
import p320p7.C12126c;

/* renamed from: c8.l */
/* compiled from: IndexManager */
public interface C6805l {

    /* renamed from: c8.l$a */
    /* compiled from: IndexManager */
    public enum C6806a {
        NONE,
        PARTIAL,
        FULL
    }

    /* renamed from: a */
    void mo22727a(C9893q qVar);

    /* renamed from: b */
    void mo22728b(C12126c<C9888l, C9885i> cVar);

    /* renamed from: c */
    List<C9888l> mo22729c(C6469g1 g1Var);

    /* renamed from: d */
    Collection<C9893q> mo22730d();

    /* renamed from: e */
    String mo22731e();

    /* renamed from: f */
    void mo22732f(C9893q qVar);

    /* renamed from: g */
    List<C9903u> mo22733g(String str);

    /* renamed from: h */
    C6806a mo22734h(C6469g1 g1Var);

    /* renamed from: i */
    void mo22735i(C9903u uVar);

    /* renamed from: j */
    C9893q.C9894a mo22736j(String str);

    /* renamed from: k */
    void mo22737k(String str, C9893q.C9894a aVar);

    /* renamed from: l */
    C9893q.C9894a mo22738l(C6469g1 g1Var);

    void start();
}
