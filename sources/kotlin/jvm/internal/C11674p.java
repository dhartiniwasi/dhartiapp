package kotlin.jvm.internal;

import p382vd.C12889b;
import p382vd.C12894g;

/* renamed from: kotlin.jvm.internal.p */
/* compiled from: PropertyReference */
public abstract class C11674p extends C11659c implements C12894g {
    public C11674p() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C12894g getReflected() {
        return (C12894g) super.getReflected();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C11674p) {
            C11674p pVar = (C11674p) obj;
            if (!getOwner().equals(pVar.getOwner()) || !getName().equals(pVar.getName()) || !getSignature().equals(pVar.getSignature()) || !C11669k.m56783a(getBoundReceiver(), pVar.getBoundReceiver())) {
                return false;
            }
            return true;
        } else if (obj instanceof C12894g) {
            return obj.equals(compute());
        } else {
            return false;
        }
    }

    public int hashCode() {
        return (((getOwner().hashCode() * 31) + getName().hashCode()) * 31) + getSignature().hashCode();
    }

    public String toString() {
        C12889b compute = compute();
        if (compute != this) {
            return compute.toString();
        }
        return "property " + getName() + " (Kotlin reflection is not available)";
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C11674p(Object obj, Class cls, String str, String str2, int i) {
        super(obj, cls, str, str2, (i & 1) == 1);
    }
}
