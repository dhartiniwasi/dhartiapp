package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class ok3 implements ju3 {

    /* renamed from: a */
    private final String f15173a;

    /* renamed from: b */
    private final int f15174b;

    /* renamed from: c */
    private lp3 f15175c;

    /* renamed from: d */
    private mo3 f15176d;

    /* renamed from: e */
    private int f15177e;

    /* renamed from: f */
    private xp3 f15178f;

    ok3(ms3 ms3) throws GeneralSecurityException {
        String K = ms3.mo12433K();
        this.f15173a = K;
        if (K.equals(ai3.f6587b)) {
            try {
                op3 J = op3.m18020J(ms3.mo12432J(), ex3.m12308a());
                this.f15175c = (lp3) xh3.m23219d(ms3);
                this.f15174b = J.mo13019G();
            } catch (ey3 e) {
                throw new GeneralSecurityException("invalid KeyFormat protobuf, expected AesGcmKeyFormat", e);
            }
        } else if (K.equals(ai3.f6586a)) {
            try {
                po3 I = po3.m18703I(ms3.mo12432J(), ex3.m12308a());
                this.f15176d = (mo3) xh3.m23219d(ms3);
                this.f15177e = I.mo13319J().mo14800G();
                this.f15174b = this.f15177e + I.mo13320K().mo12418G();
            } catch (ey3 e2) {
                throw new GeneralSecurityException("invalid KeyFormat protobuf, expected AesCtrHmacAeadKeyFormat", e2);
            }
        } else if (K.equals(yj3.f20649a)) {
            try {
                aq3 J2 = aq3.m9947J(ms3.mo12432J(), ex3.m12308a());
                this.f15178f = (xp3) xh3.m23219d(ms3);
                this.f15174b = J2.mo8515G();
            } catch (ey3 e3) {
                throw new GeneralSecurityException("invalid KeyFormat protobuf, expected AesCtrHmacAeadKeyFormat", e3);
            }
        } else {
            throw new GeneralSecurityException("unsupported AEAD DEM key type: ".concat(String.valueOf(K)));
        }
    }

    /* renamed from: b */
    public final ll3 mo11517b(byte[] bArr) throws GeneralSecurityException {
        Class<ig3> cls = ig3.class;
        if (bArr.length != this.f15174b) {
            throw new GeneralSecurityException("Symmetric key has incorrect length");
        } else if (this.f15173a.equals(ai3.f6587b)) {
            kp3 H = lp3.m16085H();
            H.mo13421j(this.f15175c);
            H.mo11758p(jw3.m15087L(bArr, 0, this.f15174b));
            return new ll3((ig3) xh3.m23223h(this.f15173a, (lp3) H.mo13423m(), cls));
        } else if (this.f15173a.equals(ai3.f6586a)) {
            byte[] copyOfRange = Arrays.copyOfRange(bArr, 0, this.f15177e);
            byte[] copyOfRange2 = Arrays.copyOfRange(bArr, this.f15177e, this.f15174b);
            ro3 H2 = so3.m20542H();
            H2.mo13421j(this.f15176d.mo12387K());
            H2.mo13864p(jw3.m15086K(copyOfRange));
            hr3 H3 = jr3.m15026H();
            H3.mo13421j(this.f15176d.mo12388L());
            H3.mo10930p(jw3.m15086K(copyOfRange2));
            lo3 H4 = mo3.m16612H();
            H4.mo12050s(this.f15176d.mo12386G());
            H4.mo12048p((so3) H2.mo13423m());
            H4.mo12049r((jr3) H3.mo13423m());
            return new ll3((ig3) xh3.m23223h(this.f15173a, (mo3) H4.mo13423m(), cls));
        } else if (this.f15173a.equals(yj3.f20649a)) {
            wp3 H5 = xp3.m23493H();
            H5.mo13421j(this.f15178f);
            H5.mo14968p(jw3.m15087L(bArr, 0, this.f15174b));
            return new ll3((og3) xh3.m23223h(this.f15173a, (xp3) H5.mo13423m(), og3.class));
        } else {
            throw new GeneralSecurityException("unknown DEM key type");
        }
    }

    public final int zza() {
        return this.f15174b;
    }
}
