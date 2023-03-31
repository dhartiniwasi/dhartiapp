package p359ta;

import java.util.HashSet;

/* renamed from: ta.j */
/* compiled from: DatabaseTask */
final class C12571j {

    /* renamed from: a */
    final C12569i f46111a;

    /* renamed from: b */
    final Runnable f46112b;

    C12571j(C12569i iVar, Runnable runnable) {
        this.f46111a = iVar;
        this.f46112b = runnable;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo37414a(HashSet<Integer> hashSet) {
        C12569i iVar = this.f46111a;
        if (iVar == null || !iVar.mo37400D()) {
            return false;
        }
        return !hashSet.contains(Integer.valueOf(this.f46111a.f46099c));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public boolean mo37415b(C12569i iVar) {
        C12569i iVar2 = this.f46111a;
        if (iVar2 == null) {
            return iVar == null;
        }
        if (iVar2.f46099c == iVar.f46099c) {
            return true;
        }
        return false;
    }
}
