package p336qe;

/* renamed from: qe.q */
/* compiled from: SegmentPool */
final class C12249q {

    /* renamed from: a */
    static C12248p f45418a;

    /* renamed from: b */
    static long f45419b;

    private C12249q() {
    }

    /* renamed from: a */
    static void m58859a(C12248p pVar) {
        if (pVar.f45416f != null || pVar.f45417g != null) {
            throw new IllegalArgumentException();
        } else if (!pVar.f45414d) {
            synchronized (C12249q.class) {
                long j = f45419b;
                if (j + 8192 <= 65536) {
                    f45419b = j + 8192;
                    pVar.f45416f = f45418a;
                    pVar.f45413c = 0;
                    pVar.f45412b = 0;
                    f45418a = pVar;
                }
            }
        }
    }

    /* renamed from: b */
    static C12248p m58860b() {
        synchronized (C12249q.class) {
            C12248p pVar = f45418a;
            if (pVar == null) {
                return new C12248p();
            }
            f45418a = pVar.f45416f;
            pVar.f45416f = null;
            f45419b -= 8192;
            return pVar;
        }
    }
}
