package p293m7;

import android.util.Log;
import p218e6.C9967e;
import p218e6.C9977j;

/* renamed from: m7.r0 */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
final class C11853r0 implements C9967e {

    /* renamed from: a */
    final /* synthetic */ C9977j f44569a;

    C11853r0(C11859u0 u0Var, C9977j jVar) {
        this.f44569a = jVar;
    }

    /* renamed from: d */
    public final void mo272d(Exception exc) {
        Log.e(C11859u0.f44579a, String.format("Failed to get reCAPTCHA token with error [%s]- calling backend without app verification", new Object[]{exc.getMessage()}));
        this.f44569a.mo32544c(new C11857t0((String) null, (String) null));
    }
}
