package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class iy3 extends tv3 implements RandomAccess, jy3 {

    /* renamed from: c */
    private static final iy3 f11140c;

    /* renamed from: d */
    public static final jy3 f11141d;

    /* renamed from: b */
    private final List f11142b;

    static {
        iy3 iy3 = new iy3(10);
        f11140c = iy3;
        iy3.mo8987d();
        f11141d = iy3;
    }

    public iy3() {
        this(10);
    }

    /* renamed from: f */
    private static String m14592f(Object obj) {
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof jw3) {
            return ((jw3) obj).mo11526b(cy3.f7982b);
        }
        return cy3.m11236h((byte[]) obj);
    }

    /* renamed from: F */
    public final void mo11254F(jw3 jw3) {
        mo14403b();
        this.f11142b.add(jw3);
        this.modCount++;
    }

    /* renamed from: U */
    public final List mo11255U() {
        return Collections.unmodifiableList(this.f11142b);
    }

    /* renamed from: a */
    public final jy3 mo11256a() {
        return mo8988e() ? new t04(this) : this;
    }

    public final /* bridge */ /* synthetic */ void add(int i, Object obj) {
        mo14403b();
        this.f11142b.add(i, (String) obj);
        this.modCount++;
    }

    public final boolean addAll(int i, Collection collection) {
        mo14403b();
        if (collection instanceof jy3) {
            collection = ((jy3) collection).mo11255U();
        }
        boolean addAll = this.f11142b.addAll(i, collection);
        this.modCount++;
        return addAll;
    }

    /* renamed from: c */
    public final String get(int i) {
        Object obj = this.f11142b.get(i);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof jw3) {
            jw3 jw3 = (jw3) obj;
            String b = jw3.mo11526b(cy3.f7982b);
            if (jw3.mo10319B()) {
                this.f11142b.set(i, b);
            }
            return b;
        }
        byte[] bArr = (byte[]) obj;
        String h = cy3.m11236h(bArr);
        if (cy3.m11237i(bArr)) {
            this.f11142b.set(i, h);
        }
        return h;
    }

    public final void clear() {
        mo14403b();
        this.f11142b.clear();
        this.modCount++;
    }

    /* renamed from: h */
    public final /* bridge */ /* synthetic */ by3 mo8975h(int i) {
        if (i >= size()) {
            ArrayList arrayList = new ArrayList(i);
            arrayList.addAll(this.f11142b);
            return new iy3(arrayList);
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: p */
    public final Object mo11262p(int i) {
        return this.f11142b.get(i);
    }

    public final /* bridge */ /* synthetic */ Object remove(int i) {
        mo14403b();
        Object remove = this.f11142b.remove(i);
        this.modCount++;
        return m14592f(remove);
    }

    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        mo14403b();
        return m14592f(this.f11142b.set(i, (String) obj));
    }

    public final int size() {
        return this.f11142b.size();
    }

    public iy3(int i) {
        this.f11142b = new ArrayList(i);
    }

    private iy3(ArrayList arrayList) {
        this.f11142b = arrayList;
    }

    public final boolean addAll(Collection collection) {
        return addAll(size(), collection);
    }
}
