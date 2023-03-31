package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.fa */
/* compiled from: com.google.android.gms:play-services-measurement-base@@21.2.0 */
final class C6962fa implements C7284za {

    /* renamed from: b */
    private static final C7060la f31687b = new C6928da();

    /* renamed from: a */
    private final C7060la f31688a;

    public C6962fa() {
        C7060la laVar;
        C7060la[] laVarArr = new C7060la[2];
        laVarArr[0] = C6927d9.m39932c();
        try {
            laVar = (C7060la) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke((Object) null, new Object[0]);
        } catch (Exception unused) {
            laVar = f31687b;
        }
        laVarArr[1] = laVar;
        C6945ea eaVar = new C6945ea(laVarArr);
        C7107o9.m40533f(eaVar, "messageInfoFactory");
        this.f31688a = eaVar;
    }

    /* renamed from: a */
    private static boolean m40024a(C7044ka kaVar) {
        return kaVar.mo23610e() == 1;
    }

    /* renamed from: c */
    public final C7268ya mo23418c(Class cls) {
        Class<C6995h9> cls2 = C6995h9.class;
        C6878ab.m39510g(cls);
        C7044ka a = this.f31688a.mo23333a(cls);
        if (a.mo23609d()) {
            if (cls2.isAssignableFrom(cls)) {
                return C7156ra.m40803j(C6878ab.m39504b(), C7234w8.m41063b(), a.zza());
            }
            return C7156ra.m40803j(C6878ab.m39505b0(), C7234w8.m41062a(), a.zza());
        } else if (cls2.isAssignableFrom(cls)) {
            if (m40024a(a)) {
                return C7140qa.m40678L(cls, a, C7188ta.m40956b(), C6894ba.m39665d(), C6878ab.m39504b(), C7234w8.m41063b(), C7028ja.m40262b());
            }
            return C7140qa.m40678L(cls, a, C7188ta.m40956b(), C6894ba.m39665d(), C6878ab.m39504b(), (C7202u8) null, C7028ja.m40262b());
        } else if (m40024a(a)) {
            return C7140qa.m40678L(cls, a, C7188ta.m40955a(), C6894ba.m39664c(), C6878ab.m39505b0(), C7234w8.m41062a(), C7028ja.m40261a());
        } else {
            return C7140qa.m40678L(cls, a, C7188ta.m40955a(), C6894ba.m39664c(), C6878ab.m39502a(), (C7202u8) null, C7028ja.m40261a());
        }
    }
}
