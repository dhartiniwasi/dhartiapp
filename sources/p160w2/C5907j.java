package p160w2;

import android.os.Parcel;
import android.os.Parcelable;
import p161w3.C5953m0;

/* renamed from: w2.j */
/* compiled from: InternalFrame */
public final class C5907j extends C5906i {
    public static final Parcelable.Creator<C5907j> CREATOR = new C5908a();

    /* renamed from: b */
    public final String f29033b;

    /* renamed from: c */
    public final String f29034c;

    /* renamed from: d */
    public final String f29035d;

    /* renamed from: w2.j$a */
    /* compiled from: InternalFrame */
    class C5908a implements Parcelable.Creator<C5907j> {
        C5908a() {
        }

        /* renamed from: a */
        public C5907j createFromParcel(Parcel parcel) {
            return new C5907j(parcel);
        }

        /* renamed from: b */
        public C5907j[] newArray(int i) {
            return new C5907j[i];
        }
    }

    public C5907j(String str, String str2, String str3) {
        super("----");
        this.f29033b = str;
        this.f29034c = str2;
        this.f29035d = str3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C5907j.class != obj.getClass()) {
            return false;
        }
        C5907j jVar = (C5907j) obj;
        if (!C5953m0.m35124c(this.f29034c, jVar.f29034c) || !C5953m0.m35124c(this.f29033b, jVar.f29033b) || !C5953m0.m35124c(this.f29035d, jVar.f29035d)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        String str = this.f29033b;
        int i = 0;
        int hashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f29034c;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f29035d;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        return this.f29032a + ": domain=" + this.f29033b + ", description=" + this.f29034c;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f29032a);
        parcel.writeString(this.f29033b);
        parcel.writeString(this.f29035d);
    }

    C5907j(Parcel parcel) {
        super("----");
        this.f29033b = (String) C5953m0.m35138j(parcel.readString());
        this.f29034c = (String) C5953m0.m35138j(parcel.readString());
        this.f29035d = (String) C5953m0.m35138j(parcel.readString());
    }
}
