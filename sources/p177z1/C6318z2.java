package p177z1;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import p015b3.C1757s0;
import p161w3.C5953m0;

/* renamed from: z1.z2 */
/* compiled from: PlaylistTimeline */
final class C6318z2 extends C6196a {

    /* renamed from: f */
    private final int f30486f;

    /* renamed from: g */
    private final int f30487g;

    /* renamed from: h */
    private final int[] f30488h;

    /* renamed from: i */
    private final int[] f30489i;

    /* renamed from: r */
    private final C6266q3[] f30490r;

    /* renamed from: s */
    private final Object[] f30491s;

    /* renamed from: t */
    private final HashMap<Object, Integer> f30492t = new HashMap<>();

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C6318z2(Collection<? extends C6233j2> collection, C1757s0 s0Var) {
        super(false, s0Var);
        int i = 0;
        int size = collection.size();
        this.f30488h = new int[size];
        this.f30489i = new int[size];
        this.f30490r = new C6266q3[size];
        this.f30491s = new Object[size];
        int i2 = 0;
        int i3 = 0;
        for (C6233j2 j2Var : collection) {
            this.f30490r[i3] = j2Var.mo21212a();
            this.f30489i[i3] = i;
            this.f30488h[i3] = i2;
            i += this.f30490r[i3].mo6761t();
            i2 += this.f30490r[i3].mo6760m();
            this.f30491s[i3] = j2Var.mo21213b();
            this.f30492t.put(this.f30491s[i3], Integer.valueOf(i3));
            i3++;
        }
        this.f30486f = i;
        this.f30487g = i2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: C */
    public Object mo6756C(int i) {
        return this.f30491s[i];
    }

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public int mo6757E(int i) {
        return this.f30488h[i];
    }

    /* access modifiers changed from: protected */
    /* renamed from: F */
    public int mo6758F(int i) {
        return this.f30489i[i];
    }

    /* access modifiers changed from: protected */
    /* renamed from: I */
    public C6266q3 mo6759I(int i) {
        return this.f30490r[i];
    }

    /* access modifiers changed from: package-private */
    /* renamed from: J */
    public List<C6266q3> mo21628J() {
        return Arrays.asList(this.f30490r);
    }

    /* renamed from: m */
    public int mo6760m() {
        return this.f30487g;
    }

    /* renamed from: t */
    public int mo6761t() {
        return this.f30486f;
    }

    /* access modifiers changed from: protected */
    /* renamed from: x */
    public int mo6762x(Object obj) {
        Integer num = this.f30492t.get(obj);
        if (num == null) {
            return -1;
        }
        return num.intValue();
    }

    /* access modifiers changed from: protected */
    /* renamed from: y */
    public int mo6763y(int i) {
        return C5953m0.m35134h(this.f30488h, i + 1, false, false);
    }

    /* access modifiers changed from: protected */
    /* renamed from: z */
    public int mo6764z(int i) {
        return C5953m0.m35134h(this.f30489i, i + 1, false, false);
    }
}
