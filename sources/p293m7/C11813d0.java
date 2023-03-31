package p293m7;

import android.app.Activity;
import com.google.firebase.auth.FirebaseAuth;
import p218e6.C9969f;
import p218e6.C9977j;
import p411z5.C13447d;

/* renamed from: m7.d0 */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
final class C11813d0 implements C9969f {

    /* renamed from: a */
    final /* synthetic */ C9977j f44481a;

    /* renamed from: b */
    final /* synthetic */ FirebaseAuth f44482b;

    /* renamed from: c */
    final /* synthetic */ C11851q0 f44483c;

    /* renamed from: d */
    final /* synthetic */ Activity f44484d;

    /* renamed from: e */
    final /* synthetic */ C11859u0 f44485e;

    C11813d0(C11859u0 u0Var, C9977j jVar, FirebaseAuth firebaseAuth, C11851q0 q0Var, Activity activity) {
        this.f44485e = u0Var;
        this.f44481a = jVar;
        this.f44482b = firebaseAuth;
        this.f44483c = q0Var;
        this.f44484d = activity;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo277a(Object obj) {
        C13447d.C13448a aVar = (C13447d.C13448a) obj;
        if (C11831j0.m57248a(aVar)) {
            this.f44481a.mo32544c(new C11857t0(aVar.mo38539c(), (String) null));
        } else {
            this.f44485e.m57337e(this.f44482b, this.f44483c, this.f44484d, this.f44481a);
        }
    }
}
