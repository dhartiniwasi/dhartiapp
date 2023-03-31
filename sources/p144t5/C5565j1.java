package p144t5;

import java.util.Objects;

/* renamed from: t5.j1 */
/* compiled from: com.google.android.ump:user-messaging-platform@@2.0.0 */
public final class C5565j1<T> implements C5579n1<T> {

    /* renamed from: c */
    private static final Object f28131c = new Object();

    /* renamed from: a */
    private volatile C5579n1<T> f28132a;

    /* renamed from: b */
    private volatile Object f28133b = f28131c;

    private C5565j1(C5579n1<T> n1Var) {
        this.f28132a = n1Var;
    }

    /* renamed from: a */
    public static <P extends C5579n1<T>, T> C5579n1<T> m33628a(P p) {
        Objects.requireNonNull(p);
        if (p instanceof C5565j1) {
            return p;
        }
        return new C5565j1(p);
    }

    /* renamed from: d */
    public final T mo19832d() {
        T t = this.f28133b;
        T t2 = f28131c;
        if (t == t2) {
            synchronized (this) {
                t = this.f28133b;
                if (t == t2) {
                    t = this.f28132a.mo19832d();
                    T t3 = this.f28133b;
                    if (t3 != t2) {
                        if (t3 != t) {
                            String valueOf = String.valueOf(t3);
                            String valueOf2 = String.valueOf(t);
                            StringBuilder sb = new StringBuilder(valueOf.length() + 118 + valueOf2.length());
                            sb.append("Scoped provider was invoked recursively returning different results: ");
                            sb.append(valueOf);
                            sb.append(" & ");
                            sb.append(valueOf2);
                            sb.append(". This is likely due to a circular dependency.");
                            throw new IllegalStateException(sb.toString());
                        }
                    }
                    this.f28133b = t;
                    this.f28132a = null;
                }
            }
        }
        return t;
    }
}
