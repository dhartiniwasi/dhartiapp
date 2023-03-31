package p224ec;

import com.google.firebase.auth.C7869z;
import com.google.firebase.auth.FirebaseAuth;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import p186ac.C6544d;

/* renamed from: ec.e1 */
/* compiled from: IdTokenChannelStreamHandler */
public class C10047e1 implements C6544d.C6549d {

    /* renamed from: a */
    private final FirebaseAuth f40036a;

    /* renamed from: b */
    private FirebaseAuth.C7776b f40037b;

    public C10047e1(FirebaseAuth firebaseAuth) {
        this.f40036a = firebaseAuth;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static /* synthetic */ void m51204b(AtomicBoolean atomicBoolean, Map map, C6544d.C6546b bVar, FirebaseAuth firebaseAuth) {
        if (atomicBoolean.get()) {
            atomicBoolean.set(false);
            return;
        }
        C7869z m = firebaseAuth.mo26031m();
        if (m == null) {
            map.put("user", (Object) null);
        } else {
            map.put("user", C10080t0.m51320l1(m));
        }
        bVar.success(map);
    }

    /* renamed from: e */
    public void mo22145e(Object obj, C6544d.C6546b bVar) {
        HashMap hashMap = new HashMap();
        hashMap.put("appName", this.f40036a.mo26030l().mo33470q());
        C10044d1 d1Var = new C10044d1(new AtomicBoolean(true), hashMap, bVar);
        this.f40037b = d1Var;
        this.f40036a.mo26018f(d1Var);
    }

    /* renamed from: i */
    public void mo22146i(Object obj) {
        FirebaseAuth.C7776b bVar = this.f40037b;
        if (bVar != null) {
            this.f40036a.mo26037r(bVar);
            this.f40037b = null;
        }
    }
}
