package com.google.android.gms.internal.ads;

import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zi3 implements ig3 {

    /* renamed from: c */
    private static final byte[] f21099c = new byte[0];

    /* renamed from: a */
    private final ms3 f21100a;

    /* renamed from: b */
    private final ig3 f21101b;

    public zi3(ms3 ms3, ig3 ig3) {
        this.f21100a = ms3;
        this.f21101b = ig3;
    }

    /* renamed from: a */
    public final byte[] mo9175a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        try {
            ByteBuffer wrap = ByteBuffer.wrap(bArr);
            int i = wrap.getInt();
            if (i <= 0 || i > bArr.length - 4) {
                throw new GeneralSecurityException("invalid ciphertext");
            }
            byte[] bArr3 = new byte[i];
            wrap.get(bArr3, 0, i);
            byte[] bArr4 = new byte[wrap.remaining()];
            wrap.get(bArr4, 0, wrap.remaining());
            return ((ig3) xh3.m23224i(this.f21100a.mo12433K(), this.f21101b.mo9175a(bArr3, f21099c), ig3.class)).mo9175a(bArr4, bArr2);
        } catch (IndexOutOfBoundsException | NegativeArraySizeException | BufferUnderflowException e) {
            throw new GeneralSecurityException("invalid ciphertext", e);
        }
    }

    /* renamed from: b */
    public final byte[] mo9176b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] b = xh3.m23219d(this.f21100a).mo9400b();
        byte[] b2 = this.f21101b.mo9176b(b, f21099c);
        byte[] b3 = ((ig3) xh3.m23224i(this.f21100a.mo12433K(), b, ig3.class)).mo9176b(bArr, bArr2);
        int length = b2.length;
        return ByteBuffer.allocate(length + 4 + b3.length).putInt(length).put(b2).put(b3).array();
    }
}
