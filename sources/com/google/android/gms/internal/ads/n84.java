package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class n84 {

    /* renamed from: a */
    private final C2197b f13909a;

    /* renamed from: b */
    private final SparseArray f13910b;

    public n84(C2197b bVar, SparseArray sparseArray) {
        this.f13909a = bVar;
        SparseArray sparseArray2 = new SparseArray(bVar.mo8634b());
        for (int i = 0; i < bVar.mo8634b(); i++) {
            int a = bVar.mo8633a(i);
            m84 m84 = (m84) sparseArray.get(a);
            Objects.requireNonNull(m84);
            sparseArray2.append(a, m84);
        }
        this.f13910b = sparseArray2;
    }

    /* renamed from: a */
    public final int mo12543a(int i) {
        return this.f13909a.mo8633a(i);
    }

    /* renamed from: b */
    public final int mo12544b() {
        return this.f13909a.mo8634b();
    }

    /* renamed from: c */
    public final m84 mo12545c(int i) {
        m84 m84 = (m84) this.f13910b.get(i);
        Objects.requireNonNull(m84);
        return m84;
    }

    /* renamed from: d */
    public final boolean mo12546d(int i) {
        return this.f13909a.mo8635c(i);
    }
}
