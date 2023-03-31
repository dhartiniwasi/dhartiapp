package p166x2;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import p127r2.C5432a;
import p127r2.C5435b;
import p161w3.C5953m0;
import p177z1.C6214e2;
import p177z1.C6272r1;

/* renamed from: x2.a */
/* compiled from: MdtaMetadataEntry */
public final class C6042a implements C5432a.C5434b {
    public static final Parcelable.Creator<C6042a> CREATOR = new C6043a();

    /* renamed from: a */
    public final String f29309a;

    /* renamed from: b */
    public final byte[] f29310b;

    /* renamed from: c */
    public final int f29311c;

    /* renamed from: d */
    public final int f29312d;

    /* renamed from: x2.a$a */
    /* compiled from: MdtaMetadataEntry */
    class C6043a implements Parcelable.Creator<C6042a> {
        C6043a() {
        }

        /* renamed from: a */
        public C6042a createFromParcel(Parcel parcel) {
            return new C6042a(parcel, (C6043a) null);
        }

        /* renamed from: b */
        public C6042a[] newArray(int i) {
            return new C6042a[i];
        }
    }

    /* synthetic */ C6042a(Parcel parcel, C6043a aVar) {
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
        if (obj == null || C6042a.class != obj.getClass()) {
            return false;
        }
        C6042a aVar = (C6042a) obj;
        if (!this.f29309a.equals(aVar.f29309a) || !Arrays.equals(this.f29310b, aVar.f29310b) || this.f29311c != aVar.f29311c || this.f29312d != aVar.f29312d) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((((527 + this.f29309a.hashCode()) * 31) + Arrays.hashCode(this.f29310b)) * 31) + this.f29311c) * 31) + this.f29312d;
    }

    public String toString() {
        return "mdta: key=" + this.f29309a;
    }

    /* renamed from: u1 */
    public /* synthetic */ byte[] mo17880u1() {
        return C5435b.m33282a(this);
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f29309a);
        parcel.writeByteArray(this.f29310b);
        parcel.writeInt(this.f29311c);
        parcel.writeInt(this.f29312d);
    }

    public C6042a(String str, byte[] bArr, int i, int i2) {
        this.f29309a = str;
        this.f29310b = bArr;
        this.f29311c = i;
        this.f29312d = i2;
    }

    private C6042a(Parcel parcel) {
        this.f29309a = (String) C5953m0.m35138j(parcel.readString());
        this.f29310b = (byte[]) C5953m0.m35138j(parcel.createByteArray());
        this.f29311c = parcel.readInt();
        this.f29312d = parcel.readInt();
    }
}
