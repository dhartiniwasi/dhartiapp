package p354se;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import androidx.core.content.C0689b;
import java.io.File;
import java.util.List;
import kotlin.jvm.internal.C11669k;

/* renamed from: se.h */
/* compiled from: IntentUtils.kt */
public final class C12526h {

    /* renamed from: a */
    public static final C12526h f46017a = new C12526h();

    private C12526h() {
    }

    /* renamed from: a */
    private final Intent m59709a(Context context, File file, String str) {
        Intent intent = new Intent("android.intent.action.VIEW");
        if (Build.VERSION.SDK_INT >= 24) {
            intent.setDataAndType(C0689b.getUriForFile(context, context.getPackageName() + ".flutter_downloader.provider", file), str);
        } else {
            intent.setDataAndType(Uri.fromFile(file), str);
        }
        intent.setFlags(268435456);
        intent.addFlags(1);
        return intent;
    }

    /* renamed from: b */
    private final boolean m59710b(Context context, Intent intent) {
        List<ResolveInfo> queryIntentActivities = context.getPackageManager().queryIntentActivities(intent, 0);
        C11669k.m56786d(queryIntentActivities, "manager.queryIntentActivities(intent, 0)");
        if (queryIntentActivities.size() > 0) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x003a A[SYNTHETIC, Splitter:B:24:0x003a] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0045 A[Catch:{ IOException -> 0x002a }] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x004b A[Catch:{ IOException -> 0x002a }] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x005d A[SYNTHETIC, Splitter:B:42:0x005d] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized android.content.Intent mo37329c(android.content.Context r4, java.lang.String r5, java.lang.String r6) {
        /*
            r3 = this;
            monitor-enter(r3)
            java.lang.String r0 = "context"
            kotlin.jvm.internal.C11669k.m56787e(r4, r0)     // Catch:{ all -> 0x0066 }
            java.lang.String r0 = "path"
            kotlin.jvm.internal.C11669k.m56787e(r5, r0)     // Catch:{ all -> 0x0066 }
            java.io.File r0 = new java.io.File     // Catch:{ all -> 0x0066 }
            r0.<init>(r5)     // Catch:{ all -> 0x0066 }
            android.content.Intent r6 = r3.m59709a(r4, r0, r6)     // Catch:{ all -> 0x0066 }
            boolean r1 = r3.m59710b(r4, r6)     // Catch:{ all -> 0x0066 }
            if (r1 == 0) goto L_0x001c
            monitor-exit(r3)
            return r6
        L_0x001c:
            r6 = 0
            java.io.FileInputStream r1 = new java.io.FileInputStream     // Catch:{ Exception -> 0x0033, all -> 0x0031 }
            r1.<init>(r5)     // Catch:{ Exception -> 0x0033, all -> 0x0031 }
            java.lang.String r2 = java.net.URLConnection.guessContentTypeFromStream(r1)     // Catch:{ Exception -> 0x002f }
            r1.close()     // Catch:{ IOException -> 0x002a }
            goto L_0x0043
        L_0x002a:
            r1 = move-exception
            r1.printStackTrace()     // Catch:{ all -> 0x0066 }
            goto L_0x0043
        L_0x002f:
            r2 = move-exception
            goto L_0x0035
        L_0x0031:
            r4 = move-exception
            goto L_0x005b
        L_0x0033:
            r2 = move-exception
            r1 = r6
        L_0x0035:
            r2.printStackTrace()     // Catch:{ all -> 0x0059 }
            if (r1 == 0) goto L_0x0042
            r1.close()     // Catch:{ IOException -> 0x003e }
            goto L_0x0042
        L_0x003e:
            r1 = move-exception
            r1.printStackTrace()     // Catch:{ all -> 0x0066 }
        L_0x0042:
            r2 = r6
        L_0x0043:
            if (r2 != 0) goto L_0x0049
            java.lang.String r2 = java.net.URLConnection.guessContentTypeFromName(r5)     // Catch:{ all -> 0x0066 }
        L_0x0049:
            if (r2 == 0) goto L_0x0057
            android.content.Intent r5 = r3.m59709a(r4, r0, r2)     // Catch:{ all -> 0x0066 }
            boolean r4 = r3.m59710b(r4, r5)     // Catch:{ all -> 0x0066 }
            if (r4 == 0) goto L_0x0057
            monitor-exit(r3)
            return r5
        L_0x0057:
            monitor-exit(r3)
            return r6
        L_0x0059:
            r4 = move-exception
            r6 = r1
        L_0x005b:
            if (r6 == 0) goto L_0x0065
            r6.close()     // Catch:{ IOException -> 0x0061 }
            goto L_0x0065
        L_0x0061:
            r5 = move-exception
            r5.printStackTrace()     // Catch:{ all -> 0x0066 }
        L_0x0065:
            throw r4     // Catch:{ all -> 0x0066 }
        L_0x0066:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p354se.C12526h.mo37329c(android.content.Context, java.lang.String, java.lang.String):android.content.Intent");
    }
}
