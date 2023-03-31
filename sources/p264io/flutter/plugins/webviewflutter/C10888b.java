package p264io.flutter.plugins.webviewflutter;

import android.os.Build;
import android.webkit.CookieManager;
import java.util.Objects;
import p264io.flutter.plugins.webviewflutter.C10940k;

/* renamed from: io.flutter.plugins.webviewflutter.b */
/* compiled from: CookieManagerHostApiImpl */
class C10888b implements C10940k.C10943b {
    C10888b() {
    }

    /* renamed from: a */
    public void mo34637a(String str, String str2) {
        CookieManager.getInstance().setCookie(str, str2);
    }

    /* renamed from: b */
    public void mo34638b(C10940k.C10962n<Boolean> nVar) {
        CookieManager instance = CookieManager.getInstance();
        if (Build.VERSION.SDK_INT >= 21) {
            Objects.requireNonNull(nVar);
            instance.removeAllCookies(new C10883a(nVar));
            return;
        }
        boolean hasCookies = instance.hasCookies();
        if (hasCookies) {
            instance.removeAllCookie();
        }
        nVar.success(Boolean.valueOf(hasCookies));
    }
}
