package androidx.core.app;

import android.app.Activity;
import android.app.SharedElementCallback;
import android.content.Intent;
import android.content.IntentSender;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import androidx.core.content.C0681a;
import androidx.core.p010os.C0759a;
import java.util.Arrays;
import java.util.HashSet;

/* renamed from: androidx.core.app.b */
/* compiled from: ActivityCompat */
public class C0615b extends C0681a {

    /* renamed from: d */
    private static C0621f f2018d;

    /* renamed from: androidx.core.app.b$a */
    /* compiled from: ActivityCompat */
    class C0616a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ String[] f2019a;

        /* renamed from: b */
        final /* synthetic */ Activity f2020b;

        /* renamed from: c */
        final /* synthetic */ int f2021c;

        C0616a(String[] strArr, Activity activity, int i) {
            this.f2019a = strArr;
            this.f2020b = activity;
            this.f2021c = i;
        }

        public void run() {
            int[] iArr = new int[this.f2019a.length];
            PackageManager packageManager = this.f2020b.getPackageManager();
            String packageName = this.f2020b.getPackageName();
            int length = this.f2019a.length;
            for (int i = 0; i < length; i++) {
                iArr[i] = packageManager.checkPermission(this.f2019a[i], packageName);
            }
            ((C0620e) this.f2020b).onRequestPermissionsResult(this.f2021c, this.f2019a, iArr);
        }
    }

    /* renamed from: androidx.core.app.b$b */
    /* compiled from: ActivityCompat */
    static class C0617b {
        /* renamed from: a */
        static void m2929a(Activity activity) {
            activity.finishAffinity();
        }

        /* renamed from: b */
        static void m2930b(Activity activity, Intent intent, int i, Bundle bundle) {
            activity.startActivityForResult(intent, i, bundle);
        }

        /* renamed from: c */
        static void m2931c(Activity activity, IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) throws IntentSender.SendIntentException {
            activity.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
        }
    }

    /* renamed from: androidx.core.app.b$c */
    /* compiled from: ActivityCompat */
    static class C0618c {
        /* renamed from: a */
        static void m2932a(Activity activity) {
            activity.finishAfterTransition();
        }

        /* renamed from: b */
        static void m2933b(Activity activity) {
            activity.postponeEnterTransition();
        }

        /* renamed from: c */
        static void m2934c(Activity activity, SharedElementCallback sharedElementCallback) {
            activity.setEnterSharedElementCallback(sharedElementCallback);
        }

        /* renamed from: d */
        static void m2935d(Activity activity, SharedElementCallback sharedElementCallback) {
            activity.setExitSharedElementCallback(sharedElementCallback);
        }

        /* renamed from: e */
        static void m2936e(Activity activity) {
            activity.startPostponedEnterTransition();
        }
    }

    /* renamed from: androidx.core.app.b$d */
    /* compiled from: ActivityCompat */
    static class C0619d {
        /* renamed from: a */
        static void m2937a(Object obj) {
            ((SharedElementCallback.OnSharedElementsReadyListener) obj).onSharedElementsReady();
        }

        /* renamed from: b */
        static void m2938b(Activity activity, String[] strArr, int i) {
            activity.requestPermissions(strArr, i);
        }

        /* renamed from: c */
        static boolean m2939c(Activity activity, String str) {
            return activity.shouldShowRequestPermissionRationale(str);
        }
    }

    /* renamed from: androidx.core.app.b$e */
    /* compiled from: ActivityCompat */
    public interface C0620e {
        void onRequestPermissionsResult(int i, String[] strArr, int[] iArr);
    }

    /* renamed from: androidx.core.app.b$f */
    /* compiled from: ActivityCompat */
    public interface C0621f {
        /* renamed from: a */
        boolean mo2854a(Activity activity, String[] strArr, int i);
    }

    /* renamed from: androidx.core.app.b$g */
    /* compiled from: ActivityCompat */
    public interface C0622g {
        void validateRequestPermissionsRequestCode(int i);
    }

    /* renamed from: A */
    public static void m2916A(Activity activity) {
        if (Build.VERSION.SDK_INT >= 21) {
            C0618c.m2936e(activity);
        }
    }

    /* renamed from: p */
    public static void m2918p(Activity activity) {
        if (Build.VERSION.SDK_INT >= 16) {
            C0617b.m2929a(activity);
        } else {
            activity.finish();
        }
    }

    /* renamed from: q */
    public static void m2919q(Activity activity) {
        if (Build.VERSION.SDK_INT >= 21) {
            C0618c.m2932a(activity);
        } else {
            activity.finish();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: r */
    public static /* synthetic */ void m2920r(Activity activity) {
        if (!activity.isFinishing() && !C0624d.m2949i(activity)) {
            activity.recreate();
        }
    }

    /* renamed from: s */
    public static void m2921s(Activity activity) {
        if (Build.VERSION.SDK_INT >= 21) {
            C0618c.m2933b(activity);
        }
    }

    /* renamed from: t */
    public static void m2922t(Activity activity) {
        if (Build.VERSION.SDK_INT >= 28) {
            activity.recreate();
        } else {
            new Handler(activity.getMainLooper()).post(new C0614a(activity));
        }
    }

    /* renamed from: u */
    public static void m2923u(Activity activity, String[] strArr, int i) {
        C0621f fVar = f2018d;
        if (fVar == null || !fVar.mo2854a(activity, strArr, i)) {
            HashSet hashSet = new HashSet();
            int i2 = 0;
            while (i2 < strArr.length) {
                if (!TextUtils.isEmpty(strArr[i2])) {
                    if (!C0759a.m3507d() && TextUtils.equals(strArr[i2], "android.permission.POST_NOTIFICATIONS")) {
                        hashSet.add(Integer.valueOf(i2));
                    }
                    i2++;
                } else {
                    throw new IllegalArgumentException("Permission request for permissions " + Arrays.toString(strArr) + " must not contain null or empty values");
                }
            }
            int size = hashSet.size();
            String[] strArr2 = size > 0 ? new String[(strArr.length - size)] : strArr;
            if (size > 0) {
                if (size != strArr.length) {
                    int i3 = 0;
                    for (int i4 = 0; i4 < strArr.length; i4++) {
                        if (!hashSet.contains(Integer.valueOf(i4))) {
                            strArr2[i3] = strArr[i4];
                            i3++;
                        }
                    }
                } else {
                    return;
                }
            }
            if (Build.VERSION.SDK_INT >= 23) {
                if (activity instanceof C0622g) {
                    ((C0622g) activity).validateRequestPermissionsRequestCode(i);
                }
                C0619d.m2938b(activity, strArr, i);
            } else if (activity instanceof C0620e) {
                new Handler(Looper.getMainLooper()).post(new C0616a(strArr2, activity, i));
            }
        }
    }

    /* renamed from: v */
    public static void m2924v(Activity activity, C0678s sVar) {
        if (Build.VERSION.SDK_INT >= 21) {
            C0618c.m2934c(activity, (SharedElementCallback) null);
        }
    }

    /* renamed from: w */
    public static void m2925w(Activity activity, C0678s sVar) {
        if (Build.VERSION.SDK_INT >= 21) {
            C0618c.m2935d(activity, (SharedElementCallback) null);
        }
    }

    /* renamed from: x */
    public static boolean m2926x(Activity activity, String str) {
        if ((C0759a.m3507d() || !TextUtils.equals("android.permission.POST_NOTIFICATIONS", str)) && Build.VERSION.SDK_INT >= 23) {
            return C0619d.m2939c(activity, str);
        }
        return false;
    }

    /* renamed from: y */
    public static void m2927y(Activity activity, Intent intent, int i, Bundle bundle) {
        if (Build.VERSION.SDK_INT >= 16) {
            C0617b.m2930b(activity, intent, i, bundle);
        } else {
            activity.startActivityForResult(intent, i);
        }
    }

    /* renamed from: z */
    public static void m2928z(Activity activity, IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) throws IntentSender.SendIntentException {
        if (Build.VERSION.SDK_INT >= 16) {
            C0617b.m2931c(activity, intentSender, i, intent, i2, i3, i4, bundle);
        } else {
            activity.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4);
        }
    }
}
