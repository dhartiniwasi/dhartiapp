package p386w7;

import java.lang.annotation.Annotation;
import p386w7.C12914d;

/* renamed from: w7.a */
/* compiled from: AtProtobuf */
public final class C12910a {

    /* renamed from: a */
    private int f47117a;

    /* renamed from: b */
    private C12914d.C12915a f47118b = C12914d.C12915a.DEFAULT;

    /* renamed from: w7.a$a */
    /* compiled from: AtProtobuf */
    private static final class C12911a implements C12914d {

        /* renamed from: a */
        private final int f47119a;

        /* renamed from: b */
        private final C12914d.C12915a f47120b;

        C12911a(int i, C12914d.C12915a aVar) {
            this.f47119a = i;
            this.f47120b = aVar;
        }

        public Class<? extends Annotation> annotationType() {
            return C12914d.class;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C12914d)) {
                return false;
            }
            C12914d dVar = (C12914d) obj;
            if (this.f47119a != dVar.tag() || !this.f47120b.equals(dVar.intEncoding())) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return (this.f47119a ^ 14552422) + (this.f47120b.hashCode() ^ 2041407134);
        }

        public C12914d.C12915a intEncoding() {
            return this.f47120b;
        }

        public int tag() {
            return this.f47119a;
        }

        public String toString() {
            return "@com.google.firebase.encoders.proto.Protobuf" + '(' + "tag=" + this.f47119a + "intEncoding=" + this.f47120b + ')';
        }
    }

    /* renamed from: b */
    public static C12910a m61012b() {
        return new C12910a();
    }

    /* renamed from: a */
    public C12914d mo37937a() {
        return new C12911a(this.f47117a, this.f47118b);
    }

    /* renamed from: c */
    public C12910a mo37938c(int i) {
        this.f47117a = i;
        return this;
    }
}
