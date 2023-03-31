package p155v3;

import com.facebook.ads.AdError;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/* renamed from: v3.c0 */
/* compiled from: HttpDataSource */
public final class C5794c0 extends C5788a0 {

    /* renamed from: d */
    public final int f28789d;

    /* renamed from: e */
    public final String f28790e;

    /* renamed from: f */
    public final Map<String, List<String>> f28791f;

    /* renamed from: g */
    public final byte[] f28792g;

    public C5794c0(int i, String str, IOException iOException, Map<String, List<String>> map, C5837p pVar, byte[] bArr) {
        super("Response code: " + i, iOException, pVar, AdError.INTERNAL_ERROR_2004, 1);
        this.f28789d = i;
        this.f28790e = str;
        this.f28791f = map;
        this.f28792g = bArr;
    }
}
