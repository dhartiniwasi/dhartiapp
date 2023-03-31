package com.google.protobuf;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* renamed from: com.google.protobuf.y1 */
/* compiled from: UnmodifiableLazyStringList */
public class C8257y1 extends AbstractList<String> implements C8178k0, RandomAccess {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C8178k0 f35189a;

    /* renamed from: com.google.protobuf.y1$a */
    /* compiled from: UnmodifiableLazyStringList */
    class C8258a implements ListIterator<String> {

        /* renamed from: a */
        ListIterator<String> f35190a;

        /* renamed from: b */
        final /* synthetic */ int f35191b;

        C8258a(int i) {
            this.f35191b = i;
            this.f35190a = C8257y1.this.f35189a.listIterator(i);
        }

        /* renamed from: a */
        public void add(String str) {
            throw new UnsupportedOperationException();
        }

        /* renamed from: c */
        public String next() {
            return this.f35190a.next();
        }

        /* renamed from: d */
        public String previous() {
            return this.f35190a.previous();
        }

        /* renamed from: e */
        public void set(String str) {
            throw new UnsupportedOperationException();
        }

        public boolean hasNext() {
            return this.f35190a.hasNext();
        }

        public boolean hasPrevious() {
            return this.f35190a.hasPrevious();
        }

        public int nextIndex() {
            return this.f35190a.nextIndex();
        }

        public int previousIndex() {
            return this.f35190a.previousIndex();
        }

        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: com.google.protobuf.y1$b */
    /* compiled from: UnmodifiableLazyStringList */
    class C8259b implements Iterator<String> {

        /* renamed from: a */
        Iterator<String> f35193a;

        C8259b() {
            this.f35193a = C8257y1.this.f35189a.iterator();
        }

        /* renamed from: a */
        public String next() {
            return this.f35193a.next();
        }

        public boolean hasNext() {
            return this.f35193a.hasNext();
        }

        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public C8257y1(C8178k0 k0Var) {
        this.f35189a = k0Var;
    }

    /* renamed from: Q */
    public void mo27022Q(C8153i iVar) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: c */
    public String get(int i) {
        return (String) this.f35189a.get(i);
    }

    /* renamed from: f1 */
    public C8178k0 mo27025f1() {
        return this;
    }

    public Iterator<String> iterator() {
        return new C8259b();
    }

    public ListIterator<String> listIterator(int i) {
        return new C8258a(i);
    }

    /* renamed from: q1 */
    public Object mo27031q1(int i) {
        return this.f35189a.mo27031q1(i);
    }

    /* renamed from: r0 */
    public List<?> mo27032r0() {
        return this.f35189a.mo27032r0();
    }

    public int size() {
        return this.f35189a.size();
    }
}
