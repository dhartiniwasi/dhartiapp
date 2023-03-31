package p160w2;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import p161w3.C5953m0;

/* renamed from: w2.l */
/* compiled from: PrivFrame */
public final class C5911l extends C5906i {
    public static final Parcelable.Creator<C5911l> CREATOR = new C5912a();

    /* renamed from: b */
    public final String f29041b;

    /* renamed from: c */
    public final byte[] f29042c;

    /* renamed from: w2.l$a */
    /* compiled from: PrivFrame */
    class C5912a implements Parcelable.Creator<C5911l> {
        C5912a() {
        }

        /* renamed from: a */
        public C5911l createFromParcel(Parcel parcel) {
            return new C5911l(parcel);
        }

        /* renamed from: b */
        public C5911l[] newArray(int i) {
            return new C5911l[i];
        }
    }

    public C5911l(String str, byte[] bArr) {
        super("PRIV");
        this.f29041b = str;
        this.f29042c = bArr;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C5911l.class != obj.getClass()) {
            return false;
        }
        C5911l lVar = (C5911l) obj;
        if (!C5953m0.m35124c(this.f29041b, lVar.f29041b) || !Arrays.equals(this.f29042c, lVar.f29042c)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        String str = this.f29041b;
        return ((527 + (str != null ? str.hashCode() : 0)) * 31) + Arrays.hashCode(this.f29042c);
    }

    public String toString() {
        return this.f29032a + ": owner=" + this.f29041b;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f29041b);
        parcel.writeByteArray(this.f29042c);
    }

    C5911l(Parcel parcel) {
        super("PRIV");
        this.f29041b = (String) C5953m0.m35138j(parcel.readString());
        this.f29042c = (byte[]) C5953m0.m35138j(parcel.createByteArray());
    }
}
