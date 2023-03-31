package p005a3;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: a3.c */
/* compiled from: StreamKey */
public final class C0093c implements Comparable<C0093c>, Parcelable {
    public static final Parcelable.Creator<C0093c> CREATOR = new C0094a();

    /* renamed from: a */
    public final int f255a;

    /* renamed from: b */
    public final int f256b;

    /* renamed from: c */
    public final int f257c;
    @Deprecated

    /* renamed from: d */
    public final int f258d;

    /* renamed from: a3.c$a */
    /* compiled from: StreamKey */
    class C0094a implements Parcelable.Creator<C0093c> {
        C0094a() {
        }

        /* renamed from: a */
        public C0093c createFromParcel(Parcel parcel) {
            return new C0093c(parcel);
        }

        /* renamed from: b */
        public C0093c[] newArray(int i) {
            return new C0093c[i];
        }
    }

    public C0093c(int i, int i2, int i3) {
        this.f255a = i;
        this.f256b = i2;
        this.f257c = i3;
        this.f258d = i3;
    }

    /* renamed from: a */
    public int compareTo(C0093c cVar) {
        int i = this.f255a - cVar.f255a;
        if (i != 0) {
            return i;
        }
        int i2 = this.f256b - cVar.f256b;
        return i2 == 0 ? this.f257c - cVar.f257c : i2;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0093c.class != obj.getClass()) {
            return false;
        }
        C0093c cVar = (C0093c) obj;
        if (this.f255a == cVar.f255a && this.f256b == cVar.f256b && this.f257c == cVar.f257c) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((this.f255a * 31) + this.f256b) * 31) + this.f257c;
    }

    public String toString() {
        return this.f255a + "." + this.f256b + "." + this.f257c;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f255a);
        parcel.writeInt(this.f256b);
        parcel.writeInt(this.f257c);
    }

    C0093c(Parcel parcel) {
        this.f255a = parcel.readInt();
        this.f256b = parcel.readInt();
        int readInt = parcel.readInt();
        this.f257c = readInt;
        this.f258d = readInt;
    }
}
