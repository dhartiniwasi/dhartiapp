package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.HandlerThread;
import android.os.Trace;
import android.view.Surface;
import java.nio.ByteBuffer;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zd4 implements ne4 {

    /* renamed from: a */
    private final MediaCodec f21061a;

    /* renamed from: b */
    private final ge4 f21062b;

    /* renamed from: c */
    private final ee4 f21063c;

    /* renamed from: d */
    private boolean f21064d;

    /* renamed from: e */
    private int f21065e = 0;

    /* synthetic */ zd4(MediaCodec mediaCodec, HandlerThread handlerThread, HandlerThread handlerThread2, boolean z, yd4 yd4) {
        this.f21061a = mediaCodec;
        this.f21062b = new ge4(handlerThread);
        this.f21063c = new ee4(mediaCodec, handlerThread2);
    }

    /* renamed from: k */
    static /* synthetic */ void m24530k(zd4 zd4, MediaFormat mediaFormat, Surface surface, MediaCrypto mediaCrypto, int i) {
        zd4.f21062b.mo10502f(zd4.f21061a);
        int i2 = gb2.f9812a;
        Trace.beginSection("configureCodec");
        zd4.f21061a.configure(mediaFormat, surface, (MediaCrypto) null, 0);
        Trace.endSection();
        zd4.f21063c.mo9903f();
        Trace.beginSection("startCodec");
        zd4.f21061a.start();
        Trace.endSection();
        zd4.f21065e = 1;
    }

    /* access modifiers changed from: private */
    /* renamed from: l */
    public static String m24531l(int i, String str) {
        StringBuilder sb = new StringBuilder(str);
        if (i == 1) {
            sb.append("Audio");
        } else if (i == 2) {
            sb.append("Video");
        } else {
            sb.append("Unknown(");
            sb.append(i);
            sb.append(")");
        }
        return sb.toString();
    }

    /* renamed from: F */
    public final void mo11679F(Bundle bundle) {
        this.f21061a.setParameters(bundle);
    }

    /* renamed from: V */
    public final void mo11680V() {
        this.f21063c.mo9899b();
        this.f21061a.flush();
        this.f21062b.mo10501e();
        this.f21061a.start();
    }

    /* renamed from: Z */
    public final void mo11681Z() {
        try {
            if (this.f21065e == 1) {
                this.f21063c.mo9902e();
                this.f21062b.mo10503g();
            }
            this.f21065e = 2;
            if (!this.f21064d) {
                this.f21061a.release();
                this.f21064d = true;
            }
        } catch (Throwable th) {
            if (!this.f21064d) {
                this.f21061a.release();
                this.f21064d = true;
            }
            throw th;
        }
    }

    /* renamed from: a */
    public final void mo11682a(int i, long j) {
        this.f21061a.releaseOutputBuffer(i, j);
    }

    /* renamed from: b */
    public final void mo11683b(int i, int i2, int i3, long j, int i4) {
        this.f21063c.mo9900c(i, 0, i3, j, i4);
    }

    /* renamed from: c */
    public final void mo11684c(Surface surface) {
        this.f21061a.setOutputSurface(surface);
    }

    /* renamed from: d */
    public final void mo11685d(int i, int i2, cl3 cl3, long j, int i3) {
        this.f21063c.mo9901d(i, 0, cl3, j, 0);
    }

    /* renamed from: e */
    public final MediaFormat mo11686e() {
        return this.f21062b.mo10500c();
    }

    /* renamed from: e0 */
    public final boolean mo11687e0() {
        return false;
    }

    /* renamed from: f */
    public final void mo11688f(int i) {
        this.f21061a.setVideoScalingMode(i);
    }

    /* renamed from: f0 */
    public final ByteBuffer mo11689f0(int i) {
        return this.f21061a.getOutputBuffer(i);
    }

    /* renamed from: g */
    public final void mo11690g(int i, boolean z) {
        this.f21061a.releaseOutputBuffer(i, z);
    }

    /* renamed from: h */
    public final int mo11691h(MediaCodec.BufferInfo bufferInfo) {
        return this.f21062b.mo10499b(bufferInfo);
    }

    /* renamed from: p */
    public final ByteBuffer mo11692p(int i) {
        return this.f21061a.getInputBuffer(i);
    }

    public final int zza() {
        return this.f21062b.mo10498a();
    }
}
