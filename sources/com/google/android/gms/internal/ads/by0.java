package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Objects;
import p060h4.C4571q4;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class by0 implements lq2 {

    /* renamed from: a */
    private final dw0 f7520a;

    /* renamed from: b */
    private Context f7521b;

    /* renamed from: c */
    private String f7522c;

    /* renamed from: d */
    private C4571q4 f7523d;

    /* synthetic */ by0(dw0 dw0, ay0 ay0) {
        this.f7520a = dw0;
    }

    /* renamed from: a */
    public final /* synthetic */ lq2 mo8982a(Context context) {
        Objects.requireNonNull(context);
        this.f7521b = context;
        return this;
    }

    /* renamed from: b */
    public final mq2 mo8983b() {
        j44.m14700c(this.f7521b, Context.class);
        j44.m14700c(this.f7522c, String.class);
        j44.m14700c(this.f7523d, C4571q4.class);
        return new dy0(this.f7520a, this.f7521b, this.f7522c, this.f7523d, (cy0) null);
    }

    /* renamed from: c */
    public final /* synthetic */ lq2 mo8984c(C4571q4 q4Var) {
        Objects.requireNonNull(q4Var);
        this.f7523d = q4Var;
        return this;
    }

    /* renamed from: i */
    public final /* synthetic */ lq2 mo8985i(String str) {
        Objects.requireNonNull(str);
        this.f7522c = str;
        return this;
    }
}
