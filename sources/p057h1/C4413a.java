package p057h1;

import androidx.work.impl.WorkDatabase;
import java.util.LinkedList;
import java.util.UUID;
import p050g1.C4307b;
import p050g1.C4332q;
import p170y0.C6099m;
import p170y0.C6110s;
import p176z0.C6184c;
import p176z0.C6187e;
import p176z0.C6188f;
import p176z0.C6191i;

/* renamed from: h1.a */
/* compiled from: CancelWorkRunnable */
public abstract class C4413a implements Runnable {

    /* renamed from: a */
    private final C6184c f24579a = new C6184c();

    /* renamed from: h1.a$a */
    /* compiled from: CancelWorkRunnable */
    class C4414a extends C4413a {

        /* renamed from: b */
        final /* synthetic */ C6191i f24580b;

        /* renamed from: c */
        final /* synthetic */ UUID f24581c;

        C4414a(C6191i iVar, UUID uuid) {
            this.f24580b = iVar;
            this.f24581c = uuid;
        }

        /* JADX INFO: finally extract failed */
        /* access modifiers changed from: package-private */
        /* renamed from: h */
        public void mo17941h() {
            WorkDatabase q = this.f24580b.mo21130q();
            q.mo5592c();
            try {
                mo17938a(this.f24580b, this.f24581c.toString());
                q.mo5606r();
                q.mo5596g();
                mo17940g(this.f24580b);
            } catch (Throwable th) {
                q.mo5596g();
                throw th;
            }
        }
    }

    /* renamed from: h1.a$b */
    /* compiled from: CancelWorkRunnable */
    class C4415b extends C4413a {

        /* renamed from: b */
        final /* synthetic */ C6191i f24582b;

        /* renamed from: c */
        final /* synthetic */ String f24583c;

        C4415b(C6191i iVar, String str) {
            this.f24582b = iVar;
            this.f24583c = str;
        }

        /* JADX INFO: finally extract failed */
        /* access modifiers changed from: package-private */
        /* renamed from: h */
        public void mo17941h() {
            WorkDatabase q = this.f24582b.mo21130q();
            q.mo5592c();
            try {
                for (String a : q.mo6318B().mo17768p(this.f24583c)) {
                    mo17938a(this.f24582b, a);
                }
                q.mo5606r();
                q.mo5596g();
                mo17940g(this.f24582b);
            } catch (Throwable th) {
                q.mo5596g();
                throw th;
            }
        }
    }

    /* renamed from: h1.a$c */
    /* compiled from: CancelWorkRunnable */
    class C4416c extends C4413a {

        /* renamed from: b */
        final /* synthetic */ C6191i f24584b;

        /* renamed from: c */
        final /* synthetic */ String f24585c;

        /* renamed from: d */
        final /* synthetic */ boolean f24586d;

        C4416c(C6191i iVar, String str, boolean z) {
            this.f24584b = iVar;
            this.f24585c = str;
            this.f24586d = z;
        }

        /* JADX INFO: finally extract failed */
        /* access modifiers changed from: package-private */
        /* renamed from: h */
        public void mo17941h() {
            WorkDatabase q = this.f24584b.mo21130q();
            q.mo5592c();
            try {
                for (String a : q.mo6318B().mo17764l(this.f24585c)) {
                    mo17938a(this.f24584b, a);
                }
                q.mo5606r();
                q.mo5596g();
                if (this.f24586d) {
                    mo17940g(this.f24584b);
                }
            } catch (Throwable th) {
                q.mo5596g();
                throw th;
            }
        }
    }

    /* renamed from: b */
    public static C4413a m29347b(UUID uuid, C6191i iVar) {
        return new C4414a(iVar, uuid);
    }

    /* renamed from: c */
    public static C4413a m29348c(String str, C6191i iVar, boolean z) {
        return new C4416c(iVar, str, z);
    }

    /* renamed from: d */
    public static C4413a m29349d(String str, C6191i iVar) {
        return new C4415b(iVar, str);
    }

    /* renamed from: f */
    private void m29350f(WorkDatabase workDatabase, String str) {
        C4332q B = workDatabase.mo6318B();
        C4307b t = workDatabase.mo6320t();
        LinkedList linkedList = new LinkedList();
        linkedList.add(str);
        while (!linkedList.isEmpty()) {
            String str2 = (String) linkedList.remove();
            C6110s m = B.mo17765m(str2);
            if (!(m == C6110s.SUCCEEDED || m == C6110s.FAILED)) {
                B.mo17754b(C6110s.CANCELLED, str2);
            }
            linkedList.addAll(t.mo17717a(str2));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo17938a(C6191i iVar, String str) {
        m29350f(iVar.mo21130q(), str);
        iVar.mo21128o().mo21110l(str);
        for (C6187e e : iVar.mo21129p()) {
            e.mo32e(str);
        }
    }

    /* renamed from: e */
    public C6099m mo17939e() {
        return this.f24579a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public void mo17940g(C6191i iVar) {
        C6188f.m36001b(iVar.mo21126k(), iVar.mo21130q(), iVar.mo21129p());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public abstract void mo17941h();

    public void run() {
        try {
            mo17941h();
            this.f24579a.mo21102a(C6099m.f29493a);
        } catch (Throwable th) {
            this.f24579a.mo21102a(new C6099m.C6101b.C6102a(th));
        }
    }
}
