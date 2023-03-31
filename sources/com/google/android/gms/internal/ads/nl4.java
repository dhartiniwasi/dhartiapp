package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class nl4 extends HandlerThread implements Handler.Callback {

    /* renamed from: a */
    private bg1 f14106a;

    /* renamed from: b */
    private Handler f14107b;

    /* renamed from: c */
    private Error f14108c;

    /* renamed from: d */
    private RuntimeException f14109d;

    /* renamed from: e */
    private pl4 f14110e;

    public nl4() {
        super("ExoPlayer:PlaceholderSurface");
    }

    /* renamed from: a */
    public final pl4 mo12659a(int i) {
        boolean z;
        start();
        this.f14107b = new Handler(getLooper(), this);
        this.f14106a = new bg1(this.f14107b, (af1) null);
        synchronized (this) {
            z = false;
            this.f14107b.obtainMessage(1, i, 0).sendToTarget();
            while (this.f14110e == null && this.f14109d == null && this.f14108c == null) {
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
        RuntimeException runtimeException = this.f14109d;
        if (runtimeException == null) {
            Error error = this.f14108c;
            if (error == null) {
                pl4 pl4 = this.f14110e;
                Objects.requireNonNull(pl4);
                return pl4;
            }
            throw error;
        }
        throw runtimeException;
    }

    /* renamed from: b */
    public final void mo12660b() {
        Handler handler = this.f14107b;
        Objects.requireNonNull(handler);
        handler.sendEmptyMessage(2);
    }

    public final boolean handleMessage(Message message) {
        int i = message.what;
        if (i == 1) {
            try {
                int i2 = message.arg1;
                bg1 bg1 = this.f14106a;
                Objects.requireNonNull(bg1);
                bg1.mo8780b(i2);
                this.f14110e = new pl4(this, this.f14106a.mo8779a(), i2 != 0, (ol4) null);
                synchronized (this) {
                    notify();
                }
            } catch (RuntimeException e) {
                ot1.m18058c("PlaceholderSurface", "Failed to initialize placeholder surface", e);
                this.f14109d = e;
                synchronized (this) {
                    notify();
                }
            } catch (ch1 e2) {
                ot1.m18058c("PlaceholderSurface", "Failed to initialize placeholder surface", e2);
                this.f14109d = new IllegalStateException(e2);
                synchronized (this) {
                    notify();
                }
            } catch (Error e3) {
                try {
                    ot1.m18058c("PlaceholderSurface", "Failed to initialize placeholder surface", e3);
                    this.f14108c = e3;
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
                bg1 bg12 = this.f14106a;
                Objects.requireNonNull(bg12);
                bg12.mo8781c();
            } catch (Throwable th2) {
                quit();
                throw th2;
            }
            quit();
            return true;
        }
    }
}
