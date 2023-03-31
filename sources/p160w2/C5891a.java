package p160w2;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import p161w3.C5953m0;
import p177z1.C6214e2;

/* renamed from: w2.a */
/* compiled from: ApicFrame */
public final class C5891a extends C5906i {
    public static final Parcelable.Creator<C5891a> CREATOR = new C5892a();

    /* renamed from: b */
    public final String f29004b;

    /* renamed from: c */
    public final String f29005c;

    /* renamed from: d */
    public final int f29006d;

    /* renamed from: e */
    public final byte[] f29007e;

    /* renamed from: w2.a$a */
    /* compiled from: ApicFrame */
    class C5892a implements Parcelable.Creator<C5891a> {
        C5892a() {
        }

        /* renamed from: a */
        public C5891a createFromParcel(Parcel parcel) {
            return new C5891a(parcel);
        }

        /* renamed from: b */
        public C5891a[] newArray(int i) {
            return new C5891a[i];
        }
    }

    public C5891a(String str, String str2, int i, byte[] bArr) {
        super("APIC");
        this.f29004b = str;
        this.f29005c = str2;
        this.f29006d = i;
        this.f29007e = bArr;
    }

    /* renamed from: J0 */
    public void mo17874J0(C6214e2.C6216b bVar) {
        bVar.mo21254G(this.f29007e, this.f29006d);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C5891a.class != obj.getClass()) {
            return false;
        }
        C5891a aVar = (C5891a) obj;
        if (this.f29006d != aVar.f29006d || !C5953m0.m35124c(this.f29004b, aVar.f29004b) || !C5953m0.m35124c(this.f29005c, aVar.f29005c) || !Arrays.equals(this.f29007e, aVar.f29007e)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int i = (527 + this.f29006d) * 31;
        String str = this.f29004b;
        int i2 = 0;
        int hashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f29005c;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return ((hashCode + i2) * 31) + Arrays.hashCode(this.f29007e);
    }

    public String toString() {
        return this.f29032a + ": mimeType=" + this.f29004b + ", description=" + this.f29005c;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f29004b);
        parcel.writeString(this.f29005c);
        parcel.writeInt(this.f29006d);
        parcel.writeByteArray(this.f29007e);
    }

    C5891a(Parcel parcel) {
        super("APIC");
        this.f29004b = (String) C5953m0.m35138j(parcel.readString());
        this.f29005c = parcel.readString();
        this.f29006d = parcel.readInt();
        this.f29007e = (byte[]) C5953m0.m35138j(parcel.createByteArray());
    }
}
