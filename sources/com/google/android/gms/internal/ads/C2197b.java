package com.google.android.gms.internal.ads;

import android.util.SparseBooleanArray;

/* renamed from: com.google.android.gms.internal.ads.b */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class C2197b {

    /* renamed from: a */
    private final SparseBooleanArray f7027a;

    /* synthetic */ C2197b(SparseBooleanArray sparseBooleanArray, hn4 hn4) {
        this.f7027a = sparseBooleanArray;
    }

    /* renamed from: a */
    public final int mo8633a(int i) {
        v91.m22047a(i, 0, this.f7027a.size());
        return this.f7027a.keyAt(i);
    }

    /* renamed from: b */
    public final int mo8634b() {
        return this.f7027a.size();
    }

    /* renamed from: c */
    public final boolean mo8635c(int i) {
        return this.f7027a.get(i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2197b)) {
            return false;
        }
        C2197b bVar = (C2197b) obj;
        if (gb2.f9812a >= 24) {
            return this.f7027a.equals(bVar.f7027a);
        }
        if (this.f7027a.size() != bVar.f7027a.size()) {
            return false;
        }
        for (int i = 0; i < this.f7027a.size(); i++) {
            if (mo8633a(i) != bVar.mo8633a(i)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        if (gb2.f9812a >= 24) {
            return this.f7027a.hashCode();
        }
        int size = this.f7027a.size();
        for (int i = 0; i < this.f7027a.size(); i++) {
            size = (size * 31) + mo8633a(i);
        }
        return size;
    }
}
