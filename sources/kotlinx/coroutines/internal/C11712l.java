package kotlinx.coroutines.internal;

import p243gd.C10341m;
import p243gd.C10344n;

/* renamed from: kotlinx.coroutines.internal.l */
/* compiled from: FastServiceLoader.kt */
public final class C11712l {

    /* renamed from: a */
    private static final boolean f44283a;

    static {
        Object obj;
        try {
            C10341m.C10342a aVar = C10341m.f40958a;
            obj = C10341m.m52240a(Class.forName("android.os.Build"));
        } catch (Throwable th) {
            C10341m.C10342a aVar2 = C10341m.f40958a;
            obj = C10341m.m52240a(C10344n.m52244a(th));
        }
        f44283a = C10341m.m52243d(obj);
    }

    /* renamed from: a */
    public static final boolean m56922a() {
        return f44283a;
    }
}
