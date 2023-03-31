package p410yd;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.jvm.internal.C11665g;

/* renamed from: yd.v */
/* compiled from: CompletionState.kt */
public class C13355v {

    /* renamed from: b */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f47675b = AtomicIntegerFieldUpdater.newUpdater(C13355v.class, "_handled");
    private volatile /* synthetic */ int _handled;

    /* renamed from: a */
    public final Throwable f47676a;

    public C13355v(Throwable th, boolean z) {
        this.f47676a = th;
        this._handled = z ? 1 : 0;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [int, boolean] */
    /* renamed from: a */
    public final boolean mo38490a() {
        return this._handled;
    }

    /* renamed from: b */
    public final boolean mo38491b() {
        return f47675b.compareAndSet(this, 0, 1);
    }

    public String toString() {
        return C13333o0.m62287a(this) + '[' + this.f47676a + ']';
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C13355v(Throwable th, boolean z, int i, C11665g gVar) {
        this(th, (i & 2) != 0 ? false : z);
    }
}
