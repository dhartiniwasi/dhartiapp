package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.os.Handler;
import android.os.HandlerThread;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class ee4 {

    /* renamed from: g */
    private static final ArrayDeque f8780g = new ArrayDeque();

    /* renamed from: h */
    private static final Object f8781h = new Object();

    /* renamed from: a */
    private final MediaCodec f8782a;

    /* renamed from: b */
    private final HandlerThread f8783b;

    /* renamed from: c */
    private Handler f8784c;

    /* renamed from: d */
    private final AtomicReference f8785d = new AtomicReference();

    /* renamed from: e */
    private final yc1 f8786e;

    /* renamed from: f */
    private boolean f8787f;

    public ee4(MediaCodec mediaCodec, HandlerThread handlerThread) {
        yc1 yc1 = new yc1(wa1.f19542a);
        this.f8782a = mediaCodec;
        this.f8783b = handlerThread;
        this.f8786e = yc1;
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0
        	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:248)
        	at java.base/java.util.Objects.checkIndex(Objects.java:372)
        	at java.base/java.util.ArrayList.get(ArrayList.java:458)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* renamed from: a */
    static /* bridge */ /* synthetic */ void m12068a(com.google.android.gms.internal.ads.ee4 r9, android.os.Message r10) {
        /*
            int r0 = r10.what
            r1 = 0
            if (r0 == 0) goto L_0x0043
            r2 = 1
            if (r0 == r2) goto L_0x0022
            r2 = 2
            if (r0 == r2) goto L_0x001c
            java.util.concurrent.atomic.AtomicReference r9 = r9.f8785d
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            int r10 = r10.what
            java.lang.String r10 = java.lang.String.valueOf(r10)
            r0.<init>(r10)
            com.google.android.gms.internal.ads.ae4.m9699a(r9, r1, r0)
            goto L_0x005d
        L_0x001c:
            com.google.android.gms.internal.ads.yc1 r9 = r9.f8786e
            r9.mo15423e()
            goto L_0x005d
        L_0x0022:
            java.lang.Object r10 = r10.obj
            com.google.android.gms.internal.ads.de4 r10 = (com.google.android.gms.internal.ads.de4) r10
            int r3 = r10.f8224a
            android.media.MediaCodec$CryptoInfo r5 = r10.f8227d
            long r6 = r10.f8228e
            int r8 = r10.f8229f
            java.lang.Object r0 = f8781h     // Catch:{ RuntimeException -> 0x003c }
            monitor-enter(r0)     // Catch:{ RuntimeException -> 0x003c }
            android.media.MediaCodec r2 = r9.f8782a     // Catch:{ all -> 0x0039 }
            r4 = 0
            r2.queueSecureInputBuffer(r3, r4, r5, r6, r8)     // Catch:{ all -> 0x0039 }
            monitor-exit(r0)     // Catch:{ all -> 0x0039 }
            goto L_0x005c
        L_0x0039:
            r2 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0039 }
            throw r2     // Catch:{ RuntimeException -> 0x003c }
        L_0x003c:
            r0 = move-exception
            java.util.concurrent.atomic.AtomicReference r9 = r9.f8785d
            com.google.android.gms.internal.ads.ae4.m9699a(r9, r1, r0)
            goto L_0x005c
        L_0x0043:
            java.lang.Object r10 = r10.obj
            com.google.android.gms.internal.ads.de4 r10 = (com.google.android.gms.internal.ads.de4) r10
            int r3 = r10.f8224a
            int r5 = r10.f8226c
            long r6 = r10.f8228e
            int r8 = r10.f8229f
            android.media.MediaCodec r2 = r9.f8782a     // Catch:{ RuntimeException -> 0x0056 }
            r4 = 0
            r2.queueInputBuffer(r3, r4, r5, r6, r8)     // Catch:{ RuntimeException -> 0x0056 }
            goto L_0x005c
        L_0x0056:
            r0 = move-exception
            java.util.concurrent.atomic.AtomicReference r9 = r9.f8785d
            com.google.android.gms.internal.ads.ae4.m9699a(r9, r1, r0)
        L_0x005c:
            r1 = r10
        L_0x005d:
            if (r1 == 0) goto L_0x006a
            java.util.ArrayDeque r9 = f8780g
            monitor-enter(r9)
            r9.add(r1)     // Catch:{ all -> 0x0067 }
            monitor-exit(r9)     // Catch:{ all -> 0x0067 }
            return
        L_0x0067:
            r10 = move-exception
            monitor-exit(r9)     // Catch:{ all -> 0x0067 }
            throw r10
        L_0x006a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ee4.m12068a(com.google.android.gms.internal.ads.ee4, android.os.Message):void");
    }

    /* renamed from: g */
    private static de4 m12069g() {
        ArrayDeque arrayDeque = f8780g;
        synchronized (arrayDeque) {
            if (arrayDeque.isEmpty()) {
                de4 de4 = new de4();
                return de4;
            }
            de4 de42 = (de4) arrayDeque.removeFirst();
            return de42;
        }
    }

    /* renamed from: h */
    private final void m12070h() {
        RuntimeException runtimeException = (RuntimeException) this.f8785d.getAndSet((Object) null);
        if (runtimeException != null) {
            throw runtimeException;
        }
    }

    /* renamed from: i */
    private static byte[] m12071i(byte[] bArr, byte[] bArr2) {
        int length;
        if (bArr == null) {
            return bArr2;
        }
        if (bArr2 == null || bArr2.length < (length = bArr.length)) {
            return Arrays.copyOf(bArr, bArr.length);
        }
        System.arraycopy(bArr, 0, bArr2, 0, length);
        return bArr2;
    }

    /* renamed from: j */
    private static int[] m12072j(int[] iArr, int[] iArr2) {
        int length;
        if (iArr == null) {
            return iArr2;
        }
        if (iArr2 == null || iArr2.length < (length = iArr.length)) {
            return Arrays.copyOf(iArr, iArr.length);
        }
        System.arraycopy(iArr, 0, iArr2, 0, length);
        return iArr2;
    }

    /* renamed from: b */
    public final void mo9899b() {
        if (this.f8787f) {
            try {
                Handler handler = this.f8784c;
                Objects.requireNonNull(handler);
                handler.removeCallbacksAndMessages((Object) null);
                this.f8786e.mo15421c();
                Handler handler2 = this.f8784c;
                Objects.requireNonNull(handler2);
                handler2.obtainMessage(2).sendToTarget();
                this.f8786e.mo15419a();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                throw new IllegalStateException(e);
            }
        }
    }

    /* renamed from: c */
    public final void mo9900c(int i, int i2, int i3, long j, int i4) {
        m12070h();
        de4 g = m12069g();
        g.mo9563a(i, 0, i3, j, i4);
        Handler handler = this.f8784c;
        int i5 = gb2.f9812a;
        handler.obtainMessage(0, g).sendToTarget();
    }

    /* renamed from: d */
    public final void mo9901d(int i, int i2, cl3 cl3, long j, int i3) {
        m12070h();
        de4 g = m12069g();
        g.mo9563a(i, 0, 0, j, 0);
        MediaCodec.CryptoInfo cryptoInfo = g.f8227d;
        cryptoInfo.numSubSamples = cl3.f7817f;
        cryptoInfo.numBytesOfClearData = m12072j(cl3.f7815d, cryptoInfo.numBytesOfClearData);
        cryptoInfo.numBytesOfEncryptedData = m12072j(cl3.f7816e, cryptoInfo.numBytesOfEncryptedData);
        byte[] i4 = m12071i(cl3.f7813b, cryptoInfo.key);
        Objects.requireNonNull(i4);
        cryptoInfo.key = i4;
        byte[] i5 = m12071i(cl3.f7812a, cryptoInfo.iv);
        Objects.requireNonNull(i5);
        cryptoInfo.iv = i5;
        cryptoInfo.mode = cl3.f7814c;
        if (gb2.f9812a >= 24) {
            cryptoInfo.setPattern(new MediaCodec.CryptoInfo.Pattern(cl3.f7818g, cl3.f7819h));
        }
        this.f8784c.obtainMessage(1, g).sendToTarget();
    }

    /* renamed from: e */
    public final void mo9902e() {
        if (this.f8787f) {
            mo9899b();
            this.f8783b.quit();
        }
        this.f8787f = false;
    }

    /* renamed from: f */
    public final void mo9903f() {
        if (!this.f8787f) {
            this.f8783b.start();
            this.f8784c = new ce4(this, this.f8783b.getLooper());
            this.f8787f = true;
        }
    }
}
