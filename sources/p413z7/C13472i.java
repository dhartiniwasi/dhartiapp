package p413z7;

import p008a8.C6452b1;
import p008a8.C6469g1;

/* renamed from: z7.i */
/* compiled from: BundledQuery */
public class C13472i implements C13466c {

    /* renamed from: a */
    private final C6469g1 f47836a;

    /* renamed from: b */
    private final C6452b1.C6453a f47837b;

    public C13472i(C6469g1 g1Var, C6452b1.C6453a aVar) {
        this.f47836a = g1Var;
        this.f47837b = aVar;
    }

    /* renamed from: a */
    public C6452b1.C6453a mo38585a() {
        return this.f47837b;
    }

    /* renamed from: b */
    public C6469g1 mo38586b() {
        return this.f47836a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C13472i iVar = (C13472i) obj;
        if (this.f47836a.equals(iVar.f47836a) && this.f47837b == iVar.f47837b) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (this.f47836a.hashCode() * 31) + this.f47837b.hashCode();
    }
}
