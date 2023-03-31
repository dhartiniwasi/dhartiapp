package p166x2;

import android.os.Parcel;
import android.os.Parcelable;
import p127r2.C5432a;
import p127r2.C5435b;
import p177z1.C6214e2;
import p177z1.C6272r1;
import p219e7.C9996b;

/* renamed from: x2.e */
/* compiled from: SmtaMetadataEntry */
public final class C6050e implements C5432a.C5434b {
    public static final Parcelable.Creator<C6050e> CREATOR = new C6051a();

    /* renamed from: a */
    public final float f29323a;

    /* renamed from: b */
    public final int f29324b;

    /* renamed from: x2.e$a */
    /* compiled from: SmtaMetadataEntry */
    class C6051a implements Parcelable.Creator<C6050e> {
        C6051a() {
        }

        /* renamed from: a */
        public C6050e createFromParcel(Parcel parcel) {
            return new C6050e(parcel, (C6051a) null);
        }

        /* renamed from: b */
        public C6050e[] newArray(int i) {
            return new C6050e[i];
        }
    }

    /* synthetic */ C6050e(Parcel parcel, C6051a aVar) {
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
        if (obj == null || C6050e.class != obj.getClass()) {
            return false;
        }
        C6050e eVar = (C6050e) obj;
        if (this.f29323a == eVar.f29323a && this.f29324b == eVar.f29324b) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((527 + C9996b.m51065a(this.f29323a)) * 31) + this.f29324b;
    }

    public String toString() {
        return "smta: captureFrameRate=" + this.f29323a + ", svcTemporalLayerCount=" + this.f29324b;
    }

    /* renamed from: u1 */
    public /* synthetic */ byte[] mo17880u1() {
        return C5435b.m33282a(this);
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeFloat(this.f29323a);
        parcel.writeInt(this.f29324b);
    }

    public C6050e(float f, int i) {
        this.f29323a = f;
        this.f29324b = i;
    }

    private C6050e(Parcel parcel) {
        this.f29323a = parcel.readFloat();
        this.f29324b = parcel.readInt();
    }
}
