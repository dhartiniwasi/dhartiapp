package p343rc;

import java.util.concurrent.TimeUnit;
import p182a7.C6419h;
import p343rc.C12410y;

/* renamed from: rc.y */
/* compiled from: ForwardingChannelBuilder */
public abstract class C12410y<T extends C12410y<T>> extends C12402v0<T> {
    protected C12410y() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public abstract C12402v0<?> mo37160e();

    /* renamed from: f */
    public T mo37143c(long j, TimeUnit timeUnit) {
        mo37160e().mo37143c(j, timeUnit);
        return mo37162g();
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final T mo37162g() {
        return this;
    }

    /* renamed from: h */
    public T mo37144d() {
        mo37160e().mo37144d();
        return mo37162g();
    }

    public String toString() {
        return C6419h.m37528c(this).mo21842d("delegate", mo37160e()).toString();
    }
}
