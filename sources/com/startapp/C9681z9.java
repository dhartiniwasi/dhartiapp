package com.startapp;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.startapp.z9 */
/* compiled from: Sta */
public class C9681z9 extends C9577u2 {
    public static final Parcelable.Creator<C9681z9> CREATOR = new C9682a();

    /* renamed from: f */
    public float f39558f;

    /* renamed from: g */
    public float f39559g;

    /* renamed from: com.startapp.z9$a */
    /* compiled from: Sta */
    public class C9682a implements Parcelable.Creator<C9681z9> {
        public Object createFromParcel(Parcel parcel) {
            return new C9681z9(parcel);
        }

        public Object[] newArray(int i) {
            return new C9681z9[i];
        }
    }

    public C9681z9(float f, float f2) {
        this.f39558f = f;
        this.f39559g = f2;
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        return super.toString() + ", Friction: [" + this.f39558f + "], Snap:[" + this.f39559g + "]";
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeFloat(this.f39241a);
        parcel.writeFloat(this.f39242b);
        parcel.writeFloat(this.f39243c);
        parcel.writeFloat(this.f39244d);
        parcel.writeFloat(this.f39558f);
        parcel.writeFloat(this.f39559g);
    }

    public C9681z9(Parcel parcel) {
        super(parcel);
        this.f39558f = parcel.readFloat();
        this.f39559g = parcel.readFloat();
    }
}
