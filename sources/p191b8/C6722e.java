package p191b8;

import com.google.auto.value.AutoValue;
import p211d8.C9888l;
import p247h8.C10449g0;

@AutoValue
/* renamed from: b8.e */
/* compiled from: IndexEntry */
public abstract class C6722e implements Comparable<C6722e> {
    /* renamed from: b */
    public static C6722e m38594b(int i, C9888l lVar, byte[] bArr, byte[] bArr2) {
        return new C6715a(i, lVar, bArr, bArr2);
    }

    /* renamed from: a */
    public int compareTo(C6722e eVar) {
        int compare = Integer.compare(mo22615n(), eVar.mo22615n());
        if (compare != 0) {
            return compare;
        }
        int b = mo22614k().compareTo(eVar.mo22614k());
        if (b != 0) {
            return b;
        }
        int i = C10449g0.m52709i(mo22610c(), eVar.mo22610c());
        if (i != 0) {
            return i;
        }
        return C10449g0.m52709i(mo22613j(), eVar.mo22613j());
    }

    /* renamed from: c */
    public abstract byte[] mo22610c();

    /* renamed from: j */
    public abstract byte[] mo22613j();

    /* renamed from: k */
    public abstract C9888l mo22614k();

    /* renamed from: n */
    public abstract int mo22615n();
}
