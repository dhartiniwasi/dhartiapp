package p368u9;

import p212d9.C9918j;
import p212d9.C9924p;
import p248h9.C10476b;

/* renamed from: u9.c */
/* compiled from: BoundingBox */
final class C12712c {

    /* renamed from: a */
    private C10476b f46485a;

    /* renamed from: b */
    private C9924p f46486b;

    /* renamed from: c */
    private C9924p f46487c;

    /* renamed from: d */
    private C9924p f46488d;

    /* renamed from: e */
    private C9924p f46489e;

    /* renamed from: f */
    private int f46490f;

    /* renamed from: g */
    private int f46491g;

    /* renamed from: h */
    private int f46492h;

    /* renamed from: i */
    private int f46493i;

    C12712c(C10476b bVar, C9924p pVar, C9924p pVar2, C9924p pVar3, C9924p pVar4) throws C9918j {
        if (!(pVar == null && pVar3 == null) && (!(pVar2 == null && pVar4 == null) && ((pVar == null || pVar2 != null) && (pVar3 == null || pVar4 != null)))) {
            m60262k(bVar, pVar, pVar2, pVar3, pVar4);
            return;
        }
        throw C9918j.m50862a();
    }

    /* renamed from: b */
    private void m60261b() {
        if (this.f46486b == null) {
            this.f46486b = new C9924p(0.0f, this.f46488d.mo32481d());
            this.f46487c = new C9924p(0.0f, this.f46489e.mo32481d());
        } else if (this.f46488d == null) {
            this.f46488d = new C9924p((float) (this.f46485a.mo33578j() - 1), this.f46486b.mo32481d());
            this.f46489e = new C9924p((float) (this.f46485a.mo33578j() - 1), this.f46487c.mo32481d());
        }
        this.f46490f = (int) Math.min(this.f46486b.mo32480c(), this.f46487c.mo32480c());
        this.f46491g = (int) Math.max(this.f46488d.mo32480c(), this.f46489e.mo32480c());
        this.f46492h = (int) Math.min(this.f46486b.mo32481d(), this.f46488d.mo32481d());
        this.f46493i = (int) Math.max(this.f46487c.mo32481d(), this.f46489e.mo32481d());
    }

    /* renamed from: k */
    private void m60262k(C10476b bVar, C9924p pVar, C9924p pVar2, C9924p pVar3, C9924p pVar4) {
        this.f46485a = bVar;
        this.f46486b = pVar;
        this.f46487c = pVar2;
        this.f46488d = pVar3;
        this.f46489e = pVar4;
        m60261b();
    }

    /* renamed from: l */
    static C12712c m60263l(C12712c cVar, C12712c cVar2) throws C9918j {
        if (cVar == null) {
            return cVar2;
        }
        return cVar2 == null ? cVar : new C12712c(cVar.f46485a, cVar.f46486b, cVar.f46487c, cVar2.f46488d, cVar2.f46489e);
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x002d  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x005b  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public p368u9.C12712c mo37587a(int r13, int r14, boolean r15) throws p212d9.C9918j {
        /*
            r12 = this;
            d9.p r0 = r12.f46486b
            d9.p r1 = r12.f46487c
            d9.p r2 = r12.f46488d
            d9.p r3 = r12.f46489e
            if (r13 <= 0) goto L_0x0029
            if (r15 == 0) goto L_0x000e
            r4 = r0
            goto L_0x000f
        L_0x000e:
            r4 = r2
        L_0x000f:
            float r5 = r4.mo32481d()
            int r5 = (int) r5
            int r5 = r5 - r13
            if (r5 >= 0) goto L_0x0018
            r5 = 0
        L_0x0018:
            d9.p r13 = new d9.p
            float r4 = r4.mo32480c()
            float r5 = (float) r5
            r13.<init>(r4, r5)
            if (r15 == 0) goto L_0x0026
            r8 = r13
            goto L_0x002a
        L_0x0026:
            r10 = r13
            r8 = r0
            goto L_0x002b
        L_0x0029:
            r8 = r0
        L_0x002a:
            r10 = r2
        L_0x002b:
            if (r14 <= 0) goto L_0x005b
            if (r15 == 0) goto L_0x0032
            d9.p r13 = r12.f46487c
            goto L_0x0034
        L_0x0032:
            d9.p r13 = r12.f46489e
        L_0x0034:
            float r0 = r13.mo32481d()
            int r0 = (int) r0
            int r0 = r0 + r14
            h9.b r14 = r12.f46485a
            int r14 = r14.mo33574g()
            if (r0 < r14) goto L_0x004a
            h9.b r14 = r12.f46485a
            int r14 = r14.mo33574g()
            int r0 = r14 + -1
        L_0x004a:
            d9.p r14 = new d9.p
            float r13 = r13.mo32480c()
            float r0 = (float) r0
            r14.<init>(r13, r0)
            if (r15 == 0) goto L_0x0058
            r9 = r14
            goto L_0x005c
        L_0x0058:
            r11 = r14
            r9 = r1
            goto L_0x005d
        L_0x005b:
            r9 = r1
        L_0x005c:
            r11 = r3
        L_0x005d:
            r12.m60261b()
            u9.c r13 = new u9.c
            h9.b r7 = r12.f46485a
            r6 = r13
            r6.<init>(r7, r8, r9, r10, r11)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: p368u9.C12712c.mo37587a(int, int, boolean):u9.c");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public C9924p mo37588c() {
        return this.f46487c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public C9924p mo37589d() {
        return this.f46489e;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public int mo37590e() {
        return this.f46491g;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public int mo37591f() {
        return this.f46493i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public int mo37592g() {
        return this.f46490f;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public int mo37593h() {
        return this.f46492h;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public C9924p mo37594i() {
        return this.f46486b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public C9924p mo37595j() {
        return this.f46488d;
    }

    C12712c(C12712c cVar) {
        m60262k(cVar.f46485a, cVar.f46486b, cVar.f46487c, cVar.f46488d, cVar.f46489e);
    }
}
