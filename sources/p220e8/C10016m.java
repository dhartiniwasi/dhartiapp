package p220e8;

import p211d8.C9899s;
import p211d8.C9905w;
import p247h8.C10432b;

/* renamed from: e8.m */
/* compiled from: Precondition */
public final class C10016m {

    /* renamed from: c */
    public static final C10016m f39979c = new C10016m((C9905w) null, (Boolean) null);

    /* renamed from: a */
    private final C9905w f39980a;

    /* renamed from: b */
    private final Boolean f39981b;

    private C10016m(C9905w wVar, Boolean bool) {
        C10432b.m52648d(wVar == null || bool == null, "Precondition can specify \"exists\" or \"updateTime\" but not both", new Object[0]);
        this.f39980a = wVar;
        this.f39981b = bool;
    }

    /* renamed from: a */
    public static C10016m m51148a(boolean z) {
        return new C10016m((C9905w) null, Boolean.valueOf(z));
    }

    /* renamed from: f */
    public static C10016m m51149f(C9905w wVar) {
        return new C10016m(wVar, (Boolean) null);
    }

    /* renamed from: b */
    public Boolean mo32630b() {
        return this.f39981b;
    }

    /* renamed from: c */
    public C9905w mo32631c() {
        return this.f39980a;
    }

    /* renamed from: d */
    public boolean mo32632d() {
        return this.f39980a == null && this.f39981b == null;
    }

    /* renamed from: e */
    public boolean mo32633e(C9899s sVar) {
        if (this.f39980a == null) {
            Boolean bool = this.f39981b;
            if (bool == null) {
                C10432b.m52648d(mo32632d(), "Precondition should be empty", new Object[0]);
                return true;
            } else if (bool.booleanValue() == sVar.mo32371b()) {
                return true;
            } else {
                return false;
            }
        } else if (!sVar.mo32371b() || !sVar.mo32381j().equals(this.f39980a)) {
            return false;
        } else {
            return true;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C10016m.class != obj.getClass()) {
            return false;
        }
        C10016m mVar = (C10016m) obj;
        C9905w wVar = this.f39980a;
        if (wVar == null ? mVar.f39980a != null : !wVar.equals(mVar.f39980a)) {
            return false;
        }
        Boolean bool = this.f39981b;
        Boolean bool2 = mVar.f39981b;
        if (bool != null) {
            return bool.equals(bool2);
        }
        if (bool2 == null) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        C9905w wVar = this.f39980a;
        int i = 0;
        int hashCode = (wVar != null ? wVar.hashCode() : 0) * 31;
        Boolean bool = this.f39981b;
        if (bool != null) {
            i = bool.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        if (mo32632d()) {
            return "Precondition{<none>}";
        }
        if (this.f39980a != null) {
            return "Precondition{updateTime=" + this.f39980a + "}";
        } else if (this.f39981b != null) {
            return "Precondition{exists=" + this.f39981b + "}";
        } else {
            throw C10432b.m52645a("Invalid Precondition", new Object[0]);
        }
    }
}
