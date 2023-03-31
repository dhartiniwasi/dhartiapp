package p264io.flutter.plugins.webviewflutter;

import android.webkit.WebStorage;
import p264io.flutter.plugins.webviewflutter.C10940k;

/* renamed from: io.flutter.plugins.webviewflutter.w2 */
/* compiled from: WebStorageHostApiImpl */
public class C11046w2 implements C10940k.C10974w {

    /* renamed from: a */
    private final C10932i2 f42633a;

    /* renamed from: b */
    private final C11047a f42634b;

    /* renamed from: io.flutter.plugins.webviewflutter.w2$a */
    /* compiled from: WebStorageHostApiImpl */
    public static class C11047a {
        /* renamed from: a */
        public WebStorage mo34805a() {
            return WebStorage.getInstance();
        }
    }

    public C11046w2(C10932i2 i2Var, C11047a aVar) {
        this.f42633a = i2Var;
        this.f42634b = aVar;
    }

    /* renamed from: a */
    public void mo34752a(Long l) {
        this.f42633a.mo34667b(this.f42634b.mo34805a(), l.longValue());
    }

    /* renamed from: b */
    public void mo34753b(Long l) {
        ((WebStorage) this.f42633a.mo34671h(l.longValue())).deleteAllData();
    }
}
