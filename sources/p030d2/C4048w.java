package p030d2;

import android.os.Handler;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import p015b3.C1772x;
import p161w3.C5917a;
import p161w3.C5953m0;

/* renamed from: d2.w */
/* compiled from: DrmSessionEventListener */
public interface C4048w {

    /* renamed from: d2.w$a */
    /* compiled from: DrmSessionEventListener */
    public static class C4049a {

        /* renamed from: a */
        public final int f23127a;

        /* renamed from: b */
        public final C1772x.C1774b f23128b;

        /* renamed from: c */
        private final CopyOnWriteArrayList<C4050a> f23129c;

        /* renamed from: d2.w$a$a */
        /* compiled from: DrmSessionEventListener */
        private static final class C4050a {

            /* renamed from: a */
            public Handler f23130a;

            /* renamed from: b */
            public C4048w f23131b;

            public C4050a(Handler handler, C4048w wVar) {
                this.f23130a = handler;
                this.f23131b = wVar;
            }
        }

        public C4049a() {
            this(new CopyOnWriteArrayList(), 0, (C1772x.C1774b) null);
        }

        /* access modifiers changed from: private */
        /* renamed from: n */
        public /* synthetic */ void m27865n(C4048w wVar) {
            wVar.mo172f0(this.f23127a, this.f23128b);
        }

        /* access modifiers changed from: private */
        /* renamed from: o */
        public /* synthetic */ void m27866o(C4048w wVar) {
            wVar.mo174g0(this.f23127a, this.f23128b);
        }

        /* access modifiers changed from: private */
        /* renamed from: p */
        public /* synthetic */ void m27867p(C4048w wVar) {
            wVar.mo158T(this.f23127a, this.f23128b);
        }

        /* access modifiers changed from: private */
        /* renamed from: q */
        public /* synthetic */ void m27868q(C4048w wVar, int i) {
            wVar.mo155Q(this.f23127a, this.f23128b);
            wVar.mo154P(this.f23127a, this.f23128b, i);
        }

        /* access modifiers changed from: private */
        /* renamed from: r */
        public /* synthetic */ void m27869r(C4048w wVar, Exception exc) {
            wVar.mo160V(this.f23127a, this.f23128b, exc);
        }

        /* access modifiers changed from: private */
        /* renamed from: s */
        public /* synthetic */ void m27870s(C4048w wVar) {
            wVar.mo161W(this.f23127a, this.f23128b);
        }

        /* renamed from: g */
        public void mo17252g(Handler handler, C4048w wVar) {
            C5917a.m34872e(handler);
            C5917a.m34872e(wVar);
            this.f23129c.add(new C4050a(handler, wVar));
        }

        /* renamed from: h */
        public void mo17253h() {
            Iterator<C4050a> it = this.f23129c.iterator();
            while (it.hasNext()) {
                C4050a next = it.next();
                C5953m0.m35089K0(next.f23130a, new C9859s(this, next.f23131b));
            }
        }

        /* renamed from: i */
        public void mo17254i() {
            Iterator<C4050a> it = this.f23129c.iterator();
            while (it.hasNext()) {
                C4050a next = it.next();
                C5953m0.m35089K0(next.f23130a, new C9858r(this, next.f23131b));
            }
        }

        /* renamed from: j */
        public void mo17255j() {
            Iterator<C4050a> it = this.f23129c.iterator();
            while (it.hasNext()) {
                C4050a next = it.next();
                C5953m0.m35089K0(next.f23130a, new C9860t(this, next.f23131b));
            }
        }

        /* renamed from: k */
        public void mo17256k(int i) {
            Iterator<C4050a> it = this.f23129c.iterator();
            while (it.hasNext()) {
                C4050a next = it.next();
                C5953m0.m35089K0(next.f23130a, new C9861u(this, next.f23131b, i));
            }
        }

        /* renamed from: l */
        public void mo17257l(Exception exc) {
            Iterator<C4050a> it = this.f23129c.iterator();
            while (it.hasNext()) {
                C4050a next = it.next();
                C5953m0.m35089K0(next.f23130a, new C9862v(this, next.f23131b, exc));
            }
        }

        /* renamed from: m */
        public void mo17258m() {
            Iterator<C4050a> it = this.f23129c.iterator();
            while (it.hasNext()) {
                C4050a next = it.next();
                C5953m0.m35089K0(next.f23130a, new C9857q(this, next.f23131b));
            }
        }

        /* renamed from: t */
        public void mo17259t(C4048w wVar) {
            Iterator<C4050a> it = this.f23129c.iterator();
            while (it.hasNext()) {
                C4050a next = it.next();
                if (next.f23131b == wVar) {
                    this.f23129c.remove(next);
                }
            }
        }

        /* renamed from: u */
        public C4049a mo17260u(int i, C1772x.C1774b bVar) {
            return new C4049a(this.f23129c, i, bVar);
        }

        private C4049a(CopyOnWriteArrayList<C4050a> copyOnWriteArrayList, int i, C1772x.C1774b bVar) {
            this.f23129c = copyOnWriteArrayList;
            this.f23127a = i;
            this.f23128b = bVar;
        }
    }

    /* renamed from: P */
    void mo154P(int i, C1772x.C1774b bVar, int i2);

    @Deprecated
    /* renamed from: Q */
    void mo155Q(int i, C1772x.C1774b bVar);

    /* renamed from: T */
    void mo158T(int i, C1772x.C1774b bVar);

    /* renamed from: V */
    void mo160V(int i, C1772x.C1774b bVar, Exception exc);

    /* renamed from: W */
    void mo161W(int i, C1772x.C1774b bVar);

    /* renamed from: f0 */
    void mo172f0(int i, C1772x.C1774b bVar);

    /* renamed from: g0 */
    void mo174g0(int i, C1772x.C1774b bVar);
}
