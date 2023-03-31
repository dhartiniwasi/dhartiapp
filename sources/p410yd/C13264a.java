package p410yd;

import kotlin.jvm.internal.C11669k;
import p272jd.C11565d;
import p272jd.C11570g;
import p344rd.C12439l;
import p344rd.C12443p;

/* renamed from: yd.a */
/* compiled from: AbstractCoroutine.kt */
public abstract class C13264a<T> extends C13360w1 implements C11565d<T>, C13313j0 {

    /* renamed from: b */
    private final C11570g f47595b;

    public C13264a(C11570g gVar, boolean z, boolean z2) {
        super(z2);
        if (z) {
            mo38503T((C13337p1) gVar.get(C13337p1.f47660Z));
        }
        this.f47595b = gVar.plus(this);
    }

    /* access modifiers changed from: protected */
    /* renamed from: B */
    public String mo38372B() {
        return C11669k.m56792j(C13333o0.m62287a(this), " was cancelled");
    }

    /* renamed from: S */
    public final void mo38373S(Throwable th) {
        C13297g0.m62201a(this.f47595b, th);
    }

    /* renamed from: Z */
    public String mo38374Z() {
        String b = C13275c0.m62172b(this.f47595b);
        if (b == null) {
            return super.mo38374Z();
        }
        return '\"' + b + "\":" + super.mo38374Z();
    }

    /* renamed from: b */
    public boolean mo38375b() {
        return super.mo38375b();
    }

    /* renamed from: d */
    public C11570g mo35888d() {
        return this.f47595b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e0 */
    public final void mo38376e0(Object obj) {
        if (obj instanceof C13355v) {
            C13355v vVar = (C13355v) obj;
            mo38377v0(vVar.f47676a, vVar.mo38490a());
            return;
        }
        mo38378w0(obj);
    }

    public final C11570g getContext() {
        return this.f47595b;
    }

    public final void resumeWith(Object obj) {
        Object X = mo38505X(C13370z.m62447d(obj, (C12439l) null, 1, (Object) null));
        if (X != C13366x1.f47695b) {
            mo35884u0(X);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: u0 */
    public void mo35884u0(Object obj) {
        mo35883u(obj);
    }

    /* access modifiers changed from: protected */
    /* renamed from: v0 */
    public void mo38377v0(Throwable th, boolean z) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: w0 */
    public void mo38378w0(T t) {
    }

    /* renamed from: x0 */
    public final <R> void mo38379x0(C13323l0 l0Var, R r, C12443p<? super R, ? super C11565d<? super T>, ? extends Object> pVar) {
        l0Var.mo38461b(pVar, r, this);
    }
}
