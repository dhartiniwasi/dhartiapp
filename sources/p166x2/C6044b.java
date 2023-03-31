package p166x2;

import android.os.Parcel;
import android.os.Parcelable;
import p127r2.C5432a;
import p127r2.C5435b;
import p177z1.C6214e2;
import p177z1.C6272r1;
import p219e7.C10001f;

/* renamed from: x2.b */
/* compiled from: MotionPhotoMetadata */
public final class C6044b implements C5432a.C5434b {
    public static final Parcelable.Creator<C6044b> CREATOR = new C6045a();

    /* renamed from: a */
    public final long f29313a;

    /* renamed from: b */
    public final long f29314b;

    /* renamed from: c */
    public final long f29315c;

    /* renamed from: d */
    public final long f29316d;

    /* renamed from: e */
    public final long f29317e;

    /* renamed from: x2.b$a */
    /* compiled from: MotionPhotoMetadata */
    class C6045a implements Parcelable.Creator<C6044b> {
        C6045a() {
        }

        /* renamed from: a */
        public C6044b createFromParcel(Parcel parcel) {
            return new C6044b(parcel, (C6045a) null);
        }

        /* renamed from: b */
        public C6044b[] newArray(int i) {
            return new C6044b[i];
        }
    }

    /* synthetic */ C6044b(Parcel parcel, C6045a aVar) {
        this(parcel);
    }

    /* renamed from: J0 */
    public /* synthetic */ void mo17874J0(C6214e2.C6216b bVar) {
        C5435b.m33284c(this, bVar);
    }

    /* renamed from: c0 */
    public /* synthetic */ C6272r1 mo17875c0() {
        return C5435b.m33283b(this);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C6044b.class != obj.getClass()) {
            return false;
        }
        C6044b bVar = (C6044b) obj;
        if (this.f29313a == bVar.f29313a && this.f29314b == bVar.f29314b && this.f29315c == bVar.f29315c && this.f29316d == bVar.f29316d && this.f29317e == bVar.f29317e) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((((((((527 + C10001f.m51081b(this.f29313a)) * 31) + C10001f.m51081b(this.f29314b)) * 31) + C10001f.m51081b(this.f29315c)) * 31) + C10001f.m51081b(this.f29316d)) * 31) + C10001f.m51081b(this.f29317e);
    }

    public String toString() {
        return "Motion photo metadata: photoStartPosition=" + this.f29313a + ", photoSize=" + this.f29314b + ", photoPresentationTimestampUs=" + this.f29315c + ", videoStartPosition=" + this.f29316d + ", videoSize=" + this.f29317e;
    }

    /* renamed from: u1 */
    public /* synthetic */ byte[] mo17880u1() {
        return C5435b.m33282a(this);
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f29313a);
        parcel.writeLong(this.f29314b);
        parcel.writeLong(this.f29315c);
        parcel.writeLong(this.f29316d);
        parcel.writeLong(this.f29317e);
    }

    public C6044b(long j, long j2, long j3, long j4, long j5) {
        this.f29313a = j;
        this.f29314b = j2;
        this.f29315c = j3;
        this.f29316d = j4;
        this.f29317e = j5;
    }

    private C6044b(Parcel parcel) {
        this.f29313a = parcel.readLong();
        this.f29314b = parcel.readLong();
        this.f29315c = parcel.readLong();
        this.f29316d = parcel.readLong();
        this.f29317e = parcel.readLong();
    }
}
