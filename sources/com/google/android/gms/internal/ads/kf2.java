package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public abstract class kf2 implements ql2 {

    /* renamed from: a */
    private final boolean f12067a;

    /* renamed from: b */
    private final ArrayList f12068b = new ArrayList(1);

    /* renamed from: c */
    private int f12069c;

    /* renamed from: d */
    private wq2 f12070d;

    protected kf2(boolean z) {
        this.f12067a = z;
    }

    /* renamed from: a */
    public /* synthetic */ Map mo8790a() {
        return Collections.emptyMap();
    }

    /* access modifiers changed from: protected */
    /* renamed from: f0 */
    public final void mo11672f0(int i) {
        wq2 wq2 = this.f12070d;
        int i2 = gb2.f9812a;
        for (int i3 = 0; i3 < this.f12069c; i3++) {
            ((ve3) this.f12068b.get(i3)).mo11234o(this, wq2, this.f12067a, i);
        }
    }

    /* renamed from: k */
    public final void mo8795k(ve3 ve3) {
        Objects.requireNonNull(ve3);
        if (!this.f12068b.contains(ve3)) {
            this.f12068b.add(ve3);
            this.f12069c++;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public final void mo11673m() {
        wq2 wq2 = this.f12070d;
        int i = gb2.f9812a;
        for (int i2 = 0; i2 < this.f12069c; i2++) {
            ((ve3) this.f12068b.get(i2)).mo11191A(this, wq2, this.f12067a);
        }
        this.f12070d = null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public final void mo11674n(wq2 wq2) {
        for (int i = 0; i < this.f12069c; i++) {
            ((ve3) this.f12068b.get(i)).mo11193F(this, wq2, this.f12067a);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public final void mo11675o(wq2 wq2) {
        this.f12070d = wq2;
        for (int i = 0; i < this.f12069c; i++) {
            ((ve3) this.f12068b.get(i)).mo11237r(this, wq2, this.f12067a);
        }
    }
}
