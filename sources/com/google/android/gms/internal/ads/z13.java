package com.google.android.gms.internal.ads;

import android.os.Build;
import java.io.File;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.security.cert.X509Certificate;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class z13 {

    /* renamed from: c */
    protected static final byte[] f20907c = {61, 122, 18, 35, 1, -102, -93, -99, -98, -96, -29, 67, 106, -73, -64, -119, 107, -5, 79, -74, 121, -12, -34, 95, -25, -62, 63, 50, 108, -113, -103, 74};

    /* renamed from: d */
    protected static final byte[] f20908d = {16, 57, 56, -18, 69, 55, -27, -98, -114, -25, -110, -10, 84, 80, 79, -72, 52, 111, -58, -77, 70, -48, -69, -60, 65, 95, -61, 57, -4, -4, -114, -63};

    /* renamed from: a */
    private final byte[] f20909a = f20908d;

    /* renamed from: b */
    private final byte[] f20910b = f20907c;

    /* renamed from: a */
    public final boolean mo15534a(File file) throws GeneralSecurityException {
        try {
            X509Certificate[][] a = C2912u8.m21467a(file.getAbsolutePath());
            if (a.length == 1) {
                byte[] digest = MessageDigest.getInstance("SHA-256").digest(a[0][0].getEncoded());
                if (!Arrays.equals(this.f20910b, digest)) {
                    return !"user".equals(Build.TYPE) && Arrays.equals(this.f20909a, digest);
                }
                return true;
            }
            throw new GeneralSecurityException("APK has more than one signature.");
        } catch (C2801r8 e) {
            throw new GeneralSecurityException("Package is not signed", e);
        } catch (IOException | RuntimeException e2) {
            throw new GeneralSecurityException("Failed to verify signatures", e2);
        }
    }
}
