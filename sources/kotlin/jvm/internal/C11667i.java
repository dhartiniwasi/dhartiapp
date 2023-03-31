package kotlin.jvm.internal;

import p382vd.C12889b;
import p382vd.C12892e;

/* renamed from: kotlin.jvm.internal.i */
/* compiled from: FunctionReference */
public class C11667i extends C11659c implements C11666h, C12892e {
    private final int arity;
    private final int flags;

    public C11667i(int i) {
        this(i, C11659c.NO_RECEIVER, (Class) null, (String) null, (String) null, 0);
    }

    /* access modifiers changed from: protected */
    public C12889b computeReflected() {
        return C11677s.m56800a(this);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C11667i) {
            C11667i iVar = (C11667i) obj;
            if (!getName().equals(iVar.getName()) || !getSignature().equals(iVar.getSignature()) || this.flags != iVar.flags || this.arity != iVar.arity || !C11669k.m56783a(getBoundReceiver(), iVar.getBoundReceiver()) || !C11669k.m56783a(getOwner(), iVar.getOwner())) {
                return false;
            }
            return true;
        } else if (obj instanceof C12892e) {
            return obj.equals(compute());
        } else {
            return false;
        }
    }

    public int getArity() {
        return this.arity;
    }

    public int hashCode() {
        return (((getOwner() == null ? 0 : getOwner().hashCode() * 31) + getName().hashCode()) * 31) + getSignature().hashCode();
    }

    public boolean isExternal() {
        return getReflected().isExternal();
    }

    public boolean isInfix() {
        return getReflected().isInfix();
    }

    public boolean isInline() {
        return getReflected().isInline();
    }

    public boolean isOperator() {
        return getReflected().isOperator();
    }

    public boolean isSuspend() {
        return getReflected().isSuspend();
    }

    public String toString() {
        C12889b compute = compute();
        if (compute != this) {
            return compute.toString();
        }
        if ("<init>".equals(getName())) {
            return "constructor (Kotlin reflection is not available)";
        }
        return "function " + getName() + " (Kotlin reflection is not available)";
    }

    public C11667i(int i, Object obj) {
        this(i, obj, (Class) null, (String) null, (String) null, 0);
    }

    /* access modifiers changed from: protected */
    public C12892e getReflected() {
        return (C12892e) super.getReflected();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C11667i(int i, Object obj, Class cls, String str, String str2, int i2) {
        super(obj, cls, str, str2, (i2 & 1) == 1);
        this.arity = i;
        this.flags = i2 >> 1;
    }
}
