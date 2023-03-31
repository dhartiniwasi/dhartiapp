package com.startapp;

import android.content.BroadcastReceiver;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.LinkProperties;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.provider.Settings;
import android.telephony.CellIdentity;
import android.telephony.CellIdentityCdma;
import android.telephony.CellIdentityGsm;
import android.telephony.CellIdentityLte;
import android.telephony.CellIdentityNr;
import android.telephony.CellIdentityWcdma;
import android.telephony.CellInfo;
import android.telephony.CellInfoCdma;
import android.telephony.CellInfoGsm;
import android.telephony.CellInfoLte;
import android.telephony.CellInfoNr;
import android.telephony.CellInfoWcdma;
import android.telephony.CellLocation;
import android.telephony.CellSignalStrength;
import android.telephony.CellSignalStrengthCdma;
import android.telephony.CellSignalStrengthLte;
import android.telephony.CellSignalStrengthNr;
import android.telephony.PhoneStateListener;
import android.telephony.ServiceState;
import android.telephony.SignalStrength;
import android.telephony.SubscriptionManager;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.SparseArray;
import com.startapp.networkTest.data.RadioInfo;
import com.startapp.networkTest.data.radio.ApnInfo;
import com.startapp.networkTest.data.radio.NetworkRegistrationInfo;
import com.startapp.networkTest.enums.CellConnectionStatus;
import com.startapp.networkTest.enums.CellNetworkTypes;
import com.startapp.networkTest.enums.ConnectionTypes;
import com.startapp.networkTest.enums.DuplexMode;
import com.startapp.networkTest.enums.NetworkGenerations;
import com.startapp.networkTest.enums.NetworkTypes;
import com.startapp.networkTest.enums.PreferredNetworkTypes;
import com.startapp.networkTest.enums.ServiceStates;
import com.startapp.networkTest.enums.ThreeStateShort;
import com.startapp.networkTest.enums.radio.SignalStrengths;
import com.startapp.networkTest.enums.wifi.WifiDetailedStates;
import com.startapp.networkTest.threads.ThreadManager;
import com.startapp.networkTest.utils.LteFrequencyUtil;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Future;

/* renamed from: com.startapp.k8 */
/* compiled from: Sta */
public class C9068k8 {

    /* renamed from: S */
    private static final String f37053S = "k8";

    /* renamed from: T */
    private static final boolean f37054T = false;

    /* renamed from: U */
    private static final int f37055U = 16;

    /* renamed from: V */
    private static final int f37056V = 17;

    /* renamed from: W */
    private static final int f37057W = 18;

    /* renamed from: X */
    private static final int f37058X = 19;
    /* access modifiers changed from: private */

    /* renamed from: A */
    public Field f37059A;
    /* access modifiers changed from: private */

    /* renamed from: B */
    public Method f37060B;
    /* access modifiers changed from: private */

    /* renamed from: C */
    public Field f37061C;

    /* renamed from: D */
    private Field f37062D;

    /* renamed from: E */
    private Field f37063E;

    /* renamed from: F */
    private Field f37064F;

    /* renamed from: G */
    private Field f37065G;

    /* renamed from: H */
    private Method f37066H;

    /* renamed from: I */
    private Method f37067I;

    /* renamed from: J */
    private Method f37068J;
    /* access modifiers changed from: private */

    /* renamed from: K */
    public Method f37069K;

    /* renamed from: L */
    private Method f37070L;

    /* renamed from: M */
    private Method f37071M;

    /* renamed from: N */
    private Method f37072N;

    /* renamed from: O */
    private ContentResolver f37073O;
    /* access modifiers changed from: private */

    /* renamed from: P */
    public int[] f37074P;

    /* renamed from: Q */
    public final List<C9115l8> f37075Q;
    /* access modifiers changed from: private */

    /* renamed from: R */
    public boolean f37076R;

    /* renamed from: a */
    public final Handler f37077a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public TelephonyManager f37078b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public SparseArray<TelephonyManager> f37079c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public Context f37080d;

    /* renamed from: e */
    private C9084p f37081e;

    /* renamed from: f */
    private ArrayList<C9084p> f37082f;

    /* renamed from: g */
    private ConnectivityManager f37083g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public C9078j f37084h;

    /* renamed from: i */
    private SubscriptionManager.OnSubscriptionsChangedListener f37085i;

    /* renamed from: j */
    private C9678z6 f37086j;

    /* renamed from: k */
    private C9079k f37087k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public List<CellInfo> f37088l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public Method f37089m;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public Method f37090n;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public Method f37091o;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public Method f37092p;
    /* access modifiers changed from: private */

    /* renamed from: q */
    public Method f37093q;
    /* access modifiers changed from: private */

    /* renamed from: r */
    public Method f37094r;
    /* access modifiers changed from: private */

    /* renamed from: s */
    public Method f37095s;
    /* access modifiers changed from: private */

    /* renamed from: t */
    public Method f37096t;

    /* renamed from: u */
    private Method f37097u;

    /* renamed from: v */
    private Method f37098v;
    /* access modifiers changed from: private */

    /* renamed from: w */
    public Field f37099w;

    /* renamed from: x */
    private Field f37100x;
    /* access modifiers changed from: private */

    /* renamed from: y */
    public Field f37101y;
    /* access modifiers changed from: private */

    /* renamed from: z */
    public Field f37102z;

    /* renamed from: com.startapp.k8$a */
    /* compiled from: Sta */
    public class C9069a extends SubscriptionManager.OnSubscriptionsChangedListener {
        public C9069a() {
        }

        public void onSubscriptionsChanged() {
            super.onSubscriptionsChanged();
            if (!C9068k8.this.f37076R) {
                new C9077i().executeOnExecutor(ThreadManager.m49065b().mo29769c(), new Void[0]);
            }
        }
    }

    /* renamed from: com.startapp.k8$b */
    /* compiled from: Sta */
    public class C9070b implements Callable<com.startapp.networkTest.data.radio.CellInfo[]> {
        public C9070b() {
        }

        /* renamed from: a */
        public com.startapp.networkTest.data.radio.CellInfo[] call() {
            try {
                return C9068k8.this.mo29552c();
            } catch (Throwable th) {
                C9632x2.m50510a(th);
                return new com.startapp.networkTest.data.radio.CellInfo[0];
            }
        }
    }

    /* renamed from: com.startapp.k8$c */
    /* compiled from: Sta */
    public class C9071c implements Callable<ApnInfo[]> {
        public C9071c() {
        }

        /* renamed from: a */
        public ApnInfo[] call() throws Exception {
            try {
                return C9068k8.this.mo29546a();
            } catch (Throwable th) {
                C9632x2.m50510a(th);
                return new ApnInfo[0];
            }
        }
    }

    /* renamed from: com.startapp.k8$d */
    /* compiled from: Sta */
    public class C9072d implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ C9115l8 f37106a;

        public C9072d(C9115l8 l8Var) {
            this.f37106a = l8Var;
        }

        public void run() {
            C9068k8.this.mo29545a(this.f37106a);
        }
    }

    /* renamed from: com.startapp.k8$e */
    /* compiled from: Sta */
    public class C9073e implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ C9115l8 f37108a;

        public C9073e(C9115l8 l8Var) {
            this.f37108a = l8Var;
        }

        public void run() {
            C9068k8.this.mo29550b(this.f37108a);
        }
    }

    /* renamed from: com.startapp.k8$f */
    /* compiled from: Sta */
    public static /* synthetic */ class C9074f {

        /* renamed from: a */
        public static final /* synthetic */ int[] f37110a;

        /* renamed from: b */
        public static final /* synthetic */ int[] f37111b;

        /* JADX WARNING: Can't wrap try/catch for region: R(52:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|(2:13|14)|15|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|49|50|51|52|53|54|55|56|57|58|60) */
        /* JADX WARNING: Can't wrap try/catch for region: R(53:0|(2:1|2)|3|(2:5|6)|7|9|10|11|(2:13|14)|15|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|49|50|51|52|53|54|55|56|57|58|60) */
        /* JADX WARNING: Can't wrap try/catch for region: R(54:0|(2:1|2)|3|5|6|7|9|10|11|(2:13|14)|15|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|49|50|51|52|53|54|55|56|57|58|60) */
        /* JADX WARNING: Can't wrap try/catch for region: R(56:0|1|2|3|5|6|7|9|10|11|13|14|15|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|49|50|51|52|53|54|55|56|57|58|60) */
        /* JADX WARNING: Code restructure failed: missing block: B:61:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0044 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x004e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0058 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0062 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x006d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x0078 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x0083 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x008f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:35:0x009b */
        /* JADX WARNING: Missing exception handler attribute for start block: B:37:0x00a7 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:39:0x00b3 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:41:0x00bf */
        /* JADX WARNING: Missing exception handler attribute for start block: B:43:0x00cb */
        /* JADX WARNING: Missing exception handler attribute for start block: B:45:0x00d7 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:47:0x00e3 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:49:0x00ef */
        /* JADX WARNING: Missing exception handler attribute for start block: B:51:0x00fb */
        /* JADX WARNING: Missing exception handler attribute for start block: B:53:0x0107 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:55:0x0113 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:57:0x011f */
        static {
            /*
                com.startapp.networkTest.enums.NetworkGenerations[] r0 = com.startapp.networkTest.enums.NetworkGenerations.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f37111b = r0
                r1 = 1
                com.startapp.networkTest.enums.NetworkGenerations r2 = com.startapp.networkTest.enums.NetworkGenerations.Gen2     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = f37111b     // Catch:{ NoSuchFieldError -> 0x001d }
                com.startapp.networkTest.enums.NetworkGenerations r3 = com.startapp.networkTest.enums.NetworkGenerations.Gen3     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                r2 = 3
                int[] r3 = f37111b     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.startapp.networkTest.enums.NetworkGenerations r4 = com.startapp.networkTest.enums.NetworkGenerations.Gen4     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                r3 = 4
                int[] r4 = f37111b     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.startapp.networkTest.enums.NetworkGenerations r5 = com.startapp.networkTest.enums.NetworkGenerations.Gen5     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r4[r5] = r3     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                com.startapp.networkTest.enums.NetworkTypes[] r4 = com.startapp.networkTest.enums.NetworkTypes.values()
                int r4 = r4.length
                int[] r4 = new int[r4]
                f37110a = r4
                com.startapp.networkTest.enums.NetworkTypes r5 = com.startapp.networkTest.enums.NetworkTypes.GPRS     // Catch:{ NoSuchFieldError -> 0x0044 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0044 }
                r4[r5] = r1     // Catch:{ NoSuchFieldError -> 0x0044 }
            L_0x0044:
                int[] r1 = f37110a     // Catch:{ NoSuchFieldError -> 0x004e }
                com.startapp.networkTest.enums.NetworkTypes r4 = com.startapp.networkTest.enums.NetworkTypes.EDGE     // Catch:{ NoSuchFieldError -> 0x004e }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x004e }
                r1[r4] = r0     // Catch:{ NoSuchFieldError -> 0x004e }
            L_0x004e:
                int[] r0 = f37110a     // Catch:{ NoSuchFieldError -> 0x0058 }
                com.startapp.networkTest.enums.NetworkTypes r1 = com.startapp.networkTest.enums.NetworkTypes.GSM     // Catch:{ NoSuchFieldError -> 0x0058 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0058 }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0058 }
            L_0x0058:
                int[] r0 = f37110a     // Catch:{ NoSuchFieldError -> 0x0062 }
                com.startapp.networkTest.enums.NetworkTypes r1 = com.startapp.networkTest.enums.NetworkTypes.Cdma1xRTT     // Catch:{ NoSuchFieldError -> 0x0062 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0062 }
                r0[r1] = r3     // Catch:{ NoSuchFieldError -> 0x0062 }
            L_0x0062:
                int[] r0 = f37110a     // Catch:{ NoSuchFieldError -> 0x006d }
                com.startapp.networkTest.enums.NetworkTypes r1 = com.startapp.networkTest.enums.NetworkTypes.CDMA     // Catch:{ NoSuchFieldError -> 0x006d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006d }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006d }
            L_0x006d:
                int[] r0 = f37110a     // Catch:{ NoSuchFieldError -> 0x0078 }
                com.startapp.networkTest.enums.NetworkTypes r1 = com.startapp.networkTest.enums.NetworkTypes.IDEN     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                int[] r0 = f37110a     // Catch:{ NoSuchFieldError -> 0x0083 }
                com.startapp.networkTest.enums.NetworkTypes r1 = com.startapp.networkTest.enums.NetworkTypes.UMTS     // Catch:{ NoSuchFieldError -> 0x0083 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0083 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0083 }
            L_0x0083:
                int[] r0 = f37110a     // Catch:{ NoSuchFieldError -> 0x008f }
                com.startapp.networkTest.enums.NetworkTypes r1 = com.startapp.networkTest.enums.NetworkTypes.EVDO_0     // Catch:{ NoSuchFieldError -> 0x008f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x008f }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x008f }
            L_0x008f:
                int[] r0 = f37110a     // Catch:{ NoSuchFieldError -> 0x009b }
                com.startapp.networkTest.enums.NetworkTypes r1 = com.startapp.networkTest.enums.NetworkTypes.EVDO_A     // Catch:{ NoSuchFieldError -> 0x009b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x009b }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x009b }
            L_0x009b:
                int[] r0 = f37110a     // Catch:{ NoSuchFieldError -> 0x00a7 }
                com.startapp.networkTest.enums.NetworkTypes r1 = com.startapp.networkTest.enums.NetworkTypes.EVDO_B     // Catch:{ NoSuchFieldError -> 0x00a7 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00a7 }
                r2 = 10
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00a7 }
            L_0x00a7:
                int[] r0 = f37110a     // Catch:{ NoSuchFieldError -> 0x00b3 }
                com.startapp.networkTest.enums.NetworkTypes r1 = com.startapp.networkTest.enums.NetworkTypes.HSPA     // Catch:{ NoSuchFieldError -> 0x00b3 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00b3 }
                r2 = 11
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00b3 }
            L_0x00b3:
                int[] r0 = f37110a     // Catch:{ NoSuchFieldError -> 0x00bf }
                com.startapp.networkTest.enums.NetworkTypes r1 = com.startapp.networkTest.enums.NetworkTypes.HSDPA     // Catch:{ NoSuchFieldError -> 0x00bf }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00bf }
                r2 = 12
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00bf }
            L_0x00bf:
                int[] r0 = f37110a     // Catch:{ NoSuchFieldError -> 0x00cb }
                com.startapp.networkTest.enums.NetworkTypes r1 = com.startapp.networkTest.enums.NetworkTypes.HSPAP     // Catch:{ NoSuchFieldError -> 0x00cb }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00cb }
                r2 = 13
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00cb }
            L_0x00cb:
                int[] r0 = f37110a     // Catch:{ NoSuchFieldError -> 0x00d7 }
                com.startapp.networkTest.enums.NetworkTypes r1 = com.startapp.networkTest.enums.NetworkTypes.HSUPA     // Catch:{ NoSuchFieldError -> 0x00d7 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00d7 }
                r2 = 14
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00d7 }
            L_0x00d7:
                int[] r0 = f37110a     // Catch:{ NoSuchFieldError -> 0x00e3 }
                com.startapp.networkTest.enums.NetworkTypes r1 = com.startapp.networkTest.enums.NetworkTypes.EHRPD     // Catch:{ NoSuchFieldError -> 0x00e3 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00e3 }
                r2 = 15
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00e3 }
            L_0x00e3:
                int[] r0 = f37110a     // Catch:{ NoSuchFieldError -> 0x00ef }
                com.startapp.networkTest.enums.NetworkTypes r1 = com.startapp.networkTest.enums.NetworkTypes.TD_SCDMA     // Catch:{ NoSuchFieldError -> 0x00ef }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00ef }
                r2 = 16
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00ef }
            L_0x00ef:
                int[] r0 = f37110a     // Catch:{ NoSuchFieldError -> 0x00fb }
                com.startapp.networkTest.enums.NetworkTypes r1 = com.startapp.networkTest.enums.NetworkTypes.LTE     // Catch:{ NoSuchFieldError -> 0x00fb }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00fb }
                r2 = 17
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00fb }
            L_0x00fb:
                int[] r0 = f37110a     // Catch:{ NoSuchFieldError -> 0x0107 }
                com.startapp.networkTest.enums.NetworkTypes r1 = com.startapp.networkTest.enums.NetworkTypes.LTE_CA     // Catch:{ NoSuchFieldError -> 0x0107 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0107 }
                r2 = 18
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0107 }
            L_0x0107:
                int[] r0 = f37110a     // Catch:{ NoSuchFieldError -> 0x0113 }
                com.startapp.networkTest.enums.NetworkTypes r1 = com.startapp.networkTest.enums.NetworkTypes.NR     // Catch:{ NoSuchFieldError -> 0x0113 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0113 }
                r2 = 19
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0113 }
            L_0x0113:
                int[] r0 = f37110a     // Catch:{ NoSuchFieldError -> 0x011f }
                com.startapp.networkTest.enums.NetworkTypes r1 = com.startapp.networkTest.enums.NetworkTypes.WiFi     // Catch:{ NoSuchFieldError -> 0x011f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x011f }
                r2 = 20
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x011f }
            L_0x011f:
                int[] r0 = f37110a     // Catch:{ NoSuchFieldError -> 0x012b }
                com.startapp.networkTest.enums.NetworkTypes r1 = com.startapp.networkTest.enums.NetworkTypes.Unknown     // Catch:{ NoSuchFieldError -> 0x012b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x012b }
                r2 = 21
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x012b }
            L_0x012b:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.startapp.C9068k8.C9074f.<clinit>():void");
        }
    }

    /* renamed from: com.startapp.k8$i */
    /* compiled from: Sta */
    public class C9077i extends AsyncTask<Void, Void, Void> {
        public C9077i() {
        }

        /* renamed from: a */
        public Void doInBackground(Void... voidArr) {
            C9068k8.this.m48825z();
            return null;
        }

        public void onPreExecute() {
            boolean unused = C9068k8.this.f37076R = true;
            C9068k8.this.m48793d(false);
            int[] unused2 = C9068k8.this.f37074P = new int[0];
        }

        /* renamed from: a */
        public void onPostExecute(Void voidR) {
            C9068k8 k8Var = C9068k8.this;
            k8Var.m48771a(k8Var.f37074P);
            if (Build.VERSION.SDK_INT >= 29) {
                C9068k8.this.m48823w();
            }
            C9068k8.this.m48783b(false);
            boolean unused = C9068k8.this.f37076R = false;
        }
    }

    /* renamed from: com.startapp.k8$j */
    /* compiled from: Sta */
    public class C9078j {

        /* renamed from: a */
        private SparseArray<C9083o> f37128a = new SparseArray<>();

        /* renamed from: b */
        private SparseArray<C9082n> f37129b = new SparseArray<>();

        /* renamed from: c */
        private SparseArray<C9076h> f37130c = new SparseArray<>();

        /* renamed from: d */
        private HashMap<String, C9080l> f37131d = new HashMap<>();

        /* renamed from: e */
        private SparseArray<NetworkRegistrationInfo[]> f37132e = new SparseArray<>();

        /* renamed from: f */
        private SparseArray<C9081m> f37133f = new SparseArray<>();

        /* renamed from: g */
        private Map<String, String> f37134g = new HashMap();

        public C9078j() {
        }

        /* renamed from: a */
        public void mo29590a(int i, C9083o oVar) {
            this.f37128a.put(i, oVar);
        }

        /* renamed from: b */
        public NetworkRegistrationInfo[] mo29594b(int i) {
            return this.f37132e.get(i);
        }

        /* renamed from: c */
        public C9081m mo29595c(int i) {
            return this.f37133f.get(i);
        }

        /* renamed from: d */
        public C9082n mo29596d(int i) {
            C9082n nVar = this.f37129b.get(i);
            return nVar == null ? new C9082n(C9068k8.this, (C9069a) null) : nVar;
        }

        /* renamed from: e */
        public C9083o mo29597e(int i) {
            C9083o oVar = this.f37128a.get(i);
            return oVar == null ? new C9083o(C9068k8.this, (C9069a) null) : oVar;
        }

        /* renamed from: a */
        public void mo29589a(int i, C9082n nVar) {
            this.f37129b.put(i, nVar);
        }

        /* renamed from: a */
        public void mo29587a(int i, C9076h hVar) {
            this.f37130c.put(i, hVar);
        }

        /* renamed from: a */
        public void mo29592a(int i, NetworkRegistrationInfo[] networkRegistrationInfoArr) {
            this.f37132e.put(i, networkRegistrationInfoArr);
        }

        /* renamed from: a */
        public void mo29593a(String str, C9080l lVar) {
            this.f37131d.put(str, lVar);
        }

        /* renamed from: a */
        public void mo29591a(int i, String str, String str2) {
            Map<String, String> map = this.f37134g;
            map.put(i + str, str2);
        }

        /* renamed from: a */
        public void mo29588a(int i, C9081m mVar) {
            this.f37133f.put(i, mVar);
        }

        /* renamed from: a */
        public C9076h mo29584a(int i) {
            return this.f37130c.get(i);
        }

        /* renamed from: a */
        public C9080l mo29585a(String str) {
            return this.f37131d.get(str);
        }

        /* renamed from: a */
        public String mo29586a(int i, String str) {
            Map<String, String> map = this.f37134g;
            StringBuilder sb = new StringBuilder();
            sb.append(i);
            sb.append(str != null ? str.split(",")[0] : "");
            String str2 = map.get(sb.toString());
            return str2 == null ? "" : str2;
        }
    }

    public C9068k8(Context context) {
        this.f37080d = context;
        this.f37078b = (TelephonyManager) context.getSystemService("phone");
        this.f37083g = (ConnectivityManager) context.getSystemService("connectivity");
        m48825z();
        m48771a(this.f37074P);
        if (Build.VERSION.SDK_INT >= 29) {
            m48823w();
        }
        this.f37077a = new Handler(Looper.getMainLooper());
        this.f37075Q = new CopyOnWriteArrayList();
        this.f37086j = new C9678z6();
        this.f37084h = new C9078j();
        this.f37073O = this.f37080d.getContentResolver();
        m48816s();
        m48817t();
        m48820u();
        m48814r();
        m48822v();
    }

    /* renamed from: b */
    private static int m48776b(int i) {
        if (i == 99 || i < -5 || i > 91) {
            return 0;
        }
        return i - 116;
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public static int m48784c(int i) {
        if (i == 99 || i < 0 || i > 31) {
            return 0;
        }
        return (i * 2) - 113;
    }

    /* access modifiers changed from: private */
    /* renamed from: z */
    public void m48825z() {
        C9678z6 f = C9208p2.m49127f(this.f37080d);
        this.f37086j = f;
        ArrayList<C9662y9> arrayList = f.SimInfos;
        C9662y9[] y9VarArr = (C9662y9[]) arrayList.toArray(new C9662y9[arrayList.size()]);
        int[] iArr = new int[y9VarArr.length];
        for (int i = 0; i < y9VarArr.length; i++) {
            iArr[i] = y9VarArr[i].SubscriptionId;
        }
        this.f37074P = iArr;
    }

    /* renamed from: x */
    public void mo29570x() {
        try {
            m48789c(true);
            m48779b(this.f37080d);
        } catch (Throwable th) {
            C9632x2.m50510a(th);
        }
    }

    /* renamed from: y */
    public void mo29571y() {
        try {
            m48793d(true);
            m48786c(this.f37080d);
        } catch (Throwable th) {
            C9632x2.m50510a(th);
        }
    }

    /* renamed from: com.startapp.k8$h */
    /* compiled from: Sta */
    public class C9076h {

        /* renamed from: a */
        public CellLocation f37124a;

        /* renamed from: b */
        public long f37125b;

        private C9076h() {
            this.f37125b = 0;
        }

        public /* synthetic */ C9076h(C9068k8 k8Var, C9069a aVar) {
            this();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public void m48793d(boolean z) {
        SubscriptionManager subscriptionManager;
        if (z && this.f37085i != null && this.f37080d.checkCallingOrSelfPermission("android.permission.READ_PHONE_STATE") == 0 && Build.VERSION.SDK_INT >= 22 && (subscriptionManager = (SubscriptionManager) this.f37080d.getSystemService("telephony_subscription_service")) != null) {
            subscriptionManager.removeOnSubscriptionsChangedListener(this.f37085i);
        }
        TelephonyManager telephonyManager = this.f37078b;
        if (telephonyManager != null) {
            C9084p pVar = this.f37081e;
            if (pVar != null) {
                telephonyManager.listen(pVar, 0);
            }
            Iterator<C9084p> it = this.f37082f.iterator();
            while (it.hasNext()) {
                C9084p next = it.next();
                TelephonyManager telephonyManager2 = null;
                SparseArray<TelephonyManager> sparseArray = this.f37079c;
                if (sparseArray != null && sparseArray.size() > 0) {
                    telephonyManager2 = this.f37079c.get(next.mo29599a());
                }
                if (telephonyManager2 == null) {
                    telephonyManager2 = this.f37078b;
                }
                telephonyManager2.listen(next, 0);
            }
        }
    }

    /* renamed from: e */
    private void m48796e(CellInfo cellInfo, com.startapp.networkTest.data.radio.CellInfo cellInfo2, long j) {
        CellInfoWcdma cellInfoWcdma = (CellInfoWcdma) cellInfo;
        cellInfo2.IsRegistered = cellInfoWcdma.isRegistered();
        cellInfo2.CellNetworkType = CellNetworkTypes.Wcdma;
        cellInfo2.CellInfoAge = j - (cellInfoWcdma.getTimeStamp() / 1000000);
        CellIdentityWcdma cellIdentity = cellInfoWcdma.getCellIdentity();
        if (cellIdentity.getMcc() != Integer.MAX_VALUE) {
            cellInfo2.Mcc = cellIdentity.getMcc();
        }
        if (cellIdentity.getMnc() != Integer.MAX_VALUE) {
            cellInfo2.Mnc = cellIdentity.getMnc();
        }
        if (cellIdentity.getCid() != Integer.MAX_VALUE) {
            int cid = cellIdentity.getCid();
            cellInfo2.Cid = cid;
            cellInfo2.CellId = (long) cid;
        }
        if (cellIdentity.getLac() != Integer.MAX_VALUE) {
            cellInfo2.Lac = cellIdentity.getLac();
        }
        if (cellIdentity.getPsc() != Integer.MAX_VALUE) {
            cellInfo2.Psc = cellIdentity.getPsc();
        }
        if (Build.VERSION.SDK_INT >= 24 && cellIdentity.getUarfcn() != Integer.MAX_VALUE) {
            cellInfo2.Arfcn = cellIdentity.getUarfcn();
        }
        cellInfo2.Dbm = cellInfoWcdma.getCellSignalStrength().getDbm();
    }

    /* renamed from: k */
    private boolean m48804k(int i) {
        return this.f37086j.getSimInfoSubId(i).SubscriptionId != -1;
    }

    /* renamed from: m */
    private boolean m48807m() {
        if (Build.VERSION.SDK_INT < 17) {
            if (Settings.System.getInt(this.f37073O, "airplane_mode_on", 0) != 0) {
                return true;
            }
            return false;
        } else if (Settings.Global.getInt(this.f37073O, "airplane_mode_on", 0) != 0) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: q */
    private List<C9075g> m48812q() {
        Network[] allNetworks;
        ArrayList arrayList = new ArrayList();
        if (this.f37083g != null && Build.VERSION.SDK_INT >= 21 && this.f37080d.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0 && (allNetworks = this.f37083g.getAllNetworks()) != null && allNetworks.length > 0) {
            for (Network network : allNetworks) {
                NetworkCapabilities networkCapabilities = this.f37083g.getNetworkCapabilities(network);
                if (networkCapabilities != null && networkCapabilities.hasTransport(0)) {
                    C9075g gVar = new C9075g(this, (C9069a) null);
                    NetworkInfo networkInfo = this.f37083g.getNetworkInfo(network);
                    LinkProperties linkProperties = this.f37083g.getLinkProperties(network);
                    ArrayList arrayList2 = new ArrayList();
                    if (networkCapabilities.hasCapability(4)) {
                        arrayList2.add("ims");
                    }
                    if (networkCapabilities.hasCapability(1)) {
                        arrayList2.add("supl");
                    }
                    if (networkCapabilities.hasCapability(9)) {
                        arrayList2.add("xcap");
                    }
                    if (networkCapabilities.hasCapability(2)) {
                        arrayList2.add("dun");
                    }
                    if (networkCapabilities.hasCapability(5)) {
                        arrayList2.add("cbs");
                    }
                    if (networkCapabilities.hasCapability(3)) {
                        arrayList2.add("fota");
                    }
                    if (networkCapabilities.hasCapability(10)) {
                        arrayList2.add("emergency");
                    }
                    if (networkCapabilities.hasCapability(7)) {
                        arrayList2.add("ia");
                    }
                    if (networkCapabilities.hasCapability(0)) {
                        arrayList2.add("mms");
                    }
                    if (networkCapabilities.hasCapability(8)) {
                        arrayList2.add("rcs");
                    }
                    if (networkCapabilities.hasCapability(23)) {
                        arrayList2.add("mcx");
                    }
                    gVar.f37115d = TextUtils.join(",", arrayList2);
                    if (networkInfo != null) {
                        gVar.f37113b = networkInfo.getExtraInfo();
                        gVar.f37112a = networkInfo.getSubtype();
                        gVar.f37122k = WifiDetailedStates.m49035a(networkInfo.getDetailedState());
                    }
                    if (linkProperties != null) {
                        gVar.f37116e = C8869c0.m48419a(networkCapabilities);
                        gVar.f37118g = C8869c0.m48421b(networkCapabilities);
                        gVar.f37117f = C8869c0.m48418a(linkProperties);
                        String interfaceName = linkProperties.getInterfaceName();
                        if (interfaceName != null) {
                            try {
                                gVar.f37119h = C8954fb.m48588b(interfaceName);
                                gVar.f37120i = C8954fb.m48585a(interfaceName);
                            } catch (Throwable th) {
                                C9632x2.m50510a(th);
                            }
                            gVar.f37121j = interfaceName;
                        }
                    }
                    arrayList.add(gVar);
                }
            }
        }
        return arrayList;
    }

    /* renamed from: r */
    private void m48814r() {
        if (Build.VERSION.SDK_INT >= 17) {
            try {
                Field declaredField = CellSignalStrengthLte.class.getDeclaredField("mSignalStrength");
                this.f37062D = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e) {
                C9632x2.m50512b(e);
            }
            try {
                Field declaredField2 = CellSignalStrengthLte.class.getDeclaredField("mRsrq");
                this.f37063E = declaredField2;
                declaredField2.setAccessible(true);
            } catch (NoSuchFieldException e2) {
                C9632x2.m50512b(e2);
            }
            try {
                Field declaredField3 = CellSignalStrengthLte.class.getDeclaredField("mRssnr");
                this.f37064F = declaredField3;
                declaredField3.setAccessible(true);
            } catch (NoSuchFieldException e3) {
                C9632x2.m50512b(e3);
            }
            try {
                Field declaredField4 = CellSignalStrengthLte.class.getDeclaredField("mCqi");
                this.f37065G = declaredField4;
                declaredField4.setAccessible(true);
            } catch (NoSuchFieldException e4) {
                C9632x2.m50512b(e4);
            }
        }
    }

    /* renamed from: s */
    private void m48816s() {
        if (Build.VERSION.SDK_INT >= 25) {
            try {
                Field declaredField = ServiceState.class.getDeclaredField("mIsUsingCarrierAggregation");
                this.f37061C = declaredField;
                declaredField.setAccessible(true);
            } catch (Throwable th) {
                C9632x2.m50512b(th);
            }
        }
        if (Build.VERSION.SDK_INT >= 29) {
            try {
                this.f37060B = SignalStrength.class.getDeclaredMethod("isUsingCarrierAggregation", new Class[0]);
            } catch (Throwable th2) {
                C9632x2.m50512b(th2);
            }
        }
    }

    /* renamed from: t */
    private void m48817t() {
        if (Build.VERSION.SDK_INT < 29) {
            try {
                this.f37090n = SignalStrength.class.getDeclaredMethod("getLteSignalStrength", new Class[0]);
            } catch (Throwable th) {
                C9632x2.m50512b(th);
            }
            try {
                this.f37093q = SignalStrength.class.getDeclaredMethod("getLteCqi", new Class[0]);
            } catch (Throwable th2) {
                C9632x2.m50512b(th2);
            }
            try {
                this.f37094r = SignalStrength.class.getDeclaredMethod("getLteRsrp", new Class[0]);
            } catch (Throwable th3) {
                C9632x2.m50512b(th3);
            }
            try {
                this.f37095s = SignalStrength.class.getDeclaredMethod("getLteRsrq", new Class[0]);
            } catch (Throwable th4) {
                C9632x2.m50512b(th4);
            }
            try {
                this.f37096t = SignalStrength.class.getDeclaredMethod("getLteRssnr", new Class[0]);
            } catch (Throwable th5) {
                C9632x2.m50512b(th5);
            }
            try {
                this.f37091o = SignalStrength.class.getDeclaredMethod("getLteDbm", new Class[0]);
            } catch (Throwable th6) {
                C9632x2.m50512b(th6);
            }
            try {
                this.f37089m = SignalStrength.class.getDeclaredMethod("getDbm", new Class[0]);
            } catch (Throwable th7) {
                C9632x2.m50512b(th7);
            }
        }
        try {
            this.f37092p = SignalStrength.class.getDeclaredMethod("getGsmEcno", new Class[0]);
        } catch (Throwable th8) {
            C9632x2.m50512b(th8);
        }
        try {
            Field declaredField = SignalStrength.class.getDeclaredField("mWcdmaRscp");
            this.f37099w = declaredField;
            declaredField.setAccessible(true);
        } catch (Throwable th9) {
            C9632x2.m50512b(th9);
        }
        try {
            Field declaredField2 = SignalStrength.class.getDeclaredField("mWcdmaEcio");
            this.f37100x = declaredField2;
            declaredField2.setAccessible(true);
        } catch (Throwable th10) {
            C9632x2.m50512b(th10);
        }
        if (Build.VERSION.SDK_INT >= 28) {
            try {
                Field declaredField3 = SignalStrength.class.getDeclaredField("mNrRsrp");
                this.f37101y = declaredField3;
                declaredField3.setAccessible(true);
            } catch (Throwable th11) {
                C9632x2.m50512b(th11);
            }
            try {
                Field declaredField4 = SignalStrength.class.getDeclaredField("mNrRsrq");
                this.f37102z = declaredField4;
                declaredField4.setAccessible(true);
            } catch (Throwable th12) {
                C9632x2.m50512b(th12);
            }
            try {
                Field declaredField5 = SignalStrength.class.getDeclaredField("mNrRssnr");
                this.f37059A = declaredField5;
                declaredField5.setAccessible(true);
            } catch (Throwable th13) {
                C9632x2.m50512b(th13);
            }
        }
    }

    /* renamed from: u */
    private void m48820u() {
        try {
            this.f37066H = this.f37078b.getClass().getDeclaredMethod("getDataEnabled", new Class[0]);
        } catch (Throwable th) {
            C9632x2.m50512b(th);
        }
        try {
            this.f37067I = this.f37078b.getClass().getDeclaredMethod("getDataEnabled", new Class[]{Integer.TYPE});
        } catch (Throwable th2) {
            C9632x2.m50512b(th2);
        }
        try {
            this.f37068J = this.f37078b.getClass().getDeclaredMethod("isNetworkRoaming", new Class[]{Integer.TYPE});
        } catch (Throwable th3) {
            C9632x2.m50512b(th3);
        }
        try {
            this.f37069K = this.f37078b.getClass().getDeclaredMethod("getNetworkType", new Class[]{Integer.TYPE});
        } catch (Throwable th4) {
            C9632x2.m50512b(th4);
        }
        try {
            this.f37070L = this.f37078b.getClass().getDeclaredMethod("getNetworkOperatorName", new Class[]{Integer.TYPE});
        } catch (Throwable th5) {
            C9632x2.m50512b(th5);
        }
        try {
            this.f37071M = this.f37078b.getClass().getDeclaredMethod("getNetworkOperator", new Class[]{Integer.TYPE});
        } catch (Throwable th6) {
            C9632x2.m50512b(th6);
        }
        try {
            this.f37072N = this.f37078b.getClass().getDeclaredMethod("getNetworkOperatorForSubscription", new Class[]{Integer.TYPE});
        } catch (Throwable th7) {
            C9632x2.m50512b(th7);
        }
        try {
            Method declaredMethod = this.f37078b.getClass().getDeclaredMethod("getVoiceNetworkType", (Class[]) null);
            if (!Modifier.isAbstract(declaredMethod.getModifiers())) {
                this.f37097u = declaredMethod;
                declaredMethod.setAccessible(true);
            }
        } catch (Throwable th8) {
            C9632x2.m50512b(th8);
        }
        try {
            Method declaredMethod2 = this.f37078b.getClass().getDeclaredMethod("getVoiceNetworkType", new Class[]{Integer.TYPE});
            if (!Modifier.isAbstract(declaredMethod2.getModifiers())) {
                this.f37098v = declaredMethod2;
                declaredMethod2.setAccessible(true);
            }
        } catch (Throwable th9) {
            C9632x2.m50512b(th9);
        }
    }

    /* renamed from: v */
    private void m48822v() {
        if (Build.VERSION.SDK_INT >= 22) {
            this.f37085i = new C9069a();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: w */
    public void m48823w() {
        this.f37079c = new SparseArray<>();
        int i = 0;
        while (true) {
            int[] iArr = this.f37074P;
            if (i < iArr.length) {
                this.f37079c.put(iArr[i], this.f37078b.createForSubscriptionId(iArr[i]));
                i++;
            } else {
                return;
            }
        }
    }

    /* renamed from: f */
    public Future<com.startapp.networkTest.data.radio.CellInfo[]> mo29556f() {
        return ThreadManager.m49065b().mo29768a().submit(new C9070b());
    }

    /* JADX WARNING: Removed duplicated region for block: B:138:0x0356  */
    /* JADX WARNING: Removed duplicated region for block: B:141:0x03a9  */
    @java.lang.Deprecated
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.startapp.networkTest.data.RadioInfo mo29557g() {
        /*
            r16 = this;
            r1 = r16
            com.startapp.networkTest.data.RadioInfo r2 = new com.startapp.networkTest.data.RadioInfo
            r2.<init>()
            android.telephony.TelephonyManager r0 = r1.f37078b
            if (r0 == 0) goto L_0x03ac
            android.content.Context r0 = r1.f37080d
            android.util.SparseArray r0 = r1.m48764a((android.content.Context) r0)
            r3 = 0
            java.lang.Object r0 = r0.get(r3)
            com.startapp.networkTest.enums.PreferredNetworkTypes r0 = (com.startapp.networkTest.enums.PreferredNetworkTypes) r0
            if (r0 == 0) goto L_0x001c
            r2.PreferredNetwork = r0
        L_0x001c:
            r4 = 3
            r5 = 1
            android.telephony.TelephonyManager r0 = r1.f37078b     // Catch:{ all -> 0x0046 }
            int r0 = r0.getDataState()     // Catch:{ all -> 0x0046 }
            if (r0 == 0) goto L_0x0041
            if (r0 == r5) goto L_0x003c
            r6 = 2
            if (r0 == r6) goto L_0x0037
            if (r0 == r4) goto L_0x0032
            com.startapp.networkTest.enums.radio.DataConnectionStates r0 = com.startapp.networkTest.enums.radio.DataConnectionStates.Unknown     // Catch:{ all -> 0x0046 }
            r2.MobileDataConnectionState = r0     // Catch:{ all -> 0x0046 }
            goto L_0x004a
        L_0x0032:
            com.startapp.networkTest.enums.radio.DataConnectionStates r0 = com.startapp.networkTest.enums.radio.DataConnectionStates.Suspended     // Catch:{ all -> 0x0046 }
            r2.MobileDataConnectionState = r0     // Catch:{ all -> 0x0046 }
            goto L_0x004a
        L_0x0037:
            com.startapp.networkTest.enums.radio.DataConnectionStates r0 = com.startapp.networkTest.enums.radio.DataConnectionStates.Connected     // Catch:{ all -> 0x0046 }
            r2.MobileDataConnectionState = r0     // Catch:{ all -> 0x0046 }
            goto L_0x004a
        L_0x003c:
            com.startapp.networkTest.enums.radio.DataConnectionStates r0 = com.startapp.networkTest.enums.radio.DataConnectionStates.Connecting     // Catch:{ all -> 0x0046 }
            r2.MobileDataConnectionState = r0     // Catch:{ all -> 0x0046 }
            goto L_0x004a
        L_0x0041:
            com.startapp.networkTest.enums.radio.DataConnectionStates r0 = com.startapp.networkTest.enums.radio.DataConnectionStates.Disconnected     // Catch:{ all -> 0x0046 }
            r2.MobileDataConnectionState = r0     // Catch:{ all -> 0x0046 }
            goto L_0x004a
        L_0x0046:
            r0 = move-exception
            com.startapp.C9632x2.m50510a((java.lang.Throwable) r0)
        L_0x004a:
            boolean r0 = r16.m48807m()
            if (r0 == 0) goto L_0x0053
            com.startapp.networkTest.enums.FlightModeStates r0 = com.startapp.networkTest.enums.FlightModeStates.Enabled
            goto L_0x0055
        L_0x0053:
            com.startapp.networkTest.enums.FlightModeStates r0 = com.startapp.networkTest.enums.FlightModeStates.Disabled
        L_0x0055:
            r2.FlightMode = r0
            com.startapp.networkTest.enums.ThreeState r0 = com.startapp.networkTest.enums.ThreeState.Unknown
            r2.MobileDataEnabled = r0
            java.lang.reflect.Method r0 = r1.f37066H
            if (r0 == 0) goto L_0x007c
            android.telephony.TelephonyManager r6 = r1.f37078b     // Catch:{ all -> 0x0077 }
            java.lang.Object[] r7 = new java.lang.Object[r3]     // Catch:{ all -> 0x0077 }
            java.lang.Object r0 = r0.invoke(r6, r7)     // Catch:{ all -> 0x0077 }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x0077 }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x0077 }
            if (r0 == 0) goto L_0x0072
            com.startapp.networkTest.enums.ThreeState r0 = com.startapp.networkTest.enums.ThreeState.Enabled     // Catch:{ all -> 0x0077 }
            goto L_0x0074
        L_0x0072:
            com.startapp.networkTest.enums.ThreeState r0 = com.startapp.networkTest.enums.ThreeState.Disabled     // Catch:{ all -> 0x0077 }
        L_0x0074:
            r2.MobileDataEnabled = r0     // Catch:{ all -> 0x0077 }
            goto L_0x00ad
        L_0x0077:
            r0 = move-exception
            com.startapp.C9632x2.m50510a((java.lang.Throwable) r0)
            goto L_0x00ad
        L_0x007c:
            int r0 = android.os.Build.VERSION.SDK_INT
            r6 = 17
            java.lang.String r7 = "mobile_data"
            if (r0 < r6) goto L_0x0099
            android.content.ContentResolver r0 = r1.f37073O     // Catch:{ all -> 0x0094 }
            int r0 = android.provider.Settings.Global.getInt(r0, r7)     // Catch:{ all -> 0x0094 }
            if (r0 != r5) goto L_0x008f
            com.startapp.networkTest.enums.ThreeState r0 = com.startapp.networkTest.enums.ThreeState.Enabled     // Catch:{ all -> 0x0094 }
            goto L_0x0091
        L_0x008f:
            com.startapp.networkTest.enums.ThreeState r0 = com.startapp.networkTest.enums.ThreeState.Disabled     // Catch:{ all -> 0x0094 }
        L_0x0091:
            r2.MobileDataEnabled = r0     // Catch:{ all -> 0x0094 }
            goto L_0x00ad
        L_0x0094:
            r0 = move-exception
            com.startapp.C9632x2.m50510a((java.lang.Throwable) r0)
            goto L_0x00ad
        L_0x0099:
            android.content.ContentResolver r0 = r1.f37073O     // Catch:{ all -> 0x00a9 }
            int r0 = android.provider.Settings.Secure.getInt(r0, r7)     // Catch:{ all -> 0x00a9 }
            if (r0 != r5) goto L_0x00a4
            com.startapp.networkTest.enums.ThreeState r0 = com.startapp.networkTest.enums.ThreeState.Enabled     // Catch:{ all -> 0x00a9 }
            goto L_0x00a6
        L_0x00a4:
            com.startapp.networkTest.enums.ThreeState r0 = com.startapp.networkTest.enums.ThreeState.Disabled     // Catch:{ all -> 0x00a9 }
        L_0x00a6:
            r2.MobileDataEnabled = r0     // Catch:{ all -> 0x00a9 }
            goto L_0x00ad
        L_0x00a9:
            r0 = move-exception
            com.startapp.C9632x2.m50510a((java.lang.Throwable) r0)
        L_0x00ad:
            android.telephony.TelephonyManager r0 = r1.f37078b
            boolean r0 = r0.isNetworkRoaming()
            r2.IsRoaming = r0
            com.startapp.networkTest.enums.ThreeStateShort r0 = r16.mo29568o()
            r2.IsMetered = r0
            com.startapp.networkTest.enums.ThreeStateShort r0 = r16.mo29567n()
            int r0 = com.startapp.C8942f2.m48564a((com.startapp.networkTest.enums.ThreeStateShort) r0)
            r2.IsVpn = r0
            com.startapp.networkTest.enums.ConnectionTypes r0 = r16.mo29553d()
            r2.ConnectionType = r0
            int r0 = android.os.Build.VERSION.SDK_INT
            r6 = 30
            if (r0 < r6) goto L_0x00d9
            android.content.Context r0 = r1.f37080d
            boolean r0 = com.startapp.C8913d8.m48516b(r0)
            if (r0 == 0) goto L_0x00ea
        L_0x00d9:
            android.telephony.TelephonyManager r0 = r1.f37078b     // Catch:{ SecurityException -> 0x00e6 }
            int r0 = r0.getNetworkType()     // Catch:{ SecurityException -> 0x00e6 }
            com.startapp.networkTest.enums.NetworkTypes r0 = m48790d((int) r0)     // Catch:{ SecurityException -> 0x00e6 }
            r2.NetworkType = r0     // Catch:{ SecurityException -> 0x00e6 }
            goto L_0x00ea
        L_0x00e6:
            r0 = move-exception
            com.startapp.C9632x2.m50512b(r0)
        L_0x00ea:
            android.telephony.TelephonyManager r0 = r1.f37078b
            java.lang.String r0 = r0.getNetworkOperatorName()
            java.lang.String r0 = com.startapp.C9135ma.m48968a((java.lang.String) r0)
            r2.OperatorName = r0
            android.telephony.TelephonyManager r0 = r1.f37078b
            java.lang.String r0 = r0.getNetworkOperator()
            if (r0 == 0) goto L_0x0111
            int r6 = r0.length()
            r7 = 4
            if (r6 <= r7) goto L_0x0111
            java.lang.String r6 = r0.substring(r3, r4)
            r2.MCC = r6
            java.lang.String r0 = r0.substring(r4)
            r2.MNC = r0
        L_0x0111:
            r0 = -1
            com.startapp.networkTest.data.radio.NetworkRegistrationInfo[] r4 = r1.mo29558g((int) r0)
            com.startapp.k8$j r6 = r1.f37084h
            com.startapp.k8$h r6 = r6.mo29584a((int) r0)
            if (r6 != 0) goto L_0x0124
            com.startapp.k8$h r6 = new com.startapp.k8$h
            r7 = 0
            r6.<init>(r1, r7)
        L_0x0124:
            int r7 = android.os.Build.VERSION.SDK_INT
            r8 = 29
            if (r7 >= r8) goto L_0x0134
            android.content.Context r7 = r1.f37080d
            java.lang.String r8 = "android.permission.ACCESS_COARSE_LOCATION"
            int r7 = r7.checkCallingOrSelfPermission(r8)
            if (r7 == 0) goto L_0x0148
        L_0x0134:
            android.content.Context r7 = r1.f37080d
            java.lang.String r8 = "android.permission.ACCESS_FINE_LOCATION"
            int r7 = r7.checkCallingOrSelfPermission(r8)
            if (r7 != 0) goto L_0x0155
            android.content.Context r7 = r1.f37080d
            java.lang.String r8 = "android.permission.ACCESS_BACKGROUND_LOCATION"
            int r7 = r7.checkCallingOrSelfPermission(r8)
            if (r7 != 0) goto L_0x0155
        L_0x0148:
            android.telephony.CellLocation r5 = r6.f37124a
            if (r5 != 0) goto L_0x0157
            android.telephony.TelephonyManager r5 = r1.f37078b
            android.telephony.CellLocation r5 = r5.getCellLocation()
            r6.f37124a = r5
            goto L_0x0157
        L_0x0155:
            r2.MissingPermission = r5
        L_0x0157:
            android.telephony.CellLocation r5 = r6.f37124a
            r7 = 0
            r9 = 2147483647(0x7fffffff, float:NaN)
            r10 = 2147483647(0x7fffffff, double:1.060997895E-314)
            java.lang.String r12 = ""
            if (r5 == 0) goto L_0x0249
            java.lang.Class r5 = r5.getClass()
            java.lang.Class<android.telephony.gsm.GsmCellLocation> r13 = android.telephony.gsm.GsmCellLocation.class
            boolean r5 = r5.equals(r13)
            if (r5 == 0) goto L_0x01b5
            android.telephony.CellLocation r5 = r6.f37124a
            android.telephony.gsm.GsmCellLocation r5 = (android.telephony.gsm.GsmCellLocation) r5
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            int r14 = r5.getLac()
            r13.append(r14)
            r13.append(r12)
            java.lang.String r13 = r13.toString()
            r2.GsmLAC = r13
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            int r14 = r5.getCid()
            r13.append(r14)
            r13.append(r12)
            java.lang.String r13 = r13.toString()
            r2.GsmCellId = r13
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            int r5 = r5.getPsc()
            r13.append(r5)
            r13.append(r12)
            java.lang.String r5 = r13.toString()
            r2.PrimaryScramblingCode = r5
            goto L_0x0230
        L_0x01b5:
            android.telephony.CellLocation r5 = r6.f37124a
            java.lang.Class r5 = r5.getClass()
            java.lang.Class<android.telephony.cdma.CdmaCellLocation> r13 = android.telephony.cdma.CdmaCellLocation.class
            boolean r5 = r5.equals(r13)
            if (r5 == 0) goto L_0x0230
            android.telephony.CellLocation r5 = r6.f37124a
            android.telephony.cdma.CdmaCellLocation r5 = (android.telephony.cdma.CdmaCellLocation) r5
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            int r14 = r5.getBaseStationId()
            r13.append(r14)
            r13.append(r12)
            java.lang.String r13 = r13.toString()
            r2.CdmaBaseStationId = r13
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            int r14 = r5.getBaseStationLatitude()
            r13.append(r14)
            r13.append(r12)
            java.lang.String r13 = r13.toString()
            r2.CdmaBaseStationLatitude = r13
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            int r14 = r5.getBaseStationLongitude()
            r13.append(r14)
            r13.append(r12)
            java.lang.String r13 = r13.toString()
            r2.CdmaBaseStationLongitude = r13
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            int r14 = r5.getNetworkId()
            r13.append(r14)
            r13.append(r12)
            java.lang.String r13 = r13.toString()
            r2.CdmaNetworkId = r13
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            int r5 = r5.getSystemId()
            r13.append(r5)
            r13.append(r12)
            java.lang.String r5 = r13.toString()
            r2.CdmaSystemId = r5
        L_0x0230:
            long r13 = r6.f37125b
            int r5 = (r13 > r7 ? 1 : (r13 == r7 ? 0 : -1))
            if (r5 <= 0) goto L_0x0270
            long r13 = android.os.SystemClock.elapsedRealtime()
            long r5 = r6.f37125b
            long r13 = r13 - r5
            int r5 = (r13 > r10 ? 1 : (r13 == r10 ? 0 : -1))
            if (r5 <= 0) goto L_0x0245
            r5 = 2147483647(0x7fffffff, float:NaN)
            goto L_0x0246
        L_0x0245:
            int r5 = (int) r13
        L_0x0246:
            r2.GsmCellIdAge = r5
            goto L_0x0270
        L_0x0249:
            if (r4 == 0) goto L_0x0270
            int r5 = r4.length
            r6 = 0
        L_0x024d:
            if (r6 >= r5) goto L_0x0270
            r13 = r4[r6]
            java.lang.String r14 = r13.Domain
            java.lang.String r15 = "CS"
            boolean r14 = r14.equals(r15)
            if (r14 == 0) goto L_0x026d
            java.lang.String r14 = r13.CellId
            r2.GsmCellId = r14
            java.lang.String r15 = r13.Tac
            r2.GsmLAC = r15
            boolean r14 = r14.isEmpty()
            if (r14 != 0) goto L_0x026d
            int r13 = r13.Age
            r2.GsmCellIdAge = r13
        L_0x026d:
            int r6 = r6 + 1
            goto L_0x024d
        L_0x0270:
            com.startapp.k8$j r5 = r1.f37084h
            com.startapp.k8$n r5 = r5.mo29596d(r0)
            com.startapp.networkTest.enums.ServiceStates r6 = r5.f37147a
            r2.ServiceState = r6
            com.startapp.networkTest.enums.DuplexMode r6 = r5.f37149c
            r2.DuplexMode = r6
            com.startapp.networkTest.enums.ThreeStateShort r6 = r5.f37150d
            r2.ManualSelection = r6
            com.startapp.networkTest.enums.ThreeStateShort r6 = r5.f37152f
            r2.CarrierAggregation = r6
            int r6 = r5.f37151e
            r2.ARFCN = r6
            long r13 = r5.f37148b
            int r6 = (r13 > r7 ? 1 : (r13 == r7 ? 0 : -1))
            if (r6 <= 0) goto L_0x02a2
            long r6 = android.os.SystemClock.elapsedRealtime()
            long r13 = r5.f37148b
            long r6 = r6 - r13
            int r5 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r5 <= 0) goto L_0x029f
            r5 = 2147483647(0x7fffffff, float:NaN)
            goto L_0x02a0
        L_0x029f:
            int r5 = (int) r6
        L_0x02a0:
            r2.ServiceStateAge = r5
        L_0x02a2:
            java.lang.String r5 = r1.mo29551c((com.startapp.networkTest.data.radio.NetworkRegistrationInfo[]) r4)
            r2.NrState = r5
            com.startapp.networkTest.enums.ThreeStateShort r5 = r1.mo29554d((com.startapp.networkTest.data.radio.NetworkRegistrationInfo[]) r4)
            r2.NrAvailable = r5
            com.startapp.networkTest.enums.NetworkTypes r5 = r2.NetworkType
            com.startapp.networkTest.enums.NetworkTypes r6 = com.startapp.networkTest.enums.NetworkTypes.Unknown
            if (r5 != r6) goto L_0x02ba
            com.startapp.networkTest.enums.NetworkTypes r5 = r1.mo29548b((com.startapp.networkTest.data.radio.NetworkRegistrationInfo[]) r4)
            r2.NetworkType = r5
        L_0x02ba:
            com.startapp.k8$j r5 = r1.f37084h
            com.startapp.k8$o r5 = r5.mo29597e(r0)
            int r6 = r5.f37163j
            r2.RSCP = r6
            int r6 = r5.f37156c
            r2.CdmaEcIo = r6
            int r6 = r5.f37154a
            r2.RXLevel = r6
            int r7 = r5.f37155b
            r2.NativeDbm = r7
            int r7 = r5.f37162i
            r2.EcN0 = r7
            int r7 = r5.f37157d
            r2.LteCqi = r7
            int r7 = r5.f37158e
            r2.LteRsrp = r7
            int r8 = r5.f37160g
            r2.LteRsrq = r8
            int r8 = r5.f37159f
            r2.LteRssnr = r8
            int r8 = r5.f37161h
            r2.LteRssi = r8
            int r8 = r5.f37165l
            r2.NrCsiRsrp = r8
            int r8 = r5.f37166m
            r2.NrCsiRsrq = r8
            int r8 = r5.f37167n
            r2.NrCsiSinr = r8
            int r8 = r5.f37168o
            r2.NrSsRsrp = r8
            int r8 = r5.f37169p
            r2.NrSsRsrq = r8
            int r8 = r5.f37170q
            r2.NrSsSinr = r8
            com.startapp.networkTest.enums.NetworkTypes r8 = r2.NetworkType
            com.startapp.networkTest.enums.NetworkTypes r13 = com.startapp.networkTest.enums.NetworkTypes.LTE
            if (r8 == r13) goto L_0x030a
            com.startapp.networkTest.enums.NetworkTypes r13 = com.startapp.networkTest.enums.NetworkTypes.LTE_CA
            if (r8 != r13) goto L_0x030e
        L_0x030a:
            if (r6 <= r0) goto L_0x030e
            r2.RXLevel = r7
        L_0x030e:
            com.startapp.networkTest.enums.NetworkTypes r0 = com.startapp.networkTest.enums.NetworkTypes.LTE_CA
            if (r8 != r0) goto L_0x0316
            com.startapp.networkTest.enums.ThreeStateShort r0 = com.startapp.networkTest.enums.ThreeStateShort.Yes
            r2.CarrierAggregation = r0
        L_0x0316:
            com.startapp.networkTest.enums.ThreeStateShort r0 = r2.CarrierAggregation
            com.startapp.networkTest.enums.ThreeStateShort r6 = com.startapp.networkTest.enums.ThreeStateShort.Unknown
            if (r0 != r6) goto L_0x0322
            com.startapp.networkTest.enums.ThreeStateShort r0 = r1.mo29544a((com.startapp.networkTest.data.radio.NetworkRegistrationInfo[]) r4)
            r2.CarrierAggregation = r0
        L_0x0322:
            com.startapp.networkTest.enums.NetworkTypes r0 = r2.NetworkType
            com.startapp.networkTest.enums.NetworkTypes r4 = com.startapp.networkTest.enums.NetworkTypes.NR
            if (r0 != r4) goto L_0x039d
            java.lang.String r0 = r2.MCC     // Catch:{ NumberFormatException -> 0x0337 }
            int r4 = java.lang.Integer.parseInt(r0)     // Catch:{ NumberFormatException -> 0x0337 }
            java.lang.String r0 = r2.MNC     // Catch:{ NumberFormatException -> 0x0335 }
            int r3 = java.lang.Integer.parseInt(r0)     // Catch:{ NumberFormatException -> 0x0335 }
            goto L_0x033c
        L_0x0335:
            r0 = move-exception
            goto L_0x0339
        L_0x0337:
            r0 = move-exception
            r4 = 0
        L_0x0339:
            com.startapp.C9632x2.m50512b(r0)
        L_0x033c:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r12)
            r0.append(r4)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            com.startapp.k8$j r3 = r1.f37084h
            com.startapp.k8$l r0 = r3.mo29585a((java.lang.String) r0)
            if (r0 == 0) goto L_0x039d
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            long r6 = r0.f37139a
            r3.append(r6)
            r3.append(r12)
            java.lang.String r3 = r3.toString()
            r2.GsmCellId = r3
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            int r4 = r0.f37140b
            r3.append(r4)
            r3.append(r12)
            java.lang.String r3 = r3.toString()
            r2.GsmLAC = r3
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            int r4 = r0.f37141c
            r3.append(r4)
            r3.append(r12)
            java.lang.String r3 = r3.toString()
            r2.PrimaryScramblingCode = r3
            long r3 = android.os.SystemClock.elapsedRealtime()
            long r6 = r0.f37142d
            r12 = 1000000(0xf4240, double:4.940656E-318)
            long r6 = r6 / r12
            long r3 = r3 - r6
            int r0 = (int) r3
            r2.GsmCellIdAge = r0
        L_0x039d:
            long r3 = android.os.SystemClock.elapsedRealtime()
            long r5 = r5.f37164k
            long r3 = r3 - r5
            int r0 = (r3 > r10 ? 1 : (r3 == r10 ? 0 : -1))
            if (r0 <= 0) goto L_0x03a9
            goto L_0x03aa
        L_0x03a9:
            int r9 = (int) r3
        L_0x03aa:
            r2.RXLevelAge = r9
        L_0x03ac:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.startapp.C9068k8.mo29557g():com.startapp.networkTest.data.RadioInfo");
    }

    /* renamed from: h */
    public RadioInfo mo29559h() {
        try {
            return mo29560h(this.f37086j.DefaultDataSimId);
        } catch (Throwable th) {
            C9632x2.m50510a(th);
            return new RadioInfo();
        }
    }

    /* renamed from: i */
    public RadioInfo mo29561i() {
        try {
            return mo29560h(this.f37086j.DefaultSmsSimId);
        } catch (Throwable th) {
            C9632x2.m50510a(th);
            return new RadioInfo();
        }
    }

    /* renamed from: j */
    public RadioInfo mo29563j() {
        try {
            return mo29560h(this.f37086j.DefaultVoiceSimId);
        } catch (Throwable th) {
            C9632x2.m50510a(th);
            return new RadioInfo();
        }
    }

    /* renamed from: l */
    public boolean mo29566l() {
        NetworkInfo activeNetworkInfo;
        if (this.f37083g == null || this.f37080d.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") != 0 || (activeNetworkInfo = this.f37083g.getActiveNetworkInfo()) == null) {
            return false;
        }
        return activeNetworkInfo.isConnected();
    }

    /* renamed from: n */
    public ThreeStateShort mo29567n() {
        ConnectivityManager connectivityManager;
        NetworkCapabilities networkCapabilities;
        ThreeStateShort threeStateShort = ThreeStateShort.Unknown;
        if (Build.VERSION.SDK_INT < 23 || this.f37080d.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") != 0 || (connectivityManager = this.f37083g) == null || (networkCapabilities = this.f37083g.getNetworkCapabilities(connectivityManager.getActiveNetwork())) == null) {
            return threeStateShort;
        }
        return networkCapabilities.hasTransport(4) ? ThreeStateShort.Yes : ThreeStateShort.No;
    }

    /* renamed from: o */
    public ThreeStateShort mo29568o() {
        if (Build.VERSION.SDK_INT < 16 || this.f37080d.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") != 0) {
            return ThreeStateShort.Unknown;
        }
        return this.f37083g.isActiveNetworkMetered() ? ThreeStateShort.Yes : ThreeStateShort.No;
    }

    /* renamed from: p */
    public boolean mo29569p() {
        return this.f37078b.isNetworkRoaming();
    }

    /* renamed from: com.startapp.k8$k */
    /* compiled from: Sta */
    public class C9079k extends BroadcastReceiver {

        /* renamed from: a */
        public final String f37136a;

        /* renamed from: b */
        public final String f37137b;

        private C9079k() {
            this.f37136a = "android.intent.action.ANY_DATA_STATE";
            this.f37137b = "com.samsung.ims.action.IMS_REGISTRATION";
        }

        public void onReceive(Context context, Intent intent) {
            if (intent != null && intent.getAction() != null) {
                try {
                    String action = intent.getAction();
                    Bundle extras = intent.getExtras();
                    int i = -1;
                    if (action.equalsIgnoreCase("android.intent.action.ANY_DATA_STATE") && extras != null) {
                        String string = extras.getString("reason", "");
                        String string2 = extras.getString("apnType", "");
                        if (extras.get("subscription") instanceof Integer) {
                            i = extras.getInt("subscription", -1);
                        } else if (extras.get("subscription") instanceof Long) {
                            i = (int) extras.getLong("subscription", -1);
                        }
                        if (string2.equalsIgnoreCase("default")) {
                            string2 = "supl";
                        }
                        C9068k8.this.f37084h.mo29591a(i, string2, string);
                    } else if (action.equalsIgnoreCase("com.samsung.ims.action.IMS_REGISTRATION") && extras != null) {
                        String string3 = extras.getString("SERVICE");
                        int i2 = extras.getInt("PHONE_ID", -1);
                        int i3 = extras.getInt("SIP_ERROR", -1);
                        extras.getBoolean("VOWIFI", false);
                        extras.getBoolean("REGISTERED", false);
                        C9081m mVar = new C9081m(C9068k8.this, (C9069a) null);
                        mVar.f37144a = i3;
                        if (string3 != null) {
                            mVar.f37145b = string3.replaceAll("\\[", "").replaceAll("\\]", "").replace(", ", ",");
                        }
                        Iterator<C9662y9> it = C9208p2.m49127f(C9068k8.this.f37080d).SimInfos.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            C9662y9 next = it.next();
                            if (next.SimSlotIndex == i2) {
                                i = next.SubscriptionId;
                                break;
                            }
                        }
                        C9068k8.this.f37084h.mo29588a(i, mVar);
                    }
                } catch (Throwable th) {
                    C9632x2.m50510a(th);
                }
            }
        }

        public /* synthetic */ C9079k(C9068k8 k8Var, C9069a aVar) {
            this();
        }
    }

    /* renamed from: com.startapp.k8$m */
    /* compiled from: Sta */
    public class C9081m {

        /* renamed from: a */
        public int f37144a;

        /* renamed from: b */
        public String f37145b;

        private C9081m() {
            this.f37144a = -1;
            this.f37145b = "";
        }

        public /* synthetic */ C9081m(C9068k8 k8Var, C9069a aVar) {
            this();
        }
    }

    /* renamed from: com.startapp.k8$p */
    /* compiled from: Sta */
    public class C9084p extends PhoneStateListener {

        /* renamed from: a */
        private Field f37172a;

        /* renamed from: b */
        private int f37173b = -1;

        /* renamed from: com.startapp.k8$p$a */
        /* compiled from: Sta */
        public class C9085a implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ ServiceState f37175a;

            /* renamed from: b */
            public final /* synthetic */ int f37176b;

            public C9085a(ServiceState serviceState, int i) {
                this.f37175a = serviceState;
                this.f37176b = i;
            }

            public void run() {
                for (C9115l8 a : C9068k8.this.f37075Q) {
                    a.mo29671a(this.f37175a, this.f37176b);
                }
            }
        }

        /* renamed from: com.startapp.k8$p$b */
        /* compiled from: Sta */
        public class C9086b implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ CellLocation f37178a;

            /* renamed from: b */
            public final /* synthetic */ int f37179b;

            public C9086b(CellLocation cellLocation, int i) {
                this.f37178a = cellLocation;
                this.f37179b = i;
            }

            public void run() {
                for (C9115l8 a : C9068k8.this.f37075Q) {
                    a.mo29670a(this.f37178a, this.f37179b);
                }
            }
        }

        public C9084p() {
        }

        /* JADX WARNING: Removed duplicated region for block: B:14:? A[RETURN, SYNTHETIC] */
        /* JADX WARNING: Removed duplicated region for block: B:9:0x001b  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public int mo29599a() {
            /*
                r4 = this;
                java.lang.reflect.Field r0 = r4.f37172a
                r1 = -1
                if (r0 == 0) goto L_0x0014
                java.lang.Object r0 = r0.get(r4)     // Catch:{ all -> 0x0010 }
                java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ all -> 0x0010 }
                int r0 = r0.intValue()     // Catch:{ all -> 0x0010 }
                goto L_0x0015
            L_0x0010:
                r0 = move-exception
                com.startapp.C9632x2.m50510a((java.lang.Throwable) r0)
            L_0x0014:
                r0 = -1
            L_0x0015:
                int r2 = android.os.Build.VERSION.SDK_INT
                r3 = 29
                if (r2 < r3) goto L_0x0024
                if (r0 == r1) goto L_0x0022
                r1 = 2147483647(0x7fffffff, float:NaN)
                if (r0 != r1) goto L_0x0024
            L_0x0022:
                int r0 = r4.f37173b
            L_0x0024:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.startapp.C9068k8.C9084p.mo29599a():int");
        }

        public void onCellInfoChanged(List<CellInfo> list) {
            m48875a(list);
        }

        public void onCellLocationChanged(CellLocation cellLocation) {
            m48872a(cellLocation, mo29599a());
        }

        public void onServiceStateChanged(ServiceState serviceState) {
            m48873a(serviceState, mo29599a());
        }

        public void onSignalStrengthsChanged(SignalStrength signalStrength) {
            m48874a(signalStrength, mo29599a());
        }

        public C9084p(int i) {
            this.f37173b = i;
            try {
                Field declaredField = C9084p.class.getSuperclass().getDeclaredField("mSubId");
                this.f37172a = declaredField;
                declaredField.setAccessible(true);
                this.f37172a.set(this, Integer.valueOf(i));
            } catch (Throwable th) {
                C9632x2.m50512b(th);
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:24:0x0074  */
        /* JADX WARNING: Removed duplicated region for block: B:27:0x007c  */
        /* JADX WARNING: Removed duplicated region for block: B:29:0x007f  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private void m48875a(java.util.List<android.telephony.CellInfo> r10) {
            /*
                r9 = this;
                if (r10 != 0) goto L_0x0003
                return
            L_0x0003:
                com.startapp.k8 r0 = com.startapp.C9068k8.this
                java.util.List unused = r0.f37088l = r10
                int r0 = android.os.Build.VERSION.SDK_INT
                r1 = 29
                if (r0 < r1) goto L_0x009f
                java.util.Iterator r10 = r10.iterator()
            L_0x0012:
                boolean r0 = r10.hasNext()
                if (r0 == 0) goto L_0x009f
                java.lang.Object r0 = r10.next()
                android.telephony.CellInfo r0 = (android.telephony.CellInfo) r0
                boolean r1 = r0.isRegistered()
                if (r1 == 0) goto L_0x0012
                boolean r1 = r0 instanceof android.telephony.CellInfoNr
                if (r1 == 0) goto L_0x0012
                android.telephony.CellInfoNr r0 = (android.telephony.CellInfoNr) r0
                android.telephony.CellIdentity r1 = r0.getCellIdentity()
                boolean r2 = r1 instanceof android.telephony.CellIdentityNr
                if (r2 == 0) goto L_0x0012
                android.telephony.CellIdentityNr r1 = (android.telephony.CellIdentityNr) r1
                r2 = 0
                java.lang.String r3 = r1.getMccString()     // Catch:{ NumberFormatException -> 0x0048 }
                int r3 = java.lang.Integer.parseInt(r3)     // Catch:{ NumberFormatException -> 0x0048 }
                java.lang.String r4 = r1.getMncString()     // Catch:{ NumberFormatException -> 0x0046 }
                int r2 = java.lang.Integer.parseInt(r4)     // Catch:{ NumberFormatException -> 0x0046 }
                goto L_0x004d
            L_0x0046:
                r4 = move-exception
                goto L_0x004a
            L_0x0048:
                r4 = move-exception
                r3 = 0
            L_0x004a:
                com.startapp.C9632x2.m50512b(r4)
            L_0x004d:
                long r4 = r1.getNci()
                int r6 = r1.getTac()
                int r1 = r1.getPci()
                java.lang.StringBuilder r7 = new java.lang.StringBuilder
                r7.<init>()
                java.lang.String r8 = ""
                r7.append(r8)
                r7.append(r3)
                r7.append(r2)
                java.lang.String r2 = r7.toString()
                r7 = 2147483647(0x7fffffff, double:1.060997895E-314)
                int r3 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
                if (r3 != 0) goto L_0x0076
                r4 = -1
            L_0x0076:
                r3 = -1
                r7 = 2147483647(0x7fffffff, float:NaN)
                if (r6 != r7) goto L_0x007d
                r6 = -1
            L_0x007d:
                if (r1 != r7) goto L_0x0080
                r1 = -1
            L_0x0080:
                com.startapp.k8$l r3 = new com.startapp.k8$l
                com.startapp.k8 r7 = com.startapp.C9068k8.this
                r8 = 0
                r3.<init>(r7, r8)
                r3.f37139a = r4
                r3.f37140b = r6
                r3.f37141c = r1
                long r0 = r0.getTimeStamp()
                r3.f37142d = r0
                com.startapp.k8 r0 = com.startapp.C9068k8.this
                com.startapp.k8$j r0 = r0.f37084h
                r0.mo29593a((java.lang.String) r2, (com.startapp.C9068k8.C9080l) r3)
                goto L_0x0012
            L_0x009f:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.startapp.C9068k8.C9084p.m48875a(java.util.List):void");
        }

        /* renamed from: a */
        private void m48873a(ServiceState serviceState, int i) {
            ServiceStates serviceStates;
            DuplexMode duplexMode;
            C9082n nVar = new C9082n(C9068k8.this, (C9069a) null);
            if (Build.VERSION.SDK_INT >= 25) {
                if (C9068k8.this.f37061C != null) {
                    try {
                        nVar.f37152f = C9068k8.this.f37061C.getBoolean(serviceState) ? ThreeStateShort.Yes : ThreeStateShort.No;
                    } catch (Throwable th) {
                        C9632x2.m50510a(th);
                    }
                }
                if (nVar.f37152f == ThreeStateShort.Unknown && C9068k8.this.f37060B != null) {
                    try {
                        nVar.f37152f = ((Boolean) C9068k8.this.f37060B.invoke(serviceState, new Object[0])).booleanValue() ? ThreeStateShort.Yes : ThreeStateShort.No;
                    } catch (Throwable th2) {
                        C9632x2.m50510a(th2);
                    }
                }
                if (Build.VERSION.SDK_INT >= 28) {
                    int duplexMode2 = serviceState.getDuplexMode();
                    if (duplexMode2 == 1) {
                        duplexMode = DuplexMode.FDD;
                    } else if (duplexMode2 != 2) {
                        duplexMode = DuplexMode.Unknown;
                    } else {
                        duplexMode = DuplexMode.TDD;
                    }
                    nVar.f37149c = duplexMode;
                    nVar.f37151e = serviceState.getChannelNumber();
                }
            }
            nVar.f37150d = serviceState.getIsManualSelection() ? ThreeStateShort.Yes : ThreeStateShort.No;
            int state = serviceState.getState();
            if (state == 0) {
                serviceStates = ServiceStates.InService;
            } else if (state == 1) {
                serviceStates = ServiceStates.OutOfService;
            } else if (state == 2) {
                serviceStates = ServiceStates.EmergencyOnly;
            } else if (state != 3) {
                serviceStates = ServiceStates.Unknown;
            } else {
                serviceStates = ServiceStates.PowerOff;
            }
            nVar.f37147a = serviceStates;
            nVar.f37148b = SystemClock.elapsedRealtime();
            NetworkRegistrationInfo[] c = C9067k7.m48760c(serviceState.toString());
            C9068k8.this.f37084h.mo29589a(i, nVar);
            C9068k8.this.f37084h.mo29592a(i, c);
            C9068k8.this.f37077a.post(new C9006h9(new C9085a(serviceState, i)));
        }

        /* JADX WARNING: Code restructure failed: missing block: B:39:0x010f, code lost:
            r0 = r5;
            r12 = r0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:40:0x0111, code lost:
            r5 = r17;
            r6 = r18;
            r7 = r19;
            r18 = r22;
            r17 = r24;
            r21 = true;
         */
        /* JADX WARNING: Removed duplicated region for block: B:101:0x0238 A[SYNTHETIC, Splitter:B:101:0x0238] */
        /* JADX WARNING: Removed duplicated region for block: B:137:0x02e6 A[Catch:{ all -> 0x0302 }] */
        /* JADX WARNING: Removed duplicated region for block: B:143:0x02ff  */
        /* JADX WARNING: Removed duplicated region for block: B:150:0x0310  */
        /* JADX WARNING: Removed duplicated region for block: B:172:0x035f A[Catch:{ all -> 0x0373 }] */
        /* JADX WARNING: Removed duplicated region for block: B:176:0x0388  */
        /* JADX WARNING: Removed duplicated region for block: B:28:0x00d1  */
        /* JADX WARNING: Removed duplicated region for block: B:31:0x00eb  */
        /* JADX WARNING: Removed duplicated region for block: B:66:0x01b9  */
        /* JADX WARNING: Removed duplicated region for block: B:89:0x020c A[Catch:{ all -> 0x022c }] */
        /* JADX WARNING: Removed duplicated region for block: B:95:0x0227  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private void m48874a(android.telephony.SignalStrength r27, int r28) {
            /*
                r26 = this;
                r1 = r26
                r2 = r27
                r3 = r28
                java.lang.Integer r0 = com.startapp.networkTest.data.RadioInfo.INVALID
                int r4 = r0.intValue()
                int r5 = r0.intValue()
                int r6 = r0.intValue()
                int r7 = r0.intValue()
                int r8 = r0.intValue()
                int r9 = r0.intValue()
                int r10 = r0.intValue()
                int r11 = r0.intValue()
                int r12 = r0.intValue()
                int r13 = r0.intValue()
                int r14 = r0.intValue()
                int r15 = r0.intValue()
                int r16 = r0.intValue()
                int r17 = r0.intValue()
                int r18 = r0.intValue()
                int r19 = r0.intValue()
                com.startapp.k8 r0 = com.startapp.C9068k8.this
                android.util.SparseArray r0 = r0.f37079c
                r20 = r4
                if (r0 == 0) goto L_0x005f
                com.startapp.k8 r0 = com.startapp.C9068k8.this
                android.util.SparseArray r0 = r0.f37079c
                java.lang.Object r0 = r0.get(r3)
                android.telephony.TelephonyManager r0 = (android.telephony.TelephonyManager) r0
                goto L_0x0060
            L_0x005f:
                r0 = 0
            L_0x0060:
                if (r0 != 0) goto L_0x0068
                com.startapp.k8 r0 = com.startapp.C9068k8.this
                android.telephony.TelephonyManager r0 = r0.f37078b
            L_0x0068:
                com.startapp.networkTest.enums.NetworkTypes r21 = com.startapp.networkTest.enums.NetworkTypes.Unknown
                com.startapp.k8 r4 = com.startapp.C9068k8.this     // Catch:{ SecurityException -> 0x00c2, all -> 0x00b8 }
                android.util.SparseArray r4 = r4.f37079c     // Catch:{ SecurityException -> 0x00c2, all -> 0x00b8 }
                if (r4 != 0) goto L_0x00a4
                com.startapp.k8 r4 = com.startapp.C9068k8.this     // Catch:{ SecurityException -> 0x00c2, all -> 0x00b8 }
                java.lang.reflect.Method r4 = r4.f37069K     // Catch:{ SecurityException -> 0x00c2, all -> 0x00b8 }
                if (r4 == 0) goto L_0x00a4
                com.startapp.k8 r0 = com.startapp.C9068k8.this     // Catch:{ SecurityException -> 0x00c2, all -> 0x00b8 }
                java.lang.reflect.Method r0 = r0.f37069K     // Catch:{ SecurityException -> 0x00c2, all -> 0x00b8 }
                com.startapp.k8 r4 = com.startapp.C9068k8.this     // Catch:{ SecurityException -> 0x00c2, all -> 0x00b8 }
                android.telephony.TelephonyManager r4 = r4.f37078b     // Catch:{ SecurityException -> 0x00c2, all -> 0x00b8 }
                r24 = r6
                r22 = r7
                r6 = 1
                java.lang.Object[] r7 = new java.lang.Object[r6]     // Catch:{ SecurityException -> 0x00b6, all -> 0x00b4 }
                java.lang.Integer r25 = java.lang.Integer.valueOf(r28)     // Catch:{ SecurityException -> 0x00b6, all -> 0x00b4 }
                r23 = 0
                r7[r23] = r25     // Catch:{ SecurityException -> 0x00b6, all -> 0x00b4 }
                java.lang.Object r0 = r0.invoke(r4, r7)     // Catch:{ SecurityException -> 0x00b6, all -> 0x00b4 }
                java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ SecurityException -> 0x00b6, all -> 0x00b4 }
                int r0 = r0.intValue()     // Catch:{ SecurityException -> 0x00b6, all -> 0x00b4 }
                com.startapp.networkTest.enums.NetworkTypes r0 = com.startapp.C9068k8.m48790d((int) r0)     // Catch:{ SecurityException -> 0x00b6, all -> 0x00b4 }
                goto L_0x00b1
            L_0x00a4:
                r24 = r6
                r22 = r7
                r6 = 1
                int r0 = r0.getNetworkType()     // Catch:{ SecurityException -> 0x00b6, all -> 0x00b4 }
                com.startapp.networkTest.enums.NetworkTypes r0 = com.startapp.C9068k8.m48790d((int) r0)     // Catch:{ SecurityException -> 0x00b6, all -> 0x00b4 }
            L_0x00b1:
                r21 = r0
                goto L_0x00cb
            L_0x00b4:
                r0 = move-exception
                goto L_0x00be
            L_0x00b6:
                r0 = move-exception
                goto L_0x00c8
            L_0x00b8:
                r0 = move-exception
                r24 = r6
                r22 = r7
                r6 = 1
            L_0x00be:
                com.startapp.C9632x2.m50510a((java.lang.Throwable) r0)
                goto L_0x00cb
            L_0x00c2:
                r0 = move-exception
                r24 = r6
                r22 = r7
                r6 = 1
            L_0x00c8:
                com.startapp.C9632x2.m50512b(r0)
            L_0x00cb:
                r0 = r21
                com.startapp.networkTest.enums.NetworkTypes r4 = com.startapp.networkTest.enums.NetworkTypes.Unknown
                if (r0 != r4) goto L_0x00e1
                com.startapp.k8 r0 = com.startapp.C9068k8.this
                com.startapp.k8$j r0 = r0.f37084h
                com.startapp.networkTest.data.radio.NetworkRegistrationInfo[] r0 = r0.mo29594b(r3)
                com.startapp.k8 r4 = com.startapp.C9068k8.this
                com.startapp.networkTest.enums.NetworkTypes r0 = r4.mo29548b((com.startapp.networkTest.data.radio.NetworkRegistrationInfo[]) r0)
            L_0x00e1:
                com.startapp.networkTest.enums.NetworkGenerations r4 = com.startapp.C9068k8.m48778b((com.startapp.networkTest.enums.NetworkTypes) r0)
                int r0 = android.os.Build.VERSION.SDK_INT
                r7 = 29
                if (r0 < r7) goto L_0x01aa
                java.util.List r0 = r27.getCellSignalStrengths()
                java.util.Iterator r0 = r0.iterator()
            L_0x00f3:
                boolean r7 = r0.hasNext()
                if (r7 == 0) goto L_0x01aa
                java.lang.Object r7 = r0.next()
                android.telephony.CellSignalStrength r7 = (android.telephony.CellSignalStrength) r7
                com.startapp.networkTest.enums.NetworkGenerations r6 = com.startapp.networkTest.enums.NetworkGenerations.Gen2
                r25 = r0
                if (r4 != r6) goto L_0x011f
                boolean r0 = r7 instanceof android.telephony.CellSignalStrengthGsm
                if (r0 == 0) goto L_0x011f
                android.telephony.CellSignalStrengthGsm r7 = (android.telephony.CellSignalStrengthGsm) r7
                int r5 = r7.getDbm()
            L_0x010f:
                r0 = r5
                r12 = r0
            L_0x0111:
                r5 = r17
                r6 = r18
                r7 = r19
                r18 = r22
                r17 = r24
                r21 = 1
                goto L_0x01b7
            L_0x011f:
                com.startapp.networkTest.enums.NetworkGenerations r0 = com.startapp.networkTest.enums.NetworkGenerations.Gen3
                if (r4 != r0) goto L_0x0138
                boolean r0 = r7 instanceof android.telephony.CellSignalStrengthWcdma
                if (r0 == 0) goto L_0x0138
                android.telephony.CellSignalStrengthWcdma r7 = (android.telephony.CellSignalStrengthWcdma) r7
                int r12 = r7.getDbm()
                java.lang.Integer r0 = com.startapp.networkTest.data.RadioInfo.INVALID
                int r0 = r0.intValue()
                if (r5 != r0) goto L_0x0136
                r5 = r12
            L_0x0136:
                r0 = r5
                goto L_0x0111
            L_0x0138:
                com.startapp.networkTest.enums.NetworkGenerations r0 = com.startapp.networkTest.enums.NetworkGenerations.Gen4
                if (r4 != r0) goto L_0x0169
                boolean r0 = r7 instanceof android.telephony.CellSignalStrengthLte
                if (r0 == 0) goto L_0x0169
                android.telephony.CellSignalStrengthLte r7 = (android.telephony.CellSignalStrengthLte) r7
                int r5 = r7.getDbm()
                int r6 = r7.getCqi()
                int r0 = r7.getRsrp()
                int r8 = r7.getRssnr()
                int r9 = r7.getRsrq()
                int r10 = r7.getRssi()
                r12 = r5
                r7 = r19
                r21 = 1
                r5 = r17
                r17 = r6
                r6 = r18
                r18 = r0
                r0 = r12
                goto L_0x01b7
            L_0x0169:
                com.startapp.networkTest.enums.NetworkGenerations r0 = com.startapp.networkTest.enums.NetworkGenerations.Gen5
                if (r4 != r0) goto L_0x0191
                boolean r0 = r7 instanceof android.telephony.CellSignalStrengthNr
                if (r0 == 0) goto L_0x0191
                android.telephony.CellSignalStrengthNr r7 = (android.telephony.CellSignalStrengthNr) r7
                int r5 = r7.getDbm()
                int r14 = r7.getCsiRsrp()
                int r15 = r7.getCsiRsrq()
                int r16 = r7.getCsiSinr()
                int r17 = r7.getSsRsrp()
                int r18 = r7.getSsRsrq()
                int r19 = r7.getSsSinr()
                goto L_0x010f
            L_0x0191:
                if (r4 != r6) goto L_0x01a5
                boolean r0 = r7 instanceof android.telephony.CellSignalStrengthCdma
                if (r0 == 0) goto L_0x01a5
                android.telephony.CellSignalStrengthCdma r7 = (android.telephony.CellSignalStrengthCdma) r7
                int r0 = r7.getCdmaEcio()
                int r5 = r7.getDbm()
                r20 = r0
                goto L_0x010f
            L_0x01a5:
                r0 = r25
                r6 = 1
                goto L_0x00f3
            L_0x01aa:
                r0 = r5
                r5 = r17
                r6 = r18
                r7 = r19
                r18 = r22
                r17 = r24
                r21 = 0
            L_0x01b7:
                if (r21 != 0) goto L_0x0388
                boolean r0 = r27.isGsm()
                if (r0 == 0) goto L_0x01f6
                com.startapp.k8 r0 = com.startapp.C9068k8.this
                java.lang.reflect.Field r0 = r0.f37099w
                if (r0 == 0) goto L_0x01da
                com.startapp.networkTest.enums.NetworkGenerations r0 = com.startapp.networkTest.enums.NetworkGenerations.Gen3
                if (r4 != r0) goto L_0x01da
                com.startapp.k8 r0 = com.startapp.C9068k8.this     // Catch:{ all -> 0x01d6 }
                java.lang.reflect.Field r0 = r0.f37099w     // Catch:{ all -> 0x01d6 }
                int r13 = r0.getInt(r2)     // Catch:{ all -> 0x01d6 }
                goto L_0x01da
            L_0x01d6:
                r0 = move-exception
                com.startapp.C9632x2.m50510a((java.lang.Throwable) r0)
            L_0x01da:
                int r0 = r27.getGsmSignalStrength()
                if (r0 != 0) goto L_0x01ec
                java.lang.Integer r19 = com.startapp.networkTest.data.RadioInfo.INVALID
                r21 = r8
                int r8 = r19.intValue()
                if (r13 == r8) goto L_0x01ee
                r8 = r13
                goto L_0x0204
            L_0x01ec:
                r21 = r8
            L_0x01ee:
                if (r0 >= 0) goto L_0x01f1
                goto L_0x0202
            L_0x01f1:
                int r0 = com.startapp.C9068k8.m48784c((int) r0)
                goto L_0x0202
            L_0x01f6:
                r21 = r8
                int r0 = r27.getCdmaDbm()
                int r8 = r27.getCdmaEcio()
                r20 = r8
            L_0x0202:
                r8 = r13
                r13 = r0
            L_0x0204:
                com.startapp.k8 r0 = com.startapp.C9068k8.this     // Catch:{ all -> 0x022c }
                java.lang.reflect.Method r0 = r0.f37089m     // Catch:{ all -> 0x022c }
                if (r0 == 0) goto L_0x0227
                com.startapp.k8 r0 = com.startapp.C9068k8.this     // Catch:{ all -> 0x022c }
                java.lang.reflect.Method r0 = r0.f37089m     // Catch:{ all -> 0x022c }
                r19 = r8
                r22 = r9
                r8 = 0
                java.lang.Object[] r9 = new java.lang.Object[r8]     // Catch:{ all -> 0x0225 }
                java.lang.Object r0 = r0.invoke(r2, r9)     // Catch:{ all -> 0x0225 }
                java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ all -> 0x0225 }
                int r0 = r0.intValue()     // Catch:{ all -> 0x0225 }
                r12 = r0
                goto L_0x0234
            L_0x0225:
                r0 = move-exception
                goto L_0x0231
            L_0x0227:
                r19 = r8
                r22 = r9
                goto L_0x0234
            L_0x022c:
                r0 = move-exception
                r19 = r8
                r22 = r9
            L_0x0231:
                com.startapp.C9632x2.m50510a((java.lang.Throwable) r0)
            L_0x0234:
                com.startapp.networkTest.enums.NetworkGenerations r0 = com.startapp.networkTest.enums.NetworkGenerations.Gen4
                if (r4 != r0) goto L_0x0308
                com.startapp.k8 r0 = com.startapp.C9068k8.this     // Catch:{ all -> 0x0254 }
                java.lang.reflect.Method r0 = r0.f37091o     // Catch:{ all -> 0x0254 }
                if (r0 == 0) goto L_0x0258
                com.startapp.k8 r0 = com.startapp.C9068k8.this     // Catch:{ all -> 0x0254 }
                java.lang.reflect.Method r0 = r0.f37091o     // Catch:{ all -> 0x0254 }
                r8 = 0
                java.lang.Object[] r9 = new java.lang.Object[r8]     // Catch:{ all -> 0x0254 }
                java.lang.Object r0 = r0.invoke(r2, r9)     // Catch:{ all -> 0x0254 }
                java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ all -> 0x0254 }
                int r13 = r0.intValue()     // Catch:{ all -> 0x0254 }
                goto L_0x0258
            L_0x0254:
                r0 = move-exception
                com.startapp.C9632x2.m50510a((java.lang.Throwable) r0)
            L_0x0258:
                com.startapp.k8 r0 = com.startapp.C9068k8.this
                java.lang.reflect.Method r0 = r0.f37090n
                if (r0 == 0) goto L_0x0278
                com.startapp.k8 r0 = com.startapp.C9068k8.this     // Catch:{ all -> 0x0274 }
                java.lang.reflect.Method r0 = r0.f37090n     // Catch:{ all -> 0x0274 }
                r8 = 0
                java.lang.Object[] r9 = new java.lang.Object[r8]     // Catch:{ all -> 0x0274 }
                java.lang.Object r0 = r0.invoke(r2, r9)     // Catch:{ all -> 0x0274 }
                java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ all -> 0x0274 }
                int r10 = r0.intValue()     // Catch:{ all -> 0x0274 }
                goto L_0x0278
            L_0x0274:
                r0 = move-exception
                com.startapp.C9632x2.m50510a((java.lang.Throwable) r0)
            L_0x0278:
                com.startapp.k8 r0 = com.startapp.C9068k8.this     // Catch:{ all -> 0x0296 }
                java.lang.reflect.Method r0 = r0.f37093q     // Catch:{ all -> 0x0296 }
                if (r0 == 0) goto L_0x029a
                com.startapp.k8 r0 = com.startapp.C9068k8.this     // Catch:{ all -> 0x0296 }
                java.lang.reflect.Method r0 = r0.f37093q     // Catch:{ all -> 0x0296 }
                r8 = 0
                java.lang.Object[] r9 = new java.lang.Object[r8]     // Catch:{ all -> 0x0296 }
                java.lang.Object r0 = r0.invoke(r2, r9)     // Catch:{ all -> 0x0296 }
                java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ all -> 0x0296 }
                int r0 = r0.intValue()     // Catch:{ all -> 0x0296 }
                r17 = r0
                goto L_0x029a
            L_0x0296:
                r0 = move-exception
                com.startapp.C9632x2.m50510a((java.lang.Throwable) r0)
            L_0x029a:
                com.startapp.k8 r0 = com.startapp.C9068k8.this     // Catch:{ all -> 0x02b8 }
                java.lang.reflect.Method r0 = r0.f37094r     // Catch:{ all -> 0x02b8 }
                if (r0 == 0) goto L_0x02bc
                com.startapp.k8 r0 = com.startapp.C9068k8.this     // Catch:{ all -> 0x02b8 }
                java.lang.reflect.Method r0 = r0.f37094r     // Catch:{ all -> 0x02b8 }
                r8 = 0
                java.lang.Object[] r9 = new java.lang.Object[r8]     // Catch:{ all -> 0x02b8 }
                java.lang.Object r0 = r0.invoke(r2, r9)     // Catch:{ all -> 0x02b8 }
                java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ all -> 0x02b8 }
                int r0 = r0.intValue()     // Catch:{ all -> 0x02b8 }
                r18 = r0
                goto L_0x02bc
            L_0x02b8:
                r0 = move-exception
                com.startapp.C9632x2.m50510a((java.lang.Throwable) r0)
            L_0x02bc:
                com.startapp.k8 r0 = com.startapp.C9068k8.this     // Catch:{ all -> 0x02d8 }
                java.lang.reflect.Method r0 = r0.f37095s     // Catch:{ all -> 0x02d8 }
                if (r0 == 0) goto L_0x02dc
                com.startapp.k8 r0 = com.startapp.C9068k8.this     // Catch:{ all -> 0x02d8 }
                java.lang.reflect.Method r0 = r0.f37095s     // Catch:{ all -> 0x02d8 }
                r8 = 0
                java.lang.Object[] r9 = new java.lang.Object[r8]     // Catch:{ all -> 0x02d8 }
                java.lang.Object r0 = r0.invoke(r2, r9)     // Catch:{ all -> 0x02d8 }
                java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ all -> 0x02d8 }
                int r9 = r0.intValue()     // Catch:{ all -> 0x02d8 }
                goto L_0x02de
            L_0x02d8:
                r0 = move-exception
                com.startapp.C9632x2.m50510a((java.lang.Throwable) r0)
            L_0x02dc:
                r9 = r22
            L_0x02de:
                com.startapp.k8 r0 = com.startapp.C9068k8.this     // Catch:{ all -> 0x0302 }
                java.lang.reflect.Method r0 = r0.f37096t     // Catch:{ all -> 0x0302 }
                if (r0 == 0) goto L_0x02ff
                com.startapp.k8 r0 = com.startapp.C9068k8.this     // Catch:{ all -> 0x0302 }
                java.lang.reflect.Method r0 = r0.f37096t     // Catch:{ all -> 0x0302 }
                r22 = r9
                r8 = 0
                java.lang.Object[] r9 = new java.lang.Object[r8]     // Catch:{ all -> 0x02fd }
                java.lang.Object r0 = r0.invoke(r2, r9)     // Catch:{ all -> 0x02fd }
                java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ all -> 0x02fd }
                int r0 = r0.intValue()     // Catch:{ all -> 0x02fd }
                r8 = r0
                goto L_0x030a
            L_0x02fd:
                r0 = move-exception
                goto L_0x0305
            L_0x02ff:
                r22 = r9
                goto L_0x0308
            L_0x0302:
                r0 = move-exception
                r22 = r9
            L_0x0305:
                com.startapp.C9632x2.m50510a((java.lang.Throwable) r0)
            L_0x0308:
                r8 = r21
            L_0x030a:
                r9 = r22
                com.startapp.networkTest.enums.NetworkGenerations r0 = com.startapp.networkTest.enums.NetworkGenerations.Gen5
                if (r4 != r0) goto L_0x0357
                com.startapp.k8 r0 = com.startapp.C9068k8.this
                java.lang.reflect.Field r0 = r0.f37101y
                if (r0 == 0) goto L_0x0327
                com.startapp.k8 r0 = com.startapp.C9068k8.this     // Catch:{ all -> 0x0323 }
                java.lang.reflect.Field r0 = r0.f37101y     // Catch:{ all -> 0x0323 }
                int r14 = r0.getInt(r2)     // Catch:{ all -> 0x0323 }
                goto L_0x0327
            L_0x0323:
                r0 = move-exception
                com.startapp.C9632x2.m50510a((java.lang.Throwable) r0)
            L_0x0327:
                com.startapp.k8 r0 = com.startapp.C9068k8.this
                java.lang.reflect.Field r0 = r0.f37102z
                if (r0 == 0) goto L_0x033e
                com.startapp.k8 r0 = com.startapp.C9068k8.this     // Catch:{ all -> 0x033a }
                java.lang.reflect.Field r0 = r0.f37102z     // Catch:{ all -> 0x033a }
                int r15 = r0.getInt(r2)     // Catch:{ all -> 0x033a }
                goto L_0x033e
            L_0x033a:
                r0 = move-exception
                com.startapp.C9632x2.m50510a((java.lang.Throwable) r0)
            L_0x033e:
                com.startapp.k8 r0 = com.startapp.C9068k8.this
                java.lang.reflect.Field r0 = r0.f37059A
                if (r0 == 0) goto L_0x0357
                com.startapp.k8 r0 = com.startapp.C9068k8.this     // Catch:{ all -> 0x0353 }
                java.lang.reflect.Field r0 = r0.f37059A     // Catch:{ all -> 0x0353 }
                int r0 = r0.getInt(r2)     // Catch:{ all -> 0x0353 }
                r16 = r0
                goto L_0x0357
            L_0x0353:
                r0 = move-exception
                com.startapp.C9632x2.m50510a((java.lang.Throwable) r0)
            L_0x0357:
                com.startapp.k8 r0 = com.startapp.C9068k8.this     // Catch:{ all -> 0x0373 }
                java.lang.reflect.Method r0 = r0.f37092p     // Catch:{ all -> 0x0373 }
                if (r0 == 0) goto L_0x0377
                com.startapp.k8 r0 = com.startapp.C9068k8.this     // Catch:{ all -> 0x0373 }
                java.lang.reflect.Method r0 = r0.f37092p     // Catch:{ all -> 0x0373 }
                r4 = 0
                java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch:{ all -> 0x0373 }
                java.lang.Object r0 = r0.invoke(r2, r4)     // Catch:{ all -> 0x0373 }
                java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ all -> 0x0373 }
                int r11 = r0.intValue()     // Catch:{ all -> 0x0373 }
                goto L_0x0377
            L_0x0373:
                r0 = move-exception
                com.startapp.C9632x2.m50510a((java.lang.Throwable) r0)
            L_0x0377:
                r3 = r16
                r0 = r17
                r2 = r18
                r4 = r19
                r17 = r6
                r18 = r7
                r16 = r11
                r11 = r20
                goto L_0x039c
            L_0x0388:
                r21 = r8
                r22 = r9
                r4 = r13
                r3 = r16
                r2 = r18
                r13 = r0
                r18 = r7
                r16 = r11
                r0 = r17
                r11 = r20
                r17 = r6
            L_0x039c:
                long r6 = android.os.SystemClock.elapsedRealtime()
                r19 = r6
                com.startapp.k8$o r6 = new com.startapp.k8$o
                com.startapp.k8 r7 = com.startapp.C9068k8.this
                r1 = 0
                r6.<init>(r7, r1)
                r6.f37156c = r11
                r6.f37154a = r13
                r6.f37155b = r12
                r6.f37157d = r0
                r6.f37158e = r2
                r6.f37159f = r8
                r6.f37160g = r9
                r6.f37161h = r10
                r6.f37165l = r14
                r6.f37166m = r15
                r6.f37167n = r3
                r6.f37168o = r5
                r1 = r17
                r6.f37169p = r1
                r1 = r18
                r6.f37170q = r1
                r6.f37163j = r4
                r11 = r16
                r6.f37162i = r11
                r0 = r19
                r6.f37164k = r0
                r1 = r26
                com.startapp.k8 r0 = com.startapp.C9068k8.this
                com.startapp.k8$j r0 = r0.f37084h
                r2 = r28
                r0.mo29590a((int) r2, (com.startapp.C9068k8.C9083o) r6)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.startapp.C9068k8.C9084p.m48874a(android.telephony.SignalStrength, int):void");
        }

        /* renamed from: a */
        private void m48872a(CellLocation cellLocation, int i) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            C9076h hVar = new C9076h(C9068k8.this, (C9069a) null);
            hVar.f37124a = cellLocation;
            hVar.f37125b = elapsedRealtime;
            C9068k8.this.f37084h.mo29587a(i, hVar);
            C9068k8.this.f37077a.post(new C9006h9(new C9086b(cellLocation, i)));
        }
    }

    /* renamed from: c */
    private void m48789c(boolean z) {
        int i;
        SubscriptionManager subscriptionManager;
        if (z && this.f37085i != null && this.f37080d.checkCallingOrSelfPermission("android.permission.READ_PHONE_STATE") == 0 && Build.VERSION.SDK_INT >= 22 && (subscriptionManager = (SubscriptionManager) this.f37080d.getSystemService("telephony_subscription_service")) != null) {
            subscriptionManager.addOnSubscriptionsChangedListener(this.f37085i);
        }
        if (this.f37078b != null) {
            int i2 = Build.VERSION.SDK_INT;
            if ((i2 >= 29 || this.f37080d.checkCallingOrSelfPermission("android.permission.ACCESS_COARSE_LOCATION") != 0) && !(this.f37080d.checkCallingOrSelfPermission("android.permission.ACCESS_FINE_LOCATION") == 0 && this.f37080d.checkCallingOrSelfPermission("android.permission.ACCESS_BACKGROUND_LOCATION") == 0)) {
                i = 257;
            } else {
                i = 273;
                if (i2 >= 17) {
                    i = 1297;
                }
            }
            if (this.f37082f.size() == 0) {
                if (this.f37081e == null) {
                    this.f37081e = new C9084p();
                }
                try {
                    this.f37078b.listen(this.f37081e, i);
                } catch (Throwable th) {
                    C9632x2.m50510a(th);
                    this.f37078b.listen(this.f37081e, 257);
                }
            } else {
                Iterator<C9084p> it = this.f37082f.iterator();
                while (it.hasNext()) {
                    C9084p next = it.next();
                    TelephonyManager telephonyManager = null;
                    SparseArray<TelephonyManager> sparseArray = this.f37079c;
                    if (sparseArray != null && sparseArray.size() > 0) {
                        telephonyManager = this.f37079c.get(next.mo29599a());
                    }
                    if (telephonyManager == null) {
                        telephonyManager = this.f37078b;
                    }
                    try {
                        telephonyManager.listen(next, i);
                    } catch (Throwable th2) {
                        C9632x2.m50510a(th2);
                        telephonyManager.listen(next, 257);
                    }
                }
            }
        }
    }

    /* renamed from: f */
    private static CellConnectionStatus m48798f(int i) {
        if (i == 0) {
            return CellConnectionStatus.None;
        }
        if (i == 1) {
            return CellConnectionStatus.Primary;
        }
        if (i != 2) {
            return CellConnectionStatus.Unknown;
        }
        return CellConnectionStatus.Secondary;
    }

    /* renamed from: k */
    public NetworkTypes mo29565k() {
        if (C8913d8.m48516b(this.f37080d)) {
            TelephonyManager telephonyManager = this.f37078b;
            if (telephonyManager == null || Build.VERSION.SDK_INT < 24) {
                Method method = this.f37097u;
                if (method != null) {
                    try {
                        return m48790d(((Integer) method.invoke(telephonyManager, new Object[0])).intValue());
                    } catch (Throwable th) {
                        C9632x2.m50510a(th);
                    }
                }
            } else {
                try {
                    return m48790d(telephonyManager.getVoiceNetworkType());
                } catch (SecurityException e) {
                    C9632x2.m50512b(e);
                }
            }
        }
        return NetworkTypes.Unknown;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m48783b(boolean z) {
        try {
            m48789c(z);
        } catch (Throwable th) {
            C9632x2.m50510a(th);
        }
    }

    /* renamed from: com.startapp.k8$l */
    /* compiled from: Sta */
    public class C9080l {

        /* renamed from: a */
        public long f37139a;

        /* renamed from: b */
        public int f37140b;

        /* renamed from: c */
        public int f37141c;

        /* renamed from: d */
        public long f37142d;

        private C9080l() {
            this.f37139a = 0;
            this.f37140b = 0;
            this.f37141c = 0;
            this.f37142d = 0;
        }

        public /* synthetic */ C9080l(C9068k8 k8Var, C9069a aVar) {
            this();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:196:0x0435  */
    /* JADX WARNING: Removed duplicated region for block: B:199:0x0487  */
    /* JADX WARNING: Removed duplicated region for block: B:200:0x048b  */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.startapp.networkTest.data.RadioInfo mo29560h(int r17) {
        /*
            r16 = this;
            r1 = r16
            r2 = r17
            r3 = -1
            if (r2 == r3) goto L_0x048f
            boolean r0 = r16.m48804k((int) r17)
            if (r0 == 0) goto L_0x048f
            int r0 = android.os.Build.VERSION.SDK_INT
            r4 = 22
            if (r0 < r4) goto L_0x048f
            int[] r0 = r1.f37074P
            int r0 = r0.length
            if (r0 != 0) goto L_0x001a
            goto L_0x048f
        L_0x001a:
            com.startapp.networkTest.data.RadioInfo r4 = new com.startapp.networkTest.data.RadioInfo
            r4.<init>()
            r4.SubscriptionId = r2
            com.startapp.z6 r0 = r1.f37086j
            int r5 = r0.DefaultVoiceSimId
            r6 = 1
            r7 = 0
            if (r2 != r5) goto L_0x002b
            r5 = 1
            goto L_0x002c
        L_0x002b:
            r5 = 0
        L_0x002c:
            r4.IsDefaultVoiceSim = r5
            int r0 = r0.DefaultDataSimId
            if (r2 != r0) goto L_0x0034
            r0 = 1
            goto L_0x0035
        L_0x0034:
            r0 = 0
        L_0x0035:
            r4.IsDefaultDataSim = r0
            android.content.Context r0 = r1.f37080d
            com.startapp.networkTest.enums.PreferredNetworkTypes r0 = r1.m48767a((android.content.Context) r0, (int) r2)
            r4.PreferredNetwork = r0
            com.startapp.networkTest.enums.PreferredNetworkTypes r5 = com.startapp.networkTest.enums.PreferredNetworkTypes.Unknown
            if (r0 != r5) goto L_0x005b
            android.content.Context r0 = r1.f37080d
            android.util.SparseArray r0 = r1.m48764a((android.content.Context) r0)
            com.startapp.z6 r5 = r1.f37086j
            com.startapp.y9 r5 = r5.getSimInfoSubId(r2)
            int r5 = r5.SimSlotIndex
            java.lang.Object r0 = r0.get(r5)
            com.startapp.networkTest.enums.PreferredNetworkTypes r0 = (com.startapp.networkTest.enums.PreferredNetworkTypes) r0
            if (r0 == 0) goto L_0x005b
            r4.PreferredNetwork = r0
        L_0x005b:
            android.telephony.TelephonyManager r0 = r1.f37078b
            if (r0 == 0) goto L_0x048e
            android.util.SparseArray<android.telephony.TelephonyManager> r0 = r1.f37079c
            r5 = 0
            if (r0 == 0) goto L_0x0074
            int r0 = r0.size()
            if (r0 <= 0) goto L_0x0074
            android.util.SparseArray<android.telephony.TelephonyManager> r0 = r1.f37079c
            java.lang.Object r0 = r0.get(r2)
            android.telephony.TelephonyManager r0 = (android.telephony.TelephonyManager) r0
            r8 = r0
            goto L_0x0075
        L_0x0074:
            r8 = r5
        L_0x0075:
            r9 = 3
            android.telephony.TelephonyManager r0 = r1.f37078b     // Catch:{ all -> 0x009e }
            int r0 = r0.getDataState()     // Catch:{ all -> 0x009e }
            if (r0 == 0) goto L_0x0099
            if (r0 == r6) goto L_0x0094
            r10 = 2
            if (r0 == r10) goto L_0x008f
            if (r0 == r9) goto L_0x008a
            com.startapp.networkTest.enums.radio.DataConnectionStates r0 = com.startapp.networkTest.enums.radio.DataConnectionStates.Unknown     // Catch:{ all -> 0x009e }
            r4.MobileDataConnectionState = r0     // Catch:{ all -> 0x009e }
            goto L_0x00a2
        L_0x008a:
            com.startapp.networkTest.enums.radio.DataConnectionStates r0 = com.startapp.networkTest.enums.radio.DataConnectionStates.Suspended     // Catch:{ all -> 0x009e }
            r4.MobileDataConnectionState = r0     // Catch:{ all -> 0x009e }
            goto L_0x00a2
        L_0x008f:
            com.startapp.networkTest.enums.radio.DataConnectionStates r0 = com.startapp.networkTest.enums.radio.DataConnectionStates.Connected     // Catch:{ all -> 0x009e }
            r4.MobileDataConnectionState = r0     // Catch:{ all -> 0x009e }
            goto L_0x00a2
        L_0x0094:
            com.startapp.networkTest.enums.radio.DataConnectionStates r0 = com.startapp.networkTest.enums.radio.DataConnectionStates.Connecting     // Catch:{ all -> 0x009e }
            r4.MobileDataConnectionState = r0     // Catch:{ all -> 0x009e }
            goto L_0x00a2
        L_0x0099:
            com.startapp.networkTest.enums.radio.DataConnectionStates r0 = com.startapp.networkTest.enums.radio.DataConnectionStates.Disconnected     // Catch:{ all -> 0x009e }
            r4.MobileDataConnectionState = r0     // Catch:{ all -> 0x009e }
            goto L_0x00a2
        L_0x009e:
            r0 = move-exception
            com.startapp.C9632x2.m50510a((java.lang.Throwable) r0)
        L_0x00a2:
            boolean r0 = r16.m48807m()
            if (r0 == 0) goto L_0x00ab
            com.startapp.networkTest.enums.FlightModeStates r0 = com.startapp.networkTest.enums.FlightModeStates.Enabled
            goto L_0x00ad
        L_0x00ab:
            com.startapp.networkTest.enums.FlightModeStates r0 = com.startapp.networkTest.enums.FlightModeStates.Disabled
        L_0x00ad:
            r4.FlightMode = r0
            com.startapp.networkTest.enums.ThreeState r0 = com.startapp.networkTest.enums.ThreeState.Unknown
            r4.MobileDataEnabled = r0
            if (r8 == 0) goto L_0x00ce
            int r0 = android.os.Build.VERSION.SDK_INT
            r10 = 26
            if (r0 < r10) goto L_0x00ce
            boolean r0 = r8.isDataEnabled()     // Catch:{ SecurityException -> 0x00c9 }
            if (r0 == 0) goto L_0x00c4
            com.startapp.networkTest.enums.ThreeState r0 = com.startapp.networkTest.enums.ThreeState.Enabled     // Catch:{ SecurityException -> 0x00c9 }
            goto L_0x00c6
        L_0x00c4:
            com.startapp.networkTest.enums.ThreeState r0 = com.startapp.networkTest.enums.ThreeState.Disabled     // Catch:{ SecurityException -> 0x00c9 }
        L_0x00c6:
            r4.MobileDataEnabled = r0     // Catch:{ SecurityException -> 0x00c9 }
            goto L_0x00f4
        L_0x00c9:
            r0 = move-exception
            com.startapp.C9632x2.m50512b(r0)
            goto L_0x00f4
        L_0x00ce:
            java.lang.reflect.Method r0 = r1.f37067I
            if (r0 == 0) goto L_0x00f4
            android.telephony.TelephonyManager r10 = r1.f37078b     // Catch:{ all -> 0x00f0 }
            java.lang.Object[] r11 = new java.lang.Object[r6]     // Catch:{ all -> 0x00f0 }
            java.lang.Integer r12 = java.lang.Integer.valueOf(r17)     // Catch:{ all -> 0x00f0 }
            r11[r7] = r12     // Catch:{ all -> 0x00f0 }
            java.lang.Object r0 = r0.invoke(r10, r11)     // Catch:{ all -> 0x00f0 }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x00f0 }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x00f0 }
            if (r0 == 0) goto L_0x00eb
            com.startapp.networkTest.enums.ThreeState r0 = com.startapp.networkTest.enums.ThreeState.Enabled     // Catch:{ all -> 0x00f0 }
            goto L_0x00ed
        L_0x00eb:
            com.startapp.networkTest.enums.ThreeState r0 = com.startapp.networkTest.enums.ThreeState.Disabled     // Catch:{ all -> 0x00f0 }
        L_0x00ed:
            r4.MobileDataEnabled = r0     // Catch:{ all -> 0x00f0 }
            goto L_0x00f4
        L_0x00f0:
            r0 = move-exception
            com.startapp.C9632x2.m50510a((java.lang.Throwable) r0)
        L_0x00f4:
            if (r8 == 0) goto L_0x00fd
            boolean r0 = r8.isNetworkRoaming()
            r4.IsRoaming = r0
            goto L_0x011c
        L_0x00fd:
            java.lang.reflect.Method r0 = r1.f37068J
            if (r0 == 0) goto L_0x011c
            android.telephony.TelephonyManager r10 = r1.f37078b     // Catch:{ all -> 0x0118 }
            java.lang.Object[] r11 = new java.lang.Object[r6]     // Catch:{ all -> 0x0118 }
            java.lang.Integer r12 = java.lang.Integer.valueOf(r17)     // Catch:{ all -> 0x0118 }
            r11[r7] = r12     // Catch:{ all -> 0x0118 }
            java.lang.Object r0 = r0.invoke(r10, r11)     // Catch:{ all -> 0x0118 }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x0118 }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x0118 }
            r4.IsRoaming = r0     // Catch:{ all -> 0x0118 }
            goto L_0x011c
        L_0x0118:
            r0 = move-exception
            com.startapp.C9632x2.m50510a((java.lang.Throwable) r0)
        L_0x011c:
            com.startapp.networkTest.enums.ThreeStateShort r0 = r16.mo29568o()
            r4.IsMetered = r0
            com.startapp.networkTest.enums.ThreeStateShort r0 = r16.mo29567n()
            int r0 = com.startapp.C8942f2.m48564a((com.startapp.networkTest.enums.ThreeStateShort) r0)
            r4.IsVpn = r0
            com.startapp.networkTest.enums.ConnectionTypes r0 = r16.mo29553d()
            r4.ConnectionType = r0
            if (r8 == 0) goto L_0x0152
            int r0 = android.os.Build.VERSION.SDK_INT
            r10 = 30
            if (r0 < r10) goto L_0x0142
            android.content.Context r0 = r1.f37080d
            boolean r0 = com.startapp.C8913d8.m48516b(r0)
            if (r0 == 0) goto L_0x0152
        L_0x0142:
            int r0 = r8.getNetworkType()     // Catch:{ SecurityException -> 0x014d }
            com.startapp.networkTest.enums.NetworkTypes r0 = m48790d((int) r0)     // Catch:{ SecurityException -> 0x014d }
            r4.NetworkType = r0     // Catch:{ SecurityException -> 0x014d }
            goto L_0x0175
        L_0x014d:
            r0 = move-exception
            com.startapp.C9632x2.m50512b(r0)
            goto L_0x0175
        L_0x0152:
            java.lang.reflect.Method r0 = r1.f37069K
            if (r0 == 0) goto L_0x0175
            android.telephony.TelephonyManager r10 = r1.f37078b     // Catch:{ all -> 0x0171 }
            java.lang.Object[] r11 = new java.lang.Object[r6]     // Catch:{ all -> 0x0171 }
            java.lang.Integer r12 = java.lang.Integer.valueOf(r17)     // Catch:{ all -> 0x0171 }
            r11[r7] = r12     // Catch:{ all -> 0x0171 }
            java.lang.Object r0 = r0.invoke(r10, r11)     // Catch:{ all -> 0x0171 }
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ all -> 0x0171 }
            int r0 = r0.intValue()     // Catch:{ all -> 0x0171 }
            com.startapp.networkTest.enums.NetworkTypes r0 = m48790d((int) r0)     // Catch:{ all -> 0x0171 }
            r4.NetworkType = r0     // Catch:{ all -> 0x0171 }
            goto L_0x0175
        L_0x0171:
            r0 = move-exception
            com.startapp.C9632x2.m50510a((java.lang.Throwable) r0)
        L_0x0175:
            if (r8 == 0) goto L_0x0182
            java.lang.String r0 = r8.getNetworkOperatorName()
            java.lang.String r0 = com.startapp.C9135ma.m48968a((java.lang.String) r0)
            r4.OperatorName = r0
            goto L_0x01a1
        L_0x0182:
            java.lang.reflect.Method r0 = r1.f37070L
            if (r0 == 0) goto L_0x01a1
            android.telephony.TelephonyManager r10 = r1.f37078b     // Catch:{ all -> 0x019d }
            java.lang.Object[] r11 = new java.lang.Object[r6]     // Catch:{ all -> 0x019d }
            java.lang.Integer r12 = java.lang.Integer.valueOf(r17)     // Catch:{ all -> 0x019d }
            r11[r7] = r12     // Catch:{ all -> 0x019d }
            java.lang.Object r0 = r0.invoke(r10, r11)     // Catch:{ all -> 0x019d }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x019d }
            java.lang.String r0 = com.startapp.C9135ma.m48968a((java.lang.String) r0)     // Catch:{ all -> 0x019d }
            r4.OperatorName = r0     // Catch:{ all -> 0x019d }
            goto L_0x01a1
        L_0x019d:
            r0 = move-exception
            com.startapp.C9632x2.m50510a((java.lang.Throwable) r0)
        L_0x01a1:
            java.lang.String r10 = ""
            if (r8 == 0) goto L_0x01aa
            java.lang.String r0 = r8.getNetworkOperator()
            goto L_0x01de
        L_0x01aa:
            java.lang.reflect.Method r0 = r1.f37072N
            if (r0 == 0) goto L_0x01c4
            android.telephony.TelephonyManager r8 = r1.f37078b     // Catch:{ all -> 0x01bf }
            java.lang.Object[] r11 = new java.lang.Object[r6]     // Catch:{ all -> 0x01bf }
            java.lang.Integer r12 = java.lang.Integer.valueOf(r17)     // Catch:{ all -> 0x01bf }
            r11[r7] = r12     // Catch:{ all -> 0x01bf }
            java.lang.Object r0 = r0.invoke(r8, r11)     // Catch:{ all -> 0x01bf }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x01bf }
            goto L_0x01de
        L_0x01bf:
            r0 = move-exception
            com.startapp.C9632x2.m50510a((java.lang.Throwable) r0)
            goto L_0x01dd
        L_0x01c4:
            java.lang.reflect.Method r0 = r1.f37071M
            if (r0 == 0) goto L_0x01dd
            android.telephony.TelephonyManager r8 = r1.f37078b     // Catch:{ all -> 0x01d9 }
            java.lang.Object[] r11 = new java.lang.Object[r6]     // Catch:{ all -> 0x01d9 }
            java.lang.Integer r12 = java.lang.Integer.valueOf(r17)     // Catch:{ all -> 0x01d9 }
            r11[r7] = r12     // Catch:{ all -> 0x01d9 }
            java.lang.Object r0 = r0.invoke(r8, r11)     // Catch:{ all -> 0x01d9 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x01d9 }
            goto L_0x01de
        L_0x01d9:
            r0 = move-exception
            com.startapp.C9632x2.m50510a((java.lang.Throwable) r0)
        L_0x01dd:
            r0 = r10
        L_0x01de:
            int r8 = r0.length()
            r11 = 4
            if (r8 <= r11) goto L_0x01f1
            java.lang.String r8 = r0.substring(r7, r9)
            r4.MCC = r8
            java.lang.String r0 = r0.substring(r9)
            r4.MNC = r0
        L_0x01f1:
            com.startapp.networkTest.data.radio.NetworkRegistrationInfo[] r0 = r16.mo29558g((int) r17)
            com.startapp.k8$j r8 = r1.f37084h
            com.startapp.k8$h r8 = r8.mo29584a((int) r2)
            if (r8 != 0) goto L_0x0202
            com.startapp.k8$h r8 = new com.startapp.k8$h
            r8.<init>(r1, r5)
        L_0x0202:
            int r5 = android.os.Build.VERSION.SDK_INT
            r9 = 29
            if (r5 >= r9) goto L_0x0212
            android.content.Context r5 = r1.f37080d
            java.lang.String r9 = "android.permission.ACCESS_COARSE_LOCATION"
            int r5 = r5.checkCallingOrSelfPermission(r9)
            if (r5 == 0) goto L_0x0226
        L_0x0212:
            android.content.Context r5 = r1.f37080d
            java.lang.String r9 = "android.permission.ACCESS_FINE_LOCATION"
            int r5 = r5.checkCallingOrSelfPermission(r9)
            if (r5 != 0) goto L_0x0233
            android.content.Context r5 = r1.f37080d
            java.lang.String r9 = "android.permission.ACCESS_BACKGROUND_LOCATION"
            int r5 = r5.checkCallingOrSelfPermission(r9)
            if (r5 != 0) goto L_0x0233
        L_0x0226:
            android.telephony.CellLocation r5 = r8.f37124a
            if (r5 != 0) goto L_0x0235
            android.telephony.TelephonyManager r5 = r1.f37078b
            android.telephony.CellLocation r5 = r5.getCellLocation()
            r8.f37124a = r5
            goto L_0x0235
        L_0x0233:
            r4.MissingPermission = r6
        L_0x0235:
            android.telephony.CellLocation r5 = r8.f37124a
            r11 = 0
            r13 = 2147483647(0x7fffffff, double:1.060997895E-314)
            if (r5 == 0) goto L_0x0325
            java.lang.Class r5 = r5.getClass()
            java.lang.Class<android.telephony.gsm.GsmCellLocation> r9 = android.telephony.gsm.GsmCellLocation.class
            boolean r5 = r5.equals(r9)
            if (r5 == 0) goto L_0x028e
            android.telephony.CellLocation r5 = r8.f37124a
            android.telephony.gsm.GsmCellLocation r5 = (android.telephony.gsm.GsmCellLocation) r5
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            int r15 = r5.getLac()
            r9.append(r15)
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            r4.GsmLAC = r9
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            int r15 = r5.getCid()
            r9.append(r15)
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            r4.GsmCellId = r9
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            int r5 = r5.getPsc()
            r9.append(r5)
            r9.append(r10)
            java.lang.String r5 = r9.toString()
            r4.PrimaryScramblingCode = r5
            goto L_0x0309
        L_0x028e:
            android.telephony.CellLocation r5 = r8.f37124a
            java.lang.Class r5 = r5.getClass()
            java.lang.Class<android.telephony.cdma.CdmaCellLocation> r9 = android.telephony.cdma.CdmaCellLocation.class
            boolean r5 = r5.equals(r9)
            if (r5 == 0) goto L_0x0309
            android.telephony.CellLocation r5 = r8.f37124a
            android.telephony.cdma.CdmaCellLocation r5 = (android.telephony.cdma.CdmaCellLocation) r5
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            int r15 = r5.getBaseStationId()
            r9.append(r15)
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            r4.CdmaBaseStationId = r9
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            int r15 = r5.getBaseStationLatitude()
            r9.append(r15)
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            r4.CdmaBaseStationLatitude = r9
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            int r15 = r5.getBaseStationLongitude()
            r9.append(r15)
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            r4.CdmaBaseStationLongitude = r9
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            int r15 = r5.getNetworkId()
            r9.append(r15)
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            r4.CdmaNetworkId = r9
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            int r5 = r5.getSystemId()
            r9.append(r5)
            r9.append(r10)
            java.lang.String r5 = r9.toString()
            r4.CdmaSystemId = r5
        L_0x0309:
            long r6 = r8.f37125b
            int r15 = (r6 > r11 ? 1 : (r6 == r11 ? 0 : -1))
            if (r15 <= 0) goto L_0x0323
            long r6 = android.os.SystemClock.elapsedRealtime()
            r15 = r10
            long r9 = r8.f37125b
            long r6 = r6 - r9
            int r8 = (r6 > r13 ? 1 : (r6 == r13 ? 0 : -1))
            if (r8 <= 0) goto L_0x031f
            r7 = 2147483647(0x7fffffff, float:NaN)
            goto L_0x0320
        L_0x031f:
            int r7 = (int) r6
        L_0x0320:
            r4.GsmCellIdAge = r7
            goto L_0x034d
        L_0x0323:
            r15 = r10
            goto L_0x034d
        L_0x0325:
            r15 = r10
            if (r0 == 0) goto L_0x034d
            int r6 = r0.length
            r7 = 0
        L_0x032a:
            if (r7 >= r6) goto L_0x034d
            r8 = r0[r7]
            java.lang.String r9 = r8.Domain
            java.lang.String r10 = "CS"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x034a
            java.lang.String r9 = r8.CellId
            r4.GsmCellId = r9
            java.lang.String r10 = r8.Tac
            r4.GsmLAC = r10
            boolean r9 = r9.isEmpty()
            if (r9 != 0) goto L_0x034a
            int r8 = r8.Age
            r4.GsmCellIdAge = r8
        L_0x034a:
            int r7 = r7 + 1
            goto L_0x032a
        L_0x034d:
            com.startapp.k8$j r6 = r1.f37084h
            com.startapp.k8$n r6 = r6.mo29596d(r2)
            com.startapp.networkTest.enums.ServiceStates r7 = r6.f37147a
            r4.ServiceState = r7
            com.startapp.networkTest.enums.DuplexMode r7 = r6.f37149c
            r4.DuplexMode = r7
            com.startapp.networkTest.enums.ThreeStateShort r7 = r6.f37150d
            r4.ManualSelection = r7
            com.startapp.networkTest.enums.ThreeStateShort r7 = r6.f37152f
            r4.CarrierAggregation = r7
            int r7 = r6.f37151e
            r4.ARFCN = r7
            long r7 = r6.f37148b
            int r9 = (r7 > r11 ? 1 : (r7 == r11 ? 0 : -1))
            if (r9 <= 0) goto L_0x037f
            long r7 = android.os.SystemClock.elapsedRealtime()
            long r9 = r6.f37148b
            long r7 = r7 - r9
            int r6 = (r7 > r13 ? 1 : (r7 == r13 ? 0 : -1))
            if (r6 <= 0) goto L_0x037c
            r6 = 2147483647(0x7fffffff, float:NaN)
            goto L_0x037d
        L_0x037c:
            int r6 = (int) r7
        L_0x037d:
            r4.ServiceStateAge = r6
        L_0x037f:
            java.lang.String r6 = r1.mo29551c((com.startapp.networkTest.data.radio.NetworkRegistrationInfo[]) r0)
            r4.NrState = r6
            com.startapp.networkTest.enums.ThreeStateShort r6 = r1.mo29554d((com.startapp.networkTest.data.radio.NetworkRegistrationInfo[]) r0)
            r4.NrAvailable = r6
            com.startapp.networkTest.enums.NetworkTypes r6 = r4.NetworkType
            com.startapp.networkTest.enums.NetworkTypes r7 = com.startapp.networkTest.enums.NetworkTypes.Unknown
            if (r6 != r7) goto L_0x0397
            com.startapp.networkTest.enums.NetworkTypes r6 = r1.mo29548b((com.startapp.networkTest.data.radio.NetworkRegistrationInfo[]) r0)
            r4.NetworkType = r6
        L_0x0397:
            com.startapp.k8$j r6 = r1.f37084h
            com.startapp.k8$o r2 = r6.mo29597e(r2)
            int r6 = r2.f37163j
            r4.RSCP = r6
            int r6 = r2.f37156c
            r4.CdmaEcIo = r6
            int r6 = r2.f37154a
            r4.RXLevel = r6
            int r7 = r2.f37155b
            r4.NativeDbm = r7
            int r7 = r2.f37162i
            r4.EcN0 = r7
            int r7 = r2.f37157d
            r4.LteCqi = r7
            int r7 = r2.f37158e
            r4.LteRsrp = r7
            int r8 = r2.f37160g
            r4.LteRsrq = r8
            int r8 = r2.f37159f
            r4.LteRssnr = r8
            int r8 = r2.f37161h
            r4.LteRssi = r8
            int r8 = r2.f37165l
            r4.NrCsiRsrp = r8
            int r8 = r2.f37166m
            r4.NrCsiRsrq = r8
            int r8 = r2.f37167n
            r4.NrCsiSinr = r8
            int r8 = r2.f37168o
            r4.NrSsRsrp = r8
            int r8 = r2.f37169p
            r4.NrSsRsrq = r8
            int r8 = r2.f37170q
            r4.NrSsSinr = r8
            com.startapp.networkTest.enums.NetworkTypes r8 = r4.NetworkType
            com.startapp.networkTest.enums.NetworkTypes r9 = com.startapp.networkTest.enums.NetworkTypes.LTE
            if (r8 == r9) goto L_0x03e7
            com.startapp.networkTest.enums.NetworkTypes r9 = com.startapp.networkTest.enums.NetworkTypes.LTE_CA
            if (r8 != r9) goto L_0x03eb
        L_0x03e7:
            if (r6 <= r3) goto L_0x03eb
            r4.RXLevel = r7
        L_0x03eb:
            com.startapp.networkTest.enums.NetworkTypes r3 = com.startapp.networkTest.enums.NetworkTypes.LTE_CA
            if (r8 != r3) goto L_0x03f3
            com.startapp.networkTest.enums.ThreeStateShort r3 = com.startapp.networkTest.enums.ThreeStateShort.Yes
            r4.CarrierAggregation = r3
        L_0x03f3:
            com.startapp.networkTest.enums.ThreeStateShort r3 = r4.CarrierAggregation
            com.startapp.networkTest.enums.ThreeStateShort r6 = com.startapp.networkTest.enums.ThreeStateShort.Unknown
            if (r3 != r6) goto L_0x03ff
            com.startapp.networkTest.enums.ThreeStateShort r0 = r1.mo29544a((com.startapp.networkTest.data.radio.NetworkRegistrationInfo[]) r0)
            r4.CarrierAggregation = r0
        L_0x03ff:
            com.startapp.networkTest.enums.NetworkTypes r0 = r4.NetworkType
            com.startapp.networkTest.enums.NetworkTypes r3 = com.startapp.networkTest.enums.NetworkTypes.NR
            if (r0 != r3) goto L_0x047c
            java.lang.String r0 = r4.MCC     // Catch:{ NumberFormatException -> 0x0414 }
            int r3 = java.lang.Integer.parseInt(r0)     // Catch:{ NumberFormatException -> 0x0414 }
            java.lang.String r0 = r4.MNC     // Catch:{ NumberFormatException -> 0x0412 }
            int r7 = java.lang.Integer.parseInt(r0)     // Catch:{ NumberFormatException -> 0x0412 }
            goto L_0x041a
        L_0x0412:
            r0 = move-exception
            goto L_0x0416
        L_0x0414:
            r0 = move-exception
            r3 = 0
        L_0x0416:
            com.startapp.C9632x2.m50512b(r0)
            r7 = 0
        L_0x041a:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r5 = r15
            r0.append(r5)
            r0.append(r3)
            r0.append(r7)
            java.lang.String r0 = r0.toString()
            com.startapp.k8$j r3 = r1.f37084h
            com.startapp.k8$l r0 = r3.mo29585a((java.lang.String) r0)
            if (r0 == 0) goto L_0x047c
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            long r6 = r0.f37139a
            r3.append(r6)
            r3.append(r5)
            java.lang.String r3 = r3.toString()
            r4.GsmCellId = r3
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            int r6 = r0.f37140b
            r3.append(r6)
            r3.append(r5)
            java.lang.String r3 = r3.toString()
            r4.GsmLAC = r3
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            int r6 = r0.f37141c
            r3.append(r6)
            r3.append(r5)
            java.lang.String r3 = r3.toString()
            r4.PrimaryScramblingCode = r3
            long r5 = android.os.SystemClock.elapsedRealtime()
            long r7 = r0.f37142d
            r9 = 1000000(0xf4240, double:4.940656E-318)
            long r7 = r7 / r9
            long r5 = r5 - r7
            int r0 = (int) r5
            r4.GsmCellIdAge = r0
        L_0x047c:
            long r5 = android.os.SystemClock.elapsedRealtime()
            long r2 = r2.f37164k
            long r5 = r5 - r2
            int r0 = (r5 > r13 ? 1 : (r5 == r13 ? 0 : -1))
            if (r0 <= 0) goto L_0x048b
            r6 = 2147483647(0x7fffffff, float:NaN)
            goto L_0x048c
        L_0x048b:
            int r6 = (int) r5
        L_0x048c:
            r4.RXLevelAge = r6
        L_0x048e:
            return r4
        L_0x048f:
            com.startapp.networkTest.data.RadioInfo r0 = r16.mo29557g()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.startapp.C9068k8.mo29560h(int):com.startapp.networkTest.data.RadioInfo");
    }

    /* renamed from: i */
    public NetworkTypes mo29562i(int i) {
        if (m48804k(i) && C8913d8.m48516b(this.f37080d)) {
            SparseArray<TelephonyManager> sparseArray = this.f37079c;
            if (sparseArray == null || sparseArray.get(i) == null || Build.VERSION.SDK_INT < 24) {
                Method method = this.f37098v;
                if (method != null) {
                    try {
                        return m48790d(((Integer) method.invoke(this.f37078b, new Object[]{Integer.valueOf(i)})).intValue());
                    } catch (Throwable th) {
                        C9632x2.m50510a(th);
                    }
                }
            } else {
                try {
                    return m48790d(this.f37079c.get(i).getVoiceNetworkType());
                } catch (SecurityException e) {
                    C9632x2.m50512b(e);
                }
            }
        }
        return mo29565k();
    }

    /* renamed from: j */
    public boolean mo29564j(int i) {
        Method method = this.f37068J;
        if (method == null) {
            return mo29569p();
        }
        try {
            return ((Boolean) method.invoke(this.f37078b, new Object[]{Integer.valueOf(i)})).booleanValue();
        } catch (Throwable th) {
            C9632x2.m50510a(th);
            return mo29569p();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m48771a(int[] iArr) {
        this.f37082f = new ArrayList<>();
        for (int pVar : iArr) {
            this.f37082f.add(new C9084p(pVar));
        }
    }

    /* renamed from: b */
    private void m48779b(Context context) {
        if (this.f37087k == null) {
            this.f37087k = new C9079k(this, (C9069a) null);
        }
        Objects.requireNonNull(this.f37087k);
        IntentFilter intentFilter = new IntentFilter("android.intent.action.ANY_DATA_STATE");
        Objects.requireNonNull(this.f37087k);
        intentFilter.addAction("com.samsung.ims.action.IMS_REGISTRATION");
        context.registerReceiver(this.f37087k, intentFilter);
    }

    /* renamed from: com.startapp.k8$n */
    /* compiled from: Sta */
    public class C9082n {

        /* renamed from: a */
        public ServiceStates f37147a;

        /* renamed from: b */
        public long f37148b;

        /* renamed from: c */
        public DuplexMode f37149c;

        /* renamed from: d */
        public ThreeStateShort f37150d;

        /* renamed from: e */
        public int f37151e;

        /* renamed from: f */
        public ThreeStateShort f37152f;

        private C9082n() {
            this.f37147a = ServiceStates.Unknown;
            this.f37148b = 0;
            this.f37149c = DuplexMode.Unknown;
            ThreeStateShort threeStateShort = ThreeStateShort.Unknown;
            this.f37150d = threeStateShort;
            this.f37151e = -1;
            this.f37152f = threeStateShort;
        }

        public /* synthetic */ C9082n(C9068k8 k8Var, C9069a aVar) {
            this();
        }
    }

    /* renamed from: a */
    public com.startapp.networkTest.data.radio.CellInfo[] mo29547a(boolean z) {
        List<CellInfo> list;
        if (this.f37080d.checkCallingOrSelfPermission("android.permission.ACCESS_COARSE_LOCATION") != 0 || (this.f37080d.checkCallingOrSelfPermission("android.permission.ACCESS_FINE_LOCATION") != 0 && Build.VERSION.SDK_INT >= 29)) {
            return new com.startapp.networkTest.data.radio.CellInfo[0];
        }
        ArrayList arrayList = new ArrayList();
        TelephonyManager telephonyManager = this.f37078b;
        if (telephonyManager != null && Build.VERSION.SDK_INT >= 18) {
            List<CellInfo> list2 = null;
            if (z || (list = this.f37088l) == null) {
                try {
                    list2 = telephonyManager.getAllCellInfo();
                } catch (Throwable th) {
                    C9632x2.m50510a(th);
                }
                list = (this.f37088l == null || (list2 != null && !list2.isEmpty())) ? list2 : this.f37088l;
            }
            if (list == null) {
                return new com.startapp.networkTest.data.radio.CellInfo[0];
            }
            long uptimeMillis = SystemClock.uptimeMillis();
            for (CellInfo next : list) {
                com.startapp.networkTest.data.radio.CellInfo cellInfo = new com.startapp.networkTest.data.radio.CellInfo();
                int i = Build.VERSION.SDK_INT;
                if (i >= 28) {
                    cellInfo.CellConnectionStatus = m48798f(next.getCellConnectionStatus());
                }
                if (next instanceof CellInfoGsm) {
                    m48780b(next, cellInfo, uptimeMillis);
                } else if (next instanceof CellInfoLte) {
                    m48787c(next, cellInfo, uptimeMillis);
                } else if (next instanceof CellInfoWcdma) {
                    m48796e(next, cellInfo, uptimeMillis);
                } else if (next instanceof CellInfoCdma) {
                    m48770a(next, cellInfo, uptimeMillis);
                } else if (i >= 29 && (next instanceof CellInfoNr)) {
                    try {
                        m48792d(next, cellInfo, uptimeMillis);
                    } catch (Throwable th2) {
                        C9632x2.m50510a(th2);
                    }
                }
                arrayList.add(cellInfo);
            }
        }
        return (com.startapp.networkTest.data.radio.CellInfo[]) arrayList.toArray(new com.startapp.networkTest.data.radio.CellInfo[arrayList.size()]);
    }

    /* renamed from: b */
    private void m48780b(CellInfo cellInfo, com.startapp.networkTest.data.radio.CellInfo cellInfo2, long j) {
        CellInfoGsm cellInfoGsm = (CellInfoGsm) cellInfo;
        cellInfo2.IsRegistered = cellInfoGsm.isRegistered();
        cellInfo2.CellNetworkType = CellNetworkTypes.Gsm;
        cellInfo2.CellInfoAge = j - (cellInfoGsm.getTimeStamp() / 1000000);
        CellIdentityGsm cellIdentity = cellInfoGsm.getCellIdentity();
        if (cellIdentity.getMcc() != Integer.MAX_VALUE) {
            cellInfo2.Mcc = cellIdentity.getMcc();
        }
        if (cellIdentity.getMnc() != Integer.MAX_VALUE) {
            cellInfo2.Mnc = cellIdentity.getMnc();
        }
        if (cellIdentity.getCid() != Integer.MAX_VALUE) {
            int cid = cellIdentity.getCid();
            cellInfo2.Cid = cid;
            cellInfo2.CellId = (long) cid;
        }
        if (cellIdentity.getLac() != Integer.MAX_VALUE) {
            cellInfo2.Lac = cellIdentity.getLac();
        }
        if (cellIdentity.getPsc() != Integer.MAX_VALUE) {
            cellInfo2.Psc = cellIdentity.getPsc();
        }
        if (Build.VERSION.SDK_INT >= 24) {
            if (cellIdentity.getArfcn() != Integer.MAX_VALUE) {
                cellInfo2.Arfcn = cellIdentity.getArfcn();
            }
            if (cellIdentity.getBsic() != Integer.MAX_VALUE) {
                cellInfo2.GsmBsic = cellIdentity.getBsic();
            }
        }
        cellInfo2.Dbm = cellInfoGsm.getCellSignalStrength().getDbm();
    }

    /* renamed from: com.startapp.k8$g */
    /* compiled from: Sta */
    public class C9075g {

        /* renamed from: a */
        public int f37112a;

        /* renamed from: b */
        public String f37113b;

        /* renamed from: c */
        public String f37114c;

        /* renamed from: d */
        public String f37115d;

        /* renamed from: e */
        public String f37116e;

        /* renamed from: f */
        public String f37117f;

        /* renamed from: g */
        public int f37118g;

        /* renamed from: h */
        public long f37119h;

        /* renamed from: i */
        public long f37120i;

        /* renamed from: j */
        public String f37121j;

        /* renamed from: k */
        public WifiDetailedStates f37122k;

        private C9075g() {
            this.f37112a = -1;
            this.f37113b = "";
            this.f37114c = "";
            this.f37115d = "";
            this.f37116e = "";
            this.f37117f = "";
            this.f37118g = -1;
            this.f37119h = -1;
            this.f37120i = -1;
            this.f37121j = "";
            this.f37122k = WifiDetailedStates.Unknown;
        }

        public /* synthetic */ C9075g(C9068k8 k8Var, C9069a aVar) {
            this();
        }
    }

    /* renamed from: d */
    private void m48792d(CellInfo cellInfo, com.startapp.networkTest.data.radio.CellInfo cellInfo2, long j) {
        CellInfoNr cellInfoNr = (CellInfoNr) cellInfo;
        cellInfo2.IsRegistered = cellInfoNr.isRegistered();
        cellInfo2.CellNetworkType = CellNetworkTypes.Nr;
        cellInfo2.CellInfoAge = j - (cellInfoNr.getTimeStamp() / 1000000);
        CellIdentity cellIdentity = cellInfoNr.getCellIdentity();
        if (cellIdentity instanceof CellIdentityNr) {
            CellIdentityNr cellIdentityNr = (CellIdentityNr) cellIdentity;
            cellInfo2.Arfcn = cellIdentityNr.getNrarfcn();
            cellInfo2.LtePci = cellIdentityNr.getPci();
            cellInfo2.LteTac = cellIdentityNr.getTac();
            cellInfo2.CellId = cellIdentityNr.getNci();
            if (cellIdentityNr.getMccString() != null) {
                try {
                    cellInfo2.Mcc = Integer.parseInt(cellIdentityNr.getMccString());
                } catch (NumberFormatException e) {
                    C9632x2.m50512b(e);
                }
            }
            if (cellIdentityNr.getMncString() != null) {
                try {
                    cellInfo2.Mnc = Integer.parseInt(cellIdentityNr.getMncString());
                } catch (NumberFormatException e2) {
                    C9632x2.m50512b(e2);
                }
            }
        }
        CellSignalStrength cellSignalStrength = cellInfoNr.getCellSignalStrength();
        if (cellSignalStrength instanceof CellSignalStrengthNr) {
            CellSignalStrengthNr cellSignalStrengthNr = (CellSignalStrengthNr) cellSignalStrength;
            cellInfo2.Dbm = cellSignalStrengthNr.getDbm();
            cellInfo2.NrCsiRsrp = cellSignalStrengthNr.getCsiRsrp();
            cellInfo2.NrCsiRsrq = cellSignalStrengthNr.getCsiRsrq();
            cellInfo2.NrCsiSinr = cellSignalStrengthNr.getCsiSinr();
            cellInfo2.NrSsRsrp = cellSignalStrengthNr.getSsRsrp();
            cellInfo2.NrSsRsrq = cellSignalStrengthNr.getSsRsrq();
            cellInfo2.NrSsSinr = cellSignalStrengthNr.getSsSinr();
        }
    }

    /* renamed from: com.startapp.k8$o */
    /* compiled from: Sta */
    public class C9083o {

        /* renamed from: a */
        public int f37154a;

        /* renamed from: b */
        public int f37155b;

        /* renamed from: c */
        public int f37156c;

        /* renamed from: d */
        public int f37157d;

        /* renamed from: e */
        public int f37158e;

        /* renamed from: f */
        public int f37159f;

        /* renamed from: g */
        public int f37160g;

        /* renamed from: h */
        public int f37161h;

        /* renamed from: i */
        public int f37162i;

        /* renamed from: j */
        public int f37163j;

        /* renamed from: k */
        public long f37164k;

        /* renamed from: l */
        public int f37165l;

        /* renamed from: m */
        public int f37166m;

        /* renamed from: n */
        public int f37167n;

        /* renamed from: o */
        public int f37168o;

        /* renamed from: p */
        public int f37169p;

        /* renamed from: q */
        public int f37170q;

        private C9083o() {
            Integer num = RadioInfo.INVALID;
            this.f37154a = num.intValue();
            this.f37155b = num.intValue();
            this.f37156c = num.intValue();
            this.f37157d = num.intValue();
            this.f37158e = num.intValue();
            this.f37159f = num.intValue();
            this.f37160g = num.intValue();
            this.f37161h = num.intValue();
            this.f37162i = num.intValue();
            this.f37163j = num.intValue();
            this.f37165l = num.intValue();
            this.f37166m = num.intValue();
            this.f37167n = num.intValue();
            this.f37168o = num.intValue();
            this.f37169p = num.intValue();
            this.f37170q = num.intValue();
        }

        public /* synthetic */ C9083o(C9068k8 k8Var, C9069a aVar) {
            this();
        }
    }

    /* renamed from: e */
    public Future<ApnInfo[]> mo29555e() {
        return ThreadManager.m49065b().mo29768a().submit(new C9071c());
    }

    /* renamed from: c */
    private void m48786c(Context context) {
        C9079k kVar;
        if (context != null && (kVar = this.f37087k) != null) {
            try {
                context.unregisterReceiver(kVar);
            } catch (Throwable th) {
                C9632x2.m50510a(th);
            }
        }
    }

    /* renamed from: e */
    private static PreferredNetworkTypes m48795e(int i) {
        switch (i) {
            case 0:
                return PreferredNetworkTypes.WCDMA_PREF;
            case 1:
                return PreferredNetworkTypes.GSM_ONLY;
            case 2:
                return PreferredNetworkTypes.WCDMA_ONLY;
            case 3:
                return PreferredNetworkTypes.GSM_UMTS;
            case 4:
                return PreferredNetworkTypes.CDMA;
            case 5:
                return PreferredNetworkTypes.CDMA_NO_EVDO;
            case 6:
                return PreferredNetworkTypes.EVDO_NO_CDMA;
            case 7:
                return PreferredNetworkTypes.GLOBAL;
            case 8:
                return PreferredNetworkTypes.LTE_CDMA_EVDO;
            case 9:
                return PreferredNetworkTypes.LTE_GSM_WCDMA;
            case 10:
                return PreferredNetworkTypes.LTE_CDMA_EVDO_GSM_WCDMA;
            case 11:
                return PreferredNetworkTypes.LTE_ONLY;
            case 12:
                return PreferredNetworkTypes.LTE_WCDMA;
            case 13:
                return PreferredNetworkTypes.TDSCDMA_ONLY;
            case 14:
                return PreferredNetworkTypes.TDSCDMA_WCDMA;
            case 15:
                return PreferredNetworkTypes.LTE_TDSCDMA;
            case 16:
                return PreferredNetworkTypes.TDSCDMA_GSM;
            case 17:
                return PreferredNetworkTypes.LTE_TDSCDMA_GSM;
            case 18:
                return PreferredNetworkTypes.TDSCDMA_GSM_WCDMA;
            case 19:
                return PreferredNetworkTypes.LTE_TDSCDMA_WCDMA;
            case 20:
                return PreferredNetworkTypes.LTE_TDSCDMA_GSM_WCDMA;
            case 21:
                return PreferredNetworkTypes.TDSCDMA_CDMA_EVDO_GSM_WCDMA;
            case 22:
                return PreferredNetworkTypes.LTE_TDSCDMA_CDMA_EVDO_GSM_WCDMA;
            case 23:
                return PreferredNetworkTypes.NR_ONLY;
            case 24:
                return PreferredNetworkTypes.NR_LTE;
            case 25:
                return PreferredNetworkTypes.NR_LTE_CDMA_EVDO;
            case 26:
                return PreferredNetworkTypes.NR_LTE_GSM_WCDMA;
            case 27:
                return PreferredNetworkTypes.NR_LTE_CDMA_EVDO_GSM_WCDMA;
            case 28:
                return PreferredNetworkTypes.NR_LTE_WCDMA;
            case 29:
                return PreferredNetworkTypes.NR_LTE_TDSCDMA;
            case 30:
                return PreferredNetworkTypes.NR_LTE_TDSCDMA_GSM;
            case 31:
                return PreferredNetworkTypes.NR_LTE_TDSCDMA_WCDMA;
            case 32:
                return PreferredNetworkTypes.NR_LTE_TDSCDMA_GSM_WCDMA;
            case 33:
                return PreferredNetworkTypes.NR_LTE_TDSCDMA_CDMA_EVDO_GSM_WCDMA;
            default:
                return PreferredNetworkTypes.Unknown;
        }
    }

    /* renamed from: c */
    public com.startapp.networkTest.data.radio.CellInfo[] mo29552c() {
        return mo29547a(true);
    }

    /* renamed from: c */
    private void m48787c(CellInfo cellInfo, com.startapp.networkTest.data.radio.CellInfo cellInfo2, long j) {
        CellInfoLte cellInfoLte = (CellInfoLte) cellInfo;
        cellInfo2.IsRegistered = cellInfoLte.isRegistered();
        cellInfo2.CellNetworkType = CellNetworkTypes.Lte;
        cellInfo2.CellInfoAge = j - (cellInfoLte.getTimeStamp() / 1000000);
        CellIdentityLte cellIdentity = cellInfoLte.getCellIdentity();
        if (cellIdentity.getMcc() != Integer.MAX_VALUE) {
            cellInfo2.Mcc = cellIdentity.getMcc();
        }
        if (cellIdentity.getMnc() != Integer.MAX_VALUE) {
            cellInfo2.Mnc = cellIdentity.getMnc();
        }
        if (cellIdentity.getCi() != Integer.MAX_VALUE) {
            int ci = cellIdentity.getCi();
            cellInfo2.Cid = ci;
            cellInfo2.CellId = (long) ci;
        }
        if (cellIdentity.getPci() != Integer.MAX_VALUE) {
            cellInfo2.LtePci = cellIdentity.getPci();
        }
        if (cellIdentity.getTac() != Integer.MAX_VALUE) {
            cellInfo2.LteTac = cellIdentity.getTac();
        }
        int i = Build.VERSION.SDK_INT;
        if (i >= 24 && cellIdentity.getEarfcn() != Integer.MAX_VALUE) {
            int earfcn = cellIdentity.getEarfcn();
            cellInfo2.Arfcn = earfcn;
            C8927e6 a = LteFrequencyUtil.m49071a(earfcn);
            if (a != null) {
                cellInfo2.LteBand = a.band;
                cellInfo2.LteUploadEarfcn = a.upload_earfcn;
                cellInfo2.LteDownloadEarfcn = a.download_earfcn;
                cellInfo2.LteUploadFrequency = a.upload_frequency;
                cellInfo2.LteDonwloadFrequency = a.download_frequency;
            }
        }
        CellSignalStrengthLte cellSignalStrength = cellInfoLte.getCellSignalStrength();
        cellInfo2.Dbm = cellSignalStrength.getDbm();
        if (cellSignalStrength.getTimingAdvance() != Integer.MAX_VALUE) {
            cellInfo2.LteTimingAdvance = cellSignalStrength.getTimingAdvance();
        }
        if (i >= 29) {
            int cqi = cellSignalStrength.getCqi();
            if (cqi != Integer.MAX_VALUE) {
                cellInfo2.LteCqi = cqi;
            }
            cellInfo2.LteRssnr = cellSignalStrength.getRssnr();
            cellInfo2.LteRsrq = cellSignalStrength.getRsrq();
            cellInfo2.LteRssi = cellSignalStrength.getRssi();
            return;
        }
        Field field = this.f37065G;
        if (field != null) {
            try {
                int i2 = field.getInt(cellSignalStrength);
                if (i2 != Integer.MAX_VALUE) {
                    cellInfo2.LteCqi = i2;
                }
            } catch (Throwable th) {
                C9632x2.m50510a(th);
            }
        }
        Field field2 = this.f37063E;
        if (field2 != null) {
            try {
                cellInfo2.LteRsrq = field2.getInt(cellSignalStrength);
            } catch (Throwable th2) {
                C9632x2.m50510a(th2);
            }
        }
        Field field3 = this.f37064F;
        if (field3 != null) {
            try {
                cellInfo2.LteRssnr = field3.getInt(cellSignalStrength);
            } catch (Throwable th3) {
                C9632x2.m50510a(th3);
            }
        }
        Field field4 = this.f37062D;
        if (field4 != null) {
            try {
                cellInfo2.LteRssi = field4.getInt(cellSignalStrength);
            } catch (Throwable th4) {
                C9632x2.m50510a(th4);
            }
        }
    }

    /* renamed from: b */
    public static NetworkGenerations m48778b(NetworkTypes networkTypes) {
        switch (C9074f.f37110a[networkTypes.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                return NetworkGenerations.Gen2;
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
                return NetworkGenerations.Gen3;
            case 17:
            case 18:
                return NetworkGenerations.Gen4;
            case 19:
                return NetworkGenerations.Gen5;
            default:
                return NetworkGenerations.Unknown;
        }
    }

    /* renamed from: a */
    private void m48770a(CellInfo cellInfo, com.startapp.networkTest.data.radio.CellInfo cellInfo2, long j) {
        CellInfoCdma cellInfoCdma = (CellInfoCdma) cellInfo;
        cellInfo2.IsRegistered = cellInfoCdma.isRegistered();
        cellInfo2.CellNetworkType = CellNetworkTypes.Gsm;
        cellInfo2.CellInfoAge = j - (cellInfoCdma.getTimeStamp() / 1000000);
        CellIdentityCdma cellIdentity = cellInfoCdma.getCellIdentity();
        cellInfo2.CdmaBaseStationLatitude = cellIdentity.getLatitude();
        cellInfo2.CdmaBaseStationLongitude = cellIdentity.getLongitude();
        if (cellIdentity.getSystemId() != Integer.MAX_VALUE) {
            cellInfo2.CdmaSystemId = cellIdentity.getSystemId();
        }
        if (cellIdentity.getNetworkId() != Integer.MAX_VALUE) {
            cellInfo2.CdmaNetworkId = cellIdentity.getNetworkId();
        }
        if (cellIdentity.getBasestationId() != Integer.MAX_VALUE) {
            cellInfo2.CdmaBaseStationId = cellIdentity.getBasestationId();
        }
        CellSignalStrengthCdma cellSignalStrength = cellInfoCdma.getCellSignalStrength();
        cellInfo2.Dbm = cellSignalStrength.getDbm();
        cellInfo2.CdmaDbm = cellSignalStrength.getCdmaDbm();
        cellInfo2.CdmaEcio = cellSignalStrength.getCdmaEcio();
        cellInfo2.EvdoDbm = cellSignalStrength.getEvdoDbm();
        cellInfo2.EvdoEcio = cellSignalStrength.getEvdoEcio();
        cellInfo2.EvdoSnr = cellSignalStrength.getEvdoSnr();
    }

    /* renamed from: b */
    public void mo29550b(C9115l8 l8Var) {
        if (l8Var == null) {
            return;
        }
        if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
            this.f37075Q.remove(l8Var);
        } else {
            this.f37077a.post(new C9006h9(new C9073e(l8Var)));
        }
    }

    /* renamed from: d */
    public ConnectionTypes mo29553d() {
        NetworkInfo activeNetworkInfo;
        ConnectionTypes connectionTypes = ConnectionTypes.Unknown;
        if (this.f37083g == null || this.f37080d.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") != 0 || (activeNetworkInfo = this.f37083g.getActiveNetworkInfo()) == null) {
            return connectionTypes;
        }
        int type = activeNetworkInfo.getType();
        if (type == 0) {
            return ConnectionTypes.Mobile;
        }
        if (type == 1) {
            return ConnectionTypes.WiFi;
        }
        if (type == 6) {
            return ConnectionTypes.WiMAX;
        }
        if (type == 7) {
            return ConnectionTypes.Bluetooth;
        }
        if (type != 9) {
            return connectionTypes;
        }
        return ConnectionTypes.Ethernet;
    }

    /* renamed from: b */
    public C9678z6 mo29549b() {
        return this.f37086j;
    }

    /* renamed from: b */
    public NetworkTypes mo29548b(NetworkRegistrationInfo[] networkRegistrationInfoArr) {
        if (networkRegistrationInfoArr != null) {
            for (NetworkRegistrationInfo networkRegistrationInfo : networkRegistrationInfoArr) {
                if (networkRegistrationInfo.Domain.equals("PS")) {
                    return m48766a(networkRegistrationInfo.NetworkTechnology);
                }
            }
        }
        return NetworkTypes.Unknown;
    }

    /* renamed from: d */
    public static NetworkTypes m48790d(int i) {
        switch (i) {
            case 1:
                return NetworkTypes.GPRS;
            case 2:
                return NetworkTypes.EDGE;
            case 3:
                return NetworkTypes.UMTS;
            case 4:
                return NetworkTypes.CDMA;
            case 5:
                return NetworkTypes.EVDO_0;
            case 6:
                return NetworkTypes.EVDO_A;
            case 7:
                return NetworkTypes.Cdma1xRTT;
            case 8:
                return NetworkTypes.HSDPA;
            case 9:
                return NetworkTypes.HSUPA;
            case 10:
                return NetworkTypes.HSPA;
            case 11:
                return NetworkTypes.IDEN;
            case 12:
                return NetworkTypes.EVDO_B;
            case 13:
                return NetworkTypes.LTE;
            case 14:
                return NetworkTypes.EHRPD;
            case 15:
                return NetworkTypes.HSPAP;
            case 16:
                return NetworkTypes.GSM;
            case 17:
                return NetworkTypes.TD_SCDMA;
            case 18:
                return NetworkTypes.WiFi;
            case 19:
                return NetworkTypes.LTE_CA;
            case 20:
                return NetworkTypes.NR;
            default:
                return NetworkTypes.Unknown;
        }
    }

    /* renamed from: a */
    public ApnInfo[] mo29546a() {
        C9081m c;
        ArrayList arrayList = new ArrayList();
        for (C9075g next : m48812q()) {
            ApnInfo apnInfo = new ApnInfo();
            apnInfo.Apn = next.f37113b;
            apnInfo.TxBytes = next.f37119h;
            apnInfo.RxBytes = next.f37120i;
            apnInfo.ApnTypes = next.f37115d;
            apnInfo.Capabilities = next.f37116e;
            apnInfo.SubscriptionId = next.f37118g;
            apnInfo.PcscfAddresses = next.f37117f;
            apnInfo.MobileDataConnectionState = next.f37122k;
            apnInfo.NetworkType = m48790d(next.f37112a);
            apnInfo.Reason = this.f37084h.mo29586a(next.f37118g, next.f37115d);
            if (apnInfo.ApnTypes.contains("ims") && (c = this.f37084h.mo29595c(next.f37118g)) != null) {
                apnInfo.SamsungSipError = c.f37144a;
                apnInfo.SamsungImsServices = c.f37145b;
            }
            arrayList.add(apnInfo);
        }
        return (ApnInfo[]) arrayList.toArray(new ApnInfo[arrayList.size()]);
    }

    /* renamed from: d */
    public ThreeStateShort mo29554d(NetworkRegistrationInfo[] networkRegistrationInfoArr) {
        if (networkRegistrationInfoArr != null) {
            for (NetworkRegistrationInfo networkRegistrationInfo : networkRegistrationInfoArr) {
                if (networkRegistrationInfo.Domain.equals("PS") && networkRegistrationInfo.TransportType.equals("WWAN")) {
                    return networkRegistrationInfo.NrAvailable;
                }
            }
        }
        return ThreeStateShort.Unknown;
    }

    /* renamed from: c */
    public String mo29551c(NetworkRegistrationInfo[] networkRegistrationInfoArr) {
        if (networkRegistrationInfoArr == null) {
            return "Unknown";
        }
        for (NetworkRegistrationInfo networkRegistrationInfo : networkRegistrationInfoArr) {
            if (networkRegistrationInfo.Domain.equals("PS") && networkRegistrationInfo.TransportType.equals("WWAN")) {
                return networkRegistrationInfo.NrState;
            }
        }
        return "Unknown";
    }

    /* renamed from: a */
    private boolean m48774a(com.startapp.networkTest.data.radio.CellInfo cellInfo, RadioInfo radioInfo) {
        try {
            if (radioInfo.MCC.isEmpty() || radioInfo.MNC.isEmpty() || !cellInfo.IsRegistered || cellInfo.Mcc != Integer.parseInt(radioInfo.MCC) || cellInfo.Mnc != Integer.parseInt(radioInfo.MNC)) {
                return false;
            }
            NetworkTypes i = mo29562i(radioInfo.SubscriptionId);
            NetworkTypes networkTypes = NetworkTypes.Unknown;
            if (i == networkTypes) {
                i = radioInfo.NetworkType;
            }
            if (i == networkTypes || cellInfo.CellNetworkType == m48765a(i)) {
                return true;
            }
            return false;
        } catch (NumberFormatException e) {
            C9632x2.m50512b(e);
            return false;
        }
    }

    /* renamed from: a */
    public static NetworkTypes m48766a(String str) {
        str.getClass();
        char c = 65535;
        switch (str.hashCode()) {
            case -2039427040:
                if (str.equals("LTE_CA")) {
                    c = 0;
                    break;
                }
                break;
            case -908593671:
                if (str.equals("TD_SCDMA")) {
                    c = 1;
                    break;
                }
                break;
            case 2500:
                if (str.equals("NR")) {
                    c = 2;
                    break;
                }
                break;
            case 70881:
                if (str.equals("GSM")) {
                    c = 3;
                    break;
                }
                break;
            case 75709:
                if (str.equals("LTE")) {
                    c = 4;
                    break;
                }
                break;
            case 2063797:
                if (str.equals("CDMA")) {
                    c = 5;
                    break;
                }
                break;
            case 2123197:
                if (str.equals("EDGE")) {
                    c = 6;
                    break;
                }
                break;
            case 2194666:
                if (str.equals("GPRS")) {
                    c = 7;
                    break;
                }
                break;
            case 2227260:
                if (str.equals("HSPA")) {
                    c = 8;
                    break;
                }
                break;
            case 2608919:
                if (str.equals("UMTS")) {
                    c = 9;
                    break;
                }
                break;
            case 3195620:
                if (str.equals("iDEN")) {
                    c = 10;
                    break;
                }
                break;
            case 69034058:
                if (str.equals("HSDPA")) {
                    c = 11;
                    break;
                }
                break;
            case 69045140:
                if (str.equals("HSPAP")) {
                    c = 12;
                    break;
                }
                break;
            case 69050395:
                if (str.equals("HSUPA")) {
                    c = 13;
                    break;
                }
                break;
            case 70083979:
                if (str.equals("IWLAN")) {
                    c = 14;
                    break;
                }
                break;
            case 836263277:
                if (str.equals("CDMA - 1xRTT")) {
                    c = 15;
                    break;
                }
                break;
            case 882856261:
                if (str.equals("CDMA - eHRPD")) {
                    c = 16;
                    break;
                }
                break;
            case 893165057:
                if (str.equals("CDMA - EvDo rev. 0")) {
                    c = 17;
                    break;
                }
                break;
            case 893165074:
                if (str.equals("CDMA - EvDo rev. A")) {
                    c = 18;
                    break;
                }
                break;
            case 893165075:
                if (str.equals("CDMA - EvDo rev. B")) {
                    c = 19;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return NetworkTypes.LTE_CA;
            case 1:
                return NetworkTypes.TD_SCDMA;
            case 2:
                return NetworkTypes.NR;
            case 3:
                return NetworkTypes.GSM;
            case 4:
                return NetworkTypes.LTE;
            case 5:
                return NetworkTypes.CDMA;
            case 6:
                return NetworkTypes.EDGE;
            case 7:
                return NetworkTypes.GPRS;
            case 8:
                return NetworkTypes.HSPA;
            case 9:
                return NetworkTypes.UMTS;
            case 10:
                return NetworkTypes.IDEN;
            case 11:
                return NetworkTypes.HSDPA;
            case 12:
                return NetworkTypes.HSPAP;
            case 13:
                return NetworkTypes.HSUPA;
            case 14:
                return NetworkTypes.WiFi;
            case 15:
                return NetworkTypes.Cdma1xRTT;
            case 16:
                return NetworkTypes.EHRPD;
            case 17:
                return NetworkTypes.EVDO_0;
            case 18:
                return NetworkTypes.EVDO_A;
            case 19:
                return NetworkTypes.EVDO_B;
            default:
                return NetworkTypes.Unknown;
        }
    }

    /* renamed from: a */
    private static CellNetworkTypes m48765a(NetworkTypes networkTypes) {
        if (networkTypes == NetworkTypes.CDMA) {
            return CellNetworkTypes.Cdma;
        }
        int i = C9074f.f37111b[m48778b(networkTypes).ordinal()];
        if (i == 1) {
            return CellNetworkTypes.Gsm;
        }
        if (i == 2) {
            return CellNetworkTypes.Wcdma;
        }
        if (i == 3) {
            return CellNetworkTypes.Lte;
        }
        if (i != 4) {
            return CellNetworkTypes.Unknown;
        }
        return CellNetworkTypes.Nr;
    }

    /* renamed from: a */
    public static SignalStrengths m48768a(RadioInfo radioInfo) {
        int i;
        if (radioInfo == null) {
            return SignalStrengths.Unknown;
        }
        int i2 = radioInfo.RXLevel;
        NetworkGenerations b = m48778b(radioInfo.NetworkType);
        NetworkGenerations networkGenerations = NetworkGenerations.Gen5;
        if (b == networkGenerations && (i = radioInfo.NrCsiRsrp) < -1) {
            i2 = i;
        }
        if (i2 == 0) {
            return SignalStrengths.Unknown;
        }
        C9655y4 b2 = C8821a5.m48254b();
        int[] STATSMANAGER_SIGNAL_STRENGTH_MAPPING_2G = b2.STATSMANAGER_SIGNAL_STRENGTH_MAPPING_2G();
        int[] STATSMANAGER_SIGNAL_STRENGTH_MAPPING_3G = b2.STATSMANAGER_SIGNAL_STRENGTH_MAPPING_3G();
        int[] STATSMANAGER_SIGNAL_STRENGTH_MAPPING_4G = b2.STATSMANAGER_SIGNAL_STRENGTH_MAPPING_4G();
        int[] STATSMANAGER_SIGNAL_STRENGTH_MAPPING_5G = b2.STATSMANAGER_SIGNAL_STRENGTH_MAPPING_5G();
        if (b == NetworkGenerations.Gen2) {
            if (i2 >= STATSMANAGER_SIGNAL_STRENGTH_MAPPING_2G[0]) {
                return SignalStrengths.Excellent;
            }
            if (i2 >= STATSMANAGER_SIGNAL_STRENGTH_MAPPING_2G[1]) {
                return SignalStrengths.Good;
            }
            if (i2 >= STATSMANAGER_SIGNAL_STRENGTH_MAPPING_2G[2]) {
                return SignalStrengths.Fair;
            }
            if (i2 >= STATSMANAGER_SIGNAL_STRENGTH_MAPPING_2G[3]) {
                return SignalStrengths.Poor;
            }
            return SignalStrengths.Bad;
        } else if (b == NetworkGenerations.Gen3) {
            if (i2 >= STATSMANAGER_SIGNAL_STRENGTH_MAPPING_3G[0]) {
                return SignalStrengths.Excellent;
            }
            if (i2 >= STATSMANAGER_SIGNAL_STRENGTH_MAPPING_3G[1]) {
                return SignalStrengths.Good;
            }
            if (i2 >= STATSMANAGER_SIGNAL_STRENGTH_MAPPING_3G[2]) {
                return SignalStrengths.Fair;
            }
            if (i2 >= STATSMANAGER_SIGNAL_STRENGTH_MAPPING_3G[3]) {
                return SignalStrengths.Poor;
            }
            return SignalStrengths.Bad;
        } else if (b == NetworkGenerations.Gen4) {
            if (i2 >= STATSMANAGER_SIGNAL_STRENGTH_MAPPING_4G[0]) {
                return SignalStrengths.Excellent;
            }
            if (i2 >= STATSMANAGER_SIGNAL_STRENGTH_MAPPING_4G[1]) {
                return SignalStrengths.Good;
            }
            if (i2 >= STATSMANAGER_SIGNAL_STRENGTH_MAPPING_4G[2]) {
                return SignalStrengths.Fair;
            }
            if (i2 >= STATSMANAGER_SIGNAL_STRENGTH_MAPPING_4G[3]) {
                return SignalStrengths.Poor;
            }
            return SignalStrengths.Bad;
        } else if (b != networkGenerations) {
            return SignalStrengths.Unknown;
        } else {
            if (i2 >= STATSMANAGER_SIGNAL_STRENGTH_MAPPING_5G[0]) {
                return SignalStrengths.Excellent;
            }
            if (i2 >= STATSMANAGER_SIGNAL_STRENGTH_MAPPING_5G[1]) {
                return SignalStrengths.Good;
            }
            if (i2 >= STATSMANAGER_SIGNAL_STRENGTH_MAPPING_5G[2]) {
                return SignalStrengths.Fair;
            }
            if (i2 >= STATSMANAGER_SIGNAL_STRENGTH_MAPPING_5G[3]) {
                return SignalStrengths.Poor;
            }
            return SignalStrengths.Bad;
        }
    }

    /* renamed from: g */
    public NetworkRegistrationInfo[] mo29558g(int i) {
        NetworkRegistrationInfo[] b = this.f37084h.mo29594b(i);
        if (b == null) {
            return new NetworkRegistrationInfo[0];
        }
        C9082n d = this.f37084h.mo29596d(i);
        for (NetworkRegistrationInfo networkRegistrationInfo : b) {
            if (d != null && d.f37148b > 0) {
                long elapsedRealtime = SystemClock.elapsedRealtime() - d.f37148b;
                networkRegistrationInfo.Age = elapsedRealtime > 2147483647L ? Integer.MAX_VALUE : (int) elapsedRealtime;
            }
        }
        return b;
    }

    /* renamed from: a */
    private PreferredNetworkTypes m48767a(Context context, int i) {
        PreferredNetworkTypes preferredNetworkTypes = PreferredNetworkTypes.Unknown;
        if (Build.VERSION.SDK_INT < 17) {
            return preferredNetworkTypes;
        }
        try {
            ContentResolver contentResolver = context.getContentResolver();
            return m48795e(Settings.Global.getInt(contentResolver, "preferred_network_mode" + i));
        } catch (Throwable th) {
            C9632x2.m50510a(th);
            return preferredNetworkTypes;
        }
    }

    /* renamed from: a */
    private SparseArray<PreferredNetworkTypes> m48764a(Context context) {
        SparseArray<PreferredNetworkTypes> sparseArray = new SparseArray<>();
        if (Build.VERSION.SDK_INT >= 17) {
            try {
                String[] split = Settings.Global.getString(context.getContentResolver(), "preferred_network_mode").split(",");
                for (int i = 0; i < split.length; i++) {
                    sparseArray.put(i, m48795e(Integer.valueOf(split[i]).intValue()));
                }
            } catch (Throwable th) {
                C9632x2.m50510a(th);
            }
        }
        return sparseArray;
    }

    /* renamed from: a */
    public void mo29545a(C9115l8 l8Var) {
        if (l8Var == null) {
            return;
        }
        if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
            this.f37077a.post(new C9006h9(new C9072d(l8Var)));
        } else if (!this.f37075Q.contains(l8Var)) {
            this.f37075Q.add(l8Var);
        }
    }

    /* renamed from: a */
    public ThreeStateShort mo29544a(NetworkRegistrationInfo[] networkRegistrationInfoArr) {
        if (networkRegistrationInfoArr != null) {
            for (NetworkRegistrationInfo networkRegistrationInfo : networkRegistrationInfoArr) {
                if (networkRegistrationInfo.Domain.equals("PS")) {
                    return networkRegistrationInfo.CarrierAggregation;
                }
            }
        }
        return ThreeStateShort.Unknown;
    }
}
