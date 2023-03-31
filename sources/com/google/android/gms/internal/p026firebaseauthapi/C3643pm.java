package com.google.android.gms.internal.p026firebaseauthapi;

import java.util.Arrays;
import java.util.Objects;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.pm */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C3643pm {

    /* renamed from: a */
    private final byte[] f22510a;

    private C3643pm(byte[] bArr, int i, int i2) {
        byte[] bArr2 = new byte[i2];
        this.f22510a = bArr2;
        System.arraycopy(bArr, 0, bArr2, 0, i2);
    }

    /* renamed from: b */
    public static C3643pm m26493b(byte[] bArr) {
        Objects.requireNonNull(bArr, "data must be non-null");
        return new C3643pm(bArr, 0, bArr.length);
    }

    /* renamed from: a */
    public final int mo16554a() {
        return this.f22510a.length;
    }

    /* renamed from: c */
    public final byte[] mo16555c() {
        byte[] bArr = this.f22510a;
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArr, 0, bArr2, 0, length);
        return bArr2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C3643pm)) {
            return false;
        }
        return Arrays.equals(((C3643pm) obj).f22510a, this.f22510a);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f22510a);
    }

    public final String toString() {
        String a = C3247dm.m25434a(this.f22510a);
        return "Bytes(" + a + ")";
    }
}
