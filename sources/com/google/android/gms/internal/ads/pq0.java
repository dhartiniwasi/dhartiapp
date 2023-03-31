package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.ByteBuffer;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class pq0 implements m34 {

    /* renamed from: a */
    private final ByteBuffer f15954a;

    pq0(ByteBuffer byteBuffer) {
        this.f15954a = byteBuffer.duplicate();
    }

    /* renamed from: B1 */
    public final ByteBuffer mo12270B1(long j, long j2) throws IOException {
        int position = this.f15954a.position();
        this.f15954a.position((int) j);
        ByteBuffer slice = this.f15954a.slice();
        slice.limit((int) j2);
        this.f15954a.position(position);
        return slice;
    }

    public final void close() throws IOException {
    }

    /* renamed from: d */
    public final long mo12271d() throws IOException {
        return (long) this.f15954a.position();
    }

    /* renamed from: e */
    public final long mo12272e() throws IOException {
        return (long) this.f15954a.limit();
    }

    /* renamed from: l */
    public final void mo12273l(long j) throws IOException {
        this.f15954a.position((int) j);
    }

    /* renamed from: r1 */
    public final int mo12274r1(ByteBuffer byteBuffer) throws IOException {
        if (this.f15954a.remaining() == 0 && byteBuffer.remaining() > 0) {
            return -1;
        }
        int min = Math.min(byteBuffer.remaining(), this.f15954a.remaining());
        byte[] bArr = new byte[min];
        this.f15954a.get(bArr);
        byteBuffer.put(bArr);
        return min;
    }
}
