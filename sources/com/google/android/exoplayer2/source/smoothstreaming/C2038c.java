package com.google.android.exoplayer2.source.smoothstreaming;

import com.google.android.exoplayer2.source.smoothstreaming.C2036b;
import java.io.IOException;
import java.util.ArrayList;
import p015b3.C1700e0;
import p015b3.C1712i;
import p015b3.C1749q0;
import p015b3.C1752r0;
import p015b3.C1765u;
import p015b3.C1776x0;
import p015b3.C1780z0;
import p030d2.C4048w;
import p030d2.C4052y;
import p031d3.C4065i;
import p072j3.C4734a;
import p149u3.C5735s;
import p155v3.C5789b;
import p155v3.C5804g0;
import p155v3.C5820i0;
import p155v3.C5840p0;
import p177z1.C6229i3;
import p177z1.C6272r1;

/* renamed from: com.google.android.exoplayer2.source.smoothstreaming.c */
/* compiled from: SsMediaPeriod */
final class C2038c implements C1765u, C1752r0.C1753a<C4065i<C2036b>> {

    /* renamed from: a */
    private final C2036b.C2037a f5933a;

    /* renamed from: b */
    private final C5840p0 f5934b;

    /* renamed from: c */
    private final C5820i0 f5935c;

    /* renamed from: d */
    private final C4052y f5936d;

    /* renamed from: e */
    private final C4048w.C4049a f5937e;

    /* renamed from: f */
    private final C5804g0 f5938f;

    /* renamed from: g */
    private final C1700e0.C1701a f5939g;

    /* renamed from: h */
    private final C5789b f5940h;

    /* renamed from: i */
    private final C1780z0 f5941i;

    /* renamed from: r */
    private final C1712i f5942r;

    /* renamed from: s */
    private C1765u.C1766a f5943s;

    /* renamed from: t */
    private C4734a f5944t;

    /* renamed from: u */
    private C4065i<C2036b>[] f5945u;

    /* renamed from: v */
    private C1752r0 f5946v;

    public C2038c(C4734a aVar, C2036b.C2037a aVar2, C5840p0 p0Var, C1712i iVar, C4052y yVar, C4048w.C4049a aVar3, C5804g0 g0Var, C1700e0.C1701a aVar4, C5820i0 i0Var, C5789b bVar) {
        this.f5944t = aVar;
        this.f5933a = aVar2;
        this.f5934b = p0Var;
        this.f5935c = i0Var;
        this.f5936d = yVar;
        this.f5937e = aVar3;
        this.f5938f = g0Var;
        this.f5939g = aVar4;
        this.f5940h = bVar;
        this.f5942r = iVar;
        this.f5941i = m8976j(aVar, yVar);
        C4065i<C2036b>[] n = m8977n(0);
        this.f5945u = n;
        this.f5946v = iVar.mo6743a(n);
    }

    /* renamed from: a */
    private C4065i<C2036b> m8975a(C5735s sVar, long j) {
        int c = this.f5941i.mo6904c(sVar.mo20142a());
        return new C4065i(this.f5944t.f25338f[c].f25344a, (int[]) null, (C6272r1[]) null, this.f5933a.mo7798a(this.f5935c, this.f5944t, c, sVar, this.f5934b), this, this.f5940h, j, this.f5936d, this.f5937e, this.f5938f, this.f5939g);
    }

    /* renamed from: j */
    private static C1780z0 m8976j(C4734a aVar, C4052y yVar) {
        C1776x0[] x0VarArr = new C1776x0[aVar.f25338f.length];
        int i = 0;
        while (true) {
            C4734a.C4736b[] bVarArr = aVar.f25338f;
            if (i >= bVarArr.length) {
                return new C1780z0(x0VarArr);
            }
            C6272r1[] r1VarArr = bVarArr[i].f25353j;
            C6272r1[] r1VarArr2 = new C6272r1[r1VarArr.length];
            for (int i2 = 0; i2 < r1VarArr.length; i2++) {
                C6272r1 r1Var = r1VarArr[i2];
                r1VarArr2[i2] = r1Var.mo21484c(yVar.mo17212e(r1Var));
            }
            x0VarArr[i] = new C1776x0(Integer.toString(i), r1VarArr2);
            i++;
        }
    }

    /* renamed from: n */
    private static C4065i<C2036b>[] m8977n(int i) {
        return new C4065i[i];
    }

    /* renamed from: c */
    public long mo6681c(long j, C6229i3 i3Var) {
        for (C4065i<C2036b> iVar : this.f5945u) {
            if (iVar.f23178a == 2) {
                return iVar.mo17293c(j, i3Var);
            }
        }
        return j;
    }

    /* renamed from: d */
    public long mo6682d() {
        return this.f5946v.mo6682d();
    }

    /* renamed from: e */
    public boolean mo6683e(long j) {
        return this.f5946v.mo6683e(j);
    }

    /* renamed from: g */
    public long mo6685g() {
        return this.f5946v.mo6685g();
    }

    /* renamed from: h */
    public void mo6686h(long j) {
        this.f5946v.mo6686h(j);
    }

    /* renamed from: i */
    public long mo6687i(C5735s[] sVarArr, boolean[] zArr, C1749q0[] q0VarArr, boolean[] zArr2, long j) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < sVarArr.length; i++) {
            if (q0VarArr[i] != null) {
                C4065i iVar = q0VarArr[i];
                if (sVarArr[i] == null || !zArr[i]) {
                    iVar.mo17289N();
                    q0VarArr[i] = null;
                } else {
                    ((C2036b) iVar.mo17284C()).mo7796d(sVarArr[i]);
                    arrayList.add(iVar);
                }
            }
            if (q0VarArr[i] == null && sVarArr[i] != null) {
                C4065i<C2036b> a = m8975a(sVarArr[i], j);
                arrayList.add(a);
                q0VarArr[i] = a;
                zArr2[i] = true;
            }
        }
        C4065i<C2036b>[] n = m8977n(arrayList.size());
        this.f5945u = n;
        arrayList.toArray(n);
        this.f5946v = this.f5942r.mo6743a(this.f5945u);
        return j;
    }

    public boolean isLoading() {
        return this.f5946v.isLoading();
    }

    /* renamed from: k */
    public void mo6690k() throws IOException {
        this.f5935c.mo7740b();
    }

    /* renamed from: m */
    public long mo6691m(long j) {
        for (C4065i<C2036b> Q : this.f5945u) {
            Q.mo17291Q(j);
        }
        return j;
    }

    /* renamed from: o */
    public void mo6684f(C4065i<C2036b> iVar) {
        this.f5943s.mo6684f(this);
    }

    /* renamed from: p */
    public long mo6694p() {
        return -9223372036854775807L;
    }

    /* renamed from: q */
    public void mo7800q() {
        for (C4065i<C2036b> N : this.f5945u) {
            N.mo17289N();
        }
        this.f5943s = null;
    }

    /* renamed from: r */
    public void mo6695r(C1765u.C1766a aVar, long j) {
        this.f5943s = aVar;
        aVar.mo6680b(this);
    }

    /* renamed from: s */
    public C1780z0 mo6696s() {
        return this.f5941i;
    }

    /* renamed from: t */
    public void mo6697t(long j, boolean z) {
        for (C4065i<C2036b> t : this.f5945u) {
            t.mo17294t(j, z);
        }
    }

    /* renamed from: u */
    public void mo7801u(C4734a aVar) {
        this.f5944t = aVar;
        for (C4065i<C2036b> C : this.f5945u) {
            C.mo17284C().mo7797f(aVar);
        }
        this.f5943s.mo6684f(this);
    }
}
