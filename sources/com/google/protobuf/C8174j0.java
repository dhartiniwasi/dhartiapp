package com.google.protobuf;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: com.google.protobuf.j0 */
/* compiled from: LazyStringArrayList */
public class C8174j0 extends C8113c<String> implements C8178k0, RandomAccess {

    /* renamed from: c */
    private static final C8174j0 f34977c;

    /* renamed from: d */
    public static final C8178k0 f34978d;

    /* renamed from: b */
    private final List<Object> f34979b;

    static {
        C8174j0 j0Var = new C8174j0();
        f34977c = j0Var;
        j0Var.mo26803H();
        f34978d = j0Var;
    }

    public C8174j0() {
        this(10);
    }

    /* renamed from: f */
    private static String m45037f(Object obj) {
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof C8153i) {
            return ((C8153i) obj).mo26934O();
        }
        return C8119d0.m44658j((byte[]) obj);
    }

    /* renamed from: F1 */
    public /* bridge */ /* synthetic */ boolean mo26802F1() {
        return super.mo26802F1();
    }

    /* renamed from: Q */
    public void mo27022Q(C8153i iVar) {
        mo26807b();
        this.f34979b.add(iVar);
        this.modCount++;
    }

    public boolean addAll(Collection<? extends String> collection) {
        return addAll(size(), collection);
    }

    /* renamed from: c */
    public void add(int i, String str) {
        mo26807b();
        this.f34979b.add(i, str);
        this.modCount++;
    }

    public void clear() {
        mo26807b();
        this.f34979b.clear();
        this.modCount++;
    }

    public /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    /* renamed from: f1 */
    public C8178k0 mo27025f1() {
        return mo26802F1() ? new C8257y1(this) : this;
    }

    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    /* renamed from: i */
    public String get(int i) {
        Object obj = this.f34979b.get(i);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof C8153i) {
            C8153i iVar = (C8153i) obj;
            String O = iVar.mo26934O();
            if (iVar.mo26891y()) {
                this.f34979b.set(i, O);
            }
            return O;
        }
        byte[] bArr = (byte[]) obj;
        String j = C8119d0.m44658j(bArr);
        if (C8119d0.m44655g(bArr)) {
            this.f34979b.set(i, j);
        }
        return j;
    }

    /* renamed from: j */
    public C8174j0 mo26823m(int i) {
        if (i >= size()) {
            ArrayList arrayList = new ArrayList(i);
            arrayList.addAll(this.f34979b);
            return new C8174j0((ArrayList<Object>) arrayList);
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: k */
    public String remove(int i) {
        mo26807b();
        Object remove = this.f34979b.remove(i);
        this.modCount++;
        return m45037f(remove);
    }

    /* renamed from: l */
    public String set(int i, String str) {
        mo26807b();
        return m45037f(this.f34979b.set(i, str));
    }

    /* renamed from: q1 */
    public Object mo27031q1(int i) {
        return this.f34979b.get(i);
    }

    /* renamed from: r0 */
    public List<?> mo27032r0() {
        return Collections.unmodifiableList(this.f34979b);
    }

    public /* bridge */ /* synthetic */ boolean removeAll(Collection collection) {
        return super.removeAll(collection);
    }

    public /* bridge */ /* synthetic */ boolean retainAll(Collection collection) {
        return super.retainAll(collection);
    }

    public int size() {
        return this.f34979b.size();
    }

    public C8174j0(int i) {
        this((ArrayList<Object>) new ArrayList(i));
    }

    public boolean addAll(int i, Collection<? extends String> collection) {
        mo26807b();
        if (collection instanceof C8178k0) {
            collection = ((C8178k0) collection).mo27032r0();
        }
        boolean addAll = this.f34979b.addAll(i, collection);
        this.modCount++;
        return addAll;
    }

    public /* bridge */ /* synthetic */ boolean remove(Object obj) {
        return super.remove(obj);
    }

    private C8174j0(ArrayList<Object> arrayList) {
        this.f34979b = arrayList;
    }
}
