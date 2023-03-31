package p060h4;

import android.os.RemoteException;
import com.google.android.gms.internal.ads.y70;
import java.util.ArrayList;
import java.util.List;
import p046f4.C4281b;
import p046f4.C4282c;

/* renamed from: h4.c3 */
/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
final class C4486c3 extends y70 {

    /* renamed from: a */
    final /* synthetic */ C4492d3 f24823a;

    /* synthetic */ C4486c3(C4492d3 d3Var, C4480b3 b3Var) {
        this.f24823a = d3Var;
    }

    /* renamed from: X4 */
    public final void mo15060X4(List list) throws RemoteException {
        int i;
        ArrayList arrayList;
        synchronized (this.f24823a.f24827a) {
            this.f24823a.f24829c = false;
            this.f24823a.f24830d = true;
            arrayList = new ArrayList(this.f24823a.f24828b);
            this.f24823a.f24828b.clear();
        }
        C4281b c = C4492d3.m29606s(list);
        int size = arrayList.size();
        for (i = 0; i < size; i++) {
            ((C4282c) arrayList.get(i)).mo17708a(c);
        }
    }
}
