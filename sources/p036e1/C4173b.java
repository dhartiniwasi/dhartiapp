package p036e1;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import p064i1.C4647a;
import p170y0.C6094j;

/* renamed from: e1.b */
/* compiled from: BatteryNotLowTracker */
public class C4173b extends C4174c<Boolean> {

    /* renamed from: i */
    private static final String f23432i = C6094j.m35719f("BatteryNotLowTracker");

    public C4173b(Context context, C4647a aVar) {
        super(context, aVar);
    }

    /* renamed from: g */
    public IntentFilter mo17503g() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.BATTERY_OKAY");
        intentFilter.addAction("android.intent.action.BATTERY_LOW");
        return intentFilter;
    }

    /* renamed from: h */
    public void mo17504h(Context context, Intent intent) {
        if (intent.getAction() != null) {
            C6094j.m35717c().mo20921a(f23432i, String.format("Received %s", new Object[]{intent.getAction()}), new Throwable[0]);
            String action = intent.getAction();
            action.hashCode();
            if (action.equals("android.intent.action.BATTERY_OKAY")) {
                mo17512d(Boolean.TRUE);
            } else if (action.equals("android.intent.action.BATTERY_LOW")) {
                mo17512d(Boolean.FALSE);
            }
        }
    }

    /* renamed from: i */
    public Boolean mo17502b() {
        Intent registerReceiver = this.f23438b.registerReceiver((BroadcastReceiver) null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        boolean z = false;
        if (registerReceiver == null) {
            C6094j.m35717c().mo20922b(f23432i, "getInitialState - null intent received", new Throwable[0]);
            return null;
        }
        int intExtra = registerReceiver.getIntExtra("status", -1);
        float intExtra2 = ((float) registerReceiver.getIntExtra("level", -1)) / ((float) registerReceiver.getIntExtra("scale", -1));
        if (intExtra == 1 || intExtra2 > 0.15f) {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
