package p248h9;

import p212d9.C9918j;

/* renamed from: h9.f */
/* compiled from: DefaultGridSampler */
public final class C10480f extends C10483i {
    /* renamed from: c */
    public C10476b mo33602c(C10476b bVar, int i, int i2, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, float f11, float f12, float f13, float f14, float f15, float f16) throws C9918j {
        C10476b bVar2 = bVar;
        int i3 = i;
        int i4 = i2;
        return mo33603d(bVar, i, i2, C10485k.m52852b(f, f2, f3, f4, f5, f6, f7, f8, f9, f10, f11, f12, f13, f14, f15, f16));
    }

    /* renamed from: d */
    public C10476b mo33603d(C10476b bVar, int i, int i2, C10485k kVar) throws C9918j {
        if (i <= 0 || i2 <= 0) {
            throw C9918j.m50862a();
        }
        C10476b bVar2 = new C10476b(i, i2);
        int i3 = i * 2;
        float[] fArr = new float[i3];
        for (int i4 = 0; i4 < i2; i4++) {
            float f = ((float) i4) + 0.5f;
            for (int i5 = 0; i5 < i3; i5 += 2) {
                fArr[i5] = ((float) (i5 / 2)) + 0.5f;
                fArr[i5 + 1] = f;
            }
            kVar.mo33608f(fArr);
            C10483i.m52842a(bVar, fArr);
            int i6 = 0;
            while (i6 < i3) {
                try {
                    if (bVar.mo33570d((int) fArr[i6], (int) fArr[i6 + 1])) {
                        bVar2.mo33580l(i6 / 2, i4);
                    }
                    i6 += 2;
                } catch (ArrayIndexOutOfBoundsException unused) {
                    throw C9918j.m50862a();
                }
            }
        }
        return bVar2;
    }
}
