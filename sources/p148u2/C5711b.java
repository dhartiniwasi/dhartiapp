package p148u2;

import android.os.Parcel;
import android.os.Parcelable;
import p127r2.C5432a;
import p127r2.C5435b;
import p161w3.C5953m0;
import p177z1.C6214e2;
import p177z1.C6272r1;

@Deprecated
/* renamed from: u2.b */
/* compiled from: VorbisComment */
public class C5711b implements C5432a.C5434b {
    public static final Parcelable.Creator<C5711b> CREATOR = new C5712a();

    /* renamed from: a */
    public final String f28504a;

    /* renamed from: b */
    public final String f28505b;

    /* renamed from: u2.b$a */
    /* compiled from: VorbisComment */
    class C5712a implements Parcelable.Creator<C5711b> {
        C5712a() {
        }

        /* renamed from: a */
        public C5711b createFromParcel(Parcel parcel) {
            return new C5711b(parcel);
        }

        /* renamed from: b */
        public C5711b[] newArray(int i) {
            return new C5711b[i];
        }
    }

    public C5711b(String str, String str2) {
        this.f28504a = str;
        this.f28505b = str2;
    }

    /* renamed from: J0 */
    public void mo17874J0(C6214e2.C6216b bVar) {
        String str = this.f28504a;
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case 62359119:
                if (str.equals("ALBUM")) {
                    c = 0;
                    break;
                }
                break;
            case 79833656:
                if (str.equals("TITLE")) {
                    c = 1;
                    break;
                }
                break;
            case 428414940:
                if (str.equals("DESCRIPTION")) {
                    c = 2;
                    break;
                }
                break;
            case 1746739798:
                if (str.equals("ALBUMARTIST")) {
                    c = 3;
                    break;
                }
                break;
            case 1939198791:
                if (str.equals("ARTIST")) {
                    c = 4;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                bVar.mo21259L(this.f28505b);
                return;
            case 1:
                bVar.mo21282i0(this.f28505b);
                return;
            case 2:
                bVar.mo21266S(this.f28505b);
                return;
            case 3:
                bVar.mo21258K(this.f28505b);
                return;
            case 4:
                bVar.mo21260M(this.f28505b);
                return;
            default:
                return;
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
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C5711b bVar = (C5711b) obj;
        if (!this.f28504a.equals(bVar.f28504a) || !this.f28505b.equals(bVar.f28505b)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((527 + this.f28504a.hashCode()) * 31) + this.f28505b.hashCode();
    }

    public String toString() {
        return "VC: " + this.f28504a + "=" + this.f28505b;
    }

    /* renamed from: u1 */
    public /* synthetic */ byte[] mo17880u1() {
        return C5435b.m33282a(this);
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f28504a);
        parcel.writeString(this.f28505b);
    }

    protected C5711b(Parcel parcel) {
        this.f28504a = (String) C5953m0.m35138j(parcel.readString());
        this.f28505b = (String) C5953m0.m35138j(parcel.readString());
    }
}
