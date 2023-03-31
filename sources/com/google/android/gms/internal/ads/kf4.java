package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Bundle;
import android.view.Surface;
import java.nio.ByteBuffer;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class kf4 implements ne4 {

    /* renamed from: a */
    private final MediaCodec f12073a;

    /* renamed from: b */
    private ByteBuffer[] f12074b;

    /* renamed from: c */
    private ByteBuffer[] f12075c;

    /* synthetic */ kf4(MediaCodec mediaCodec, jf4 jf4) {
        this.f12073a = mediaCodec;
        if (gb2.f9812a < 21) {
            this.f12074b = mediaCodec.getInputBuffers();
            this.f12075c = mediaCodec.getOutputBuffers();
        }
    }

    /* renamed from: F */
    public final void mo11679F(Bundle bundle) {
        this.f12073a.setParameters(bundle);
    }

    /* renamed from: V */
    public final void mo11680V() {
        this.f12073a.flush();
    }

    /* renamed from: Z */
    public final void mo11681Z() {
        this.f12074b = null;
        this.f12075c = null;
        this.f12073a.release();
    }

    /* renamed from: a */
    public final void mo11682a(int i, long j) {
        this.f12073a.releaseOutputBuffer(i, j);
    }

    /* renamed from: b */
    public final void mo11683b(int i, int i2, int i3, long j, int i4) {
        this.f12073a.queueInputBuffer(i, 0, i3, j, i4);
    }

    /* renamed from: c */
    public final void mo11684c(Surface surface) {
        this.f12073a.setOutputSurface(surface);
    }

    /* renamed from: d */
    public final void mo11685d(int i, int i2, cl3 cl3, long j, int i3) {
        this.f12073a.queueSecureInputBuffer(i, 0, cl3.mo9208a(), j, 0);
    }

    /* renamed from: e */
    public final MediaFormat mo11686e() {
        return this.f12073a.getOutputFormat();
    }

    /* renamed from: e0 */
    public final boolean mo11687e0() {
        return false;
    }

    /* renamed from: f */
    public final void mo11688f(int i) {
        this.f12073a.setVideoScalingMode(i);
    }

    /* renamed from: f0 */
    public final ByteBuffer mo11689f0(int i) {
        if (gb2.f9812a >= 21) {
            return this.f12073a.getOutputBuffer(i);
        }
        return ((ByteBuffer[]) gb2.m13171h(this.f12075c))[i];
    }

    /* renamed from: g */
    public final void mo11690g(int i, boolean z) {
        this.f12073a.releaseOutputBuffer(i, z);
    }

    /* renamed from: h */
    public final int mo11691h(MediaCodec.BufferInfo bufferInfo) {
        int dequeueOutputBuffer;
        do {
            dequeueOutputBuffer = this.f12073a.dequeueOutputBuffer(bufferInfo, 0);
            if (dequeueOutputBuffer == -3) {
                if (gb2.f9812a < 21) {
                    this.f12075c = this.f12073a.getOutputBuffers();
                }
                dequeueOutputBuffer = -3;
                continue;
            }
        } while (dequeueOutputBuffer == -3);
        return dequeueOutputBuffer;
    }

    /* renamed from: p */
    public final ByteBuffer mo11692p(int i) {
        if (gb2.f9812a >= 21) {
            return this.f12073a.getInputBuffer(i);
        }
        return ((ByteBuffer[]) gb2.m13171h(this.f12074b))[i];
    }

    public final int zza() {
        return this.f12073a.dequeueInputBuffer(0);
    }
}
