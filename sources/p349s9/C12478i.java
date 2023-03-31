package p349s9;

import p248h9.C10475a;

/* renamed from: s9.i */
/* compiled from: AI01weightDecoder */
abstract class C12478i extends C12477h {
    C12478i(C10475a aVar) {
        super(aVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public abstract void mo37246h(StringBuilder sb, int i);

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public abstract int mo37247i(int i);

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public final void mo37251j(StringBuilder sb, int i, int i2) {
        int f = mo37252b().mo37276f(i, i2);
        mo37246h(sb, f);
        int i3 = mo37247i(f);
        int i4 = 100000;
        for (int i5 = 0; i5 < 5; i5++) {
            if (i3 / i4 == 0) {
                sb.append('0');
            }
            i4 /= 10;
        }
        sb.append(i3);
    }
}
