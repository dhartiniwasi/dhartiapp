package com.google.android.gms.measurement.internal;

import android.util.Pair;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import p032d4.C4076a;
import p402y5.C13018a;
import p402y5.C13020b;

/* renamed from: com.google.android.gms.measurement.internal.x7 */
/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
public final class C7552x7 extends C7478q8 {

    /* renamed from: d */
    private final Map f33185d = new HashMap();

    /* renamed from: e */
    public final C7462p3 f33186e;

    /* renamed from: f */
    public final C7462p3 f33187f;

    /* renamed from: g */
    public final C7462p3 f33188g;

    /* renamed from: h */
    public final C7462p3 f33189h;

    /* renamed from: i */
    public final C7462p3 f33190i;

    C7552x7(C7303a9 a9Var) {
        super(a9Var);
        C7495s3 F = this.f32389a.mo24416F();
        F.getClass();
        this.f33186e = new C7462p3(F, "last_delete_stale", 0);
        C7495s3 F2 = this.f32389a.mo24416F();
        F2.getClass();
        this.f33187f = new C7462p3(F2, "backoff", 0);
        C7495s3 F3 = this.f32389a.mo24416F();
        F3.getClass();
        this.f33188g = new C7462p3(F3, "last_upload", 0);
        C7495s3 F4 = this.f32389a.mo24416F();
        F4.getClass();
        this.f33189h = new C7462p3(F4, "last_upload_attempt", 0);
        C7495s3 F5 = this.f32389a.mo24416F();
        F5.getClass();
        this.f33190i = new C7462p3(F5, "midnight_offset", 0);
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public final boolean mo24151j() {
        return false;
    }

    /* access modifiers changed from: package-private */
    @Deprecated
    /* renamed from: k */
    public final Pair mo24757k(String str) {
        C7542w7 w7Var;
        mo24189f();
        long b = this.f32389a.mo24116a().mo18371b();
        C7542w7 w7Var2 = (C7542w7) this.f33185d.get(str);
        if (w7Var2 != null && b < w7Var2.f33166c) {
            return new Pair(w7Var2.f33164a, Boolean.valueOf(w7Var2.f33165b));
        }
        C4076a.m28011d(true);
        long q = b + this.f32389a.mo24443z().mo24293q(str, C7516u2.f33042c);
        try {
            C4076a.C4077a a = C4076a.m28009a(this.f32389a.mo24121d());
            if (a == null) {
                return new Pair("", Boolean.FALSE);
            }
            String a2 = a.mo17308a();
            if (a2 != null) {
                w7Var = new C7542w7(a2, a.mo17309b(), q);
            } else {
                w7Var = new C7542w7("", a.mo17309b(), q);
            }
            this.f33185d.put(str, w7Var);
            C4076a.m28011d(false);
            return new Pair(w7Var.f33164a, Boolean.valueOf(w7Var.f33165b));
        } catch (Exception e) {
            this.f32389a.mo24135l().mo24255p().mo24209b("Unable to get advertising id", e);
            w7Var = new C7542w7("", false, q);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public final Pair mo24758m(String str, C13020b bVar) {
        if (bVar.mo38074i(C13018a.AD_STORAGE)) {
            return mo24757k(str);
        }
        return new Pair("", Boolean.FALSE);
    }

    /* access modifiers changed from: package-private */
    @Deprecated
    /* renamed from: n */
    public final String mo24759n(String str, boolean z) {
        mo24189f();
        String str2 = z ? (String) mo24757k(str).first : "00000000-0000-0000-0000-000000000000";
        MessageDigest t = C7391i9.m41603t();
        if (t == null) {
            return null;
        }
        return String.format(Locale.US, "%032X", new Object[]{new BigInteger(1, t.digest(str2.getBytes()))});
    }
}
