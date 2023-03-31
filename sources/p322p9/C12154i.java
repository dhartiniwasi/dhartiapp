package p322p9;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import p212d9.C9909a;
import p212d9.C9913e;
import p212d9.C9918j;
import p212d9.C9921m;
import p212d9.C9922n;
import p248h9.C10475a;
import p331q9.C12198e;
import p340r9.C12262d;

/* renamed from: p9.i */
/* compiled from: MultiFormatOneDReader */
public final class C12154i extends C12156k {

    /* renamed from: a */
    private final C12156k[] f45234a;

    public C12154i(Map<C9913e, ?> map) {
        Collection collection;
        if (map == null) {
            collection = null;
        } else {
            collection = (Collection) map.get(C9913e.POSSIBLE_FORMATS);
        }
        boolean z = (map == null || map.get(C9913e.ASSUME_CODE_39_CHECK_DIGIT) == null) ? false : true;
        ArrayList arrayList = new ArrayList();
        if (collection != null) {
            if (collection.contains(C9909a.EAN_13) || collection.contains(C9909a.UPC_A) || collection.contains(C9909a.EAN_8) || collection.contains(C9909a.UPC_E)) {
                arrayList.add(new C12155j(map));
            }
            if (collection.contains(C9909a.CODE_39)) {
                arrayList.add(new C12148c(z));
            }
            if (collection.contains(C9909a.CODE_93)) {
                arrayList.add(new C12149d());
            }
            if (collection.contains(C9909a.CODE_128)) {
                arrayList.add(new C12147b());
            }
            if (collection.contains(C9909a.ITF)) {
                arrayList.add(new C12153h());
            }
            if (collection.contains(C9909a.CODABAR)) {
                arrayList.add(new C12146a());
            }
            if (collection.contains(C9909a.RSS_14)) {
                arrayList.add(new C12198e());
            }
            if (collection.contains(C9909a.RSS_EXPANDED)) {
                arrayList.add(new C12262d());
            }
        }
        if (arrayList.isEmpty()) {
            arrayList.add(new C12155j(map));
            arrayList.add(new C12148c());
            arrayList.add(new C12146a());
            arrayList.add(new C12149d());
            arrayList.add(new C12147b());
            arrayList.add(new C12153h());
            arrayList.add(new C12198e());
            arrayList.add(new C12262d());
        }
        this.f45234a = (C12156k[]) arrayList.toArray(new C12156k[arrayList.size()]);
    }

    /* renamed from: b */
    public C9922n mo36672b(int i, C10475a aVar, Map<C9913e, ?> map) throws C9918j {
        C12156k[] kVarArr = this.f45234a;
        int i2 = 0;
        while (i2 < kVarArr.length) {
            try {
                return kVarArr[i2].mo36672b(i, aVar, map);
            } catch (C9921m unused) {
                i2++;
            }
        }
        throw C9918j.m50862a();
    }

    public void reset() {
        for (C12156k reset : this.f45234a) {
            reset.reset();
        }
    }
}
