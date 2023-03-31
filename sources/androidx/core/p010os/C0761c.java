package androidx.core.p010os;

import android.os.Bundle;
import android.util.Size;
import android.util.SizeF;
import kotlin.jvm.internal.C11669k;

/* renamed from: androidx.core.os.c */
/* compiled from: Bundle.kt */
final class C0761c {

    /* renamed from: a */
    public static final C0761c f2325a = new C0761c();

    private C0761c() {
    }

    /* renamed from: a */
    public static final void m3509a(Bundle bundle, String str, Size size) {
        C11669k.m56787e(bundle, "bundle");
        C11669k.m56787e(str, "key");
        bundle.putSize(str, size);
    }

    /* renamed from: b */
    public static final void m3510b(Bundle bundle, String str, SizeF sizeF) {
        C11669k.m56787e(bundle, "bundle");
        C11669k.m56787e(str, "key");
        bundle.putSizeF(str, sizeF);
    }
}
