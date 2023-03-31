package p293m7;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.firebase.auth.C7802g;
import com.google.firebase.auth.C7806h;
import com.google.firebase.auth.C7810i;
import com.google.firebase.auth.C7840p1;
import com.google.firebase.auth.C7869z;
import java.util.List;
import p033d5.C4141r;
import p040e5.C4243c;

/* renamed from: m7.g1 */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C11823g1 implements C7810i {
    public static final Parcelable.Creator<C11823g1> CREATOR = new C11826h1();

    /* renamed from: a */
    private C11841m1 f44497a;

    /* renamed from: b */
    private C11817e1 f44498b;

    /* renamed from: c */
    private C7840p1 f44499c;

    public C11823g1(C11841m1 m1Var) {
        C11841m1 m1Var2 = (C11841m1) C4141r.m28221k(m1Var);
        this.f44497a = m1Var2;
        List q2 = m1Var2.mo36084q2();
        this.f44498b = null;
        for (int i = 0; i < q2.size(); i++) {
            if (!TextUtils.isEmpty(((C11829i1) q2.get(i)).zza())) {
                this.f44498b = new C11817e1(((C11829i1) q2.get(i)).mo26206D(), ((C11829i1) q2.get(i)).zza(), m1Var.mo36088u2());
            }
        }
        if (this.f44498b == null) {
            this.f44498b = new C11817e1(m1Var.mo36088u2());
        }
        this.f44499c = m1Var.mo36080m2();
    }

    C11823g1(C11841m1 m1Var, C11817e1 e1Var, C7840p1 p1Var) {
        this.f44497a = m1Var;
        this.f44498b = e1Var;
        this.f44499c = p1Var;
    }

    /* renamed from: B0 */
    public final C7802g mo26105B0() {
        return this.f44498b;
    }

    /* renamed from: H0 */
    public final C7806h mo26106H0() {
        return this.f44499c;
    }

    public final int describeContents() {
        return 0;
    }

    /* renamed from: g1 */
    public final C7869z mo26107g1() {
        return this.f44497a;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C4243c.m28604a(parcel);
        C4243c.m28619p(parcel, 1, this.f44497a, i, false);
        C4243c.m28619p(parcel, 2, this.f44498b, i, false);
        C4243c.m28619p(parcel, 3, this.f44499c, i, false);
        C4243c.m28605b(parcel, a);
    }
}
