package p008a8;

import com.google.firebase.firestore.C7959y;
import com.google.firebase.firestore.C7961y0;
import p218e6.C9975i;
import p218e6.C9977j;
import p238g8.C10256n;
import p238g8.C10261o0;
import p247h8.C10442g;
import p247h8.C10462r;
import p247h8.C10466t;

/* renamed from: a8.o1 */
/* compiled from: TransactionRunner */
public class C6483o1<TResult> {

    /* renamed from: a */
    private C10442g f30809a;

    /* renamed from: b */
    private C10261o0 f30810b;

    /* renamed from: c */
    private C10466t<C6476k1, C9975i<TResult>> f30811c;

    /* renamed from: d */
    private int f30812d;

    /* renamed from: e */
    private C10462r f30813e;

    /* renamed from: f */
    private C9977j<TResult> f30814f = new C9977j<>();

    public C6483o1(C10442g gVar, C10261o0 o0Var, C7961y0 y0Var, C10466t<C6476k1, C9975i<TResult>> tVar) {
        this.f30809a = gVar;
        this.f30810b = o0Var;
        this.f30811c = tVar;
        this.f30812d = y0Var.mo26471a();
        this.f30813e = new C10462r(gVar, C10442g.C10448d.RETRY_TRANSACTION);
    }

    /* renamed from: d */
    private void m37809d(C9975i iVar) {
        if (this.f30812d <= 0 || !m37810e(iVar.mo26357l())) {
            this.f30814f.mo32543b(iVar.mo26357l());
        } else {
            m37814j();
        }
    }

    /* renamed from: e */
    private static boolean m37810e(Exception exc) {
        if (!(exc instanceof C7959y)) {
            return false;
        }
        C7959y yVar = (C7959y) exc;
        C7959y.C7960a a = yVar.mo26469a();
        if (a == C7959y.C7960a.ABORTED || a == C7959y.C7960a.ALREADY_EXISTS || a == C7959y.C7960a.FAILED_PRECONDITION || !C10256n.m51896j(yVar.mo26469a())) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public /* synthetic */ void m37811f(C9975i iVar, C9975i iVar2) {
        if (iVar2.mo26362q()) {
            this.f30814f.mo32544c(iVar.mo26358m());
        } else {
            m37809d(iVar2);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public /* synthetic */ void m37812g(C6476k1 k1Var, C9975i iVar) {
        if (!iVar.mo26362q()) {
            m37809d(iVar);
        } else {
            k1Var.mo21983c().mo26348c(this.f30809a.mo33524o(), new C0140m1(this, iVar));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public /* synthetic */ void m37813h() {
        C6476k1 p = this.f30810b.mo33021p();
        this.f30811c.apply(p).mo26348c(this.f30809a.mo33524o(), new C0138l1(this, p));
    }

    /* renamed from: j */
    private void m37814j() {
        this.f30812d--;
        this.f30813e.mo33546b(new C0142n1(this));
    }

    /* renamed from: i */
    public C9975i<TResult> mo22014i() {
        m37814j();
        return this.f30814f.mo32542a();
    }
}
