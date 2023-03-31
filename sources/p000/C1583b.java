package p000;

import android.util.Log;
import kotlin.jvm.internal.C11669k;

/* renamed from: b */
/* compiled from: Logger.kt */
public final class C1583b {

    /* renamed from: a */
    public static final C1583b f4571a = new C1583b();

    /* renamed from: b */
    private static C0000a f4572b = C0000a.ERROR;

    private C1583b() {
    }

    /* renamed from: c */
    private final void m7321c(C0000a aVar, String str, Throwable th) {
        if (aVar.mo1b() <= f4572b.mo1b()) {
            Log.d("AudioPlayers", str, th);
        }
    }

    /* renamed from: d */
    static /* synthetic */ void m7322d(C1583b bVar, C0000a aVar, String str, Throwable th, int i, Object obj) {
        if ((i & 4) != 0) {
            th = null;
        }
        bVar.m7321c(aVar, str, th);
    }

    /* renamed from: a */
    public final void mo6401a(String str, Throwable th) {
        C11669k.m56787e(str, "message");
        C11669k.m56787e(th, "throwable");
        m7321c(C0000a.ERROR, str, th);
    }

    /* renamed from: b */
    public final void mo6402b(String str) {
        C11669k.m56787e(str, "message");
        m7322d(this, C0000a.INFO, str, (Throwable) null, 4, (Object) null);
    }

    /* renamed from: e */
    public final void mo6403e(C0000a aVar) {
        C11669k.m56787e(aVar, "<set-?>");
        f4572b = aVar;
    }
}
