package p242gc;

import com.google.firebase.firestore.C7904e0;
import com.google.firebase.firestore.FirebaseFirestore;
import java.util.Map;
import java.util.Objects;
import p186ac.C6544d;

/* renamed from: gc.j */
/* compiled from: SnapshotsInSyncStreamHandler */
public class C10321j implements C6544d.C6549d {

    /* renamed from: a */
    C7904e0 f40933a;

    /* renamed from: e */
    public void mo22145e(Object obj, C6544d.C6546b bVar) {
        Object obj2 = ((Map) obj).get("firestore");
        Objects.requireNonNull(obj2);
        this.f40933a = ((FirebaseFirestore) obj2).mo26295g(new C10320i(bVar));
    }

    /* renamed from: i */
    public void mo22146i(Object obj) {
        C7904e0 e0Var = this.f40933a;
        if (e0Var != null) {
            e0Var.remove();
            this.f40933a = null;
        }
    }
}
