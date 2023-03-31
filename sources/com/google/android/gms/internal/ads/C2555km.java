package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Stack;

/* renamed from: com.google.android.gms.internal.ads.km */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class C2555km implements C2961vk, C2293dl {

    /* renamed from: p */
    public static final C3072yk f12146p = new C2481im();

    /* renamed from: q */
    private static final int f12147q = C2893tq.m21176g("qt  ");

    /* renamed from: a */
    private final C2633mq f12148a = new C2633mq(C2559kq.f12213a);

    /* renamed from: b */
    private final C2633mq f12149b = new C2633mq(4);

    /* renamed from: c */
    private final C2633mq f12150c = new C2633mq(16);

    /* renamed from: d */
    private final Stack f12151d = new Stack();

    /* renamed from: e */
    private int f12152e;

    /* renamed from: f */
    private int f12153f;

    /* renamed from: g */
    private long f12154g;

    /* renamed from: h */
    private int f12155h;

    /* renamed from: i */
    private C2633mq f12156i;

    /* renamed from: j */
    private int f12157j;

    /* renamed from: k */
    private int f12158k;

    /* renamed from: l */
    private C3035xk f12159l;

    /* renamed from: m */
    private C2518jm[] f12160m;

    /* renamed from: n */
    private long f12161n;

    /* renamed from: o */
    private boolean f12162o;

    /* renamed from: g */
    private final void m15458g() {
        this.f12152e = 0;
        this.f12155h = 0;
    }

    /* renamed from: h */
    private final void m15459h(long j) throws C2885ti {
        C2407gn gnVar;
        C2407gn gnVar2;
        C2182al alVar;
        C2629mm a;
        while (!this.f12151d.isEmpty() && ((C2814rl) this.f12151d.peek()).f16995P0 == j) {
            C2814rl rlVar = (C2814rl) this.f12151d.pop();
            if (rlVar.f18129a == C2888tl.f18041C) {
                ArrayList arrayList = new ArrayList();
                C2182al alVar2 = new C2182al();
                C2851sl e = rlVar.mo13837e(C2888tl.f18038A0);
                if (e != null) {
                    gnVar = C2220bm.m10476c(e, this.f12162o);
                    if (gnVar != null) {
                        alVar2.mo8427b(gnVar);
                    }
                } else {
                    gnVar = null;
                }
                long j2 = -9223372036854775807L;
                long j3 = Long.MAX_VALUE;
                int i = 0;
                while (i < rlVar.f16997R0.size()) {
                    C2814rl rlVar2 = (C2814rl) rlVar.f16997R0.get(i);
                    if (rlVar2.f18129a == C2888tl.f18045E && (a = C2220bm.m10474a(rlVar2, rlVar.mo13837e(C2888tl.f18043D), -9223372036854775807L, (C2813rk) null, this.f12162o)) != null) {
                        C2741pm b = C2220bm.m10475b(a, rlVar2.mo13836d(C2888tl.f18047F).mo13836d(C2888tl.f18049G).mo13836d(C2888tl.f18051H), alVar2);
                        if (b.f15908a != 0) {
                            C2518jm jmVar = new C2518jm(a, b, this.f12159l.mo15103g(i, a.f13396b));
                            C2774qi e2 = a.f13400f.mo13543e(b.f15911d + 30);
                            if (a.f13396b == 1) {
                                if (alVar2.mo8426a()) {
                                    e2 = e2.mo13541d(alVar2.f6666a, alVar2.f6667b);
                                }
                                if (gnVar != null) {
                                    e2 = e2.mo13545f(gnVar);
                                }
                            }
                            jmVar.f11701c.mo10172b(e2);
                            alVar = alVar2;
                            gnVar2 = gnVar;
                            long max = Math.max(j2, a.f13399e);
                            arrayList.add(jmVar);
                            long j4 = b.f15909b[0];
                            if (j4 < j3) {
                                j2 = max;
                                j3 = j4;
                            } else {
                                j2 = max;
                            }
                            i++;
                            alVar2 = alVar;
                            gnVar = gnVar2;
                        }
                    }
                    alVar = alVar2;
                    gnVar2 = gnVar;
                    i++;
                    alVar2 = alVar;
                    gnVar = gnVar2;
                }
                this.f12161n = j2;
                this.f12160m = (C2518jm[]) arrayList.toArray(new C2518jm[arrayList.size()]);
                this.f12159l.mo15102d();
                this.f12159l.mo15101a(this);
                this.f12151d.clear();
                this.f12152e = 2;
            } else if (!this.f12151d.isEmpty()) {
                ((C2814rl) this.f12151d.peek()).mo13838f(rlVar);
            }
        }
        if (this.f12152e != 2) {
            m15458g();
        }
    }

    /* renamed from: a */
    public final int mo10567a(C2924uk ukVar, C2219bl blVar) throws IOException, InterruptedException {
        C2518jm[] jmVarArr;
        boolean z;
        boolean z2;
        C2924uk ukVar2 = ukVar;
        C2219bl blVar2 = blVar;
        while (true) {
            int i = this.f12152e;
            if (i == 0) {
                if (this.f12155h == 0) {
                    if (!ukVar2.mo14528h(this.f12150c.f13448a, 0, 8, true)) {
                        return -1;
                    }
                    this.f12155h = 8;
                    this.f12150c.mo12411v(0);
                    this.f12154g = this.f12150c.mo12402m();
                    this.f12153f = this.f12150c.mo12394e();
                }
                if (this.f12154g == 1) {
                    ukVar2.mo14528h(this.f12150c.f13448a, 8, 8, false);
                    this.f12155h += 8;
                    this.f12154g = this.f12150c.mo12403n();
                }
                int i2 = this.f12153f;
                if (i2 == C2888tl.f18041C || i2 == C2888tl.f18045E || i2 == C2888tl.f18047F || i2 == C2888tl.f18049G || i2 == C2888tl.f18051H || i2 == C2888tl.f18068Q) {
                    long d = (ukVar.mo14524d() + this.f12154g) - ((long) this.f12155h);
                    this.f12151d.add(new C2814rl(this.f12153f, d));
                    if (this.f12154g == ((long) this.f12155h)) {
                        m15459h(d);
                    } else {
                        m15458g();
                    }
                } else {
                    if (i2 == C2888tl.f18070S || i2 == C2888tl.f18043D || i2 == C2888tl.f18071T || i2 == C2888tl.f18072U || i2 == C2888tl.f18102m0 || i2 == C2888tl.f18104n0 || i2 == C2888tl.f18106o0 || i2 == C2888tl.f18069R || i2 == C2888tl.f18108p0 || i2 == C2888tl.f18110q0 || i2 == C2888tl.f18112r0 || i2 == C2888tl.f18114s0 || i2 == C2888tl.f18116t0 || i2 == C2888tl.f18067P || i2 == C2888tl.f18079b || i2 == C2888tl.f18038A0) {
                        C2335eq.m12245e(this.f12155h == 8);
                        C2335eq.m12245e(this.f12154g <= 2147483647L);
                        C2633mq mqVar = new C2633mq((int) this.f12154g);
                        this.f12156i = mqVar;
                        System.arraycopy(this.f12150c.f13448a, 0, mqVar.f13448a, 0, 8);
                    } else {
                        this.f12156i = null;
                    }
                    this.f12152e = 1;
                }
            } else if (i != 1) {
                long j = Long.MAX_VALUE;
                int i3 = 0;
                int i4 = -1;
                while (true) {
                    jmVarArr = this.f12160m;
                    if (i3 >= jmVarArr.length) {
                        break;
                    }
                    C2518jm jmVar = jmVarArr[i3];
                    int i5 = jmVar.f11702d;
                    C2741pm pmVar = jmVar.f11700b;
                    if (i5 != pmVar.f15908a) {
                        long j2 = pmVar.f15909b[i5];
                        if (j2 < j) {
                            i4 = i3;
                            j = j2;
                        }
                    }
                    i3++;
                }
                if (i4 == -1) {
                    return -1;
                }
                C2518jm jmVar2 = jmVarArr[i4];
                C2368fl flVar = jmVar2.f11701c;
                int i6 = jmVar2.f11702d;
                C2741pm pmVar2 = jmVar2.f11700b;
                long j3 = pmVar2.f15909b[i6];
                int i7 = pmVar2.f15910c[i6];
                if (jmVar2.f11699a.f13401g == 1) {
                    j3 += 8;
                    i7 -= 8;
                }
                long d2 = (j3 - ukVar.mo14524d()) + ((long) this.f12157j);
                if (d2 < 0 || d2 >= 262144) {
                    blVar2.f7339a = j3;
                    return 1;
                }
                int i8 = (int) d2;
                boolean z3 = false;
                ukVar2.mo14529i(i8, false);
                int i9 = jmVar2.f11699a.f13405k;
                if (i9 == 0) {
                    while (true) {
                        int i10 = this.f12157j;
                        if (i10 >= i7) {
                            break;
                        }
                        int a = flVar.mo10171a(ukVar2, i7 - i10, false);
                        this.f12157j += a;
                        this.f12158k -= a;
                    }
                } else {
                    byte[] bArr = this.f12149b.f13448a;
                    bArr[0] = 0;
                    bArr[1] = 0;
                    bArr[2] = 0;
                    int i11 = 4 - i9;
                    while (this.f12157j < i7) {
                        int i12 = this.f12158k;
                        if (i12 == 0) {
                            ukVar2.mo14528h(this.f12149b.f13448a, i11, i9, z3);
                            this.f12149b.mo12411v(z3 ? 1 : 0);
                            this.f12158k = this.f12149b.mo12398i();
                            this.f12148a.mo12411v(z3);
                            flVar.mo10174d(this.f12148a, 4);
                            this.f12157j += 4;
                            i7 += i11;
                        } else {
                            int a2 = flVar.mo10171a(ukVar2, i12, z3);
                            this.f12157j += a2;
                            this.f12158k -= a2;
                            z3 = false;
                        }
                    }
                }
                int i13 = i7;
                C2741pm pmVar3 = jmVar2.f11700b;
                flVar.mo10173c(pmVar3.f15912e[i6], pmVar3.f15913f[i6], i13, 0, (C2330el) null);
                jmVar2.f11702d++;
                this.f12157j = 0;
                this.f12158k = 0;
                return 0;
            } else {
                long j4 = this.f12154g;
                int i14 = this.f12155h;
                long j5 = j4 - ((long) i14);
                long d3 = ukVar.mo14524d() + j5;
                C2633mq mqVar2 = this.f12156i;
                if (mqVar2 != null) {
                    ukVar2.mo14528h(mqVar2.f13448a, i14, (int) j5, false);
                    if (this.f12153f == C2888tl.f18079b) {
                        C2633mq mqVar3 = this.f12156i;
                        mqVar3.mo12411v(8);
                        if (mqVar3.mo12394e() == f12147q) {
                            z2 = true;
                        } else {
                            mqVar3.mo12412w(4);
                            while (true) {
                                if (mqVar3.mo12390a() > 0) {
                                    if (mqVar3.mo12394e() == f12147q) {
                                        break;
                                    }
                                } else {
                                    z2 = false;
                                    break;
                                }
                            }
                            z2 = true;
                        }
                        this.f12162o = z2;
                    } else if (!this.f12151d.isEmpty()) {
                        ((C2814rl) this.f12151d.peek()).mo13839g(new C2851sl(this.f12153f, this.f12156i));
                    }
                } else if (j5 < 262144) {
                    ukVar2.mo14529i((int) j5, false);
                } else {
                    blVar2.f7339a = ukVar.mo14524d() + j5;
                    z = true;
                    m15459h(d3);
                    if (z && this.f12152e != 2) {
                        return 1;
                    }
                }
                z = false;
                m15459h(d3);
                return 1;
            }
        }
    }

    /* renamed from: b */
    public final boolean mo10568b(C2924uk ukVar) throws IOException, InterruptedException {
        return C2592lm.m16069b(ukVar);
    }

    /* renamed from: c */
    public final long mo9204c(long j) {
        long j2 = Long.MAX_VALUE;
        for (C2518jm jmVar : this.f12160m) {
            C2741pm pmVar = jmVar.f11700b;
            int a = pmVar.mo13302a(j);
            if (a == -1) {
                a = pmVar.mo13303b(j);
            }
            long j3 = pmVar.f15909b[a];
            if (j3 < j2) {
                j2 = j3;
            }
        }
        return j2;
    }

    /* renamed from: d */
    public final void mo10569d(long j, long j2) {
        this.f12151d.clear();
        this.f12155h = 0;
        this.f12157j = 0;
        this.f12158k = 0;
        if (j == 0) {
            m15458g();
            return;
        }
        C2518jm[] jmVarArr = this.f12160m;
        if (jmVarArr != null) {
            for (C2518jm jmVar : jmVarArr) {
                C2741pm pmVar = jmVar.f11700b;
                int a = pmVar.mo13302a(j2);
                if (a == -1) {
                    a = pmVar.mo13303b(j2);
                }
                jmVar.f11702d = a;
            }
        }
    }

    /* renamed from: e */
    public final boolean mo9205e() {
        return true;
    }

    /* renamed from: f */
    public final void mo10570f(C3035xk xkVar) {
        this.f12159l = xkVar;
    }

    public final long zza() {
        return this.f12161n;
    }
}
