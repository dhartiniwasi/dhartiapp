package p033d5;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;
import p040e5.C4240a;
import p040e5.C4243c;

/* renamed from: d5.v */
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public class C4153v extends C4240a {
    public static final Parcelable.Creator<C4153v> CREATOR = new C4166z();

    /* renamed from: a */
    private final int f23414a;

    /* renamed from: b */
    private List<C4130o> f23415b;

    public C4153v(int i, List<C4130o> list) {
        this.f23414a = i;
        this.f23415b = list;
    }

    /* renamed from: I1 */
    public final int mo17478I1() {
        return this.f23414a;
    }

    /* renamed from: J1 */
    public final List<C4130o> mo17479J1() {
        return this.f23415b;
    }

    /* renamed from: K1 */
    public final void mo17480K1(C4130o oVar) {
        if (this.f23415b == null) {
            this.f23415b = new ArrayList();
        }
        this.f23415b.add(oVar);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C4243c.m28604a(parcel);
        C4243c.m28614k(parcel, 1, this.f23414a);
        C4243c.m28624u(parcel, 2, this.f23415b, false);
        C4243c.m28605b(parcel, a);
    }
}
