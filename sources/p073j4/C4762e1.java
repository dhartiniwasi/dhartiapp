package p073j4;

import android.content.Context;
import android.os.StrictMode;
import com.google.android.gms.internal.ads.ag0;
import com.google.android.gms.internal.ads.pm0;
import java.util.concurrent.Callable;

/* renamed from: j4.e1 */
/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public final class C4762e1 {
    @Deprecated
    /* renamed from: a */
    public static Object m30653a(Context context, Callable callable) {
        StrictMode.ThreadPolicy threadPolicy;
        try {
            threadPolicy = StrictMode.getThreadPolicy();
            StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitDiskReads().permitDiskWrites().build());
            Object call = callable.call();
            StrictMode.setThreadPolicy(threadPolicy);
            return call;
        } catch (Throwable th) {
            pm0.m18665e("Unexpected exception.", th);
            ag0.m9704c(context).mo8326b(th, "StrictModeUtil.runWithLaxStrictMode");
            return null;
        }
    }
}
