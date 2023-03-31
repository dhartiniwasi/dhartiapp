package com.startapp;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.telephony.TelephonyManager;
import com.startapp.networkTest.controller.LocationController;
import com.startapp.networkTest.data.LocationInfo;
import com.startapp.networkTest.data.RadioInfo;
import com.startapp.networkTest.data.TimeInfo;
import com.startapp.networkTest.enums.NetworkTypes;
import com.startapp.networkTest.enums.TriggerEvents;
import com.startapp.networkTest.enums.voice.CallStates;
import com.startapp.networkTest.results.NetworkInformationResult;
import java.util.ArrayList;
import java.util.Arrays;

/* renamed from: com.startapp.c7 */
/* compiled from: Sta */
public class C8880c7 {

    /* renamed from: n */
    private static final String f36587n = "c7";

    /* renamed from: o */
    private static final boolean f36588o = false;

    /* renamed from: p */
    private static final int f36589p = 30000;

    /* renamed from: q */
    private static final String f36590q = "p3insnir";

    /* renamed from: r */
    private static final String f36591r = "P3INS_PFK_NIR_FIRSTCELLID_LATITUDE";

    /* renamed from: s */
    private static final String f36592s = "P3INS_PFK_NIR_FIRSTCELLID_LONGITUDE";

    /* renamed from: t */
    private static final String f36593t = "P3INS_PFK_NIR_FIRSTCELLID_GSMCELLID";

    /* renamed from: a */
    private SharedPreferences f36594a;

    /* renamed from: b */
    private Context f36595b;

    /* renamed from: c */
    private C8844b5 f36596c;

    /* renamed from: d */
    private String f36597d;

    /* renamed from: e */
    private C9068k8 f36598e;

    /* renamed from: f */
    private C9157nd f36599f;

    /* renamed from: g */
    private LocationController f36600g;

    /* renamed from: h */
    private TelephonyManager f36601h;

    /* renamed from: i */
    private C8882b f36602i;

    /* renamed from: j */
    private C8883c f36603j;

    /* renamed from: k */
    private int f36604k = 0;

    /* renamed from: l */
    private int f36605l;

    /* renamed from: m */
    private boolean f36606m;

    /* renamed from: com.startapp.c7$b */
    /* compiled from: Sta */
    public class C8882b {

        /* renamed from: a */
        public String f36607a;

        /* renamed from: b */
        public double f36608b;

        /* renamed from: c */
        public double f36609c;

        public C8882b(String str, double d, double d2) {
            this.f36607a = str;
            this.f36608b = d;
            this.f36609c = d2;
        }
    }

    /* renamed from: com.startapp.c7$c */
    /* compiled from: Sta */
    public class C8883c {

        /* renamed from: a */
        public String f36611a;

        /* renamed from: b */
        public String f36612b;

        /* renamed from: c */
        public String f36613c;

        /* renamed from: d */
        public NetworkTypes f36614d;

        /* renamed from: e */
        public String f36615e;

        /* renamed from: f */
        public String f36616f;

        /* renamed from: g */
        public int f36617g;

        private C8883c() {
            this.f36611a = "";
            this.f36612b = "";
            this.f36613c = "";
            this.f36614d = NetworkTypes.Unknown;
            this.f36615e = "";
            this.f36616f = "";
        }

        /* renamed from: a */
        public void mo29262a(String str, String str2, String str3, NetworkTypes networkTypes, String str4, String str5, int i) {
            this.f36612b = str;
            this.f36611a = str2;
            this.f36613c = str3;
            this.f36614d = networkTypes;
            this.f36615e = str4;
            this.f36616f = str5;
            this.f36617g = i;
        }
    }

    public C8880c7(Context context) {
        int i;
        this.f36595b = context;
        this.f36596c = new C8844b5(context);
        this.f36597d = C8821a5.m48254b().PROJECT_ID();
        this.f36594a = context.getSharedPreferences(f36590q, 0);
        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
        this.f36601h = telephonyManager;
        if (!(Build.VERSION.SDK_INT < 24 || telephonyManager == null || (i = C9208p2.m49130i(context).SubscriptionId) == -1)) {
            this.f36601h = this.f36601h.createForSubscriptionId(i);
        }
        this.f36598e = new C9068k8(this.f36595b);
        this.f36599f = new C9157nd(this.f36595b);
        this.f36600g = new LocationController(this.f36595b);
        this.f36603j = new C8883c();
        this.f36606m = C8821a5.m48254b().NIR_COLLECT_CELLINFO();
        int NIR_COLLECT_CELLINFO_THRESHOLD = C8821a5.m48254b().NIR_COLLECT_CELLINFO_THRESHOLD();
        this.f36605l = NIR_COLLECT_CELLINFO_THRESHOLD;
        if (NIR_COLLECT_CELLINFO_THRESHOLD <= 0) {
            this.f36605l = 1;
        }
    }

    /* renamed from: d */
    private void m48436d() {
        String string = this.f36594a.getString(f36593t, "");
        if (!string.isEmpty()) {
            this.f36602i = new C8882b(string, Double.longBitsToDouble(this.f36594a.getLong(f36591r, 0)), Double.longBitsToDouble(this.f36594a.getLong(f36592s, 0)));
        }
    }

    /* renamed from: a */
    public NetworkInformationResult mo29254a(TriggerEvents triggerEvents, boolean z) {
        return mo29253a(this.f36600g.mo29724c(), triggerEvents, z);
    }

    /* renamed from: b */
    public void mo29258b(C9115l8 l8Var) {
        C9068k8 k8Var = this.f36598e;
        if (k8Var != null) {
            k8Var.mo29550b(l8Var);
        }
    }

    /* renamed from: c */
    public void mo29259c() {
        LocationController locationController = this.f36600g;
        if (locationController != null) {
            locationController.mo29723a((LocationController.C9162c) null);
        }
    }

    /* renamed from: e */
    public void mo29260e() {
        this.f36600g.mo29722a(LocationController.ProviderMode.Passive);
        this.f36598e.mo29570x();
        this.f36599f.mo29719f();
    }

    /* renamed from: f */
    public void mo29261f() {
        this.f36600g.mo29726f();
        this.f36598e.mo29571y();
        this.f36599f.mo29720g();
    }

    /* renamed from: a */
    public NetworkInformationResult mo29253a(LocationInfo locationInfo, TriggerEvents triggerEvents, boolean z) {
        String str;
        C8882b bVar;
        C8882b bVar2;
        C8882b bVar3;
        C8882b bVar4;
        NetworkInformationResult networkInformationResult = new NetworkInformationResult(this.f36597d, this.f36596c.mo29198p());
        if (locationInfo != null) {
            networkInformationResult.LocationInfo = locationInfo;
        } else {
            networkInformationResult.LocationInfo = this.f36600g.mo29724c();
        }
        TimeInfo e = C9603va.m50436e();
        networkInformationResult.TimeInfo = e;
        networkInformationResult.Timestamp = e.TimestampTableau;
        networkInformationResult.timestampMillis = e.TimestampMillis;
        networkInformationResult.NirId = C9578u3.m50392a(e, networkInformationResult.GUID);
        networkInformationResult.WifiInfo = this.f36599f.mo29716c();
        networkInformationResult.TriggerEvent = triggerEvents;
        networkInformationResult.ScreenState = C9208p2.m49129h(this.f36595b);
        networkInformationResult.CallState = m48434a();
        if (this.f36606m) {
            int i = this.f36604k;
            this.f36604k = i + 1;
            if (i % this.f36605l == 0 || z) {
                networkInformationResult.CellInfo = new ArrayList<>(Arrays.asList(this.f36598e.mo29552c()));
            }
        }
        networkInformationResult.RadioInfo = this.f36598e.mo29559h();
        String str2 = "";
        synchronized (this) {
            if (this.f36602i == null) {
                m48436d();
            }
            if (!networkInformationResult.RadioInfo.GsmCellId.isEmpty()) {
                if (networkInformationResult.LocationInfo.LocationAge < 30000 && ((bVar4 = this.f36602i) == null || !bVar4.f36607a.equals(networkInformationResult.RadioInfo.GsmCellId))) {
                    String str3 = networkInformationResult.RadioInfo.GsmCellId;
                    LocationInfo locationInfo2 = networkInformationResult.LocationInfo;
                    C8882b bVar5 = new C8882b(str3, locationInfo2.LocationLatitude, locationInfo2.LocationLongitude);
                    this.f36602i = bVar5;
                    networkInformationResult.CellIdDeltaDistance = 0.0d;
                    m48435a(bVar5);
                }
                str2 = networkInformationResult.RadioInfo.GsmCellId;
            } else if (!networkInformationResult.RadioInfo.CdmaBaseStationId.isEmpty()) {
                if (networkInformationResult.LocationInfo.LocationAge < 30000 && ((bVar3 = this.f36602i) == null || !bVar3.f36607a.equals(networkInformationResult.RadioInfo.CdmaBaseStationId))) {
                    String str4 = networkInformationResult.RadioInfo.CdmaBaseStationId;
                    LocationInfo locationInfo3 = networkInformationResult.LocationInfo;
                    C8882b bVar6 = new C8882b(str4, locationInfo3.LocationLatitude, locationInfo3.LocationLongitude);
                    this.f36602i = bVar6;
                    networkInformationResult.CellIdDeltaDistance = 0.0d;
                    m48435a(bVar6);
                }
                str2 = networkInformationResult.RadioInfo.CdmaBaseStationId;
            }
            str = str2;
        }
        if ((!networkInformationResult.RadioInfo.GsmCellId.isEmpty() && networkInformationResult.CellIdDeltaDistance == -1.0d && (bVar2 = this.f36602i) != null && bVar2.f36607a.equals(networkInformationResult.RadioInfo.GsmCellId)) || (!networkInformationResult.RadioInfo.CdmaBaseStationId.isEmpty() && networkInformationResult.CellIdDeltaDistance == -1.0d && (bVar = this.f36602i) != null && bVar.f36607a.equals(networkInformationResult.RadioInfo.CdmaBaseStationId))) {
            C8882b bVar7 = this.f36602i;
            double d = bVar7.f36608b;
            double d2 = bVar7.f36609c;
            LocationInfo locationInfo4 = networkInformationResult.LocationInfo;
            networkInformationResult.CellIdDeltaDistance = C9274s2.m49254a(d, d2, locationInfo4.LocationLatitude, locationInfo4.LocationLongitude);
        }
        if (!str.isEmpty() && !str.equals(this.f36603j.f36611a)) {
            C8883c cVar = this.f36603j;
            networkInformationResult.PrevNirId = cVar.f36612b;
            networkInformationResult.PrevCellId = cVar.f36611a;
            networkInformationResult.PrevLAC = cVar.f36613c;
            networkInformationResult.PrevNetworkType = cVar.f36614d;
            networkInformationResult.PrevMCC = cVar.f36615e;
            networkInformationResult.PrevMNC = cVar.f36616f;
            networkInformationResult.PrevRXLevel = cVar.f36617g;
        }
        C8883c cVar2 = this.f36603j;
        String str5 = networkInformationResult.NirId;
        RadioInfo radioInfo = networkInformationResult.RadioInfo;
        cVar2.mo29262a(str5, str, radioInfo.GsmLAC, radioInfo.NetworkType, radioInfo.MCC, radioInfo.MNC, radioInfo.RXLevel);
        return networkInformationResult;
    }

    /* renamed from: b */
    public C9068k8 mo29257b() {
        return this.f36598e;
    }

    /* renamed from: a */
    private CallStates m48434a() {
        if (this.f36601h == null) {
            return CallStates.Unknown;
        }
        if (Build.VERSION.SDK_INT >= 31 && this.f36595b.checkSelfPermission("android.permission.READ_PHONE_STATE") != 0) {
            return CallStates.Unknown;
        }
        int callState = this.f36601h.getCallState();
        if (callState == 0) {
            return CallStates.Idle;
        }
        if (callState == 1) {
            return CallStates.Ringing;
        }
        if (callState != 2) {
            return CallStates.Unknown;
        }
        return CallStates.Offhook;
    }

    /* renamed from: a */
    private void m48435a(C8882b bVar) {
        this.f36594a.edit().putString(f36593t, bVar.f36607a).commit();
        this.f36594a.edit().putLong(f36591r, Double.doubleToRawLongBits(bVar.f36608b)).commit();
        this.f36594a.edit().putLong(f36592s, Double.doubleToRawLongBits(bVar.f36609c)).commit();
    }

    /* renamed from: a */
    public void mo29256a(LocationController.C9162c cVar) {
        LocationController locationController = this.f36600g;
        if (locationController != null) {
            locationController.mo29723a(cVar);
        }
    }

    /* renamed from: a */
    public void mo29255a(C9115l8 l8Var) {
        C9068k8 k8Var = this.f36598e;
        if (k8Var != null) {
            k8Var.mo29545a(l8Var);
        }
    }
}
