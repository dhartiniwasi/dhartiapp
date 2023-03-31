package p264io.flutter.plugins.webviewflutter;

import android.webkit.DownloadListener;
import p264io.flutter.plugins.webviewflutter.C10940k;

/* renamed from: io.flutter.plugins.webviewflutter.e */
/* compiled from: DownloadListenerHostApiImpl */
public class C10904e implements C10940k.C10953f {

    /* renamed from: a */
    private final C10932i2 f42461a;

    /* renamed from: b */
    private final C10905a f42462b;

    /* renamed from: c */
    private final C10899d f42463c;

    /* renamed from: io.flutter.plugins.webviewflutter.e$a */
    /* compiled from: DownloadListenerHostApiImpl */
    public static class C10905a {
        /* renamed from: a */
        public C10906b mo34647a(C10899d dVar) {
            return new C10906b(dVar);
        }
    }

    /* renamed from: io.flutter.plugins.webviewflutter.e$b */
    /* compiled from: DownloadListenerHostApiImpl */
    public static class C10906b implements DownloadListener, C11008p2 {

        /* renamed from: a */
        private C10899d f42464a;

        public C10906b(C10899d dVar) {
            this.f42464a = dVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: d */
        public static /* synthetic */ void m54321d(Void voidR) {
        }

        /* access modifiers changed from: private */
        /* renamed from: e */
        public static /* synthetic */ void m54322e(Void voidR) {
        }

        /* renamed from: a */
        public void mo34648a() {
            C10899d dVar = this.f42464a;
            if (dVar != null) {
                dVar.mo34644h(this, C10911f.f42469a);
            }
            this.f42464a = null;
        }

        public void onDownloadStart(String str, String str2, String str3, String str4, long j) {
            C10899d dVar = this.f42464a;
            if (dVar != null) {
                dVar.mo34645j(this, str, str2, str3, str4, j, C10917g.f42475a);
            }
        }
    }

    public C10904e(C10932i2 i2Var, C10905a aVar, C10899d dVar) {
        this.f42461a = i2Var;
        this.f42462b = aVar;
        this.f42463c = dVar;
    }

    /* renamed from: a */
    public void mo34646a(Long l) {
        this.f42461a.mo34667b(this.f42462b.mo34647a(this.f42463c), l.longValue());
    }
}
