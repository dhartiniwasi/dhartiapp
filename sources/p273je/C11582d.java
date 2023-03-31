package p273je;

import java.io.IOException;
import java.net.Socket;
import java.util.List;
import p244ge.C10350a;
import p244ge.C10351a0;
import p244ge.C10366f;
import p244ge.C10375h0;
import p244ge.C10391u;
import p244ge.C10399y;
import p253he.C10543e;
import p273je.C11588j;
import p282ke.C11635c;

/* renamed from: je.d */
/* compiled from: ExchangeFinder */
final class C11582d {

    /* renamed from: a */
    private final C11590k f44071a;

    /* renamed from: b */
    private final C10350a f44072b;

    /* renamed from: c */
    private final C11585g f44073c;

    /* renamed from: d */
    private final C10366f f44074d;

    /* renamed from: e */
    private final C10391u f44075e;

    /* renamed from: f */
    private C11588j.C11589a f44076f;

    /* renamed from: g */
    private final C11588j f44077g;

    /* renamed from: h */
    private C11583e f44078h;

    /* renamed from: i */
    private boolean f44079i;

    /* renamed from: j */
    private C10375h0 f44080j;

    C11582d(C11590k kVar, C11585g gVar, C10350a aVar, C10366f fVar, C10391u uVar) {
        this.f44071a = kVar;
        this.f44073c = gVar;
        this.f44072b = aVar;
        this.f44074d = fVar;
        this.f44075e = uVar;
        this.f44077g = new C11588j(aVar, gVar.f44103e, fVar, uVar);
    }

    /* renamed from: c */
    private C11583e m56536c(int i, int i2, int i3, int i4, boolean z) throws IOException {
        C11583e eVar;
        Socket socket;
        Socket n;
        C11583e eVar2;
        boolean z2;
        C10375h0 h0Var;
        boolean z3;
        List<C10375h0> list;
        C11588j.C11589a aVar;
        synchronized (this.f44073c) {
            if (!this.f44071a.mo35740i()) {
                this.f44079i = false;
                C11590k kVar = this.f44071a;
                eVar = kVar.f44126i;
                socket = null;
                n = (eVar == null || !eVar.f44090k) ? null : kVar.mo35744n();
                C11590k kVar2 = this.f44071a;
                eVar2 = kVar2.f44126i;
                if (eVar2 != null) {
                    eVar = null;
                } else {
                    eVar2 = null;
                }
                if (eVar2 == null) {
                    if (this.f44073c.mo35721h(this.f44072b, kVar2, (List<C10375h0>) null, false)) {
                        eVar2 = this.f44071a.f44126i;
                        h0Var = null;
                        z2 = true;
                    } else {
                        h0Var = this.f44080j;
                        if (h0Var != null) {
                            this.f44080j = null;
                        } else if (m56538g()) {
                            h0Var = this.f44071a.f44126i.mo35711q();
                        }
                        z2 = false;
                    }
                }
                h0Var = null;
                z2 = false;
            } else {
                throw new IOException("Canceled");
            }
        }
        C10543e.m53046g(n);
        if (eVar != null) {
            this.f44075e.mo33381i(this.f44074d, eVar);
        }
        if (z2) {
            this.f44075e.mo33380h(this.f44074d, eVar2);
        }
        if (eVar2 != null) {
            return eVar2;
        }
        if (h0Var != null || ((aVar = this.f44076f) != null && aVar.mo35731b())) {
            z3 = false;
        } else {
            this.f44076f = this.f44077g.mo35729d();
            z3 = true;
        }
        synchronized (this.f44073c) {
            if (!this.f44071a.mo35740i()) {
                if (z3) {
                    list = this.f44076f.mo35730a();
                    if (this.f44073c.mo35721h(this.f44072b, this.f44071a, list, false)) {
                        eVar2 = this.f44071a.f44126i;
                        z2 = true;
                    }
                } else {
                    list = null;
                }
                if (!z2) {
                    if (h0Var == null) {
                        h0Var = this.f44076f.mo35732c();
                    }
                    eVar2 = new C11583e(this.f44073c, h0Var);
                    this.f44078h = eVar2;
                }
            } else {
                throw new IOException("Canceled");
            }
        }
        if (z2) {
            this.f44075e.mo33380h(this.f44074d, eVar2);
            return eVar2;
        }
        eVar2.mo35704d(i, i2, i3, i4, z, this.f44074d, this.f44075e);
        this.f44073c.f44103e.mo35722a(eVar2.mo35711q());
        synchronized (this.f44073c) {
            this.f44078h = null;
            if (this.f44073c.mo35721h(this.f44072b, this.f44071a, list, true)) {
                eVar2.f44090k = true;
                socket = eVar2.mo35712s();
                eVar2 = this.f44071a.f44126i;
                this.f44080j = h0Var;
            } else {
                this.f44073c.mo35720g(eVar2);
                this.f44071a.mo35733a(eVar2);
            }
        }
        C10543e.m53046g(socket);
        this.f44075e.mo33380h(this.f44074d, eVar2);
        return eVar2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0018, code lost:
        if (r0.mo35707m(r9) != false) goto L_0x001e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x001e, code lost:
        return r0;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private p273je.C11583e m56537d(int r4, int r5, int r6, int r7, boolean r8, boolean r9) throws java.io.IOException {
        /*
            r3 = this;
        L_0x0000:
            je.e r0 = r3.m56536c(r4, r5, r6, r7, r8)
            je.g r1 = r3.f44073c
            monitor-enter(r1)
            int r2 = r0.f44092m     // Catch:{ all -> 0x001f }
            if (r2 != 0) goto L_0x0013
            boolean r2 = r0.mo35708n()     // Catch:{ all -> 0x001f }
            if (r2 != 0) goto L_0x0013
            monitor-exit(r1)     // Catch:{ all -> 0x001f }
            return r0
        L_0x0013:
            monitor-exit(r1)     // Catch:{ all -> 0x001f }
            boolean r1 = r0.mo35707m(r9)
            if (r1 != 0) goto L_0x001e
            r0.mo35710p()
            goto L_0x0000
        L_0x001e:
            return r0
        L_0x001f:
            r4 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x001f }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p273je.C11582d.m56537d(int, int, int, int, boolean, boolean):je.e");
    }

    /* renamed from: g */
    private boolean m56538g() {
        C11583e eVar = this.f44071a.f44126i;
        return eVar != null && eVar.f44091l == 0 && C10543e.m53031D(eVar.mo35711q().mo33335a().mo33199l(), this.f44072b.mo33199l());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C11583e mo35696a() {
        return this.f44078h;
    }

    /* renamed from: b */
    public C11635c mo35697b(C10351a0 a0Var, C10399y.C10400a aVar, boolean z) {
        try {
            return m56537d(aVar.mo33450d(), aVar.mo33447a(), aVar.mo33448b(), a0Var.mo33223u(), a0Var.mo33202B(), z).mo35709o(a0Var, aVar);
        } catch (C11587i e) {
            mo35700h();
            throw e;
        } catch (IOException e2) {
            mo35700h();
            throw new C11587i(e2);
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0031, code lost:
        return r2;
     */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo35698e() {
        /*
            r3 = this;
            je.g r0 = r3.f44073c
            monitor-enter(r0)
            ge.h0 r1 = r3.f44080j     // Catch:{ all -> 0x0032 }
            r2 = 1
            if (r1 == 0) goto L_0x000a
            monitor-exit(r0)     // Catch:{ all -> 0x0032 }
            return r2
        L_0x000a:
            boolean r1 = r3.m56538g()     // Catch:{ all -> 0x0032 }
            if (r1 == 0) goto L_0x001c
            je.k r1 = r3.f44071a     // Catch:{ all -> 0x0032 }
            je.e r1 = r1.f44126i     // Catch:{ all -> 0x0032 }
            ge.h0 r1 = r1.mo35711q()     // Catch:{ all -> 0x0032 }
            r3.f44080j = r1     // Catch:{ all -> 0x0032 }
            monitor-exit(r0)     // Catch:{ all -> 0x0032 }
            return r2
        L_0x001c:
            je.j$a r1 = r3.f44076f     // Catch:{ all -> 0x0032 }
            if (r1 == 0) goto L_0x0026
            boolean r1 = r1.mo35731b()     // Catch:{ all -> 0x0032 }
            if (r1 != 0) goto L_0x0030
        L_0x0026:
            je.j r1 = r3.f44077g     // Catch:{ all -> 0x0032 }
            boolean r1 = r1.mo35728b()     // Catch:{ all -> 0x0032 }
            if (r1 == 0) goto L_0x002f
            goto L_0x0030
        L_0x002f:
            r2 = 0
        L_0x0030:
            monitor-exit(r0)     // Catch:{ all -> 0x0032 }
            return r2
        L_0x0032:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0032 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p273je.C11582d.mo35698e():boolean");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public boolean mo35699f() {
        boolean z;
        synchronized (this.f44073c) {
            z = this.f44079i;
        }
        return z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public void mo35700h() {
        synchronized (this.f44073c) {
            this.f44079i = true;
        }
    }
}
