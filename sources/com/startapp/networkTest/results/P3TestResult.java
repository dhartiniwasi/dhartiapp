package com.startapp.networkTest.results;

import com.startapp.C8932eb;
import com.startapp.C9025i6;
import com.startapp.C9048j8;
import com.startapp.C9068k8;
import com.startapp.C9226pb;
import com.startapp.C9237q2;
import com.startapp.networkTest.data.BatteryInfo;
import com.startapp.networkTest.data.LocationInfo;
import com.startapp.networkTest.data.RadioInfo;
import com.startapp.networkTest.data.TimeInfo;
import com.startapp.networkTest.data.WifiInfo;
import com.startapp.networkTest.enums.ConnectionTypes;
import com.startapp.networkTest.enums.IpVersions;
import com.startapp.networkTest.enums.MeasurementTypes;
import com.startapp.networkTest.enums.NetworkGenerations;
import com.startapp.networkTest.enums.SpeedtestEndStates;
import com.startapp.networkTest.results.speedtest.MeasurementPointBase;
import com.startapp.networkTest.speedtest.SpeedtestEngineError;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: Sta */
public class P3TestResult extends BaseResult {
    public int AvgValue;
    @C9226pb(complex = true)
    public BatteryInfo BatteryInfoOnEnd = new BatteryInfo();
    @C9226pb(complex = true)
    public BatteryInfo BatteryInfoOnStart = new BatteryInfo();
    public String CampaignId = "";
    public long ConnectingTimeControlServer = -1;
    public long ConnectingTimeTestServerControl = -1;
    public long ConnectingTimeTestServerSockets = -1;
    public String CustomerID = "";
    @C9226pb(complex = true)
    public C9237q2 DeviceInfo = new C9237q2();
    public String IMEI = "";
    public String IMSI = "";
    public IpVersions IpVersion = IpVersions.Unknown;
    public int IsAppInForeground = -1;
    @C9226pb(complex = true)
    public LocationInfo LocationInfoOnEnd = new LocationInfo();
    @C9226pb(complex = true)
    public LocationInfo LocationInfoOnStart = new LocationInfo();
    public int MaxValue;
    public MeasurementTypes MeasurementType = MeasurementTypes.Unknown;
    public int MedValue;
    @C9226pb(complex = true)
    public C9025i6 MemoryInfoOnEnd = new C9025i6();
    @C9226pb(complex = true)
    public C9025i6 MemoryInfoOnStart = new C9025i6();
    public String Meta = "";
    public int MinValue;
    @C9226pb(type = ArrayList.class, value = C9048j8.class)
    public ArrayList<C9048j8> QuestionAnswerList = new ArrayList<>();
    public String QuestionnaireName = "";
    @C9226pb(complex = true)
    public RadioInfo RadioInfoOnEnd = new RadioInfo();
    @C9226pb(complex = true)
    public RadioInfo RadioInfoOnStart = new RadioInfo();
    public double RatShare2G;
    public double RatShare3G;
    public double RatShare4G;
    public double RatShare5G;
    public double RatShareUnknown;
    public double RatShareWiFi;
    public String SequenceID = "";
    public String Server = "";
    public boolean Success;
    public SpeedtestEndStates TestEndState = SpeedtestEndStates.Unknown;
    public SpeedtestEngineError TestErrorReason = SpeedtestEngineError.OK;
    @C9226pb(complex = true)
    public TimeInfo TimeInfoOnEnd = new TimeInfo();
    @C9226pb(complex = true)
    public TimeInfo TimeInfoOnStart = new TimeInfo();
    @C9226pb(complex = true)
    public C8932eb TrafficInfoOnEnd = new C8932eb();
    @C9226pb(complex = true)
    public C8932eb TrafficInfoOnStart = new C8932eb();
    @C9226pb(complex = true)
    public WifiInfo WifiInfoOnEnd = new WifiInfo();
    @C9226pb(complex = true)
    public WifiInfo WifiInfoOnStart = new WifiInfo();

    /* renamed from: com.startapp.networkTest.results.P3TestResult$a */
    /* compiled from: Sta */
    public static /* synthetic */ class C9166a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f37864a;

        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|12) */
        /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.startapp.networkTest.enums.NetworkGenerations[] r0 = com.startapp.networkTest.enums.NetworkGenerations.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f37864a = r0
                com.startapp.networkTest.enums.NetworkGenerations r1 = com.startapp.networkTest.enums.NetworkGenerations.Gen2     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f37864a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.startapp.networkTest.enums.NetworkGenerations r1 = com.startapp.networkTest.enums.NetworkGenerations.Gen3     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f37864a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.startapp.networkTest.enums.NetworkGenerations r1 = com.startapp.networkTest.enums.NetworkGenerations.Gen4     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f37864a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.startapp.networkTest.enums.NetworkGenerations r1 = com.startapp.networkTest.enums.NetworkGenerations.Gen5     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f37864a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.startapp.networkTest.enums.NetworkGenerations r1 = com.startapp.networkTest.enums.NetworkGenerations.Unknown     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.startapp.networkTest.results.P3TestResult.C9166a.<clinit>():void");
        }
    }

    public P3TestResult(String str, String str2) {
        super(str, str2);
    }

    public void calcRatShare(ArrayList<? extends MeasurementPointBase> arrayList) {
        Iterator<? extends MeasurementPointBase> it = arrayList.iterator();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        while (it.hasNext()) {
            MeasurementPointBase measurementPointBase = (MeasurementPointBase) it.next();
            ConnectionTypes connectionTypes = measurementPointBase.ConnectionType;
            if (connectionTypes != ConnectionTypes.Unknown) {
                if (connectionTypes == ConnectionTypes.Mobile) {
                    NetworkGenerations b = C9068k8.m48778b(measurementPointBase.NetworkType);
                    if (measurementPointBase.NrState.equals("CONNECTED")) {
                        b = NetworkGenerations.Gen5;
                    }
                    int i8 = C9166a.f37864a[b.ordinal()];
                    if (i8 == 1) {
                        i7++;
                    } else if (i8 == 2) {
                        i6++;
                    } else if (i8 == 3) {
                        i5++;
                    } else if (i8 == 4) {
                        i4++;
                    }
                } else {
                    i3++;
                }
                i++;
            }
            i2++;
            i++;
        }
        if (i > 0) {
            double d = (double) i;
            this.RatShare2G = ((double) i7) / d;
            this.RatShare3G = ((double) i6) / d;
            this.RatShare4G = ((double) i5) / d;
            this.RatShare5G = ((double) i4) / d;
            this.RatShareWiFi = ((double) i3) / d;
            this.RatShareUnknown = ((double) i2) / d;
        }
    }
}
