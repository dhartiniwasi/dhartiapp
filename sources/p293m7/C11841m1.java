package p293m7;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.p026firebaseauthapi.C3784tv;
import com.google.firebase.auth.C7778a0;
import com.google.firebase.auth.C7803g0;
import com.google.firebase.auth.C7811i0;
import com.google.firebase.auth.C7840p1;
import com.google.firebase.auth.C7848s0;
import com.google.firebase.auth.C7863x0;
import com.google.firebase.auth.C7869z;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p033d5.C4141r;
import p040e5.C4243c;
import p246h7.C10412f;

/* renamed from: m7.m1 */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C11841m1 extends C7869z {
    public static final Parcelable.Creator<C11841m1> CREATOR = new C11844n1();

    /* renamed from: a */
    private C3784tv f44538a;

    /* renamed from: b */
    private C11829i1 f44539b;

    /* renamed from: c */
    private final String f44540c;

    /* renamed from: d */
    private String f44541d;

    /* renamed from: e */
    private List f44542e;

    /* renamed from: f */
    private List f44543f;

    /* renamed from: g */
    private String f44544g;

    /* renamed from: h */
    private Boolean f44545h;

    /* renamed from: i */
    private C11847o1 f44546i;

    /* renamed from: r */
    private boolean f44547r;

    /* renamed from: s */
    private C7840p1 f44548s;

    /* renamed from: t */
    private C11819f0 f44549t;

    public C11841m1(C10412f fVar, List list) {
        C4141r.m28221k(fVar);
        this.f44540c = fVar.mo33470q();
        this.f44541d = "com.google.firebase.auth.internal.DefaultFirebaseUser";
        this.f44544g = "2";
        mo26246f2(list);
    }

    /* renamed from: D */
    public final String mo26206D() {
        return this.f44539b.mo26206D();
    }

    /* renamed from: K */
    public final boolean mo26207K() {
        return this.f44539b.mo26207K();
    }

    /* renamed from: K1 */
    public final C7778a0 mo26225K1() {
        return this.f44546i;
    }

    /* renamed from: L1 */
    public final /* synthetic */ C7803g0 mo26226L1() {
        return new C11818f(this);
    }

    /* renamed from: M1 */
    public final List<? extends C7863x0> mo26227M1() {
        return this.f44542e;
    }

    /* renamed from: N1 */
    public final String mo26228N1() {
        Map map;
        C3784tv tvVar = this.f44538a;
        if (tvVar == null || tvVar.mo16834J1() == null || (map = (Map) C11807b0.m57198a(tvVar.mo16834J1()).mo26054b().get("firebase")) == null) {
            return null;
        }
        return (String) map.get("tenant");
    }

    /* renamed from: O1 */
    public final boolean mo26229O1() {
        Boolean bool = this.f44545h;
        if (bool == null || bool.booleanValue()) {
            C3784tv tvVar = this.f44538a;
            String e = tvVar != null ? C11807b0.m57198a(tvVar.mo16834J1()).mo26057e() : "";
            boolean z = false;
            if (this.f44542e.size() <= 1 && (e == null || !e.equals("custom"))) {
                z = true;
            }
            this.f44545h = Boolean.valueOf(z);
        }
        return this.f44545h.booleanValue();
    }

    /* renamed from: Y */
    public final String mo26208Y() {
        return this.f44539b.mo26208Y();
    }

    /* renamed from: b */
    public final String mo26209b() {
        return this.f44539b.mo26209b();
    }

    /* renamed from: d2 */
    public final C10412f mo26244d2() {
        return C10412f.m52583p(this.f44540c);
    }

    /* renamed from: e2 */
    public final /* bridge */ /* synthetic */ C7869z mo26245e2() {
        mo36082o2();
        return this;
    }

    /* renamed from: f2 */
    public final synchronized C7869z mo26246f2(List list) {
        C4141r.m28221k(list);
        this.f44542e = new ArrayList(list.size());
        this.f44543f = new ArrayList(list.size());
        for (int i = 0; i < list.size(); i++) {
            C7863x0 x0Var = (C7863x0) list.get(i);
            if (x0Var.mo26206D().equals("firebase")) {
                this.f44539b = (C11829i1) x0Var;
            } else {
                this.f44543f.add(x0Var.mo26206D());
            }
            this.f44542e.add((C11829i1) x0Var);
        }
        if (this.f44539b == null) {
            this.f44539b = (C11829i1) this.f44542e.get(0);
        }
        return this;
    }

    /* renamed from: g2 */
    public final C3784tv mo26247g2() {
        return this.f44538a;
    }

    /* renamed from: h2 */
    public final String mo26248h2() {
        return this.f44538a.mo16834J1();
    }

    /* renamed from: i2 */
    public final String mo26249i2() {
        return this.f44538a.mo16837M1();
    }

    /* renamed from: j1 */
    public final String mo26210j1() {
        return this.f44539b.mo26210j1();
    }

    /* renamed from: j2 */
    public final List mo26250j2() {
        return this.f44543f;
    }

    /* renamed from: k2 */
    public final void mo26251k2(C3784tv tvVar) {
        this.f44538a = (C3784tv) C4141r.m28221k(tvVar);
    }

    /* renamed from: l2 */
    public final void mo26252l2(List list) {
        Parcelable.Creator<C11819f0> creator = C11819f0.CREATOR;
        C11819f0 f0Var = null;
        if (list != null && !list.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C7811i0 i0Var = (C7811i0) it.next();
                if (i0Var instanceof C7848s0) {
                    arrayList.add((C7848s0) i0Var);
                }
            }
            f0Var = new C11819f0(arrayList);
        }
        this.f44549t = f0Var;
    }

    /* renamed from: m2 */
    public final C7840p1 mo36080m2() {
        return this.f44548s;
    }

    /* renamed from: n2 */
    public final C11841m1 mo36081n2(String str) {
        this.f44544g = str;
        return this;
    }

    /* renamed from: o2 */
    public final C11841m1 mo36082o2() {
        this.f44545h = Boolean.FALSE;
        return this;
    }

    /* renamed from: p2 */
    public final List mo36083p2() {
        C11819f0 f0Var = this.f44549t;
        if (f0Var != null) {
            return f0Var.mo36038I1();
        }
        return new ArrayList();
    }

    /* renamed from: q2 */
    public final List mo36084q2() {
        return this.f44542e;
    }

    /* renamed from: r2 */
    public final void mo36085r2(C7840p1 p1Var) {
        this.f44548s = p1Var;
    }

    /* renamed from: s2 */
    public final void mo36086s2(boolean z) {
        this.f44547r = z;
    }

    /* renamed from: t2 */
    public final void mo36087t2(C11847o1 o1Var) {
        this.f44546i = o1Var;
    }

    /* renamed from: u0 */
    public final String mo26211u0() {
        return this.f44539b.mo26211u0();
    }

    /* renamed from: u2 */
    public final boolean mo36088u2() {
        return this.f44547r;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C4243c.m28604a(parcel);
        C4243c.m28619p(parcel, 1, this.f44538a, i, false);
        C4243c.m28619p(parcel, 2, this.f44539b, i, false);
        C4243c.m28620q(parcel, 3, this.f44540c, false);
        C4243c.m28620q(parcel, 4, this.f44541d, false);
        C4243c.m28624u(parcel, 5, this.f44542e, false);
        C4243c.m28622s(parcel, 6, this.f44543f, false);
        C4243c.m28620q(parcel, 7, this.f44544g, false);
        C4243c.m28607d(parcel, 8, Boolean.valueOf(mo26229O1()), false);
        C4243c.m28619p(parcel, 9, this.f44546i, i, false);
        C4243c.m28606c(parcel, 10, this.f44547r);
        C4243c.m28619p(parcel, 11, this.f44548s, i, false);
        C4243c.m28619p(parcel, 12, this.f44549t, i, false);
        C4243c.m28605b(parcel, a);
    }

    /* renamed from: x */
    public final Uri mo26212x() {
        return this.f44539b.mo26212x();
    }

    C11841m1(C3784tv tvVar, C11829i1 i1Var, String str, String str2, List list, List list2, String str3, Boolean bool, C11847o1 o1Var, boolean z, C7840p1 p1Var, C11819f0 f0Var) {
        this.f44538a = tvVar;
        this.f44539b = i1Var;
        this.f44540c = str;
        this.f44541d = str2;
        this.f44542e = list;
        this.f44543f = list2;
        this.f44544g = str3;
        this.f44545h = bool;
        this.f44546i = o1Var;
        this.f44547r = z;
        this.f44548s = p1Var;
        this.f44549t = f0Var;
    }
}
