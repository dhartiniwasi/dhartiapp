package p343rc;

import p182a7.C6419h;

/* renamed from: rc.d1 */
/* compiled from: PartialForwardingClientCall */
abstract class C12306d1<ReqT, RespT> extends C12319g<ReqT, RespT> {
    C12306d1() {
    }

    /* renamed from: a */
    public void mo35100a(String str, Throwable th) {
        mo33083f().mo35100a(str, th);
    }

    /* renamed from: b */
    public void mo33082b() {
        mo33083f().mo33082b();
    }

    /* renamed from: c */
    public void mo35101c(int i) {
        mo33083f().mo35101c(i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public abstract C12319g<?, ?> mo33083f();

    public String toString() {
        return C6419h.m37528c(this).mo21842d("delegate", mo33083f()).toString();
    }
}
