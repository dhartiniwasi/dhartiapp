package p144t5;

import java.util.concurrent.atomic.AtomicReference;
import p403y6.C13059f;

/* renamed from: t5.c0 */
/* compiled from: com.google.android.ump:user-messaging-platform@@2.0.0 */
public final class C5536c0 {

    /* renamed from: a */
    private final C5579n1<C5595t> f28070a;

    /* renamed from: b */
    private final AtomicReference<C5544e0> f28071b = new AtomicReference<>();

    C5536c0(C5579n1<C5595t> n1Var) {
        this.f28070a = n1Var;
    }

    /* renamed from: a */
    public final void mo19839a(C13059f.C13061b bVar, C13059f.C13060a aVar) {
        C5553g1.m33607a();
        C5544e0 e0Var = this.f28071b.get();
        if (e0Var == null) {
            aVar.mo19909b(new C5600u1(3, "No available form can be built.").mo19895a());
            return;
        }
        C5595t d = this.f28070a.mo19832d();
        d.mo19864a(e0Var);
        d.mo19865d().zza().mo19913c(bVar, aVar);
    }

    /* renamed from: b */
    public final void mo19840b(C5544e0 e0Var) {
        this.f28071b.set(e0Var);
    }

    /* renamed from: c */
    public final boolean mo19841c() {
        return this.f28071b.get() != null;
    }
}
