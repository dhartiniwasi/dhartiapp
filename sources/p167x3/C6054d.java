package p167x3;

import p161w3.C5918a0;

/* renamed from: x3.d */
/* compiled from: DolbyVisionConfig */
public final class C6054d {

    /* renamed from: a */
    public final int f29337a;

    /* renamed from: b */
    public final int f29338b;

    /* renamed from: c */
    public final String f29339c;

    private C6054d(int i, int i2, String str) {
        this.f29337a = i;
        this.f29338b = i2;
        this.f29339c = str;
    }

    /* renamed from: a */
    public static C6054d m35502a(C5918a0 a0Var) {
        String str;
        a0Var.mo20547P(2);
        int C = a0Var.mo20534C();
        int i = C >> 1;
        int C2 = ((a0Var.mo20534C() >> 3) & 31) | ((C & 1) << 5);
        if (i == 4 || i == 5 || i == 7) {
            str = "dvhe";
        } else if (i == 8) {
            str = "hev1";
        } else if (i != 9) {
            return null;
        } else {
            str = "avc3";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        String str2 = ".0";
        sb.append(str2);
        sb.append(i);
        if (C2 >= 10) {
            str2 = ".";
        }
        sb.append(str2);
        sb.append(C2);
        return new C6054d(i, C2, sb.toString());
    }
}
