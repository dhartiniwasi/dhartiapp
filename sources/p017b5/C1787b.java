package p017b5;

import com.google.android.gms.common.api.C2051a;
import com.google.android.gms.common.api.C2051a.C2055d;
import p033d5.C4133p;

/* renamed from: b5.b */
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public final class C1787b<O extends C2051a.C2055d> {

    /* renamed from: a */
    private final int f5312a;

    /* renamed from: b */
    private final C2051a<O> f5313b;

    /* renamed from: c */
    private final O f5314c;

    /* renamed from: d */
    private final String f5315d;

    private C1787b(C2051a<O> aVar, O o, String str) {
        this.f5313b = aVar;
        this.f5314c = o;
        this.f5315d = str;
        this.f5312a = C4133p.m28194b(aVar, o, str);
    }

    /* renamed from: a */
    public static <O extends C2051a.C2055d> C1787b<O> m8420a(C2051a<O> aVar, O o, String str) {
        return new C1787b<>(aVar, o, str);
    }

    /* renamed from: b */
    public final String mo6915b() {
        return this.f5313b.mo7962d();
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1787b)) {
            return false;
        }
        C1787b bVar = (C1787b) obj;
        return C4133p.m28193a(this.f5313b, bVar.f5313b) && C4133p.m28193a(this.f5314c, bVar.f5314c) && C4133p.m28193a(this.f5315d, bVar.f5315d);
    }

    public final int hashCode() {
        return this.f5312a;
    }
}
