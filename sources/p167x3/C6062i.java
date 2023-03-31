package p167x3;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.view.Surface;
import p161w3.C5917a;
import p161w3.C5941j;
import p161w3.C5951m;
import p161w3.C5961r;

/* renamed from: x3.i */
/* compiled from: PlaceholderSurface */
public final class C6062i extends Surface {

    /* renamed from: d */
    private static int f29405d;

    /* renamed from: e */
    private static boolean f29406e;

    /* renamed from: a */
    public final boolean f29407a;

    /* renamed from: b */
    private final C6064b f29408b;

    /* renamed from: c */
    private boolean f29409c;

    /* renamed from: x3.i$b */
    /* compiled from: PlaceholderSurface */
    private static class C6064b extends HandlerThread implements Handler.Callback {

        /* renamed from: a */
        private C5941j f29410a;

        /* renamed from: b */
        private Handler f29411b;

        /* renamed from: c */
        private Error f29412c;

        /* renamed from: d */
        private RuntimeException f29413d;

        /* renamed from: e */
        private C6062i f29414e;

        public C6064b() {
            super("ExoPlayer:PlaceholderSurface");
        }

        /* renamed from: b */
        private void m35592b(int i) {
            C5917a.m34872e(this.f29410a);
            this.f29410a.mo20629h(i);
            this.f29414e = new C6062i(this, this.f29410a.mo20628g(), i != 0);
        }

        /* renamed from: d */
        private void m35593d() {
            C5917a.m34872e(this.f29410a);
            this.f29410a.mo20630i();
        }

        /* renamed from: a */
        public C6062i mo20827a(int i) {
            boolean z;
            start();
            this.f29411b = new Handler(getLooper(), this);
            this.f29410a = new C5941j(this.f29411b);
            synchronized (this) {
                z = false;
                this.f29411b.obtainMessage(1, i, 0).sendToTarget();
                while (this.f29414e == null && this.f29413d == null && this.f29412c == null) {
                    try {
                        wait();
                    } catch (InterruptedException unused) {
                        z = true;
                    }
                }
            }
            if (z) {
                Thread.currentThread().interrupt();
            }
            RuntimeException runtimeException = this.f29413d;
            if (runtimeException == null) {
                Error error = this.f29412c;
                if (error == null) {
                    return (C6062i) C5917a.m34872e(this.f29414e);
                }
                throw error;
            }
            throw runtimeException;
        }

        /* renamed from: c */
        public void mo20828c() {
            C5917a.m34872e(this.f29411b);
            this.f29411b.sendEmptyMessage(2);
        }

        public boolean handleMessage(Message message) {
            int i = message.what;
            if (i == 1) {
                try {
                    m35592b(message.arg1);
                    synchronized (this) {
                        notify();
                    }
                } catch (RuntimeException e) {
                    C5961r.m35210d("PlaceholderSurface", "Failed to initialize placeholder surface", e);
                    this.f29413d = e;
                    synchronized (this) {
                        notify();
                    }
                } catch (Error e2) {
                    try {
                        C5961r.m35210d("PlaceholderSurface", "Failed to initialize placeholder surface", e2);
                        this.f29412c = e2;
                        synchronized (this) {
                            notify();
                        }
                    } catch (Throwable th) {
                        synchronized (this) {
                            notify();
                            throw th;
                        }
                    }
                }
                return true;
            } else if (i != 2) {
                return true;
            } else {
                try {
                    m35593d();
                } catch (Throwable th2) {
                    quit();
                    throw th2;
                }
                quit();
                return true;
            }
        }
    }

    /* renamed from: a */
    private static int m35589a(Context context) {
        if (C5951m.m35065b(context)) {
            return C5951m.m35066c() ? 1 : 2;
        }
        return 0;
    }

    /* renamed from: b */
    public static synchronized boolean m35590b(Context context) {
        boolean z;
        synchronized (C6062i.class) {
            z = true;
            if (!f29406e) {
                f29405d = m35589a(context);
                f29406e = true;
            }
            if (f29405d == 0) {
                z = false;
            }
        }
        return z;
    }

    /* renamed from: c */
    public static C6062i m35591c(Context context, boolean z) {
        int i = 0;
        C5917a.m34873f(!z || m35590b(context));
        C6064b bVar = new C6064b();
        if (z) {
            i = f29405d;
        }
        return bVar.mo20827a(i);
    }

    public void release() {
        super.release();
        synchronized (this.f29408b) {
            if (!this.f29409c) {
                this.f29408b.mo20828c();
                this.f29409c = true;
            }
        }
    }

    private C6062i(C6064b bVar, SurfaceTexture surfaceTexture, boolean z) {
        super(surfaceTexture);
        this.f29408b = bVar;
        this.f29407a = z;
    }
}
