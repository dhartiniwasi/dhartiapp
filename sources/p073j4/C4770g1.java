package p073j4;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.webkit.WebSettings;
import java.util.concurrent.Callable;

/* renamed from: j4.g1 */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final /* synthetic */ class C4770g1 implements Callable {

    /* renamed from: a */
    public final /* synthetic */ Context f25432a;

    /* renamed from: b */
    public final /* synthetic */ Context f25433b;

    public /* synthetic */ C4770g1(Context context, Context context2) {
        this.f25432a = context;
        this.f25433b = context2;
    }

    public final Object call() {
        SharedPreferences sharedPreferences;
        Context context = this.f25432a;
        Context context2 = this.f25433b;
        boolean z = false;
        if (context != null) {
            C4794n1.m30693k("Attempting to read user agent from Google Play Services.");
            sharedPreferences = context.getSharedPreferences("admob_user_agent", 0);
        } else {
            C4794n1.m30693k("Attempting to read user agent from local cache.");
            sharedPreferences = context2.getSharedPreferences("admob_user_agent", 0);
            z = true;
        }
        String string = sharedPreferences.getString("user_agent", "");
        if (TextUtils.isEmpty(string)) {
            C4794n1.m30693k("Reading user agent from WebSettings");
            string = WebSettings.getDefaultUserAgent(context2);
            if (z) {
                sharedPreferences.edit().putString("user_agent", string).apply();
                C4794n1.m30693k("Persisting user agent.");
            }
        }
        return string;
    }
}
