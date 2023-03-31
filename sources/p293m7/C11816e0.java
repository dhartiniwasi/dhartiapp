package p293m7;

import android.text.TextUtils;
import com.google.android.gms.internal.p026firebaseauthapi.C3257e;
import com.google.firebase.auth.C7811i0;
import com.google.firebase.auth.C7848s0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p033d5.C4141r;

/* renamed from: m7.e0 */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C11816e0 {
    /* renamed from: a */
    public static C7811i0 m57208a(C3257e eVar) {
        if (eVar != null && !TextUtils.isEmpty(eVar.mo15976M1())) {
            return new C7848s0(eVar.mo15975L1(), eVar.mo15974K1(), eVar.mo15973I1(), C4141r.m28217g(eVar.mo15976M1()));
        }
        return null;
    }

    /* renamed from: b */
    public static List m57209b(List list) {
        if (list == null || list.isEmpty()) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C7811i0 a = m57208a((C3257e) it.next());
            if (a != null) {
                arrayList.add(a);
            }
        }
        return arrayList;
    }
}
