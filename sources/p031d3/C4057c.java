package p031d3;

import p015b3.C1743p0;
import p031d3.C4061g;
import p037e2.C4200e0;
import p037e2.C4214k;
import p161w3.C5961r;

/* renamed from: d3.c */
/* compiled from: BaseMediaChunkOutput */
public final class C4057c implements C4061g.C4063b {

    /* renamed from: a */
    private final int[] f23142a;

    /* renamed from: b */
    private final C1743p0[] f23143b;

    public C4057c(int[] iArr, C1743p0[] p0VarArr) {
        this.f23142a = iArr;
        this.f23143b = p0VarArr;
    }

    /* renamed from: a */
    public int[] mo17269a() {
        int[] iArr = new int[this.f23143b.length];
        int i = 0;
        while (true) {
            C1743p0[] p0VarArr = this.f23143b;
            if (i >= p0VarArr.length) {
                return iArr;
            }
            iArr[i] = p0VarArr[i].mo6825G();
            i++;
        }
    }

    /* renamed from: b */
    public void mo17270b(long j) {
        for (C1743p0 a0 : this.f23143b) {
            a0.mo6839a0(j);
        }
    }

    /* renamed from: f */
    public C4200e0 mo17271f(int i, int i2) {
        int i3 = 0;
        while (true) {
            int[] iArr = this.f23142a;
            if (i3 >= iArr.length) {
                C5961r.m35209c("BaseMediaChunkOutput", "Unmatched track of type: " + i2);
                return new C4214k();
            } else if (i2 == iArr[i3]) {
                return this.f23143b[i3];
            } else {
                i3++;
            }
        }
    }
}
