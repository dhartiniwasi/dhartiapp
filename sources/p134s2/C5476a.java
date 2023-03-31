package p134s2;

import android.os.Parcel;
import android.os.Parcelable;
import p127r2.C5432a;
import p127r2.C5435b;
import p161w3.C5917a;
import p177z1.C6214e2;
import p177z1.C6272r1;

/* renamed from: s2.a */
/* compiled from: AppInfoTable */
public final class C5476a implements C5432a.C5434b {
    public static final Parcelable.Creator<C5476a> CREATOR = new C5477a();

    /* renamed from: a */
    public final int f27816a;

    /* renamed from: b */
    public final String f27817b;

    /* renamed from: s2.a$a */
    /* compiled from: AppInfoTable */
    class C5477a implements Parcelable.Creator<C5476a> {
        C5477a() {
        }

        /* renamed from: a */
        public C5476a createFromParcel(Parcel parcel) {
            return new C5476a(parcel.readInt(), (String) C5917a.m34872e(parcel.readString()));
        }

        /* renamed from: b */
        public C5476a[] newArray(int i) {
            return new C5476a[i];
        }
    }

    public C5476a(int i, String str) {
        this.f27816a = i;
        this.f27817b = str;
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

    public String toString() {
        return "Ait(controlCode=" + this.f27816a + ",url=" + this.f27817b + ")";
    }

    /* renamed from: u1 */
    public /* synthetic */ byte[] mo17880u1() {
        return C5435b.m33282a(this);
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f27817b);
        parcel.writeInt(this.f27816a);
    }
}
