package p160w2;

import android.os.Parcel;
import android.os.Parcelable;
import p161w3.C5953m0;

/* renamed from: w2.n */
/* compiled from: UrlLinkFrame */
public final class C5915n extends C5906i {
    public static final Parcelable.Creator<C5915n> CREATOR = new C5916a();

    /* renamed from: b */
    public final String f29045b;

    /* renamed from: c */
    public final String f29046c;

    /* renamed from: w2.n$a */
    /* compiled from: UrlLinkFrame */
    class C5916a implements Parcelable.Creator<C5915n> {
        C5916a() {
        }

        /* renamed from: a */
        public C5915n createFromParcel(Parcel parcel) {
            return new C5915n(parcel);
        }

        /* renamed from: b */
        public C5915n[] newArray(int i) {
            return new C5915n[i];
        }
    }

    public C5915n(String str, String str2, String str3) {
        super(str);
        this.f29045b = str2;
        this.f29046c = str3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C5915n.class != obj.getClass()) {
            return false;
        }
        C5915n nVar = (C5915n) obj;
        if (!this.f29032a.equals(nVar.f29032a) || !C5953m0.m35124c(this.f29045b, nVar.f29045b) || !C5953m0.m35124c(this.f29046c, nVar.f29046c)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int hashCode = (527 + this.f29032a.hashCode()) * 31;
        String str = this.f29045b;
        int i = 0;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f29046c;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        return this.f29032a + ": url=" + this.f29046c;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f29032a);
        parcel.writeString(this.f29045b);
        parcel.writeString(this.f29046c);
    }

    C5915n(Parcel parcel) {
        super((String) C5953m0.m35138j(parcel.readString()));
        this.f29045b = parcel.readString();
        this.f29046c = (String) C5953m0.m35138j(parcel.readString());
    }
}
