package p021c2;

import p161w3.C5953m0;

/* renamed from: c2.e */
/* compiled from: DecoderCounters */
public final class C1846e {

    /* renamed from: a */
    public int f5417a;

    /* renamed from: b */
    public int f5418b;

    /* renamed from: c */
    public int f5419c;

    /* renamed from: d */
    public int f5420d;

    /* renamed from: e */
    public int f5421e;

    /* renamed from: f */
    public int f5422f;

    /* renamed from: g */
    public int f5423g;

    /* renamed from: h */
    public int f5424h;

    /* renamed from: i */
    public int f5425i;

    /* renamed from: j */
    public int f5426j;

    /* renamed from: k */
    public long f5427k;

    /* renamed from: l */
    public int f5428l;

    /* renamed from: b */
    private void m8569b(long j, int i) {
        this.f5427k += j;
        this.f5428l += i;
    }

    /* renamed from: a */
    public void mo7046a(long j) {
        m8569b(j, 1);
    }

    /* renamed from: c */
    public synchronized void mo7047c() {
    }

    public String toString() {
        return C5953m0.m35072C("DecoderCounters {\n decoderInits=%s,\n decoderReleases=%s\n queuedInputBuffers=%s\n skippedInputBuffers=%s\n renderedOutputBuffers=%s\n skippedOutputBuffers=%s\n droppedBuffers=%s\n droppedInputBuffers=%s\n maxConsecutiveDroppedBuffers=%s\n droppedToKeyframeEvents=%s\n totalVideoFrameProcessingOffsetUs=%s\n videoFrameProcessingOffsetCount=%s\n}", Integer.valueOf(this.f5417a), Integer.valueOf(this.f5418b), Integer.valueOf(this.f5419c), Integer.valueOf(this.f5420d), Integer.valueOf(this.f5421e), Integer.valueOf(this.f5422f), Integer.valueOf(this.f5423g), Integer.valueOf(this.f5424h), Integer.valueOf(this.f5425i), Integer.valueOf(this.f5426j), Long.valueOf(this.f5427k), Integer.valueOf(this.f5428l));
    }
}
