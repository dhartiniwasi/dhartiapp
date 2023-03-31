package p343rc;

import java.util.Map;
import p182a7.C6419h;
import p343rc.C12276a1;
import p343rc.C12376r0;

/* renamed from: rc.s0 */
/* compiled from: LoadBalancerProvider */
public abstract class C12390s0 extends C12376r0.C12380c {

    /* renamed from: a */
    private static final C12276a1.C12280c f45731a = C12276a1.C12280c.m58963a(new C12391a());

    /* renamed from: rc.s0$a */
    /* compiled from: LoadBalancerProvider */
    private static final class C12391a {
        C12391a() {
        }

        public String toString() {
            return "service config is unused";
        }
    }

    /* renamed from: b */
    public abstract String mo35327b();

    /* renamed from: c */
    public abstract int mo35328c();

    /* renamed from: d */
    public abstract boolean mo35329d();

    /* renamed from: e */
    public C12276a1.C12280c mo35330e(Map<String, ?> map) {
        return f45731a;
    }

    public final boolean equals(Object obj) {
        return this == obj;
    }

    public final int hashCode() {
        return super.hashCode();
    }

    public final String toString() {
        return C6419h.m37528c(this).mo21842d("policy", mo35327b()).mo21840b("priority", mo35328c()).mo21843e("available", mo35329d()).toString();
    }
}
