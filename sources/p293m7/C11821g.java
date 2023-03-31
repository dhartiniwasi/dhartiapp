package p293m7;

import com.google.firebase.auth.C7810i;
import com.google.firebase.auth.C7859w;
import p218e6.C9959a;
import p218e6.C9975i;
import p218e6.C9980l;

/* renamed from: m7.g */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
final class C11821g implements C9959a {

    /* renamed from: a */
    final /* synthetic */ C11824h f44496a;

    C11821g(C11824h hVar) {
        this.f44496a = hVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo279a(C9975i iVar) throws Exception {
        if (this.f44496a.f44503d == null) {
            return iVar;
        }
        if (iVar.mo26362q()) {
            C7810i iVar2 = (C7810i) iVar.mo26358m();
            return C9980l.m51031e(new C11823g1((C11841m1) iVar2.mo26107g1(), (C11817e1) iVar2.mo26105B0(), this.f44496a.f44503d));
        }
        Exception l = iVar.mo26357l();
        if (l instanceof C7859w) {
            ((C7859w) l).mo26201d(this.f44496a.f44503d);
        }
        return C9980l.m51030d(l);
    }
}
