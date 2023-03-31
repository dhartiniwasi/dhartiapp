package p402y5;

import android.content.Context;
import android.content.res.Resources;
import p180z4.C6382l;

/* renamed from: y5.m */
/* compiled from: com.google.android.gms:play-services-measurement-base@@21.2.0 */
public final class C13035m {
    /* renamed from: a */
    public static String m61349a(Context context) {
        try {
            return context.getResources().getResourcePackageName(C6382l.f30626a);
        } catch (Resources.NotFoundException unused) {
            return context.getPackageName();
        }
    }

    /* renamed from: b */
    public static final String m61350b(String str, Resources resources, String str2) {
        int identifier = resources.getIdentifier(str, "string", str2);
        if (identifier == 0) {
            return null;
        }
        try {
            return resources.getString(identifier);
        } catch (Resources.NotFoundException unused) {
            return null;
        }
    }
}
