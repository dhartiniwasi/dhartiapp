package p238g8;

import com.google.protobuf.C8153i;
import p211d8.C9888l;
import p320p7.C12130e;

/* renamed from: g8.r0 */
/* compiled from: TargetChange */
public final class C10270r0 {

    /* renamed from: a */
    private final C8153i f40816a;

    /* renamed from: b */
    private final boolean f40817b;

    /* renamed from: c */
    private final C12130e<C9888l> f40818c;

    /* renamed from: d */
    private final C12130e<C9888l> f40819d;

    /* renamed from: e */
    private final C12130e<C9888l> f40820e;

    public C10270r0(C8153i iVar, boolean z, C12130e<C9888l> eVar, C12130e<C9888l> eVar2, C12130e<C9888l> eVar3) {
        this.f40816a = iVar;
        this.f40817b = z;
        this.f40818c = eVar;
        this.f40819d = eVar2;
        this.f40820e = eVar3;
    }

    /* renamed from: a */
    public static C10270r0 m51978a(boolean z, C8153i iVar) {
        return new C10270r0(iVar, z, C9888l.m50695j(), C9888l.m50695j(), C9888l.m50695j());
    }

    /* renamed from: b */
    public C12130e<C9888l> mo33032b() {
        return this.f40818c;
    }

    /* renamed from: c */
    public C12130e<C9888l> mo33033c() {
        return this.f40819d;
    }

    /* renamed from: d */
    public C12130e<C9888l> mo33034d() {
        return this.f40820e;
    }

    /* renamed from: e */
    public C8153i mo33035e() {
        return this.f40816a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C10270r0.class != obj.getClass()) {
            return false;
        }
        C10270r0 r0Var = (C10270r0) obj;
        if (this.f40817b == r0Var.f40817b && this.f40816a.equals(r0Var.f40816a) && this.f40818c.equals(r0Var.f40818c) && this.f40819d.equals(r0Var.f40819d)) {
            return this.f40820e.equals(r0Var.f40820e);
        }
        return false;
    }

    /* renamed from: f */
    public boolean mo33037f() {
        return this.f40817b;
    }

    public int hashCode() {
        return (((((((this.f40816a.hashCode() * 31) + (this.f40817b ? 1 : 0)) * 31) + this.f40818c.hashCode()) * 31) + this.f40819d.hashCode()) * 31) + this.f40820e.hashCode();
    }
}
