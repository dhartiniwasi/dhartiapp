package androidx.versionedparcelable;

import android.os.Parcel;
import android.os.Parcelable;
import p152v0.C5755b;

public class ParcelImpl implements Parcelable {
    public static final Parcelable.Creator<ParcelImpl> CREATOR = new C1505a();

    /* renamed from: a */
    private final C5755b f4344a;

    /* renamed from: androidx.versionedparcelable.ParcelImpl$a */
    static class C1505a implements Parcelable.Creator<ParcelImpl> {
        C1505a() {
        }

        /* renamed from: a */
        public ParcelImpl createFromParcel(Parcel parcel) {
            return new ParcelImpl(parcel);
        }

        /* renamed from: b */
        public ParcelImpl[] newArray(int i) {
            return new ParcelImpl[i];
        }
    }

    public ParcelImpl(C5755b bVar) {
        this.f4344a = bVar;
    }

    /* renamed from: a */
    public <T extends C5755b> T mo4645a() {
        return this.f4344a;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        new C1508b(parcel).mo5973l0(this.f4344a);
    }

    protected ParcelImpl(Parcel parcel) {
        this.f4344a = new C1508b(parcel).mo5938H();
    }
}
