package p167x3;

import java.util.Collections;
import java.util.List;
import p161w3.C5918a0;
import p161w3.C5929e;
import p161w3.C5970w;
import p177z1.C6249m2;

/* renamed from: x3.f */
/* compiled from: HevcConfig */
public final class C6057f {

    /* renamed from: a */
    public final List<byte[]> f29354a;

    /* renamed from: b */
    public final int f29355b;

    /* renamed from: c */
    public final int f29356c;

    /* renamed from: d */
    public final int f29357d;

    /* renamed from: e */
    public final float f29358e;

    /* renamed from: f */
    public final String f29359f;

    private C6057f(List<byte[]> list, int i, int i2, int i3, float f, String str) {
        this.f29354a = list;
        this.f29355b = i;
        this.f29356c = i2;
        this.f29357d = i3;
        this.f29358e = f;
        this.f29359f = str;
    }

    /* renamed from: a */
    public static C6057f m35517a(C5918a0 a0Var) throws C6249m2 {
        int i;
        int i2;
        C5918a0 a0Var2 = a0Var;
        try {
            a0Var2.mo20547P(21);
            int C = a0Var.mo20534C() & 3;
            int C2 = a0Var.mo20534C();
            int e = a0Var.mo20552e();
            int i3 = 0;
            int i4 = 0;
            for (int i5 = 0; i5 < C2; i5++) {
                a0Var2.mo20547P(1);
                int I = a0Var.mo20540I();
                for (int i6 = 0; i6 < I; i6++) {
                    int I2 = a0Var.mo20540I();
                    i4 += I2 + 4;
                    a0Var2.mo20547P(I2);
                }
            }
            a0Var2.mo20546O(e);
            byte[] bArr = new byte[i4];
            String str = null;
            int i7 = 0;
            int i8 = 0;
            int i9 = -1;
            int i10 = -1;
            float f = 1.0f;
            while (i7 < C2) {
                int C3 = a0Var.mo20534C() & 127;
                int I3 = a0Var.mo20540I();
                int i11 = 0;
                while (i11 < I3) {
                    int I4 = a0Var.mo20540I();
                    byte[] bArr2 = C5970w.f29150a;
                    int i12 = C2;
                    System.arraycopy(bArr2, i3, bArr, i8, bArr2.length);
                    int length = i8 + bArr2.length;
                    System.arraycopy(a0Var.mo20551d(), a0Var.mo20552e(), bArr, length, I4);
                    if (C3 == 33 && i11 == 0) {
                        C5970w.C5971a h = C5970w.m35265h(bArr, length, length + I4);
                        int i13 = h.f29161h;
                        i10 = h.f29162i;
                        f = h.f29163j;
                        i2 = C3;
                        i = I3;
                        i9 = i13;
                        str = C5929e.m34966c(h.f29154a, h.f29155b, h.f29156c, h.f29157d, h.f29158e, h.f29159f);
                    } else {
                        i2 = C3;
                        i = I3;
                    }
                    i8 = length + I4;
                    a0Var2.mo20547P(I4);
                    i11++;
                    C2 = i12;
                    C3 = i2;
                    I3 = i;
                    i3 = 0;
                }
                int i14 = C2;
                i7++;
                i3 = 0;
            }
            return new C6057f(i4 == 0 ? Collections.emptyList() : Collections.singletonList(bArr), C + 1, i9, i10, f, str);
        } catch (ArrayIndexOutOfBoundsException e2) {
            throw C6249m2.m36661a("Error parsing HEVC config", e2);
        }
    }
}
