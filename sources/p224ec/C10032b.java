package p224ec;

import com.google.firebase.auth.C7869z;
import com.google.firebase.auth.FirebaseAuth;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import p186ac.C6544d;

/* renamed from: ec.b */
/* compiled from: AuthStateChannelStreamHandler */
public class C10032b implements C6544d.C6549d {

    /* renamed from: a */
    private final FirebaseAuth f40004a;

    /* renamed from: b */
    private FirebaseAuth.C7775a f40005b;

    public C10032b(FirebaseAuth firebaseAuth) {
        this.f40004a = firebaseAuth;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static /* synthetic */ void m51179b(AtomicBoolean atomicBoolean, Map map, C6544d.C6546b bVar, FirebaseAuth firebaseAuth) {
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
        hashMap.put("appName", this.f40004a.mo26030l().mo33470q());
        C10029a aVar = new C10029a(new AtomicBoolean(true), hashMap, bVar);
        this.f40005b = aVar;
        this.f40004a.mo26016e(aVar);
    }

    /* renamed from: i */
    public void mo22146i(Object obj) {
        FirebaseAuth.C7775a aVar = this.f40005b;
        if (aVar != null) {
            this.f40004a.mo26036q(aVar);
            this.f40005b = null;
        }
    }
}
