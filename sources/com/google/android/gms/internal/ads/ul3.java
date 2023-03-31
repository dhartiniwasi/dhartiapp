package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public abstract class ul3 {

    /* renamed from: a */
    private final Class f18607a;

    /* renamed from: b */
    private final Map f18608b;

    /* renamed from: c */
    private final Class f18609c;

    @SafeVarargs
    protected ul3(Class cls, jm3... jm3Arr) {
        this.f18607a = cls;
        HashMap hashMap = new HashMap();
        int i = 0;
        while (i <= 0) {
            jm3 jm3 = jm3Arr[i];
            if (!hashMap.containsKey(jm3.mo11448b())) {
                hashMap.put(jm3.mo11448b(), jm3);
                i++;
            } else {
                throw new IllegalArgumentException("KeyTypeManager constructed with duplicate factories for primitive ".concat(String.valueOf(jm3.mo11448b().getCanonicalName())));
            }
        }
        this.f18609c = jm3Arr[0].mo11448b();
        this.f18608b = Collections.unmodifiableMap(hashMap);
    }

    /* renamed from: a */
    public tl3 mo9607a() {
        throw new UnsupportedOperationException("Creating keys is not supported.");
    }

    /* renamed from: b */
    public abstract cz3 mo9608b(jw3 jw3) throws ey3;

    /* renamed from: c */
    public abstract String mo9609c();

    /* renamed from: d */
    public abstract void mo9610d(cz3 cz3) throws GeneralSecurityException;

    /* renamed from: e */
    public int mo10546e() {
        return 1;
    }

    /* renamed from: f */
    public abstract int mo9611f();

    /* renamed from: g */
    public final Class mo14535g() {
        return this.f18609c;
    }

    /* renamed from: h */
    public final Class mo14536h() {
        return this.f18607a;
    }

    /* renamed from: i */
    public final Object mo14537i(cz3 cz3, Class cls) throws GeneralSecurityException {
        jm3 jm3 = (jm3) this.f18608b.get(cls);
        if (jm3 != null) {
            return jm3.mo8432a(cz3);
        }
        String canonicalName = cls.getCanonicalName();
        throw new IllegalArgumentException("Requested primitive class " + canonicalName + " not supported.");
    }

    /* renamed from: j */
    public final Set mo14538j() {
        return this.f18608b.keySet();
    }
}
