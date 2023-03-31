package p045f3;

import p161w3.C5953m0;

/* renamed from: f3.h */
/* compiled from: ProgramInformation */
public final class C4263h {

    /* renamed from: a */
    public final String f23687a;

    /* renamed from: b */
    public final String f23688b;

    /* renamed from: c */
    public final String f23689c;

    /* renamed from: d */
    public final String f23690d;

    /* renamed from: e */
    public final String f23691e;

    public C4263h(String str, String str2, String str3, String str4, String str5) {
        this.f23687a = str;
        this.f23688b = str2;
        this.f23689c = str3;
        this.f23690d = str4;
        this.f23691e = str5;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4263h)) {
            return false;
        }
        C4263h hVar = (C4263h) obj;
        if (!C5953m0.m35124c(this.f23687a, hVar.f23687a) || !C5953m0.m35124c(this.f23688b, hVar.f23688b) || !C5953m0.m35124c(this.f23689c, hVar.f23689c) || !C5953m0.m35124c(this.f23690d, hVar.f23690d) || !C5953m0.m35124c(this.f23691e, hVar.f23691e)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        String str = this.f23687a;
        int i = 0;
        int hashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f23688b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f23689c;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f23690d;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.f23691e;
        if (str5 != null) {
            i = str5.hashCode();
        }
        return hashCode4 + i;
    }
}
