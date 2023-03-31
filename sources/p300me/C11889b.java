package p300me;

/* renamed from: me.b */
/* compiled from: ErrorCode */
public enum C11889b {
    NO_ERROR(0),
    PROTOCOL_ERROR(1),
    INTERNAL_ERROR(2),
    FLOW_CONTROL_ERROR(3),
    REFUSED_STREAM(7),
    CANCEL(8),
    COMPRESSION_ERROR(9),
    CONNECT_ERROR(10),
    ENHANCE_YOUR_CALM(11),
    INADEQUATE_SECURITY(12),
    HTTP_1_1_REQUIRED(13);
    

    /* renamed from: a */
    public final int f44645a;

    private C11889b(int i) {
        this.f44645a = i;
    }

    /* renamed from: a */
    public static C11889b m57402a(int i) {
        for (C11889b bVar : values()) {
            if (bVar.f44645a == i) {
                return bVar;
            }
        }
        return null;
    }
}
