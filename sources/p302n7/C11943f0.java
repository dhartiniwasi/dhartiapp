package p302n7;

import java.lang.annotation.Annotation;

/* renamed from: n7.f0 */
/* compiled from: Qualified */
public final class C11943f0<T> {

    /* renamed from: a */
    private final Class<? extends Annotation> f44838a;

    /* renamed from: b */
    private final Class<T> f44839b;

    /* renamed from: n7.f0$a */
    /* compiled from: Qualified */
    private @interface C11944a {
    }

    public C11943f0(Class<? extends Annotation> cls, Class<T> cls2) {
        this.f44838a = cls;
        this.f44839b = cls2;
    }

    /* renamed from: a */
    public static <T> C11943f0<T> m57674a(Class<? extends Annotation> cls, Class<T> cls2) {
        return new C11943f0<>(cls, cls2);
    }

    /* renamed from: b */
    public static <T> C11943f0<T> m57675b(Class<T> cls) {
        return new C11943f0<>(C11944a.class, cls);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C11943f0.class != obj.getClass()) {
            return false;
        }
        C11943f0 f0Var = (C11943f0) obj;
        if (!this.f44839b.equals(f0Var.f44839b)) {
            return false;
        }
        return this.f44838a.equals(f0Var.f44838a);
    }

    public int hashCode() {
        return (this.f44839b.hashCode() * 31) + this.f44838a.hashCode();
    }

    public String toString() {
        if (this.f44838a == C11944a.class) {
            return this.f44839b.getName();
        }
        return "@" + this.f44838a.getName() + " " + this.f44839b.getName();
    }
}
