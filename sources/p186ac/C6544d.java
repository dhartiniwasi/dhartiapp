package p186ac;

import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import p186ac.C6539c;
import p297mb.C11881b;

/* renamed from: ac.d */
/* compiled from: EventChannel */
public final class C6544d {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C6539c f30986a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final String f30987b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final C6562l f30988c;

    /* renamed from: d */
    private final C6539c.C6542c f30989d;

    /* renamed from: ac.d$b */
    /* compiled from: EventChannel */
    public interface C6546b {
        /* renamed from: a */
        void mo22142a();

        void error(String str, String str2, Object obj);

        void success(Object obj);
    }

    /* renamed from: ac.d$c */
    /* compiled from: EventChannel */
    private final class C6547c implements C6539c.C6540a {

        /* renamed from: a */
        private final C6549d f30990a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public final AtomicReference<C6546b> f30991b = new AtomicReference<>((Object) null);

        /* renamed from: ac.d$c$a */
        /* compiled from: EventChannel */
        private final class C6548a implements C6546b {

            /* renamed from: a */
            final AtomicBoolean f30993a;

            private C6548a() {
                this.f30993a = new AtomicBoolean(false);
            }

            /* renamed from: a */
            public void mo22142a() {
                if (!this.f30993a.getAndSet(true) && C6547c.this.f30991b.get() == this) {
                    C6544d.this.f30986a.mo22137e(C6544d.this.f30987b, (ByteBuffer) null);
                }
            }

            public void error(String str, String str2, Object obj) {
                if (!this.f30993a.get() && C6547c.this.f30991b.get() == this) {
                    C6544d.this.f30986a.mo22137e(C6544d.this.f30987b, C6544d.this.f30988c.mo22152d(str, str2, obj));
                }
            }

            public void success(Object obj) {
                if (!this.f30993a.get() && C6547c.this.f30991b.get() == this) {
                    C6544d.this.f30986a.mo22137e(C6544d.this.f30987b, C6544d.this.f30988c.mo22150b(obj));
                }
            }
        }

        C6547c(C6549d dVar) {
            this.f30990a = dVar;
        }

        /* renamed from: c */
        private void m38056c(Object obj, C6539c.C6541b bVar) {
            if (this.f30991b.getAndSet((Object) null) != null) {
                try {
                    this.f30990a.mo22146i(obj);
                    bVar.mo22132a(C6544d.this.f30988c.mo22150b((Object) null));
                } catch (RuntimeException e) {
                    C11881b.m57385c("EventChannel#" + C6544d.this.f30987b, "Failed to close event stream", e);
                    bVar.mo22132a(C6544d.this.f30988c.mo22152d("error", e.getMessage(), (Object) null));
                }
            } else {
                bVar.mo22132a(C6544d.this.f30988c.mo22152d("error", "No active stream to cancel", (Object) null));
            }
        }

        /* renamed from: d */
        private void m38057d(Object obj, C6539c.C6541b bVar) {
            C6548a aVar = new C6548a();
            if (this.f30991b.getAndSet(aVar) != null) {
                try {
                    this.f30990a.mo22146i((Object) null);
                } catch (RuntimeException e) {
                    C11881b.m57385c("EventChannel#" + C6544d.this.f30987b, "Failed to close existing event stream", e);
                }
            }
            try {
                this.f30990a.mo22145e(obj, aVar);
                bVar.mo22132a(C6544d.this.f30988c.mo22150b((Object) null));
            } catch (RuntimeException e2) {
                this.f30991b.set((Object) null);
                C11881b.m57385c("EventChannel#" + C6544d.this.f30987b, "Failed to open event stream", e2);
                bVar.mo22132a(C6544d.this.f30988c.mo22152d("error", e2.getMessage(), (Object) null));
            }
        }

        /* renamed from: a */
        public void mo22130a(ByteBuffer byteBuffer, C6539c.C6541b bVar) {
            C6555j a = C6544d.this.f30988c.mo22149a(byteBuffer);
            if (a.f30999a.equals("listen")) {
                m38057d(a.f31000b, bVar);
            } else if (a.f30999a.equals("cancel")) {
                m38056c(a.f31000b, bVar);
            } else {
                bVar.mo22132a((ByteBuffer) null);
            }
        }
    }

    /* renamed from: ac.d$d */
    /* compiled from: EventChannel */
    public interface C6549d {
        /* renamed from: e */
        void mo22145e(Object obj, C6546b bVar);

        /* renamed from: i */
        void mo22146i(Object obj);
    }

    public C6544d(C6539c cVar, String str) {
        this(cVar, str, C6570s.f31014b);
    }

    /* renamed from: d */
    public void mo22141d(C6549d dVar) {
        C6547c cVar = null;
        if (this.f30989d != null) {
            C6539c cVar2 = this.f30986a;
            String str = this.f30987b;
            if (dVar != null) {
                cVar = new C6547c(dVar);
            }
            cVar2.mo22136d(str, cVar, this.f30989d);
            return;
        }
        C6539c cVar3 = this.f30986a;
        String str2 = this.f30987b;
        if (dVar != null) {
            cVar = new C6547c(dVar);
        }
        cVar3.mo22139j(str2, cVar);
    }

    public C6544d(C6539c cVar, String str, C6562l lVar) {
        this(cVar, str, lVar, (C6539c.C6542c) null);
    }

    public C6544d(C6539c cVar, String str, C6562l lVar, C6539c.C6542c cVar2) {
        this.f30986a = cVar;
        this.f30987b = str;
        this.f30988c = lVar;
        this.f30989d = cVar2;
    }
}
