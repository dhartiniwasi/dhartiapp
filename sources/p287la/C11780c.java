package p287la;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.os.Build;
import android.util.Log;
import com.onesignal.shortcutbadger.impl.AdwHomeBadger;
import com.onesignal.shortcutbadger.impl.ApexHomeBadger;
import com.onesignal.shortcutbadger.impl.AsusHomeBadger;
import com.onesignal.shortcutbadger.impl.DefaultBadger;
import com.onesignal.shortcutbadger.impl.EverythingMeHomeBadger;
import com.onesignal.shortcutbadger.impl.HuaweiHomeBadger;
import com.onesignal.shortcutbadger.impl.NewHtcHomeBadger;
import com.onesignal.shortcutbadger.impl.NovaHomeBadger;
import com.onesignal.shortcutbadger.impl.OPPOHomeBader;
import com.onesignal.shortcutbadger.impl.SamsungHomeBadger;
import com.onesignal.shortcutbadger.impl.SonyHomeBadger;
import com.onesignal.shortcutbadger.impl.VivoHomeBadger;
import com.onesignal.shortcutbadger.impl.ZukHomeBadger;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* renamed from: la.c */
/* compiled from: ShortcutBadger */
public final class C11780c {

    /* renamed from: a */
    private static final List<Class<? extends C11778a>> f44420a;

    /* renamed from: b */
    private static final Object f44421b = new Object();

    /* renamed from: c */
    private static C11778a f44422c;

    /* renamed from: d */
    private static ComponentName f44423d;

    static {
        LinkedList linkedList = new LinkedList();
        f44420a = linkedList;
        linkedList.add(AdwHomeBadger.class);
        linkedList.add(ApexHomeBadger.class);
        linkedList.add(NewHtcHomeBadger.class);
        linkedList.add(NovaHomeBadger.class);
        linkedList.add(SonyHomeBadger.class);
        linkedList.add(AsusHomeBadger.class);
        linkedList.add(HuaweiHomeBadger.class);
        linkedList.add(OPPOHomeBader.class);
        linkedList.add(SamsungHomeBadger.class);
        linkedList.add(ZukHomeBadger.class);
        linkedList.add(VivoHomeBadger.class);
        linkedList.add(EverythingMeHomeBadger.class);
    }

    /* renamed from: a */
    public static void m57113a(Context context, int i) throws C11779b {
        if (f44422c != null || m57114b(context)) {
            try {
                f44422c.mo28205b(context, f44423d, i);
            } catch (Exception e) {
                throw new C11779b("Unable to execute badge", e);
            }
        } else {
            throw new C11779b("No default launcher available");
        }
    }

    /* renamed from: b */
    private static boolean m57114b(Context context) {
        Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(context.getPackageName());
        if (launchIntentForPackage == null) {
            Log.e("ShortcutBadger", "Unable to find launch intent for package " + context.getPackageName());
            return false;
        }
        f44423d = launchIntentForPackage.getComponent();
        Intent intent = new Intent("android.intent.action.MAIN");
        intent.addCategory("android.intent.category.HOME");
        ResolveInfo resolveActivity = context.getPackageManager().resolveActivity(intent, 65536);
        if (resolveActivity == null || resolveActivity.activityInfo.name.toLowerCase().contains("resolver")) {
            return false;
        }
        String str = resolveActivity.activityInfo.packageName;
        Iterator<Class<? extends C11778a>> it = f44420a.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            C11778a aVar = null;
            try {
                aVar = (C11778a) it.next().newInstance();
            } catch (Exception unused) {
            }
            if (aVar != null && aVar.mo28204a().contains(str)) {
                f44422c = aVar;
                break;
            }
        }
        if (f44422c != null) {
            return true;
        }
        String str2 = Build.MANUFACTURER;
        if (str2.equalsIgnoreCase("ZUK")) {
            f44422c = new ZukHomeBadger();
            return true;
        } else if (str2.equalsIgnoreCase("OPPO")) {
            f44422c = new OPPOHomeBader();
            return true;
        } else if (str2.equalsIgnoreCase("VIVO")) {
            f44422c = new VivoHomeBadger();
            return true;
        } else {
            f44422c = new DefaultBadger();
            return true;
        }
    }
}
