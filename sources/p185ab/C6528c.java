package p185ab;

import android.content.Context;
import com.unity3d.scar.adapter.common.C9694a;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;
import p122q4.C5400b;
import p179z3.C6323b;
import p179z3.C6334g;
import p398xa.C12987a;
import p398xa.C12988b;

/* renamed from: ab.c */
/* compiled from: SignalsReader */
public class C6528c implements C12988b {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static C6530d f30971a;

    /* renamed from: ab.c$a */
    /* compiled from: SignalsReader */
    private class C6529a implements Runnable {

        /* renamed from: a */
        private C12987a f30972a;

        public C6529a(C12987a aVar) {
            this.f30972a = aVar;
        }

        public void run() {
            HashMap hashMap = new HashMap();
            String str = null;
            for (Map.Entry<String, C6527b> value : C6528c.f30971a.mo22124a().entrySet()) {
                C6527b bVar = (C6527b) value.getValue();
                hashMap.put(bVar.mo22117b(), bVar.mo22119d());
                if (bVar.mo22116a() != null) {
                    str = bVar.mo22116a();
                }
            }
            if (hashMap.size() > 0) {
                this.f30972a.onSignalsCollected(new JSONObject(hashMap).toString());
            } else if (str == null) {
                this.f30972a.onSignalsCollected("");
            } else {
                this.f30972a.onSignalsCollectionFailed(str);
            }
        }
    }

    public C6528c(C6530d dVar) {
        f30971a = dVar;
    }

    /* renamed from: c */
    private void m38025c(Context context, String str, C6323b bVar, C9694a aVar) {
        C6334g c = new C6334g.C6335a().mo230c();
        C6527b bVar2 = new C6527b(str);
        C6526a aVar2 = new C6526a(bVar2, aVar);
        f30971a.mo22126c(str, bVar2);
        C5400b.m33145a(context, bVar, c, aVar2);
    }

    /* renamed from: a */
    public void mo22122a(Context context, String[] strArr, String[] strArr2, C12987a aVar) {
        C9694a aVar2 = new C9694a();
        for (String c : strArr) {
            aVar2.mo31563a();
            m38025c(context, c, C6323b.INTERSTITIAL, aVar2);
        }
        for (String c2 : strArr2) {
            aVar2.mo31563a();
            m38025c(context, c2, C6323b.REWARDED, aVar2);
        }
        aVar2.mo31565c(new C6529a(aVar));
    }
}
