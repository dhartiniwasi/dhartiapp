package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.ads.o2 */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class C2683o2 extends C2460i2 {
    public static final Parcelable.Creator<C2683o2> CREATOR = new C2646n2();

    /* renamed from: b */
    public final String f14802b;

    /* renamed from: c */
    public final byte[] f14803c;

    C2683o2(Parcel parcel) {
        super("PRIV");
        String readString = parcel.readString();
        int i = gb2.f9812a;
        this.f14802b = readString;
        this.f14803c = (byte[]) gb2.m13171h(parcel.createByteArray());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C2683o2.class == obj.getClass()) {
            C2683o2 o2Var = (C2683o2) obj;
            return gb2.m13186t(this.f14802b, o2Var.f14802b) && Arrays.equals(this.f14803c, o2Var.f14803c);
        }
    }

    public final int hashCode() {
        String str = this.f14802b;
        return (((str != null ? str.hashCode() : 0) + 527) * 31) + Arrays.hashCode(this.f14803c);
    }

    public final String toString() {
        String str = this.f10589a;
        String str2 = this.f14802b;
        return str + ": owner=" + str2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f14802b);
        parcel.writeByteArray(this.f14803c);
    }

    public C2683o2(String str, byte[] bArr) {
        super("PRIV");
        this.f14802b = str;
        this.f14803c = bArr;
    }
}
