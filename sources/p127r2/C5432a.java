package p127r2;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.List;
import p161w3.C5953m0;
import p177z1.C6214e2;
import p177z1.C6272r1;

/* renamed from: r2.a */
/* compiled from: Metadata */
public final class C5432a implements Parcelable {
    public static final Parcelable.Creator<C5432a> CREATOR = new C5433a();

    /* renamed from: a */
    private final C5434b[] f27691a;

    /* renamed from: r2.a$a */
    /* compiled from: Metadata */
    class C5433a implements Parcelable.Creator<C5432a> {
        C5433a() {
        }

        /* renamed from: a */
        public C5432a createFromParcel(Parcel parcel) {
            return new C5432a(parcel);
        }

        /* renamed from: b */
        public C5432a[] newArray(int i) {
            return new C5432a[i];
        }
    }

    /* renamed from: r2.a$b */
    /* compiled from: Metadata */
    public interface C5434b extends Parcelable {
        /* renamed from: J0 */
        void mo17874J0(C6214e2.C6216b bVar);

        /* renamed from: c0 */
        C6272r1 mo17875c0();

        /* renamed from: u1 */
        byte[] mo17880u1();
    }

    public C5432a(C5434b... bVarArr) {
        this.f27691a = bVarArr;
    }

    /* renamed from: a */
    public C5432a mo19693a(C5434b... bVarArr) {
        if (bVarArr.length == 0) {
            return this;
        }
        return new C5432a((C5434b[]) C5953m0.m35079F0(this.f27691a, bVarArr));
    }

    /* renamed from: b */
    public C5432a mo19694b(C5432a aVar) {
        return aVar == null ? this : mo19693a(aVar.f27691a);
    }

    /* renamed from: c */
    public C5434b mo19695c(int i) {
        return this.f27691a[i];
    }

    /* renamed from: d */
    public int mo19696d() {
        return this.f27691a.length;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C5432a.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.f27691a, ((C5432a) obj).f27691a);
    }

    public int hashCode() {
        return Arrays.hashCode(this.f27691a);
    }

    public String toString() {
        return "entries=" + Arrays.toString(this.f27691a);
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f27691a.length);
        for (C5434b writeParcelable : this.f27691a) {
            parcel.writeParcelable(writeParcelable, 0);
        }
    }

    public C5432a(List<? extends C5434b> list) {
        this.f27691a = (C5434b[]) list.toArray(new C5434b[0]);
    }

    C5432a(Parcel parcel) {
        this.f27691a = new C5434b[parcel.readInt()];
        int i = 0;
        while (true) {
            C5434b[] bVarArr = this.f27691a;
            if (i < bVarArr.length) {
                bVarArr[i] = (C5434b) parcel.readParcelable(C5434b.class.getClassLoader());
                i++;
            } else {
                return;
            }
        }
    }
}
