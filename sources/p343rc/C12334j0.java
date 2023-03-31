package p343rc;

import java.util.concurrent.atomic.AtomicLong;
import p182a7.C6431n;

/* renamed from: rc.j0 */
/* compiled from: InternalLogId */
public final class C12334j0 {

    /* renamed from: d */
    private static final AtomicLong f45600d = new AtomicLong();

    /* renamed from: a */
    private final String f45601a;

    /* renamed from: b */
    private final String f45602b;

    /* renamed from: c */
    private final long f45603c;

    C12334j0(String str, String str2, long j) {
        C6431n.m37562o(str, "typeName");
        C6431n.m37552e(!str.isEmpty(), "empty type");
        this.f45601a = str;
        this.f45602b = str2;
        this.f45603c = j;
    }

    /* renamed from: a */
    public static C12334j0 m59092a(Class<?> cls, String str) {
        return m59093b(m59094c(cls), str);
    }

    /* renamed from: b */
    public static C12334j0 m59093b(String str, String str2) {
        return new C12334j0(str, str2, m59095e());
    }

    /* renamed from: c */
    private static String m59094c(Class<?> cls) {
        String simpleName = ((Class) C6431n.m37562o(cls, "type")).getSimpleName();
        if (!simpleName.isEmpty()) {
            return simpleName;
        }
        return cls.getName().substring(cls.getPackage().getName().length() + 1);
    }

    /* renamed from: e */
    static long m59095e() {
        return f45600d.incrementAndGet();
    }

    /* renamed from: d */
    public long mo37017d() {
        return this.f45603c;
    }

    /* renamed from: f */
    public String mo37018f() {
        return this.f45601a + "<" + this.f45603c + ">";
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(mo37018f());
        if (this.f45602b != null) {
            sb.append(": (");
            sb.append(this.f45602b);
            sb.append(')');
        }
        return sb.toString();
    }
}
