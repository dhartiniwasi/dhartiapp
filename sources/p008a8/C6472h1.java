package p008a8;

import p247h8.C10432b;

/* renamed from: a8.h1 */
/* compiled from: TargetIdGenerator */
public class C6472h1 {

    /* renamed from: a */
    private int f30764a;

    /* renamed from: b */
    private int f30765b;

    C6472h1(int i, int i2) {
        C10432b.m52648d((i & 1) == i, "Generator ID %d contains more than %d reserved bits", Integer.valueOf(i), 1);
        this.f30765b = i;
        m37735d(i2);
    }

    /* renamed from: a */
    public static C6472h1 m37733a() {
        return new C6472h1(1, 1);
    }

    /* renamed from: b */
    public static C6472h1 m37734b(int i) {
        C6472h1 h1Var = new C6472h1(0, i);
        h1Var.mo21953c();
        return h1Var;
    }

    /* renamed from: d */
    private void m37735d(int i) {
        C10432b.m52648d((i & 1) == this.f30765b, "Cannot supply target ID from different generator ID", new Object[0]);
        this.f30764a = i;
    }

    /* renamed from: c */
    public int mo21953c() {
        int i = this.f30764a;
        this.f30764a = i + 2;
        return i;
    }
}
