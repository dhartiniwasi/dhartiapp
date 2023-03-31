package com.google.android.gms.internal.ads;

import android.os.Handler;
import java.io.IOException;
import java.util.HashMap;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public abstract class uf4 extends mf4 {

    /* renamed from: h */
    private final HashMap f18518h = new HashMap();

    /* renamed from: i */
    private Handler f18519i;

    /* renamed from: j */
    private ve3 f18520j;

    protected uf4() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: A */
    public abstract void mo9586A(Object obj, og4 og4, gt0 gt0);

    /* access modifiers changed from: protected */
    /* renamed from: B */
    public final void mo14509B(Object obj, og4 og4) {
        v91.m22050d(!this.f18518h.containsKey(obj));
        rf4 rf4 = new rf4(this, obj);
        sf4 sf4 = new sf4(this, obj);
        this.f18518h.put(obj, new tf4(og4, rf4, sf4));
        Handler handler = this.f18519i;
        Objects.requireNonNull(handler);
        og4.mo12326b(handler, sf4);
        Handler handler2 = this.f18519i;
        Objects.requireNonNull(handler2);
        og4.mo12333l(handler2, sf4);
        og4.mo12331i(rf4, this.f18520j, mo12334m());
        if (!mo12343y()) {
            og4.mo12327e(rf4);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: s */
    public final void mo12340s() {
        for (tf4 tf4 : this.f18518h.values()) {
            tf4.f17986a.mo12327e(tf4.f17987b);
        }
    }

    /* renamed from: t */
    public void mo9590t() throws IOException {
        for (tf4 tf4 : this.f18518h.values()) {
            tf4.f17986a.mo9590t();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public final void mo12341u() {
        for (tf4 tf4 : this.f18518h.values()) {
            tf4.f17986a.mo12330h(tf4.f17987b);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public void mo9591v(ve3 ve3) {
        this.f18520j = ve3;
        this.f18519i = gb2.m13163d((Handler.Callback) null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: x */
    public void mo9592x() {
        for (tf4 tf4 : this.f18518h.values()) {
            tf4.f17986a.mo12325a(tf4.f17987b);
            tf4.f17986a.mo12329g(tf4.f17988c);
            tf4.f17986a.mo12328f(tf4.f17988c);
        }
        this.f18518h.clear();
    }

    /* access modifiers changed from: protected */
    /* renamed from: z */
    public abstract mg4 mo9593z(Object obj, mg4 mg4);
}
