package p361tc;

import java.util.ArrayList;
import java.util.List;
import p182a7.C6431n;
import p264io.grpc.internal.C11298m2;
import p264io.grpc.internal.C11335r0;
import p336qe.C12235f;
import p343rc.C12354m0;
import p343rc.C12411y0;
import p381vc.C12874d;

/* renamed from: tc.d */
/* compiled from: Headers */
class C12601d {

    /* renamed from: a */
    public static final C12874d f46189a;

    /* renamed from: b */
    public static final C12874d f46190b;

    /* renamed from: c */
    public static final C12874d f46191c;

    /* renamed from: d */
    public static final C12874d f46192d;

    /* renamed from: e */
    public static final C12874d f46193e = new C12874d(C11335r0.f43536j.mo37181d(), "application/grpc");

    /* renamed from: f */
    public static final C12874d f46194f = new C12874d("te", "trailers");

    static {
        C12235f fVar = C12874d.f47007g;
        f46189a = new C12874d(fVar, "https");
        f46190b = new C12874d(fVar, "http");
        C12235f fVar2 = C12874d.f47005e;
        f46191c = new C12874d(fVar2, "POST");
        f46192d = new C12874d(fVar2, "GET");
    }

    /* renamed from: a */
    private static List<C12874d> m59928a(List<C12874d> list, C12411y0 y0Var) {
        byte[][] d = C11298m2.m55656d(y0Var);
        for (int i = 0; i < d.length; i += 2) {
            C12235f r = C12235f.m58767r(d[i]);
            if (!(r.mo36846w() == 0 || r.mo36839p(0) == 58)) {
                list.add(new C12874d(r, C12235f.m58767r(d[i + 1])));
            }
        }
        return list;
    }

    /* renamed from: b */
    public static List<C12874d> m59929b(C12411y0 y0Var, String str, String str2, String str3, boolean z, boolean z2) {
        C6431n.m37562o(y0Var, "headers");
        C6431n.m37562o(str, "defaultPath");
        C6431n.m37562o(str2, "authority");
        m59930c(y0Var);
        ArrayList arrayList = new ArrayList(C12354m0.m59156a(y0Var) + 7);
        if (z2) {
            arrayList.add(f46190b);
        } else {
            arrayList.add(f46189a);
        }
        if (z) {
            arrayList.add(f46192d);
        } else {
            arrayList.add(f46191c);
        }
        arrayList.add(new C12874d(C12874d.f47008h, str2));
        arrayList.add(new C12874d(C12874d.f47006f, str));
        arrayList.add(new C12874d(C11335r0.f43538l.mo37181d(), str3));
        arrayList.add(f46193e);
        arrayList.add(f46194f);
        return m59928a(arrayList, y0Var);
    }

    /* renamed from: c */
    private static void m59930c(C12411y0 y0Var) {
        y0Var.mo37165e(C11335r0.f43536j);
        y0Var.mo37165e(C11335r0.f43537k);
        y0Var.mo37165e(C11335r0.f43538l);
    }
}
