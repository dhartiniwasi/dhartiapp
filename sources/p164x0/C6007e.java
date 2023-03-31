package p164x0;

import android.content.Context;
import android.net.Uri;
import android.webkit.SafeBrowsingResponse;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import java.util.List;

/* renamed from: x0.e */
/* compiled from: ApiHelperForOMR1 */
public class C6007e {
    /* renamed from: a */
    public static void m35384a(SafeBrowsingResponse safeBrowsingResponse, boolean z) {
        safeBrowsingResponse.backToSafety(z);
    }

    /* renamed from: b */
    public static Uri m35385b() {
        return WebView.getSafeBrowsingPrivacyPolicyUrl();
    }

    /* renamed from: c */
    public static void m35386c(SafeBrowsingResponse safeBrowsingResponse, boolean z) {
        safeBrowsingResponse.proceed(z);
    }

    /* renamed from: d */
    public static void m35387d(List<String> list, ValueCallback<Boolean> valueCallback) {
        WebView.setSafeBrowsingWhitelist(list, valueCallback);
    }

    /* renamed from: e */
    public static void m35388e(SafeBrowsingResponse safeBrowsingResponse, boolean z) {
        safeBrowsingResponse.showInterstitial(z);
    }

    /* renamed from: f */
    public static void m35389f(Context context, ValueCallback<Boolean> valueCallback) {
        WebView.startSafeBrowsing(context, valueCallback);
    }
}
