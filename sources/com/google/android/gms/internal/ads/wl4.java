package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.view.Choreographer;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class wl4 implements Choreographer.FrameCallback, Handler.Callback {

    /* renamed from: f */
    private static final wl4 f19713f = new wl4();

    /* renamed from: a */
    public volatile long f19714a = -9223372036854775807L;

    /* renamed from: b */
    private final Handler f19715b;

    /* renamed from: c */
    private final HandlerThread f19716c;

    /* renamed from: d */
    private Choreographer f19717d;

    /* renamed from: e */
    private int f19718e;

    private wl4() {
        HandlerThread handlerThread = new HandlerThread("ExoPlayer:FrameReleaseChoreographer");
        this.f19716c = handlerThread;
        handlerThread.start();
        Handler c = gb2.m13161c(handlerThread.getLooper(), this);
        this.f19715b = c;
        c.sendEmptyMessage(0);
    }

    /* renamed from: a */
    public static wl4 m22856a() {
        return f19713f;
    }

    /* renamed from: b */
    public final void mo14949b() {
        this.f19715b.sendEmptyMessage(1);
    }

    /* renamed from: c */
    public final void mo14950c() {
        this.f19715b.sendEmptyMessage(2);
    }

    public final void doFrame(long j) {
        this.f19714a = j;
        Choreographer choreographer = this.f19717d;
        Objects.requireNonNull(choreographer);
        choreographer.postFrameCallbackDelayed(this, 500);
    }

    public final boolean handleMessage(Message message) {
        int i = message.what;
        if (i == 0) {
            try {
                this.f19717d = Choreographer.getInstance();
            } catch (RuntimeException e) {
                ot1.m18061f("VideoFrameReleaseHelper", "Vsync sampling disabled due to platform error", e);
            }
            return true;
        } else if (i == 1) {
            Choreographer choreographer = this.f19717d;
            if (choreographer != null) {
                int i2 = this.f19718e + 1;
                this.f19718e = i2;
                if (i2 == 1) {
                    choreographer.postFrameCallback(this);
                }
            }
            return true;
        } else if (i != 2) {
            return false;
        } else {
            Choreographer choreographer2 = this.f19717d;
            if (choreographer2 != null) {
                int i3 = this.f19718e - 1;
                this.f19718e = i3;
                if (i3 == 0) {
                    choreographer2.removeFrameCallback(this);
                    this.f19714a = -9223372036854775807L;
                }
            }
            return true;
        }
    }
}
