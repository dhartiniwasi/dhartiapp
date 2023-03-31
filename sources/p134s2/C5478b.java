package p134s2;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import p127r2.C5432a;
import p127r2.C5439e;
import p127r2.C5442h;
import p161w3.C5980z;
import p182a7.C6415d;

/* renamed from: s2.b */
/* compiled from: AppInfoTableDecoder */
public final class C5478b extends C5442h {
    /* renamed from: c */
    private static C5432a m33413c(C5980z zVar) {
        zVar.mo20686r(12);
        int d = (zVar.mo20672d() + zVar.mo20676h(12)) - 4;
        zVar.mo20686r(44);
        zVar.mo20687s(zVar.mo20676h(12));
        zVar.mo20686r(16);
        ArrayList arrayList = new ArrayList();
        while (true) {
            String str = null;
            if (zVar.mo20672d() >= d) {
                break;
            }
            zVar.mo20686r(48);
            int h = zVar.mo20676h(8);
            zVar.mo20686r(4);
            int d2 = zVar.mo20672d() + zVar.mo20676h(12);
            String str2 = null;
            while (zVar.mo20672d() < d2) {
                int h2 = zVar.mo20676h(8);
                int h3 = zVar.mo20676h(8);
                int d3 = zVar.mo20672d() + h3;
                if (h2 == 2) {
                    int h4 = zVar.mo20676h(16);
                    zVar.mo20686r(8);
                    if (h4 != 3) {
                    }
                    while (zVar.mo20672d() < d3) {
                        str = zVar.mo20680l(zVar.mo20676h(8), C6415d.f30662a);
                        int h5 = zVar.mo20676h(8);
                        for (int i = 0; i < h5; i++) {
                            zVar.mo20687s(zVar.mo20676h(8));
                        }
                    }
                } else if (h2 == 21) {
                    str2 = zVar.mo20680l(h3, C6415d.f30662a);
                }
                zVar.mo20684p(d3 * 8);
            }
            zVar.mo20684p(d2 * 8);
            if (!(str == null || str2 == null)) {
                arrayList.add(new C5476a(h, str + str2));
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new C5432a((List<? extends C5432a.C5434b>) arrayList);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C5432a mo19711b(C5439e eVar, ByteBuffer byteBuffer) {
        if (byteBuffer.get() == 116) {
            return m33413c(new C5980z(byteBuffer.array(), byteBuffer.limit()));
        }
        return null;
    }
}
