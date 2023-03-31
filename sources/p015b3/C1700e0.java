package p015b3;

import android.os.Handler;
import java.io.IOException;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import p015b3.C1772x;
import p161w3.C5917a;
import p161w3.C5953m0;
import p177z1.C6272r1;

/* renamed from: b3.e0 */
/* compiled from: MediaSourceEventListener */
public interface C1700e0 {

    /* renamed from: b3.e0$a */
    /* compiled from: MediaSourceEventListener */
    public static class C1701a {

        /* renamed from: a */
        public final int f4996a;

        /* renamed from: b */
        public final C1772x.C1774b f4997b;

        /* renamed from: c */
        private final CopyOnWriteArrayList<C1702a> f4998c;

        /* renamed from: d */
        private final long f4999d;

        /* renamed from: b3.e0$a$a */
        /* compiled from: MediaSourceEventListener */
        private static final class C1702a {

            /* renamed from: a */
            public Handler f5000a;

            /* renamed from: b */
            public C1700e0 f5001b;

            public C1702a(Handler handler, C1700e0 e0Var) {
                this.f5000a = handler;
                this.f5001b = e0Var;
            }
        }

        public C1701a() {
            this(new CopyOnWriteArrayList(), 0, (C1772x.C1774b) null, 0);
        }

        /* renamed from: h */
        private long m7911h(long j) {
            long Y0 = C5953m0.m35117Y0(j);
            if (Y0 == -9223372036854775807L) {
                return -9223372036854775807L;
            }
            return this.f4999d + Y0;
        }

        /* access modifiers changed from: private */
        /* renamed from: k */
        public /* synthetic */ void m7912k(C1700e0 e0Var, C1759t tVar) {
            e0Var.mo148G(this.f4996a, this.f4997b, tVar);
        }

        /* access modifiers changed from: private */
        /* renamed from: l */
        public /* synthetic */ void m7913l(C1700e0 e0Var, C1748q qVar, C1759t tVar) {
            e0Var.mo164Y(this.f4996a, this.f4997b, qVar, tVar);
        }

        /* access modifiers changed from: private */
        /* renamed from: m */
        public /* synthetic */ void m7914m(C1700e0 e0Var, C1748q qVar, C1759t tVar) {
            e0Var.mo179k0(this.f4996a, this.f4997b, qVar, tVar);
        }

        /* access modifiers changed from: private */
        /* renamed from: n */
        public /* synthetic */ void m7915n(C1700e0 e0Var, C1748q qVar, C1759t tVar, IOException iOException, boolean z) {
            e0Var.mo176i0(this.f4996a, this.f4997b, qVar, tVar, iOException, z);
        }

        /* access modifiers changed from: private */
        /* renamed from: o */
        public /* synthetic */ void m7916o(C1700e0 e0Var, C1748q qVar, C1759t tVar) {
            e0Var.mo183o0(this.f4996a, this.f4997b, qVar, tVar);
        }

        /* access modifiers changed from: private */
        /* renamed from: p */
        public /* synthetic */ void m7917p(C1700e0 e0Var, C1772x.C1774b bVar, C1759t tVar) {
            e0Var.mo145E(this.f4996a, bVar, tVar);
        }

        /* renamed from: A */
        public void mo6713A(C1748q qVar, int i, int i2, C6272r1 r1Var, int i3, Object obj, long j, long j2) {
            C1748q qVar2 = qVar;
            mo6714B(qVar, new C1759t(i, i2, r1Var, i3, obj, m7911h(j), m7911h(j2)));
        }

        /* renamed from: B */
        public void mo6714B(C1748q qVar, C1759t tVar) {
            Iterator<C1702a> it = this.f4998c.iterator();
            while (it.hasNext()) {
                C1702a next = it.next();
                C5953m0.m35089K0(next.f5000a, new C1779z(this, next.f5001b, qVar, tVar));
            }
        }

        /* renamed from: C */
        public void mo6715C(C1700e0 e0Var) {
            Iterator<C1702a> it = this.f4998c.iterator();
            while (it.hasNext()) {
                C1702a next = it.next();
                if (next.f5001b == e0Var) {
                    this.f4998c.remove(next);
                }
            }
        }

        /* renamed from: D */
        public void mo6716D(int i, long j, long j2) {
            long j3 = j;
            mo6717E(new C1759t(1, i, (C6272r1) null, 3, (Object) null, m7911h(j), m7911h(j2)));
        }

        /* renamed from: E */
        public void mo6717E(C1759t tVar) {
            C1772x.C1774b bVar = (C1772x.C1774b) C5917a.m34872e(this.f4997b);
            Iterator<C1702a> it = this.f4998c.iterator();
            while (it.hasNext()) {
                C1702a next = it.next();
                C5953m0.m35089K0(next.f5000a, new C1696d0(this, next.f5001b, bVar, tVar));
            }
        }

        /* renamed from: F */
        public C1701a mo6718F(int i, C1772x.C1774b bVar, long j) {
            return new C1701a(this.f4998c, i, bVar, j);
        }

        /* renamed from: g */
        public void mo6719g(Handler handler, C1700e0 e0Var) {
            C5917a.m34872e(handler);
            C5917a.m34872e(e0Var);
            this.f4998c.add(new C1702a(handler, e0Var));
        }

        /* renamed from: i */
        public void mo6720i(int i, C6272r1 r1Var, int i2, Object obj, long j) {
            mo6721j(new C1759t(1, i, r1Var, i2, obj, m7911h(j), -9223372036854775807L));
        }

        /* renamed from: j */
        public void mo6721j(C1759t tVar) {
            Iterator<C1702a> it = this.f4998c.iterator();
            while (it.hasNext()) {
                C1702a next = it.next();
                C5953m0.m35089K0(next.f5000a, new C1693c0(this, next.f5001b, tVar));
            }
        }

        /* renamed from: q */
        public void mo6722q(C1748q qVar, int i) {
            mo6723r(qVar, i, -1, (C6272r1) null, 0, (Object) null, -9223372036854775807L, -9223372036854775807L);
        }

        /* renamed from: r */
        public void mo6723r(C1748q qVar, int i, int i2, C6272r1 r1Var, int i3, Object obj, long j, long j2) {
            C1748q qVar2 = qVar;
            mo6724s(qVar, new C1759t(i, i2, r1Var, i3, obj, m7911h(j), m7911h(j2)));
        }

        /* renamed from: s */
        public void mo6724s(C1748q qVar, C1759t tVar) {
            Iterator<C1702a> it = this.f4998c.iterator();
            while (it.hasNext()) {
                C1702a next = it.next();
                C5953m0.m35089K0(next.f5000a, new C1688a0(this, next.f5001b, qVar, tVar));
            }
        }

        /* renamed from: t */
        public void mo6725t(C1748q qVar, int i) {
            mo6726u(qVar, i, -1, (C6272r1) null, 0, (Object) null, -9223372036854775807L, -9223372036854775807L);
        }

        /* renamed from: u */
        public void mo6726u(C1748q qVar, int i, int i2, C6272r1 r1Var, int i3, Object obj, long j, long j2) {
            C1748q qVar2 = qVar;
            mo6727v(qVar, new C1759t(i, i2, r1Var, i3, obj, m7911h(j), m7911h(j2)));
        }

        /* renamed from: v */
        public void mo6727v(C1748q qVar, C1759t tVar) {
            Iterator<C1702a> it = this.f4998c.iterator();
            while (it.hasNext()) {
                C1702a next = it.next();
                C5953m0.m35089K0(next.f5000a, new C1777y(this, next.f5001b, qVar, tVar));
            }
        }

        /* renamed from: w */
        public void mo6728w(C1748q qVar, int i, int i2, C6272r1 r1Var, int i3, Object obj, long j, long j2, IOException iOException, boolean z) {
            C1748q qVar2 = qVar;
            mo6730y(qVar, new C1759t(i, i2, r1Var, i3, obj, m7911h(j), m7911h(j2)), iOException, z);
        }

        /* renamed from: x */
        public void mo6729x(C1748q qVar, int i, IOException iOException, boolean z) {
            mo6728w(qVar, i, -1, (C6272r1) null, 0, (Object) null, -9223372036854775807L, -9223372036854775807L, iOException, z);
        }

        /* renamed from: y */
        public void mo6730y(C1748q qVar, C1759t tVar, IOException iOException, boolean z) {
            Iterator<C1702a> it = this.f4998c.iterator();
            while (it.hasNext()) {
                C1702a next = it.next();
                C5953m0.m35089K0(next.f5000a, new C1691b0(this, next.f5001b, qVar, tVar, iOException, z));
            }
        }

        /* renamed from: z */
        public void mo6731z(C1748q qVar, int i) {
            mo6713A(qVar, i, -1, (C6272r1) null, 0, (Object) null, -9223372036854775807L, -9223372036854775807L);
        }

        private C1701a(CopyOnWriteArrayList<C1702a> copyOnWriteArrayList, int i, C1772x.C1774b bVar, long j) {
            this.f4998c = copyOnWriteArrayList;
            this.f4996a = i;
            this.f4997b = bVar;
            this.f4999d = j;
        }
    }

    /* renamed from: E */
    void mo145E(int i, C1772x.C1774b bVar, C1759t tVar);

    /* renamed from: G */
    void mo148G(int i, C1772x.C1774b bVar, C1759t tVar);

    /* renamed from: Y */
    void mo164Y(int i, C1772x.C1774b bVar, C1748q qVar, C1759t tVar);

    /* renamed from: i0 */
    void mo176i0(int i, C1772x.C1774b bVar, C1748q qVar, C1759t tVar, IOException iOException, boolean z);

    /* renamed from: k0 */
    void mo179k0(int i, C1772x.C1774b bVar, C1748q qVar, C1759t tVar);

    /* renamed from: o0 */
    void mo183o0(int i, C1772x.C1774b bVar, C1748q qVar, C1759t tVar);
}
