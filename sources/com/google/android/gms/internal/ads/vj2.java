package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final /* synthetic */ class vj2 implements Callable {

    /* renamed from: a */
    public final /* synthetic */ List f19121a;

    /* renamed from: b */
    public final /* synthetic */ Object f19122b;

    public /* synthetic */ vj2(List list, Object obj) {
        this.f19121a = list;
        this.f19122b = obj;
    }

    public final Object call() {
        List<lf3> list = this.f19121a;
        Object obj = this.f19122b;
        for (lf3 lf3 : list) {
            sj2 sj2 = (sj2) lf3.get();
            if (sj2 != null) {
                sj2.mo8321e(obj);
            }
        }
        return obj;
    }
}
