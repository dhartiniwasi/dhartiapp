package p242gc;

import com.google.firebase.firestore.C7904e0;
import com.google.firebase.firestore.C7916i0;
import com.google.firebase.firestore.C7921l;
import com.google.firebase.firestore.C7923m;
import com.google.firebase.firestore.C7959y;
import java.util.Map;
import java.util.Objects;
import p186ac.C6544d;
import p251hc.C10503a;

/* renamed from: gc.b */
/* compiled from: DocumentSnapshotsStreamHandler */
public class C10313b implements C6544d.C6549d {

    /* renamed from: a */
    C7904e0 f40923a;

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m52194b(C6544d.C6546b bVar, C7923m mVar, C7959y yVar) {
        if (yVar != null) {
            bVar.error("firebase_firestore", yVar.getMessage(), C10503a.m52898a(yVar));
            bVar.mo22142a();
            mo22146i((Object) null);
            return;
        }
        bVar.success(mVar);
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
        Object obj3 = map.get("reference");
        Objects.requireNonNull(obj3);
        this.f40923a = ((C7921l) obj3).mo26383d(i0Var, new C10312a(this, bVar));
    }

    /* renamed from: i */
    public void mo22146i(Object obj) {
        C7904e0 e0Var = this.f40923a;
        if (e0Var != null) {
            e0Var.remove();
            this.f40923a = null;
        }
    }
}
