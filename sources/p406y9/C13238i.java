package p406y9;

import p212d9.C9924p;

/* renamed from: y9.i */
/* compiled from: QRCodeDecoderMetaData */
public final class C13238i {

    /* renamed from: a */
    private final boolean f47515a;

    C13238i(boolean z) {
        this.f47515a = z;
    }

    /* renamed from: a */
    public void mo38334a(C9924p[] pVarArr) {
        if (this.f47515a && pVarArr != null && pVarArr.length >= 3) {
            C9924p pVar = pVarArr[0];
            pVarArr[0] = pVarArr[2];
            pVarArr[2] = pVar;
        }
    }
}
