package kotlinx.coroutines.internal;

import java.util.List;
import p243gd.C10331d;
import p410yd.C13372z1;

/* renamed from: kotlinx.coroutines.internal.w */
/* compiled from: MainDispatchers.kt */
public final class C11731w {

    /* renamed from: a */
    private static final boolean f44316a = true;

    /* renamed from: a */
    private static final C11732x m56974a(Throwable th, String str) {
        if (f44316a) {
            return new C11732x(th, str);
        }
        if (th == null) {
            m56977d();
            throw new C10331d();
        }
        throw th;
    }

    /* renamed from: b */
    static /* synthetic */ C11732x m56975b(Throwable th, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            th = null;
        }
        if ((i & 2) != 0) {
            str = null;
        }
        return m56974a(th, str);
    }

    /* renamed from: c */
    public static final boolean m56976c(C13372z1 z1Var) {
        return z1Var.mo35955L() instanceof C11732x;
    }

    /* renamed from: d */
    public static final Void m56977d() {
        throw new IllegalStateException("Module with the Main dispatcher is missing. Add dependency providing the Main dispatcher, e.g. 'kotlinx-coroutines-android' and ensure it has the same version as 'kotlinx-coroutines-core'");
    }

    /* renamed from: e */
    public static final C13372z1 m56978e(C11729u uVar, List<? extends C11729u> list) {
        try {
            return uVar.createDispatcher(list);
        } catch (Throwable th) {
            return m56974a(th, uVar.hintOnError());
        }
    }
}
