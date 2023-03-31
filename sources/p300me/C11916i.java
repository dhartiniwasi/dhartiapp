package p300me;

import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Objects;
import p244ge.C10395w;
import p336qe.C12226a;
import p336qe.C12231c;
import p336qe.C12234e;
import p336qe.C12251s;
import p336qe.C12252t;
import p336qe.C12253u;

/* renamed from: me.i */
/* compiled from: Http2Stream */
public final class C11916i {

    /* renamed from: a */
    long f44768a = 0;

    /* renamed from: b */
    long f44769b;

    /* renamed from: c */
    final int f44770c;

    /* renamed from: d */
    final C11895f f44771d;

    /* renamed from: e */
    private final Deque<C10395w> f44772e;

    /* renamed from: f */
    private boolean f44773f;

    /* renamed from: g */
    private final C11918b f44774g;

    /* renamed from: h */
    final C11917a f44775h;

    /* renamed from: i */
    final C11919c f44776i;

    /* renamed from: j */
    final C11919c f44777j;

    /* renamed from: k */
    C11889b f44778k;

    /* renamed from: l */
    IOException f44779l;

    /* renamed from: me.i$a */
    /* compiled from: Http2Stream */
    final class C11917a implements C12251s {

        /* renamed from: a */
        private final C12231c f44780a = new C12231c();

        /* renamed from: b */
        private C10395w f44781b;

        /* renamed from: c */
        boolean f44782c;

        /* renamed from: d */
        boolean f44783d;

        C11917a() {
        }

        /* JADX WARNING: Code restructure failed: missing block: B:15:?, code lost:
            r1.f44777j.mo36213u();
            r11.f44784e.mo36196c();
            r9 = java.lang.Math.min(r11.f44784e.f44769b, r11.f44780a.mo36771I());
            r1 = r11.f44784e;
            r1.f44769b -= r9;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private void m57557a(boolean r12) throws java.io.IOException {
            /*
                r11 = this;
                me.i r0 = p300me.C11916i.this
                monitor-enter(r0)
                me.i r1 = p300me.C11916i.this     // Catch:{ all -> 0x0080 }
                me.i$c r1 = r1.f44777j     // Catch:{ all -> 0x0080 }
                r1.mo36753k()     // Catch:{ all -> 0x0080 }
            L_0x000a:
                me.i r1 = p300me.C11916i.this     // Catch:{ all -> 0x0077 }
                long r2 = r1.f44769b     // Catch:{ all -> 0x0077 }
                r4 = 0
                int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r6 > 0) goto L_0x0024
                boolean r2 = r11.f44783d     // Catch:{ all -> 0x0077 }
                if (r2 != 0) goto L_0x0024
                boolean r2 = r11.f44782c     // Catch:{ all -> 0x0077 }
                if (r2 != 0) goto L_0x0024
                me.b r2 = r1.f44778k     // Catch:{ all -> 0x0077 }
                if (r2 != 0) goto L_0x0024
                r1.mo36209q()     // Catch:{ all -> 0x0077 }
                goto L_0x000a
            L_0x0024:
                me.i$c r1 = r1.f44777j     // Catch:{ all -> 0x0080 }
                r1.mo36213u()     // Catch:{ all -> 0x0080 }
                me.i r1 = p300me.C11916i.this     // Catch:{ all -> 0x0080 }
                r1.mo36196c()     // Catch:{ all -> 0x0080 }
                me.i r1 = p300me.C11916i.this     // Catch:{ all -> 0x0080 }
                long r1 = r1.f44769b     // Catch:{ all -> 0x0080 }
                qe.c r3 = r11.f44780a     // Catch:{ all -> 0x0080 }
                long r3 = r3.mo36771I()     // Catch:{ all -> 0x0080 }
                long r9 = java.lang.Math.min(r1, r3)     // Catch:{ all -> 0x0080 }
                me.i r1 = p300me.C11916i.this     // Catch:{ all -> 0x0080 }
                long r2 = r1.f44769b     // Catch:{ all -> 0x0080 }
                long r2 = r2 - r9
                r1.f44769b = r2     // Catch:{ all -> 0x0080 }
                monitor-exit(r0)     // Catch:{ all -> 0x0080 }
                me.i$c r0 = r1.f44777j
                r0.mo36753k()
                if (r12 == 0) goto L_0x005a
                qe.c r12 = r11.f44780a     // Catch:{ all -> 0x0058 }
                long r0 = r12.mo36771I()     // Catch:{ all -> 0x0058 }
                int r12 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
                if (r12 != 0) goto L_0x005a
                r12 = 1
                r7 = 1
                goto L_0x005c
            L_0x0058:
                r12 = move-exception
                goto L_0x006f
            L_0x005a:
                r12 = 0
                r7 = 0
            L_0x005c:
                me.i r12 = p300me.C11916i.this     // Catch:{ all -> 0x0058 }
                me.f r5 = r12.f44771d     // Catch:{ all -> 0x0058 }
                int r6 = r12.f44770c     // Catch:{ all -> 0x0058 }
                qe.c r8 = r11.f44780a     // Catch:{ all -> 0x0058 }
                r5.mo36171t0(r6, r7, r8, r9)     // Catch:{ all -> 0x0058 }
                me.i r12 = p300me.C11916i.this
                me.i$c r12 = r12.f44777j
                r12.mo36213u()
                return
            L_0x006f:
                me.i r0 = p300me.C11916i.this
                me.i$c r0 = r0.f44777j
                r0.mo36213u()
                throw r12
            L_0x0077:
                r12 = move-exception
                me.i r1 = p300me.C11916i.this     // Catch:{ all -> 0x0080 }
                me.i$c r1 = r1.f44777j     // Catch:{ all -> 0x0080 }
                r1.mo36213u()     // Catch:{ all -> 0x0080 }
                throw r12     // Catch:{ all -> 0x0080 }
            L_0x0080:
                r12 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x0080 }
                throw r12
            */
            throw new UnsupportedOperationException("Method not decompiled: p300me.C11916i.C11917a.m57557a(boolean):void");
        }

        /* JADX WARNING: Code restructure failed: missing block: B:11:0x001e, code lost:
            if (r8.f44780a.mo36771I() <= 0) goto L_0x0022;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:12:0x0020, code lost:
            r2 = true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:13:0x0022, code lost:
            r2 = false;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:15:0x0025, code lost:
            if (r8.f44781b == null) goto L_0x0029;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:16:0x0027, code lost:
            r3 = true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:17:0x0029, code lost:
            r3 = false;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:18:0x002a, code lost:
            if (r3 == false) goto L_0x004a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:20:0x0034, code lost:
            if (r8.f44780a.mo36771I() <= 0) goto L_0x003a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:21:0x0036, code lost:
            m57557a(false);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:22:0x003a, code lost:
            r0 = r8.f44784e;
            r0.f44771d.mo36172u0(r0.f44770c, true, p253he.C10543e.m53036I(r8.f44781b));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:23:0x004a, code lost:
            if (r2 == false) goto L_0x005a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:25:0x0054, code lost:
            if (r8.f44780a.mo36771I() <= 0) goto L_0x0067;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:26:0x0056, code lost:
            m57557a(true);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:27:0x005a, code lost:
            r0 = r8.f44784e;
            r0.f44771d.mo36171t0(r0.f44770c, true, (p336qe.C12231c) null, 0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:28:0x0067, code lost:
            r2 = r8.f44784e;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:29:0x0069, code lost:
            monitor-enter(r2);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:31:?, code lost:
            r8.f44782c = true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:32:0x006c, code lost:
            monitor-exit(r2);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:33:0x006d, code lost:
            r8.f44784e.f44771d.flush();
            r8.f44784e.mo36195b();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:34:0x0079, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:9:0x0011, code lost:
            if (r8.f44784e.f44775h.f44783d != false) goto L_0x0067;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void close() throws java.io.IOException {
            /*
                r8 = this;
                me.i r0 = p300me.C11916i.this
                monitor-enter(r0)
                boolean r1 = r8.f44782c     // Catch:{ all -> 0x007d }
                if (r1 == 0) goto L_0x0009
                monitor-exit(r0)     // Catch:{ all -> 0x007d }
                return
            L_0x0009:
                monitor-exit(r0)     // Catch:{ all -> 0x007d }
                me.i r0 = p300me.C11916i.this
                me.i$a r0 = r0.f44775h
                boolean r0 = r0.f44783d
                r1 = 1
                if (r0 != 0) goto L_0x0067
                qe.c r0 = r8.f44780a
                long r2 = r0.mo36771I()
                r0 = 0
                r4 = 0
                int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r6 <= 0) goto L_0x0022
                r2 = 1
                goto L_0x0023
            L_0x0022:
                r2 = 0
            L_0x0023:
                ge.w r3 = r8.f44781b
                if (r3 == 0) goto L_0x0029
                r3 = 1
                goto L_0x002a
            L_0x0029:
                r3 = 0
            L_0x002a:
                if (r3 == 0) goto L_0x004a
            L_0x002c:
                qe.c r2 = r8.f44780a
                long r2 = r2.mo36771I()
                int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r6 <= 0) goto L_0x003a
                r8.m57557a(r0)
                goto L_0x002c
            L_0x003a:
                me.i r0 = p300me.C11916i.this
                me.f r2 = r0.f44771d
                int r0 = r0.f44770c
                ge.w r3 = r8.f44781b
                java.util.List r3 = p253he.C10543e.m53036I(r3)
                r2.mo36172u0(r0, r1, r3)
                goto L_0x0067
            L_0x004a:
                if (r2 == 0) goto L_0x005a
            L_0x004c:
                qe.c r0 = r8.f44780a
                long r2 = r0.mo36771I()
                int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r0 <= 0) goto L_0x0067
                r8.m57557a(r1)
                goto L_0x004c
            L_0x005a:
                me.i r0 = p300me.C11916i.this
                me.f r2 = r0.f44771d
                int r3 = r0.f44770c
                r4 = 1
                r5 = 0
                r6 = 0
                r2.mo36171t0(r3, r4, r5, r6)
            L_0x0067:
                me.i r2 = p300me.C11916i.this
                monitor-enter(r2)
                r8.f44782c = r1     // Catch:{ all -> 0x007a }
                monitor-exit(r2)     // Catch:{ all -> 0x007a }
                me.i r0 = p300me.C11916i.this
                me.f r0 = r0.f44771d
                r0.flush()
                me.i r0 = p300me.C11916i.this
                r0.mo36195b()
                return
            L_0x007a:
                r0 = move-exception
                monitor-exit(r2)     // Catch:{ all -> 0x007a }
                throw r0
            L_0x007d:
                r1 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x007d }
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: p300me.C11916i.C11917a.close():void");
        }

        public void flush() throws IOException {
            synchronized (C11916i.this) {
                C11916i.this.mo36196c();
            }
            while (this.f44780a.mo36771I() > 0) {
                m57557a(false);
                C11916i.this.f44771d.flush();
            }
        }

        /* renamed from: k1 */
        public void mo35694k1(C12231c cVar, long j) throws IOException {
            this.f44780a.mo35694k1(cVar, j);
            while (this.f44780a.mo36771I() >= 16384) {
                m57557a(false);
            }
        }

        /* renamed from: o */
        public C12253u mo36029o() {
            return C11916i.this.f44777j;
        }
    }

    /* renamed from: me.i$b */
    /* compiled from: Http2Stream */
    private final class C11918b implements C12252t {

        /* renamed from: a */
        private final C12231c f44785a = new C12231c();

        /* renamed from: b */
        private final C12231c f44786b = new C12231c();

        /* renamed from: c */
        private final long f44787c;
        /* access modifiers changed from: private */

        /* renamed from: d */
        public C10395w f44788d;

        /* renamed from: e */
        boolean f44789e;

        /* renamed from: f */
        boolean f44790f;

        C11918b(long j) {
            this.f44787c = j;
        }

        /* renamed from: f */
        private void m57561f(long j) {
            C11916i.this.f44771d.mo36170r0(j);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo36211b(C12234e eVar, long j) throws IOException {
            boolean z;
            boolean z2;
            boolean z3;
            long j2;
            while (j > 0) {
                synchronized (C11916i.this) {
                    z = this.f44790f;
                    z2 = true;
                    z3 = this.f44786b.mo36771I() + j > this.f44787c;
                }
                if (z3) {
                    eVar.skip(j);
                    C11916i.this.mo36198f(C11889b.FLOW_CONTROL_ERROR);
                    return;
                } else if (z) {
                    eVar.skip(j);
                    return;
                } else {
                    long z4 = eVar.mo33810z(this.f44785a, j);
                    if (z4 != -1) {
                        j -= z4;
                        synchronized (C11916i.this) {
                            if (this.f44789e) {
                                j2 = this.f44785a.mo36771I();
                                this.f44785a.mo36786a();
                            } else {
                                if (this.f44786b.mo36771I() != 0) {
                                    z2 = false;
                                }
                                this.f44786b.mo36789c0(this.f44785a);
                                if (z2) {
                                    C11916i.this.notifyAll();
                                }
                                j2 = 0;
                            }
                        }
                        if (j2 > 0) {
                            m57561f(j2);
                        }
                    } else {
                        throw new EOFException();
                    }
                }
            }
        }

        public void close() throws IOException {
            long I;
            synchronized (C11916i.this) {
                this.f44789e = true;
                I = this.f44786b.mo36771I();
                this.f44786b.mo36786a();
                C11916i.this.notifyAll();
            }
            if (I > 0) {
                m57561f(I);
            }
            C11916i.this.mo36195b();
        }

        /* renamed from: o */
        public C12253u mo33809o() {
            return C11916i.this.f44776i;
        }

        /* renamed from: z */
        public long mo33810z(C12231c cVar, long j) throws IOException {
            Throwable th;
            long z;
            if (j >= 0) {
                while (true) {
                    th = null;
                    synchronized (C11916i.this) {
                        C11916i.this.f44776i.mo36753k();
                        try {
                            C11916i iVar = C11916i.this;
                            if (iVar.f44778k != null) {
                                th = iVar.f44779l;
                                if (th == null) {
                                    th = new C11926n(C11916i.this.f44778k);
                                }
                            }
                            if (this.f44789e) {
                                throw new IOException("stream closed");
                            } else if (this.f44786b.mo36771I() > 0) {
                                C12231c cVar2 = this.f44786b;
                                z = cVar2.mo33810z(cVar, Math.min(j, cVar2.mo36771I()));
                                C11916i iVar2 = C11916i.this;
                                long j2 = iVar2.f44768a + z;
                                iVar2.f44768a = j2;
                                if (th == null && j2 >= ((long) (iVar2.f44771d.f44681B.mo36239d() / 2))) {
                                    C11916i iVar3 = C11916i.this;
                                    iVar3.f44771d.mo36153E0(iVar3.f44770c, iVar3.f44768a);
                                    C11916i.this.f44768a = 0;
                                }
                            } else if (this.f44790f || th != null) {
                                z = -1;
                            } else {
                                C11916i.this.mo36209q();
                            }
                        } finally {
                            C11916i.this.f44776i.mo36213u();
                        }
                    }
                }
                C11916i.this.f44776i.mo36213u();
                if (z != -1) {
                    m57561f(z);
                    return z;
                } else if (th == null) {
                    return -1;
                } else {
                    throw th;
                }
            } else {
                throw new IllegalArgumentException("byteCount < 0: " + j);
            }
        }
    }

    /* renamed from: me.i$c */
    /* compiled from: Http2Stream */
    class C11919c extends C12226a {
        C11919c() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: o */
        public IOException mo36212o(IOException iOException) {
            SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
            if (iOException != null) {
                socketTimeoutException.initCause(iOException);
            }
            return socketTimeoutException;
        }

        /* access modifiers changed from: protected */
        /* renamed from: t */
        public void mo35747t() {
            C11916i.this.mo36198f(C11889b.CANCEL);
            C11916i.this.f44771d.mo36165d0();
        }

        /* renamed from: u */
        public void mo36213u() throws IOException {
            if (mo36756n()) {
                throw mo36212o((IOException) null);
            }
        }
    }

    C11916i(int i, C11895f fVar, boolean z, boolean z2, C10395w wVar) {
        ArrayDeque arrayDeque = new ArrayDeque();
        this.f44772e = arrayDeque;
        this.f44776i = new C11919c();
        this.f44777j = new C11919c();
        Objects.requireNonNull(fVar, "connection == null");
        this.f44770c = i;
        this.f44771d = fVar;
        this.f44769b = (long) fVar.f44682C.mo36239d();
        C11918b bVar = new C11918b((long) fVar.f44681B.mo36239d());
        this.f44774g = bVar;
        C11917a aVar = new C11917a();
        this.f44775h = aVar;
        bVar.f44790f = z2;
        aVar.f44783d = z;
        if (wVar != null) {
            arrayDeque.add(wVar);
        }
        if (mo36202j() && wVar != null) {
            throw new IllegalStateException("locally-initiated streams shouldn't have headers yet");
        } else if (!mo36202j() && wVar == null) {
            throw new IllegalStateException("remotely-initiated streams should have headers");
        }
    }

    /* renamed from: e */
    private boolean m57539e(C11889b bVar, IOException iOException) {
        synchronized (this) {
            if (this.f44778k != null) {
                return false;
            }
            if (this.f44774g.f44790f && this.f44775h.f44783d) {
                return false;
            }
            this.f44778k = bVar;
            this.f44779l = iOException;
            notifyAll();
            this.f44771d.mo36163c0(this.f44770c);
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo36194a(long j) {
        this.f44769b += j;
        if (j > 0) {
            notifyAll();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo36195b() throws IOException {
        boolean z;
        boolean k;
        synchronized (this) {
            C11918b bVar = this.f44774g;
            if (!bVar.f44790f && bVar.f44789e) {
                C11917a aVar = this.f44775h;
                if (aVar.f44783d || aVar.f44782c) {
                    z = true;
                    k = mo36203k();
                }
            }
            z = false;
            k = mo36203k();
        }
        if (z) {
            mo36197d(C11889b.CANCEL, (IOException) null);
        } else if (!k) {
            this.f44771d.mo36163c0(this.f44770c);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo36196c() throws IOException {
        C11917a aVar = this.f44775h;
        if (aVar.f44782c) {
            throw new IOException("stream closed");
        } else if (aVar.f44783d) {
            throw new IOException("stream finished");
        } else if (this.f44778k != null) {
            Throwable th = this.f44779l;
            if (th == null) {
                th = new C11926n(this.f44778k);
            }
            throw th;
        }
    }

    /* renamed from: d */
    public void mo36197d(C11889b bVar, IOException iOException) throws IOException {
        if (m57539e(bVar, iOException)) {
            this.f44771d.mo36175y0(this.f44770c, bVar);
        }
    }

    /* renamed from: f */
    public void mo36198f(C11889b bVar) {
        if (m57539e(bVar, (IOException) null)) {
            this.f44771d.mo36152B0(this.f44770c, bVar);
        }
    }

    /* renamed from: g */
    public int mo36199g() {
        return this.f44770c;
    }

    /* renamed from: h */
    public C12251s mo36200h() {
        synchronized (this) {
            if (!this.f44773f) {
                if (!mo36202j()) {
                    throw new IllegalStateException("reply before requesting the sink");
                }
            }
        }
        return this.f44775h;
    }

    /* renamed from: i */
    public C12252t mo36201i() {
        return this.f44774g;
    }

    /* renamed from: j */
    public boolean mo36202j() {
        if (this.f44771d.f44687a == ((this.f44770c & 1) == 1)) {
            return true;
        }
        return false;
    }

    /* renamed from: k */
    public synchronized boolean mo36203k() {
        if (this.f44778k != null) {
            return false;
        }
        C11918b bVar = this.f44774g;
        if (bVar.f44790f || bVar.f44789e) {
            C11917a aVar = this.f44775h;
            if ((aVar.f44783d || aVar.f44782c) && this.f44773f) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: l */
    public C12253u mo36204l() {
        return this.f44776i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public void mo36205m(C12234e eVar, int i) throws IOException {
        this.f44774g.mo36211b(eVar, (long) i);
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0018  */
    /* renamed from: n */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo36206n(p244ge.C10395w r3, boolean r4) {
        /*
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r2.f44773f     // Catch:{ all -> 0x002e }
            r1 = 1
            if (r0 == 0) goto L_0x000f
            if (r4 != 0) goto L_0x0009
            goto L_0x000f
        L_0x0009:
            me.i$b r0 = r2.f44774g     // Catch:{ all -> 0x002e }
            p244ge.C10395w unused = r0.f44788d = r3     // Catch:{ all -> 0x002e }
            goto L_0x0016
        L_0x000f:
            r2.f44773f = r1     // Catch:{ all -> 0x002e }
            java.util.Deque<ge.w> r0 = r2.f44772e     // Catch:{ all -> 0x002e }
            r0.add(r3)     // Catch:{ all -> 0x002e }
        L_0x0016:
            if (r4 == 0) goto L_0x001c
            me.i$b r3 = r2.f44774g     // Catch:{ all -> 0x002e }
            r3.f44790f = r1     // Catch:{ all -> 0x002e }
        L_0x001c:
            boolean r3 = r2.mo36203k()     // Catch:{ all -> 0x002e }
            r2.notifyAll()     // Catch:{ all -> 0x002e }
            monitor-exit(r2)     // Catch:{ all -> 0x002e }
            if (r3 != 0) goto L_0x002d
            me.f r3 = r2.f44771d
            int r4 = r2.f44770c
            r3.mo36163c0(r4)
        L_0x002d:
            return
        L_0x002e:
            r3 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x002e }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p300me.C11916i.mo36206n(ge.w, boolean):void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public synchronized void mo36207o(C11889b bVar) {
        if (this.f44778k == null) {
            this.f44778k = bVar;
            notifyAll();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x003a, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x003b, code lost:
        r2.f44776i.mo36213u();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0040, code lost:
        throw r0;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* renamed from: p */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized p244ge.C10395w mo36208p() throws java.io.IOException {
        /*
            r2 = this;
            monitor-enter(r2)
            me.i$c r0 = r2.f44776i     // Catch:{ all -> 0x0041 }
            r0.mo36753k()     // Catch:{ all -> 0x0041 }
        L_0x0006:
            java.util.Deque<ge.w> r0 = r2.f44772e     // Catch:{ all -> 0x003a }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x003a }
            if (r0 == 0) goto L_0x0016
            me.b r0 = r2.f44778k     // Catch:{ all -> 0x003a }
            if (r0 != 0) goto L_0x0016
            r2.mo36209q()     // Catch:{ all -> 0x003a }
            goto L_0x0006
        L_0x0016:
            me.i$c r0 = r2.f44776i     // Catch:{ all -> 0x0041 }
            r0.mo36213u()     // Catch:{ all -> 0x0041 }
            java.util.Deque<ge.w> r0 = r2.f44772e     // Catch:{ all -> 0x0041 }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x0041 }
            if (r0 != 0) goto L_0x002d
            java.util.Deque<ge.w> r0 = r2.f44772e     // Catch:{ all -> 0x0041 }
            java.lang.Object r0 = r0.removeFirst()     // Catch:{ all -> 0x0041 }
            ge.w r0 = (p244ge.C10395w) r0     // Catch:{ all -> 0x0041 }
            monitor-exit(r2)
            return r0
        L_0x002d:
            java.io.IOException r0 = r2.f44779l     // Catch:{ all -> 0x0041 }
            if (r0 == 0) goto L_0x0032
            goto L_0x0039
        L_0x0032:
            me.n r0 = new me.n     // Catch:{ all -> 0x0041 }
            me.b r1 = r2.f44778k     // Catch:{ all -> 0x0041 }
            r0.<init>(r1)     // Catch:{ all -> 0x0041 }
        L_0x0039:
            throw r0     // Catch:{ all -> 0x0041 }
        L_0x003a:
            r0 = move-exception
            me.i$c r1 = r2.f44776i     // Catch:{ all -> 0x0041 }
            r1.mo36213u()     // Catch:{ all -> 0x0041 }
            throw r0     // Catch:{ all -> 0x0041 }
        L_0x0041:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p300me.C11916i.mo36208p():ge.w");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public void mo36209q() throws InterruptedIOException {
        try {
            wait();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException();
        }
    }

    /* renamed from: r */
    public C12253u mo36210r() {
        return this.f44777j;
    }
}
