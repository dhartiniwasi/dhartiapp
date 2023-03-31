package p214db;

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

/* renamed from: db.c */
/* compiled from: SignalsReader */
public class C9929c implements C12988b {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static C9931d f39842a;

    /* renamed from: db.c$a */
    /* compiled from: SignalsReader */
    private class C9930a implements Runnable {

        /* renamed from: a */
        private C12987a f39843a;

        public C9930a(C12987a aVar) {
            this.f39843a = aVar;
        }

        public void run() {
            HashMap hashMap = new HashMap();
            String str = null;
            for (Map.Entry<String, C9928b> value : C9929c.f39842a.mo32493a().entrySet()) {
                C9928b bVar = (C9928b) value.getValue();
                hashMap.put(bVar.mo32487b(), bVar.mo32489d());
                if (bVar.mo32486a() != null) {
                    str = bVar.mo32486a();
                }
            }
            if (hashMap.size() > 0) {
                this.f39843a.onSignalsCollected(new JSONObject(hashMap).toString());
            } else if (str == null) {
                this.f39843a.onSignalsCollected("");
            } else {
                this.f39843a.onSignalsCollectionFailed(str);
            }
        }
    }

    public C9929c(C9931d dVar) {
        f39842a = dVar;
    }

    /* renamed from: c */
    private void m50890c(Context context, String str, C6323b bVar, C9694a aVar) {
        C6334g c = new C6334g.C6335a().mo230c();
        C9928b bVar2 = new C9928b(str);
        C9927a aVar2 = new C9927a(bVar2, aVar);
        f39842a.mo32495c(str, bVar2);
        C5400b.m33145a(context, bVar, c, aVar2);
    }

    /* renamed from: a */
    public void mo22122a(Context context, String[] strArr, String[] strArr2, C12987a aVar) {
        C9694a aVar2 = new C9694a();
        for (String c : strArr) {
            aVar2.mo31563a();
            m50890c(context, c, C6323b.INTERSTITIAL, aVar2);
        }
        for (String c2 : strArr2) {
            aVar2.mo31563a();
            m50890c(context, c2, C6323b.REWARDED, aVar2);
        }
        aVar2.mo31565c(new C9930a(aVar));
    }
}
