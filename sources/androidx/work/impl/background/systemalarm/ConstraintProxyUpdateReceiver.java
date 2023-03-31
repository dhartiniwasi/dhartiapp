package androidx.work.impl.background.systemalarm;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import androidx.work.impl.background.systemalarm.ConstraintProxy;
import p057h1.C4419d;
import p170y0.C6094j;
import p176z0.C6191i;

public class ConstraintProxyUpdateReceiver extends BroadcastReceiver {

    /* renamed from: a */
    static final String f4446a = C6094j.m35719f("ConstrntProxyUpdtRecvr");

    /* renamed from: androidx.work.impl.background.systemalarm.ConstraintProxyUpdateReceiver$a */
    class C1551a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ Intent f4447a;

        /* renamed from: b */
        final /* synthetic */ Context f4448b;

        /* renamed from: c */
        final /* synthetic */ BroadcastReceiver.PendingResult f4449c;

        C1551a(Intent intent, Context context, BroadcastReceiver.PendingResult pendingResult) {
            this.f4447a = intent;
            this.f4448b = context;
            this.f4449c = pendingResult;
        }

        public void run() {
            try {
                boolean booleanExtra = this.f4447a.getBooleanExtra("KEY_BATTERY_NOT_LOW_PROXY_ENABLED", false);
                boolean booleanExtra2 = this.f4447a.getBooleanExtra("KEY_BATTERY_CHARGING_PROXY_ENABLED", false);
                boolean booleanExtra3 = this.f4447a.getBooleanExtra("KEY_STORAGE_NOT_LOW_PROXY_ENABLED", false);
                boolean booleanExtra4 = this.f4447a.getBooleanExtra("KEY_NETWORK_STATE_PROXY_ENABLED", false);
                C6094j.m35717c().mo20921a(ConstraintProxyUpdateReceiver.f4446a, String.format("Updating proxies: BatteryNotLowProxy enabled (%s), BatteryChargingProxy enabled (%s), StorageNotLowProxy (%s), NetworkStateProxy enabled (%s)", new Object[]{Boolean.valueOf(booleanExtra), Boolean.valueOf(booleanExtra2), Boolean.valueOf(booleanExtra3), Boolean.valueOf(booleanExtra4)}), new Throwable[0]);
                C4419d.m29371a(this.f4448b, ConstraintProxy.BatteryNotLowProxy.class, booleanExtra);
                C4419d.m29371a(this.f4448b, ConstraintProxy.BatteryChargingProxy.class, booleanExtra2);
                C4419d.m29371a(this.f4448b, ConstraintProxy.StorageNotLowProxy.class, booleanExtra3);
                C4419d.m29371a(this.f4448b, ConstraintProxy.NetworkStateProxy.class, booleanExtra4);
            } finally {
                this.f4449c.finish();
            }
        }
    }

    /* renamed from: a */
    public static Intent m7193a(Context context, boolean z, boolean z2, boolean z3, boolean z4) {
        Intent intent = new Intent("androidx.work.impl.background.systemalarm.UpdateProxies");
        intent.setComponent(new ComponentName(context, ConstraintProxyUpdateReceiver.class));
        intent.putExtra("KEY_BATTERY_NOT_LOW_PROXY_ENABLED", z).putExtra("KEY_BATTERY_CHARGING_PROXY_ENABLED", z2).putExtra("KEY_STORAGE_NOT_LOW_PROXY_ENABLED", z3).putExtra("KEY_NETWORK_STATE_PROXY_ENABLED", z4);
        return intent;
    }

    public void onReceive(Context context, Intent intent) {
        String action = intent != null ? intent.getAction() : null;
        if (!"androidx.work.impl.background.systemalarm.UpdateProxies".equals(action)) {
            C6094j.m35717c().mo20921a(f4446a, String.format("Ignoring unknown action %s", new Object[]{action}), new Throwable[0]);
        } else {
            C6191i.m36023m(context).mo21131r().mo18322b(new C1551a(intent, context, goAsync()));
        }
    }
}
