package p260ib;

import com.google.protobuf.C8119d0;

/* renamed from: ib.e */
/* compiled from: Protos */
public enum C10579e implements C8119d0.C8122c {
    unknown(0),
    aztec(1),
    code39(2),
    code93(3),
    ean8(4),
    ean13(5),
    code128(6),
    dataMatrix(7),
    qr(8),
    interleaved2of5(9),
    upce(10),
    pdf417(11),
    UNRECOGNIZED(-1);
    

    /* renamed from: w */
    private static final C8119d0.C8123d<C10579e> f41634w = null;

    /* renamed from: a */
    private final int f41636a;

    /* renamed from: ib.e$a */
    /* compiled from: Protos */
    class C10580a implements C8119d0.C8123d<C10579e> {
        C10580a() {
        }

        /* renamed from: b */
        public C10579e mo26873a(int i) {
            return C10579e.m53140a(i);
        }
    }

    static {
        f41634w = new C10580a();
    }

    private C10579e(int i) {
        this.f41636a = i;
    }

    /* renamed from: a */
    public static C10579e m53140a(int i) {
        switch (i) {
            case 0:
                return unknown;
            case 1:
                return aztec;
            case 2:
                return code39;
            case 3:
                return code93;
            case 4:
                return ean8;
            case 5:
                return ean13;
            case 6:
                return code128;
            case 7:
                return dataMatrix;
            case 8:
                return qr;
            case 9:
                return interleaved2of5;
            case 10:
                return upce;
            case 11:
                return pdf417;
            default:
                return null;
        }
    }

    /* renamed from: f */
    public final int mo26872f() {
        if (this != UNRECOGNIZED) {
            return this.f41636a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
