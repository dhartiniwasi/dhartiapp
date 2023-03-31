package com.google.protobuf;

import com.google.protobuf.C8105b2;
import java.io.IOException;

/* renamed from: com.google.protobuf.o0 */
/* compiled from: MapEntryLite */
public class C8204o0<K, V> {

    /* renamed from: a */
    private final C8205a<K, V> f35031a;

    /* renamed from: b */
    private final K f35032b;

    /* renamed from: c */
    private final V f35033c;

    /* renamed from: com.google.protobuf.o0$a */
    /* compiled from: MapEntryLite */
    static class C8205a<K, V> {

        /* renamed from: a */
        public final C8105b2.C8107b f35034a;

        /* renamed from: b */
        public final K f35035b;

        /* renamed from: c */
        public final C8105b2.C8107b f35036c;

        /* renamed from: d */
        public final V f35037d;

        public C8205a(C8105b2.C8107b bVar, K k, C8105b2.C8107b bVar2, V v) {
            this.f35034a = bVar;
            this.f35035b = k;
            this.f35036c = bVar2;
            this.f35037d = v;
        }
    }

    private C8204o0(C8105b2.C8107b bVar, K k, C8105b2.C8107b bVar2, V v) {
        this.f35031a = new C8205a<>(bVar, k, bVar2, v);
        this.f35032b = k;
        this.f35033c = v;
    }

    /* renamed from: b */
    static <K, V> int m45469b(C8205a<K, V> aVar, K k, V v) {
        return C8240v.m45653d(aVar.f35034a, 1, k) + C8240v.m45653d(aVar.f35036c, 2, v);
    }

    /* renamed from: d */
    public static <K, V> C8204o0<K, V> m45470d(C8105b2.C8107b bVar, K k, C8105b2.C8107b bVar2, V v) {
        return new C8204o0<>(bVar, k, bVar2, v);
    }

    /* renamed from: e */
    static <K, V> void m45471e(C8180l lVar, C8205a<K, V> aVar, K k, V v) throws IOException {
        C8240v.m45650A(lVar, aVar.f35034a, 1, k);
        C8240v.m45650A(lVar, aVar.f35036c, 2, v);
    }

    /* renamed from: a */
    public int mo27207a(int i, K k, V v) {
        return C8180l.m45138V(i) + C8180l.m45120D(m45469b(this.f35031a, k, v));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public C8205a<K, V> mo27208c() {
        return this.f35031a;
    }
}
