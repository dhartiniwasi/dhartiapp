package com.startapp;

import android.content.Context;
import android.os.AsyncTask;
import android.os.Build;
import android.telephony.TelephonyManager;
import com.startapp.networkTest.controller.LocationController;
import com.startapp.networkTest.data.RadioInfo;
import com.startapp.networkTest.enums.LtrCriteriaTypes;
import com.startapp.networkTest.results.LatencyResult;
import com.startapp.networkTest.results.P3TestResult;
import com.startapp.networkTest.results.speedtest.MeasurementPointLatency;
import com.startapp.networkTest.speedtest.SpeedtestEngineError;
import com.startapp.networkTest.speedtest.SpeedtestEngineStatus;
import com.startapp.networkTest.threads.ThreadManager;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.Set;

/* renamed from: com.startapp.l0 */
/* compiled from: Sta */
public class C9102l0 {

    /* renamed from: s */
    public static final String f37234s = "l0";

    /* renamed from: t */
    private static final boolean f37235t = false;
    /* access modifiers changed from: private */

    /* renamed from: a */
    public C8925e4 f37236a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public Context f37237b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public C9068k8 f37238c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public C9157nd f37239d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public LocationController f37240e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public C8840b1 f37241f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public P3TestResult f37242g;

    /* renamed from: h */
    private ArrayList<C9048j8> f37243h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public String f37244i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public C8844b5 f37245j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public String f37246k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public String f37247l = "";

    /* renamed from: m */
    private String f37248m = "";

    /* renamed from: n */
    private String f37249n = "";

    /* renamed from: o */
    private String f37250o = "";

    /* renamed from: p */
    private String f37251p = "";

    /* renamed from: q */
    private String f37252q = "";
    /* access modifiers changed from: private */

    /* renamed from: r */
    public String f37253r = "";

    /* renamed from: com.startapp.l0$a */
    /* compiled from: Sta */
    public static /* synthetic */ class C9103a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f37254a;

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
                com.startapp.networkTest.enums.LtrCriteriaTypes[] r0 = com.startapp.networkTest.enums.LtrCriteriaTypes.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f37254a = r0
                com.startapp.networkTest.enums.LtrCriteriaTypes r1 = com.startapp.networkTest.enums.LtrCriteriaTypes.CTItem     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f37254a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.startapp.networkTest.enums.LtrCriteriaTypes r1 = com.startapp.networkTest.enums.LtrCriteriaTypes.NoChange     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f37254a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.startapp.networkTest.enums.LtrCriteriaTypes r1 = com.startapp.networkTest.enums.LtrCriteriaTypes.Random     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f37254a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.startapp.networkTest.enums.LtrCriteriaTypes r1 = com.startapp.networkTest.enums.LtrCriteriaTypes.FullSuccessful     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f37254a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.startapp.networkTest.enums.LtrCriteriaTypes r1 = com.startapp.networkTest.enums.LtrCriteriaTypes.TotalTests     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.startapp.C9102l0.C9103a.<clinit>():void");
        }
    }

    public C9102l0(C8925e4 e4Var, Context context) {
        if (e4Var != null) {
            this.f37236a = e4Var;
            this.f37237b = context;
            C9655y4 b = C8821a5.m48254b();
            this.f37244i = b.PROJECT_ID();
            this.f37245j = new C8844b5(this.f37237b);
            m48899a(context, b);
            return;
        }
        throw new IllegalArgumentException("ISpeedtestListener is NULL");
    }

    /* renamed from: com.startapp.l0$b */
    /* compiled from: Sta */
    public class C9104b extends AsyncTask<Void, Void, LatencyResult> {

        /* renamed from: a */
        private String f37255a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public int f37256b;

        /* renamed from: c */
        private int f37257c;

        /* renamed from: d */
        private int f37258d;

        /* renamed from: e */
        private int f37259e;

        /* renamed from: f */
        private String[] f37260f;

        /* renamed from: g */
        private LtrCriteriaTypes f37261g;

        /* renamed from: h */
        private boolean f37262h;

        /* renamed from: com.startapp.l0$b$a */
        /* compiled from: Sta */
        public class C9105a implements C8951f8 {

            /* renamed from: a */
            public final /* synthetic */ boolean[] f37264a;

            /* renamed from: b */
            public final /* synthetic */ int[] f37265b;

            /* renamed from: c */
            public final /* synthetic */ ArrayList f37266c;

            /* renamed from: d */
            public final /* synthetic */ C9669z f37267d;

            public C9105a(boolean[] zArr, int[] iArr, ArrayList arrayList, C9669z zVar) {
                this.f37264a = zArr;
                this.f37265b = iArr;
                this.f37266c = arrayList;
                this.f37267d = zVar;
            }

            /* renamed from: a */
            public void mo29364a(int i, long j, long j2) {
                int i2 = 0;
                int i3 = (j2 > 0 ? 1 : (j2 == 0 ? 0 : -1));
                if (i3 >= 0) {
                    this.f37264a[0] = true;
                    int[] iArr = this.f37265b;
                    iArr[0] = iArr[0] + 1;
                }
                int i4 = (int) j2;
                this.f37266c.add(C9104b.this.m48924a(j, i4));
                if (C9102l0.this.f37236a != null) {
                    C8925e4 a = C9102l0.this.f37236a;
                    float a2 = ((float) i) / ((float) C9104b.this.f37256b);
                    if (i3 >= 0) {
                        i2 = i4;
                    }
                    a.mo29295b(a2, i2);
                }
                if (C9104b.this.isCancelled()) {
                    this.f37267d.mo31501b();
                }
            }
        }

        /* renamed from: com.startapp.l0$b$b */
        /* compiled from: Sta */
        public class C9106b implements Comparator<C8949f6> {
            public C9106b() {
            }

            /* renamed from: a */
            public int compare(C8949f6 f6Var, C8949f6 f6Var2) {
                return f6Var.successfulTests - f6Var2.successfulTests;
            }
        }

        /* renamed from: com.startapp.l0$b$c */
        /* compiled from: Sta */
        public class C9107c implements Comparator<C8949f6> {
            public C9107c() {
            }

            /* renamed from: a */
            public int compare(C8949f6 f6Var, C8949f6 f6Var2) {
                return f6Var.totalTests - f6Var2.totalTests;
            }
        }

        public C9104b(String str, int i, int i2, int i3, int i4, boolean z) {
            this.f37255a = str;
            this.f37256b = i;
            this.f37257c = i2;
            this.f37258d = i3;
            this.f37259e = i4;
            this.f37262h = z;
            if (i2 < 200) {
                this.f37257c = 200;
            }
            if (C9102l0.this.f37236a != null) {
                C9102l0.this.f37236a.mo29294a(SpeedtestEngineStatus.CONNECT, SpeedtestEngineError.OK, (long) (this.f37256b * this.f37258d));
            }
            C8844b5 c = C8821a5.m48255c();
            this.f37260f = c.mo29187k();
            this.f37261g = LtrCriteriaTypes.valueOf(c.mo29182j());
        }

        /* JADX WARNING: Code restructure failed: missing block: B:131:0x02b7, code lost:
            if (r1 == 7) goto L_0x02b9;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:177:0x0373, code lost:
            if (r1 == null) goto L_0x037c;
         */
        /* JADX WARNING: Removed duplicated region for block: B:130:0x02b6 A[Catch:{ all -> 0x02f5, all -> 0x0317 }] */
        /* JADX WARNING: Removed duplicated region for block: B:134:0x02dc A[Catch:{ all -> 0x02f5, all -> 0x0317 }] */
        /* JADX WARNING: Removed duplicated region for block: B:142:0x02f2 A[Catch:{ all -> 0x02f5, all -> 0x0317 }] */
        /* JADX WARNING: Removed duplicated region for block: B:173:0x036a A[SYNTHETIC, Splitter:B:173:0x036a] */
        /* JADX WARNING: Removed duplicated region for block: B:180:0x037e  */
        /* JADX WARNING: Removed duplicated region for block: B:181:0x03b2  */
        /* JADX WARNING: Removed duplicated region for block: B:184:0x03ce  */
        /* JADX WARNING: Removed duplicated region for block: B:187:0x0445  */
        /* JADX WARNING: Removed duplicated region for block: B:188:0x044c  */
        /* JADX WARNING: Removed duplicated region for block: B:192:0x0474 A[LOOP:0: B:8:0x0028->B:192:0x0474, LOOP_END] */
        /* JADX WARNING: Removed duplicated region for block: B:213:0x046d A[SYNTHETIC] */
        /* JADX WARNING: Removed duplicated region for block: B:24:0x0151 A[SYNTHETIC, Splitter:B:24:0x0151] */
        /* JADX WARNING: Removed duplicated region for block: B:58:0x01df  */
        /* JADX WARNING: Removed duplicated region for block: B:67:0x021b A[ADDED_TO_REGION, Catch:{ all -> 0x033c }] */
        /* JADX WARNING: Removed duplicated region for block: B:76:0x022e A[SYNTHETIC, Splitter:B:76:0x022e] */
        /* JADX WARNING: Removed duplicated region for block: B:96:0x025c A[Catch:{ all -> 0x0249, all -> 0x0319 }] */
        /* JADX WARNING: Removed duplicated region for block: B:98:0x0264 A[Catch:{ all -> 0x0249, all -> 0x0319 }] */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public com.startapp.networkTest.results.LatencyResult doInBackground(java.lang.Void... r31) {
            /*
                r30 = this;
                r7 = r30
                java.lang.String r8 = "ping6"
                boolean r0 = r30.isCancelled()
                r9 = 0
                if (r0 == 0) goto L_0x000c
                return r9
            L_0x000c:
                boolean r0 = r7.f37262h
                if (r0 == 0) goto L_0x001b
                java.lang.String[] r0 = r7.f37260f
                com.startapp.networkTest.enums.LtrCriteriaTypes r1 = r7.f37261g
                java.lang.String r2 = r7.f37255a
                java.util.List r0 = r7.m48926a((java.lang.String[]) r0, (com.startapp.networkTest.enums.LtrCriteriaTypes) r1, (java.lang.String) r2)
                goto L_0x0025
            L_0x001b:
                java.lang.String[] r0 = r7.f37260f
                com.startapp.networkTest.enums.LtrCriteriaTypes r1 = com.startapp.networkTest.enums.LtrCriteriaTypes.CTItem
                java.lang.String r2 = r7.f37255a
                java.util.List r0 = r7.m48926a((java.lang.String[]) r0, (com.startapp.networkTest.enums.LtrCriteriaTypes) r1, (java.lang.String) r2)
            L_0x0025:
                r10 = r0
                r0 = r9
                r12 = 0
            L_0x0028:
                int r1 = r10.size()
                if (r12 >= r1) goto L_0x0491
                long r13 = android.os.SystemClock.elapsedRealtime()
                long r15 = android.os.SystemClock.uptimeMillis()
                java.lang.Object r0 = r10.get(r12)
                r6 = r0
                com.startapp.f6 r6 = (com.startapp.C8949f6) r6
                int r0 = r6.totalTests
                r5 = 1
                int r0 = r0 + r5
                r6.totalTests = r0
                java.lang.String r0 = r6.address
                r7.f37255a = r0
                java.util.ArrayList r4 = new java.util.ArrayList
                r4.<init>()
                com.startapp.networkTest.results.LatencyResult r3 = new com.startapp.networkTest.results.LatencyResult
                com.startapp.l0 r0 = com.startapp.C9102l0.this
                java.lang.String r0 = r0.f37244i
                com.startapp.l0 r1 = com.startapp.C9102l0.this
                com.startapp.b5 r1 = r1.f37245j
                java.lang.String r1 = r1.mo29198p()
                r3.<init>(r0, r1)
                com.startapp.l0 r0 = com.startapp.C9102l0.this
                com.startapp.b1 r0 = r0.f37241f
                com.startapp.networkTest.data.BatteryInfo r0 = r0.mo29127a()
                r3.BatteryInfoOnStart = r0
                com.startapp.l0 r0 = com.startapp.C9102l0.this
                com.startapp.networkTest.controller.LocationController r0 = r0.f37240e
                com.startapp.networkTest.data.LocationInfo r0 = r0.mo29724c()
                r3.LocationInfoOnStart = r0
                com.startapp.l0 r0 = com.startapp.C9102l0.this
                android.content.Context r0 = r0.f37237b
                com.startapp.networkTest.enums.ScreenStates r0 = com.startapp.C9208p2.m49129h(r0)
                r3.ScreenStateOnStart = r0
                com.startapp.networkTest.enums.MeasurementTypes r0 = com.startapp.networkTest.enums.MeasurementTypes.IPING
                r3.MeasurementType = r0
                com.startapp.networkTest.data.TimeInfo r0 = com.startapp.C9603va.m50436e()
                r3.TimeInfoOnStart = r0
                java.lang.String r1 = r3.GUID
                java.lang.String r0 = com.startapp.C9578u3.m50392a(r0, r1)
                r3.LtrId = r0
                com.startapp.l0 r0 = com.startapp.C9102l0.this
                android.content.Context r0 = r0.f37237b
                com.startapp.i6 r0 = com.startapp.C9208p2.m49126e(r0)
                r3.MemoryInfoOnStart = r0
                com.startapp.l0 r0 = com.startapp.C9102l0.this
                com.startapp.k8 r0 = r0.f37238c
                com.startapp.networkTest.data.RadioInfo r0 = r0.mo29559h()
                r3.RadioInfoOnStart = r0
                com.startapp.l0 r0 = com.startapp.C9102l0.this
                com.startapp.nd r0 = r0.f37239d
                com.startapp.networkTest.data.WifiInfo r0 = r0.mo29716c()
                r3.WifiInfoOnStart = r0
                com.startapp.l0 r0 = com.startapp.C9102l0.this
                com.startapp.nd r0 = r0.f37239d
                com.startapp.eb r0 = com.startapp.C9208p2.m49115a((com.startapp.C9157nd) r0)
                r3.TrafficInfoOnStart = r0
                com.startapp.l0 r0 = com.startapp.C9102l0.this
                android.content.Context r0 = r0.f37237b
                com.startapp.q2 r0 = com.startapp.C9208p2.m49121b((android.content.Context) r0)
                r3.DeviceInfo = r0
                int r0 = com.startapp.networkTest.startapp.NetworkTester.isAppInForeground()
                r3.IsAppInForeground = r0
                int r0 = r7.f37256b
                r3.Pings = r0
                int r0 = r7.f37257c
                r3.Pause = r0
                java.lang.String r1 = r7.f37255a
                r3.Server = r1
                com.startapp.networkTest.enums.IpVersions r0 = com.startapp.networkTest.enums.IpVersions.IPv4
                r3.IpVersion = r0
                java.lang.String r2 = "ping"
                java.net.InetAddress r9 = java.net.InetAddress.getByName(r1)     // Catch:{ UnknownHostException -> 0x00ff }
                java.lang.String r1 = r9.getHostAddress()     // Catch:{ UnknownHostException -> 0x00fd }
                boolean r0 = r9 instanceof java.net.Inet6Address     // Catch:{ UnknownHostException -> 0x00fd }
                if (r0 == 0) goto L_0x0104
                com.startapp.networkTest.enums.IpVersions r0 = com.startapp.networkTest.enums.IpVersions.IPv6     // Catch:{ UnknownHostException -> 0x00fd }
                r3.IpVersion = r0     // Catch:{ UnknownHostException -> 0x00fd }
                r2 = r8
                goto L_0x0104
            L_0x00fd:
                r0 = move-exception
                goto L_0x0101
            L_0x00ff:
                r0 = move-exception
                r9 = 0
            L_0x0101:
                com.startapp.C9632x2.m50512b(r0)
            L_0x0104:
                r18 = r9
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                r0.append(r2)
                java.lang.String r9 = " -i "
                r0.append(r9)
                int r9 = r7.f37257c
                r23 = r12
                double r11 = (double) r9
                r19 = 4652007308841189376(0x408f400000000000, double:1000.0)
                double r11 = r11 / r19
                r0.append(r11)
                java.lang.String r9 = " -W "
                r0.append(r9)
                int r9 = r7.f37258d
                double r11 = (double) r9
                double r11 = r11 / r19
                r0.append(r11)
                java.lang.String r9 = " -c "
                r0.append(r9)
                int r9 = r7.f37256b
                r0.append(r9)
                java.lang.String r9 = " -s "
                r0.append(r9)
                int r9 = r7.f37259e
                r0.append(r9)
                java.lang.String r9 = r0.toString()
                boolean r0 = r2.equals(r8)
                r2 = 21
                java.lang.String r11 = ""
                if (r0 == 0) goto L_0x01df
                com.startapp.l0 r0 = com.startapp.C9102l0.this     // Catch:{ all -> 0x01d8 }
                android.content.Context r0 = r0.f37237b     // Catch:{ all -> 0x01d8 }
                java.lang.String r12 = "connectivity"
                java.lang.Object r0 = r0.getSystemService(r12)     // Catch:{ all -> 0x01d8 }
                android.net.ConnectivityManager r0 = (android.net.ConnectivityManager) r0     // Catch:{ all -> 0x01d8 }
                if (r0 == 0) goto L_0x01b6
                com.startapp.l0 r12 = com.startapp.C9102l0.this     // Catch:{ all -> 0x01d8 }
                android.content.Context r12 = r12.f37237b     // Catch:{ all -> 0x01d8 }
                java.lang.String r5 = "android.permission.ACCESS_NETWORK_STATE"
                int r5 = r12.checkCallingOrSelfPermission(r5)     // Catch:{ all -> 0x01d8 }
                if (r5 != 0) goto L_0x01b6
                int r5 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x01d8 }
                r12 = 23
                if (r5 < r12) goto L_0x0186
                android.net.Network r5 = r0.getActiveNetwork()     // Catch:{ all -> 0x01d8 }
                android.net.LinkProperties r0 = r0.getLinkProperties(r5)     // Catch:{ all -> 0x01d8 }
                if (r0 == 0) goto L_0x01b6
                java.lang.String r0 = r0.getInterfaceName()     // Catch:{ all -> 0x01d8 }
                r24 = r6
                goto L_0x01b9
            L_0x0186:
                if (r5 < r2) goto L_0x01b6
                android.net.Network[] r5 = r0.getAllNetworks()     // Catch:{ all -> 0x01d8 }
                int r12 = r5.length     // Catch:{ all -> 0x01d8 }
                r17 = r11
                r2 = 0
            L_0x0190:
                if (r2 >= r12) goto L_0x01b1
                r24 = r6
                r6 = r5[r2]     // Catch:{ all -> 0x01d6 }
                android.net.NetworkInfo r20 = r0.getNetworkInfo(r6)     // Catch:{ all -> 0x01d6 }
                if (r20 == 0) goto L_0x01ac
                boolean r20 = r20.isConnected()     // Catch:{ all -> 0x01d6 }
                if (r20 == 0) goto L_0x01ac
                android.net.LinkProperties r6 = r0.getLinkProperties(r6)     // Catch:{ all -> 0x01d6 }
                if (r6 == 0) goto L_0x01ac
                java.lang.String r17 = r6.getInterfaceName()     // Catch:{ all -> 0x01d6 }
            L_0x01ac:
                int r2 = r2 + 1
                r6 = r24
                goto L_0x0190
            L_0x01b1:
                r24 = r6
                r0 = r17
                goto L_0x01b9
            L_0x01b6:
                r24 = r6
                r0 = r11
            L_0x01b9:
                if (r0 == 0) goto L_0x01e1
                boolean r2 = r0.isEmpty()     // Catch:{ all -> 0x01d6 }
                if (r2 != 0) goto L_0x01e1
                java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x01d6 }
                r2.<init>()     // Catch:{ all -> 0x01d6 }
                r2.append(r9)     // Catch:{ all -> 0x01d6 }
                java.lang.String r5 = " -I "
                r2.append(r5)     // Catch:{ all -> 0x01d6 }
                r2.append(r0)     // Catch:{ all -> 0x01d6 }
                java.lang.String r9 = r2.toString()     // Catch:{ all -> 0x01d6 }
                goto L_0x01e1
            L_0x01d6:
                r0 = move-exception
                goto L_0x01db
            L_0x01d8:
                r0 = move-exception
                r24 = r6
            L_0x01db:
                com.startapp.C9632x2.m50510a((java.lang.Throwable) r0)
                goto L_0x01e1
            L_0x01df:
                r24 = r6
            L_0x01e1:
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                r0.append(r9)
                java.lang.String r2 = " "
                r0.append(r2)
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                r1 = 1
                boolean[] r9 = new boolean[r1]
                r5 = 0
                r9[r5] = r5
                int[] r12 = new int[r1]
                r12[r5] = r5
                java.lang.Runtime r1 = java.lang.Runtime.getRuntime()     // Catch:{ all -> 0x0358 }
                java.lang.Process r1 = r1.exec(r0)     // Catch:{ all -> 0x0358 }
                java.io.BufferedReader r5 = new java.io.BufferedReader     // Catch:{ all -> 0x034c }
                java.io.InputStreamReader r0 = new java.io.InputStreamReader     // Catch:{ all -> 0x034c }
                java.io.InputStream r6 = r1.getInputStream()     // Catch:{ all -> 0x034c }
                r0.<init>(r6)     // Catch:{ all -> 0x034c }
                r5.<init>(r0)     // Catch:{ all -> 0x034c }
                java.lang.String r0 = r5.readLine()     // Catch:{ all -> 0x033c }
                if (r0 != 0) goto L_0x0225
                if (r18 == 0) goto L_0x0225
                int r0 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x033c }
                r6 = 21
                if (r0 < r6) goto L_0x0225
                r6 = 1
                goto L_0x0226
            L_0x0225:
                r6 = 0
            L_0x0226:
                com.startapp.l0 r0 = com.startapp.C9102l0.this     // Catch:{ all -> 0x032e }
                com.startapp.e4 r0 = r0.f37236a     // Catch:{ all -> 0x032e }
                if (r0 == 0) goto L_0x025c
                com.startapp.l0 r0 = com.startapp.C9102l0.this     // Catch:{ all -> 0x024d }
                com.startapp.e4 r0 = r0.f37236a     // Catch:{ all -> 0x024d }
                r25 = r8
                com.startapp.networkTest.speedtest.SpeedtestEngineStatus r8 = com.startapp.networkTest.speedtest.SpeedtestEngineStatus.PING     // Catch:{ all -> 0x024b }
                r26 = r10
                com.startapp.networkTest.speedtest.SpeedtestEngineError r10 = com.startapp.networkTest.speedtest.SpeedtestEngineError.OK     // Catch:{ all -> 0x0249 }
                r27 = r13
                int r13 = r7.f37256b     // Catch:{ all -> 0x0319 }
                int r14 = r7.f37258d     // Catch:{ all -> 0x0319 }
                int r13 = r13 * r14
                long r13 = (long) r13     // Catch:{ all -> 0x0319 }
                r0.mo29294a(r8, r10, r13)     // Catch:{ all -> 0x0319 }
                goto L_0x0262
            L_0x0249:
                r0 = move-exception
                goto L_0x0252
            L_0x024b:
                r0 = move-exception
                goto L_0x0250
            L_0x024d:
                r0 = move-exception
                r25 = r8
            L_0x0250:
                r26 = r10
            L_0x0252:
                r27 = r13
            L_0x0254:
                r19 = r1
                r21 = r6
                r29 = r9
                goto L_0x0349
            L_0x025c:
                r25 = r8
                r26 = r10
                r27 = r13
            L_0x0262:
                if (r6 != 0) goto L_0x031c
                long r13 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x0319 }
                r0 = 0
            L_0x0269:
                int r8 = r7.f37256b     // Catch:{ all -> 0x0319 }
                if (r0 >= r8) goto L_0x031c
                boolean r8 = r30.isCancelled()     // Catch:{ all -> 0x0319 }
                if (r8 == 0) goto L_0x0284
                r5.close()     // Catch:{ all -> 0x0319 }
                r5.close()     // Catch:{ all -> 0x027a }
                goto L_0x027f
            L_0x027a:
                r0 = move-exception
                r2 = r0
                com.startapp.C9632x2.m50512b(r2)
            L_0x027f:
                r1.destroy()
                r8 = 0
                return r8
            L_0x0284:
                r8 = 0
                java.lang.String r10 = r5.readLine()     // Catch:{ all -> 0x0319 }
                long r19 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x0319 }
                r29 = r9
                long r8 = r19 - r13
                r17 = -1
                if (r10 == 0) goto L_0x02fd
                int r19 = r10.length()     // Catch:{ all -> 0x02f7 }
                if (r19 <= 0) goto L_0x02fd
                java.lang.String[] r10 = r10.split(r2)     // Catch:{ all -> 0x02f7 }
                r19 = r1
                int r1 = r10.length     // Catch:{ all -> 0x02f5 }
                r20 = r2
                r2 = 8
                if (r1 == r2) goto L_0x02b0
                int r1 = r10.length     // Catch:{ all -> 0x02f5 }
                r2 = 9
                if (r1 != r2) goto L_0x02ae
                goto L_0x02b0
            L_0x02ae:
                r1 = -1
                goto L_0x02b3
            L_0x02b0:
                int r1 = r10.length     // Catch:{ all -> 0x02f5 }
                int r1 = r1 + -2
            L_0x02b3:
                r2 = 6
                if (r1 == r2) goto L_0x02b9
                r2 = 7
                if (r1 != r2) goto L_0x0301
            L_0x02b9:
                r1 = r10[r1]     // Catch:{ all -> 0x02f5 }
                java.lang.String r2 = "time="
                java.lang.String r1 = r1.replace(r2, r11)     // Catch:{ all -> 0x02f5 }
                double r1 = java.lang.Double.parseDouble(r1)     // Catch:{ all -> 0x02f5 }
                long r1 = java.lang.Math.round(r1)     // Catch:{ all -> 0x02f5 }
                int r2 = (int) r1     // Catch:{ all -> 0x02f5 }
                r1 = 0
                r10 = 1
                r29[r1] = r10     // Catch:{ all -> 0x02f5 }
                r17 = r12[r1]     // Catch:{ all -> 0x02f5 }
                int r17 = r17 + 1
                r12[r1] = r17     // Catch:{ all -> 0x02f5 }
                com.startapp.l0 r1 = com.startapp.C9102l0.this     // Catch:{ all -> 0x02f5 }
                com.startapp.e4 r1 = r1.f37236a     // Catch:{ all -> 0x02f5 }
                if (r1 == 0) goto L_0x02f2
                com.startapp.l0 r1 = com.startapp.C9102l0.this     // Catch:{ all -> 0x02f5 }
                com.startapp.e4 r1 = r1.f37236a     // Catch:{ all -> 0x02f5 }
                float r10 = (float) r0
                r21 = r6
                int r6 = r7.f37256b     // Catch:{ all -> 0x0317 }
                float r6 = (float) r6     // Catch:{ all -> 0x0317 }
                float r10 = r10 / r6
                if (r2 >= 0) goto L_0x02ed
                r6 = 0
                goto L_0x02ee
            L_0x02ed:
                r6 = r2
            L_0x02ee:
                r1.mo29295b(r10, r6)     // Catch:{ all -> 0x0317 }
                goto L_0x0304
            L_0x02f2:
                r21 = r6
                goto L_0x0304
            L_0x02f5:
                r0 = move-exception
                goto L_0x02fa
            L_0x02f7:
                r0 = move-exception
                r19 = r1
            L_0x02fa:
                r21 = r6
                goto L_0x0349
            L_0x02fd:
                r19 = r1
                r20 = r2
            L_0x0301:
                r21 = r6
                r2 = -1
            L_0x0304:
                com.startapp.networkTest.results.speedtest.MeasurementPointLatency r1 = r7.m48924a(r8, r2)     // Catch:{ all -> 0x0317 }
                r4.add(r1)     // Catch:{ all -> 0x0317 }
                int r0 = r0 + 1
                r1 = r19
                r2 = r20
                r6 = r21
                r9 = r29
                goto L_0x0269
            L_0x0317:
                r0 = move-exception
                goto L_0x0349
            L_0x0319:
                r0 = move-exception
                goto L_0x0254
            L_0x031c:
                r19 = r1
                r21 = r6
                r29 = r9
                r5.close()     // Catch:{ all -> 0x0326 }
                goto L_0x032b
            L_0x0326:
                r0 = move-exception
                r1 = r0
                com.startapp.C9632x2.m50512b(r1)
            L_0x032b:
                r1 = r19
                goto L_0x0375
            L_0x032e:
                r0 = move-exception
                r19 = r1
                r21 = r6
                r25 = r8
                r29 = r9
                r26 = r10
                r27 = r13
                goto L_0x0349
            L_0x033c:
                r0 = move-exception
                r19 = r1
                r25 = r8
                r29 = r9
                r26 = r10
                r27 = r13
                r21 = 0
            L_0x0349:
                r1 = r19
                goto L_0x0365
            L_0x034c:
                r0 = move-exception
                r19 = r1
                r25 = r8
                r29 = r9
                r26 = r10
                r27 = r13
                goto L_0x0362
            L_0x0358:
                r0 = move-exception
                r25 = r8
                r29 = r9
                r26 = r10
                r27 = r13
                r1 = 0
            L_0x0362:
                r5 = 0
                r21 = 0
            L_0x0365:
                com.startapp.C9632x2.m50510a((java.lang.Throwable) r0)     // Catch:{ all -> 0x047e }
                if (r5 == 0) goto L_0x0373
                r5.close()     // Catch:{ all -> 0x036e }
                goto L_0x0373
            L_0x036e:
                r0 = move-exception
                r2 = r0
                com.startapp.C9632x2.m50512b(r2)
            L_0x0373:
                if (r1 == 0) goto L_0x037c
            L_0x0375:
                r6 = r21
                r1.destroy()
                r21 = r6
            L_0x037c:
                if (r21 == 0) goto L_0x03b2
                com.startapp.networkTest.enums.MeasurementTypes r0 = com.startapp.networkTest.enums.MeasurementTypes.APIIPING
                r3.MeasurementType = r0
                com.startapp.z r0 = new com.startapp.z
                int r1 = r7.f37256b
                int r2 = r7.f37257c
                int r5 = r7.f37258d
                int r6 = r7.f37259e
                r17 = r0
                r19 = r1
                r20 = r2
                r21 = r5
                r22 = r6
                r17.<init>(r18, r19, r20, r21, r22)
                com.startapp.l0$b$a r8 = new com.startapp.l0$b$a
                r1 = r8
                r2 = r30
                r9 = r3
                r3 = r29
                r10 = r4
                r4 = r12
                r11 = 1
                r5 = r10
                r13 = r24
                r6 = r0
                r1.<init>(r3, r4, r5, r6)
                r0.mo31499a((com.startapp.C8951f8) r8)
                r0.mo31502c()
                goto L_0x03b7
            L_0x03b2:
                r9 = r3
                r10 = r4
                r13 = r24
                r11 = 1
            L_0x03b7:
                com.startapp.networkTest.enums.SpeedtestEndStates r0 = com.startapp.networkTest.enums.SpeedtestEndStates.Finish
                r9.TestEndState = r0
                com.startapp.networkTest.speedtest.SpeedtestEngineError r0 = com.startapp.networkTest.speedtest.SpeedtestEngineError.OK
                r9.TestErrorReason = r0
                r1 = 0
                boolean r0 = r29[r1]
                r9.Success = r0
                r0 = r12[r1]
                r9.SuccessfulPings = r0
                int r0 = r10.size()
                if (r0 <= 0) goto L_0x03d6
                r9.calculateStats(r10)
                java.util.ArrayList<com.startapp.networkTest.results.speedtest.MeasurementPointLatency> r0 = r9.MeasurementPoints
                r9.calcRatShare(r0)
            L_0x03d6:
                com.startapp.l0 r0 = com.startapp.C9102l0.this
                com.startapp.b1 r0 = r0.f37241f
                com.startapp.networkTest.data.BatteryInfo r0 = r0.mo29127a()
                r9.BatteryInfoOnEnd = r0
                com.startapp.l0 r0 = com.startapp.C9102l0.this
                com.startapp.networkTest.controller.LocationController r0 = r0.f37240e
                com.startapp.networkTest.data.LocationInfo r0 = r0.mo29724c()
                r9.LocationInfoOnEnd = r0
                com.startapp.l0 r0 = com.startapp.C9102l0.this
                android.content.Context r0 = r0.f37237b
                com.startapp.networkTest.enums.ScreenStates r0 = com.startapp.C9208p2.m49129h(r0)
                r9.ScreenStateOnEnd = r0
                com.startapp.l0 r0 = com.startapp.C9102l0.this
                android.content.Context r0 = r0.f37237b
                com.startapp.i6 r0 = com.startapp.C9208p2.m49126e(r0)
                r9.MemoryInfoOnEnd = r0
                com.startapp.l0 r0 = com.startapp.C9102l0.this
                com.startapp.k8 r0 = r0.f37238c
                com.startapp.networkTest.data.RadioInfo r0 = r0.mo29559h()
                r9.RadioInfoOnEnd = r0
                com.startapp.networkTest.data.TimeInfo r0 = com.startapp.C9603va.m50436e()
                r9.TimeInfoOnEnd = r0
                com.startapp.l0 r0 = com.startapp.C9102l0.this
                com.startapp.nd r0 = r0.f37239d
                com.startapp.networkTest.data.WifiInfo r0 = r0.mo29716c()
                r9.WifiInfoOnEnd = r0
                com.startapp.l0 r0 = com.startapp.C9102l0.this
                com.startapp.nd r0 = r0.f37239d
                com.startapp.eb r0 = com.startapp.C9208p2.m49115a((com.startapp.C9157nd) r0)
                r9.TrafficInfoOnEnd = r0
                long r0 = android.os.SystemClock.uptimeMillis()
                long r0 = r0 - r15
                r9.DurationOverallNoSleep = r0
                long r0 = android.os.SystemClock.elapsedRealtime()
                long r0 = r0 - r27
                r9.DurationOverall = r0
                com.startapp.networkTest.enums.LtrCriteriaTypes r0 = r7.f37261g
                com.startapp.networkTest.enums.LtrCriteriaTypes r1 = com.startapp.networkTest.enums.LtrCriteriaTypes.CTItem
                if (r0 != r1) goto L_0x044c
                com.startapp.l0 r0 = com.startapp.C9102l0.this
                java.lang.String r0 = r0.f37253r
                goto L_0x0452
            L_0x044c:
                java.lang.String r0 = r7.f37255a
                java.lang.String r0 = com.startapp.C9557t9.m50364a(r0)
            L_0x0452:
                r9.AirportCode = r0
                com.startapp.l0 r0 = com.startapp.C9102l0.this
                java.lang.String r0 = r0.f37247l
                r9.Meta = r0
                com.startapp.l0 r0 = com.startapp.C9102l0.this
                java.lang.String r0 = r0.f37246k
                java.lang.String r0 = com.startapp.C9135ma.m48968a((java.lang.String) r0)
                r9.QuestionnaireName = r0
                r2 = 0
                boolean r0 = r29[r2]
                if (r0 == 0) goto L_0x0474
                int r0 = r13.successfulTests
                int r0 = r0 + r11
                r13.successfulTests = r0
                r0 = r9
                goto L_0x0493
            L_0x0474:
                int r12 = r23 + 1
                r0 = r9
                r8 = r25
                r10 = r26
                r9 = 0
                goto L_0x0028
            L_0x047e:
                r0 = move-exception
                r2 = r0
                if (r5 == 0) goto L_0x048b
                r5.close()     // Catch:{ all -> 0x0486 }
                goto L_0x048b
            L_0x0486:
                r0 = move-exception
                r3 = r0
                com.startapp.C9632x2.m50512b(r3)
            L_0x048b:
                if (r1 == 0) goto L_0x0490
                r1.destroy()
            L_0x0490:
                throw r2
            L_0x0491:
                r26 = r10
            L_0x0493:
                com.startapp.networkTest.enums.LtrCriteriaTypes r1 = r7.f37261g
                com.startapp.networkTest.enums.LtrCriteriaTypes r2 = com.startapp.networkTest.enums.LtrCriteriaTypes.CTItem
                if (r1 == r2) goto L_0x049e
                r1 = r26
                r7.m48927a((java.util.List<com.startapp.C8949f6>) r1)
            L_0x049e:
                com.startapp.y4 r1 = com.startapp.C8821a5.m48254b()
                boolean r1 = r1.CLEAR_LTR_LOCATION_INFO()
                if (r1 == 0) goto L_0x04b8
                if (r0 == 0) goto L_0x04b8
                com.startapp.networkTest.data.LocationInfo r1 = new com.startapp.networkTest.data.LocationInfo
                r1.<init>()
                r0.LocationInfoOnStart = r1
                com.startapp.networkTest.data.LocationInfo r1 = new com.startapp.networkTest.data.LocationInfo
                r1.<init>()
                r0.LocationInfoOnEnd = r1
            L_0x04b8:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.startapp.C9102l0.C9104b.doInBackground(java.lang.Void[]):com.startapp.networkTest.results.LatencyResult");
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public MeasurementPointLatency m48924a(long j, int i) {
            MeasurementPointLatency measurementPointLatency = new MeasurementPointLatency();
            measurementPointLatency.Delta = j;
            RadioInfo h = C9102l0.this.f37238c.mo29559h();
            measurementPointLatency.ConnectionType = h.ConnectionType;
            measurementPointLatency.NetworkType = h.NetworkType;
            measurementPointLatency.NrAvailable = h.NrAvailable;
            measurementPointLatency.NrState = h.NrState;
            measurementPointLatency.RxLev = h.RXLevel;
            measurementPointLatency.Rtt = i;
            return measurementPointLatency;
        }

        /* renamed from: a */
        public void onPostExecute(LatencyResult latencyResult) {
            super.onPostExecute(latencyResult);
            P3TestResult unused = C9102l0.this.f37242g = latencyResult;
            if (latencyResult != null) {
                if (C9102l0.this.f37236a != null) {
                    C9102l0.this.f37236a.mo29294a(SpeedtestEngineStatus.END, SpeedtestEngineError.OK, 0);
                }
            } else if (C9102l0.this.f37236a != null) {
                C9102l0.this.f37236a.mo29294a(SpeedtestEngineStatus.ABORTED, SpeedtestEngineError.OK, 0);
            }
        }

        /* renamed from: a */
        private void m48927a(List<C8949f6> list) {
            HashSet hashSet = new HashSet();
            for (C8949f6 f6Var : list) {
                hashSet.add(f6Var.toString());
            }
            C8821a5.m48255c().mo29162d((Set<String>) hashSet);
        }

        /* renamed from: a */
        private List<C8949f6> m48926a(String[] strArr, LtrCriteriaTypes ltrCriteriaTypes, String str) {
            LinkedList linkedList = new LinkedList();
            LinkedList linkedList2 = new LinkedList();
            Set<String> q = C8821a5.m48255c().mo29200q();
            LinkedList<C8949f6> linkedList3 = new LinkedList<>();
            if (q != null) {
                for (String a : q) {
                    C8949f6 f6Var = (C8949f6) C9258r5.m49216a(a, C8949f6.class);
                    if (f6Var != null) {
                        linkedList3.add(f6Var);
                    }
                }
            }
            for (String str2 : strArr) {
                C8949f6 f6Var2 = new C8949f6();
                f6Var2.address = str2;
                linkedList2.add(f6Var2);
            }
            for (C8949f6 f6Var3 : linkedList3) {
                for (int i = 0; i < strArr.length; i++) {
                    if (strArr[i].equals(f6Var3.address)) {
                        linkedList2.set(i, f6Var3);
                    }
                }
            }
            int i2 = C9103a.f37254a[ltrCriteriaTypes.ordinal()];
            if (i2 == 1) {
                C8949f6 f6Var4 = new C8949f6();
                f6Var4.address = str;
                linkedList.add(f6Var4);
                return linkedList;
            } else if (i2 == 2) {
                return linkedList2;
            } else {
                if (i2 == 3) {
                    Collections.shuffle(linkedList2, new Random(System.nanoTime()));
                    return new LinkedList(linkedList2);
                } else if (i2 == 4) {
                    Collections.sort(linkedList2, new C9106b());
                    return new LinkedList(linkedList2);
                } else if (i2 != 5) {
                    return linkedList;
                } else {
                    Collections.sort(linkedList2, new C9107c());
                    return new LinkedList(linkedList2);
                }
            }
        }
    }

    /* renamed from: b */
    public void mo29638b() {
        mo29634a(LocationController.ProviderMode.GpsAndNetwork);
    }

    /* renamed from: c */
    public void mo29640c() {
        LocationController locationController = this.f37240e;
        if (locationController != null) {
            locationController.mo29726f();
        }
        C9068k8 k8Var = this.f37238c;
        if (k8Var != null) {
            k8Var.mo29571y();
        }
        C9157nd ndVar = this.f37239d;
        if (ndVar != null) {
            ndVar.mo29720g();
        }
    }

    /* renamed from: d */
    public void mo29642d(String str) {
        this.f37251p = str;
    }

    /* renamed from: e */
    public void mo29643e(String str) {
        this.f37247l = str;
    }

    /* renamed from: f */
    public void mo29644f(String str) {
        this.f37252q = str;
    }

    /* renamed from: g */
    public void mo29645g(String str) {
        this.f37246k = str;
    }

    /* renamed from: a */
    public P3TestResult mo29633a() {
        return this.f37242g;
    }

    /* renamed from: b */
    public void mo29639b(String str) {
        this.f37253r = str;
    }

    /* renamed from: a */
    private void m48899a(Context context, C9655y4 y4Var) {
        this.f37238c = new C9068k8(context);
        this.f37239d = new C9157nd(context);
        this.f37240e = new LocationController(this.f37237b);
        this.f37241f = new C8840b1(this.f37237b);
        this.f37243h = new ArrayList<>();
        if (y4Var.BANDWDITH_TEST_MANAGER_GET_IMEI_IMSI()) {
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
        }
    }

    /* renamed from: c */
    public void mo29641c(String str) {
        this.f37248m = str;
    }

    /* renamed from: a */
    public void mo29634a(LocationController.ProviderMode providerMode) {
        LocationController locationController = this.f37240e;
        if (locationController != null) {
            locationController.mo29722a(providerMode);
        }
        C9068k8 k8Var = this.f37238c;
        if (k8Var != null) {
            k8Var.mo29570x();
        }
        C9157nd ndVar = this.f37239d;
        if (ndVar != null) {
            ndVar.mo29719f();
        }
    }

    /* renamed from: a */
    public void mo29635a(String str) {
        ArrayList<C9048j8> arrayList = this.f37243h;
        arrayList.add(new C9048j8(arrayList.size() + 1, str));
    }

    /* renamed from: a */
    public void mo29637a(String str, int i, int i2, int i3, int i4, boolean z) {
        this.f37243h = new ArrayList<>();
        if (Build.VERSION.SDK_INT < 11) {
            new C9104b(str, i, i2, i3, i4, z).execute(new Void[0]);
        } else {
            new C9104b(str, i, i2, i3, i4, z).executeOnExecutor(ThreadManager.m49065b().mo29768a(), new Void[0]);
        }
    }

    /* renamed from: a */
    public void mo29636a(String str, int i, int i2, int i3, int i4) {
        mo29637a(str, i, i2, i3, i4, false);
    }
}
