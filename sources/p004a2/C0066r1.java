package p004a2;

import android.util.Base64;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;
import p004a2.C0016c;
import p004a2.C0075t1;
import p015b3.C1772x;
import p161w3.C5917a;
import p161w3.C5953m0;
import p177z1.C6266q3;
import p182a7.C6444t;

/* renamed from: a2.r1 */
/* compiled from: DefaultPlaybackSessionManager */
public final class C0066r1 implements C0075t1 {

    /* renamed from: h */
    public static final C6444t<String> f162h = C0063q1.f157a;

    /* renamed from: i */
    private static final Random f163i = new Random();
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C6266q3.C6270d f164a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C6266q3.C6268b f165b;

    /* renamed from: c */
    private final HashMap<String, C0067a> f166c;

    /* renamed from: d */
    private final C6444t<String> f167d;

    /* renamed from: e */
    private C0075t1.C0076a f168e;

    /* renamed from: f */
    private C6266q3 f169f;

    /* renamed from: g */
    private String f170g;

    /* renamed from: a2.r1$a */
    /* compiled from: DefaultPlaybackSessionManager */
    private final class C0067a {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public final String f171a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public int f172b;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public long f173c;
        /* access modifiers changed from: private */

        /* renamed from: d */
        public C1772x.C1774b f174d;
        /* access modifiers changed from: private */

        /* renamed from: e */
        public boolean f175e;
        /* access modifiers changed from: private */

        /* renamed from: f */
        public boolean f176f;

        public C0067a(String str, int i, C1772x.C1774b bVar) {
            long j;
            this.f171a = str;
            this.f172b = i;
            if (bVar == null) {
                j = -1;
            } else {
                j = bVar.f5273d;
            }
            this.f173c = j;
            if (bVar != null && bVar.mo6886b()) {
                this.f174d = bVar;
            }
        }

        /* renamed from: l */
        private int m447l(C6266q3 q3Var, C6266q3 q3Var2, int i) {
            if (i < q3Var.mo6761t()) {
                q3Var.mo21450r(i, C0066r1.this.f164a);
                for (int i2 = C0066r1.this.f164a.f30213w; i2 <= C0066r1.this.f164a.f30214x; i2++) {
                    int f = q3Var2.mo6809f(q3Var.mo6813q(i2));
                    if (f != -1) {
                        return q3Var2.mo21447j(f, C0066r1.this.f165b).f30186c;
                    }
                }
                return -1;
            } else if (i < q3Var2.mo6761t()) {
                return i;
            } else {
                return -1;
            }
        }

        /* renamed from: i */
        public boolean mo205i(int i, C1772x.C1774b bVar) {
            if (bVar == null) {
                return i == this.f172b;
            }
            C1772x.C1774b bVar2 = this.f174d;
            if (bVar2 == null) {
                if (bVar.mo6886b() || bVar.f5273d != this.f173c) {
                    return false;
                }
                return true;
            } else if (bVar.f5273d == bVar2.f5273d && bVar.f5271b == bVar2.f5271b && bVar.f5272c == bVar2.f5272c) {
                return true;
            } else {
                return false;
            }
        }

        /* renamed from: j */
        public boolean mo206j(C0016c.C0017a aVar) {
            long j = this.f173c;
            if (j == -1) {
                return false;
            }
            C1772x.C1774b bVar = aVar.f39d;
            if (bVar == null) {
                if (this.f172b != aVar.f38c) {
                    return true;
                }
                return false;
            } else if (bVar.f5273d > j) {
                return true;
            } else {
                if (this.f174d == null) {
                    return false;
                }
                int f = aVar.f37b.mo6809f(bVar.f5270a);
                int f2 = aVar.f37b.mo6809f(this.f174d.f5270a);
                C1772x.C1774b bVar2 = aVar.f39d;
                if (bVar2.f5273d < this.f174d.f5273d || f < f2) {
                    return false;
                }
                if (f > f2) {
                    return true;
                }
                if (bVar2.mo6886b()) {
                    C1772x.C1774b bVar3 = aVar.f39d;
                    int i = bVar3.f5271b;
                    int i2 = bVar3.f5272c;
                    C1772x.C1774b bVar4 = this.f174d;
                    int i3 = bVar4.f5271b;
                    if (i > i3 || (i == i3 && i2 > bVar4.f5272c)) {
                        return true;
                    }
                    return false;
                }
                int i4 = aVar.f39d.f5274e;
                if (i4 == -1 || i4 > this.f174d.f5271b) {
                    return true;
                }
                return false;
            }
        }

        /* renamed from: k */
        public void mo207k(int i, C1772x.C1774b bVar) {
            if (this.f173c == -1 && i == this.f172b && bVar != null) {
                this.f173c = bVar.f5273d;
            }
        }

        /* renamed from: m */
        public boolean mo208m(C6266q3 q3Var, C6266q3 q3Var2) {
            int l = m447l(q3Var, q3Var2, this.f172b);
            this.f172b = l;
            if (l == -1) {
                return false;
            }
            C1772x.C1774b bVar = this.f174d;
            if (bVar != null && q3Var2.mo6809f(bVar.f5270a) == -1) {
                return false;
            }
            return true;
        }
    }

    public C0066r1() {
        this(f162h);
    }

    /* access modifiers changed from: private */
    /* renamed from: k */
    public static String m429k() {
        byte[] bArr = new byte[12];
        f163i.nextBytes(bArr);
        return Base64.encodeToString(bArr, 10);
    }

    /* renamed from: l */
    private C0067a m430l(int i, C1772x.C1774b bVar) {
        int i2;
        C0067a aVar = null;
        long j = Long.MAX_VALUE;
        for (C0067a next : this.f166c.values()) {
            next.mo207k(i, bVar);
            if (next.mo205i(i, bVar)) {
                long b = next.f173c;
                if (b == -1 || b < j) {
                    aVar = next;
                    j = b;
                } else if (!(i2 != 0 || ((C0067a) C5953m0.m35138j(aVar)).f174d == null || next.f174d == null)) {
                    aVar = next;
                }
            }
        }
        if (aVar != null) {
            return aVar;
        }
        String str = this.f167d.get();
        C0067a aVar2 = new C0067a(str, i, bVar);
        this.f166c.put(str, aVar2);
        return aVar2;
    }

    /* renamed from: m */
    private void m431m(C0016c.C0017a aVar) {
        if (aVar.f37b.mo21451u()) {
            this.f170g = null;
            return;
        }
        C0067a aVar2 = this.f166c.get(this.f170g);
        C0067a l = m430l(aVar.f38c, aVar.f39d);
        this.f170g = l.f171a;
        mo200c(aVar);
        C1772x.C1774b bVar = aVar.f39d;
        if (bVar != null && bVar.mo6886b()) {
            if (aVar2 == null || aVar2.f173c != aVar.f39d.f5273d || aVar2.f174d == null || aVar2.f174d.f5271b != aVar.f39d.f5271b || aVar2.f174d.f5272c != aVar.f39d.f5272c) {
                C1772x.C1774b bVar2 = aVar.f39d;
                this.f168e.mo213j0(aVar, m430l(aVar.f38c, new C1772x.C1774b(bVar2.f5270a, bVar2.f5273d)).f171a, l.f171a);
            }
        }
    }

    /* renamed from: a */
    public synchronized String mo198a() {
        return this.f170g;
    }

    /* renamed from: b */
    public synchronized void mo199b(C0016c.C0017a aVar) {
        C5917a.m34872e(this.f168e);
        C6266q3 q3Var = this.f169f;
        this.f169f = aVar.f37b;
        Iterator<C0067a> it = this.f166c.values().iterator();
        while (it.hasNext()) {
            C0067a next = it.next();
            if (!next.mo208m(q3Var, this.f169f) || next.mo206j(aVar)) {
                it.remove();
                if (next.f175e) {
                    if (next.f171a.equals(this.f170g)) {
                        this.f170g = null;
                    }
                    this.f168e.mo211W(aVar, next.f171a, false);
                }
            }
        }
        m431m(aVar);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0117, code lost:
        return;
     */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00e1  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00f3  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void mo200c(p004a2.C0016c.C0017a r25) {
        /*
            r24 = this;
            r1 = r24
            r0 = r25
            monitor-enter(r24)
            a2.t1$a r2 = r1.f168e     // Catch:{ all -> 0x0118 }
            p161w3.C5917a.m34872e(r2)     // Catch:{ all -> 0x0118 }
            z1.q3 r2 = r0.f37b     // Catch:{ all -> 0x0118 }
            boolean r2 = r2.mo21451u()     // Catch:{ all -> 0x0118 }
            if (r2 == 0) goto L_0x0014
            monitor-exit(r24)
            return
        L_0x0014:
            java.util.HashMap<java.lang.String, a2.r1$a> r2 = r1.f166c     // Catch:{ all -> 0x0118 }
            java.lang.String r3 = r1.f170g     // Catch:{ all -> 0x0118 }
            java.lang.Object r2 = r2.get(r3)     // Catch:{ all -> 0x0118 }
            a2.r1$a r2 = (p004a2.C0066r1.C0067a) r2     // Catch:{ all -> 0x0118 }
            b3.x$b r3 = r0.f39d     // Catch:{ all -> 0x0118 }
            r4 = 1
            if (r3 == 0) goto L_0x004b
            if (r2 == 0) goto L_0x004b
            long r5 = r2.f173c     // Catch:{ all -> 0x0118 }
            r7 = -1
            r3 = 0
            int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r9 != 0) goto L_0x003a
            int r2 = r2.f172b     // Catch:{ all -> 0x0118 }
            int r5 = r0.f38c     // Catch:{ all -> 0x0118 }
            if (r2 == r5) goto L_0x0047
        L_0x0038:
            r3 = 1
            goto L_0x0047
        L_0x003a:
            b3.x$b r5 = r0.f39d     // Catch:{ all -> 0x0118 }
            long r5 = r5.f5273d     // Catch:{ all -> 0x0118 }
            long r7 = r2.f173c     // Catch:{ all -> 0x0118 }
            int r2 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r2 >= 0) goto L_0x0047
            goto L_0x0038
        L_0x0047:
            if (r3 == 0) goto L_0x004b
            monitor-exit(r24)
            return
        L_0x004b:
            int r2 = r0.f38c     // Catch:{ all -> 0x0118 }
            b3.x$b r3 = r0.f39d     // Catch:{ all -> 0x0118 }
            a2.r1$a r2 = r1.m430l(r2, r3)     // Catch:{ all -> 0x0118 }
            java.lang.String r3 = r1.f170g     // Catch:{ all -> 0x0118 }
            if (r3 != 0) goto L_0x005d
            java.lang.String r3 = r2.f171a     // Catch:{ all -> 0x0118 }
            r1.f170g = r3     // Catch:{ all -> 0x0118 }
        L_0x005d:
            b3.x$b r3 = r0.f39d     // Catch:{ all -> 0x0118 }
            if (r3 == 0) goto L_0x00d9
            boolean r3 = r3.mo6886b()     // Catch:{ all -> 0x0118 }
            if (r3 == 0) goto L_0x00d9
            b3.x$b r10 = new b3.x$b     // Catch:{ all -> 0x0118 }
            b3.x$b r3 = r0.f39d     // Catch:{ all -> 0x0118 }
            java.lang.Object r5 = r3.f5270a     // Catch:{ all -> 0x0118 }
            long r6 = r3.f5273d     // Catch:{ all -> 0x0118 }
            int r3 = r3.f5271b     // Catch:{ all -> 0x0118 }
            r10.<init>(r5, r6, r3)     // Catch:{ all -> 0x0118 }
            int r3 = r0.f38c     // Catch:{ all -> 0x0118 }
            a2.r1$a r3 = r1.m430l(r3, r10)     // Catch:{ all -> 0x0118 }
            boolean r5 = r3.f175e     // Catch:{ all -> 0x0118 }
            if (r5 != 0) goto L_0x00d9
            boolean unused = r3.f175e = r4     // Catch:{ all -> 0x0118 }
            z1.q3 r5 = r0.f37b     // Catch:{ all -> 0x0118 }
            b3.x$b r6 = r0.f39d     // Catch:{ all -> 0x0118 }
            java.lang.Object r6 = r6.f5270a     // Catch:{ all -> 0x0118 }
            z1.q3$b r7 = r1.f165b     // Catch:{ all -> 0x0118 }
            r5.mo21149l(r6, r7)     // Catch:{ all -> 0x0118 }
            z1.q3$b r5 = r1.f165b     // Catch:{ all -> 0x0118 }
            b3.x$b r6 = r0.f39d     // Catch:{ all -> 0x0118 }
            int r6 = r6.f5271b     // Catch:{ all -> 0x0118 }
            long r5 = r5.mo21460i(r6)     // Catch:{ all -> 0x0118 }
            long r5 = p161w3.C5953m0.m35117Y0(r5)     // Catch:{ all -> 0x0118 }
            z1.q3$b r7 = r1.f165b     // Catch:{ all -> 0x0118 }
            long r7 = r7.mo21467p()     // Catch:{ all -> 0x0118 }
            long r5 = r5 + r7
            r7 = 0
            long r11 = java.lang.Math.max(r7, r5)     // Catch:{ all -> 0x0118 }
            a2.c$a r15 = new a2.c$a     // Catch:{ all -> 0x0118 }
            long r6 = r0.f36a     // Catch:{ all -> 0x0118 }
            z1.q3 r8 = r0.f37b     // Catch:{ all -> 0x0118 }
            int r9 = r0.f38c     // Catch:{ all -> 0x0118 }
            z1.q3 r13 = r0.f41f     // Catch:{ all -> 0x0118 }
            int r14 = r0.f42g     // Catch:{ all -> 0x0118 }
            b3.x$b r5 = r0.f43h     // Catch:{ all -> 0x0118 }
            r16 = r5
            long r4 = r0.f44i     // Catch:{ all -> 0x0118 }
            r20 = r2
            r21 = r3
            long r2 = r0.f45j     // Catch:{ all -> 0x0118 }
            r22 = r4
            r4 = r16
            r16 = r22
            r5 = r15
            r0 = r15
            r15 = r4
            r18 = r2
            r5.<init>(r6, r8, r9, r10, r11, r13, r14, r15, r16, r18)     // Catch:{ all -> 0x0118 }
            a2.t1$a r2 = r1.f168e     // Catch:{ all -> 0x0118 }
            java.lang.String r3 = r21.f171a     // Catch:{ all -> 0x0118 }
            r2.mo210T(r0, r3)     // Catch:{ all -> 0x0118 }
            goto L_0x00db
        L_0x00d9:
            r20 = r2
        L_0x00db:
            boolean r0 = r20.f175e     // Catch:{ all -> 0x0118 }
            if (r0 != 0) goto L_0x00f3
            r0 = r20
            r2 = 1
            boolean unused = r0.f175e = r2     // Catch:{ all -> 0x0118 }
            a2.t1$a r2 = r1.f168e     // Catch:{ all -> 0x0118 }
            java.lang.String r3 = r0.f171a     // Catch:{ all -> 0x0118 }
            r4 = r25
            r2.mo210T(r4, r3)     // Catch:{ all -> 0x0118 }
            goto L_0x00f7
        L_0x00f3:
            r4 = r25
            r0 = r20
        L_0x00f7:
            java.lang.String r2 = r0.f171a     // Catch:{ all -> 0x0118 }
            java.lang.String r3 = r1.f170g     // Catch:{ all -> 0x0118 }
            boolean r2 = r2.equals(r3)     // Catch:{ all -> 0x0118 }
            if (r2 == 0) goto L_0x0116
            boolean r2 = r0.f176f     // Catch:{ all -> 0x0118 }
            if (r2 != 0) goto L_0x0116
            r2 = 1
            boolean unused = r0.f176f = r2     // Catch:{ all -> 0x0118 }
            a2.t1$a r2 = r1.f168e     // Catch:{ all -> 0x0118 }
            java.lang.String r0 = r0.f171a     // Catch:{ all -> 0x0118 }
            r2.mo212g(r4, r0)     // Catch:{ all -> 0x0118 }
        L_0x0116:
            monitor-exit(r24)
            return
        L_0x0118:
            r0 = move-exception
            monitor-exit(r24)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p004a2.C0066r1.mo200c(a2.c$a):void");
    }

    /* renamed from: d */
    public void mo201d(C0075t1.C0076a aVar) {
        this.f168e = aVar;
    }

    /* renamed from: e */
    public synchronized String mo202e(C6266q3 q3Var, C1772x.C1774b bVar) {
        return m430l(q3Var.mo21149l(bVar.f5270a, this.f165b).f30186c, bVar).f171a;
    }

    /* renamed from: f */
    public synchronized void mo203f(C0016c.C0017a aVar, int i) {
        C5917a.m34872e(this.f168e);
        boolean z = i == 0;
        Iterator<C0067a> it = this.f166c.values().iterator();
        while (it.hasNext()) {
            C0067a next = it.next();
            if (next.mo206j(aVar)) {
                it.remove();
                if (next.f175e) {
                    boolean equals = next.f171a.equals(this.f170g);
                    boolean z2 = z && equals && next.f176f;
                    if (equals) {
                        this.f170g = null;
                    }
                    this.f168e.mo211W(aVar, next.f171a, z2);
                }
            }
        }
        m431m(aVar);
    }

    /* renamed from: g */
    public synchronized void mo204g(C0016c.C0017a aVar) {
        C0075t1.C0076a aVar2;
        this.f170g = null;
        Iterator<C0067a> it = this.f166c.values().iterator();
        while (it.hasNext()) {
            C0067a next = it.next();
            it.remove();
            if (next.f175e && (aVar2 = this.f168e) != null) {
                aVar2.mo211W(aVar, next.f171a, false);
            }
        }
    }

    public C0066r1(C6444t<String> tVar) {
        this.f167d = tVar;
        this.f164a = new C6266q3.C6270d();
        this.f165b = new C6266q3.C6268b();
        this.f166c = new HashMap<>();
        this.f169f = C6266q3.f30181a;
    }
}
