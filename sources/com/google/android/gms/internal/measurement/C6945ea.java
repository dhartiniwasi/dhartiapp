package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.ea */
/* compiled from: com.google.android.gms:play-services-measurement-base@@21.2.0 */
final class C6945ea implements C7060la {

    /* renamed from: a */
    private final C7060la[] f31670a;

    C6945ea(C7060la... laVarArr) {
        this.f31670a = laVarArr;
    }

    /* renamed from: a */
    public final C7044ka mo23333a(Class cls) {
        C7060la[] laVarArr = this.f31670a;
        for (int i = 0; i < 2; i++) {
            C7060la laVar = laVarArr[i];
            if (laVar.mo23334b(cls)) {
                return laVar.mo23333a(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }

    /* renamed from: b */
    public final boolean mo23334b(Class cls) {
        C7060la[] laVarArr = this.f31670a;
        for (int i = 0; i < 2; i++) {
            if (laVarArr[i].mo23334b(cls)) {
                return true;
            }
        }
        return false;
    }
}
