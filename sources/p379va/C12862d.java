package p379va;

import p186ac.C6555j;
import p186ac.C6556k;

/* renamed from: va.d */
/* compiled from: MethodCallOperation */
public class C12862d extends C12858a {

    /* renamed from: a */
    public final C12863a f46976a;

    /* renamed from: b */
    final C6555j f46977b;

    /* renamed from: va.d$a */
    /* compiled from: MethodCallOperation */
    class C12863a implements C12865f {

        /* renamed from: a */
        final C6556k.C6561d f46978a;

        C12863a(C6556k.C6561d dVar) {
            this.f46978a = dVar;
        }

        public void error(String str, String str2, Object obj) {
            this.f46978a.error(str, str2, obj);
        }

        public void success(Object obj) {
            this.f46978a.success(obj);
        }
    }

    public C12862d(C6555j jVar, C6556k.C6561d dVar) {
        this.f46977b = jVar;
        this.f46976a = new C12863a(dVar);
    }

    /* renamed from: a */
    public <T> T mo37876a(String str) {
        return this.f46977b.mo22156a(str);
    }

    /* renamed from: f */
    public String mo37877f() {
        return this.f46977b.f30999a;
    }

    /* renamed from: g */
    public boolean mo37878g(String str) {
        return this.f46977b.mo22158c(str);
    }

    /* renamed from: m */
    public C12865f mo37867m() {
        return this.f46976a;
    }
}
