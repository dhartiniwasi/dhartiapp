package p288lb;

import android.content.Context;
import p186ac.C6539c;
import p186ac.C6556k;
import p351sb.C12502a;

/* renamed from: lb.a */
/* compiled from: DeviceInfoPlusPlugin */
public class C11781a implements C12502a {

    /* renamed from: a */
    C6556k f44424a;

    /* renamed from: a */
    private void m57115a(C6539c cVar, Context context) {
        this.f44424a = new C6556k(cVar, "dev.fluttercommunity.plus/device_info");
        this.f44424a.mo22161e(new C11782b(context.getContentResolver(), context.getPackageManager()));
    }

    /* renamed from: b */
    private void m57116b() {
        this.f44424a.mo22161e((C6556k.C6560c) null);
        this.f44424a = null;
    }

    public void onAttachedToEngine(C12502a.C12504b bVar) {
        m57115a(bVar.mo37293b(), bVar.mo37292a());
    }

    public void onDetachedFromEngine(C12502a.C12504b bVar) {
        m57116b();
    }
}
