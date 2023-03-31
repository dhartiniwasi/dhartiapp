package p033d5;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.text.TextUtils;
import android.util.Log;
import androidx.core.p010os.C0766f;
import java.util.Locale;
import p067i5.C4695i;
import p081k5.C4888c;
import p124r.C5426g;
import p168x4.C6078b;
import p180z4.C6376i;
import p180z4.C6382l;

/* renamed from: d5.d0 */
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public final class C4097d0 {

    /* renamed from: a */
    private static final C5426g<String, String> f23285a = new C5426g<>();

    /* renamed from: b */
    private static Locale f23286b;

    /* renamed from: a */
    public static String m28112a(Context context) {
        String packageName = context.getPackageName();
        try {
            return C4888c.m31075a(context).mo18671d(packageName).toString();
        } catch (PackageManager.NameNotFoundException | NullPointerException unused) {
            String str = context.getApplicationInfo().name;
            return TextUtils.isEmpty(str) ? packageName : str;
        }
    }

    /* renamed from: b */
    public static String m28113b(Context context) {
        return context.getResources().getString(C6078b.common_google_play_services_notification_channel_name);
    }

    /* renamed from: c */
    public static String m28114c(Context context, int i) {
        Resources resources = context.getResources();
        if (i == 1) {
            return resources.getString(C6078b.common_google_play_services_install_button);
        }
        if (i == 2) {
            return resources.getString(C6078b.common_google_play_services_update_button);
        }
        if (i != 3) {
            return resources.getString(17039370);
        }
        return resources.getString(C6078b.common_google_play_services_enable_button);
    }

    /* renamed from: d */
    public static String m28115d(Context context, int i) {
        Resources resources = context.getResources();
        String a = m28112a(context);
        if (i == 1) {
            return resources.getString(C6078b.common_google_play_services_install_text, new Object[]{a});
        } else if (i != 2) {
            if (i == 3) {
                return resources.getString(C6078b.common_google_play_services_enable_text, new Object[]{a});
            } else if (i == 5) {
                return m28119h(context, "common_google_play_services_invalid_account_text", a);
            } else {
                if (i == 7) {
                    return m28119h(context, "common_google_play_services_network_error_text", a);
                }
                if (i == 9) {
                    return resources.getString(C6078b.common_google_play_services_unsupported_text, new Object[]{a});
                } else if (i == 20) {
                    return m28119h(context, "common_google_play_services_restricted_profile_text", a);
                } else {
                    switch (i) {
                        case 16:
                            return m28119h(context, "common_google_play_services_api_unavailable_text", a);
                        case 17:
                            return m28119h(context, "common_google_play_services_sign_in_failed_text", a);
                        case 18:
                            return resources.getString(C6078b.common_google_play_services_updating_text, new Object[]{a});
                        default:
                            return resources.getString(C6382l.f30626a, new Object[]{a});
                    }
                }
            }
        } else if (C4695i.m30398g(context)) {
            return resources.getString(C6078b.common_google_play_services_wear_update_text);
        } else {
            return resources.getString(C6078b.common_google_play_services_update_text, new Object[]{a});
        }
    }

    /* renamed from: e */
    public static String m28116e(Context context, int i) {
        if (i == 6 || i == 19) {
            return m28119h(context, "common_google_play_services_resolution_required_text", m28112a(context));
        }
        return m28115d(context, i);
    }

    /* renamed from: f */
    public static String m28117f(Context context, int i) {
        String str;
        if (i == 6) {
            str = m28120i(context, "common_google_play_services_resolution_required_title");
        } else {
            str = m28118g(context, i);
        }
        return str == null ? context.getResources().getString(C6078b.common_google_play_services_notification_ticker) : str;
    }

    /* renamed from: g */
    public static String m28118g(Context context, int i) {
        Resources resources = context.getResources();
        switch (i) {
            case 1:
                return resources.getString(C6078b.common_google_play_services_install_title);
            case 2:
                return resources.getString(C6078b.common_google_play_services_update_title);
            case 3:
                return resources.getString(C6078b.common_google_play_services_enable_title);
            case 4:
            case 6:
            case 18:
                return null;
            case 5:
                Log.e("GoogleApiAvailability", "An invalid account was specified when connecting. Please provide a valid account.");
                return m28120i(context, "common_google_play_services_invalid_account_title");
            case 7:
                Log.e("GoogleApiAvailability", "Network error occurred. Please retry request later.");
                return m28120i(context, "common_google_play_services_network_error_title");
            case 8:
                Log.e("GoogleApiAvailability", "Internal error occurred. Please see logs for detailed information");
                return null;
            case 9:
                Log.e("GoogleApiAvailability", "Google Play services is invalid. Cannot recover.");
                return null;
            case 10:
                Log.e("GoogleApiAvailability", "Developer error occurred. Please see logs for detailed information");
                return null;
            case 11:
                Log.e("GoogleApiAvailability", "The application is not licensed to the user.");
                return null;
            case 16:
                Log.e("GoogleApiAvailability", "One of the API components you attempted to connect to is not available.");
                return null;
            case 17:
                Log.e("GoogleApiAvailability", "The specified account could not be signed in.");
                return m28120i(context, "common_google_play_services_sign_in_failed_title");
            case 20:
                Log.e("GoogleApiAvailability", "The current user profile is restricted and could not use authenticated features.");
                return m28120i(context, "common_google_play_services_restricted_profile_title");
            default:
                StringBuilder sb = new StringBuilder(33);
                sb.append("Unexpected error code ");
                sb.append(i);
                Log.e("GoogleApiAvailability", sb.toString());
                return null;
        }
    }

    /* renamed from: h */
    private static String m28119h(Context context, String str, String str2) {
        Resources resources = context.getResources();
        String i = m28120i(context, str);
        if (i == null) {
            i = resources.getString(C6382l.f30626a);
        }
        return String.format(resources.getConfiguration().locale, i, new Object[]{str2});
    }

    /* renamed from: i */
    private static String m28120i(Context context, String str) {
        String str2;
        String str3;
        C5426g<String, String> gVar = f23285a;
        synchronized (gVar) {
            Locale c = C0766f.m3519a(context.getResources().getConfiguration()).mo3144c(0);
            if (!c.equals(f23286b)) {
                gVar.clear();
                f23286b = c;
            }
            String str4 = gVar.get(str);
            if (str4 != null) {
                return str4;
            }
            Resources f = C6376i.m37451f(context);
            if (f == null) {
                return null;
            }
            int identifier = f.getIdentifier(str, "string", "com.google.android.gms");
            if (identifier == 0) {
                if (str.length() != 0) {
                    str3 = "Missing resource: ".concat(str);
                } else {
                    str3 = new String("Missing resource: ");
                }
                Log.w("GoogleApiAvailability", str3);
                return null;
            }
            String string = f.getString(identifier);
            if (TextUtils.isEmpty(string)) {
                if (str.length() != 0) {
                    str2 = "Got empty resource: ".concat(str);
                } else {
                    str2 = new String("Got empty resource: ");
                }
                Log.w("GoogleApiAvailability", str2);
                return null;
            }
            gVar.put(str, string);
            return string;
        }
    }
}
