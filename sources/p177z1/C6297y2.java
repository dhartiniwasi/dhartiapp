package p177z1;

import android.os.Looper;
import p161w3.C5917a;
import p161w3.C5923d;

/* renamed from: z1.y2 */
/* compiled from: PlayerMessage */
public final class C6297y2 {

    /* renamed from: a */
    private final C6299b f30374a;

    /* renamed from: b */
    private final C6298a f30375b;

    /* renamed from: c */
    private final C5923d f30376c;

    /* renamed from: d */
    private final C6266q3 f30377d;

    /* renamed from: e */
    private int f30378e;

    /* renamed from: f */
    private Object f30379f;

    /* renamed from: g */
    private Looper f30380g;

    /* renamed from: h */
    private int f30381h;

    /* renamed from: i */
    private long f30382i = -9223372036854775807L;

    /* renamed from: j */
    private boolean f30383j = true;

    /* renamed from: k */
    private boolean f30384k;

    /* renamed from: l */
    private boolean f30385l;

    /* renamed from: m */
    private boolean f30386m;

    /* renamed from: n */
    private boolean f30387n;

    /* renamed from: z1.y2$a */
    /* compiled from: PlayerMessage */
    public interface C6298a {
        /* renamed from: a */
        void mo21417a(C6297y2 y2Var);
    }

    /* renamed from: z1.y2$b */
    /* compiled from: PlayerMessage */
    public interface C6299b {
        /* renamed from: r */
        void mo6490r(int i, Object obj) throws C6264q;
    }

    public C6297y2(C6298a aVar, C6299b bVar, C6266q3 q3Var, int i, C5923d dVar, Looper looper) {
        this.f30375b = aVar;
        this.f30374a = bVar;
        this.f30377d = q3Var;
        this.f30380g = looper;
        this.f30376c = dVar;
        this.f30381h = i;
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0040 A[SYNTHETIC, Splitter:B:16:0x0040] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized boolean mo21570a(long r7) throws java.lang.InterruptedException, java.util.concurrent.TimeoutException {
        /*
            r6 = this;
            monitor-enter(r6)
            boolean r0 = r6.f30384k     // Catch:{ all -> 0x0048 }
            p161w3.C5917a.m34873f(r0)     // Catch:{ all -> 0x0048 }
            android.os.Looper r0 = r6.f30380g     // Catch:{ all -> 0x0048 }
            java.lang.Thread r0 = r0.getThread()     // Catch:{ all -> 0x0048 }
            java.lang.Thread r1 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x0048 }
            if (r0 == r1) goto L_0x0014
            r0 = 1
            goto L_0x0015
        L_0x0014:
            r0 = 0
        L_0x0015:
            p161w3.C5917a.m34873f(r0)     // Catch:{ all -> 0x0048 }
            w3.d r0 = r6.f30376c     // Catch:{ all -> 0x0048 }
            long r0 = r0.mo20586b()     // Catch:{ all -> 0x0048 }
            long r0 = r0 + r7
        L_0x001f:
            boolean r2 = r6.f30386m     // Catch:{ all -> 0x0048 }
            if (r2 != 0) goto L_0x003a
            r3 = 0
            int r5 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r5 <= 0) goto L_0x003a
            w3.d r2 = r6.f30376c     // Catch:{ all -> 0x0048 }
            r2.mo20588d()     // Catch:{ all -> 0x0048 }
            r6.wait(r7)     // Catch:{ all -> 0x0048 }
            w3.d r7 = r6.f30376c     // Catch:{ all -> 0x0048 }
            long r7 = r7.mo20586b()     // Catch:{ all -> 0x0048 }
            long r7 = r0 - r7
            goto L_0x001f
        L_0x003a:
            if (r2 == 0) goto L_0x0040
            boolean r7 = r6.f30385l     // Catch:{ all -> 0x0048 }
            monitor-exit(r6)
            return r7
        L_0x0040:
            java.util.concurrent.TimeoutException r7 = new java.util.concurrent.TimeoutException     // Catch:{ all -> 0x0048 }
            java.lang.String r8 = "Message delivery timed out."
            r7.<init>(r8)     // Catch:{ all -> 0x0048 }
            throw r7     // Catch:{ all -> 0x0048 }
        L_0x0048:
            r7 = move-exception
            monitor-exit(r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p177z1.C6297y2.mo21570a(long):boolean");
    }

    /* renamed from: b */
    public boolean mo21571b() {
        return this.f30383j;
    }

    /* renamed from: c */
    public Looper mo21572c() {
        return this.f30380g;
    }

    /* renamed from: d */
    public int mo21573d() {
        return this.f30381h;
    }

    /* renamed from: e */
    public Object mo21574e() {
        return this.f30379f;
    }

    /* renamed from: f */
    public long mo21575f() {
        return this.f30382i;
    }

    /* renamed from: g */
    public C6299b mo21576g() {
        return this.f30374a;
    }

    /* renamed from: h */
    public C6266q3 mo21577h() {
        return this.f30377d;
    }

    /* renamed from: i */
    public int mo21578i() {
        return this.f30378e;
    }

    /* renamed from: j */
    public synchronized boolean mo21579j() {
        return this.f30387n;
    }

    /* renamed from: k */
    public synchronized void mo21580k(boolean z) {
        this.f30385l = z | this.f30385l;
        this.f30386m = true;
        notifyAll();
    }

    /* renamed from: l */
    public C6297y2 mo21581l() {
        C5917a.m34873f(!this.f30384k);
        if (this.f30382i == -9223372036854775807L) {
            C5917a.m34868a(this.f30383j);
        }
        this.f30384k = true;
        this.f30375b.mo21417a(this);
        return this;
    }

    /* renamed from: m */
    public C6297y2 mo21582m(Object obj) {
        C5917a.m34873f(!this.f30384k);
        this.f30379f = obj;
        return this;
    }

    /* renamed from: n */
    public C6297y2 mo21583n(int i) {
        C5917a.m34873f(!this.f30384k);
        this.f30378e = i;
        return this;
    }
}
