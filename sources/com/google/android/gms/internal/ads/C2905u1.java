package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.ads.u1 */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class C2905u1 extends C2460i2 {
    public static final Parcelable.Creator<C2905u1> CREATOR = new C2868t1();

    /* renamed from: b */
    public final byte[] f18325b;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    C2905u1(android.os.Parcel r3) {
        /*
            r2 = this;
            java.lang.String r0 = r3.readString()
            int r1 = com.google.android.gms.internal.ads.gb2.f9812a
            r2.<init>(r0)
            byte[] r3 = r3.createByteArray()
            java.lang.Object r3 = com.google.android.gms.internal.ads.gb2.m13171h(r3)
            byte[] r3 = (byte[]) r3
            r2.f18325b = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C2905u1.<init>(android.os.Parcel):void");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C2905u1.class == obj.getClass()) {
            C2905u1 u1Var = (C2905u1) obj;
            return this.f10589a.equals(u1Var.f10589a) && Arrays.equals(this.f18325b, u1Var.f18325b);
        }
    }

    public final int hashCode() {
        return ((this.f10589a.hashCode() + 527) * 31) + Arrays.hashCode(this.f18325b);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f10589a);
        parcel.writeByteArray(this.f18325b);
    }

    public C2905u1(String str, byte[] bArr) {
        super(str);
        this.f18325b = bArr;
    }
}
