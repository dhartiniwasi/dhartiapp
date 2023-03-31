package com.google.android.gms.internal.ads;

import com.facebook.ads.AdError;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public class c53 extends rm2 {

    /* renamed from: b */
    public final wq2 f7610b;

    /* renamed from: c */
    public final int f7611c;

    public c53(wq2 wq2, int i, int i2) {
        super(m10712b(AdError.REMOTE_ADS_SERVICE_ERROR, 1));
        this.f7610b = wq2;
        this.f7611c = 1;
    }

    /* renamed from: a */
    public static c53 m10711a(IOException iOException, wq2 wq2, int i) {
        String message = iOException.getMessage();
        boolean z = iOException instanceof SocketTimeoutException;
        int i2 = AdError.INTERNAL_ERROR_CODE;
        if (z) {
            i2 = AdError.CACHE_ERROR_CODE;
        } else if (iOException instanceof InterruptedIOException) {
            i2 = 1004;
        } else if (message != null && i73.m14184a(message).matches("cleartext.*not permitted.*")) {
            i2 = 2007;
        }
        if (i2 == 2007) {
            return new i43(iOException, wq2);
        }
        return new c53(iOException, wq2, i2, i);
    }

    /* renamed from: b */
    private static int m10712b(int i, int i2) {
        return i == 2000 ? i2 != 1 ? AdError.SERVER_ERROR_CODE : AdError.INTERNAL_ERROR_CODE : i;
    }

    public c53(IOException iOException, wq2 wq2, int i, int i2) {
        super((Throwable) iOException, m10712b(i, i2));
        this.f7610b = wq2;
        this.f7611c = i2;
    }

    public c53(String str, wq2 wq2, int i, int i2) {
        super(str, m10712b(i, i2));
        this.f7610b = wq2;
        this.f7611c = i2;
    }

    public c53(String str, IOException iOException, wq2 wq2, int i, int i2) {
        super(str, iOException, m10712b(i, i2));
        this.f7610b = wq2;
        this.f7611c = i2;
    }
}
