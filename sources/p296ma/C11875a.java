package p296ma;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import java.util.Collections;
import java.util.List;
import p287la.C11779b;

/* renamed from: ma.a */
/* compiled from: BroadcastHelper */
public class C11875a {
    /* renamed from: a */
    public static boolean m57372a(Context context, Intent intent) {
        List<ResolveInfo> queryBroadcastReceivers = context.getPackageManager().queryBroadcastReceivers(intent, 0);
        if (queryBroadcastReceivers == null || queryBroadcastReceivers.size() <= 0) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public static List<ResolveInfo> m57373b(Context context, Intent intent) {
        List<ResolveInfo> queryBroadcastReceivers = context.getPackageManager().queryBroadcastReceivers(intent, 0);
        return queryBroadcastReceivers != null ? queryBroadcastReceivers : Collections.emptyList();
    }

    /* renamed from: c */
    public static void m57374c(Context context, Intent intent) throws C11779b {
        List<ResolveInfo> b = m57373b(context, intent);
        if (b.size() != 0) {
            for (ResolveInfo next : b) {
                Intent intent2 = new Intent(intent);
                if (next != null) {
                    intent2.setPackage(next.resolvePackageName);
                    context.sendBroadcast(intent2);
                }
            }
            return;
        }
        throw new C11779b("unable to resolve intent: " + intent.toString());
    }
}
