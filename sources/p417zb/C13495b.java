package p417zb;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p186ac.C6555j;
import p186ac.C6556k;
import p186ac.C6570s;
import p297mb.C11877a;
import p297mb.C11881b;
import p315ob.C12051a;
import p324pb.C12164a;

/* renamed from: zb.b */
/* compiled from: DeferredComponentChannel */
public class C13495b {

    /* renamed from: a */
    private final C6556k f47891a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public C12164a f47892b = C11877a.m57376e().mo36132a();
    /* access modifiers changed from: private */

    /* renamed from: c */
    public Map<String, List<C6556k.C6561d>> f47893c = new HashMap();

    /* renamed from: d */
    final C6556k.C6560c f47894d;

    /* renamed from: zb.b$a */
    /* compiled from: DeferredComponentChannel */
    class C13496a implements C6556k.C6560c {
        C13496a() {
        }

        public void onMethodCall(C6555j jVar, C6556k.C6561d dVar) {
            if (C13495b.this.f47892b != null) {
                String str = jVar.f30999a;
                Map map = (Map) jVar.mo22157b();
                C11881b.m57388f("DeferredComponentChannel", "Received '" + str + "' message.");
                int intValue = ((Integer) map.get("loadingUnitId")).intValue();
                String str2 = (String) map.get("componentName");
                str.hashCode();
                char c = 65535;
                switch (str.hashCode()) {
                    case -1004447972:
                        if (str.equals("uninstallDeferredComponent")) {
                            c = 0;
                            break;
                        }
                        break;
                    case 399701758:
                        if (str.equals("getDeferredComponentInstallState")) {
                            c = 1;
                            break;
                        }
                        break;
                    case 520962947:
                        if (str.equals("installDeferredComponent")) {
                            c = 2;
                            break;
                        }
                        break;
                }
                switch (c) {
                    case 0:
                        C13495b.this.f47892b.mo36686c(intValue, str2);
                        dVar.success((Object) null);
                        return;
                    case 1:
                        dVar.success(C13495b.this.f47892b.mo36685b(intValue, str2));
                        return;
                    case 2:
                        C13495b.this.f47892b.mo36684a(intValue, str2);
                        if (!C13495b.this.f47893c.containsKey(str2)) {
                            C13495b.this.f47893c.put(str2, new ArrayList());
                        }
                        ((List) C13495b.this.f47893c.get(str2)).add(dVar);
                        return;
                    default:
                        dVar.notImplemented();
                        return;
                }
            }
        }
    }

    public C13495b(C12051a aVar) {
        C13496a aVar2 = new C13496a();
        this.f47894d = aVar2;
        C6556k kVar = new C6556k(aVar, "flutter/deferredcomponent", C6570s.f31014b);
        this.f47891a = kVar;
        kVar.mo22161e(aVar2);
    }

    /* renamed from: c */
    public void mo38627c(C12164a aVar) {
        this.f47892b = aVar;
    }
}
