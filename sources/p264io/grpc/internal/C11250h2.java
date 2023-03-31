package p264io.grpc.internal;

import java.io.Closeable;
import p264io.grpc.internal.C11274k2;
import p264io.grpc.internal.C11281l1;

/* renamed from: io.grpc.internal.h2 */
/* compiled from: SquelchLateMessagesAvailableDeframerListener */
final class C11250h2 extends C11280l0 {

    /* renamed from: a */
    private final C11281l1.C11283b f43317a;

    /* renamed from: b */
    private boolean f43318b;

    public C11250h2(C11281l1.C11283b bVar) {
        this.f43317a = bVar;
    }

    /* renamed from: a */
    public void mo35014a(C11274k2.C11275a aVar) {
        if (!this.f43318b) {
            super.mo35014a(aVar);
        } else if (aVar instanceof Closeable) {
            C11335r0.m55798e((Closeable) aVar);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C11281l1.C11283b mo35189b() {
        return this.f43317a;
    }

    /* renamed from: c */
    public void mo34929c(boolean z) {
        this.f43318b = true;
        super.mo34929c(z);
    }

    /* renamed from: e */
    public void mo35070e(Throwable th) {
        this.f43318b = true;
        super.mo35070e(th);
    }
}
