package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p060h4.C4571q4;
import p179z3.C6337h;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class it2 {
    /* renamed from: a */
    public static C4571q4 m14548a(Context context, List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            js2 js2 = (js2) it.next();
            if (js2.f11785c) {
                arrayList.add(C6337h.f30525p);
            } else {
                arrayList.add(new C6337h(js2.f11783a, js2.f11784b));
            }
        }
        return new C4571q4(context, (C6337h[]) arrayList.toArray(new C6337h[arrayList.size()]));
    }

    /* renamed from: b */
    public static js2 m14549b(List list, js2 js2) {
        return (js2) list.get(0);
    }

    /* renamed from: c */
    public static js2 m14550c(C4571q4 q4Var) {
        return q4Var.f24980i ? new js2(-3, 0, true) : new js2(q4Var.f24976e, q4Var.f24973b, false);
    }
}
