package p368u9;

import p212d9.C9924p;

/* renamed from: u9.h */
/* compiled from: DetectionResultRowIndicatorColumn */
final class C12719h extends C12718g {

    /* renamed from: c */
    private final boolean f46517c;

    C12719h(C12712c cVar, boolean z) {
        super(cVar);
        this.f46517c = z;
    }

    /* renamed from: h */
    private void m60313h(C12710a aVar) {
        C12712c a = mo37616a();
        C9924p i = this.f46517c ? a.mo37594i() : a.mo37595j();
        C9924p c = this.f46517c ? a.mo37588c() : a.mo37589d();
        int e = mo37620e((int) c.mo32481d());
        C12713d[] d = mo37619d();
        int i2 = -1;
        int i3 = 0;
        int i4 = 1;
        for (int e2 = mo37620e((int) i.mo32481d()); e2 < e; e2++) {
            if (d[e2] != null) {
                C12713d dVar = d[e2];
                dVar.mo37605j();
                int c2 = dVar.mo37598c() - i2;
                if (c2 == 0) {
                    i3++;
                } else {
                    if (c2 == 1) {
                        i4 = Math.max(i4, i3);
                        i2 = dVar.mo37598c();
                    } else if (dVar.mo37598c() >= aVar.mo37582c()) {
                        d[e2] = null;
                    } else {
                        i2 = dVar.mo37598c();
                    }
                    i3 = 1;
                }
            }
        }
    }

    /* renamed from: l */
    private void m60314l(C12713d[] dVarArr, C12710a aVar) {
        for (int i = 0; i < dVarArr.length; i++) {
            C12713d dVar = dVarArr[i];
            if (dVarArr[i] != null) {
                int e = dVar.mo37600e() % 30;
                int c = dVar.mo37598c();
                if (c > aVar.mo37582c()) {
                    dVarArr[i] = null;
                } else {
                    if (!this.f46517c) {
                        c += 2;
                    }
                    int i2 = c % 3;
                    if (i2 != 0) {
                        if (i2 != 1) {
                            if (i2 == 2 && e + 1 != aVar.mo37580a()) {
                                dVarArr[i] = null;
                            }
                        } else if (e / 3 != aVar.mo37581b() || e % 3 != aVar.mo37583d()) {
                            dVarArr[i] = null;
                        }
                    } else if ((e * 3) + 1 != aVar.mo37584e()) {
                        dVarArr[i] = null;
                    }
                }
            }
        }
    }

    /* renamed from: m */
    private void m60315m() {
        for (C12713d dVar : mo37619d()) {
            if (dVar != null) {
                dVar.mo37605j();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public void mo37623g(C12710a aVar) {
        C12713d[] d = mo37619d();
        m60315m();
        m60314l(d, aVar);
        C12712c a = mo37616a();
        C9924p i = this.f46517c ? a.mo37594i() : a.mo37595j();
        C9924p c = this.f46517c ? a.mo37588c() : a.mo37589d();
        int e = mo37620e((int) i.mo32481d());
        int e2 = mo37620e((int) c.mo32481d());
        int i2 = -1;
        int i3 = 0;
        int i4 = 1;
        while (e < e2) {
            if (d[e] != null) {
                C12713d dVar = d[e];
                int c2 = dVar.mo37598c() - i2;
                if (c2 == 0) {
                    i3++;
                } else {
                    if (c2 == 1) {
                        i4 = Math.max(i4, i3);
                        i2 = dVar.mo37598c();
                    } else if (c2 < 0 || dVar.mo37598c() >= aVar.mo37582c() || c2 > e) {
                        d[e] = null;
                    } else {
                        if (i4 > 2) {
                            c2 *= i4 - 2;
                        }
                        boolean z = c2 >= e;
                        for (int i5 = 1; i5 <= c2 && !z; i5++) {
                            z = d[e - i5] != null;
                        }
                        if (z) {
                            d[e] = null;
                        } else {
                            i2 = dVar.mo37598c();
                        }
                    }
                    i3 = 1;
                }
            }
            e++;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public C12710a mo37624i() {
        C12713d[] d = mo37619d();
        C12711b bVar = new C12711b();
        C12711b bVar2 = new C12711b();
        C12711b bVar3 = new C12711b();
        C12711b bVar4 = new C12711b();
        for (C12713d dVar : d) {
            if (dVar != null) {
                dVar.mo37605j();
                int e = dVar.mo37600e() % 30;
                int c = dVar.mo37598c();
                if (!this.f46517c) {
                    c += 2;
                }
                int i = c % 3;
                if (i == 0) {
                    bVar2.mo37586b((e * 3) + 1);
                } else if (i == 1) {
                    bVar4.mo37586b(e / 3);
                    bVar3.mo37586b(e % 3);
                } else if (i == 2) {
                    bVar.mo37586b(e + 1);
                }
            }
        }
        if (bVar.mo37585a().length == 0 || bVar2.mo37585a().length == 0 || bVar3.mo37585a().length == 0 || bVar4.mo37585a().length == 0 || bVar.mo37585a()[0] <= 0 || bVar2.mo37585a()[0] + bVar3.mo37585a()[0] < 3 || bVar2.mo37585a()[0] + bVar3.mo37585a()[0] > 90) {
            return null;
        }
        C12710a aVar = new C12710a(bVar.mo37585a()[0], bVar2.mo37585a()[0], bVar3.mo37585a()[0], bVar4.mo37585a()[0]);
        m60314l(d, aVar);
        return aVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public int[] mo37625j() {
        int c;
        C12710a i = mo37624i();
        if (i == null) {
            return null;
        }
        m60313h(i);
        int c2 = i.mo37582c();
        int[] iArr = new int[c2];
        for (C12713d dVar : mo37619d()) {
            if (dVar != null && (c = dVar.mo37598c()) < c2) {
                iArr[c] = iArr[c] + 1;
            }
        }
        return iArr;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public boolean mo37626k() {
        return this.f46517c;
    }

    public String toString() {
        return "IsLeft: " + this.f46517c + 10 + super.toString();
    }
}
