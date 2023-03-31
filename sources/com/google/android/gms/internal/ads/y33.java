package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import p040e5.C4240a;
import p040e5.C4243c;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class y33 extends C4240a {
    public static final Parcelable.Creator<y33> CREATOR = new z33();

    /* renamed from: a */
    public final int f20459a;

    /* renamed from: b */
    public final byte[] f20460b;

    /* renamed from: c */
    public final int f20461c;

    y33(int i, byte[] bArr, int i2) {
        byte[] bArr2;
        this.f20459a = i;
        if (bArr == null) {
            bArr2 = null;
        } else {
            bArr2 = Arrays.copyOf(bArr, bArr.length);
        }
        this.f20460b = bArr2;
        this.f20461c = i2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C4243c.m28604a(parcel);
        C4243c.m28614k(parcel, 1, this.f20459a);
        C4243c.m28609f(parcel, 2, this.f20460b, false);
        C4243c.m28614k(parcel, 3, this.f20461c);
        C4243c.m28605b(parcel, a);
    }

    public y33(byte[] bArr, int i) {
        this(1, (byte[]) null, 1);
    }
}
