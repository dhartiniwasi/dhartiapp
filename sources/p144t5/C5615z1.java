package p144t5;

import android.app.Activity;
import android.app.Application;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.DisplayCutout;
import android.view.View;
import android.view.Window;
import android.view.WindowInsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import p403y6.C13049a;
import p403y6.C13056d;

/* renamed from: t5.z1 */
/* compiled from: com.google.android.ump:user-messaging-platform@@2.0.0 */
final class C5615z1 {

    /* renamed from: a */
    private final C5612y1 f28264a;

    /* renamed from: b */
    private final Activity f28265b;

    /* renamed from: c */
    private final C13049a f28266c;

    /* renamed from: d */
    private final C13056d f28267d;

    /* synthetic */ C5615z1(C5612y1 y1Var, Activity activity, C13049a aVar, C13056d dVar, C5609x1 x1Var) {
        this.f28264a = y1Var;
        this.f28265b = activity;
        this.f28266c = aVar;
        this.f28267d = dVar;
    }

    /* renamed from: a */
    static /* synthetic */ C5605w0 m33703a(C5615z1 z1Var) throws C5600u1 {
        List<C5590r0> list;
        String str;
        List<C5596t0> list2;
        PackageInfo packageInfo;
        long j;
        Window window;
        View view;
        WindowInsets windowInsets;
        DisplayCutout displayCutout;
        Bundle bundle;
        C5605w0 w0Var = new C5605w0();
        String c = z1Var.f28267d.mo38088c();
        String str2 = null;
        if (TextUtils.isEmpty(c)) {
            try {
                bundle = z1Var.f28264a.f28248a.getPackageManager().getApplicationInfo(z1Var.f28264a.f28248a.getPackageName(), 128).metaData;
            } catch (PackageManager.NameNotFoundException unused) {
                bundle = null;
            }
            if (bundle != null) {
                c = bundle.getString("com.google.android.gms.ads.APPLICATION_ID");
            }
            if (TextUtils.isEmpty(c)) {
                throw new C5600u1(3, "The UMP SDK requires a valid application ID in your AndroidManifest.xml through a com.google.android.gms.ads.APPLICATION_ID meta-data tag.\nExample AndroidManifest:\n    <meta-data\n        android:name=\"com.google.android.gms.ads.APPLICATION_ID\"\n        android:value=\"ca-app-pub-0000000000000000~0000000000\">");
            }
        }
        w0Var.f28222a = c;
        C5527a a = z1Var.f28264a.f28249b.mo19834a();
        if (a != null) {
            w0Var.f28224c = a.f28044a;
            w0Var.f28223b = Boolean.valueOf(a.f28045b);
        }
        if (!z1Var.f28266c.mo38082b()) {
            list = Collections.emptyList();
        } else {
            list = new ArrayList<>();
            int a2 = z1Var.f28266c.mo38081a();
            if (a2 == 1) {
                list.add(C5590r0.GEO_OVERRIDE_EEA);
            } else if (a2 == 2) {
                list.add(C5590r0.GEO_OVERRIDE_NON_EEA);
            }
            list.add(C5590r0.PREVIEWING_DEBUG_MESSAGES);
        }
        w0Var.f28232k = list;
        w0Var.f28228g = z1Var.f28264a.f28250c.mo19880b();
        w0Var.f28227f = Boolean.valueOf(z1Var.f28267d.mo38087b());
        int i = Build.VERSION.SDK_INT;
        if (i >= 21) {
            str = Locale.getDefault().toLanguageTag();
        } else {
            str = Locale.getDefault().toString();
        }
        w0Var.f28226e = str;
        C5593s0 s0Var = new C5593s0();
        s0Var.f28204b = Integer.valueOf(i);
        s0Var.f28203a = Build.MODEL;
        s0Var.f28205c = 2;
        w0Var.f28225d = s0Var;
        Configuration configuration = z1Var.f28264a.f28248a.getResources().getConfiguration();
        z1Var.f28264a.f28248a.getResources().getConfiguration();
        C5599u0 u0Var = new C5599u0();
        u0Var.f28212a = Integer.valueOf(configuration.screenWidthDp);
        u0Var.f28213b = Integer.valueOf(configuration.screenHeightDp);
        u0Var.f28214c = Double.valueOf((double) z1Var.f28264a.f28248a.getResources().getDisplayMetrics().density);
        if (i < 28) {
            list2 = Collections.emptyList();
        } else {
            Activity activity = z1Var.f28265b;
            if (activity == null) {
                window = null;
            } else {
                window = activity.getWindow();
            }
            if (window == null) {
                view = null;
            } else {
                view = window.getDecorView();
            }
            if (view == null) {
                windowInsets = null;
            } else {
                windowInsets = view.getRootWindowInsets();
            }
            if (windowInsets == null) {
                displayCutout = null;
            } else {
                displayCutout = windowInsets.getDisplayCutout();
            }
            if (displayCutout == null) {
                list2 = Collections.emptyList();
            } else {
                displayCutout.getSafeInsetBottom();
                ArrayList arrayList = new ArrayList();
                for (Rect next : displayCutout.getBoundingRects()) {
                    if (next != null) {
                        C5596t0 t0Var = new C5596t0();
                        t0Var.f28208b = Integer.valueOf(next.left);
                        t0Var.f28209c = Integer.valueOf(next.right);
                        t0Var.f28207a = Integer.valueOf(next.top);
                        t0Var.f28210d = Integer.valueOf(next.bottom);
                        arrayList.add(t0Var);
                    }
                }
                list2 = arrayList;
            }
        }
        u0Var.f28215d = list2;
        w0Var.f28229h = u0Var;
        Application a3 = z1Var.f28264a.f28248a;
        try {
            packageInfo = z1Var.f28264a.f28248a.getPackageManager().getPackageInfo(a3.getPackageName(), 0);
        } catch (PackageManager.NameNotFoundException unused2) {
            packageInfo = null;
        }
        C5587q0 q0Var = new C5587q0();
        q0Var.f28190a = a3.getPackageName();
        CharSequence applicationLabel = z1Var.f28264a.f28248a.getPackageManager().getApplicationLabel(z1Var.f28264a.f28248a.getApplicationInfo());
        if (applicationLabel != null) {
            str2 = applicationLabel.toString();
        }
        q0Var.f28191b = str2;
        if (packageInfo != null) {
            if (Build.VERSION.SDK_INT >= 28) {
                j = packageInfo.getLongVersionCode();
            } else {
                j = (long) packageInfo.versionCode;
            }
            q0Var.f28192c = Long.toString(j);
        }
        w0Var.f28230i = q0Var;
        C5602v0 v0Var = new C5602v0();
        v0Var.f28218a = "2.0.0";
        w0Var.f28231j = v0Var;
        return w0Var;
    }
}
