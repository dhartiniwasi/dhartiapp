package p119q1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p098n1.C5090l;
import p386w7.C12914d;

/* renamed from: q1.a */
/* compiled from: ClientMetrics */
public final class C5352a {

    /* renamed from: e */
    private static final C5352a f27416e = new C5353a().mo19402b();

    /* renamed from: a */
    private final C5363f f27417a;

    /* renamed from: b */
    private final List<C5359d> f27418b;

    /* renamed from: c */
    private final C5354b f27419c;

    /* renamed from: d */
    private final String f27420d;

    /* renamed from: q1.a$a */
    /* compiled from: ClientMetrics */
    public static final class C5353a {

        /* renamed from: a */
        private C5363f f27421a = null;

        /* renamed from: b */
        private List<C5359d> f27422b = new ArrayList();

        /* renamed from: c */
        private C5354b f27423c = null;

        /* renamed from: d */
        private String f27424d = "";

        C5353a() {
        }

        /* renamed from: a */
        public C5353a mo19401a(C5359d dVar) {
            this.f27422b.add(dVar);
            return this;
        }

        /* renamed from: b */
        public C5352a mo19402b() {
            return new C5352a(this.f27421a, Collections.unmodifiableList(this.f27422b), this.f27423c, this.f27424d);
        }

        /* renamed from: c */
        public C5353a mo19403c(String str) {
            this.f27424d = str;
            return this;
        }

        /* renamed from: d */
        public C5353a mo19404d(C5354b bVar) {
            this.f27423c = bVar;
            return this;
        }

        /* renamed from: e */
        public C5353a mo19405e(C5363f fVar) {
            this.f27421a = fVar;
            return this;
        }
    }

    C5352a(C5363f fVar, List<C5359d> list, C5354b bVar, String str) {
        this.f27417a = fVar;
        this.f27418b = list;
        this.f27419c = bVar;
        this.f27420d = str;
    }

    /* renamed from: e */
    public static C5353a m32788e() {
        return new C5353a();
    }

    @C12914d(tag = 4)
    /* renamed from: a */
    public String mo19396a() {
        return this.f27420d;
    }

    @C12914d(tag = 3)
    /* renamed from: b */
    public C5354b mo19397b() {
        return this.f27419c;
    }

    @C12914d(tag = 2)
    /* renamed from: c */
    public List<C5359d> mo19398c() {
        return this.f27418b;
    }

    @C12914d(tag = 1)
    /* renamed from: d */
    public C5363f mo19399d() {
        return this.f27417a;
    }

    /* renamed from: f */
    public byte[] mo19400f() {
        return C5090l.m31874a(this);
    }
}
