package com.startapp;

import com.startapp.networkTest.data.radio.NetworkRegistrationInfo;
import com.startapp.networkTest.enums.ThreeStateShort;

/* renamed from: com.startapp.k7 */
/* compiled from: Sta */
public class C9067k7 {
    /* renamed from: a */
    private static NetworkRegistrationInfo m48757a(String[] strArr) {
        NetworkRegistrationInfo networkRegistrationInfo = new NetworkRegistrationInfo();
        for (String str : strArr) {
            if (str.startsWith("transportType")) {
                networkRegistrationInfo.TransportType = m48762e(m48761d(str));
            } else if (str.startsWith("domain")) {
                networkRegistrationInfo.Domain = m48761d(str);
            } else if (str.startsWith("regState")) {
                networkRegistrationInfo.RegState = m48761d(str);
            } else if (str.startsWith("accessNetworkTechnology")) {
                networkRegistrationInfo.NetworkTechnology = m48761d(str);
            } else if (str.startsWith("reasonForDenial")) {
                networkRegistrationInfo.ReasonForDenial = m48761d(str);
            } else if (str.startsWith("emergencyEnabled")) {
                networkRegistrationInfo.EmergencyEnabled = m48761d(str).equals("true");
            } else if (str.startsWith("mIsUsingCarrierAggregation")) {
                networkRegistrationInfo.CarrierAggregation = m48761d(str).equals("true") ? ThreeStateShort.Yes : ThreeStateShort.No;
            } else {
                String str2 = "";
                if (str.startsWith("cellIdentity")) {
                    String d = m48761d(str);
                    networkRegistrationInfo.CellTechnology = d;
                    networkRegistrationInfo.CellTechnology = d.replace("CellIdentity", str2);
                } else if (str.startsWith("mCid") || str.startsWith("mCi") || str.startsWith("mNetworkId") || str.startsWith("mNci")) {
                    networkRegistrationInfo.CellId = m48761d(str);
                } else if (str.startsWith("mLac") || str.startsWith("mTac") || str.startsWith("mSystemId")) {
                    networkRegistrationInfo.Tac = m48761d(str);
                } else if (str.startsWith("mBsic") || str.startsWith("mPsc") || str.startsWith("mPci") || str.startsWith("mBasestationId")) {
                    String d2 = m48761d(str);
                    if (!d2.startsWith("0x") || d2.length() <= 2) {
                        str2 = d2;
                    } else {
                        try {
                            str2 = String.valueOf((int) Long.parseLong(d2.substring(2), 16));
                        } catch (Throwable th) {
                            C9632x2.m50510a(th);
                        }
                    }
                    networkRegistrationInfo.Pci = str2;
                } else if (str.startsWith("mArfcn") || str.startsWith("mUarfcn") || str.startsWith("mEarfcn") || str.startsWith("mNrArfcn")) {
                    try {
                        networkRegistrationInfo.Arfcn = Integer.parseInt(m48761d(str));
                    } catch (Throwable th2) {
                        C9632x2.m50510a(th2);
                    }
                } else if (str.startsWith("mBandwidth")) {
                    try {
                        networkRegistrationInfo.Bandwidth = Integer.parseInt(m48761d(str));
                    } catch (Throwable th3) {
                        C9632x2.m50510a(th3);
                    }
                } else if (str.startsWith("mMcc")) {
                    networkRegistrationInfo.Mcc = m48761d(str);
                } else if (str.startsWith("mMnc")) {
                    networkRegistrationInfo.Mnc = m48761d(str);
                } else if (str.startsWith("mAlphaLong")) {
                    networkRegistrationInfo.OperatorLong = m48761d(str);
                } else if (str.startsWith("mAlphaShort")) {
                    networkRegistrationInfo.OperatorShort = m48761d(str);
                } else if (str.startsWith("mMaxDataCalls")) {
                    try {
                        networkRegistrationInfo.MaxDataCalls = Integer.parseInt(m48761d(str));
                    } catch (Throwable th4) {
                        C9632x2.m50510a(th4);
                    }
                } else if (str.startsWith("availableServices")) {
                    networkRegistrationInfo.AvailableServices = m48761d(str);
                } else if (str.startsWith("nrState") || str.startsWith("nrStatus")) {
                    networkRegistrationInfo.NrState = m48761d(str);
                } else if (str.startsWith("isDcNrRestricted")) {
                    networkRegistrationInfo.DcNrRestricted = m48761d(str).equals("true") ? ThreeStateShort.Yes : ThreeStateShort.No;
                } else if (str.startsWith("isNrAvailable")) {
                    networkRegistrationInfo.NrAvailable = m48761d(str).equals("true") ? ThreeStateShort.Yes : ThreeStateShort.No;
                } else if (str.startsWith("isEnDcAvailable")) {
                    networkRegistrationInfo.EnDcAvailable = m48761d(str).equals("true") ? ThreeStateShort.Yes : ThreeStateShort.No;
                }
            }
        }
        return networkRegistrationInfo;
    }

    /* renamed from: b */
    private static String[] m48759b(String str) {
        return str.replace("NetworkRegistrationState", " ").replace("NetworkRegistrationInfo", " ").replace("}", " ").replace("{", " ").replace(":", "").replaceAll(" +", " ").trim().split(" ");
    }

    /* renamed from: c */
    public static NetworkRegistrationInfo[] m48760c(String str) {
        String str2 = "mNetworkRegistrationStates=";
        try {
            int indexOf = str.indexOf(str2);
            if (indexOf == -1) {
                str2 = "mNetworkRegistrationInfos=";
                indexOf = str.indexOf(str2);
            }
            if (indexOf == -1) {
                return new NetworkRegistrationInfo[0];
            }
            String replaceAll = str.substring(indexOf).substring(str2.length() + 1).replaceAll("\\[\\w@", "@");
            int indexOf2 = replaceAll.indexOf("]");
            int indexOf3 = replaceAll.indexOf("[");
            while (indexOf3 != -1 && indexOf2 > indexOf3) {
                replaceAll = replaceAll.replaceFirst("\\[", "").replaceFirst("]", "");
                indexOf3 = replaceAll.indexOf("[");
                indexOf2 = replaceAll.indexOf("]");
            }
            String[] split = replaceAll.substring(0, indexOf2).split(", ");
            NetworkRegistrationInfo[] networkRegistrationInfoArr = new NetworkRegistrationInfo[split.length];
            for (int i = 0; i < split.length; i++) {
                split[i] = m48758a(split[i]);
                split[i] = split[i].trim();
                networkRegistrationInfoArr[i] = m48757a(m48759b(split[i]));
            }
            return networkRegistrationInfoArr;
        } catch (Throwable th) {
            C9632x2.m50510a(th);
            return new NetworkRegistrationInfo[0];
        }
    }

    /* renamed from: d */
    private static String m48761d(String str) {
        String[] split = str.split("=");
        return split.length > 1 ? split[1] : "";
    }

    /* renamed from: e */
    private static String m48762e(String str) {
        try {
            int parseInt = Integer.parseInt(str);
            if (parseInt != 1) {
                return parseInt != 2 ? Integer.toString(parseInt) : "WLAN";
            }
            return "WWAN";
        } catch (Throwable th) {
            C9632x2.m50512b(th);
            return str;
        }
    }

    /* renamed from: a */
    private static String m48758a(String str) {
        return str.replace("isDcNrRestricted = false", "isDcNrRestricted=false").replace("isDcNrRestricted = true", "isDcNrRestricted=true").replace("isNrAvailable = false", "isNrAvailable=false").replace("isNrAvailable = true", "isNrAvailable=true").replace("isEnDcAvailable = false", "isEnDcAvailable=false").replace("isEnDcAvailable = true", "isEnDcAvailable=true").replace("mIsUsingCarrierAggregation = false", "mIsUsingCarrierAggregation=false").replace("mIsUsingCarrierAggregation = true", "mIsUsingCarrierAggregation=true");
    }
}
