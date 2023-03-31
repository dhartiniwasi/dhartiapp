package p070j1;

import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Environment;
import android.util.Log;
import androidx.core.app.C0615b;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* renamed from: j1.o */
/* compiled from: PermissionUtils */
public class C4724o {
    /* renamed from: a */
    private static String m30476a(Context context, String str) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 31 && m30479d(context, (ArrayList<String>) null, str)) {
            return str;
        }
        if (i < 29) {
            if (m30479d(context, (ArrayList<String>) null, "android.permission.ACCESS_FINE_LOCATION")) {
                return "android.permission.ACCESS_FINE_LOCATION";
            }
            if (m30479d(context, (ArrayList<String>) null, "android.permission.ACCESS_COARSE_LOCATION")) {
                return "android.permission.ACCESS_COARSE_LOCATION";
            }
            return null;
        } else if (i < 29 || !m30479d(context, (ArrayList<String>) null, "android.permission.ACCESS_FINE_LOCATION")) {
            return null;
        } else {
            return "android.permission.ACCESS_FINE_LOCATION";
        }
    }

    /* renamed from: b */
    static List<String> m30477b(Context context, int i) {
        ArrayList arrayList = new ArrayList();
        switch (i) {
            case 0:
                if (m30479d(context, arrayList, "android.permission.READ_CALENDAR")) {
                    arrayList.add("android.permission.READ_CALENDAR");
                }
                if (m30479d(context, arrayList, "android.permission.WRITE_CALENDAR")) {
                    arrayList.add("android.permission.WRITE_CALENDAR");
                    break;
                }
                break;
            case 1:
                if (m30479d(context, arrayList, "android.permission.CAMERA")) {
                    arrayList.add("android.permission.CAMERA");
                    break;
                }
                break;
            case 2:
                if (m30479d(context, arrayList, "android.permission.READ_CONTACTS")) {
                    arrayList.add("android.permission.READ_CONTACTS");
                }
                if (m30479d(context, arrayList, "android.permission.WRITE_CONTACTS")) {
                    arrayList.add("android.permission.WRITE_CONTACTS");
                }
                if (m30479d(context, arrayList, "android.permission.GET_ACCOUNTS")) {
                    arrayList.add("android.permission.GET_ACCOUNTS");
                    break;
                }
                break;
            case 4:
                if (Build.VERSION.SDK_INT >= 29) {
                    if (m30479d(context, arrayList, "android.permission.ACCESS_BACKGROUND_LOCATION")) {
                        arrayList.add("android.permission.ACCESS_BACKGROUND_LOCATION");
                        break;
                    }
                }
                break;
            case 3:
            case 5:
                if (m30479d(context, arrayList, "android.permission.ACCESS_COARSE_LOCATION")) {
                    arrayList.add("android.permission.ACCESS_COARSE_LOCATION");
                }
                if (m30479d(context, arrayList, "android.permission.ACCESS_FINE_LOCATION")) {
                    arrayList.add("android.permission.ACCESS_FINE_LOCATION");
                    break;
                }
                break;
            case 6:
            case 11:
            case 20:
                return null;
            case 7:
            case 14:
                if (m30479d(context, arrayList, "android.permission.RECORD_AUDIO")) {
                    arrayList.add("android.permission.RECORD_AUDIO");
                    break;
                }
                break;
            case 8:
                if (m30479d(context, arrayList, "android.permission.READ_PHONE_STATE")) {
                    arrayList.add("android.permission.READ_PHONE_STATE");
                }
                int i2 = Build.VERSION.SDK_INT;
                if (i2 > 29 && m30479d(context, arrayList, "android.permission.READ_PHONE_NUMBERS")) {
                    arrayList.add("android.permission.READ_PHONE_NUMBERS");
                }
                if (m30479d(context, arrayList, "android.permission.CALL_PHONE")) {
                    arrayList.add("android.permission.CALL_PHONE");
                }
                if (m30479d(context, arrayList, "android.permission.READ_CALL_LOG")) {
                    arrayList.add("android.permission.READ_CALL_LOG");
                }
                if (m30479d(context, arrayList, "android.permission.WRITE_CALL_LOG")) {
                    arrayList.add("android.permission.WRITE_CALL_LOG");
                }
                if (m30479d(context, arrayList, "com.android.voicemail.permission.ADD_VOICEMAIL")) {
                    arrayList.add("com.android.voicemail.permission.ADD_VOICEMAIL");
                }
                if (m30479d(context, arrayList, "android.permission.USE_SIP")) {
                    arrayList.add("android.permission.USE_SIP");
                }
                if (i2 >= 29 && m30479d(context, arrayList, "android.permission.BIND_CALL_REDIRECTION_SERVICE")) {
                    arrayList.add("android.permission.BIND_CALL_REDIRECTION_SERVICE");
                }
                if (i2 >= 26 && m30479d(context, arrayList, "android.permission.ANSWER_PHONE_CALLS")) {
                    arrayList.add("android.permission.ANSWER_PHONE_CALLS");
                    break;
                }
            case 9:
                if (Build.VERSION.SDK_INT >= 33 && m30479d(context, arrayList, "android.permission.READ_MEDIA_IMAGES")) {
                    arrayList.add("android.permission.READ_MEDIA_IMAGES");
                    break;
                }
            case 12:
                if (Build.VERSION.SDK_INT >= 20 && m30479d(context, arrayList, "android.permission.BODY_SENSORS")) {
                    arrayList.add("android.permission.BODY_SENSORS");
                    break;
                }
            case 13:
                if (m30479d(context, arrayList, "android.permission.SEND_SMS")) {
                    arrayList.add("android.permission.SEND_SMS");
                }
                if (m30479d(context, arrayList, "android.permission.RECEIVE_SMS")) {
                    arrayList.add("android.permission.RECEIVE_SMS");
                }
                if (m30479d(context, arrayList, "android.permission.READ_SMS")) {
                    arrayList.add("android.permission.READ_SMS");
                }
                if (m30479d(context, arrayList, "android.permission.RECEIVE_WAP_PUSH")) {
                    arrayList.add("android.permission.RECEIVE_WAP_PUSH");
                }
                if (m30479d(context, arrayList, "android.permission.RECEIVE_MMS")) {
                    arrayList.add("android.permission.RECEIVE_MMS");
                    break;
                }
                break;
            case 15:
                if (m30479d(context, arrayList, "android.permission.READ_EXTERNAL_STORAGE")) {
                    arrayList.add("android.permission.READ_EXTERNAL_STORAGE");
                }
                int i3 = Build.VERSION.SDK_INT;
                if ((i3 < 29 || (i3 == 29 && Environment.isExternalStorageLegacy())) && m30479d(context, arrayList, "android.permission.WRITE_EXTERNAL_STORAGE")) {
                    arrayList.add("android.permission.WRITE_EXTERNAL_STORAGE");
                    break;
                }
            case 16:
                if (Build.VERSION.SDK_INT >= 23 && m30479d(context, arrayList, "android.permission.REQUEST_IGNORE_BATTERY_OPTIMIZATIONS")) {
                    arrayList.add("android.permission.REQUEST_IGNORE_BATTERY_OPTIMIZATIONS");
                    break;
                }
            case 17:
                if (Build.VERSION.SDK_INT >= 33 && m30479d(context, arrayList, "android.permission.POST_NOTIFICATIONS")) {
                    arrayList.add("android.permission.POST_NOTIFICATIONS");
                    break;
                }
            case 18:
                if (Build.VERSION.SDK_INT >= 29) {
                    if (m30479d(context, arrayList, "android.permission.ACCESS_MEDIA_LOCATION")) {
                        arrayList.add("android.permission.ACCESS_MEDIA_LOCATION");
                        break;
                    }
                } else {
                    return null;
                }
                break;
            case 19:
                if (Build.VERSION.SDK_INT >= 29) {
                    if (m30479d(context, arrayList, "android.permission.ACTIVITY_RECOGNITION")) {
                        arrayList.add("android.permission.ACTIVITY_RECOGNITION");
                        break;
                    }
                } else {
                    return null;
                }
                break;
            case 21:
                if (m30479d(context, arrayList, "android.permission.BLUETOOTH")) {
                    arrayList.add("android.permission.BLUETOOTH");
                    break;
                }
                break;
            case 22:
                if (Build.VERSION.SDK_INT >= 30 && m30479d(context, arrayList, "android.permission.MANAGE_EXTERNAL_STORAGE")) {
                    arrayList.add("android.permission.MANAGE_EXTERNAL_STORAGE");
                    break;
                }
            case 23:
                if (m30479d(context, arrayList, "android.permission.SYSTEM_ALERT_WINDOW")) {
                    arrayList.add("android.permission.SYSTEM_ALERT_WINDOW");
                    break;
                }
                break;
            case 24:
                if (Build.VERSION.SDK_INT >= 23 && m30479d(context, arrayList, "android.permission.REQUEST_INSTALL_PACKAGES")) {
                    arrayList.add("android.permission.REQUEST_INSTALL_PACKAGES");
                    break;
                }
            case 27:
                if (Build.VERSION.SDK_INT >= 23 && m30479d(context, arrayList, "android.permission.ACCESS_NOTIFICATION_POLICY")) {
                    arrayList.add("android.permission.ACCESS_NOTIFICATION_POLICY");
                    break;
                }
            case 28:
                String a = m30476a(context, "android.permission.BLUETOOTH_SCAN");
                if (a != null) {
                    arrayList.add(a);
                    break;
                }
                break;
            case 29:
                String a2 = m30476a(context, "android.permission.BLUETOOTH_ADVERTISE");
                if (a2 != null) {
                    arrayList.add(a2);
                    break;
                }
                break;
            case 30:
                String a3 = m30476a(context, "android.permission.BLUETOOTH_CONNECT");
                if (a3 != null) {
                    arrayList.add(a3);
                    break;
                }
                break;
            case 31:
                if (Build.VERSION.SDK_INT >= 33 && m30479d(context, arrayList, "android.permission.NEARBY_WIFI_DEVICES")) {
                    arrayList.add("android.permission.NEARBY_WIFI_DEVICES");
                    break;
                }
            case 32:
                if (Build.VERSION.SDK_INT >= 33 && m30479d(context, arrayList, "android.permission.READ_MEDIA_VIDEO")) {
                    arrayList.add("android.permission.READ_MEDIA_VIDEO");
                    break;
                }
            case 33:
                if (Build.VERSION.SDK_INT >= 33 && m30479d(context, arrayList, "android.permission.READ_MEDIA_AUDIO")) {
                    arrayList.add("android.permission.READ_MEDIA_AUDIO");
                    break;
                }
            case 34:
                if (Build.VERSION.SDK_INT >= 31 && m30479d(context, arrayList, "android.permission.SCHEDULE_EXACT_ALARM")) {
                    arrayList.add("android.permission.SCHEDULE_EXACT_ALARM");
                    break;
                }
        }
        return arrayList;
    }

    /* renamed from: c */
    private static PackageInfo m30478c(Context context) throws PackageManager.NameNotFoundException {
        PackageManager packageManager = context.getPackageManager();
        if (Build.VERSION.SDK_INT >= 33) {
            return packageManager.getPackageInfo(context.getPackageName(), PackageManager.PackageInfoFlags.of(4096));
        }
        return packageManager.getPackageInfo(context.getPackageName(), 4096);
    }

    /* renamed from: d */
    private static boolean m30479d(Context context, ArrayList<String> arrayList, String str) {
        if (arrayList != null) {
            try {
                Iterator<String> it = arrayList.iterator();
                while (it.hasNext()) {
                    if (it.next().equals(str)) {
                        return true;
                    }
                }
            } catch (Exception e) {
                Log.d("permissions_handler", "Unable to check manifest for permission: ", e);
            }
        }
        if (context == null) {
            Log.d("permissions_handler", "Unable to detect current Activity or App Context.");
            return false;
        }
        PackageInfo c = m30478c(context);
        if (c == null) {
            Log.d("permissions_handler", "Unable to get Package info, will not be able to determine permissions to request.");
            return false;
        }
        Iterator it2 = new ArrayList(Arrays.asList(c.requestedPermissions)).iterator();
        while (it2.hasNext()) {
            if (((String) it2.next()).equals(str)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: e */
    static boolean m30480e(Activity activity, String str) {
        if (activity == null) {
            return false;
        }
        return !C0615b.m2926x(activity, str);
    }

    /* renamed from: f */
    static int m30481f(String str) {
        String str2 = str;
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case -2062386608:
                if (str2.equals("android.permission.READ_SMS")) {
                    c = 0;
                    break;
                }
                break;
            case -1928411001:
                if (str2.equals("android.permission.READ_CALENDAR")) {
                    c = 1;
                    break;
                }
                break;
            case -1925850455:
                if (str2.equals("android.permission.POST_NOTIFICATIONS")) {
                    c = 2;
                    break;
                }
                break;
            case -1921431796:
                if (str2.equals("android.permission.READ_CALL_LOG")) {
                    c = 3;
                    break;
                }
                break;
            case -1888586689:
                if (str2.equals("android.permission.ACCESS_FINE_LOCATION")) {
                    c = 4;
                    break;
                }
                break;
            case -1813079487:
                if (str2.equals("android.permission.MANAGE_EXTERNAL_STORAGE")) {
                    c = 5;
                    break;
                }
                break;
            case -1783097621:
                if (str2.equals("android.permission.ACCESS_NOTIFICATION_POLICY")) {
                    c = 6;
                    break;
                }
                break;
            case -1561629405:
                if (str2.equals("android.permission.SYSTEM_ALERT_WINDOW")) {
                    c = 7;
                    break;
                }
                break;
            case -1479758289:
                if (str2.equals("android.permission.RECEIVE_WAP_PUSH")) {
                    c = 8;
                    break;
                }
                break;
            case -1238066820:
                if (str2.equals("android.permission.BODY_SENSORS")) {
                    c = 9;
                    break;
                }
                break;
            case -1164582768:
                if (str2.equals("android.permission.READ_PHONE_NUMBERS")) {
                    c = 10;
                    break;
                }
                break;
            case -909527021:
                if (str2.equals("android.permission.NEARBY_WIFI_DEVICES")) {
                    c = 11;
                    break;
                }
                break;
            case -901151997:
                if (str2.equals("android.permission.BIND_CALL_REDIRECTION_SERVICE")) {
                    c = 12;
                    break;
                }
                break;
            case -895679497:
                if (str2.equals("android.permission.RECEIVE_MMS")) {
                    c = 13;
                    break;
                }
                break;
            case -895673731:
                if (str2.equals("android.permission.RECEIVE_SMS")) {
                    c = 14;
                    break;
                }
                break;
            case -798669607:
                if (str2.equals("android.permission.BLUETOOTH_CONNECT")) {
                    c = 15;
                    break;
                }
                break;
            case -406040016:
                if (str2.equals("android.permission.READ_EXTERNAL_STORAGE")) {
                    c = 16;
                    break;
                }
                break;
            case -63024214:
                if (str2.equals("android.permission.ACCESS_COARSE_LOCATION")) {
                    c = 17;
                    break;
                }
                break;
            case -5573545:
                if (str2.equals("android.permission.READ_PHONE_STATE")) {
                    c = 18;
                    break;
                }
                break;
            case 52602690:
                if (str2.equals("android.permission.SEND_SMS")) {
                    c = 19;
                    break;
                }
                break;
            case 112197485:
                if (str2.equals("android.permission.CALL_PHONE")) {
                    c = 20;
                    break;
                }
                break;
            case 175802396:
                if (str2.equals("android.permission.READ_MEDIA_IMAGES")) {
                    c = 21;
                    break;
                }
                break;
            case 214526995:
                if (str2.equals("android.permission.WRITE_CONTACTS")) {
                    c = 22;
                    break;
                }
                break;
            case 463403621:
                if (str2.equals("android.permission.CAMERA")) {
                    c = 23;
                    break;
                }
                break;
            case 603653886:
                if (str2.equals("android.permission.WRITE_CALENDAR")) {
                    c = 24;
                    break;
                }
                break;
            case 610633091:
                if (str2.equals("android.permission.WRITE_CALL_LOG")) {
                    c = 25;
                    break;
                }
                break;
            case 691260818:
                if (str2.equals("android.permission.READ_MEDIA_AUDIO")) {
                    c = 26;
                    break;
                }
                break;
            case 710297143:
                if (str2.equals("android.permission.READ_MEDIA_VIDEO")) {
                    c = 27;
                    break;
                }
                break;
            case 784519842:
                if (str2.equals("android.permission.USE_SIP")) {
                    c = 28;
                    break;
                }
                break;
            case 970694249:
                if (str2.equals("android.permission.SCHEDULE_EXACT_ALARM")) {
                    c = 29;
                    break;
                }
                break;
            case 1166454870:
                if (str2.equals("android.permission.BLUETOOTH_ADVERTISE")) {
                    c = 30;
                    break;
                }
                break;
            case 1271781903:
                if (str2.equals("android.permission.GET_ACCOUNTS")) {
                    c = 31;
                    break;
                }
                break;
            case 1365911975:
                if (str2.equals("android.permission.WRITE_EXTERNAL_STORAGE")) {
                    c = ' ';
                    break;
                }
                break;
            case 1777263169:
                if (str2.equals("android.permission.REQUEST_INSTALL_PACKAGES")) {
                    c = '!';
                    break;
                }
                break;
            case 1780337063:
                if (str2.equals("android.permission.ACTIVITY_RECOGNITION")) {
                    c = '\"';
                    break;
                }
                break;
            case 1831139720:
                if (str2.equals("android.permission.RECORD_AUDIO")) {
                    c = '#';
                    break;
                }
                break;
            case 1977429404:
                if (str2.equals("android.permission.READ_CONTACTS")) {
                    c = '$';
                    break;
                }
                break;
            case 2024715147:
                if (str2.equals("android.permission.ACCESS_BACKGROUND_LOCATION")) {
                    c = '%';
                    break;
                }
                break;
            case 2062356686:
                if (str2.equals("android.permission.BLUETOOTH_SCAN")) {
                    c = '&';
                    break;
                }
                break;
            case 2114579147:
                if (str2.equals("android.permission.ACCESS_MEDIA_LOCATION")) {
                    c = '\'';
                    break;
                }
                break;
            case 2133799037:
                if (str2.equals("com.android.voicemail.permission.ADD_VOICEMAIL")) {
                    c = '(';
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
            case 8:
            case 13:
            case 14:
            case 19:
                return 13;
            case 1:
            case 24:
                return 0;
            case 2:
                return 17;
            case 3:
            case 10:
            case 12:
            case 18:
            case 20:
            case 25:
            case 28:
            case '(':
                return 8;
            case 4:
            case 17:
                return 3;
            case 5:
                return 22;
            case 6:
                return 27;
            case 7:
                return 23;
            case 9:
                return 12;
            case 11:
                return 31;
            case 15:
                return 30;
            case 16:
            case ' ':
                return 15;
            case 21:
                return 9;
            case 22:
            case 31:
            case '$':
                return 2;
            case 23:
                return 1;
            case 26:
                return 33;
            case 27:
                return 32;
            case 29:
                return 34;
            case 30:
                return 29;
            case '!':
                return 24;
            case '\"':
                return 19;
            case '#':
                return 7;
            case '%':
                return 4;
            case '&':
                return 28;
            case '\'':
                return 18;
            default:
                return 20;
        }
    }

    /* renamed from: g */
    static int m30482g(Activity activity, String str, int i) {
        if (i == -1) {
            return (Build.VERSION.SDK_INT < 23 || !m30480e(activity, str)) ? 0 : 4;
        }
        return 1;
    }

    /* renamed from: h */
    static void m30483h(Activity activity, int i) {
        List<String> b;
        if (activity != null && (b = m30477b(activity, i)) != null) {
            b.isEmpty();
        }
    }
}
