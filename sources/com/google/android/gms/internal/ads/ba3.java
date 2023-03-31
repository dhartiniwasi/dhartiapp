package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class ba3 extends p93 {

    /* renamed from: a */
    private final Object f7185a;

    /* renamed from: b */
    private int f7186b;

    /* renamed from: c */
    final /* synthetic */ da3 f7187c;

    ba3(da3 da3, int i) {
        this.f7187c = da3;
        this.f7185a = da3.m11387j(da3, i);
        this.f7186b = i;
    }

    /* renamed from: a */
    private final void m10266a() {
        int i = this.f7186b;
        if (i == -1 || i >= this.f7187c.size() || !w73.m22614a(this.f7185a, da3.m11387j(this.f7187c, this.f7186b))) {
            this.f7186b = this.f7187c.m11397y(this.f7185a);
        }
    }

    public final Object getKey() {
        return this.f7185a;
    }

    public final Object getValue() {
        Map o = this.f7187c.mo9489o();
        if (o != null) {
            return o.get(this.f7185a);
        }
        m10266a();
        int i = this.f7186b;
        if (i == -1) {
            return null;
        }
        return da3.m11390m(this.f7187c, i);
    }

    public final Object setValue(Object obj) {
        Map o = this.f7187c.mo9489o();
        if (o != null) {
            return o.put(this.f7185a, obj);
        }
        m10266a();
        int i = this.f7186b;
        if (i == -1) {
            this.f7187c.put(this.f7185a, obj);
            return null;
        }
        Object m = da3.m11390m(this.f7187c, i);
        da3.m11392p(this.f7187c, this.f7186b, obj);
        return m;
    }
}
