package p109o5;

import android.content.Context;
import p007a5.C0104a;
import p150u4.C5746b;
import p150u4.C5747c;
import p180z4.C6370f;
import p218e6.C9975i;
import p218e6.C9980l;

/* renamed from: o5.r */
/* compiled from: com.google.android.gms:play-services-appset@@16.0.0 */
public final class C5242r implements C5746b {

    /* renamed from: a */
    private final C5746b f27099a;

    /* renamed from: b */
    private final C5746b f27100b;

    public C5242r(Context context) {
        this.f27099a = new C5240p(context, C6370f.m37437h());
        this.f27100b = C5236l.m32420d(context);
    }

    /* renamed from: b */
    public static /* synthetic */ C9975i m32432b(C5242r rVar, C9975i iVar) {
        if (iVar.mo26362q() || iVar.mo26360o()) {
            return iVar;
        }
        Exception l = iVar.mo26357l();
        if (!(l instanceof C0104a)) {
            return iVar;
        }
        int b = ((C0104a) l).mo252b();
        if (b == 43001 || b == 43002 || b == 43003 || b == 17) {
            return rVar.f27100b.mo19226a();
        }
        if (b == 43000) {
            return C9980l.m51030d(new Exception("Failed to get app set ID due to an internal error. Please try again later."));
        }
        if (b != 15) {
            return iVar;
        }
        return C9980l.m51030d(new Exception("The operation to get app set ID timed out. Please try again later."));
    }

    /* renamed from: a */
    public final C9975i<C5747c> mo19226a() {
        return this.f27099a.mo19226a().mo26355j(new C5241q(this));
    }
}
