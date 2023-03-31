package p081k5;

import android.app.AppOpsManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.graphics.drawable.Drawable;
import android.os.Binder;
import android.os.Process;
import androidx.core.util.C0827d;
import p067i5.C4699m;

/* renamed from: k5.b */
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public class C4887b {

    /* renamed from: a */
    protected final Context f25830a;

    public C4887b(Context context) {
        this.f25830a = context;
    }

    /* renamed from: a */
    public int mo18668a(String str) {
        return this.f25830a.checkCallingOrSelfPermission(str);
    }

    /* renamed from: b */
    public int mo18669b(String str, String str2) {
        return this.f25830a.getPackageManager().checkPermission(str, str2);
    }

    /* renamed from: c */
    public ApplicationInfo mo18670c(String str, int i) throws PackageManager.NameNotFoundException {
        return this.f25830a.getPackageManager().getApplicationInfo(str, i);
    }

    /* renamed from: d */
    public CharSequence mo18671d(String str) throws PackageManager.NameNotFoundException {
        return this.f25830a.getPackageManager().getApplicationLabel(this.f25830a.getPackageManager().getApplicationInfo(str, 0));
    }

    /* renamed from: e */
    public C0827d<CharSequence, Drawable> mo18672e(String str) throws PackageManager.NameNotFoundException {
        ApplicationInfo applicationInfo = this.f25830a.getPackageManager().getApplicationInfo(str, 0);
        return C0827d.m3649a(this.f25830a.getPackageManager().getApplicationLabel(applicationInfo), this.f25830a.getPackageManager().getApplicationIcon(applicationInfo));
    }

    /* renamed from: f */
    public PackageInfo mo18673f(String str, int i) throws PackageManager.NameNotFoundException {
        return this.f25830a.getPackageManager().getPackageInfo(str, i);
    }

    /* renamed from: g */
    public boolean mo18674g() {
        String nameForUid;
        if (Binder.getCallingUid() == Process.myUid()) {
            return C4886a.m31066a(this.f25830a);
        }
        if (!C4699m.m30418i() || (nameForUid = this.f25830a.getPackageManager().getNameForUid(Binder.getCallingUid())) == null) {
            return false;
        }
        return this.f25830a.getPackageManager().isInstantApp(nameForUid);
    }

    /* renamed from: h */
    public final boolean mo18675h(int i, String str) {
        if (C4699m.m30413d()) {
            try {
                AppOpsManager appOpsManager = (AppOpsManager) this.f25830a.getSystemService("appops");
                if (appOpsManager != null) {
                    appOpsManager.checkPackage(i, str);
                    return true;
                }
                throw new NullPointerException("context.getSystemService(Context.APP_OPS_SERVICE) is null");
            } catch (SecurityException unused) {
                return false;
            }
        } else {
            String[] packagesForUid = this.f25830a.getPackageManager().getPackagesForUid(i);
            if (!(str == null || packagesForUid == null)) {
                for (String equals : packagesForUid) {
                    if (str.equals(equals)) {
                        return true;
                    }
                }
            }
            return false;
        }
    }
}
