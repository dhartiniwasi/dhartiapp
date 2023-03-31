package com.startapp;

import android.bluetooth.BluetoothDevice;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.HashSet;

/* renamed from: com.startapp.n1 */
/* compiled from: Sta */
public class C9144n1 extends BroadcastReceiver {

    /* renamed from: a */
    public final /* synthetic */ C9182o1 f37335a;

    public C9144n1(C9182o1 o1Var) {
        this.f37335a = o1Var;
    }

    public void onReceive(Context context, Intent intent) {
        String action = intent.getAction();
        if ("android.bluetooth.device.action.FOUND".equals(action)) {
            BluetoothDevice bluetoothDevice = (BluetoothDevice) intent.getParcelableExtra("android.bluetooth.device.extra.DEVICE");
            C9039j1 j1Var = this.f37335a.f37973c;
            if (j1Var.f36980b == null) {
                j1Var.f36980b = new HashSet();
            }
            j1Var.f36980b.add(bluetoothDevice);
        } else if ("android.bluetooth.adapter.action.DISCOVERY_FINISHED".equals(action)) {
            this.f37335a.mo29780c();
            C9182o1 o1Var = this.f37335a;
            o1Var.f37972b.mo29232a(o1Var.mo29779b());
        }
    }
}
