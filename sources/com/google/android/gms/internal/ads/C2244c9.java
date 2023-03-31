package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.c9 */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class C2244c9 {

    /* renamed from: a */
    private int f7646a = 2500;

    /* renamed from: b */
    private int f7647b;

    /* renamed from: a */
    public final int mo9075a() {
        return this.f7647b;
    }

    /* renamed from: b */
    public final int mo9076b() {
        return this.f7646a;
    }

    /* renamed from: c */
    public final void mo9077c(C3061y9 y9Var) throws C3061y9 {
        int i = this.f7647b + 1;
        this.f7647b = i;
        int i2 = this.f7646a;
        this.f7646a = i2 + ((int) ((float) i2));
        if (i > 1) {
            throw y9Var;
        }
    }
}
