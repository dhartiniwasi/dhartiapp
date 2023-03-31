package androidx.core.p010os;

import android.os.Bundle;
import android.os.IBinder;
import kotlin.jvm.internal.C11669k;

/* renamed from: androidx.core.os.b */
/* compiled from: Bundle.kt */
final class C0760b {

    /* renamed from: a */
    public static final C0760b f2324a = new C0760b();

    private C0760b() {
    }

    /* renamed from: a */
    public static final void m3508a(Bundle bundle, String str, IBinder iBinder) {
        C11669k.m56787e(bundle, "bundle");
        C11669k.m56787e(str, "key");
        bundle.putBinder(str, iBinder);
    }
}
