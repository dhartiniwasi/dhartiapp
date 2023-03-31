package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.view.Choreographer;

/* renamed from: com.google.android.gms.internal.ads.er */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class C2336er implements Choreographer.FrameCallback, Handler.Callback {

    /* renamed from: f */
    private static final C2336er f8895f = new C2336er();

    /* renamed from: a */
    public volatile long f8896a;

    /* renamed from: b */
    private final Handler f8897b;

    /* renamed from: c */
    private final HandlerThread f8898c;

    /* renamed from: d */
    private Choreographer f8899d;

    /* renamed from: e */
    private int f8900e;

    private C2336er() {
        HandlerThread handlerThread = new HandlerThread("ChoreographerOwner:Handler");
        this.f8898c = handlerThread;
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper(), this);
        this.f8897b = handler;
        handler.sendEmptyMessage(0);
    }

    /* renamed from: a */
    public static C2336er m12250a() {
        return f8895f;
    }

    /* renamed from: b */
    public final void mo9996b() {
        this.f8897b.sendEmptyMessage(1);
    }

    /* renamed from: c */
    public final void mo9997c() {
        this.f8897b.sendEmptyMessage(2);
    }

    public final void doFrame(long j) {
        this.f8896a = j;
        this.f8899d.postFrameCallbackDelayed(this, 500);
    }

    public final boolean handleMessage(Message message) {
        int i = message.what;
        if (i == 0) {
            this.f8899d = Choreographer.getInstance();
            return true;
        } else if (i == 1) {
            int i2 = this.f8900e + 1;
            this.f8900e = i2;
            if (i2 == 1) {
                this.f8899d.postFrameCallback(this);
            }
            return true;
        } else if (i != 2) {
            return false;
        } else {
            int i3 = this.f8900e - 1;
            this.f8900e = i3;
            if (i3 == 0) {
                this.f8899d.removeFrameCallback(this);
                this.f8896a = 0;
            }
            return true;
        }
    }
}
