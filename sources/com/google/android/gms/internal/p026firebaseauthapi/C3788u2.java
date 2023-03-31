package com.google.android.gms.internal.p026firebaseauthapi;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.u2 */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C3788u2 extends C3654q0 implements RandomAccess, C3821v2 {

    /* renamed from: c */
    private static final C3788u2 f22761c;

    /* renamed from: d */
    public static final C3821v2 f22762d;

    /* renamed from: b */
    private final List f22763b;

    static {
        C3788u2 u2Var = new C3788u2(10);
        f22761c = u2Var;
        u2Var.mo16475d();
        f22762d = u2Var;
    }

    public C3788u2() {
        this(10);
    }

    /* renamed from: f */
    private static String m27076f(Object obj) {
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof C3325g1) {
            return ((C3325g1) obj).mo16056y(C3623p2.f22496b);
        }
        return C3623p2.m26443g((byte[]) obj);
    }

    /* renamed from: U */
    public final List mo16853U() {
        return Collections.unmodifiableList(this.f22763b);
    }

    /* renamed from: a */
    public final C3821v2 mo16854a() {
        return mo16476e() ? new C3887x4(this) : this;
    }

    public final /* bridge */ /* synthetic */ void add(int i, Object obj) {
        mo16587b();
        this.f22763b.add(i, (String) obj);
        this.modCount++;
    }

    public final boolean addAll(int i, Collection collection) {
        mo16587b();
        if (collection instanceof C3821v2) {
            collection = ((C3821v2) collection).mo16853U();
        }
        boolean addAll = this.f22763b.addAll(i, collection);
        this.modCount++;
        return addAll;
    }

    /* renamed from: c */
    public final String get(int i) {
        Object obj = this.f22763b.get(i);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof C3325g1) {
            C3325g1 g1Var = (C3325g1) obj;
            String y = g1Var.mo16056y(C3623p2.f22496b);
            if (g1Var.mo15882r()) {
                this.f22763b.set(i, y);
            }
            return y;
        }
        byte[] bArr = (byte[]) obj;
        String g = C3623p2.m26443g(bArr);
        if (C3623p2.m26444h(bArr)) {
            this.f22763b.set(i, g);
        }
        return g;
    }

    public final void clear() {
        mo16587b();
        this.f22763b.clear();
        this.modCount++;
    }

    /* renamed from: h */
    public final /* bridge */ /* synthetic */ C3590o2 mo15892h(int i) {
        if (i >= size()) {
            ArrayList arrayList = new ArrayList(i);
            arrayList.addAll(this.f22763b);
            return new C3788u2(arrayList);
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: p */
    public final Object mo16858p(int i) {
        return this.f22763b.get(i);
    }

    public final /* bridge */ /* synthetic */ Object remove(int i) {
        mo16587b();
        Object remove = this.f22763b.remove(i);
        this.modCount++;
        return m27076f(remove);
    }

    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        mo16587b();
        return m27076f(this.f22763b.set(i, (String) obj));
    }

    public final int size() {
        return this.f22763b.size();
    }

    /* renamed from: v1 */
    public final void mo16861v1(C3325g1 g1Var) {
        mo16587b();
        this.f22763b.add(g1Var);
        this.modCount++;
    }

    public C3788u2(int i) {
        this.f22763b = new ArrayList(i);
    }

    private C3788u2(ArrayList arrayList) {
        this.f22763b = arrayList;
    }

    public final boolean addAll(Collection collection) {
        return addAll(size(), collection);
    }
}
