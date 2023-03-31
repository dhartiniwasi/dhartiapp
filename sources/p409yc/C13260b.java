package p409yc;

import java.util.concurrent.Executor;
import p182a7.C6431n;
import p343rc.C12287b;
import p343rc.C12292c;
import p343rc.C12301d;
import p409yc.C13260b;

/* renamed from: yc.b */
/* compiled from: AbstractStub */
public abstract class C13260b<S extends C13260b<S>> {

    /* renamed from: a */
    private final C12301d f47586a;

    /* renamed from: b */
    private final C12292c f47587b;

    /* renamed from: yc.b$a */
    /* compiled from: AbstractStub */
    public interface C13261a<T extends C13260b<T>> {
        /* renamed from: a */
        T mo38212a(C12301d dVar, C12292c cVar);
    }

    protected C13260b(C12301d dVar, C12292c cVar) {
        this.f47586a = (C12301d) C6431n.m37562o(dVar, "channel");
        this.f47587b = (C12292c) C6431n.m37562o(cVar, "callOptions");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract S mo38214a(C12301d dVar, C12292c cVar);

    /* renamed from: b */
    public final C12292c mo38369b() {
        return this.f47587b;
    }

    /* renamed from: c */
    public final S mo38370c(C12287b bVar) {
        return mo38214a(this.f47586a, this.f47587b.mo36966k(bVar));
    }

    /* renamed from: d */
    public final S mo38371d(Executor executor) {
        return mo38214a(this.f47586a, this.f47587b.mo36968m(executor));
    }
}
