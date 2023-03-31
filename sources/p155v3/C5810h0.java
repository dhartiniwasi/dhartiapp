package p155v3;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.ads.AdError;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
import p161w3.C5917a;
import p161w3.C5945j0;
import p161w3.C5953m0;
import p161w3.C5961r;

/* renamed from: v3.h0 */
/* compiled from: Loader */
public final class C5810h0 implements C5820i0 {

    /* renamed from: d */
    public static final C5813c f28821d = m34569h(false, -9223372036854775807L);

    /* renamed from: e */
    public static final C5813c f28822e = m34569h(true, -9223372036854775807L);

    /* renamed from: f */
    public static final C5813c f28823f = new C5813c(2, -9223372036854775807L);

    /* renamed from: g */
    public static final C5813c f28824g = new C5813c(3, -9223372036854775807L);
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final ExecutorService f28825a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public C5814d<? extends C5815e> f28826b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public IOException f28827c;

    /* renamed from: v3.h0$b */
    /* compiled from: Loader */
    public interface C5812b<T extends C5815e> {
        /* renamed from: j */
        void mo6780j(T t, long j, long j2);

        /* renamed from: o */
        C5813c mo6783o(T t, long j, long j2, IOException iOException, int i);

        /* renamed from: q */
        void mo6784q(T t, long j, long j2, boolean z);
    }

    /* renamed from: v3.h0$c */
    /* compiled from: Loader */
    public static final class C5813c {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public final int f28828a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public final long f28829b;

        /* renamed from: c */
        public boolean mo20342c() {
            int i = this.f28828a;
            return i == 0 || i == 1;
        }

        private C5813c(int i, long j) {
            this.f28828a = i;
            this.f28829b = j;
        }
    }

    /* renamed from: v3.h0$d */
    /* compiled from: Loader */
    private final class C5814d<T extends C5815e> extends Handler implements Runnable {

        /* renamed from: a */
        public final int f28830a;

        /* renamed from: b */
        private final T f28831b;

        /* renamed from: c */
        private final long f28832c;

        /* renamed from: d */
        private C5812b<T> f28833d;

        /* renamed from: e */
        private IOException f28834e;

        /* renamed from: f */
        private int f28835f;

        /* renamed from: g */
        private Thread f28836g;

        /* renamed from: h */
        private boolean f28837h;

        /* renamed from: i */
        private volatile boolean f28838i;

        public C5814d(Looper looper, T t, C5812b<T> bVar, int i, long j) {
            super(looper);
            this.f28831b = t;
            this.f28833d = bVar;
            this.f28830a = i;
            this.f28832c = j;
        }

        /* renamed from: b */
        private void m34585b() {
            this.f28834e = null;
            C5810h0.this.f28825a.execute((Runnable) C5917a.m34872e(C5810h0.this.f28826b));
        }

        /* renamed from: c */
        private void m34586c() {
            C5814d unused = C5810h0.this.f28826b = null;
        }

        /* renamed from: d */
        private long m34587d() {
            return (long) Math.min((this.f28835f - 1) * AdError.NETWORK_ERROR_CODE, 5000);
        }

        /* renamed from: a */
        public void mo20343a(boolean z) {
            this.f28838i = z;
            this.f28834e = null;
            if (hasMessages(0)) {
                this.f28837h = true;
                removeMessages(0);
                if (!z) {
                    sendEmptyMessage(1);
                }
            } else {
                synchronized (this) {
                    this.f28837h = true;
                    this.f28831b.mo6787c();
                    Thread thread = this.f28836g;
                    if (thread != null) {
                        thread.interrupt();
                    }
                }
            }
            if (z) {
                m34586c();
                long elapsedRealtime = SystemClock.elapsedRealtime();
                ((C5812b) C5917a.m34872e(this.f28833d)).mo6784q(this.f28831b, elapsedRealtime, elapsedRealtime - this.f28832c, true);
                this.f28833d = null;
            }
        }

        /* renamed from: e */
        public void mo20344e(int i) throws IOException {
            IOException iOException = this.f28834e;
            if (iOException != null && this.f28835f > i) {
                throw iOException;
            }
        }

        /* renamed from: f */
        public void mo20345f(long j) {
            C5917a.m34873f(C5810h0.this.f28826b == null);
            C5814d unused = C5810h0.this.f28826b = this;
            if (j > 0) {
                sendEmptyMessageDelayed(0, j);
            } else {
                m34585b();
            }
        }

        public void handleMessage(Message message) {
            long j;
            if (!this.f28838i) {
                int i = message.what;
                if (i == 0) {
                    m34585b();
                } else if (i != 3) {
                    m34586c();
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    long j2 = elapsedRealtime - this.f28832c;
                    C5812b bVar = (C5812b) C5917a.m34872e(this.f28833d);
                    if (this.f28837h) {
                        bVar.mo6784q(this.f28831b, elapsedRealtime, j2, false);
                        return;
                    }
                    int i2 = message.what;
                    if (i2 == 1) {
                        try {
                            bVar.mo6780j(this.f28831b, elapsedRealtime, j2);
                        } catch (RuntimeException e) {
                            C5961r.m35210d("LoadTask", "Unexpected exception handling load completed", e);
                            IOException unused = C5810h0.this.f28827c = new C5818h(e);
                        }
                    } else if (i2 == 2) {
                        IOException iOException = (IOException) message.obj;
                        this.f28834e = iOException;
                        int i3 = this.f28835f + 1;
                        this.f28835f = i3;
                        C5813c o = bVar.mo6783o(this.f28831b, elapsedRealtime, j2, iOException, i3);
                        if (o.f28828a == 3) {
                            IOException unused2 = C5810h0.this.f28827c = this.f28834e;
                        } else if (o.f28828a != 2) {
                            if (o.f28828a == 1) {
                                this.f28835f = 1;
                            }
                            if (o.f28829b != -9223372036854775807L) {
                                j = o.f28829b;
                            } else {
                                j = m34587d();
                            }
                            mo20345f(j);
                        }
                    }
                } else {
                    throw ((Error) message.obj);
                }
            }
        }

        public void run() {
            boolean z;
            try {
                synchronized (this) {
                    z = !this.f28837h;
                    this.f28836g = Thread.currentThread();
                }
                if (z) {
                    C5945j0.m35044a("load:" + this.f28831b.getClass().getSimpleName());
                    this.f28831b.mo6786b();
                    C5945j0.m35046c();
                }
                synchronized (this) {
                    this.f28836g = null;
                    Thread.interrupted();
                }
                if (!this.f28838i) {
                    sendEmptyMessage(1);
                }
            } catch (IOException e) {
                if (!this.f28838i) {
                    obtainMessage(2, e).sendToTarget();
                }
            } catch (Exception e2) {
                if (!this.f28838i) {
                    C5961r.m35210d("LoadTask", "Unexpected exception loading stream", e2);
                    obtainMessage(2, new C5818h(e2)).sendToTarget();
                }
            } catch (OutOfMemoryError e3) {
                if (!this.f28838i) {
                    C5961r.m35210d("LoadTask", "OutOfMemory error loading stream", e3);
                    obtainMessage(2, new C5818h(e3)).sendToTarget();
                }
            } catch (Error e4) {
                if (!this.f28838i) {
                    C5961r.m35210d("LoadTask", "Unexpected error loading stream", e4);
                    obtainMessage(3, e4).sendToTarget();
                }
                throw e4;
            } catch (Throwable th) {
                C5945j0.m35046c();
                throw th;
            }
        }
    }

    /* renamed from: v3.h0$e */
    /* compiled from: Loader */
    public interface C5815e {
        /* renamed from: b */
        void mo6786b() throws IOException;

        /* renamed from: c */
        void mo6787c();
    }

    /* renamed from: v3.h0$f */
    /* compiled from: Loader */
    public interface C5816f {
        /* renamed from: a */
        void mo6772a();
    }

    /* renamed from: v3.h0$g */
    /* compiled from: Loader */
    private static final class C5817g implements Runnable {

        /* renamed from: a */
        private final C5816f f28840a;

        public C5817g(C5816f fVar) {
            this.f28840a = fVar;
        }

        public void run() {
            this.f28840a.mo6772a();
        }
    }

    /* renamed from: v3.h0$h */
    /* compiled from: Loader */
    public static final class C5818h extends IOException {
        public C5818h(Throwable th) {
            super("Unexpected " + th.getClass().getSimpleName() + ": " + th.getMessage(), th);
        }
    }

    public C5810h0(String str) {
        this.f28825a = C5953m0.m35073C0("ExoPlayer:Loader:" + str);
    }

    /* renamed from: h */
    public static C5813c m34569h(boolean z, long j) {
        return new C5813c(z ? 1 : 0, j);
    }

    /* renamed from: b */
    public void mo7740b() throws IOException {
        mo20338k(RecyclerView.UNDEFINED_DURATION);
    }

    /* renamed from: f */
    public void mo20334f() {
        ((C5814d) C5917a.m34875h(this.f28826b)).mo20343a(false);
    }

    /* renamed from: g */
    public void mo20335g() {
        this.f28827c = null;
    }

    /* renamed from: i */
    public boolean mo20336i() {
        return this.f28827c != null;
    }

    /* renamed from: j */
    public boolean mo20337j() {
        return this.f28826b != null;
    }

    /* renamed from: k */
    public void mo20338k(int i) throws IOException {
        IOException iOException = this.f28827c;
        if (iOException == null) {
            C5814d<? extends C5815e> dVar = this.f28826b;
            if (dVar != null) {
                if (i == Integer.MIN_VALUE) {
                    i = dVar.f28830a;
                }
                dVar.mo20344e(i);
                return;
            }
            return;
        }
        throw iOException;
    }

    /* renamed from: l */
    public void mo20339l() {
        mo20340m((C5816f) null);
    }

    /* renamed from: m */
    public void mo20340m(C5816f fVar) {
        C5814d<? extends C5815e> dVar = this.f28826b;
        if (dVar != null) {
            dVar.mo20343a(true);
        }
        if (fVar != null) {
            this.f28825a.execute(new C5817g(fVar));
        }
        this.f28825a.shutdown();
    }

    /* renamed from: n */
    public <T extends C5815e> long mo20341n(T t, C5812b<T> bVar, int i) {
        this.f28827c = null;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        new C5814d((Looper) C5917a.m34875h(Looper.myLooper()), t, bVar, i, elapsedRealtime).mo20345f(0);
        return elapsedRealtime;
    }
}
