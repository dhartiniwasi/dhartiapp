package p293m7;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.auth.C7807h0;
import com.google.firebase.auth.C7810i;
import com.google.firebase.auth.C7811i0;
import com.google.firebase.auth.C7815j0;
import com.google.firebase.auth.C7819k0;
import com.google.firebase.auth.C7840p1;
import com.google.firebase.auth.C7848s0;
import com.google.firebase.auth.FirebaseAuth;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p033d5.C4141r;
import p040e5.C4243c;
import p218e6.C9975i;
import p246h7.C10412f;

/* renamed from: m7.h */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C11824h extends C7815j0 {
    public static final Parcelable.Creator<C11824h> CREATOR = new C11827i();

    /* renamed from: a */
    private final List f44500a = new ArrayList();

    /* renamed from: b */
    private final C11830j f44501b;

    /* renamed from: c */
    private final String f44502c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final C7840p1 f44503d;

    /* renamed from: e */
    private final C11841m1 f44504e;

    public C11824h(List list, C11830j jVar, String str, C7840p1 p1Var, C11841m1 m1Var) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C7811i0 i0Var = (C7811i0) it.next();
            if (i0Var instanceof C7848s0) {
                this.f44500a.add((C7848s0) i0Var);
            }
        }
        this.f44501b = (C11830j) C4141r.m28221k(jVar);
        this.f44502c = C4141r.m28217g(str);
        this.f44503d = p1Var;
        this.f44504e = m1Var;
    }

    /* renamed from: I1 */
    public final List<C7811i0> mo26124I1() {
        ArrayList arrayList = new ArrayList();
        for (C7848s0 add : this.f44500a) {
            arrayList.add(add);
        }
        return arrayList;
    }

    /* renamed from: J1 */
    public final C7819k0 mo26125J1() {
        return this.f44501b;
    }

    /* renamed from: K1 */
    public final C9975i<C7810i> mo26126K1(C7807h0 h0Var) {
        return FirebaseAuth.getInstance(C10412f.m52583p(this.f44502c)).mo26009a0(h0Var, this.f44501b, this.f44504e).mo26355j(new C11821g(this));
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C4243c.m28604a(parcel);
        C4243c.m28624u(parcel, 1, this.f44500a, false);
        C4243c.m28619p(parcel, 2, this.f44501b, i, false);
        C4243c.m28620q(parcel, 3, this.f44502c, false);
        C4243c.m28619p(parcel, 4, this.f44503d, i, false);
        C4243c.m28619p(parcel, 5, this.f44504e, i, false);
        C4243c.m28605b(parcel, a);
    }
}
