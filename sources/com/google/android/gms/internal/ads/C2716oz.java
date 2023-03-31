package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.oz */
/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public final class C2716oz {
    /* renamed from: a */
    static List m18253a() {
        ArrayList arrayList = new ArrayList();
        m18255c(arrayList, q00.m18992c("gad:dynamite_module:experiment_id", ""));
        m18255c(arrayList, b10.f7046a);
        m18255c(arrayList, b10.f7047b);
        m18255c(arrayList, b10.f7048c);
        m18255c(arrayList, b10.f7049d);
        m18255c(arrayList, b10.f7050e);
        m18255c(arrayList, b10.f7066u);
        m18255c(arrayList, b10.f7051f);
        m18255c(arrayList, b10.f7058m);
        m18255c(arrayList, b10.f7059n);
        m18255c(arrayList, b10.f7060o);
        m18255c(arrayList, b10.f7061p);
        m18255c(arrayList, b10.f7062q);
        m18255c(arrayList, b10.f7063r);
        m18255c(arrayList, b10.f7064s);
        m18255c(arrayList, b10.f7065t);
        m18255c(arrayList, b10.f7052g);
        m18255c(arrayList, b10.f7053h);
        m18255c(arrayList, b10.f7054i);
        m18255c(arrayList, b10.f7055j);
        m18255c(arrayList, b10.f7056k);
        m18255c(arrayList, b10.f7057l);
        return arrayList;
    }

    /* renamed from: b */
    static List m18254b() {
        ArrayList arrayList = new ArrayList();
        m18255c(arrayList, p10.f15646a);
        return arrayList;
    }

    /* renamed from: c */
    private static void m18255c(List list, q00 q00) {
        String str = (String) q00.mo13438e();
        if (!TextUtils.isEmpty(str)) {
            list.add(str);
        }
    }
}
