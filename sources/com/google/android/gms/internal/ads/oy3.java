package com.google.android.gms.internal.ads;

import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class oy3 extends qy3 {
    /* synthetic */ oy3(my3 my3) {
        super((py3) null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final List mo12224a(Object obj, long j) {
        by3 by3 = (by3) y04.m23666p(obj, j);
        if (by3.mo8988e()) {
            return by3;
        }
        int size = by3.size();
        by3 h = by3.mo8975h(size == 0 ? 10 : size + size);
        y04.m23646D(obj, j, h);
        return h;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo12225b(Object obj, long j) {
        ((by3) y04.m23666p(obj, j)).mo8987d();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo12226c(Object obj, Object obj2, long j) {
        by3 by3 = (by3) y04.m23666p(obj, j);
        by3 by32 = (by3) y04.m23666p(obj2, j);
        int size = by3.size();
        int size2 = by32.size();
        if (size > 0 && size2 > 0) {
            if (!by3.mo8988e()) {
                by3 = by3.mo8975h(size2 + size);
            }
            by3.addAll(by32);
        }
        if (size > 0) {
            by32 = by3;
        }
        y04.m23646D(obj, j, by32);
    }
}
