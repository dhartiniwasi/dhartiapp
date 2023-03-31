package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class m44 implements b44 {

    /* renamed from: c */
    private static final b44 f13209c = c44.m10704a(Collections.emptySet());

    /* renamed from: a */
    private final List f13210a;

    /* renamed from: b */
    private final List f13211b;

    /* synthetic */ m44(List list, List list2, k44 k44) {
        this.f13210a = list;
        this.f13211b = list2;
    }

    /* renamed from: a */
    public static l44 m16411a(int i, int i2) {
        return new l44(i, i2, (k44) null);
    }

    /* renamed from: b */
    public final Set mo8155d() {
        int size = this.f13210a.size();
        ArrayList arrayList = new ArrayList(this.f13211b.size());
        int size2 = this.f13211b.size();
        for (int i = 0; i < size2; i++) {
            Collection collection = (Collection) ((o44) this.f13211b.get(i)).mo8155d();
            size += collection.size();
            arrayList.add(collection);
        }
        HashSet a = y34.m23753a(size);
        int size3 = this.f13210a.size();
        for (int i2 = 0; i2 < size3; i2++) {
            Object d = ((o44) this.f13210a.get(i2)).mo8155d();
            Objects.requireNonNull(d);
            a.add(d);
        }
        int size4 = arrayList.size();
        for (int i3 = 0; i3 < size4; i3++) {
            for (Object next : (Collection) arrayList.get(i3)) {
                Objects.requireNonNull(next);
                a.add(next);
            }
        }
        return Collections.unmodifiableSet(a);
    }
}
