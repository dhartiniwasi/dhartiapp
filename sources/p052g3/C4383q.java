package p052g3;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p127r2.C5432a;
import p127r2.C5435b;
import p177z1.C6214e2;
import p177z1.C6272r1;

/* renamed from: g3.q */
/* compiled from: HlsTrackMetadataEntry */
public final class C4383q implements C5432a.C5434b {
    public static final Parcelable.Creator<C4383q> CREATOR = new C4384a();

    /* renamed from: a */
    public final String f24471a;

    /* renamed from: b */
    public final String f24472b;

    /* renamed from: c */
    public final List<C4385b> f24473c;

    /* renamed from: g3.q$a */
    /* compiled from: HlsTrackMetadataEntry */
    class C4384a implements Parcelable.Creator<C4383q> {
        C4384a() {
        }

        /* renamed from: a */
        public C4383q createFromParcel(Parcel parcel) {
            return new C4383q(parcel);
        }

        /* renamed from: b */
        public C4383q[] newArray(int i) {
            return new C4383q[i];
        }
    }

    public C4383q(String str, String str2, List<C4385b> list) {
        this.f24471a = str;
        this.f24472b = str2;
        this.f24473c = Collections.unmodifiableList(new ArrayList(list));
    }

    /* renamed from: J0 */
    public /* synthetic */ void mo17874J0(C6214e2.C6216b bVar) {
        C5435b.m33284c(this, bVar);
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
        if (obj == null || C4383q.class != obj.getClass()) {
            return false;
        }
        C4383q qVar = (C4383q) obj;
        if (!TextUtils.equals(this.f24471a, qVar.f24471a) || !TextUtils.equals(this.f24472b, qVar.f24472b) || !this.f24473c.equals(qVar.f24473c)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        String str = this.f24471a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f24472b;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return ((hashCode + i) * 31) + this.f24473c.hashCode();
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append("HlsTrackMetadataEntry");
        if (this.f24471a != null) {
            str = " [" + this.f24471a + ", " + this.f24472b + "]";
        } else {
            str = "";
        }
        sb.append(str);
        return sb.toString();
    }

    /* renamed from: u1 */
    public /* synthetic */ byte[] mo17880u1() {
        return C5435b.m33282a(this);
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f24471a);
        parcel.writeString(this.f24472b);
        int size = this.f24473c.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            parcel.writeParcelable(this.f24473c.get(i2), 0);
        }
    }

    C4383q(Parcel parcel) {
        this.f24471a = parcel.readString();
        this.f24472b = parcel.readString();
        int readInt = parcel.readInt();
        ArrayList arrayList = new ArrayList(readInt);
        for (int i = 0; i < readInt; i++) {
            arrayList.add((C4385b) parcel.readParcelable(C4385b.class.getClassLoader()));
        }
        this.f24473c = Collections.unmodifiableList(arrayList);
    }

    /* renamed from: g3.q$b */
    /* compiled from: HlsTrackMetadataEntry */
    public static final class C4385b implements Parcelable {
        public static final Parcelable.Creator<C4385b> CREATOR = new C4386a();

        /* renamed from: a */
        public final int f24474a;

        /* renamed from: b */
        public final int f24475b;

        /* renamed from: c */
        public final String f24476c;

        /* renamed from: d */
        public final String f24477d;

        /* renamed from: e */
        public final String f24478e;

        /* renamed from: f */
        public final String f24479f;

        /* renamed from: g3.q$b$a */
        /* compiled from: HlsTrackMetadataEntry */
        class C4386a implements Parcelable.Creator<C4385b> {
            C4386a() {
            }

            /* renamed from: a */
            public C4385b createFromParcel(Parcel parcel) {
                return new C4385b(parcel);
            }

            /* renamed from: b */
            public C4385b[] newArray(int i) {
                return new C4385b[i];
            }
        }

        public C4385b(int i, int i2, String str, String str2, String str3, String str4) {
            this.f24474a = i;
            this.f24475b = i2;
            this.f24476c = str;
            this.f24477d = str2;
            this.f24478e = str3;
            this.f24479f = str4;
        }

        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || C4385b.class != obj.getClass()) {
                return false;
            }
            C4385b bVar = (C4385b) obj;
            if (this.f24474a != bVar.f24474a || this.f24475b != bVar.f24475b || !TextUtils.equals(this.f24476c, bVar.f24476c) || !TextUtils.equals(this.f24477d, bVar.f24477d) || !TextUtils.equals(this.f24478e, bVar.f24478e) || !TextUtils.equals(this.f24479f, bVar.f24479f)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            int i = ((this.f24474a * 31) + this.f24475b) * 31;
            String str = this.f24476c;
            int i2 = 0;
            int hashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
            String str2 = this.f24477d;
            int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            String str3 = this.f24478e;
            int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
            String str4 = this.f24479f;
            if (str4 != null) {
                i2 = str4.hashCode();
            }
            return hashCode3 + i2;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f24474a);
            parcel.writeInt(this.f24475b);
            parcel.writeString(this.f24476c);
            parcel.writeString(this.f24477d);
            parcel.writeString(this.f24478e);
            parcel.writeString(this.f24479f);
        }

        C4385b(Parcel parcel) {
            this.f24474a = parcel.readInt();
            this.f24475b = parcel.readInt();
            this.f24476c = parcel.readString();
            this.f24477d = parcel.readString();
            this.f24478e = parcel.readString();
            this.f24479f = parcel.readString();
        }
    }
}
