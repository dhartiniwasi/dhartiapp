package p186ac;

import java.nio.ByteBuffer;
import p186ac.C6539c;
import p297mb.C11881b;

/* renamed from: ac.a */
/* compiled from: BasicMessageChannel */
public final class C6531a<T> {

    /* renamed from: a */
    private final C6539c f30975a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final String f30976b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final C6554i<T> f30977c;

    /* renamed from: d */
    private final C6539c.C6542c f30978d;

    /* renamed from: ac.a$b */
    /* compiled from: BasicMessageChannel */
    private final class C6533b implements C6539c.C6540a {

        /* renamed from: a */
        private final C6536d<T> f30979a;

        /* renamed from: ac.a$b$a */
        /* compiled from: BasicMessageChannel */
        class C6534a implements C6537e<T> {

            /* renamed from: a */
            final /* synthetic */ C6539c.C6541b f30981a;

            C6534a(C6539c.C6541b bVar) {
                this.f30981a = bVar;
            }

            /* renamed from: a */
            public void mo22131a(T t) {
                this.f30981a.mo22132a(C6531a.this.f30977c.mo22147a(t));
            }
        }

        /* renamed from: a */
        public void mo22130a(ByteBuffer byteBuffer, C6539c.C6541b bVar) {
            try {
                this.f30979a.mo22133a(C6531a.this.f30977c.mo22148b(byteBuffer), new C6534a(bVar));
            } catch (RuntimeException e) {
                C11881b.m57385c("BasicMessageChannel#" + C6531a.this.f30976b, "Failed to handle message", e);
                bVar.mo22132a((ByteBuffer) null);
            }
        }

        private C6533b(C6536d<T> dVar) {
            this.f30979a = dVar;
        }
    }

    /* renamed from: ac.a$c */
    /* compiled from: BasicMessageChannel */
    private final class C6535c implements C6539c.C6541b {

        /* renamed from: a */
        private final C6537e<T> f30983a;

        /* renamed from: a */
        public void mo22132a(ByteBuffer byteBuffer) {
            try {
                this.f30983a.mo22131a(C6531a.this.f30977c.mo22148b(byteBuffer));
            } catch (RuntimeException e) {
                C11881b.m57385c("BasicMessageChannel#" + C6531a.this.f30976b, "Failed to handle message reply", e);
            }
        }

        private C6535c(C6537e<T> eVar) {
            this.f30983a = eVar;
        }
    }

    /* renamed from: ac.a$d */
    /* compiled from: BasicMessageChannel */
    public interface C6536d<T> {
        /* renamed from: a */
        void mo22133a(T t, C6537e<T> eVar);
    }

    /* renamed from: ac.a$e */
    /* compiled from: BasicMessageChannel */
    public interface C6537e<T> {
        /* renamed from: a */
        void mo22131a(T t);
    }

    public C6531a(C6539c cVar, String str, C6554i<T> iVar) {
        this(cVar, str, iVar, (C6539c.C6542c) null);
    }

    /* renamed from: c */
    public void mo22127c(T t) {
        mo22128d(t, (C6537e) null);
    }

    /* renamed from: d */
    public void mo22128d(T t, C6537e<T> eVar) {
        C6539c cVar = this.f30975a;
        String str = this.f30976b;
        ByteBuffer a = this.f30977c.mo22147a(t);
        C6535c cVar2 = null;
        if (eVar != null) {
            cVar2 = new C6535c(eVar);
        }
        cVar.mo22138f(str, a, cVar2);
    }

    /* renamed from: e */
    public void mo22129e(C6536d<T> dVar) {
        C6533b bVar = null;
        if (this.f30978d != null) {
            C6539c cVar = this.f30975a;
            String str = this.f30976b;
            if (dVar != null) {
                bVar = new C6533b(dVar);
            }
            cVar.mo22136d(str, bVar, this.f30978d);
            return;
        }
        C6539c cVar2 = this.f30975a;
        String str2 = this.f30976b;
        if (dVar != null) {
            bVar = new C6533b(dVar);
        }
        cVar2.mo22139j(str2, bVar);
    }

    public C6531a(C6539c cVar, String str, C6554i<T> iVar, C6539c.C6542c cVar2) {
        this.f30975a = cVar;
        this.f30976b = str;
        this.f30977c = iVar;
        this.f30978d = cVar2;
    }
}
