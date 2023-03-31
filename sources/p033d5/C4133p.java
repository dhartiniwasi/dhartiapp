package p033d5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: d5.p */
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public final class C4133p {

    /* renamed from: d5.p$a */
    /* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
    public static final class C4134a {

        /* renamed from: a */
        private final List f23374a = new ArrayList();

        /* renamed from: b */
        private final Object f23375b;

        /* synthetic */ C4134a(Object obj, C4094c1 c1Var) {
            C4141r.m28221k(obj);
            this.f23375b = obj;
        }

        /* renamed from: a */
        public C4134a mo17442a(String str, Object obj) {
            List list = this.f23374a;
            C4141r.m28221k(str);
            String valueOf = String.valueOf(obj);
            list.add(str + "=" + valueOf);
            return this;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder(100);
            sb.append(this.f23375b.getClass().getSimpleName());
            sb.append('{');
            int size = this.f23374a.size();
            for (int i = 0; i < size; i++) {
                sb.append((String) this.f23374a.get(i));
                if (i < size - 1) {
                    sb.append(", ");
                }
            }
            sb.append('}');
            return sb.toString();
        }
    }

    /* renamed from: a */
    public static boolean m28193a(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    /* renamed from: b */
    public static int m28194b(Object... objArr) {
        return Arrays.hashCode(objArr);
    }

    /* renamed from: c */
    public static C4134a m28195c(Object obj) {
        return new C4134a(obj, (C4094c1) null);
    }
}
