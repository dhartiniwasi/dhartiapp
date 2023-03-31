package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.security.MessageDigest;

/* renamed from: com.google.android.gms.internal.ads.p8 */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class C2726p8 implements C2689o8 {

    /* renamed from: a */
    private final FileChannel f15732a;

    /* renamed from: b */
    private final long f15733b;

    /* renamed from: c */
    private final long f15734c;

    public C2726p8(FileChannel fileChannel, long j, long j2) {
        this.f15732a = fileChannel;
        this.f15733b = j;
        this.f15734c = j2;
    }

    /* renamed from: a */
    public final void mo12541a(MessageDigest[] messageDigestArr, long j, int i) throws IOException {
        MappedByteBuffer map = this.f15732a.map(FileChannel.MapMode.READ_ONLY, this.f15733b + j, (long) i);
        map.load();
        for (MessageDigest update : messageDigestArr) {
            map.position(0);
            update.update(map);
        }
    }

    public final long zza() {
        return this.f15734c;
    }
}
