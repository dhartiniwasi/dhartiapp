package com.google.android.gms.internal.ads;

import java.math.BigInteger;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class am0 {

    /* renamed from: a */
    private BigInteger f6673a = BigInteger.ONE;

    /* renamed from: b */
    private String f6674b = "0";

    /* renamed from: a */
    public final synchronized String mo8433a() {
        String bigInteger;
        bigInteger = this.f6673a.toString();
        this.f6673a = this.f6673a.add(BigInteger.ONE);
        this.f6674b = bigInteger;
        return bigInteger;
    }

    /* renamed from: b */
    public final synchronized String mo8434b() {
        return this.f6674b;
    }
}
