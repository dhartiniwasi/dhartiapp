package com.google.android.gms.internal.ads;

import com.facebook.ads.AdError;
import java.io.IOException;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class d73 extends c53 {

    /* renamed from: d */
    public final int f8113d;

    /* renamed from: e */
    public final String f8114e;

    /* renamed from: f */
    public final Map f8115f;

    /* renamed from: g */
    public final byte[] f8116g;

    public d73(int i, String str, IOException iOException, Map map, wq2 wq2, byte[] bArr) {
        super("Response code: " + i, iOException, wq2, AdError.INTERNAL_ERROR_2004, 1);
        this.f8113d = i;
        this.f8114e = str;
        this.f8115f = map;
        this.f8116g = bArr;
    }
}
