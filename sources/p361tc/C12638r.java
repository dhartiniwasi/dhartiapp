package p361tc;

import java.util.List;
import java.util.logging.Logger;
import p264io.grpc.internal.C11298m2;
import p343rc.C12354m0;
import p343rc.C12411y0;
import p381vc.C12874d;

/* renamed from: tc.r */
/* compiled from: Utils */
class C12638r {

    /* renamed from: a */
    private static final Logger f46384a = Logger.getLogger(C12638r.class.getName());

    private C12638r() {
    }

    /* renamed from: a */
    public static C12411y0 m60145a(List<C12874d> list) {
        return C12354m0.m59158c(m60146b(list));
    }

    /* renamed from: b */
    private static byte[][] m60146b(List<C12874d> list) {
        byte[][] bArr = new byte[(list.size() * 2)][];
        int i = 0;
        for (C12874d next : list) {
            int i2 = i + 1;
            bArr[i] = next.f47011a.mo36831A();
            i = i2 + 1;
            bArr[i2] = next.f47012b.mo36831A();
        }
        return C11298m2.m55657e(bArr);
    }

    /* renamed from: c */
    public static C12411y0 m60147c(List<C12874d> list) {
        return C12354m0.m59158c(m60146b(list));
    }
}
