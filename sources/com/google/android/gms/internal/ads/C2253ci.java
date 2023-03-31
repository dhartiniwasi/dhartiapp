package com.google.android.gms.internal.ads;

import java.io.IOException;

/* renamed from: com.google.android.gms.internal.ads.ci */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class C2253ci extends Exception {
    private C2253ci(int i, String str, Throwable th, int i2) {
        super((String) null, th);
    }

    /* renamed from: a */
    public static C2253ci m10944a(Exception exc, int i) {
        return new C2253ci(1, (String) null, exc, i);
    }

    /* renamed from: b */
    public static C2253ci m10945b(IOException iOException) {
        return new C2253ci(0, (String) null, iOException, -1);
    }

    /* renamed from: c */
    static C2253ci m10946c(RuntimeException runtimeException) {
        return new C2253ci(2, (String) null, runtimeException, -1);
    }
}
