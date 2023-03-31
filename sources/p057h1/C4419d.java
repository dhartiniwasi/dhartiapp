package p057h1;

import android.content.ComponentName;
import android.content.Context;
import p170y0.C6094j;

/* renamed from: h1.d */
/* compiled from: PackageManagerHelper */
public class C4419d {

    /* renamed from: a */
    private static final String f24591a = C6094j.m35719f("PackageManagerHelper");

    /* renamed from: a */
    public static void m29371a(Context context, Class<?> cls, boolean z) {
        String str;
        String str2 = "enabled";
        try {
            context.getPackageManager().setComponentEnabledSetting(new ComponentName(context, cls.getName()), z ? 1 : 2, 1);
            C6094j c = C6094j.m35717c();
            String str3 = f24591a;
            Object[] objArr = new Object[2];
            objArr[0] = cls.getName();
            if (z) {
                str = str2;
            } else {
                str = "disabled";
            }
            objArr[1] = str;
            c.mo20921a(str3, String.format("%s %s", objArr), new Throwable[0]);
        } catch (Exception e) {
            C6094j c2 = C6094j.m35717c();
            String str4 = f24591a;
            Object[] objArr2 = new Object[2];
            objArr2[0] = cls.getName();
            if (!z) {
                str2 = "disabled";
            }
            objArr2[1] = str2;
            c2.mo20921a(str4, String.format("%s could not be %s", objArr2), e);
        }
    }
}
