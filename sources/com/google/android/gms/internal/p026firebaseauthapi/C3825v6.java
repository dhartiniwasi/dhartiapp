package com.google.android.gms.internal.p026firebaseauthapi;

import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.v6 */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C3825v6 {

    /* renamed from: a */
    private final Object f22801a;

    /* renamed from: b */
    private final byte[] f22802b;

    /* renamed from: c */
    private final C3674qk f22803c;

    /* renamed from: d */
    private final int f22804d;

    /* renamed from: e */
    private final C3132a6 f22805e;

    /* renamed from: f */
    private final int f22806f;

    C3825v6(Object obj, byte[] bArr, int i, C3674qk qkVar, int i2, C3132a6 a6Var) {
        this.f22801a = obj;
        this.f22802b = Arrays.copyOf(bArr, bArr.length);
        this.f22806f = i;
        this.f22803c = qkVar;
        this.f22804d = i2;
        this.f22805e = a6Var;
    }

    /* renamed from: a */
    public final int mo16933a() {
        return this.f22804d;
    }

    /* renamed from: b */
    public final C3132a6 mo16934b() {
        return this.f22805e;
    }

    /* renamed from: c */
    public final C3726s6 mo16935c() {
        return this.f22805e.mo15716a();
    }

    /* renamed from: d */
    public final C3674qk mo16936d() {
        return this.f22803c;
    }

    /* renamed from: e */
    public final Object mo16937e() {
        return this.f22801a;
    }

    /* renamed from: f */
    public final byte[] mo16938f() {
        byte[] bArr = this.f22802b;
        if (bArr == null) {
            return null;
        }
        return Arrays.copyOf(bArr, bArr.length);
    }

    /* renamed from: g */
    public final int mo16939g() {
        return this.f22806f;
    }
}
