package com.google.protobuf;

/* renamed from: com.google.protobuf.n0 */
/* compiled from: ManifestSchemaFactory */
final class C8199n0 implements C8206o1 {

    /* renamed from: b */
    private static final C8238u0 f35028b = new C8200a();

    /* renamed from: a */
    private final C8238u0 f35029a;

    /* renamed from: com.google.protobuf.n0$a */
    /* compiled from: ManifestSchemaFactory */
    static class C8200a implements C8238u0 {
        C8200a() {
        }

        /* renamed from: a */
        public C8233t0 mo27195a(Class<?> cls) {
            throw new IllegalStateException("This should never be called.");
        }

        /* renamed from: b */
        public boolean mo27196b(Class<?> cls) {
            return false;
        }
    }

    /* renamed from: com.google.protobuf.n0$b */
    /* compiled from: ManifestSchemaFactory */
    private static class C8201b implements C8238u0 {

        /* renamed from: a */
        private C8238u0[] f35030a;

        C8201b(C8238u0... u0VarArr) {
            this.f35030a = u0VarArr;
        }

        /* renamed from: a */
        public C8233t0 mo27195a(Class<?> cls) {
            for (C8238u0 u0Var : this.f35030a) {
                if (u0Var.mo27196b(cls)) {
                    return u0Var.mo27195a(cls);
                }
            }
            throw new UnsupportedOperationException("No factory is available for message type: " + cls.getName());
        }

        /* renamed from: b */
        public boolean mo27196b(Class<?> cls) {
            for (C8238u0 b : this.f35030a) {
                if (b.mo27196b(cls)) {
                    return true;
                }
            }
            return false;
        }
    }

    public C8199n0() {
        this(m45450b());
    }

    /* renamed from: b */
    private static C8238u0 m45450b() {
        return new C8201b(C8254y.m45788c(), m45451c());
    }

    /* renamed from: c */
    private static C8238u0 m45451c() {
        try {
            return (C8238u0) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke((Object) null, new Object[0]);
        } catch (Exception unused) {
            return f35028b;
        }
    }

    /* renamed from: d */
    private static boolean m45452d(C8233t0 t0Var) {
        return t0Var.mo27087c() == C8152h1.PROTO2;
    }

    /* renamed from: e */
    private static <T> C8202n1<T> m45453e(Class<T> cls, C8233t0 t0Var) {
        if (C8260z.class.isAssignableFrom(cls)) {
            if (m45452d(t0Var)) {
                return C8255y0.m45817V(cls, t0Var, C8115c1.m44603b(), C8186l0.m45290b(), C8209p1.m45501M(), C8232t.m45630b(), C8228s0.m45622b());
            }
            return C8255y0.m45817V(cls, t0Var, C8115c1.m44603b(), C8186l0.m45290b(), C8209p1.m45501M(), (C8223r<?>) null, C8228s0.m45622b());
        } else if (m45452d(t0Var)) {
            return C8255y0.m45817V(cls, t0Var, C8115c1.m44602a(), C8186l0.m45289a(), C8209p1.m45496H(), C8232t.m45629a(), C8228s0.m45621a());
        } else {
            return C8255y0.m45817V(cls, t0Var, C8115c1.m44602a(), C8186l0.m45289a(), C8209p1.m45497I(), (C8223r<?>) null, C8228s0.m45621a());
        }
    }

    /* renamed from: a */
    public <T> C8202n1<T> mo27194a(Class<T> cls) {
        C8209p1.m45498J(cls);
        C8233t0 a = this.f35029a.mo27195a(cls);
        if (!a.mo27085a()) {
            return m45453e(cls, a);
        }
        if (C8260z.class.isAssignableFrom(cls)) {
            return C8267z0.m45965m(C8209p1.m45501M(), C8232t.m45630b(), a.mo27086b());
        }
        return C8267z0.m45965m(C8209p1.m45496H(), C8232t.m45629a(), a.mo27086b());
    }

    private C8199n0(C8238u0 u0Var) {
        this.f35029a = (C8238u0) C8119d0.m44650b(u0Var, "messageInfoFactory");
    }
}
