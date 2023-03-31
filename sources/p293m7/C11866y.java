package p293m7;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.p026firebaseauthapi.C3847vs;
import com.google.firebase.auth.C7869z;
import com.google.firebase.auth.FirebaseAuth;
import java.lang.ref.WeakReference;
import p218e6.C9977j;

/* renamed from: m7.y */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
final class C11866y extends BroadcastReceiver {

    /* renamed from: a */
    private final WeakReference f44592a;

    /* renamed from: b */
    private final C9977j f44593b;

    /* renamed from: c */
    private final FirebaseAuth f44594c;

    /* renamed from: d */
    private final C7869z f44595d;

    /* renamed from: e */
    final /* synthetic */ C11804a0 f44596e;

    C11866y(C11804a0 a0Var, Activity activity, C9977j jVar, FirebaseAuth firebaseAuth, C7869z zVar) {
        this.f44596e = a0Var;
        this.f44592a = new WeakReference(activity);
        this.f44593b = jVar;
        this.f44594c = firebaseAuth;
        this.f44595d = zVar;
    }

    public final void onReceive(Context context, Intent intent) {
        if (((Activity) this.f44592a.get()) == null) {
            Log.e("FederatedAuthReceiver", "Failed to unregister BroadcastReceiver because the Activity that launched this flow has been garbage collected; please do not finish() your Activity while performing a FederatedAuthProvider operation.");
            this.f44593b.mo32543b(C3847vs.m27245a(new Status(17499, "Activity that started the web operation is no longer alive; see logcat for details")));
            C11804a0.m57188e(context);
        } else if (intent.hasExtra("com.google.firebase.auth.internal.OPERATION")) {
            String stringExtra = intent.getStringExtra("com.google.firebase.auth.internal.OPERATION");
            if ("com.google.firebase.auth.internal.NONGMSCORE_SIGN_IN".equals(stringExtra)) {
                this.f44594c.mo26045y(C11804a0.m57190i(intent)).mo26351f(new C11856t(this.f44596e, this.f44593b, context)).mo26349d(new C11854s(this.f44596e, this.f44593b, context));
            } else if ("com.google.firebase.auth.internal.NONGMSCORE_LINK".equals(stringExtra)) {
                this.f44595d.mo26230P1(C11804a0.m57190i(intent)).mo26351f(new C11860v(this.f44596e, this.f44593b, context)).mo26349d(new C11858u(this.f44596e, this.f44593b, context));
            } else if ("com.google.firebase.auth.internal.NONGMSCORE_REAUTHENTICATE".equals(stringExtra)) {
                this.f44595d.mo26231Q1(C11804a0.m57190i(intent)).mo26351f(new C11864x(this.f44596e, this.f44593b, context)).mo26349d(new C11862w(this.f44596e, this.f44593b, context));
            } else {
                C9977j jVar = this.f44593b;
                jVar.mo32543b(C3847vs.m27245a(C11836l.m57255a("WEB_CONTEXT_CANCELED:Unknown operation received (" + stringExtra + ")")));
            }
        } else if (C11849p0.m57316d(intent)) {
            this.f44593b.mo32543b(C3847vs.m27245a(C11849p0.m57313a(intent)));
            C11804a0.m57188e(context);
        } else if (intent.hasExtra("com.google.firebase.auth.internal.EXTRA_CANCELED")) {
            this.f44593b.mo32543b(C3847vs.m27245a(C11836l.m57255a("WEB_CONTEXT_CANCELED")));
            C11804a0.m57188e(context);
        }
    }
}
