package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.ads.in */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class C2482in extends C2630mn {
    public static final Parcelable.Creator<C2482in> CREATOR = new C2444hn();

    /* renamed from: b */
    public final String f10870b;

    /* renamed from: c */
    public final String f10871c;

    /* renamed from: d */
    public final int f10872d;

    /* renamed from: e */
    public final byte[] f10873e;

    C2482in(Parcel parcel) {
        super("APIC");
        this.f10870b = parcel.readString();
        this.f10871c = parcel.readString();
        this.f10872d = parcel.readInt();
        this.f10873e = parcel.createByteArray();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C2482in.class == obj.getClass()) {
            C2482in inVar = (C2482in) obj;
            return this.f10872d == inVar.f10872d && C2893tq.m21184o(this.f10870b, inVar.f10870b) && C2893tq.m21184o(this.f10871c, inVar.f10871c) && Arrays.equals(this.f10873e, inVar.f10873e);
        }
    }

    public final int hashCode() {
        int i = (this.f10872d + 527) * 31;
        String str = this.f10870b;
        int i2 = 0;
        int hashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f10871c;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return ((hashCode + i2) * 31) + Arrays.hashCode(this.f10873e);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f10870b);
        parcel.writeString(this.f10871c);
        parcel.writeInt(this.f10872d);
        parcel.writeByteArray(this.f10873e);
    }

    public C2482in(String str, String str2, int i, byte[] bArr) {
        super("APIC");
        this.f10870b = str;
        this.f10871c = null;
        this.f10872d = 3;
        this.f10873e = bArr;
    }
}
