package p220e8;

import java.util.Collections;
import java.util.List;
import p211d8.C9907y;
import p246h7.C10428q;
import p405y8.C13085b;
import p405y8.C13088b0;

/* renamed from: e8.a */
/* compiled from: ArrayTransformOperation */
public abstract class C10002a implements C10019p {

    /* renamed from: a */
    private final List<C13088b0> f39955a;

    /* renamed from: e8.a$a */
    /* compiled from: ArrayTransformOperation */
    public static class C10003a extends C10002a {
        public C10003a(List<C13088b0> list) {
            super(list);
        }

        /* access modifiers changed from: protected */
        /* renamed from: d */
        public C13088b0 mo32572d(C13088b0 b0Var) {
            C13085b.C13087b e = C10002a.m51083e(b0Var);
            for (C13088b0 next : mo32574f()) {
                int i = 0;
                while (i < e.mo38110G()) {
                    if (C9907y.m50822q(e.mo38109F(i), next)) {
                        e.mo38111H(i);
                    } else {
                        i++;
                    }
                }
            }
            return (C13088b0) C13088b0.m61490y0().mo38124E(e).build();
        }
    }

    /* renamed from: e8.a$b */
    /* compiled from: ArrayTransformOperation */
    public static class C10004b extends C10002a {
        public C10004b(List<C13088b0> list) {
            super(list);
        }

        /* access modifiers changed from: protected */
        /* renamed from: d */
        public C13088b0 mo32572d(C13088b0 b0Var) {
            C13085b.C13087b e = C10002a.m51083e(b0Var);
            for (C13088b0 next : mo32574f()) {
                if (!C9907y.m50821p(e, next)) {
                    e.mo38108E(next);
                }
            }
            return (C13088b0) C13088b0.m61490y0().mo38124E(e).build();
        }
    }

    C10002a(List<C13088b0> list) {
        this.f39955a = Collections.unmodifiableList(list);
    }

    /* renamed from: e */
    static C13085b.C13087b m51083e(C13088b0 b0Var) {
        if (C9907y.m50825t(b0Var)) {
            return (C13085b.C13087b) b0Var.mo38112m0().mo27317b();
        }
        return C13085b.m61455k0();
    }

    /* renamed from: a */
    public C13088b0 mo32569a(C13088b0 b0Var, C10428q qVar) {
        return mo32572d(b0Var);
    }

    /* renamed from: b */
    public C13088b0 mo32570b(C13088b0 b0Var) {
        return null;
    }

    /* renamed from: c */
    public C13088b0 mo32571c(C13088b0 b0Var, C13088b0 b0Var2) {
        return mo32572d(b0Var);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public abstract C13088b0 mo32572d(C13088b0 b0Var);

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.f39955a.equals(((C10002a) obj).f39955a);
    }

    /* renamed from: f */
    public List<C13088b0> mo32574f() {
        return this.f39955a;
    }

    public int hashCode() {
        return (getClass().hashCode() * 31) + this.f39955a.hashCode();
    }
}
