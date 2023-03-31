package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.google.android.gms.internal.ads.kn */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class C2556kn extends C2630mn {
    public static final Parcelable.Creator<C2556kn> CREATOR = new C2519jn();

    /* renamed from: b */
    public final String f12173b;

    /* renamed from: c */
    public final String f12174c;

    /* renamed from: d */
    public final String f12175d;

    C2556kn(Parcel parcel) {
        super("COMM");
        this.f12173b = parcel.readString();
        this.f12174c = parcel.readString();
        this.f12175d = parcel.readString();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C2556kn.class == obj.getClass()) {
            C2556kn knVar = (C2556kn) obj;
            return C2893tq.m21184o(this.f12174c, knVar.f12174c) && C2893tq.m21184o(this.f12173b, knVar.f12173b) && C2893tq.m21184o(this.f12175d, knVar.f12175d);
        }
    }

    public final int hashCode() {
        String str = this.f12173b;
        int i = 0;
        int hashCode = ((str != null ? str.hashCode() : 0) + 527) * 31;
        String str2 = this.f12174c;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f12175d;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hashCode2 + i;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f13418a);
        parcel.writeString(this.f12173b);
        parcel.writeString(this.f12175d);
    }

    public C2556kn(String str, String str2, String str3) {
        super("COMM");
        this.f12173b = "und";
        this.f12174c = str2;
        this.f12175d = str3;
    }
}
