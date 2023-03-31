package p417zb;

import java.util.HashMap;
import p186ac.C6555j;
import p186ac.C6556k;
import p186ac.C6570s;
import p297mb.C11881b;
import p315ob.C12051a;

/* renamed from: zb.g */
/* compiled from: MouseCursorChannel */
public class C13505g {

    /* renamed from: a */
    public final C6556k f47905a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public C13507b f47906b;

    /* renamed from: c */
    private final C6556k.C6560c f47907c;

    /* renamed from: zb.g$a */
    /* compiled from: MouseCursorChannel */
    class C13506a implements C6556k.C6560c {
        C13506a() {
        }

        public void onMethodCall(C6555j jVar, C6556k.C6561d dVar) {
            if (C13505g.this.f47906b != null) {
                String str = jVar.f30999a;
                C11881b.m57388f("MouseCursorChannel", "Received '" + str + "' message.");
                char c = 65535;
                try {
                    if (str.hashCode() == -1307105544) {
                        if (str.equals("activateSystemCursor")) {
                            c = 0;
                        }
                    }
                    if (c == 0) {
                        try {
                            C13505g.this.f47906b.mo22959a((String) ((HashMap) jVar.f31000b).get("kind"));
                            dVar.success(Boolean.TRUE);
                        } catch (Exception e) {
                            dVar.error("error", "Error when setting cursors: " + e.getMessage(), (Object) null);
                        }
                    }
                } catch (Exception e2) {
                    dVar.error("error", "Unhandled error: " + e2.getMessage(), (Object) null);
                }
            }
        }
    }

    /* renamed from: zb.g$b */
    /* compiled from: MouseCursorChannel */
    public interface C13507b {
        /* renamed from: a */
        void mo22959a(String str);
    }

    public C13505g(C12051a aVar) {
        C13506a aVar2 = new C13506a();
        this.f47907c = aVar2;
        C6556k kVar = new C6556k(aVar, "flutter/mousecursor", C6570s.f31014b);
        this.f47905a = kVar;
        kVar.mo22161e(aVar2);
    }

    /* renamed from: b */
    public void mo38635b(C13507b bVar) {
        this.f47906b = bVar;
    }
}
