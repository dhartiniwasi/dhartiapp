package p212d9;

import p258i9.C10566a;

/* renamed from: d9.p */
/* compiled from: ResultPoint */
public class C9924p {

    /* renamed from: a */
    private final float f39831a;

    /* renamed from: b */
    private final float f39832b;

    public C9924p(float f, float f2) {
        this.f39831a = f;
        this.f39832b = f2;
    }

    /* renamed from: a */
    private static float m50875a(C9924p pVar, C9924p pVar2, C9924p pVar3) {
        float f = pVar2.f39831a;
        float f2 = pVar2.f39832b;
        return ((pVar3.f39831a - f) * (pVar.f39832b - f2)) - ((pVar3.f39832b - f2) * (pVar.f39831a - f));
    }

    /* renamed from: b */
    public static float m50876b(C9924p pVar, C9924p pVar2) {
        return C10566a.m53110a(pVar.f39831a, pVar.f39832b, pVar2.f39831a, pVar2.f39832b);
    }

    /* renamed from: e */
    public static void m50877e(C9924p[] pVarArr) {
        C9924p pVar;
        C9924p pVar2;
        C9924p pVar3;
        float b = m50876b(pVarArr[0], pVarArr[1]);
        float b2 = m50876b(pVarArr[1], pVarArr[2]);
        float b3 = m50876b(pVarArr[0], pVarArr[2]);
        if (b2 >= b && b2 >= b3) {
            pVar3 = pVarArr[0];
            pVar2 = pVarArr[1];
            pVar = pVarArr[2];
        } else if (b3 < b2 || b3 < b) {
            pVar3 = pVarArr[2];
            pVar2 = pVarArr[0];
            pVar = pVarArr[1];
        } else {
            pVar3 = pVarArr[1];
            pVar2 = pVarArr[0];
            pVar = pVarArr[2];
        }
        if (m50875a(pVar2, pVar3, pVar) < 0.0f) {
            C9924p pVar4 = pVar;
            pVar = pVar2;
            pVar2 = pVar4;
        }
        pVarArr[0] = pVar2;
        pVarArr[1] = pVar3;
        pVarArr[2] = pVar;
    }

    /* renamed from: c */
    public final float mo32480c() {
        return this.f39831a;
    }

    /* renamed from: d */
    public final float mo32481d() {
        return this.f39832b;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C9924p) {
            C9924p pVar = (C9924p) obj;
            if (this.f39831a == pVar.f39831a && this.f39832b == pVar.f39832b) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return (Float.floatToIntBits(this.f39831a) * 31) + Float.floatToIntBits(this.f39832b);
    }

    public final String toString() {
        return "(" + this.f39831a + ',' + this.f39832b + ')';
    }
}
