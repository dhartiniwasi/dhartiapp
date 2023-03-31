package p155v3;

import com.facebook.ads.AdError;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;
import p182a7.C6408b;

/* renamed from: v3.a0 */
/* compiled from: HttpDataSource */
public class C5788a0 extends C5830m {

    /* renamed from: b */
    public final C5837p f28781b;

    /* renamed from: c */
    public final int f28782c;

    public C5788a0(C5837p pVar, int i, int i2) {
        super(m34520b(i, i2));
        this.f28781b = pVar;
        this.f28782c = i2;
    }

    /* renamed from: b */
    private static int m34520b(int i, int i2) {
        return (i == 2000 && i2 == 1) ? AdError.INTERNAL_ERROR_CODE : i;
    }

    /* renamed from: c */
    public static C5788a0 m34521c(IOException iOException, C5837p pVar, int i) {
        int i2;
        String message = iOException.getMessage();
        if (iOException instanceof SocketTimeoutException) {
            i2 = AdError.CACHE_ERROR_CODE;
        } else if (iOException instanceof InterruptedIOException) {
            i2 = 1004;
        } else {
            i2 = (message == null || !C6408b.m37506e(message).matches("cleartext.*not permitted.*")) ? AdError.INTERNAL_ERROR_CODE : 2007;
        }
        if (i2 == 2007) {
            return new C5857z(iOException, pVar);
        }
        return new C5788a0(iOException, pVar, i2, i);
    }

    public C5788a0(String str, C5837p pVar, int i, int i2) {
        super(str, m34520b(i, i2));
        this.f28781b = pVar;
        this.f28782c = i2;
    }

    public C5788a0(IOException iOException, C5837p pVar, int i, int i2) {
        super((Throwable) iOException, m34520b(i, i2));
        this.f28781b = pVar;
        this.f28782c = i2;
    }

    public C5788a0(String str, IOException iOException, C5837p pVar, int i, int i2) {
        super(str, iOException, m34520b(i, i2));
        this.f28781b = pVar;
        this.f28782c = i2;
    }
}
