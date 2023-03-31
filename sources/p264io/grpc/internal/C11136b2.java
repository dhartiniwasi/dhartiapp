package p264io.grpc.internal;

import java.util.Map;
import p182a7.C6431n;
import p343rc.C12276a1;
import p343rc.C12335j1;

/* renamed from: io.grpc.internal.b2 */
/* compiled from: ScParser */
public final class C11136b2 extends C12276a1.C12286h {

    /* renamed from: a */
    private final boolean f42963a;

    /* renamed from: b */
    private final int f42964b;

    /* renamed from: c */
    private final int f42965c;

    /* renamed from: d */
    private final C11256j f42966d;

    public C11136b2(boolean z, int i, int i2, C11256j jVar) {
        this.f42963a = z;
        this.f42964b = i;
        this.f42965c = i2;
        this.f42966d = (C11256j) C6431n.m37562o(jVar, "autoLoadBalancerFactory");
    }

    /* renamed from: a */
    public C12276a1.C12280c mo34981a(Map<String, ?> map) {
        Object obj;
        try {
            C12276a1.C12280c f = this.f42966d.mo35206f(map);
            if (f == null) {
                obj = null;
            } else if (f.mo36940d() != null) {
                return C12276a1.C12280c.m58964b(f.mo36940d());
            } else {
                obj = f.mo36939c();
            }
            return C12276a1.C12280c.m58963a(C11264j1.m55548b(map, this.f42963a, this.f42964b, this.f42965c, obj));
        } catch (RuntimeException e) {
            return C12276a1.C12280c.m58964b(C12335j1.f45608h.mo37030q("failed to parse service config").mo37029p(e));
        }
    }
}
