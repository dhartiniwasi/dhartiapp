package com.google.android.gms.internal.ads;

import java.util.Comparator;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public abstract class cc3 implements Comparator {
    protected cc3() {
    }

    /* renamed from: b */
    public static cc3 m10844b(Comparator comparator) {
        if (comparator instanceof cc3) {
            return (cc3) comparator;
        }
        return new fa3(comparator);
    }

    /* renamed from: c */
    public static cc3 m10845c() {
        return ac3.f6519a;
    }

    /* renamed from: a */
    public cc3 mo8303a() {
        return new mc3(this);
    }

    public abstract int compare(Object obj, Object obj2);
}
