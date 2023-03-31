package com.google.android.exoplayer2.source.dash;

import android.os.SystemClock;
import com.google.android.exoplayer2.source.dash.C2017a;
import com.google.android.exoplayer2.source.dash.C2026e;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import p004a2.C0079u1;
import p015b3.C1690b;
import p031d3.C4056b;
import p031d3.C4058e;
import p031d3.C4060f;
import p031d3.C4061g;
import p031d3.C4064h;
import p031d3.C4069k;
import p031d3.C4071m;
import p031d3.C4072n;
import p031d3.C4073o;
import p031d3.C4075p;
import p037e2.C4197d;
import p038e3.C4233b;
import p038e3.C4235f;
import p038e3.C4236g;
import p038e3.C4237h;
import p045f3.C4255a;
import p045f3.C4256b;
import p045f3.C4257c;
import p045f3.C4264i;
import p045f3.C4265j;
import p149u3.C5735s;
import p155v3.C5794c0;
import p155v3.C5804g0;
import p155v3.C5820i0;
import p155v3.C5828l;
import p155v3.C5840p0;
import p161w3.C5953m0;
import p177z1.C6229i3;
import p177z1.C6272r1;

/* renamed from: com.google.android.exoplayer2.source.dash.c */
/* compiled from: DefaultDashChunkSource */
public class C2021c implements C2017a {

    /* renamed from: a */
    private final C5820i0 f5817a;

    /* renamed from: b */
    private final C4233b f5818b;

    /* renamed from: c */
    private final int[] f5819c;

    /* renamed from: d */
    private final int f5820d;

    /* renamed from: e */
    private final C5828l f5821e;

    /* renamed from: f */
    private final long f5822f;

    /* renamed from: g */
    private final int f5823g;

    /* renamed from: h */
    private final C2026e.C2029c f5824h;

    /* renamed from: i */
    protected final C2023b[] f5825i;

    /* renamed from: j */
    private C5735s f5826j;

    /* renamed from: k */
    private C4257c f5827k;

    /* renamed from: l */
    private int f5828l;

    /* renamed from: m */
    private IOException f5829m;

    /* renamed from: n */
    private boolean f5830n;

    /* renamed from: com.google.android.exoplayer2.source.dash.c$a */
    /* compiled from: DefaultDashChunkSource */
    public static final class C2022a implements C2017a.C2018a {

        /* renamed from: a */
        private final C5828l.C5829a f5831a;

        /* renamed from: b */
        private final int f5832b;

        /* renamed from: c */
        private final C4061g.C4062a f5833c;

        public C2022a(C5828l.C5829a aVar) {
            this(aVar, 1);
        }

        /* renamed from: a */
        public C2017a mo7747a(C5820i0 i0Var, C4257c cVar, C4233b bVar, int i, int[] iArr, C5735s sVar, int i2, long j, boolean z, List<C6272r1> list, C2026e.C2029c cVar2, C5840p0 p0Var, C0079u1 u1Var) {
            C5840p0 p0Var2 = p0Var;
            C5828l a = this.f5831a.mo20353a();
            if (p0Var2 != null) {
                a.mo6818n(p0Var2);
            }
            return new C2021c(this.f5833c, i0Var, cVar, bVar, i, iArr, sVar, i2, a, j, this.f5832b, z, list, cVar2, u1Var);
        }

        public C2022a(C5828l.C5829a aVar, int i) {
            this(C4058e.f23144r, aVar, i);
        }

        public C2022a(C4061g.C4062a aVar, C5828l.C5829a aVar2, int i) {
            this.f5833c = aVar;
            this.f5831a = aVar2;
            this.f5832b = i;
        }
    }

    /* renamed from: com.google.android.exoplayer2.source.dash.c$b */
    /* compiled from: DefaultDashChunkSource */
    protected static final class C2023b {

        /* renamed from: a */
        final C4061g f5834a;

        /* renamed from: b */
        public final C4265j f5835b;

        /* renamed from: c */
        public final C4256b f5836c;

        /* renamed from: d */
        public final C4235f f5837d;
        /* access modifiers changed from: private */

        /* renamed from: e */
        public final long f5838e;

        /* renamed from: f */
        private final long f5839f;

        C2023b(long j, C4265j jVar, C4256b bVar, C4061g gVar, long j2, C4235f fVar) {
            this.f5838e = j;
            this.f5835b = jVar;
            this.f5836c = bVar;
            this.f5839f = j2;
            this.f5834a = gVar;
            this.f5837d = fVar;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public C2023b mo7762b(long j, C4265j jVar) throws C1690b {
            long g;
            long g2;
            long j2 = j;
            C4235f l = this.f5835b.mo17688l();
            C4235f l2 = jVar.mo17688l();
            if (l == null) {
                return new C2023b(j, jVar, this.f5836c, this.f5834a, this.f5839f, l);
            } else if (!l.mo17606h()) {
                return new C2023b(j, jVar, this.f5836c, this.f5834a, this.f5839f, l2);
            } else {
                long j3 = l.mo17608j(j2);
                if (j3 == 0) {
                    return new C2023b(j, jVar, this.f5836c, this.f5834a, this.f5839f, l2);
                }
                long i = l.mo17607i();
                long b = l.mo17600b(i);
                long j4 = (j3 + i) - 1;
                long i2 = l2.mo17607i();
                C4235f fVar = l;
                long b2 = l2.mo17600b(i2);
                long j5 = i;
                long j6 = this.f5839f;
                int i3 = ((l.mo17600b(j4) + l.mo17601c(j4, j2)) > b2 ? 1 : ((l.mo17600b(j4) + l.mo17601c(j4, j2)) == b2 ? 0 : -1));
                if (i3 == 0) {
                    g = j4 + 1;
                } else if (i3 < 0) {
                    throw new C1690b();
                } else if (b2 < b) {
                    g2 = j6 - (l2.mo17605g(b, j2) - j5);
                    return new C2023b(j, jVar, this.f5836c, this.f5834a, g2, l2);
                } else {
                    g = fVar.mo17605g(b2, j2);
                }
                g2 = j6 + (g - i2);
                return new C2023b(j, jVar, this.f5836c, this.f5834a, g2, l2);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public C2023b mo7763c(C4235f fVar) {
            return new C2023b(this.f5838e, this.f5835b, this.f5836c, this.f5834a, this.f5839f, fVar);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public C2023b mo7764d(C4256b bVar) {
            return new C2023b(this.f5838e, this.f5835b, bVar, this.f5834a, this.f5839f, this.f5837d);
        }

        /* renamed from: e */
        public long mo7765e(long j) {
            return this.f5837d.mo17602d(this.f5838e, j) + this.f5839f;
        }

        /* renamed from: f */
        public long mo7766f() {
            return this.f5837d.mo17607i() + this.f5839f;
        }

        /* renamed from: g */
        public long mo7767g(long j) {
            return (mo7765e(j) + this.f5837d.mo17609k(this.f5838e, j)) - 1;
        }

        /* renamed from: h */
        public long mo7768h() {
            return this.f5837d.mo17608j(this.f5838e);
        }

        /* renamed from: i */
        public long mo7769i(long j) {
            return mo7771k(j) + this.f5837d.mo17601c(j - this.f5839f, this.f5838e);
        }

        /* renamed from: j */
        public long mo7770j(long j) {
            return this.f5837d.mo17605g(j, this.f5838e) + this.f5839f;
        }

        /* renamed from: k */
        public long mo7771k(long j) {
            return this.f5837d.mo17600b(j - this.f5839f);
        }

        /* renamed from: l */
        public C4264i mo7772l(long j) {
            return this.f5837d.mo17604f(j - this.f5839f);
        }

        /* renamed from: m */
        public boolean mo7773m(long j, long j2) {
            if (!this.f5837d.mo17606h() && j2 != -9223372036854775807L && mo7769i(j) > j2) {
                return false;
            }
            return true;
        }
    }

    /* renamed from: com.google.android.exoplayer2.source.dash.c$c */
    /* compiled from: DefaultDashChunkSource */
    protected static final class C2024c extends C4056b {

        /* renamed from: e */
        private final C2023b f5840e;

        /* renamed from: f */
        private final long f5841f;

        public C2024c(C2023b bVar, long j, long j2, long j3) {
            super(j, j2);
            this.f5840e = bVar;
            this.f5841f = j3;
        }

        /* renamed from: a */
        public long mo7774a() {
            mo17264c();
            return this.f5840e.mo7771k(mo17265d());
        }

        /* renamed from: b */
        public long mo7775b() {
            mo17264c();
            return this.f5840e.mo7769i(mo17265d());
        }
    }

    public C2021c(C4061g.C4062a aVar, C5820i0 i0Var, C4257c cVar, C4233b bVar, int i, int[] iArr, C5735s sVar, int i2, C5828l lVar, long j, int i3, boolean z, List<C6272r1> list, C2026e.C2029c cVar2, C0079u1 u1Var) {
        C4257c cVar3 = cVar;
        C4233b bVar2 = bVar;
        int i4 = i;
        C5735s sVar2 = sVar;
        this.f5817a = i0Var;
        this.f5827k = cVar3;
        this.f5818b = bVar2;
        this.f5819c = iArr;
        this.f5826j = sVar2;
        this.f5820d = i2;
        this.f5821e = lVar;
        this.f5828l = i4;
        this.f5822f = j;
        this.f5823g = i3;
        this.f5824h = cVar2;
        long g = cVar3.mo17627g(i4);
        ArrayList<C4265j> o = m8854o();
        this.f5825i = new C2023b[sVar.length()];
        int i5 = 0;
        while (i5 < this.f5825i.length) {
            C4265j jVar = o.get(sVar2.mo20145d(i5));
            C4256b j2 = bVar2.mo17599j(jVar.f23698c);
            C2023b[] bVarArr = this.f5825i;
            if (j2 == null) {
                j2 = jVar.f23698c.get(0);
            }
            int i6 = i5;
            long j3 = g;
            C4265j jVar2 = jVar;
            bVarArr[i6] = new C2023b(j3, jVar2, j2, aVar.mo17282a(i2, jVar.f23697b, z, list, cVar2, u1Var), 0, jVar.mo17688l());
            i5 = i6 + 1;
        }
    }

    /* renamed from: l */
    private C5804g0.C5805a m8851l(C5735s sVar, List<C4256b> list) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        int length = sVar.length();
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            if (sVar.mo20151k(i2, elapsedRealtime)) {
                i++;
            }
        }
        int f = C4233b.m28548f(list);
        return new C5804g0.C5805a(f, f - this.f5818b.mo17597g(list), length, i);
    }

    /* renamed from: m */
    private long m8852m(long j, long j2) {
        if (!this.f5827k.f23650d) {
            return -9223372036854775807L;
        }
        return Math.max(0, Math.min(m8853n(j), this.f5825i[0].mo7769i(this.f5825i[0].mo7767g(j))) - j2);
    }

    /* renamed from: n */
    private long m8853n(long j) {
        C4257c cVar = this.f5827k;
        long j2 = cVar.f23647a;
        if (j2 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return j - C5953m0.m35071B0(j2 + cVar.mo17624d(this.f5828l).f23683b);
    }

    /* renamed from: o */
    private ArrayList<C4265j> m8854o() {
        List<C4255a> list = this.f5827k.mo17624d(this.f5828l).f23684c;
        ArrayList<C4265j> arrayList = new ArrayList<>();
        for (int i : this.f5819c) {
            arrayList.addAll(list.get(i).f23639c);
        }
        return arrayList;
    }

    /* renamed from: p */
    private long m8855p(C2023b bVar, C4072n nVar, long j, long j2, long j3) {
        if (nVar != null) {
            return nVar.mo17296g();
        }
        return C5953m0.m35154r(bVar.mo7770j(j), j2, j3);
    }

    /* renamed from: s */
    private C2023b m8856s(int i) {
        C2023b bVar = this.f5825i[i];
        C4256b j = this.f5818b.mo17599j(bVar.f5835b.f23698c);
        if (j == null || j.equals(bVar.f5836c)) {
            return bVar;
        }
        C2023b d = bVar.mo7764d(j);
        this.f5825i[i] = d;
        return d;
    }

    /* renamed from: a */
    public void mo7752a() {
        for (C2023b bVar : this.f5825i) {
            C4061g gVar = bVar.f5834a;
            if (gVar != null) {
                gVar.mo17272a();
            }
        }
    }

    /* renamed from: b */
    public void mo7753b() throws IOException {
        IOException iOException = this.f5829m;
        if (iOException == null) {
            this.f5817a.mo7740b();
            return;
        }
        throw iOException;
    }

    /* renamed from: c */
    public long mo7754c(long j, C6229i3 i3Var) {
        long j2 = j;
        for (C2023b bVar : this.f5825i) {
            if (bVar.f5837d != null) {
                long j3 = bVar.mo7770j(j2);
                long k = bVar.mo7771k(j3);
                long h = bVar.mo7768h();
                return i3Var.mo21342a(j, k, (k >= j2 || (h != -1 && j3 >= (bVar.mo7766f() + h) - 1)) ? k : bVar.mo7771k(j3 + 1));
            }
        }
        return j2;
    }

    /* renamed from: d */
    public void mo7745d(C5735s sVar) {
        this.f5826j = sVar;
    }

    /* renamed from: e */
    public void mo7746e(C4257c cVar, int i) {
        try {
            this.f5827k = cVar;
            this.f5828l = i;
            long g = cVar.mo17627g(i);
            ArrayList<C4265j> o = m8854o();
            for (int i2 = 0; i2 < this.f5825i.length; i2++) {
                C2023b[] bVarArr = this.f5825i;
                bVarArr[i2] = bVarArr[i2].mo7762b(g, o.get(this.f5826j.mo20145d(i2)));
            }
        } catch (C1690b e) {
            this.f5829m = e;
        }
    }

    /* renamed from: g */
    public boolean mo7755g(C4060f fVar, boolean z, C5804g0.C5807c cVar, C5804g0 g0Var) {
        C5804g0.C5806b a;
        if (!z) {
            return false;
        }
        C2026e.C2029c cVar2 = this.f5824h;
        if (cVar2 != null && cVar2.mo7788j(fVar)) {
            return true;
        }
        if (!this.f5827k.f23650d && (fVar instanceof C4072n)) {
            IOException iOException = cVar.f28813c;
            if ((iOException instanceof C5794c0) && ((C5794c0) iOException).f28789d == 404) {
                C2023b bVar = this.f5825i[this.f5826j.mo20143b(fVar.f23165d)];
                long h = bVar.mo7768h();
                if (!(h == -1 || h == 0)) {
                    if (((C4072n) fVar).mo17296g() > (bVar.mo7766f() + h) - 1) {
                        this.f5830n = true;
                        return true;
                    }
                }
            }
        }
        C2023b bVar2 = this.f5825i[this.f5826j.mo20143b(fVar.f23165d)];
        C4256b j = this.f5818b.mo17599j(bVar2.f5835b.f23698c);
        if (j != null && !bVar2.f5836c.equals(j)) {
            return true;
        }
        C5804g0.C5805a l = m8851l(this.f5826j, bVar2.f5835b.f23698c);
        if ((!l.mo20333a(2) && !l.mo20333a(1)) || (a = g0Var.mo20329a(l, cVar)) == null || !l.mo20333a(a.f28809a)) {
            return false;
        }
        int i = a.f28809a;
        if (i == 2) {
            C5735s sVar = this.f5826j;
            return sVar.mo20150j(sVar.mo20143b(fVar.f23165d), a.f28810b);
        } else if (i != 1) {
            return false;
        } else {
            this.f5818b.mo17596e(bVar2.f5836c, a.f28810b);
            return true;
        }
    }

    /* renamed from: h */
    public void mo7756h(long j, long j2, List<? extends C4072n> list, C4064h hVar) {
        C4072n nVar;
        long j3;
        int i;
        C4073o[] oVarArr;
        int i2;
        long j4;
        long j5 = j;
        C4064h hVar2 = hVar;
        if (this.f5829m == null) {
            long j6 = j2 - j5;
            long B0 = C5953m0.m35071B0(this.f5827k.f23647a) + C5953m0.m35071B0(this.f5827k.mo17624d(this.f5828l).f23683b) + j2;
            C2026e.C2029c cVar = this.f5824h;
            if (cVar == null || !cVar.mo7786h(B0)) {
                long B02 = C5953m0.m35071B0(C5953m0.m35121a0(this.f5822f));
                long n = m8853n(B02);
                if (list.isEmpty()) {
                    List<? extends C4072n> list2 = list;
                    nVar = null;
                } else {
                    nVar = (C4072n) list.get(list.size() - 1);
                }
                int length = this.f5826j.length();
                C4073o[] oVarArr2 = new C4073o[length];
                int i3 = 0;
                while (i3 < length) {
                    C2023b bVar = this.f5825i[i3];
                    if (bVar.f5837d == null) {
                        oVarArr2[i3] = C4073o.f23214a;
                        i2 = i3;
                        i = length;
                        oVarArr = oVarArr2;
                        j3 = j6;
                        j4 = B02;
                    } else {
                        long e = bVar.mo7765e(B02);
                        long g = bVar.mo7767g(B02);
                        i2 = i3;
                        i = length;
                        oVarArr = oVarArr2;
                        j3 = j6;
                        j4 = B02;
                        long p = m8855p(bVar, nVar, j2, e, g);
                        if (p < e) {
                            oVarArr[i2] = C4073o.f23214a;
                        } else {
                            oVarArr[i2] = new C2024c(m8856s(i2), p, g, n);
                        }
                    }
                    i3 = i2 + 1;
                    List<? extends C4072n> list3 = list;
                    B02 = j4;
                    oVarArr2 = oVarArr;
                    length = i;
                    j6 = j3;
                }
                long j7 = j6;
                long j8 = B02;
                this.f5826j.mo17829h(j, j7, m8852m(j8, j5), list, oVarArr2);
                C2023b s = m8856s(this.f5826j.mo17830i());
                C4061g gVar = s.f5834a;
                if (gVar != null) {
                    C4265j jVar = s.f5835b;
                    C4264i n2 = gVar.mo17275d() == null ? jVar.mo17690n() : null;
                    C4264i m = s.f5837d == null ? jVar.mo17689m() : null;
                    if (!(n2 == null && m == null)) {
                        hVar2.f23171a = mo7760q(s, this.f5821e, this.f5826j.mo20155p(), this.f5826j.mo17831q(), this.f5826j.mo17832s(), n2, m);
                        return;
                    }
                }
                long a = s.f5838e;
                long j9 = -9223372036854775807L;
                int i4 = (a > -9223372036854775807L ? 1 : (a == -9223372036854775807L ? 0 : -1));
                boolean z = i4 != 0;
                if (s.mo7768h() == 0) {
                    hVar2.f23172b = z;
                    return;
                }
                long e2 = s.mo7765e(j8);
                long g2 = s.mo7767g(j8);
                long p2 = m8855p(s, nVar, j2, e2, g2);
                if (p2 < e2) {
                    this.f5829m = new C1690b();
                    return;
                }
                int i5 = (p2 > g2 ? 1 : (p2 == g2 ? 0 : -1));
                if (i5 > 0 || (this.f5830n && i5 >= 0)) {
                    hVar2.f23172b = z;
                } else if (!z || s.mo7771k(p2) < a) {
                    int min = (int) Math.min((long) this.f5823g, (g2 - p2) + 1);
                    if (i4 != 0) {
                        while (min > 1 && s.mo7771k((((long) min) + p2) - 1) >= a) {
                            min--;
                        }
                    }
                    int i6 = min;
                    if (list.isEmpty()) {
                        j9 = j2;
                    }
                    hVar2.f23171a = mo7761r(s, this.f5821e, this.f5820d, this.f5826j.mo20155p(), this.f5826j.mo17831q(), this.f5826j.mo17832s(), p2, i6, j9, n);
                } else {
                    hVar2.f23172b = true;
                }
            }
        }
    }

    /* renamed from: i */
    public boolean mo7757i(long j, C4060f fVar, List<? extends C4072n> list) {
        if (this.f5829m != null) {
            return false;
        }
        return this.f5826j.mo20148g(j, fVar, list);
    }

    /* renamed from: j */
    public int mo7758j(long j, List<? extends C4072n> list) {
        if (this.f5829m != null || this.f5826j.length() < 2) {
            return list.size();
        }
        return this.f5826j.mo20126n(j, list);
    }

    /* renamed from: k */
    public void mo7759k(C4060f fVar) {
        C4197d e;
        if (fVar instanceof C4071m) {
            int b = this.f5826j.mo20143b(((C4071m) fVar).f23165d);
            C2023b bVar = this.f5825i[b];
            if (bVar.f5837d == null && (e = bVar.f5834a.mo17276e()) != null) {
                this.f5825i[b] = bVar.mo7763c(new C4237h(e, bVar.f5835b.f23699d));
            }
        }
        C2026e.C2029c cVar = this.f5824h;
        if (cVar != null) {
            cVar.mo7787i(fVar);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public C4060f mo7760q(C2023b bVar, C5828l lVar, C6272r1 r1Var, int i, Object obj, C4264i iVar, C4264i iVar2) {
        C2023b bVar2 = bVar;
        C4264i iVar3 = iVar;
        C4265j jVar = bVar2.f5835b;
        if (iVar3 != null) {
            C4264i a = iVar3.mo17681a(iVar2, bVar2.f5836c.f23643a);
            if (a != null) {
                iVar3 = a;
            }
        } else {
            iVar3 = iVar2;
        }
        return new C4071m(lVar, C4236g.m28565a(jVar, bVar2.f5836c.f23643a, iVar3, 0), r1Var, i, obj, bVar2.f5834a);
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public C4060f mo7761r(C2023b bVar, C5828l lVar, int i, C6272r1 r1Var, int i2, Object obj, long j, int i3, long j2, long j3) {
        C2023b bVar2 = bVar;
        long j4 = j;
        long j5 = j3;
        C4265j jVar = bVar2.f5835b;
        long k = bVar2.mo7771k(j4);
        C4264i l = bVar2.mo7772l(j4);
        int i4 = 0;
        if (bVar2.f5834a == null) {
            long i5 = bVar2.mo7769i(j4);
            if (!bVar2.mo7773m(j4, j5)) {
                i4 = 8;
            }
            return new C4075p(lVar, C4236g.m28565a(jVar, bVar2.f5836c.f23643a, l, i4), r1Var, i2, obj, k, i5, j, i, r1Var);
        }
        int i6 = 1;
        int i7 = i3;
        int i8 = 1;
        while (i6 < i7) {
            C4264i a = l.mo17681a(bVar2.mo7772l(((long) i6) + j4), bVar2.f5836c.f23643a);
            if (a == null) {
                break;
            }
            i8++;
            i6++;
            l = a;
        }
        long j6 = (((long) i8) + j4) - 1;
        long i9 = bVar2.mo7769i(j6);
        long a2 = bVar.f5838e;
        long j7 = (a2 == -9223372036854775807L || a2 > i9) ? -9223372036854775807L : a2;
        if (!bVar2.mo7773m(j6, j5)) {
            i4 = 8;
        }
        C4061g gVar = bVar2.f5834a;
        return new C4069k(lVar, C4236g.m28565a(jVar, bVar2.f5836c.f23643a, l, i4), r1Var, i2, obj, k, i9, j2, j7, j, i8, -jVar.f23699d, gVar);
    }
}
