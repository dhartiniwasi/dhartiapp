package kotlinx.coroutines.internal;

import kotlin.jvm.internal.C11669k;

/* renamed from: kotlinx.coroutines.internal.o */
/* compiled from: LimitedDispatcher.kt */
public final class C11718o {
    /* renamed from: a */
    public static final void m56932a(int i) {
        boolean z = true;
        if (i < 1) {
            z = false;
        }
        if (!z) {
            throw new IllegalArgumentException(C11669k.m56792j("Expected positive parallelism level, but got ", Integer.valueOf(i)).toString());
        }
    }
}
