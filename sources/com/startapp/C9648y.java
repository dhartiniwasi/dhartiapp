package com.startapp;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.res.Resources;
import android.os.Build;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.startapp.y */
/* compiled from: Sta */
public class C9648y {

    /* renamed from: c */
    public static final String f39417c = C9605vb.m50453a(71, 13, -10, 14, -3, -6, -5, -54, 66, -11, 13, -5, -4, 10, 0, -10, 6, -1, -64, 19, 2, 0, 2, 14, 0, 12);

    /* renamed from: d */
    public static final String f39418d = C9605vb.m50453a(66, 3, 5, -9);

    /* renamed from: e */
    public static final String f39419e = C9605vb.m50453a(61, 12, -14, 17, 1, -14);

    /* renamed from: f */
    public static final String f39420f = C9605vb.m50453a(56, -1, 2, 8, -4, 11, -3, 6, -7, -10);

    /* renamed from: g */
    public static final String f39421g = C9605vb.m50453a(86, -19, 3, -12, -2, 19, -11, 6, -1);

    /* renamed from: a */
    public final Context f39422a;

    /* renamed from: b */
    public final AtomicInteger f39423b = new AtomicInteger(0);

    public C9648y(Context context) {
        this.f39422a = context;
    }

    /* renamed from: a */
    public void mo31379a(int i) {
        Locale locale = Locale.ENGLISH;
        Object[] objArr = new Object[3];
        int i2 = 0;
        objArr[0] = Integer.valueOf(this.f39423b.incrementAndGet());
        Context context = this.f39422a;
        try {
            Resources resources = context.getResources();
            int identifier = resources.getIdentifier("com_startapp_sdk_aar", "integer", context.getPackageName());
            if (identifier != 0) {
                i2 = resources.getInteger(identifier);
            }
        } catch (Throwable unused) {
        }
        objArr[1] = Integer.valueOf(i2);
        objArr[2] = Integer.valueOf(i);
        String format = String.format(locale, "cnt=%d,aar=%d,mds=%d", objArr);
        C9023i4 i4Var = new C9023i4(C9043j4.f36993d);
        i4Var.f36952d = "initialize";
        i4Var.f36953e = format;
        i4Var.mo29471a();
    }

    /* renamed from: a */
    public String mo31378a() {
        Context context = this.f39422a;
        StringBuilder sb = new StringBuilder();
        String str = f39417c;
        sb.append(str);
        sb.append(f39419e);
        String str2 = f39421g;
        sb.append(str2);
        StringBuilder a = C8870c1.m48422a(str);
        a.append(f39418d);
        a.append(str2);
        StringBuilder a2 = C8870c1.m48422a(str);
        a2.append(f39420f);
        a2.append(str2);
        String[] strArr = {sb.toString(), a.toString(), a2.toString()};
        int[] iArr = new int[3];
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 4096);
            String[] strArr2 = packageInfo.requestedPermissions;
            if (strArr2 != null) {
                int length = strArr2.length;
                for (int i = 0; i < length; i++) {
                    for (int i2 = 0; i2 < 3; i2++) {
                        if (strArr[i2].equals(packageInfo.requestedPermissions[i])) {
                            if (Build.VERSION.SDK_INT < 16) {
                                iArr[i2] = 2;
                            } else if ((packageInfo.requestedPermissionsFlags[i] & 2) == 2) {
                                iArr[i2] = 2;
                            } else {
                                iArr[i2] = 1;
                            }
                        }
                    }
                }
            }
        } catch (Throwable unused) {
        }
        StringBuilder sb2 = new StringBuilder(3);
        for (int i3 = 0; i3 < 3; i3++) {
            sb2.append(iArr[i3]);
        }
        return sb2.toString();
    }
}
