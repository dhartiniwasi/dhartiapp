package p073j4;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.webkit.WebSettings;
import java.util.concurrent.Callable;
import p067i5.C4702p;

/* renamed from: j4.f1 */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final /* synthetic */ class C4766f1 implements Callable {

    /* renamed from: a */
    public final /* synthetic */ Context f25428a;

    public /* synthetic */ C4766f1(Context context) {
        this.f25428a = context;
    }

    public final Object call() {
        Context context = this.f25428a;
        SharedPreferences sharedPreferences = context.getSharedPreferences("admob_user_agent", 0);
        String string = sharedPreferences.getString("user_agent", "");
        if (TextUtils.isEmpty(string)) {
            C4794n1.m30693k("User agent is not initialized on Google Play Services. Initializing.");
            String defaultUserAgent = WebSettings.getDefaultUserAgent(context);
            C4702p.m30424a(context, sharedPreferences.edit().putString("user_agent", defaultUserAgent), "admob_user_agent");
            return defaultUserAgent;
        }
        C4794n1.m30693k("User agent is already initialized on Google Play Services.");
        return string;
    }
}
