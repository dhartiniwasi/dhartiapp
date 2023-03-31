package p410yd;

import kotlin.jvm.internal.C11669k;
import p243gd.C10349s;
import p344rd.C12439l;

/* renamed from: yd.w */
/* compiled from: CompletionState.kt */
public final class C13358w {

    /* renamed from: a */
    public final Object f47678a;

    /* renamed from: b */
    public final C12439l<Throwable, C10349s> f47679b;

    public C13358w(Object obj, C12439l<? super Throwable, C10349s> lVar) {
        this.f47678a = obj;
        this.f47679b = lVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C13358w)) {
            return false;
        }
        C13358w wVar = (C13358w) obj;
        return C11669k.m56783a(this.f47678a, wVar.f47678a) && C11669k.m56783a(this.f47679b, wVar.f47679b);
    }

    public int hashCode() {
        Object obj = this.f47678a;
        return ((obj == null ? 0 : obj.hashCode()) * 31) + this.f47679b.hashCode();
    }

    public String toString() {
        return "CompletedWithCancellation(result=" + this.f47678a + ", onCancellation=" + this.f47679b + ')';
    }
}
