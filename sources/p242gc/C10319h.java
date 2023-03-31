package p242gc;

import com.google.firebase.firestore.C7904e0;
import com.google.firebase.firestore.C7916i0;
import com.google.firebase.firestore.C7923m;
import com.google.firebase.firestore.C7929o0;
import com.google.firebase.firestore.C7940q0;
import com.google.firebase.firestore.C7959y;
import java.util.Map;
import java.util.Objects;
import p186ac.C6544d;
import p233fc.C10199v;
import p251hc.C10503a;
import p251hc.C10504b;

/* renamed from: gc.h */
/* compiled from: QuerySnapshotsStreamHandler */
public class C10319h implements C6544d.C6549d {

    /* renamed from: a */
    C7904e0 f40931a;

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m52208b(C6544d.C6546b bVar, C7923m.C7924a aVar, C7940q0 q0Var, C7959y yVar) {
        if (yVar != null) {
            bVar.error("firebase_firestore", yVar.getMessage(), C10503a.m52898a(yVar));
            bVar.mo22142a();
            mo22146i((Object) null);
            return;
        }
        if (q0Var != null) {
            C10199v.f40631r.put(Integer.valueOf(q0Var.hashCode()), aVar);
        }
        bVar.success(q0Var);
    }

    /* renamed from: e */
    public void mo22145e(Object obj, C6544d.C6546b bVar) {
        C7916i0 i0Var;
        Map map = (Map) obj;
        Object obj2 = map.get("includeMetadataChanges");
        Objects.requireNonNull(obj2);
        if (((Boolean) obj2).booleanValue()) {
            i0Var = C7916i0.INCLUDE;
        } else {
            i0Var = C7916i0.EXCLUDE;
        }
        C7929o0 o0Var = (C7929o0) map.get("query");
        C7923m.C7924a a = C10504b.m52899a((String) map.get("serverTimestampBehavior"));
        if (o0Var != null) {
            this.f40931a = o0Var.mo26416d(i0Var, new C10318g(this, bVar, a));
            return;
        }
        throw new IllegalArgumentException("An error occurred while parsing query arguments, see native logs for more information. Please report this issue.");
    }

    /* renamed from: i */
    public void mo22146i(Object obj) {
        C7904e0 e0Var = this.f40931a;
        if (e0Var != null) {
            e0Var.remove();
            this.f40931a = null;
        }
    }
}
