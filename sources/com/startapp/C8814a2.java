package com.startapp;

import java.util.Comparator;

/* renamed from: com.startapp.a2 */
/* compiled from: Sta */
public class C8814a2<T> implements Comparator<T> {

    /* renamed from: a */
    public final Comparator<T> f36375a;

    /* renamed from: b */
    public final Comparator<T> f36376b;

    public C8814a2(Comparator<T> comparator, Comparator<T> comparator2) {
        this.f36375a = comparator;
        this.f36376b = comparator2;
    }

    public int compare(T t, T t2) {
        int compare = this.f36375a.compare(t, t2);
        return compare == 0 ? this.f36376b.compare(t, t2) : compare;
    }
}
