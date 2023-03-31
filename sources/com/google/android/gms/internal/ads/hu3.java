package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class hu3 implements ig3 {

    /* renamed from: a */
    private final mj3 f10500a;

    public hu3(byte[] bArr) throws GeneralSecurityException {
        this.f10500a = new mj3(bArr);
    }

    /* renamed from: a */
    public final byte[] mo9175a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int length = bArr.length;
        if (length >= 28) {
            byte[] copyOf = Arrays.copyOf(bArr, 12);
            return this.f10500a.mo12641c(ByteBuffer.wrap(bArr, 12, length - 12), copyOf, bArr2);
        }
        throw new GeneralSecurityException("ciphertext too short");
    }

    /* renamed from: b */
    public final byte[] mo9176b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        ByteBuffer allocate = ByteBuffer.allocate(bArr.length + 28);
        byte[] a = jv3.m15081a(12);
        allocate.put(a);
        this.f10500a.mo12640b(allocate, a, bArr, bArr2);
        return allocate.array();
    }
}
