package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.ads.s1 */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class C2831s1 extends C2460i2 {
    public static final Parcelable.Creator<C2831s1> CREATOR = new C2794r1();

    /* renamed from: b */
    public final String f17178b;

    /* renamed from: c */
    public final String f17179c;

    /* renamed from: d */
    public final int f17180d;

    /* renamed from: e */
    public final byte[] f17181e;

    C2831s1(Parcel parcel) {
        super("APIC");
        String readString = parcel.readString();
        int i = gb2.f9812a;
        this.f17178b = readString;
        this.f17179c = parcel.readString();
        this.f17180d = parcel.readInt();
        this.f17181e = (byte[]) gb2.m13171h(parcel.createByteArray());
    }

    /* renamed from: E0 */
    public final void mo8652E0(l00 l00) {
        l00.mo11853q(this.f17181e, this.f17180d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C2831s1.class == obj.getClass()) {
            C2831s1 s1Var = (C2831s1) obj;
            return this.f17180d == s1Var.f17180d && gb2.m13186t(this.f17178b, s1Var.f17178b) && gb2.m13186t(this.f17179c, s1Var.f17179c) && Arrays.equals(this.f17181e, s1Var.f17181e);
        }
    }

    public final int hashCode() {
        int i = (this.f17180d + 527) * 31;
        String str = this.f17178b;
        int i2 = 0;
        int hashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f17179c;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return ((hashCode + i2) * 31) + Arrays.hashCode(this.f17181e);
    }

    public final String toString() {
        String str = this.f10589a;
        String str2 = this.f17178b;
        String str3 = this.f17179c;
        return str + ": mimeType=" + str2 + ", description=" + str3;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f17178b);
        parcel.writeString(this.f17179c);
        parcel.writeInt(this.f17180d);
        parcel.writeByteArray(this.f17181e);
    }

    public C2831s1(String str, String str2, int i, byte[] bArr) {
        super("APIC");
        this.f17178b = str;
        this.f17179c = str2;
        this.f17180d = i;
        this.f17181e = bArr;
    }
}
