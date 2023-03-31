package com.startapp;

import com.startapp.networkTest.enums.bluetooth.BluetoothConnectionState;
import java.util.ArrayList;

/* renamed from: com.startapp.m1 */
/* compiled from: Sta */
public class C9125m1 {
    public BluetoothConnectionState A2DPConnectionState;
    public boolean BluetoothEnabled;
    @C9226pb(type = ArrayList.class, value = C9108l1.class)
    public ArrayList<C9108l1> ConnectedA2DPBluetoothDevices = new ArrayList<>();
    @C9226pb(type = ArrayList.class, value = C9108l1.class)
    public ArrayList<C9108l1> ConnectedHeadsetBluetoothDevices = new ArrayList<>();
    @C9226pb(type = ArrayList.class, value = C9108l1.class)
    public ArrayList<C9108l1> ConnectedHealthBluetoothDevices = new ArrayList<>();
    public BluetoothConnectionState HeadsetConnectionState;
    public BluetoothConnectionState HealthConnectionState;
    public boolean MissingPermission = false;
    @C9226pb(type = ArrayList.class, value = C9108l1.class)
    public ArrayList<C9108l1> PairedBluetoothDevices = new ArrayList<>();

    public C9125m1() {
        BluetoothConnectionState bluetoothConnectionState = BluetoothConnectionState.Unknown;
        this.HealthConnectionState = bluetoothConnectionState;
        this.HeadsetConnectionState = bluetoothConnectionState;
        this.A2DPConnectionState = bluetoothConnectionState;
    }
}
