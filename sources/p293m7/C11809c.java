package p293m7;

import android.app.Activity;
import android.util.Log;
import com.google.firebase.auth.FirebaseAuth;
import p218e6.C9967e;
import p218e6.C9977j;

/* renamed from: m7.c */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
final class C11809c implements C9967e {

    /* renamed from: a */
    final /* synthetic */ FirebaseAuth f44474a;

    /* renamed from: b */
    final /* synthetic */ C11851q0 f44475b;

    /* renamed from: c */
    final /* synthetic */ Activity f44476c;

    /* renamed from: d */
    final /* synthetic */ C9977j f44477d;

    /* renamed from: e */
    final /* synthetic */ C11859u0 f44478e;

    C11809c(C11859u0 u0Var, FirebaseAuth firebaseAuth, C11851q0 q0Var, Activity activity, C9977j jVar) {
        this.f44478e = u0Var;
        this.f44474a = firebaseAuth;
        this.f44475b = q0Var;
        this.f44476c = activity;
        this.f44477d = jVar;
    }

    /* renamed from: d */
    public final void mo272d(Exception exc) {
        Log.e(C11859u0.f44579a, "Problem retrieving SafetyNet Token: ".concat(String.valueOf(exc.getMessage())));
        this.f44478e.m57337e(this.f44474a, this.f44475b, this.f44476c, this.f44477d);
    }
}
