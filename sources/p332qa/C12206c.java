package p332qa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import p186ac.C6539c;
import p186ac.C6555j;
import p186ac.C6556k;
import p351sb.C12502a;

/* renamed from: qa.c */
/* compiled from: AudioSessionPlugin */
public class C12206c implements C12502a, C6556k.C6560c {

    /* renamed from: c */
    private static Map<?, ?> f45319c;

    /* renamed from: d */
    private static List<C12206c> f45320d = new ArrayList();

    /* renamed from: a */
    private C6556k f45321a;

    /* renamed from: b */
    private C12201b f45322b;

    /* renamed from: a */
    private void m58628a(String str, Object... objArr) {
        for (C12206c cVar : f45320d) {
            cVar.f45321a.mo22159c(str, new ArrayList(Arrays.asList(objArr)));
        }
    }

    public void onAttachedToEngine(C12502a.C12504b bVar) {
        C6539c b = bVar.mo37293b();
        C6556k kVar = new C6556k(b, "com.ryanheise.audio_session");
        this.f45321a = kVar;
        kVar.mo22161e(this);
        this.f45322b = new C12201b(bVar.mo37292a(), b);
        f45320d.add(this);
    }

    public void onDetachedFromEngine(C12502a.C12504b bVar) {
        this.f45321a.mo22161e((C6556k.C6560c) null);
        this.f45321a = null;
        this.f45322b.mo36727c();
        this.f45322b = null;
        f45320d.remove(this);
    }

    public void onMethodCall(C6555j jVar, C6556k.C6561d dVar) {
        List list = (List) jVar.f31000b;
        String str = jVar.f30999a;
        str.hashCode();
        if (str.equals("setConfiguration")) {
            f45319c = (Map) list.get(0);
            dVar.success((Object) null);
            m58628a("onConfigurationChanged", f45319c);
        } else if (!str.equals("getConfiguration")) {
            dVar.notImplemented();
        } else {
            dVar.success(f45319c);
        }
    }
}
