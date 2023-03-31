package p404y7;

import com.google.firebase.auth.C7782b0;
import p218e6.C9975i;
import p218e6.C9980l;
import p246h7.C10409c;
import p247h8.C10460p;
import p247h8.C10467u;
import p247h8.C10468v;
import p276k8.C11598a;
import p276k8.C11600b;
import p293m7.C11803a;
import p293m7.C11806b;
import p330q8.C12193b;

/* renamed from: y7.i */
/* compiled from: FirebaseAuthCredentialsProvider */
public final class C13072i extends C13064a<C13073j> {

    /* renamed from: a */
    private final C11803a f47321a = new C13071h(this);

    /* renamed from: b */
    private C11806b f47322b;

    /* renamed from: c */
    private C10467u<C13073j> f47323c;

    /* renamed from: d */
    private int f47324d;

    /* renamed from: e */
    private boolean f47325e;

    public C13072i(C11598a<C11806b> aVar) {
        aVar.mo35752a(new C13070g(this));
    }

    /* renamed from: h */
    private synchronized C13073j m61425h() {
        String b;
        C11806b bVar = this.f47322b;
        b = bVar == null ? null : bVar.mo26010b();
        return b != null ? new C13073j(b) : C13073j.f47326b;
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public /* synthetic */ C9975i m61426i(int i, C9975i iVar) throws Exception {
        synchronized (this) {
            if (i != this.f47324d) {
                C10468v.m52767a("FirebaseAuthCredentialsProvider", "getToken aborted due to token change", new Object[0]);
                C9975i<String> a = mo38094a();
                return a;
            } else if (iVar.mo26362q()) {
                C9975i e = C9980l.m51031e(((C7782b0) iVar.mo26358m()).mo26059g());
                return e;
            } else {
                C9975i d = C9980l.m51030d(iVar.mo26357l());
                return d;
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public /* synthetic */ void m61427j(C12193b bVar) {
        m61429l();
    }

    /* access modifiers changed from: private */
    /* renamed from: k */
    public /* synthetic */ void m61428k(C11600b bVar) {
        synchronized (this) {
            this.f47322b = (C11806b) bVar.get();
            m61429l();
            this.f47322b.mo26008a(this.f47321a);
        }
    }

    /* renamed from: l */
    private synchronized void m61429l() {
        this.f47324d++;
        C10467u<C13073j> uVar = this.f47323c;
        if (uVar != null) {
            uVar.mo278a(m61425h());
        }
    }

    /* renamed from: a */
    public synchronized C9975i<String> mo38094a() {
        C11806b bVar = this.f47322b;
        if (bVar == null) {
            return C9980l.m51030d(new C10409c("auth is not available"));
        }
        C9975i<C7782b0> c = bVar.mo26012c(this.f47325e);
        this.f47325e = false;
        return c.mo26356k(C10460p.f41438b, new C13069f(this, this.f47324d));
    }

    /* renamed from: b */
    public synchronized void mo38095b() {
        this.f47325e = true;
    }

    /* renamed from: c */
    public synchronized void mo38096c() {
        this.f47323c = null;
        C11806b bVar = this.f47322b;
        if (bVar != null) {
            bVar.mo26014d(this.f47321a);
        }
    }

    /* renamed from: d */
    public synchronized void mo38097d(C10467u<C13073j> uVar) {
        this.f47323c = uVar;
        uVar.mo278a(m61425h());
    }
}
