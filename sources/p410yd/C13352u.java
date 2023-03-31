package p410yd;

import kotlin.jvm.internal.C11665g;
import kotlin.jvm.internal.C11669k;
import p243gd.C10349s;
import p344rd.C12439l;

/* renamed from: yd.u */
/* compiled from: CancellableContinuationImpl.kt */
final class C13352u {

    /* renamed from: a */
    public final Object f47669a;

    /* renamed from: b */
    public final C13307i f47670b;

    /* renamed from: c */
    public final C12439l<Throwable, C10349s> f47671c;

    /* renamed from: d */
    public final Object f47672d;

    /* renamed from: e */
    public final Throwable f47673e;

    public C13352u(Object obj, C13307i iVar, C12439l<? super Throwable, C10349s> lVar, Object obj2, Throwable th) {
        this.f47669a = obj;
        this.f47670b = iVar;
        this.f47671c = lVar;
        this.f47672d = obj2;
        this.f47673e = th;
    }

    /* renamed from: b */
    public static /* synthetic */ C13352u m62331b(C13352u uVar, Object obj, C13307i iVar, C12439l<Throwable, C10349s> lVar, Object obj2, Throwable th, int i, Object obj3) {
        if ((i & 1) != 0) {
            obj = uVar.f47669a;
        }
        if ((i & 2) != 0) {
            iVar = uVar.f47670b;
        }
        C13307i iVar2 = iVar;
        if ((i & 4) != 0) {
            lVar = uVar.f47671c;
        }
        C12439l<Throwable, C10349s> lVar2 = lVar;
        if ((i & 8) != 0) {
            obj2 = uVar.f47672d;
        }
        Object obj4 = obj2;
        if ((i & 16) != 0) {
            th = uVar.f47673e;
        }
        return uVar.mo38482a(obj, iVar2, lVar2, obj4, th);
    }

    /* renamed from: a */
    public final C13352u mo38482a(Object obj, C13307i iVar, C12439l<? super Throwable, C10349s> lVar, Object obj2, Throwable th) {
        return new C13352u(obj, iVar, lVar, obj2, th);
    }

    /* renamed from: c */
    public final boolean mo38483c() {
        return this.f47673e != null;
    }

    /* renamed from: d */
    public final void mo38484d(C13322l<?> lVar, Throwable th) {
        C13307i iVar = this.f47670b;
        if (iVar != null) {
            lVar.mo38453o(iVar, th);
        }
        C12439l<Throwable, C10349s> lVar2 = this.f47671c;
        if (lVar2 != null) {
            lVar.mo38454p(lVar2, th);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C13352u)) {
            return false;
        }
        C13352u uVar = (C13352u) obj;
        return C11669k.m56783a(this.f47669a, uVar.f47669a) && C11669k.m56783a(this.f47670b, uVar.f47670b) && C11669k.m56783a(this.f47671c, uVar.f47671c) && C11669k.m56783a(this.f47672d, uVar.f47672d) && C11669k.m56783a(this.f47673e, uVar.f47673e);
    }

    public int hashCode() {
        Object obj = this.f47669a;
        int i = 0;
        int hashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        C13307i iVar = this.f47670b;
        int hashCode2 = (hashCode + (iVar == null ? 0 : iVar.hashCode())) * 31;
        C12439l<Throwable, C10349s> lVar = this.f47671c;
        int hashCode3 = (hashCode2 + (lVar == null ? 0 : lVar.hashCode())) * 31;
        Object obj2 = this.f47672d;
        int hashCode4 = (hashCode3 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Throwable th = this.f47673e;
        if (th != null) {
            i = th.hashCode();
        }
        return hashCode4 + i;
    }

    public String toString() {
        return "CompletedContinuation(result=" + this.f47669a + ", cancelHandler=" + this.f47670b + ", onCancellation=" + this.f47671c + ", idempotentResume=" + this.f47672d + ", cancelCause=" + this.f47673e + ')';
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C13352u(Object obj, C13307i iVar, C12439l lVar, Object obj2, Throwable th, int i, C11665g gVar) {
        this(obj, (i & 2) != 0 ? null : iVar, (i & 4) != 0 ? null : lVar, (i & 8) != 0 ? null : obj2, (i & 16) != 0 ? null : th);
    }
}
