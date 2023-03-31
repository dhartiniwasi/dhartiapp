package p246h7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Date;
import p247h8.C10472x;

/* renamed from: h7.q */
/* compiled from: Timestamp */
public final class C10428q implements Comparable<C10428q>, Parcelable {
    public static final Parcelable.Creator<C10428q> CREATOR = new C10429a();

    /* renamed from: a */
    private final long f41367a;

    /* renamed from: b */
    private final int f41368b;

    /* renamed from: h7.q$a */
    /* compiled from: Timestamp */
    class C10429a implements Parcelable.Creator<C10428q> {
        C10429a() {
        }

        /* renamed from: a */
        public C10428q createFromParcel(Parcel parcel) {
            return new C10428q(parcel);
        }

        /* renamed from: b */
        public C10428q[] newArray(int i) {
            return new C10428q[i];
        }
    }

    public C10428q(long j, int i) {
        m52635k(j, i);
        this.f41367a = j;
        this.f41368b = i;
    }

    /* renamed from: j */
    public static C10428q m52634j() {
        return new C10428q(new Date());
    }

    /* renamed from: k */
    private static void m52635k(long j, int i) {
        C10472x.m52784a(i >= 0, "Timestamp nanoseconds out of range: %s", Integer.valueOf(i));
        C10472x.m52784a(((double) i) < 1.0E9d, "Timestamp nanoseconds out of range: %s", Integer.valueOf(i));
        C10472x.m52784a(j >= -62135596800L, "Timestamp seconds out of range: %s", Long.valueOf(j));
        C10472x.m52784a(j < 253402300800L, "Timestamp seconds out of range: %s", Long.valueOf(j));
    }

    /* renamed from: a */
    public int compareTo(C10428q qVar) {
        long j = this.f41367a;
        long j2 = qVar.f41367a;
        if (j == j2) {
            return Integer.signum(this.f41368b - qVar.f41368b);
        }
        return Long.signum(j - j2);
    }

    /* renamed from: b */
    public int mo33498b() {
        return this.f41368b;
    }

    /* renamed from: c */
    public long mo33499c() {
        return this.f41367a;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof C10428q) && compareTo((C10428q) obj) == 0) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        long j = this.f41367a;
        return (((((int) j) * 37 * 37) + ((int) (j >> 32))) * 37) + this.f41368b;
    }

    public String toString() {
        return "Timestamp(seconds=" + this.f41367a + ", nanoseconds=" + this.f41368b + ")";
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f41367a);
        parcel.writeInt(this.f41368b);
    }

    protected C10428q(Parcel parcel) {
        this.f41367a = parcel.readLong();
        this.f41368b = parcel.readInt();
    }

    public C10428q(Date date) {
        long time = date.getTime();
        long j = time / 1000;
        int i = ((int) (time % 1000)) * 1000000;
        if (i < 0) {
            j--;
            i += 1000000000;
        }
        m52635k(j, i);
        this.f41367a = j;
        this.f41368b = i;
    }
}
