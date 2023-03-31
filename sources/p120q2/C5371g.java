package p120q2;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.HandlerThread;
import java.util.ArrayDeque;
import p161w3.C5917a;
import p161w3.C5953m0;

/* renamed from: q2.g */
/* compiled from: AsynchronousMediaCodecCallback */
final class C5371g extends MediaCodec.Callback {

    /* renamed from: a */
    private final Object f27481a = new Object();

    /* renamed from: b */
    private final HandlerThread f27482b;

    /* renamed from: c */
    private Handler f27483c;

    /* renamed from: d */
    private final C5375k f27484d;

    /* renamed from: e */
    private final C5375k f27485e;

    /* renamed from: f */
    private final ArrayDeque<MediaCodec.BufferInfo> f27486f;

    /* renamed from: g */
    private final ArrayDeque<MediaFormat> f27487g;

    /* renamed from: h */
    private MediaFormat f27488h;

    /* renamed from: i */
    private MediaFormat f27489i;

    /* renamed from: j */
    private MediaCodec.CodecException f27490j;

    /* renamed from: k */
    private long f27491k;

    /* renamed from: l */
    private boolean f27492l;

    /* renamed from: m */
    private IllegalStateException f27493m;

    C5371g(HandlerThread handlerThread) {
        this.f27482b = handlerThread;
        this.f27484d = new C5375k();
        this.f27485e = new C5375k();
        this.f27486f = new ArrayDeque<>();
        this.f27487g = new ArrayDeque<>();
    }

    /* renamed from: b */
    private void m32879b(MediaFormat mediaFormat) {
        this.f27485e.mo19475a(-2);
        this.f27487g.add(mediaFormat);
    }

    /* renamed from: f */
    private void m32880f() {
        if (!this.f27487g.isEmpty()) {
            this.f27489i = this.f27487g.getLast();
        }
        this.f27484d.mo19476b();
        this.f27485e.mo19476b();
        this.f27486f.clear();
        this.f27487g.clear();
        this.f27490j = null;
    }

    /* renamed from: i */
    private boolean m32881i() {
        return this.f27491k > 0 || this.f27492l;
    }

    /* renamed from: j */
    private void m32882j() {
        m32883k();
        m32884l();
    }

    /* renamed from: k */
    private void m32883k() {
        IllegalStateException illegalStateException = this.f27493m;
        if (illegalStateException != null) {
            this.f27493m = null;
            throw illegalStateException;
        }
    }

    /* renamed from: l */
    private void m32884l() {
        MediaCodec.CodecException codecException = this.f27490j;
        if (codecException != null) {
            this.f27490j = null;
            throw codecException;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: m */
    public void m32885m() {
        synchronized (this.f27481a) {
            if (!this.f27492l) {
                long j = this.f27491k - 1;
                this.f27491k = j;
                if (j <= 0) {
                    if (j < 0) {
                        m32886n(new IllegalStateException());
                    } else {
                        m32880f();
                    }
                }
            }
        }
    }

    /* renamed from: n */
    private void m32886n(IllegalStateException illegalStateException) {
        synchronized (this.f27481a) {
            this.f27493m = illegalStateException;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001f, code lost:
        return r2;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int mo19456c() {
        /*
            r3 = this;
            java.lang.Object r0 = r3.f27481a
            monitor-enter(r0)
            boolean r1 = r3.m32881i()     // Catch:{ all -> 0x0020 }
            r2 = -1
            if (r1 == 0) goto L_0x000c
            monitor-exit(r0)     // Catch:{ all -> 0x0020 }
            return r2
        L_0x000c:
            r3.m32882j()     // Catch:{ all -> 0x0020 }
            q2.k r1 = r3.f27484d     // Catch:{ all -> 0x0020 }
            boolean r1 = r1.mo19477d()     // Catch:{ all -> 0x0020 }
            if (r1 == 0) goto L_0x0018
            goto L_0x001e
        L_0x0018:
            q2.k r1 = r3.f27484d     // Catch:{ all -> 0x0020 }
            int r2 = r1.mo19478e()     // Catch:{ all -> 0x0020 }
        L_0x001e:
            monitor-exit(r0)     // Catch:{ all -> 0x0020 }
            return r2
        L_0x0020:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0020 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p120q2.C5371g.mo19456c():int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0049, code lost:
        return r1;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int mo19457d(android.media.MediaCodec.BufferInfo r10) {
        /*
            r9 = this;
            java.lang.Object r0 = r9.f27481a
            monitor-enter(r0)
            boolean r1 = r9.m32881i()     // Catch:{ all -> 0x004a }
            r2 = -1
            if (r1 == 0) goto L_0x000c
            monitor-exit(r0)     // Catch:{ all -> 0x004a }
            return r2
        L_0x000c:
            r9.m32882j()     // Catch:{ all -> 0x004a }
            q2.k r1 = r9.f27485e     // Catch:{ all -> 0x004a }
            boolean r1 = r1.mo19477d()     // Catch:{ all -> 0x004a }
            if (r1 == 0) goto L_0x0019
            monitor-exit(r0)     // Catch:{ all -> 0x004a }
            return r2
        L_0x0019:
            q2.k r1 = r9.f27485e     // Catch:{ all -> 0x004a }
            int r1 = r1.mo19478e()     // Catch:{ all -> 0x004a }
            if (r1 < 0) goto L_0x003b
            android.media.MediaFormat r2 = r9.f27488h     // Catch:{ all -> 0x004a }
            p161w3.C5917a.m34875h(r2)     // Catch:{ all -> 0x004a }
            java.util.ArrayDeque<android.media.MediaCodec$BufferInfo> r2 = r9.f27486f     // Catch:{ all -> 0x004a }
            java.lang.Object r2 = r2.remove()     // Catch:{ all -> 0x004a }
            android.media.MediaCodec$BufferInfo r2 = (android.media.MediaCodec.BufferInfo) r2     // Catch:{ all -> 0x004a }
            int r4 = r2.offset     // Catch:{ all -> 0x004a }
            int r5 = r2.size     // Catch:{ all -> 0x004a }
            long r6 = r2.presentationTimeUs     // Catch:{ all -> 0x004a }
            int r8 = r2.flags     // Catch:{ all -> 0x004a }
            r3 = r10
            r3.set(r4, r5, r6, r8)     // Catch:{ all -> 0x004a }
            goto L_0x0048
        L_0x003b:
            r10 = -2
            if (r1 != r10) goto L_0x0048
            java.util.ArrayDeque<android.media.MediaFormat> r10 = r9.f27487g     // Catch:{ all -> 0x004a }
            java.lang.Object r10 = r10.remove()     // Catch:{ all -> 0x004a }
            android.media.MediaFormat r10 = (android.media.MediaFormat) r10     // Catch:{ all -> 0x004a }
            r9.f27488h = r10     // Catch:{ all -> 0x004a }
        L_0x0048:
            monitor-exit(r0)     // Catch:{ all -> 0x004a }
            return r1
        L_0x004a:
            r10 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x004a }
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: p120q2.C5371g.mo19457d(android.media.MediaCodec$BufferInfo):int");
    }

    /* renamed from: e */
    public void mo19458e() {
        synchronized (this.f27481a) {
            this.f27491k++;
            ((Handler) C5953m0.m35138j(this.f27483c)).post(new C12183f(this));
        }
    }

    /* renamed from: g */
    public MediaFormat mo19459g() {
        MediaFormat mediaFormat;
        synchronized (this.f27481a) {
            mediaFormat = this.f27488h;
            if (mediaFormat == null) {
                throw new IllegalStateException();
            }
        }
        return mediaFormat;
    }

    /* renamed from: h */
    public void mo19460h(MediaCodec mediaCodec) {
        C5917a.m34873f(this.f27483c == null);
        this.f27482b.start();
        Handler handler = new Handler(this.f27482b.getLooper());
        mediaCodec.setCallback(this, handler);
        this.f27483c = handler;
    }

    /* renamed from: o */
    public void mo19461o() {
        synchronized (this.f27481a) {
            this.f27492l = true;
            this.f27482b.quit();
            m32880f();
        }
    }

    public void onError(MediaCodec mediaCodec, MediaCodec.CodecException codecException) {
        synchronized (this.f27481a) {
            this.f27490j = codecException;
        }
    }

    public void onInputBufferAvailable(MediaCodec mediaCodec, int i) {
        synchronized (this.f27481a) {
            this.f27484d.mo19475a(i);
        }
    }

    public void onOutputBufferAvailable(MediaCodec mediaCodec, int i, MediaCodec.BufferInfo bufferInfo) {
        synchronized (this.f27481a) {
            MediaFormat mediaFormat = this.f27489i;
            if (mediaFormat != null) {
                m32879b(mediaFormat);
                this.f27489i = null;
            }
            this.f27485e.mo19475a(i);
            this.f27486f.add(bufferInfo);
        }
    }

    public void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        synchronized (this.f27481a) {
            m32879b(mediaFormat);
            this.f27489i = null;
        }
    }
}
