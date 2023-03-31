package p186ac;

import java.nio.ByteBuffer;
import p186ac.C6539c;
import p297mb.C11881b;

/* renamed from: ac.k */
/* compiled from: MethodChannel */
public class C6556k {

    /* renamed from: a */
    private final C6539c f31001a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final String f31002b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final C6562l f31003c;

    /* renamed from: d */
    private final C6539c.C6542c f31004d;

    /* renamed from: ac.k$a */
    /* compiled from: MethodChannel */
    private final class C6557a implements C6539c.C6540a {

        /* renamed from: a */
        private final C6560c f31005a;

        /* renamed from: ac.k$a$a */
        /* compiled from: MethodChannel */
        class C6558a implements C6561d {

            /* renamed from: a */
            final /* synthetic */ C6539c.C6541b f31007a;

            C6558a(C6539c.C6541b bVar) {
                this.f31007a = bVar;
            }

            public void error(String str, String str2, Object obj) {
                this.f31007a.mo22132a(C6556k.this.f31003c.mo22152d(str, str2, obj));
            }

            public void notImplemented() {
                this.f31007a.mo22132a((ByteBuffer) null);
            }

            public void success(Object obj) {
                this.f31007a.mo22132a(C6556k.this.f31003c.mo22150b(obj));
            }
        }

        C6557a(C6560c cVar) {
            this.f31005a = cVar;
        }

        /* renamed from: a */
        public void mo22130a(ByteBuffer byteBuffer, C6539c.C6541b bVar) {
            try {
                this.f31005a.onMethodCall(C6556k.this.f31003c.mo22149a(byteBuffer), new C6558a(bVar));
            } catch (RuntimeException e) {
                C11881b.m57385c("MethodChannel#" + C6556k.this.f31002b, "Failed to handle method call", e);
                bVar.mo22132a(C6556k.this.f31003c.mo22151c("error", e.getMessage(), (Object) null, C11881b.m57386d(e)));
            }
        }
    }

    /* renamed from: ac.k$b */
    /* compiled from: MethodChannel */
    private final class C6559b implements C6539c.C6541b {

        /* renamed from: a */
        private final C6561d f31009a;

        C6559b(C6561d dVar) {
            this.f31009a = dVar;
        }

        /* renamed from: a */
        public void mo22132a(ByteBuffer byteBuffer) {
            if (byteBuffer == null) {
                try {
                    this.f31009a.notImplemented();
                } catch (RuntimeException e) {
                    C11881b.m57385c("MethodChannel#" + C6556k.this.f31002b, "Failed to handle method call result", e);
                }
            } else {
                try {
                    this.f31009a.success(C6556k.this.f31003c.mo22154f(byteBuffer));
                } catch (C6550e e2) {
                    this.f31009a.error(e2.f30995a, e2.getMessage(), e2.f30996b);
                }
            }
        }
    }

    /* renamed from: ac.k$c */
    /* compiled from: MethodChannel */
    public interface C6560c {
        void onMethodCall(C6555j jVar, C6561d dVar);
    }

    /* renamed from: ac.k$d */
    /* compiled from: MethodChannel */
    public interface C6561d {
        void error(String str, String str2, Object obj);

        void notImplemented();

        void success(Object obj);
    }

    public C6556k(C6539c cVar, String str) {
        this(cVar, str, C6570s.f31014b);
    }

    /* renamed from: c */
    public void mo22159c(String str, Object obj) {
        mo22160d(str, obj, (C6561d) null);
    }

    /* renamed from: d */
    public void mo22160d(String str, Object obj, C6561d dVar) {
        C6559b bVar;
        C6539c cVar = this.f31001a;
        String str2 = this.f31002b;
        ByteBuffer e = this.f31003c.mo22153e(new C6555j(str, obj));
        if (dVar == null) {
            bVar = null;
        } else {
            bVar = new C6559b(dVar);
        }
        cVar.mo22138f(str2, e, bVar);
    }

    /* renamed from: e */
    public void mo22161e(C6560c cVar) {
        C6557a aVar = null;
        if (this.f31004d != null) {
            C6539c cVar2 = this.f31001a;
            String str = this.f31002b;
            if (cVar != null) {
                aVar = new C6557a(cVar);
            }
            cVar2.mo22136d(str, aVar, this.f31004d);
            return;
        }
        C6539c cVar3 = this.f31001a;
        String str2 = this.f31002b;
        if (cVar != null) {
            aVar = new C6557a(cVar);
        }
        cVar3.mo22139j(str2, aVar);
    }

    public C6556k(C6539c cVar, String str, C6562l lVar) {
        this(cVar, str, lVar, (C6539c.C6542c) null);
    }

    public C6556k(C6539c cVar, String str, C6562l lVar, C6539c.C6542c cVar2) {
        this.f31001a = cVar;
        this.f31002b = str;
        this.f31003c = lVar;
        this.f31004d = cVar2;
    }
}
