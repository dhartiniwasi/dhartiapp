package p293m7;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.auth.C7811i0;
import com.google.firebase.auth.C7819k0;
import com.google.firebase.auth.C7848s0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p033d5.C4141r;
import p040e5.C4243c;

/* renamed from: m7.j */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C11830j extends C7819k0 {
    public static final Parcelable.Creator<C11830j> CREATOR = new C11833k();

    /* renamed from: a */
    private String f44521a;

    /* renamed from: b */
    private String f44522b;

    /* renamed from: c */
    private List f44523c;

    private C11830j() {
    }

    /* renamed from: I1 */
    public static C11830j m57243I1(String str) {
        C4141r.m28217g(str);
        C11830j jVar = new C11830j();
        jVar.f44521a = str;
        return jVar;
    }

    /* renamed from: J1 */
    public static C11830j m57244J1(List list, String str) {
        C4141r.m28221k(list);
        C4141r.m28217g(str);
        C11830j jVar = new C11830j();
        jVar.f44523c = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C7811i0 i0Var = (C7811i0) it.next();
            if (i0Var instanceof C7848s0) {
                jVar.f44523c.add((C7848s0) i0Var);
            }
        }
        jVar.f44522b = str;
        return jVar;
    }

    /* renamed from: K1 */
    public final String mo36059K1() {
        return this.f44521a;
    }

    /* renamed from: L1 */
    public final String mo36060L1() {
        return this.f44522b;
    }

    /* renamed from: M1 */
    public final boolean mo36061M1() {
        return this.f44521a != null;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C4243c.m28604a(parcel);
        C4243c.m28620q(parcel, 1, this.f44521a, false);
        C4243c.m28620q(parcel, 2, this.f44522b, false);
        C4243c.m28624u(parcel, 3, this.f44523c, false);
        C4243c.m28605b(parcel, a);
    }

    C11830j(String str, String str2, List list) {
        this.f44521a = str;
        this.f44522b = str2;
        this.f44523c = list;
    }
}
