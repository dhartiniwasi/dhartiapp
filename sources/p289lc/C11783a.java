package p289lc;

import java.io.IOException;
import java.util.List;
import java.util.Map;
import p186ac.C6555j;
import p186ac.C6556k;

/* renamed from: lc.a */
/* compiled from: MethodCallHandler */
class C11783a implements C6556k.C6560c {

    /* renamed from: a */
    private C11784b f44427a;

    C11783a(C11784b bVar) {
        this.f44427a = bVar;
    }

    /* renamed from: a */
    private void m57119a(C6555j jVar) throws IllegalArgumentException {
        if (!(jVar.f31000b instanceof Map)) {
            throw new IllegalArgumentException("Map argument expected");
        }
    }

    public void onMethodCall(C6555j jVar, C6556k.C6561d dVar) {
        String str = jVar.f30999a;
        str.hashCode();
        if (str.equals("shareFiles")) {
            m57119a(jVar);
            try {
                this.f44427a.mo36023l((List) jVar.mo22156a("paths"), (List) jVar.mo22156a("mimeTypes"), (String) jVar.mo22156a("text"), (String) jVar.mo22156a("subject"));
                dVar.success((Object) null);
            } catch (IOException e) {
                dVar.error(e.getMessage(), (String) null, (Object) null);
            }
        } else if (!str.equals("share")) {
            dVar.notImplemented();
        } else {
            m57119a(jVar);
            this.f44427a.mo36022k((String) jVar.mo22156a("text"), (String) jVar.mo22156a("subject"));
            dVar.success((Object) null);
        }
    }
}
