package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.os.Trace;
import com.facebook.ads.AdError;
import java.io.IOException;
import java.util.Objects;
import java.util.concurrent.ExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class wk4 extends Handler implements Runnable {

    /* renamed from: a */
    private final xk4 f19691a;

    /* renamed from: b */
    private final long f19692b;

    /* renamed from: c */
    private tk4 f19693c;

    /* renamed from: d */
    private IOException f19694d;

    /* renamed from: e */
    private int f19695e;

    /* renamed from: f */
    private Thread f19696f;

    /* renamed from: g */
    private boolean f19697g;

    /* renamed from: h */
    private volatile boolean f19698h;

    /* renamed from: i */
    final /* synthetic */ bl4 f19699i;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public wk4(bl4 bl4, Looper looper, xk4 xk4, tk4 tk4, int i, long j) {
        super(looper);
        this.f19699i = bl4;
        this.f19691a = xk4;
        this.f19693c = tk4;
        this.f19692b = j;
    }

    /* renamed from: d */
    private final void m22837d() {
        this.f19694d = null;
        bl4 bl4 = this.f19699i;
        ExecutorService d = bl4.f7348a;
        wk4 c = bl4.f7349b;
        Objects.requireNonNull(c);
        d.execute(c);
    }

    /* renamed from: a */
    public final void mo14943a(boolean z) {
        this.f19698h = z;
        this.f19694d = null;
        if (hasMessages(0)) {
            this.f19697g = true;
            removeMessages(0);
            if (!z) {
                sendEmptyMessage(1);
            }
        } else {
            synchronized (this) {
                this.f19697g = true;
                this.f19691a.mo11403c();
                Thread thread = this.f19696f;
                if (thread != null) {
                    thread.interrupt();
                }
            }
        }
        if (z) {
            this.f19699i.f7349b = null;
            long elapsedRealtime = SystemClock.elapsedRealtime();
            tk4 tk4 = this.f19693c;
            Objects.requireNonNull(tk4);
            tk4.mo12924k(this.f19691a, elapsedRealtime, elapsedRealtime - this.f19692b, true);
            this.f19693c = null;
        }
    }

    /* renamed from: b */
    public final void mo14944b(int i) throws IOException {
        IOException iOException = this.f19694d;
        if (iOException != null && this.f19695e > i) {
            throw iOException;
        }
    }

    /* renamed from: c */
    public final void mo14945c(long j) {
        v91.m22052f(this.f19699i.f7349b == null);
        this.f19699i.f7349b = this;
        if (j > 0) {
            sendEmptyMessageDelayed(0, j);
        } else {
            m22837d();
        }
    }

    public final void handleMessage(Message message) {
        long j;
        if (!this.f19698h) {
            int i = message.what;
            if (i == 0) {
                m22837d();
            } else if (i != 3) {
                this.f19699i.f7349b = null;
                long elapsedRealtime = SystemClock.elapsedRealtime();
                long j2 = elapsedRealtime - this.f19692b;
                tk4 tk4 = this.f19693c;
                Objects.requireNonNull(tk4);
                if (this.f19697g) {
                    tk4.mo12924k(this.f19691a, elapsedRealtime, j2, false);
                    return;
                }
                int i2 = message.what;
                if (i2 == 1) {
                    try {
                        tk4.mo12923i(this.f19691a, elapsedRealtime, j2);
                    } catch (RuntimeException e) {
                        ot1.m18058c("LoadTask", "Unexpected exception handling load completed", e);
                        this.f19699i.f7350c = new al4(e);
                    }
                } else if (i2 == 2) {
                    IOException iOException = (IOException) message.obj;
                    this.f19694d = iOException;
                    int i3 = this.f19695e + 1;
                    this.f19695e = i3;
                    vk4 h = tk4.mo12922h(this.f19691a, elapsedRealtime, j2, iOException, i3);
                    if (h.f19142a == 3) {
                        this.f19699i.f7350c = this.f19694d;
                    } else if (h.f19142a != 2) {
                        if (h.f19142a == 1) {
                            this.f19695e = 1;
                        }
                        if (h.f19143b != -9223372036854775807L) {
                            j = h.f19143b;
                        } else {
                            j = (long) Math.min((this.f19695e - 1) * AdError.NETWORK_ERROR_CODE, 5000);
                        }
                        mo14945c(j);
                    }
                }
            } else {
                throw ((Error) message.obj);
            }
        }
    }

    public final void run() {
        boolean z;
        try {
            synchronized (this) {
                z = !this.f19697g;
                this.f19696f = Thread.currentThread();
            }
            if (z) {
                int i = gb2.f9812a;
                Trace.beginSection("load:" + this.f19691a.getClass().getSimpleName());
                this.f19691a.mo11402U();
                Trace.endSection();
            }
            synchronized (this) {
                this.f19696f = null;
                Thread.interrupted();
            }
            if (!this.f19698h) {
                sendEmptyMessage(1);
            }
        } catch (IOException e) {
            if (!this.f19698h) {
                obtainMessage(2, e).sendToTarget();
            }
        } catch (Exception e2) {
            if (!this.f19698h) {
                ot1.m18058c("LoadTask", "Unexpected exception loading stream", e2);
                obtainMessage(2, new al4(e2)).sendToTarget();
            }
        } catch (OutOfMemoryError e3) {
            if (!this.f19698h) {
                ot1.m18058c("LoadTask", "OutOfMemory error loading stream", e3);
                obtainMessage(2, new al4(e3)).sendToTarget();
            }
        } catch (Error e4) {
            if (!this.f19698h) {
                ot1.m18058c("LoadTask", "Unexpected error loading stream", e4);
                obtainMessage(3, e4).sendToTarget();
            }
            throw e4;
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }
}
