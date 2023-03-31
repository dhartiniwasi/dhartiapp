package androidx.work.impl.background.systemalarm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import p170y0.C6094j;
import p176z0.C6191i;

public class RescheduleReceiver extends BroadcastReceiver {

    /* renamed from: a */
    private static final String f4451a = C6094j.m35719f("RescheduleReceiver");

    public void onReceive(Context context, Intent intent) {
        C6094j.m35717c().mo20921a(f4451a, String.format("Received intent %s", new Object[]{intent}), new Throwable[0]);
        if (Build.VERSION.SDK_INT >= 23) {
            try {
                C6191i.m36023m(context).mo21134v(goAsync());
            } catch (IllegalStateException e) {
                C6094j.m35717c().mo20922b(f4451a, "Cannot reschedule jobs. WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().", e);
            }
        } else {
            context.startService(C1553b.m7203e(context));
        }
    }
}
