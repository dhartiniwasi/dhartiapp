package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public abstract class ec4 implements gb4 {

    /* renamed from: b */
    protected eb4 f8734b;

    /* renamed from: c */
    protected eb4 f8735c;

    /* renamed from: d */
    private eb4 f8736d;

    /* renamed from: e */
    private eb4 f8737e;

    /* renamed from: f */
    private ByteBuffer f8738f;

    /* renamed from: g */
    private ByteBuffer f8739g;

    /* renamed from: h */
    private boolean f8740h;

    public ec4() {
        ByteBuffer byteBuffer = gb4.f9828a;
        this.f8738f = byteBuffer;
        this.f8739g = byteBuffer;
        eb4 eb4 = eb4.f8726e;
        this.f8736d = eb4;
        this.f8737e = eb4;
        this.f8734b = eb4;
        this.f8735c = eb4;
    }

    /* renamed from: T */
    public final void mo9875T() {
        mo9880e();
        this.f8738f = gb4.f9828a;
        eb4 eb4 = eb4.f8726e;
        this.f8736d = eb4;
        this.f8737e = eb4;
        this.f8734b = eb4;
        this.f8735c = eb4;
        mo9885k();
    }

    /* renamed from: U */
    public boolean mo9876U() {
        return this.f8740h && this.f8739g == gb4.f9828a;
    }

    /* renamed from: b */
    public final void mo9877b() {
        this.f8740h = true;
        mo9884j();
    }

    /* renamed from: c */
    public boolean mo9878c() {
        return this.f8737e != eb4.f8726e;
    }

    /* renamed from: d */
    public ByteBuffer mo9879d() {
        ByteBuffer byteBuffer = this.f8739g;
        this.f8739g = gb4.f9828a;
        return byteBuffer;
    }

    /* renamed from: e */
    public final void mo9880e() {
        this.f8739g = gb4.f9828a;
        this.f8740h = false;
        this.f8734b = this.f8736d;
        this.f8735c = this.f8737e;
        mo9883i();
    }

    /* renamed from: f */
    public final eb4 mo9881f(eb4 eb4) throws fb4 {
        this.f8736d = eb4;
        this.f8737e = mo9559g(eb4);
        return mo9878c() ? this.f8737e : eb4.f8726e;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public abstract eb4 mo9559g(eb4 eb4) throws fb4;

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final ByteBuffer mo9882h(int i) {
        if (this.f8738f.capacity() < i) {
            this.f8738f = ByteBuffer.allocateDirect(i).order(ByteOrder.nativeOrder());
        } else {
            this.f8738f.clear();
        }
        ByteBuffer byteBuffer = this.f8738f;
        this.f8739g = byteBuffer;
        return byteBuffer;
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public void mo9883i() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public void mo9884j() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public void mo9885k() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public final boolean mo9886l() {
        return this.f8739g.hasRemaining();
    }
}
