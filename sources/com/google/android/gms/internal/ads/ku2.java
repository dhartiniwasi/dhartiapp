package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import java.util.HashSet;
import p060h4.C4623z2;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class ku2 implements z91 {

    /* renamed from: a */
    private final HashSet f12294a = new HashSet();

    /* renamed from: b */
    private final Context f12295b;

    /* renamed from: c */
    private final cm0 f12296c;

    public ku2(Context context, cm0 cm0) {
        this.f12295b = context;
        this.f12296c = cm0;
    }

    /* renamed from: a */
    public final Bundle mo11799a() {
        return this.f12296c.mo9222k(this.f12295b, this);
    }

    /* renamed from: b */
    public final synchronized void mo11800b(HashSet hashSet) {
        this.f12294a.clear();
        this.f12294a.addAll(hashSet);
    }

    /* renamed from: g */
    public final synchronized void mo9420g(C4623z2 z2Var) {
        if (z2Var.f25062a != 3) {
            this.f12296c.mo9220i(this.f12294a);
        }
    }
}
