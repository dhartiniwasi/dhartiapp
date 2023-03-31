package p073j4;

import android.content.Context;
import android.content.SharedPreferences;
import android.webkit.WebSettings;
import p067i5.C4690d;
import p067i5.C4702p;
import p180z4.C6378j;

/* renamed from: j4.h1 */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class C4774h1 {

    /* renamed from: b */
    private static C4774h1 f25440b;

    /* renamed from: a */
    String f25441a;

    private C4774h1() {
    }

    /* renamed from: a */
    public static C4774h1 m30668a() {
        if (f25440b == null) {
            f25440b = new C4774h1();
        }
        return f25440b;
    }

    /* renamed from: b */
    public final void mo18462b(Context context) {
        C4794n1.m30693k("Updating user agent.");
        String defaultUserAgent = WebSettings.getDefaultUserAgent(context);
        if (!defaultUserAgent.equals(this.f25441a)) {
            Context e = C6378j.m37456e(context);
            if (!C4690d.m30374a()) {
                if (e == null) {
                    e = null;
                }
                this.f25441a = defaultUserAgent;
            }
            SharedPreferences.Editor putString = context.getSharedPreferences("admob_user_agent", 0).edit().putString("user_agent", WebSettings.getDefaultUserAgent(context));
            if (e == null) {
                putString.apply();
            } else {
                C4702p.m30424a(context, putString, "admob_user_agent");
            }
            this.f25441a = defaultUserAgent;
        }
        C4794n1.m30693k("User agent is updated.");
    }
}
