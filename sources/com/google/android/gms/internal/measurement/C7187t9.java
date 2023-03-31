package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.measurement.t9 */
/* compiled from: com.google.android.gms:play-services-measurement-base@@21.2.0 */
public final class C7187t9 extends C7137q7 implements RandomAccess, C7203u9 {

    /* renamed from: c */
    private static final C7187t9 f32113c;

    /* renamed from: d */
    public static final C7203u9 f32114d;

    /* renamed from: b */
    private final List f32115b;

    static {
        C7187t9 t9Var = new C7187t9(10);
        f32113c = t9Var;
        t9Var.mo23697d();
        f32114d = t9Var;
    }

    public C7187t9() {
        this(10);
    }

    /* renamed from: f */
    private static String m40948f(Object obj) {
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof C6977g8) {
            return ((C6977g8) obj).mo23443u(C7107o9.f31926b);
        }
        return C7107o9.m40534g((byte[]) obj);
    }

    /* renamed from: P0 */
    public final void mo23885P0(C6977g8 g8Var) {
        mo23768b();
        this.f32115b.add(g8Var);
        this.modCount++;
    }

    /* renamed from: U */
    public final List mo23886U() {
        return Collections.unmodifiableList(this.f32115b);
    }

    /* renamed from: a */
    public final C7203u9 mo23887a() {
        return mo23698e() ? new C7221vb(this) : this;
    }

    public final /* bridge */ /* synthetic */ void add(int i, Object obj) {
        mo23768b();
        this.f32115b.add(i, (String) obj);
        this.modCount++;
    }

    public final boolean addAll(int i, Collection collection) {
        mo23768b();
        if (collection instanceof C7203u9) {
            collection = ((C7203u9) collection).mo23886U();
        }
        boolean addAll = this.f32115b.addAll(i, collection);
        this.modCount++;
        return addAll;
    }

    /* renamed from: c */
    public final String get(int i) {
        Object obj = this.f32115b.get(i);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof C6977g8) {
            C6977g8 g8Var = (C6977g8) obj;
            String u = g8Var.mo23443u(C7107o9.f31926b);
            if (g8Var.mo23331o()) {
                this.f32115b.set(i, u);
            }
            return u;
        }
        byte[] bArr = (byte[]) obj;
        String g = C7107o9.m40534g(bArr);
        if (C7107o9.m40535h(bArr)) {
            this.f32115b.set(i, g);
        }
        return g;
    }

    public final void clear() {
        mo23768b();
        this.f32115b.clear();
        this.modCount++;
    }

    /* renamed from: h */
    public final /* bridge */ /* synthetic */ C7091n9 mo23012h(int i) {
        if (i >= size()) {
            ArrayList arrayList = new ArrayList(i);
            arrayList.addAll(this.f32115b);
            return new C7187t9(arrayList);
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: p */
    public final Object mo23891p(int i) {
        return this.f32115b.get(i);
    }

    public final /* bridge */ /* synthetic */ Object remove(int i) {
        mo23768b();
        Object remove = this.f32115b.remove(i);
        this.modCount++;
        return m40948f(remove);
    }

    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        mo23768b();
        return m40948f(this.f32115b.set(i, (String) obj));
    }

    public final int size() {
        return this.f32115b.size();
    }

    public C7187t9(int i) {
        this.f32115b = new ArrayList(i);
    }

    private C7187t9(ArrayList arrayList) {
        this.f32115b = arrayList;
    }

    public final boolean addAll(Collection collection) {
        return addAll(size(), collection);
    }
}
