package p120q2;

import android.media.MediaCodec;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import p021c2.C1842c;
import p161w3.C5917a;
import p161w3.C5933g;
import p161w3.C5953m0;

/* renamed from: q2.e */
/* compiled from: AsynchronousMediaCodecBufferEnqueuer */
class C5368e {

    /* renamed from: g */
    private static final ArrayDeque<C5370b> f27466g = new ArrayDeque<>();

    /* renamed from: h */
    private static final Object f27467h = new Object();

    /* renamed from: a */
    private final MediaCodec f27468a;

    /* renamed from: b */
    private final HandlerThread f27469b;

    /* renamed from: c */
    private Handler f27470c;

    /* renamed from: d */
    private final AtomicReference<RuntimeException> f27471d;

    /* renamed from: e */
    private final C5933g f27472e;

    /* renamed from: f */
    private boolean f27473f;

    /* renamed from: q2.e$a */
    /* compiled from: AsynchronousMediaCodecBufferEnqueuer */
    class C5369a extends Handler {
        C5369a(Looper looper) {
            super(looper);
        }

        public void handleMessage(Message message) {
            C5368e.this.m32864f(message);
        }
    }

    /* renamed from: q2.e$b */
    /* compiled from: AsynchronousMediaCodecBufferEnqueuer */
    private static class C5370b {

        /* renamed from: a */
        public int f27475a;

        /* renamed from: b */
        public int f27476b;

        /* renamed from: c */
        public int f27477c;

        /* renamed from: d */
        public final MediaCodec.CryptoInfo f27478d = new MediaCodec.CryptoInfo();

        /* renamed from: e */
        public long f27479e;

        /* renamed from: f */
        public int f27480f;

        C5370b() {
        }

        /* renamed from: a */
        public void mo19455a(int i, int i2, int i3, long j, int i4) {
            this.f27475a = i;
            this.f27476b = i2;
            this.f27477c = i3;
            this.f27479e = j;
            this.f27480f = i4;
        }
    }

    public C5368e(MediaCodec mediaCodec, HandlerThread handlerThread) {
        this(mediaCodec, handlerThread, new C5933g());
    }

    /* renamed from: b */
    private void m32860b() throws InterruptedException {
        this.f27472e.mo20594c();
        ((Handler) C5917a.m34872e(this.f27470c)).obtainMessage(2).sendToTarget();
        this.f27472e.mo20592a();
    }

    /* renamed from: c */
    private static void m32861c(C1842c cVar, MediaCodec.CryptoInfo cryptoInfo) {
        cryptoInfo.numSubSamples = cVar.f5410f;
        cryptoInfo.numBytesOfClearData = m32863e(cVar.f5408d, cryptoInfo.numBytesOfClearData);
        cryptoInfo.numBytesOfEncryptedData = m32863e(cVar.f5409e, cryptoInfo.numBytesOfEncryptedData);
        cryptoInfo.key = (byte[]) C5917a.m34872e(m32862d(cVar.f5406b, cryptoInfo.key));
        cryptoInfo.iv = (byte[]) C5917a.m34872e(m32862d(cVar.f5405a, cryptoInfo.iv));
        cryptoInfo.mode = cVar.f5407c;
        if (C5953m0.f29110a >= 24) {
            cryptoInfo.setPattern(new MediaCodec.CryptoInfo.Pattern(cVar.f5411g, cVar.f5412h));
        }
    }

    /* renamed from: d */
    private static byte[] m32862d(byte[] bArr, byte[] bArr2) {
        if (bArr == null) {
            return bArr2;
        }
        if (bArr2 == null || bArr2.length < bArr.length) {
            return Arrays.copyOf(bArr, bArr.length);
        }
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    /* renamed from: e */
    private static int[] m32863e(int[] iArr, int[] iArr2) {
        if (iArr == null) {
            return iArr2;
        }
        if (iArr2 == null || iArr2.length < iArr.length) {
            return Arrays.copyOf(iArr, iArr.length);
        }
        System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
        return iArr2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v1, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: q2.e$b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: q2.e$b} */
    /* access modifiers changed from: private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void m32864f(android.os.Message r10) {
        /*
            r9 = this;
            int r0 = r10.what
            r1 = 0
            if (r0 == 0) goto L_0x0036
            r2 = 1
            if (r0 == r2) goto L_0x0022
            r2 = 2
            if (r0 == r2) goto L_0x001c
            java.util.concurrent.atomic.AtomicReference<java.lang.RuntimeException> r0 = r9.f27471d
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            int r10 = r10.what
            java.lang.String r10 = java.lang.String.valueOf(r10)
            r2.<init>(r10)
            r0.compareAndSet(r1, r2)
            goto L_0x0049
        L_0x001c:
            w3.g r10 = r9.f27472e
            r10.mo20596e()
            goto L_0x0049
        L_0x0022:
            java.lang.Object r10 = r10.obj
            r1 = r10
            q2.e$b r1 = (p120q2.C5368e.C5370b) r1
            int r3 = r1.f27475a
            int r4 = r1.f27476b
            android.media.MediaCodec$CryptoInfo r5 = r1.f27478d
            long r6 = r1.f27479e
            int r8 = r1.f27480f
            r2 = r9
            r2.m32866h(r3, r4, r5, r6, r8)
            goto L_0x0049
        L_0x0036:
            java.lang.Object r10 = r10.obj
            r1 = r10
            q2.e$b r1 = (p120q2.C5368e.C5370b) r1
            int r3 = r1.f27475a
            int r4 = r1.f27476b
            int r5 = r1.f27477c
            long r6 = r1.f27479e
            int r8 = r1.f27480f
            r2 = r9
            r2.m32865g(r3, r4, r5, r6, r8)
        L_0x0049:
            if (r1 == 0) goto L_0x004e
            m32870o(r1)
        L_0x004e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p120q2.C5368e.m32864f(android.os.Message):void");
    }

    /* renamed from: g */
    private void m32865g(int i, int i2, int i3, long j, int i4) {
        try {
            this.f27468a.queueInputBuffer(i, i2, i3, j, i4);
        } catch (RuntimeException e) {
            this.f27471d.compareAndSet((Object) null, e);
        }
    }

    /* renamed from: h */
    private void m32866h(int i, int i2, MediaCodec.CryptoInfo cryptoInfo, long j, int i3) {
        try {
            synchronized (f27467h) {
                this.f27468a.queueSecureInputBuffer(i, i2, cryptoInfo, j, i3);
            }
        } catch (RuntimeException e) {
            this.f27471d.compareAndSet((Object) null, e);
        }
    }

    /* renamed from: j */
    private void m32867j() throws InterruptedException {
        ((Handler) C5917a.m34872e(this.f27470c)).removeCallbacksAndMessages((Object) null);
        m32860b();
    }

    /* renamed from: k */
    private static C5370b m32868k() {
        ArrayDeque<C5370b> arrayDeque = f27466g;
        synchronized (arrayDeque) {
            if (arrayDeque.isEmpty()) {
                C5370b bVar = new C5370b();
                return bVar;
            }
            C5370b removeFirst = arrayDeque.removeFirst();
            return removeFirst;
        }
    }

    /* renamed from: l */
    private void m32869l() {
        RuntimeException andSet = this.f27471d.getAndSet((Object) null);
        if (andSet != null) {
            throw andSet;
        }
    }

    /* renamed from: o */
    private static void m32870o(C5370b bVar) {
        ArrayDeque<C5370b> arrayDeque = f27466g;
        synchronized (arrayDeque) {
            arrayDeque.add(bVar);
        }
    }

    /* renamed from: i */
    public void mo19448i() {
        if (this.f27473f) {
            try {
                m32867j();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                throw new IllegalStateException(e);
            }
        }
    }

    /* renamed from: m */
    public void mo19449m(int i, int i2, int i3, long j, int i4) {
        m32869l();
        C5370b k = m32868k();
        k.mo19455a(i, i2, i3, j, i4);
        ((Handler) C5953m0.m35138j(this.f27470c)).obtainMessage(0, k).sendToTarget();
    }

    /* renamed from: n */
    public void mo19450n(int i, int i2, C1842c cVar, long j, int i3) {
        m32869l();
        C5370b k = m32868k();
        k.mo19455a(i, i2, 0, j, i3);
        m32861c(cVar, k.f27478d);
        ((Handler) C5953m0.m35138j(this.f27470c)).obtainMessage(1, k).sendToTarget();
    }

    /* renamed from: p */
    public void mo19451p() {
        if (this.f27473f) {
            mo19448i();
            this.f27469b.quit();
        }
        this.f27473f = false;
    }

    /* renamed from: q */
    public void mo19452q() {
        if (!this.f27473f) {
            this.f27469b.start();
            this.f27470c = new C5369a(this.f27469b.getLooper());
            this.f27473f = true;
        }
    }

    /* renamed from: r */
    public void mo19453r() throws InterruptedException {
        m32860b();
    }

    C5368e(MediaCodec mediaCodec, HandlerThread handlerThread, C5933g gVar) {
        this.f27468a = mediaCodec;
        this.f27469b = handlerThread;
        this.f27472e = gVar;
        this.f27471d = new AtomicReference<>();
    }
}
