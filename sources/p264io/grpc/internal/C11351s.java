package p264io.grpc.internal;

import java.util.concurrent.Executor;
import p343rc.C12292c;
import p343rc.C12327i0;
import p343rc.C12340k;
import p343rc.C12411y0;
import p343rc.C12423z0;

/* renamed from: io.grpc.internal.s */
/* compiled from: ClientTransport */
public interface C11351s extends C12327i0<Object> {

    /* renamed from: io.grpc.internal.s$a */
    /* compiled from: ClientTransport */
    public interface C11352a {
        /* renamed from: a */
        void mo35009a(Throwable th);

        /* renamed from: b */
        void mo35010b(long j);
    }

    /* renamed from: b */
    C11329q mo34932b(C12423z0<?, ?> z0Var, C12411y0 y0Var, C12292c cVar, C12340k[] kVarArr);

    /* renamed from: h */
    void mo35231h(C11352a aVar, Executor executor);
}
