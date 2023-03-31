package p021c2;

import p161w3.C5917a;
import p177z1.C6272r1;

/* renamed from: c2.i */
/* compiled from: DecoderReuseEvaluation */
public final class C1852i {

    /* renamed from: a */
    public final String f5440a;

    /* renamed from: b */
    public final C6272r1 f5441b;

    /* renamed from: c */
    public final C6272r1 f5442c;

    /* renamed from: d */
    public final int f5443d;

    /* renamed from: e */
    public final int f5444e;

    public C1852i(String str, C6272r1 r1Var, C6272r1 r1Var2, int i, int i2) {
        C5917a.m34868a(i == 0 || i2 == 0);
        this.f5440a = C5917a.m34871d(str);
        this.f5441b = (C6272r1) C5917a.m34872e(r1Var);
        this.f5442c = (C6272r1) C5917a.m34872e(r1Var2);
        this.f5443d = i;
        this.f5444e = i2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1852i.class != obj.getClass()) {
            return false;
        }
        C1852i iVar = (C1852i) obj;
        if (this.f5443d != iVar.f5443d || this.f5444e != iVar.f5444e || !this.f5440a.equals(iVar.f5440a) || !this.f5441b.equals(iVar.f5441b) || !this.f5442c.equals(iVar.f5442c)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((((((527 + this.f5443d) * 31) + this.f5444e) * 31) + this.f5440a.hashCode()) * 31) + this.f5441b.hashCode()) * 31) + this.f5442c.hashCode();
    }
}
