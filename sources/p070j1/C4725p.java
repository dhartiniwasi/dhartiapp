package p070j1;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothManager;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.location.LocationManager;
import android.net.Uri;
import android.os.Build;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.Log;
import java.util.List;

/* renamed from: j1.p */
/* compiled from: ServiceManager */
final class C4725p {

    @FunctionalInterface
    /* renamed from: j1.p$a */
    /* compiled from: ServiceManager */
    interface C4726a {
        /* renamed from: a */
        void mo18392a(int i);
    }

    C4725p() {
    }

    /* renamed from: b */
    private List<ResolveInfo> m30484b(PackageManager packageManager) {
        Intent intent = new Intent("android.intent.action.CALL");
        intent.setData(Uri.parse("tel:123123"));
        if (Build.VERSION.SDK_INT >= 33) {
            return packageManager.queryIntentActivities(intent, PackageManager.ResolveInfoFlags.of(0));
        }
        return packageManager.queryIntentActivities(intent, 0);
    }

    /* renamed from: c */
    private boolean m30485c(Context context) {
        if (Build.VERSION.SDK_INT < 18) {
            return BluetoothAdapter.getDefaultAdapter().isEnabled();
        }
        return ((BluetoothManager) context.getSystemService("bluetooth")).getAdapter().isEnabled();
    }

    /* renamed from: d */
    private static boolean m30486d(Context context) {
        if (Build.VERSION.SDK_INT >= 19) {
            return false;
        }
        return !TextUtils.isEmpty(Settings.Secure.getString(context.getContentResolver(), "location_providers_allowed"));
    }

    /* renamed from: e */
    private boolean m30487e(Context context) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 28) {
            LocationManager locationManager = (LocationManager) context.getSystemService(LocationManager.class);
            if (locationManager == null) {
                return false;
            }
            return locationManager.isLocationEnabled();
        } else if (i >= 19) {
            return m30488f(context);
        } else {
            return m30486d(context);
        }
    }

    /* renamed from: f */
    private static boolean m30488f(Context context) {
        if (Build.VERSION.SDK_INT < 19) {
            return false;
        }
        try {
            if (Settings.Secure.getInt(context.getContentResolver(), "location_mode") != 0) {
                return true;
            }
            return false;
        } catch (Settings.SettingNotFoundException e) {
            e.printStackTrace();
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo18391a(int i, Context context, C4726a aVar, C4717b bVar) {
        if (context == null) {
            Log.d("permissions_handler", "Context cannot be null.");
            bVar.mo18377a("PermissionHandler.ServiceManager", "Android context cannot be null.");
        } else if (i == 3 || i == 4 || i == 5) {
            aVar.mo18392a(m30487e(context) ? 1 : 0);
        } else {
            if (i == 21) {
                aVar.mo18392a(m30485c(context) ? 1 : 0);
            }
            int i2 = 1;
            if (i == 8) {
                PackageManager packageManager = context.getPackageManager();
                if (!packageManager.hasSystemFeature("android.hardware.telephony")) {
                    aVar.mo18392a(2);
                    return;
                }
                TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
                if (telephonyManager == null || telephonyManager.getPhoneType() == 0) {
                    aVar.mo18392a(2);
                } else if (m30484b(packageManager).isEmpty()) {
                    aVar.mo18392a(2);
                } else if (telephonyManager.getSimState() != 5) {
                    aVar.mo18392a(0);
                } else {
                    aVar.mo18392a(1);
                }
            } else if (i == 16) {
                if (Build.VERSION.SDK_INT < 23) {
                    i2 = 2;
                }
                aVar.mo18392a(i2);
            } else {
                aVar.mo18392a(2);
            }
        }
    }
}
