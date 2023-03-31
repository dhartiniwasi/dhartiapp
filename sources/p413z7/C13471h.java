package p413z7;

import java.util.List;
import p211d8.C9888l;
import p211d8.C9905w;

/* renamed from: z7.h */
/* compiled from: BundledDocumentMetadata */
public class C13471h implements C13466c {

    /* renamed from: a */
    private final C9888l f47832a;

    /* renamed from: b */
    private final C9905w f47833b;

    /* renamed from: c */
    private final boolean f47834c;

    /* renamed from: d */
    private final List<String> f47835d;

    public C13471h(C9888l lVar, C9905w wVar, boolean z, List<String> list) {
        this.f47832a = lVar;
        this.f47833b = wVar;
        this.f47834c = z;
        this.f47835d = list;
    }

    /* renamed from: a */
    public boolean mo38579a() {
        return this.f47834c;
    }

    /* renamed from: b */
    public C9888l mo38580b() {
        return this.f47832a;
    }

    /* renamed from: c */
    public List<String> mo38581c() {
        return this.f47835d;
    }

    /* renamed from: d */
    public C9905w mo38582d() {
        return this.f47833b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C13471h hVar = (C13471h) obj;
        if (this.f47834c == hVar.f47834c && this.f47832a.equals(hVar.f47832a) && this.f47833b.equals(hVar.f47833b)) {
            return this.f47835d.equals(hVar.f47835d);
        }
        return false;
    }

    public int hashCode() {
        return (((((this.f47832a.hashCode() * 31) + this.f47833b.hashCode()) * 31) + (this.f47834c ? 1 : 0)) * 31) + this.f47835d.hashCode();
    }
}
