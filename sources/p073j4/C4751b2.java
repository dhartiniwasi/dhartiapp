package p073j4;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.AlertDialog;
import android.app.KeyguardManager;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.PowerManager;
import android.os.Process;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.webkit.WebResourceResponse;
import androidx.browser.customtabs.C0584d;
import com.google.android.gms.ads.nativead.NativeAdView;
import com.google.android.gms.internal.ads.C2344ez;
import com.google.android.gms.internal.ads.C2679nz;
import com.google.android.gms.internal.ads.b53;
import com.google.android.gms.internal.ads.cf3;
import com.google.android.gms.internal.ads.dn0;
import com.google.android.gms.internal.ads.is2;
import com.google.android.gms.internal.ads.lf3;
import com.google.android.gms.internal.ads.ls2;
import com.google.android.gms.internal.ads.m00;
import com.google.android.gms.internal.ads.mh0;
import com.google.android.gms.internal.ads.ms0;
import com.google.android.gms.internal.ads.n10;
import com.google.android.gms.internal.ads.om0;
import com.google.android.gms.internal.ads.p44;
import com.google.android.gms.internal.ads.pm0;
import com.google.android.gms.internal.ads.ps1;
import com.google.android.gms.internal.ads.tt0;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;
import p023c4.C1876n;
import p039e4.C4239b;
import p053g4.C4409t;
import p060h4.C4584t;
import p060h4.C4596v;
import p067i5.C4693g;
import p081k5.C4888c;

/* renamed from: j4.b2 */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class C4751b2 {

    /* renamed from: i */
    public static final b53 f25403i = new C4797o1(Looper.getMainLooper());

    /* renamed from: a */
    private final AtomicReference f25404a = new AtomicReference((Object) null);

    /* renamed from: b */
    private final AtomicReference f25405b = new AtomicReference((Object) null);
    /* access modifiers changed from: private */

    /* renamed from: c */
    public boolean f25406c = true;

    /* renamed from: d */
    private final Object f25407d = new Object();

    /* renamed from: e */
    private String f25408e;

    /* renamed from: f */
    private boolean f25409f = false;

    /* renamed from: g */
    private boolean f25410g = false;

    /* renamed from: h */
    private final Executor f25411h = Executors.newSingleThreadExecutor();

    /* renamed from: C */
    public static void m30590C(Runnable runnable) {
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            runnable.run();
        } else {
            dn0.f8325a.execute(runnable);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:8:0x0016 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0017  */
    /* renamed from: I */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean m30591I(android.view.View r2) {
        /*
            android.view.View r2 = r2.getRootView()
            r0 = 0
            if (r2 != 0) goto L_0x0009
        L_0x0007:
            r2 = r0
            goto L_0x0013
        L_0x0009:
            android.content.Context r2 = r2.getContext()
            boolean r1 = r2 instanceof android.app.Activity
            if (r1 == 0) goto L_0x0007
            android.app.Activity r2 = (android.app.Activity) r2
        L_0x0013:
            r1 = 0
            if (r2 != 0) goto L_0x0017
            return r1
        L_0x0017:
            android.view.Window r2 = r2.getWindow()
            if (r2 != 0) goto L_0x001e
            goto L_0x0022
        L_0x001e:
            android.view.WindowManager$LayoutParams r0 = r2.getAttributes()
        L_0x0022:
            if (r0 == 0) goto L_0x002d
            int r2 = r0.flags
            r0 = 524288(0x80000, float:7.34684E-40)
            r2 = r2 & r0
            if (r2 == 0) goto L_0x002d
            r2 = 1
            return r2
        L_0x002d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p073j4.C4751b2.m30591I(android.view.View):boolean");
    }

    /* renamed from: J */
    public static final void m30592J(Context context, Intent intent) {
        Bundle bundle;
        if (intent != null) {
            if (intent.getExtras() != null) {
                bundle = intent.getExtras();
            } else {
                bundle = new Bundle();
            }
            bundle.putBinder("android.support.customtabs.extra.SESSION", (IBinder) null);
            bundle.putString("com.android.browser.application_id", context.getPackageName());
            intent.putExtras(bundle);
        }
    }

    /* renamed from: K */
    public static final ViewGroup.LayoutParams m30593K() {
        return new ViewGroup.LayoutParams(-1, -1);
    }

    /* renamed from: L */
    public static final String m30594L(Context context) {
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        return m30627v(m30626u(context));
    }

    /* renamed from: M */
    static final String m30595M() {
        StringBuilder sb = new StringBuilder(256);
        sb.append("Mozilla/5.0 (Linux; U; Android");
        String str = Build.VERSION.RELEASE;
        if (str != null) {
            sb.append(" ");
            sb.append(str);
        }
        sb.append("; ");
        sb.append(Locale.getDefault());
        String str2 = Build.DEVICE;
        if (str2 != null) {
            sb.append("; ");
            sb.append(str2);
            String str3 = Build.DISPLAY;
            if (str3 != null) {
                sb.append(" Build/");
                sb.append(str3);
            }
        }
        sb.append(") AppleWebKit/533 Version/4.0 Safari/533");
        return sb.toString();
    }

    /* renamed from: N */
    public static final String m30596N() {
        String str = Build.MANUFACTURER;
        String str2 = Build.MODEL;
        if (str2.startsWith(str)) {
            return str2;
        }
        return str + " " + str2;
    }

    /* renamed from: O */
    public static final DisplayMetrics m30597O(WindowManager windowManager) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        windowManager.getDefaultDisplay().getMetrics(displayMetrics);
        return displayMetrics;
    }

    /* renamed from: P */
    protected static final int[] m30598P() {
        return new int[]{0, 0};
    }

    /* renamed from: Q */
    public static final long m30599Q(View view) {
        float f;
        int i;
        float f2 = Float.MAX_VALUE;
        Object obj = view;
        do {
            f = 0.0f;
            if (!(obj instanceof View)) {
                break;
            }
            View view2 = (View) obj;
            f2 = Math.min(f2, view2.getAlpha());
            i = (f2 > 0.0f ? 1 : (f2 == 0.0f ? 0 : -1));
            obj = view2.getParent();
        } while (i > 0);
        if (f2 >= 0.0f) {
            f = f2;
        }
        return (long) Math.round(f * 100.0f);
    }

    /* renamed from: R */
    public static final WebResourceResponse m30600R(Context context, String str, String str2) {
        try {
            HashMap hashMap = new HashMap();
            hashMap.put("User-Agent", C4409t.m29326r().mo18438z(context, str));
            hashMap.put("Cache-Control", "max-stale=3600");
            String str3 = (String) new C4802q0(context).mo18525b(0, str2, hashMap, (byte[]) null).get(60, TimeUnit.SECONDS);
            if (str3 != null) {
                return new WebResourceResponse("application/javascript", "UTF-8", new ByteArrayInputStream(str3.getBytes("UTF-8")));
            }
        } catch (IOException | InterruptedException | ExecutionException | TimeoutException e) {
            pm0.m18668h("Could not fetch MRAID JS.", e);
        }
        return null;
    }

    /* renamed from: S */
    public static final String m30601S() {
        Resources d = C4409t.m29325q().mo15114d();
        return d != null ? d.getString(C4239b.f23611n) : "Test Ad";
    }

    /* renamed from: T */
    public static final C4811t0 m30602T(Context context) {
        try {
            Object newInstance = context.getClassLoader().loadClass("com.google.android.gms.ads.internal.util.WorkManagerUtil").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            if (!(newInstance instanceof IBinder)) {
                pm0.m18664d("Instantiated WorkManagerUtil not instance of IBinder.");
                return null;
            }
            IBinder iBinder = (IBinder) newInstance;
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.util.IWorkManagerUtil");
            return queryLocalInterface instanceof C4811t0 ? (C4811t0) queryLocalInterface : new C4805r0(iBinder);
        } catch (Exception e) {
            C4409t.m29325q().mo15126t(e, "Failed to instantiate WorkManagerUtil");
            return null;
        }
    }

    /* renamed from: U */
    public static final boolean m30603U(Context context, String str) {
        Context a = mh0.m16529a(context);
        return C4888c.m31075a(a).mo18669b(str, a.getPackageName()) == 0;
    }

    /* renamed from: V */
    public static final boolean m30604V(String str) {
        if (!om0.m17944l()) {
            return false;
        }
        if (!((Boolean) C4596v.m30088c().mo12227b(C2679nz.f14522c4)).booleanValue()) {
            return false;
        }
        String str2 = (String) C4596v.m30088c().mo12227b(C2679nz.f14542e4);
        if (!str2.isEmpty()) {
            for (String equals : str2.split(";")) {
                if (equals.equals(str)) {
                    return false;
                }
            }
        }
        String str3 = (String) C4596v.m30088c().mo12227b(C2679nz.f14532d4);
        if (str3.isEmpty()) {
            return true;
        }
        for (String equals2 : str3.split(";")) {
            if (equals2.equals(str)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: W */
    public static final boolean m30605W(Context context) {
        KeyguardManager t;
        if (context == null || (t = m30625t(context)) == null || !t.isKeyguardLocked()) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static final boolean m30606a(Context context) {
        try {
            context.getClassLoader().loadClass("com.google.android.gms.ads.internal.ClientApi");
            return false;
        } catch (ClassNotFoundException unused) {
            return true;
        } catch (Throwable th) {
            pm0.m18665e("Error loading class.", th);
            C4409t.m29325q().mo15126t(th, "AdUtil.isLiteSdk");
            return false;
        }
    }

    /* renamed from: b */
    public static final boolean m30607b() {
        int myUid = Process.myUid();
        return myUid == 0 || myUid == 1000;
    }

    /* renamed from: c */
    public static final boolean m30608c(Context context) {
        try {
            ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
            KeyguardManager keyguardManager = (KeyguardManager) context.getSystemService("keyguard");
            if (activityManager != null) {
                if (keyguardManager != null) {
                    List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = activityManager.getRunningAppProcesses();
                    if (runningAppProcesses == null) {
                        return false;
                    }
                    for (ActivityManager.RunningAppProcessInfo next : runningAppProcesses) {
                        if (Process.myPid() == next.pid) {
                            if (next.importance != 100 || keyguardManager.inKeyguardRestrictedInputMode()) {
                                return true;
                            }
                            PowerManager powerManager = (PowerManager) context.getSystemService("power");
                            if (powerManager == null) {
                                return true;
                            }
                            if (powerManager.isScreenOn()) {
                                return false;
                            }
                            return true;
                        }
                    }
                    return true;
                }
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    /* renamed from: d */
    public static final boolean m30609d(Context context) {
        Bundle u = m30626u(context);
        return TextUtils.isEmpty(m30627v(u)) && !TextUtils.isEmpty(u.getString("com.google.android.gms.ads.INTEGRATION_MANAGER"));
    }

    /* renamed from: e */
    public static final boolean m30610e(Context context) {
        Window window;
        if (!(!(context instanceof Activity) || (window = ((Activity) context).getWindow()) == null || window.getDecorView() == null)) {
            Rect rect = new Rect();
            Rect rect2 = new Rect();
            window.getDecorView().getGlobalVisibleRect(rect, (Point) null);
            window.getDecorView().getWindowVisibleDisplayFrame(rect2);
            if (rect.bottom == 0 || rect2.bottom == 0 || rect.top != rect2.top) {
                return false;
            }
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public static final void m30611f(View view, int i, MotionEvent motionEvent) {
        int i2;
        String str;
        int i3;
        int i4;
        String str2;
        is2 i0;
        View view2 = view;
        int[] iArr = new int[2];
        Rect rect = new Rect();
        try {
            String packageName = view.getContext().getPackageName();
            if (view2 instanceof ps1) {
                view2 = ((ps1) view2).getChildAt(0);
            }
            if ((view2 instanceof C1876n) || (view2 instanceof NativeAdView)) {
                str = "NATIVE";
                i2 = 1;
            } else {
                str = "UNKNOWN";
                i2 = 0;
            }
            if (view2.getLocalVisibleRect(rect)) {
                i3 = rect.width();
                i4 = rect.height();
            } else {
                i4 = 0;
                i3 = 0;
            }
            C4409t.m29326r();
            long Q = m30599Q(view2);
            view2.getLocationOnScreen(iArr);
            int i5 = iArr[0];
            int i6 = iArr[1];
            String str3 = "none";
            if (view2 instanceof tt0) {
                ls2 P0 = ((tt0) view2).mo12089P0();
                if (P0 != null) {
                    str2 = P0.f12930b;
                    int hashCode = view2.hashCode();
                    view2.setContentDescription(str2 + ":" + hashCode);
                    if ((view2 instanceof ms0) && (i0 = ((ms0) view2).mo12114i0()) != null) {
                        str = is2.m14541a(i0.f10970b);
                        i2 = i0.f10978f;
                        str3 = i0.f10947F;
                    }
                    pm0.m18666f(String.format(Locale.US, "<Ad hashCode=%d, package=%s, adNetCls=%s, gwsQueryId=%s, format=%s, impType=%d, class=%s, x=%d, y=%d, width=%d, height=%d, vWidth=%d, vHeight=%d, alpha=%d, state=%s>", new Object[]{Integer.valueOf(view2.hashCode()), packageName, str3, str2, str, Integer.valueOf(i2), view2.getClass().getName(), Integer.valueOf(i5), Integer.valueOf(i6), Integer.valueOf(view2.getWidth()), Integer.valueOf(view2.getHeight()), Integer.valueOf(i3), Integer.valueOf(i4), Long.valueOf(Q), Integer.toString(i, 2)}));
                }
            }
            str2 = str3;
            str = is2.m14541a(i0.f10970b);
            i2 = i0.f10978f;
            str3 = i0.f10947F;
            pm0.m18666f(String.format(Locale.US, "<Ad hashCode=%d, package=%s, adNetCls=%s, gwsQueryId=%s, format=%s, impType=%d, class=%s, x=%d, y=%d, width=%d, height=%d, vWidth=%d, vHeight=%d, alpha=%d, state=%s>", new Object[]{Integer.valueOf(view2.hashCode()), packageName, str3, str2, str, Integer.valueOf(i2), view2.getClass().getName(), Integer.valueOf(i5), Integer.valueOf(i6), Integer.valueOf(view2.getWidth()), Integer.valueOf(view2.getHeight()), Integer.valueOf(i3), Integer.valueOf(i4), Long.valueOf(Q), Integer.toString(i, 2)}));
        } catch (Exception e) {
            pm0.m18665e("Failure getting view location.", e);
        }
    }

    /* renamed from: g */
    public static final AlertDialog.Builder m30612g(Context context) {
        return new AlertDialog.Builder(context, C4409t.m29327s().mo18419a());
    }

    /* renamed from: h */
    public static final void m30613h(Context context, String str, String str2) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add(str2);
        for (String a1Var : arrayList) {
            new C4746a1(context, str, a1Var).mo15227b();
        }
    }

    /* renamed from: i */
    public static final void m30614i(Context context, Throwable th) {
        if (context != null) {
            try {
                if (((Boolean) n10.f13751b.mo13438e()).booleanValue()) {
                    C4693g.m30387a(context, th);
                }
            } catch (IllegalStateException unused) {
            }
        }
    }

    /* renamed from: j */
    public static final void m30615j(Context context, Intent intent) {
        try {
            context.startActivity(intent);
        } catch (Throwable unused) {
            intent.addFlags(268435456);
            context.startActivity(intent);
        }
    }

    /* renamed from: k */
    public static final int m30616k(String str) {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException e) {
            pm0.m18667g("Could not parse value:".concat(e.toString()));
            return 0;
        }
    }

    /* renamed from: l */
    public static final Map m30617l(Uri uri) {
        if (uri == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        for (String next : uri.getQueryParameterNames()) {
            if (!TextUtils.isEmpty(next)) {
                hashMap.put(next, uri.getQueryParameter(next));
            }
        }
        return hashMap;
    }

    /* renamed from: m */
    public static final WebResourceResponse m30618m(HttpURLConnection httpURLConnection) throws IOException {
        String str;
        C4409t.m29326r();
        String contentType = httpURLConnection.getContentType();
        String str2 = "";
        if (TextUtils.isEmpty(contentType)) {
            str = str2;
        } else {
            str = contentType.split(";")[0].trim();
        }
        C4409t.m29326r();
        String contentType2 = httpURLConnection.getContentType();
        if (!TextUtils.isEmpty(contentType2)) {
            String[] split = contentType2.split(";");
            if (split.length != 1) {
                int i = 1;
                while (true) {
                    if (i >= split.length) {
                        break;
                    }
                    if (split[i].trim().startsWith("charset")) {
                        String[] split2 = split[i].trim().split("=");
                        if (split2.length > 1) {
                            str2 = split2[1].trim();
                            break;
                        }
                    }
                    i++;
                }
            }
        }
        String str3 = str2;
        Map headerFields = httpURLConnection.getHeaderFields();
        HashMap hashMap = new HashMap(headerFields.size());
        for (Map.Entry entry : headerFields.entrySet()) {
            if (!(entry.getKey() == null || entry.getValue() == null || ((List) entry.getValue()).isEmpty())) {
                hashMap.put((String) entry.getKey(), (String) ((List) entry.getValue()).get(0));
            }
        }
        return C4409t.m29327s().mo18421c(str, str3, httpURLConnection.getResponseCode(), httpURLConnection.getResponseMessage(), hashMap, httpURLConnection.getInputStream());
    }

    /* renamed from: n */
    public static final int[] m30619n(Activity activity) {
        View findViewById;
        Window window = activity.getWindow();
        if (window == null || (findViewById = window.findViewById(16908290)) == null) {
            return m30598P();
        }
        return new int[]{findViewById.getWidth(), findViewById.getHeight()};
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0009, code lost:
        r0 = r0.findViewById(16908290);
     */
    /* renamed from: o */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final int[] m30620o(android.app.Activity r6) {
        /*
            android.view.Window r0 = r6.getWindow()
            r1 = 2
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L_0x0021
            r4 = 16908290(0x1020002, float:2.3877235E-38)
            android.view.View r0 = r0.findViewById(r4)
            if (r0 == 0) goto L_0x0021
            int[] r4 = new int[r1]
            int r5 = r0.getTop()
            r4[r3] = r5
            int r0 = r0.getBottom()
            r4[r2] = r0
            goto L_0x0025
        L_0x0021:
            int[] r4 = m30598P()
        L_0x0025:
            int[] r0 = new int[r1]
            com.google.android.gms.internal.ads.im0 r1 = p060h4.C4584t.m30036b()
            r5 = r4[r3]
            int r1 = r1.mo11157d(r6, r5)
            r0[r3] = r1
            com.google.android.gms.internal.ads.im0 r1 = p060h4.C4584t.m30036b()
            r3 = r4[r2]
            int r6 = r1.mo11157d(r6, r3)
            r0[r2] = r6
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p073j4.C4751b2.m30620o(android.app.Activity):int[]");
    }

    /* renamed from: p */
    public static final boolean m30621p(View view, PowerManager powerManager, KeyguardManager keyguardManager) {
        boolean z = C4409t.m29326r().f25406c || keyguardManager == null || !keyguardManager.inKeyguardRestrictedInputMode() || m30591I(view);
        long Q = m30599Q(view);
        if (view.getVisibility() == 0 && view.isShown() && ((powerManager == null || powerManager.isScreenOn()) && z)) {
            if (!((Boolean) C4596v.m30088c().mo12227b(C2679nz.f14539e1)).booleanValue() || view.getLocalVisibleRect(new Rect()) || view.getGlobalVisibleRect(new Rect())) {
                if (!((Boolean) C4596v.m30088c().mo12227b(C2679nz.f14636n8)).booleanValue()) {
                    return true;
                }
                if (Q < ((long) ((Integer) C4596v.m30088c().mo12227b(C2679nz.f14656p8)).intValue())) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    /* renamed from: q */
    public static final void m30622q(Context context, Uri uri) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW", uri);
            Bundle bundle = new Bundle();
            intent.putExtras(bundle);
            m30592J(context, intent);
            bundle.putString("com.android.browser.application_id", context.getPackageName());
            context.startActivity(intent);
            String uri2 = uri.toString();
            pm0.m18662b("Opening " + uri2 + " in a new browser.");
        } catch (ActivityNotFoundException e) {
            pm0.m18665e("No browser is found.", e);
        }
    }

    /* renamed from: r */
    public static final int[] m30623r(Activity activity) {
        int[] n = m30619n(activity);
        return new int[]{C4584t.m30036b().mo11157d(activity, n[0]), C4584t.m30036b().mo11157d(activity, n[1])};
    }

    /* renamed from: s */
    public static final boolean m30624s(View view, Context context) {
        Context applicationContext = context.getApplicationContext();
        return m30621p(view, applicationContext != null ? (PowerManager) applicationContext.getSystemService("power") : null, m30625t(context));
    }

    /* renamed from: t */
    private static KeyguardManager m30625t(Context context) {
        Object systemService = context.getSystemService("keyguard");
        if (systemService == null || !(systemService instanceof KeyguardManager)) {
            return null;
        }
        return (KeyguardManager) systemService;
    }

    /* renamed from: u */
    private static Bundle m30626u(Context context) {
        try {
            return C4888c.m31075a(context).mo18670c(context.getPackageName(), 128).metaData;
        } catch (PackageManager.NameNotFoundException | NullPointerException e) {
            C4794n1.m30694l("Error getting metadata", e);
            return null;
        }
    }

    /* renamed from: v */
    private static String m30627v(Bundle bundle) {
        if (bundle == null) {
            return "";
        }
        String string = bundle.getString("com.google.android.gms.ads.APPLICATION_ID");
        if (TextUtils.isEmpty(string)) {
            return "";
        }
        if (string.matches("^ca-app-pub-[0-9]{16}~[0-9]{10}$") || string.matches("^/\\d+~.+$")) {
            return string;
        }
        return "";
    }

    /* renamed from: w */
    private static boolean m30628w(String str, AtomicReference atomicReference, String str2) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            Pattern pattern = (Pattern) atomicReference.get();
            if (pattern == null || !str2.equals(pattern.pattern())) {
                pattern = Pattern.compile(str2);
                atomicReference.set(pattern);
            }
            return pattern.matcher(str).matches();
        } catch (PatternSyntaxException unused) {
            return false;
        }
    }

    /* renamed from: x */
    public static int m30629x(int i) {
        if (i >= 5000) {
            return i;
        }
        if (i <= 0) {
            return 60000;
        }
        pm0.m18667g("HTTP timeout too low: " + i + " milliseconds. Reverting to default timeout: 60000 milliseconds.");
        return 60000;
    }

    /* renamed from: B */
    public final void mo18431B(Context context, String str, boolean z, HttpURLConnection httpURLConnection, boolean z2, int i) {
        int x = m30629x(i);
        pm0.m18666f("HTTP timeout: " + x + " milliseconds.");
        httpURLConnection.setConnectTimeout(x);
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setReadTimeout(x);
        httpURLConnection.setRequestProperty("User-Agent", mo18438z(context, str));
        httpURLConnection.setUseCaches(false);
    }

    /* renamed from: D */
    public final boolean mo18432D(String str) {
        return m30628w(str, this.f25404a, (String) C4596v.m30088c().mo12227b(C2679nz.f14488Z));
    }

    /* renamed from: E */
    public final boolean mo18433E(String str) {
        return m30628w(str, this.f25405b, (String) C4596v.m30088c().mo12227b(C2679nz.f14498a0));
    }

    /* renamed from: F */
    public final boolean mo18434F(Context context) {
        if (this.f25410g) {
            return false;
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.google.android.ads.intent.DEBUG_LOGGING_ENABLEMENT_CHANGED");
        C2679nz.m17343c(context);
        if (!((Boolean) C4596v.m30088c().mo12227b(C2679nz.f14291E8)).booleanValue() || Build.VERSION.SDK_INT < 33) {
            context.getApplicationContext().registerReceiver(new C4827y1(this, (C4824x1) null), intentFilter);
        } else {
            context.getApplicationContext().registerReceiver(new C4827y1(this, (C4824x1) null), intentFilter, 4);
        }
        this.f25410g = true;
        return true;
    }

    /* renamed from: G */
    public final boolean mo18435G(Context context) {
        if (this.f25409f) {
            return false;
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.USER_PRESENT");
        intentFilter.addAction("android.intent.action.SCREEN_OFF");
        C2679nz.m17343c(context);
        if (!((Boolean) C4596v.m30088c().mo12227b(C2679nz.f14291E8)).booleanValue() || Build.VERSION.SDK_INT < 33) {
            context.getApplicationContext().registerReceiver(new C4747a2(this, (C4830z1) null), intentFilter);
        } else {
            context.getApplicationContext().registerReceiver(new C4747a2(this, (C4830z1) null), intentFilter, 4);
        }
        this.f25409f = true;
        return true;
    }

    /* renamed from: H */
    public final int mo18436H(Context context, Uri uri) {
        int i;
        if (context == null) {
            C4794n1.m30693k("Trying to open chrome custom tab on a null context");
            return 3;
        }
        if (!(context instanceof Activity)) {
            C4794n1.m30693k("Chrome Custom Tabs can only work with Activity context.");
            i = 2;
        } else {
            i = 0;
        }
        C2344ez ezVar = C2679nz.f14326I3;
        C2344ez ezVar2 = C2679nz.f14336J3;
        if (true == ((Boolean) C4596v.m30088c().mo12227b(ezVar)).equals(C4596v.m30088c().mo12227b(ezVar2))) {
            i = 9;
        }
        if (i != 0) {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(uri);
            intent.addFlags(268435456);
            context.startActivity(intent);
            return i;
        }
        if (((Boolean) C4596v.m30088c().mo12227b(ezVar)).booleanValue()) {
            m00 m00 = new m00();
            m00.mo12241e(new C4821w1(this, m00, context, uri));
            m00.mo12238b((Activity) context);
        }
        if (!((Boolean) C4596v.m30088c().mo12227b(ezVar2)).booleanValue()) {
            return 5;
        }
        C0584d b = new C0584d.C0585a().mo2688b();
        b.f1914a.setPackage(p44.m18330a(context));
        b.mo2686a(context, uri);
        return 5;
    }

    /* renamed from: y */
    public final lf3 mo18437y(Uri uri) {
        return cf3.m10913k(new C4815u1(uri), this.f25411h);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(14:11|12|(1:14)(3:15|(1:17)(1:18)|19)|20|21|22|(1:24)|25|(1:27)|28|(3:29|30|(1:32))|36|37|38) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0045 */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x004d A[Catch:{ Exception -> 0x0099 }] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x005b A[Catch:{ Exception -> 0x0099 }] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0083 A[Catch:{ Exception -> 0x0099 }] */
    /* renamed from: z */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String mo18438z(android.content.Context r5, java.lang.String r6) {
        /*
            r4 = this;
            java.lang.Object r0 = r4.f25407d
            monitor-enter(r0)
            java.lang.String r1 = r4.f25408e     // Catch:{ all -> 0x00ba }
            if (r1 == 0) goto L_0x0009
            monitor-exit(r0)     // Catch:{ all -> 0x00ba }
            return r1
        L_0x0009:
            if (r6 != 0) goto L_0x0011
            java.lang.String r5 = m30595M()     // Catch:{ all -> 0x00ba }
            monitor-exit(r0)     // Catch:{ all -> 0x00ba }
            return r5
        L_0x0011:
            j4.h1 r1 = p073j4.C4774h1.m30668a()     // Catch:{ Exception -> 0x0045 }
            java.lang.String r2 = r1.f25441a     // Catch:{ Exception -> 0x0045 }
            boolean r2 = android.text.TextUtils.isEmpty(r2)     // Catch:{ Exception -> 0x0045 }
            if (r2 != 0) goto L_0x001e
            goto L_0x0041
        L_0x001e:
            boolean r2 = p067i5.C4690d.m30374a()     // Catch:{ Exception -> 0x0045 }
            if (r2 == 0) goto L_0x0030
            j4.f1 r2 = new j4.f1     // Catch:{ Exception -> 0x0045 }
            r2.<init>(r5)     // Catch:{ Exception -> 0x0045 }
            java.lang.Object r2 = p073j4.C4762e1.m30653a(r5, r2)     // Catch:{ Exception -> 0x0045 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ Exception -> 0x0045 }
            goto L_0x003f
        L_0x0030:
            android.content.Context r2 = p180z4.C6378j.m37456e(r5)     // Catch:{ Exception -> 0x0045 }
            j4.g1 r3 = new j4.g1     // Catch:{ Exception -> 0x0045 }
            r3.<init>(r2, r5)     // Catch:{ Exception -> 0x0045 }
            java.lang.Object r2 = p073j4.C4762e1.m30653a(r5, r3)     // Catch:{ Exception -> 0x0045 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ Exception -> 0x0045 }
        L_0x003f:
            r1.f25441a = r2     // Catch:{ Exception -> 0x0045 }
        L_0x0041:
            java.lang.String r1 = r1.f25441a     // Catch:{ Exception -> 0x0045 }
            r4.f25408e = r1     // Catch:{ Exception -> 0x0045 }
        L_0x0045:
            java.lang.String r1 = r4.f25408e     // Catch:{ all -> 0x00ba }
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch:{ all -> 0x00ba }
            if (r1 == 0) goto L_0x0053
            java.lang.String r1 = android.webkit.WebSettings.getDefaultUserAgent(r5)     // Catch:{ all -> 0x00ba }
            r4.f25408e = r1     // Catch:{ all -> 0x00ba }
        L_0x0053:
            java.lang.String r1 = r4.f25408e     // Catch:{ all -> 0x00ba }
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch:{ all -> 0x00ba }
            if (r1 == 0) goto L_0x0061
            java.lang.String r1 = m30595M()     // Catch:{ all -> 0x00ba }
            r4.f25408e = r1     // Catch:{ all -> 0x00ba }
        L_0x0061:
            java.lang.String r1 = r4.f25408e     // Catch:{ all -> 0x00ba }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x00ba }
            r2.<init>()     // Catch:{ all -> 0x00ba }
            r2.append(r1)     // Catch:{ all -> 0x00ba }
            java.lang.String r1 = " (Mobile; "
            r2.append(r1)     // Catch:{ all -> 0x00ba }
            r2.append(r6)     // Catch:{ all -> 0x00ba }
            java.lang.String r6 = r2.toString()     // Catch:{ all -> 0x00ba }
            r4.f25408e = r6     // Catch:{ all -> 0x00ba }
            k5.b r5 = p081k5.C4888c.m31075a(r5)     // Catch:{ Exception -> 0x0099 }
            boolean r5 = r5.mo18674g()     // Catch:{ Exception -> 0x0099 }
            if (r5 == 0) goto L_0x00a3
            java.lang.String r5 = r4.f25408e     // Catch:{ Exception -> 0x0099 }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0099 }
            r6.<init>()     // Catch:{ Exception -> 0x0099 }
            r6.append(r5)     // Catch:{ Exception -> 0x0099 }
            java.lang.String r5 = ";aia"
            r6.append(r5)     // Catch:{ Exception -> 0x0099 }
            java.lang.String r5 = r6.toString()     // Catch:{ Exception -> 0x0099 }
            r4.f25408e = r5     // Catch:{ Exception -> 0x0099 }
            goto L_0x00a3
        L_0x0099:
            r5 = move-exception
            com.google.android.gms.internal.ads.xl0 r6 = p053g4.C4409t.m29325q()     // Catch:{ all -> 0x00ba }
            java.lang.String r1 = "AdUtil.getUserAgent"
            r6.mo15126t(r5, r1)     // Catch:{ all -> 0x00ba }
        L_0x00a3:
            java.lang.String r5 = r4.f25408e     // Catch:{ all -> 0x00ba }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x00ba }
            r6.<init>()     // Catch:{ all -> 0x00ba }
            r6.append(r5)     // Catch:{ all -> 0x00ba }
            java.lang.String r5 = ")"
            r6.append(r5)     // Catch:{ all -> 0x00ba }
            java.lang.String r5 = r6.toString()     // Catch:{ all -> 0x00ba }
            r4.f25408e = r5     // Catch:{ all -> 0x00ba }
            monitor-exit(r0)     // Catch:{ all -> 0x00ba }
            return r5
        L_0x00ba:
            r5 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x00ba }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p073j4.C4751b2.mo18438z(android.content.Context, java.lang.String):java.lang.String");
    }
}
