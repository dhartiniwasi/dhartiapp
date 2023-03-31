package p051g2;

import p161w3.C5918a0;
import p161w3.C5953m0;
import p161w3.C5961r;

/* renamed from: g2.d */
/* compiled from: AviStreamHeaderChunk */
final class C4355d implements C4349a {

    /* renamed from: a */
    public final int f24286a;

    /* renamed from: b */
    public final int f24287b;

    /* renamed from: c */
    public final int f24288c;

    /* renamed from: d */
    public final int f24289d;

    /* renamed from: e */
    public final int f24290e;

    /* renamed from: f */
    public final int f24291f;

    private C4355d(int i, int i2, int i3, int i4, int i5, int i6) {
        this.f24286a = i;
        this.f24287b = i2;
        this.f24288c = i3;
        this.f24289d = i4;
        this.f24290e = i5;
        this.f24291f = i6;
    }

    /* renamed from: c */
    public static C4355d m28981c(C5918a0 a0Var) {
        int p = a0Var.mo20563p();
        a0Var.mo20547P(12);
        int p2 = a0Var.mo20563p();
        int p3 = a0Var.mo20563p();
        int p4 = a0Var.mo20563p();
        a0Var.mo20547P(4);
        int p5 = a0Var.mo20563p();
        int p6 = a0Var.mo20563p();
        a0Var.mo20547P(8);
        return new C4355d(p, p2, p3, p4, p5, p6);
    }

    /* renamed from: a */
    public long mo17782a() {
        return C5953m0.m35095N0((long) this.f24290e, ((long) this.f24288c) * 1000000, (long) this.f24289d);
    }

    /* renamed from: b */
    public int mo17783b() {
        int i = this.f24286a;
        if (i == 1935960438) {
            return 2;
        }
        if (i == 1935963489) {
            return 1;
        }
        if (i == 1937012852) {
            return 3;
        }
        C5961r.m35215i("AviStreamHeaderChunk", "Found unsupported streamType fourCC: " + Integer.toHexString(this.f24286a));
        return -1;
    }

    public int getType() {
        return 1752331379;
    }
}
