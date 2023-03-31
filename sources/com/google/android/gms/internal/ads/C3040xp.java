package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Log;
import com.facebook.ads.AdError;
import java.io.IOException;

/* renamed from: com.google.android.gms.internal.ads.xp */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class C3040xp extends Handler implements Runnable {

    /* renamed from: a */
    private final C3077yp f20292a;

    /* renamed from: b */
    private final C3003wp f20293b;

    /* renamed from: c */
    public final int f20294c;

    /* renamed from: d */
    private final long f20295d;

    /* renamed from: e */
    private IOException f20296e;

    /* renamed from: f */
    private int f20297f;

    /* renamed from: g */
    private volatile Thread f20298g;

    /* renamed from: h */
    private volatile boolean f20299h;

    /* renamed from: i */
    final /* synthetic */ C2261cq f20300i;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C3040xp(C2261cq cqVar, Looper looper, C3077yp ypVar, C3003wp wpVar, int i, long j) {
        super(looper);
        this.f20300i = cqVar;
        this.f20292a = ypVar;
        this.f20293b = wpVar;
        this.f20294c = i;
        this.f20295d = j;
    }

    /* renamed from: d */
    private final void m23471d() {
        this.f20296e = null;
        C2261cq cqVar = this.f20300i;
        cqVar.f7866a.execute(cqVar.f7867b);
    }

    /* renamed from: a */
    public final void mo15209a(boolean z) {
        this.f20299h = z;
        this.f20296e = null;
        if (hasMessages(0)) {
            removeMessages(0);
            if (!z) {
                sendEmptyMessage(1);
                return;
            }
        } else {
            this.f20292a.mo14547d();
            if (this.f20298g != null) {
                this.f20298g.interrupt();
            }
            if (!z) {
                return;
            }
        }
        this.f20300i.f7867b = null;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        this.f20293b.mo14963b(this.f20292a, elapsedRealtime, elapsedRealtime - this.f20295d, true);
    }

    /* renamed from: b */
    public final void mo15210b(int i) throws IOException {
        IOException iOException = this.f20296e;
        if (iOException != null && this.f20297f > i) {
            throw iOException;
        }
    }

    /* renamed from: c */
    public final void mo15211c(long j) {
        C2335eq.m12245e(this.f20300i.f7867b == null);
        this.f20300i.f7867b = this;
        if (j > 0) {
            sendEmptyMessageDelayed(0, j);
        } else {
            m23471d();
        }
    }

    public final void handleMessage(Message message) {
        if (!this.f20299h) {
            int i = message.what;
            if (i == 0) {
                m23471d();
            } else if (i != 4) {
                this.f20300i.f7867b = null;
                long elapsedRealtime = SystemClock.elapsedRealtime();
                long j = elapsedRealtime - this.f20295d;
                if (this.f20292a.mo14545a()) {
                    this.f20293b.mo14963b(this.f20292a, elapsedRealtime, j, false);
                    return;
                }
                int i2 = message.what;
                int i3 = 1;
                if (i2 == 1) {
                    this.f20293b.mo14963b(this.f20292a, elapsedRealtime, j, false);
                } else if (i2 == 2) {
                    this.f20293b.mo14964e(this.f20292a, elapsedRealtime, j);
                } else if (i2 == 3) {
                    IOException iOException = (IOException) message.obj;
                    this.f20296e = iOException;
                    int f = this.f20293b.mo14965f(this.f20292a, elapsedRealtime, j, iOException);
                    if (f == 3) {
                        this.f20300i.f7868c = this.f20296e;
                    } else if (f != 2) {
                        if (f != 1) {
                            i3 = 1 + this.f20297f;
                        }
                        this.f20297f = i3;
                        mo15211c((long) Math.min((i3 - 1) * AdError.NETWORK_ERROR_CODE, 5000));
                    }
                }
            } else {
                throw ((Error) message.obj);
            }
        }
    }

    public final void run() {
        try {
            this.f20298g = Thread.currentThread();
            if (!this.f20292a.mo14545a()) {
                String simpleName = this.f20292a.getClass().getSimpleName();
                C2819rq.m19992a("load:" + simpleName);
                this.f20292a.mo14548e();
                C2819rq.m19993b();
            }
            if (!this.f20299h) {
                sendEmptyMessage(2);
            }
        } catch (IOException e) {
            if (!this.f20299h) {
                obtainMessage(3, e).sendToTarget();
            }
        } catch (InterruptedException unused) {
            C2335eq.m12245e(this.f20292a.mo14545a());
            if (!this.f20299h) {
                sendEmptyMessage(2);
            }
        } catch (Exception e2) {
            Log.e("LoadTask", "Unexpected exception loading stream", e2);
            if (!this.f20299h) {
                obtainMessage(3, new C3114zp(e2)).sendToTarget();
            }
        } catch (OutOfMemoryError e3) {
            Log.e("LoadTask", "OutOfMemory error loading stream", e3);
            if (!this.f20299h) {
                obtainMessage(3, new C3114zp(e3)).sendToTarget();
            }
        } catch (Error e4) {
            Log.e("LoadTask", "Unexpected error loading stream", e4);
            if (!this.f20299h) {
                obtainMessage(4, e4).sendToTarget();
            }
            throw e4;
        } catch (Throwable th) {
            C2819rq.m19993b();
            throw th;
        }
    }
}
