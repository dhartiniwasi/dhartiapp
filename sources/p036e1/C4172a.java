package p036e1;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import p064i1.C4647a;
import p170y0.C6094j;

/* renamed from: e1.a */
/* compiled from: BatteryChargingTracker */
public class C4172a extends C4174c<Boolean> {

    /* renamed from: i */
    private static final String f23431i = C6094j.m35719f("BatteryChrgTracker");

    public C4172a(Context context, C4647a aVar) {
        super(context, aVar);
    }

    /* renamed from: j */
    private boolean m28289j(Intent intent) {
        if (Build.VERSION.SDK_INT >= 23) {
            int intExtra = intent.getIntExtra("status", -1);
            if (intExtra == 2 || intExtra == 5) {
                return true;
            }
        } else if (intent.getIntExtra("plugged", 0) != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: g */
    public IntentFilter mo17503g() {
        IntentFilter intentFilter = new IntentFilter();
        if (Build.VERSION.SDK_INT >= 23) {
            intentFilter.addAction("android.os.action.CHARGING");
            intentFilter.addAction("android.os.action.DISCHARGING");
        } else {
            intentFilter.addAction("android.intent.action.ACTION_POWER_CONNECTED");
            intentFilter.addAction("android.intent.action.ACTION_POWER_DISCONNECTED");
        }
        return intentFilter;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0044, code lost:
        if (r6.equals("android.os.action.DISCHARGING") == false) goto L_0x0026;
     */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo17504h(android.content.Context r6, android.content.Intent r7) {
        /*
            r5 = this;
            java.lang.String r6 = r7.getAction()
            if (r6 != 0) goto L_0x0007
            return
        L_0x0007:
            y0.j r7 = p170y0.C6094j.m35717c()
            java.lang.String r0 = f23431i
            r1 = 1
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r3 = 0
            r2[r3] = r6
            java.lang.String r4 = "Received %s"
            java.lang.String r2 = java.lang.String.format(r4, r2)
            java.lang.Throwable[] r4 = new java.lang.Throwable[r3]
            r7.mo20921a(r0, r2, r4)
            r7 = -1
            int r0 = r6.hashCode()
            switch(r0) {
                case -1886648615: goto L_0x0047;
                case -54942926: goto L_0x003e;
                case 948344062: goto L_0x0033;
                case 1019184907: goto L_0x0028;
                default: goto L_0x0026;
            }
        L_0x0026:
            r1 = -1
            goto L_0x0051
        L_0x0028:
            java.lang.String r0 = "android.intent.action.ACTION_POWER_CONNECTED"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L_0x0031
            goto L_0x0026
        L_0x0031:
            r1 = 3
            goto L_0x0051
        L_0x0033:
            java.lang.String r0 = "android.os.action.CHARGING"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L_0x003c
            goto L_0x0026
        L_0x003c:
            r1 = 2
            goto L_0x0051
        L_0x003e:
            java.lang.String r0 = "android.os.action.DISCHARGING"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L_0x0051
            goto L_0x0026
        L_0x0047:
            java.lang.String r0 = "android.intent.action.ACTION_POWER_DISCONNECTED"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L_0x0050
            goto L_0x0026
        L_0x0050:
            r1 = 0
        L_0x0051:
            switch(r1) {
                case 0: goto L_0x0067;
                case 1: goto L_0x0061;
                case 2: goto L_0x005b;
                case 3: goto L_0x0055;
                default: goto L_0x0054;
            }
        L_0x0054:
            goto L_0x006c
        L_0x0055:
            java.lang.Boolean r6 = java.lang.Boolean.TRUE
            r5.mo17512d(r6)
            goto L_0x006c
        L_0x005b:
            java.lang.Boolean r6 = java.lang.Boolean.TRUE
            r5.mo17512d(r6)
            goto L_0x006c
        L_0x0061:
            java.lang.Boolean r6 = java.lang.Boolean.FALSE
            r5.mo17512d(r6)
            goto L_0x006c
        L_0x0067:
            java.lang.Boolean r6 = java.lang.Boolean.FALSE
            r5.mo17512d(r6)
        L_0x006c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p036e1.C4172a.mo17504h(android.content.Context, android.content.Intent):void");
    }

    /* renamed from: i */
    public Boolean mo17502b() {
        Intent registerReceiver = this.f23438b.registerReceiver((BroadcastReceiver) null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (registerReceiver != null) {
            return Boolean.valueOf(m28289j(registerReceiver));
        }
        C6094j.m35717c().mo20922b(f23431i, "getInitialState - null intent received", new Throwable[0]);
        return null;
    }
}
