package p050g1;

import androidx.room.C1450h;
import androidx.work.C1536b;
import p083l0.C4897a;
import p083l0.C4900d;
import p111p0.C5257f;

/* renamed from: g1.o */
/* compiled from: WorkProgressDao_Impl */
public final class C4325o implements C4324n {

    /* renamed from: a */
    private final C1450h f24206a;

    /* renamed from: b */
    private final C4897a<C4323m> f24207b;

    /* renamed from: c */
    private final C4900d f24208c;

    /* renamed from: d */
    private final C4900d f24209d;

    /* renamed from: g1.o$a */
    /* compiled from: WorkProgressDao_Impl */
    class C4326a extends C4897a<C4323m> {
        C4326a(C1450h hVar) {
            super(hVar);
        }

        /* renamed from: d */
        public String mo17721d() {
            return "INSERT OR REPLACE INTO `WorkProgress` (`work_spec_id`,`progress`) VALUES (?,?)";
        }

        /* renamed from: i */
        public void mo17722g(C5257f fVar, C4323m mVar) {
            String str = mVar.f24204a;
            if (str == null) {
                fVar.mo18710T0(1);
            } else {
                fVar.mo18708E(1, str);
            }
            byte[] n = C1536b.m7128n(mVar.f24205b);
            if (n == null) {
                fVar.mo18710T0(2);
            } else {
                fVar.mo18717s0(2, n);
            }
        }
    }

    /* renamed from: g1.o$b */
    /* compiled from: WorkProgressDao_Impl */
    class C4327b extends C4900d {
        C4327b(C1450h hVar) {
            super(hVar);
        }

        /* renamed from: d */
        public String mo17721d() {
            return "DELETE from WorkProgress where work_spec_id=?";
        }
    }

    /* renamed from: g1.o$c */
    /* compiled from: WorkProgressDao_Impl */
    class C4328c extends C4900d {
        C4328c(C1450h hVar) {
            super(hVar);
        }

        /* renamed from: d */
        public String mo17721d() {
            return "DELETE FROM WorkProgress";
        }
    }

    public C4325o(C1450h hVar) {
        this.f24206a = hVar;
        this.f24207b = new C4326a(hVar);
        this.f24208c = new C4327b(hVar);
        this.f24209d = new C4328c(hVar);
    }

    /* renamed from: a */
    public void mo17739a(String str) {
        this.f24206a.mo5591b();
        C5257f a = this.f24208c.mo18718a();
        if (str == null) {
            a.mo18710T0(1);
        } else {
            a.mo18708E(1, str);
        }
        this.f24206a.mo5592c();
        try {
            a.mo19248M();
            this.f24206a.mo5606r();
        } finally {
            this.f24206a.mo5596g();
            this.f24208c.mo18720f(a);
        }
    }

    /* renamed from: b */
    public void mo17740b(C4323m mVar) {
        this.f24206a.mo5591b();
        this.f24206a.mo5592c();
        try {
            this.f24207b.mo18707h(mVar);
            this.f24206a.mo5606r();
        } finally {
            this.f24206a.mo5596g();
        }
    }

    /* renamed from: c */
    public void mo17741c() {
        this.f24206a.mo5591b();
        C5257f a = this.f24209d.mo18718a();
        this.f24206a.mo5592c();
        try {
            a.mo19248M();
            this.f24206a.mo5606r();
        } finally {
            this.f24206a.mo5596g();
            this.f24209d.mo18720f(a);
        }
    }
}
