package com.google.android.gms.internal.p026firebaseauthapi;

import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.x6 */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
final class C3889x6 implements Comparable {

    /* renamed from: a */
    private final byte[] f22905a;

    /* synthetic */ C3889x6(byte[] bArr, C3857w6 w6Var) {
        this.f22905a = Arrays.copyOf(bArr, bArr.length);
    }

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        C3889x6 x6Var = (C3889x6) obj;
        int length = this.f22905a.length;
        int length2 = x6Var.f22905a.length;
        if (length != length2) {
            return length - length2;
        }
        int i = 0;
        while (true) {
            byte[] bArr = this.f22905a;
            if (i >= bArr.length) {
                return 0;
            }
            byte b = bArr[i];
            byte b2 = x6Var.f22905a[i];
            if (b != b2) {
                return b - b2;
            }
            i++;
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C3889x6)) {
            return false;
        }
        return Arrays.equals(this.f22905a, ((C3889x6) obj).f22905a);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f22905a);
    }

    public final String toString() {
        return C3247dm.m25434a(this.f22905a);
    }
}
