package p243gd;

import java.io.Serializable;
import kotlin.jvm.internal.C11669k;

/* renamed from: gd.l */
/* compiled from: Tuples.kt */
public final class C10340l<A, B> implements Serializable {

    /* renamed from: a */
    private final A f40956a;

    /* renamed from: b */
    private final B f40957b;

    public C10340l(A a, B b) {
        this.f40956a = a;
        this.f40957b = b;
    }

    /* renamed from: a */
    public final A mo33173a() {
        return this.f40956a;
    }

    /* renamed from: b */
    public final B mo33174b() {
        return this.f40957b;
    }

    /* renamed from: c */
    public final A mo33175c() {
        return this.f40956a;
    }

    /* renamed from: d */
    public final B mo33176d() {
        return this.f40957b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10340l)) {
            return false;
        }
        C10340l lVar = (C10340l) obj;
        return C11669k.m56783a(this.f40956a, lVar.f40956a) && C11669k.m56783a(this.f40957b, lVar.f40957b);
    }

    public int hashCode() {
        A a = this.f40956a;
        int i = 0;
        int hashCode = (a == null ? 0 : a.hashCode()) * 31;
        B b = this.f40957b;
        if (b != null) {
            i = b.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        return '(' + this.f40956a + ", " + this.f40957b + ')';
    }
}
