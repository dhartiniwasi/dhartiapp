package p260ib;

import com.google.protobuf.C8119d0;

/* renamed from: ib.g */
/* compiled from: Protos */
public enum C10585g implements C8119d0.C8122c {
    Barcode(0),
    Cancelled(1),
    Error(2),
    UNRECOGNIZED(-1);
    

    /* renamed from: f */
    private static final C8119d0.C8123d<C10585g> f41642f = null;

    /* renamed from: a */
    private final int f41644a;

    /* renamed from: ib.g$a */
    /* compiled from: Protos */
    class C10586a implements C8119d0.C8123d<C10585g> {
        C10586a() {
        }

        /* renamed from: b */
        public C10585g mo26873a(int i) {
            return C10585g.m53170a(i);
        }
    }

    static {
        f41642f = new C10586a();
    }

    private C10585g(int i) {
        this.f41644a = i;
    }

    /* renamed from: a */
    public static C10585g m53170a(int i) {
        if (i == 0) {
            return Barcode;
        }
        if (i == 1) {
            return Cancelled;
        }
        if (i != 2) {
            return null;
        }
        return Error;
    }

    /* renamed from: f */
    public final int mo26872f() {
        if (this != UNRECOGNIZED) {
            return this.f41644a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
