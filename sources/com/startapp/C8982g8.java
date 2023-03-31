package com.startapp;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import com.startapp.C8874c4;
import java.util.concurrent.CountDownLatch;

/* renamed from: com.startapp.g8 */
/* compiled from: Sta */
public class C8982g8 {

    /* renamed from: a */
    public static volatile C9133m8 f36855a;

    /* renamed from: com.startapp.g8$a */
    /* compiled from: Sta */
    public static final class C8983a implements ServiceConnection {

        /* renamed from: a */
        public final String f36856a;

        /* renamed from: b */
        public final CountDownLatch f36857b;

        public C8983a(String str, CountDownLatch countDownLatch) {
            this.f36856a = str;
            this.f36857b = countDownLatch;
        }

        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            C8874c4 c4Var;
            try {
                int i = C8874c4.C8875a.f36569a;
                if (iBinder == null) {
                    c4Var = null;
                } else {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
                    if (queryLocalInterface == null || !(queryLocalInterface instanceof C8874c4)) {
                        c4Var = new C8874c4.C8875a.C8876a(iBinder);
                    } else {
                        c4Var = (C8874c4) queryLocalInterface;
                    }
                }
                Bundle bundle = new Bundle();
                bundle.putString("package_name", this.f36856a);
                C8982g8.f36855a = new C9133m8(c4Var.mo29243a(bundle));
            } catch (Throwable unused) {
            }
            this.f36857b.countDown();
        }

        public void onServiceDisconnected(ComponentName componentName) {
            this.f36857b.countDown();
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:24|25|26|27|28) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x0075 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.startapp.C9133m8 m48648a(android.content.Context r6) {
        /*
            java.lang.String r0 = "com.android.vending"
            com.startapp.m8 r1 = f36855a
            if (r1 != 0) goto L_0x007d
            android.content.Intent r1 = new android.content.Intent     // Catch:{ SecurityException -> 0x007d, all -> 0x0079 }
            java.lang.String r2 = "com.google.android.finsky.BIND_GET_INSTALL_REFERRER_SERVICE"
            r1.<init>(r2)     // Catch:{ SecurityException -> 0x007d, all -> 0x0079 }
            android.content.ComponentName r2 = new android.content.ComponentName     // Catch:{ SecurityException -> 0x007d, all -> 0x0079 }
            java.lang.String r3 = "com.google.android.finsky.externalreferrer.GetInstallReferrerService"
            r2.<init>(r0, r3)     // Catch:{ SecurityException -> 0x007d, all -> 0x0079 }
            r1.setComponent(r2)     // Catch:{ SecurityException -> 0x007d, all -> 0x0079 }
            android.content.pm.PackageManager r2 = r6.getPackageManager()     // Catch:{ SecurityException -> 0x007d, all -> 0x0079 }
            r3 = 0
            java.util.List r2 = r2.queryIntentServices(r1, r3)     // Catch:{ SecurityException -> 0x007d, all -> 0x0079 }
            if (r2 == 0) goto L_0x007d
            boolean r4 = r2.isEmpty()     // Catch:{ SecurityException -> 0x007d, all -> 0x0079 }
            if (r4 != 0) goto L_0x007d
            java.lang.Object r2 = r2.get(r3)     // Catch:{ SecurityException -> 0x007d, all -> 0x0079 }
            android.content.pm.ResolveInfo r2 = (android.content.pm.ResolveInfo) r2     // Catch:{ SecurityException -> 0x007d, all -> 0x0079 }
            android.content.pm.ServiceInfo r2 = r2.serviceInfo     // Catch:{ SecurityException -> 0x007d, all -> 0x0079 }
            if (r2 == 0) goto L_0x007d
            java.lang.String r4 = r2.packageName     // Catch:{ SecurityException -> 0x007d, all -> 0x0079 }
            java.lang.String r2 = r2.name     // Catch:{ SecurityException -> 0x007d, all -> 0x0079 }
            boolean r4 = r0.equals(r4)     // Catch:{ SecurityException -> 0x007d, all -> 0x0079 }
            if (r4 == 0) goto L_0x007d
            if (r2 == 0) goto L_0x007d
            android.content.pm.PackageManager r2 = r6.getPackageManager()     // Catch:{ SecurityException -> 0x007d, all -> 0x0079 }
            r4 = 1
            r5 = 128(0x80, float:1.794E-43)
            android.content.pm.PackageInfo r0 = r2.getPackageInfo(r0, r5)     // Catch:{ NameNotFoundException -> 0x0052 }
            int r0 = r0.versionCode     // Catch:{ NameNotFoundException -> 0x0052 }
            r2 = 80837300(0x4d17ab4, float:4.924835E-36)
            if (r0 < r2) goto L_0x0053
            r3 = 1
            goto L_0x0053
        L_0x0052:
        L_0x0053:
            if (r3 == 0) goto L_0x007d
            android.content.Intent r0 = new android.content.Intent     // Catch:{ SecurityException -> 0x007d, all -> 0x0079 }
            r0.<init>(r1)     // Catch:{ SecurityException -> 0x007d, all -> 0x0079 }
            java.util.concurrent.CountDownLatch r1 = new java.util.concurrent.CountDownLatch     // Catch:{ SecurityException -> 0x007d, all -> 0x0079 }
            r1.<init>(r4)     // Catch:{ SecurityException -> 0x007d, all -> 0x0079 }
            com.startapp.g8$a r2 = new com.startapp.g8$a     // Catch:{ SecurityException -> 0x007d, all -> 0x0079 }
            java.lang.String r3 = r6.getPackageName()     // Catch:{ SecurityException -> 0x007d, all -> 0x0079 }
            r2.<init>(r3, r1)     // Catch:{ SecurityException -> 0x007d, all -> 0x0079 }
            boolean r0 = r6.bindService(r0, r2, r4)     // Catch:{ SecurityException -> 0x007d, all -> 0x0079 }
            if (r0 == 0) goto L_0x007d
            r3 = 1
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ InterruptedException -> 0x0075 }
            r1.await(r3, r0)     // Catch:{ InterruptedException -> 0x0075 }
        L_0x0075:
            com.startapp.C8837b0.m48299a((android.content.Context) r6, (android.content.ServiceConnection) r2)     // Catch:{ SecurityException -> 0x007d, all -> 0x0079 }
            goto L_0x007d
        L_0x0079:
            r6 = move-exception
            com.startapp.C9023i4.m48681a((java.lang.Throwable) r6)
        L_0x007d:
            com.startapp.m8 r6 = f36855a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.startapp.C8982g8.m48648a(android.content.Context):com.startapp.m8");
    }
}
