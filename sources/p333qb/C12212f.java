package p333qb;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.view.WindowManager;
import java.io.File;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import p264io.flutter.embedding.engine.FlutterJNI;
import p264io.flutter.view.C11096h;
import p297mb.C11877a;
import p297mb.C11881b;
import p325pc.C12165a;
import p325pc.C12166b;
import p325pc.C12169e;

/* renamed from: qb.f */
/* compiled from: FlutterLoader */
public class C12212f {

    /* renamed from: a */
    private boolean f45345a;

    /* renamed from: b */
    private C12215c f45346b;

    /* renamed from: c */
    private long f45347c;

    /* renamed from: d */
    private C12208b f45348d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public FlutterJNI f45349e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public ExecutorService f45350f;

    /* renamed from: g */
    Future<C12214b> f45351g;

    /* renamed from: qb.f$a */
    /* compiled from: FlutterLoader */
    class C12213a implements Callable<C12214b> {

        /* renamed from: a */
        final /* synthetic */ Context f45352a;

        C12213a(Context context) {
            this.f45352a = context;
        }

        /* access modifiers changed from: private */
        /* renamed from: c */
        public /* synthetic */ void m58657c() {
            C12212f.this.f45349e.prefetchDefaultFontManager();
        }

        /* renamed from: b */
        public C12214b call() {
            C12169e.m58443a("FlutterLoader initTask");
            try {
                C12216g unused = C12212f.this.m58643m(this.f45352a);
                C12212f.this.f45349e.loadLibrary();
                C12212f.this.f45349e.updateRefreshRate();
                C12212f.this.f45350f.execute(new C12211e(this));
                return new C12214b(C12166b.m58440d(this.f45352a), C12166b.m58437a(this.f45352a), C12166b.m58439c(this.f45352a), (C12213a) null);
            } finally {
                C12169e.m58446d();
            }
        }
    }

    /* renamed from: qb.f$b */
    /* compiled from: FlutterLoader */
    private static class C12214b {

        /* renamed from: a */
        final String f45354a;

        /* renamed from: b */
        final String f45355b;

        /* renamed from: c */
        final String f45356c;

        /* synthetic */ C12214b(String str, String str2, String str3, C12213a aVar) {
            this(str, str2, str3);
        }

        private C12214b(String str, String str2, String str3) {
            this.f45354a = str;
            this.f45355b = str2;
            this.f45356c = str3;
        }
    }

    /* renamed from: qb.f$c */
    /* compiled from: FlutterLoader */
    public static class C12215c {

        /* renamed from: a */
        private String f45357a;

        /* renamed from: a */
        public String mo36750a() {
            return this.f45357a;
        }
    }

    public C12212f() {
        this(C11877a.m57376e().mo36135d().mo34065a());
    }

    /* renamed from: j */
    private String m58642j(String str) {
        return this.f45348d.f45330d + File.separator + str;
    }

    /* access modifiers changed from: private */
    /* renamed from: m */
    public C12216g m58643m(Context context) {
        return null;
    }

    /* renamed from: o */
    private static boolean m58644o(Bundle bundle) {
        if (bundle == null) {
            return true;
        }
        return bundle.getBoolean("io.flutter.embedding.android.LeakVM", true);
    }

    /* access modifiers changed from: private */
    /* renamed from: p */
    public /* synthetic */ void m58645p(Context context, String[] strArr, Handler handler, Runnable runnable) {
        mo36740g(context.getApplicationContext(), strArr);
        handler.post(runnable);
    }

    /* access modifiers changed from: private */
    /* renamed from: q */
    public /* synthetic */ void m58646q(Context context, String[] strArr, Handler handler, Runnable runnable) {
        try {
            C12214b bVar = this.f45351g.get();
            C12165a.m58436a(Looper.getMainLooper()).post(new C12210d(this, context, strArr, handler, runnable));
        } catch (Exception e) {
            C11881b.m57385c("FlutterLoader", "Flutter initialization failed.", e);
            throw new RuntimeException(e);
        }
    }

    /* renamed from: f */
    public boolean mo36739f() {
        return this.f45348d.f45333g;
    }

    /* JADX WARNING: Removed duplicated region for block: B:38:0x0191 A[Catch:{ Exception -> 0x01ce, all -> 0x01cc }] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0194 A[Catch:{ Exception -> 0x01ce, all -> 0x01cc }] */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo36740g(android.content.Context r10, java.lang.String[] r11) {
        /*
            r9 = this;
            java.lang.String r0 = "--aot-shared-library-name="
            boolean r1 = r9.f45345a
            if (r1 == 0) goto L_0x0007
            return
        L_0x0007:
            android.os.Looper r1 = android.os.Looper.myLooper()
            android.os.Looper r2 = android.os.Looper.getMainLooper()
            if (r1 != r2) goto L_0x01e8
            qb.f$c r1 = r9.f45346b
            if (r1 == 0) goto L_0x01e0
            java.lang.String r1 = "FlutterLoader#ensureInitializationComplete"
            p325pc.C12169e.m58443a(r1)
            java.util.concurrent.Future<qb.f$b> r1 = r9.f45351g     // Catch:{ Exception -> 0x01ce }
            java.lang.Object r1 = r1.get()     // Catch:{ Exception -> 0x01ce }
            qb.f$b r1 = (p333qb.C12212f.C12214b) r1     // Catch:{ Exception -> 0x01ce }
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch:{ Exception -> 0x01ce }
            r2.<init>()     // Catch:{ Exception -> 0x01ce }
            java.lang.String r3 = "--icu-symbol-prefix=_binary_icudtl_dat"
            r2.add(r3)     // Catch:{ Exception -> 0x01ce }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x01ce }
            r3.<init>()     // Catch:{ Exception -> 0x01ce }
            java.lang.String r4 = "--icu-native-lib-path="
            r3.append(r4)     // Catch:{ Exception -> 0x01ce }
            qb.b r4 = r9.f45348d     // Catch:{ Exception -> 0x01ce }
            java.lang.String r4 = r4.f45332f     // Catch:{ Exception -> 0x01ce }
            r3.append(r4)     // Catch:{ Exception -> 0x01ce }
            java.lang.String r4 = java.io.File.separator     // Catch:{ Exception -> 0x01ce }
            r3.append(r4)     // Catch:{ Exception -> 0x01ce }
            java.lang.String r5 = "libflutter.so"
            r3.append(r5)     // Catch:{ Exception -> 0x01ce }
            java.lang.String r3 = r3.toString()     // Catch:{ Exception -> 0x01ce }
            r2.add(r3)     // Catch:{ Exception -> 0x01ce }
            if (r11 == 0) goto L_0x0053
            java.util.Collections.addAll(r2, r11)     // Catch:{ Exception -> 0x01ce }
        L_0x0053:
            r3 = 0
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x01ce }
            r11.<init>()     // Catch:{ Exception -> 0x01ce }
            r11.append(r0)     // Catch:{ Exception -> 0x01ce }
            qb.b r5 = r9.f45348d     // Catch:{ Exception -> 0x01ce }
            java.lang.String r5 = r5.f45327a     // Catch:{ Exception -> 0x01ce }
            r11.append(r5)     // Catch:{ Exception -> 0x01ce }
            java.lang.String r11 = r11.toString()     // Catch:{ Exception -> 0x01ce }
            r2.add(r11)     // Catch:{ Exception -> 0x01ce }
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x01ce }
            r11.<init>()     // Catch:{ Exception -> 0x01ce }
            r11.append(r0)     // Catch:{ Exception -> 0x01ce }
            qb.b r0 = r9.f45348d     // Catch:{ Exception -> 0x01ce }
            java.lang.String r0 = r0.f45332f     // Catch:{ Exception -> 0x01ce }
            r11.append(r0)     // Catch:{ Exception -> 0x01ce }
            r11.append(r4)     // Catch:{ Exception -> 0x01ce }
            qb.b r0 = r9.f45348d     // Catch:{ Exception -> 0x01ce }
            java.lang.String r0 = r0.f45327a     // Catch:{ Exception -> 0x01ce }
            r11.append(r0)     // Catch:{ Exception -> 0x01ce }
            java.lang.String r11 = r11.toString()     // Catch:{ Exception -> 0x01ce }
            r2.add(r11)     // Catch:{ Exception -> 0x01ce }
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x01ce }
            r11.<init>()     // Catch:{ Exception -> 0x01ce }
            java.lang.String r0 = "--cache-dir-path="
            r11.append(r0)     // Catch:{ Exception -> 0x01ce }
            java.lang.String r0 = r1.f45355b     // Catch:{ Exception -> 0x01ce }
            r11.append(r0)     // Catch:{ Exception -> 0x01ce }
            java.lang.String r11 = r11.toString()     // Catch:{ Exception -> 0x01ce }
            r2.add(r11)     // Catch:{ Exception -> 0x01ce }
            qb.b r11 = r9.f45348d     // Catch:{ Exception -> 0x01ce }
            java.lang.String r11 = r11.f45331e     // Catch:{ Exception -> 0x01ce }
            if (r11 == 0) goto L_0x00be
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x01ce }
            r11.<init>()     // Catch:{ Exception -> 0x01ce }
            java.lang.String r0 = "--domain-network-policy="
            r11.append(r0)     // Catch:{ Exception -> 0x01ce }
            qb.b r0 = r9.f45348d     // Catch:{ Exception -> 0x01ce }
            java.lang.String r0 = r0.f45331e     // Catch:{ Exception -> 0x01ce }
            r11.append(r0)     // Catch:{ Exception -> 0x01ce }
            java.lang.String r11 = r11.toString()     // Catch:{ Exception -> 0x01ce }
            r2.add(r11)     // Catch:{ Exception -> 0x01ce }
        L_0x00be:
            qb.f$c r11 = r9.f45346b     // Catch:{ Exception -> 0x01ce }
            java.lang.String r11 = r11.mo36750a()     // Catch:{ Exception -> 0x01ce }
            if (r11 == 0) goto L_0x00e0
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x01ce }
            r11.<init>()     // Catch:{ Exception -> 0x01ce }
            java.lang.String r0 = "--log-tag="
            r11.append(r0)     // Catch:{ Exception -> 0x01ce }
            qb.f$c r0 = r9.f45346b     // Catch:{ Exception -> 0x01ce }
            java.lang.String r0 = r0.mo36750a()     // Catch:{ Exception -> 0x01ce }
            r11.append(r0)     // Catch:{ Exception -> 0x01ce }
            java.lang.String r11 = r11.toString()     // Catch:{ Exception -> 0x01ce }
            r2.add(r11)     // Catch:{ Exception -> 0x01ce }
        L_0x00e0:
            android.content.pm.PackageManager r11 = r10.getPackageManager()     // Catch:{ Exception -> 0x01ce }
            java.lang.String r0 = r10.getPackageName()     // Catch:{ Exception -> 0x01ce }
            r4 = 128(0x80, float:1.794E-43)
            android.content.pm.ApplicationInfo r11 = r11.getApplicationInfo(r0, r4)     // Catch:{ Exception -> 0x01ce }
            android.os.Bundle r11 = r11.metaData     // Catch:{ Exception -> 0x01ce }
            r0 = 0
            if (r11 == 0) goto L_0x00fa
            java.lang.String r4 = "io.flutter.embedding.android.OldGenHeapSize"
            int r4 = r11.getInt(r4)     // Catch:{ Exception -> 0x01ce }
            goto L_0x00fb
        L_0x00fa:
            r4 = 0
        L_0x00fb:
            if (r4 != 0) goto L_0x011a
            java.lang.String r4 = "activity"
            java.lang.Object r4 = r10.getSystemService(r4)     // Catch:{ Exception -> 0x01ce }
            android.app.ActivityManager r4 = (android.app.ActivityManager) r4     // Catch:{ Exception -> 0x01ce }
            android.app.ActivityManager$MemoryInfo r5 = new android.app.ActivityManager$MemoryInfo     // Catch:{ Exception -> 0x01ce }
            r5.<init>()     // Catch:{ Exception -> 0x01ce }
            r4.getMemoryInfo(r5)     // Catch:{ Exception -> 0x01ce }
            long r4 = r5.totalMem     // Catch:{ Exception -> 0x01ce }
            double r4 = (double) r4     // Catch:{ Exception -> 0x01ce }
            r6 = 4696837146684686336(0x412e848000000000, double:1000000.0)
            double r4 = r4 / r6
            r6 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r4 = r4 / r6
            int r4 = (int) r4     // Catch:{ Exception -> 0x01ce }
        L_0x011a:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x01ce }
            r5.<init>()     // Catch:{ Exception -> 0x01ce }
            java.lang.String r6 = "--old-gen-heap-size="
            r5.append(r6)     // Catch:{ Exception -> 0x01ce }
            r5.append(r4)     // Catch:{ Exception -> 0x01ce }
            java.lang.String r4 = r5.toString()     // Catch:{ Exception -> 0x01ce }
            r2.add(r4)     // Catch:{ Exception -> 0x01ce }
            android.content.res.Resources r4 = r10.getResources()     // Catch:{ Exception -> 0x01ce }
            android.util.DisplayMetrics r4 = r4.getDisplayMetrics()     // Catch:{ Exception -> 0x01ce }
            int r5 = r4.widthPixels     // Catch:{ Exception -> 0x01ce }
            int r4 = r4.heightPixels     // Catch:{ Exception -> 0x01ce }
            int r5 = r5 * r4
            int r5 = r5 * 12
            int r5 = r5 * 4
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x01ce }
            r4.<init>()     // Catch:{ Exception -> 0x01ce }
            java.lang.String r6 = "--resource-cache-max-bytes-threshold="
            r4.append(r6)     // Catch:{ Exception -> 0x01ce }
            r4.append(r5)     // Catch:{ Exception -> 0x01ce }
            java.lang.String r4 = r4.toString()     // Catch:{ Exception -> 0x01ce }
            r2.add(r4)     // Catch:{ Exception -> 0x01ce }
            java.lang.String r4 = "--prefetched-default-font-manager"
            r2.add(r4)     // Catch:{ Exception -> 0x01ce }
            r8 = 1
            if (r11 == 0) goto L_0x0167
            java.lang.String r4 = "io.flutter.embedding.android.EnableSkParagraph"
            boolean r4 = r11.getBoolean(r4, r8)     // Catch:{ Exception -> 0x01ce }
            if (r4 == 0) goto L_0x0165
            goto L_0x0167
        L_0x0165:
            r4 = 0
            goto L_0x0168
        L_0x0167:
            r4 = 1
        L_0x0168:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x01ce }
            r5.<init>()     // Catch:{ Exception -> 0x01ce }
            java.lang.String r6 = "--enable-skparagraph="
            r5.append(r6)     // Catch:{ Exception -> 0x01ce }
            r5.append(r4)     // Catch:{ Exception -> 0x01ce }
            java.lang.String r4 = r5.toString()     // Catch:{ Exception -> 0x01ce }
            r2.add(r4)     // Catch:{ Exception -> 0x01ce }
            if (r11 == 0) goto L_0x018b
            java.lang.String r4 = "io.flutter.embedding.android.EnableImpeller"
            boolean r4 = r11.getBoolean(r4, r0)     // Catch:{ Exception -> 0x01ce }
            if (r4 == 0) goto L_0x018b
            java.lang.String r4 = "--enable-impeller"
            r2.add(r4)     // Catch:{ Exception -> 0x01ce }
        L_0x018b:
            boolean r11 = m58644o(r11)     // Catch:{ Exception -> 0x01ce }
            if (r11 == 0) goto L_0x0194
            java.lang.String r11 = "true"
            goto L_0x0196
        L_0x0194:
            java.lang.String r11 = "false"
        L_0x0196:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x01ce }
            r4.<init>()     // Catch:{ Exception -> 0x01ce }
            java.lang.String r5 = "--leak-vm="
            r4.append(r5)     // Catch:{ Exception -> 0x01ce }
            r4.append(r11)     // Catch:{ Exception -> 0x01ce }
            java.lang.String r11 = r4.toString()     // Catch:{ Exception -> 0x01ce }
            r2.add(r11)     // Catch:{ Exception -> 0x01ce }
            long r4 = android.os.SystemClock.uptimeMillis()     // Catch:{ Exception -> 0x01ce }
            long r6 = r9.f45347c     // Catch:{ Exception -> 0x01ce }
            long r6 = r4 - r6
            io.flutter.embedding.engine.FlutterJNI r11 = r9.f45349e     // Catch:{ Exception -> 0x01ce }
            java.lang.String[] r0 = new java.lang.String[r0]     // Catch:{ Exception -> 0x01ce }
            java.lang.Object[] r0 = r2.toArray(r0)     // Catch:{ Exception -> 0x01ce }
            r2 = r0
            java.lang.String[] r2 = (java.lang.String[]) r2     // Catch:{ Exception -> 0x01ce }
            java.lang.String r4 = r1.f45354a     // Catch:{ Exception -> 0x01ce }
            java.lang.String r5 = r1.f45355b     // Catch:{ Exception -> 0x01ce }
            r0 = r11
            r1 = r10
            r0.init(r1, r2, r3, r4, r5, r6)     // Catch:{ Exception -> 0x01ce }
            r9.f45345a = r8     // Catch:{ Exception -> 0x01ce }
            p325pc.C12169e.m58446d()
            return
        L_0x01cc:
            r10 = move-exception
            goto L_0x01dc
        L_0x01ce:
            r10 = move-exception
            java.lang.String r11 = "FlutterLoader"
            java.lang.String r0 = "Flutter initialization failed."
            p297mb.C11881b.m57385c(r11, r0, r10)     // Catch:{ all -> 0x01cc }
            java.lang.RuntimeException r11 = new java.lang.RuntimeException     // Catch:{ all -> 0x01cc }
            r11.<init>(r10)     // Catch:{ all -> 0x01cc }
            throw r11     // Catch:{ all -> 0x01cc }
        L_0x01dc:
            p325pc.C12169e.m58446d()
            throw r10
        L_0x01e0:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "ensureInitializationComplete must be called after startInitialization"
            r10.<init>(r11)
            throw r10
        L_0x01e8:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "ensureInitializationComplete must be called on the main thread"
            r10.<init>(r11)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: p333qb.C12212f.mo36740g(android.content.Context, java.lang.String[]):void");
    }

    /* renamed from: h */
    public void mo36741h(Context context, String[] strArr, Handler handler, Runnable runnable) {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new IllegalStateException("ensureInitializationComplete must be called on the main thread");
        } else if (this.f45346b == null) {
            throw new IllegalStateException("ensureInitializationComplete must be called after startInitialization");
        } else if (this.f45345a) {
            handler.post(runnable);
        } else {
            this.f45350f.execute(new C12209c(this, context, strArr, handler, runnable));
        }
    }

    /* renamed from: i */
    public String mo36742i() {
        return this.f45348d.f45330d;
    }

    /* renamed from: k */
    public String mo36743k(String str) {
        return m58642j(str);
    }

    /* renamed from: l */
    public String mo36744l(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append("packages");
        String str3 = File.separator;
        sb.append(str3);
        sb.append(str2);
        sb.append(str3);
        sb.append(str);
        return mo36743k(sb.toString());
    }

    /* renamed from: n */
    public boolean mo36745n() {
        return this.f45345a;
    }

    /* renamed from: r */
    public void mo36746r(Context context) {
        mo36747s(context, new C12215c());
    }

    /* renamed from: s */
    public void mo36747s(Context context, C12215c cVar) {
        C11096h hVar;
        if (this.f45346b == null) {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                C12169e.m58443a("FlutterLoader#startInitialization");
                try {
                    Context applicationContext = context.getApplicationContext();
                    this.f45346b = cVar;
                    this.f45347c = SystemClock.uptimeMillis();
                    this.f45348d = C12207a.m58633e(applicationContext);
                    if (Build.VERSION.SDK_INT >= 17) {
                        hVar = C11096h.m55000g((DisplayManager) applicationContext.getSystemService("display"), this.f45349e);
                    } else {
                        hVar = C11096h.m54999f(((WindowManager) applicationContext.getSystemService("window")).getDefaultDisplay().getRefreshRate(), this.f45349e);
                    }
                    hVar.mo34889h();
                    this.f45351g = this.f45350f.submit(new C12213a(applicationContext));
                } finally {
                    C12169e.m58446d();
                }
            } else {
                throw new IllegalStateException("startInitialization must be called on the main thread");
            }
        }
    }

    public C12212f(FlutterJNI flutterJNI) {
        this(flutterJNI, C11877a.m57376e().mo36133b());
    }

    public C12212f(FlutterJNI flutterJNI, ExecutorService executorService) {
        this.f45345a = false;
        this.f45349e = flutterJNI;
        this.f45350f = executorService;
    }
}
