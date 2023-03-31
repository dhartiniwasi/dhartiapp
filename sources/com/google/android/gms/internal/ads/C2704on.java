package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.google.android.gms.internal.ads.on */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class C2704on extends C2630mn {
    public static final Parcelable.Creator<C2704on> CREATOR = new C2667nn();

    /* renamed from: b */
    public final String f15270b;

    /* renamed from: c */
    public final String f15271c;

    C2704on(Parcel parcel) {
        super(parcel.readString());
        this.f15270b = parcel.readString();
        this.f15271c = parcel.readString();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C2704on.class == obj.getClass()) {
            C2704on onVar = (C2704on) obj;
            return this.f13418a.equals(onVar.f13418a) && C2893tq.m21184o(this.f15270b, onVar.f15270b) && C2893tq.m21184o(this.f15271c, onVar.f15271c);
        }
    }

    public final int hashCode() {
        int hashCode = (this.f13418a.hashCode() + 527) * 31;
        String str = this.f15270b;
        int i = 0;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f15271c;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode2 + i;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f13418a);
        parcel.writeString(this.f15270b);
        parcel.writeString(this.f15271c);
    }

    public C2704on(String str, String str2, String str3) {
        super(str);
        this.f15270b = null;
        this.f15271c = str3;
    }
}
