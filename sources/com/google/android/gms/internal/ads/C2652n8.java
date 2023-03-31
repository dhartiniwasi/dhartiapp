package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* renamed from: com.google.android.gms.internal.ads.n8 */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class C2652n8 implements C2689o8 {

    /* renamed from: a */
    private final ByteBuffer f13894a;

    public C2652n8(ByteBuffer byteBuffer) {
        this.f13894a = byteBuffer.slice();
    }

    /* renamed from: a */
    public final void mo12541a(MessageDigest[] messageDigestArr, long j, int i) throws IOException {
        ByteBuffer slice;
        synchronized (this.f13894a) {
            int i2 = (int) j;
            this.f13894a.position(i2);
            this.f13894a.limit(i2 + i);
            slice = this.f13894a.slice();
        }
        for (MessageDigest update : messageDigestArr) {
            slice.position(0);
            update.update(slice);
        }
    }

    public final long zza() {
        return (long) this.f13894a.capacity();
    }
}
