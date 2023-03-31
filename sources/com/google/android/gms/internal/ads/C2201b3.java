package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.google.android.gms.internal.ads.b3 */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class C2201b3 implements j50 {
    public static final Parcelable.Creator<C2201b3> CREATOR = new C3091z2();

    /* renamed from: a */
    public final float f7082a;

    /* renamed from: b */
    public final int f7083b;

    public C2201b3(float f, int i) {
        this.f7082a = f;
        this.f7083b = i;
    }

    /* synthetic */ C2201b3(Parcel parcel, C2164a3 a3Var) {
        this.f7082a = parcel.readFloat();
        this.f7083b = parcel.readInt();
    }

    /* renamed from: E0 */
    public final /* synthetic */ void mo8652E0(l00 l00) {
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C2201b3.class == obj.getClass()) {
            C2201b3 b3Var = (C2201b3) obj;
            return this.f7082a == b3Var.f7082a && this.f7083b == b3Var.f7083b;
        }
    }

    public final int hashCode() {
        return ((Float.valueOf(this.f7082a).hashCode() + 527) * 31) + this.f7083b;
    }

    public final String toString() {
        float f = this.f7082a;
        int i = this.f7083b;
        return "smta: captureFrameRate=" + f + ", svcTemporalLayerCount=" + i;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeFloat(this.f7082a);
        parcel.writeInt(this.f7083b);
    }
}
