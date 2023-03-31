package p037e2;

import p161w3.C5917a;

/* renamed from: e2.b0 */
/* compiled from: SeekMap */
public interface C4192b0 {

    /* renamed from: e2.b0$a */
    /* compiled from: SeekMap */
    public static final class C4193a {

        /* renamed from: a */
        public final C4196c0 f23480a;

        /* renamed from: b */
        public final C4196c0 f23481b;

        public C4193a(C4196c0 c0Var) {
            this(c0Var, c0Var);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || C4193a.class != obj.getClass()) {
                return false;
            }
            C4193a aVar = (C4193a) obj;
            if (!this.f23480a.equals(aVar.f23480a) || !this.f23481b.equals(aVar.f23481b)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return (this.f23480a.hashCode() * 31) + this.f23481b.hashCode();
        }

        public String toString() {
            String str;
            StringBuilder sb = new StringBuilder();
            sb.append("[");
            sb.append(this.f23480a);
            if (this.f23480a.equals(this.f23481b)) {
                str = "";
            } else {
                str = ", " + this.f23481b;
            }
            sb.append(str);
            sb.append("]");
            return sb.toString();
        }

        public C4193a(C4196c0 c0Var, C4196c0 c0Var2) {
            this.f23480a = (C4196c0) C5917a.m34872e(c0Var);
            this.f23481b = (C4196c0) C5917a.m34872e(c0Var2);
        }
    }

    /* renamed from: e2.b0$b */
    /* compiled from: SeekMap */
    public static class C4194b implements C4192b0 {

        /* renamed from: a */
        private final long f23482a;

        /* renamed from: b */
        private final C4193a f23483b;

        public C4194b(long j) {
            this(j, 0);
        }

        /* renamed from: g */
        public boolean mo17534g() {
            return false;
        }

        /* renamed from: i */
        public C4193a mo17535i(long j) {
            return this.f23483b;
        }

        /* renamed from: j */
        public long mo17536j() {
            return this.f23482a;
        }

        public C4194b(long j, long j2) {
            this.f23482a = j;
            this.f23483b = new C4193a(j2 == 0 ? C4196c0.f23484c : new C4196c0(0, j2));
        }
    }

    /* renamed from: g */
    boolean mo17534g();

    /* renamed from: i */
    C4193a mo17535i(long j);

    /* renamed from: j */
    long mo17536j();
}
