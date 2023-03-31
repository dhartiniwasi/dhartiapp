package p180z4;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.Signature;
import android.util.Log;
import com.google.errorprone.annotations.RestrictedInheritance;
import p033d5.C4141r;

@RestrictedInheritance(allowedOnPath = ".*java.*/com/google/android/gms/common/testing/.*", explanation = "Sub classing of GMS Core's APIs are restricted to testing fakes.", link = "go/gmscore-restrictedinheritance")
/* renamed from: z4.k */
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public class C6380k {

    /* renamed from: c */
    private static C6380k f30623c;

    /* renamed from: a */
    private final Context f30624a;

    /* renamed from: b */
    private volatile String f30625b;

    public C6380k(Context context) {
        this.f30624a = context.getApplicationContext();
    }

    /* renamed from: a */
    public static C6380k m37466a(Context context) {
        C4141r.m28221k(context);
        synchronized (C6380k.class) {
            if (f30623c == null) {
                C6363b0.m37407d(context);
                f30623c = new C6380k(context);
            }
        }
        return f30623c;
    }

    /* renamed from: d */
    static final C6396x m37467d(PackageInfo packageInfo, C6396x... xVarArr) {
        Signature[] signatureArr = packageInfo.signatures;
        if (signatureArr == null) {
            return null;
        }
        if (signatureArr.length != 1) {
            Log.w("GoogleSignatureVerifier", "Package has more than one signature.");
            return null;
        }
        C6397y yVar = new C6397y(packageInfo.signatures[0].toByteArray());
        for (int i = 0; i < xVarArr.length; i++) {
            if (xVarArr[i].equals(yVar)) {
                return xVarArr[i];
            }
        }
        return null;
    }

    /* renamed from: e */
    public static final boolean m37468e(PackageInfo packageInfo, boolean z) {
        C6396x xVar;
        if (z && packageInfo != null && ("com.android.vending".equals(packageInfo.packageName) || "com.google.android.gms".equals(packageInfo.packageName))) {
            ApplicationInfo applicationInfo = packageInfo.applicationInfo;
            if (applicationInfo == null || (applicationInfo.flags & 129) == 0) {
                z = false;
            } else {
                z = true;
            }
        }
        if (!(packageInfo == null || packageInfo.signatures == null)) {
            if (z) {
                xVar = m37467d(packageInfo, C6361a0.f30576a);
            } else {
                xVar = m37467d(packageInfo, C6361a0.f30576a[0]);
            }
            if (xVar != null) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x005c, code lost:
        r8 = r8.applicationInfo;
     */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final p180z4.C6383l0 m37469f(java.lang.String r6, boolean r7, boolean r8) {
        /*
            r5 = this;
            java.lang.String r7 = "null pkg"
            if (r6 != 0) goto L_0x0009
            z4.l0 r6 = p180z4.C6383l0.m37473c(r7)
            return r6
        L_0x0009:
            java.lang.String r8 = r5.f30625b
            boolean r8 = r6.equals(r8)
            if (r8 != 0) goto L_0x0090
            boolean r8 = p180z4.C6363b0.m37408e()
            r0 = 0
            if (r8 == 0) goto L_0x0023
            android.content.Context r7 = r5.f30624a
            boolean r7 = p180z4.C6378j.m37458g(r7)
            z4.l0 r7 = p180z4.C6363b0.m37405b(r6, r7, r0, r0)
            goto L_0x007d
        L_0x0023:
            android.content.Context r8 = r5.f30624a     // Catch:{ NameNotFoundException -> 0x0084 }
            android.content.pm.PackageManager r8 = r8.getPackageManager()     // Catch:{ NameNotFoundException -> 0x0084 }
            r1 = 64
            android.content.pm.PackageInfo r8 = r8.getPackageInfo(r6, r1)     // Catch:{ NameNotFoundException -> 0x0084 }
            android.content.Context r1 = r5.f30624a
            boolean r1 = p180z4.C6378j.m37458g(r1)
            if (r8 != 0) goto L_0x003c
            z4.l0 r7 = p180z4.C6383l0.m37473c(r7)
            goto L_0x007d
        L_0x003c:
            android.content.pm.Signature[] r7 = r8.signatures
            if (r7 == 0) goto L_0x0077
            int r7 = r7.length
            r2 = 1
            if (r7 == r2) goto L_0x0045
            goto L_0x0077
        L_0x0045:
            z4.y r7 = new z4.y
            android.content.pm.Signature[] r3 = r8.signatures
            r3 = r3[r0]
            byte[] r3 = r3.toByteArray()
            r7.<init>(r3)
            java.lang.String r3 = r8.packageName
            z4.l0 r1 = p180z4.C6363b0.m37404a(r3, r7, r1, r0)
            boolean r4 = r1.f30628a
            if (r4 == 0) goto L_0x0075
            android.content.pm.ApplicationInfo r8 = r8.applicationInfo
            if (r8 == 0) goto L_0x0075
            int r8 = r8.flags
            r8 = r8 & 2
            if (r8 == 0) goto L_0x0075
            z4.l0 r7 = p180z4.C6363b0.m37404a(r3, r7, r0, r2)
            boolean r7 = r7.f30628a
            if (r7 == 0) goto L_0x0075
            java.lang.String r7 = "debuggable release cert app rejected"
            z4.l0 r7 = p180z4.C6383l0.m37473c(r7)
            goto L_0x007d
        L_0x0075:
            r7 = r1
            goto L_0x007d
        L_0x0077:
            java.lang.String r7 = "single cert required"
            z4.l0 r7 = p180z4.C6383l0.m37473c(r7)
        L_0x007d:
            boolean r8 = r7.f30628a
            if (r8 == 0) goto L_0x0083
            r5.f30625b = r6
        L_0x0083:
            return r7
        L_0x0084:
            r7 = move-exception
            java.lang.String r8 = "no pkg "
            java.lang.String r6 = r8.concat(r6)
            z4.l0 r6 = p180z4.C6383l0.m37474d(r6, r7)
            return r6
        L_0x0090:
            z4.l0 r6 = p180z4.C6383l0.m37472b()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p180z4.C6380k.m37469f(java.lang.String, boolean, boolean):z4.l0");
    }

    /* renamed from: b */
    public boolean mo21808b(PackageInfo packageInfo) {
        if (packageInfo == null) {
            return false;
        }
        if (m37468e(packageInfo, false)) {
            return true;
        }
        if (m37468e(packageInfo, true)) {
            if (C6378j.m37458g(this.f30624a)) {
                return true;
            }
            Log.w("GoogleSignatureVerifier", "Test-keys aren't accepted on this build.");
        }
        return false;
    }

    /* renamed from: c */
    public boolean mo21809c(int i) {
        C6383l0 l0Var;
        int length;
        String[] packagesForUid = this.f30624a.getPackageManager().getPackagesForUid(i);
        if (packagesForUid != null && (length = packagesForUid.length) != 0) {
            l0Var = null;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    C4141r.m28221k(l0Var);
                    break;
                }
                l0Var = m37469f(packagesForUid[i2], false, false);
                if (l0Var.f30628a) {
                    break;
                }
                i2++;
            }
        } else {
            l0Var = C6383l0.m37473c("no pkgs");
        }
        l0Var.mo21810e();
        return l0Var.f30628a;
    }
}
