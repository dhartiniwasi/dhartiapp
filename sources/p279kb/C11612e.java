package p279kb;

import p186ac.C6555j;
import p186ac.C6556k;

/* renamed from: kb.e */
/* compiled from: ConnectivityMethodChannelHandler */
class C11612e implements C6556k.C6560c {

    /* renamed from: a */
    private final C11607a f44160a;

    C11612e(C11607a aVar) {
        this.f44160a = aVar;
    }

    public void onMethodCall(C6555j jVar, C6556k.C6561d dVar) {
        if ("check".equals(jVar.f30999a)) {
            dVar.success(this.f44160a.mo35777b());
        } else {
            dVar.notImplemented();
        }
    }
}
