package p340r9;

import java.util.List;
import p248h9.C10475a;

/* renamed from: r9.a */
/* compiled from: BitArrayBuilder */
final class C12259a {
    /* renamed from: a */
    static C10475a m58897a(List<C12260b> list) {
        int size = (list.size() << 1) - 1;
        if (list.get(list.size() - 1).mo36887d() == null) {
            size--;
        }
        C10475a aVar = new C10475a(size * 12);
        int i = 0;
        int b = list.get(0).mo36887d().mo36714b();
        for (int i2 = 11; i2 >= 0; i2--) {
            if (((1 << i2) & b) != 0) {
                aVar.mo33564k(i);
            }
            i++;
        }
        for (int i3 = 1; i3 < list.size(); i3++) {
            C12260b bVar = list.get(i3);
            int b2 = bVar.mo36886c().mo36714b();
            for (int i4 = 11; i4 >= 0; i4--) {
                if (((1 << i4) & b2) != 0) {
                    aVar.mo33564k(i);
                }
                i++;
            }
            if (bVar.mo36887d() != null) {
                int b3 = bVar.mo36887d().mo36714b();
                for (int i5 = 11; i5 >= 0; i5--) {
                    if (((1 << i5) & b3) != 0) {
                        aVar.mo33564k(i);
                    }
                    i++;
                }
            }
        }
        return aVar;
    }
}
