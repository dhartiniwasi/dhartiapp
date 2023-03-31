package p343rc;

import java.util.concurrent.Executor;
import p182a7.C6431n;
import p343rc.C12287b;

/* renamed from: rc.m */
/* compiled from: CompositeCallCredentials */
public final class C12351m extends C12287b {

    /* renamed from: a */
    private final C12287b f45663a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C12287b f45664b;

    /* renamed from: rc.m$a */
    /* compiled from: CompositeCallCredentials */
    private static final class C12352a extends C12287b.C12288a {

        /* renamed from: a */
        private final C12287b.C12288a f45665a;

        /* renamed from: b */
        private final C12411y0 f45666b;

        public C12352a(C12287b.C12288a aVar, C12411y0 y0Var) {
            this.f45665a = aVar;
            this.f45666b = y0Var;
        }

        /* renamed from: a */
        public void mo35259a(C12411y0 y0Var) {
            C6431n.m37562o(y0Var, "headers");
            C12411y0 y0Var2 = new C12411y0();
            y0Var2.mo37169m(this.f45666b);
            y0Var2.mo37169m(y0Var);
            this.f45665a.mo35259a(y0Var2);
        }

        /* renamed from: b */
        public void mo35260b(C12335j1 j1Var) {
            this.f45665a.mo35260b(j1Var);
        }
    }

    /* renamed from: rc.m$b */
    /* compiled from: CompositeCallCredentials */
    private final class C12353b extends C12287b.C12288a {

        /* renamed from: a */
        private final C12287b.C12289b f45667a;

        /* renamed from: b */
        private final Executor f45668b;

        /* renamed from: c */
        private final C12287b.C12288a f45669c;

        /* renamed from: d */
        private final C12372r f45670d;

        public C12353b(C12287b.C12289b bVar, Executor executor, C12287b.C12288a aVar, C12372r rVar) {
            this.f45667a = bVar;
            this.f45668b = executor;
            this.f45669c = (C12287b.C12288a) C6431n.m37562o(aVar, "delegate");
            this.f45670d = (C12372r) C6431n.m37562o(rVar, "context");
        }

        /* renamed from: a */
        public void mo35259a(C12411y0 y0Var) {
            C6431n.m37562o(y0Var, "headers");
            C12372r b = this.f45670d.mo37086b();
            try {
                C12351m.this.f45664b.mo33031a(this.f45667a, this.f45668b, new C12352a(this.f45669c, y0Var));
            } finally {
                this.f45670d.mo37088f(b);
            }
        }

        /* renamed from: b */
        public void mo35260b(C12335j1 j1Var) {
            this.f45669c.mo35260b(j1Var);
        }
    }

    public C12351m(C12287b bVar, C12287b bVar2) {
        this.f45663a = (C12287b) C6431n.m37562o(bVar, "creds1");
        this.f45664b = (C12287b) C6431n.m37562o(bVar2, "creds2");
    }

    /* renamed from: a */
    public void mo33031a(C12287b.C12289b bVar, Executor executor, C12287b.C12288a aVar) {
        this.f45663a.mo33031a(bVar, executor, new C12353b(bVar, executor, aVar, C12372r.m59190e()));
    }
}
