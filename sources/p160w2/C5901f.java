package p160w2;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import p161w3.C5953m0;

/* renamed from: w2.f */
/* compiled from: GeobFrame */
public final class C5901f extends C5906i {
    public static final Parcelable.Creator<C5901f> CREATOR = new C5902a();

    /* renamed from: b */
    public final String f29023b;

    /* renamed from: c */
    public final String f29024c;

    /* renamed from: d */
    public final String f29025d;

    /* renamed from: e */
    public final byte[] f29026e;

    /* renamed from: w2.f$a */
    /* compiled from: GeobFrame */
    class C5902a implements Parcelable.Creator<C5901f> {
        C5902a() {
        }

        /* renamed from: a */
        public C5901f createFromParcel(Parcel parcel) {
            return new C5901f(parcel);
        }

        /* renamed from: b */
        public C5901f[] newArray(int i) {
            return new C5901f[i];
        }
    }

    public C5901f(String str, String str2, String str3, byte[] bArr) {
        super("GEOB");
        this.f29023b = str;
        this.f29024c = str2;
        this.f29025d = str3;
        this.f29026e = bArr;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C5901f.class != obj.getClass()) {
            return false;
        }
        C5901f fVar = (C5901f) obj;
        if (!C5953m0.m35124c(this.f29023b, fVar.f29023b) || !C5953m0.m35124c(this.f29024c, fVar.f29024c) || !C5953m0.m35124c(this.f29025d, fVar.f29025d) || !Arrays.equals(this.f29026e, fVar.f29026e)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        String str = this.f29023b;
        int i = 0;
        int hashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f29024c;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f29025d;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return ((hashCode2 + i) * 31) + Arrays.hashCode(this.f29026e);
    }

    public String toString() {
        return this.f29032a + ": mimeType=" + this.f29023b + ", filename=" + this.f29024c + ", description=" + this.f29025d;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f29023b);
        parcel.writeString(this.f29024c);
        parcel.writeString(this.f29025d);
        parcel.writeByteArray(this.f29026e);
    }

    C5901f(Parcel parcel) {
        super("GEOB");
        this.f29023b = (String) C5953m0.m35138j(parcel.readString());
        this.f29024c = (String) C5953m0.m35138j(parcel.readString());
        this.f29025d = (String) C5953m0.m35138j(parcel.readString());
        this.f29026e = (byte[]) C5953m0.m35138j(parcel.createByteArray());
    }
}
