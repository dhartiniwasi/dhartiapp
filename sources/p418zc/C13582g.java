package p418zc;

import java.util.List;
import java.util.Map;
import p264io.grpc.internal.C11135b1;
import p264io.grpc.internal.C11169e2;
import p264io.grpc.internal.C11287l2;
import p343rc.C12276a1;
import p343rc.C12335j1;
import p343rc.C12376r0;
import p343rc.C12390s0;
import p343rc.C12396t0;
import p418zc.C13560e;

/* renamed from: zc.g */
/* compiled from: OutlierDetectionLoadBalancerProvider */
public final class C13582g extends C12390s0 {
    /* renamed from: a */
    public C12376r0 mo35326a(C12376r0.C12381d dVar) {
        return new C13560e(dVar, C11287l2.f43399a);
    }

    /* renamed from: b */
    public String mo35327b() {
        return "outlier_detection_experimental";
    }

    /* renamed from: c */
    public int mo35328c() {
        return 5;
    }

    /* renamed from: d */
    public boolean mo35329d() {
        return true;
    }

    /* renamed from: e */
    public C12276a1.C12280c mo35330e(Map<String, ?> map) {
        Long l = C11135b1.m55119l(map, "interval");
        Long l2 = C11135b1.m55119l(map, "baseEjectionTime");
        Long l3 = C11135b1.m55119l(map, "maxEjectionTime");
        Integer i = C11135b1.m55116i(map, "maxEjectionPercentage");
        C13560e.C13568g.C13569a aVar = new C13560e.C13568g.C13569a();
        if (l != null) {
            aVar.mo38712e(l);
        }
        if (l2 != null) {
            aVar.mo38709b(l2);
        }
        if (l3 != null) {
            aVar.mo38714g(l3);
        }
        if (i != null) {
            aVar.mo38713f(i);
        }
        Map<String, ?> j = C11135b1.m55117j(map, "successRateEjection");
        if (j != null) {
            C13560e.C13568g.C13572c.C13573a aVar2 = new C13560e.C13568g.C13572c.C13573a();
            Integer i2 = C11135b1.m55116i(j, "stdevFactor");
            Integer i3 = C11135b1.m55116i(j, "enforcementPercentage");
            Integer i4 = C11135b1.m55116i(j, "minimumHosts");
            Integer i5 = C11135b1.m55116i(j, "requestVolume");
            if (i2 != null) {
                aVar2.mo38725e(i2);
            }
            if (i3 != null) {
                aVar2.mo38722b(i3);
            }
            if (i4 != null) {
                aVar2.mo38723c(i4);
            }
            if (i5 != null) {
                aVar2.mo38724d(i5);
            }
            aVar.mo38715h(aVar2.mo38721a());
        }
        Map<String, ?> j2 = C11135b1.m55117j(map, "failurePercentageEjection");
        if (j2 != null) {
            C13560e.C13568g.C13570b.C13571a aVar3 = new C13560e.C13568g.C13570b.C13571a();
            Integer i6 = C11135b1.m55116i(j2, "threshold");
            Integer i7 = C11135b1.m55116i(j2, "enforcementPercentage");
            Integer i8 = C11135b1.m55116i(j2, "minimumHosts");
            Integer i9 = C11135b1.m55116i(j2, "requestVolume");
            if (i6 != null) {
                aVar3.mo38720e(i6);
            }
            if (i7 != null) {
                aVar3.mo38717b(i7);
            }
            if (i8 != null) {
                aVar3.mo38718c(i8);
            }
            if (i9 != null) {
                aVar3.mo38719d(i9);
            }
            aVar.mo38711d(aVar3.mo38716a());
        }
        List<C11169e2.C11170a> A = C11169e2.m55238A(C11135b1.m55113f(map, "childPolicy"));
        if (A == null || A.isEmpty()) {
            C12335j1 j1Var = C12335j1.f45620t;
            return C12276a1.C12280c.m58964b(j1Var.mo37030q("No child policy in outlier_detection_experimental LB policy: " + map));
        }
        C12276a1.C12280c y = C11169e2.m55263y(A, C12396t0.m59277b());
        if (y.mo36940d() != null) {
            return y;
        }
        aVar.mo38710c((C11169e2.C11171b) y.mo36939c());
        return C12276a1.C12280c.m58963a(aVar.mo38708a());
    }
}
