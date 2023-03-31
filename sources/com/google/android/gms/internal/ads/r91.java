package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class r91 implements b44 {

    /* renamed from: a */
    private final q91 f16874a;

    /* renamed from: b */
    private final o44 f16875b;

    /* renamed from: c */
    private final o44 f16876c;

    /* renamed from: d */
    private final o44 f16877d;

    /* renamed from: e */
    private final o44 f16878e;

    public r91(q91 q91, o44 o44, o44 o442, o44 o443, o44 o444) {
        this.f16874a = q91;
        this.f16875b = o44;
        this.f16876c = o442;
        this.f16877d = o443;
        this.f16878e = o444;
    }

    /* renamed from: d */
    public final /* synthetic */ Object mo8155d() {
        Context context = (Context) this.f16875b.mo8155d();
        vm0 a = ((jv0) this.f16876c).mo11523a();
        is2 a2 = ((l61) this.f16877d).mo11902a();
        jj0 jj0 = new jj0();
        if (a2.f10943B != null) {
            return new ij0(context, a, a2.f10943B, a2.f11003t.f14184b, jj0, (byte[]) null);
        }
        return null;
    }
}
