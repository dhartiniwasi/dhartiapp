package p070j1;

import android.app.Activity;
import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.os.PowerManager;
import android.provider.Settings;
import android.util.Log;
import androidx.core.app.C0615b;
import androidx.core.app.C0665o;
import androidx.core.content.C0681a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p186ac.C6563m;
import p186ac.C6566p;

/* renamed from: j1.n */
/* compiled from: PermissionManager */
final class C4720n implements C6563m, C6566p {

    /* renamed from: a */
    private C4722b f25305a;

    /* renamed from: b */
    private Activity f25306b;

    /* renamed from: c */
    private Map<Integer, Integer> f25307c;

    /* renamed from: d */
    private boolean f25308d = false;

    @FunctionalInterface
    /* renamed from: j1.n$a */
    /* compiled from: PermissionManager */
    interface C4721a {
        /* renamed from: a */
        void mo18388a(int i);
    }

    @FunctionalInterface
    /* renamed from: j1.n$b */
    /* compiled from: PermissionManager */
    interface C4722b {
        /* renamed from: a */
        void mo18389a(Map<Integer, Integer> map);
    }

    @FunctionalInterface
    /* renamed from: j1.n$c */
    /* compiled from: PermissionManager */
    interface C4723c {
        /* renamed from: a */
        void mo18390a(boolean z);
    }

    C4720n() {
    }

    /* renamed from: a */
    private int m30465a(Context context) {
        List<String> b = C4724o.m30477b(context, 21);
        if (!(b == null || b.isEmpty())) {
            return 1;
        }
        Log.d("permissions_handler", "Bluetooth permission missing in manifest");
        return 0;
    }

    /* renamed from: b */
    private int m30466b(Context context) {
        if (Build.VERSION.SDK_INT < 33) {
            return C0665o.m3094e(context).mo2965a() ? 1 : 0;
        }
        if (context.checkSelfPermission("android.permission.POST_NOTIFICATIONS") == 0) {
            return 1;
        }
        return 0;
    }

    /* renamed from: d */
    private int m30467d(int i, Context context) {
        if (i == 17) {
            return m30466b(context);
        }
        if (i == 21) {
            return m30465a(context);
        }
        if ((i == 30 || i == 28 || i == 29) && Build.VERSION.SDK_INT < 31) {
            return m30465a(context);
        }
        List<String> b = C4724o.m30477b(context, i);
        if (b == null) {
            Log.d("permissions_handler", "No android specific permissions needed for: " + i);
            return 1;
        } else if (b.size() == 0) {
            Log.d("permissions_handler", "No permissions found in manifest for: " + b + i);
            if (i == 16 && Build.VERSION.SDK_INT < 23) {
                return 2;
            }
            if (i == 22 && Build.VERSION.SDK_INT < 30) {
                return 2;
            }
            if (Build.VERSION.SDK_INT < 23) {
                return 1;
            }
            return 0;
        } else {
            boolean z = context.getApplicationInfo().targetSdkVersion >= 23;
            for (String next : b) {
                if (z) {
                    if (i == 16) {
                        String packageName = context.getPackageName();
                        PowerManager powerManager = (PowerManager) context.getSystemService("power");
                        if (Build.VERSION.SDK_INT < 23) {
                            return 2;
                        }
                        if (powerManager == null || !powerManager.isIgnoringBatteryOptimizations(packageName)) {
                            return 0;
                        }
                        return 1;
                    } else if (i == 22) {
                        if (Build.VERSION.SDK_INT < 30) {
                            return 2;
                        }
                        return Environment.isExternalStorageManager() ? 1 : 0;
                    } else if (i == 23 && Build.VERSION.SDK_INT >= 23) {
                        return Settings.canDrawOverlays(context) ? 1 : 0;
                    } else {
                        if (i == 24 && Build.VERSION.SDK_INT >= 26) {
                            return context.getPackageManager().canRequestPackageInstalls() ? 1 : 0;
                        }
                        if (i == 27 && Build.VERSION.SDK_INT >= 23) {
                            return ((NotificationManager) context.getSystemService("notification")).isNotificationPolicyAccessGranted() ? 1 : 0;
                        }
                        if (C0681a.m3145a(context, next) != 0) {
                            return 0;
                        }
                    }
                }
            }
            return 1;
        }
    }

    /* renamed from: e */
    private void m30468e(String str, int i) {
        String packageName = this.f25306b.getPackageName();
        Intent intent = new Intent();
        intent.setAction(str);
        intent.setData(Uri.parse("package:" + packageName));
        this.f25306b.startActivityForResult(intent, i);
    }

    /* renamed from: f */
    private void m30469f(String str, int i) {
        this.f25306b.startActivityForResult(new Intent(str), i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo18383c(int i, Context context, C4721a aVar) {
        aVar.mo18388a(m30467d(i, context));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public void mo18384g(List<Integer> list, Activity activity, C4722b bVar, C4717b bVar2) {
        if (this.f25308d) {
            bVar2.mo18377a("PermissionHandler.PermissionManager", "A request for permissions is already running, please wait for it to finish before doing another request (note that you can request multiple permissions at the same time).");
        } else if (activity == null) {
            Log.d("permissions_handler", "Unable to detect current Activity.");
            bVar2.mo18377a("PermissionHandler.PermissionManager", "Unable to detect current Android Activity.");
        } else {
            this.f25305a = bVar;
            this.f25306b = activity;
            this.f25307c = new HashMap();
            ArrayList arrayList = new ArrayList();
            for (Integer next : list) {
                if (m30467d(next.intValue(), activity) != 1) {
                    List<String> b = C4724o.m30477b(activity, next.intValue());
                    if (b != null && !b.isEmpty()) {
                        int i = Build.VERSION.SDK_INT;
                        if (i >= 23 && next.intValue() == 16) {
                            m30468e("android.settings.REQUEST_IGNORE_BATTERY_OPTIMIZATIONS", 209);
                        } else if (i >= 30 && next.intValue() == 22) {
                            m30468e("android.settings.MANAGE_APP_ALL_FILES_ACCESS_PERMISSION", 210);
                        } else if (i >= 23 && next.intValue() == 23) {
                            m30468e("android.settings.action.MANAGE_OVERLAY_PERMISSION", 211);
                        } else if (i >= 26 && next.intValue() == 24) {
                            m30468e("android.settings.MANAGE_UNKNOWN_APP_SOURCES", 212);
                        } else if (i < 23 || next.intValue() != 27) {
                            arrayList.addAll(b);
                        } else {
                            m30469f("android.settings.NOTIFICATION_POLICY_ACCESS_SETTINGS", 213);
                        }
                    } else if (!this.f25307c.containsKey(next)) {
                        if (next.intValue() != 16 || Build.VERSION.SDK_INT >= 23) {
                            this.f25307c.put(next, 0);
                        } else {
                            this.f25307c.put(next, 2);
                        }
                        if (next.intValue() != 22 || Build.VERSION.SDK_INT >= 30) {
                            this.f25307c.put(next, 0);
                        } else {
                            this.f25307c.put(next, 2);
                        }
                    }
                } else if (!this.f25307c.containsKey(next)) {
                    this.f25307c.put(next, 1);
                }
            }
            String[] strArr = (String[]) arrayList.toArray(new String[0]);
            if (arrayList.size() > 0) {
                this.f25308d = true;
                C0615b.m2923u(activity, strArr, 24);
                return;
            }
            this.f25308d = false;
            if (this.f25307c.size() > 0) {
                bVar.mo18389a(this.f25307c);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public void mo18385h(int i, Activity activity, C4723c cVar, C4717b bVar) {
        if (activity == null) {
            Log.d("permissions_handler", "Unable to detect current Activity.");
            bVar.mo18377a("PermissionHandler.PermissionManager", "Unable to detect current Android Activity.");
            return;
        }
        List<String> b = C4724o.m30477b(activity, i);
        if (b == null) {
            Log.d("permissions_handler", "No android specific permissions needed for: " + i);
            cVar.mo18390a(false);
        } else if (b.isEmpty()) {
            Log.d("permissions_handler", "No permissions found in manifest for: " + i + " no need to show request rationale");
            cVar.mo18390a(false);
        } else {
            cVar.mo18390a(C0615b.m2926x(activity, b.get(0)));
        }
    }

    public boolean onActivityResult(int i, int i2, Intent intent) {
        if (i != 209 && i != 210 && i != 211 && i != 212 && i != 213) {
            return false;
        }
        boolean z = i2 == -1;
        int i3 = 23;
        if (i == 209) {
            i3 = 16;
        } else if (i == 210) {
            if (Build.VERSION.SDK_INT < 30) {
                return false;
            }
            z = Environment.isExternalStorageManager();
            i3 = 22;
        } else if (i == 211) {
            if (Build.VERSION.SDK_INT < 23) {
                return false;
            }
            z = Settings.canDrawOverlays(this.f25306b);
        } else if (i == 212) {
            if (Build.VERSION.SDK_INT < 26) {
                return false;
            }
            z = this.f25306b.getPackageManager().canRequestPackageInstalls();
            i3 = 24;
        } else if (i != 213 || Build.VERSION.SDK_INT < 23) {
            return false;
        } else {
            z = ((NotificationManager) this.f25306b.getSystemService("notification")).isNotificationPolicyAccessGranted();
            i3 = 27;
        }
        HashMap hashMap = new HashMap();
        hashMap.put(Integer.valueOf(i3), Integer.valueOf(z ? 1 : 0));
        this.f25305a.mo18389a(hashMap);
        return true;
    }

    public boolean onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        if (i != 24) {
            this.f25308d = false;
            return false;
        } else if (this.f25307c == null) {
            return false;
        } else {
            for (int i2 = 0; i2 < strArr.length; i2++) {
                String str = strArr[i2];
                int f = C4724o.m30481f(str);
                if (f != 20) {
                    int i3 = iArr[i2];
                    if (f == 7) {
                        if (!this.f25307c.containsKey(7)) {
                            this.f25307c.put(7, Integer.valueOf(C4724o.m30482g(this.f25306b, str, i3)));
                        }
                        if (!this.f25307c.containsKey(14)) {
                            this.f25307c.put(14, Integer.valueOf(C4724o.m30482g(this.f25306b, str, i3)));
                        }
                    } else if (f == 4) {
                        int g = C4724o.m30482g(this.f25306b, str, i3);
                        if (!this.f25307c.containsKey(4)) {
                            this.f25307c.put(4, Integer.valueOf(g));
                        }
                    } else if (f == 3) {
                        int g2 = C4724o.m30482g(this.f25306b, str, i3);
                        if (Build.VERSION.SDK_INT < 29 && !this.f25307c.containsKey(4)) {
                            this.f25307c.put(4, Integer.valueOf(g2));
                        }
                        if (!this.f25307c.containsKey(5)) {
                            this.f25307c.put(5, Integer.valueOf(g2));
                        }
                        this.f25307c.put(Integer.valueOf(f), Integer.valueOf(g2));
                    } else if (!this.f25307c.containsKey(Integer.valueOf(f))) {
                        this.f25307c.put(Integer.valueOf(f), Integer.valueOf(C4724o.m30482g(this.f25306b, str, i3)));
                    }
                    C4724o.m30483h(this.f25306b, f);
                }
            }
            this.f25305a.mo18389a(this.f25307c);
            this.f25308d = false;
            return true;
        }
    }
}
