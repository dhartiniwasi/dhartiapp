package p155v3;

import com.facebook.ads.AdError;

/* renamed from: v3.b0 */
/* compiled from: HttpDataSource */
public final class C5791b0 extends C5788a0 {

    /* renamed from: d */
    public final String f28783d;

    public C5791b0(String str, C5837p pVar) {
        super("Invalid content type: " + str, pVar, (int) AdError.INTERNAL_ERROR_2003, 1);
        this.f28783d = str;
    }
}
