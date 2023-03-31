package p161w3;

import android.os.Bundle;
import android.util.SparseArray;
import java.util.List;
import p177z1.C6224h;
import p190b7.C6685q;

/* renamed from: w3.c */
/* compiled from: BundleableUtil */
public final class C5921c {
    private C5921c() {
    }

    /* renamed from: a */
    public static void m34933a(Bundle bundle) {
        if (bundle != null) {
            bundle.setClassLoader((ClassLoader) C5953m0.m35138j(C5921c.class.getClassLoader()));
        }
    }

    /* renamed from: b */
    public static <T extends C6224h> C6685q<T> m34934b(C6224h.C6225a<T> aVar, List<Bundle> list) {
        C6685q.C6686a r = C6685q.m38441r();
        for (int i = 0; i < list.size(); i++) {
            r.mo22506a(aVar.mo6454a((Bundle) C5917a.m34872e(list.get(i))));
        }
        return r.mo22547h();
    }

    /* renamed from: c */
    public static <T extends C6224h> SparseArray<T> m34935c(C6224h.C6225a<T> aVar, SparseArray<Bundle> sparseArray) {
        SparseArray<T> sparseArray2 = new SparseArray<>(sparseArray.size());
        for (int i = 0; i < sparseArray.size(); i++) {
            sparseArray2.put(sparseArray.keyAt(i), aVar.mo6454a(sparseArray.valueAt(i)));
        }
        return sparseArray2;
    }
}
