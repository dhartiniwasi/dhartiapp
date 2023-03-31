package kotlinx.coroutines.internal;

import kotlin.jvm.internal.C11669k;
import p243gd.C10331d;
import p272jd.C11570g;
import p410yd.C13344r0;
import p410yd.C13372z1;

/* renamed from: kotlinx.coroutines.internal.x */
/* compiled from: MainDispatchers.kt */
final class C11732x extends C13372z1 implements C13344r0 {

    /* renamed from: b */
    private final Throwable f44317b;

    /* renamed from: c */
    private final String f44318c;

    public C11732x(Throwable th, String str) {
        this.f44317b = th;
        this.f44318c = str;
    }

    /* renamed from: U */
    private final Void m56979U() {
        String j;
        if (this.f44317b != null) {
            String str = this.f44318c;
            String str2 = "";
            if (!(str == null || (j = C11669k.m56792j(". ", str)) == null)) {
                str2 = j;
            }
            throw new IllegalStateException(C11669k.m56792j("Module with the Main dispatcher had failed to initialize", str2), this.f44317b);
        }
        C11731w.m56977d();
        throw new C10331d();
    }

    /* renamed from: I */
    public boolean mo35954I(C11570g gVar) {
        m56979U();
        throw new C10331d();
    }

    /* renamed from: L */
    public C13372z1 mo35955L() {
        return this;
    }

    /* renamed from: S */
    public Void mo35925H(C11570g gVar, Runnable runnable) {
        m56979U();
        throw new C10331d();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Dispatchers.Main[missing");
        Throwable th = this.f44317b;
        sb.append(th != null ? C11669k.m56792j(", cause=", th) : "");
        sb.append(']');
        return sb.toString();
    }
}
