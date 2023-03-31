package p051g2;

import p161w3.C5918a0;

/* renamed from: g2.c */
/* compiled from: AviMainHeaderChunk */
final class C4354c implements C4349a {

    /* renamed from: a */
    public final int f24282a;

    /* renamed from: b */
    public final int f24283b;

    /* renamed from: c */
    public final int f24284c;

    /* renamed from: d */
    public final int f24285d;

    private C4354c(int i, int i2, int i3, int i4) {
        this.f24282a = i;
        this.f24283b = i2;
        this.f24284c = i3;
        this.f24285d = i4;
    }

    /* renamed from: b */
    public static C4354c m28979b(C5918a0 a0Var) {
        int p = a0Var.mo20563p();
        a0Var.mo20547P(8);
        int p2 = a0Var.mo20563p();
        int p3 = a0Var.mo20563p();
        a0Var.mo20547P(4);
        int p4 = a0Var.mo20563p();
        a0Var.mo20547P(12);
        return new C4354c(p, p2, p3, p4);
    }

    /* renamed from: a */
    public boolean mo17781a() {
        return (this.f24283b & 16) == 16;
    }

    public int getType() {
        return 1751742049;
    }
}
