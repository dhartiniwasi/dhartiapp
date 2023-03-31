package p256i7;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.internal.measurement.C6904c3;
import com.google.firebase.analytics.connector.internal.C7774b;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import p033d5.C4141r;
import p246h7.C10408b;
import p246h7.C10412f;
import p393x5.C12974a;
import p395x7.C12977a;
import p395x7.C12980d;

/* renamed from: i7.b */
/* compiled from: com.google.android.gms:play-services-measurement-api@@21.2.0 */
public class C10549b implements C10548a {

    /* renamed from: c */
    private static volatile C10548a f41578c;

    /* renamed from: a */
    final C12974a f41579a;

    /* renamed from: b */
    final Map f41580b = new ConcurrentHashMap();

    C10549b(C12974a aVar) {
        C4141r.m28221k(aVar);
        this.f41579a = aVar;
    }

    /* renamed from: c */
    public static C10548a m53071c(C10412f fVar, Context context, C12980d dVar) {
        C4141r.m28221k(fVar);
        C4141r.m28221k(context);
        C4141r.m28221k(dVar);
        C4141r.m28221k(context.getApplicationContext());
        if (f41578c == null) {
            synchronized (C10549b.class) {
                if (f41578c == null) {
                    Bundle bundle = new Bundle(1);
                    if (fVar.mo33475y()) {
                        dVar.mo36308d(C10408b.class, C10550c.f41581a, C10551d.f41582a);
                        bundle.putBoolean("dataCollectionDefaultEnabled", fVar.mo33474x());
                    }
                    f41578c = new C10549b(C6904c3.m39706z(context, (String) null, (String) null, (String) null, bundle).mo23176w());
                }
            }
        }
        return f41578c;
    }

    /* renamed from: d */
    static /* synthetic */ void m53072d(C12977a aVar) {
        boolean z = ((C10408b) aVar.mo38038a()).f41330a;
        synchronized (C10549b.class) {
            ((C10549b) C4141r.m28221k(f41578c)).f41579a.mo38037u(z);
        }
    }

    /* renamed from: a */
    public void mo33743a(String str, String str2, Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        if (C7774b.m43231d(str) && C7774b.m43230c(str2, bundle) && C7774b.m43229b(str, str2, bundle)) {
            C7774b.m43228a(str, str2, bundle);
            this.f41579a.mo38030n(str, str2, bundle);
        }
    }

    /* renamed from: b */
    public void mo33744b(String str, String str2, Object obj) {
        if (C7774b.m43231d(str) && C7774b.m43232e(str, str2)) {
            this.f41579a.mo38036t(str, str2, obj);
        }
    }
}
