package p041f;

import android.content.Context;
import android.content.Intent;
import kotlin.jvm.internal.C11669k;

/* renamed from: f.a */
/* compiled from: ActivityResultContract.kt */
public abstract class C4246a<I, O> {

    /* renamed from: f.a$a */
    /* compiled from: ActivityResultContract.kt */
    public static final class C4247a<T> {

        /* renamed from: a */
        private final T f23612a;

        public C4247a(T t) {
            this.f23612a = t;
        }

        /* renamed from: a */
        public final T mo17612a() {
            return this.f23612a;
        }
    }

    /* renamed from: a */
    public abstract Intent mo4184a(Context context, I i);

    /* renamed from: b */
    public C4247a<O> mo17611b(Context context, I i) {
        C11669k.m56787e(context, "context");
        return null;
    }

    /* renamed from: c */
    public abstract O mo4185c(int i, Intent intent);
}
