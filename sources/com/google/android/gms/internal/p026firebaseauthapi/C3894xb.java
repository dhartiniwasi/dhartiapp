package com.google.android.gms.internal.p026firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.xb */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C3894xb {

    /* renamed from: b */
    private static final C3894xb f22915b = new C3894xb();

    /* renamed from: a */
    private final AtomicReference f22916a = new AtomicReference(new C3732sc(new C3534mc(), (C3699rc) null));

    /* renamed from: b */
    public static C3894xb m27370b() {
        return f22915b;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:3|4|5) */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0012, code lost:
        return new com.google.android.gms.internal.p026firebaseauthapi.C3665qb(r2, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0013, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001b, code lost:
        throw new com.google.android.gms.internal.p026firebaseauthapi.C3765tc("Creating a LegacyProtoKey failed", r2);
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x000d */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.p026firebaseauthapi.C3132a6 mo17038a(com.google.android.gms.internal.p026firebaseauthapi.C3402ic r2, com.google.android.gms.internal.p026firebaseauthapi.C3331g7 r3) {
        /*
            r1 = this;
            java.util.concurrent.atomic.AtomicReference r0 = r1.f22916a     // Catch:{ GeneralSecurityException -> 0x000d }
            java.lang.Object r0 = r0.get()     // Catch:{ GeneralSecurityException -> 0x000d }
            com.google.android.gms.internal.firebase-auth-api.sc r0 = (com.google.android.gms.internal.p026firebaseauthapi.C3732sc) r0     // Catch:{ GeneralSecurityException -> 0x000d }
            com.google.android.gms.internal.firebase-auth-api.a6 r2 = r0.mo16752a(r2, r3)     // Catch:{ GeneralSecurityException -> 0x000d }
            return r2
        L_0x000d:
            com.google.android.gms.internal.firebase-auth-api.qb r0 = new com.google.android.gms.internal.firebase-auth-api.qb     // Catch:{ GeneralSecurityException -> 0x0013 }
            r0.<init>(r2, r3)     // Catch:{ GeneralSecurityException -> 0x0013 }
            return r0
        L_0x0013:
            r2 = move-exception
            com.google.android.gms.internal.firebase-auth-api.tc r3 = new com.google.android.gms.internal.firebase-auth-api.tc
            java.lang.String r0 = "Creating a LegacyProtoKey failed"
            r3.<init>(r0, r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p026firebaseauthapi.C3894xb.mo17038a(com.google.android.gms.internal.firebase-auth-api.ic, com.google.android.gms.internal.firebase-auth-api.g7):com.google.android.gms.internal.firebase-auth-api.a6");
    }

    /* renamed from: c */
    public final synchronized void mo17039c(C3269eb ebVar) throws GeneralSecurityException {
        C3534mc mcVar = new C3534mc((C3732sc) this.f22916a.get());
        mcVar.mo16389a(ebVar);
        this.f22916a.set(new C3732sc(mcVar, (C3699rc) null));
    }

    /* renamed from: d */
    public final synchronized void mo17040d(C3401ib ibVar) throws GeneralSecurityException {
        C3534mc mcVar = new C3534mc((C3732sc) this.f22916a.get());
        mcVar.mo16390b(ibVar);
        this.f22916a.set(new C3732sc(mcVar, (C3699rc) null));
    }

    /* renamed from: e */
    public final synchronized void mo17041e(C3171bc bcVar) throws GeneralSecurityException {
        C3534mc mcVar = new C3534mc((C3732sc) this.f22916a.get());
        mcVar.mo16391c(bcVar);
        this.f22916a.set(new C3732sc(mcVar, (C3699rc) null));
    }

    /* renamed from: f */
    public final synchronized void mo17042f(C3303fc fcVar) throws GeneralSecurityException {
        C3534mc mcVar = new C3534mc((C3732sc) this.f22916a.get());
        mcVar.mo16392d(fcVar);
        this.f22916a.set(new C3732sc(mcVar, (C3699rc) null));
    }
}
