package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Objects;
import p060h4.C4571q4;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class cx0 implements po2 {

    /* renamed from: a */
    private final dw0 f7971a;

    /* renamed from: b */
    private Context f7972b;

    /* renamed from: c */
    private String f7973c;

    /* renamed from: d */
    private C4571q4 f7974d;

    /* synthetic */ cx0(dw0 dw0, bx0 bx0) {
        this.f7971a = dw0;
    }

    /* renamed from: a */
    public final /* synthetic */ po2 mo9363a(Context context) {
        Objects.requireNonNull(context);
        this.f7972b = context;
        return this;
    }

    /* renamed from: b */
    public final qo2 mo9364b() {
        j44.m14700c(this.f7972b, Context.class);
        j44.m14700c(this.f7973c, String.class);
        j44.m14700c(this.f7974d, C4571q4.class);
        return new ex0(this.f7971a, this.f7972b, this.f7973c, this.f7974d, (dx0) null);
    }

    /* renamed from: c */
    public final /* synthetic */ po2 mo9365c(C4571q4 q4Var) {
        Objects.requireNonNull(q4Var);
        this.f7974d = q4Var;
        return this;
    }

    /* renamed from: i */
    public final /* synthetic */ po2 mo9366i(String str) {
        Objects.requireNonNull(str);
        this.f7973c = str;
        return this;
    }
}
