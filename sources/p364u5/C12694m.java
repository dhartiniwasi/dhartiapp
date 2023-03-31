package p364u5;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.api.GoogleApiClient;
import p033d5.C4095d;
import p033d5.C4105g;

/* renamed from: u5.m */
public final class C12694m extends C4105g<C12687h> {

    /* renamed from: Q */
    private final Context f46458Q;

    public C12694m(Context context, Looper looper, C4095d dVar, GoogleApiClient.C2049b bVar, GoogleApiClient.C2050c cVar) {
        super(context, looper, 45, dVar, bVar, cVar);
        this.f46458Q = context;
    }

    /* access modifiers changed from: protected */
    /* renamed from: I */
    public final String mo9818I() {
        return "com.google.android.gms.safetynet.internal.ISafetyNetService";
    }

    /* access modifiers changed from: protected */
    /* renamed from: J */
    public final String mo9819J() {
        return "com.google.android.gms.safetynet.service.START";
    }

    /* renamed from: m */
    public final int mo12268m() {
        return 12200000;
    }

    /* access modifiers changed from: protected */
    /* renamed from: p0 */
    public final String mo37567p0(String str) {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        try {
            PackageManager packageManager = this.f46458Q.getPackageManager();
            if (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(this.f46458Q.getPackageName(), 128)) == null || (bundle = applicationInfo.metaData) == null) {
                return null;
            }
            return (String) bundle.get(str);
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public final /* synthetic */ IInterface mo9821w(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.safetynet.internal.ISafetyNetService");
        return queryLocalInterface instanceof C12687h ? (C12687h) queryLocalInterface : new C12688i(iBinder);
    }
}
