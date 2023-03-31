package p264io.grpc.internal;

import p343rc.C12335j1;
import p343rc.C12411y0;

/* renamed from: io.grpc.internal.r */
/* compiled from: ClientStreamListener */
public interface C11333r extends C11274k2 {

    /* renamed from: io.grpc.internal.r$a */
    /* compiled from: ClientStreamListener */
    public enum C11334a {
        PROCESSED,
        REFUSED,
        DROPPED,
        MISCARRIED
    }

    /* renamed from: b */
    void mo34973b(C12411y0 y0Var);

    /* renamed from: d */
    void mo34975d(C12335j1 j1Var, C11334a aVar, C12411y0 y0Var);
}
