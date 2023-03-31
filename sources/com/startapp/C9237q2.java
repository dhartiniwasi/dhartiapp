package com.startapp;

import com.startapp.networkTest.enums.C9163Os;
import com.startapp.networkTest.enums.PhoneTypes;
import com.startapp.networkTest.enums.SimStates;
import com.startapp.networkTest.enums.ThreeState;

/* renamed from: com.startapp.q2 */
/* compiled from: Sta */
public class C9237q2 implements Cloneable {
    @C9226pb(complex = true)
    public C9125m1 BluetoothInfo = new C9125m1();
    public String BuildFingerprint = "";
    public String DeviceManufacturer = "";
    public String DeviceName = "";
    public long DeviceUpTime;
    @C9226pb(complex = true)
    public C9635x3 HostAppInfo = new C9635x3();
    public boolean IsRooted;
    @C9226pb(complex = true)
    public C9678z6 MultiSimInfo = new C9678z6();

    /* renamed from: OS */
    public C9163Os f38112OS = C9163Os.Android;
    public String OSVersion = "";
    public String OsSystemVersion = "";
    public int PhoneCount = -1;
    public PhoneTypes PhoneType = PhoneTypes.Unknown;
    public ThreeState PowerSaveMode = ThreeState.Unknown;
    public String SimOperator = "";
    public String SimOperatorName = "";
    public SimStates SimState = SimStates.Unknown;
    public String TAC = "";
    public String UserLocal = "";

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
