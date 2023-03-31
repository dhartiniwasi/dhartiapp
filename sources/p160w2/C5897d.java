package p160w2;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import p161w3.C5953m0;

/* renamed from: w2.d */
/* compiled from: ChapterTocFrame */
public final class C5897d extends C5906i {
    public static final Parcelable.Creator<C5897d> CREATOR = new C5898a();

    /* renamed from: b */
    public final String f29015b;

    /* renamed from: c */
    public final boolean f29016c;

    /* renamed from: d */
    public final boolean f29017d;

    /* renamed from: e */
    public final String[] f29018e;

    /* renamed from: f */
    private final C5906i[] f29019f;

    /* renamed from: w2.d$a */
    /* compiled from: ChapterTocFrame */
    class C5898a implements Parcelable.Creator<C5897d> {
        C5898a() {
        }

        /* renamed from: a */
        public C5897d createFromParcel(Parcel parcel) {
            return new C5897d(parcel);
        }

        /* renamed from: b */
        public C5897d[] newArray(int i) {
            return new C5897d[i];
        }
    }

    public C5897d(String str, boolean z, boolean z2, String[] strArr, C5906i[] iVarArr) {
        super("CTOC");
        this.f29015b = str;
        this.f29016c = z;
        this.f29017d = z2;
        this.f29018e = strArr;
        this.f29019f = iVarArr;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C5897d.class != obj.getClass()) {
            return false;
        }
        C5897d dVar = (C5897d) obj;
        if (this.f29016c != dVar.f29016c || this.f29017d != dVar.f29017d || !C5953m0.m35124c(this.f29015b, dVar.f29015b) || !Arrays.equals(this.f29018e, dVar.f29018e) || !Arrays.equals(this.f29019f, dVar.f29019f)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int i = (((true + (this.f29016c ? 1 : 0)) * 31) + (this.f29017d ? 1 : 0)) * 31;
        String str = this.f29015b;
        return i + (str != null ? str.hashCode() : 0);
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f29015b);
        parcel.writeByte(this.f29016c ? (byte) 1 : 0);
        parcel.writeByte(this.f29017d ? (byte) 1 : 0);
        parcel.writeStringArray(this.f29018e);
        parcel.writeInt(this.f29019f.length);
        for (C5906i writeParcelable : this.f29019f) {
            parcel.writeParcelable(writeParcelable, 0);
        }
    }

    C5897d(Parcel parcel) {
        super("CTOC");
        this.f29015b = (String) C5953m0.m35138j(parcel.readString());
        boolean z = true;
        this.f29016c = parcel.readByte() != 0;
        this.f29017d = parcel.readByte() == 0 ? false : z;
        this.f29018e = (String[]) C5953m0.m35138j(parcel.createStringArray());
        int readInt = parcel.readInt();
        this.f29019f = new C5906i[readInt];
        for (int i = 0; i < readInt; i++) {
            this.f29019f[i] = (C5906i) parcel.readParcelable(C5906i.class.getClassLoader());
        }
    }
}
