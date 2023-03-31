package p293m7;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.p026firebaseauthapi.C3847vs;
import java.lang.ref.WeakReference;
import p218e6.C9977j;

/* renamed from: m7.z */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
final class C11868z extends BroadcastReceiver {

    /* renamed from: a */
    private final WeakReference f44598a;

    /* renamed from: b */
    private final C9977j f44599b;

    /* renamed from: c */
    final /* synthetic */ C11804a0 f44600c;

    C11868z(C11804a0 a0Var, Activity activity, C9977j jVar) {
        this.f44600c = a0Var;
        this.f44598a = new WeakReference(activity);
        this.f44599b = jVar;
    }

    public final void onReceive(Context context, Intent intent) {
        if (((Activity) this.f44598a.get()) == null) {
            Log.e("FederatedAuthReceiver", "Failed to unregister BroadcastReceiver because the Activity that launched this flow has been garbage collected; please do not finish() your Activity while performing a FederatedAuthProvider operation.");
            this.f44599b.mo32543b(C3847vs.m27245a(new Status(17499, "Activity that started the web operation is no longer alive; see logcat for details")));
            C11804a0.m57188e(context);
        } else if (intent.hasExtra("com.google.firebase.auth.internal.OPERATION")) {
            String stringExtra = intent.getStringExtra("com.google.firebase.auth.internal.OPERATION");
            if ("com.google.firebase.auth.internal.ACTION_SHOW_RECAPTCHA".equals(stringExtra)) {
                this.f44599b.mo32544c(intent.getStringExtra("com.google.firebase.auth.internal.RECAPTCHA_TOKEN"));
                C11804a0.m57188e(context);
                return;
            }
            C9977j jVar = this.f44599b;
            jVar.mo32543b(C3847vs.m27245a(C11836l.m57255a("WEB_CONTEXT_CANCELED:Unknown operation received (" + stringExtra + ")")));
        } else if (C11849p0.m57316d(intent)) {
            this.f44599b.mo32543b(C3847vs.m27245a(C11849p0.m57313a(intent)));
            C11804a0.m57188e(context);
        } else if (intent.hasExtra("com.google.firebase.auth.internal.EXTRA_CANCELED")) {
            this.f44599b.mo32543b(C3847vs.m27245a(C11836l.m57255a("WEB_CONTEXT_CANCELED")));
            C11804a0.m57188e(context);
        }
    }
}
