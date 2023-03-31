package p242gc;

import com.google.firebase.firestore.C7910g0;
import com.google.firebase.firestore.FirebaseFirestore;
import java.util.Map;
import java.util.Objects;
import p186ac.C6544d;
import p251hc.C10503a;

/* renamed from: gc.e */
/* compiled from: LoadBundleStreamHandler */
public class C10316e implements C6544d.C6549d {

    /* renamed from: a */
    private C6544d.C6546b f40927a;

    /* access modifiers changed from: private */
    /* renamed from: d */
    public /* synthetic */ void m52202d(C6544d.C6546b bVar, Exception exc) {
        bVar.error("firebase_firestore", exc.getMessage(), C10503a.m52898a(exc));
        mo22146i((Object) null);
    }

    /* renamed from: e */
    public void mo22145e(Object obj, C6544d.C6546b bVar) {
        this.f40927a = bVar;
        Map map = (Map) obj;
        Object obj2 = map.get("bundle");
        Objects.requireNonNull(obj2);
        Object obj3 = map.get("firestore");
        Objects.requireNonNull(obj3);
        C7910g0 F = ((FirebaseFirestore) obj3).mo26288F((byte[]) obj2);
        F.mo26365t(new C10314c(bVar));
        F.mo26349d(new C10315d(this, bVar));
    }

    /* renamed from: i */
    public void mo22146i(Object obj) {
        this.f40927a.mo22142a();
    }
}
