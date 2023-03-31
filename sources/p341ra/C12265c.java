package p341ra;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: ra.c */
/* compiled from: AudioServiceConfig */
public class C12265c {

    /* renamed from: a */
    private SharedPreferences f45456a;

    /* renamed from: b */
    public boolean f45457b;

    /* renamed from: c */
    public String f45458c = this.f45456a.getString("androidNotificationChannelId", (String) null);

    /* renamed from: d */
    public String f45459d = this.f45456a.getString("androidNotificationChannelName", (String) null);

    /* renamed from: e */
    public String f45460e = this.f45456a.getString("androidNotificationChannelDescription", (String) null);

    /* renamed from: f */
    public int f45461f = this.f45456a.getInt("notificationColor", -1);

    /* renamed from: g */
    public String f45462g = this.f45456a.getString("androidNotificationIcon", "mipmap/ic_launcher");

    /* renamed from: h */
    public boolean f45463h = this.f45456a.getBoolean("androidShowNotificationBadge", false);

    /* renamed from: i */
    public boolean f45464i = this.f45456a.getBoolean("androidNotificationClickStartsActivity", true);

    /* renamed from: j */
    public boolean f45465j = this.f45456a.getBoolean("androidNotificationOngoing", false);

    /* renamed from: k */
    public boolean f45466k = this.f45456a.getBoolean("androidStopForegroundOnPause", true);

    /* renamed from: l */
    public int f45467l = this.f45456a.getInt("artDownscaleWidth", -1);

    /* renamed from: m */
    public int f45468m = this.f45456a.getInt("artDownscaleHeight", -1);

    /* renamed from: n */
    public String f45469n = this.f45456a.getString("activityClassName", (String) null);

    /* renamed from: o */
    public String f45470o = this.f45456a.getString("androidBrowsableRootExtras", (String) null);

    public C12265c(Context context) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("audio_service_preferences", 0);
        this.f45456a = sharedPreferences;
        this.f45457b = sharedPreferences.getBoolean("androidResumeOnClick", true);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(14:7|8|9|10|11|12|13|14|15|16|17|28|22|5) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:10:0x002a */
    /* JADX WARNING: Missing exception handler attribute for start block: B:12:0x0032 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:14:0x003a */
    /* JADX WARNING: Missing exception handler attribute for start block: B:16:0x0042 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.os.Bundle mo36902a() {
        /*
            r8 = this;
            java.lang.String r0 = r8.f45470o
            r1 = 0
            if (r0 != 0) goto L_0x0006
            return r1
        L_0x0006:
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch:{ Exception -> 0x005a }
            java.lang.String r2 = r8.f45470o     // Catch:{ Exception -> 0x005a }
            r0.<init>(r2)     // Catch:{ Exception -> 0x005a }
            android.os.Bundle r2 = new android.os.Bundle     // Catch:{ Exception -> 0x005a }
            r2.<init>()     // Catch:{ Exception -> 0x005a }
            java.util.Iterator r3 = r0.keys()     // Catch:{ Exception -> 0x005a }
        L_0x0016:
            boolean r4 = r3.hasNext()     // Catch:{ Exception -> 0x005a }
            if (r4 == 0) goto L_0x0059
            java.lang.Object r4 = r3.next()     // Catch:{ Exception -> 0x005a }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ Exception -> 0x005a }
            int r5 = r0.getInt(r4)     // Catch:{ Exception -> 0x002a }
            r2.putInt(r4, r5)     // Catch:{ Exception -> 0x002a }
            goto L_0x0016
        L_0x002a:
            boolean r5 = r0.getBoolean(r4)     // Catch:{ Exception -> 0x0032 }
            r2.putBoolean(r4, r5)     // Catch:{ Exception -> 0x0032 }
            goto L_0x0016
        L_0x0032:
            double r5 = r0.getDouble(r4)     // Catch:{ Exception -> 0x003a }
            r2.putDouble(r4, r5)     // Catch:{ Exception -> 0x003a }
            goto L_0x0016
        L_0x003a:
            java.lang.String r5 = r0.getString(r4)     // Catch:{ Exception -> 0x0042 }
            r2.putString(r4, r5)     // Catch:{ Exception -> 0x0042 }
            goto L_0x0016
        L_0x0042:
            java.io.PrintStream r5 = java.lang.System.out     // Catch:{ Exception -> 0x005a }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x005a }
            r6.<init>()     // Catch:{ Exception -> 0x005a }
            java.lang.String r7 = "Unsupported extras value for key "
            r6.append(r7)     // Catch:{ Exception -> 0x005a }
            r6.append(r4)     // Catch:{ Exception -> 0x005a }
            java.lang.String r4 = r6.toString()     // Catch:{ Exception -> 0x005a }
            r5.println(r4)     // Catch:{ Exception -> 0x005a }
            goto L_0x0016
        L_0x0059:
            return r2
        L_0x005a:
            r0 = move-exception
            r0.printStackTrace()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p341ra.C12265c.mo36902a():android.os.Bundle");
    }

    /* renamed from: b */
    public void mo36903b() {
        this.f45456a.edit().putBoolean("androidResumeOnClick", this.f45457b).putString("androidNotificationChannelId", this.f45458c).putString("androidNotificationChannelName", this.f45459d).putString("androidNotificationChannelDescription", this.f45460e).putInt("notificationColor", this.f45461f).putString("androidNotificationIcon", this.f45462g).putBoolean("androidShowNotificationBadge", this.f45463h).putBoolean("androidNotificationClickStartsActivity", this.f45464i).putBoolean("androidNotificationOngoing", this.f45465j).putBoolean("androidStopForegroundOnPause", this.f45466k).putInt("artDownscaleWidth", this.f45467l).putInt("artDownscaleHeight", this.f45468m).putString("activityClassName", this.f45469n).putString("androidBrowsableRootExtras", this.f45470o).apply();
    }

    /* renamed from: c */
    public void mo36904c(Map<?, ?> map) {
        if (map != null) {
            this.f45470o = new JSONObject(map).toString();
        } else {
            this.f45470o = null;
        }
    }
}
