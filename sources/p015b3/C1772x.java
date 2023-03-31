package p015b3;

import android.os.Handler;
import java.io.IOException;
import p004a2.C0079u1;
import p030d2.C4048w;
import p155v3.C5789b;
import p155v3.C5840p0;
import p177z1.C6266q3;
import p177z1.C6300z1;

/* renamed from: b3.x */
/* compiled from: MediaSource */
public interface C1772x {

    /* renamed from: b3.x$a */
    /* compiled from: MediaSource */
    public interface C1773a {
    }

    /* renamed from: b3.x$b */
    /* compiled from: MediaSource */
    public static final class C1774b extends C1768v {
        public C1774b(Object obj) {
            super(obj);
        }

        /* renamed from: c */
        public C1774b mo6896c(Object obj) {
            return new C1774b(super.mo6885a(obj));
        }

        public C1774b(Object obj, long j) {
            super(obj, j);
        }

        public C1774b(Object obj, long j, int i) {
            super(obj, j, i);
        }

        public C1774b(Object obj, int i, int i2, long j) {
            super(obj, i, i2, j);
        }

        public C1774b(C1768v vVar) {
            super(vVar);
        }
    }

    /* renamed from: b3.x$c */
    /* compiled from: MediaSource */
    public interface C1775c {
        /* renamed from: a */
        void mo6732a(C1772x xVar, C6266q3 q3Var);
    }

    /* renamed from: a */
    void mo6654a(C1700e0 e0Var);

    /* renamed from: b */
    void mo6655b(C1775c cVar);

    /* renamed from: c */
    void mo6656c(C1775c cVar);

    /* renamed from: d */
    void mo6707d(C1765u uVar);

    /* renamed from: f */
    void mo6657f(C4048w wVar);

    /* renamed from: h */
    void mo6658h(Handler handler, C4048w wVar);

    /* renamed from: i */
    C6300z1 mo6708i();

    /* renamed from: k */
    C1765u mo6709k(C1774b bVar, C5789b bVar2, long j);

    /* renamed from: l */
    void mo6710l() throws IOException;

    /* renamed from: m */
    boolean mo6659m();

    /* renamed from: n */
    C6266q3 mo6660n();

    /* renamed from: p */
    void mo6661p(Handler handler, C1700e0 e0Var);

    /* renamed from: r */
    void mo6662r(C1775c cVar, C5840p0 p0Var, C0079u1 u1Var);

    /* renamed from: s */
    void mo6663s(C1775c cVar);
}
