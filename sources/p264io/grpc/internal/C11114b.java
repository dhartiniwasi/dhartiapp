package p264io.grpc.internal;

import p182a7.C6419h;
import p343rc.C12399u0;
import p343rc.C12402v0;

/* renamed from: io.grpc.internal.b */
/* compiled from: AbstractManagedChannelImplBuilder */
public abstract class C11114b<T extends C12402v0<T>> extends C12402v0<T> {

    /* renamed from: a */
    protected int f42916a = 4194304;

    protected C11114b() {
    }

    /* renamed from: a */
    public C12399u0 mo34948a() {
        return mo34949e().mo34948a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public abstract C12402v0<?> mo34949e();

    public String toString() {
        return C6419h.m37528c(this).mo21842d("delegate", mo34949e()).toString();
    }
}
