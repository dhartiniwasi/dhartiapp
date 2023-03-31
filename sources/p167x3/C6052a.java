package p167x3;

import java.util.ArrayList;
import java.util.List;
import p161w3.C5918a0;
import p161w3.C5929e;
import p161w3.C5970w;
import p177z1.C6249m2;

/* renamed from: x3.a */
/* compiled from: AvcConfig */
public final class C6052a {

    /* renamed from: a */
    public final List<byte[]> f29325a;

    /* renamed from: b */
    public final int f29326b;

    /* renamed from: c */
    public final int f29327c;

    /* renamed from: d */
    public final int f29328d;

    /* renamed from: e */
    public final float f29329e;

    /* renamed from: f */
    public final String f29330f;

    private C6052a(List<byte[]> list, int i, int i2, int i3, float f, String str) {
        this.f29325a = list;
        this.f29326b = i;
        this.f29327c = i2;
        this.f29328d = i3;
        this.f29329e = f;
        this.f29330f = str;
    }

    /* renamed from: a */
    private static byte[] m35495a(C5918a0 a0Var) {
        int I = a0Var.mo20540I();
        int e = a0Var.mo20552e();
        a0Var.mo20547P(I);
        return C5929e.m34967d(a0Var.mo20551d(), e, I);
    }

    /* renamed from: b */
    public static C6052a m35496b(C5918a0 a0Var) throws C6249m2 {
        String str;
        float f;
        int i;
        try {
            a0Var.mo20547P(4);
            int C = (a0Var.mo20534C() & 3) + 1;
            if (C != 3) {
                ArrayList arrayList = new ArrayList();
                int C2 = a0Var.mo20534C() & 31;
                for (int i2 = 0; i2 < C2; i2++) {
                    arrayList.add(m35495a(a0Var));
                }
                int C3 = a0Var.mo20534C();
                for (int i3 = 0; i3 < C3; i3++) {
                    arrayList.add(m35495a(a0Var));
                }
                int i4 = -1;
                if (C2 > 0) {
                    C5970w.C5973c l = C5970w.m35269l((byte[]) arrayList.get(0), C, ((byte[]) arrayList.get(0)).length);
                    int i5 = l.f29172f;
                    int i6 = l.f29173g;
                    float f2 = l.f29174h;
                    str = C5929e.m34964a(l.f29167a, l.f29168b, l.f29169c);
                    i4 = i5;
                    i = i6;
                    f = f2;
                } else {
                    str = null;
                    i = -1;
                    f = 1.0f;
                }
                return new C6052a(arrayList, C, i4, i, f, str);
            }
            throw new IllegalStateException();
        } catch (ArrayIndexOutOfBoundsException e) {
            throw C6249m2.m36661a("Error parsing AVC config", e);
        }
    }
}
