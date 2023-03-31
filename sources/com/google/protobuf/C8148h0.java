package com.google.protobuf;

import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.protobuf.h0 */
/* compiled from: LazyField */
public class C8148h0 extends C8165i0 {

    /* renamed from: f */
    private final C8243v0 f34902f;

    /* renamed from: com.google.protobuf.h0$b */
    /* compiled from: LazyField */
    static class C8150b<K> implements Map.Entry<K, Object> {

        /* renamed from: a */
        private Map.Entry<K, C8148h0> f34903a;

        /* renamed from: a */
        public C8148h0 mo26922a() {
            return this.f34903a.getValue();
        }

        public K getKey() {
            return this.f34903a.getKey();
        }

        public Object getValue() {
            C8148h0 value = this.f34903a.getValue();
            if (value == null) {
                return null;
            }
            return value.mo26919f();
        }

        public Object setValue(Object obj) {
            if (obj instanceof C8243v0) {
                return this.f34903a.getValue().mo26958d((C8243v0) obj);
            }
            throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
        }

        private C8150b(Map.Entry<K, C8148h0> entry) {
            this.f34903a = entry;
        }
    }

    /* renamed from: com.google.protobuf.h0$c */
    /* compiled from: LazyField */
    static class C8151c<K> implements Iterator<Map.Entry<K, Object>> {

        /* renamed from: a */
        private Iterator<Map.Entry<K, Object>> f34904a;

        public C8151c(Iterator<Map.Entry<K, Object>> it) {
            this.f34904a = it;
        }

        /* renamed from: a */
        public Map.Entry<K, Object> next() {
            Map.Entry<K, Object> next = this.f34904a.next();
            return next.getValue() instanceof C8148h0 ? new C8150b(next) : next;
        }

        public boolean hasNext() {
            return this.f34904a.hasNext();
        }

        public void remove() {
            this.f34904a.remove();
        }
    }

    public boolean equals(Object obj) {
        return mo26919f().equals(obj);
    }

    /* renamed from: f */
    public C8243v0 mo26919f() {
        return mo26957c(this.f34902f);
    }

    public int hashCode() {
        return mo26919f().hashCode();
    }

    public String toString() {
        return mo26919f().toString();
    }
}
