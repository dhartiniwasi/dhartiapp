package com.google.firebase.firestore;

import com.google.firebase.firestore.C7923m;
import com.google.protobuf.C8234t1;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p211d8.C9882f;
import p211d8.C9888l;
import p211d8.C9904v;
import p211d8.C9907y;
import p246h7.C10428q;
import p247h8.C10432b;
import p247h8.C10468v;
import p405y8.C13085b;
import p405y8.C13088b0;

/* renamed from: com.google.firebase.firestore.a1 */
/* compiled from: UserDataWriter */
public class C7894a1 {

    /* renamed from: a */
    private final FirebaseFirestore f34312a;

    /* renamed from: b */
    private final C7923m.C7924a f34313b;

    /* renamed from: com.google.firebase.firestore.a1$a */
    /* compiled from: UserDataWriter */
    static /* synthetic */ class C7895a {

        /* renamed from: a */
        static final /* synthetic */ int[] f34314a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                com.google.firebase.firestore.m$a[] r0 = com.google.firebase.firestore.C7923m.C7924a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f34314a = r0
                com.google.firebase.firestore.m$a r1 = com.google.firebase.firestore.C7923m.C7924a.PREVIOUS     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f34314a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.firebase.firestore.m$a r1 = com.google.firebase.firestore.C7923m.C7924a.ESTIMATE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.firestore.C7894a1.C7895a.<clinit>():void");
        }
    }

    public C7894a1(FirebaseFirestore firebaseFirestore, C7923m.C7924a aVar) {
        this.f34312a = firebaseFirestore;
        this.f34313b = aVar;
    }

    /* renamed from: a */
    private List<Object> m43679a(C13085b bVar) {
        ArrayList arrayList = new ArrayList(bVar.mo38106j0());
        for (C13088b0 f : bVar.mo38104g()) {
            arrayList.add(mo26313f(f));
        }
        return arrayList;
    }

    /* renamed from: c */
    private Object m43680c(C13088b0 b0Var) {
        C9882f c = C9882f.m50674c(b0Var.mo38119u0());
        C9888l k = C9888l.m50696k(b0Var.mo38119u0());
        C9882f t = this.f34312a.mo26306t();
        if (!c.equals(t)) {
            C10468v.m52770d("DocumentSnapshot", "Document %s contains a document reference within a different database (%s/%s) which is not supported. It will be treated as a reference in the current database (%s/%s) instead.", k.mo32390s(), c.mo32367k(), c.mo32366j(), t.mo32367k(), t.mo32366j());
        }
        return new C7921l(k, this.f34312a);
    }

    /* renamed from: d */
    private Object m43681d(C13088b0 b0Var) {
        int i = C7895a.f34314a[this.f34313b.ordinal()];
        if (i == 1) {
            C13088b0 b = C9904v.m50789b(b0Var);
            if (b == null) {
                return null;
            }
            return mo26313f(b);
        } else if (i != 2) {
            return null;
        } else {
            return m43682e(C9904v.m50788a(b0Var));
        }
    }

    /* renamed from: e */
    private Object m43682e(C8234t1 t1Var) {
        return new C10428q(t1Var.mo27291f0(), t1Var.mo27290e0());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public Map<String, Object> mo26312b(Map<String, C13088b0> map) {
        HashMap hashMap = new HashMap();
        for (Map.Entry next : map.entrySet()) {
            hashMap.put((String) next.getKey(), mo26313f((C13088b0) next.getValue()));
        }
        return hashMap;
    }

    /* renamed from: f */
    public Object mo26313f(C13088b0 b0Var) {
        switch (C9907y.m50804G(b0Var)) {
            case 0:
                return null;
            case 1:
                return Boolean.valueOf(b0Var.mo38113n0());
            case 2:
                if (b0Var.mo38122x0().equals(C13088b0.C13091c.INTEGER_VALUE)) {
                    return Long.valueOf(b0Var.mo38117s0());
                }
                return Double.valueOf(b0Var.mo38115q0());
            case 3:
                return m43682e(b0Var.mo38121w0());
            case 4:
                return m43681d(b0Var);
            case 5:
                return b0Var.mo38120v0();
            case 6:
                return C7903e.m43700b(b0Var.mo38114o0());
            case 7:
                return m43680c(b0Var);
            case 8:
                return new C7900c0(b0Var.mo38116r0().mo22936e0(), b0Var.mo38116r0().mo22937f0());
            case 9:
                return m43679a(b0Var.mo38112m0());
            case 10:
                return mo26312b(b0Var.mo38118t0().mo38227e0());
            default:
                throw C10432b.m52645a("Unknown value type: " + b0Var.mo38122x0(), new Object[0]);
        }
    }
}
