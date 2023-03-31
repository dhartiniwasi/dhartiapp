package com.google.android.gms.internal.ads;

import java.math.BigInteger;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.Principal;
import java.security.PublicKey;
import java.security.SignatureException;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateExpiredException;
import java.security.cert.CertificateNotYetValidException;
import java.security.cert.X509Certificate;
import java.util.Date;
import java.util.Set;

/* renamed from: com.google.android.gms.internal.ads.t8 */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
class C2875t8 extends X509Certificate {

    /* renamed from: a */
    private final X509Certificate f17893a;

    public C2875t8(X509Certificate x509Certificate) {
        this.f17893a = x509Certificate;
    }

    public final void checkValidity() throws CertificateExpiredException, CertificateNotYetValidException {
        this.f17893a.checkValidity();
    }

    public final int getBasicConstraints() {
        return this.f17893a.getBasicConstraints();
    }

    public final Set getCriticalExtensionOIDs() {
        return this.f17893a.getCriticalExtensionOIDs();
    }

    public final byte[] getExtensionValue(String str) {
        return this.f17893a.getExtensionValue(str);
    }

    public final Principal getIssuerDN() {
        return this.f17893a.getIssuerDN();
    }

    public final boolean[] getIssuerUniqueID() {
        return this.f17893a.getIssuerUniqueID();
    }

    public final boolean[] getKeyUsage() {
        return this.f17893a.getKeyUsage();
    }

    public final Set getNonCriticalExtensionOIDs() {
        return this.f17893a.getNonCriticalExtensionOIDs();
    }

    public final Date getNotAfter() {
        return this.f17893a.getNotAfter();
    }

    public final Date getNotBefore() {
        return this.f17893a.getNotBefore();
    }

    public final PublicKey getPublicKey() {
        return this.f17893a.getPublicKey();
    }

    public final BigInteger getSerialNumber() {
        return this.f17893a.getSerialNumber();
    }

    public final String getSigAlgName() {
        return this.f17893a.getSigAlgName();
    }

    public final String getSigAlgOID() {
        return this.f17893a.getSigAlgOID();
    }

    public final byte[] getSigAlgParams() {
        return this.f17893a.getSigAlgParams();
    }

    public final byte[] getSignature() {
        return this.f17893a.getSignature();
    }

    public final Principal getSubjectDN() {
        return this.f17893a.getSubjectDN();
    }

    public final boolean[] getSubjectUniqueID() {
        return this.f17893a.getSubjectUniqueID();
    }

    public final byte[] getTBSCertificate() throws CertificateEncodingException {
        return this.f17893a.getTBSCertificate();
    }

    public final int getVersion() {
        return this.f17893a.getVersion();
    }

    public final boolean hasUnsupportedCriticalExtension() {
        return this.f17893a.hasUnsupportedCriticalExtension();
    }

    public final String toString() {
        return this.f17893a.toString();
    }

    public final void verify(PublicKey publicKey) throws CertificateException, NoSuchAlgorithmException, InvalidKeyException, NoSuchProviderException, SignatureException {
        this.f17893a.verify(publicKey);
    }

    public final void checkValidity(Date date) throws CertificateExpiredException, CertificateNotYetValidException {
        this.f17893a.checkValidity(date);
    }

    public final void verify(PublicKey publicKey, String str) throws CertificateException, NoSuchAlgorithmException, InvalidKeyException, NoSuchProviderException, SignatureException {
        this.f17893a.verify(publicKey, str);
    }
}
