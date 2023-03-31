package p014b2;

import android.os.Handler;
import p021c2.C1846e;
import p021c2.C1852i;
import p161w3.C5917a;
import p161w3.C5953m0;
import p177z1.C6272r1;

/* renamed from: b2.s */
/* compiled from: AudioRendererEventListener */
public interface C1658s {

    /* renamed from: b2.s$a */
    /* compiled from: AudioRendererEventListener */
    public static final class C1659a {

        /* renamed from: a */
        private final Handler f4787a;

        /* renamed from: b */
        private final C1658s f4788b;

        public C1659a(Handler handler, C1658s sVar) {
            this.f4787a = sVar != null ? (Handler) C5917a.m34872e(handler) : null;
            this.f4788b = sVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: A */
        public /* synthetic */ void m7615A(int i, long j, long j2) {
            ((C1658s) C5953m0.m35138j(this.f4788b)).mo6556w(i, j, j2);
        }

        /* access modifiers changed from: private */
        /* renamed from: r */
        public /* synthetic */ void m7626r(Exception exc) {
            ((C1658s) C5953m0.m35138j(this.f4788b)).mo6555u(exc);
        }

        /* access modifiers changed from: private */
        /* renamed from: s */
        public /* synthetic */ void m7627s(Exception exc) {
            ((C1658s) C5953m0.m35138j(this.f4788b)).mo6549c(exc);
        }

        /* access modifiers changed from: private */
        /* renamed from: t */
        public /* synthetic */ void m7628t(String str, long j, long j2) {
            ((C1658s) C5953m0.m35138j(this.f4788b)).mo6553m(str, j, j2);
        }

        /* access modifiers changed from: private */
        /* renamed from: u */
        public /* synthetic */ void m7629u(String str) {
            ((C1658s) C5953m0.m35138j(this.f4788b)).mo6552l(str);
        }

        /* access modifiers changed from: private */
        /* renamed from: v */
        public /* synthetic */ void m7630v(C1846e eVar) {
            eVar.mo7047c();
            ((C1658s) C5953m0.m35138j(this.f4788b)).mo6557x(eVar);
        }

        /* access modifiers changed from: private */
        /* renamed from: w */
        public /* synthetic */ void m7631w(C1846e eVar) {
            ((C1658s) C5953m0.m35138j(this.f4788b)).mo6551e(eVar);
        }

        /* access modifiers changed from: private */
        /* renamed from: x */
        public /* synthetic */ void m7632x(C6272r1 r1Var, C1852i iVar) {
            ((C1658s) C5953m0.m35138j(this.f4788b)).mo6547G(r1Var);
            ((C1658s) C5953m0.m35138j(this.f4788b)).mo6550d(r1Var, iVar);
        }

        /* access modifiers changed from: private */
        /* renamed from: y */
        public /* synthetic */ void m7633y(long j) {
            ((C1658s) C5953m0.m35138j(this.f4788b)).mo6554t(j);
        }

        /* access modifiers changed from: private */
        /* renamed from: z */
        public /* synthetic */ void m7634z(boolean z) {
            ((C1658s) C5953m0.m35138j(this.f4788b)).mo6548b(z);
        }

        /* renamed from: B */
        public void mo6558B(long j) {
            Handler handler = this.f4787a;
            if (handler != null) {
                handler.post(new C1645j(this, j));
            }
        }

        /* renamed from: C */
        public void mo6559C(boolean z) {
            Handler handler = this.f4787a;
            if (handler != null) {
                handler.post(new C1657r(this, z));
            }
        }

        /* renamed from: D */
        public void mo6560D(int i, long j, long j2) {
            Handler handler = this.f4787a;
            if (handler != null) {
                handler.post(new C1643i(this, i, j, j2));
            }
        }

        /* renamed from: k */
        public void mo6561k(Exception exc) {
            Handler handler = this.f4787a;
            if (handler != null) {
                handler.post(new C1651m(this, exc));
            }
        }

        /* renamed from: l */
        public void mo6562l(Exception exc) {
            Handler handler = this.f4787a;
            if (handler != null) {
                handler.post(new C1653n(this, exc));
            }
        }

        /* renamed from: m */
        public void mo6563m(String str, long j, long j2) {
            Handler handler = this.f4787a;
            if (handler != null) {
                handler.post(new C1655p(this, str, j, j2));
            }
        }

        /* renamed from: n */
        public void mo6564n(String str) {
            Handler handler = this.f4787a;
            if (handler != null) {
                handler.post(new C1654o(this, str));
            }
        }

        /* renamed from: o */
        public void mo6565o(C1846e eVar) {
            eVar.mo7047c();
            Handler handler = this.f4787a;
            if (handler != null) {
                handler.post(new C1647k(this, eVar));
            }
        }

        /* renamed from: p */
        public void mo6566p(C1846e eVar) {
            Handler handler = this.f4787a;
            if (handler != null) {
                handler.post(new C1649l(this, eVar));
            }
        }

        /* renamed from: q */
        public void mo6567q(C6272r1 r1Var, C1852i iVar) {
            Handler handler = this.f4787a;
            if (handler != null) {
                handler.post(new C1656q(this, r1Var, iVar));
            }
        }
    }

    @Deprecated
    /* renamed from: G */
    void mo6547G(C6272r1 r1Var);

    /* renamed from: b */
    void mo6548b(boolean z);

    /* renamed from: c */
    void mo6549c(Exception exc);

    /* renamed from: d */
    void mo6550d(C6272r1 r1Var, C1852i iVar);

    /* renamed from: e */
    void mo6551e(C1846e eVar);

    /* renamed from: l */
    void mo6552l(String str);

    /* renamed from: m */
    void mo6553m(String str, long j, long j2);

    /* renamed from: t */
    void mo6554t(long j);

    /* renamed from: u */
    void mo6555u(Exception exc);

    /* renamed from: w */
    void mo6556w(int i, long j, long j2);

    /* renamed from: x */
    void mo6557x(C1846e eVar);
}
