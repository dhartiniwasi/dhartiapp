package p182a7;

import java.io.Serializable;
import java.util.Arrays;
import java.util.List;

/* renamed from: a7.p */
/* compiled from: Predicates */
public final class C6433p {

    /* renamed from: a7.p$b */
    /* compiled from: Predicates */
    private static class C6435b<T> implements C6432o<T>, Serializable {

        /* renamed from: a */
        private final List<? extends C6432o<? super T>> f30679a;

        public boolean apply(T t) {
            for (int i = 0; i < this.f30679a.size(); i++) {
                if (!((C6432o) this.f30679a.get(i)).apply(t)) {
                    return false;
                }
            }
            return true;
        }

        public boolean equals(Object obj) {
            if (obj instanceof C6435b) {
                return this.f30679a.equals(((C6435b) obj).f30679a);
            }
            return false;
        }

        public int hashCode() {
            return this.f30679a.hashCode() + 306654252;
        }

        public String toString() {
            return C6433p.m37574d("and", this.f30679a);
        }

        private C6435b(List<? extends C6432o<? super T>> list) {
            this.f30679a = list;
        }
    }

    /* renamed from: b */
    public static <T> C6432o<T> m37572b(C6432o<? super T> oVar, C6432o<? super T> oVar2) {
        return new C6435b(m37573c((C6432o) C6431n.m37561n(oVar), (C6432o) C6431n.m37561n(oVar2)));
    }

    /* renamed from: c */
    private static <T> List<C6432o<? super T>> m37573c(C6432o<? super T> oVar, C6432o<? super T> oVar2) {
        return Arrays.asList(new C6432o[]{oVar, oVar2});
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public static String m37574d(String str, Iterable<?> iterable) {
        StringBuilder sb = new StringBuilder("Predicates.");
        sb.append(str);
        sb.append('(');
        boolean z = true;
        for (Object next : iterable) {
            if (!z) {
                sb.append(',');
            }
            sb.append(next);
            z = false;
        }
        sb.append(')');
        return sb.toString();
    }
}
