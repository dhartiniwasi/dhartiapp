package com.startapp;

import android.bluetooth.BluetoothAdapter;
import android.content.BroadcastReceiver;
import android.content.Context;
import org.json.JSONObject;

/* renamed from: com.startapp.o1 */
/* compiled from: Sta */
public class C9182o1 {

    /* renamed from: a */
    public Context f37971a;

    /* renamed from: b */
    public C9620w7 f37972b;

    /* renamed from: c */
    public C9039j1 f37973c = new C9039j1();

    /* renamed from: d */
    public BluetoothAdapter f37974d = mo29777a();

    /* renamed from: e */
    public BroadcastReceiver f37975e;

    public C9182o1(Context context, C9620w7 w7Var) {
        this.f37971a = context;
        this.f37972b = w7Var;
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x0054  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0080  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo29778a(boolean r6) {
        /*
            r5 = this;
            android.bluetooth.BluetoothAdapter r0 = r5.f37974d
            if (r0 == 0) goto L_0x008a
            boolean r0 = r0.isEnabled()
            if (r0 != 0) goto L_0x000c
            goto L_0x008a
        L_0x000c:
            com.startapp.j1 r0 = r5.f37973c
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x003e }
            r2 = 31
            if (r1 >= r2) goto L_0x001e
            android.content.Context r3 = r5.f37971a     // Catch:{ all -> 0x003e }
            java.lang.String r4 = "android.permission.BLUETOOTH"
            boolean r3 = com.startapp.C8837b0.m48304a((android.content.Context) r3, (java.lang.String) r4)     // Catch:{ all -> 0x003e }
            if (r3 != 0) goto L_0x002a
        L_0x001e:
            if (r1 < r2) goto L_0x002c
            android.content.Context r1 = r5.f37971a     // Catch:{ all -> 0x003e }
            java.lang.String r2 = "android.permission.BLUETOOTH_CONNECT"
            boolean r1 = com.startapp.C8837b0.m48304a((android.content.Context) r1, (java.lang.String) r2)     // Catch:{ all -> 0x003e }
            if (r1 == 0) goto L_0x002c
        L_0x002a:
            r1 = 1
            goto L_0x002d
        L_0x002c:
            r1 = 0
        L_0x002d:
            if (r1 == 0) goto L_0x0042
            android.bluetooth.BluetoothAdapter r1 = r5.f37974d     // Catch:{ all -> 0x003e }
            boolean r1 = r1.isEnabled()     // Catch:{ all -> 0x003e }
            if (r1 == 0) goto L_0x0042
            android.bluetooth.BluetoothAdapter r1 = r5.f37974d     // Catch:{ all -> 0x003e }
            java.util.Set r1 = r1.getBondedDevices()     // Catch:{ all -> 0x003e }
            goto L_0x0046
        L_0x003e:
            r1 = move-exception
            com.startapp.C9023i4.m48681a((java.lang.Throwable) r1)
        L_0x0042:
            java.util.Set r1 = java.util.Collections.emptySet()
        L_0x0046:
            r0.f36979a = r1
            if (r6 == 0) goto L_0x0080
            android.content.Context r6 = r5.f37971a
            java.lang.String r0 = "android.permission.BLUETOOTH_ADMIN"
            boolean r6 = com.startapp.C8837b0.m48304a((android.content.Context) r6, (java.lang.String) r0)
            if (r6 == 0) goto L_0x0080
            android.content.IntentFilter r6 = new android.content.IntentFilter
            java.lang.String r0 = "android.bluetooth.device.action.FOUND"
            r6.<init>(r0)
            com.startapp.n1 r0 = new com.startapp.n1
            r0.<init>(r5)
            r5.f37975e = r0
            android.content.Context r1 = r5.f37971a     // Catch:{ Exception -> 0x006d }
            r1.registerReceiver(r0, r6)     // Catch:{ Exception -> 0x006d }
            android.bluetooth.BluetoothAdapter r6 = r5.f37974d     // Catch:{ Exception -> 0x006d }
            r6.startDiscovery()     // Catch:{ Exception -> 0x006d }
            goto L_0x0089
        L_0x006d:
            r6 = move-exception
            android.bluetooth.BluetoothAdapter r0 = r5.f37974d
            r0.cancelDiscovery()
            com.startapp.w7 r0 = r5.f37972b
            org.json.JSONObject r1 = r5.mo29779b()
            r0.mo29232a(r1)
            com.startapp.C9023i4.m48681a((java.lang.Throwable) r6)
            goto L_0x0089
        L_0x0080:
            com.startapp.w7 r6 = r5.f37972b
            org.json.JSONObject r0 = r5.mo29779b()
            r6.mo29232a(r0)
        L_0x0089:
            return
        L_0x008a:
            com.startapp.w7 r6 = r5.f37972b
            r0 = 0
            r6.mo29232a(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.startapp.C9182o1.mo29778a(boolean):void");
    }

    /* renamed from: b */
    public JSONObject mo29779b() {
        try {
            return this.f37973c.mo29501a();
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: c */
    public void mo29780c() {
        BluetoothAdapter bluetoothAdapter;
        if (C8837b0.m48304a(this.f37971a, "android.permission.BLUETOOTH_ADMIN") && this.f37975e != null && (bluetoothAdapter = this.f37974d) != null) {
            bluetoothAdapter.cancelDiscovery();
            try {
                this.f37971a.unregisterReceiver(this.f37975e);
            } catch (Throwable th) {
                C9023i4.m48681a(th);
            }
            this.f37975e = null;
        }
    }

    /* renamed from: a */
    public final BluetoothAdapter mo29777a() {
        if (C8837b0.m48304a(this.f37971a, "android.permission.BLUETOOTH")) {
            return BluetoothAdapter.getDefaultAdapter();
        }
        return null;
    }
}
