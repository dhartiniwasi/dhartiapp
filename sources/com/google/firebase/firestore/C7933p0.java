package com.google.firebase.firestore;

import com.google.firebase.firestore.C7923m;
import java.util.Map;
import p211d8.C9885i;
import p211d8.C9888l;
import p247h8.C10432b;
import p247h8.C10472x;

/* renamed from: com.google.firebase.firestore.p0 */
/* compiled from: QueryDocumentSnapshot */
public class C7933p0 extends C7923m {
    private C7933p0(FirebaseFirestore firebaseFirestore, C9888l lVar, C9885i iVar, boolean z, boolean z2) {
        super(firebaseFirestore, lVar, iVar, z, z2);
    }

    /* renamed from: h */
    static C7933p0 m43833h(FirebaseFirestore firebaseFirestore, C9885i iVar, boolean z, boolean z2) {
        return new C7933p0(firebaseFirestore, iVar.getKey(), iVar, z, z2);
    }

    /* renamed from: d */
    public Map<String, Object> mo26396d() {
        Map<String, Object> d = super.mo26396d();
        C10432b.m52648d(d != null, "Data in a QueryDocumentSnapshot should be non-null", new Object[0]);
        return d;
    }

    /* renamed from: e */
    public Map<String, Object> mo26397e(C7923m.C7924a aVar) {
        C10472x.m52786c(aVar, "Provided serverTimestampBehavior value must not be null.");
        Map<String, Object> e = super.mo26397e(aVar);
        C10432b.m52648d(e != null, "Data in a QueryDocumentSnapshot should be non-null", new Object[0]);
        return e;
    }
}
