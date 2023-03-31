package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.net.Uri;
import android.os.Build;
import android.util.Log;

/* renamed from: com.google.android.gms.internal.measurement.p6 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
public final class C7120p6 {

    /* renamed from: a */
    static volatile C6993h7 f31945a = C6993h7.m40148c();

    /* renamed from: b */
    private static final Object f31946b = new Object();

    /* renamed from: a */
    public static boolean m40557a(Context context, Uri uri) {
        String authority = uri.getAuthority();
        boolean z = false;
        if (!"com.google.android.gms.phenotype".equals(authority)) {
            Log.e("PhenotypeClientHelper", String.valueOf(authority).concat(" is an unsupported authority. Only com.google.android.gms.phenotype authority is supported."));
            return false;
        } else if (f31945a.mo23414b()) {
            return ((Boolean) f31945a.mo23413a()).booleanValue();
        } else {
            synchronized (f31946b) {
                if (f31945a.mo23414b()) {
                    boolean booleanValue = ((Boolean) f31945a.mo23413a()).booleanValue();
                    return booleanValue;
                }
                if (!"com.google.android.gms".equals(context.getPackageName())) {
                    ProviderInfo resolveContentProvider = context.getPackageManager().resolveContentProvider("com.google.android.gms.phenotype", Build.VERSION.SDK_INT < 29 ? 0 : 268435456);
                    if (resolveContentProvider != null) {
                        if (!"com.google.android.gms".equals(resolveContentProvider.packageName)) {
                        }
                    }
                    f31945a = C6993h7.m40149d(Boolean.valueOf(z));
                    return ((Boolean) f31945a.mo23413a()).booleanValue();
                }
                try {
                    if ((context.getPackageManager().getApplicationInfo("com.google.android.gms", 0).flags & 129) != 0) {
                        z = true;
                    }
                } catch (PackageManager.NameNotFoundException unused) {
                }
                f31945a = C6993h7.m40149d(Boolean.valueOf(z));
                return ((Boolean) f31945a.mo23413a()).booleanValue();
            }
        }
    }
}
