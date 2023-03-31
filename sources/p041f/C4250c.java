package p041f;

import android.content.Context;
import android.content.Intent;
import androidx.activity.result.C0254a;
import kotlin.jvm.internal.C11665g;
import kotlin.jvm.internal.C11669k;

/* renamed from: f.c */
/* compiled from: ActivityResultContracts.kt */
public final class C4250c extends C4246a<Intent, C0254a> {

    /* renamed from: a */
    public static final C4251a f23614a = new C4251a((C11665g) null);

    /* renamed from: f.c$a */
    /* compiled from: ActivityResultContracts.kt */
    public static final class C4251a {
        private C4251a() {
        }

        public /* synthetic */ C4251a(C11665g gVar) {
            this();
        }
    }

    /* renamed from: d */
    public Intent mo4184a(Context context, Intent intent) {
        C11669k.m56787e(context, "context");
        C11669k.m56787e(intent, "input");
        return intent;
    }

    /* renamed from: e */
    public C0254a mo4185c(int i, Intent intent) {
        return new C0254a(i, intent);
    }
}
