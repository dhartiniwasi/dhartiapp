package com.startapp.networkTest.results;

import com.startapp.C8932eb;
import com.startapp.C9025i6;
import com.startapp.C9050ja;
import com.startapp.C9226pb;
import com.startapp.C9237q2;
import com.startapp.C9258r5;
import com.startapp.C9658y6;
import com.startapp.C9662y9;
import com.startapp.networkTest.data.BatteryInfo;
import com.startapp.networkTest.data.IspInfo;
import com.startapp.networkTest.data.LocationInfo;
import com.startapp.networkTest.data.RadioInfo;
import com.startapp.networkTest.data.TimeInfo;
import com.startapp.networkTest.data.WifiInfo;
import com.startapp.networkTest.data.radio.ApnInfo;
import com.startapp.networkTest.data.radio.CellInfo;
import com.startapp.networkTest.data.radio.NetworkRegistrationInfo;
import com.startapp.networkTest.enums.CtTestTypes;
import com.startapp.networkTest.enums.FileTypes;
import com.startapp.networkTest.enums.IdleStates;
import com.startapp.networkTest.enums.NetworkTypes;
import com.startapp.networkTest.enums.ScreenStates;
import com.startapp.networkTest.enums.voice.CallStates;
import java.util.ArrayList;

/* compiled from: Sta */
public class ConnectivityTestResult extends BaseResult {
    public String AirportCode;
    public String AmazonId = "";
    @C9226pb(type = ArrayList.class, value = ApnInfo.class)
    public ArrayList<ApnInfo> ApnInfo;
    @C9226pb(complex = true)
    public BatteryInfo BatteryInfo;
    public long BytesRead = -1;
    public CallStates CallState;
    @C9226pb(type = ArrayList.class, value = CellInfo.class)
    public ArrayList<CellInfo> CellInfo;
    public String CtId = "";
    @C9226pb(complex = true)
    public C9237q2 DeviceInfo;
    public long DurationDNS = -1;
    public long DurationHttpGetCommand = -1;
    public long DurationHttpReceive = -1;
    public long DurationOverall = -1;
    public long DurationOverallNoSleep = -1;
    public long DurationSSL = -1;
    public long DurationTcpConnect = -1;
    public String ErrorReason;
    public int HTTPStatus = -1;
    public long HeaderBytesRead = -1;
    public IdleStates IdleStateOnEnd;
    public IdleStates IdleStateOnStart;
    public int IsAppInForeground;
    public boolean IsKeepAlive = false;
    @C9226pb(complex = true)
    public IspInfo IspInfo;
    public boolean LocalhostPingSuccess = false;
    @C9226pb(complex = true)
    public LocationInfo LocationInfo;
    @C9226pb(complex = true)
    public C9025i6 MemoryInfo;
    @C9226pb(type = ArrayList.class, value = C9658y6.class)
    public ArrayList<C9658y6> MultiCdnInfo;
    @C9226pb(type = ArrayList.class, value = NetworkRegistrationInfo.class)
    public ArrayList<NetworkRegistrationInfo> NetworkRegistrationInfo;
    @C9226pb(complex = true)
    public RadioInfo RadioInfo;
    @C9226pb(complex = true)
    public RadioInfo RadioInfoOnEnd;
    public ScreenStates ScreenState = ScreenStates.Unknown;
    public String ServerFilename = "";
    public String ServerHostname = "";
    public String ServerIp = "";
    public long ServerMultiSuccess;
    @C9226pb(complex = true)
    public C9662y9 SimInfo;
    public String SslException;
    @C9226pb(complex = true)
    public C9050ja StorageInfo;
    public boolean Success = false;
    public String TestTimestamp = "";
    public CtTestTypes TestType = CtTestTypes.Unknown;
    @C9226pb(complex = true)
    public TimeInfo TimeInfo;
    @C9226pb(complex = true)
    public C8932eb TrafficInfo;
    public long TruststoreTimestamp;
    public NetworkTypes VoiceNetworkType;
    @C9226pb(complex = true)
    public WifiInfo WifiInfo;

    public ConnectivityTestResult(String str, String str2) {
        super(str, str2);
        IdleStates idleStates = IdleStates.Unknown;
        this.IdleStateOnStart = idleStates;
        this.IdleStateOnEnd = idleStates;
        this.ErrorReason = "";
        this.SslException = "";
        this.CallState = CallStates.Unknown;
        this.VoiceNetworkType = NetworkTypes.Unknown;
        this.ServerMultiSuccess = -1;
        this.AirportCode = "";
        this.IsAppInForeground = -1;
        this.BatteryInfo = new BatteryInfo();
        this.DeviceInfo = new C9237q2();
        this.LocationInfo = new LocationInfo();
        this.MemoryInfo = new C9025i6();
        this.RadioInfo = new RadioInfo();
        this.RadioInfoOnEnd = new RadioInfo();
        this.StorageInfo = new C9050ja();
        this.TrafficInfo = new C8932eb();
        this.WifiInfo = new WifiInfo();
        this.TimeInfo = new TimeInfo();
        this.IspInfo = new IspInfo();
        this.SimInfo = new C9662y9();
        this.MultiCdnInfo = new ArrayList<>();
        this.CellInfo = new ArrayList<>();
        this.ApnInfo = new ArrayList<>();
        this.NetworkRegistrationInfo = new ArrayList<>();
    }

    public String toJson() {
        return C9258r5.m49218a(FileTypes.CT, (BaseResult) this);
    }
}
