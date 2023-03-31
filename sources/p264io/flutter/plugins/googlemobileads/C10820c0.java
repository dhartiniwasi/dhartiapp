package p264io.flutter.plugins.googlemobileads;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;

/* renamed from: io.flutter.plugins.googlemobileads.c0 */
/* compiled from: FlutterRequestAgentProvider */
class C10820c0 {

    /* renamed from: a */
    private String f42262a;

    /* renamed from: b */
    private String f42263b;

    C10820c0(Context context) {
        m54081b(context);
    }

    /* renamed from: b */
    private void m54081b(Context context) {
        try {
            ApplicationInfo applicationInfo = context.getApplicationContext().getPackageManager().getApplicationInfo(context.getPackageName(), 128);
            Bundle bundle = applicationInfo.metaData;
            if (bundle != null) {
                this.f42263b = bundle.getString("io.flutter.plugins.googlemobileads.FLUTTER_GAME_TEMPLATE_VERSION");
                this.f42262a = applicationInfo.metaData.getString("io.flutter.plugins.googlemobileads.FLUTTER_NEWS_TEMPLATE_VERSION");
            }
        } catch (PackageManager.NameNotFoundException | ClassCastException unused) {
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public String mo34476a() {
        StringBuilder sb = new StringBuilder();
        sb.append("Flutter-GMA-2.3.0");
        if (this.f42262a != null) {
            sb.append("_");
            sb.append("News");
            sb.append("-");
            sb.append(this.f42262a);
        }
        if (this.f42263b != null) {
            sb.append("_");
            sb.append("Game");
            sb.append("-");
            sb.append(this.f42263b);
        }
        return sb.toString();
    }
}
