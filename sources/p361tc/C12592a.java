package p361tc;

import java.io.IOException;
import java.net.Socket;
import p182a7.C6431n;
import p187ad.C6573b;
import p187ad.C6574c;
import p264io.grpc.internal.C11160d2;
import p336qe.C12231c;
import p336qe.C12251s;
import p336qe.C12253u;
import p361tc.C12598b;
import p381vc.C12870a;
import p381vc.C12873c;
import p381vc.C12886i;

/* renamed from: tc.a */
/* compiled from: AsyncSink */
final class C12592a implements C12251s {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final Object f46164a = new Object();
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C12231c f46165b = new C12231c();

    /* renamed from: c */
    private final C11160d2 f46166c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final C12598b.C12599a f46167d;

    /* renamed from: e */
    private final int f46168e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public boolean f46169f = false;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public boolean f46170g = false;

    /* renamed from: h */
    private boolean f46171h = false;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public C12251s f46172i;
    /* access modifiers changed from: private */

    /* renamed from: r */
    public Socket f46173r;

    /* renamed from: s */
    private boolean f46174s;

    /* renamed from: t */
    private int f46175t;
    /* access modifiers changed from: private */

    /* renamed from: u */
    public int f46176u;

    /* renamed from: tc.a$a */
    /* compiled from: AsyncSink */
    class C12593a extends C12597e {

        /* renamed from: b */
        final C6573b f46177b = C6574c.m38139e();

        C12593a() {
            super(C12592a.this, (C12593a) null);
        }

        /* renamed from: a */
        public void mo37437a() throws IOException {
            int g;
            C6574c.m38140f("WriteRunnable.runWrite");
            C6574c.m38138d(this.f46177b);
            C12231c cVar = new C12231c();
            try {
                synchronized (C12592a.this.f46164a) {
                    cVar.mo35694k1(C12592a.this.f46165b, C12592a.this.f46165b.mo36794f());
                    boolean unused = C12592a.this.f46169f = false;
                    g = C12592a.this.f46176u;
                }
                C12592a.this.f46172i.mo35694k1(cVar, cVar.mo36771I());
                synchronized (C12592a.this.f46164a) {
                    C12592a.m59890h(C12592a.this, g);
                }
                C6574c.m38142h("WriteRunnable.runWrite");
            } catch (Throwable th) {
                C6574c.m38142h("WriteRunnable.runWrite");
                throw th;
            }
        }
    }

    /* renamed from: tc.a$b */
    /* compiled from: AsyncSink */
    class C12594b extends C12597e {

        /* renamed from: b */
        final C6573b f46179b = C6574c.m38139e();

        C12594b() {
            super(C12592a.this, (C12593a) null);
        }

        /* renamed from: a */
        public void mo37437a() throws IOException {
            C6574c.m38140f("WriteRunnable.runFlush");
            C6574c.m38138d(this.f46179b);
            C12231c cVar = new C12231c();
            try {
                synchronized (C12592a.this.f46164a) {
                    cVar.mo35694k1(C12592a.this.f46165b, C12592a.this.f46165b.mo36771I());
                    boolean unused = C12592a.this.f46170g = false;
                }
                C12592a.this.f46172i.mo35694k1(cVar, cVar.mo36771I());
                C12592a.this.f46172i.flush();
                C6574c.m38142h("WriteRunnable.runFlush");
            } catch (Throwable th) {
                C6574c.m38142h("WriteRunnable.runFlush");
                throw th;
            }
        }
    }

    /* renamed from: tc.a$c */
    /* compiled from: AsyncSink */
    class C12595c implements Runnable {
        C12595c() {
        }

        public void run() {
            try {
                if (C12592a.this.f46172i != null && C12592a.this.f46165b.mo36771I() > 0) {
                    C12592a.this.f46172i.mo35694k1(C12592a.this.f46165b, C12592a.this.f46165b.mo36771I());
                }
            } catch (IOException e) {
                C12592a.this.f46167d.mo37452e(e);
            }
            C12592a.this.f46165b.close();
            try {
                if (C12592a.this.f46172i != null) {
                    C12592a.this.f46172i.close();
                }
            } catch (IOException e2) {
                C12592a.this.f46167d.mo37452e(e2);
            }
            try {
                if (C12592a.this.f46173r != null) {
                    C12592a.this.f46173r.close();
                }
            } catch (IOException e3) {
                C12592a.this.f46167d.mo37452e(e3);
            }
        }
    }

    /* renamed from: tc.a$d */
    /* compiled from: AsyncSink */
    private class C12596d extends C12600c {
        public C12596d(C12873c cVar) {
            super(cVar);
        }

        /* renamed from: b1 */
        public void mo37439b1(C12886i iVar) throws IOException {
            C12592a.m59895t(C12592a.this);
            super.mo37439b1(iVar);
        }

        /* renamed from: i */
        public void mo37440i(boolean z, int i, int i2) throws IOException {
            if (z) {
                C12592a.m59895t(C12592a.this);
            }
            super.mo37440i(z, i, i2);
        }

        /* renamed from: r */
        public void mo37441r(int i, C12870a aVar) throws IOException {
            C12592a.m59895t(C12592a.this);
            super.mo37441r(i, aVar);
        }
    }

    /* renamed from: tc.a$e */
    /* compiled from: AsyncSink */
    private abstract class C12597e implements Runnable {
        private C12597e() {
        }

        /* renamed from: a */
        public abstract void mo37437a() throws IOException;

        public final void run() {
            try {
                if (C12592a.this.f46172i != null) {
                    mo37437a();
                    return;
                }
                throw new IOException("Unable to perform write due to unavailable sink.");
            } catch (Exception e) {
                C12592a.this.f46167d.mo37452e(e);
            }
        }

        /* synthetic */ C12597e(C12592a aVar, C12593a aVar2) {
            this();
        }
    }

    private C12592a(C11160d2 d2Var, C12598b.C12599a aVar, int i) {
        this.f46166c = (C11160d2) C6431n.m37562o(d2Var, "executor");
        this.f46167d = (C12598b.C12599a) C6431n.m37562o(aVar, "exceptionHandler");
        this.f46168e = i;
    }

    /* renamed from: D */
    static C12592a m59885D(C11160d2 d2Var, C12598b.C12599a aVar, int i) {
        return new C12592a(d2Var, aVar, i);
    }

    /* renamed from: h */
    static /* synthetic */ int m59890h(C12592a aVar, int i) {
        int i2 = aVar.f46176u - i;
        aVar.f46176u = i2;
        return i2;
    }

    /* renamed from: t */
    static /* synthetic */ int m59895t(C12592a aVar) {
        int i = aVar.f46175t;
        aVar.f46175t = i + 1;
        return i;
    }

    public void close() {
        if (!this.f46171h) {
            this.f46171h = true;
            this.f46166c.execute(new C12595c());
        }
    }

    public void flush() throws IOException {
        if (!this.f46171h) {
            C6574c.m38140f("AsyncSink.flush");
            try {
                synchronized (this.f46164a) {
                    if (this.f46170g) {
                        C6574c.m38142h("AsyncSink.flush");
                        return;
                    }
                    this.f46170g = true;
                    this.f46166c.execute(new C12594b());
                    C6574c.m38142h("AsyncSink.flush");
                }
            } catch (Throwable th) {
                C6574c.m38142h("AsyncSink.flush");
                throw th;
            }
        } else {
            throw new IOException("closed");
        }
    }

    /* renamed from: k1 */
    public void mo35694k1(C12231c cVar, long j) throws IOException {
        C6431n.m37562o(cVar, "source");
        if (!this.f46171h) {
            C6574c.m38140f("AsyncSink.write");
            try {
                synchronized (this.f46164a) {
                    this.f46165b.mo35694k1(cVar, j);
                    int i = this.f46176u + this.f46175t;
                    this.f46176u = i;
                    boolean z = false;
                    this.f46175t = 0;
                    if (!this.f46174s && i > this.f46168e) {
                        this.f46174s = true;
                        z = true;
                    } else if (!this.f46169f && !this.f46170g) {
                        if (this.f46165b.mo36794f() > 0) {
                            this.f46169f = true;
                        }
                    }
                    if (z) {
                        this.f46173r.close();
                    } else {
                        this.f46166c.execute(new C12593a());
                        C6574c.m38142h("AsyncSink.write");
                        return;
                    }
                }
            } catch (IOException e) {
                this.f46167d.mo37452e(e);
            } catch (Throwable th) {
                C6574c.m38142h("AsyncSink.write");
                throw th;
            }
            C6574c.m38142h("AsyncSink.write");
            return;
        }
        throw new IOException("closed");
    }

    /* renamed from: o */
    public C12253u mo36029o() {
        return C12253u.f45422d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: w */
    public void mo37435w(C12251s sVar, Socket socket) {
        C6431n.m37568u(this.f46172i == null, "AsyncSink's becomeConnected should only be called once.");
        this.f46172i = (C12251s) C6431n.m37562o(sVar, "sink");
        this.f46173r = (Socket) C6431n.m37562o(socket, "socket");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: x */
    public C12873c mo37436x(C12873c cVar) {
        return new C12596d(cVar);
    }
}
