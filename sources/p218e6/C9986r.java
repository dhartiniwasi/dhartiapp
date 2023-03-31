package p218e6;

import java.util.concurrent.Executor;

/* renamed from: e6.r */
/* compiled from: com.google.android.gms:play-services-tasks@@18.0.2 */
final class C9986r implements C9968e0 {

    /* renamed from: a */
    private final Executor f39930a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C9959a f39931b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final C9976i0 f39932c;

    public C9986r(Executor executor, C9959a aVar, C9976i0 i0Var) {
        this.f39930a = executor;
        this.f39931b = aVar;
        this.f39932c = i0Var;
    }

    /* renamed from: b */
    public final void mo32530b(C9975i iVar) {
        this.f39930a.execute(new C9985q(this, iVar));
    }
}
