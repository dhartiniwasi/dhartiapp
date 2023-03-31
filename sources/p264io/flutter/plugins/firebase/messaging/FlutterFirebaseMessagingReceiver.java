package p264io.flutter.plugins.firebase.messaging;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import com.google.firebase.messaging.C8059o0;
import java.util.HashMap;
import p063i0.C4643a;
import p261ic.C10592a;

/* renamed from: io.flutter.plugins.firebase.messaging.FlutterFirebaseMessagingReceiver */
public class FlutterFirebaseMessagingReceiver extends BroadcastReceiver {

    /* renamed from: a */
    static HashMap<String, C8059o0> f42188a = new HashMap<>();

    public void onReceive(Context context, Intent intent) {
        Log.d("FLTFireMsgReceiver", "broadcast received for message");
        if (C10592a.m53190a() == null) {
            C10592a.m53191b(context.getApplicationContext());
        }
        if (intent.getExtras() == null) {
            Log.d("FLTFireMsgReceiver", "broadcast received but intent contained no extras to process RemoteMessage. Operation cancelled.");
            return;
        }
        C8059o0 o0Var = new C8059o0(intent.getExtras());
        if (o0Var.mo26692O1() != null) {
            f42188a.put(o0Var.mo26690L1(), o0Var);
            C10797f.m54004b().mo34423i(o0Var);
        }
        if (C10798g.m54016d(context)) {
            Intent intent2 = new Intent("io.flutter.plugins.firebase.messaging.NOTIFICATION");
            intent2.putExtra("notification", o0Var);
            C4643a.m30235b(context).mo18317d(intent2);
            return;
        }
        Intent intent3 = new Intent(context, FlutterFirebaseMessagingBackgroundService.class);
        intent3.putExtra("notification", o0Var);
        FlutterFirebaseMessagingBackgroundService.m53933k(context, intent3);
    }
}
