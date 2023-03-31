package androidx.work.impl.background.systemalarm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.List;
import p050g1.C4329p;
import p170y0.C6083b;
import p170y0.C6094j;
import p170y0.C6096k;

abstract class ConstraintProxy extends BroadcastReceiver {

    /* renamed from: a */
    private static final String f4445a = C6094j.m35719f("ConstraintProxy");

    public static class BatteryChargingProxy extends ConstraintProxy {
        public /* bridge */ /* synthetic */ void onReceive(Context context, Intent intent) {
            ConstraintProxy.super.onReceive(context, intent);
        }
    }

    public static class BatteryNotLowProxy extends ConstraintProxy {
        public /* bridge */ /* synthetic */ void onReceive(Context context, Intent intent) {
            ConstraintProxy.super.onReceive(context, intent);
        }
    }

    public static class NetworkStateProxy extends ConstraintProxy {
        public /* bridge */ /* synthetic */ void onReceive(Context context, Intent intent) {
            ConstraintProxy.super.onReceive(context, intent);
        }
    }

    public static class StorageNotLowProxy extends ConstraintProxy {
        public /* bridge */ /* synthetic */ void onReceive(Context context, Intent intent) {
            ConstraintProxy.super.onReceive(context, intent);
        }
    }

    ConstraintProxy() {
    }

    /* renamed from: a */
    static void m7192a(Context context, List<C4329p> list) {
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        for (C4329p pVar : list) {
            C6083b bVar = pVar.f24224j;
            z |= bVar.mo20887f();
            z2 |= bVar.mo20888g();
            z3 |= bVar.mo20891i();
            z4 |= bVar.mo20882b() != C6096k.f29486a;
            if (z && z2 && z3 && z4) {
                break;
            }
        }
        context.sendBroadcast(ConstraintProxyUpdateReceiver.m7193a(context, z, z2, z3, z4));
    }

    public void onReceive(Context context, Intent intent) {
        C6094j.m35717c().mo20921a(f4445a, String.format("onReceive : %s", new Object[]{intent}), new Throwable[0]);
        context.startService(C1553b.m7200a(context));
    }
}
