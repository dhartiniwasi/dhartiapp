package p070j1;

import android.app.Activity;
import android.content.Context;
import java.util.List;
import java.util.Objects;
import p186ac.C6555j;
import p186ac.C6556k;

/* renamed from: j1.l */
/* compiled from: MethodCallHandlerImpl */
final class C4718l implements C6556k.C6560c {

    /* renamed from: a */
    private final Context f25295a;

    /* renamed from: b */
    private final C4715a f25296b;

    /* renamed from: c */
    private final C4720n f25297c;

    /* renamed from: d */
    private final C4725p f25298d;

    /* renamed from: e */
    private Activity f25299e;

    C4718l(Context context, C4715a aVar, C4720n nVar, C4725p pVar) {
        this.f25295a = context;
        this.f25296b = aVar;
        this.f25297c = nVar;
        this.f25298d = pVar;
    }

    /* renamed from: i */
    public void mo18378i(Activity activity) {
        this.f25299e = activity;
    }

    public void onMethodCall(C6555j jVar, C6556k.C6561d dVar) {
        String str = jVar.f30999a;
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case -1544053025:
                if (str.equals("checkServiceStatus")) {
                    c = 0;
                    break;
                }
                break;
            case -1017315255:
                if (str.equals("shouldShowRequestPermissionRationale")) {
                    c = 1;
                    break;
                }
                break;
            case -576207927:
                if (str.equals("checkPermissionStatus")) {
                    c = 2;
                    break;
                }
                break;
            case 347240634:
                if (str.equals("openAppSettings")) {
                    c = 3;
                    break;
                }
                break;
            case 1669188213:
                if (str.equals("requestPermissions")) {
                    c = 4;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                int parseInt = Integer.parseInt(jVar.f31000b.toString());
                C4725p pVar = this.f25298d;
                Context context = this.f25295a;
                Objects.requireNonNull(dVar);
                pVar.mo18391a(parseInt, context, new C11484k(dVar), new C11478e(dVar));
                return;
            case 1:
                int parseInt2 = Integer.parseInt(jVar.f31000b.toString());
                C4720n nVar = this.f25297c;
                Activity activity = this.f25299e;
                Objects.requireNonNull(dVar);
                nVar.mo18385h(parseInt2, activity, new C11483j(dVar), new C11480g(dVar));
                return;
            case 2:
                int parseInt3 = Integer.parseInt(jVar.f31000b.toString());
                C4720n nVar2 = this.f25297c;
                Context context2 = this.f25295a;
                Objects.requireNonNull(dVar);
                nVar2.mo18383c(parseInt3, context2, new C11481h(dVar));
                return;
            case 3:
                C4715a aVar = this.f25296b;
                Context context3 = this.f25295a;
                Objects.requireNonNull(dVar);
                aVar.mo18375a(context3, new C11476c(dVar), new C11479f(dVar));
                return;
            case 4:
                C4720n nVar3 = this.f25297c;
                Activity activity2 = this.f25299e;
                Objects.requireNonNull(dVar);
                nVar3.mo18384g((List) jVar.mo22157b(), activity2, new C11482i(dVar), new C11477d(dVar));
                return;
            default:
                dVar.notImplemented();
                return;
        }
    }
}
