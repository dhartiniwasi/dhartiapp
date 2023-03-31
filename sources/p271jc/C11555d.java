package p271jc;

import android.app.Activity;
import android.content.Context;
import android.util.Log;
import p186ac.C6539c;
import p186ac.C6555j;
import p186ac.C6556k;
import p186ac.C6570s;
import p403y6.C13051b;
import p403y6.C13053c;
import p403y6.C13056d;
import p403y6.C13058e;
import p403y6.C13059f;

/* renamed from: jc.d */
/* compiled from: UserMessagingPlatformManager */
public class C11555d implements C6556k.C6560c {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C11554c f44026a;

    /* renamed from: b */
    private final C6556k f44027b;

    /* renamed from: c */
    private final Context f44028c;

    /* renamed from: d */
    private C13053c f44029d;

    /* renamed from: e */
    private Activity f44030e;

    /* renamed from: jc.d$a */
    /* compiled from: UserMessagingPlatformManager */
    class C11556a implements C13053c.C13055b {

        /* renamed from: a */
        final /* synthetic */ C6556k.C6561d f44031a;

        C11556a(C6556k.C6561d dVar) {
            this.f44031a = dVar;
        }

        /* renamed from: a */
        public void mo35659a() {
            this.f44031a.success((Object) null);
        }
    }

    /* renamed from: jc.d$b */
    /* compiled from: UserMessagingPlatformManager */
    class C11557b implements C13053c.C13054a {

        /* renamed from: a */
        final /* synthetic */ C6556k.C6561d f44033a;

        C11557b(C6556k.C6561d dVar) {
            this.f44033a = dVar;
        }

        /* renamed from: a */
        public void mo35660a(C13058e eVar) {
            this.f44033a.error(Integer.toString(eVar.mo38092a()), eVar.mo38093b(), (Object) null);
        }
    }

    /* renamed from: jc.d$c */
    /* compiled from: UserMessagingPlatformManager */
    class C11558c implements C13059f.C13061b {

        /* renamed from: a */
        final /* synthetic */ C6556k.C6561d f44035a;

        C11558c(C6556k.C6561d dVar) {
            this.f44035a = dVar;
        }

        /* renamed from: a */
        public void mo19908a(C13051b bVar) {
            C11555d.this.f44026a.mo35657s(bVar);
            this.f44035a.success(bVar);
        }
    }

    /* renamed from: jc.d$d */
    /* compiled from: UserMessagingPlatformManager */
    class C11559d implements C13059f.C13060a {

        /* renamed from: a */
        final /* synthetic */ C6556k.C6561d f44037a;

        C11559d(C6556k.C6561d dVar) {
            this.f44037a = dVar;
        }

        /* renamed from: b */
        public void mo19909b(C13058e eVar) {
            this.f44037a.error(Integer.toString(eVar.mo38092a()), eVar.mo38093b(), (Object) null);
        }
    }

    /* renamed from: jc.d$e */
    /* compiled from: UserMessagingPlatformManager */
    class C11560e implements C13051b.C13052a {

        /* renamed from: a */
        final /* synthetic */ C6556k.C6561d f44039a;

        C11560e(C6556k.C6561d dVar) {
            this.f44039a = dVar;
        }

        /* renamed from: a */
        public void mo35661a(C13058e eVar) {
            if (eVar != null) {
                this.f44039a.error(Integer.toString(eVar.mo38092a()), eVar.mo38093b(), (Object) null);
            } else {
                this.f44039a.success((Object) null);
            }
        }
    }

    public C11555d(C6539c cVar, Context context) {
        C11554c cVar2 = new C11554c();
        this.f44026a = cVar2;
        C6556k kVar = new C6556k(cVar, "plugins.flutter.io/google_mobile_ads/ump", new C6570s(cVar2));
        this.f44027b = kVar;
        kVar.mo22161e(this);
        this.f44028c = context;
    }

    /* renamed from: b */
    private C13053c m56488b() {
        C13053c cVar = this.f44029d;
        if (cVar != null) {
            return cVar;
        }
        C13053c a = C13059f.m61401a(this.f44028c);
        this.f44029d = a;
        return a;
    }

    /* renamed from: c */
    public void mo35658c(Activity activity) {
        this.f44030e = activity;
    }

    public void onMethodCall(C6555j jVar, C6556k.C6561d dVar) {
        C13056d dVar2;
        String str = jVar.f30999a;
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case -2068759970:
                if (str.equals("ConsentInformation#reset")) {
                    c = 0;
                    break;
                }
                break;
            case -1310145901:
                if (str.equals("ConsentInformation#requestConsentInfoUpdate")) {
                    c = 1;
                    break;
                }
                break;
            case -971145086:
                if (str.equals("ConsentForm#show")) {
                    c = 2;
                    break;
                }
                break;
            case -878979462:
                if (str.equals("ConsentForm#dispose")) {
                    c = 3;
                    break;
                }
                break;
            case -585732218:
                if (str.equals("ConsentInformation#isConsentFormAvailable")) {
                    c = 4;
                    break;
                }
                break;
            case -497439839:
                if (str.equals("UserMessagingPlatform#loadConsentForm")) {
                    c = 5;
                    break;
                }
                break;
            case 665104519:
                if (str.equals("ConsentInformation#getConsentStatus")) {
                    c = 6;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                m56488b().reset();
                dVar.success((Object) null);
                return;
            case 1:
                if (this.f44030e == null) {
                    dVar.error("0", "ConsentInformation#requestConsentInfoUpdate called before plugin has been registered to an activity.", (Object) null);
                    return;
                }
                C11553b bVar = (C11553b) jVar.mo22156a("params");
                if (bVar == null) {
                    dVar2 = new C13056d.C13057a().mo38089a();
                } else {
                    dVar2 = bVar.mo35651a(this.f44030e);
                }
                m56488b().mo19899c(this.f44030e, dVar2, new C11556a(dVar), new C11557b(dVar));
                return;
            case 2:
                C13051b bVar2 = (C13051b) jVar.mo22156a("consentForm");
                if (bVar2 == null) {
                    dVar.error("0", "ConsentForm#show", (Object) null);
                    return;
                } else {
                    bVar2.mo19911a(this.f44030e, new C11560e(dVar));
                    return;
                }
            case 3:
                C13051b bVar3 = (C13051b) jVar.mo22156a("consentForm");
                if (bVar3 == null) {
                    Log.w("0", "Called dispose on ad that has been freed");
                } else {
                    this.f44026a.mo35656r(bVar3);
                }
                dVar.success((Object) null);
                return;
            case 4:
                dVar.success(Boolean.valueOf(m56488b().mo19898b()));
                return;
            case 5:
                C13059f.m61402b(this.f44028c, new C11558c(dVar), new C11559d(dVar));
                return;
            case 6:
                dVar.success(Integer.valueOf(m56488b().mo19897a()));
                return;
            default:
                dVar.notImplemented();
                return;
        }
    }
}
