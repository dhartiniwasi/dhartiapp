package p045f3;

import p161w3.C5953m0;

/* renamed from: f3.e */
/* compiled from: Descriptor */
public final class C4260e {

    /* renamed from: a */
    public final String f23674a;

    /* renamed from: b */
    public final String f23675b;

    /* renamed from: c */
    public final String f23676c;

    public C4260e(String str, String str2, String str3) {
        this.f23674a = str;
        this.f23675b = str2;
        this.f23676c = str3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C4260e.class != obj.getClass()) {
            return false;
        }
        C4260e eVar = (C4260e) obj;
        if (!C5953m0.m35124c(this.f23674a, eVar.f23674a) || !C5953m0.m35124c(this.f23675b, eVar.f23675b) || !C5953m0.m35124c(this.f23676c, eVar.f23676c)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int hashCode = this.f23674a.hashCode() * 31;
        String str = this.f23675b;
        int i = 0;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f23676c;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode2 + i;
    }
}
