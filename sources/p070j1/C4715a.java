package p070j1;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.Log;

/* renamed from: j1.a */
/* compiled from: AppSettingsManager */
final class C4715a {

    @FunctionalInterface
    /* renamed from: j1.a$a */
    /* compiled from: AppSettingsManager */
    interface C4716a {
        /* renamed from: a */
        void mo18376a(boolean z);
    }

    C4715a() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo18375a(Context context, C4716a aVar, C4717b bVar) {
        if (context == null) {
            Log.d("permissions_handler", "Context cannot be null.");
            bVar.mo18377a("PermissionHandler.AppSettingsManager", "Android context cannot be null.");
            return;
        }
        try {
            Intent intent = new Intent();
            intent.setAction("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.addCategory("android.intent.category.DEFAULT");
            intent.setData(Uri.parse("package:" + context.getPackageName()));
            intent.addFlags(268435456);
            intent.addFlags(1073741824);
            intent.addFlags(8388608);
            context.startActivity(intent);
            aVar.mo18376a(true);
        } catch (Exception unused) {
            aVar.mo18376a(false);
        }
    }
}
