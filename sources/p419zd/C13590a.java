package p419zd;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.C11665g;
import kotlin.jvm.internal.C11669k;
import p272jd.C11570g;
import p410yd.C13351t1;
import p410yd.C13365x0;

/* renamed from: zd.a */
/* compiled from: HandlerDispatcher.kt */
public final class C13590a extends C13591b {
    private volatile C13590a _immediate;

    /* renamed from: b */
    private final Handler f48168b;

    /* renamed from: c */
    private final String f48169c;

    /* renamed from: d */
    private final boolean f48170d;

    /* renamed from: e */
    private final C13590a f48171e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private C13590a(Handler handler, String str, boolean z) {
        super((C11665g) null);
        C13590a aVar = null;
        this.f48168b = handler;
        this.f48169c = str;
        this.f48170d = z;
        this._immediate = z ? this : aVar;
        C13590a aVar2 = this._immediate;
        if (aVar2 == null) {
            aVar2 = new C13590a(handler, str, true);
            this._immediate = aVar2;
        }
        this.f48171e = aVar2;
    }

    /* renamed from: S */
    private final void m62915S(C11570g gVar, Runnable runnable) {
        C13351t1.m62328c(gVar, new CancellationException("The task was rejected, the handler underlying the dispatcher '" + this + "' was closed"));
        C13365x0.m62434b().mo35925H(gVar, runnable);
    }

    /* renamed from: H */
    public void mo35925H(C11570g gVar, Runnable runnable) {
        if (!this.f48168b.post(runnable)) {
            m62915S(gVar, runnable);
        }
    }

    /* renamed from: I */
    public boolean mo35954I(C11570g gVar) {
        return !this.f48170d || !C11669k.m56783a(Looper.myLooper(), this.f48168b.getLooper());
    }

    /* renamed from: U */
    public C13590a mo35955L() {
        return this.f48171e;
    }

    public boolean equals(Object obj) {
        return (obj instanceof C13590a) && ((C13590a) obj).f48168b == this.f48168b;
    }

    public int hashCode() {
        return System.identityHashCode(this.f48168b);
    }

    public String toString() {
        String Q = mo38526Q();
        if (Q != null) {
            return Q;
        }
        String str = this.f48169c;
        if (str == null) {
            str = this.f48168b.toString();
        }
        return this.f48170d ? C11669k.m56792j(str, ".immediate") : str;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C13590a(Handler handler, String str, int i, C11665g gVar) {
        this(handler, (i & 2) != 0 ? null : str);
    }

    public C13590a(Handler handler, String str) {
        this(handler, str, false);
    }
}
