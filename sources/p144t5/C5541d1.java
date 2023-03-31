package p144t5;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import java.util.Set;

/* renamed from: t5.d1 */
/* compiled from: com.google.android.ump:user-messaging-platform@@2.0.0 */
public final class C5541d1 {
    /* renamed from: a */
    public static C5529a1 m33599a(Context context, String str) {
        String str2;
        String str3;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String[] split = str.split("/", -1);
        int length = split.length;
        if (length == 1) {
            str3 = String.valueOf(context.getPackageName()).concat("_preferences");
            str2 = split[0];
        } else {
            if (length == 2) {
                str3 = split[0];
                str2 = split[1];
            }
            return null;
        }
        if (!TextUtils.isEmpty(str3) && !TextUtils.isEmpty(str2)) {
            return new C5529a1(str3, str2);
        }
        return null;
    }

    /* renamed from: b */
    public static void m33600b(Context context, Set<String> set) {
        String str;
        C5533b1 b1Var = new C5533b1(context);
        for (String next : set) {
            C5529a1 a = m33599a(context, next);
            if (a == null) {
                String valueOf = String.valueOf(next);
                if (valueOf.length() != 0) {
                    str = "clearKeys: unable to process key: ".concat(valueOf);
                } else {
                    str = new String("clearKeys: unable to process key: ");
                }
                Log.d("UserMessagingPlatform", str);
            } else {
                b1Var.m33588d(a.f28052a).remove(a.f28053b);
            }
        }
        b1Var.mo19835b();
    }
}
