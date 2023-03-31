package com.google.android.exoplayer2.source.smoothstreaming;

import android.net.Uri;
import com.google.android.exoplayer2.source.smoothstreaming.C2036b;
import java.io.IOException;
import java.util.List;
import p015b3.C1690b;
import p031d3.C4056b;
import p031d3.C4058e;
import p031d3.C4060f;
import p031d3.C4061g;
import p031d3.C4064h;
import p031d3.C4069k;
import p031d3.C4072n;
import p031d3.C4073o;
import p072j3.C4734a;
import p092m2.C5017g;
import p092m2.C5028o;
import p092m2.C5029p;
import p149u3.C5716a0;
import p149u3.C5735s;
import p155v3.C5804g0;
import p155v3.C5820i0;
import p155v3.C5828l;
import p155v3.C5837p;
import p155v3.C5840p0;
import p161w3.C5917a;
import p161w3.C5940i0;
import p177z1.C6229i3;
import p177z1.C6272r1;

/* renamed from: com.google.android.exoplayer2.source.smoothstreaming.a */
/* compiled from: DefaultSsChunkSource */
public class C2033a implements C2036b {

    /* renamed from: a */
    private final C5820i0 f5922a;

    /* renamed from: b */
    private final int f5923b;

    /* renamed from: c */
    private final C4061g[] f5924c;

    /* renamed from: d */
    private final C5828l f5925d;

    /* renamed from: e */
    private C5735s f5926e;

    /* renamed from: f */
    private C4734a f5927f;

    /* renamed from: g */
    private int f5928g;

    /* renamed from: h */
    private IOException f5929h;

    /* renamed from: com.google.android.exoplayer2.source.smoothstreaming.a$a */
    /* compiled from: DefaultSsChunkSource */
    public static final class C2034a implements C2036b.C2037a {

        /* renamed from: a */
        private final C5828l.C5829a f5930a;

        public C2034a(C5828l.C5829a aVar) {
            this.f5930a = aVar;
        }

        /* renamed from: a */
        public C2036b mo7798a(C5820i0 i0Var, C4734a aVar, int i, C5735s sVar, C5840p0 p0Var) {
            C5828l a = this.f5930a.mo20353a();
            if (p0Var != null) {
                a.mo6818n(p0Var);
            }
            return new C2033a(i0Var, aVar, i, sVar, a);
        }
    }

    /* renamed from: com.google.android.exoplayer2.source.smoothstreaming.a$b */
    /* compiled from: DefaultSsChunkSource */
    private static final class C2035b extends C4056b {

        /* renamed from: e */
        private final C4734a.C4736b f5931e;

        /* renamed from: f */
        private final int f5932f;

        public C2035b(C4734a.C4736b bVar, int i, int i2) {
            super((long) i2, (long) (bVar.f25354k - 1));
            this.f5931e = bVar;
            this.f5932f = i;
        }

        /* renamed from: a */
        public long mo7774a() {
            mo17264c();
            return this.f5931e.mo18399e((int) mo17265d());
        }

        /* renamed from: b */
        public long mo7775b() {
            return mo7774a() + this.f5931e.mo18397c((int) mo17265d());
        }
    }

    public C2033a(C5820i0 i0Var, C4734a aVar, int i, C5735s sVar, C5828l lVar) {
        C4734a aVar2 = aVar;
        int i2 = i;
        C5735s sVar2 = sVar;
        this.f5922a = i0Var;
        this.f5927f = aVar2;
        this.f5923b = i2;
        this.f5926e = sVar2;
        this.f5925d = lVar;
        C4734a.C4736b bVar = aVar2.f25338f[i2];
        this.f5924c = new C4061g[sVar.length()];
        int i3 = 0;
        while (i3 < this.f5924c.length) {
            int d = sVar2.mo20145d(i3);
            C6272r1 r1Var = bVar.f25353j[d];
            C5029p[] pVarArr = r1Var.f30246w != null ? ((C4734a.C4735a) C5917a.m34872e(aVar2.f25337e)).f25343c : null;
            int i4 = bVar.f25344a;
            int i5 = i3;
            C5028o oVar = r7;
            C5028o oVar2 = new C5028o(d, i4, bVar.f25346c, -9223372036854775807L, aVar2.f25339g, r1Var, 0, pVarArr, i4 == 2 ? 4 : 0, (long[]) null, (long[]) null);
            this.f5924c[i5] = new C4058e(new C5017g(3, (C5940i0) null, oVar), bVar.f25344a, r1Var);
            i3 = i5 + 1;
        }
    }

    /* renamed from: l */
    private static C4072n m8957l(C6272r1 r1Var, C5828l lVar, Uri uri, int i, long j, long j2, long j3, int i2, Object obj, C4061g gVar) {
        C5828l lVar2 = lVar;
        long j4 = j2;
        long j5 = j3;
        int i3 = i2;
        Object obj2 = obj;
        C5837p pVar = r0;
        C5837p pVar2 = new C5837p(uri);
        return new C4069k(lVar2, pVar, r1Var, i3, obj2, j, j4, j5, -9223372036854775807L, (long) i, 1, j, gVar);
    }

    /* renamed from: m */
    private long m8958m(long j) {
        C4734a aVar = this.f5927f;
        if (!aVar.f25336d) {
            return -9223372036854775807L;
        }
        C4734a.C4736b bVar = aVar.f25338f[this.f5923b];
        int i = bVar.f25354k - 1;
        return (bVar.mo18399e(i) + bVar.mo18397c(i)) - j;
    }

    /* renamed from: a */
    public void mo7752a() {
        for (C4061g a : this.f5924c) {
            a.mo17272a();
        }
    }

    /* renamed from: b */
    public void mo7753b() throws IOException {
        IOException iOException = this.f5929h;
        if (iOException == null) {
            this.f5922a.mo7740b();
            return;
        }
        throw iOException;
    }

    /* renamed from: c */
    public long mo7754c(long j, C6229i3 i3Var) {
        C4734a.C4736b bVar = this.f5927f.f25338f[this.f5923b];
        int d = bVar.mo18398d(j);
        long e = bVar.mo18399e(d);
        return i3Var.mo21342a(j, e, (e >= j || d >= bVar.f25354k + -1) ? e : bVar.mo18399e(d + 1));
    }

    /* renamed from: d */
    public void mo7796d(C5735s sVar) {
        this.f5926e = sVar;
    }

    /* renamed from: f */
    public void mo7797f(C4734a aVar) {
        C4734a.C4736b[] bVarArr = this.f5927f.f25338f;
        int i = this.f5923b;
        C4734a.C4736b bVar = bVarArr[i];
        int i2 = bVar.f25354k;
        C4734a.C4736b bVar2 = aVar.f25338f[i];
        if (i2 == 0 || bVar2.f25354k == 0) {
            this.f5928g += i2;
        } else {
            int i3 = i2 - 1;
            long e = bVar.mo18399e(i3) + bVar.mo18397c(i3);
            long e2 = bVar2.mo18399e(0);
            if (e <= e2) {
                this.f5928g += i2;
            } else {
                this.f5928g += bVar.mo18398d(e2);
            }
        }
        this.f5927f = aVar;
    }

    /* renamed from: g */
    public boolean mo7755g(C4060f fVar, boolean z, C5804g0.C5807c cVar, C5804g0 g0Var) {
        C5804g0.C5806b a = g0Var.mo20329a(C5716a0.m34079c(this.f5926e), cVar);
        if (z && a != null && a.f28809a == 2) {
            C5735s sVar = this.f5926e;
            if (sVar.mo20150j(sVar.mo20143b(fVar.f23165d), a.f28810b)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: h */
    public final void mo7756h(long j, long j2, List<? extends C4072n> list, C4064h hVar) {
        int i;
        long j3 = j2;
        C4064h hVar2 = hVar;
        if (this.f5929h == null) {
            C4734a aVar = this.f5927f;
            C4734a.C4736b bVar = aVar.f25338f[this.f5923b];
            if (bVar.f25354k == 0) {
                hVar2.f23172b = !aVar.f25336d;
                return;
            }
            if (list.isEmpty()) {
                i = bVar.mo18398d(j3);
                List<? extends C4072n> list2 = list;
            } else {
                i = (int) (((C4072n) list.get(list.size() - 1)).mo17296g() - ((long) this.f5928g));
                if (i < 0) {
                    this.f5929h = new C1690b();
                    return;
                }
            }
            if (i >= bVar.f25354k) {
                hVar2.f23172b = !this.f5927f.f25336d;
                return;
            }
            long j4 = j3 - j;
            long m = m8958m(j);
            int length = this.f5926e.length();
            C4073o[] oVarArr = new C4073o[length];
            for (int i2 = 0; i2 < length; i2++) {
                oVarArr[i2] = new C2035b(bVar, this.f5926e.mo20145d(i2), i);
            }
            this.f5926e.mo17829h(j, j4, m, list, oVarArr);
            long e = bVar.mo18399e(i);
            long c = e + bVar.mo18397c(i);
            if (!list.isEmpty()) {
                j3 = -9223372036854775807L;
            }
            long j5 = j3;
            int i3 = i + this.f5928g;
            int i4 = this.f5926e.mo17830i();
            C4061g gVar = this.f5924c[i4];
            Uri a = bVar.mo18395a(this.f5926e.mo20145d(i4), i);
            hVar2.f23171a = m8957l(this.f5926e.mo20155p(), this.f5925d, a, i3, e, c, j5, this.f5926e.mo17831q(), this.f5926e.mo17832s(), gVar);
        }
    }

    /* renamed from: i */
    public boolean mo7757i(long j, C4060f fVar, List<? extends C4072n> list) {
        if (this.f5929h != null) {
            return false;
        }
        return this.f5926e.mo20148g(j, fVar, list);
    }

    /* renamed from: j */
    public int mo7758j(long j, List<? extends C4072n> list) {
        if (this.f5929h != null || this.f5926e.length() < 2) {
            return list.size();
        }
        return this.f5926e.mo20126n(j, list);
    }

    /* renamed from: k */
    public void mo7759k(C4060f fVar) {
    }
}
