package p148u2;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import p127r2.C5432a;
import p127r2.C5435b;
import p161w3.C5918a0;
import p161w3.C5953m0;
import p177z1.C6214e2;
import p177z1.C6272r1;
import p182a7.C6415d;

/* renamed from: u2.a */
/* compiled from: PictureFrame */
public final class C5709a implements C5432a.C5434b {
    public static final Parcelable.Creator<C5709a> CREATOR = new C5710a();

    /* renamed from: a */
    public final int f28496a;

    /* renamed from: b */
    public final String f28497b;

    /* renamed from: c */
    public final String f28498c;

    /* renamed from: d */
    public final int f28499d;

    /* renamed from: e */
    public final int f28500e;

    /* renamed from: f */
    public final int f28501f;

    /* renamed from: g */
    public final int f28502g;

    /* renamed from: h */
    public final byte[] f28503h;

    /* renamed from: u2.a$a */
    /* compiled from: PictureFrame */
    class C5710a implements Parcelable.Creator<C5709a> {
        C5710a() {
        }

        /* renamed from: a */
        public C5709a createFromParcel(Parcel parcel) {
            return new C5709a(parcel);
        }

        /* renamed from: b */
        public C5709a[] newArray(int i) {
            return new C5709a[i];
        }
    }

    public C5709a(int i, String str, String str2, int i2, int i3, int i4, int i5, byte[] bArr) {
        this.f28496a = i;
        this.f28497b = str;
        this.f28498c = str2;
        this.f28499d = i2;
        this.f28500e = i3;
        this.f28501f = i4;
        this.f28502g = i5;
        this.f28503h = bArr;
    }

    /* renamed from: a */
    public static C5709a m34042a(C5918a0 a0Var) {
        int m = a0Var.mo20560m();
        String A = a0Var.mo20532A(a0Var.mo20560m(), C6415d.f30662a);
        String z = a0Var.mo20573z(a0Var.mo20560m());
        int m2 = a0Var.mo20560m();
        int m3 = a0Var.mo20560m();
        int m4 = a0Var.mo20560m();
        int m5 = a0Var.mo20560m();
        int m6 = a0Var.mo20560m();
        byte[] bArr = new byte[m6];
        a0Var.mo20557j(bArr, 0, m6);
        return new C5709a(m, A, z, m2, m3, m4, m5, bArr);
    }

    /* renamed from: J0 */
    public void mo17874J0(C6214e2.C6216b bVar) {
        bVar.mo21254G(this.f28503h, this.f28496a);
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
        if (obj == null || C5709a.class != obj.getClass()) {
            return false;
        }
        C5709a aVar = (C5709a) obj;
        if (this.f28496a == aVar.f28496a && this.f28497b.equals(aVar.f28497b) && this.f28498c.equals(aVar.f28498c) && this.f28499d == aVar.f28499d && this.f28500e == aVar.f28500e && this.f28501f == aVar.f28501f && this.f28502g == aVar.f28502g && Arrays.equals(this.f28503h, aVar.f28503h)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((((((((((((((527 + this.f28496a) * 31) + this.f28497b.hashCode()) * 31) + this.f28498c.hashCode()) * 31) + this.f28499d) * 31) + this.f28500e) * 31) + this.f28501f) * 31) + this.f28502g) * 31) + Arrays.hashCode(this.f28503h);
    }

    public String toString() {
        return "Picture: mimeType=" + this.f28497b + ", description=" + this.f28498c;
    }

    /* renamed from: u1 */
    public /* synthetic */ byte[] mo17880u1() {
        return C5435b.m33282a(this);
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f28496a);
        parcel.writeString(this.f28497b);
        parcel.writeString(this.f28498c);
        parcel.writeInt(this.f28499d);
        parcel.writeInt(this.f28500e);
        parcel.writeInt(this.f28501f);
        parcel.writeInt(this.f28502g);
        parcel.writeByteArray(this.f28503h);
    }

    C5709a(Parcel parcel) {
        this.f28496a = parcel.readInt();
        this.f28497b = (String) C5953m0.m35138j(parcel.readString());
        this.f28498c = (String) C5953m0.m35138j(parcel.readString());
        this.f28499d = parcel.readInt();
        this.f28500e = parcel.readInt();
        this.f28501f = parcel.readInt();
        this.f28502g = parcel.readInt();
        this.f28503h = (byte[]) C5953m0.m35138j(parcel.createByteArray());
    }
}
