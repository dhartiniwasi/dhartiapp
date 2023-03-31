package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.HandlerThread;
import java.util.ArrayDeque;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class ge4 extends MediaCodec.Callback {

    /* renamed from: a */
    private final Object f9873a = new Object();

    /* renamed from: b */
    private final HandlerThread f9874b;

    /* renamed from: c */
    private Handler f9875c;

    /* renamed from: d */
    private final ke4 f9876d;

    /* renamed from: e */
    private final ke4 f9877e;

    /* renamed from: f */
    private final ArrayDeque f9878f;

    /* renamed from: g */
    private final ArrayDeque f9879g;

    /* renamed from: h */
    private MediaFormat f9880h;

    /* renamed from: i */
    private MediaFormat f9881i;

    /* renamed from: j */
    private MediaCodec.CodecException f9882j;

    /* renamed from: k */
    private long f9883k;

    /* renamed from: l */
    private boolean f9884l;

    /* renamed from: m */
    private IllegalStateException f9885m;

    ge4(HandlerThread handlerThread) {
        this.f9874b = handlerThread;
        this.f9876d = new ke4();
        this.f9877e = new ke4();
        this.f9878f = new ArrayDeque();
        this.f9879g = new ArrayDeque();
    }

    /* renamed from: d */
    public static /* synthetic */ void m13261d(ge4 ge4) {
        synchronized (ge4.f9873a) {
            if (!ge4.f9884l) {
                long j = ge4.f9883k - 1;
                ge4.f9883k = j;
                int i = (j > 0 ? 1 : (j == 0 ? 0 : -1));
                if (i <= 0) {
                    if (i < 0) {
                        IllegalStateException illegalStateException = new IllegalStateException();
                        synchronized (ge4.f9873a) {
                            ge4.f9885m = illegalStateException;
                        }
                        return;
                    }
                    ge4.m13263i();
                }
            }
        }
    }

    /* renamed from: h */
    private final void m13262h(MediaFormat mediaFormat) {
        this.f9877e.mo11665b(-2);
        this.f9879g.add(mediaFormat);
    }

    /* renamed from: i */
    private final void m13263i() {
        if (!this.f9879g.isEmpty()) {
            this.f9881i = (MediaFormat) this.f9879g.getLast();
        }
        this.f9876d.mo11666c();
        this.f9877e.mo11666c();
        this.f9878f.clear();
        this.f9879g.clear();
        this.f9882j = null;
    }

    /* renamed from: j */
    private final void m13264j() {
        IllegalStateException illegalStateException = this.f9885m;
        if (illegalStateException != null) {
            this.f9885m = null;
            throw illegalStateException;
        }
    }

    /* renamed from: k */
    private final void m13265k() {
        MediaCodec.CodecException codecException = this.f9882j;
        if (codecException != null) {
            this.f9882j = null;
            throw codecException;
        }
    }

    /* renamed from: l */
    private final boolean m13266l() {
        return this.f9883k > 0 || this.f9884l;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0022, code lost:
        return r2;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo10498a() {
        /*
            r3 = this;
            java.lang.Object r0 = r3.f9873a
            monitor-enter(r0)
            boolean r1 = r3.m13266l()     // Catch:{ all -> 0x0023 }
            r2 = -1
            if (r1 == 0) goto L_0x000c
            monitor-exit(r0)     // Catch:{ all -> 0x0023 }
            return r2
        L_0x000c:
            r3.m13264j()     // Catch:{ all -> 0x0023 }
            r3.m13265k()     // Catch:{ all -> 0x0023 }
            com.google.android.gms.internal.ads.ke4 r1 = r3.f9876d     // Catch:{ all -> 0x0023 }
            boolean r1 = r1.mo11667d()     // Catch:{ all -> 0x0023 }
            if (r1 == 0) goto L_0x001b
            goto L_0x0021
        L_0x001b:
            com.google.android.gms.internal.ads.ke4 r1 = r3.f9876d     // Catch:{ all -> 0x0023 }
            int r2 = r1.mo11664a()     // Catch:{ all -> 0x0023 }
        L_0x0021:
            monitor-exit(r0)     // Catch:{ all -> 0x0023 }
            return r2
        L_0x0023:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0023 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ge4.mo10498a():int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x004d, code lost:
        return r1;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo10499b(android.media.MediaCodec.BufferInfo r10) {
        /*
            r9 = this;
            java.lang.Object r0 = r9.f9873a
            monitor-enter(r0)
            boolean r1 = r9.m13266l()     // Catch:{ all -> 0x004e }
            r2 = -1
            if (r1 == 0) goto L_0x000c
            monitor-exit(r0)     // Catch:{ all -> 0x004e }
            return r2
        L_0x000c:
            r9.m13264j()     // Catch:{ all -> 0x004e }
            r9.m13265k()     // Catch:{ all -> 0x004e }
            com.google.android.gms.internal.ads.ke4 r1 = r9.f9877e     // Catch:{ all -> 0x004e }
            boolean r1 = r1.mo11667d()     // Catch:{ all -> 0x004e }
            if (r1 == 0) goto L_0x001c
            monitor-exit(r0)     // Catch:{ all -> 0x004e }
            return r2
        L_0x001c:
            com.google.android.gms.internal.ads.ke4 r1 = r9.f9877e     // Catch:{ all -> 0x004e }
            int r1 = r1.mo11664a()     // Catch:{ all -> 0x004e }
            r2 = -2
            if (r1 < 0) goto L_0x003f
            android.media.MediaFormat r2 = r9.f9880h     // Catch:{ all -> 0x004e }
            com.google.android.gms.internal.ads.v91.m22048b(r2)     // Catch:{ all -> 0x004e }
            java.util.ArrayDeque r2 = r9.f9878f     // Catch:{ all -> 0x004e }
            java.lang.Object r2 = r2.remove()     // Catch:{ all -> 0x004e }
            android.media.MediaCodec$BufferInfo r2 = (android.media.MediaCodec.BufferInfo) r2     // Catch:{ all -> 0x004e }
            int r4 = r2.offset     // Catch:{ all -> 0x004e }
            int r5 = r2.size     // Catch:{ all -> 0x004e }
            long r6 = r2.presentationTimeUs     // Catch:{ all -> 0x004e }
            int r8 = r2.flags     // Catch:{ all -> 0x004e }
            r3 = r10
            r3.set(r4, r5, r6, r8)     // Catch:{ all -> 0x004e }
            goto L_0x004c
        L_0x003f:
            if (r1 != r2) goto L_0x004c
            java.util.ArrayDeque r10 = r9.f9879g     // Catch:{ all -> 0x004e }
            java.lang.Object r10 = r10.remove()     // Catch:{ all -> 0x004e }
            android.media.MediaFormat r10 = (android.media.MediaFormat) r10     // Catch:{ all -> 0x004e }
            r9.f9880h = r10     // Catch:{ all -> 0x004e }
            r1 = -2
        L_0x004c:
            monitor-exit(r0)     // Catch:{ all -> 0x004e }
            return r1
        L_0x004e:
            r10 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x004e }
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ge4.mo10499b(android.media.MediaCodec$BufferInfo):int");
    }

    /* renamed from: c */
    public final MediaFormat mo10500c() {
        MediaFormat mediaFormat;
        synchronized (this.f9873a) {
            mediaFormat = this.f9880h;
            if (mediaFormat == null) {
                throw new IllegalStateException();
            }
        }
        return mediaFormat;
    }

    /* renamed from: e */
    public final void mo10501e() {
        synchronized (this.f9873a) {
            this.f9883k++;
            Handler handler = this.f9875c;
            int i = gb2.f9812a;
            handler.post(new fe4(this));
        }
    }

    /* renamed from: f */
    public final void mo10502f(MediaCodec mediaCodec) {
        v91.m22052f(this.f9875c == null);
        this.f9874b.start();
        Handler handler = new Handler(this.f9874b.getLooper());
        mediaCodec.setCallback(this, handler);
        this.f9875c = handler;
    }

    /* renamed from: g */
    public final void mo10503g() {
        synchronized (this.f9873a) {
            this.f9884l = true;
            this.f9874b.quit();
            m13263i();
        }
    }

    public final void onError(MediaCodec mediaCodec, MediaCodec.CodecException codecException) {
        synchronized (this.f9873a) {
            this.f9882j = codecException;
        }
    }

    public final void onInputBufferAvailable(MediaCodec mediaCodec, int i) {
        synchronized (this.f9873a) {
            this.f9876d.mo11665b(i);
        }
    }

    public final void onOutputBufferAvailable(MediaCodec mediaCodec, int i, MediaCodec.BufferInfo bufferInfo) {
        synchronized (this.f9873a) {
            MediaFormat mediaFormat = this.f9881i;
            if (mediaFormat != null) {
                m13262h(mediaFormat);
                this.f9881i = null;
            }
            this.f9877e.mo11665b(i);
            this.f9878f.add(bufferInfo);
        }
    }

    public final void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        synchronized (this.f9873a) {
            m13262h(mediaFormat);
            this.f9881i = null;
        }
    }
}
