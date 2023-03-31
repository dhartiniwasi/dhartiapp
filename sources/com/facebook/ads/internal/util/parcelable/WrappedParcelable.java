package com.facebook.ads.internal.util.parcelable;

import android.os.Parcel;
import android.os.Parcelable;

public class WrappedParcelable implements Parcelable {
    public static final Parcelable.Creator<WrappedParcelable> CREATOR = new C1996a();

    /* renamed from: a */
    private final byte[] f5694a;

    /* renamed from: com.facebook.ads.internal.util.parcelable.WrappedParcelable$a */
    class C1996a implements Parcelable.Creator<WrappedParcelable> {
        C1996a() {
        }

        /* renamed from: a */
        public WrappedParcelable createFromParcel(Parcel parcel) {
            return new WrappedParcelable(parcel);
        }

        /* renamed from: b */
        public WrappedParcelable[] newArray(int i) {
            return new WrappedParcelable[i];
        }
    }

    protected WrappedParcelable(Parcel parcel) {
        this.f5694a = parcel.createByteArray();
    }

    public static byte[] marshallParcelable(Parcelable parcelable) {
        Parcel obtain = Parcel.obtain();
        obtain.writeParcelable(parcelable, 0);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        return marshall;
    }

    public int describeContents() {
        return 0;
    }

    public Parcelable unwrap(ClassLoader classLoader) {
        Parcel obtain = Parcel.obtain();
        byte[] bArr = this.f5694a;
        if (bArr == null) {
            return null;
        }
        obtain.unmarshall(bArr, 0, bArr.length);
        obtain.setDataPosition(0);
        Parcelable readParcelable = obtain.readParcelable(classLoader);
        obtain.recycle();
        return readParcelable;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeByteArray(this.f5694a);
    }

    public WrappedParcelable(Parcelable parcelable) {
        this.f5694a = marshallParcelable(parcelable);
    }

    public WrappedParcelable(byte[] bArr) {
        this.f5694a = bArr;
    }
}
