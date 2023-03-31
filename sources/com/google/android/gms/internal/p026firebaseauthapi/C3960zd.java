package com.google.android.gms.internal.p026firebaseauthapi;

import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zd */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C3960zd extends C3371he {

    /* renamed from: a */
    private final int f22984a;

    /* renamed from: b */
    private final int f22985b;

    /* renamed from: c */
    private final C3896xd f22986c;

    /* renamed from: d */
    private final C3864wd f22987d;

    /* synthetic */ C3960zd(int i, int i2, C3896xd xdVar, C3864wd wdVar, C3928yd ydVar) {
        this.f22984a = i;
        this.f22985b = i2;
        this.f22986c = xdVar;
        this.f22987d = wdVar;
    }

    /* renamed from: a */
    public final int mo17102a() {
        return this.f22984a;
    }

    /* renamed from: b */
    public final int mo17103b() {
        C3896xd xdVar = this.f22986c;
        if (xdVar == C3896xd.f22920e) {
            return this.f22985b;
        }
        if (xdVar == C3896xd.f22917b || xdVar == C3896xd.f22918c || xdVar == C3896xd.f22919d) {
            return this.f22985b + 5;
        }
        throw new IllegalStateException("Unknown variant");
    }

    /* renamed from: c */
    public final C3896xd mo17104c() {
        return this.f22986c;
    }

    /* renamed from: d */
    public final boolean mo17105d() {
        return this.f22986c != C3896xd.f22920e;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C3960zd)) {
            return false;
        }
        C3960zd zdVar = (C3960zd) obj;
        if (zdVar.f22984a == this.f22984a && zdVar.mo17103b() == mo17103b() && zdVar.f22986c == this.f22986c && zdVar.f22987d == this.f22987d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f22985b), this.f22986c, this.f22987d});
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f22986c);
        String valueOf2 = String.valueOf(this.f22987d);
        int i = this.f22985b;
        int i2 = this.f22984a;
        return "HMAC Parameters (variant: " + valueOf + ", hashType: " + valueOf2 + ", " + i + "-byte tags, and " + i2 + "-byte key)";
    }
}
