package com.google.android.gms.internal.p026firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.mb */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public abstract class C3533mb {

    /* renamed from: a */
    private final Class f22354a;

    /* renamed from: b */
    private final Map f22355b;

    /* renamed from: c */
    private final Class f22356c;

    @SafeVarargs
    protected C3533mb(Class cls, C3336gc... gcVarArr) {
        this.f22354a = cls;
        HashMap hashMap = new HashMap();
        int i = 0;
        while (i <= 0) {
            C3336gc gcVar = gcVarArr[i];
            if (!hashMap.containsKey(gcVar.mo16069b())) {
                hashMap.put(gcVar.mo16069b(), gcVar);
                i++;
            } else {
                throw new IllegalArgumentException("KeyTypeManager constructed with duplicate factories for primitive ".concat(String.valueOf(gcVar.mo16069b().getCanonicalName())));
            }
        }
        this.f22356c = gcVarArr[0].mo16069b();
        this.f22355b = Collections.unmodifiableMap(hashMap);
    }

    /* renamed from: a */
    public C3500lb mo15786a() {
        throw new UnsupportedOperationException("Creating keys is not supported.");
    }

    /* renamed from: b */
    public abstract C3409ij mo15787b();

    /* renamed from: c */
    public abstract C3591o3 mo15788c(C3325g1 g1Var) throws C3689r2;

    /* renamed from: d */
    public abstract String mo15789d();

    /* renamed from: e */
    public abstract void mo15790e(C3591o3 o3Var) throws GeneralSecurityException;

    /* renamed from: f */
    public int mo16384f() {
        return 1;
    }

    /* renamed from: g */
    public final Class mo16385g() {
        return this.f22356c;
    }

    /* renamed from: h */
    public final Class mo16386h() {
        return this.f22354a;
    }

    /* renamed from: i */
    public final Object mo16387i(C3591o3 o3Var, Class cls) throws GeneralSecurityException {
        C3336gc gcVar = (C3336gc) this.f22355b.get(cls);
        if (gcVar != null) {
            return gcVar.mo15900a(o3Var);
        }
        String canonicalName = cls.getCanonicalName();
        throw new IllegalArgumentException("Requested primitive class " + canonicalName + " not supported.");
    }

    /* renamed from: j */
    public final Set mo16388j() {
        return this.f22355b.keySet();
    }
}
