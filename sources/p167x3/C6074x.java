package p167x3;

import android.os.Handler;
import android.os.SystemClock;
import p021c2.C1846e;
import p021c2.C1852i;
import p161w3.C5917a;
import p161w3.C5953m0;
import p177z1.C6272r1;

/* renamed from: x3.x */
/* compiled from: VideoRendererEventListener */
public interface C6074x {

    /* renamed from: x3.x$a */
    /* compiled from: VideoRendererEventListener */
    public static final class C6075a {

        /* renamed from: a */
        private final Handler f29441a;

        /* renamed from: b */
        private final C6074x f29442b;

        public C6075a(Handler handler, C6074x xVar) {
            this.f29441a = xVar != null ? (Handler) C5917a.m34872e(handler) : null;
            this.f29442b = xVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: q */
        public /* synthetic */ void m35654q(String str, long j, long j2) {
            ((C6074x) C5953m0.m35138j(this.f29442b)).mo20852h(str, j, j2);
        }

        /* access modifiers changed from: private */
        /* renamed from: r */
        public /* synthetic */ void m35655r(String str) {
            ((C6074x) C5953m0.m35138j(this.f29442b)).mo20851f(str);
        }

        /* access modifiers changed from: private */
        /* renamed from: s */
        public /* synthetic */ void m35656s(C1846e eVar) {
            eVar.mo7047c();
            ((C6074x) C5953m0.m35138j(this.f29442b)).mo20853i(eVar);
        }

        /* access modifiers changed from: private */
        /* renamed from: t */
        public /* synthetic */ void m35657t(int i, long j) {
            ((C6074x) C5953m0.m35138j(this.f29442b)).mo20855n(i, j);
        }

        /* access modifiers changed from: private */
        /* renamed from: u */
        public /* synthetic */ void m35658u(C1846e eVar) {
            ((C6074x) C5953m0.m35138j(this.f29442b)).mo20858r(eVar);
        }

        /* access modifiers changed from: private */
        /* renamed from: v */
        public /* synthetic */ void m35659v(C6272r1 r1Var, C1852i iVar) {
            ((C6074x) C5953m0.m35138j(this.f29442b)).mo20850F(r1Var);
            ((C6074x) C5953m0.m35138j(this.f29442b)).mo20854k(r1Var, iVar);
        }

        /* access modifiers changed from: private */
        /* renamed from: w */
        public /* synthetic */ void m35660w(Object obj, long j) {
            ((C6074x) C5953m0.m35138j(this.f29442b)).mo20857q(obj, j);
        }

        /* access modifiers changed from: private */
        /* renamed from: x */
        public /* synthetic */ void m35661x(long j, int i) {
            ((C6074x) C5953m0.m35138j(this.f29442b)).mo20860y(j, i);
        }

        /* access modifiers changed from: private */
        /* renamed from: y */
        public /* synthetic */ void m35662y(Exception exc) {
            ((C6074x) C5953m0.m35138j(this.f29442b)).mo20859v(exc);
        }

        /* access modifiers changed from: private */
        /* renamed from: z */
        public /* synthetic */ void m35663z(C6076z zVar) {
            ((C6074x) C5953m0.m35138j(this.f29442b)).mo20856p(zVar);
        }

        /* renamed from: A */
        public void mo20861A(Object obj) {
            if (this.f29441a != null) {
                this.f29441a.post(new C12968s(this, obj, SystemClock.elapsedRealtime()));
            }
        }

        /* renamed from: B */
        public void mo20862B(long j, int i) {
            Handler handler = this.f29441a;
            if (handler != null) {
                handler.post(new C12964o(this, j, i));
            }
        }

        /* renamed from: C */
        public void mo20863C(Exception exc) {
            Handler handler = this.f29441a;
            if (handler != null) {
                handler.post(new C12967r(this, exc));
            }
        }

        /* renamed from: D */
        public void mo20864D(C6076z zVar) {
            Handler handler = this.f29441a;
            if (handler != null) {
                handler.post(new C12971v(this, zVar));
            }
        }

        /* renamed from: k */
        public void mo20865k(String str, long j, long j2) {
            Handler handler = this.f29441a;
            if (handler != null) {
                handler.post(new C12970u(this, str, j, j2));
            }
        }

        /* renamed from: l */
        public void mo20866l(String str) {
            Handler handler = this.f29441a;
            if (handler != null) {
                handler.post(new C12969t(this, str));
            }
        }

        /* renamed from: m */
        public void mo20867m(C1846e eVar) {
            eVar.mo7047c();
            Handler handler = this.f29441a;
            if (handler != null) {
                handler.post(new C12965p(this, eVar));
            }
        }

        /* renamed from: n */
        public void mo20868n(int i, long j) {
            Handler handler = this.f29441a;
            if (handler != null) {
                handler.post(new C12963n(this, i, j));
            }
        }

        /* renamed from: o */
        public void mo20869o(C1846e eVar) {
            Handler handler = this.f29441a;
            if (handler != null) {
                handler.post(new C12966q(this, eVar));
            }
        }

        /* renamed from: p */
        public void mo20870p(C6272r1 r1Var, C1852i iVar) {
            Handler handler = this.f29441a;
            if (handler != null) {
                handler.post(new C12972w(this, r1Var, iVar));
            }
        }
    }

    @Deprecated
    /* renamed from: F */
    void mo20850F(C6272r1 r1Var);

    /* renamed from: f */
    void mo20851f(String str);

    /* renamed from: h */
    void mo20852h(String str, long j, long j2);

    /* renamed from: i */
    void mo20853i(C1846e eVar);

    /* renamed from: k */
    void mo20854k(C6272r1 r1Var, C1852i iVar);

    /* renamed from: n */
    void mo20855n(int i, long j);

    /* renamed from: p */
    void mo20856p(C6076z zVar);

    /* renamed from: q */
    void mo20857q(Object obj, long j);

    /* renamed from: r */
    void mo20858r(C1846e eVar);

    /* renamed from: v */
    void mo20859v(Exception exc);

    /* renamed from: y */
    void mo20860y(long j, int i);
}
