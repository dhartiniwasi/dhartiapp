package p073j4;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* renamed from: j4.a2 */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class C4747a2 extends BroadcastReceiver {

    /* renamed from: a */
    final /* synthetic */ C4751b2 f25397a;

    /* synthetic */ C4747a2(C4751b2 b2Var, C4830z1 z1Var) {
        this.f25397a = b2Var;
    }

    public final void onReceive(Context context, Intent intent) {
        if ("android.intent.action.USER_PRESENT".equals(intent.getAction())) {
            this.f25397a.f25406c = true;
        } else if ("android.intent.action.SCREEN_OFF".equals(intent.getAction())) {
            this.f25397a.f25406c = false;
        }
    }
}
