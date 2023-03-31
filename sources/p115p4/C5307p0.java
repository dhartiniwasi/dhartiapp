package p115p4;

import android.net.Uri;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.C2679nz;
import com.google.android.gms.internal.ads.pm0;
import com.google.android.gms.internal.ads.qf0;
import com.google.android.gms.internal.ads.ye3;
import com.google.android.gms.internal.ads.yy2;
import java.util.List;
import p060h4.C4596v;

/* renamed from: p4.p0 */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class C5307p0 implements ye3 {

    /* renamed from: a */
    final /* synthetic */ qf0 f27316a;

    /* renamed from: b */
    final /* synthetic */ boolean f27317b;

    /* renamed from: c */
    final /* synthetic */ C5280c f27318c;

    C5307p0(C5280c cVar, qf0 qf0, boolean z) {
        this.f27318c = cVar;
        this.f27316a = qf0;
        this.f27317b = z;
    }

    /* renamed from: a */
    public final void mo8529a(Throwable th) {
        try {
            qf0 qf0 = this.f27316a;
            String message = th.getMessage();
            qf0.mo12907k("Internal error: " + message);
        } catch (RemoteException e) {
            pm0.m18665e("", e);
        }
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ void mo8530c(Object obj) {
        List<Uri> list = (List) obj;
        try {
            C5280c.m32554O6(this.f27318c, list);
            this.f27316a.mo12906Y1(list);
            if (this.f27318c.f27259x || this.f27317b) {
                for (Uri uri : list) {
                    if (this.f27318c.mo19263W6(uri)) {
                        C5280c cVar = this.f27318c;
                        this.f27318c.f27257v.mo13909c(C5280c.m32567f7(uri, cVar.f27239F, "1").toString(), (yy2) null);
                    } else {
                        if (((Boolean) C4596v.m30088c().mo12227b(C2679nz.f14259B6)).booleanValue()) {
                            this.f27318c.f27257v.mo13909c(uri.toString(), (yy2) null);
                        }
                    }
                }
            }
        } catch (RemoteException e) {
            pm0.m18665e("", e);
        }
    }
}
