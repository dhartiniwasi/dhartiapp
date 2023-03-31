package p073j4;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.telephony.TelephonyManager;
import p053g4.C4409t;

/* renamed from: j4.e2 */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public class C4763e2 extends C4759d2 {
    /* renamed from: f */
    public final void mo18424f(Context context) {
        NotificationChannel notificationChannel = new NotificationChannel("offline_notification_channel", "AdMob Offline Notifications", 2);
        notificationChannel.setShowBadge(false);
        ((NotificationManager) context.getSystemService(NotificationManager.class)).createNotificationChannel(notificationChannel);
    }

    /* renamed from: g */
    public final int mo18425g(Context context, TelephonyManager telephonyManager) {
        C4409t.m29326r();
        if (!C4751b2.m30603U(context, "android.permission.ACCESS_NETWORK_STATE") || !telephonyManager.isDataEnabled()) {
            return 1;
        }
        return 2;
    }
}
