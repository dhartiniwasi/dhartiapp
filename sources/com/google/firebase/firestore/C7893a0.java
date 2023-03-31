package com.google.firebase.firestore;

import android.content.Context;
import com.google.firebase.firestore.FirebaseFirestore;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import p238g8.C10234f0;
import p246h7.C10412f;
import p246h7.C10416g;
import p246h7.C10423n;
import p247h8.C10432b;
import p276k8.C11598a;
import p284l7.C11760b;
import p293m7.C11806b;

/* renamed from: com.google.firebase.firestore.a0 */
/* compiled from: FirestoreMultiDbComponent */
class C7893a0 implements C10416g, FirebaseFirestore.C7891a {

    /* renamed from: a */
    private final Map<String, FirebaseFirestore> f34306a = new HashMap();

    /* renamed from: b */
    private final C10412f f34307b;

    /* renamed from: c */
    private final Context f34308c;

    /* renamed from: d */
    private final C11598a<C11806b> f34309d;

    /* renamed from: e */
    private final C11598a<C11760b> f34310e;

    /* renamed from: f */
    private final C10234f0 f34311f;

    C7893a0(Context context, C10412f fVar, C11598a<C11806b> aVar, C11598a<C11760b> aVar2, C10234f0 f0Var) {
        this.f34308c = context;
        this.f34307b = fVar;
        this.f34309d = aVar;
        this.f34310e = aVar2;
        this.f34311f = f0Var;
        fVar.mo33465h(this);
    }

    /* renamed from: a */
    public synchronized void mo26310a(String str, C10423n nVar) {
        Iterator it = new ArrayList(this.f34306a.entrySet()).iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            ((FirebaseFirestore) entry.getValue()).mo26292M();
            C10432b.m52648d(!this.f34306a.containsKey(entry.getKey()), "terminate() should have removed its entry from `instances` for key: %s", entry.getKey());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public synchronized FirebaseFirestore mo26311b(String str) {
        FirebaseFirestore firebaseFirestore;
        firebaseFirestore = this.f34306a.get(str);
        if (firebaseFirestore == null) {
            firebaseFirestore = FirebaseFirestore.m43639H(this.f34308c, this.f34307b, this.f34309d, this.f34310e, str, this, this.f34311f);
            this.f34306a.put(str, firebaseFirestore);
        }
        return firebaseFirestore;
    }

    public synchronized void remove(String str) {
        this.f34306a.remove(str);
    }
}
