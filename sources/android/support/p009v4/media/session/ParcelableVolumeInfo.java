package android.support.p009v4.media.session;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: android.support.v4.media.session.ParcelableVolumeInfo */
public class ParcelableVolumeInfo implements Parcelable {
    public static final Parcelable.Creator<ParcelableVolumeInfo> CREATOR = new C0217a();

    /* renamed from: a */
    public int f512a;

    /* renamed from: b */
    public int f513b;

    /* renamed from: c */
    public int f514c;

    /* renamed from: d */
    public int f515d;

    /* renamed from: e */
    public int f516e;

    /* renamed from: android.support.v4.media.session.ParcelableVolumeInfo$a */
    class C0217a implements Parcelable.Creator<ParcelableVolumeInfo> {
        C0217a() {
        }

        /* renamed from: a */
        public ParcelableVolumeInfo createFromParcel(Parcel parcel) {
            return new ParcelableVolumeInfo(parcel);
        }

        /* renamed from: b */
        public ParcelableVolumeInfo[] newArray(int i) {
            return new ParcelableVolumeInfo[i];
        }
    }

    public ParcelableVolumeInfo(int i, int i2, int i3, int i4, int i5) {
        this.f512a = i;
        this.f513b = i2;
        this.f514c = i3;
        this.f515d = i4;
        this.f516e = i5;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f512a);
        parcel.writeInt(this.f514c);
        parcel.writeInt(this.f515d);
        parcel.writeInt(this.f516e);
        parcel.writeInt(this.f513b);
    }

    public ParcelableVolumeInfo(Parcel parcel) {
        this.f512a = parcel.readInt();
        this.f514c = parcel.readInt();
        this.f515d = parcel.readInt();
        this.f516e = parcel.readInt();
        this.f513b = parcel.readInt();
    }
}
