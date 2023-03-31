package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.MotionEvent;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class n00 {

    /* renamed from: a */
    private MotionEvent f13738a = MotionEvent.obtain(0, 0, 1, 0.0f, 0.0f, 0);

    /* renamed from: b */
    private MotionEvent f13739b = MotionEvent.obtain(0, 0, 0, 0.0f, 0.0f, 0);

    /* renamed from: c */
    private final Context f13740c;

    /* renamed from: d */
    private final ScheduledExecutorService f13741d;

    /* renamed from: e */
    private final yy2 f13742e;

    /* renamed from: f */
    private final p00 f13743f;

    public n00(Context context, ScheduledExecutorService scheduledExecutorService, p00 p00, yy2 yy2, byte[] bArr) {
        this.f13740c = context;
        this.f13741d = scheduledExecutorService;
        this.f13743f = p00;
        this.f13742e = yy2;
    }

    /* renamed from: a */
    public final lf3 mo12474a() {
        return (se3) cf3.m10917o(se3.m20287D(cf3.m10911i((Object) null)), ((Long) d10.f8016c.mo13438e()).longValue(), TimeUnit.MILLISECONDS, this.f13741d);
    }

    /* renamed from: b */
    public final void mo12475b(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1 && motionEvent.getEventTime() > this.f13738a.getEventTime()) {
            this.f13738a = MotionEvent.obtain(motionEvent);
        } else if (motionEvent.getAction() == 0 && motionEvent.getEventTime() > this.f13739b.getEventTime()) {
            this.f13739b = MotionEvent.obtain(motionEvent);
        }
    }
}
