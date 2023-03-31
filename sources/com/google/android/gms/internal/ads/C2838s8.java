package com.google.android.gms.internal.ads;

import java.security.cert.CertificateEncodingException;
import java.security.cert.X509Certificate;

/* renamed from: com.google.android.gms.internal.ads.s8 */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class C2838s8 extends C2875t8 {

    /* renamed from: b */
    private final byte[] f17297b;

    public C2838s8(X509Certificate x509Certificate, byte[] bArr) {
        super(x509Certificate);
        this.f17297b = bArr;
    }

    public final byte[] getEncoded() throws CertificateEncodingException {
        return this.f17297b;
    }
}
