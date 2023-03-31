package com.google.android.gms.internal.p026firebaseauthapi;

import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.pa */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
final class C3631pa implements C3301fa {

    /* renamed from: a */
    private final C3136aa f22502a;

    /* renamed from: b */
    private final int f22503b;

    private C3631pa(C3136aa aaVar, int i) {
        this.f22502a = aaVar;
        this.f22503b = i;
    }

    /* renamed from: b */
    static C3631pa m26470b(int i) throws GeneralSecurityException {
        int i2 = i - 1;
        if (i2 == 0) {
            return new C3631pa(new C3136aa("HmacSha256"), 1);
        }
        if (i2 != 1) {
            return new C3631pa(new C3136aa("HmacSha512"), 3);
        }
        return new C3631pa(new C3136aa("HmacSha384"), 2);
    }

    /* renamed from: a */
    public final byte[] mo16022a(byte[] bArr, C3334ga gaVar) throws GeneralSecurityException {
        byte[] h = C3675ql.m26589h(C3675ql.m26590i(this.f22503b, gaVar.zza().mo16555c()), C3675ql.m26592k(C3675ql.m26593l(this.f22503b), 1, bArr));
        byte[] c = C3411il.m25823c(bArr, gaVar.mo16067d().mo16555c());
        byte[] d = C3598oa.m26364d(mo16023d());
        C3136aa aaVar = this.f22502a;
        return aaVar.mo15726b((byte[]) null, h, "eae_prk", c, "shared_secret", d, aaVar.mo15725a());
    }

    /* renamed from: d */
    public final byte[] mo16023d() throws GeneralSecurityException {
        int i = this.f22503b - 1;
        if (i == 0) {
            return C3598oa.f22447c;
        }
        if (i != 1) {
            return C3598oa.f22449e;
        }
        return C3598oa.f22448d;
    }
}
