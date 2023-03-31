package p142t3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import p079k3.C4864b;
import p079k3.C4874h;
import p161w3.C5917a;
import p161w3.C5953m0;

/* renamed from: t3.k */
/* compiled from: WebvttSubtitle */
final class C5524k implements C4874h {

    /* renamed from: a */
    private final List<C5515e> f28040a;

    /* renamed from: b */
    private final long[] f28041b;

    /* renamed from: c */
    private final long[] f28042c;

    public C5524k(List<C5515e> list) {
        this.f28040a = Collections.unmodifiableList(new ArrayList(list));
        this.f28041b = new long[(list.size() * 2)];
        for (int i = 0; i < list.size(); i++) {
            C5515e eVar = list.get(i);
            int i2 = i * 2;
            long[] jArr = this.f28041b;
            jArr[i2] = eVar.f28011b;
            jArr[i2 + 1] = eVar.f28012c;
        }
        long[] jArr2 = this.f28041b;
        long[] copyOf = Arrays.copyOf(jArr2, jArr2.length);
        this.f28042c = copyOf;
        Arrays.sort(copyOf);
    }

    /* renamed from: a */
    public int mo18648a(long j) {
        int e = C5953m0.m35128e(this.f28042c, j, false, false);
        if (e < this.f28042c.length) {
            return e;
        }
        return -1;
    }

    /* renamed from: b */
    public long mo18649b(int i) {
        boolean z = true;
        C5917a.m34868a(i >= 0);
        if (i >= this.f28042c.length) {
            z = false;
        }
        C5917a.m34868a(z);
        return this.f28042c[i];
    }

    /* renamed from: c */
    public List<C4864b> mo18650c(long j) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i = 0; i < this.f28040a.size(); i++) {
            long[] jArr = this.f28041b;
            int i2 = i * 2;
            if (jArr[i2] <= j && j < jArr[i2 + 1]) {
                C5515e eVar = this.f28040a.get(i);
                C4864b bVar = eVar.f28010a;
                if (bVar.f25762e == -3.4028235E38f) {
                    arrayList2.add(eVar);
                } else {
                    arrayList.add(bVar);
                }
            }
        }
        Collections.sort(arrayList2, C12534j.f46030a);
        for (int i3 = 0; i3 < arrayList2.size(); i3++) {
            arrayList.add(((C5515e) arrayList2.get(i3)).f28010a.mo18621b().mo18631h((float) (-1 - i3), 1).mo18624a());
        }
        return arrayList;
    }

    /* renamed from: j */
    public int mo18651j() {
        return this.f28042c.length;
    }
}
