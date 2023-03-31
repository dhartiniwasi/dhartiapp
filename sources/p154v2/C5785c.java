package p154v2;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import p127r2.C5432a;
import p127r2.C5435b;
import p161w3.C5917a;
import p177z1.C6214e2;
import p177z1.C6272r1;

/* renamed from: v2.c */
/* compiled from: IcyInfo */
public final class C5785c implements C5432a.C5434b {
    public static final Parcelable.Creator<C5785c> CREATOR = new C5786a();

    /* renamed from: a */
    public final byte[] f28776a;

    /* renamed from: b */
    public final String f28777b;

    /* renamed from: c */
    public final String f28778c;

    /* renamed from: v2.c$a */
    /* compiled from: IcyInfo */
    class C5786a implements Parcelable.Creator<C5785c> {
        C5786a() {
        }

        /* renamed from: a */
        public C5785c createFromParcel(Parcel parcel) {
            return new C5785c(parcel);
        }

        /* renamed from: b */
        public C5785c[] newArray(int i) {
            return new C5785c[i];
        }
    }

    public C5785c(byte[] bArr, String str, String str2) {
        this.f28776a = bArr;
        this.f28777b = str;
        this.f28778c = str2;
    }

    /* renamed from: J0 */
    public void mo17874J0(C6214e2.C6216b bVar) {
        String str = this.f28777b;
        if (str != null) {
            bVar.mo21282i0(str);
        }
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
        if (obj == null || C5785c.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.f28776a, ((C5785c) obj).f28776a);
    }

    public int hashCode() {
        return Arrays.hashCode(this.f28776a);
    }

    public String toString() {
        return String.format("ICY: title=\"%s\", url=\"%s\", rawMetadata.length=\"%s\"", new Object[]{this.f28777b, this.f28778c, Integer.valueOf(this.f28776a.length)});
    }

    /* renamed from: u1 */
    public /* synthetic */ byte[] mo17880u1() {
        return C5435b.m33282a(this);
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeByteArray(this.f28776a);
        parcel.writeString(this.f28777b);
        parcel.writeString(this.f28778c);
    }

    C5785c(Parcel parcel) {
        this.f28776a = (byte[]) C5917a.m34872e(parcel.createByteArray());
        this.f28777b = parcel.readString();
        this.f28778c = parcel.readString();
    }
}
