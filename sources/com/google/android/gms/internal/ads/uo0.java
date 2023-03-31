package com.google.android.gms.internal.ads;

import android.graphics.SurfaceTexture;
import java.util.concurrent.TimeUnit;
import p060h4.C4596v;
import p073j4.C4751b2;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class uo0 {

    /* renamed from: a */
    private final long f18651a = TimeUnit.MILLISECONDS.toNanos(((Long) C4596v.m30088c().mo12227b(C2679nz.f14252B)).longValue());

    /* renamed from: b */
    private long f18652b;

    /* renamed from: c */
    private boolean f18653c = true;

    uo0() {
    }

    /* renamed from: a */
    public final void mo14554a(SurfaceTexture surfaceTexture, fo0 fo0) {
        if (fo0 != null) {
            long timestamp = surfaceTexture.getTimestamp();
            if (this.f18653c || Math.abs(timestamp - this.f18652b) >= this.f18651a) {
                this.f18653c = false;
                this.f18652b = timestamp;
                C4751b2.f25403i.post(new to0(fo0));
            }
        }
    }

    /* renamed from: b */
    public final void mo14555b() {
        this.f18653c = true;
    }
}
