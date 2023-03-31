package p402y5;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import p033d5.C4141r;

/* renamed from: y5.x */
/* compiled from: com.google.android.gms:play-services-measurement-base@@21.2.0 */
public final class C13046x {
    /* renamed from: a */
    public static String m61371a(String str, String[] strArr, String[] strArr2) {
        C4141r.m28221k(strArr);
        C4141r.m28221k(strArr2);
        int min = Math.min(strArr.length, strArr2.length);
        for (int i = 0; i < min; i++) {
            String str2 = strArr[i];
            if ((str == null && str2 == null) || (str != null && str.equals(str2))) {
                return strArr2[i];
            }
        }
        return null;
    }

    /* renamed from: b */
    public static String m61372b(Context context, String str, String str2) {
        C4141r.m28221k(context);
        Resources resources = context.getResources();
        if (TextUtils.isEmpty(str2)) {
            str2 = C13035m.m61349a(context);
        }
        return C13035m.m61350b("google_app_id", resources, str2);
    }
}
