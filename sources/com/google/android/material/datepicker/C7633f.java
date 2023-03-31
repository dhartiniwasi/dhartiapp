package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.material.datepicker.C7625a;
import java.util.Arrays;

/* renamed from: com.google.android.material.datepicker.f */
/* compiled from: DateValidatorPointForward */
public class C7633f implements C7625a.C7628c {
    public static final Parcelable.Creator<C7633f> CREATOR = new C7634a();

    /* renamed from: a */
    private final long f33571a;

    /* renamed from: com.google.android.material.datepicker.f$a */
    /* compiled from: DateValidatorPointForward */
    static class C7634a implements Parcelable.Creator<C7633f> {
        C7634a() {
        }

        /* renamed from: a */
        public C7633f createFromParcel(Parcel parcel) {
            return new C7633f(parcel.readLong(), (C7634a) null);
        }

        /* renamed from: b */
        public C7633f[] newArray(int i) {
            return new C7633f[i];
        }
    }

    /* synthetic */ C7633f(long j, C7634a aVar) {
        this(j);
    }

    /* renamed from: a */
    public static C7633f m42577a(long j) {
        return new C7633f(j);
    }

    /* renamed from: Q0 */
    public boolean mo25389Q0(long j) {
        return j >= this.f33571a;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C7633f) && this.f33571a == ((C7633f) obj).f33571a) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f33571a)});
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f33571a);
    }

    private C7633f(long j) {
        this.f33571a = j;
    }
}
