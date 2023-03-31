package p160w2;

import android.os.Parcel;
import android.os.Parcelable;
import p161w3.C5953m0;

/* renamed from: w2.e */
/* compiled from: CommentFrame */
public final class C5899e extends C5906i {
    public static final Parcelable.Creator<C5899e> CREATOR = new C5900a();

    /* renamed from: b */
    public final String f29020b;

    /* renamed from: c */
    public final String f29021c;

    /* renamed from: d */
    public final String f29022d;

    /* renamed from: w2.e$a */
    /* compiled from: CommentFrame */
    class C5900a implements Parcelable.Creator<C5899e> {
        C5900a() {
        }

        /* renamed from: a */
        public C5899e createFromParcel(Parcel parcel) {
            return new C5899e(parcel);
        }

        /* renamed from: b */
        public C5899e[] newArray(int i) {
            return new C5899e[i];
        }
    }

    public C5899e(String str, String str2, String str3) {
        super("COMM");
        this.f29020b = str;
        this.f29021c = str2;
        this.f29022d = str3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C5899e.class != obj.getClass()) {
            return false;
        }
        C5899e eVar = (C5899e) obj;
        if (!C5953m0.m35124c(this.f29021c, eVar.f29021c) || !C5953m0.m35124c(this.f29020b, eVar.f29020b) || !C5953m0.m35124c(this.f29022d, eVar.f29022d)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        String str = this.f29020b;
        int i = 0;
        int hashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f29021c;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f29022d;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        return this.f29032a + ": language=" + this.f29020b + ", description=" + this.f29021c;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f29032a);
        parcel.writeString(this.f29020b);
        parcel.writeString(this.f29022d);
    }

    C5899e(Parcel parcel) {
        super("COMM");
        this.f29020b = (String) C5953m0.m35138j(parcel.readString());
        this.f29021c = (String) C5953m0.m35138j(parcel.readString());
        this.f29022d = (String) C5953m0.m35138j(parcel.readString());
    }
}
