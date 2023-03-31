package p212d9;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import p221e9.C10022b;
import p277k9.C11601a;
import p304n9.C11983a;
import p322p9.C12154i;
import p358t9.C12554b;
import p397x9.C12986a;

/* renamed from: d9.i */
/* compiled from: MultiFormatReader */
public final class C9917i implements C9920l {

    /* renamed from: a */
    private Map<C9913e, ?> f39802a;

    /* renamed from: b */
    private C9920l[] f39803b;

    /* renamed from: b */
    private C9922n m50858b(C9911c cVar) throws C9918j {
        C9920l[] lVarArr = this.f39803b;
        if (lVarArr != null) {
            int length = lVarArr.length;
            int i = 0;
            while (i < length) {
                try {
                    return lVarArr[i].mo32466a(cVar, this.f39802a);
                } catch (C9921m unused) {
                    i++;
                }
            }
        }
        throw C9918j.m50862a();
    }

    /* renamed from: a */
    public C9922n mo32466a(C9911c cVar, Map<C9913e, ?> map) throws C9918j {
        mo32468d(map);
        return m50858b(cVar);
    }

    /* renamed from: c */
    public C9922n mo32467c(C9911c cVar) throws C9918j {
        if (this.f39803b == null) {
            mo32468d((Map<C9913e, ?>) null);
        }
        return m50858b(cVar);
    }

    /* renamed from: d */
    public void mo32468d(Map<C9913e, ?> map) {
        Collection collection;
        this.f39802a = map;
        boolean z = true;
        boolean z2 = map != null && map.containsKey(C9913e.TRY_HARDER);
        if (map == null) {
            collection = null;
        } else {
            collection = (Collection) map.get(C9913e.POSSIBLE_FORMATS);
        }
        ArrayList arrayList = new ArrayList();
        if (collection != null) {
            if (!collection.contains(C9909a.UPC_A) && !collection.contains(C9909a.UPC_E) && !collection.contains(C9909a.EAN_13) && !collection.contains(C9909a.EAN_8) && !collection.contains(C9909a.CODABAR) && !collection.contains(C9909a.CODE_39) && !collection.contains(C9909a.CODE_93) && !collection.contains(C9909a.CODE_128) && !collection.contains(C9909a.ITF) && !collection.contains(C9909a.RSS_14) && !collection.contains(C9909a.RSS_EXPANDED)) {
                z = false;
            }
            if (z && !z2) {
                arrayList.add(new C12154i(map));
            }
            if (collection.contains(C9909a.QR_CODE)) {
                arrayList.add(new C12986a());
            }
            if (collection.contains(C9909a.DATA_MATRIX)) {
                arrayList.add(new C11601a());
            }
            if (collection.contains(C9909a.AZTEC)) {
                arrayList.add(new C10022b());
            }
            if (collection.contains(C9909a.PDF_417)) {
                arrayList.add(new C12554b());
            }
            if (collection.contains(C9909a.MAXICODE)) {
                arrayList.add(new C11983a());
            }
            if (z && z2) {
                arrayList.add(new C12154i(map));
            }
        }
        if (arrayList.isEmpty()) {
            if (!z2) {
                arrayList.add(new C12154i(map));
            }
            arrayList.add(new C12986a());
            arrayList.add(new C11601a());
            arrayList.add(new C10022b());
            arrayList.add(new C12554b());
            arrayList.add(new C11983a());
            if (z2) {
                arrayList.add(new C12154i(map));
            }
        }
        this.f39803b = (C9920l[]) arrayList.toArray(new C9920l[arrayList.size()]);
    }

    public void reset() {
        C9920l[] lVarArr = this.f39803b;
        if (lVarArr != null) {
            for (C9920l reset : lVarArr) {
                reset.reset();
            }
        }
    }
}
