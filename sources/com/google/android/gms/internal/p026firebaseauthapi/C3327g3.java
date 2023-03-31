package com.google.android.gms.internal.p026firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.g3 */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
final class C3327g3 implements C3163b4 {

    /* renamed from: b */
    private static final C3525m3 f22062b = new C3261e3();

    /* renamed from: a */
    private final C3525m3 f22063a;

    public C3327g3() {
        C3525m3 m3Var;
        C3525m3[] m3VarArr = new C3525m3[2];
        m3VarArr[0] = C3293f2.m25544c();
        try {
            m3Var = (C3525m3) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke((Object) null, new Object[0]);
        } catch (Exception unused) {
            m3Var = f22062b;
        }
        m3VarArr[1] = m3Var;
        C3294f3 f3Var = new C3294f3(m3VarArr);
        C3623p2.m26442f(f3Var, "messageInfoFactory");
        this.f22063a = f3Var;
    }

    /* renamed from: a */
    private static boolean m25639a(C3492l3 l3Var) {
        return l3Var.mo16323e() == 1;
    }

    /* renamed from: c */
    public final C3130a4 mo15770c(Class cls) {
        Class<C3425j2> cls2 = C3425j2.class;
        C3196c4.m25268g(cls);
        C3492l3 a = this.f22063a.mo15979a(cls);
        if (a.mo16322d()) {
            if (cls2.isAssignableFrom(cls)) {
                return C3723s3.m26856k(C3196c4.m25262b(), C3948z1.m27483b(), a.zza());
            }
            return C3723s3.m26856k(C3196c4.m25263b0(), C3948z1.m27482a(), a.zza());
        } else if (cls2.isAssignableFrom(cls)) {
            if (m25639a(a)) {
                return C3690r3.m26720Q(cls, a, C3789u3.m27084b(), C3162b3.m25062e(), C3196c4.m25262b(), C3948z1.m27483b(), C3459k3.m25981b());
            }
            return C3690r3.m26720Q(cls, a, C3789u3.m27084b(), C3162b3.m25062e(), C3196c4.m25262b(), (C3884x1) null, C3459k3.m25981b());
        } else if (m25639a(a)) {
            return C3690r3.m26720Q(cls, a, C3789u3.m27083a(), C3162b3.m25061d(), C3196c4.m25263b0(), C3948z1.m27482a(), C3459k3.m25980a());
        } else {
            return C3690r3.m26720Q(cls, a, C3789u3.m27083a(), C3162b3.m25061d(), C3196c4.m25260a(), (C3884x1) null, C3459k3.m25980a());
        }
    }
}
