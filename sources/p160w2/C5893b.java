package p160w2;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import p161w3.C5953m0;

/* renamed from: w2.b */
/* compiled from: BinaryFrame */
public final class C5893b extends C5906i {
    public static final Parcelable.Creator<C5893b> CREATOR = new C5894a();

    /* renamed from: b */
    public final byte[] f29008b;

    /* renamed from: w2.b$a */
    /* compiled from: BinaryFrame */
    class C5894a implements Parcelable.Creator<C5893b> {
        C5894a() {
        }

        /* renamed from: a */
        public C5893b createFromParcel(Parcel parcel) {
            return new C5893b(parcel);
        }

        /* renamed from: b */
        public C5893b[] newArray(int i) {
            return new C5893b[i];
        }
    }

    public C5893b(String str, byte[] bArr) {
        super(str);
        this.f29008b = bArr;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C5893b.class != obj.getClass()) {
            return false;
        }
        C5893b bVar = (C5893b) obj;
        if (!this.f29032a.equals(bVar.f29032a) || !Arrays.equals(this.f29008b, bVar.f29008b)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((527 + this.f29032a.hashCode()) * 31) + Arrays.hashCode(this.f29008b);
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f29032a);
        parcel.writeByteArray(this.f29008b);
    }

    C5893b(Parcel parcel) {
        super((String) C5953m0.m35138j(parcel.readString()));
        this.f29008b = (byte[]) C5953m0.m35138j(parcel.createByteArray());
    }
}
