package com.startapp;

import android.content.Context;
import android.os.Build;
import android.telephony.CellIdentityCdma;
import android.telephony.CellIdentityGsm;
import android.telephony.CellIdentityLte;
import android.telephony.CellIdentityNr;
import android.telephony.CellIdentityTdscdma;
import android.telephony.CellIdentityWcdma;
import android.telephony.CellInfo;
import android.telephony.CellInfoCdma;
import android.telephony.CellInfoGsm;
import android.telephony.CellInfoLte;
import android.telephony.CellInfoNr;
import android.telephony.CellInfoTdscdma;
import android.telephony.CellInfoWcdma;
import android.telephony.CellLocation;
import android.telephony.CellSignalStrength;
import android.telephony.CellSignalStrengthGsm;
import android.telephony.CellSignalStrengthLte;
import android.telephony.cdma.CdmaCellLocation;
import android.telephony.gsm.GsmCellLocation;
import com.startapp.sdk.adsbase.C9441e;
import com.startapp.sdk.adsbase.remoteconfig.LocationMetadata;
import com.startapp.sdk.adsbase.remoteconfig.TelephonyMetadata;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.startapp.qa */
/* compiled from: Sta */
public class C9246qa extends C8825a8<C9198oa> {

    /* renamed from: j */
    public final C8923e2 f38122j;

    /* renamed from: k */
    public final C8908d3<TelephonyMetadata> f38123k;

    /* renamed from: l */
    public final C8908d3<LocationMetadata> f38124l;

    /* renamed from: com.startapp.qa$a */
    /* compiled from: Sta */
    public class C9247a implements Comparator<CellInfo> {
        public C9247a(C9246qa qaVar) {
        }

        public int compare(Object obj, Object obj2) {
            CellInfo cellInfo = (CellInfo) obj;
            CellInfo cellInfo2 = (CellInfo) obj2;
            if (cellInfo.isRegistered() == cellInfo2.isRegistered()) {
                return C9246qa.m49188a(cellInfo2) - C9246qa.m49188a(cellInfo);
            }
            if (cellInfo.isRegistered()) {
                return -1;
            }
            return cellInfo2.isRegistered() ? 1 : 0;
        }
    }

    public C9246qa(Context context, C9441e eVar, C9256r3 r3Var, C8923e2 e2Var, C8908d3<TelephonyMetadata> d3Var, C8908d3<LocationMetadata> d3Var2) {
        super(context, eVar, r3Var, "c9c194d3e01bcf14", "086ea3852ae4e475");
        this.f38122j = e2Var;
        this.f38123k = d3Var;
        this.f38124l = d3Var2;
    }

    /* renamed from: a */
    public final boolean mo29857a(int i) {
        TelephonyMetadata call = this.f38123k.call();
        if (call == null || !call.mo31141c()) {
            call = null;
        }
        if (call == null || (call.mo31138a() & i) != i || Math.random() >= call.mo31140b()) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x00c2 A[Catch:{ all -> 0x00b3, all -> 0x00c8 }] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo29858b(boolean r6) {
        /*
            r5 = this;
            android.content.Context r0 = r5.f36944a     // Catch:{ all -> 0x00ef }
            java.lang.String r1 = "phone"
            java.lang.Object r0 = r0.getSystemService(r1)     // Catch:{ all -> 0x00ef }
            android.telephony.TelephonyManager r0 = (android.telephony.TelephonyManager) r0     // Catch:{ all -> 0x00ef }
            com.startapp.oa r1 = new com.startapp.oa     // Catch:{ all -> 0x00ef }
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch:{ all -> 0x00ef }
            r2.<init>()     // Catch:{ all -> 0x00ef }
            r1.<init>(r2)     // Catch:{ all -> 0x00ef }
            int r2 = r0.getSimState()     // Catch:{ all -> 0x00ef }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x00ef }
            r3 = 7
            r1.mo29796a(r3, r2)     // Catch:{ all -> 0x00ef }
            java.lang.String r2 = r0.getSimOperator()     // Catch:{ all -> 0x00ef }
            r3 = 8
            r1.mo29796a(r3, r2)     // Catch:{ all -> 0x00ef }
            java.lang.String r2 = r0.getSimOperatorName()     // Catch:{ all -> 0x00ef }
            r3 = 9
            r1.mo29796a(r3, r2)     // Catch:{ all -> 0x00ef }
            int r2 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x00ef }
            r3 = 28
            if (r2 < r3) goto L_0x0052
            int r3 = r0.getSimCarrierId()     // Catch:{ all -> 0x00ef }
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch:{ all -> 0x00ef }
            r4 = 15
            r1.mo29796a(r4, r3)     // Catch:{ all -> 0x00ef }
            java.lang.CharSequence r3 = r0.getSimCarrierIdName()     // Catch:{ all -> 0x00ef }
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch:{ all -> 0x00ef }
            r4 = 16
            r1.mo29796a(r4, r3)     // Catch:{ all -> 0x00ef }
        L_0x0052:
            int r3 = r0.getPhoneType()     // Catch:{ all -> 0x00ef }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x00ef }
            r4 = 10
            r1.mo29796a(r4, r3)     // Catch:{ all -> 0x00ef }
            java.lang.String r3 = r0.getNetworkOperator()     // Catch:{ all -> 0x00ef }
            java.lang.String r3 = com.startapp.C8811a.m48226b(r3)     // Catch:{ all -> 0x00ef }
            r4 = 11
            r1.mo29796a(r4, r3)     // Catch:{ all -> 0x00ef }
            java.lang.String r3 = r0.getNetworkOperatorName()     // Catch:{ all -> 0x00ef }
            java.lang.String r3 = com.startapp.C8811a.m48226b(r3)     // Catch:{ all -> 0x00ef }
            r4 = 12
            r1.mo29796a(r4, r3)     // Catch:{ all -> 0x00ef }
            com.startapp.d3<com.startapp.sdk.adsbase.remoteconfig.LocationMetadata> r3 = r5.f38124l     // Catch:{ all -> 0x00ef }
            java.lang.Object r3 = r3.call()     // Catch:{ all -> 0x00ef }
            com.startapp.sdk.adsbase.remoteconfig.LocationMetadata r3 = (com.startapp.sdk.adsbase.remoteconfig.LocationMetadata) r3     // Catch:{ all -> 0x00ef }
            if (r3 == 0) goto L_0x0092
            boolean r3 = r3.mo30982a()     // Catch:{ all -> 0x00ef }
            if (r3 == 0) goto L_0x0092
            android.content.Context r3 = r5.f36944a     // Catch:{ all -> 0x00ef }
            java.lang.String r4 = "android.permission.ACCESS_FINE_LOCATION"
            boolean r3 = com.startapp.C8837b0.m48304a((android.content.Context) r3, (java.lang.String) r4)     // Catch:{ all -> 0x00ef }
            goto L_0x0093
        L_0x0092:
            r3 = 0
        L_0x0093:
            if (r3 == 0) goto L_0x00eb
            r3 = 29
            if (r2 < r3) goto L_0x00d4
            if (r6 == 0) goto L_0x00d4
            com.startapp.d3<com.startapp.sdk.adsbase.remoteconfig.TelephonyMetadata> r6 = r5.f38123k     // Catch:{ all -> 0x00ef }
            java.lang.Object r6 = r6.call()     // Catch:{ all -> 0x00ef }
            com.startapp.sdk.adsbase.remoteconfig.TelephonyMetadata r6 = (com.startapp.sdk.adsbase.remoteconfig.TelephonyMetadata) r6     // Catch:{ all -> 0x00ef }
            if (r6 == 0) goto L_0x00d4
            boolean r6 = r6.mo31142d()     // Catch:{ all -> 0x00ef }
            if (r6 == 0) goto L_0x00d4
            if (r2 < r3) goto L_0x00bf
            com.startapp.pa r6 = new com.startapp.pa     // Catch:{ all -> 0x00b3 }
            r6.<init>(r5)     // Catch:{ all -> 0x00b3 }
            goto L_0x00c0
        L_0x00b3:
            r6 = move-exception
            r2 = 32
            boolean r2 = r5.mo29857a((int) r2)     // Catch:{ all -> 0x00c8 }
            if (r2 == 0) goto L_0x00bf
            com.startapp.C9023i4.m48681a((java.lang.Throwable) r6)     // Catch:{ all -> 0x00c8 }
        L_0x00bf:
            r6 = 0
        L_0x00c0:
            if (r6 == 0) goto L_0x00d4
            com.startapp.r3 r2 = r5.f36415f     // Catch:{ all -> 0x00c8 }
            r0.requestCellInfoUpdate(r2, r6)     // Catch:{ all -> 0x00c8 }
            goto L_0x00d4
        L_0x00c8:
            r6 = move-exception
            r2 = 64
            boolean r2 = r5.mo29857a((int) r2)     // Catch:{ all -> 0x00ef }
            if (r2 == 0) goto L_0x00d4
            com.startapp.C9023i4.m48681a((java.lang.Throwable) r6)     // Catch:{ all -> 0x00ef }
        L_0x00d4:
            int r6 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x00ef }
            r2 = 17
            if (r6 < r2) goto L_0x00e4
            java.util.List r6 = r0.getAllCellInfo()     // Catch:{ all -> 0x00ef }
            if (r6 == 0) goto L_0x00eb
            r5.mo29856a((com.startapp.C9198oa) r1, (java.util.List<android.telephony.CellInfo>) r6)     // Catch:{ all -> 0x00ef }
            goto L_0x00eb
        L_0x00e4:
            android.telephony.CellLocation r6 = r0.getCellLocation()     // Catch:{ all -> 0x00ef }
            r5.mo29855a((com.startapp.C9198oa) r1, (android.telephony.CellLocation) r6)     // Catch:{ all -> 0x00ef }
        L_0x00eb:
            r5.mo29088b(r1)     // Catch:{ all -> 0x00ef }
            goto L_0x00fb
        L_0x00ef:
            r6 = move-exception
            r0 = 128(0x80, float:1.794E-43)
            boolean r0 = r5.mo29857a((int) r0)
            if (r0 == 0) goto L_0x00fb
            com.startapp.C9023i4.m48681a((java.lang.Throwable) r6)
        L_0x00fb:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.startapp.C9246qa.mo29858b(boolean):void");
    }

    /* renamed from: c */
    public String mo29089c(Object obj) {
        return ((C9198oa) obj).f38009a.toString();
    }

    /* renamed from: d */
    public long mo29090d() {
        return 60000;
    }

    /* renamed from: f */
    public boolean mo29092f() {
        TelephonyMetadata call;
        if (!this.f38122j.mo29324c() || (call = this.f38123k.call()) == null || !call.mo31141c()) {
            return false;
        }
        return true;
    }

    /* renamed from: g */
    public void mo29093g() {
        mo29858b(true);
    }

    /* renamed from: c */
    public Object mo29309c() {
        return C9198oa.f38008b;
    }

    /* renamed from: a */
    public final void mo29855a(C9198oa oaVar, CellLocation cellLocation) {
        if (cellLocation instanceof GsmCellLocation) {
            GsmCellLocation gsmCellLocation = (GsmCellLocation) cellLocation;
            oaVar.mo29796a(4, C8811a.m48226b(String.valueOf(gsmCellLocation.getCid())));
            oaVar.mo29796a(3, C8811a.m48226b(String.valueOf(gsmCellLocation.getLac())));
        } else if (cellLocation instanceof CdmaCellLocation) {
            CdmaCellLocation cdmaCellLocation = (CdmaCellLocation) cellLocation;
            oaVar.mo29796a(1, C8811a.m48226b(String.valueOf(cdmaCellLocation.getBaseStationLatitude())));
            oaVar.mo29796a(2, C8811a.m48226b(String.valueOf(cdmaCellLocation.getBaseStationLongitude())));
        }
    }

    /* renamed from: a */
    public Object mo29087a(String str) {
        if (str != null) {
            C9198oa oaVar = C9198oa.f38008b;
            try {
                return new C9198oa(new JSONObject(str));
            } catch (JSONException unused) {
            }
        }
        return null;
    }

    /* renamed from: a */
    public static int m49188a(CellInfo cellInfo) {
        CellSignalStrength cellSignalStrength;
        if (cellInfo instanceof CellInfoCdma) {
            cellSignalStrength = ((CellInfoCdma) cellInfo).getCellSignalStrength();
        } else if (cellInfo instanceof CellInfoGsm) {
            cellSignalStrength = ((CellInfoGsm) cellInfo).getCellSignalStrength();
        } else if (cellInfo instanceof CellInfoLte) {
            cellSignalStrength = ((CellInfoLte) cellInfo).getCellSignalStrength();
        } else {
            int i = Build.VERSION.SDK_INT;
            if (i >= 29 && (cellInfo instanceof CellInfoNr)) {
                cellSignalStrength = ((CellInfoNr) cellInfo).getCellSignalStrength();
            } else if (i < 29 || !(cellInfo instanceof CellInfoTdscdma)) {
                cellSignalStrength = (i < 18 || !(cellInfo instanceof CellInfoWcdma)) ? null : ((CellInfoWcdma) cellInfo).getCellSignalStrength();
            } else {
                cellSignalStrength = ((CellInfoTdscdma) cellInfo).getCellSignalStrength();
            }
        }
        if (cellSignalStrength != null) {
            return cellSignalStrength.getLevel();
        }
        return 0;
    }

    /* renamed from: a */
    public void mo29856a(C9198oa oaVar, List<CellInfo> list) {
        CellIdentityWcdma cellIdentity;
        int tac;
        int timingAdvance;
        int tac2;
        CellSignalStrengthGsm cellSignalStrength;
        int timingAdvance2;
        ArrayList arrayList = new ArrayList(list);
        Collections.sort(arrayList, new C9247a(this));
        oaVar.mo29796a(6, C8811a.m48226b(arrayList.toString()));
        Iterator it = arrayList.iterator();
        boolean z = true;
        while (it.hasNext()) {
            CellInfo cellInfo = (CellInfo) it.next();
            if (z) {
                z = false;
                if (cellInfo instanceof CellInfoCdma) {
                    CellIdentityCdma cellIdentity2 = ((CellInfoCdma) cellInfo).getCellIdentity();
                    if (cellIdentity2 != null) {
                        int latitude = cellIdentity2.getLatitude();
                        int longitude = cellIdentity2.getLongitude();
                        if (!(latitude == Integer.MAX_VALUE || longitude == Integer.MAX_VALUE)) {
                            oaVar.mo29796a(1, C8811a.m48226b(String.valueOf(latitude)));
                            oaVar.mo29796a(2, C8811a.m48226b(String.valueOf(longitude)));
                        }
                    }
                } else if (cellInfo instanceof CellInfoGsm) {
                    CellInfoGsm cellInfoGsm = (CellInfoGsm) cellInfo;
                    CellIdentityGsm cellIdentity3 = cellInfoGsm.getCellIdentity();
                    if (cellIdentity3 != null) {
                        int lac = cellIdentity3.getLac();
                        if (lac != Integer.MAX_VALUE) {
                            oaVar.mo29796a(3, C8811a.m48226b(String.valueOf(lac)));
                        }
                        int cid = cellIdentity3.getCid();
                        if (cid != Integer.MAX_VALUE) {
                            oaVar.mo29796a(4, C8811a.m48226b(String.valueOf(cid)));
                        }
                    }
                    if (!(Build.VERSION.SDK_INT < 26 || (cellSignalStrength = cellInfoGsm.getCellSignalStrength()) == null || (timingAdvance2 = cellSignalStrength.getTimingAdvance()) == Integer.MAX_VALUE)) {
                        oaVar.mo29796a(13, String.valueOf(timingAdvance2));
                    }
                } else if (cellInfo instanceof CellInfoLte) {
                    CellInfoLte cellInfoLte = (CellInfoLte) cellInfo;
                    CellIdentityLte cellIdentity4 = cellInfoLte.getCellIdentity();
                    if (!(cellIdentity4 == null || (tac2 = cellIdentity4.getTac()) == Integer.MAX_VALUE)) {
                        oaVar.mo29796a(5, C8811a.m48226b(String.valueOf(tac2)));
                    }
                    CellSignalStrengthLte cellSignalStrength2 = cellInfoLte.getCellSignalStrength();
                    if (!(cellSignalStrength2 == null || (timingAdvance = cellSignalStrength2.getTimingAdvance()) == Integer.MAX_VALUE)) {
                        oaVar.mo29796a(13, String.valueOf(timingAdvance));
                    }
                } else {
                    int i = Build.VERSION.SDK_INT;
                    if (i >= 29 && (cellInfo instanceof CellInfoNr)) {
                        CellIdentityNr cellIdentityNr = (CellIdentityNr) ((CellInfoNr) cellInfo).getCellIdentity();
                        if (!(cellIdentityNr == null || (tac = cellIdentityNr.getTac()) == Integer.MAX_VALUE)) {
                            oaVar.mo29796a(5, C8811a.m48226b(String.valueOf(tac)));
                        }
                    } else if (i >= 29 && (cellInfo instanceof CellInfoTdscdma)) {
                        CellIdentityTdscdma cellIdentity5 = ((CellInfoTdscdma) cellInfo).getCellIdentity();
                        if (cellIdentity5 != null) {
                            int lac2 = cellIdentity5.getLac();
                            if (lac2 != Integer.MAX_VALUE) {
                                oaVar.mo29796a(3, C8811a.m48226b(String.valueOf(lac2)));
                            }
                            int cid2 = cellIdentity5.getCid();
                            if (cid2 != Integer.MAX_VALUE) {
                                oaVar.mo29796a(4, C8811a.m48226b(String.valueOf(cid2)));
                            }
                        }
                    } else if (i >= 18 && (cellInfo instanceof CellInfoWcdma) && (cellIdentity = ((CellInfoWcdma) cellInfo).getCellIdentity()) != null) {
                        int lac3 = cellIdentity.getLac();
                        if (lac3 != Integer.MAX_VALUE) {
                            oaVar.mo29796a(3, C8811a.m48226b(String.valueOf(lac3)));
                        }
                        int cid3 = cellIdentity.getCid();
                        if (cid3 != Integer.MAX_VALUE) {
                            oaVar.mo29796a(4, C8811a.m48226b(String.valueOf(cid3)));
                        }
                    }
                }
            }
            if (!cellInfo.isRegistered()) {
                return;
            }
            if (Build.VERSION.SDK_INT >= 29 && (cellInfo instanceof CellInfoNr)) {
                oaVar.mo29796a(14, 1);
            }
        }
    }
}
