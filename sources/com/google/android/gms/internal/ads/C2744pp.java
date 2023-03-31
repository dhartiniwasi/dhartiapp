package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.ads.pp */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class C2744pp {

    /* renamed from: a */
    public final Uri f15941a;

    /* renamed from: b */
    public final long f15942b;

    /* renamed from: c */
    public final long f15943c;

    /* renamed from: d */
    public final long f15944d;

    public C2744pp(Uri uri, byte[] bArr, long j, long j2, long j3, String str, int i) {
        boolean z = false;
        C2335eq.m12243c(j >= 0);
        C2335eq.m12243c(j2 >= 0);
        if (j3 <= 0) {
            j3 = j3 == -1 ? -1 : j3;
            C2335eq.m12243c(z);
            this.f15941a = uri;
            this.f15942b = j;
            this.f15943c = j2;
            this.f15944d = j3;
        }
        z = true;
        C2335eq.m12243c(z);
        this.f15941a = uri;
        this.f15942b = j;
        this.f15943c = j2;
        this.f15944d = j3;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f15941a);
        String arrays = Arrays.toString((byte[]) null);
        long j = this.f15942b;
        long j2 = this.f15943c;
        long j3 = this.f15944d;
        return "DataSpec[" + valueOf + ", " + arrays + ", " + j + ", " + j2 + ", " + j3 + ", null, 0]";
    }
}
