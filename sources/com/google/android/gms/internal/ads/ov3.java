package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class ov3 implements ig3 {

    /* renamed from: a */
    private final pj3 f15376a;

    public ov3(byte[] bArr) throws GeneralSecurityException {
        this.f15376a = new pj3(bArr);
    }

    /* renamed from: a */
    public final byte[] mo9175a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int length = bArr.length;
        if (length >= 40) {
            byte[] copyOf = Arrays.copyOf(bArr, 24);
            return this.f15376a.mo12641c(ByteBuffer.wrap(bArr, 24, length - 24), copyOf, bArr2);
        }
        throw new GeneralSecurityException("ciphertext too short");
    }

    /* renamed from: b */
    public final byte[] mo9176b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        ByteBuffer allocate = ByteBuffer.allocate(bArr.length + 40);
        byte[] a = jv3.m15081a(24);
        allocate.put(a);
        this.f15376a.mo12640b(allocate, a, bArr, bArr2);
        return allocate.array();
    }
}
