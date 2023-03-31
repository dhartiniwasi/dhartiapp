package p180z4;

import android.os.Parcel;
import android.os.Parcelable;
import com.unity3d.ads.metadata.MediationMetaData;
import p033d5.C4133p;
import p040e5.C4240a;
import p040e5.C4243c;

/* renamed from: z4.d */
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public class C6366d extends C4240a {
    public static final Parcelable.Creator<C6366d> CREATOR = new C6389q();

    /* renamed from: a */
    private final String f30597a;
    @Deprecated

    /* renamed from: b */
    private final int f30598b;

    /* renamed from: c */
    private final long f30599c;

    public C6366d(String str, int i, long j) {
        this.f30597a = str;
        this.f30598b = i;
        this.f30599c = j;
    }

    public C6366d(String str, long j) {
        this.f30597a = str;
        this.f30599c = j;
        this.f30598b = -1;
    }

    /* renamed from: I1 */
    public String mo21764I1() {
        return this.f30597a;
    }

    /* renamed from: J1 */
    public long mo21765J1() {
        long j = this.f30599c;
        return j == -1 ? (long) this.f30598b : j;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C6366d) {
            C6366d dVar = (C6366d) obj;
            if (((mo21764I1() == null || !mo21764I1().equals(dVar.mo21764I1())) && (mo21764I1() != null || dVar.mo21764I1() != null)) || mo21765J1() != dVar.mo21765J1()) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return C4133p.m28194b(mo21764I1(), Long.valueOf(mo21765J1()));
    }

    public final String toString() {
        C4133p.C4134a c = C4133p.m28195c(this);
        c.mo17442a(MediationMetaData.KEY_NAME, mo21764I1());
        c.mo17442a(MediationMetaData.KEY_VERSION, Long.valueOf(mo21765J1()));
        return c.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C4243c.m28604a(parcel);
        C4243c.m28620q(parcel, 1, mo21764I1(), false);
        C4243c.m28614k(parcel, 2, this.f30598b);
        C4243c.m28617n(parcel, 3, mo21765J1());
        C4243c.m28605b(parcel, a);
    }
}
