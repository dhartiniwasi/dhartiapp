package p264io.grpc.internal;

import java.io.InputStream;
import p182a7.C6419h;
import p343rc.C12335j1;
import p343rc.C12357n;
import p343rc.C12392t;
import p343rc.C12400v;

/* renamed from: io.grpc.internal.i0 */
/* compiled from: ForwardingClientStream */
abstract class C11252i0 implements C11329q {
    C11252i0() {
    }

    /* renamed from: a */
    public void mo34951a(int i) {
        mo35190o().mo34951a(i);
    }

    /* renamed from: b */
    public void mo34895b(int i) {
        mo35190o().mo34895b(i);
    }

    /* renamed from: c */
    public void mo34896c(C12335j1 j1Var) {
        mo35190o().mo34896c(j1Var);
    }

    /* renamed from: d */
    public void mo34897d(int i) {
        mo35190o().mo34897d(i);
    }

    /* renamed from: e */
    public void mo34952e(C12357n nVar) {
        mo35190o().mo34952e(nVar);
    }

    /* renamed from: f */
    public void mo34953f(String str) {
        mo35190o().mo34953f(str);
    }

    public void flush() {
        mo35190o().flush();
    }

    /* renamed from: g */
    public void mo34898g(C12400v vVar) {
        mo35190o().mo34898g(vVar);
    }

    /* renamed from: h */
    public void mo34899h(C11389x0 x0Var) {
        mo35190o().mo34899h(x0Var);
    }

    /* renamed from: i */
    public void mo34900i() {
        mo35190o().mo34900i();
    }

    public boolean isReady() {
        return mo35190o().isReady();
    }

    /* renamed from: k */
    public void mo34902k(C11333r rVar) {
        mo35190o().mo34902k(rVar);
    }

    /* renamed from: l */
    public void mo34903l(C12392t tVar) {
        mo35190o().mo34903l(tVar);
    }

    /* renamed from: m */
    public void mo34955m(InputStream inputStream) {
        mo35190o().mo34955m(inputStream);
    }

    /* renamed from: n */
    public void mo34956n() {
        mo35190o().mo34956n();
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public abstract C11329q mo35190o();

    /* renamed from: p */
    public void mo34905p(boolean z) {
        mo35190o().mo34905p(z);
    }

    public String toString() {
        return C6419h.m37528c(this).mo21842d("delegate", mo35190o()).toString();
    }
}
