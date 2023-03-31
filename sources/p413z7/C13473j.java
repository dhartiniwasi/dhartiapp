package p413z7;

import p211d8.C9905w;

/* renamed from: z7.j */
/* compiled from: NamedQuery */
public class C13473j implements C13466c {

    /* renamed from: a */
    private final String f47838a;

    /* renamed from: b */
    private final C13472i f47839b;

    /* renamed from: c */
    private final C9905w f47840c;

    public C13473j(String str, C13472i iVar, C9905w wVar) {
        this.f47838a = str;
        this.f47839b = iVar;
        this.f47840c = wVar;
    }

    /* renamed from: a */
    public C13472i mo38589a() {
        return this.f47839b;
    }

    /* renamed from: b */
    public String mo38590b() {
        return this.f47838a;
    }

    /* renamed from: c */
    public C9905w mo38591c() {
        return this.f47840c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C13473j jVar = (C13473j) obj;
        if (this.f47838a.equals(jVar.f47838a) && this.f47839b.equals(jVar.f47839b)) {
            return this.f47840c.equals(jVar.f47840c);
        }
        return false;
    }

    public int hashCode() {
        return (((this.f47838a.hashCode() * 31) + this.f47839b.hashCode()) * 31) + this.f47840c.hashCode();
    }
}
