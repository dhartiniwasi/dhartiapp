package p343rc;

import p182a7.C6419h;
import p182a7.C6425j;
import p182a7.C6431n;

/* renamed from: rc.e0 */
/* compiled from: InternalChannelz */
public final class C12308e0 {

    /* renamed from: a */
    public final String f45566a;

    /* renamed from: b */
    public final C12310b f45567b;

    /* renamed from: c */
    public final long f45568c;

    /* renamed from: d */
    public final C12368p0 f45569d;

    /* renamed from: e */
    public final C12368p0 f45570e;

    /* renamed from: rc.e0$a */
    /* compiled from: InternalChannelz */
    public static final class C12309a {

        /* renamed from: a */
        private String f45571a;

        /* renamed from: b */
        private C12310b f45572b;

        /* renamed from: c */
        private Long f45573c;

        /* renamed from: d */
        private C12368p0 f45574d;

        /* renamed from: e */
        private C12368p0 f45575e;

        /* renamed from: a */
        public C12308e0 mo37005a() {
            C6431n.m37562o(this.f45571a, "description");
            C6431n.m37562o(this.f45572b, "severity");
            C6431n.m37562o(this.f45573c, "timestampNanos");
            C6431n.m37568u(this.f45574d == null || this.f45575e == null, "at least one of channelRef and subchannelRef must be null");
            return new C12308e0(this.f45571a, this.f45572b, this.f45573c.longValue(), this.f45574d, this.f45575e);
        }

        /* renamed from: b */
        public C12309a mo37006b(String str) {
            this.f45571a = str;
            return this;
        }

        /* renamed from: c */
        public C12309a mo37007c(C12310b bVar) {
            this.f45572b = bVar;
            return this;
        }

        /* renamed from: d */
        public C12309a mo37008d(C12368p0 p0Var) {
            this.f45575e = p0Var;
            return this;
        }

        /* renamed from: e */
        public C12309a mo37009e(long j) {
            this.f45573c = Long.valueOf(j);
            return this;
        }
    }

    /* renamed from: rc.e0$b */
    /* compiled from: InternalChannelz */
    public enum C12310b {
        CT_UNKNOWN,
        CT_INFO,
        CT_WARNING,
        CT_ERROR
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C12308e0)) {
            return false;
        }
        C12308e0 e0Var = (C12308e0) obj;
        if (!C6425j.m37541a(this.f45566a, e0Var.f45566a) || !C6425j.m37541a(this.f45567b, e0Var.f45567b) || this.f45568c != e0Var.f45568c || !C6425j.m37541a(this.f45569d, e0Var.f45569d) || !C6425j.m37541a(this.f45570e, e0Var.f45570e)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C6425j.m37542b(this.f45566a, this.f45567b, Long.valueOf(this.f45568c), this.f45569d, this.f45570e);
    }

    public String toString() {
        return C6419h.m37528c(this).mo21842d("description", this.f45566a).mo21842d("severity", this.f45567b).mo21841c("timestampNanos", this.f45568c).mo21842d("channelRef", this.f45569d).mo21842d("subchannelRef", this.f45570e).toString();
    }

    private C12308e0(String str, C12310b bVar, long j, C12368p0 p0Var, C12368p0 p0Var2) {
        this.f45566a = str;
        this.f45567b = (C12310b) C6431n.m37562o(bVar, "severity");
        this.f45568c = j;
        this.f45569d = p0Var;
        this.f45570e = p0Var2;
    }
}
