package p381vc;

/* renamed from: vc.a */
/* compiled from: ErrorCode */
public enum C12870a {
    NO_ERROR(0, -1, 0),
    PROTOCOL_ERROR(1, 1, 1),
    INVALID_STREAM(1, 2, -1),
    UNSUPPORTED_VERSION(1, 4, -1),
    STREAM_IN_USE(1, 8, -1),
    STREAM_ALREADY_CLOSED(1, 9, -1),
    INTERNAL_ERROR(2, 6, 2),
    FLOW_CONTROL_ERROR(3, 7, -1),
    STREAM_CLOSED(5, -1, -1),
    FRAME_TOO_LARGE(6, 11, -1),
    REFUSED_STREAM(7, 3, -1),
    CANCEL(8, 5, -1),
    COMPRESSION_ERROR(9, -1, -1),
    CONNECT_ERROR(10, -1, -1),
    ENHANCE_YOUR_CALM(11, -1, -1),
    INADEQUATE_SECURITY(12, -1, -1),
    HTTP_1_1_REQUIRED(13, -1, -1),
    INVALID_CREDENTIALS(-1, 10, -1);
    

    /* renamed from: a */
    public final int f47001a;

    /* renamed from: b */
    public final int f47002b;

    /* renamed from: c */
    public final int f47003c;

    private C12870a(int i, int i2, int i3) {
        this.f47001a = i;
        this.f47002b = i2;
        this.f47003c = i3;
    }

    /* renamed from: a */
    public static C12870a m60860a(int i) {
        for (C12870a aVar : values()) {
            if (aVar.f47001a == i) {
                return aVar;
            }
        }
        return null;
    }
}
