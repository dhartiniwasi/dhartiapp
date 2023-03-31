package p343rc;

import java.util.concurrent.TimeoutException;
import p182a7.C6431n;
import p343rc.C12335j1;

/* renamed from: rc.s */
/* compiled from: Contexts */
public final class C12389s {
    /* renamed from: a */
    public static C12335j1 m59260a(C12372r rVar) {
        C6431n.m37562o(rVar, "context must not be null");
        if (!rVar.mo37090h()) {
            return null;
        }
        Throwable c = rVar.mo37087c();
        if (c == null) {
            return C12335j1.f45607g.mo37030q("io.grpc.Context was cancelled without error");
        }
        if (c instanceof TimeoutException) {
            return C12335j1.f45610j.mo37030q(c.getMessage()).mo37029p(c);
        }
        C12335j1 k = C12335j1.m59105k(c);
        if (!C12335j1.C12337b.UNKNOWN.equals(k.mo37026m()) || k.mo37025l() != c) {
            return k.mo37029p(c);
        }
        return C12335j1.f45607g.mo37030q("Context cancelled").mo37029p(c);
    }
}
