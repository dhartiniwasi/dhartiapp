package p059h3;

import android.net.Uri;
import android.os.Handler;
import android.os.SystemClock;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import p015b3.C1700e0;
import p015b3.C1748q;
import p015b3.C1759t;
import p052g3.C4372g;
import p059h3.C4449g;
import p059h3.C4456h;
import p059h3.C4460j;
import p059h3.C4464l;
import p155v3.C5794c0;
import p155v3.C5804g0;
import p155v3.C5810h0;
import p155v3.C5823j0;
import p155v3.C5828l;
import p161w3.C5917a;
import p161w3.C5953m0;
import p177z1.C6249m2;
import p190b7.C6696t;

/* renamed from: h3.c */
/* compiled from: DefaultHlsPlaylistTracker */
public final class C4443c implements C4464l, C5810h0.C5812b<C5823j0<C4459i>> {

    /* renamed from: x */
    public static final C4464l.C4465a f24664x = C10404b.f41324a;
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C4372g f24665a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C4463k f24666b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final C5804g0 f24667c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final HashMap<Uri, C4446c> f24668d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final CopyOnWriteArrayList<C4464l.C4466b> f24669e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final double f24670f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public C1700e0.C1701a f24671g;

    /* renamed from: h */
    private C5810h0 f24672h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public Handler f24673i;

    /* renamed from: r */
    private C4464l.C4469e f24674r;
    /* access modifiers changed from: private */

    /* renamed from: s */
    public C4456h f24675s;
    /* access modifiers changed from: private */

    /* renamed from: t */
    public Uri f24676t;
    /* access modifiers changed from: private */

    /* renamed from: u */
    public C4449g f24677u;

    /* renamed from: v */
    private boolean f24678v;

    /* renamed from: w */
    private long f24679w;

    /* renamed from: h3.c$b */
    /* compiled from: DefaultHlsPlaylistTracker */
    private class C4445b implements C4464l.C4466b {
        private C4445b() {
        }

        /* renamed from: a */
        public void mo17838a() {
            C4443c.this.f24669e.remove(this);
        }

        /* renamed from: j */
        public boolean mo17839j(Uri uri, C5804g0.C5807c cVar, boolean z) {
            C4446c cVar2;
            if (C4443c.this.f24677u == null) {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                List<C4456h.C4458b> list = ((C4456h) C5953m0.m35138j(C4443c.this.f24675s)).f24738e;
                int i = 0;
                for (int i2 = 0; i2 < list.size(); i2++) {
                    C4446c cVar3 = (C4446c) C4443c.this.f24668d.get(list.get(i2).f24751a);
                    if (cVar3 != null && elapsedRealtime < cVar3.f24688h) {
                        i++;
                    }
                }
                C5804g0.C5806b a = C4443c.this.f24667c.mo20329a(new C5804g0.C5805a(1, 0, C4443c.this.f24675s.f24738e.size(), i), cVar);
                if (!(a == null || a.f28809a != 2 || (cVar2 = (C4446c) C4443c.this.f24668d.get(uri)) == null)) {
                    boolean unused = cVar2.m29462h(a.f28810b);
                }
            }
            return false;
        }
    }

    /* renamed from: h3.c$c */
    /* compiled from: DefaultHlsPlaylistTracker */
    private final class C4446c implements C5810h0.C5812b<C5823j0<C4459i>> {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public final Uri f24681a;

        /* renamed from: b */
        private final C5810h0 f24682b = new C5810h0("DefaultHlsPlaylistTracker:MediaPlaylist");

        /* renamed from: c */
        private final C5828l f24683c;
        /* access modifiers changed from: private */

        /* renamed from: d */
        public C4449g f24684d;

        /* renamed from: e */
        private long f24685e;

        /* renamed from: f */
        private long f24686f;

        /* renamed from: g */
        private long f24687g;
        /* access modifiers changed from: private */

        /* renamed from: h */
        public long f24688h;

        /* renamed from: i */
        private boolean f24689i;

        /* renamed from: r */
        private IOException f24690r;

        public C4446c(Uri uri) {
            this.f24681a = uri;
            this.f24683c = C4443c.this.f24665a.mo17804a(4);
        }

        /* access modifiers changed from: private */
        /* renamed from: h */
        public boolean m29462h(long j) {
            this.f24688h = SystemClock.elapsedRealtime() + j;
            return this.f24681a.equals(C4443c.this.f24676t) && !C4443c.this.m29420L();
        }

        /* renamed from: i */
        private Uri m29463i() {
            C4449g gVar = this.f24684d;
            if (gVar != null) {
                C4449g.C4455f fVar = gVar.f24712v;
                if (fVar.f24731a != -9223372036854775807L || fVar.f24735e) {
                    Uri.Builder buildUpon = this.f24681a.buildUpon();
                    C4449g gVar2 = this.f24684d;
                    if (gVar2.f24712v.f24735e) {
                        buildUpon.appendQueryParameter("_HLS_msn", String.valueOf(gVar2.f24701k + ((long) gVar2.f24708r.size())));
                        C4449g gVar3 = this.f24684d;
                        if (gVar3.f24704n != -9223372036854775807L) {
                            List<C4449g.C4451b> list = gVar3.f24709s;
                            int size = list.size();
                            if (!list.isEmpty() && ((C4449g.C4451b) C6696t.m38506c(list)).f24714u) {
                                size--;
                            }
                            buildUpon.appendQueryParameter("_HLS_part", String.valueOf(size));
                        }
                    }
                    C4449g.C4455f fVar2 = this.f24684d.f24712v;
                    if (fVar2.f24731a != -9223372036854775807L) {
                        buildUpon.appendQueryParameter("_HLS_skip", fVar2.f24732b ? "v2" : "YES");
                    }
                    return buildUpon.build();
                }
            }
            return this.f24681a;
        }

        /* access modifiers changed from: private */
        /* renamed from: m */
        public /* synthetic */ void m29464m(Uri uri) {
            this.f24689i = false;
            m29465p(uri);
        }

        /* renamed from: p */
        private void m29465p(Uri uri) {
            C5823j0 j0Var = new C5823j0(this.f24683c, uri, 4, C4443c.this.f24666b.mo17970a(C4443c.this.f24675s, this.f24684d));
            C4443c.this.f24671g.mo6731z(new C1748q(j0Var.f28845a, j0Var.f28846b, this.f24682b.mo20341n(j0Var, this, C4443c.this.f24667c.mo20332d(j0Var.f28847c))), j0Var.f28847c);
        }

        /* access modifiers changed from: private */
        /* renamed from: r */
        public void m29466r(Uri uri) {
            this.f24688h = 0;
            if (!this.f24689i && !this.f24682b.mo20337j() && !this.f24682b.mo20336i()) {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                if (elapsedRealtime < this.f24687g) {
                    this.f24689i = true;
                    C4443c.this.f24673i.postDelayed(new C10405d(this, uri), this.f24687g - elapsedRealtime);
                    return;
                }
                m29465p(uri);
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: w */
        public void m29467w(C4449g gVar, C1748q qVar) {
            boolean z;
            C4449g gVar2 = this.f24684d;
            long elapsedRealtime = SystemClock.elapsedRealtime();
            this.f24685e = elapsedRealtime;
            C4449g t = C4443c.this.m29415G(gVar2, gVar);
            this.f24684d = t;
            boolean z2 = false;
            IOException iOException = null;
            if (t != gVar2) {
                this.f24690r = null;
                this.f24686f = elapsedRealtime;
                C4443c.this.m29423R(this.f24681a, t);
            } else if (!t.f24705o) {
                C4449g gVar3 = this.f24684d;
                if (gVar.f24701k + ((long) gVar.f24708r.size()) < gVar3.f24701k) {
                    iOException = new C4464l.C4467c(this.f24681a);
                    z = true;
                } else {
                    if (((double) (elapsedRealtime - this.f24686f)) > ((double) C5953m0.m35117Y0(gVar3.f24703m)) * C4443c.this.f24670f) {
                        iOException = new C4464l.C4468d(this.f24681a);
                    }
                    z = false;
                }
                if (iOException != null) {
                    this.f24690r = iOException;
                    boolean unused = C4443c.this.m29422N(this.f24681a, new C5804g0.C5807c(qVar, new C1759t(4), iOException, 1), z);
                }
            }
            long j = 0;
            C4449g gVar4 = this.f24684d;
            if (!gVar4.f24712v.f24735e) {
                if (gVar4 != gVar2) {
                    j = gVar4.f24703m;
                } else {
                    j = gVar4.f24703m / 2;
                }
            }
            this.f24687g = elapsedRealtime + C5953m0.m35117Y0(j);
            if (this.f24684d.f24704n != -9223372036854775807L || this.f24681a.equals(C4443c.this.f24676t)) {
                z2 = true;
            }
            if (z2 && !this.f24684d.f24705o) {
                m29466r(m29463i());
            }
        }

        /* renamed from: k */
        public C4449g mo17988k() {
            return this.f24684d;
        }

        /* renamed from: l */
        public boolean mo17989l() {
            int i;
            if (this.f24684d == null) {
                return false;
            }
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long max = Math.max(30000, C5953m0.m35117Y0(this.f24684d.f24711u));
            C4449g gVar = this.f24684d;
            if (gVar.f24705o || (i = gVar.f24694d) == 2 || i == 1 || this.f24685e + max > elapsedRealtime) {
                return true;
            }
            return false;
        }

        /* renamed from: n */
        public void mo17990n() {
            m29466r(this.f24681a);
        }

        /* renamed from: s */
        public void mo17991s() throws IOException {
            this.f24682b.mo7740b();
            IOException iOException = this.f24690r;
            if (iOException != null) {
                throw iOException;
            }
        }

        /* renamed from: t */
        public void mo6784q(C5823j0<C4459i> j0Var, long j, long j2, boolean z) {
            C5823j0<C4459i> j0Var2 = j0Var;
            C1748q qVar = new C1748q(j0Var2.f28845a, j0Var2.f28846b, j0Var.mo20352f(), j0Var.mo20350d(), j, j2, j0Var.mo20349a());
            C4443c.this.f24667c.mo20330b(j0Var2.f28845a);
            C4443c.this.f24671g.mo6722q(qVar, 4);
        }

        /* renamed from: u */
        public void mo6780j(C5823j0<C4459i> j0Var, long j, long j2) {
            C5823j0<C4459i> j0Var2 = j0Var;
            C4459i e = j0Var.mo20351e();
            C1748q qVar = new C1748q(j0Var2.f28845a, j0Var2.f28846b, j0Var.mo20352f(), j0Var.mo20350d(), j, j2, j0Var.mo20349a());
            if (e instanceof C4449g) {
                m29467w((C4449g) e, qVar);
                C4443c.this.f24671g.mo6725t(qVar, 4);
            } else {
                this.f24690r = C6249m2.m36663c("Loaded playlist has unexpected type.", (Throwable) null);
                C4443c.this.f24671g.mo6729x(qVar, 4, this.f24690r, true);
            }
            C4443c.this.f24667c.mo20330b(j0Var2.f28845a);
        }

        /* renamed from: v */
        public C5810h0.C5813c mo6783o(C5823j0<C4459i> j0Var, long j, long j2, IOException iOException, int i) {
            C5810h0.C5813c cVar;
            C5823j0<C4459i> j0Var2 = j0Var;
            IOException iOException2 = iOException;
            C1748q qVar = new C1748q(j0Var2.f28845a, j0Var2.f28846b, j0Var.mo20352f(), j0Var.mo20350d(), j, j2, j0Var.mo20349a());
            boolean z = iOException2 instanceof C4460j.C4461a;
            if ((j0Var.mo20352f().getQueryParameter("_HLS_msn") != null) || z) {
                int i2 = Integer.MAX_VALUE;
                if (iOException2 instanceof C5794c0) {
                    i2 = ((C5794c0) iOException2).f28789d;
                }
                if (z || i2 == 400 || i2 == 503) {
                    this.f24687g = SystemClock.elapsedRealtime();
                    mo17990n();
                    ((C1700e0.C1701a) C5953m0.m35138j(C4443c.this.f24671g)).mo6729x(qVar, j0Var2.f28847c, iOException2, true);
                    return C5810h0.f28823f;
                }
            }
            C5804g0.C5807c cVar2 = new C5804g0.C5807c(qVar, new C1759t(j0Var2.f28847c), iOException2, i);
            if (C4443c.this.m29422N(this.f24681a, cVar2, false)) {
                long c = C4443c.this.f24667c.mo20331c(cVar2);
                if (c != -9223372036854775807L) {
                    cVar = C5810h0.m34569h(false, c);
                } else {
                    cVar = C5810h0.f28824g;
                }
            } else {
                cVar = C5810h0.f28823f;
            }
            boolean c2 = true ^ cVar.mo20342c();
            C4443c.this.f24671g.mo6729x(qVar, j0Var2.f28847c, iOException2, c2);
            if (c2) {
                C4443c.this.f24667c.mo20330b(j0Var2.f28845a);
            }
            return cVar;
        }

        /* renamed from: x */
        public void mo17995x() {
            this.f24682b.mo20339l();
        }
    }

    public C4443c(C4372g gVar, C5804g0 g0Var, C4463k kVar) {
        this(gVar, g0Var, kVar, 3.5d);
    }

    /* renamed from: E */
    private void m29413E(List<Uri> list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Uri uri = list.get(i);
            this.f24668d.put(uri, new C4446c(uri));
        }
    }

    /* renamed from: F */
    private static C4449g.C4453d m29414F(C4449g gVar, C4449g gVar2) {
        int i = (int) (gVar2.f24701k - gVar.f24701k);
        List<C4449g.C4453d> list = gVar.f24708r;
        if (i < list.size()) {
            return list.get(i);
        }
        return null;
    }

    /* access modifiers changed from: private */
    /* renamed from: G */
    public C4449g m29415G(C4449g gVar, C4449g gVar2) {
        if (!gVar2.mo18000f(gVar)) {
            return gVar2.f24705o ? gVar.mo17998d() : gVar;
        }
        return gVar2.mo17997c(m29417I(gVar, gVar2), m29416H(gVar, gVar2));
    }

    /* renamed from: H */
    private int m29416H(C4449g gVar, C4449g gVar2) {
        C4449g.C4453d F;
        if (gVar2.f24699i) {
            return gVar2.f24700j;
        }
        C4449g gVar3 = this.f24677u;
        int i = gVar3 != null ? gVar3.f24700j : 0;
        return (gVar == null || (F = m29414F(gVar, gVar2)) == null) ? i : (gVar.f24700j + F.f24723d) - gVar2.f24708r.get(0).f24723d;
    }

    /* renamed from: I */
    private long m29417I(C4449g gVar, C4449g gVar2) {
        if (gVar2.f24706p) {
            return gVar2.f24698h;
        }
        C4449g gVar3 = this.f24677u;
        long j = gVar3 != null ? gVar3.f24698h : 0;
        if (gVar == null) {
            return j;
        }
        int size = gVar.f24708r.size();
        C4449g.C4453d F = m29414F(gVar, gVar2);
        if (F != null) {
            return gVar.f24698h + F.f24724e;
        }
        return ((long) size) == gVar2.f24701k - gVar.f24701k ? gVar.mo17999e() : j;
    }

    /* renamed from: J */
    private Uri m29418J(Uri uri) {
        C4449g.C4452c cVar;
        C4449g gVar = this.f24677u;
        if (gVar == null || !gVar.f24712v.f24735e || (cVar = gVar.f24710t.get(uri)) == null) {
            return uri;
        }
        Uri.Builder buildUpon = uri.buildUpon();
        buildUpon.appendQueryParameter("_HLS_msn", String.valueOf(cVar.f24716b));
        int i = cVar.f24717c;
        if (i != -1) {
            buildUpon.appendQueryParameter("_HLS_part", String.valueOf(i));
        }
        return buildUpon.build();
    }

    /* renamed from: K */
    private boolean m29419K(Uri uri) {
        List<C4456h.C4458b> list = this.f24675s.f24738e;
        for (int i = 0; i < list.size(); i++) {
            if (uri.equals(list.get(i).f24751a)) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: private */
    /* renamed from: L */
    public boolean m29420L() {
        List<C4456h.C4458b> list = this.f24675s.f24738e;
        int size = list.size();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        for (int i = 0; i < size; i++) {
            C4446c cVar = (C4446c) C5917a.m34872e(this.f24668d.get(list.get(i).f24751a));
            if (elapsedRealtime > cVar.f24688h) {
                Uri e = cVar.f24681a;
                this.f24676t = e;
                cVar.m29466r(m29418J(e));
                return true;
            }
        }
        return false;
    }

    /* renamed from: M */
    private void m29421M(Uri uri) {
        if (!uri.equals(this.f24676t) && m29419K(uri)) {
            C4449g gVar = this.f24677u;
            if (gVar == null || !gVar.f24705o) {
                this.f24676t = uri;
                C4446c cVar = this.f24668d.get(uri);
                C4449g g = cVar.f24684d;
                if (g == null || !g.f24705o) {
                    cVar.m29466r(m29418J(uri));
                    return;
                }
                this.f24677u = g;
                this.f24674r.mo7790e(g);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: N */
    public boolean m29422N(Uri uri, C5804g0.C5807c cVar, boolean z) {
        Iterator<C4464l.C4466b> it = this.f24669e.iterator();
        boolean z2 = false;
        while (it.hasNext()) {
            z2 |= !it.next().mo17839j(uri, cVar, z);
        }
        return z2;
    }

    /* access modifiers changed from: private */
    /* renamed from: R */
    public void m29423R(Uri uri, C4449g gVar) {
        if (uri.equals(this.f24676t)) {
            if (this.f24677u == null) {
                this.f24678v = !gVar.f24705o;
                this.f24679w = gVar.f24698h;
            }
            this.f24677u = gVar;
            this.f24674r.mo7790e(gVar);
        }
        Iterator<C4464l.C4466b> it = this.f24669e.iterator();
        while (it.hasNext()) {
            it.next().mo17838a();
        }
    }

    /* renamed from: O */
    public void mo6784q(C5823j0<C4459i> j0Var, long j, long j2, boolean z) {
        C5823j0<C4459i> j0Var2 = j0Var;
        C1748q qVar = new C1748q(j0Var2.f28845a, j0Var2.f28846b, j0Var.mo20352f(), j0Var.mo20350d(), j, j2, j0Var.mo20349a());
        this.f24667c.mo20330b(j0Var2.f28845a);
        this.f24671g.mo6722q(qVar, 4);
    }

    /* renamed from: P */
    public void mo6780j(C5823j0<C4459i> j0Var, long j, long j2) {
        C4456h hVar;
        C5823j0<C4459i> j0Var2 = j0Var;
        C4459i e = j0Var.mo20351e();
        boolean z = e instanceof C4449g;
        if (z) {
            hVar = C4456h.m29492e(e.f24757a);
        } else {
            hVar = (C4456h) e;
        }
        this.f24675s = hVar;
        this.f24676t = hVar.f24738e.get(0).f24751a;
        this.f24669e.add(new C4445b());
        m29413E(hVar.f24737d);
        C1748q qVar = new C1748q(j0Var2.f28845a, j0Var2.f28846b, j0Var.mo20352f(), j0Var.mo20350d(), j, j2, j0Var.mo20349a());
        C4446c cVar = this.f24668d.get(this.f24676t);
        if (z) {
            cVar.m29467w((C4449g) e, qVar);
        } else {
            cVar.mo17990n();
        }
        this.f24667c.mo20330b(j0Var2.f28845a);
        this.f24671g.mo6725t(qVar, 4);
    }

    /* renamed from: Q */
    public C5810h0.C5813c mo6783o(C5823j0<C4459i> j0Var, long j, long j2, IOException iOException, int i) {
        C5823j0<C4459i> j0Var2 = j0Var;
        IOException iOException2 = iOException;
        C1748q qVar = new C1748q(j0Var2.f28845a, j0Var2.f28846b, j0Var.mo20352f(), j0Var.mo20350d(), j, j2, j0Var.mo20349a());
        long c = this.f24667c.mo20331c(new C5804g0.C5807c(qVar, new C1759t(j0Var2.f28847c), iOException2, i));
        boolean z = c == -9223372036854775807L;
        this.f24671g.mo6729x(qVar, j0Var2.f28847c, iOException2, z);
        if (z) {
            this.f24667c.mo20330b(j0Var2.f28845a);
        }
        if (z) {
            return C5810h0.f28824g;
        }
        return C5810h0.m34569h(false, c);
    }

    /* renamed from: a */
    public boolean mo17975a(Uri uri) {
        return this.f24668d.get(uri).mo17989l();
    }

    /* renamed from: b */
    public void mo17976b(Uri uri) throws IOException {
        this.f24668d.get(uri).mo17991s();
    }

    /* renamed from: c */
    public void mo17977c(Uri uri, C1700e0.C1701a aVar, C4464l.C4469e eVar) {
        this.f24673i = C5953m0.m35164w();
        this.f24671g = aVar;
        this.f24674r = eVar;
        C5823j0 j0Var = new C5823j0(this.f24665a.mo17804a(4), uri, 4, this.f24666b.mo17971b());
        C5917a.m34873f(this.f24672h == null);
        C5810h0 h0Var = new C5810h0("DefaultHlsPlaylistTracker:MultivariantPlaylist");
        this.f24672h = h0Var;
        aVar.mo6731z(new C1748q(j0Var.f28845a, j0Var.f28846b, h0Var.mo20341n(j0Var, this, this.f24667c.mo20332d(j0Var.f28847c))), j0Var.f28847c);
    }

    /* renamed from: d */
    public void mo17978d(C4464l.C4466b bVar) {
        C5917a.m34872e(bVar);
        this.f24669e.add(bVar);
    }

    /* renamed from: e */
    public long mo17979e() {
        return this.f24679w;
    }

    /* renamed from: f */
    public void mo17980f(C4464l.C4466b bVar) {
        this.f24669e.remove(bVar);
    }

    /* renamed from: g */
    public boolean mo17981g() {
        return this.f24678v;
    }

    /* renamed from: h */
    public C4456h mo17982h() {
        return this.f24675s;
    }

    /* renamed from: i */
    public boolean mo17983i(Uri uri, long j) {
        C4446c cVar = this.f24668d.get(uri);
        if (cVar != null) {
            return !cVar.m29462h(j);
        }
        return false;
    }

    /* renamed from: k */
    public void mo17984k() throws IOException {
        C5810h0 h0Var = this.f24672h;
        if (h0Var != null) {
            h0Var.mo7740b();
        }
        Uri uri = this.f24676t;
        if (uri != null) {
            mo17976b(uri);
        }
    }

    /* renamed from: l */
    public void mo17985l(Uri uri) {
        this.f24668d.get(uri).mo17990n();
    }

    /* renamed from: m */
    public C4449g mo17986m(Uri uri, boolean z) {
        C4449g k = this.f24668d.get(uri).mo17988k();
        if (k != null && z) {
            m29421M(uri);
        }
        return k;
    }

    public void stop() {
        this.f24676t = null;
        this.f24677u = null;
        this.f24675s = null;
        this.f24679w = -9223372036854775807L;
        this.f24672h.mo20339l();
        this.f24672h = null;
        for (C4446c x : this.f24668d.values()) {
            x.mo17995x();
        }
        this.f24673i.removeCallbacksAndMessages((Object) null);
        this.f24673i = null;
        this.f24668d.clear();
    }

    public C4443c(C4372g gVar, C5804g0 g0Var, C4463k kVar, double d) {
        this.f24665a = gVar;
        this.f24666b = kVar;
        this.f24667c = g0Var;
        this.f24670f = d;
        this.f24669e = new CopyOnWriteArrayList<>();
        this.f24668d = new HashMap<>();
        this.f24679w = -9223372036854775807L;
    }
}
