package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class ru3 implements ig3 {

    /* renamed from: a */
    private final dv3 f17107a;

    /* renamed from: b */
    private final ih3 f17108b;

    /* renamed from: c */
    private final int f17109c;

    public ru3(dv3 dv3, ih3 ih3, int i) {
        this.f17107a = dv3;
        this.f17108b = ih3;
        this.f17109c = i;
    }

    /* renamed from: a */
    public final byte[] mo9175a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int length = bArr.length;
        int i = this.f17109c;
        if (length >= i) {
            byte[] copyOfRange = Arrays.copyOfRange(bArr, 0, length - i);
            byte[] copyOfRange2 = Arrays.copyOfRange(bArr, length - this.f17109c, length);
            if (bArr2 == null) {
                bArr2 = new byte[0];
            }
            byte[] copyOf = Arrays.copyOf(ByteBuffer.allocate(8).putLong(((long) bArr2.length) * 8).array(), 8);
            this.f17108b.mo10953a(copyOfRange2, gu3.m13540c(bArr2, copyOfRange, copyOf));
            return this.f17107a.mo9704a(copyOfRange);
        }
        throw new GeneralSecurityException("ciphertext too short");
    }

    /* renamed from: b */
    public final byte[] mo9176b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] b = this.f17107a.mo9705b(bArr);
        byte[] copyOf = Arrays.copyOf(ByteBuffer.allocate(8).putLong(0).array(), 8);
        return gu3.m13540c(b, this.f17108b.mo10954b(gu3.m13540c(bArr2, b, copyOf)));
    }
}
