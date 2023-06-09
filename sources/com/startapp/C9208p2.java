package com.startapp;

import android.app.ActivityManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.database.Cursor;
import android.net.TrafficStats;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.os.PowerManager;
import android.os.Process;
import android.os.StatFs;
import android.os.SystemClock;
import android.provider.MediaStore;
import android.provider.Settings;
import android.telephony.SubscriptionInfo;
import android.telephony.SubscriptionManager;
import android.telephony.TelephonyManager;
import com.startapp.networkTest.enums.C9163Os;
import com.startapp.networkTest.enums.IdleStates;
import com.startapp.networkTest.enums.MemoryStates;
import com.startapp.networkTest.enums.MultiSimVariants;
import com.startapp.networkTest.enums.PhoneTypes;
import com.startapp.networkTest.enums.ScreenStates;
import com.startapp.networkTest.enums.SimStates;
import com.startapp.networkTest.enums.ThreeState;
import java.io.File;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* renamed from: com.startapp.p2 */
/* compiled from: Sta */
public class C9208p2 {

    /* renamed from: a */
    private static final String f38044a = "p2";

    /* renamed from: b */
    private static final boolean f38045b = false;

    /* renamed from: com.startapp.p2$a */
    /* compiled from: Sta */
    public static /* synthetic */ class C9209a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f38046a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                com.startapp.networkTest.enums.AnonymizationLevel[] r0 = com.startapp.networkTest.enums.AnonymizationLevel.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f38046a = r0
                com.startapp.networkTest.enums.AnonymizationLevel r1 = com.startapp.networkTest.enums.AnonymizationLevel.Full     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f38046a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.startapp.networkTest.enums.AnonymizationLevel r1 = com.startapp.networkTest.enums.AnonymizationLevel.Anonymized     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f38046a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.startapp.networkTest.enums.AnonymizationLevel r1 = com.startapp.networkTest.enums.AnonymizationLevel.None     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.startapp.C9208p2.C9209a.<clinit>():void");
        }
    }

    /* renamed from: a */
    private static C9125m1 m49116a(Context context) {
        C9125m1 m1Var = new C9125m1();
        m1Var.MissingPermission = true;
        return m1Var;
    }

    /* renamed from: b */
    public static C9237q2 m49121b(Context context) {
        String[] strArr;
        C9237q2 q2Var = new C9237q2();
        q2Var.DeviceManufacturer = Build.MANUFACTURER;
        q2Var.DeviceName = Build.MODEL;
        q2Var.f38112OS = C9163Os.Android;
        q2Var.OSVersion = Build.VERSION.RELEASE;
        q2Var.BuildFingerprint = Build.FINGERPRINT;
        q2Var.DeviceUpTime = SystemClock.elapsedRealtime();
        q2Var.UserLocal = Locale.getDefault().toString();
        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
        if (telephonyManager != null) {
            q2Var.SimOperator = C9135ma.m48968a(telephonyManager.getSimOperator());
            q2Var.SimOperatorName = C9135ma.m48968a(telephonyManager.getSimOperatorName());
            int i = Build.VERSION.SDK_INT;
            if (i >= 29) {
                String typeAllocationCode = telephonyManager.getTypeAllocationCode();
                if (typeAllocationCode == null || typeAllocationCode.isEmpty()) {
                    String manufacturerCode = telephonyManager.getManufacturerCode();
                    if (manufacturerCode != null && !manufacturerCode.isEmpty()) {
                        q2Var.TAC = manufacturerCode;
                    }
                } else {
                    q2Var.TAC = typeAllocationCode;
                }
            }
            SimStates simStates = SimStates.Unknown;
            int simState = telephonyManager.getSimState();
            if (simState == 1) {
                simStates = SimStates.Absent;
            } else if (simState == 2) {
                simStates = SimStates.PinRequired;
            } else if (simState == 3) {
                simStates = SimStates.PukRequired;
            } else if (simState == 4) {
                simStates = SimStates.NetworkLocked;
            } else if (simState == 5) {
                simStates = SimStates.Ready;
            }
            q2Var.SimState = simStates;
            if (i >= 23) {
                try {
                    q2Var.PhoneCount = ((Integer) telephonyManager.getClass().getDeclaredMethod("getPhoneCount", new Class[0]).invoke(telephonyManager, new Object[0])).intValue();
                } catch (Throwable th) {
                    C9632x2.m50512b(th);
                }
            }
            PhoneTypes phoneTypes = PhoneTypes.Unknown;
            int phoneType = telephonyManager.getPhoneType();
            if (phoneType == 0) {
                phoneTypes = PhoneTypes.None;
            } else if (phoneType == 1) {
                phoneTypes = PhoneTypes.GSM;
            } else if (phoneType == 2) {
                phoneTypes = PhoneTypes.CDMA;
            } else if (phoneType == 3) {
                phoneTypes = PhoneTypes.SIP;
            }
            q2Var.PhoneType = phoneTypes;
        }
        q2Var.IsRooted = m49120a();
        if (Build.VERSION.SDK_INT <= 24) {
            strArr = C9622w9.m50493a("/proc/version");
        } else {
            strArr = C9622w9.m50494b("uname -a");
        }
        if (strArr.length > 0) {
            q2Var.OsSystemVersion = C9135ma.m48968a(strArr[0]);
        }
        q2Var.BluetoothInfo = m49116a(context);
        q2Var.PowerSaveMode = m49128g(context);
        q2Var.MultiSimInfo = m49127f(context);
        q2Var.HostAppInfo = m49124c(context);
        return q2Var;
    }

    /* renamed from: c */
    private static C9635x3 m49124c(Context context) {
        C9635x3 x3Var = new C9635x3();
        x3Var.AppPackageName = context.getPackageName();
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        if (applicationInfo == null) {
            try {
                applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 0);
            } catch (Throwable th) {
                C9632x2.m50512b(th);
            }
        }
        if (applicationInfo != null) {
            x3Var.AppTargetVersion = applicationInfo.targetSdkVersion;
            x3Var.AppName = (String) applicationInfo.loadLabel(context.getPackageManager());
            if (Build.VERSION.SDK_INT >= 26) {
                x3Var.AppCategory = C9036j0.m48695a(applicationInfo.category);
            }
        }
        ArrayList<C8921e0> arrayList = new ArrayList<>();
        try {
            for (String str : context.getPackageManager().getPackageInfo(context.getPackageName(), 4096).requestedPermissions) {
                C8921e0 e0Var = new C8921e0();
                e0Var.Permission = str.toLowerCase();
                if (str.equalsIgnoreCase("android.permission.PACKAGE_USAGE_STATS")) {
                    e0Var.IsGranted = C9036j0.m48698b(context) ? 1 : 0;
                } else {
                    e0Var.IsGranted = context.checkPermission(str, Process.myPid(), Process.myUid()) == 0 ? 1 : 0;
                }
                arrayList.add(e0Var);
            }
        } catch (Throwable th2) {
            x3Var.AppPermissions = arrayList;
            throw th2;
        }
        x3Var.AppPermissions = arrayList;
        return x3Var;
    }

    /* renamed from: d */
    public static IdleStates m49125d(Context context) {
        PowerManager powerManager;
        IdleStates idleStates = IdleStates.Unknown;
        int i = Build.VERSION.SDK_INT;
        if (i < 23 || (powerManager = (PowerManager) context.getSystemService("power")) == null) {
            return idleStates;
        }
        if (i >= 24) {
            try {
                if (((Boolean) powerManager.getClass().getDeclaredMethod("isLightDeviceIdleMode", new Class[0]).invoke(powerManager, new Object[0])).booleanValue()) {
                    idleStates = IdleStates.LightIdle;
                }
            } catch (Throwable th) {
                C9632x2.m50512b(th);
            }
        }
        if (idleStates != IdleStates.LightIdle) {
            return powerManager.isDeviceIdleMode() ? IdleStates.DeepIdle : IdleStates.NonIdle;
        }
        return idleStates;
    }

    /* renamed from: e */
    public static C9025i6 m49126e(Context context) {
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        ((ActivityManager) context.getSystemService("activity")).getMemoryInfo(memoryInfo);
        C9025i6 i6Var = new C9025i6();
        long j = memoryInfo.availMem;
        i6Var.MemoryFree = j;
        if (Build.VERSION.SDK_INT >= 16) {
            long j2 = memoryInfo.totalMem;
            i6Var.MemoryTotal = j2;
            i6Var.MemoryUsed = j2 - j;
        }
        if (memoryInfo.lowMemory) {
            i6Var.MemoryState = MemoryStates.Low;
        } else {
            i6Var.MemoryState = MemoryStates.Normal;
        }
        return i6Var;
    }

    /* renamed from: f */
    public static C9678z6 m49127f(Context context) {
        Method method;
        Method method2;
        Method method3;
        Method method4;
        SimStates simStates;
        Method method5;
        Method method6;
        Method method7;
        Method method8;
        C9678z6 z6Var = new C9678z6();
        if (Build.VERSION.SDK_INT >= 22 && context.checkCallingOrSelfPermission("android.permission.READ_PHONE_STATE") == 0) {
            SubscriptionManager subscriptionManager = (SubscriptionManager) context.getSystemService("telephony_subscription_service");
            char c = 65535;
            if (subscriptionManager != null) {
                z6Var.ActiveSimCount = subscriptionManager.getActiveSubscriptionInfoCount();
                z6Var.ActiveSimCountMax = subscriptionManager.getActiveSubscriptionInfoCountMax();
                List<SubscriptionInfo> activeSubscriptionInfoList = subscriptionManager.getActiveSubscriptionInfoList();
                if (activeSubscriptionInfoList != null && activeSubscriptionInfoList.size() > 0) {
                    C9662y9[] y9VarArr = new C9662y9[activeSubscriptionInfoList.size()];
                    int i = 0;
                    for (SubscriptionInfo next : activeSubscriptionInfoList) {
                        C9662y9 y9Var = new C9662y9();
                        try {
                            if (next.getCarrierName() != null) {
                                y9Var.CarrierName = C9135ma.m48968a(next.getCarrierName().toString());
                            }
                        } catch (Throwable th) {
                            C9632x2.m50512b(th);
                        }
                        try {
                            if (next.getCountryIso() != null) {
                                y9Var.CountryIso = C9135ma.m48968a(next.getCountryIso());
                            }
                        } catch (Throwable th2) {
                            C9632x2.m50512b(th2);
                        }
                        try {
                            if (next.getIccId() != null) {
                                y9Var.IccId = m49118a(C9135ma.m48968a(next.getIccId()));
                            }
                        } catch (Throwable th3) {
                            C9632x2.m50512b(th3);
                        }
                        y9Var.Mcc = next.getMcc() == Integer.MAX_VALUE ? -1 : next.getMcc();
                        y9Var.Mnc = next.getMnc() == Integer.MAX_VALUE ? -1 : next.getMnc();
                        y9Var.SimSlotIndex = next.getSimSlotIndex();
                        y9Var.SubscriptionId = next.getSubscriptionId();
                        y9Var.DataRoaming = next.getDataRoaming() == 1;
                        m49119a(context, y9Var.SubscriptionId, y9Var);
                        y9VarArr[i] = y9Var;
                        i++;
                    }
                    z6Var.SimInfos = new ArrayList<>(Arrays.asList(y9VarArr));
                }
                try {
                    method5 = subscriptionManager.getClass().getDeclaredMethod("getDefaultDataSubscriptionId", new Class[0]);
                } catch (NoSuchMethodException e) {
                    C9632x2.m50512b(e);
                    method5 = null;
                }
                if (method5 == null) {
                    try {
                        method5 = subscriptionManager.getClass().getDeclaredMethod("getDefaultDataSubId", new Class[0]);
                    } catch (NoSuchMethodException e2) {
                        C9632x2.m50512b(e2);
                    }
                }
                if (method5 != null) {
                    try {
                        z6Var.DefaultDataSimId = ((Integer) method5.invoke(subscriptionManager, new Object[0])).intValue();
                    } catch (Throwable th4) {
                        C9632x2.m50510a(th4);
                    }
                }
                try {
                    method6 = subscriptionManager.getClass().getDeclaredMethod("getDefaultSmsSubscriptionId", new Class[0]);
                } catch (NoSuchMethodException e3) {
                    C9632x2.m50512b(e3);
                    method6 = null;
                }
                if (method6 == null) {
                    try {
                        method6 = subscriptionManager.getClass().getDeclaredMethod("getDefaultSmsSubId", new Class[0]);
                    } catch (NoSuchMethodException e4) {
                        C9632x2.m50512b(e4);
                    }
                }
                if (method6 != null) {
                    try {
                        z6Var.DefaultSmsSimId = ((Integer) method6.invoke(subscriptionManager, new Object[0])).intValue();
                    } catch (Throwable th5) {
                        C9632x2.m50510a(th5);
                    }
                }
                try {
                    method7 = subscriptionManager.getClass().getDeclaredMethod("getDefaultSubscriptionId", new Class[0]);
                } catch (NoSuchMethodException e5) {
                    C9632x2.m50512b(e5);
                    method7 = null;
                }
                if (method7 == null) {
                    try {
                        method7 = subscriptionManager.getClass().getDeclaredMethod("getDefaultSubId", new Class[0]);
                    } catch (NoSuchMethodException e6) {
                        C9632x2.m50512b(e6);
                    }
                }
                if (method7 != null) {
                    try {
                        z6Var.DefaultSimId = ((Integer) method7.invoke(subscriptionManager, new Object[0])).intValue();
                    } catch (Throwable th6) {
                        C9632x2.m50510a(th6);
                    }
                }
                try {
                    method8 = subscriptionManager.getClass().getDeclaredMethod("getDefaultVoiceSubscriptionId", new Class[0]);
                } catch (NoSuchMethodException e7) {
                    C9632x2.m50512b(e7);
                    method8 = null;
                }
                if (method8 == null) {
                    try {
                        method8 = subscriptionManager.getClass().getDeclaredMethod("getDefaultVoiceSubId", new Class[0]);
                    } catch (NoSuchMethodException e8) {
                        C9632x2.m50512b(e8);
                    }
                }
                if (method8 != null) {
                    try {
                        z6Var.DefaultVoiceSimId = ((Integer) method8.invoke(subscriptionManager, new Object[0])).intValue();
                    } catch (Throwable th7) {
                        C9632x2.m50510a(th7);
                    }
                }
            }
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
            if (telephonyManager != null) {
                try {
                    method = telephonyManager.getClass().getDeclaredMethod("getMultiSimConfiguration", new Class[0]);
                } catch (NoSuchMethodException e9) {
                    C9632x2.m50512b(e9);
                    method = null;
                }
                if (method != null) {
                    try {
                        Object invoke = method.invoke(telephonyManager, new Object[0]);
                        if (invoke instanceof Enum) {
                            String obj = invoke.toString();
                            int hashCode = obj.hashCode();
                            if (hashCode != 2107724) {
                                if (hashCode != 2107742) {
                                    if (hashCode == 2584894) {
                                        if (obj.equals("TSTS")) {
                                            c = 2;
                                        }
                                    }
                                } else if (obj.equals("DSDS")) {
                                    c = 1;
                                }
                            } else if (obj.equals("DSDA")) {
                                c = 0;
                            }
                            if (c == 0) {
                                z6Var.MultiSimVariant = MultiSimVariants.DSDA;
                            } else if (c == 1) {
                                z6Var.MultiSimVariant = MultiSimVariants.DSDS;
                            } else if (c != 2) {
                                z6Var.MultiSimVariant = MultiSimVariants.Unknown;
                            } else {
                                z6Var.MultiSimVariant = MultiSimVariants.TSTS;
                            }
                        }
                    } catch (Throwable th8) {
                        C9632x2.m50510a(th8);
                    }
                }
                Iterator<C9662y9> it = z6Var.SimInfos.iterator();
                while (it.hasNext()) {
                    C9662y9 next2 = it.next();
                    try {
                        method2 = telephonyManager.getClass().getDeclaredMethod("getSimState", new Class[]{Integer.TYPE});
                    } catch (NoSuchMethodException e10) {
                        C9632x2.m50512b(e10);
                        method2 = null;
                    }
                    if (method2 != null) {
                        try {
                            switch (((Integer) method2.invoke(telephonyManager, new Object[]{Integer.valueOf(next2.SimSlotIndex)})).intValue()) {
                                case 1:
                                    simStates = SimStates.Absent;
                                    break;
                                case 2:
                                    simStates = SimStates.PinRequired;
                                    break;
                                case 3:
                                    simStates = SimStates.PukRequired;
                                    break;
                                case 4:
                                    simStates = SimStates.NetworkLocked;
                                    break;
                                case 5:
                                    simStates = SimStates.Ready;
                                    break;
                                case 6:
                                    simStates = SimStates.NotReady;
                                    break;
                                case 7:
                                    simStates = SimStates.PermanentlyDisabled;
                                    break;
                                case 8:
                                    simStates = SimStates.CardIoError;
                                    break;
                                case 9:
                                    simStates = SimStates.CardRestricted;
                                    break;
                                default:
                                    simStates = SimStates.Unknown;
                                    break;
                            }
                            next2.SimState = simStates;
                        } catch (Throwable th9) {
                            C9632x2.m50510a(th9);
                        }
                    }
                    try {
                        method3 = telephonyManager.getClass().getDeclaredMethod("getSubscriberId", new Class[]{Integer.TYPE});
                    } catch (NoSuchMethodException e11) {
                        C9632x2.m50512b(e11);
                        method3 = null;
                    }
                    if (method3 != null) {
                        try {
                            next2.IMSI = m49122b(C9135ma.m48968a((String) method3.invoke(telephonyManager, new Object[]{Integer.valueOf(next2.SubscriptionId)})));
                        } catch (Throwable th10) {
                            C9632x2.m50510a(th10);
                        }
                    }
                    try {
                        method4 = telephonyManager.getClass().getDeclaredMethod("getGroupIdLevel1", new Class[]{Integer.TYPE});
                    } catch (NoSuchMethodException e12) {
                        C9632x2.m50512b(e12);
                        method4 = null;
                    }
                    if (method4 != null) {
                        try {
                            next2.GroupIdentifierLevel1 = C9135ma.m48968a((String) method4.invoke(telephonyManager, new Object[]{Integer.valueOf(next2.SubscriptionId)}));
                        } catch (Throwable th11) {
                            C9632x2.m50510a(th11);
                        }
                    }
                }
            }
        }
        return z6Var;
    }

    /* renamed from: g */
    private static ThreeState m49128g(Context context) {
        try {
            String string = Settings.System.getString(context.getContentResolver(), "user_powersaver_enable");
            if (string != null) {
                return string.equals("1") ? ThreeState.Enabled : ThreeState.Disabled;
            }
            int i = Build.VERSION.SDK_INT;
            if (i >= 21) {
                if (Build.MANUFACTURER.toLowerCase().startsWith("sony") && i < 23) {
                    return ThreeState.Unknown;
                }
                PowerManager powerManager = (PowerManager) context.getSystemService("power");
                if (powerManager != null) {
                    return powerManager.isPowerSaveMode() ? ThreeState.Enabled : ThreeState.Disabled;
                }
            }
            return ThreeState.Unknown;
        } catch (Throwable th) {
            C9632x2.m50510a(th);
        }
    }

    /* renamed from: h */
    public static ScreenStates m49129h(Context context) {
        ScreenStates screenStates = ScreenStates.Unknown;
        PowerManager powerManager = (PowerManager) context.getSystemService("power");
        if (powerManager != null) {
            return powerManager.isScreenOn() ? ScreenStates.On : ScreenStates.Off;
        }
        return screenStates;
    }

    /* renamed from: i */
    public static C9662y9 m49130i(Context context) {
        return m49127f(context).getDefaultDataSimInfo();
    }

    /* renamed from: j */
    public static C9662y9 m49131j(Context context) {
        return m49127f(context).getDefaultVoiceSimInfo();
    }

    /* renamed from: k */
    public static C9050ja m49132k(Context context) {
        C9050ja jaVar = new C9050ja();
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        long blockSize = (long) statFs.getBlockSize();
        jaVar.StorageInternalSize = ((long) statFs.getBlockCount()) * blockSize;
        jaVar.StorageInternalAvailable = blockSize * ((long) statFs.getAvailableBlocks());
        jaVar.StorageInternalAudio = m49114a(context, MediaStore.Audio.Media.INTERNAL_CONTENT_URI);
        jaVar.StorageInternalImages = m49114a(context, MediaStore.Images.Media.INTERNAL_CONTENT_URI);
        jaVar.StorageInternalVideo = m49114a(context, MediaStore.Video.Media.INTERNAL_CONTENT_URI);
        if (m49123b()) {
            try {
                StatFs statFs2 = new StatFs(Environment.getExternalStorageDirectory().getPath());
                long blockSize2 = (long) statFs2.getBlockSize();
                jaVar.StorageExternalSize = ((long) statFs2.getBlockCount()) * blockSize2;
                jaVar.StorageExternalAvailable = blockSize2 * ((long) statFs2.getAvailableBlocks());
            } catch (IllegalArgumentException unused) {
                jaVar.StorageExternalSize = -1;
                jaVar.StorageExternalAvailable = -1;
            }
            if (context.checkCallingOrSelfPermission("android.permission.READ_EXTERNAL_STORAGE") == 0) {
                jaVar.StorageExternalAudio = m49114a(context, MediaStore.Audio.Media.EXTERNAL_CONTENT_URI);
                jaVar.StorageExternalImages = m49114a(context, MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
                jaVar.StorageExternalVideo = m49114a(context, MediaStore.Video.Media.EXTERNAL_CONTENT_URI);
            }
        }
        return jaVar;
    }

    /* renamed from: a */
    private static boolean m49120a() {
        String[] strArr = {"/system/app/Superuser.apk", "/sbin/su", "/system/bin/su", "/system/xbin/su", "/data/local/xbin/su", "/data/local/bin/su", "/system/sd/xbin/su", "/system/bin/failsafe/su", "/data/local/su", "/su/bin/su"};
        for (int i = 0; i < 10; i++) {
            if (new File(strArr[i]).exists()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    private static long m49114a(Context context, Uri uri) {
        Cursor cursor = null;
        try {
            cursor = context.getContentResolver().query(uri, new String[]{"_size"}, (String) null, (String[]) null, (String) null);
            long j = 0;
            if (cursor != null) {
                if (cursor.getCount() == 0) {
                    cursor.close();
                    return 0;
                }
                while (cursor.moveToNext()) {
                    j += cursor.getLong(cursor.getColumnIndexOrThrow("_size"));
                }
            }
            if (cursor != null) {
                cursor.close();
            }
            return j;
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    /* renamed from: a */
    public static C8932eb m49115a(C9157nd ndVar) {
        C8932eb ebVar = new C8932eb();
        ebVar.MobileRxBytes = C8954fb.m48592e();
        ebVar.MobileTxBytes = C8954fb.m48593f();
        ebVar.TotalRxBytes = TrafficStats.getTotalRxBytes();
        ebVar.TotalTxBytes = TrafficStats.getTotalTxBytes();
        if (ndVar != null) {
            ebVar.WifiRxBytes = ndVar.mo29717d();
            ebVar.WifiTxBytes = ndVar.mo29718e();
        } else {
            ebVar.WifiRxBytes = -1;
            ebVar.WifiTxBytes = -1;
        }
        return ebVar;
    }

    /* renamed from: a */
    public static C9662y9 m49117a(int i, Context context) {
        return m49127f(context).getSimInfoSubId(i);
    }

    /* JADX WARNING: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void m49119a(android.content.Context r9, int r10, com.startapp.C9662y9 r11) {
        /*
            java.lang.String r0 = "type"
            java.lang.String r1 = "apn"
            r2 = -1
            if (r10 == r2) goto L_0x000e
            java.lang.String r2 = "content://telephony/carriers/preferapn/subId/"
            java.lang.String r10 = com.startapp.C9183o2.m49083a(r2, r10)
            goto L_0x0010
        L_0x000e:
            java.lang.String r10 = "content://telephony/carriers/preferapn"
        L_0x0010:
            r2 = 0
            android.net.Uri r4 = android.net.Uri.parse(r10)     // Catch:{ all -> 0x004b }
            android.content.ContentResolver r3 = r9.getContentResolver()     // Catch:{ all -> 0x004b }
            java.lang.String[] r5 = new java.lang.String[]{r1, r0}     // Catch:{ all -> 0x004b }
            r6 = 0
            r7 = 0
            r8 = 0
            android.database.Cursor r9 = r3.query(r4, r5, r6, r7, r8)     // Catch:{ all -> 0x004b }
            if (r9 == 0) goto L_0x0047
            boolean r10 = r9.moveToFirst()     // Catch:{ all -> 0x0044 }
            if (r10 == 0) goto L_0x0047
            int r10 = r9.getColumnIndex(r1)     // Catch:{ all -> 0x0044 }
            java.lang.String r10 = r9.getString(r10)     // Catch:{ all -> 0x0044 }
            int r0 = r9.getColumnIndex(r0)     // Catch:{ all -> 0x0044 }
            java.lang.String r0 = r9.getString(r0)     // Catch:{ all -> 0x0044 }
            r11.Apn = r10     // Catch:{ all -> 0x0044 }
            r11.ApnTypes = r0     // Catch:{ all -> 0x0044 }
            r9.close()     // Catch:{ all -> 0x0044 }
            goto L_0x0048
        L_0x0044:
            r10 = move-exception
            r2 = r9
            goto L_0x004c
        L_0x0047:
            r2 = r9
        L_0x0048:
            if (r2 == 0) goto L_0x0059
            goto L_0x0051
        L_0x004b:
            r10 = move-exception
        L_0x004c:
            com.startapp.C9632x2.m50510a((java.lang.Throwable) r10)     // Catch:{ all -> 0x005a }
            if (r2 == 0) goto L_0x0059
        L_0x0051:
            r2.close()     // Catch:{ all -> 0x0055 }
            goto L_0x0059
        L_0x0055:
            r9 = move-exception
            com.startapp.C9632x2.m50512b(r9)
        L_0x0059:
            return
        L_0x005a:
            r9 = move-exception
            if (r2 == 0) goto L_0x0065
            r2.close()     // Catch:{ all -> 0x0061 }
            goto L_0x0065
        L_0x0061:
            r10 = move-exception
            com.startapp.C9632x2.m50512b(r10)
        L_0x0065:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.startapp.C9208p2.m49119a(android.content.Context, int, com.startapp.y9):void");
    }

    /* renamed from: a */
    private static String m49118a(String str) {
        int i;
        if (str.length() == 0 || (i = C9209a.f38046a[C8821a5.m48254b().SIMINFO_ICCID_RECORDTYPE().ordinal()]) == 1) {
            return str;
        }
        if (i != 2) {
            return "";
        }
        if (str.length() >= 11) {
            return C9688ze.m50607a(str.substring(0, 7), str.substring(7, str.length()).replaceAll("[\\d\\w]", "*"));
        }
        return str.replaceAll("[\\d\\w]", "*");
    }

    /* renamed from: b */
    private static boolean m49123b() {
        try {
            return Environment.getExternalStorageState().equals("mounted");
        } catch (Throwable th) {
            C9632x2.m50510a(th);
            return false;
        }
    }

    /* renamed from: b */
    private static String m49122b(String str) {
        int i;
        if (str.length() == 0 || (i = C9209a.f38046a[C8821a5.m48254b().SIMINFO_IMSI_RECORDTYPE().ordinal()]) == 1) {
            return str;
        }
        if (i != 2) {
            return "";
        }
        if (str.length() >= 14) {
            return C9688ze.m50607a(str.substring(0, 10), str.substring(10, str.length()).replaceAll("[\\d\\w]", "*"));
        }
        return str.replaceAll("[\\d\\w]", "*");
    }
}
