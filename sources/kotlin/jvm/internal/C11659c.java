package kotlin.jvm.internal;

import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.util.List;
import java.util.Map;
import p335qd.C12225b;
import p382vd.C12889b;
import p382vd.C12891d;
import p382vd.C12895h;
import p382vd.C12896i;

/* renamed from: kotlin.jvm.internal.c */
/* compiled from: CallableReference */
public abstract class C11659c implements C12889b, Serializable {
    public static final Object NO_RECEIVER = C11660a.f44229a;
    private final boolean isTopLevel;
    private final String name;
    private final Class owner;
    protected final Object receiver;
    private transient C12889b reflected;
    private final String signature;

    /* renamed from: kotlin.jvm.internal.c$a */
    /* compiled from: CallableReference */
    private static class C11660a implements Serializable {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public static final C11660a f44229a = new C11660a();

        private C11660a() {
        }
    }

    public C11659c() {
        this(NO_RECEIVER);
    }

    public Object call(Object... objArr) {
        return getReflected().call(objArr);
    }

    public Object callBy(Map map) {
        return getReflected().callBy(map);
    }

    public C12889b compute() {
        C12889b bVar = this.reflected;
        if (bVar != null) {
            return bVar;
        }
        C12889b computeReflected = computeReflected();
        this.reflected = computeReflected;
        return computeReflected;
    }

    /* access modifiers changed from: protected */
    public abstract C12889b computeReflected();

    public List<Annotation> getAnnotations() {
        return getReflected().getAnnotations();
    }

    public Object getBoundReceiver() {
        return this.receiver;
    }

    public String getName() {
        return this.name;
    }

    public C12891d getOwner() {
        Class cls = this.owner;
        if (cls == null) {
            return null;
        }
        return this.isTopLevel ? C11677s.m56802c(cls) : C11677s.m56801b(cls);
    }

    public List<Object> getParameters() {
        return getReflected().getParameters();
    }

    /* access modifiers changed from: protected */
    public C12889b getReflected() {
        C12889b compute = compute();
        if (compute != this) {
            return compute;
        }
        throw new C12225b();
    }

    public C12895h getReturnType() {
        return getReflected().getReturnType();
    }

    public String getSignature() {
        return this.signature;
    }

    public List<Object> getTypeParameters() {
        return getReflected().getTypeParameters();
    }

    public C12896i getVisibility() {
        return getReflected().getVisibility();
    }

    public boolean isAbstract() {
        return getReflected().isAbstract();
    }

    public boolean isFinal() {
        return getReflected().isFinal();
    }

    public boolean isOpen() {
        return getReflected().isOpen();
    }

    public boolean isSuspend() {
        return getReflected().isSuspend();
    }

    protected C11659c(Object obj) {
        this(obj, (Class) null, (String) null, (String) null, false);
    }

    protected C11659c(Object obj, Class cls, String str, String str2, boolean z) {
        this.receiver = obj;
        this.owner = cls;
        this.name = str;
        this.signature = str2;
        this.isTopLevel = z;
    }
}
