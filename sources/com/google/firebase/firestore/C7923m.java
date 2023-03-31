package com.google.firebase.firestore;

import java.util.Map;
import p211d8.C9885i;
import p211d8.C9888l;
import p247h8.C10472x;

/* renamed from: com.google.firebase.firestore.m */
/* compiled from: DocumentSnapshot */
public class C7923m {

    /* renamed from: a */
    private final FirebaseFirestore f34369a;

    /* renamed from: b */
    private final C9888l f34370b;

    /* renamed from: c */
    private final C9885i f34371c;

    /* renamed from: d */
    private final C7949t0 f34372d;

    /* renamed from: com.google.firebase.firestore.m$a */
    /* compiled from: DocumentSnapshot */
    public enum C7924a {
        NONE,
        ESTIMATE,
        PREVIOUS;
        

        /* renamed from: d */
        static final C7924a f34376d = null;

        static {
            C7924a aVar;
            f34376d = aVar;
        }
    }

    C7923m(FirebaseFirestore firebaseFirestore, C9888l lVar, C9885i iVar, boolean z, boolean z2) {
        this.f34369a = (FirebaseFirestore) C10472x.m52785b(firebaseFirestore);
        this.f34370b = (C9888l) C10472x.m52785b(lVar);
        this.f34371c = iVar;
        this.f34372d = new C7949t0(z2, z);
    }

    /* renamed from: b */
    static C7923m m43773b(FirebaseFirestore firebaseFirestore, C9885i iVar, boolean z, boolean z2) {
        return new C7923m(firebaseFirestore, iVar.getKey(), iVar, z, z2);
    }

    /* renamed from: c */
    static C7923m m43774c(FirebaseFirestore firebaseFirestore, C9888l lVar, boolean z) {
        return new C7923m(firebaseFirestore, lVar, (C9885i) null, z, false);
    }

    /* renamed from: a */
    public boolean mo26395a() {
        return this.f34371c != null;
    }

    /* renamed from: d */
    public Map<String, Object> mo26396d() {
        return mo26397e(C7924a.f34376d);
    }

    /* renamed from: e */
    public Map<String, Object> mo26397e(C7924a aVar) {
        C10472x.m52786c(aVar, "Provided serverTimestampBehavior value must not be null.");
        C7894a1 a1Var = new C7894a1(this.f34369a, aVar);
        C9885i iVar = this.f34371c;
        if (iVar == null) {
            return null;
        }
        return a1Var.mo26312b(iVar.getData().mo32433j());
    }

    public boolean equals(Object obj) {
        C9885i iVar;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7923m)) {
            return false;
        }
        C7923m mVar = (C7923m) obj;
        if (!this.f34369a.equals(mVar.f34369a) || !this.f34370b.equals(mVar.f34370b) || ((iVar = this.f34371c) != null ? !iVar.equals(mVar.f34371c) : mVar.f34371c != null) || !this.f34372d.equals(mVar.f34372d)) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public C7949t0 mo26399f() {
        return this.f34372d;
    }

    /* renamed from: g */
    public C7921l mo26400g() {
        return new C7921l(this.f34370b, this.f34369a);
    }

    public int hashCode() {
        int hashCode = ((this.f34369a.hashCode() * 31) + this.f34370b.hashCode()) * 31;
        C9885i iVar = this.f34371c;
        int i = 0;
        int hashCode2 = (hashCode + (iVar != null ? iVar.getKey().hashCode() : 0)) * 31;
        C9885i iVar2 = this.f34371c;
        if (iVar2 != null) {
            i = iVar2.getData().hashCode();
        }
        return ((hashCode2 + i) * 31) + this.f34372d.hashCode();
    }

    public String toString() {
        return "DocumentSnapshot{key=" + this.f34370b + ", metadata=" + this.f34372d + ", doc=" + this.f34371c + '}';
    }
}
