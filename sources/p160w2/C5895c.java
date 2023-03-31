package p160w2;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import p161w3.C5953m0;

/* renamed from: w2.c */
/* compiled from: ChapterFrame */
public final class C5895c extends C5906i {
    public static final Parcelable.Creator<C5895c> CREATOR = new C5896a();

    /* renamed from: b */
    public final String f29009b;

    /* renamed from: c */
    public final int f29010c;

    /* renamed from: d */
    public final int f29011d;

    /* renamed from: e */
    public final long f29012e;

    /* renamed from: f */
    public final long f29013f;

    /* renamed from: g */
    private final C5906i[] f29014g;

    /* renamed from: w2.c$a */
    /* compiled from: ChapterFrame */
    class C5896a implements Parcelable.Creator<C5895c> {
        C5896a() {
        }

        /* renamed from: a */
        public C5895c createFromParcel(Parcel parcel) {
            return new C5895c(parcel);
        }

        /* renamed from: b */
        public C5895c[] newArray(int i) {
            return new C5895c[i];
        }
    }

    public C5895c(String str, int i, int i2, long j, long j2, C5906i[] iVarArr) {
        super("CHAP");
        this.f29009b = str;
        this.f29010c = i;
        this.f29011d = i2;
        this.f29012e = j;
        this.f29013f = j2;
        this.f29014g = iVarArr;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C5895c.class != obj.getClass()) {
            return false;
        }
        C5895c cVar = (C5895c) obj;
        if (this.f29010c == cVar.f29010c && this.f29011d == cVar.f29011d && this.f29012e == cVar.f29012e && this.f29013f == cVar.f29013f && C5953m0.m35124c(this.f29009b, cVar.f29009b) && Arrays.equals(this.f29014g, cVar.f29014g)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i = (((((((527 + this.f29010c) * 31) + this.f29011d) * 31) + ((int) this.f29012e)) * 31) + ((int) this.f29013f)) * 31;
        String str = this.f29009b;
        return i + (str != null ? str.hashCode() : 0);
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f29009b);
        parcel.writeInt(this.f29010c);
        parcel.writeInt(this.f29011d);
        parcel.writeLong(this.f29012e);
        parcel.writeLong(this.f29013f);
        parcel.writeInt(this.f29014g.length);
        for (C5906i writeParcelable : this.f29014g) {
            parcel.writeParcelable(writeParcelable, 0);
        }
    }

    C5895c(Parcel parcel) {
        super("CHAP");
        this.f29009b = (String) C5953m0.m35138j(parcel.readString());
        this.f29010c = parcel.readInt();
        this.f29011d = parcel.readInt();
        this.f29012e = parcel.readLong();
        this.f29013f = parcel.readLong();
        int readInt = parcel.readInt();
        this.f29014g = new C5906i[readInt];
        for (int i = 0; i < readInt; i++) {
            this.f29014g[i] = (C5906i) parcel.readParcelable(C5906i.class.getClassLoader());
        }
    }
}
