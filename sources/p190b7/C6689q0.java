package p190b7;

import p182a7.C6431n;

/* renamed from: b7.q0 */
/* compiled from: SingletonImmutableSet */
final class C6689q0<E> extends C6694s<E> {

    /* renamed from: c */
    final transient E f31181c;

    C6689q0(E e) {
        this.f31181c = C6431n.m37561n(e);
    }

    /* renamed from: b */
    public C6685q<E> mo22475b() {
        return C6685q.m38446y(this.f31181c);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public int mo22447c(Object[] objArr, int i) {
        objArr[i] = this.f31181c;
        return i + 1;
    }

    public boolean contains(Object obj) {
        return this.f31181c.equals(obj);
    }

    public final int hashCode() {
        return this.f31181c.hashCode();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public boolean mo22452k() {
        return false;
    }

    /* renamed from: l */
    public C6695s0<E> iterator() {
        return C6698u.m38527p(this.f31181c);
    }

    public int size() {
        return 1;
    }

    public String toString() {
        String obj = this.f31181c.toString();
        StringBuilder sb = new StringBuilder(String.valueOf(obj).length() + 2);
        sb.append('[');
        sb.append(obj);
        sb.append(']');
        return sb.toString();
    }
}
